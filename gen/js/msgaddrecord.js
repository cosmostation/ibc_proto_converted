// source: panacea/aol/v2/tx.proto
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

goog.provide('proto.panacea.aol.v2.MsgAddRecord');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.panacea.aol.v2.MsgAddRecord = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.panacea.aol.v2.MsgAddRecord, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.aol.v2.MsgAddRecord.displayName = 'proto.panacea.aol.v2.MsgAddRecord';
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
proto.panacea.aol.v2.MsgAddRecord.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.aol.v2.MsgAddRecord.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.aol.v2.MsgAddRecord} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.aol.v2.MsgAddRecord.toObject = function(includeInstance, msg) {
  var f, obj = {
    topicName: jspb.Message.getFieldWithDefault(msg, 1, ""),
    key: msg.getKey_asB64(),
    value: msg.getValue_asB64(),
    writerAddress: jspb.Message.getFieldWithDefault(msg, 4, ""),
    ownerAddress: jspb.Message.getFieldWithDefault(msg, 5, ""),
    feePayerAddress: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.panacea.aol.v2.MsgAddRecord}
 */
proto.panacea.aol.v2.MsgAddRecord.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.aol.v2.MsgAddRecord;
  return proto.panacea.aol.v2.MsgAddRecord.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.aol.v2.MsgAddRecord} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.aol.v2.MsgAddRecord}
 */
proto.panacea.aol.v2.MsgAddRecord.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTopicName(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setKey(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setValue(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setWriterAddress(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwnerAddress(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeePayerAddress(value);
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
proto.panacea.aol.v2.MsgAddRecord.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.aol.v2.MsgAddRecord.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.aol.v2.MsgAddRecord} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.aol.v2.MsgAddRecord.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTopicName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getKey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getValue_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getWriterAddress();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getOwnerAddress();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getFeePayerAddress();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional string topic_name = 1;
 * @return {string}
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.getTopicName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.aol.v2.MsgAddRecord} returns this
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.setTopicName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bytes key = 2;
 * @return {string}
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.getKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes key = 2;
 * This is a type-conversion wrapper around `getKey()`
 * @return {string}
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.getKey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getKey()));
};


/**
 * optional bytes key = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getKey()`
 * @return {!Uint8Array}
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.getKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getKey()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.panacea.aol.v2.MsgAddRecord} returns this
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.setKey = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional bytes value = 3;
 * @return {string}
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.getValue = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes value = 3;
 * This is a type-conversion wrapper around `getValue()`
 * @return {string}
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.getValue_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getValue()));
};


/**
 * optional bytes value = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getValue()`
 * @return {!Uint8Array}
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.getValue_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getValue()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.panacea.aol.v2.MsgAddRecord} returns this
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.setValue = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional string writer_address = 4;
 * @return {string}
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.getWriterAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.aol.v2.MsgAddRecord} returns this
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.setWriterAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string owner_address = 5;
 * @return {string}
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.getOwnerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.aol.v2.MsgAddRecord} returns this
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.setOwnerAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string fee_payer_address = 6;
 * @return {string}
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.getFeePayerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.aol.v2.MsgAddRecord} returns this
 */
proto.panacea.aol.v2.MsgAddRecord.prototype.setFeePayerAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


