// source: crescent/claim/v1beta1/query.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.crescent.claim.v1beta1.QueryClaimRecordResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.crescent.claim.v1beta1.ClaimRecord');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.crescent.claim.v1beta1.QueryClaimRecordResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.crescent.claim.v1beta1.QueryClaimRecordResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.claim.v1beta1.QueryClaimRecordResponse.displayName = 'proto.crescent.claim.v1beta1.QueryClaimRecordResponse';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.crescent.claim.v1beta1.QueryClaimRecordResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.claim.v1beta1.QueryClaimRecordResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.claim.v1beta1.QueryClaimRecordResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.claim.v1beta1.QueryClaimRecordResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    claimRecord: (f = msg.getClaimRecord()) && proto.crescent.claim.v1beta1.ClaimRecord.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.crescent.claim.v1beta1.QueryClaimRecordResponse}
 */
proto.crescent.claim.v1beta1.QueryClaimRecordResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.claim.v1beta1.QueryClaimRecordResponse;
  return proto.crescent.claim.v1beta1.QueryClaimRecordResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.claim.v1beta1.QueryClaimRecordResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.claim.v1beta1.QueryClaimRecordResponse}
 */
proto.crescent.claim.v1beta1.QueryClaimRecordResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.crescent.claim.v1beta1.ClaimRecord;
      reader.readMessage(value,proto.crescent.claim.v1beta1.ClaimRecord.deserializeBinaryFromReader);
      msg.setClaimRecord(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.crescent.claim.v1beta1.QueryClaimRecordResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.claim.v1beta1.QueryClaimRecordResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.claim.v1beta1.QueryClaimRecordResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.claim.v1beta1.QueryClaimRecordResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClaimRecord();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.crescent.claim.v1beta1.ClaimRecord.serializeBinaryToWriter
    );
  }
};


/**
 * optional ClaimRecord claim_record = 1;
 * @return {?proto.crescent.claim.v1beta1.ClaimRecord}
 */
proto.crescent.claim.v1beta1.QueryClaimRecordResponse.prototype.getClaimRecord = function() {
  return /** @type{?proto.crescent.claim.v1beta1.ClaimRecord} */ (
    jspb.Message.getWrapperField(this, proto.crescent.claim.v1beta1.ClaimRecord, 1));
};


/**
 * @param {?proto.crescent.claim.v1beta1.ClaimRecord|undefined} value
 * @return {!proto.crescent.claim.v1beta1.QueryClaimRecordResponse} returns this
*/
proto.crescent.claim.v1beta1.QueryClaimRecordResponse.prototype.setClaimRecord = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.claim.v1beta1.QueryClaimRecordResponse} returns this
 */
proto.crescent.claim.v1beta1.QueryClaimRecordResponse.prototype.clearClaimRecord = function() {
  return this.setClaimRecord(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.claim.v1beta1.QueryClaimRecordResponse.prototype.hasClaimRecord = function() {
  return jspb.Message.getField(this, 1) != null;
};


