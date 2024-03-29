// source: shentu/burrow/payload.proto
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

goog.provide('proto.payload.CallTx');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.payload.ContractMeta');
goog.require('proto.payload.TxInput');

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
proto.payload.CallTx = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.payload.CallTx.repeatedFields_, null);
};
goog.inherits(proto.payload.CallTx, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.payload.CallTx.displayName = 'proto.payload.CallTx';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.payload.CallTx.repeatedFields_ = [7];



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
proto.payload.CallTx.prototype.toObject = function(opt_includeInstance) {
  return proto.payload.CallTx.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.payload.CallTx} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.payload.CallTx.toObject = function(includeInstance, msg) {
  var f, obj = {
    input: (f = msg.getInput()) && proto.payload.TxInput.toObject(includeInstance, f),
    address: msg.getAddress_asB64(),
    gaslimit: jspb.Message.getFieldWithDefault(msg, 3, 0),
    fee: jspb.Message.getFieldWithDefault(msg, 4, 0),
    data: msg.getData_asB64(),
    wasm: msg.getWasm_asB64(),
    contractmetaList: jspb.Message.toObjectList(msg.getContractmetaList(),
    proto.payload.ContractMeta.toObject, includeInstance),
    gasprice: jspb.Message.getFieldWithDefault(msg, 8, 0)
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
 * @return {!proto.payload.CallTx}
 */
proto.payload.CallTx.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.payload.CallTx;
  return proto.payload.CallTx.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.payload.CallTx} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.payload.CallTx}
 */
proto.payload.CallTx.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.payload.TxInput;
      reader.readMessage(value,proto.payload.TxInput.deserializeBinaryFromReader);
      msg.setInput(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAddress(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGaslimit(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setFee(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setData(value);
      break;
    case 6:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setWasm(value);
      break;
    case 7:
      var value = new proto.payload.ContractMeta;
      reader.readMessage(value,proto.payload.ContractMeta.deserializeBinaryFromReader);
      msg.addContractmeta(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGasprice(value);
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
proto.payload.CallTx.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.payload.CallTx.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.payload.CallTx} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.payload.CallTx.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getInput();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.payload.TxInput.serializeBinaryToWriter
    );
  }
  f = message.getAddress_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getGaslimit();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getFee();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getData_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
  f = message.getWasm_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      6,
      f
    );
  }
  f = message.getContractmetaList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.payload.ContractMeta.serializeBinaryToWriter
    );
  }
  f = message.getGasprice();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
};


/**
 * optional TxInput Input = 1;
 * @return {?proto.payload.TxInput}
 */
proto.payload.CallTx.prototype.getInput = function() {
  return /** @type{?proto.payload.TxInput} */ (
    jspb.Message.getWrapperField(this, proto.payload.TxInput, 1));
};


/**
 * @param {?proto.payload.TxInput|undefined} value
 * @return {!proto.payload.CallTx} returns this
*/
proto.payload.CallTx.prototype.setInput = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.payload.CallTx} returns this
 */
proto.payload.CallTx.prototype.clearInput = function() {
  return this.setInput(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.payload.CallTx.prototype.hasInput = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional bytes Address = 2;
 * @return {string}
 */
proto.payload.CallTx.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes Address = 2;
 * This is a type-conversion wrapper around `getAddress()`
 * @return {string}
 */
proto.payload.CallTx.prototype.getAddress_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAddress()));
};


/**
 * optional bytes Address = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAddress()`
 * @return {!Uint8Array}
 */
proto.payload.CallTx.prototype.getAddress_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAddress()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.payload.CallTx} returns this
 */
proto.payload.CallTx.prototype.setAddress = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional uint64 GasLimit = 3;
 * @return {number}
 */
proto.payload.CallTx.prototype.getGaslimit = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.payload.CallTx} returns this
 */
proto.payload.CallTx.prototype.setGaslimit = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 Fee = 4;
 * @return {number}
 */
proto.payload.CallTx.prototype.getFee = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.payload.CallTx} returns this
 */
proto.payload.CallTx.prototype.setFee = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional bytes Data = 5;
 * @return {string}
 */
proto.payload.CallTx.prototype.getData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes Data = 5;
 * This is a type-conversion wrapper around `getData()`
 * @return {string}
 */
proto.payload.CallTx.prototype.getData_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getData()));
};


/**
 * optional bytes Data = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getData()`
 * @return {!Uint8Array}
 */
proto.payload.CallTx.prototype.getData_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getData()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.payload.CallTx} returns this
 */
proto.payload.CallTx.prototype.setData = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


/**
 * optional bytes WASM = 6;
 * @return {string}
 */
proto.payload.CallTx.prototype.getWasm = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * optional bytes WASM = 6;
 * This is a type-conversion wrapper around `getWasm()`
 * @return {string}
 */
proto.payload.CallTx.prototype.getWasm_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getWasm()));
};


/**
 * optional bytes WASM = 6;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getWasm()`
 * @return {!Uint8Array}
 */
proto.payload.CallTx.prototype.getWasm_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getWasm()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.payload.CallTx} returns this
 */
proto.payload.CallTx.prototype.setWasm = function(value) {
  return jspb.Message.setProto3BytesField(this, 6, value);
};


/**
 * repeated ContractMeta ContractMeta = 7;
 * @return {!Array<!proto.payload.ContractMeta>}
 */
proto.payload.CallTx.prototype.getContractmetaList = function() {
  return /** @type{!Array<!proto.payload.ContractMeta>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.payload.ContractMeta, 7));
};


/**
 * @param {!Array<!proto.payload.ContractMeta>} value
 * @return {!proto.payload.CallTx} returns this
*/
proto.payload.CallTx.prototype.setContractmetaList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.payload.ContractMeta=} opt_value
 * @param {number=} opt_index
 * @return {!proto.payload.ContractMeta}
 */
proto.payload.CallTx.prototype.addContractmeta = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.payload.ContractMeta, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.payload.CallTx} returns this
 */
proto.payload.CallTx.prototype.clearContractmetaList = function() {
  return this.setContractmetaList([]);
};


/**
 * optional uint64 GasPrice = 8;
 * @return {number}
 */
proto.payload.CallTx.prototype.getGasprice = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.payload.CallTx} returns this
 */
proto.payload.CallTx.prototype.setGasprice = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


