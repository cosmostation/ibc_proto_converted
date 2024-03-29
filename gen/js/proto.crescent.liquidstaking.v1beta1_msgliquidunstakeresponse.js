// source: crescent/liquidstaking/v1beta1/tx.proto
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

goog.provide('proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');

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
proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.displayName = 'proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse';
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
proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    completionTime: (f = msg.getCompletionTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse}
 */
proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse;
  return proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse}
 */
proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCompletionTime(value);
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
proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCompletionTime();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional google.protobuf.Timestamp completion_time = 1;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.prototype.getCompletionTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 1));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse} returns this
*/
proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.prototype.setCompletionTime = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse} returns this
 */
proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.prototype.clearCompletionTime = function() {
  return this.setCompletionTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.liquidstaking.v1beta1.MsgLiquidUnstakeResponse.prototype.hasCompletionTime = function() {
  return jspb.Message.getField(this, 1) != null;
};


