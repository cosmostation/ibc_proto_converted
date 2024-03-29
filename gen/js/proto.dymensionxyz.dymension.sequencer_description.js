// source: dymension/sequencer/description.proto
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

goog.provide('proto.dymensionxyz.dymension.sequencer.Description');

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
proto.dymensionxyz.dymension.sequencer.Description = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.dymensionxyz.dymension.sequencer.Description, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.dymensionxyz.dymension.sequencer.Description.displayName = 'proto.dymensionxyz.dymension.sequencer.Description';
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
proto.dymensionxyz.dymension.sequencer.Description.prototype.toObject = function(opt_includeInstance) {
  return proto.dymensionxyz.dymension.sequencer.Description.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.dymensionxyz.dymension.sequencer.Description} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.sequencer.Description.toObject = function(includeInstance, msg) {
  var f, obj = {
    moniker: jspb.Message.getFieldWithDefault(msg, 1, ""),
    identity: jspb.Message.getFieldWithDefault(msg, 2, ""),
    website: jspb.Message.getFieldWithDefault(msg, 3, ""),
    securitycontact: jspb.Message.getFieldWithDefault(msg, 4, ""),
    details: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.dymensionxyz.dymension.sequencer.Description}
 */
proto.dymensionxyz.dymension.sequencer.Description.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.dymensionxyz.dymension.sequencer.Description;
  return proto.dymensionxyz.dymension.sequencer.Description.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.dymensionxyz.dymension.sequencer.Description} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.dymensionxyz.dymension.sequencer.Description}
 */
proto.dymensionxyz.dymension.sequencer.Description.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setMoniker(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setIdentity(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setWebsite(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setSecuritycontact(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setDetails(value);
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
proto.dymensionxyz.dymension.sequencer.Description.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.dymensionxyz.dymension.sequencer.Description.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.dymensionxyz.dymension.sequencer.Description} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.sequencer.Description.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMoniker();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getIdentity();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getWebsite();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getSecuritycontact();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getDetails();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional string moniker = 1;
 * @return {string}
 */
proto.dymensionxyz.dymension.sequencer.Description.prototype.getMoniker = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.sequencer.Description} returns this
 */
proto.dymensionxyz.dymension.sequencer.Description.prototype.setMoniker = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string identity = 2;
 * @return {string}
 */
proto.dymensionxyz.dymension.sequencer.Description.prototype.getIdentity = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.sequencer.Description} returns this
 */
proto.dymensionxyz.dymension.sequencer.Description.prototype.setIdentity = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string website = 3;
 * @return {string}
 */
proto.dymensionxyz.dymension.sequencer.Description.prototype.getWebsite = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.sequencer.Description} returns this
 */
proto.dymensionxyz.dymension.sequencer.Description.prototype.setWebsite = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string securityContact = 4;
 * @return {string}
 */
proto.dymensionxyz.dymension.sequencer.Description.prototype.getSecuritycontact = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.sequencer.Description} returns this
 */
proto.dymensionxyz.dymension.sequencer.Description.prototype.setSecuritycontact = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string details = 5;
 * @return {string}
 */
proto.dymensionxyz.dymension.sequencer.Description.prototype.getDetails = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.sequencer.Description} returns this
 */
proto.dymensionxyz.dymension.sequencer.Description.prototype.setDetails = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


