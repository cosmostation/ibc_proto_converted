// source: stride/stakeibc/host_zone.proto
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

goog.provide('proto.stride.stakeibc.HostZone');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stride.stakeibc.ICAAccount');
goog.require('proto.stride.stakeibc.Validator');

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
proto.stride.stakeibc.HostZone = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stride.stakeibc.HostZone.repeatedFields_, null);
};
goog.inherits(proto.stride.stakeibc.HostZone, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.stakeibc.HostZone.displayName = 'proto.stride.stakeibc.HostZone';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stride.stakeibc.HostZone.repeatedFields_ = [3,4];



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
proto.stride.stakeibc.HostZone.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.stakeibc.HostZone.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.stakeibc.HostZone} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.stakeibc.HostZone.toObject = function(includeInstance, msg) {
  var f, obj = {
    chainId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    connectionId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    bech32prefix: jspb.Message.getFieldWithDefault(msg, 17, ""),
    transferChannelId: jspb.Message.getFieldWithDefault(msg, 12, ""),
    validatorsList: jspb.Message.toObjectList(msg.getValidatorsList(),
    proto.stride.stakeibc.Validator.toObject, includeInstance),
    blacklistedValidatorsList: jspb.Message.toObjectList(msg.getBlacklistedValidatorsList(),
    proto.stride.stakeibc.Validator.toObject, includeInstance),
    withdrawalAccount: (f = msg.getWithdrawalAccount()) && proto.stride.stakeibc.ICAAccount.toObject(includeInstance, f),
    feeAccount: (f = msg.getFeeAccount()) && proto.stride.stakeibc.ICAAccount.toObject(includeInstance, f),
    delegationAccount: (f = msg.getDelegationAccount()) && proto.stride.stakeibc.ICAAccount.toObject(includeInstance, f),
    redemptionAccount: (f = msg.getRedemptionAccount()) && proto.stride.stakeibc.ICAAccount.toObject(includeInstance, f),
    ibcDenom: jspb.Message.getFieldWithDefault(msg, 8, ""),
    hostDenom: jspb.Message.getFieldWithDefault(msg, 9, ""),
    lastRedemptionRate: jspb.Message.getFieldWithDefault(msg, 10, ""),
    redemptionRate: jspb.Message.getFieldWithDefault(msg, 11, ""),
    unbondingFrequency: jspb.Message.getFieldWithDefault(msg, 14, 0),
    stakedBal: jspb.Message.getFieldWithDefault(msg, 13, ""),
    address: jspb.Message.getFieldWithDefault(msg, 18, ""),
    halted: jspb.Message.getBooleanFieldWithDefault(msg, 19, false),
    minRedemptionRate: jspb.Message.getFieldWithDefault(msg, 20, ""),
    maxRedemptionRate: jspb.Message.getFieldWithDefault(msg, 21, "")
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
 * @return {!proto.stride.stakeibc.HostZone}
 */
proto.stride.stakeibc.HostZone.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.stakeibc.HostZone;
  return proto.stride.stakeibc.HostZone.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.stakeibc.HostZone} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.stakeibc.HostZone}
 */
proto.stride.stakeibc.HostZone.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setChainId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setConnectionId(value);
      break;
    case 17:
      var value = /** @type {string} */ (reader.readString());
      msg.setBech32prefix(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransferChannelId(value);
      break;
    case 3:
      var value = new proto.stride.stakeibc.Validator;
      reader.readMessage(value,proto.stride.stakeibc.Validator.deserializeBinaryFromReader);
      msg.addValidators(value);
      break;
    case 4:
      var value = new proto.stride.stakeibc.Validator;
      reader.readMessage(value,proto.stride.stakeibc.Validator.deserializeBinaryFromReader);
      msg.addBlacklistedValidators(value);
      break;
    case 5:
      var value = new proto.stride.stakeibc.ICAAccount;
      reader.readMessage(value,proto.stride.stakeibc.ICAAccount.deserializeBinaryFromReader);
      msg.setWithdrawalAccount(value);
      break;
    case 6:
      var value = new proto.stride.stakeibc.ICAAccount;
      reader.readMessage(value,proto.stride.stakeibc.ICAAccount.deserializeBinaryFromReader);
      msg.setFeeAccount(value);
      break;
    case 7:
      var value = new proto.stride.stakeibc.ICAAccount;
      reader.readMessage(value,proto.stride.stakeibc.ICAAccount.deserializeBinaryFromReader);
      msg.setDelegationAccount(value);
      break;
    case 16:
      var value = new proto.stride.stakeibc.ICAAccount;
      reader.readMessage(value,proto.stride.stakeibc.ICAAccount.deserializeBinaryFromReader);
      msg.setRedemptionAccount(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setIbcDenom(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setHostDenom(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setLastRedemptionRate(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.setRedemptionRate(value);
      break;
    case 14:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setUnbondingFrequency(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.setStakedBal(value);
      break;
    case 18:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 19:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setHalted(value);
      break;
    case 20:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinRedemptionRate(value);
      break;
    case 21:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaxRedemptionRate(value);
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
proto.stride.stakeibc.HostZone.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.stakeibc.HostZone.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.stakeibc.HostZone} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.stakeibc.HostZone.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChainId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getConnectionId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getBech32prefix();
  if (f.length > 0) {
    writer.writeString(
      17,
      f
    );
  }
  f = message.getTransferChannelId();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
  f = message.getValidatorsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.stride.stakeibc.Validator.serializeBinaryToWriter
    );
  }
  f = message.getBlacklistedValidatorsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.stride.stakeibc.Validator.serializeBinaryToWriter
    );
  }
  f = message.getWithdrawalAccount();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.stride.stakeibc.ICAAccount.serializeBinaryToWriter
    );
  }
  f = message.getFeeAccount();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.stride.stakeibc.ICAAccount.serializeBinaryToWriter
    );
  }
  f = message.getDelegationAccount();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.stride.stakeibc.ICAAccount.serializeBinaryToWriter
    );
  }
  f = message.getRedemptionAccount();
  if (f != null) {
    writer.writeMessage(
      16,
      f,
      proto.stride.stakeibc.ICAAccount.serializeBinaryToWriter
    );
  }
  f = message.getIbcDenom();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getHostDenom();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getLastRedemptionRate();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getRedemptionRate();
  if (f.length > 0) {
    writer.writeString(
      11,
      f
    );
  }
  f = message.getUnbondingFrequency();
  if (f !== 0) {
    writer.writeUint64(
      14,
      f
    );
  }
  f = message.getStakedBal();
  if (f.length > 0) {
    writer.writeString(
      13,
      f
    );
  }
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      18,
      f
    );
  }
  f = message.getHalted();
  if (f) {
    writer.writeBool(
      19,
      f
    );
  }
  f = message.getMinRedemptionRate();
  if (f.length > 0) {
    writer.writeString(
      20,
      f
    );
  }
  f = message.getMaxRedemptionRate();
  if (f.length > 0) {
    writer.writeString(
      21,
      f
    );
  }
};


/**
 * optional string chain_id = 1;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getChainId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setChainId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string connection_id = 2;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getConnectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setConnectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string bech32prefix = 17;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getBech32prefix = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 17, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setBech32prefix = function(value) {
  return jspb.Message.setProto3StringField(this, 17, value);
};


/**
 * optional string transfer_channel_id = 12;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getTransferChannelId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setTransferChannelId = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


/**
 * repeated Validator validators = 3;
 * @return {!Array<!proto.stride.stakeibc.Validator>}
 */
proto.stride.stakeibc.HostZone.prototype.getValidatorsList = function() {
  return /** @type{!Array<!proto.stride.stakeibc.Validator>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stride.stakeibc.Validator, 3));
};


/**
 * @param {!Array<!proto.stride.stakeibc.Validator>} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
*/
proto.stride.stakeibc.HostZone.prototype.setValidatorsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.stride.stakeibc.Validator=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stride.stakeibc.Validator}
 */
proto.stride.stakeibc.HostZone.prototype.addValidators = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.stride.stakeibc.Validator, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.clearValidatorsList = function() {
  return this.setValidatorsList([]);
};


/**
 * repeated Validator blacklisted_validators = 4;
 * @return {!Array<!proto.stride.stakeibc.Validator>}
 */
proto.stride.stakeibc.HostZone.prototype.getBlacklistedValidatorsList = function() {
  return /** @type{!Array<!proto.stride.stakeibc.Validator>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stride.stakeibc.Validator, 4));
};


/**
 * @param {!Array<!proto.stride.stakeibc.Validator>} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
*/
proto.stride.stakeibc.HostZone.prototype.setBlacklistedValidatorsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.stride.stakeibc.Validator=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stride.stakeibc.Validator}
 */
proto.stride.stakeibc.HostZone.prototype.addBlacklistedValidators = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.stride.stakeibc.Validator, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.clearBlacklistedValidatorsList = function() {
  return this.setBlacklistedValidatorsList([]);
};


/**
 * optional ICAAccount withdrawal_account = 5;
 * @return {?proto.stride.stakeibc.ICAAccount}
 */
proto.stride.stakeibc.HostZone.prototype.getWithdrawalAccount = function() {
  return /** @type{?proto.stride.stakeibc.ICAAccount} */ (
    jspb.Message.getWrapperField(this, proto.stride.stakeibc.ICAAccount, 5));
};


/**
 * @param {?proto.stride.stakeibc.ICAAccount|undefined} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
*/
proto.stride.stakeibc.HostZone.prototype.setWithdrawalAccount = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.clearWithdrawalAccount = function() {
  return this.setWithdrawalAccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stride.stakeibc.HostZone.prototype.hasWithdrawalAccount = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional ICAAccount fee_account = 6;
 * @return {?proto.stride.stakeibc.ICAAccount}
 */
proto.stride.stakeibc.HostZone.prototype.getFeeAccount = function() {
  return /** @type{?proto.stride.stakeibc.ICAAccount} */ (
    jspb.Message.getWrapperField(this, proto.stride.stakeibc.ICAAccount, 6));
};


/**
 * @param {?proto.stride.stakeibc.ICAAccount|undefined} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
*/
proto.stride.stakeibc.HostZone.prototype.setFeeAccount = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.clearFeeAccount = function() {
  return this.setFeeAccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stride.stakeibc.HostZone.prototype.hasFeeAccount = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional ICAAccount delegation_account = 7;
 * @return {?proto.stride.stakeibc.ICAAccount}
 */
proto.stride.stakeibc.HostZone.prototype.getDelegationAccount = function() {
  return /** @type{?proto.stride.stakeibc.ICAAccount} */ (
    jspb.Message.getWrapperField(this, proto.stride.stakeibc.ICAAccount, 7));
};


/**
 * @param {?proto.stride.stakeibc.ICAAccount|undefined} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
*/
proto.stride.stakeibc.HostZone.prototype.setDelegationAccount = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.clearDelegationAccount = function() {
  return this.setDelegationAccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stride.stakeibc.HostZone.prototype.hasDelegationAccount = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional ICAAccount redemption_account = 16;
 * @return {?proto.stride.stakeibc.ICAAccount}
 */
proto.stride.stakeibc.HostZone.prototype.getRedemptionAccount = function() {
  return /** @type{?proto.stride.stakeibc.ICAAccount} */ (
    jspb.Message.getWrapperField(this, proto.stride.stakeibc.ICAAccount, 16));
};


/**
 * @param {?proto.stride.stakeibc.ICAAccount|undefined} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
*/
proto.stride.stakeibc.HostZone.prototype.setRedemptionAccount = function(value) {
  return jspb.Message.setWrapperField(this, 16, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.clearRedemptionAccount = function() {
  return this.setRedemptionAccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stride.stakeibc.HostZone.prototype.hasRedemptionAccount = function() {
  return jspb.Message.getField(this, 16) != null;
};


/**
 * optional string ibc_denom = 8;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getIbcDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setIbcDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string host_denom = 9;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getHostDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setHostDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional string last_redemption_rate = 10;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getLastRedemptionRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setLastRedemptionRate = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * optional string redemption_rate = 11;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getRedemptionRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setRedemptionRate = function(value) {
  return jspb.Message.setProto3StringField(this, 11, value);
};


/**
 * optional uint64 unbonding_frequency = 14;
 * @return {number}
 */
proto.stride.stakeibc.HostZone.prototype.getUnbondingFrequency = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 14, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setUnbondingFrequency = function(value) {
  return jspb.Message.setProto3IntField(this, 14, value);
};


/**
 * optional string staked_bal = 13;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getStakedBal = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 13, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setStakedBal = function(value) {
  return jspb.Message.setProto3StringField(this, 13, value);
};


/**
 * optional string address = 18;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 18, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 18, value);
};


/**
 * optional bool halted = 19;
 * @return {boolean}
 */
proto.stride.stakeibc.HostZone.prototype.getHalted = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 19, false));
};


/**
 * @param {boolean} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setHalted = function(value) {
  return jspb.Message.setProto3BooleanField(this, 19, value);
};


/**
 * optional string min_redemption_rate = 20;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getMinRedemptionRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 20, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setMinRedemptionRate = function(value) {
  return jspb.Message.setProto3StringField(this, 20, value);
};


/**
 * optional string max_redemption_rate = 21;
 * @return {string}
 */
proto.stride.stakeibc.HostZone.prototype.getMaxRedemptionRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 21, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.HostZone} returns this
 */
proto.stride.stakeibc.HostZone.prototype.setMaxRedemptionRate = function(value) {
  return jspb.Message.setProto3StringField(this, 21, value);
};

