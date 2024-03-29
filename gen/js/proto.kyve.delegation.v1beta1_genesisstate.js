// source: kyve/delegation/v1beta1/genesis.proto
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

goog.provide('proto.kyve.delegation.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kyve.delegation.v1beta1.DelegationData');
goog.require('proto.kyve.delegation.v1beta1.DelegationEntry');
goog.require('proto.kyve.delegation.v1beta1.DelegationSlash');
goog.require('proto.kyve.delegation.v1beta1.Delegator');
goog.require('proto.kyve.delegation.v1beta1.Params');
goog.require('proto.kyve.delegation.v1beta1.QueueState');
goog.require('proto.kyve.delegation.v1beta1.RedelegationCooldown');
goog.require('proto.kyve.delegation.v1beta1.UndelegationQueueEntry');

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
proto.kyve.delegation.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kyve.delegation.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.kyve.delegation.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.delegation.v1beta1.GenesisState.displayName = 'proto.kyve.delegation.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kyve.delegation.v1beta1.GenesisState.repeatedFields_ = [2,3,4,5,6,8];



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
proto.kyve.delegation.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.delegation.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.delegation.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.delegation.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.kyve.delegation.v1beta1.Params.toObject(includeInstance, f),
    delegatorListList: jspb.Message.toObjectList(msg.getDelegatorListList(),
    proto.kyve.delegation.v1beta1.Delegator.toObject, includeInstance),
    delegationEntryListList: jspb.Message.toObjectList(msg.getDelegationEntryListList(),
    proto.kyve.delegation.v1beta1.DelegationEntry.toObject, includeInstance),
    delegationDataListList: jspb.Message.toObjectList(msg.getDelegationDataListList(),
    proto.kyve.delegation.v1beta1.DelegationData.toObject, includeInstance),
    delegationSlashListList: jspb.Message.toObjectList(msg.getDelegationSlashListList(),
    proto.kyve.delegation.v1beta1.DelegationSlash.toObject, includeInstance),
    undelegationQueueEntryListList: jspb.Message.toObjectList(msg.getUndelegationQueueEntryListList(),
    proto.kyve.delegation.v1beta1.UndelegationQueueEntry.toObject, includeInstance),
    queueStateUndelegation: (f = msg.getQueueStateUndelegation()) && proto.kyve.delegation.v1beta1.QueueState.toObject(includeInstance, f),
    redelegationCooldownListList: jspb.Message.toObjectList(msg.getRedelegationCooldownListList(),
    proto.kyve.delegation.v1beta1.RedelegationCooldown.toObject, includeInstance)
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
 * @return {!proto.kyve.delegation.v1beta1.GenesisState}
 */
proto.kyve.delegation.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.delegation.v1beta1.GenesisState;
  return proto.kyve.delegation.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.delegation.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.delegation.v1beta1.GenesisState}
 */
proto.kyve.delegation.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kyve.delegation.v1beta1.Params;
      reader.readMessage(value,proto.kyve.delegation.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.kyve.delegation.v1beta1.Delegator;
      reader.readMessage(value,proto.kyve.delegation.v1beta1.Delegator.deserializeBinaryFromReader);
      msg.addDelegatorList(value);
      break;
    case 3:
      var value = new proto.kyve.delegation.v1beta1.DelegationEntry;
      reader.readMessage(value,proto.kyve.delegation.v1beta1.DelegationEntry.deserializeBinaryFromReader);
      msg.addDelegationEntryList(value);
      break;
    case 4:
      var value = new proto.kyve.delegation.v1beta1.DelegationData;
      reader.readMessage(value,proto.kyve.delegation.v1beta1.DelegationData.deserializeBinaryFromReader);
      msg.addDelegationDataList(value);
      break;
    case 5:
      var value = new proto.kyve.delegation.v1beta1.DelegationSlash;
      reader.readMessage(value,proto.kyve.delegation.v1beta1.DelegationSlash.deserializeBinaryFromReader);
      msg.addDelegationSlashList(value);
      break;
    case 6:
      var value = new proto.kyve.delegation.v1beta1.UndelegationQueueEntry;
      reader.readMessage(value,proto.kyve.delegation.v1beta1.UndelegationQueueEntry.deserializeBinaryFromReader);
      msg.addUndelegationQueueEntryList(value);
      break;
    case 7:
      var value = new proto.kyve.delegation.v1beta1.QueueState;
      reader.readMessage(value,proto.kyve.delegation.v1beta1.QueueState.deserializeBinaryFromReader);
      msg.setQueueStateUndelegation(value);
      break;
    case 8:
      var value = new proto.kyve.delegation.v1beta1.RedelegationCooldown;
      reader.readMessage(value,proto.kyve.delegation.v1beta1.RedelegationCooldown.deserializeBinaryFromReader);
      msg.addRedelegationCooldownList(value);
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
proto.kyve.delegation.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.delegation.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.delegation.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.delegation.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.kyve.delegation.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getDelegatorListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.kyve.delegation.v1beta1.Delegator.serializeBinaryToWriter
    );
  }
  f = message.getDelegationEntryListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.kyve.delegation.v1beta1.DelegationEntry.serializeBinaryToWriter
    );
  }
  f = message.getDelegationDataListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.kyve.delegation.v1beta1.DelegationData.serializeBinaryToWriter
    );
  }
  f = message.getDelegationSlashListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.kyve.delegation.v1beta1.DelegationSlash.serializeBinaryToWriter
    );
  }
  f = message.getUndelegationQueueEntryListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.kyve.delegation.v1beta1.UndelegationQueueEntry.serializeBinaryToWriter
    );
  }
  f = message.getQueueStateUndelegation();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.kyve.delegation.v1beta1.QueueState.serializeBinaryToWriter
    );
  }
  f = message.getRedelegationCooldownListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      8,
      f,
      proto.kyve.delegation.v1beta1.RedelegationCooldown.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.kyve.delegation.v1beta1.Params}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.kyve.delegation.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.kyve.delegation.v1beta1.Params, 1));
};


/**
 * @param {?proto.kyve.delegation.v1beta1.Params|undefined} value
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
*/
proto.kyve.delegation.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Delegator delegator_list = 2;
 * @return {!Array<!proto.kyve.delegation.v1beta1.Delegator>}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.getDelegatorListList = function() {
  return /** @type{!Array<!proto.kyve.delegation.v1beta1.Delegator>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.delegation.v1beta1.Delegator, 2));
};


/**
 * @param {!Array<!proto.kyve.delegation.v1beta1.Delegator>} value
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
*/
proto.kyve.delegation.v1beta1.GenesisState.prototype.setDelegatorListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.kyve.delegation.v1beta1.Delegator=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.delegation.v1beta1.Delegator}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.addDelegatorList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.kyve.delegation.v1beta1.Delegator, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.clearDelegatorListList = function() {
  return this.setDelegatorListList([]);
};


/**
 * repeated DelegationEntry delegation_entry_list = 3;
 * @return {!Array<!proto.kyve.delegation.v1beta1.DelegationEntry>}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.getDelegationEntryListList = function() {
  return /** @type{!Array<!proto.kyve.delegation.v1beta1.DelegationEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.delegation.v1beta1.DelegationEntry, 3));
};


/**
 * @param {!Array<!proto.kyve.delegation.v1beta1.DelegationEntry>} value
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
*/
proto.kyve.delegation.v1beta1.GenesisState.prototype.setDelegationEntryListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.kyve.delegation.v1beta1.DelegationEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.delegation.v1beta1.DelegationEntry}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.addDelegationEntryList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.kyve.delegation.v1beta1.DelegationEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.clearDelegationEntryListList = function() {
  return this.setDelegationEntryListList([]);
};


/**
 * repeated DelegationData delegation_data_list = 4;
 * @return {!Array<!proto.kyve.delegation.v1beta1.DelegationData>}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.getDelegationDataListList = function() {
  return /** @type{!Array<!proto.kyve.delegation.v1beta1.DelegationData>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.delegation.v1beta1.DelegationData, 4));
};


/**
 * @param {!Array<!proto.kyve.delegation.v1beta1.DelegationData>} value
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
*/
proto.kyve.delegation.v1beta1.GenesisState.prototype.setDelegationDataListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.kyve.delegation.v1beta1.DelegationData=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.delegation.v1beta1.DelegationData}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.addDelegationDataList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.kyve.delegation.v1beta1.DelegationData, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.clearDelegationDataListList = function() {
  return this.setDelegationDataListList([]);
};


/**
 * repeated DelegationSlash delegation_slash_list = 5;
 * @return {!Array<!proto.kyve.delegation.v1beta1.DelegationSlash>}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.getDelegationSlashListList = function() {
  return /** @type{!Array<!proto.kyve.delegation.v1beta1.DelegationSlash>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.delegation.v1beta1.DelegationSlash, 5));
};


/**
 * @param {!Array<!proto.kyve.delegation.v1beta1.DelegationSlash>} value
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
*/
proto.kyve.delegation.v1beta1.GenesisState.prototype.setDelegationSlashListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.kyve.delegation.v1beta1.DelegationSlash=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.delegation.v1beta1.DelegationSlash}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.addDelegationSlashList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.kyve.delegation.v1beta1.DelegationSlash, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.clearDelegationSlashListList = function() {
  return this.setDelegationSlashListList([]);
};


/**
 * repeated UndelegationQueueEntry undelegation_queue_entry_list = 6;
 * @return {!Array<!proto.kyve.delegation.v1beta1.UndelegationQueueEntry>}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.getUndelegationQueueEntryListList = function() {
  return /** @type{!Array<!proto.kyve.delegation.v1beta1.UndelegationQueueEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.delegation.v1beta1.UndelegationQueueEntry, 6));
};


/**
 * @param {!Array<!proto.kyve.delegation.v1beta1.UndelegationQueueEntry>} value
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
*/
proto.kyve.delegation.v1beta1.GenesisState.prototype.setUndelegationQueueEntryListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.addUndelegationQueueEntryList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.kyve.delegation.v1beta1.UndelegationQueueEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.clearUndelegationQueueEntryListList = function() {
  return this.setUndelegationQueueEntryListList([]);
};


/**
 * optional QueueState queue_state_undelegation = 7;
 * @return {?proto.kyve.delegation.v1beta1.QueueState}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.getQueueStateUndelegation = function() {
  return /** @type{?proto.kyve.delegation.v1beta1.QueueState} */ (
    jspb.Message.getWrapperField(this, proto.kyve.delegation.v1beta1.QueueState, 7));
};


/**
 * @param {?proto.kyve.delegation.v1beta1.QueueState|undefined} value
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
*/
proto.kyve.delegation.v1beta1.GenesisState.prototype.setQueueStateUndelegation = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.clearQueueStateUndelegation = function() {
  return this.setQueueStateUndelegation(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.hasQueueStateUndelegation = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * repeated RedelegationCooldown redelegation_cooldown_list = 8;
 * @return {!Array<!proto.kyve.delegation.v1beta1.RedelegationCooldown>}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.getRedelegationCooldownListList = function() {
  return /** @type{!Array<!proto.kyve.delegation.v1beta1.RedelegationCooldown>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.delegation.v1beta1.RedelegationCooldown, 8));
};


/**
 * @param {!Array<!proto.kyve.delegation.v1beta1.RedelegationCooldown>} value
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
*/
proto.kyve.delegation.v1beta1.GenesisState.prototype.setRedelegationCooldownListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 8, value);
};


/**
 * @param {!proto.kyve.delegation.v1beta1.RedelegationCooldown=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.delegation.v1beta1.RedelegationCooldown}
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.addRedelegationCooldownList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 8, opt_value, proto.kyve.delegation.v1beta1.RedelegationCooldown, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.delegation.v1beta1.GenesisState} returns this
 */
proto.kyve.delegation.v1beta1.GenesisState.prototype.clearRedelegationCooldownListList = function() {
  return this.setRedelegationCooldownListList([]);
};


