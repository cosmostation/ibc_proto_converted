// source: cosmos/distribution/v1beta1/genesis.proto
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

goog.provide('proto.cosmos.distribution.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord');
goog.require('proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo');
goog.require('proto.cosmos.distribution.v1beta1.FeePool');
goog.require('proto.cosmos.distribution.v1beta1.Params');
goog.require('proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord');
goog.require('proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord');
goog.require('proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord');
goog.require('proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord');
goog.require('proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord');

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
proto.cosmos.distribution.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.distribution.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.cosmos.distribution.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.distribution.v1beta1.GenesisState.displayName = 'proto.cosmos.distribution.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.distribution.v1beta1.GenesisState.repeatedFields_ = [3,5,6,7,8,9,10];



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
proto.cosmos.distribution.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.distribution.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.distribution.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.distribution.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.cosmos.distribution.v1beta1.Params.toObject(includeInstance, f),
    feePool: (f = msg.getFeePool()) && proto.cosmos.distribution.v1beta1.FeePool.toObject(includeInstance, f),
    delegatorWithdrawInfosList: jspb.Message.toObjectList(msg.getDelegatorWithdrawInfosList(),
    proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo.toObject, includeInstance),
    previousProposer: jspb.Message.getFieldWithDefault(msg, 4, ""),
    outstandingRewardsList: jspb.Message.toObjectList(msg.getOutstandingRewardsList(),
    proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord.toObject, includeInstance),
    validatorAccumulatedCommissionsList: jspb.Message.toObjectList(msg.getValidatorAccumulatedCommissionsList(),
    proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord.toObject, includeInstance),
    validatorHistoricalRewardsList: jspb.Message.toObjectList(msg.getValidatorHistoricalRewardsList(),
    proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord.toObject, includeInstance),
    validatorCurrentRewardsList: jspb.Message.toObjectList(msg.getValidatorCurrentRewardsList(),
    proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord.toObject, includeInstance),
    delegatorStartingInfosList: jspb.Message.toObjectList(msg.getDelegatorStartingInfosList(),
    proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord.toObject, includeInstance),
    validatorSlashEventsList: jspb.Message.toObjectList(msg.getValidatorSlashEventsList(),
    proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord.toObject, includeInstance)
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
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState}
 */
proto.cosmos.distribution.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.distribution.v1beta1.GenesisState;
  return proto.cosmos.distribution.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.distribution.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState}
 */
proto.cosmos.distribution.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.distribution.v1beta1.Params;
      reader.readMessage(value,proto.cosmos.distribution.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.cosmos.distribution.v1beta1.FeePool;
      reader.readMessage(value,proto.cosmos.distribution.v1beta1.FeePool.deserializeBinaryFromReader);
      msg.setFeePool(value);
      break;
    case 3:
      var value = new proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo;
      reader.readMessage(value,proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo.deserializeBinaryFromReader);
      msg.addDelegatorWithdrawInfos(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setPreviousProposer(value);
      break;
    case 5:
      var value = new proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord;
      reader.readMessage(value,proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord.deserializeBinaryFromReader);
      msg.addOutstandingRewards(value);
      break;
    case 6:
      var value = new proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord;
      reader.readMessage(value,proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord.deserializeBinaryFromReader);
      msg.addValidatorAccumulatedCommissions(value);
      break;
    case 7:
      var value = new proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord;
      reader.readMessage(value,proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord.deserializeBinaryFromReader);
      msg.addValidatorHistoricalRewards(value);
      break;
    case 8:
      var value = new proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord;
      reader.readMessage(value,proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord.deserializeBinaryFromReader);
      msg.addValidatorCurrentRewards(value);
      break;
    case 9:
      var value = new proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord;
      reader.readMessage(value,proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord.deserializeBinaryFromReader);
      msg.addDelegatorStartingInfos(value);
      break;
    case 10:
      var value = new proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord;
      reader.readMessage(value,proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord.deserializeBinaryFromReader);
      msg.addValidatorSlashEvents(value);
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
proto.cosmos.distribution.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.distribution.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.distribution.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.distribution.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.distribution.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getFeePool();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.distribution.v1beta1.FeePool.serializeBinaryToWriter
    );
  }
  f = message.getDelegatorWithdrawInfosList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo.serializeBinaryToWriter
    );
  }
  f = message.getPreviousProposer();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getOutstandingRewardsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord.serializeBinaryToWriter
    );
  }
  f = message.getValidatorAccumulatedCommissionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord.serializeBinaryToWriter
    );
  }
  f = message.getValidatorHistoricalRewardsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord.serializeBinaryToWriter
    );
  }
  f = message.getValidatorCurrentRewardsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      8,
      f,
      proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord.serializeBinaryToWriter
    );
  }
  f = message.getDelegatorStartingInfosList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      9,
      f,
      proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord.serializeBinaryToWriter
    );
  }
  f = message.getValidatorSlashEventsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      10,
      f,
      proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.cosmos.distribution.v1beta1.Params}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.cosmos.distribution.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.distribution.v1beta1.Params, 1));
};


/**
 * @param {?proto.cosmos.distribution.v1beta1.Params|undefined} value
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
*/
proto.cosmos.distribution.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional FeePool fee_pool = 2;
 * @return {?proto.cosmos.distribution.v1beta1.FeePool}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.getFeePool = function() {
  return /** @type{?proto.cosmos.distribution.v1beta1.FeePool} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.distribution.v1beta1.FeePool, 2));
};


/**
 * @param {?proto.cosmos.distribution.v1beta1.FeePool|undefined} value
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
*/
proto.cosmos.distribution.v1beta1.GenesisState.prototype.setFeePool = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.clearFeePool = function() {
  return this.setFeePool(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.hasFeePool = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated DelegatorWithdrawInfo delegator_withdraw_infos = 3;
 * @return {!Array<!proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo>}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.getDelegatorWithdrawInfosList = function() {
  return /** @type{!Array<!proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo, 3));
};


/**
 * @param {!Array<!proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo>} value
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
*/
proto.cosmos.distribution.v1beta1.GenesisState.prototype.setDelegatorWithdrawInfosList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.addDelegatorWithdrawInfos = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.distribution.v1beta1.DelegatorWithdrawInfo, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.clearDelegatorWithdrawInfosList = function() {
  return this.setDelegatorWithdrawInfosList([]);
};


/**
 * optional string previous_proposer = 4;
 * @return {string}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.getPreviousProposer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.setPreviousProposer = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * repeated ValidatorOutstandingRewardsRecord outstanding_rewards = 5;
 * @return {!Array<!proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord>}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.getOutstandingRewardsList = function() {
  return /** @type{!Array<!proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord, 5));
};


/**
 * @param {!Array<!proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord>} value
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
*/
proto.cosmos.distribution.v1beta1.GenesisState.prototype.setOutstandingRewardsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.addOutstandingRewards = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.cosmos.distribution.v1beta1.ValidatorOutstandingRewardsRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.clearOutstandingRewardsList = function() {
  return this.setOutstandingRewardsList([]);
};


/**
 * repeated ValidatorAccumulatedCommissionRecord validator_accumulated_commissions = 6;
 * @return {!Array<!proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord>}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.getValidatorAccumulatedCommissionsList = function() {
  return /** @type{!Array<!proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord, 6));
};


/**
 * @param {!Array<!proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord>} value
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
*/
proto.cosmos.distribution.v1beta1.GenesisState.prototype.setValidatorAccumulatedCommissionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.addValidatorAccumulatedCommissions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.cosmos.distribution.v1beta1.ValidatorAccumulatedCommissionRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.clearValidatorAccumulatedCommissionsList = function() {
  return this.setValidatorAccumulatedCommissionsList([]);
};


/**
 * repeated ValidatorHistoricalRewardsRecord validator_historical_rewards = 7;
 * @return {!Array<!proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord>}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.getValidatorHistoricalRewardsList = function() {
  return /** @type{!Array<!proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord, 7));
};


/**
 * @param {!Array<!proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord>} value
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
*/
proto.cosmos.distribution.v1beta1.GenesisState.prototype.setValidatorHistoricalRewardsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.addValidatorHistoricalRewards = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.clearValidatorHistoricalRewardsList = function() {
  return this.setValidatorHistoricalRewardsList([]);
};


/**
 * repeated ValidatorCurrentRewardsRecord validator_current_rewards = 8;
 * @return {!Array<!proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord>}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.getValidatorCurrentRewardsList = function() {
  return /** @type{!Array<!proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord, 8));
};


/**
 * @param {!Array<!proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord>} value
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
*/
proto.cosmos.distribution.v1beta1.GenesisState.prototype.setValidatorCurrentRewardsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 8, value);
};


/**
 * @param {!proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.addValidatorCurrentRewards = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 8, opt_value, proto.cosmos.distribution.v1beta1.ValidatorCurrentRewardsRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.clearValidatorCurrentRewardsList = function() {
  return this.setValidatorCurrentRewardsList([]);
};


/**
 * repeated DelegatorStartingInfoRecord delegator_starting_infos = 9;
 * @return {!Array<!proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord>}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.getDelegatorStartingInfosList = function() {
  return /** @type{!Array<!proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord, 9));
};


/**
 * @param {!Array<!proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord>} value
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
*/
proto.cosmos.distribution.v1beta1.GenesisState.prototype.setDelegatorStartingInfosList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 9, value);
};


/**
 * @param {!proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.addDelegatorStartingInfos = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 9, opt_value, proto.cosmos.distribution.v1beta1.DelegatorStartingInfoRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.clearDelegatorStartingInfosList = function() {
  return this.setDelegatorStartingInfosList([]);
};


/**
 * repeated ValidatorSlashEventRecord validator_slash_events = 10;
 * @return {!Array<!proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord>}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.getValidatorSlashEventsList = function() {
  return /** @type{!Array<!proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord, 10));
};


/**
 * @param {!Array<!proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord>} value
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
*/
proto.cosmos.distribution.v1beta1.GenesisState.prototype.setValidatorSlashEventsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 10, value);
};


/**
 * @param {!proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord}
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.addValidatorSlashEvents = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 10, opt_value, proto.cosmos.distribution.v1beta1.ValidatorSlashEventRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.distribution.v1beta1.GenesisState} returns this
 */
proto.cosmos.distribution.v1beta1.GenesisState.prototype.clearValidatorSlashEventsList = function() {
  return this.setValidatorSlashEventsList([]);
};


