// source: injective/exchange/v1beta1/tx.proto
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

goog.provide('proto.injective.exchange.v1beta1.MsgUpdateParams');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.Params');

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
proto.injective.exchange.v1beta1.MsgUpdateParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.MsgUpdateParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.MsgUpdateParams.displayName = 'proto.injective.exchange.v1beta1.MsgUpdateParams';
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
proto.injective.exchange.v1beta1.MsgUpdateParams.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.MsgUpdateParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.MsgUpdateParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.MsgUpdateParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    authority: jspb.Message.getFieldWithDefault(msg, 1, ""),
    params: (f = msg.getParams()) && proto.injective.exchange.v1beta1.Params.toObject(includeInstance, f)
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
 * @return {!proto.injective.exchange.v1beta1.MsgUpdateParams}
 */
proto.injective.exchange.v1beta1.MsgUpdateParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.MsgUpdateParams;
  return proto.injective.exchange.v1beta1.MsgUpdateParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.MsgUpdateParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.MsgUpdateParams}
 */
proto.injective.exchange.v1beta1.MsgUpdateParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAuthority(value);
      break;
    case 2:
      var value = new proto.injective.exchange.v1beta1.Params;
      reader.readMessage(value,proto.injective.exchange.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
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
proto.injective.exchange.v1beta1.MsgUpdateParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.MsgUpdateParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.MsgUpdateParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.MsgUpdateParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAuthority();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.injective.exchange.v1beta1.Params.serializeBinaryToWriter
    );
  }
};


/**
 * optional string authority = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.MsgUpdateParams.prototype.getAuthority = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.MsgUpdateParams} returns this
 */
proto.injective.exchange.v1beta1.MsgUpdateParams.prototype.setAuthority = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional Params params = 2;
 * @return {?proto.injective.exchange.v1beta1.Params}
 */
proto.injective.exchange.v1beta1.MsgUpdateParams.prototype.getParams = function() {
  return /** @type{?proto.injective.exchange.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.injective.exchange.v1beta1.Params, 2));
};


/**
 * @param {?proto.injective.exchange.v1beta1.Params|undefined} value
 * @return {!proto.injective.exchange.v1beta1.MsgUpdateParams} returns this
*/
proto.injective.exchange.v1beta1.MsgUpdateParams.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.exchange.v1beta1.MsgUpdateParams} returns this
 */
proto.injective.exchange.v1beta1.MsgUpdateParams.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.MsgUpdateParams.prototype.hasParams = function() {
  return jspb.Message.getField(this, 2) != null;
};


