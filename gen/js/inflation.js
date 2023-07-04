// source: sentinel/mint/v1/inflation.proto
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

goog.provide('proto.sentinel.mint.v1.Inflation');

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
proto.sentinel.mint.v1.Inflation = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.sentinel.mint.v1.Inflation, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.sentinel.mint.v1.Inflation.displayName = 'proto.sentinel.mint.v1.Inflation';
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
proto.sentinel.mint.v1.Inflation.prototype.toObject = function(opt_includeInstance) {
  return proto.sentinel.mint.v1.Inflation.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.sentinel.mint.v1.Inflation} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.mint.v1.Inflation.toObject = function(includeInstance, msg) {
  var f, obj = {
    max: jspb.Message.getFieldWithDefault(msg, 1, ""),
    min: jspb.Message.getFieldWithDefault(msg, 2, ""),
    rateChange: jspb.Message.getFieldWithDefault(msg, 3, ""),
    timestamp: (f = msg.getTimestamp()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.sentinel.mint.v1.Inflation}
 */
proto.sentinel.mint.v1.Inflation.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.sentinel.mint.v1.Inflation;
  return proto.sentinel.mint.v1.Inflation.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.sentinel.mint.v1.Inflation} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.sentinel.mint.v1.Inflation}
 */
proto.sentinel.mint.v1.Inflation.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setMax(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setMin(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setRateChange(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setTimestamp(value);
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
proto.sentinel.mint.v1.Inflation.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.sentinel.mint.v1.Inflation.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.sentinel.mint.v1.Inflation} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.mint.v1.Inflation.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMax();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getMin();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getRateChange();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getTimestamp();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional string max = 1;
 * @return {string}
 */
proto.sentinel.mint.v1.Inflation.prototype.getMax = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.sentinel.mint.v1.Inflation} returns this
 */
proto.sentinel.mint.v1.Inflation.prototype.setMax = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string min = 2;
 * @return {string}
 */
proto.sentinel.mint.v1.Inflation.prototype.getMin = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.sentinel.mint.v1.Inflation} returns this
 */
proto.sentinel.mint.v1.Inflation.prototype.setMin = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string rate_change = 3;
 * @return {string}
 */
proto.sentinel.mint.v1.Inflation.prototype.getRateChange = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.sentinel.mint.v1.Inflation} returns this
 */
proto.sentinel.mint.v1.Inflation.prototype.setRateChange = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional google.protobuf.Timestamp timestamp = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.sentinel.mint.v1.Inflation.prototype.getTimestamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.sentinel.mint.v1.Inflation} returns this
*/
proto.sentinel.mint.v1.Inflation.prototype.setTimestamp = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.mint.v1.Inflation} returns this
 */
proto.sentinel.mint.v1.Inflation.prototype.clearTimestamp = function() {
  return this.setTimestamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.mint.v1.Inflation.prototype.hasTimestamp = function() {
  return jspb.Message.getField(this, 4) != null;
};

