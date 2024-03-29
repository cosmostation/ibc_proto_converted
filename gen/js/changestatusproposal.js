// source: provenance/marker/v1/proposals.proto
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

goog.provide('proto.provenance.marker.v1.ChangeStatusProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.provenance.marker.v1.MarkerStatus');
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
proto.provenance.marker.v1.ChangeStatusProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.marker.v1.ChangeStatusProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.marker.v1.ChangeStatusProposal.displayName = 'proto.provenance.marker.v1.ChangeStatusProposal';
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
proto.provenance.marker.v1.ChangeStatusProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.marker.v1.ChangeStatusProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.marker.v1.ChangeStatusProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.ChangeStatusProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    denom: jspb.Message.getFieldWithDefault(msg, 3, ""),
    newStatus: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.provenance.marker.v1.ChangeStatusProposal}
 */
proto.provenance.marker.v1.ChangeStatusProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.marker.v1.ChangeStatusProposal;
  return proto.provenance.marker.v1.ChangeStatusProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.marker.v1.ChangeStatusProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.marker.v1.ChangeStatusProposal}
 */
proto.provenance.marker.v1.ChangeStatusProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 4:
      var value = /** @type {!proto.provenance.marker.v1.MarkerStatus} */ (reader.readEnum());
      msg.setNewStatus(value);
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
proto.provenance.marker.v1.ChangeStatusProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.marker.v1.ChangeStatusProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.marker.v1.ChangeStatusProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.ChangeStatusProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
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
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getNewStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      4,
      f
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.provenance.marker.v1.ChangeStatusProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.ChangeStatusProposal} returns this
 */
proto.provenance.marker.v1.ChangeStatusProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.provenance.marker.v1.ChangeStatusProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.ChangeStatusProposal} returns this
 */
proto.provenance.marker.v1.ChangeStatusProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string denom = 3;
 * @return {string}
 */
proto.provenance.marker.v1.ChangeStatusProposal.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.ChangeStatusProposal} returns this
 */
proto.provenance.marker.v1.ChangeStatusProposal.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional MarkerStatus new_status = 4;
 * @return {!proto.provenance.marker.v1.MarkerStatus}
 */
proto.provenance.marker.v1.ChangeStatusProposal.prototype.getNewStatus = function() {
  return /** @type {!proto.provenance.marker.v1.MarkerStatus} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {!proto.provenance.marker.v1.MarkerStatus} value
 * @return {!proto.provenance.marker.v1.ChangeStatusProposal} returns this
 */
proto.provenance.marker.v1.ChangeStatusProposal.prototype.setNewStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 4, value);
};


