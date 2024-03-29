// source: OmniFlix/itc/v1/itc.proto
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

goog.provide('proto.OmniFlix.itc.v1.Distribution');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');

goog.forwardDeclare('proto.OmniFlix.itc.v1.DistributionType');
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
proto.OmniFlix.itc.v1.Distribution = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.OmniFlix.itc.v1.Distribution, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.OmniFlix.itc.v1.Distribution.displayName = 'proto.OmniFlix.itc.v1.Distribution';
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
proto.OmniFlix.itc.v1.Distribution.prototype.toObject = function(opt_includeInstance) {
  return proto.OmniFlix.itc.v1.Distribution.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.OmniFlix.itc.v1.Distribution} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.itc.v1.Distribution.toObject = function(includeInstance, msg) {
  var f, obj = {
    type: jspb.Message.getFieldWithDefault(msg, 1, 0),
    streamDuration: (f = msg.getStreamDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f)
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
 * @return {!proto.OmniFlix.itc.v1.Distribution}
 */
proto.OmniFlix.itc.v1.Distribution.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.OmniFlix.itc.v1.Distribution;
  return proto.OmniFlix.itc.v1.Distribution.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.OmniFlix.itc.v1.Distribution} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.OmniFlix.itc.v1.Distribution}
 */
proto.OmniFlix.itc.v1.Distribution.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.OmniFlix.itc.v1.DistributionType} */ (reader.readEnum());
      msg.setType(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setStreamDuration(value);
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
proto.OmniFlix.itc.v1.Distribution.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.OmniFlix.itc.v1.Distribution.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.OmniFlix.itc.v1.Distribution} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.itc.v1.Distribution.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getType();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getStreamDuration();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
};


/**
 * optional DistributionType type = 1;
 * @return {!proto.OmniFlix.itc.v1.DistributionType}
 */
proto.OmniFlix.itc.v1.Distribution.prototype.getType = function() {
  return /** @type {!proto.OmniFlix.itc.v1.DistributionType} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.OmniFlix.itc.v1.DistributionType} value
 * @return {!proto.OmniFlix.itc.v1.Distribution} returns this
 */
proto.OmniFlix.itc.v1.Distribution.prototype.setType = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional google.protobuf.Duration stream_duration = 2;
 * @return {?proto.google.protobuf.Duration}
 */
proto.OmniFlix.itc.v1.Distribution.prototype.getStreamDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 2));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.OmniFlix.itc.v1.Distribution} returns this
*/
proto.OmniFlix.itc.v1.Distribution.prototype.setStreamDuration = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.itc.v1.Distribution} returns this
 */
proto.OmniFlix.itc.v1.Distribution.prototype.clearStreamDuration = function() {
  return this.setStreamDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.itc.v1.Distribution.prototype.hasStreamDuration = function() {
  return jspb.Message.getField(this, 2) != null;
};


