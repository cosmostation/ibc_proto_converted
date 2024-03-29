// source: panacea/did/v2/tx.proto
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

goog.provide('proto.panacea.did.v2.MsgDeactivateDID');

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
proto.panacea.did.v2.MsgDeactivateDID = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.panacea.did.v2.MsgDeactivateDID, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.did.v2.MsgDeactivateDID.displayName = 'proto.panacea.did.v2.MsgDeactivateDID';
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
proto.panacea.did.v2.MsgDeactivateDID.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.did.v2.MsgDeactivateDID.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.did.v2.MsgDeactivateDID} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.did.v2.MsgDeactivateDID.toObject = function(includeInstance, msg) {
  var f, obj = {
    did: jspb.Message.getFieldWithDefault(msg, 1, ""),
    verificationMethodId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    signature: msg.getSignature_asB64(),
    fromAddress: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.panacea.did.v2.MsgDeactivateDID}
 */
proto.panacea.did.v2.MsgDeactivateDID.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.did.v2.MsgDeactivateDID;
  return proto.panacea.did.v2.MsgDeactivateDID.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.did.v2.MsgDeactivateDID} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.did.v2.MsgDeactivateDID}
 */
proto.panacea.did.v2.MsgDeactivateDID.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDid(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setVerificationMethodId(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSignature(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setFromAddress(value);
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
proto.panacea.did.v2.MsgDeactivateDID.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.did.v2.MsgDeactivateDID.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.did.v2.MsgDeactivateDID} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.did.v2.MsgDeactivateDID.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getVerificationMethodId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSignature_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getFromAddress();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string did = 1;
 * @return {string}
 */
proto.panacea.did.v2.MsgDeactivateDID.prototype.getDid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.did.v2.MsgDeactivateDID} returns this
 */
proto.panacea.did.v2.MsgDeactivateDID.prototype.setDid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string verification_method_id = 2;
 * @return {string}
 */
proto.panacea.did.v2.MsgDeactivateDID.prototype.getVerificationMethodId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.did.v2.MsgDeactivateDID} returns this
 */
proto.panacea.did.v2.MsgDeactivateDID.prototype.setVerificationMethodId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bytes signature = 3;
 * @return {string}
 */
proto.panacea.did.v2.MsgDeactivateDID.prototype.getSignature = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes signature = 3;
 * This is a type-conversion wrapper around `getSignature()`
 * @return {string}
 */
proto.panacea.did.v2.MsgDeactivateDID.prototype.getSignature_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSignature()));
};


/**
 * optional bytes signature = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSignature()`
 * @return {!Uint8Array}
 */
proto.panacea.did.v2.MsgDeactivateDID.prototype.getSignature_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSignature()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.panacea.did.v2.MsgDeactivateDID} returns this
 */
proto.panacea.did.v2.MsgDeactivateDID.prototype.setSignature = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional string from_address = 4;
 * @return {string}
 */
proto.panacea.did.v2.MsgDeactivateDID.prototype.getFromAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.did.v2.MsgDeactivateDID} returns this
 */
proto.panacea.did.v2.MsgDeactivateDID.prototype.setFromAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


