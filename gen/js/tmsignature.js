// source: band/bandchain/v1/oracle/proof.proto
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

goog.provide('proto.bandchain.v1.oracle.TMSignature');

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
proto.bandchain.v1.oracle.TMSignature = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.bandchain.v1.oracle.TMSignature, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.bandchain.v1.oracle.TMSignature.displayName = 'proto.bandchain.v1.oracle.TMSignature';
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
proto.bandchain.v1.oracle.TMSignature.prototype.toObject = function(opt_includeInstance) {
  return proto.bandchain.v1.oracle.TMSignature.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.bandchain.v1.oracle.TMSignature} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.bandchain.v1.oracle.TMSignature.toObject = function(includeInstance, msg) {
  var f, obj = {
    r: msg.getR_asB64(),
    s: msg.getS_asB64(),
    v: jspb.Message.getFieldWithDefault(msg, 3, 0),
    encodedTimestamp: msg.getEncodedTimestamp_asB64()
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
 * @return {!proto.bandchain.v1.oracle.TMSignature}
 */
proto.bandchain.v1.oracle.TMSignature.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.bandchain.v1.oracle.TMSignature;
  return proto.bandchain.v1.oracle.TMSignature.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.bandchain.v1.oracle.TMSignature} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.bandchain.v1.oracle.TMSignature}
 */
proto.bandchain.v1.oracle.TMSignature.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setR(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setS(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setV(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setEncodedTimestamp(value);
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
proto.bandchain.v1.oracle.TMSignature.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.bandchain.v1.oracle.TMSignature.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.bandchain.v1.oracle.TMSignature} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.bandchain.v1.oracle.TMSignature.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getR_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getS_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getV();
  if (f !== 0) {
    writer.writeUint32(
      3,
      f
    );
  }
  f = message.getEncodedTimestamp_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
};


/**
 * optional bytes r = 1;
 * @return {string}
 */
proto.bandchain.v1.oracle.TMSignature.prototype.getR = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes r = 1;
 * This is a type-conversion wrapper around `getR()`
 * @return {string}
 */
proto.bandchain.v1.oracle.TMSignature.prototype.getR_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getR()));
};


/**
 * optional bytes r = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getR()`
 * @return {!Uint8Array}
 */
proto.bandchain.v1.oracle.TMSignature.prototype.getR_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getR()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.bandchain.v1.oracle.TMSignature} returns this
 */
proto.bandchain.v1.oracle.TMSignature.prototype.setR = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes s = 2;
 * @return {string}
 */
proto.bandchain.v1.oracle.TMSignature.prototype.getS = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes s = 2;
 * This is a type-conversion wrapper around `getS()`
 * @return {string}
 */
proto.bandchain.v1.oracle.TMSignature.prototype.getS_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getS()));
};


/**
 * optional bytes s = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getS()`
 * @return {!Uint8Array}
 */
proto.bandchain.v1.oracle.TMSignature.prototype.getS_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getS()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.bandchain.v1.oracle.TMSignature} returns this
 */
proto.bandchain.v1.oracle.TMSignature.prototype.setS = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional uint32 v = 3;
 * @return {number}
 */
proto.bandchain.v1.oracle.TMSignature.prototype.getV = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.bandchain.v1.oracle.TMSignature} returns this
 */
proto.bandchain.v1.oracle.TMSignature.prototype.setV = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional bytes encoded_timestamp = 4;
 * @return {string}
 */
proto.bandchain.v1.oracle.TMSignature.prototype.getEncodedTimestamp = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes encoded_timestamp = 4;
 * This is a type-conversion wrapper around `getEncodedTimestamp()`
 * @return {string}
 */
proto.bandchain.v1.oracle.TMSignature.prototype.getEncodedTimestamp_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getEncodedTimestamp()));
};


/**
 * optional bytes encoded_timestamp = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getEncodedTimestamp()`
 * @return {!Uint8Array}
 */
proto.bandchain.v1.oracle.TMSignature.prototype.getEncodedTimestamp_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getEncodedTimestamp()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.bandchain.v1.oracle.TMSignature} returns this
 */
proto.bandchain.v1.oracle.TMSignature.prototype.setEncodedTimestamp = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


