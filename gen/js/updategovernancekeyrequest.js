// source: axelar/permission/v1beta1/tx.proto
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

goog.provide('proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.crypto.multisig.LegacyAminoPubKey');

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
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.displayName = 'proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest';
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
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: msg.getSender_asB64(),
    governanceKey: (f = msg.getGovernanceKey()) && proto.cosmos.crypto.multisig.LegacyAminoPubKey.toObject(includeInstance, f)
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
 * @return {!proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest}
 */
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest;
  return proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest}
 */
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.cosmos.crypto.multisig.LegacyAminoPubKey;
      reader.readMessage(value,proto.cosmos.crypto.multisig.LegacyAminoPubKey.deserializeBinaryFromReader);
      msg.setGovernanceKey(value);
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
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getGovernanceKey();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.crypto.multisig.LegacyAminoPubKey.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes sender = 1;
 * @return {string}
 */
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes sender = 1;
 * This is a type-conversion wrapper around `getSender()`
 * @return {string}
 */
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.prototype.getSender_asB64 = function() {
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
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.prototype.getSender_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSender()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest} returns this
 */
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.prototype.setSender = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional cosmos.crypto.multisig.LegacyAminoPubKey governance_key = 2;
 * @return {?proto.cosmos.crypto.multisig.LegacyAminoPubKey}
 */
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.prototype.getGovernanceKey = function() {
  return /** @type{?proto.cosmos.crypto.multisig.LegacyAminoPubKey} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.crypto.multisig.LegacyAminoPubKey, 2));
};


/**
 * @param {?proto.cosmos.crypto.multisig.LegacyAminoPubKey|undefined} value
 * @return {!proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest} returns this
*/
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.prototype.setGovernanceKey = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest} returns this
 */
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.prototype.clearGovernanceKey = function() {
  return this.setGovernanceKey(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.permission.v1beta1.UpdateGovernanceKeyRequest.prototype.hasGovernanceKey = function() {
  return jspb.Message.getField(this, 2) != null;
};


