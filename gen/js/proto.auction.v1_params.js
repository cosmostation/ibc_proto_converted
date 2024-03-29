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

goog.provide('proto.auction.v1.Params');

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
proto.auction.v1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.auction.v1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.auction.v1.Params.displayName = 'proto.auction.v1.Params';
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
proto.auction.v1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.auction.v1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.auction.v1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.auction.v1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    priceMaxBlockAge: jspb.Message.getFieldWithDefault(msg, 1, 0),
    minimumBidInUsomm: jspb.Message.getFieldWithDefault(msg, 2, 0),
    auctionMaxBlockAge: jspb.Message.getFieldWithDefault(msg, 3, 0),
    auctionPriceDecreaseAccelerationRate: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.auction.v1.Params}
 */
proto.auction.v1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.auction.v1.Params;
  return proto.auction.v1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.auction.v1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.auction.v1.Params}
 */
proto.auction.v1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPriceMaxBlockAge(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMinimumBidInUsomm(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAuctionMaxBlockAge(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setAuctionPriceDecreaseAccelerationRate(value);
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
proto.auction.v1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.auction.v1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.auction.v1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.auction.v1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPriceMaxBlockAge();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getMinimumBidInUsomm();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getAuctionMaxBlockAge();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getAuctionPriceDecreaseAccelerationRate();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional uint64 price_max_block_age = 1;
 * @return {number}
 */
proto.auction.v1.Params.prototype.getPriceMaxBlockAge = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.auction.v1.Params} returns this
 */
proto.auction.v1.Params.prototype.setPriceMaxBlockAge = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 minimum_bid_in_usomm = 2;
 * @return {number}
 */
proto.auction.v1.Params.prototype.getMinimumBidInUsomm = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.auction.v1.Params} returns this
 */
proto.auction.v1.Params.prototype.setMinimumBidInUsomm = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 auction_max_block_age = 3;
 * @return {number}
 */
proto.auction.v1.Params.prototype.getAuctionMaxBlockAge = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.auction.v1.Params} returns this
 */
proto.auction.v1.Params.prototype.setAuctionMaxBlockAge = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string auction_price_decrease_acceleration_rate = 4;
 * @return {string}
 */
proto.auction.v1.Params.prototype.getAuctionPriceDecreaseAccelerationRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.auction.v1.Params} returns this
 */
proto.auction.v1.Params.prototype.setAuctionPriceDecreaseAccelerationRate = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


