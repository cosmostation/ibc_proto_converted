// source: persistence/oracle/v1beta1/genesis.proto
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

goog.provide('proto.persistence.oracle.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote');
goog.require('proto.persistence.oracle.v1beta1.AggregateExchangeRateVote');
goog.require('proto.persistence.oracle.v1beta1.ExchangeRateTuple');
goog.require('proto.persistence.oracle.v1beta1.FeederDelegation');
goog.require('proto.persistence.oracle.v1beta1.MissCounter');
goog.require('proto.persistence.oracle.v1beta1.Params');

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
proto.persistence.oracle.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.persistence.oracle.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.persistence.oracle.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.persistence.oracle.v1beta1.GenesisState.displayName = 'proto.persistence.oracle.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.persistence.oracle.v1beta1.GenesisState.repeatedFields_ = [2,3,4,5,6];



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
proto.persistence.oracle.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.persistence.oracle.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.persistence.oracle.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.persistence.oracle.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.persistence.oracle.v1beta1.Params.toObject(includeInstance, f),
    feederDelegationsList: jspb.Message.toObjectList(msg.getFeederDelegationsList(),
    proto.persistence.oracle.v1beta1.FeederDelegation.toObject, includeInstance),
    exchangeRatesList: jspb.Message.toObjectList(msg.getExchangeRatesList(),
    proto.persistence.oracle.v1beta1.ExchangeRateTuple.toObject, includeInstance),
    missCountersList: jspb.Message.toObjectList(msg.getMissCountersList(),
    proto.persistence.oracle.v1beta1.MissCounter.toObject, includeInstance),
    aggregateExchangeRatePrevotesList: jspb.Message.toObjectList(msg.getAggregateExchangeRatePrevotesList(),
    proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote.toObject, includeInstance),
    aggregateExchangeRateVotesList: jspb.Message.toObjectList(msg.getAggregateExchangeRateVotesList(),
    proto.persistence.oracle.v1beta1.AggregateExchangeRateVote.toObject, includeInstance)
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
 * @return {!proto.persistence.oracle.v1beta1.GenesisState}
 */
proto.persistence.oracle.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.persistence.oracle.v1beta1.GenesisState;
  return proto.persistence.oracle.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.persistence.oracle.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.persistence.oracle.v1beta1.GenesisState}
 */
proto.persistence.oracle.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.persistence.oracle.v1beta1.Params;
      reader.readMessage(value,proto.persistence.oracle.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.persistence.oracle.v1beta1.FeederDelegation;
      reader.readMessage(value,proto.persistence.oracle.v1beta1.FeederDelegation.deserializeBinaryFromReader);
      msg.addFeederDelegations(value);
      break;
    case 3:
      var value = new proto.persistence.oracle.v1beta1.ExchangeRateTuple;
      reader.readMessage(value,proto.persistence.oracle.v1beta1.ExchangeRateTuple.deserializeBinaryFromReader);
      msg.addExchangeRates(value);
      break;
    case 4:
      var value = new proto.persistence.oracle.v1beta1.MissCounter;
      reader.readMessage(value,proto.persistence.oracle.v1beta1.MissCounter.deserializeBinaryFromReader);
      msg.addMissCounters(value);
      break;
    case 5:
      var value = new proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote;
      reader.readMessage(value,proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote.deserializeBinaryFromReader);
      msg.addAggregateExchangeRatePrevotes(value);
      break;
    case 6:
      var value = new proto.persistence.oracle.v1beta1.AggregateExchangeRateVote;
      reader.readMessage(value,proto.persistence.oracle.v1beta1.AggregateExchangeRateVote.deserializeBinaryFromReader);
      msg.addAggregateExchangeRateVotes(value);
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
proto.persistence.oracle.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.persistence.oracle.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.persistence.oracle.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.persistence.oracle.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.persistence.oracle.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getFeederDelegationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.persistence.oracle.v1beta1.FeederDelegation.serializeBinaryToWriter
    );
  }
  f = message.getExchangeRatesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.persistence.oracle.v1beta1.ExchangeRateTuple.serializeBinaryToWriter
    );
  }
  f = message.getMissCountersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.persistence.oracle.v1beta1.MissCounter.serializeBinaryToWriter
    );
  }
  f = message.getAggregateExchangeRatePrevotesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote.serializeBinaryToWriter
    );
  }
  f = message.getAggregateExchangeRateVotesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.persistence.oracle.v1beta1.AggregateExchangeRateVote.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.persistence.oracle.v1beta1.Params}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.persistence.oracle.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.persistence.oracle.v1beta1.Params, 1));
};


/**
 * @param {?proto.persistence.oracle.v1beta1.Params|undefined} value
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
*/
proto.persistence.oracle.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated FeederDelegation feeder_delegations = 2;
 * @return {!Array<!proto.persistence.oracle.v1beta1.FeederDelegation>}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.getFeederDelegationsList = function() {
  return /** @type{!Array<!proto.persistence.oracle.v1beta1.FeederDelegation>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.persistence.oracle.v1beta1.FeederDelegation, 2));
};


/**
 * @param {!Array<!proto.persistence.oracle.v1beta1.FeederDelegation>} value
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
*/
proto.persistence.oracle.v1beta1.GenesisState.prototype.setFeederDelegationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.persistence.oracle.v1beta1.FeederDelegation=} opt_value
 * @param {number=} opt_index
 * @return {!proto.persistence.oracle.v1beta1.FeederDelegation}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.addFeederDelegations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.persistence.oracle.v1beta1.FeederDelegation, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.clearFeederDelegationsList = function() {
  return this.setFeederDelegationsList([]);
};


/**
 * repeated ExchangeRateTuple exchange_rates = 3;
 * @return {!Array<!proto.persistence.oracle.v1beta1.ExchangeRateTuple>}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.getExchangeRatesList = function() {
  return /** @type{!Array<!proto.persistence.oracle.v1beta1.ExchangeRateTuple>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.persistence.oracle.v1beta1.ExchangeRateTuple, 3));
};


/**
 * @param {!Array<!proto.persistence.oracle.v1beta1.ExchangeRateTuple>} value
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
*/
proto.persistence.oracle.v1beta1.GenesisState.prototype.setExchangeRatesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.persistence.oracle.v1beta1.ExchangeRateTuple=} opt_value
 * @param {number=} opt_index
 * @return {!proto.persistence.oracle.v1beta1.ExchangeRateTuple}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.addExchangeRates = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.persistence.oracle.v1beta1.ExchangeRateTuple, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.clearExchangeRatesList = function() {
  return this.setExchangeRatesList([]);
};


/**
 * repeated MissCounter miss_counters = 4;
 * @return {!Array<!proto.persistence.oracle.v1beta1.MissCounter>}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.getMissCountersList = function() {
  return /** @type{!Array<!proto.persistence.oracle.v1beta1.MissCounter>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.persistence.oracle.v1beta1.MissCounter, 4));
};


/**
 * @param {!Array<!proto.persistence.oracle.v1beta1.MissCounter>} value
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
*/
proto.persistence.oracle.v1beta1.GenesisState.prototype.setMissCountersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.persistence.oracle.v1beta1.MissCounter=} opt_value
 * @param {number=} opt_index
 * @return {!proto.persistence.oracle.v1beta1.MissCounter}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.addMissCounters = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.persistence.oracle.v1beta1.MissCounter, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.clearMissCountersList = function() {
  return this.setMissCountersList([]);
};


/**
 * repeated AggregateExchangeRatePrevote aggregate_exchange_rate_prevotes = 5;
 * @return {!Array<!proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote>}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.getAggregateExchangeRatePrevotesList = function() {
  return /** @type{!Array<!proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote, 5));
};


/**
 * @param {!Array<!proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote>} value
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
*/
proto.persistence.oracle.v1beta1.GenesisState.prototype.setAggregateExchangeRatePrevotesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote=} opt_value
 * @param {number=} opt_index
 * @return {!proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.addAggregateExchangeRatePrevotes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.clearAggregateExchangeRatePrevotesList = function() {
  return this.setAggregateExchangeRatePrevotesList([]);
};


/**
 * repeated AggregateExchangeRateVote aggregate_exchange_rate_votes = 6;
 * @return {!Array<!proto.persistence.oracle.v1beta1.AggregateExchangeRateVote>}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.getAggregateExchangeRateVotesList = function() {
  return /** @type{!Array<!proto.persistence.oracle.v1beta1.AggregateExchangeRateVote>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.persistence.oracle.v1beta1.AggregateExchangeRateVote, 6));
};


/**
 * @param {!Array<!proto.persistence.oracle.v1beta1.AggregateExchangeRateVote>} value
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
*/
proto.persistence.oracle.v1beta1.GenesisState.prototype.setAggregateExchangeRateVotesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.persistence.oracle.v1beta1.AggregateExchangeRateVote=} opt_value
 * @param {number=} opt_index
 * @return {!proto.persistence.oracle.v1beta1.AggregateExchangeRateVote}
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.addAggregateExchangeRateVotes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.persistence.oracle.v1beta1.AggregateExchangeRateVote, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.persistence.oracle.v1beta1.GenesisState} returns this
 */
proto.persistence.oracle.v1beta1.GenesisState.prototype.clearAggregateExchangeRateVotesList = function() {
  return this.setAggregateExchangeRateVotesList([]);
};


