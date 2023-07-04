// source: irismod/token/query.proto
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

goog.provide('proto.irismod.token.QueryParamsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.irismod.token.Params');

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
proto.irismod.token.QueryParamsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.irismod.token.QueryParamsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.token.QueryParamsResponse.displayName = 'proto.irismod.token.QueryParamsResponse';
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
proto.irismod.token.QueryParamsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.token.QueryParamsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.token.QueryParamsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.token.QueryParamsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.irismod.token.Params.toObject(includeInstance, f),
    res: (f = msg.getRes()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.irismod.token.QueryParamsResponse}
 */
proto.irismod.token.QueryParamsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.token.QueryParamsResponse;
  return proto.irismod.token.QueryParamsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.token.QueryParamsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.token.QueryParamsResponse}
 */
proto.irismod.token.QueryParamsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.irismod.token.Params;
      reader.readMessage(value,proto.irismod.token.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setRes(value);
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
proto.irismod.token.QueryParamsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.token.QueryParamsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.token.QueryParamsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.token.QueryParamsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.irismod.token.Params.serializeBinaryToWriter
    );
  }
  f = message.getRes();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.irismod.token.Params}
 */
proto.irismod.token.QueryParamsResponse.prototype.getParams = function() {
  return /** @type{?proto.irismod.token.Params} */ (
    jspb.Message.getWrapperField(this, proto.irismod.token.Params, 1));
};


/**
 * @param {?proto.irismod.token.Params|undefined} value
 * @return {!proto.irismod.token.QueryParamsResponse} returns this
*/
proto.irismod.token.QueryParamsResponse.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.token.QueryParamsResponse} returns this
 */
proto.irismod.token.QueryParamsResponse.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.token.QueryParamsResponse.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse res = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.irismod.token.QueryParamsResponse.prototype.getRes = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.irismod.token.QueryParamsResponse} returns this
*/
proto.irismod.token.QueryParamsResponse.prototype.setRes = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.token.QueryParamsResponse} returns this
 */
proto.irismod.token.QueryParamsResponse.prototype.clearRes = function() {
  return this.setRes(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.token.QueryParamsResponse.prototype.hasRes = function() {
  return jspb.Message.getField(this, 2) != null;
};

