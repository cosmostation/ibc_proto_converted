// source: provenance/metadata/v1/metadata.proto
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

goog.provide('proto.provenance.metadata.v1.ContractSpecIdInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.provenance.metadata.v1.ContractSpecIdInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.metadata.v1.ContractSpecIdInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.ContractSpecIdInfo.displayName = 'proto.provenance.metadata.v1.ContractSpecIdInfo';
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
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.ContractSpecIdInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.ContractSpecIdInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    contractSpecId: msg.getContractSpecId_asB64(),
    contractSpecIdPrefix: msg.getContractSpecIdPrefix_asB64(),
    contractSpecIdContractSpecUuid: msg.getContractSpecIdContractSpecUuid_asB64(),
    contractSpecAddr: jspb.Message.getFieldWithDefault(msg, 4, ""),
    contractSpecUuid: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.provenance.metadata.v1.ContractSpecIdInfo}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.ContractSpecIdInfo;
  return proto.provenance.metadata.v1.ContractSpecIdInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.ContractSpecIdInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.ContractSpecIdInfo}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setContractSpecId(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setContractSpecIdPrefix(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setContractSpecIdContractSpecUuid(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractSpecAddr(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractSpecUuid(value);
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
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.ContractSpecIdInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.ContractSpecIdInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContractSpecId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getContractSpecIdPrefix_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getContractSpecIdContractSpecUuid_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getContractSpecAddr();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getContractSpecUuid();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional bytes contract_spec_id = 1;
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.getContractSpecId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes contract_spec_id = 1;
 * This is a type-conversion wrapper around `getContractSpecId()`
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.getContractSpecId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getContractSpecId()));
};


/**
 * optional bytes contract_spec_id = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getContractSpecId()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.getContractSpecId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getContractSpecId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.ContractSpecIdInfo} returns this
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.setContractSpecId = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes contract_spec_id_prefix = 2;
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.getContractSpecIdPrefix = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes contract_spec_id_prefix = 2;
 * This is a type-conversion wrapper around `getContractSpecIdPrefix()`
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.getContractSpecIdPrefix_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getContractSpecIdPrefix()));
};


/**
 * optional bytes contract_spec_id_prefix = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getContractSpecIdPrefix()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.getContractSpecIdPrefix_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getContractSpecIdPrefix()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.ContractSpecIdInfo} returns this
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.setContractSpecIdPrefix = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional bytes contract_spec_id_contract_spec_uuid = 3;
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.getContractSpecIdContractSpecUuid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes contract_spec_id_contract_spec_uuid = 3;
 * This is a type-conversion wrapper around `getContractSpecIdContractSpecUuid()`
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.getContractSpecIdContractSpecUuid_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getContractSpecIdContractSpecUuid()));
};


/**
 * optional bytes contract_spec_id_contract_spec_uuid = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getContractSpecIdContractSpecUuid()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.getContractSpecIdContractSpecUuid_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getContractSpecIdContractSpecUuid()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.ContractSpecIdInfo} returns this
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.setContractSpecIdContractSpecUuid = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional string contract_spec_addr = 4;
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.getContractSpecAddr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.ContractSpecIdInfo} returns this
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.setContractSpecAddr = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string contract_spec_uuid = 5;
 * @return {string}
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.getContractSpecUuid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.ContractSpecIdInfo} returns this
 */
proto.provenance.metadata.v1.ContractSpecIdInfo.prototype.setContractSpecUuid = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


