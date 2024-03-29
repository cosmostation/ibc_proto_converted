// source: injective/wasmx/v1/wasmx.proto
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

goog.provide('proto.injective.wasmx.v1.Params');

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
proto.injective.wasmx.v1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.wasmx.v1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.wasmx.v1.Params.displayName = 'proto.injective.wasmx.v1.Params';
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
proto.injective.wasmx.v1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.wasmx.v1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.wasmx.v1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.wasmx.v1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    isExecutionEnabled: jspb.Message.getBooleanFieldWithDefault(msg, 1, false),
    maxBeginBlockTotalGas: jspb.Message.getFieldWithDefault(msg, 2, 0),
    maxContractGasLimit: jspb.Message.getFieldWithDefault(msg, 3, 0),
    minGasPrice: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.injective.wasmx.v1.Params}
 */
proto.injective.wasmx.v1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.wasmx.v1.Params;
  return proto.injective.wasmx.v1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.wasmx.v1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.wasmx.v1.Params}
 */
proto.injective.wasmx.v1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsExecutionEnabled(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxBeginBlockTotalGas(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxContractGasLimit(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMinGasPrice(value);
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
proto.injective.wasmx.v1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.wasmx.v1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.wasmx.v1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.wasmx.v1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIsExecutionEnabled();
  if (f) {
    writer.writeBool(
      1,
      f
    );
  }
  f = message.getMaxBeginBlockTotalGas();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getMaxContractGasLimit();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getMinGasPrice();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
};


/**
 * optional bool is_execution_enabled = 1;
 * @return {boolean}
 */
proto.injective.wasmx.v1.Params.prototype.getIsExecutionEnabled = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 1, false));
};


/**
 * @param {boolean} value
 * @return {!proto.injective.wasmx.v1.Params} returns this
 */
proto.injective.wasmx.v1.Params.prototype.setIsExecutionEnabled = function(value) {
  return jspb.Message.setProto3BooleanField(this, 1, value);
};


/**
 * optional uint64 max_begin_block_total_gas = 2;
 * @return {number}
 */
proto.injective.wasmx.v1.Params.prototype.getMaxBeginBlockTotalGas = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.wasmx.v1.Params} returns this
 */
proto.injective.wasmx.v1.Params.prototype.setMaxBeginBlockTotalGas = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 max_contract_gas_limit = 3;
 * @return {number}
 */
proto.injective.wasmx.v1.Params.prototype.getMaxContractGasLimit = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.wasmx.v1.Params} returns this
 */
proto.injective.wasmx.v1.Params.prototype.setMaxContractGasLimit = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 min_gas_price = 4;
 * @return {number}
 */
proto.injective.wasmx.v1.Params.prototype.getMinGasPrice = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.wasmx.v1.Params} returns this
 */
proto.injective.wasmx.v1.Params.prototype.setMinGasPrice = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


