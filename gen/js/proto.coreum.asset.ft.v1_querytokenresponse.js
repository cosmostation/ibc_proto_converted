// source: coreum/asset/ft/v1/query.proto
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

goog.provide('proto.coreum.asset.ft.v1.QueryTokenResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.coreum.asset.ft.v1.Token');

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
proto.coreum.asset.ft.v1.QueryTokenResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.coreum.asset.ft.v1.QueryTokenResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.coreum.asset.ft.v1.QueryTokenResponse.displayName = 'proto.coreum.asset.ft.v1.QueryTokenResponse';
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
proto.coreum.asset.ft.v1.QueryTokenResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.coreum.asset.ft.v1.QueryTokenResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.coreum.asset.ft.v1.QueryTokenResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.asset.ft.v1.QueryTokenResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    token: (f = msg.getToken()) && proto.coreum.asset.ft.v1.Token.toObject(includeInstance, f)
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
 * @return {!proto.coreum.asset.ft.v1.QueryTokenResponse}
 */
proto.coreum.asset.ft.v1.QueryTokenResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.coreum.asset.ft.v1.QueryTokenResponse;
  return proto.coreum.asset.ft.v1.QueryTokenResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.coreum.asset.ft.v1.QueryTokenResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.coreum.asset.ft.v1.QueryTokenResponse}
 */
proto.coreum.asset.ft.v1.QueryTokenResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.coreum.asset.ft.v1.Token;
      reader.readMessage(value,proto.coreum.asset.ft.v1.Token.deserializeBinaryFromReader);
      msg.setToken(value);
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
proto.coreum.asset.ft.v1.QueryTokenResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.coreum.asset.ft.v1.QueryTokenResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.coreum.asset.ft.v1.QueryTokenResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.asset.ft.v1.QueryTokenResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getToken();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.coreum.asset.ft.v1.Token.serializeBinaryToWriter
    );
  }
};


/**
 * optional Token token = 1;
 * @return {?proto.coreum.asset.ft.v1.Token}
 */
proto.coreum.asset.ft.v1.QueryTokenResponse.prototype.getToken = function() {
  return /** @type{?proto.coreum.asset.ft.v1.Token} */ (
    jspb.Message.getWrapperField(this, proto.coreum.asset.ft.v1.Token, 1));
};


/**
 * @param {?proto.coreum.asset.ft.v1.Token|undefined} value
 * @return {!proto.coreum.asset.ft.v1.QueryTokenResponse} returns this
*/
proto.coreum.asset.ft.v1.QueryTokenResponse.prototype.setToken = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.coreum.asset.ft.v1.QueryTokenResponse} returns this
 */
proto.coreum.asset.ft.v1.QueryTokenResponse.prototype.clearToken = function() {
  return this.setToken(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.coreum.asset.ft.v1.QueryTokenResponse.prototype.hasToken = function() {
  return jspb.Message.getField(this, 1) != null;
};


