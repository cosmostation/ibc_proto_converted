// source: sommelier/cellarfees/v1/genesis.proto
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

goog.provide('proto.cellarfees.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cellarfees.v1.FeeAccrualCounters');
goog.require('proto.cellarfees.v1.Params');

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
proto.cellarfees.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cellarfees.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cellarfees.v1.GenesisState.displayName = 'proto.cellarfees.v1.GenesisState';
}



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
proto.cellarfees.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.cellarfees.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cellarfees.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cellarfees.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.cellarfees.v1.Params.toObject(includeInstance, f),
    feeAccrualCounters: (f = msg.getFeeAccrualCounters()) && proto.cellarfees.v1.FeeAccrualCounters.toObject(includeInstance, f),
    lastRewardSupplyPeak: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.cellarfees.v1.GenesisState}
 */
proto.cellarfees.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cellarfees.v1.GenesisState;
  return proto.cellarfees.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cellarfees.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cellarfees.v1.GenesisState}
 */
proto.cellarfees.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cellarfees.v1.Params;
      reader.readMessage(value,proto.cellarfees.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.cellarfees.v1.FeeAccrualCounters;
      reader.readMessage(value,proto.cellarfees.v1.FeeAccrualCounters.deserializeBinaryFromReader);
      msg.setFeeAccrualCounters(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setLastRewardSupplyPeak(value);
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
proto.cellarfees.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cellarfees.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cellarfees.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cellarfees.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cellarfees.v1.Params.serializeBinaryToWriter
    );
  }
  f = message.getFeeAccrualCounters();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cellarfees.v1.FeeAccrualCounters.serializeBinaryToWriter
    );
  }
  f = message.getLastRewardSupplyPeak();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.cellarfees.v1.Params}
 */
proto.cellarfees.v1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.cellarfees.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.cellarfees.v1.Params, 1));
};


/**
 * @param {?proto.cellarfees.v1.Params|undefined} value
 * @return {!proto.cellarfees.v1.GenesisState} returns this
*/
proto.cellarfees.v1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cellarfees.v1.GenesisState} returns this
 */
proto.cellarfees.v1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cellarfees.v1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional FeeAccrualCounters fee_accrual_counters = 2;
 * @return {?proto.cellarfees.v1.FeeAccrualCounters}
 */
proto.cellarfees.v1.GenesisState.prototype.getFeeAccrualCounters = function() {
  return /** @type{?proto.cellarfees.v1.FeeAccrualCounters} */ (
    jspb.Message.getWrapperField(this, proto.cellarfees.v1.FeeAccrualCounters, 2));
};


/**
 * @param {?proto.cellarfees.v1.FeeAccrualCounters|undefined} value
 * @return {!proto.cellarfees.v1.GenesisState} returns this
*/
proto.cellarfees.v1.GenesisState.prototype.setFeeAccrualCounters = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cellarfees.v1.GenesisState} returns this
 */
proto.cellarfees.v1.GenesisState.prototype.clearFeeAccrualCounters = function() {
  return this.setFeeAccrualCounters(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cellarfees.v1.GenesisState.prototype.hasFeeAccrualCounters = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional string last_reward_supply_peak = 3;
 * @return {string}
 */
proto.cellarfees.v1.GenesisState.prototype.getLastRewardSupplyPeak = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cellarfees.v1.GenesisState} returns this
 */
proto.cellarfees.v1.GenesisState.prototype.setLastRewardSupplyPeak = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


