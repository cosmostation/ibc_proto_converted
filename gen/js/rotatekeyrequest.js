// source: axelar/tss/v1beta1/tx.proto
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

goog.provide('proto.axelar.tss.v1beta1.RotateKeyRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.axelar.tss.exported.v1beta1.KeyRole');
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
proto.axelar.tss.v1beta1.RotateKeyRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.tss.v1beta1.RotateKeyRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.tss.v1beta1.RotateKeyRequest.displayName = 'proto.axelar.tss.v1beta1.RotateKeyRequest';
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
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.tss.v1beta1.RotateKeyRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.tss.v1beta1.RotateKeyRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: msg.getSender_asB64(),
    chain: jspb.Message.getFieldWithDefault(msg, 2, ""),
    keyRole: jspb.Message.getFieldWithDefault(msg, 3, 0),
    keyId: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.axelar.tss.v1beta1.RotateKeyRequest}
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.tss.v1beta1.RotateKeyRequest;
  return proto.axelar.tss.v1beta1.RotateKeyRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.tss.v1beta1.RotateKeyRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.tss.v1beta1.RotateKeyRequest}
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSender(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setChain(value);
      break;
    case 3:
      var value = /** @type {!proto.axelar.tss.exported.v1beta1.KeyRole} */ (reader.readEnum());
      msg.setKeyRole(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setKeyId(value);
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
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.tss.v1beta1.RotateKeyRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.tss.v1beta1.RotateKeyRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getChain();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getKeyRole();
  if (f !== 0.0) {
    writer.writeEnum(
      3,
      f
    );
  }
  f = message.getKeyId();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional bytes sender = 1;
 * @return {string}
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes sender = 1;
 * This is a type-conversion wrapper around `getSender()`
 * @return {string}
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.getSender_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSender()));
};


/**
 * optional bytes sender = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSender()`
 * @return {!Uint8Array}
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.getSender_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSender()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.tss.v1beta1.RotateKeyRequest} returns this
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.setSender = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional string chain = 2;
 * @return {string}
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.getChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.tss.v1beta1.RotateKeyRequest} returns this
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.setChain = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional axelar.tss.exported.v1beta1.KeyRole key_role = 3;
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRole}
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.getKeyRole = function() {
  return /** @type {!proto.axelar.tss.exported.v1beta1.KeyRole} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {!proto.axelar.tss.exported.v1beta1.KeyRole} value
 * @return {!proto.axelar.tss.v1beta1.RotateKeyRequest} returns this
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.setKeyRole = function(value) {
  return jspb.Message.setProto3EnumField(this, 3, value);
};


/**
 * optional string key_id = 4;
 * @return {string}
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.getKeyId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.tss.v1beta1.RotateKeyRequest} returns this
 */
proto.axelar.tss.v1beta1.RotateKeyRequest.prototype.setKeyId = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


