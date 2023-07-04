// source: sentinel/swap/v1/querier.proto
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

goog.provide('proto.sentinel.swap.v1.QuerySwapResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.sentinel.swap.v1.Swap');

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
proto.sentinel.swap.v1.QuerySwapResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.sentinel.swap.v1.QuerySwapResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.sentinel.swap.v1.QuerySwapResponse.displayName = 'proto.sentinel.swap.v1.QuerySwapResponse';
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
proto.sentinel.swap.v1.QuerySwapResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.sentinel.swap.v1.QuerySwapResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.sentinel.swap.v1.QuerySwapResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.swap.v1.QuerySwapResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    swap: (f = msg.getSwap()) && proto.sentinel.swap.v1.Swap.toObject(includeInstance, f)
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
 * @return {!proto.sentinel.swap.v1.QuerySwapResponse}
 */
proto.sentinel.swap.v1.QuerySwapResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.sentinel.swap.v1.QuerySwapResponse;
  return proto.sentinel.swap.v1.QuerySwapResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.sentinel.swap.v1.QuerySwapResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.sentinel.swap.v1.QuerySwapResponse}
 */
proto.sentinel.swap.v1.QuerySwapResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.sentinel.swap.v1.Swap;
      reader.readMessage(value,proto.sentinel.swap.v1.Swap.deserializeBinaryFromReader);
      msg.setSwap(value);
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
proto.sentinel.swap.v1.QuerySwapResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.sentinel.swap.v1.QuerySwapResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.sentinel.swap.v1.QuerySwapResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.swap.v1.QuerySwapResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSwap();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.sentinel.swap.v1.Swap.serializeBinaryToWriter
    );
  }
};


/**
 * optional Swap swap = 1;
 * @return {?proto.sentinel.swap.v1.Swap}
 */
proto.sentinel.swap.v1.QuerySwapResponse.prototype.getSwap = function() {
  return /** @type{?proto.sentinel.swap.v1.Swap} */ (
    jspb.Message.getWrapperField(this, proto.sentinel.swap.v1.Swap, 1));
};


/**
 * @param {?proto.sentinel.swap.v1.Swap|undefined} value
 * @return {!proto.sentinel.swap.v1.QuerySwapResponse} returns this
*/
proto.sentinel.swap.v1.QuerySwapResponse.prototype.setSwap = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.swap.v1.QuerySwapResponse} returns this
 */
proto.sentinel.swap.v1.QuerySwapResponse.prototype.clearSwap = function() {
  return this.setSwap(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.swap.v1.QuerySwapResponse.prototype.hasSwap = function() {
  return jspb.Message.getField(this, 1) != null;
};

