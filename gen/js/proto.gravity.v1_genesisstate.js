// source: gravity/v1/genesis.proto
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

goog.provide('proto.gravity.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.gravity.v1.Attestation');
goog.require('proto.gravity.v1.ERC20ToDenom');
goog.require('proto.gravity.v1.GravityNonces');
goog.require('proto.gravity.v1.MsgConfirmBatch');
goog.require('proto.gravity.v1.MsgConfirmLogicCall');
goog.require('proto.gravity.v1.MsgSetOrchestratorAddress');
goog.require('proto.gravity.v1.MsgValsetConfirm');
goog.require('proto.gravity.v1.OutgoingLogicCall');
goog.require('proto.gravity.v1.OutgoingTransferTx');
goog.require('proto.gravity.v1.OutgoingTxBatch');
goog.require('proto.gravity.v1.Params');
goog.require('proto.gravity.v1.PendingIbcAutoForward');
goog.require('proto.gravity.v1.Valset');

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
proto.gravity.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.gravity.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.gravity.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gravity.v1.GenesisState.displayName = 'proto.gravity.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.gravity.v1.GenesisState.repeatedFields_ = [3,4,5,6,7,8,9,10,11,12,13];



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
proto.gravity.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.gravity.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gravity.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gravity.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.gravity.v1.Params.toObject(includeInstance, f),
    gravityNonces: (f = msg.getGravityNonces()) && proto.gravity.v1.GravityNonces.toObject(includeInstance, f),
    valsetsList: jspb.Message.toObjectList(msg.getValsetsList(),
    proto.gravity.v1.Valset.toObject, includeInstance),
    valsetConfirmsList: jspb.Message.toObjectList(msg.getValsetConfirmsList(),
    proto.gravity.v1.MsgValsetConfirm.toObject, includeInstance),
    batchesList: jspb.Message.toObjectList(msg.getBatchesList(),
    proto.gravity.v1.OutgoingTxBatch.toObject, includeInstance),
    batchConfirmsList: jspb.Message.toObjectList(msg.getBatchConfirmsList(),
    proto.gravity.v1.MsgConfirmBatch.toObject, includeInstance),
    logicCallsList: jspb.Message.toObjectList(msg.getLogicCallsList(),
    proto.gravity.v1.OutgoingLogicCall.toObject, includeInstance),
    logicCallConfirmsList: jspb.Message.toObjectList(msg.getLogicCallConfirmsList(),
    proto.gravity.v1.MsgConfirmLogicCall.toObject, includeInstance),
    attestationsList: jspb.Message.toObjectList(msg.getAttestationsList(),
    proto.gravity.v1.Attestation.toObject, includeInstance),
    delegateKeysList: jspb.Message.toObjectList(msg.getDelegateKeysList(),
    proto.gravity.v1.MsgSetOrchestratorAddress.toObject, includeInstance),
    erc20ToDenomsList: jspb.Message.toObjectList(msg.getErc20ToDenomsList(),
    proto.gravity.v1.ERC20ToDenom.toObject, includeInstance),
    unbatchedTransfersList: jspb.Message.toObjectList(msg.getUnbatchedTransfersList(),
    proto.gravity.v1.OutgoingTransferTx.toObject, includeInstance),
    pendingIbcAutoForwardsList: jspb.Message.toObjectList(msg.getPendingIbcAutoForwardsList(),
    proto.gravity.v1.PendingIbcAutoForward.toObject, includeInstance)
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
 * @return {!proto.gravity.v1.GenesisState}
 */
proto.gravity.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gravity.v1.GenesisState;
  return proto.gravity.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gravity.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gravity.v1.GenesisState}
 */
proto.gravity.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.gravity.v1.Params;
      reader.readMessage(value,proto.gravity.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.gravity.v1.GravityNonces;
      reader.readMessage(value,proto.gravity.v1.GravityNonces.deserializeBinaryFromReader);
      msg.setGravityNonces(value);
      break;
    case 3:
      var value = new proto.gravity.v1.Valset;
      reader.readMessage(value,proto.gravity.v1.Valset.deserializeBinaryFromReader);
      msg.addValsets(value);
      break;
    case 4:
      var value = new proto.gravity.v1.MsgValsetConfirm;
      reader.readMessage(value,proto.gravity.v1.MsgValsetConfirm.deserializeBinaryFromReader);
      msg.addValsetConfirms(value);
      break;
    case 5:
      var value = new proto.gravity.v1.OutgoingTxBatch;
      reader.readMessage(value,proto.gravity.v1.OutgoingTxBatch.deserializeBinaryFromReader);
      msg.addBatches(value);
      break;
    case 6:
      var value = new proto.gravity.v1.MsgConfirmBatch;
      reader.readMessage(value,proto.gravity.v1.MsgConfirmBatch.deserializeBinaryFromReader);
      msg.addBatchConfirms(value);
      break;
    case 7:
      var value = new proto.gravity.v1.OutgoingLogicCall;
      reader.readMessage(value,proto.gravity.v1.OutgoingLogicCall.deserializeBinaryFromReader);
      msg.addLogicCalls(value);
      break;
    case 8:
      var value = new proto.gravity.v1.MsgConfirmLogicCall;
      reader.readMessage(value,proto.gravity.v1.MsgConfirmLogicCall.deserializeBinaryFromReader);
      msg.addLogicCallConfirms(value);
      break;
    case 9:
      var value = new proto.gravity.v1.Attestation;
      reader.readMessage(value,proto.gravity.v1.Attestation.deserializeBinaryFromReader);
      msg.addAttestations(value);
      break;
    case 10:
      var value = new proto.gravity.v1.MsgSetOrchestratorAddress;
      reader.readMessage(value,proto.gravity.v1.MsgSetOrchestratorAddress.deserializeBinaryFromReader);
      msg.addDelegateKeys(value);
      break;
    case 11:
      var value = new proto.gravity.v1.ERC20ToDenom;
      reader.readMessage(value,proto.gravity.v1.ERC20ToDenom.deserializeBinaryFromReader);
      msg.addErc20ToDenoms(value);
      break;
    case 12:
      var value = new proto.gravity.v1.OutgoingTransferTx;
      reader.readMessage(value,proto.gravity.v1.OutgoingTransferTx.deserializeBinaryFromReader);
      msg.addUnbatchedTransfers(value);
      break;
    case 13:
      var value = new proto.gravity.v1.PendingIbcAutoForward;
      reader.readMessage(value,proto.gravity.v1.PendingIbcAutoForward.deserializeBinaryFromReader);
      msg.addPendingIbcAutoForwards(value);
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
proto.gravity.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gravity.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gravity.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gravity.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.gravity.v1.Params.serializeBinaryToWriter
    );
  }
  f = message.getGravityNonces();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.gravity.v1.GravityNonces.serializeBinaryToWriter
    );
  }
  f = message.getValsetsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.gravity.v1.Valset.serializeBinaryToWriter
    );
  }
  f = message.getValsetConfirmsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.gravity.v1.MsgValsetConfirm.serializeBinaryToWriter
    );
  }
  f = message.getBatchesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.gravity.v1.OutgoingTxBatch.serializeBinaryToWriter
    );
  }
  f = message.getBatchConfirmsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.gravity.v1.MsgConfirmBatch.serializeBinaryToWriter
    );
  }
  f = message.getLogicCallsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.gravity.v1.OutgoingLogicCall.serializeBinaryToWriter
    );
  }
  f = message.getLogicCallConfirmsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      8,
      f,
      proto.gravity.v1.MsgConfirmLogicCall.serializeBinaryToWriter
    );
  }
  f = message.getAttestationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      9,
      f,
      proto.gravity.v1.Attestation.serializeBinaryToWriter
    );
  }
  f = message.getDelegateKeysList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      10,
      f,
      proto.gravity.v1.MsgSetOrchestratorAddress.serializeBinaryToWriter
    );
  }
  f = message.getErc20ToDenomsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      11,
      f,
      proto.gravity.v1.ERC20ToDenom.serializeBinaryToWriter
    );
  }
  f = message.getUnbatchedTransfersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      12,
      f,
      proto.gravity.v1.OutgoingTransferTx.serializeBinaryToWriter
    );
  }
  f = message.getPendingIbcAutoForwardsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      13,
      f,
      proto.gravity.v1.PendingIbcAutoForward.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.gravity.v1.Params}
 */
proto.gravity.v1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.gravity.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.gravity.v1.Params, 1));
};


/**
 * @param {?proto.gravity.v1.Params|undefined} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gravity.v1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional GravityNonces gravity_nonces = 2;
 * @return {?proto.gravity.v1.GravityNonces}
 */
proto.gravity.v1.GenesisState.prototype.getGravityNonces = function() {
  return /** @type{?proto.gravity.v1.GravityNonces} */ (
    jspb.Message.getWrapperField(this, proto.gravity.v1.GravityNonces, 2));
};


/**
 * @param {?proto.gravity.v1.GravityNonces|undefined} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setGravityNonces = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearGravityNonces = function() {
  return this.setGravityNonces(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.gravity.v1.GenesisState.prototype.hasGravityNonces = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated Valset valsets = 3;
 * @return {!Array<!proto.gravity.v1.Valset>}
 */
proto.gravity.v1.GenesisState.prototype.getValsetsList = function() {
  return /** @type{!Array<!proto.gravity.v1.Valset>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.Valset, 3));
};


/**
 * @param {!Array<!proto.gravity.v1.Valset>} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setValsetsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.gravity.v1.Valset=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.Valset}
 */
proto.gravity.v1.GenesisState.prototype.addValsets = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.gravity.v1.Valset, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearValsetsList = function() {
  return this.setValsetsList([]);
};


/**
 * repeated MsgValsetConfirm valset_confirms = 4;
 * @return {!Array<!proto.gravity.v1.MsgValsetConfirm>}
 */
proto.gravity.v1.GenesisState.prototype.getValsetConfirmsList = function() {
  return /** @type{!Array<!proto.gravity.v1.MsgValsetConfirm>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.MsgValsetConfirm, 4));
};


/**
 * @param {!Array<!proto.gravity.v1.MsgValsetConfirm>} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setValsetConfirmsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.gravity.v1.MsgValsetConfirm=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.MsgValsetConfirm}
 */
proto.gravity.v1.GenesisState.prototype.addValsetConfirms = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.gravity.v1.MsgValsetConfirm, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearValsetConfirmsList = function() {
  return this.setValsetConfirmsList([]);
};


/**
 * repeated OutgoingTxBatch batches = 5;
 * @return {!Array<!proto.gravity.v1.OutgoingTxBatch>}
 */
proto.gravity.v1.GenesisState.prototype.getBatchesList = function() {
  return /** @type{!Array<!proto.gravity.v1.OutgoingTxBatch>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.OutgoingTxBatch, 5));
};


/**
 * @param {!Array<!proto.gravity.v1.OutgoingTxBatch>} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setBatchesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.gravity.v1.OutgoingTxBatch=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.OutgoingTxBatch}
 */
proto.gravity.v1.GenesisState.prototype.addBatches = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.gravity.v1.OutgoingTxBatch, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearBatchesList = function() {
  return this.setBatchesList([]);
};


/**
 * repeated MsgConfirmBatch batch_confirms = 6;
 * @return {!Array<!proto.gravity.v1.MsgConfirmBatch>}
 */
proto.gravity.v1.GenesisState.prototype.getBatchConfirmsList = function() {
  return /** @type{!Array<!proto.gravity.v1.MsgConfirmBatch>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.MsgConfirmBatch, 6));
};


/**
 * @param {!Array<!proto.gravity.v1.MsgConfirmBatch>} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setBatchConfirmsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.gravity.v1.MsgConfirmBatch=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.MsgConfirmBatch}
 */
proto.gravity.v1.GenesisState.prototype.addBatchConfirms = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.gravity.v1.MsgConfirmBatch, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearBatchConfirmsList = function() {
  return this.setBatchConfirmsList([]);
};


/**
 * repeated OutgoingLogicCall logic_calls = 7;
 * @return {!Array<!proto.gravity.v1.OutgoingLogicCall>}
 */
proto.gravity.v1.GenesisState.prototype.getLogicCallsList = function() {
  return /** @type{!Array<!proto.gravity.v1.OutgoingLogicCall>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.OutgoingLogicCall, 7));
};


/**
 * @param {!Array<!proto.gravity.v1.OutgoingLogicCall>} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setLogicCallsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.gravity.v1.OutgoingLogicCall=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.OutgoingLogicCall}
 */
proto.gravity.v1.GenesisState.prototype.addLogicCalls = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.gravity.v1.OutgoingLogicCall, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearLogicCallsList = function() {
  return this.setLogicCallsList([]);
};


/**
 * repeated MsgConfirmLogicCall logic_call_confirms = 8;
 * @return {!Array<!proto.gravity.v1.MsgConfirmLogicCall>}
 */
proto.gravity.v1.GenesisState.prototype.getLogicCallConfirmsList = function() {
  return /** @type{!Array<!proto.gravity.v1.MsgConfirmLogicCall>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.MsgConfirmLogicCall, 8));
};


/**
 * @param {!Array<!proto.gravity.v1.MsgConfirmLogicCall>} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setLogicCallConfirmsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 8, value);
};


/**
 * @param {!proto.gravity.v1.MsgConfirmLogicCall=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.MsgConfirmLogicCall}
 */
proto.gravity.v1.GenesisState.prototype.addLogicCallConfirms = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 8, opt_value, proto.gravity.v1.MsgConfirmLogicCall, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearLogicCallConfirmsList = function() {
  return this.setLogicCallConfirmsList([]);
};


/**
 * repeated Attestation attestations = 9;
 * @return {!Array<!proto.gravity.v1.Attestation>}
 */
proto.gravity.v1.GenesisState.prototype.getAttestationsList = function() {
  return /** @type{!Array<!proto.gravity.v1.Attestation>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.Attestation, 9));
};


/**
 * @param {!Array<!proto.gravity.v1.Attestation>} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setAttestationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 9, value);
};


/**
 * @param {!proto.gravity.v1.Attestation=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.Attestation}
 */
proto.gravity.v1.GenesisState.prototype.addAttestations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 9, opt_value, proto.gravity.v1.Attestation, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearAttestationsList = function() {
  return this.setAttestationsList([]);
};


/**
 * repeated MsgSetOrchestratorAddress delegate_keys = 10;
 * @return {!Array<!proto.gravity.v1.MsgSetOrchestratorAddress>}
 */
proto.gravity.v1.GenesisState.prototype.getDelegateKeysList = function() {
  return /** @type{!Array<!proto.gravity.v1.MsgSetOrchestratorAddress>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.MsgSetOrchestratorAddress, 10));
};


/**
 * @param {!Array<!proto.gravity.v1.MsgSetOrchestratorAddress>} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setDelegateKeysList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 10, value);
};


/**
 * @param {!proto.gravity.v1.MsgSetOrchestratorAddress=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.MsgSetOrchestratorAddress}
 */
proto.gravity.v1.GenesisState.prototype.addDelegateKeys = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 10, opt_value, proto.gravity.v1.MsgSetOrchestratorAddress, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearDelegateKeysList = function() {
  return this.setDelegateKeysList([]);
};


/**
 * repeated ERC20ToDenom erc20_to_denoms = 11;
 * @return {!Array<!proto.gravity.v1.ERC20ToDenom>}
 */
proto.gravity.v1.GenesisState.prototype.getErc20ToDenomsList = function() {
  return /** @type{!Array<!proto.gravity.v1.ERC20ToDenom>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.ERC20ToDenom, 11));
};


/**
 * @param {!Array<!proto.gravity.v1.ERC20ToDenom>} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setErc20ToDenomsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 11, value);
};


/**
 * @param {!proto.gravity.v1.ERC20ToDenom=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.ERC20ToDenom}
 */
proto.gravity.v1.GenesisState.prototype.addErc20ToDenoms = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 11, opt_value, proto.gravity.v1.ERC20ToDenom, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearErc20ToDenomsList = function() {
  return this.setErc20ToDenomsList([]);
};


/**
 * repeated OutgoingTransferTx unbatched_transfers = 12;
 * @return {!Array<!proto.gravity.v1.OutgoingTransferTx>}
 */
proto.gravity.v1.GenesisState.prototype.getUnbatchedTransfersList = function() {
  return /** @type{!Array<!proto.gravity.v1.OutgoingTransferTx>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.OutgoingTransferTx, 12));
};


/**
 * @param {!Array<!proto.gravity.v1.OutgoingTransferTx>} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setUnbatchedTransfersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 12, value);
};


/**
 * @param {!proto.gravity.v1.OutgoingTransferTx=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.OutgoingTransferTx}
 */
proto.gravity.v1.GenesisState.prototype.addUnbatchedTransfers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 12, opt_value, proto.gravity.v1.OutgoingTransferTx, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearUnbatchedTransfersList = function() {
  return this.setUnbatchedTransfersList([]);
};


/**
 * repeated PendingIbcAutoForward pending_ibc_auto_forwards = 13;
 * @return {!Array<!proto.gravity.v1.PendingIbcAutoForward>}
 */
proto.gravity.v1.GenesisState.prototype.getPendingIbcAutoForwardsList = function() {
  return /** @type{!Array<!proto.gravity.v1.PendingIbcAutoForward>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.gravity.v1.PendingIbcAutoForward, 13));
};


/**
 * @param {!Array<!proto.gravity.v1.PendingIbcAutoForward>} value
 * @return {!proto.gravity.v1.GenesisState} returns this
*/
proto.gravity.v1.GenesisState.prototype.setPendingIbcAutoForwardsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 13, value);
};


/**
 * @param {!proto.gravity.v1.PendingIbcAutoForward=} opt_value
 * @param {number=} opt_index
 * @return {!proto.gravity.v1.PendingIbcAutoForward}
 */
proto.gravity.v1.GenesisState.prototype.addPendingIbcAutoForwards = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 13, opt_value, proto.gravity.v1.PendingIbcAutoForward, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.gravity.v1.GenesisState} returns this
 */
proto.gravity.v1.GenesisState.prototype.clearPendingIbcAutoForwardsList = function() {
  return this.setPendingIbcAutoForwardsList([]);
};


