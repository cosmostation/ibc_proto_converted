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

goog.provide('proto.cosmos.group.v1.MsgVote');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.cosmos.group.v1.Exec');
goog.forwardDeclare('proto.cosmos.group.v1.VoteOption');
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
proto.cosmos.group.v1.MsgVote = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.group.v1.MsgVote, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.group.v1.MsgVote.displayName = 'proto.cosmos.group.v1.MsgVote';
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
proto.cosmos.group.v1.MsgVote.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.group.v1.MsgVote.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.group.v1.MsgVote} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.MsgVote.toObject = function(includeInstance, msg) {
  var f, obj = {
    proposalId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    voter: jspb.Message.getFieldWithDefault(msg, 2, ""),
    option: jspb.Message.getFieldWithDefault(msg, 3, 0),
    metadata: jspb.Message.getFieldWithDefault(msg, 4, ""),
    exec: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.cosmos.group.v1.MsgVote}
 */
proto.cosmos.group.v1.MsgVote.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.group.v1.MsgVote;
  return proto.cosmos.group.v1.MsgVote.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.group.v1.MsgVote} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.group.v1.MsgVote}
 */
proto.cosmos.group.v1.MsgVote.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setProposalId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setVoter(value);
      break;
    case 3:
      var value = /** @type {!proto.cosmos.group.v1.VoteOption} */ (reader.readEnum());
      msg.setOption(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setMetadata(value);
      break;
    case 5:
      var value = /** @type {!proto.cosmos.group.v1.Exec} */ (reader.readEnum());
      msg.setExec(value);
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
proto.cosmos.group.v1.MsgVote.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.group.v1.MsgVote.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.group.v1.MsgVote} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.MsgVote.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProposalId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getVoter();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getOption();
  if (f !== 0.0) {
    writer.writeEnum(
      3,
      f
    );
  }
  f = message.getMetadata();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getExec();
  if (f !== 0.0) {
    writer.writeEnum(
      5,
      f
    );
  }
};


/**
 * optional uint64 proposal_id = 1;
 * @return {number}
 */
proto.cosmos.group.v1.MsgVote.prototype.getProposalId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.group.v1.MsgVote} returns this
 */
proto.cosmos.group.v1.MsgVote.prototype.setProposalId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string voter = 2;
 * @return {string}
 */
proto.cosmos.group.v1.MsgVote.prototype.getVoter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.MsgVote} returns this
 */
proto.cosmos.group.v1.MsgVote.prototype.setVoter = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional VoteOption option = 3;
 * @return {!proto.cosmos.group.v1.VoteOption}
 */
proto.cosmos.group.v1.MsgVote.prototype.getOption = function() {
  return /** @type {!proto.cosmos.group.v1.VoteOption} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {!proto.cosmos.group.v1.VoteOption} value
 * @return {!proto.cosmos.group.v1.MsgVote} returns this
 */
proto.cosmos.group.v1.MsgVote.prototype.setOption = function(value) {
  return jspb.Message.setProto3EnumField(this, 3, value);
};


/**
 * optional string metadata = 4;
 * @return {string}
 */
proto.cosmos.group.v1.MsgVote.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.MsgVote} returns this
 */
proto.cosmos.group.v1.MsgVote.prototype.setMetadata = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional Exec exec = 5;
 * @return {!proto.cosmos.group.v1.Exec}
 */
proto.cosmos.group.v1.MsgVote.prototype.getExec = function() {
  return /** @type {!proto.cosmos.group.v1.Exec} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {!proto.cosmos.group.v1.Exec} value
 * @return {!proto.cosmos.group.v1.MsgVote} returns this
 */
proto.cosmos.group.v1.MsgVote.prototype.setExec = function(value) {
  return jspb.Message.setProto3EnumField(this, 5, value);
};


