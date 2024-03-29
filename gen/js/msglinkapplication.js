// source: desmos/profiles/v3/msgs_app_links.proto
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

goog.provide('proto.desmos.profiles.v3.MsgLinkApplication');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.desmos.profiles.v3.Data');
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
proto.desmos.profiles.v3.MsgLinkApplication = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.profiles.v3.MsgLinkApplication, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v3.MsgLinkApplication.displayName = 'proto.desmos.profiles.v3.MsgLinkApplication';
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
proto.desmos.profiles.v3.MsgLinkApplication.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v3.MsgLinkApplication.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v3.MsgLinkApplication} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v3.MsgLinkApplication.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    linkData: (f = msg.getLinkData()) && proto.desmos.profiles.v3.Data.toObject(includeInstance, f),
    callData: jspb.Message.getFieldWithDefault(msg, 3, ""),
    sourcePort: jspb.Message.getFieldWithDefault(msg, 4, ""),
    sourceChannel: jspb.Message.getFieldWithDefault(msg, 5, ""),
    timeoutHeight: (f = msg.getTimeoutHeight()) && proto.ibc.core.client.v1.Height.toObject(includeInstance, f),
    timeoutTimestamp: jspb.Message.getFieldWithDefault(msg, 7, 0)
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
 * @return {!proto.desmos.profiles.v3.MsgLinkApplication}
 */
proto.desmos.profiles.v3.MsgLinkApplication.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v3.MsgLinkApplication;
  return proto.desmos.profiles.v3.MsgLinkApplication.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v3.MsgLinkApplication} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v3.MsgLinkApplication}
 */
proto.desmos.profiles.v3.MsgLinkApplication.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 2:
      var value = new proto.desmos.profiles.v3.Data;
      reader.readMessage(value,proto.desmos.profiles.v3.Data.deserializeBinaryFromReader);
      msg.setLinkData(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setCallData(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setSourcePort(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSourceChannel(value);
      break;
    case 6:
      var value = new proto.ibc.core.client.v1.Height;
      reader.readMessage(value,proto.ibc.core.client.v1.Height.deserializeBinaryFromReader);
      msg.setTimeoutHeight(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTimeoutTimestamp(value);
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
proto.desmos.profiles.v3.MsgLinkApplication.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v3.MsgLinkApplication.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v3.MsgLinkApplication} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v3.MsgLinkApplication.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getLinkData();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.desmos.profiles.v3.Data.serializeBinaryToWriter
    );
  }
  f = message.getCallData();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getSourcePort();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getSourceChannel();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getTimeoutHeight();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.ibc.core.client.v1.Height.serializeBinaryToWriter
    );
  }
  f = message.getTimeoutTimestamp();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v3.MsgLinkApplication} returns this
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional Data link_data = 2;
 * @return {?proto.desmos.profiles.v3.Data}
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.getLinkData = function() {
  return /** @type{?proto.desmos.profiles.v3.Data} */ (
    jspb.Message.getWrapperField(this, proto.desmos.profiles.v3.Data, 2));
};


/**
 * @param {?proto.desmos.profiles.v3.Data|undefined} value
 * @return {!proto.desmos.profiles.v3.MsgLinkApplication} returns this
*/
proto.desmos.profiles.v3.MsgLinkApplication.prototype.setLinkData = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v3.MsgLinkApplication} returns this
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.clearLinkData = function() {
  return this.setLinkData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.hasLinkData = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional string call_data = 3;
 * @return {string}
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.getCallData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v3.MsgLinkApplication} returns this
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.setCallData = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string source_port = 4;
 * @return {string}
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.getSourcePort = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v3.MsgLinkApplication} returns this
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.setSourcePort = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string source_channel = 5;
 * @return {string}
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.getSourceChannel = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v3.MsgLinkApplication} returns this
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.setSourceChannel = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional ibc.core.client.v1.Height timeout_height = 6;
 * @return {?proto.ibc.core.client.v1.Height}
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.getTimeoutHeight = function() {
  return /** @type{?proto.ibc.core.client.v1.Height} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.client.v1.Height, 6));
};


/**
 * @param {?proto.ibc.core.client.v1.Height|undefined} value
 * @return {!proto.desmos.profiles.v3.MsgLinkApplication} returns this
*/
proto.desmos.profiles.v3.MsgLinkApplication.prototype.setTimeoutHeight = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v3.MsgLinkApplication} returns this
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.clearTimeoutHeight = function() {
  return this.setTimeoutHeight(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.hasTimeoutHeight = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional uint64 timeout_timestamp = 7;
 * @return {number}
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.getTimeoutTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.profiles.v3.MsgLinkApplication} returns this
 */
proto.desmos.profiles.v3.MsgLinkApplication.prototype.setTimeoutTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


