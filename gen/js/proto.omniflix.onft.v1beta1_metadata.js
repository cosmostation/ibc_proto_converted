// source: OmniFlix/onft/v1beta1/onft.proto
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

goog.provide('proto.OmniFlix.onft.v1beta1.Metadata');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.OmniFlix.onft.v1beta1.Metadata = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.OmniFlix.onft.v1beta1.Metadata, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.OmniFlix.onft.v1beta1.Metadata.displayName = 'proto.OmniFlix.onft.v1beta1.Metadata';
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
proto.OmniFlix.onft.v1beta1.Metadata.prototype.toObject = function(opt_includeInstance) {
  return proto.OmniFlix.onft.v1beta1.Metadata.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.OmniFlix.onft.v1beta1.Metadata} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.onft.v1beta1.Metadata.toObject = function(includeInstance, msg) {
  var f, obj = {
    name: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    mediaUri: jspb.Message.getFieldWithDefault(msg, 3, ""),
    previewUri: jspb.Message.getFieldWithDefault(msg, 4, ""),
    uriHash: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.OmniFlix.onft.v1beta1.Metadata}
 */
proto.OmniFlix.onft.v1beta1.Metadata.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.OmniFlix.onft.v1beta1.Metadata;
  return proto.OmniFlix.onft.v1beta1.Metadata.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.OmniFlix.onft.v1beta1.Metadata} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.OmniFlix.onft.v1beta1.Metadata}
 */
proto.OmniFlix.onft.v1beta1.Metadata.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMediaUri(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setPreviewUri(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setUriHash(value);
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
proto.OmniFlix.onft.v1beta1.Metadata.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.OmniFlix.onft.v1beta1.Metadata.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.OmniFlix.onft.v1beta1.Metadata} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.onft.v1beta1.Metadata.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMediaUri();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPreviewUri();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getUriHash();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional string name = 1;
 * @return {string}
 */
proto.OmniFlix.onft.v1beta1.Metadata.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.onft.v1beta1.Metadata} returns this
 */
proto.OmniFlix.onft.v1beta1.Metadata.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.OmniFlix.onft.v1beta1.Metadata.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.onft.v1beta1.Metadata} returns this
 */
proto.OmniFlix.onft.v1beta1.Metadata.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string media_uri = 3;
 * @return {string}
 */
proto.OmniFlix.onft.v1beta1.Metadata.prototype.getMediaUri = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.onft.v1beta1.Metadata} returns this
 */
proto.OmniFlix.onft.v1beta1.Metadata.prototype.setMediaUri = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string preview_uri = 4;
 * @return {string}
 */
proto.OmniFlix.onft.v1beta1.Metadata.prototype.getPreviewUri = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.onft.v1beta1.Metadata} returns this
 */
proto.OmniFlix.onft.v1beta1.Metadata.prototype.setPreviewUri = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string uri_hash = 5;
 * @return {string}
 */
proto.OmniFlix.onft.v1beta1.Metadata.prototype.getUriHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.onft.v1beta1.Metadata} returns this
 */
proto.OmniFlix.onft.v1beta1.Metadata.prototype.setUriHash = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


