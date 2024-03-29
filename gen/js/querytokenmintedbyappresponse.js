// source: comdex/tokenmint/v1beta1/query.proto
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

goog.provide('proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.tokenmint.v1beta1.TokenMint');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');

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
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.displayName = 'proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse';
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
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    tokenmint: (f = msg.getTokenmint()) && proto.comdex.tokenmint.v1beta1.TokenMint.toObject(includeInstance, f),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse}
 */
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse;
  return proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse}
 */
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.comdex.tokenmint.v1beta1.TokenMint;
      reader.readMessage(value,proto.comdex.tokenmint.v1beta1.TokenMint.deserializeBinaryFromReader);
      msg.setTokenmint(value);
      break;
    case 2:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTokenmint();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.comdex.tokenmint.v1beta1.TokenMint.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional TokenMint tokenMint = 1;
 * @return {?proto.comdex.tokenmint.v1beta1.TokenMint}
 */
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.prototype.getTokenmint = function() {
  return /** @type{?proto.comdex.tokenmint.v1beta1.TokenMint} */ (
    jspb.Message.getWrapperField(this, proto.comdex.tokenmint.v1beta1.TokenMint, 1));
};


/**
 * @param {?proto.comdex.tokenmint.v1beta1.TokenMint|undefined} value
 * @return {!proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse} returns this
*/
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.prototype.setTokenmint = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse} returns this
 */
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.prototype.clearTokenmint = function() {
  return this.setTokenmint(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.prototype.hasTokenmint = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse} returns this
*/
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse} returns this
 */
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.tokenmint.v1beta1.QueryTokenMintedByAppResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


