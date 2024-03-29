// source: OmniFlix/marketplace/v1beta1/tx.proto
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

goog.provide('proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.OmniFlix.marketplace.v1beta1.WeightedAddress');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Duration');
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
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.repeatedFields_, null);
};
goog.inherits(proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.displayName = 'proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.repeatedFields_ = [7,8];



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
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.toObject = function(opt_includeInstance) {
  return proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.toObject = function(includeInstance, msg) {
  var f, obj = {
    nftId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    denomId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    startTime: (f = msg.getStartTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    startPrice: (f = msg.getStartPrice()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    duration: (f = msg.getDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    incrementPercentage: jspb.Message.getFieldWithDefault(msg, 6, ""),
    whitelistAccountsList: (f = jspb.Message.getRepeatedField(msg, 7)) == null ? undefined : f,
    splitSharesList: jspb.Message.toObjectList(msg.getSplitSharesList(),
    proto.OmniFlix.marketplace.v1beta1.WeightedAddress.toObject, includeInstance),
    owner: jspb.Message.getFieldWithDefault(msg, 9, "")
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
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction;
  return proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setNftId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenomId(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartTime(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setStartPrice(value);
      break;
    case 5:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setDuration(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setIncrementPercentage(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.addWhitelistAccounts(value);
      break;
    case 8:
      var value = new proto.OmniFlix.marketplace.v1beta1.WeightedAddress;
      reader.readMessage(value,proto.OmniFlix.marketplace.v1beta1.WeightedAddress.deserializeBinaryFromReader);
      msg.addSplitShares(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
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
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getNftId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDenomId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getStartTime();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
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
  f = message.getDuration();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getIncrementPercentage();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getWhitelistAccountsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      7,
      f
    );
  }
  f = message.getSplitSharesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      8,
      f,
      proto.OmniFlix.marketplace.v1beta1.WeightedAddress.serializeBinaryToWriter
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
};


/**
 * optional string nft_id = 1;
 * @return {string}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.getNftId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.setNftId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string denom_id = 2;
 * @return {string}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.getDenomId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.setDenomId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional google.protobuf.Timestamp start_time = 3;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.getStartTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 3));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
*/
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.setStartTime = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.clearStartTime = function() {
  return this.setStartTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.hasStartTime = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin start_price = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.getStartPrice = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
*/
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.setStartPrice = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.clearStartPrice = function() {
  return this.setStartPrice(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.hasStartPrice = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional google.protobuf.Duration duration = 5;
 * @return {?proto.google.protobuf.Duration}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.getDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 5));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
*/
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.setDuration = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.clearDuration = function() {
  return this.setDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.hasDuration = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional string increment_percentage = 6;
 * @return {string}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.getIncrementPercentage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.setIncrementPercentage = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * repeated string whitelist_accounts = 7;
 * @return {!Array<string>}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.getWhitelistAccountsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 7));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.setWhitelistAccountsList = function(value) {
  return jspb.Message.setField(this, 7, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.addWhitelistAccounts = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 7, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.clearWhitelistAccountsList = function() {
  return this.setWhitelistAccountsList([]);
};


/**
 * repeated WeightedAddress split_shares = 8;
 * @return {!Array<!proto.OmniFlix.marketplace.v1beta1.WeightedAddress>}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.getSplitSharesList = function() {
  return /** @type{!Array<!proto.OmniFlix.marketplace.v1beta1.WeightedAddress>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.OmniFlix.marketplace.v1beta1.WeightedAddress, 8));
};


/**
 * @param {!Array<!proto.OmniFlix.marketplace.v1beta1.WeightedAddress>} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
*/
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.setSplitSharesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 8, value);
};


/**
 * @param {!proto.OmniFlix.marketplace.v1beta1.WeightedAddress=} opt_value
 * @param {number=} opt_index
 * @return {!proto.OmniFlix.marketplace.v1beta1.WeightedAddress}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.addSplitShares = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 8, opt_value, proto.OmniFlix.marketplace.v1beta1.WeightedAddress, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.clearSplitSharesList = function() {
  return this.setSplitSharesList([]);
};


/**
 * optional string owner = 9;
 * @return {string}
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction} returns this
 */
proto.OmniFlix.marketplace.v1beta1.MsgCreateAuction.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


