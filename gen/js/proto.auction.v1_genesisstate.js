// source: sommelier/auction/v1/genesis.proto
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

goog.provide('proto.auction.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.auction.v1.Auction');
goog.require('proto.auction.v1.Bid');
goog.require('proto.auction.v1.Params');
goog.require('proto.auction.v1.TokenPrice');

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
proto.auction.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.auction.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.auction.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.auction.v1.GenesisState.displayName = 'proto.auction.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.auction.v1.GenesisState.repeatedFields_ = [2,3,4];



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
proto.auction.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.auction.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.auction.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.auction.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.auction.v1.Params.toObject(includeInstance, f),
    auctionsList: jspb.Message.toObjectList(msg.getAuctionsList(),
    proto.auction.v1.Auction.toObject, includeInstance),
    bidsList: jspb.Message.toObjectList(msg.getBidsList(),
    proto.auction.v1.Bid.toObject, includeInstance),
    tokenPricesList: jspb.Message.toObjectList(msg.getTokenPricesList(),
    proto.auction.v1.TokenPrice.toObject, includeInstance),
    lastAuctionId: jspb.Message.getFieldWithDefault(msg, 5, 0),
    lastBidId: jspb.Message.getFieldWithDefault(msg, 6, 0)
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
 * @return {!proto.auction.v1.GenesisState}
 */
proto.auction.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.auction.v1.GenesisState;
  return proto.auction.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.auction.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.auction.v1.GenesisState}
 */
proto.auction.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.auction.v1.Params;
      reader.readMessage(value,proto.auction.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.auction.v1.Auction;
      reader.readMessage(value,proto.auction.v1.Auction.deserializeBinaryFromReader);
      msg.addAuctions(value);
      break;
    case 3:
      var value = new proto.auction.v1.Bid;
      reader.readMessage(value,proto.auction.v1.Bid.deserializeBinaryFromReader);
      msg.addBids(value);
      break;
    case 4:
      var value = new proto.auction.v1.TokenPrice;
      reader.readMessage(value,proto.auction.v1.TokenPrice.deserializeBinaryFromReader);
      msg.addTokenPrices(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setLastAuctionId(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLastBidId(value);
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
proto.auction.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.auction.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.auction.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.auction.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.auction.v1.Params.serializeBinaryToWriter
    );
  }
  f = message.getAuctionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.auction.v1.Auction.serializeBinaryToWriter
    );
  }
  f = message.getBidsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.auction.v1.Bid.serializeBinaryToWriter
    );
  }
  f = message.getTokenPricesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.auction.v1.TokenPrice.serializeBinaryToWriter
    );
  }
  f = message.getLastAuctionId();
  if (f !== 0) {
    writer.writeUint32(
      5,
      f
    );
  }
  f = message.getLastBidId();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.auction.v1.Params}
 */
proto.auction.v1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.auction.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.auction.v1.Params, 1));
};


/**
 * @param {?proto.auction.v1.Params|undefined} value
 * @return {!proto.auction.v1.GenesisState} returns this
*/
proto.auction.v1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.auction.v1.GenesisState} returns this
 */
proto.auction.v1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.auction.v1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Auction auctions = 2;
 * @return {!Array<!proto.auction.v1.Auction>}
 */
proto.auction.v1.GenesisState.prototype.getAuctionsList = function() {
  return /** @type{!Array<!proto.auction.v1.Auction>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.auction.v1.Auction, 2));
};


/**
 * @param {!Array<!proto.auction.v1.Auction>} value
 * @return {!proto.auction.v1.GenesisState} returns this
*/
proto.auction.v1.GenesisState.prototype.setAuctionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.auction.v1.Auction=} opt_value
 * @param {number=} opt_index
 * @return {!proto.auction.v1.Auction}
 */
proto.auction.v1.GenesisState.prototype.addAuctions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.auction.v1.Auction, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.auction.v1.GenesisState} returns this
 */
proto.auction.v1.GenesisState.prototype.clearAuctionsList = function() {
  return this.setAuctionsList([]);
};


/**
 * repeated Bid bids = 3;
 * @return {!Array<!proto.auction.v1.Bid>}
 */
proto.auction.v1.GenesisState.prototype.getBidsList = function() {
  return /** @type{!Array<!proto.auction.v1.Bid>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.auction.v1.Bid, 3));
};


/**
 * @param {!Array<!proto.auction.v1.Bid>} value
 * @return {!proto.auction.v1.GenesisState} returns this
*/
proto.auction.v1.GenesisState.prototype.setBidsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.auction.v1.Bid=} opt_value
 * @param {number=} opt_index
 * @return {!proto.auction.v1.Bid}
 */
proto.auction.v1.GenesisState.prototype.addBids = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.auction.v1.Bid, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.auction.v1.GenesisState} returns this
 */
proto.auction.v1.GenesisState.prototype.clearBidsList = function() {
  return this.setBidsList([]);
};


/**
 * repeated TokenPrice token_prices = 4;
 * @return {!Array<!proto.auction.v1.TokenPrice>}
 */
proto.auction.v1.GenesisState.prototype.getTokenPricesList = function() {
  return /** @type{!Array<!proto.auction.v1.TokenPrice>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.auction.v1.TokenPrice, 4));
};


/**
 * @param {!Array<!proto.auction.v1.TokenPrice>} value
 * @return {!proto.auction.v1.GenesisState} returns this
*/
proto.auction.v1.GenesisState.prototype.setTokenPricesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.auction.v1.TokenPrice=} opt_value
 * @param {number=} opt_index
 * @return {!proto.auction.v1.TokenPrice}
 */
proto.auction.v1.GenesisState.prototype.addTokenPrices = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.auction.v1.TokenPrice, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.auction.v1.GenesisState} returns this
 */
proto.auction.v1.GenesisState.prototype.clearTokenPricesList = function() {
  return this.setTokenPricesList([]);
};


/**
 * optional uint32 last_auction_id = 5;
 * @return {number}
 */
proto.auction.v1.GenesisState.prototype.getLastAuctionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.auction.v1.GenesisState} returns this
 */
proto.auction.v1.GenesisState.prototype.setLastAuctionId = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional uint64 last_bid_id = 6;
 * @return {number}
 */
proto.auction.v1.GenesisState.prototype.getLastBidId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.auction.v1.GenesisState} returns this
 */
proto.auction.v1.GenesisState.prototype.setLastBidId = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


