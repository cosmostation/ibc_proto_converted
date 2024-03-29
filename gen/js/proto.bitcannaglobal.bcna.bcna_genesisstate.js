// source: bcna/bcna/genesis.proto
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

goog.provide('proto.bitcannaglobal.bcna.bcna.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.bitcannaglobal.bcna.bcna.Bitcannaid');
goog.require('proto.bitcannaglobal.bcna.bcna.Params');
goog.require('proto.bitcannaglobal.bcna.bcna.Supplychain');

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
proto.bitcannaglobal.bcna.bcna.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.bitcannaglobal.bcna.bcna.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.bitcannaglobal.bcna.bcna.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.bitcannaglobal.bcna.bcna.GenesisState.displayName = 'proto.bitcannaglobal.bcna.bcna.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.repeatedFields_ = [2,4];



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
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.bitcannaglobal.bcna.bcna.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.bitcannaglobal.bcna.bcna.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.bitcannaglobal.bcna.bcna.Params.toObject(includeInstance, f),
    bitcannaidlistList: jspb.Message.toObjectList(msg.getBitcannaidlistList(),
    proto.bitcannaglobal.bcna.bcna.Bitcannaid.toObject, includeInstance),
    bitcannaidcount: jspb.Message.getFieldWithDefault(msg, 3, 0),
    supplychainlistList: jspb.Message.toObjectList(msg.getSupplychainlistList(),
    proto.bitcannaglobal.bcna.bcna.Supplychain.toObject, includeInstance),
    supplychaincount: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.bitcannaglobal.bcna.bcna.GenesisState}
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.bitcannaglobal.bcna.bcna.GenesisState;
  return proto.bitcannaglobal.bcna.bcna.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.bitcannaglobal.bcna.bcna.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.bitcannaglobal.bcna.bcna.GenesisState}
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.bitcannaglobal.bcna.bcna.Params;
      reader.readMessage(value,proto.bitcannaglobal.bcna.bcna.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.bitcannaglobal.bcna.bcna.Bitcannaid;
      reader.readMessage(value,proto.bitcannaglobal.bcna.bcna.Bitcannaid.deserializeBinaryFromReader);
      msg.addBitcannaidlist(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBitcannaidcount(value);
      break;
    case 4:
      var value = new proto.bitcannaglobal.bcna.bcna.Supplychain;
      reader.readMessage(value,proto.bitcannaglobal.bcna.bcna.Supplychain.deserializeBinaryFromReader);
      msg.addSupplychainlist(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSupplychaincount(value);
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
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.bitcannaglobal.bcna.bcna.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.bitcannaglobal.bcna.bcna.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.bitcannaglobal.bcna.bcna.Params.serializeBinaryToWriter
    );
  }
  f = message.getBitcannaidlistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.bitcannaglobal.bcna.bcna.Bitcannaid.serializeBinaryToWriter
    );
  }
  f = message.getBitcannaidcount();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getSupplychainlistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.bitcannaglobal.bcna.bcna.Supplychain.serializeBinaryToWriter
    );
  }
  f = message.getSupplychaincount();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.bitcannaglobal.bcna.bcna.Params}
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.bitcannaglobal.bcna.bcna.Params} */ (
    jspb.Message.getWrapperField(this, proto.bitcannaglobal.bcna.bcna.Params, 1));
};


/**
 * @param {?proto.bitcannaglobal.bcna.bcna.Params|undefined} value
 * @return {!proto.bitcannaglobal.bcna.bcna.GenesisState} returns this
*/
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.bitcannaglobal.bcna.bcna.GenesisState} returns this
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Bitcannaid bitcannaidList = 2;
 * @return {!Array<!proto.bitcannaglobal.bcna.bcna.Bitcannaid>}
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.getBitcannaidlistList = function() {
  return /** @type{!Array<!proto.bitcannaglobal.bcna.bcna.Bitcannaid>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.bitcannaglobal.bcna.bcna.Bitcannaid, 2));
};


/**
 * @param {!Array<!proto.bitcannaglobal.bcna.bcna.Bitcannaid>} value
 * @return {!proto.bitcannaglobal.bcna.bcna.GenesisState} returns this
*/
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.setBitcannaidlistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.bitcannaglobal.bcna.bcna.Bitcannaid=} opt_value
 * @param {number=} opt_index
 * @return {!proto.bitcannaglobal.bcna.bcna.Bitcannaid}
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.addBitcannaidlist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.bitcannaglobal.bcna.bcna.Bitcannaid, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.bitcannaglobal.bcna.bcna.GenesisState} returns this
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.clearBitcannaidlistList = function() {
  return this.setBitcannaidlistList([]);
};


/**
 * optional uint64 bitcannaidCount = 3;
 * @return {number}
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.getBitcannaidcount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.bitcannaglobal.bcna.bcna.GenesisState} returns this
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.setBitcannaidcount = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * repeated Supplychain supplychainList = 4;
 * @return {!Array<!proto.bitcannaglobal.bcna.bcna.Supplychain>}
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.getSupplychainlistList = function() {
  return /** @type{!Array<!proto.bitcannaglobal.bcna.bcna.Supplychain>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.bitcannaglobal.bcna.bcna.Supplychain, 4));
};


/**
 * @param {!Array<!proto.bitcannaglobal.bcna.bcna.Supplychain>} value
 * @return {!proto.bitcannaglobal.bcna.bcna.GenesisState} returns this
*/
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.setSupplychainlistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.bitcannaglobal.bcna.bcna.Supplychain=} opt_value
 * @param {number=} opt_index
 * @return {!proto.bitcannaglobal.bcna.bcna.Supplychain}
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.addSupplychainlist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.bitcannaglobal.bcna.bcna.Supplychain, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.bitcannaglobal.bcna.bcna.GenesisState} returns this
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.clearSupplychainlistList = function() {
  return this.setSupplychainlistList([]);
};


/**
 * optional uint64 supplychainCount = 5;
 * @return {number}
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.getSupplychaincount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.bitcannaglobal.bcna.bcna.GenesisState} returns this
 */
proto.bitcannaglobal.bcna.bcna.GenesisState.prototype.setSupplychaincount = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


