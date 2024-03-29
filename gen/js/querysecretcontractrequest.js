// source: secret/compute/v1beta1/query.proto
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

goog.provide('proto.secret.compute.v1beta1.QuerySecretContractRequest');

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
proto.secret.compute.v1beta1.QuerySecretContractRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.secret.compute.v1beta1.QuerySecretContractRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.secret.compute.v1beta1.QuerySecretContractRequest.displayName = 'proto.secret.compute.v1beta1.QuerySecretContractRequest';
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
proto.secret.compute.v1beta1.QuerySecretContractRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.secret.compute.v1beta1.QuerySecretContractRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.secret.compute.v1beta1.QuerySecretContractRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.QuerySecretContractRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    contractAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    query: msg.getQuery_asB64()
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
 * @return {!proto.secret.compute.v1beta1.QuerySecretContractRequest}
 */
proto.secret.compute.v1beta1.QuerySecretContractRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.secret.compute.v1beta1.QuerySecretContractRequest;
  return proto.secret.compute.v1beta1.QuerySecretContractRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.secret.compute.v1beta1.QuerySecretContractRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.secret.compute.v1beta1.QuerySecretContractRequest}
 */
proto.secret.compute.v1beta1.QuerySecretContractRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractAddress(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setQuery(value);
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
proto.secret.compute.v1beta1.QuerySecretContractRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.secret.compute.v1beta1.QuerySecretContractRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.secret.compute.v1beta1.QuerySecretContractRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.QuerySecretContractRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContractAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getQuery_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
};


/**
 * optional string contract_address = 1;
 * @return {string}
 */
proto.secret.compute.v1beta1.QuerySecretContractRequest.prototype.getContractAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.compute.v1beta1.QuerySecretContractRequest} returns this
 */
proto.secret.compute.v1beta1.QuerySecretContractRequest.prototype.setContractAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bytes query = 2;
 * @return {string}
 */
proto.secret.compute.v1beta1.QuerySecretContractRequest.prototype.getQuery = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes query = 2;
 * This is a type-conversion wrapper around `getQuery()`
 * @return {string}
 */
proto.secret.compute.v1beta1.QuerySecretContractRequest.prototype.getQuery_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getQuery()));
};


/**
 * optional bytes query = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getQuery()`
 * @return {!Uint8Array}
 */
proto.secret.compute.v1beta1.QuerySecretContractRequest.prototype.getQuery_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getQuery()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.secret.compute.v1beta1.QuerySecretContractRequest} returns this
 */
proto.secret.compute.v1beta1.QuerySecretContractRequest.prototype.setQuery = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


