// source: kyve/stakers/v1beta1/genesis.proto
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

goog.provide('proto.kyve.stakers.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kyve.stakers.v1beta1.CommissionChangeEntry');
goog.require('proto.kyve.stakers.v1beta1.LeavePoolEntry');
goog.require('proto.kyve.stakers.v1beta1.Params');
goog.require('proto.kyve.stakers.v1beta1.QueueState');
goog.require('proto.kyve.stakers.v1beta1.Staker');
goog.require('proto.kyve.stakers.v1beta1.Valaccount');

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
proto.kyve.stakers.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kyve.stakers.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.kyve.stakers.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.stakers.v1beta1.GenesisState.displayName = 'proto.kyve.stakers.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kyve.stakers.v1beta1.GenesisState.repeatedFields_ = [2,3,4,6];



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
proto.kyve.stakers.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.stakers.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.stakers.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.stakers.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.kyve.stakers.v1beta1.Params.toObject(includeInstance, f),
    stakerListList: jspb.Message.toObjectList(msg.getStakerListList(),
    proto.kyve.stakers.v1beta1.Staker.toObject, includeInstance),
    valaccountListList: jspb.Message.toObjectList(msg.getValaccountListList(),
    proto.kyve.stakers.v1beta1.Valaccount.toObject, includeInstance),
    commissionChangeEntriesList: jspb.Message.toObjectList(msg.getCommissionChangeEntriesList(),
    proto.kyve.stakers.v1beta1.CommissionChangeEntry.toObject, includeInstance),
    queueStateCommission: (f = msg.getQueueStateCommission()) && proto.kyve.stakers.v1beta1.QueueState.toObject(includeInstance, f),
    leavePoolEntriesList: jspb.Message.toObjectList(msg.getLeavePoolEntriesList(),
    proto.kyve.stakers.v1beta1.LeavePoolEntry.toObject, includeInstance),
    queueStateLeave: (f = msg.getQueueStateLeave()) && proto.kyve.stakers.v1beta1.QueueState.toObject(includeInstance, f)
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
 * @return {!proto.kyve.stakers.v1beta1.GenesisState}
 */
proto.kyve.stakers.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.stakers.v1beta1.GenesisState;
  return proto.kyve.stakers.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.stakers.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.stakers.v1beta1.GenesisState}
 */
proto.kyve.stakers.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kyve.stakers.v1beta1.Params;
      reader.readMessage(value,proto.kyve.stakers.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.kyve.stakers.v1beta1.Staker;
      reader.readMessage(value,proto.kyve.stakers.v1beta1.Staker.deserializeBinaryFromReader);
      msg.addStakerList(value);
      break;
    case 3:
      var value = new proto.kyve.stakers.v1beta1.Valaccount;
      reader.readMessage(value,proto.kyve.stakers.v1beta1.Valaccount.deserializeBinaryFromReader);
      msg.addValaccountList(value);
      break;
    case 4:
      var value = new proto.kyve.stakers.v1beta1.CommissionChangeEntry;
      reader.readMessage(value,proto.kyve.stakers.v1beta1.CommissionChangeEntry.deserializeBinaryFromReader);
      msg.addCommissionChangeEntries(value);
      break;
    case 5:
      var value = new proto.kyve.stakers.v1beta1.QueueState;
      reader.readMessage(value,proto.kyve.stakers.v1beta1.QueueState.deserializeBinaryFromReader);
      msg.setQueueStateCommission(value);
      break;
    case 6:
      var value = new proto.kyve.stakers.v1beta1.LeavePoolEntry;
      reader.readMessage(value,proto.kyve.stakers.v1beta1.LeavePoolEntry.deserializeBinaryFromReader);
      msg.addLeavePoolEntries(value);
      break;
    case 7:
      var value = new proto.kyve.stakers.v1beta1.QueueState;
      reader.readMessage(value,proto.kyve.stakers.v1beta1.QueueState.deserializeBinaryFromReader);
      msg.setQueueStateLeave(value);
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
proto.kyve.stakers.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.stakers.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.stakers.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.stakers.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.kyve.stakers.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getStakerListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.kyve.stakers.v1beta1.Staker.serializeBinaryToWriter
    );
  }
  f = message.getValaccountListList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.kyve.stakers.v1beta1.Valaccount.serializeBinaryToWriter
    );
  }
  f = message.getCommissionChangeEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.kyve.stakers.v1beta1.CommissionChangeEntry.serializeBinaryToWriter
    );
  }
  f = message.getQueueStateCommission();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.kyve.stakers.v1beta1.QueueState.serializeBinaryToWriter
    );
  }
  f = message.getLeavePoolEntriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.kyve.stakers.v1beta1.LeavePoolEntry.serializeBinaryToWriter
    );
  }
  f = message.getQueueStateLeave();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.kyve.stakers.v1beta1.QueueState.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.kyve.stakers.v1beta1.Params}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.kyve.stakers.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.kyve.stakers.v1beta1.Params, 1));
};


/**
 * @param {?proto.kyve.stakers.v1beta1.Params|undefined} value
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
*/
proto.kyve.stakers.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Staker staker_list = 2;
 * @return {!Array<!proto.kyve.stakers.v1beta1.Staker>}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.getStakerListList = function() {
  return /** @type{!Array<!proto.kyve.stakers.v1beta1.Staker>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.stakers.v1beta1.Staker, 2));
};


/**
 * @param {!Array<!proto.kyve.stakers.v1beta1.Staker>} value
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
*/
proto.kyve.stakers.v1beta1.GenesisState.prototype.setStakerListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.kyve.stakers.v1beta1.Staker=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.stakers.v1beta1.Staker}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.addStakerList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.kyve.stakers.v1beta1.Staker, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.clearStakerListList = function() {
  return this.setStakerListList([]);
};


/**
 * repeated Valaccount valaccount_list = 3;
 * @return {!Array<!proto.kyve.stakers.v1beta1.Valaccount>}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.getValaccountListList = function() {
  return /** @type{!Array<!proto.kyve.stakers.v1beta1.Valaccount>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.stakers.v1beta1.Valaccount, 3));
};


/**
 * @param {!Array<!proto.kyve.stakers.v1beta1.Valaccount>} value
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
*/
proto.kyve.stakers.v1beta1.GenesisState.prototype.setValaccountListList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.kyve.stakers.v1beta1.Valaccount=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.stakers.v1beta1.Valaccount}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.addValaccountList = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.kyve.stakers.v1beta1.Valaccount, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.clearValaccountListList = function() {
  return this.setValaccountListList([]);
};


/**
 * repeated CommissionChangeEntry commission_change_entries = 4;
 * @return {!Array<!proto.kyve.stakers.v1beta1.CommissionChangeEntry>}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.getCommissionChangeEntriesList = function() {
  return /** @type{!Array<!proto.kyve.stakers.v1beta1.CommissionChangeEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.stakers.v1beta1.CommissionChangeEntry, 4));
};


/**
 * @param {!Array<!proto.kyve.stakers.v1beta1.CommissionChangeEntry>} value
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
*/
proto.kyve.stakers.v1beta1.GenesisState.prototype.setCommissionChangeEntriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.kyve.stakers.v1beta1.CommissionChangeEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.stakers.v1beta1.CommissionChangeEntry}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.addCommissionChangeEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.kyve.stakers.v1beta1.CommissionChangeEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.clearCommissionChangeEntriesList = function() {
  return this.setCommissionChangeEntriesList([]);
};


/**
 * optional QueueState queue_state_commission = 5;
 * @return {?proto.kyve.stakers.v1beta1.QueueState}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.getQueueStateCommission = function() {
  return /** @type{?proto.kyve.stakers.v1beta1.QueueState} */ (
    jspb.Message.getWrapperField(this, proto.kyve.stakers.v1beta1.QueueState, 5));
};


/**
 * @param {?proto.kyve.stakers.v1beta1.QueueState|undefined} value
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
*/
proto.kyve.stakers.v1beta1.GenesisState.prototype.setQueueStateCommission = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.clearQueueStateCommission = function() {
  return this.setQueueStateCommission(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.hasQueueStateCommission = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * repeated LeavePoolEntry leave_pool_entries = 6;
 * @return {!Array<!proto.kyve.stakers.v1beta1.LeavePoolEntry>}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.getLeavePoolEntriesList = function() {
  return /** @type{!Array<!proto.kyve.stakers.v1beta1.LeavePoolEntry>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kyve.stakers.v1beta1.LeavePoolEntry, 6));
};


/**
 * @param {!Array<!proto.kyve.stakers.v1beta1.LeavePoolEntry>} value
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
*/
proto.kyve.stakers.v1beta1.GenesisState.prototype.setLeavePoolEntriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.kyve.stakers.v1beta1.LeavePoolEntry=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kyve.stakers.v1beta1.LeavePoolEntry}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.addLeavePoolEntries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.kyve.stakers.v1beta1.LeavePoolEntry, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.clearLeavePoolEntriesList = function() {
  return this.setLeavePoolEntriesList([]);
};


/**
 * optional QueueState queue_state_leave = 7;
 * @return {?proto.kyve.stakers.v1beta1.QueueState}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.getQueueStateLeave = function() {
  return /** @type{?proto.kyve.stakers.v1beta1.QueueState} */ (
    jspb.Message.getWrapperField(this, proto.kyve.stakers.v1beta1.QueueState, 7));
};


/**
 * @param {?proto.kyve.stakers.v1beta1.QueueState|undefined} value
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
*/
proto.kyve.stakers.v1beta1.GenesisState.prototype.setQueueStateLeave = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.stakers.v1beta1.GenesisState} returns this
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.clearQueueStateLeave = function() {
  return this.setQueueStateLeave(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.stakers.v1beta1.GenesisState.prototype.hasQueueStateLeave = function() {
  return jspb.Message.getField(this, 7) != null;
};


