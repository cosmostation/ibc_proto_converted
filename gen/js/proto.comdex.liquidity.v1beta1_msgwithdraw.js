// source: comdex/liquidity/v1beta1/tx.proto
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

goog.provide('proto.comdex.liquidity.v1beta1.MsgWithdraw');

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
proto.comdex.liquidity.v1beta1.MsgWithdraw = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.liquidity.v1beta1.MsgWithdraw, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.liquidity.v1beta1.MsgWithdraw.displayName = 'proto.comdex.liquidity.v1beta1.MsgWithdraw';
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
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.liquidity.v1beta1.MsgWithdraw.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.liquidity.v1beta1.MsgWithdraw} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.toObject = function(includeInstance, msg) {
  var f, obj = {
    withdrawer: jspb.Message.getFieldWithDefault(msg, 1, ""),
    poolId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    poolCoin: (f = msg.getPoolCoin()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    appId: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.comdex.liquidity.v1beta1.MsgWithdraw}
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.liquidity.v1beta1.MsgWithdraw;
  return proto.comdex.liquidity.v1beta1.MsgWithdraw.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.liquidity.v1beta1.MsgWithdraw} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.liquidity.v1beta1.MsgWithdraw}
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setWithdrawer(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setPoolCoin(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
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
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.liquidity.v1beta1.MsgWithdraw.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.liquidity.v1beta1.MsgWithdraw} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getWithdrawer();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getPoolCoin();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
};


/**
 * optional string withdrawer = 1;
 * @return {string}
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.getWithdrawer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.liquidity.v1beta1.MsgWithdraw} returns this
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.setWithdrawer = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 pool_id = 2;
 * @return {number}
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.liquidity.v1beta1.MsgWithdraw} returns this
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional cosmos.base.v1beta1.Coin pool_coin = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.getPoolCoin = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.liquidity.v1beta1.MsgWithdraw} returns this
*/
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.setPoolCoin = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.liquidity.v1beta1.MsgWithdraw} returns this
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.clearPoolCoin = function() {
  return this.setPoolCoin(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.hasPoolCoin = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional uint64 app_id = 4;
 * @return {number}
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.liquidity.v1beta1.MsgWithdraw} returns this
 */
proto.comdex.liquidity.v1beta1.MsgWithdraw.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};

