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

goog.provide('proto.provenance.marker.v1.SetAdministratorProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.marker.v1.AccessGrant');

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
proto.provenance.marker.v1.SetAdministratorProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.marker.v1.SetAdministratorProposal.repeatedFields_, null);
};
goog.inherits(proto.provenance.marker.v1.SetAdministratorProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.marker.v1.SetAdministratorProposal.displayName = 'proto.provenance.marker.v1.SetAdministratorProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.marker.v1.SetAdministratorProposal.repeatedFields_ = [4];



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
proto.provenance.marker.v1.SetAdministratorProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.marker.v1.SetAdministratorProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.marker.v1.SetAdministratorProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.SetAdministratorProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    denom: jspb.Message.getFieldWithDefault(msg, 3, ""),
    accessList: jspb.Message.toObjectList(msg.getAccessList(),
    proto.provenance.marker.v1.AccessGrant.toObject, includeInstance)
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
 * @return {!proto.provenance.marker.v1.SetAdministratorProposal}
 */
proto.provenance.marker.v1.SetAdministratorProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.marker.v1.SetAdministratorProposal;
  return proto.provenance.marker.v1.SetAdministratorProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.marker.v1.SetAdministratorProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.marker.v1.SetAdministratorProposal}
 */
proto.provenance.marker.v1.SetAdministratorProposal.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.provenance.marker.v1.AccessGrant;
      reader.readMessage(value,proto.provenance.marker.v1.AccessGrant.deserializeBinaryFromReader);
      msg.addAccess(value);
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
proto.provenance.marker.v1.SetAdministratorProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.marker.v1.SetAdministratorProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.marker.v1.SetAdministratorProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.SetAdministratorProposal.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getAccessList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.provenance.marker.v1.AccessGrant.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.provenance.marker.v1.SetAdministratorProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.SetAdministratorProposal} returns this
 */
proto.provenance.marker.v1.SetAdministratorProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.provenance.marker.v1.SetAdministratorProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.SetAdministratorProposal} returns this
 */
proto.provenance.marker.v1.SetAdministratorProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string denom = 3;
 * @return {string}
 */
proto.provenance.marker.v1.SetAdministratorProposal.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.marker.v1.SetAdministratorProposal} returns this
 */
proto.provenance.marker.v1.SetAdministratorProposal.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated AccessGrant access = 4;
 * @return {!Array<!proto.provenance.marker.v1.AccessGrant>}
 */
proto.provenance.marker.v1.SetAdministratorProposal.prototype.getAccessList = function() {
  return /** @type{!Array<!proto.provenance.marker.v1.AccessGrant>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.marker.v1.AccessGrant, 4));
};


/**
 * @param {!Array<!proto.provenance.marker.v1.AccessGrant>} value
 * @return {!proto.provenance.marker.v1.SetAdministratorProposal} returns this
*/
proto.provenance.marker.v1.SetAdministratorProposal.prototype.setAccessList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.provenance.marker.v1.AccessGrant=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.marker.v1.AccessGrant}
 */
proto.provenance.marker.v1.SetAdministratorProposal.prototype.addAccess = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.provenance.marker.v1.AccessGrant, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.marker.v1.SetAdministratorProposal} returns this
 */
proto.provenance.marker.v1.SetAdministratorProposal.prototype.clearAccessList = function() {
  return this.setAccessList([]);
};


