// source: ethermint/evm/v1/tx.proto
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

goog.provide('proto.ethermint.evm.v1.LegacyTx');

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
proto.ethermint.evm.v1.LegacyTx = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ethermint.evm.v1.LegacyTx, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ethermint.evm.v1.LegacyTx.displayName = 'proto.ethermint.evm.v1.LegacyTx';
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
proto.ethermint.evm.v1.LegacyTx.prototype.toObject = function(opt_includeInstance) {
  return proto.ethermint.evm.v1.LegacyTx.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ethermint.evm.v1.LegacyTx} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.evm.v1.LegacyTx.toObject = function(includeInstance, msg) {
  var f, obj = {
    nonce: jspb.Message.getFieldWithDefault(msg, 1, 0),
    gasPrice: jspb.Message.getFieldWithDefault(msg, 2, ""),
    gas: jspb.Message.getFieldWithDefault(msg, 3, 0),
    to: jspb.Message.getFieldWithDefault(msg, 4, ""),
    value: jspb.Message.getFieldWithDefault(msg, 5, ""),
    data: msg.getData_asB64(),
    v: msg.getV_asB64(),
    r: msg.getR_asB64(),
    s: msg.getS_asB64()
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
 * @return {!proto.ethermint.evm.v1.LegacyTx}
 */
proto.ethermint.evm.v1.LegacyTx.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ethermint.evm.v1.LegacyTx;
  return proto.ethermint.evm.v1.LegacyTx.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ethermint.evm.v1.LegacyTx} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ethermint.evm.v1.LegacyTx}
 */
proto.ethermint.evm.v1.LegacyTx.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setNonce(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setGasPrice(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGas(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setTo(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setValue(value);
      break;
    case 6:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setData(value);
      break;
    case 7:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setV(value);
      break;
    case 8:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setR(value);
      break;
    case 9:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setS(value);
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
proto.ethermint.evm.v1.LegacyTx.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ethermint.evm.v1.LegacyTx.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ethermint.evm.v1.LegacyTx} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.evm.v1.LegacyTx.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getNonce();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getGasPrice();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getGas();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getTo();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getValue();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getData_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      6,
      f
    );
  }
  f = message.getV_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      7,
      f
    );
  }
  f = message.getR_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      8,
      f
    );
  }
  f = message.getS_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      9,
      f
    );
  }
};


/**
 * optional uint64 nonce = 1;
 * @return {number}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getNonce = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.evm.v1.LegacyTx} returns this
 */
proto.ethermint.evm.v1.LegacyTx.prototype.setNonce = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string gas_price = 2;
 * @return {string}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getGasPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.LegacyTx} returns this
 */
proto.ethermint.evm.v1.LegacyTx.prototype.setGasPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 gas = 3;
 * @return {number}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getGas = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.evm.v1.LegacyTx} returns this
 */
proto.ethermint.evm.v1.LegacyTx.prototype.setGas = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string to = 4;
 * @return {string}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getTo = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.LegacyTx} returns this
 */
proto.ethermint.evm.v1.LegacyTx.prototype.setTo = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string value = 5;
 * @return {string}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getValue = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.LegacyTx} returns this
 */
proto.ethermint.evm.v1.LegacyTx.prototype.setValue = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional bytes data = 6;
 * @return {string}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * optional bytes data = 6;
 * This is a type-conversion wrapper around `getData()`
 * @return {string}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getData_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getData()));
};


/**
 * optional bytes data = 6;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getData()`
 * @return {!Uint8Array}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getData_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getData()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ethermint.evm.v1.LegacyTx} returns this
 */
proto.ethermint.evm.v1.LegacyTx.prototype.setData = function(value) {
  return jspb.Message.setProto3BytesField(this, 6, value);
};


/**
 * optional bytes v = 7;
 * @return {string}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getV = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * optional bytes v = 7;
 * This is a type-conversion wrapper around `getV()`
 * @return {string}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getV_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getV()));
};


/**
 * optional bytes v = 7;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getV()`
 * @return {!Uint8Array}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getV_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getV()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ethermint.evm.v1.LegacyTx} returns this
 */
proto.ethermint.evm.v1.LegacyTx.prototype.setV = function(value) {
  return jspb.Message.setProto3BytesField(this, 7, value);
};


/**
 * optional bytes r = 8;
 * @return {string}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getR = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * optional bytes r = 8;
 * This is a type-conversion wrapper around `getR()`
 * @return {string}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getR_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getR()));
};


/**
 * optional bytes r = 8;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getR()`
 * @return {!Uint8Array}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getR_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getR()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ethermint.evm.v1.LegacyTx} returns this
 */
proto.ethermint.evm.v1.LegacyTx.prototype.setR = function(value) {
  return jspb.Message.setProto3BytesField(this, 8, value);
};


/**
 * optional bytes s = 9;
 * @return {string}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getS = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * optional bytes s = 9;
 * This is a type-conversion wrapper around `getS()`
 * @return {string}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getS_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getS()));
};


/**
 * optional bytes s = 9;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getS()`
 * @return {!Uint8Array}
 */
proto.ethermint.evm.v1.LegacyTx.prototype.getS_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getS()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ethermint.evm.v1.LegacyTx} returns this
 */
proto.ethermint.evm.v1.LegacyTx.prototype.setS = function(value) {
  return jspb.Message.setProto3BytesField(this, 9, value);
};

