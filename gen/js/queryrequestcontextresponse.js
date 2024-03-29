// source: irismod/service/query.proto
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

goog.provide('proto.irismod.service.QueryRequestContextResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.irismod.service.RequestContext');

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
proto.irismod.service.QueryRequestContextResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.irismod.service.QueryRequestContextResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.service.QueryRequestContextResponse.displayName = 'proto.irismod.service.QueryRequestContextResponse';
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
proto.irismod.service.QueryRequestContextResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.service.QueryRequestContextResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.service.QueryRequestContextResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.service.QueryRequestContextResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    requestContext: (f = msg.getRequestContext()) && proto.irismod.service.RequestContext.toObject(includeInstance, f)
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
 * @return {!proto.irismod.service.QueryRequestContextResponse}
 */
proto.irismod.service.QueryRequestContextResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.service.QueryRequestContextResponse;
  return proto.irismod.service.QueryRequestContextResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.service.QueryRequestContextResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.service.QueryRequestContextResponse}
 */
proto.irismod.service.QueryRequestContextResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.irismod.service.RequestContext;
      reader.readMessage(value,proto.irismod.service.RequestContext.deserializeBinaryFromReader);
      msg.setRequestContext(value);
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
proto.irismod.service.QueryRequestContextResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.service.QueryRequestContextResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.service.QueryRequestContextResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.service.QueryRequestContextResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRequestContext();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.irismod.service.RequestContext.serializeBinaryToWriter
    );
  }
};


/**
 * optional RequestContext request_context = 1;
 * @return {?proto.irismod.service.RequestContext}
 */
proto.irismod.service.QueryRequestContextResponse.prototype.getRequestContext = function() {
  return /** @type{?proto.irismod.service.RequestContext} */ (
    jspb.Message.getWrapperField(this, proto.irismod.service.RequestContext, 1));
};


/**
 * @param {?proto.irismod.service.RequestContext|undefined} value
 * @return {!proto.irismod.service.QueryRequestContextResponse} returns this
*/
proto.irismod.service.QueryRequestContextResponse.prototype.setRequestContext = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.service.QueryRequestContextResponse} returns this
 */
proto.irismod.service.QueryRequestContextResponse.prototype.clearRequestContext = function() {
  return this.setRequestContext(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.service.QueryRequestContextResponse.prototype.hasRequestContext = function() {
  return jspb.Message.getField(this, 1) != null;
};


