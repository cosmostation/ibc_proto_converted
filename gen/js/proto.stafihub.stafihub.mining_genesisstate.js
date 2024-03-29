// source: stafihub/mining/genesis.proto
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

goog.provide('proto.stafihub.stafihub.mining.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.mining.Params');
goog.require('proto.stafihub.stafihub.mining.RewardToken');
goog.require('proto.stafihub.stafihub.mining.StakeItem');
goog.require('proto.stafihub.stafihub.mining.StakeItemLimit');
goog.require('proto.stafihub.stafihub.mining.StakePool');
goog.require('proto.stafihub.stafihub.mining.UserStakeRecord');

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
proto.stafihub.stafihub.mining.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stafihub.stafihub.mining.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.stafihub.stafihub.mining.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.mining.GenesisState.displayName = 'proto.stafihub.stafihub.mining.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stafihub.stafihub.mining.GenesisState.repeatedFields_ = [2,3,4,5,6,10];



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
proto.stafihub.stafihub.mining.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.mining.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.mining.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.mining.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.stafihub.stafihub.mining.Params.toObject(includeInstance, f),
    stakepoollistList: jspb.Message.toObjectList(msg.getStakepoollistList(),
    proto.stafihub.stafihub.mining.StakePool.toObject, includeInstance),
    stakeitemlistList: jspb.Message.toObjectList(msg.getStakeitemlistList(),
    proto.stafihub.stafihub.mining.StakeItem.toObject, includeInstance),
    userstakerecordlistList: jspb.Message.toObjectList(msg.getUserstakerecordlistList(),
    proto.stafihub.stafihub.mining.UserStakeRecord.toObject, includeInstance),
    miningproviderlistList: (f = jspb.Message.getRepeatedField(msg, 5)) == null ? undefined : f,
    rewardtokenlistList: jspb.Message.toObjectList(msg.getRewardtokenlistList(),
    proto.stafihub.stafihub.mining.RewardToken.toObject, includeInstance),
    maxrewardpoolnumber: jspb.Message.getFieldWithDefault(msg, 7, 0),
    miningproviderswitch: jspb.Message.getBooleanFieldWithDefault(msg, 8, false),
    maxstakeitemnumber: jspb.Message.getFieldWithDefault(msg, 9, 0),
    staketokenlistList: (f = jspb.Message.getRepeatedField(msg, 10)) == null ? undefined : f,
    stakeitemlimit: (f = msg.getStakeitemlimit()) && proto.stafihub.stafihub.mining.StakeItemLimit.toObject(includeInstance, f)
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
 * @return {!proto.stafihub.stafihub.mining.GenesisState}
 */
proto.stafihub.stafihub.mining.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.mining.GenesisState;
  return proto.stafihub.stafihub.mining.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.mining.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.mining.GenesisState}
 */
proto.stafihub.stafihub.mining.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stafihub.stafihub.mining.Params;
      reader.readMessage(value,proto.stafihub.stafihub.mining.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.stafihub.stafihub.mining.StakePool;
      reader.readMessage(value,proto.stafihub.stafihub.mining.StakePool.deserializeBinaryFromReader);
      msg.addStakepoollist(value);
      break;
    case 3:
      var value = new proto.stafihub.stafihub.mining.StakeItem;
      reader.readMessage(value,proto.stafihub.stafihub.mining.StakeItem.deserializeBinaryFromReader);
      msg.addStakeitemlist(value);
      break;
    case 4:
      var value = new proto.stafihub.stafihub.mining.UserStakeRecord;
      reader.readMessage(value,proto.stafihub.stafihub.mining.UserStakeRecord.deserializeBinaryFromReader);
      msg.addUserstakerecordlist(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.addMiningproviderlist(value);
      break;
    case 6:
      var value = new proto.stafihub.stafihub.mining.RewardToken;
      reader.readMessage(value,proto.stafihub.stafihub.mining.RewardToken.deserializeBinaryFromReader);
      msg.addRewardtokenlist(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setMaxrewardpoolnumber(value);
      break;
    case 8:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setMiningproviderswitch(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setMaxstakeitemnumber(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.addStaketokenlist(value);
      break;
    case 11:
      var value = new proto.stafihub.stafihub.mining.StakeItemLimit;
      reader.readMessage(value,proto.stafihub.stafihub.mining.StakeItemLimit.deserializeBinaryFromReader);
      msg.setStakeitemlimit(value);
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
proto.stafihub.stafihub.mining.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.mining.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.mining.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.mining.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.stafihub.stafihub.mining.Params.serializeBinaryToWriter
    );
  }
  f = message.getStakepoollistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.stafihub.stafihub.mining.StakePool.serializeBinaryToWriter
    );
  }
  f = message.getStakeitemlistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.stafihub.stafihub.mining.StakeItem.serializeBinaryToWriter
    );
  }
  f = message.getUserstakerecordlistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.stafihub.stafihub.mining.UserStakeRecord.serializeBinaryToWriter
    );
  }
  f = message.getMiningproviderlistList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      5,
      f
    );
  }
  f = message.getRewardtokenlistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.stafihub.stafihub.mining.RewardToken.serializeBinaryToWriter
    );
  }
  f = message.getMaxrewardpoolnumber();
  if (f !== 0) {
    writer.writeUint32(
      7,
      f
    );
  }
  f = message.getMiningproviderswitch();
  if (f) {
    writer.writeBool(
      8,
      f
    );
  }
  f = message.getMaxstakeitemnumber();
  if (f !== 0) {
    writer.writeUint32(
      9,
      f
    );
  }
  f = message.getStaketokenlistList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      10,
      f
    );
  }
  f = message.getStakeitemlimit();
  if (f != null) {
    writer.writeMessage(
      11,
      f,
      proto.stafihub.stafihub.mining.StakeItemLimit.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.stafihub.stafihub.mining.Params}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.stafihub.stafihub.mining.Params} */ (
    jspb.Message.getWrapperField(this, proto.stafihub.stafihub.mining.Params, 1));
};


/**
 * @param {?proto.stafihub.stafihub.mining.Params|undefined} value
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
*/
proto.stafihub.stafihub.mining.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated StakePool stakePoolList = 2;
 * @return {!Array<!proto.stafihub.stafihub.mining.StakePool>}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.getStakepoollistList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.mining.StakePool>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.mining.StakePool, 2));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.mining.StakePool>} value
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
*/
proto.stafihub.stafihub.mining.GenesisState.prototype.setStakepoollistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.stafihub.stafihub.mining.StakePool=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.mining.StakePool}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.addStakepoollist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.stafihub.stafihub.mining.StakePool, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.clearStakepoollistList = function() {
  return this.setStakepoollistList([]);
};


/**
 * repeated StakeItem stakeItemList = 3;
 * @return {!Array<!proto.stafihub.stafihub.mining.StakeItem>}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.getStakeitemlistList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.mining.StakeItem>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.mining.StakeItem, 3));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.mining.StakeItem>} value
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
*/
proto.stafihub.stafihub.mining.GenesisState.prototype.setStakeitemlistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.stafihub.stafihub.mining.StakeItem=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.mining.StakeItem}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.addStakeitemlist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.stafihub.stafihub.mining.StakeItem, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.clearStakeitemlistList = function() {
  return this.setStakeitemlistList([]);
};


/**
 * repeated UserStakeRecord userStakeRecordList = 4;
 * @return {!Array<!proto.stafihub.stafihub.mining.UserStakeRecord>}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.getUserstakerecordlistList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.mining.UserStakeRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.mining.UserStakeRecord, 4));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.mining.UserStakeRecord>} value
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
*/
proto.stafihub.stafihub.mining.GenesisState.prototype.setUserstakerecordlistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.stafihub.stafihub.mining.UserStakeRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.mining.UserStakeRecord}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.addUserstakerecordlist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.stafihub.stafihub.mining.UserStakeRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.clearUserstakerecordlistList = function() {
  return this.setUserstakerecordlistList([]);
};


/**
 * repeated string miningProviderList = 5;
 * @return {!Array<string>}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.getMiningproviderlistList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 5));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.setMiningproviderlistList = function(value) {
  return jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.addMiningproviderlist = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.clearMiningproviderlistList = function() {
  return this.setMiningproviderlistList([]);
};


/**
 * repeated RewardToken rewardTokenList = 6;
 * @return {!Array<!proto.stafihub.stafihub.mining.RewardToken>}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.getRewardtokenlistList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.mining.RewardToken>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.mining.RewardToken, 6));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.mining.RewardToken>} value
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
*/
proto.stafihub.stafihub.mining.GenesisState.prototype.setRewardtokenlistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.stafihub.stafihub.mining.RewardToken=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.mining.RewardToken}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.addRewardtokenlist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.stafihub.stafihub.mining.RewardToken, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.clearRewardtokenlistList = function() {
  return this.setRewardtokenlistList([]);
};


/**
 * optional uint32 maxRewardPoolNumber = 7;
 * @return {number}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.getMaxrewardpoolnumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.setMaxrewardpoolnumber = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional bool miningProviderSwitch = 8;
 * @return {boolean}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.getMiningproviderswitch = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 8, false));
};


/**
 * @param {boolean} value
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.setMiningproviderswitch = function(value) {
  return jspb.Message.setProto3BooleanField(this, 8, value);
};


/**
 * optional uint32 maxStakeItemNumber = 9;
 * @return {number}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.getMaxstakeitemnumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.setMaxstakeitemnumber = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * repeated string stakeTokenList = 10;
 * @return {!Array<string>}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.getStaketokenlistList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 10));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.setStaketokenlistList = function(value) {
  return jspb.Message.setField(this, 10, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.addStaketokenlist = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 10, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.clearStaketokenlistList = function() {
  return this.setStaketokenlistList([]);
};


/**
 * optional StakeItemLimit stakeItemLimit = 11;
 * @return {?proto.stafihub.stafihub.mining.StakeItemLimit}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.getStakeitemlimit = function() {
  return /** @type{?proto.stafihub.stafihub.mining.StakeItemLimit} */ (
    jspb.Message.getWrapperField(this, proto.stafihub.stafihub.mining.StakeItemLimit, 11));
};


/**
 * @param {?proto.stafihub.stafihub.mining.StakeItemLimit|undefined} value
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
*/
proto.stafihub.stafihub.mining.GenesisState.prototype.setStakeitemlimit = function(value) {
  return jspb.Message.setWrapperField(this, 11, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stafihub.stafihub.mining.GenesisState} returns this
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.clearStakeitemlimit = function() {
  return this.setStakeitemlimit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stafihub.stafihub.mining.GenesisState.prototype.hasStakeitemlimit = function() {
  return jspb.Message.getField(this, 11) != null;
};


