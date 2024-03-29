// source: shentu/cvm/v1alpha1/genesis.proto
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

goog.provide('proto.shentu.cvm.v1alpha1.Contract');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.shentu.cvm.v1alpha1.CVMCode');
goog.require('proto.shentu.cvm.v1alpha1.ContractMeta');
goog.require('proto.shentu.cvm.v1alpha1.Storage');

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
proto.shentu.cvm.v1alpha1.Contract = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.shentu.cvm.v1alpha1.Contract.repeatedFields_, null);
};
goog.inherits(proto.shentu.cvm.v1alpha1.Contract, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.cvm.v1alpha1.Contract.displayName = 'proto.shentu.cvm.v1alpha1.Contract';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.shentu.cvm.v1alpha1.Contract.repeatedFields_ = [3,5];



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
proto.shentu.cvm.v1alpha1.Contract.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.cvm.v1alpha1.Contract.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.cvm.v1alpha1.Contract} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.cvm.v1alpha1.Contract.toObject = function(includeInstance, msg) {
  var f, obj = {
    address: msg.getAddress_asB64(),
    code: (f = msg.getCode()) && proto.shentu.cvm.v1alpha1.CVMCode.toObject(includeInstance, f),
    storageList: jspb.Message.toObjectList(msg.getStorageList(),
    proto.shentu.cvm.v1alpha1.Storage.toObject, includeInstance),
    abi: msg.getAbi_asB64(),
    metaList: jspb.Message.toObjectList(msg.getMetaList(),
    proto.shentu.cvm.v1alpha1.ContractMeta.toObject, includeInstance)
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
 * @return {!proto.shentu.cvm.v1alpha1.Contract}
 */
proto.shentu.cvm.v1alpha1.Contract.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.cvm.v1alpha1.Contract;
  return proto.shentu.cvm.v1alpha1.Contract.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.cvm.v1alpha1.Contract} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.cvm.v1alpha1.Contract}
 */
proto.shentu.cvm.v1alpha1.Contract.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAddress(value);
      break;
    case 2:
      var value = new proto.shentu.cvm.v1alpha1.CVMCode;
      reader.readMessage(value,proto.shentu.cvm.v1alpha1.CVMCode.deserializeBinaryFromReader);
      msg.setCode(value);
      break;
    case 3:
      var value = new proto.shentu.cvm.v1alpha1.Storage;
      reader.readMessage(value,proto.shentu.cvm.v1alpha1.Storage.deserializeBinaryFromReader);
      msg.addStorage(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAbi(value);
      break;
    case 5:
      var value = new proto.shentu.cvm.v1alpha1.ContractMeta;
      reader.readMessage(value,proto.shentu.cvm.v1alpha1.ContractMeta.deserializeBinaryFromReader);
      msg.addMeta(value);
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
proto.shentu.cvm.v1alpha1.Contract.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.cvm.v1alpha1.Contract.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.cvm.v1alpha1.Contract} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.cvm.v1alpha1.Contract.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAddress_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getCode();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.shentu.cvm.v1alpha1.CVMCode.serializeBinaryToWriter
    );
  }
  f = message.getStorageList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.shentu.cvm.v1alpha1.Storage.serializeBinaryToWriter
    );
  }
  f = message.getAbi_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getMetaList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.shentu.cvm.v1alpha1.ContractMeta.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes Address = 1;
 * @return {string}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes Address = 1;
 * This is a type-conversion wrapper around `getAddress()`
 * @return {string}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.getAddress_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAddress()));
};


/**
 * optional bytes Address = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAddress()`
 * @return {!Uint8Array}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.getAddress_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAddress()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.shentu.cvm.v1alpha1.Contract} returns this
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.setAddress = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional CVMCode code = 2;
 * @return {?proto.shentu.cvm.v1alpha1.CVMCode}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.getCode = function() {
  return /** @type{?proto.shentu.cvm.v1alpha1.CVMCode} */ (
    jspb.Message.getWrapperField(this, proto.shentu.cvm.v1alpha1.CVMCode, 2));
};


/**
 * @param {?proto.shentu.cvm.v1alpha1.CVMCode|undefined} value
 * @return {!proto.shentu.cvm.v1alpha1.Contract} returns this
*/
proto.shentu.cvm.v1alpha1.Contract.prototype.setCode = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.cvm.v1alpha1.Contract} returns this
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.clearCode = function() {
  return this.setCode(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.hasCode = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated Storage storage = 3;
 * @return {!Array<!proto.shentu.cvm.v1alpha1.Storage>}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.getStorageList = function() {
  return /** @type{!Array<!proto.shentu.cvm.v1alpha1.Storage>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.shentu.cvm.v1alpha1.Storage, 3));
};


/**
 * @param {!Array<!proto.shentu.cvm.v1alpha1.Storage>} value
 * @return {!proto.shentu.cvm.v1alpha1.Contract} returns this
*/
proto.shentu.cvm.v1alpha1.Contract.prototype.setStorageList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.shentu.cvm.v1alpha1.Storage=} opt_value
 * @param {number=} opt_index
 * @return {!proto.shentu.cvm.v1alpha1.Storage}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.addStorage = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.shentu.cvm.v1alpha1.Storage, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.cvm.v1alpha1.Contract} returns this
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.clearStorageList = function() {
  return this.setStorageList([]);
};


/**
 * optional bytes abi = 4;
 * @return {string}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.getAbi = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes abi = 4;
 * This is a type-conversion wrapper around `getAbi()`
 * @return {string}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.getAbi_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAbi()));
};


/**
 * optional bytes abi = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAbi()`
 * @return {!Uint8Array}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.getAbi_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAbi()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.shentu.cvm.v1alpha1.Contract} returns this
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.setAbi = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * repeated ContractMeta meta = 5;
 * @return {!Array<!proto.shentu.cvm.v1alpha1.ContractMeta>}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.getMetaList = function() {
  return /** @type{!Array<!proto.shentu.cvm.v1alpha1.ContractMeta>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.shentu.cvm.v1alpha1.ContractMeta, 5));
};


/**
 * @param {!Array<!proto.shentu.cvm.v1alpha1.ContractMeta>} value
 * @return {!proto.shentu.cvm.v1alpha1.Contract} returns this
*/
proto.shentu.cvm.v1alpha1.Contract.prototype.setMetaList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.shentu.cvm.v1alpha1.ContractMeta=} opt_value
 * @param {number=} opt_index
 * @return {!proto.shentu.cvm.v1alpha1.ContractMeta}
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.addMeta = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.shentu.cvm.v1alpha1.ContractMeta, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.cvm.v1alpha1.Contract} returns this
 */
proto.shentu.cvm.v1alpha1.Contract.prototype.clearMetaList = function() {
  return this.setMetaList([]);
};


