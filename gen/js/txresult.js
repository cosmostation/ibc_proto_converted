// source: ethermint/types/v1/indexer.proto
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

goog.provide('proto.ethermint.types.v1.TxResult');

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
proto.ethermint.types.v1.TxResult = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ethermint.types.v1.TxResult, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ethermint.types.v1.TxResult.displayName = 'proto.ethermint.types.v1.TxResult';
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
proto.ethermint.types.v1.TxResult.prototype.toObject = function(opt_includeInstance) {
  return proto.ethermint.types.v1.TxResult.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ethermint.types.v1.TxResult} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.types.v1.TxResult.toObject = function(includeInstance, msg) {
  var f, obj = {
    height: jspb.Message.getFieldWithDefault(msg, 1, 0),
    txIndex: jspb.Message.getFieldWithDefault(msg, 2, 0),
    msgIndex: jspb.Message.getFieldWithDefault(msg, 3, 0),
    ethTxIndex: jspb.Message.getFieldWithDefault(msg, 4, 0),
    failed: jspb.Message.getBooleanFieldWithDefault(msg, 5, false),
    gasUsed: jspb.Message.getFieldWithDefault(msg, 6, 0),
    cumulativeGasUsed: jspb.Message.getFieldWithDefault(msg, 7, 0)
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
 * @return {!proto.ethermint.types.v1.TxResult}
 */
proto.ethermint.types.v1.TxResult.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ethermint.types.v1.TxResult;
  return proto.ethermint.types.v1.TxResult.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ethermint.types.v1.TxResult} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ethermint.types.v1.TxResult}
 */
proto.ethermint.types.v1.TxResult.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setTxIndex(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setMsgIndex(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setEthTxIndex(value);
      break;
    case 5:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setFailed(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGasUsed(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCumulativeGasUsed(value);
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
proto.ethermint.types.v1.TxResult.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ethermint.types.v1.TxResult.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ethermint.types.v1.TxResult} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.types.v1.TxResult.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHeight();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getTxIndex();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getMsgIndex();
  if (f !== 0) {
    writer.writeUint32(
      3,
      f
    );
  }
  f = message.getEthTxIndex();
  if (f !== 0) {
    writer.writeInt32(
      4,
      f
    );
  }
  f = message.getFailed();
  if (f) {
    writer.writeBool(
      5,
      f
    );
  }
  f = message.getGasUsed();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getCumulativeGasUsed();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
};


/**
 * optional int64 height = 1;
 * @return {number}
 */
proto.ethermint.types.v1.TxResult.prototype.getHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.types.v1.TxResult} returns this
 */
proto.ethermint.types.v1.TxResult.prototype.setHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint32 tx_index = 2;
 * @return {number}
 */
proto.ethermint.types.v1.TxResult.prototype.getTxIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.types.v1.TxResult} returns this
 */
proto.ethermint.types.v1.TxResult.prototype.setTxIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint32 msg_index = 3;
 * @return {number}
 */
proto.ethermint.types.v1.TxResult.prototype.getMsgIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.types.v1.TxResult} returns this
 */
proto.ethermint.types.v1.TxResult.prototype.setMsgIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional int32 eth_tx_index = 4;
 * @return {number}
 */
proto.ethermint.types.v1.TxResult.prototype.getEthTxIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.types.v1.TxResult} returns this
 */
proto.ethermint.types.v1.TxResult.prototype.setEthTxIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional bool failed = 5;
 * @return {boolean}
 */
proto.ethermint.types.v1.TxResult.prototype.getFailed = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 5, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ethermint.types.v1.TxResult} returns this
 */
proto.ethermint.types.v1.TxResult.prototype.setFailed = function(value) {
  return jspb.Message.setProto3BooleanField(this, 5, value);
};


/**
 * optional uint64 gas_used = 6;
 * @return {number}
 */
proto.ethermint.types.v1.TxResult.prototype.getGasUsed = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.types.v1.TxResult} returns this
 */
proto.ethermint.types.v1.TxResult.prototype.setGasUsed = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional uint64 cumulative_gas_used = 7;
 * @return {number}
 */
proto.ethermint.types.v1.TxResult.prototype.getCumulativeGasUsed = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.ethermint.types.v1.TxResult} returns this
 */
proto.ethermint.types.v1.TxResult.prototype.setCumulativeGasUsed = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};

