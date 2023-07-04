// source: crescent/liquidfarming/v1beta1/genesis.proto
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

goog.provide('proto.crescent.liquidfarming.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.crescent.liquidfarming.v1beta1.Bid');
goog.require('proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord');
goog.require('proto.crescent.liquidfarming.v1beta1.LiquidFarm');
goog.require('proto.crescent.liquidfarming.v1beta1.Params');
goog.require('proto.crescent.liquidfarming.v1beta1.RewardsAuction');
goog.require('proto.crescent.liquidfarming.v1beta1.WinningBidRecord');
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
proto.crescent.liquidfarming.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.crescent.liquidfarming.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.crescent.liquidfarming.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.liquidfarming.v1beta1.GenesisState.displayName = 'proto.crescent.liquidfarming.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.repeatedFields_ = [2,3,4,5,6];



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
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.liquidfarming.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.liquidfarming.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.crescent.liquidfarming.v1beta1.Params.toObject(includeInstance, f),
    lastRewardsAuctionIdRecordList: jspb.Message.toObjectList(msg.getLastRewardsAuctionIdRecordList(),
    proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord.toObject, includeInstance),
    liquidFarmsList: jspb.Message.toObjectList(msg.getLiquidFarmsList(),
    proto.crescent.liquidfarming.v1beta1.LiquidFarm.toObject, includeInstance),
    rewardsAuctionsList: jspb.Message.toObjectList(msg.getRewardsAuctionsList(),
    proto.crescent.liquidfarming.v1beta1.RewardsAuction.toObject, includeInstance),
    bidsList: jspb.Message.toObjectList(msg.getBidsList(),
    proto.crescent.liquidfarming.v1beta1.Bid.toObject, includeInstance),
    winningBidRecordsList: jspb.Message.toObjectList(msg.getWinningBidRecordsList(),
    proto.crescent.liquidfarming.v1beta1.WinningBidRecord.toObject, includeInstance),
    lastRewardsAuctionEndTime: (f = msg.getLastRewardsAuctionEndTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.liquidfarming.v1beta1.GenesisState;
  return proto.crescent.liquidfarming.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.liquidfarming.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.crescent.liquidfarming.v1beta1.Params;
      reader.readMessage(value,proto.crescent.liquidfarming.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord;
      reader.readMessage(value,proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord.deserializeBinaryFromReader);
      msg.addLastRewardsAuctionIdRecord(value);
      break;
    case 3:
      var value = new proto.crescent.liquidfarming.v1beta1.LiquidFarm;
      reader.readMessage(value,proto.crescent.liquidfarming.v1beta1.LiquidFarm.deserializeBinaryFromReader);
      msg.addLiquidFarms(value);
      break;
    case 4:
      var value = new proto.crescent.liquidfarming.v1beta1.RewardsAuction;
      reader.readMessage(value,proto.crescent.liquidfarming.v1beta1.RewardsAuction.deserializeBinaryFromReader);
      msg.addRewardsAuctions(value);
      break;
    case 5:
      var value = new proto.crescent.liquidfarming.v1beta1.Bid;
      reader.readMessage(value,proto.crescent.liquidfarming.v1beta1.Bid.deserializeBinaryFromReader);
      msg.addBids(value);
      break;
    case 6:
      var value = new proto.crescent.liquidfarming.v1beta1.WinningBidRecord;
      reader.readMessage(value,proto.crescent.liquidfarming.v1beta1.WinningBidRecord.deserializeBinaryFromReader);
      msg.addWinningBidRecords(value);
      break;
    case 7:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setLastRewardsAuctionEndTime(value);
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
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.liquidfarming.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.liquidfarming.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.crescent.liquidfarming.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getLastRewardsAuctionIdRecordList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord.serializeBinaryToWriter
    );
  }
  f = message.getLiquidFarmsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.crescent.liquidfarming.v1beta1.LiquidFarm.serializeBinaryToWriter
    );
  }
  f = message.getRewardsAuctionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.crescent.liquidfarming.v1beta1.RewardsAuction.serializeBinaryToWriter
    );
  }
  f = message.getBidsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.crescent.liquidfarming.v1beta1.Bid.serializeBinaryToWriter
    );
  }
  f = message.getWinningBidRecordsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.crescent.liquidfarming.v1beta1.WinningBidRecord.serializeBinaryToWriter
    );
  }
  f = message.getLastRewardsAuctionEndTime();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.crescent.liquidfarming.v1beta1.Params}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.crescent.liquidfarming.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.crescent.liquidfarming.v1beta1.Params, 1));
};


/**
 * @param {?proto.crescent.liquidfarming.v1beta1.Params|undefined} value
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
*/
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated LastRewardsAuctionIdRecord last_rewards_auction_id_record = 2;
 * @return {!Array<!proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord>}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.getLastRewardsAuctionIdRecordList = function() {
  return /** @type{!Array<!proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord, 2));
};


/**
 * @param {!Array<!proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord>} value
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
*/
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.setLastRewardsAuctionIdRecordList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.addLastRewardsAuctionIdRecord = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.clearLastRewardsAuctionIdRecordList = function() {
  return this.setLastRewardsAuctionIdRecordList([]);
};


/**
 * repeated LiquidFarm liquid_farms = 3;
 * @return {!Array<!proto.crescent.liquidfarming.v1beta1.LiquidFarm>}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.getLiquidFarmsList = function() {
  return /** @type{!Array<!proto.crescent.liquidfarming.v1beta1.LiquidFarm>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.crescent.liquidfarming.v1beta1.LiquidFarm, 3));
};


/**
 * @param {!Array<!proto.crescent.liquidfarming.v1beta1.LiquidFarm>} value
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
*/
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.setLiquidFarmsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.crescent.liquidfarming.v1beta1.LiquidFarm=} opt_value
 * @param {number=} opt_index
 * @return {!proto.crescent.liquidfarming.v1beta1.LiquidFarm}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.addLiquidFarms = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.crescent.liquidfarming.v1beta1.LiquidFarm, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.clearLiquidFarmsList = function() {
  return this.setLiquidFarmsList([]);
};


/**
 * repeated RewardsAuction rewards_auctions = 4;
 * @return {!Array<!proto.crescent.liquidfarming.v1beta1.RewardsAuction>}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.getRewardsAuctionsList = function() {
  return /** @type{!Array<!proto.crescent.liquidfarming.v1beta1.RewardsAuction>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.crescent.liquidfarming.v1beta1.RewardsAuction, 4));
};


/**
 * @param {!Array<!proto.crescent.liquidfarming.v1beta1.RewardsAuction>} value
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
*/
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.setRewardsAuctionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.crescent.liquidfarming.v1beta1.RewardsAuction=} opt_value
 * @param {number=} opt_index
 * @return {!proto.crescent.liquidfarming.v1beta1.RewardsAuction}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.addRewardsAuctions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.crescent.liquidfarming.v1beta1.RewardsAuction, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.clearRewardsAuctionsList = function() {
  return this.setRewardsAuctionsList([]);
};


/**
 * repeated Bid bids = 5;
 * @return {!Array<!proto.crescent.liquidfarming.v1beta1.Bid>}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.getBidsList = function() {
  return /** @type{!Array<!proto.crescent.liquidfarming.v1beta1.Bid>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.crescent.liquidfarming.v1beta1.Bid, 5));
};


/**
 * @param {!Array<!proto.crescent.liquidfarming.v1beta1.Bid>} value
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
*/
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.setBidsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.crescent.liquidfarming.v1beta1.Bid=} opt_value
 * @param {number=} opt_index
 * @return {!proto.crescent.liquidfarming.v1beta1.Bid}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.addBids = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.crescent.liquidfarming.v1beta1.Bid, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.clearBidsList = function() {
  return this.setBidsList([]);
};


/**
 * repeated WinningBidRecord winning_bid_records = 6;
 * @return {!Array<!proto.crescent.liquidfarming.v1beta1.WinningBidRecord>}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.getWinningBidRecordsList = function() {
  return /** @type{!Array<!proto.crescent.liquidfarming.v1beta1.WinningBidRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.crescent.liquidfarming.v1beta1.WinningBidRecord, 6));
};


/**
 * @param {!Array<!proto.crescent.liquidfarming.v1beta1.WinningBidRecord>} value
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
*/
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.setWinningBidRecordsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.crescent.liquidfarming.v1beta1.WinningBidRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.crescent.liquidfarming.v1beta1.WinningBidRecord}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.addWinningBidRecords = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.crescent.liquidfarming.v1beta1.WinningBidRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.clearWinningBidRecordsList = function() {
  return this.setWinningBidRecordsList([]);
};


/**
 * optional google.protobuf.Timestamp last_rewards_auction_end_time = 7;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.getLastRewardsAuctionEndTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 7));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
*/
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.setLastRewardsAuctionEndTime = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.liquidfarming.v1beta1.GenesisState} returns this
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.clearLastRewardsAuctionEndTime = function() {
  return this.setLastRewardsAuctionEndTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.liquidfarming.v1beta1.GenesisState.prototype.hasLastRewardsAuctionEndTime = function() {
  return jspb.Message.getField(this, 7) != null;
};

