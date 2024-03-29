// source: evmos/incentives/v1/genesis.proto
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

goog.provide('proto.evmos.incentives.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.evmos.incentives.v1.GasMeter');
goog.require('proto.evmos.incentives.v1.Incentive');
goog.require('proto.evmos.incentives.v1.Params');

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
proto.evmos.incentives.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.evmos.incentives.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.evmos.incentives.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.evmos.incentives.v1.GenesisState.displayName = 'proto.evmos.incentives.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.evmos.incentives.v1.GenesisState.repeatedFields_ = [2,3];



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
proto.evmos.incentives.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.evmos.incentives.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.evmos.incentives.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.evmos.incentives.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.evmos.incentives.v1.Params.toObject(includeInstance, f),
    incentivesList: jspb.Message.toObjectList(msg.getIncentivesList(),
    proto.evmos.incentives.v1.Incentive.toObject, includeInstance),
    gasMetersList: jspb.Message.toObjectList(msg.getGasMetersList(),
    proto.evmos.incentives.v1.GasMeter.toObject, includeInstance)
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
 * @return {!proto.evmos.incentives.v1.GenesisState}
 */
proto.evmos.incentives.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.evmos.incentives.v1.GenesisState;
  return proto.evmos.incentives.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.evmos.incentives.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.evmos.incentives.v1.GenesisState}
 */
proto.evmos.incentives.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.evmos.incentives.v1.Params;
      reader.readMessage(value,proto.evmos.incentives.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.evmos.incentives.v1.Incentive;
      reader.readMessage(value,proto.evmos.incentives.v1.Incentive.deserializeBinaryFromReader);
      msg.addIncentives(value);
      break;
    case 3:
      var value = new proto.evmos.incentives.v1.GasMeter;
      reader.readMessage(value,proto.evmos.incentives.v1.GasMeter.deserializeBinaryFromReader);
      msg.addGasMeters(value);
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
proto.evmos.incentives.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.evmos.incentives.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.evmos.incentives.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.evmos.incentives.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.evmos.incentives.v1.Params.serializeBinaryToWriter
    );
  }
  f = message.getIncentivesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.evmos.incentives.v1.Incentive.serializeBinaryToWriter
    );
  }
  f = message.getGasMetersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.evmos.incentives.v1.GasMeter.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.evmos.incentives.v1.Params}
 */
proto.evmos.incentives.v1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.evmos.incentives.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.evmos.incentives.v1.Params, 1));
};


/**
 * @param {?proto.evmos.incentives.v1.Params|undefined} value
 * @return {!proto.evmos.incentives.v1.GenesisState} returns this
*/
proto.evmos.incentives.v1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.evmos.incentives.v1.GenesisState} returns this
 */
proto.evmos.incentives.v1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.evmos.incentives.v1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Incentive incentives = 2;
 * @return {!Array<!proto.evmos.incentives.v1.Incentive>}
 */
proto.evmos.incentives.v1.GenesisState.prototype.getIncentivesList = function() {
  return /** @type{!Array<!proto.evmos.incentives.v1.Incentive>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.evmos.incentives.v1.Incentive, 2));
};


/**
 * @param {!Array<!proto.evmos.incentives.v1.Incentive>} value
 * @return {!proto.evmos.incentives.v1.GenesisState} returns this
*/
proto.evmos.incentives.v1.GenesisState.prototype.setIncentivesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.evmos.incentives.v1.Incentive=} opt_value
 * @param {number=} opt_index
 * @return {!proto.evmos.incentives.v1.Incentive}
 */
proto.evmos.incentives.v1.GenesisState.prototype.addIncentives = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.evmos.incentives.v1.Incentive, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.evmos.incentives.v1.GenesisState} returns this
 */
proto.evmos.incentives.v1.GenesisState.prototype.clearIncentivesList = function() {
  return this.setIncentivesList([]);
};


/**
 * repeated GasMeter gas_meters = 3;
 * @return {!Array<!proto.evmos.incentives.v1.GasMeter>}
 */
proto.evmos.incentives.v1.GenesisState.prototype.getGasMetersList = function() {
  return /** @type{!Array<!proto.evmos.incentives.v1.GasMeter>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.evmos.incentives.v1.GasMeter, 3));
};


/**
 * @param {!Array<!proto.evmos.incentives.v1.GasMeter>} value
 * @return {!proto.evmos.incentives.v1.GenesisState} returns this
*/
proto.evmos.incentives.v1.GenesisState.prototype.setGasMetersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.evmos.incentives.v1.GasMeter=} opt_value
 * @param {number=} opt_index
 * @return {!proto.evmos.incentives.v1.GasMeter}
 */
proto.evmos.incentives.v1.GenesisState.prototype.addGasMeters = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.evmos.incentives.v1.GasMeter, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.evmos.incentives.v1.GenesisState} returns this
 */
proto.evmos.incentives.v1.GenesisState.prototype.clearGasMetersList = function() {
  return this.setGasMetersList([]);
};


