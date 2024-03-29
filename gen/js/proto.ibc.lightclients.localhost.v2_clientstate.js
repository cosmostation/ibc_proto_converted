// source: ibc/lightclients/localhost/v2/localhost.proto
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

goog.provide('proto.ibc.lightclients.localhost.v2.ClientState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ibc.core.client.v1.Height');

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
proto.ibc.lightclients.localhost.v2.ClientState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.lightclients.localhost.v2.ClientState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.lightclients.localhost.v2.ClientState.displayName = 'proto.ibc.lightclients.localhost.v2.ClientState';
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
proto.ibc.lightclients.localhost.v2.ClientState.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.lightclients.localhost.v2.ClientState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.lightclients.localhost.v2.ClientState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.lightclients.localhost.v2.ClientState.toObject = function(includeInstance, msg) {
  var f, obj = {
    latestHeight: (f = msg.getLatestHeight()) && proto.ibc.core.client.v1.Height.toObject(includeInstance, f)
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
 * @return {!proto.ibc.lightclients.localhost.v2.ClientState}
 */
proto.ibc.lightclients.localhost.v2.ClientState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.lightclients.localhost.v2.ClientState;
  return proto.ibc.lightclients.localhost.v2.ClientState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.lightclients.localhost.v2.ClientState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.lightclients.localhost.v2.ClientState}
 */
proto.ibc.lightclients.localhost.v2.ClientState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.ibc.core.client.v1.Height;
      reader.readMessage(value,proto.ibc.core.client.v1.Height.deserializeBinaryFromReader);
      msg.setLatestHeight(value);
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
proto.ibc.lightclients.localhost.v2.ClientState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.lightclients.localhost.v2.ClientState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.lightclients.localhost.v2.ClientState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.lightclients.localhost.v2.ClientState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLatestHeight();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.ibc.core.client.v1.Height.serializeBinaryToWriter
    );
  }
};


/**
 * optional ibc.core.client.v1.Height latest_height = 1;
 * @return {?proto.ibc.core.client.v1.Height}
 */
proto.ibc.lightclients.localhost.v2.ClientState.prototype.getLatestHeight = function() {
  return /** @type{?proto.ibc.core.client.v1.Height} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.client.v1.Height, 1));
};


/**
 * @param {?proto.ibc.core.client.v1.Height|undefined} value
 * @return {!proto.ibc.lightclients.localhost.v2.ClientState} returns this
*/
proto.ibc.lightclients.localhost.v2.ClientState.prototype.setLatestHeight = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.lightclients.localhost.v2.ClientState} returns this
 */
proto.ibc.lightclients.localhost.v2.ClientState.prototype.clearLatestHeight = function() {
  return this.setLatestHeight(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.lightclients.localhost.v2.ClientState.prototype.hasLatestHeight = function() {
  return jspb.Message.getField(this, 1) != null;
};


