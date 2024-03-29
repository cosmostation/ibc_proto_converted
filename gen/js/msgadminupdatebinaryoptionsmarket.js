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

goog.provide('proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.injective.exchange.v1beta1.MarketStatus');
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
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.displayName = 'proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket';
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
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    marketId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    settlementPrice: jspb.Message.getFieldWithDefault(msg, 3, ""),
    expirationTimestamp: jspb.Message.getFieldWithDefault(msg, 4, 0),
    settlementTimestamp: jspb.Message.getFieldWithDefault(msg, 5, 0),
    status: jspb.Message.getFieldWithDefault(msg, 6, 0)
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
 * @return {!proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket}
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket;
  return proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket}
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setMarketId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSettlementPrice(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setExpirationTimestamp(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setSettlementTimestamp(value);
      break;
    case 6:
      var value = /** @type {!proto.injective.exchange.v1beta1.MarketStatus} */ (reader.readEnum());
      msg.setStatus(value);
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
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getMarketId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSettlementPrice();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getExpirationTimestamp();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
  f = message.getSettlementTimestamp();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      6,
      f
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket} returns this
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string market_id = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.getMarketId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket} returns this
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.setMarketId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string settlement_price = 3;
 * @return {string}
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.getSettlementPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket} returns this
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.setSettlementPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional int64 expiration_timestamp = 4;
 * @return {number}
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.getExpirationTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket} returns this
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.setExpirationTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional int64 settlement_timestamp = 5;
 * @return {number}
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.getSettlementTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket} returns this
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.setSettlementTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional MarketStatus status = 6;
 * @return {!proto.injective.exchange.v1beta1.MarketStatus}
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.getStatus = function() {
  return /** @type {!proto.injective.exchange.v1beta1.MarketStatus} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {!proto.injective.exchange.v1beta1.MarketStatus} value
 * @return {!proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket} returns this
 */
proto.injective.exchange.v1beta1.MsgAdminUpdateBinaryOptionsMarket.prototype.setStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 6, value);
};


