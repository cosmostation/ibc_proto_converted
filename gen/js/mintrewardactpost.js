// source: stafihub/rmintreward/models.proto
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

goog.provide('proto.stafihub.stafihub.rmintreward.MintRewardActPost');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost');

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
proto.stafihub.stafihub.rmintreward.MintRewardActPost = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stafihub.stafihub.rmintreward.MintRewardActPost.repeatedFields_, null);
};
goog.inherits(proto.stafihub.stafihub.rmintreward.MintRewardActPost, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.rmintreward.MintRewardActPost.displayName = 'proto.stafihub.stafihub.rmintreward.MintRewardActPost';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.repeatedFields_ = [7];



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
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.rmintreward.MintRewardActPost.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.rmintreward.MintRewardActPost} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.toObject = function(includeInstance, msg) {
  var f, obj = {
    begin: jspb.Message.getFieldWithDefault(msg, 1, 0),
    end: jspb.Message.getFieldWithDefault(msg, 2, 0),
    lockedblocks: jspb.Message.getFieldWithDefault(msg, 3, 0),
    tokenrewardinfosList: jspb.Message.toObjectList(msg.getTokenrewardinfosList(),
    proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost.toObject, includeInstance)
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
 * @return {!proto.stafihub.stafihub.rmintreward.MintRewardActPost}
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.rmintreward.MintRewardActPost;
  return proto.stafihub.stafihub.rmintreward.MintRewardActPost.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.rmintreward.MintRewardActPost} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.rmintreward.MintRewardActPost}
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setBegin(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setEnd(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setLockedblocks(value);
      break;
    case 7:
      var value = new proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost;
      reader.readMessage(value,proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost.deserializeBinaryFromReader);
      msg.addTokenrewardinfos(value);
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
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.rmintreward.MintRewardActPost.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.rmintreward.MintRewardActPost} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBegin();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getEnd();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
  f = message.getLockedblocks();
  if (f !== 0) {
    writer.writeInt64(
      3,
      f
    );
  }
  f = message.getTokenrewardinfosList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost.serializeBinaryToWriter
    );
  }
};


/**
 * optional int64 begin = 1;
 * @return {number}
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.getBegin = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.stafihub.stafihub.rmintreward.MintRewardActPost} returns this
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.setBegin = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional int64 end = 2;
 * @return {number}
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.getEnd = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.stafihub.stafihub.rmintreward.MintRewardActPost} returns this
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.setEnd = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional int64 lockedBlocks = 3;
 * @return {number}
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.getLockedblocks = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.stafihub.stafihub.rmintreward.MintRewardActPost} returns this
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.setLockedblocks = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * repeated TokenRewardInfoPost tokenRewardInfos = 7;
 * @return {!Array<!proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost>}
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.getTokenrewardinfosList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost, 7));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost>} value
 * @return {!proto.stafihub.stafihub.rmintreward.MintRewardActPost} returns this
*/
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.setTokenrewardinfosList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost}
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.addTokenrewardinfos = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.stafihub.stafihub.rmintreward.TokenRewardInfoPost, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.rmintreward.MintRewardActPost} returns this
 */
proto.stafihub.stafihub.rmintreward.MintRewardActPost.prototype.clearTokenrewardinfosList = function() {
  return this.setTokenrewardinfosList([]);
};


