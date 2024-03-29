// source: neutron/interchainqueries/tx.proto
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

goog.provide('proto.neutron.interchainqueries.StorageValue');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tendermint.crypto.ProofOps');

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
proto.neutron.interchainqueries.StorageValue = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.neutron.interchainqueries.StorageValue, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.neutron.interchainqueries.StorageValue.displayName = 'proto.neutron.interchainqueries.StorageValue';
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
proto.neutron.interchainqueries.StorageValue.prototype.toObject = function(opt_includeInstance) {
  return proto.neutron.interchainqueries.StorageValue.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.neutron.interchainqueries.StorageValue} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchainqueries.StorageValue.toObject = function(includeInstance, msg) {
  var f, obj = {
    storagePrefix: jspb.Message.getFieldWithDefault(msg, 1, ""),
    key: msg.getKey_asB64(),
    value: msg.getValue_asB64(),
    proof: (f = msg.getProof()) && proto.tendermint.crypto.ProofOps.toObject(includeInstance, f)
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
 * @return {!proto.neutron.interchainqueries.StorageValue}
 */
proto.neutron.interchainqueries.StorageValue.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.neutron.interchainqueries.StorageValue;
  return proto.neutron.interchainqueries.StorageValue.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.neutron.interchainqueries.StorageValue} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.neutron.interchainqueries.StorageValue}
 */
proto.neutron.interchainqueries.StorageValue.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setStoragePrefix(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setKey(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setValue(value);
      break;
    case 4:
      var value = new proto.tendermint.crypto.ProofOps;
      reader.readMessage(value,proto.tendermint.crypto.ProofOps.deserializeBinaryFromReader);
      msg.setProof(value);
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
proto.neutron.interchainqueries.StorageValue.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.neutron.interchainqueries.StorageValue.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.neutron.interchainqueries.StorageValue} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchainqueries.StorageValue.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getStoragePrefix();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getKey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getValue_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getProof();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.tendermint.crypto.ProofOps.serializeBinaryToWriter
    );
  }
};


/**
 * optional string storage_prefix = 1;
 * @return {string}
 */
proto.neutron.interchainqueries.StorageValue.prototype.getStoragePrefix = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchainqueries.StorageValue} returns this
 */
proto.neutron.interchainqueries.StorageValue.prototype.setStoragePrefix = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bytes key = 2;
 * @return {string}
 */
proto.neutron.interchainqueries.StorageValue.prototype.getKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes key = 2;
 * This is a type-conversion wrapper around `getKey()`
 * @return {string}
 */
proto.neutron.interchainqueries.StorageValue.prototype.getKey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getKey()));
};


/**
 * optional bytes key = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getKey()`
 * @return {!Uint8Array}
 */
proto.neutron.interchainqueries.StorageValue.prototype.getKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getKey()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.neutron.interchainqueries.StorageValue} returns this
 */
proto.neutron.interchainqueries.StorageValue.prototype.setKey = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional bytes value = 3;
 * @return {string}
 */
proto.neutron.interchainqueries.StorageValue.prototype.getValue = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes value = 3;
 * This is a type-conversion wrapper around `getValue()`
 * @return {string}
 */
proto.neutron.interchainqueries.StorageValue.prototype.getValue_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getValue()));
};


/**
 * optional bytes value = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getValue()`
 * @return {!Uint8Array}
 */
proto.neutron.interchainqueries.StorageValue.prototype.getValue_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getValue()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.neutron.interchainqueries.StorageValue} returns this
 */
proto.neutron.interchainqueries.StorageValue.prototype.setValue = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional tendermint.crypto.ProofOps Proof = 4;
 * @return {?proto.tendermint.crypto.ProofOps}
 */
proto.neutron.interchainqueries.StorageValue.prototype.getProof = function() {
  return /** @type{?proto.tendermint.crypto.ProofOps} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.crypto.ProofOps, 4));
};


/**
 * @param {?proto.tendermint.crypto.ProofOps|undefined} value
 * @return {!proto.neutron.interchainqueries.StorageValue} returns this
*/
proto.neutron.interchainqueries.StorageValue.prototype.setProof = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.neutron.interchainqueries.StorageValue} returns this
 */
proto.neutron.interchainqueries.StorageValue.prototype.clearProof = function() {
  return this.setProof(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.neutron.interchainqueries.StorageValue.prototype.hasProof = function() {
  return jspb.Message.getField(this, 4) != null;
};


