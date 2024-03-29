// source: injective/peggy/v1/events.proto
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

goog.provide('proto.injective.peggy.v1.EventAttestationObserved');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.injective.peggy.v1.ClaimType');
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
proto.injective.peggy.v1.EventAttestationObserved = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.peggy.v1.EventAttestationObserved, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.peggy.v1.EventAttestationObserved.displayName = 'proto.injective.peggy.v1.EventAttestationObserved';
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
proto.injective.peggy.v1.EventAttestationObserved.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.peggy.v1.EventAttestationObserved.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.peggy.v1.EventAttestationObserved} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.EventAttestationObserved.toObject = function(includeInstance, msg) {
  var f, obj = {
    attestationType: jspb.Message.getFieldWithDefault(msg, 1, 0),
    bridgeContract: jspb.Message.getFieldWithDefault(msg, 2, ""),
    bridgeChainId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    attestationId: msg.getAttestationId_asB64(),
    nonce: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.injective.peggy.v1.EventAttestationObserved}
 */
proto.injective.peggy.v1.EventAttestationObserved.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.peggy.v1.EventAttestationObserved;
  return proto.injective.peggy.v1.EventAttestationObserved.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.peggy.v1.EventAttestationObserved} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.peggy.v1.EventAttestationObserved}
 */
proto.injective.peggy.v1.EventAttestationObserved.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.injective.peggy.v1.ClaimType} */ (reader.readEnum());
      msg.setAttestationType(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setBridgeContract(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBridgeChainId(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAttestationId(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setNonce(value);
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
proto.injective.peggy.v1.EventAttestationObserved.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.peggy.v1.EventAttestationObserved.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.peggy.v1.EventAttestationObserved} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.EventAttestationObserved.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAttestationType();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getBridgeContract();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getBridgeChainId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getAttestationId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getNonce();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
};


/**
 * optional ClaimType attestation_type = 1;
 * @return {!proto.injective.peggy.v1.ClaimType}
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.getAttestationType = function() {
  return /** @type {!proto.injective.peggy.v1.ClaimType} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.injective.peggy.v1.ClaimType} value
 * @return {!proto.injective.peggy.v1.EventAttestationObserved} returns this
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.setAttestationType = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional string bridge_contract = 2;
 * @return {string}
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.getBridgeContract = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.EventAttestationObserved} returns this
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.setBridgeContract = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 bridge_chain_id = 3;
 * @return {number}
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.getBridgeChainId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.EventAttestationObserved} returns this
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.setBridgeChainId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional bytes attestation_id = 4;
 * @return {string}
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.getAttestationId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes attestation_id = 4;
 * This is a type-conversion wrapper around `getAttestationId()`
 * @return {string}
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.getAttestationId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAttestationId()));
};


/**
 * optional bytes attestation_id = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAttestationId()`
 * @return {!Uint8Array}
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.getAttestationId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAttestationId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.peggy.v1.EventAttestationObserved} returns this
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.setAttestationId = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional uint64 nonce = 5;
 * @return {number}
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.getNonce = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.EventAttestationObserved} returns this
 */
proto.injective.peggy.v1.EventAttestationObserved.prototype.setNonce = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


