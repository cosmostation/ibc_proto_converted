// source: desmos/profiles/v2/models_profile.proto
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

goog.provide('proto.desmos.profiles.v2.Profile');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.desmos.profiles.v2.Pictures');
goog.require('proto.google.protobuf.Any');
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
proto.desmos.profiles.v2.Profile = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.profiles.v2.Profile, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v2.Profile.displayName = 'proto.desmos.profiles.v2.Profile';
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
proto.desmos.profiles.v2.Profile.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v2.Profile.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v2.Profile} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v2.Profile.toObject = function(includeInstance, msg) {
  var f, obj = {
    account: (f = msg.getAccount()) && proto.google.protobuf.Any.toObject(includeInstance, f),
    dtag: jspb.Message.getFieldWithDefault(msg, 2, ""),
    nickname: jspb.Message.getFieldWithDefault(msg, 3, ""),
    bio: jspb.Message.getFieldWithDefault(msg, 4, ""),
    pictures: (f = msg.getPictures()) && proto.desmos.profiles.v2.Pictures.toObject(includeInstance, f),
    creationDate: (f = msg.getCreationDate()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.desmos.profiles.v2.Profile}
 */
proto.desmos.profiles.v2.Profile.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v2.Profile;
  return proto.desmos.profiles.v2.Profile.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v2.Profile} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v2.Profile}
 */
proto.desmos.profiles.v2.Profile.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setAccount(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDtag(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setNickname(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setBio(value);
      break;
    case 5:
      var value = new proto.desmos.profiles.v2.Pictures;
      reader.readMessage(value,proto.desmos.profiles.v2.Pictures.deserializeBinaryFromReader);
      msg.setPictures(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCreationDate(value);
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
proto.desmos.profiles.v2.Profile.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v2.Profile.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v2.Profile} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v2.Profile.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAccount();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getDtag();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getNickname();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getBio();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getPictures();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.desmos.profiles.v2.Pictures.serializeBinaryToWriter
    );
  }
  f = message.getCreationDate();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional google.protobuf.Any account = 1;
 * @return {?proto.google.protobuf.Any}
 */
proto.desmos.profiles.v2.Profile.prototype.getAccount = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 1));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.desmos.profiles.v2.Profile} returns this
*/
proto.desmos.profiles.v2.Profile.prototype.setAccount = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v2.Profile} returns this
 */
proto.desmos.profiles.v2.Profile.prototype.clearAccount = function() {
  return this.setAccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v2.Profile.prototype.hasAccount = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string dtag = 2;
 * @return {string}
 */
proto.desmos.profiles.v2.Profile.prototype.getDtag = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v2.Profile} returns this
 */
proto.desmos.profiles.v2.Profile.prototype.setDtag = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string nickname = 3;
 * @return {string}
 */
proto.desmos.profiles.v2.Profile.prototype.getNickname = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v2.Profile} returns this
 */
proto.desmos.profiles.v2.Profile.prototype.setNickname = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string bio = 4;
 * @return {string}
 */
proto.desmos.profiles.v2.Profile.prototype.getBio = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v2.Profile} returns this
 */
proto.desmos.profiles.v2.Profile.prototype.setBio = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional Pictures pictures = 5;
 * @return {?proto.desmos.profiles.v2.Pictures}
 */
proto.desmos.profiles.v2.Profile.prototype.getPictures = function() {
  return /** @type{?proto.desmos.profiles.v2.Pictures} */ (
    jspb.Message.getWrapperField(this, proto.desmos.profiles.v2.Pictures, 5));
};


/**
 * @param {?proto.desmos.profiles.v2.Pictures|undefined} value
 * @return {!proto.desmos.profiles.v2.Profile} returns this
*/
proto.desmos.profiles.v2.Profile.prototype.setPictures = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v2.Profile} returns this
 */
proto.desmos.profiles.v2.Profile.prototype.clearPictures = function() {
  return this.setPictures(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v2.Profile.prototype.hasPictures = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional google.protobuf.Timestamp creation_date = 6;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.desmos.profiles.v2.Profile.prototype.getCreationDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 6));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.desmos.profiles.v2.Profile} returns this
*/
proto.desmos.profiles.v2.Profile.prototype.setCreationDate = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v2.Profile} returns this
 */
proto.desmos.profiles.v2.Profile.prototype.clearCreationDate = function() {
  return this.setCreationDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v2.Profile.prototype.hasCreationDate = function() {
  return jspb.Message.getField(this, 6) != null;
};


