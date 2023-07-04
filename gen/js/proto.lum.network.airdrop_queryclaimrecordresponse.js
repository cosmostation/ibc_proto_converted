// source: lum-network/airdrop/query.proto
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

goog.provide('proto.lum.network.airdrop.QueryClaimRecordResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.lum.network.airdrop.ClaimRecord');

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
proto.lum.network.airdrop.QueryClaimRecordResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lum.network.airdrop.QueryClaimRecordResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.airdrop.QueryClaimRecordResponse.displayName = 'proto.lum.network.airdrop.QueryClaimRecordResponse';
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
proto.lum.network.airdrop.QueryClaimRecordResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.airdrop.QueryClaimRecordResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.airdrop.QueryClaimRecordResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.airdrop.QueryClaimRecordResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    claimRecord: (f = msg.getClaimRecord()) && proto.lum.network.airdrop.ClaimRecord.toObject(includeInstance, f)
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
 * @return {!proto.lum.network.airdrop.QueryClaimRecordResponse}
 */
proto.lum.network.airdrop.QueryClaimRecordResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.airdrop.QueryClaimRecordResponse;
  return proto.lum.network.airdrop.QueryClaimRecordResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.airdrop.QueryClaimRecordResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.airdrop.QueryClaimRecordResponse}
 */
proto.lum.network.airdrop.QueryClaimRecordResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.lum.network.airdrop.ClaimRecord;
      reader.readMessage(value,proto.lum.network.airdrop.ClaimRecord.deserializeBinaryFromReader);
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
proto.lum.network.airdrop.QueryClaimRecordResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.airdrop.QueryClaimRecordResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.airdrop.QueryClaimRecordResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.airdrop.QueryClaimRecordResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClaimRecord();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.lum.network.airdrop.ClaimRecord.serializeBinaryToWriter
    );
  }
};


/**
 * optional ClaimRecord claim_record = 1;
 * @return {?proto.lum.network.airdrop.ClaimRecord}
 */
proto.lum.network.airdrop.QueryClaimRecordResponse.prototype.getClaimRecord = function() {
  return /** @type{?proto.lum.network.airdrop.ClaimRecord} */ (
    jspb.Message.getWrapperField(this, proto.lum.network.airdrop.ClaimRecord, 1));
};


/**
 * @param {?proto.lum.network.airdrop.ClaimRecord|undefined} value
 * @return {!proto.lum.network.airdrop.QueryClaimRecordResponse} returns this
*/
proto.lum.network.airdrop.QueryClaimRecordResponse.prototype.setClaimRecord = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.airdrop.QueryClaimRecordResponse} returns this
 */
proto.lum.network.airdrop.QueryClaimRecordResponse.prototype.clearClaimRecord = function() {
  return this.setClaimRecord(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.airdrop.QueryClaimRecordResponse.prototype.hasClaimRecord = function() {
  return jspb.Message.getField(this, 1) != null;
};

