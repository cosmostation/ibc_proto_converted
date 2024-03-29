// source: irismod/coinswap/tx.proto
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

goog.provide('proto.irismod.coinswap.MsgRemoveLiquidity');

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
proto.irismod.coinswap.MsgRemoveLiquidity = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.irismod.coinswap.MsgRemoveLiquidity, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.coinswap.MsgRemoveLiquidity.displayName = 'proto.irismod.coinswap.MsgRemoveLiquidity';
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
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.coinswap.MsgRemoveLiquidity.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.coinswap.MsgRemoveLiquidity} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.coinswap.MsgRemoveLiquidity.toObject = function(includeInstance, msg) {
  var f, obj = {
    withdrawLiquidity: (f = msg.getWithdrawLiquidity()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    minToken: jspb.Message.getFieldWithDefault(msg, 2, ""),
    minStandardAmt: jspb.Message.getFieldWithDefault(msg, 3, ""),
    deadline: jspb.Message.getFieldWithDefault(msg, 4, 0),
    sender: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.irismod.coinswap.MsgRemoveLiquidity}
 */
proto.irismod.coinswap.MsgRemoveLiquidity.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.coinswap.MsgRemoveLiquidity;
  return proto.irismod.coinswap.MsgRemoveLiquidity.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.coinswap.MsgRemoveLiquidity} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.coinswap.MsgRemoveLiquidity}
 */
proto.irismod.coinswap.MsgRemoveLiquidity.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setWithdrawLiquidity(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinToken(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinStandardAmt(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setDeadline(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
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
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.coinswap.MsgRemoveLiquidity.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.coinswap.MsgRemoveLiquidity} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.coinswap.MsgRemoveLiquidity.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getWithdrawLiquidity();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getMinToken();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMinStandardAmt();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getDeadline();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional cosmos.base.v1beta1.Coin withdraw_liquidity = 1;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.getWithdrawLiquidity = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.irismod.coinswap.MsgRemoveLiquidity} returns this
*/
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.setWithdrawLiquidity = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.coinswap.MsgRemoveLiquidity} returns this
 */
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.clearWithdrawLiquidity = function() {
  return this.setWithdrawLiquidity(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.hasWithdrawLiquidity = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string min_token = 2;
 * @return {string}
 */
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.getMinToken = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.coinswap.MsgRemoveLiquidity} returns this
 */
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.setMinToken = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string min_standard_amt = 3;
 * @return {string}
 */
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.getMinStandardAmt = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.coinswap.MsgRemoveLiquidity} returns this
 */
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.setMinStandardAmt = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional int64 deadline = 4;
 * @return {number}
 */
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.getDeadline = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.coinswap.MsgRemoveLiquidity} returns this
 */
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.setDeadline = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional string sender = 5;
 * @return {string}
 */
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.coinswap.MsgRemoveLiquidity} returns this
 */
proto.irismod.coinswap.MsgRemoveLiquidity.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


