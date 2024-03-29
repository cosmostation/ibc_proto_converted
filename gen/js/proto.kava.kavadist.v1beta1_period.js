// source: kava/kavadist/v1beta1/params.proto
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

goog.provide('proto.kava.kavadist.v1beta1.Period');

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
proto.kava.kavadist.v1beta1.Period = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.kavadist.v1beta1.Period, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.kavadist.v1beta1.Period.displayName = 'proto.kava.kavadist.v1beta1.Period';
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
proto.kava.kavadist.v1beta1.Period.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.kavadist.v1beta1.Period.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.kavadist.v1beta1.Period} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.kavadist.v1beta1.Period.toObject = function(includeInstance, msg) {
  var f, obj = {
    start: (f = msg.getStart()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    end: (f = msg.getEnd()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    inflation: msg.getInflation_asB64()
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
 * @return {!proto.kava.kavadist.v1beta1.Period}
 */
proto.kava.kavadist.v1beta1.Period.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.kavadist.v1beta1.Period;
  return proto.kava.kavadist.v1beta1.Period.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.kavadist.v1beta1.Period} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.kavadist.v1beta1.Period}
 */
proto.kava.kavadist.v1beta1.Period.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStart(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setEnd(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setInflation(value);
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
proto.kava.kavadist.v1beta1.Period.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.kavadist.v1beta1.Period.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.kavadist.v1beta1.Period} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.kavadist.v1beta1.Period.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getStart();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getEnd();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getInflation_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
};


/**
 * optional google.protobuf.Timestamp start = 1;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.kava.kavadist.v1beta1.Period.prototype.getStart = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 1));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.kava.kavadist.v1beta1.Period} returns this
*/
proto.kava.kavadist.v1beta1.Period.prototype.setStart = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.kavadist.v1beta1.Period} returns this
 */
proto.kava.kavadist.v1beta1.Period.prototype.clearStart = function() {
  return this.setStart(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.kavadist.v1beta1.Period.prototype.hasStart = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional google.protobuf.Timestamp end = 2;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.kava.kavadist.v1beta1.Period.prototype.getEnd = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 2));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.kava.kavadist.v1beta1.Period} returns this
*/
proto.kava.kavadist.v1beta1.Period.prototype.setEnd = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.kavadist.v1beta1.Period} returns this
 */
proto.kava.kavadist.v1beta1.Period.prototype.clearEnd = function() {
  return this.setEnd(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.kavadist.v1beta1.Period.prototype.hasEnd = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional bytes inflation = 3;
 * @return {string}
 */
proto.kava.kavadist.v1beta1.Period.prototype.getInflation = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes inflation = 3;
 * This is a type-conversion wrapper around `getInflation()`
 * @return {string}
 */
proto.kava.kavadist.v1beta1.Period.prototype.getInflation_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getInflation()));
};


/**
 * optional bytes inflation = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getInflation()`
 * @return {!Uint8Array}
 */
proto.kava.kavadist.v1beta1.Period.prototype.getInflation_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getInflation()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.kava.kavadist.v1beta1.Period} returns this
 */
proto.kava.kavadist.v1beta1.Period.prototype.setInflation = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


