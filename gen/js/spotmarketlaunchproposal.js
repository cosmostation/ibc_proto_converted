// source: injective/exchange/v1beta1/tx.proto
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

goog.provide('proto.injective.exchange.v1beta1.SpotMarketLaunchProposal');

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
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.SpotMarketLaunchProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.displayName = 'proto.injective.exchange.v1beta1.SpotMarketLaunchProposal';
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
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    ticker: jspb.Message.getFieldWithDefault(msg, 3, ""),
    baseDenom: jspb.Message.getFieldWithDefault(msg, 4, ""),
    quoteDenom: jspb.Message.getFieldWithDefault(msg, 5, ""),
    minPriceTickSize: jspb.Message.getFieldWithDefault(msg, 6, ""),
    minQuantityTickSize: jspb.Message.getFieldWithDefault(msg, 7, ""),
    makerFeeRate: jspb.Message.getFieldWithDefault(msg, 8, ""),
    takerFeeRate: jspb.Message.getFieldWithDefault(msg, 9, "")
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
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal}
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.SpotMarketLaunchProposal;
  return proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal}
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setTicker(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setBaseDenom(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setQuoteDenom(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinPriceTickSize(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinQuantityTickSize(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setMakerFeeRate(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setTakerFeeRate(value);
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
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTicker();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getBaseDenom();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getQuoteDenom();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getMinPriceTickSize();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getMinQuantityTickSize();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getMakerFeeRate();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getTakerFeeRate();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string ticker = 3;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.getTicker = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.setTicker = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string base_denom = 4;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.getBaseDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.setBaseDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string quote_denom = 5;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.getQuoteDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.setQuoteDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string min_price_tick_size = 6;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.getMinPriceTickSize = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.setMinPriceTickSize = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string min_quantity_tick_size = 7;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.getMinQuantityTickSize = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.setMinQuantityTickSize = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string maker_fee_rate = 8;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.getMakerFeeRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.setMakerFeeRate = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string taker_fee_rate = 9;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.getTakerFeeRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.prototype.setTakerFeeRate = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


