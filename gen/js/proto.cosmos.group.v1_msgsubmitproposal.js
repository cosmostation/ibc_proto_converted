// source: cosmos/group/v1/tx.proto
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

goog.provide('proto.cosmos.group.v1.MsgSubmitProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');

goog.forwardDeclare('proto.cosmos.group.v1.Exec');
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
proto.cosmos.group.v1.MsgSubmitProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.group.v1.MsgSubmitProposal.repeatedFields_, null);
};
goog.inherits(proto.cosmos.group.v1.MsgSubmitProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.group.v1.MsgSubmitProposal.displayName = 'proto.cosmos.group.v1.MsgSubmitProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.group.v1.MsgSubmitProposal.repeatedFields_ = [2,4];



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
proto.cosmos.group.v1.MsgSubmitProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.group.v1.MsgSubmitProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.group.v1.MsgSubmitProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.MsgSubmitProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    groupPolicyAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    proposersList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    metadata: jspb.Message.getFieldWithDefault(msg, 3, ""),
    messagesList: jspb.Message.toObjectList(msg.getMessagesList(),
    proto.google.protobuf.Any.toObject, includeInstance),
    exec: jspb.Message.getFieldWithDefault(msg, 5, 0),
    title: jspb.Message.getFieldWithDefault(msg, 6, ""),
    summary: jspb.Message.getFieldWithDefault(msg, 7, "")
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
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal}
 */
proto.cosmos.group.v1.MsgSubmitProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.group.v1.MsgSubmitProposal;
  return proto.cosmos.group.v1.MsgSubmitProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.group.v1.MsgSubmitProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal}
 */
proto.cosmos.group.v1.MsgSubmitProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setGroupPolicyAddress(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addProposers(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMetadata(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.addMessages(value);
      break;
    case 5:
      var value = /** @type {!proto.cosmos.group.v1.Exec} */ (reader.readEnum());
      msg.setExec(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setSummary(value);
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
proto.cosmos.group.v1.MsgSubmitProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.group.v1.MsgSubmitProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.group.v1.MsgSubmitProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.MsgSubmitProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getGroupPolicyAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getProposersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getMetadata();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getMessagesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getExec();
  if (f !== 0.0) {
    writer.writeEnum(
      5,
      f
    );
  }
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getSummary();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
};


/**
 * optional string group_policy_address = 1;
 * @return {string}
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.getGroupPolicyAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.setGroupPolicyAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated string proposers = 2;
 * @return {!Array<string>}
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.getProposersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.setProposersList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.addProposers = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.clearProposersList = function() {
  return this.setProposersList([]);
};


/**
 * optional string metadata = 3;
 * @return {string}
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.setMetadata = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated google.protobuf.Any messages = 4;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.getMessagesList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 4));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal} returns this
*/
proto.cosmos.group.v1.MsgSubmitProposal.prototype.setMessagesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.addMessages = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.clearMessagesList = function() {
  return this.setMessagesList([]);
};


/**
 * optional Exec exec = 5;
 * @return {!proto.cosmos.group.v1.Exec}
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.getExec = function() {
  return /** @type {!proto.cosmos.group.v1.Exec} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {!proto.cosmos.group.v1.Exec} value
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.setExec = function(value) {
  return jspb.Message.setProto3EnumField(this, 5, value);
};


/**
 * optional string title = 6;
 * @return {string}
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string summary = 7;
 * @return {string}
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.getSummary = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.group.v1.MsgSubmitProposal.prototype.setSummary = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


