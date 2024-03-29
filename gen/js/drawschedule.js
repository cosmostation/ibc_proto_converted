// source: lum-network/millions/draw_schedule.proto
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

goog.provide('proto.lum.network.millions.DrawSchedule');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');
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
proto.lum.network.millions.DrawSchedule = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lum.network.millions.DrawSchedule, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.millions.DrawSchedule.displayName = 'proto.lum.network.millions.DrawSchedule';
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
proto.lum.network.millions.DrawSchedule.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.millions.DrawSchedule.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.millions.DrawSchedule} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.millions.DrawSchedule.toObject = function(includeInstance, msg) {
  var f, obj = {
    initialDrawAt: (f = msg.getInitialDrawAt()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    drawDelta: (f = msg.getDrawDelta()) && proto.google.protobuf.Duration.toObject(includeInstance, f)
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
 * @return {!proto.lum.network.millions.DrawSchedule}
 */
proto.lum.network.millions.DrawSchedule.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.millions.DrawSchedule;
  return proto.lum.network.millions.DrawSchedule.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.millions.DrawSchedule} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.millions.DrawSchedule}
 */
proto.lum.network.millions.DrawSchedule.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setInitialDrawAt(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setDrawDelta(value);
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
proto.lum.network.millions.DrawSchedule.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.millions.DrawSchedule.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.millions.DrawSchedule} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.millions.DrawSchedule.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getInitialDrawAt();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getDrawDelta();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
};


/**
 * optional google.protobuf.Timestamp initial_draw_at = 1;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.lum.network.millions.DrawSchedule.prototype.getInitialDrawAt = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 1));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.lum.network.millions.DrawSchedule} returns this
*/
proto.lum.network.millions.DrawSchedule.prototype.setInitialDrawAt = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.millions.DrawSchedule} returns this
 */
proto.lum.network.millions.DrawSchedule.prototype.clearInitialDrawAt = function() {
  return this.setInitialDrawAt(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.millions.DrawSchedule.prototype.hasInitialDrawAt = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional google.protobuf.Duration draw_delta = 2;
 * @return {?proto.google.protobuf.Duration}
 */
proto.lum.network.millions.DrawSchedule.prototype.getDrawDelta = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 2));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.lum.network.millions.DrawSchedule} returns this
*/
proto.lum.network.millions.DrawSchedule.prototype.setDrawDelta = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.millions.DrawSchedule} returns this
 */
proto.lum.network.millions.DrawSchedule.prototype.clearDrawDelta = function() {
  return this.setDrawDelta(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.millions.DrawSchedule.prototype.hasDrawDelta = function() {
  return jspb.Message.getField(this, 2) != null;
};


