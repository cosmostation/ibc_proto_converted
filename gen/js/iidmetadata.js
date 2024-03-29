// source: ixo/iid/v1beta1/types.proto
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

goog.provide('proto.ixo.iid.v1beta1.IidMetadata');

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
proto.ixo.iid.v1beta1.IidMetadata = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ixo.iid.v1beta1.IidMetadata, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.iid.v1beta1.IidMetadata.displayName = 'proto.ixo.iid.v1beta1.IidMetadata';
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
proto.ixo.iid.v1beta1.IidMetadata.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.iid.v1beta1.IidMetadata.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.iid.v1beta1.IidMetadata} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.iid.v1beta1.IidMetadata.toObject = function(includeInstance, msg) {
  var f, obj = {
    versionid: jspb.Message.getFieldWithDefault(msg, 1, ""),
    created: (f = msg.getCreated()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    updated: (f = msg.getUpdated()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    deactivated: jspb.Message.getBooleanFieldWithDefault(msg, 4, false)
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
 * @return {!proto.ixo.iid.v1beta1.IidMetadata}
 */
proto.ixo.iid.v1beta1.IidMetadata.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.iid.v1beta1.IidMetadata;
  return proto.ixo.iid.v1beta1.IidMetadata.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.iid.v1beta1.IidMetadata} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.iid.v1beta1.IidMetadata}
 */
proto.ixo.iid.v1beta1.IidMetadata.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setVersionid(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCreated(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setUpdated(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setDeactivated(value);
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
proto.ixo.iid.v1beta1.IidMetadata.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.iid.v1beta1.IidMetadata.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.iid.v1beta1.IidMetadata} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.iid.v1beta1.IidMetadata.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getVersionid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCreated();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getUpdated();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getDeactivated();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
};


/**
 * optional string versionId = 1;
 * @return {string}
 */
proto.ixo.iid.v1beta1.IidMetadata.prototype.getVersionid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.iid.v1beta1.IidMetadata} returns this
 */
proto.ixo.iid.v1beta1.IidMetadata.prototype.setVersionid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional google.protobuf.Timestamp created = 2;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.ixo.iid.v1beta1.IidMetadata.prototype.getCreated = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 2));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.ixo.iid.v1beta1.IidMetadata} returns this
*/
proto.ixo.iid.v1beta1.IidMetadata.prototype.setCreated = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.iid.v1beta1.IidMetadata} returns this
 */
proto.ixo.iid.v1beta1.IidMetadata.prototype.clearCreated = function() {
  return this.setCreated(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.iid.v1beta1.IidMetadata.prototype.hasCreated = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional google.protobuf.Timestamp updated = 3;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.ixo.iid.v1beta1.IidMetadata.prototype.getUpdated = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 3));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.ixo.iid.v1beta1.IidMetadata} returns this
*/
proto.ixo.iid.v1beta1.IidMetadata.prototype.setUpdated = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.iid.v1beta1.IidMetadata} returns this
 */
proto.ixo.iid.v1beta1.IidMetadata.prototype.clearUpdated = function() {
  return this.setUpdated(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.iid.v1beta1.IidMetadata.prototype.hasUpdated = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional bool deactivated = 4;
 * @return {boolean}
 */
proto.ixo.iid.v1beta1.IidMetadata.prototype.getDeactivated = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ixo.iid.v1beta1.IidMetadata} returns this
 */
proto.ixo.iid.v1beta1.IidMetadata.prototype.setDeactivated = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};


