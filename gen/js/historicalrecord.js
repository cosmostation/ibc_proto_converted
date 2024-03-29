// source: cosmos/staking/v1beta1/staking.proto
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

goog.provide('proto.cosmos.staking.v1beta1.HistoricalRecord');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');

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
proto.cosmos.staking.v1beta1.HistoricalRecord = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.staking.v1beta1.HistoricalRecord, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.staking.v1beta1.HistoricalRecord.displayName = 'proto.cosmos.staking.v1beta1.HistoricalRecord';
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
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.staking.v1beta1.HistoricalRecord.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.staking.v1beta1.HistoricalRecord} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.toObject = function(includeInstance, msg) {
  var f, obj = {
    apphash: msg.getApphash_asB64(),
    time: (f = msg.getTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    validatorsHash: msg.getValidatorsHash_asB64()
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
 * @return {!proto.cosmos.staking.v1beta1.HistoricalRecord}
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.staking.v1beta1.HistoricalRecord;
  return proto.cosmos.staking.v1beta1.HistoricalRecord.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.staking.v1beta1.HistoricalRecord} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.staking.v1beta1.HistoricalRecord}
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setApphash(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setTime(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setValidatorsHash(value);
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
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.staking.v1beta1.HistoricalRecord.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.staking.v1beta1.HistoricalRecord} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getApphash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getTime();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getValidatorsHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
};


/**
 * optional bytes apphash = 1;
 * @return {string}
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.getApphash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes apphash = 1;
 * This is a type-conversion wrapper around `getApphash()`
 * @return {string}
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.getApphash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getApphash()));
};


/**
 * optional bytes apphash = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getApphash()`
 * @return {!Uint8Array}
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.getApphash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getApphash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmos.staking.v1beta1.HistoricalRecord} returns this
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.setApphash = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional google.protobuf.Timestamp time = 2;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.getTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 2));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.cosmos.staking.v1beta1.HistoricalRecord} returns this
*/
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.setTime = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.staking.v1beta1.HistoricalRecord} returns this
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.clearTime = function() {
  return this.setTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.hasTime = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional bytes validators_hash = 3;
 * @return {string}
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.getValidatorsHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes validators_hash = 3;
 * This is a type-conversion wrapper around `getValidatorsHash()`
 * @return {string}
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.getValidatorsHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getValidatorsHash()));
};


/**
 * optional bytes validators_hash = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getValidatorsHash()`
 * @return {!Uint8Array}
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.getValidatorsHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getValidatorsHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmos.staking.v1beta1.HistoricalRecord} returns this
 */
proto.cosmos.staking.v1beta1.HistoricalRecord.prototype.setValidatorsHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


