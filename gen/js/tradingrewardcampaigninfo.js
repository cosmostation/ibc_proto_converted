// source: injective/exchange/v1beta1/exchange.proto
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

goog.provide('proto.injective.exchange.v1beta1.TradingRewardCampaignInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo');

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
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.TradingRewardCampaignInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.displayName = 'proto.injective.exchange.v1beta1.TradingRewardCampaignInfo';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.repeatedFields_ = [2,4];



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
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    campaignDurationSeconds: jspb.Message.getFieldWithDefault(msg, 1, 0),
    quoteDenomsList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    tradingRewardBoostInfo: (f = msg.getTradingRewardBoostInfo()) && proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.toObject(includeInstance, f),
    disqualifiedMarketIdsList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f
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
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.TradingRewardCampaignInfo;
  return proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setCampaignDurationSeconds(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addQuoteDenoms(value);
      break;
    case 3:
      var value = new proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo;
      reader.readMessage(value,proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.deserializeBinaryFromReader);
      msg.setTradingRewardBoostInfo(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.addDisqualifiedMarketIds(value);
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
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCampaignDurationSeconds();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getQuoteDenomsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getTradingRewardBoostInfo();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo.serializeBinaryToWriter
    );
  }
  f = message.getDisqualifiedMarketIdsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      4,
      f
    );
  }
};


/**
 * optional int64 campaign_duration_seconds = 1;
 * @return {number}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.getCampaignDurationSeconds = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.setCampaignDurationSeconds = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated string quote_denoms = 2;
 * @return {!Array<string>}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.getQuoteDenomsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.setQuoteDenomsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.addQuoteDenoms = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.clearQuoteDenomsList = function() {
  return this.setQuoteDenomsList([]);
};


/**
 * optional TradingRewardCampaignBoostInfo trading_reward_boost_info = 3;
 * @return {?proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.getTradingRewardBoostInfo = function() {
  return /** @type{?proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo} */ (
    jspb.Message.getWrapperField(this, proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo, 3));
};


/**
 * @param {?proto.injective.exchange.v1beta1.TradingRewardCampaignBoostInfo|undefined} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} returns this
*/
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.setTradingRewardBoostInfo = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.clearTradingRewardBoostInfo = function() {
  return this.setTradingRewardBoostInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.hasTradingRewardBoostInfo = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * repeated string disqualified_market_ids = 4;
 * @return {!Array<string>}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.getDisqualifiedMarketIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.setDisqualifiedMarketIdsList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.addDisqualifiedMarketIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.prototype.clearDisqualifiedMarketIdsList = function() {
  return this.setDisqualifiedMarketIdsList([]);
};


