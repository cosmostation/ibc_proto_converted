// source: sommelier/auction/v1/auction.proto
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

goog.provide('proto.auction.v1.Bid');

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
proto.auction.v1.Bid = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.auction.v1.Bid, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.auction.v1.Bid.displayName = 'proto.auction.v1.Bid';
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
proto.auction.v1.Bid.prototype.toObject = function(opt_includeInstance) {
  return proto.auction.v1.Bid.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.auction.v1.Bid} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.auction.v1.Bid.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    auctionId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    bidder: jspb.Message.getFieldWithDefault(msg, 3, ""),
    maxBidInUsomm: (f = msg.getMaxBidInUsomm()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    saleTokenMinimumAmount: (f = msg.getSaleTokenMinimumAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    totalFulfilledSaleTokens: (f = msg.getTotalFulfilledSaleTokens()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    saleTokenUnitPriceInUsomm: jspb.Message.getFieldWithDefault(msg, 7, ""),
    totalUsommPaid: (f = msg.getTotalUsommPaid()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    blockHeight: jspb.Message.getFieldWithDefault(msg, 9, 0)
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
 * @return {!proto.auction.v1.Bid}
 */
proto.auction.v1.Bid.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.auction.v1.Bid;
  return proto.auction.v1.Bid.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.auction.v1.Bid} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.auction.v1.Bid}
 */
proto.auction.v1.Bid.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setAuctionId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setBidder(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setMaxBidInUsomm(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setSaleTokenMinimumAmount(value);
      break;
    case 6:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTotalFulfilledSaleTokens(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setSaleTokenUnitPriceInUsomm(value);
      break;
    case 8:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTotalUsommPaid(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBlockHeight(value);
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
proto.auction.v1.Bid.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.auction.v1.Bid.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.auction.v1.Bid} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.auction.v1.Bid.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAuctionId();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getBidder();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getMaxBidInUsomm();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getSaleTokenMinimumAmount();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTotalFulfilledSaleTokens();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getSaleTokenUnitPriceInUsomm();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getTotalUsommPaid();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getBlockHeight();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.auction.v1.Bid.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.auction.v1.Bid} returns this
 */
proto.auction.v1.Bid.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint32 auction_id = 2;
 * @return {number}
 */
proto.auction.v1.Bid.prototype.getAuctionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.auction.v1.Bid} returns this
 */
proto.auction.v1.Bid.prototype.setAuctionId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string bidder = 3;
 * @return {string}
 */
proto.auction.v1.Bid.prototype.getBidder = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.auction.v1.Bid} returns this
 */
proto.auction.v1.Bid.prototype.setBidder = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional cosmos.base.v1beta1.Coin max_bid_in_usomm = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.auction.v1.Bid.prototype.getMaxBidInUsomm = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.auction.v1.Bid} returns this
*/
proto.auction.v1.Bid.prototype.setMaxBidInUsomm = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.auction.v1.Bid} returns this
 */
proto.auction.v1.Bid.prototype.clearMaxBidInUsomm = function() {
  return this.setMaxBidInUsomm(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.auction.v1.Bid.prototype.hasMaxBidInUsomm = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin sale_token_minimum_amount = 5;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.auction.v1.Bid.prototype.getSaleTokenMinimumAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.auction.v1.Bid} returns this
*/
proto.auction.v1.Bid.prototype.setSaleTokenMinimumAmount = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.auction.v1.Bid} returns this
 */
proto.auction.v1.Bid.prototype.clearSaleTokenMinimumAmount = function() {
  return this.setSaleTokenMinimumAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.auction.v1.Bid.prototype.hasSaleTokenMinimumAmount = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin total_fulfilled_sale_tokens = 6;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.auction.v1.Bid.prototype.getTotalFulfilledSaleTokens = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 6));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.auction.v1.Bid} returns this
*/
proto.auction.v1.Bid.prototype.setTotalFulfilledSaleTokens = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.auction.v1.Bid} returns this
 */
proto.auction.v1.Bid.prototype.clearTotalFulfilledSaleTokens = function() {
  return this.setTotalFulfilledSaleTokens(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.auction.v1.Bid.prototype.hasTotalFulfilledSaleTokens = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional string sale_token_unit_price_in_usomm = 7;
 * @return {string}
 */
proto.auction.v1.Bid.prototype.getSaleTokenUnitPriceInUsomm = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.auction.v1.Bid} returns this
 */
proto.auction.v1.Bid.prototype.setSaleTokenUnitPriceInUsomm = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional cosmos.base.v1beta1.Coin total_usomm_paid = 8;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.auction.v1.Bid.prototype.getTotalUsommPaid = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 8));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.auction.v1.Bid} returns this
*/
proto.auction.v1.Bid.prototype.setTotalUsommPaid = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.auction.v1.Bid} returns this
 */
proto.auction.v1.Bid.prototype.clearTotalUsommPaid = function() {
  return this.setTotalUsommPaid(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.auction.v1.Bid.prototype.hasTotalUsommPaid = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional uint64 block_height = 9;
 * @return {number}
 */
proto.auction.v1.Bid.prototype.getBlockHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.auction.v1.Bid} returns this
 */
proto.auction.v1.Bid.prototype.setBlockHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};

