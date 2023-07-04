// source: cosmwasm/wasm/v1/tx.proto
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

goog.provide('proto.cosmwasm.wasm.v1.MsgExecuteContract');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.cosmwasm.wasm.v1.MsgExecuteContract = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmwasm.wasm.v1.MsgExecuteContract.repeatedFields_, null);
};
goog.inherits(proto.cosmwasm.wasm.v1.MsgExecuteContract, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmwasm.wasm.v1.MsgExecuteContract.displayName = 'proto.cosmwasm.wasm.v1.MsgExecuteContract';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.repeatedFields_ = [5];



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
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmwasm.wasm.v1.MsgExecuteContract.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmwasm.wasm.v1.MsgExecuteContract} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    contract: jspb.Message.getFieldWithDefault(msg, 2, ""),
    msg: msg.getMsg_asB64(),
    fundsList: jspb.Message.toObjectList(msg.getFundsList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance)
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
 * @return {!proto.cosmwasm.wasm.v1.MsgExecuteContract}
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmwasm.wasm.v1.MsgExecuteContract;
  return proto.cosmwasm.wasm.v1.MsgExecuteContract.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmwasm.wasm.v1.MsgExecuteContract} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmwasm.wasm.v1.MsgExecuteContract}
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setContract(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMsg(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addFunds(value);
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
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmwasm.wasm.v1.MsgExecuteContract.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmwasm.wasm.v1.MsgExecuteContract} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getContract();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMsg_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getFundsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmwasm.wasm.v1.MsgExecuteContract} returns this
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string contract = 2;
 * @return {string}
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.getContract = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmwasm.wasm.v1.MsgExecuteContract} returns this
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.setContract = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bytes msg = 3;
 * @return {string}
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.getMsg = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes msg = 3;
 * This is a type-conversion wrapper around `getMsg()`
 * @return {string}
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.getMsg_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMsg()));
};


/**
 * optional bytes msg = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMsg()`
 * @return {!Uint8Array}
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.getMsg_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMsg()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmwasm.wasm.v1.MsgExecuteContract} returns this
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.setMsg = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin funds = 5;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.getFundsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.cosmwasm.wasm.v1.MsgExecuteContract} returns this
*/
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.setFundsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.addFunds = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmwasm.wasm.v1.MsgExecuteContract} returns this
 */
proto.cosmwasm.wasm.v1.MsgExecuteContract.prototype.clearFundsList = function() {
  return this.setFundsList([]);
};

