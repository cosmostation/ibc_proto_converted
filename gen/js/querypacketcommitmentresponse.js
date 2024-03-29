// source: ibc/core/channel/v1/query.proto
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

goog.provide('proto.ibc.core.channel.v1.QueryPacketCommitmentResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ibc.core.client.v1.Height');

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
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.core.channel.v1.QueryPacketCommitmentResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.displayName = 'proto.ibc.core.channel.v1.QueryPacketCommitmentResponse';
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
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.core.channel.v1.QueryPacketCommitmentResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    commitment: msg.getCommitment_asB64(),
    proof: msg.getProof_asB64(),
    proofHeight: (f = msg.getProofHeight()) && proto.ibc.core.client.v1.Height.toObject(includeInstance, f)
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
 * @return {!proto.ibc.core.channel.v1.QueryPacketCommitmentResponse}
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.core.channel.v1.QueryPacketCommitmentResponse;
  return proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.core.channel.v1.QueryPacketCommitmentResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.core.channel.v1.QueryPacketCommitmentResponse}
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setCommitment(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setProof(value);
      break;
    case 3:
      var value = new proto.ibc.core.client.v1.Height;
      reader.readMessage(value,proto.ibc.core.client.v1.Height.deserializeBinaryFromReader);
      msg.setProofHeight(value);
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
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.core.channel.v1.QueryPacketCommitmentResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCommitment_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getProof_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getProofHeight();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.ibc.core.client.v1.Height.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes commitment = 1;
 * @return {string}
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.getCommitment = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes commitment = 1;
 * This is a type-conversion wrapper around `getCommitment()`
 * @return {string}
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.getCommitment_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getCommitment()));
};


/**
 * optional bytes commitment = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getCommitment()`
 * @return {!Uint8Array}
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.getCommitment_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getCommitment()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ibc.core.channel.v1.QueryPacketCommitmentResponse} returns this
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.setCommitment = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes proof = 2;
 * @return {string}
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.getProof = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes proof = 2;
 * This is a type-conversion wrapper around `getProof()`
 * @return {string}
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.getProof_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getProof()));
};


/**
 * optional bytes proof = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getProof()`
 * @return {!Uint8Array}
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.getProof_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getProof()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ibc.core.channel.v1.QueryPacketCommitmentResponse} returns this
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.setProof = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional ibc.core.client.v1.Height proof_height = 3;
 * @return {?proto.ibc.core.client.v1.Height}
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.getProofHeight = function() {
  return /** @type{?proto.ibc.core.client.v1.Height} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.client.v1.Height, 3));
};


/**
 * @param {?proto.ibc.core.client.v1.Height|undefined} value
 * @return {!proto.ibc.core.channel.v1.QueryPacketCommitmentResponse} returns this
*/
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.setProofHeight = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.core.channel.v1.QueryPacketCommitmentResponse} returns this
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.clearProofHeight = function() {
  return this.setProofHeight(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.core.channel.v1.QueryPacketCommitmentResponse.prototype.hasProofHeight = function() {
  return jspb.Message.getField(this, 3) != null;
};


