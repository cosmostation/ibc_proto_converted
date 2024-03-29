// source: cosmos/group/v1/types.proto
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

goog.provide('proto.cosmos.group.v1.Vote');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');

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
proto.cosmos.group.v1.Vote = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.group.v1.Vote, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.group.v1.Vote.displayName = 'proto.cosmos.group.v1.Vote';
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
proto.cosmos.group.v1.Vote.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.group.v1.Vote.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.group.v1.Vote} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.Vote.toObject = function(includeInstance, msg) {
  var f, obj = {
    proposalId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    voter: jspb.Message.getFieldWithDefault(msg, 2, ""),
    option: jspb.Message.getFieldWithDefault(msg, 3, 0),
    metadata: jspb.Message.getFieldWithDefault(msg, 4, ""),
    submitTime: (f = msg.getSubmitTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.group.v1.Vote}
 */
proto.cosmos.group.v1.Vote.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.group.v1.Vote;
  return proto.cosmos.group.v1.Vote.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.group.v1.Vote} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.group.v1.Vote}
 */
proto.cosmos.group.v1.Vote.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setSubmitTime(value);
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
proto.cosmos.group.v1.Vote.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.group.v1.Vote.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.group.v1.Vote} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.Vote.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getSubmitTime();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 proposal_id = 1;
 * @return {number}
 */
proto.cosmos.group.v1.Vote.prototype.getProposalId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.group.v1.Vote} returns this
 */
proto.cosmos.group.v1.Vote.prototype.setProposalId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string voter = 2;
 * @return {string}
 */
proto.cosmos.group.v1.Vote.prototype.getVoter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.Vote} returns this
 */
proto.cosmos.group.v1.Vote.prototype.setVoter = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional VoteOption option = 3;
 * @return {!proto.cosmos.group.v1.VoteOption}
 */
proto.cosmos.group.v1.Vote.prototype.getOption = function() {
  return /** @type {!proto.cosmos.group.v1.VoteOption} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {!proto.cosmos.group.v1.VoteOption} value
 * @return {!proto.cosmos.group.v1.Vote} returns this
 */
proto.cosmos.group.v1.Vote.prototype.setOption = function(value) {
  return jspb.Message.setProto3EnumField(this, 3, value);
};


/**
 * optional string metadata = 4;
 * @return {string}
 */
proto.cosmos.group.v1.Vote.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.Vote} returns this
 */
proto.cosmos.group.v1.Vote.prototype.setMetadata = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional google.protobuf.Timestamp submit_time = 5;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.cosmos.group.v1.Vote.prototype.getSubmitTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 5));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.cosmos.group.v1.Vote} returns this
*/
proto.cosmos.group.v1.Vote.prototype.setSubmitTime = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.group.v1.Vote} returns this
 */
proto.cosmos.group.v1.Vote.prototype.clearSubmitTime = function() {
  return this.setSubmitTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.group.v1.Vote.prototype.hasSubmitTime = function() {
  return jspb.Message.getField(this, 5) != null;
};


