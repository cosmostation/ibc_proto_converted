// source: ibc/core/connection/v1/tx.proto
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

goog.provide('proto.ibc.core.connection.v1.MsgConnectionOpenConfirm');

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
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.core.connection.v1.MsgConnectionOpenConfirm, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.displayName = 'proto.ibc.core.connection.v1.MsgConnectionOpenConfirm';
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
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.core.connection.v1.MsgConnectionOpenConfirm} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.toObject = function(includeInstance, msg) {
  var f, obj = {
    connectionId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    proofAck: msg.getProofAck_asB64(),
    proofHeight: (f = msg.getProofHeight()) && proto.ibc.core.client.v1.Height.toObject(includeInstance, f),
    signer: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenConfirm}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.core.connection.v1.MsgConnectionOpenConfirm;
  return proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.core.connection.v1.MsgConnectionOpenConfirm} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenConfirm}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setConnectionId(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setProofAck(value);
      break;
    case 3:
      var value = new proto.ibc.core.client.v1.Height;
      reader.readMessage(value,proto.ibc.core.client.v1.Height.deserializeBinaryFromReader);
      msg.setProofHeight(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setSigner(value);
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
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.core.connection.v1.MsgConnectionOpenConfirm} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConnectionId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getProofAck_asU8();
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
  f = message.getSigner();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string connection_id = 1;
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.getConnectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenConfirm} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.setConnectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bytes proof_ack = 2;
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.getProofAck = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes proof_ack = 2;
 * This is a type-conversion wrapper around `getProofAck()`
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.getProofAck_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getProofAck()));
};


/**
 * optional bytes proof_ack = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getProofAck()`
 * @return {!Uint8Array}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.getProofAck_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getProofAck()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenConfirm} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.setProofAck = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional ibc.core.client.v1.Height proof_height = 3;
 * @return {?proto.ibc.core.client.v1.Height}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.getProofHeight = function() {
  return /** @type{?proto.ibc.core.client.v1.Height} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.client.v1.Height, 3));
};


/**
 * @param {?proto.ibc.core.client.v1.Height|undefined} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenConfirm} returns this
*/
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.setProofHeight = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenConfirm} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.clearProofHeight = function() {
  return this.setProofHeight(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.hasProofHeight = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string signer = 4;
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.getSigner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenConfirm} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenConfirm.prototype.setSigner = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


