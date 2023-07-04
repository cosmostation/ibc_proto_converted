// source: pstake/lscosmos/v1beta1/genesis.proto
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

goog.provide('proto.pstake.lscosmos.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.pstake.lscosmos.v1beta1.AllowListedValidators');
goog.require('proto.pstake.lscosmos.v1beta1.DelegationState');
goog.require('proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry');
goog.require('proto.pstake.lscosmos.v1beta1.HostAccounts');
goog.require('proto.pstake.lscosmos.v1beta1.HostChainParams');
goog.require('proto.pstake.lscosmos.v1beta1.HostChainRewardAddress');
goog.require('proto.pstake.lscosmos.v1beta1.IBCAmountTransientStore');
goog.require('proto.pstake.lscosmos.v1beta1.Params');
goog.require('proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue');

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
proto.pstake.lscosmos.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.pstake.lscosmos.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.pstake.lscosmos.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.pstake.lscosmos.v1beta1.GenesisState.displayName = 'proto.pstake.lscosmos.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.pstake.lscosmos.v1beta1.GenesisState.repeatedFields_ = [8,9];



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
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.pstake.lscosmos.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.pstake.lscosmos.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.lscosmos.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.pstake.lscosmos.v1beta1.Params.toObject(includeInstance, f),
    moduleEnabled: jspb.Message.getBooleanFieldWithDefault(msg, 2, false),
    hostChainParams: (f = msg.getHostChainParams()) && proto.pstake.lscosmos.v1beta1.HostChainParams.toObject(includeInstance, f),
    allowListedValidators: (f = msg.getAllowListedValidators()) && proto.pstake.lscosmos.v1beta1.AllowListedValidators.toObject(includeInstance, f),
    delegationState: (f = msg.getDelegationState()) && proto.pstake.lscosmos.v1beta1.DelegationState.toObject(includeInstance, f),
    hostChainRewardAddress: (f = msg.getHostChainRewardAddress()) && proto.pstake.lscosmos.v1beta1.HostChainRewardAddress.toObject(includeInstance, f),
    iBCAmountTransientStore: (f = msg.getIBCAmountTransientStore()) && proto.pstake.lscosmos.v1beta1.IBCAmountTransientStore.toObject(includeInstance, f),
    unbondingEpochCValuesList: jspb.Message.toObjectList(msg.getUnbondingEpochCValuesList(),
    proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.toObject, includeInstance),
    delegatorUnbondingEpochEntriesList: jspb.Message.toObjectList(msg.getDelegatorUnbondingEpochEntriesList(),
    proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry.toObject, includeInstance),
    hostAccounts: (f = msg.getHostAccounts()) && proto.pstake.lscosmos.v1beta1.HostAccounts.toObject(includeInstance, f)
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
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.pstake.lscosmos.v1beta1.GenesisState;
  return proto.pstake.lscosmos.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.pstake.lscosmos.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.pstake.lscosmos.v1beta1.Params;
      reader.readMessage(value,proto.pstake.lscosmos.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setModuleEnabled(value);
      break;
    case 3:
      var value = new proto.pstake.lscosmos.v1beta1.HostChainParams;
      reader.readMessage(value,proto.pstake.lscosmos.v1beta1.HostChainParams.deserializeBinaryFromReader);
      msg.setHostChainParams(value);
      break;
    case 4:
      var value = new proto.pstake.lscosmos.v1beta1.AllowListedValidators;
      reader.readMessage(value,proto.pstake.lscosmos.v1beta1.AllowListedValidators.deserializeBinaryFromReader);
      msg.setAllowListedValidators(value);
      break;
    case 5:
      var value = new proto.pstake.lscosmos.v1beta1.DelegationState;
      reader.readMessage(value,proto.pstake.lscosmos.v1beta1.DelegationState.deserializeBinaryFromReader);
      msg.setDelegationState(value);
      break;
    case 6:
      var value = new proto.pstake.lscosmos.v1beta1.HostChainRewardAddress;
      reader.readMessage(value,proto.pstake.lscosmos.v1beta1.HostChainRewardAddress.deserializeBinaryFromReader);
      msg.setHostChainRewardAddress(value);
      break;
    case 7:
      var value = new proto.pstake.lscosmos.v1beta1.IBCAmountTransientStore;
      reader.readMessage(value,proto.pstake.lscosmos.v1beta1.IBCAmountTransientStore.deserializeBinaryFromReader);
      msg.setIBCAmountTransientStore(value);
      break;
    case 8:
      var value = new proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue;
      reader.readMessage(value,proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.deserializeBinaryFromReader);
      msg.addUnbondingEpochCValues(value);
      break;
    case 9:
      var value = new proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry;
      reader.readMessage(value,proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry.deserializeBinaryFromReader);
      msg.addDelegatorUnbondingEpochEntries(value);
      break;
    case 10:
      var value = new proto.pstake.lscosmos.v1beta1.HostAccounts;
      reader.readMessage(value,proto.pstake.lscosmos.v1beta1.HostAccounts.deserializeBinaryFromReader);
      msg.setHostAccounts(value);
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
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.pstake.lscosmos.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.pstake.lscosmos.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.lscosmos.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.pstake.lscosmos.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getModuleEnabled();
  if (f) {
    writer.writeBool(
      2,
      f
    );
  }
  f = message.getHostChainParams();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.pstake.lscosmos.v1beta1.HostChainParams.serializeBinaryToWriter
    );
  }
  f = message.getAllowListedValidators();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.pstake.lscosmos.v1beta1.AllowListedValidators.serializeBinaryToWriter
    );
  }
  f = message.getDelegationState();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.pstake.lscosmos.v1beta1.DelegationState.serializeBinaryToWriter
    );
  }
  f = message.getHostChainRewardAddress();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.pstake.lscosmos.v1beta1.HostChainRewardAddress.serializeBinaryToWriter
    );
  }
  f = message.getIBCAmountTransientStore();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.pstake.lscosmos.v1beta1.IBCAmountTransientStore.serializeBinaryToWriter
    );
  }
  f = message.getUnbondingEpochCValuesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      8,
      f,
      proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.serializeBinaryToWriter
    );
  }
  f = message.getDelegatorUnbondingEpochEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      9,
      f,
      proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry.serializeBinaryToWriter
    );
  }
  f = message.getHostAccounts();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.pstake.lscosmos.v1beta1.HostAccounts.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.pstake.lscosmos.v1beta1.Params}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.pstake.lscosmos.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.pstake.lscosmos.v1beta1.Params, 1));
};


/**
 * @param {?proto.pstake.lscosmos.v1beta1.Params|undefined} value
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
*/
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional bool module_enabled = 2;
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.getModuleEnabled = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 2, false));
};


/**
 * @param {boolean} value
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.setModuleEnabled = function(value) {
  return jspb.Message.setProto3BooleanField(this, 2, value);
};


/**
 * optional HostChainParams host_chain_params = 3;
 * @return {?proto.pstake.lscosmos.v1beta1.HostChainParams}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.getHostChainParams = function() {
  return /** @type{?proto.pstake.lscosmos.v1beta1.HostChainParams} */ (
    jspb.Message.getWrapperField(this, proto.pstake.lscosmos.v1beta1.HostChainParams, 3));
};


/**
 * @param {?proto.pstake.lscosmos.v1beta1.HostChainParams|undefined} value
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
*/
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.setHostChainParams = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.clearHostChainParams = function() {
  return this.setHostChainParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.hasHostChainParams = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional AllowListedValidators allow_listed_validators = 4;
 * @return {?proto.pstake.lscosmos.v1beta1.AllowListedValidators}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.getAllowListedValidators = function() {
  return /** @type{?proto.pstake.lscosmos.v1beta1.AllowListedValidators} */ (
    jspb.Message.getWrapperField(this, proto.pstake.lscosmos.v1beta1.AllowListedValidators, 4));
};


/**
 * @param {?proto.pstake.lscosmos.v1beta1.AllowListedValidators|undefined} value
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
*/
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.setAllowListedValidators = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.clearAllowListedValidators = function() {
  return this.setAllowListedValidators(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.hasAllowListedValidators = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional DelegationState delegation_state = 5;
 * @return {?proto.pstake.lscosmos.v1beta1.DelegationState}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.getDelegationState = function() {
  return /** @type{?proto.pstake.lscosmos.v1beta1.DelegationState} */ (
    jspb.Message.getWrapperField(this, proto.pstake.lscosmos.v1beta1.DelegationState, 5));
};


/**
 * @param {?proto.pstake.lscosmos.v1beta1.DelegationState|undefined} value
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
*/
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.setDelegationState = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.clearDelegationState = function() {
  return this.setDelegationState(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.hasDelegationState = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional HostChainRewardAddress host_chain_reward_address = 6;
 * @return {?proto.pstake.lscosmos.v1beta1.HostChainRewardAddress}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.getHostChainRewardAddress = function() {
  return /** @type{?proto.pstake.lscosmos.v1beta1.HostChainRewardAddress} */ (
    jspb.Message.getWrapperField(this, proto.pstake.lscosmos.v1beta1.HostChainRewardAddress, 6));
};


/**
 * @param {?proto.pstake.lscosmos.v1beta1.HostChainRewardAddress|undefined} value
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
*/
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.setHostChainRewardAddress = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.clearHostChainRewardAddress = function() {
  return this.setHostChainRewardAddress(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.hasHostChainRewardAddress = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional IBCAmountTransientStore i_b_c_amount_transient_store = 7;
 * @return {?proto.pstake.lscosmos.v1beta1.IBCAmountTransientStore}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.getIBCAmountTransientStore = function() {
  return /** @type{?proto.pstake.lscosmos.v1beta1.IBCAmountTransientStore} */ (
    jspb.Message.getWrapperField(this, proto.pstake.lscosmos.v1beta1.IBCAmountTransientStore, 7));
};


/**
 * @param {?proto.pstake.lscosmos.v1beta1.IBCAmountTransientStore|undefined} value
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
*/
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.setIBCAmountTransientStore = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.clearIBCAmountTransientStore = function() {
  return this.setIBCAmountTransientStore(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.hasIBCAmountTransientStore = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * repeated UnbondingEpochCValue unbonding_epoch_c_values = 8;
 * @return {!Array<!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue>}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.getUnbondingEpochCValuesList = function() {
  return /** @type{!Array<!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue, 8));
};


/**
 * @param {!Array<!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue>} value
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
*/
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.setUnbondingEpochCValuesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 8, value);
};


/**
 * @param {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue=} opt_value
 * @param {number=} opt_index
 * @return {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.addUnbondingEpochCValues = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 8, opt_value, proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.clearUnbondingEpochCValuesList = function() {
  return this.setUnbondingEpochCValuesList([]);
};


/**
 * repeated DelegatorUnbondingEpochEntry delegator_unbonding_epoch_entries = 9;
 * @return {!Array<!proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry>}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.getDelegatorUnbondingEpochEntriesList = function() {
  return /** @type{!Array<!proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry, 9));
};


/**
 * @param {!Array<!proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry>} value
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
*/
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.setDelegatorUnbondingEpochEntriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 9, value);
};


/**
 * @param {!proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.addDelegatorUnbondingEpochEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 9, opt_value, proto.pstake.lscosmos.v1beta1.DelegatorUnbondingEpochEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.clearDelegatorUnbondingEpochEntriesList = function() {
  return this.setDelegatorUnbondingEpochEntriesList([]);
};


/**
 * optional HostAccounts host_accounts = 10;
 * @return {?proto.pstake.lscosmos.v1beta1.HostAccounts}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.getHostAccounts = function() {
  return /** @type{?proto.pstake.lscosmos.v1beta1.HostAccounts} */ (
    jspb.Message.getWrapperField(this, proto.pstake.lscosmos.v1beta1.HostAccounts, 10));
};


/**
 * @param {?proto.pstake.lscosmos.v1beta1.HostAccounts|undefined} value
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
*/
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.setHostAccounts = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.lscosmos.v1beta1.GenesisState} returns this
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.clearHostAccounts = function() {
  return this.setHostAccounts(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.GenesisState.prototype.hasHostAccounts = function() {
  return jspb.Message.getField(this, 10) != null;
};

