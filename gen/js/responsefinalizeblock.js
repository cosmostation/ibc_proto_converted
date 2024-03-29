// source: tendermint/abci/types.proto
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

goog.provide('proto.tendermint.abci.ResponseFinalizeBlock');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tendermint.abci.Event');
goog.require('proto.tendermint.abci.ExecTxResult');
goog.require('proto.tendermint.abci.ValidatorUpdate');
goog.require('proto.tendermint.types.ConsensusParams');

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
proto.tendermint.abci.ResponseFinalizeBlock = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.tendermint.abci.ResponseFinalizeBlock.repeatedFields_, null);
};
goog.inherits(proto.tendermint.abci.ResponseFinalizeBlock, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.abci.ResponseFinalizeBlock.displayName = 'proto.tendermint.abci.ResponseFinalizeBlock';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.tendermint.abci.ResponseFinalizeBlock.repeatedFields_ = [1,2,3];



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
proto.tendermint.abci.ResponseFinalizeBlock.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.abci.ResponseFinalizeBlock.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.abci.ResponseFinalizeBlock} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.ResponseFinalizeBlock.toObject = function(includeInstance, msg) {
  var f, obj = {
    eventsList: jspb.Message.toObjectList(msg.getEventsList(),
    proto.tendermint.abci.Event.toObject, includeInstance),
    txResultsList: jspb.Message.toObjectList(msg.getTxResultsList(),
    proto.tendermint.abci.ExecTxResult.toObject, includeInstance),
    validatorUpdatesList: jspb.Message.toObjectList(msg.getValidatorUpdatesList(),
    proto.tendermint.abci.ValidatorUpdate.toObject, includeInstance),
    consensusParamUpdates: (f = msg.getConsensusParamUpdates()) && proto.tendermint.types.ConsensusParams.toObject(includeInstance, f),
    appHash: msg.getAppHash_asB64()
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
 * @return {!proto.tendermint.abci.ResponseFinalizeBlock}
 */
proto.tendermint.abci.ResponseFinalizeBlock.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.abci.ResponseFinalizeBlock;
  return proto.tendermint.abci.ResponseFinalizeBlock.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.abci.ResponseFinalizeBlock} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.abci.ResponseFinalizeBlock}
 */
proto.tendermint.abci.ResponseFinalizeBlock.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tendermint.abci.Event;
      reader.readMessage(value,proto.tendermint.abci.Event.deserializeBinaryFromReader);
      msg.addEvents(value);
      break;
    case 2:
      var value = new proto.tendermint.abci.ExecTxResult;
      reader.readMessage(value,proto.tendermint.abci.ExecTxResult.deserializeBinaryFromReader);
      msg.addTxResults(value);
      break;
    case 3:
      var value = new proto.tendermint.abci.ValidatorUpdate;
      reader.readMessage(value,proto.tendermint.abci.ValidatorUpdate.deserializeBinaryFromReader);
      msg.addValidatorUpdates(value);
      break;
    case 4:
      var value = new proto.tendermint.types.ConsensusParams;
      reader.readMessage(value,proto.tendermint.types.ConsensusParams.deserializeBinaryFromReader);
      msg.setConsensusParamUpdates(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAppHash(value);
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
proto.tendermint.abci.ResponseFinalizeBlock.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.abci.ResponseFinalizeBlock.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.abci.ResponseFinalizeBlock} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.ResponseFinalizeBlock.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEventsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.tendermint.abci.Event.serializeBinaryToWriter
    );
  }
  f = message.getTxResultsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.tendermint.abci.ExecTxResult.serializeBinaryToWriter
    );
  }
  f = message.getValidatorUpdatesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.tendermint.abci.ValidatorUpdate.serializeBinaryToWriter
    );
  }
  f = message.getConsensusParamUpdates();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.tendermint.types.ConsensusParams.serializeBinaryToWriter
    );
  }
  f = message.getAppHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
};


/**
 * repeated Event events = 1;
 * @return {!Array<!proto.tendermint.abci.Event>}
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.getEventsList = function() {
  return /** @type{!Array<!proto.tendermint.abci.Event>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.tendermint.abci.Event, 1));
};


/**
 * @param {!Array<!proto.tendermint.abci.Event>} value
 * @return {!proto.tendermint.abci.ResponseFinalizeBlock} returns this
*/
proto.tendermint.abci.ResponseFinalizeBlock.prototype.setEventsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.tendermint.abci.Event=} opt_value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.Event}
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.addEvents = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.tendermint.abci.Event, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tendermint.abci.ResponseFinalizeBlock} returns this
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.clearEventsList = function() {
  return this.setEventsList([]);
};


/**
 * repeated ExecTxResult tx_results = 2;
 * @return {!Array<!proto.tendermint.abci.ExecTxResult>}
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.getTxResultsList = function() {
  return /** @type{!Array<!proto.tendermint.abci.ExecTxResult>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.tendermint.abci.ExecTxResult, 2));
};


/**
 * @param {!Array<!proto.tendermint.abci.ExecTxResult>} value
 * @return {!proto.tendermint.abci.ResponseFinalizeBlock} returns this
*/
proto.tendermint.abci.ResponseFinalizeBlock.prototype.setTxResultsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.tendermint.abci.ExecTxResult=} opt_value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.ExecTxResult}
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.addTxResults = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.tendermint.abci.ExecTxResult, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tendermint.abci.ResponseFinalizeBlock} returns this
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.clearTxResultsList = function() {
  return this.setTxResultsList([]);
};


/**
 * repeated ValidatorUpdate validator_updates = 3;
 * @return {!Array<!proto.tendermint.abci.ValidatorUpdate>}
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.getValidatorUpdatesList = function() {
  return /** @type{!Array<!proto.tendermint.abci.ValidatorUpdate>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.tendermint.abci.ValidatorUpdate, 3));
};


/**
 * @param {!Array<!proto.tendermint.abci.ValidatorUpdate>} value
 * @return {!proto.tendermint.abci.ResponseFinalizeBlock} returns this
*/
proto.tendermint.abci.ResponseFinalizeBlock.prototype.setValidatorUpdatesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.tendermint.abci.ValidatorUpdate=} opt_value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.ValidatorUpdate}
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.addValidatorUpdates = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.tendermint.abci.ValidatorUpdate, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tendermint.abci.ResponseFinalizeBlock} returns this
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.clearValidatorUpdatesList = function() {
  return this.setValidatorUpdatesList([]);
};


/**
 * optional tendermint.types.ConsensusParams consensus_param_updates = 4;
 * @return {?proto.tendermint.types.ConsensusParams}
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.getConsensusParamUpdates = function() {
  return /** @type{?proto.tendermint.types.ConsensusParams} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.ConsensusParams, 4));
};


/**
 * @param {?proto.tendermint.types.ConsensusParams|undefined} value
 * @return {!proto.tendermint.abci.ResponseFinalizeBlock} returns this
*/
proto.tendermint.abci.ResponseFinalizeBlock.prototype.setConsensusParamUpdates = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.ResponseFinalizeBlock} returns this
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.clearConsensusParamUpdates = function() {
  return this.setConsensusParamUpdates(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.hasConsensusParamUpdates = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional bytes app_hash = 5;
 * @return {string}
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.getAppHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes app_hash = 5;
 * This is a type-conversion wrapper around `getAppHash()`
 * @return {string}
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.getAppHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAppHash()));
};


/**
 * optional bytes app_hash = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAppHash()`
 * @return {!Uint8Array}
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.getAppHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAppHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.tendermint.abci.ResponseFinalizeBlock} returns this
 */
proto.tendermint.abci.ResponseFinalizeBlock.prototype.setAppHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


