// source: provenance/metadata/v1/query.proto
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

goog.provide('proto.provenance.metadata.v1.OSLocatorParamsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.OSLocatorParams');
goog.require('proto.provenance.metadata.v1.OSLocatorParamsRequest');

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
proto.provenance.metadata.v1.OSLocatorParamsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.metadata.v1.OSLocatorParamsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.OSLocatorParamsResponse.displayName = 'proto.provenance.metadata.v1.OSLocatorParamsResponse';
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
proto.provenance.metadata.v1.OSLocatorParamsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.OSLocatorParamsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.OSLocatorParamsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.OSLocatorParamsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.provenance.metadata.v1.OSLocatorParams.toObject(includeInstance, f),
    request: (f = msg.getRequest()) && proto.provenance.metadata.v1.OSLocatorParamsRequest.toObject(includeInstance, f)
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
 * @return {!proto.provenance.metadata.v1.OSLocatorParamsResponse}
 */
proto.provenance.metadata.v1.OSLocatorParamsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.OSLocatorParamsResponse;
  return proto.provenance.metadata.v1.OSLocatorParamsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.OSLocatorParamsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.OSLocatorParamsResponse}
 */
proto.provenance.metadata.v1.OSLocatorParamsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.metadata.v1.OSLocatorParams;
      reader.readMessage(value,proto.provenance.metadata.v1.OSLocatorParams.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 98:
      var value = new proto.provenance.metadata.v1.OSLocatorParamsRequest;
      reader.readMessage(value,proto.provenance.metadata.v1.OSLocatorParamsRequest.deserializeBinaryFromReader);
      msg.setRequest(value);
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
proto.provenance.metadata.v1.OSLocatorParamsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.OSLocatorParamsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.OSLocatorParamsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.OSLocatorParamsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.provenance.metadata.v1.OSLocatorParams.serializeBinaryToWriter
    );
  }
  f = message.getRequest();
  if (f != null) {
    writer.writeMessage(
      98,
      f,
      proto.provenance.metadata.v1.OSLocatorParamsRequest.serializeBinaryToWriter
    );
  }
};


/**
 * optional OSLocatorParams params = 1;
 * @return {?proto.provenance.metadata.v1.OSLocatorParams}
 */
proto.provenance.metadata.v1.OSLocatorParamsResponse.prototype.getParams = function() {
  return /** @type{?proto.provenance.metadata.v1.OSLocatorParams} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.OSLocatorParams, 1));
};


/**
 * @param {?proto.provenance.metadata.v1.OSLocatorParams|undefined} value
 * @return {!proto.provenance.metadata.v1.OSLocatorParamsResponse} returns this
*/
proto.provenance.metadata.v1.OSLocatorParamsResponse.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.OSLocatorParamsResponse} returns this
 */
proto.provenance.metadata.v1.OSLocatorParamsResponse.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.OSLocatorParamsResponse.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional OSLocatorParamsRequest request = 98;
 * @return {?proto.provenance.metadata.v1.OSLocatorParamsRequest}
 */
proto.provenance.metadata.v1.OSLocatorParamsResponse.prototype.getRequest = function() {
  return /** @type{?proto.provenance.metadata.v1.OSLocatorParamsRequest} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.OSLocatorParamsRequest, 98));
};


/**
 * @param {?proto.provenance.metadata.v1.OSLocatorParamsRequest|undefined} value
 * @return {!proto.provenance.metadata.v1.OSLocatorParamsResponse} returns this
*/
proto.provenance.metadata.v1.OSLocatorParamsResponse.prototype.setRequest = function(value) {
  return jspb.Message.setWrapperField(this, 98, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.OSLocatorParamsResponse} returns this
 */
proto.provenance.metadata.v1.OSLocatorParamsResponse.prototype.clearRequest = function() {
  return this.setRequest(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.OSLocatorParamsResponse.prototype.hasRequest = function() {
  return jspb.Message.getField(this, 98) != null;
};

