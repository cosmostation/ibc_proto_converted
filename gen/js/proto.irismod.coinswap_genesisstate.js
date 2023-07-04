// source: irismod/coinswap/genesis.proto
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

goog.provide('proto.irismod.coinswap.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.irismod.coinswap.Params');
goog.require('proto.irismod.coinswap.Pool');

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
proto.irismod.coinswap.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.irismod.coinswap.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.irismod.coinswap.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.coinswap.GenesisState.displayName = 'proto.irismod.coinswap.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.irismod.coinswap.GenesisState.repeatedFields_ = [3];



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
proto.irismod.coinswap.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.coinswap.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.coinswap.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.coinswap.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.irismod.coinswap.Params.toObject(includeInstance, f),
    standardDenom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    poolList: jspb.Message.toObjectList(msg.getPoolList(),
    proto.irismod.coinswap.Pool.toObject, includeInstance),
    sequence: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.irismod.coinswap.GenesisState}
 */
proto.irismod.coinswap.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.coinswap.GenesisState;
  return proto.irismod.coinswap.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.coinswap.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.coinswap.GenesisState}
 */
proto.irismod.coinswap.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.irismod.coinswap.Params;
      reader.readMessage(value,proto.irismod.coinswap.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setStandardDenom(value);
      break;
    case 3:
      var value = new proto.irismod.coinswap.Pool;
      reader.readMessage(value,proto.irismod.coinswap.Pool.deserializeBinaryFromReader);
      msg.addPool(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSequence(value);
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
proto.irismod.coinswap.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.coinswap.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.coinswap.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.coinswap.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.irismod.coinswap.Params.serializeBinaryToWriter
    );
  }
  f = message.getStandardDenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getPoolList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.irismod.coinswap.Pool.serializeBinaryToWriter
    );
  }
  f = message.getSequence();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.irismod.coinswap.Params}
 */
proto.irismod.coinswap.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.irismod.coinswap.Params} */ (
    jspb.Message.getWrapperField(this, proto.irismod.coinswap.Params, 1));
};


/**
 * @param {?proto.irismod.coinswap.Params|undefined} value
 * @return {!proto.irismod.coinswap.GenesisState} returns this
*/
proto.irismod.coinswap.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.coinswap.GenesisState} returns this
 */
proto.irismod.coinswap.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.coinswap.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string standard_denom = 2;
 * @return {string}
 */
proto.irismod.coinswap.GenesisState.prototype.getStandardDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.coinswap.GenesisState} returns this
 */
proto.irismod.coinswap.GenesisState.prototype.setStandardDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated Pool pool = 3;
 * @return {!Array<!proto.irismod.coinswap.Pool>}
 */
proto.irismod.coinswap.GenesisState.prototype.getPoolList = function() {
  return /** @type{!Array<!proto.irismod.coinswap.Pool>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.irismod.coinswap.Pool, 3));
};


/**
 * @param {!Array<!proto.irismod.coinswap.Pool>} value
 * @return {!proto.irismod.coinswap.GenesisState} returns this
*/
proto.irismod.coinswap.GenesisState.prototype.setPoolList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.irismod.coinswap.Pool=} opt_value
 * @param {number=} opt_index
 * @return {!proto.irismod.coinswap.Pool}
 */
proto.irismod.coinswap.GenesisState.prototype.addPool = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.irismod.coinswap.Pool, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.coinswap.GenesisState} returns this
 */
proto.irismod.coinswap.GenesisState.prototype.clearPoolList = function() {
  return this.setPoolList([]);
};


/**
 * optional uint64 sequence = 4;
 * @return {number}
 */
proto.irismod.coinswap.GenesisState.prototype.getSequence = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.coinswap.GenesisState} returns this
 */
proto.irismod.coinswap.GenesisState.prototype.setSequence = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};

