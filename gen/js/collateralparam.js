// source: kava/cdp/v1beta1/genesis.proto
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

goog.provide('proto.kava.cdp.v1beta1.CollateralParam');

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
proto.kava.cdp.v1beta1.CollateralParam = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.cdp.v1beta1.CollateralParam, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.cdp.v1beta1.CollateralParam.displayName = 'proto.kava.cdp.v1beta1.CollateralParam';
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
proto.kava.cdp.v1beta1.CollateralParam.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.cdp.v1beta1.CollateralParam.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.cdp.v1beta1.CollateralParam} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.cdp.v1beta1.CollateralParam.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    type: jspb.Message.getFieldWithDefault(msg, 2, ""),
    liquidationRatio: jspb.Message.getFieldWithDefault(msg, 3, ""),
    debtLimit: (f = msg.getDebtLimit()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    stabilityFee: jspb.Message.getFieldWithDefault(msg, 5, ""),
    auctionSize: jspb.Message.getFieldWithDefault(msg, 6, ""),
    liquidationPenalty: jspb.Message.getFieldWithDefault(msg, 7, ""),
    spotMarketId: jspb.Message.getFieldWithDefault(msg, 8, ""),
    liquidationMarketId: jspb.Message.getFieldWithDefault(msg, 9, ""),
    keeperRewardPercentage: jspb.Message.getFieldWithDefault(msg, 10, ""),
    checkCollateralizationIndexCount: jspb.Message.getFieldWithDefault(msg, 11, ""),
    conversionFactor: jspb.Message.getFieldWithDefault(msg, 12, "")
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
 * @return {!proto.kava.cdp.v1beta1.CollateralParam}
 */
proto.kava.cdp.v1beta1.CollateralParam.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.cdp.v1beta1.CollateralParam;
  return proto.kava.cdp.v1beta1.CollateralParam.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.cdp.v1beta1.CollateralParam} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.cdp.v1beta1.CollateralParam}
 */
proto.kava.cdp.v1beta1.CollateralParam.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setType(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setLiquidationRatio(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setDebtLimit(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setStabilityFee(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setAuctionSize(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setLiquidationPenalty(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setSpotMarketId(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setLiquidationMarketId(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setKeeperRewardPercentage(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.setCheckCollateralizationIndexCount(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setConversionFactor(value);
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
proto.kava.cdp.v1beta1.CollateralParam.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.cdp.v1beta1.CollateralParam.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.cdp.v1beta1.CollateralParam} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.cdp.v1beta1.CollateralParam.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getType();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getLiquidationRatio();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getDebtLimit();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getStabilityFee();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getAuctionSize();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getLiquidationPenalty();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getSpotMarketId();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getLiquidationMarketId();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getKeeperRewardPercentage();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getCheckCollateralizationIndexCount();
  if (f.length > 0) {
    writer.writeString(
      11,
      f
    );
  }
  f = message.getConversionFactor();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string type = 2;
 * @return {string}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getType = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.setType = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string liquidation_ratio = 3;
 * @return {string}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getLiquidationRatio = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.setLiquidationRatio = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional cosmos.base.v1beta1.Coin debt_limit = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getDebtLimit = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
*/
proto.kava.cdp.v1beta1.CollateralParam.prototype.setDebtLimit = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.clearDebtLimit = function() {
  return this.setDebtLimit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.hasDebtLimit = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional string stability_fee = 5;
 * @return {string}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getStabilityFee = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.setStabilityFee = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string auction_size = 6;
 * @return {string}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getAuctionSize = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.setAuctionSize = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string liquidation_penalty = 7;
 * @return {string}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getLiquidationPenalty = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.setLiquidationPenalty = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string spot_market_id = 8;
 * @return {string}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getSpotMarketId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.setSpotMarketId = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string liquidation_market_id = 9;
 * @return {string}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getLiquidationMarketId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.setLiquidationMarketId = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional string keeper_reward_percentage = 10;
 * @return {string}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getKeeperRewardPercentage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.setKeeperRewardPercentage = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * optional string check_collateralization_index_count = 11;
 * @return {string}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getCheckCollateralizationIndexCount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.setCheckCollateralizationIndexCount = function(value) {
  return jspb.Message.setProto3StringField(this, 11, value);
};


/**
 * optional string conversion_factor = 12;
 * @return {string}
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.getConversionFactor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.CollateralParam} returns this
 */
proto.kava.cdp.v1beta1.CollateralParam.prototype.setConversionFactor = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


