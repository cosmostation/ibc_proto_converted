// source: desmos/posts/v1/models.proto
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

goog.provide('proto.desmos.posts.v1.UserAnswer');

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
proto.desmos.posts.v1.UserAnswer = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.desmos.posts.v1.UserAnswer.repeatedFields_, null);
};
goog.inherits(proto.desmos.posts.v1.UserAnswer, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.posts.v1.UserAnswer.displayName = 'proto.desmos.posts.v1.UserAnswer';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.desmos.posts.v1.UserAnswer.repeatedFields_ = [5];



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
proto.desmos.posts.v1.UserAnswer.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.posts.v1.UserAnswer.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.posts.v1.UserAnswer} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.posts.v1.UserAnswer.toObject = function(includeInstance, msg) {
  var f, obj = {
    subspaceId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    sectionId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    postId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    pollId: jspb.Message.getFieldWithDefault(msg, 4, 0),
    answersIndexesList: (f = jspb.Message.getRepeatedField(msg, 5)) == null ? undefined : f,
    user: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.desmos.posts.v1.UserAnswer}
 */
proto.desmos.posts.v1.UserAnswer.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.posts.v1.UserAnswer;
  return proto.desmos.posts.v1.UserAnswer.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.posts.v1.UserAnswer} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.posts.v1.UserAnswer}
 */
proto.desmos.posts.v1.UserAnswer.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSubspaceId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setSectionId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPostId(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setPollId(value);
      break;
    case 5:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint32() : [reader.readUint32()]);
      for (var i = 0; i < values.length; i++) {
        msg.addAnswersIndexes(values[i]);
      }
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setUser(value);
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
proto.desmos.posts.v1.UserAnswer.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.posts.v1.UserAnswer.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.posts.v1.UserAnswer} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.posts.v1.UserAnswer.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubspaceId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getSectionId();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getPostId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getPollId();
  if (f !== 0) {
    writer.writeUint32(
      4,
      f
    );
  }
  f = message.getAnswersIndexesList();
  if (f.length > 0) {
    writer.writePackedUint32(
      5,
      f
    );
  }
  f = message.getUser();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional uint64 subspace_id = 1;
 * @return {number}
 */
proto.desmos.posts.v1.UserAnswer.prototype.getSubspaceId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.posts.v1.UserAnswer} returns this
 */
proto.desmos.posts.v1.UserAnswer.prototype.setSubspaceId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint32 section_id = 2;
 * @return {number}
 */
proto.desmos.posts.v1.UserAnswer.prototype.getSectionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.posts.v1.UserAnswer} returns this
 */
proto.desmos.posts.v1.UserAnswer.prototype.setSectionId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 post_id = 3;
 * @return {number}
 */
proto.desmos.posts.v1.UserAnswer.prototype.getPostId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.posts.v1.UserAnswer} returns this
 */
proto.desmos.posts.v1.UserAnswer.prototype.setPostId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint32 poll_id = 4;
 * @return {number}
 */
proto.desmos.posts.v1.UserAnswer.prototype.getPollId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.posts.v1.UserAnswer} returns this
 */
proto.desmos.posts.v1.UserAnswer.prototype.setPollId = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * repeated uint32 answers_indexes = 5;
 * @return {!Array<number>}
 */
proto.desmos.posts.v1.UserAnswer.prototype.getAnswersIndexesList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 5));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.desmos.posts.v1.UserAnswer} returns this
 */
proto.desmos.posts.v1.UserAnswer.prototype.setAnswersIndexesList = function(value) {
  return jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.desmos.posts.v1.UserAnswer} returns this
 */
proto.desmos.posts.v1.UserAnswer.prototype.addAnswersIndexes = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.posts.v1.UserAnswer} returns this
 */
proto.desmos.posts.v1.UserAnswer.prototype.clearAnswersIndexesList = function() {
  return this.setAnswersIndexesList([]);
};


/**
 * optional string user = 6;
 * @return {string}
 */
proto.desmos.posts.v1.UserAnswer.prototype.getUser = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.posts.v1.UserAnswer} returns this
 */
proto.desmos.posts.v1.UserAnswer.prototype.setUser = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};

