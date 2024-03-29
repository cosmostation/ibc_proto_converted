// source: axelar/nexus/v1beta1/query.proto
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

goog.provide('proto.axelar.nexus.v1beta1.ChainStateResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.nexus.v1beta1.ChainState');

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
proto.axelar.nexus.v1beta1.ChainStateResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.nexus.v1beta1.ChainStateResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.nexus.v1beta1.ChainStateResponse.displayName = 'proto.axelar.nexus.v1beta1.ChainStateResponse';
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
proto.axelar.nexus.v1beta1.ChainStateResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.nexus.v1beta1.ChainStateResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.nexus.v1beta1.ChainStateResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.ChainStateResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    state: (f = msg.getState()) && proto.axelar.nexus.v1beta1.ChainState.toObject(includeInstance, f)
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
 * @return {!proto.axelar.nexus.v1beta1.ChainStateResponse}
 */
proto.axelar.nexus.v1beta1.ChainStateResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.nexus.v1beta1.ChainStateResponse;
  return proto.axelar.nexus.v1beta1.ChainStateResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.nexus.v1beta1.ChainStateResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.nexus.v1beta1.ChainStateResponse}
 */
proto.axelar.nexus.v1beta1.ChainStateResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.axelar.nexus.v1beta1.ChainState;
      reader.readMessage(value,proto.axelar.nexus.v1beta1.ChainState.deserializeBinaryFromReader);
      msg.setState(value);
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
proto.axelar.nexus.v1beta1.ChainStateResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.nexus.v1beta1.ChainStateResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.nexus.v1beta1.ChainStateResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.v1beta1.ChainStateResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getState();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.axelar.nexus.v1beta1.ChainState.serializeBinaryToWriter
    );
  }
};


/**
 * optional ChainState state = 1;
 * @return {?proto.axelar.nexus.v1beta1.ChainState}
 */
proto.axelar.nexus.v1beta1.ChainStateResponse.prototype.getState = function() {
  return /** @type{?proto.axelar.nexus.v1beta1.ChainState} */ (
    jspb.Message.getWrapperField(this, proto.axelar.nexus.v1beta1.ChainState, 1));
};


/**
 * @param {?proto.axelar.nexus.v1beta1.ChainState|undefined} value
 * @return {!proto.axelar.nexus.v1beta1.ChainStateResponse} returns this
*/
proto.axelar.nexus.v1beta1.ChainStateResponse.prototype.setState = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.v1beta1.ChainStateResponse} returns this
 */
proto.axelar.nexus.v1beta1.ChainStateResponse.prototype.clearState = function() {
  return this.setState(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.v1beta1.ChainStateResponse.prototype.hasState = function() {
  return jspb.Message.getField(this, 1) != null;
};


