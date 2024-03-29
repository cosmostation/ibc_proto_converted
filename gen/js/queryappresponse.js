// source: comdex/asset/v1beta1/query.proto
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

goog.provide('proto.comdex.asset.v1beta1.QueryAppResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.asset.v1beta1.AppData');

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
proto.comdex.asset.v1beta1.QueryAppResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.asset.v1beta1.QueryAppResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.asset.v1beta1.QueryAppResponse.displayName = 'proto.comdex.asset.v1beta1.QueryAppResponse';
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
proto.comdex.asset.v1beta1.QueryAppResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.asset.v1beta1.QueryAppResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.asset.v1beta1.QueryAppResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.asset.v1beta1.QueryAppResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    app: (f = msg.getApp()) && proto.comdex.asset.v1beta1.AppData.toObject(includeInstance, f)
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
 * @return {!proto.comdex.asset.v1beta1.QueryAppResponse}
 */
proto.comdex.asset.v1beta1.QueryAppResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.asset.v1beta1.QueryAppResponse;
  return proto.comdex.asset.v1beta1.QueryAppResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.asset.v1beta1.QueryAppResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.asset.v1beta1.QueryAppResponse}
 */
proto.comdex.asset.v1beta1.QueryAppResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.comdex.asset.v1beta1.AppData;
      reader.readMessage(value,proto.comdex.asset.v1beta1.AppData.deserializeBinaryFromReader);
      msg.setApp(value);
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
proto.comdex.asset.v1beta1.QueryAppResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.asset.v1beta1.QueryAppResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.asset.v1beta1.QueryAppResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.asset.v1beta1.QueryAppResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getApp();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.comdex.asset.v1beta1.AppData.serializeBinaryToWriter
    );
  }
};


/**
 * optional AppData app = 1;
 * @return {?proto.comdex.asset.v1beta1.AppData}
 */
proto.comdex.asset.v1beta1.QueryAppResponse.prototype.getApp = function() {
  return /** @type{?proto.comdex.asset.v1beta1.AppData} */ (
    jspb.Message.getWrapperField(this, proto.comdex.asset.v1beta1.AppData, 1));
};


/**
 * @param {?proto.comdex.asset.v1beta1.AppData|undefined} value
 * @return {!proto.comdex.asset.v1beta1.QueryAppResponse} returns this
*/
proto.comdex.asset.v1beta1.QueryAppResponse.prototype.setApp = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.asset.v1beta1.QueryAppResponse} returns this
 */
proto.comdex.asset.v1beta1.QueryAppResponse.prototype.clearApp = function() {
  return this.setApp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.asset.v1beta1.QueryAppResponse.prototype.hasApp = function() {
  return jspb.Message.getField(this, 1) != null;
};


