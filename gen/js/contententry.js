// source: regen/data/v1alpha2/query.proto
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

goog.provide('proto.regen.data.v1alpha2.ContentEntry');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');
goog.require('proto.regen.data.v1alpha2.ContentHash');

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
proto.regen.data.v1alpha2.ContentEntry = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.regen.data.v1alpha2.ContentEntry, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.data.v1alpha2.ContentEntry.displayName = 'proto.regen.data.v1alpha2.ContentEntry';
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
proto.regen.data.v1alpha2.ContentEntry.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.data.v1alpha2.ContentEntry.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.data.v1alpha2.ContentEntry} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.data.v1alpha2.ContentEntry.toObject = function(includeInstance, msg) {
  var f, obj = {
    hash: (f = msg.getHash()) && proto.regen.data.v1alpha2.ContentHash.toObject(includeInstance, f),
    iri: jspb.Message.getFieldWithDefault(msg, 2, ""),
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
 * @return {!proto.regen.data.v1alpha2.ContentEntry}
 */
proto.regen.data.v1alpha2.ContentEntry.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.data.v1alpha2.ContentEntry;
  return proto.regen.data.v1alpha2.ContentEntry.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.data.v1alpha2.ContentEntry} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.data.v1alpha2.ContentEntry}
 */
proto.regen.data.v1alpha2.ContentEntry.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.regen.data.v1alpha2.ContentHash;
      reader.readMessage(value,proto.regen.data.v1alpha2.ContentHash.deserializeBinaryFromReader);
      msg.setHash(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setIri(value);
      break;
    case 3:
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
proto.regen.data.v1alpha2.ContentEntry.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.data.v1alpha2.ContentEntry.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.data.v1alpha2.ContentEntry} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.data.v1alpha2.ContentEntry.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHash();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.regen.data.v1alpha2.ContentHash.serializeBinaryToWriter
    );
  }
  f = message.getIri();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTimestamp();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional ContentHash hash = 1;
 * @return {?proto.regen.data.v1alpha2.ContentHash}
 */
proto.regen.data.v1alpha2.ContentEntry.prototype.getHash = function() {
  return /** @type{?proto.regen.data.v1alpha2.ContentHash} */ (
    jspb.Message.getWrapperField(this, proto.regen.data.v1alpha2.ContentHash, 1));
};


/**
 * @param {?proto.regen.data.v1alpha2.ContentHash|undefined} value
 * @return {!proto.regen.data.v1alpha2.ContentEntry} returns this
*/
proto.regen.data.v1alpha2.ContentEntry.prototype.setHash = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.regen.data.v1alpha2.ContentEntry} returns this
 */
proto.regen.data.v1alpha2.ContentEntry.prototype.clearHash = function() {
  return this.setHash(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.regen.data.v1alpha2.ContentEntry.prototype.hasHash = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string iri = 2;
 * @return {string}
 */
proto.regen.data.v1alpha2.ContentEntry.prototype.getIri = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.data.v1alpha2.ContentEntry} returns this
 */
proto.regen.data.v1alpha2.ContentEntry.prototype.setIri = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional google.protobuf.Timestamp timestamp = 3;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.regen.data.v1alpha2.ContentEntry.prototype.getTimestamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 3));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.regen.data.v1alpha2.ContentEntry} returns this
*/
proto.regen.data.v1alpha2.ContentEntry.prototype.setTimestamp = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.regen.data.v1alpha2.ContentEntry} returns this
 */
proto.regen.data.v1alpha2.ContentEntry.prototype.clearTimestamp = function() {
  return this.setTimestamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.regen.data.v1alpha2.ContentEntry.prototype.hasTimestamp = function() {
  return jspb.Message.getField(this, 3) != null;
};


