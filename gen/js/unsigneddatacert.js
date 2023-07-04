// source: panacea/datapool/v2alpha1/pool.proto
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

goog.provide('proto.panacea.datapool.v2alpha1.UnsignedDataCert');

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
proto.panacea.datapool.v2alpha1.UnsignedDataCert = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.panacea.datapool.v2alpha1.UnsignedDataCert, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.datapool.v2alpha1.UnsignedDataCert.displayName = 'proto.panacea.datapool.v2alpha1.UnsignedDataCert';
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
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.datapool.v2alpha1.UnsignedDataCert.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.datapool.v2alpha1.UnsignedDataCert} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    round: jspb.Message.getFieldWithDefault(msg, 2, 0),
    dataHash: msg.getDataHash_asB64(),
    oracle: jspb.Message.getFieldWithDefault(msg, 4, ""),
    requester: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.panacea.datapool.v2alpha1.UnsignedDataCert}
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.datapool.v2alpha1.UnsignedDataCert;
  return proto.panacea.datapool.v2alpha1.UnsignedDataCert.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.datapool.v2alpha1.UnsignedDataCert} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.datapool.v2alpha1.UnsignedDataCert}
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRound(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setDataHash(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setOracle(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setRequester(value);
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
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.datapool.v2alpha1.UnsignedDataCert.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.datapool.v2alpha1.UnsignedDataCert} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getRound();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getDataHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getOracle();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getRequester();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional uint64 pool_id = 1;
 * @return {number}
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.datapool.v2alpha1.UnsignedDataCert} returns this
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 round = 2;
 * @return {number}
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.getRound = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.datapool.v2alpha1.UnsignedDataCert} returns this
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.setRound = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional bytes data_hash = 3;
 * @return {string}
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.getDataHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes data_hash = 3;
 * This is a type-conversion wrapper around `getDataHash()`
 * @return {string}
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.getDataHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getDataHash()));
};


/**
 * optional bytes data_hash = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getDataHash()`
 * @return {!Uint8Array}
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.getDataHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getDataHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.panacea.datapool.v2alpha1.UnsignedDataCert} returns this
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.setDataHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional string oracle = 4;
 * @return {string}
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.getOracle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.datapool.v2alpha1.UnsignedDataCert} returns this
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.setOracle = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string requester = 5;
 * @return {string}
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.getRequester = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.datapool.v2alpha1.UnsignedDataCert} returns this
 */
proto.panacea.datapool.v2alpha1.UnsignedDataCert.prototype.setRequester = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};

