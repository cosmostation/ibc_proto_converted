// source: tendermint/abci/types.proto
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

goog.provide('proto.tendermint.abci.TxResult');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tendermint.abci.ResponseDeliverTx');

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
proto.tendermint.abci.TxResult = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.tendermint.abci.TxResult, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.abci.TxResult.displayName = 'proto.tendermint.abci.TxResult';
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
proto.tendermint.abci.TxResult.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.abci.TxResult.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.abci.TxResult} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.TxResult.toObject = function(includeInstance, msg) {
  var f, obj = {
    height: jspb.Message.getFieldWithDefault(msg, 1, 0),
    index: jspb.Message.getFieldWithDefault(msg, 2, 0),
    tx: msg.getTx_asB64(),
    result: (f = msg.getResult()) && proto.tendermint.abci.ResponseDeliverTx.toObject(includeInstance, f)
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
 * @return {!proto.tendermint.abci.TxResult}
 */
proto.tendermint.abci.TxResult.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.abci.TxResult;
  return proto.tendermint.abci.TxResult.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.abci.TxResult} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.abci.TxResult}
 */
proto.tendermint.abci.TxResult.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setHeight(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setIndex(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setTx(value);
      break;
    case 4:
      var value = new proto.tendermint.abci.ResponseDeliverTx;
      reader.readMessage(value,proto.tendermint.abci.ResponseDeliverTx.deserializeBinaryFromReader);
      msg.setResult(value);
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
proto.tendermint.abci.TxResult.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.abci.TxResult.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.abci.TxResult} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.TxResult.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHeight();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getIndex();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getTx_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getResult();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.tendermint.abci.ResponseDeliverTx.serializeBinaryToWriter
    );
  }
};


/**
 * optional int64 height = 1;
 * @return {number}
 */
proto.tendermint.abci.TxResult.prototype.getHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.tendermint.abci.TxResult} returns this
 */
proto.tendermint.abci.TxResult.prototype.setHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint32 index = 2;
 * @return {number}
 */
proto.tendermint.abci.TxResult.prototype.getIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.tendermint.abci.TxResult} returns this
 */
proto.tendermint.abci.TxResult.prototype.setIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional bytes tx = 3;
 * @return {string}
 */
proto.tendermint.abci.TxResult.prototype.getTx = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes tx = 3;
 * This is a type-conversion wrapper around `getTx()`
 * @return {string}
 */
proto.tendermint.abci.TxResult.prototype.getTx_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getTx()));
};


/**
 * optional bytes tx = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getTx()`
 * @return {!Uint8Array}
 */
proto.tendermint.abci.TxResult.prototype.getTx_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getTx()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.tendermint.abci.TxResult} returns this
 */
proto.tendermint.abci.TxResult.prototype.setTx = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional ResponseDeliverTx result = 4;
 * @return {?proto.tendermint.abci.ResponseDeliverTx}
 */
proto.tendermint.abci.TxResult.prototype.getResult = function() {
  return /** @type{?proto.tendermint.abci.ResponseDeliverTx} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseDeliverTx, 4));
};


/**
 * @param {?proto.tendermint.abci.ResponseDeliverTx|undefined} value
 * @return {!proto.tendermint.abci.TxResult} returns this
*/
proto.tendermint.abci.TxResult.prototype.setResult = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.TxResult} returns this
 */
proto.tendermint.abci.TxResult.prototype.clearResult = function() {
  return this.setResult(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.TxResult.prototype.hasResult = function() {
  return jspb.Message.getField(this, 4) != null;
};


