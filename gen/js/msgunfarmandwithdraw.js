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

goog.provide('proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw');

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
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.displayName = 'proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw';
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
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.toObject = function(includeInstance, msg) {
  var f, obj = {
    appId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    poolId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    farmer: jspb.Message.getFieldWithDefault(msg, 3, ""),
    unfarmingPoolCoin: (f = msg.getUnfarmingPoolCoin()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw}
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw;
  return proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw}
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setFarmer(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setUnfarmingPoolCoin(value);
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
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
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
  f = message.getFarmer();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getUnfarmingPoolCoin();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 app_id = 1;
 * @return {number}
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw} returns this
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 pool_id = 2;
 * @return {number}
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw} returns this
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string farmer = 3;
 * @return {string}
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.getFarmer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw} returns this
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.setFarmer = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional cosmos.base.v1beta1.Coin unfarming_pool_coin = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.getUnfarmingPoolCoin = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw} returns this
*/
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.setUnfarmingPoolCoin = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw} returns this
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.clearUnfarmingPoolCoin = function() {
  return this.setUnfarmingPoolCoin(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw.prototype.hasUnfarmingPoolCoin = function() {
  return jspb.Message.getField(this, 4) != null;
};

