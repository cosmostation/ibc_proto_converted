// source: cosmos/tx/v1beta1/service.proto
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

goog.provide('proto.cosmos.tx.v1beta1.TxDecodeAminoRequest');

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
proto.cosmos.tx.v1beta1.TxDecodeAminoRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.tx.v1beta1.TxDecodeAminoRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.displayName = 'proto.cosmos.tx.v1beta1.TxDecodeAminoRequest';
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
proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.tx.v1beta1.TxDecodeAminoRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    aminoBinary: msg.getAminoBinary_asB64()
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
 * @return {!proto.cosmos.tx.v1beta1.TxDecodeAminoRequest}
 */
proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.tx.v1beta1.TxDecodeAminoRequest;
  return proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.tx.v1beta1.TxDecodeAminoRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.tx.v1beta1.TxDecodeAminoRequest}
 */
proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAminoBinary(value);
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
proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.tx.v1beta1.TxDecodeAminoRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAminoBinary_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
};


/**
 * optional bytes amino_binary = 1;
 * @return {string}
 */
proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.prototype.getAminoBinary = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes amino_binary = 1;
 * This is a type-conversion wrapper around `getAminoBinary()`
 * @return {string}
 */
proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.prototype.getAminoBinary_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAminoBinary()));
};


/**
 * optional bytes amino_binary = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAminoBinary()`
 * @return {!Uint8Array}
 */
proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.prototype.getAminoBinary_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAminoBinary()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmos.tx.v1beta1.TxDecodeAminoRequest} returns this
 */
proto.cosmos.tx.v1beta1.TxDecodeAminoRequest.prototype.setAminoBinary = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};

