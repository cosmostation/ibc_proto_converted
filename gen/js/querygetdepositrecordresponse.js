// source: stride/records/query.proto
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

goog.provide('proto.stride.records.QueryGetDepositRecordResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stride.records.DepositRecord');

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
proto.stride.records.QueryGetDepositRecordResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stride.records.QueryGetDepositRecordResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.records.QueryGetDepositRecordResponse.displayName = 'proto.stride.records.QueryGetDepositRecordResponse';
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
proto.stride.records.QueryGetDepositRecordResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.records.QueryGetDepositRecordResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.records.QueryGetDepositRecordResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.records.QueryGetDepositRecordResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    depositRecord: (f = msg.getDepositRecord()) && proto.stride.records.DepositRecord.toObject(includeInstance, f)
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
 * @return {!proto.stride.records.QueryGetDepositRecordResponse}
 */
proto.stride.records.QueryGetDepositRecordResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.records.QueryGetDepositRecordResponse;
  return proto.stride.records.QueryGetDepositRecordResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.records.QueryGetDepositRecordResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.records.QueryGetDepositRecordResponse}
 */
proto.stride.records.QueryGetDepositRecordResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stride.records.DepositRecord;
      reader.readMessage(value,proto.stride.records.DepositRecord.deserializeBinaryFromReader);
      msg.setDepositRecord(value);
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
proto.stride.records.QueryGetDepositRecordResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.records.QueryGetDepositRecordResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.records.QueryGetDepositRecordResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.records.QueryGetDepositRecordResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDepositRecord();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.stride.records.DepositRecord.serializeBinaryToWriter
    );
  }
};


/**
 * optional DepositRecord deposit_record = 1;
 * @return {?proto.stride.records.DepositRecord}
 */
proto.stride.records.QueryGetDepositRecordResponse.prototype.getDepositRecord = function() {
  return /** @type{?proto.stride.records.DepositRecord} */ (
    jspb.Message.getWrapperField(this, proto.stride.records.DepositRecord, 1));
};


/**
 * @param {?proto.stride.records.DepositRecord|undefined} value
 * @return {!proto.stride.records.QueryGetDepositRecordResponse} returns this
*/
proto.stride.records.QueryGetDepositRecordResponse.prototype.setDepositRecord = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stride.records.QueryGetDepositRecordResponse} returns this
 */
proto.stride.records.QueryGetDepositRecordResponse.prototype.clearDepositRecord = function() {
  return this.setDepositRecord(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stride.records.QueryGetDepositRecordResponse.prototype.hasDepositRecord = function() {
  return jspb.Message.getField(this, 1) != null;
};


