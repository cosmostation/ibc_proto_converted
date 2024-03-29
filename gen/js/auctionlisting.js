// source: OmniFlix/marketplace/v1beta1/auction.proto
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

goog.provide('proto.OmniFlix.marketplace.v1beta1.AuctionListing');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.OmniFlix.marketplace.v1beta1.WeightedAddress');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Timestamp');

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
proto.OmniFlix.marketplace.v1beta1.AuctionListing = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.OmniFlix.marketplace.v1beta1.AuctionListing.repeatedFields_, null);
};
goog.inherits(proto.OmniFlix.marketplace.v1beta1.AuctionListing, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.OmniFlix.marketplace.v1beta1.AuctionListing.displayName = 'proto.OmniFlix.marketplace.v1beta1.AuctionListing';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.repeatedFields_ = [9,10];



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
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.toObject = function(opt_includeInstance) {
  return proto.OmniFlix.marketplace.v1beta1.AuctionListing.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    nftId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    denomId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    startPrice: (f = msg.getStartPrice()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    startTime: (f = msg.getStartTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    endTime: (f = msg.getEndTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    owner: jspb.Message.getFieldWithDefault(msg, 7, ""),
    incrementPercentage: jspb.Message.getFieldWithDefault(msg, 8, ""),
    whitelistAccountsList: (f = jspb.Message.getRepeatedField(msg, 9)) == null ? undefined : f,
    splitSharesList: jspb.Message.toObjectList(msg.getSplitSharesList(),
    proto.OmniFlix.marketplace.v1beta1.WeightedAddress.toObject, includeInstance)
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
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.OmniFlix.marketplace.v1beta1.AuctionListing;
  return proto.OmniFlix.marketplace.v1beta1.AuctionListing.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {string} */ (reader.readString());
      msg.setNftId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenomId(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setStartPrice(value);
      break;
    case 5:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartTime(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setEndTime(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setIncrementPercentage(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.addWhitelistAccounts(value);
      break;
    case 10:
      var value = new proto.OmniFlix.marketplace.v1beta1.WeightedAddress;
      reader.readMessage(value,proto.OmniFlix.marketplace.v1beta1.WeightedAddress.deserializeBinaryFromReader);
      msg.addSplitShares(value);
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
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.OmniFlix.marketplace.v1beta1.AuctionListing.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getNftId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDenomId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getStartPrice();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getStartTime();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getEndTime();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getIncrementPercentage();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getWhitelistAccountsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      9,
      f
    );
  }
  f = message.getSplitSharesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      10,
      f,
      proto.OmniFlix.marketplace.v1beta1.WeightedAddress.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string nft_id = 2;
 * @return {string}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.getNftId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.setNftId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string denom_id = 3;
 * @return {string}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.getDenomId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.setDenomId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional cosmos.base.v1beta1.Coin start_price = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.getStartPrice = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
*/
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.setStartPrice = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.clearStartPrice = function() {
  return this.setStartPrice(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.hasStartPrice = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional google.protobuf.Timestamp start_time = 5;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.getStartTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 5));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
*/
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.setStartTime = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.clearStartTime = function() {
  return this.setStartTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.hasStartTime = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional google.protobuf.Timestamp end_time = 6;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.getEndTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 6));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
*/
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.setEndTime = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.clearEndTime = function() {
  return this.setEndTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.hasEndTime = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional string owner = 7;
 * @return {string}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string increment_percentage = 8;
 * @return {string}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.getIncrementPercentage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.setIncrementPercentage = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * repeated string whitelist_accounts = 9;
 * @return {!Array<string>}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.getWhitelistAccountsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 9));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.setWhitelistAccountsList = function(value) {
  return jspb.Message.setField(this, 9, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.addWhitelistAccounts = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 9, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.clearWhitelistAccountsList = function() {
  return this.setWhitelistAccountsList([]);
};


/**
 * repeated WeightedAddress split_shares = 10;
 * @return {!Array<!proto.OmniFlix.marketplace.v1beta1.WeightedAddress>}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.getSplitSharesList = function() {
  return /** @type{!Array<!proto.OmniFlix.marketplace.v1beta1.WeightedAddress>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.OmniFlix.marketplace.v1beta1.WeightedAddress, 10));
};


/**
 * @param {!Array<!proto.OmniFlix.marketplace.v1beta1.WeightedAddress>} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
*/
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.setSplitSharesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 10, value);
};


/**
 * @param {!proto.OmniFlix.marketplace.v1beta1.WeightedAddress=} opt_value
 * @param {number=} opt_index
 * @return {!proto.OmniFlix.marketplace.v1beta1.WeightedAddress}
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.addSplitShares = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 10, opt_value, proto.OmniFlix.marketplace.v1beta1.WeightedAddress, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.OmniFlix.marketplace.v1beta1.AuctionListing} returns this
 */
proto.OmniFlix.marketplace.v1beta1.AuctionListing.prototype.clearSplitSharesList = function() {
  return this.setSplitSharesList([]);
};


