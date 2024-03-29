// source: stafihub/mining/models.proto
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

goog.provide('proto.stafihub.stafihub.mining.UserRewardInfo');

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
proto.stafihub.stafihub.mining.UserRewardInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stafihub.stafihub.mining.UserRewardInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.mining.UserRewardInfo.displayName = 'proto.stafihub.stafihub.mining.UserRewardInfo';
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
proto.stafihub.stafihub.mining.UserRewardInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.mining.UserRewardInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.mining.UserRewardInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.mining.UserRewardInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    rewardpoolindex: jspb.Message.getFieldWithDefault(msg, 1, 0),
    rewardtokendenom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    rewarddebt: jspb.Message.getFieldWithDefault(msg, 3, ""),
    claimedamount: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.stafihub.stafihub.mining.UserRewardInfo}
 */
proto.stafihub.stafihub.mining.UserRewardInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.mining.UserRewardInfo;
  return proto.stafihub.stafihub.mining.UserRewardInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.mining.UserRewardInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.mining.UserRewardInfo}
 */
proto.stafihub.stafihub.mining.UserRewardInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setRewardpoolindex(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setRewardtokendenom(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setRewarddebt(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setClaimedamount(value);
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
proto.stafihub.stafihub.mining.UserRewardInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.mining.UserRewardInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.mining.UserRewardInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.mining.UserRewardInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRewardpoolindex();
  if (f !== 0) {
    writer.writeUint32(
      1,
      f
    );
  }
  f = message.getRewardtokendenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getRewarddebt();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getClaimedamount();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional uint32 rewardPoolIndex = 1;
 * @return {number}
 */
proto.stafihub.stafihub.mining.UserRewardInfo.prototype.getRewardpoolindex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.stafihub.stafihub.mining.UserRewardInfo} returns this
 */
proto.stafihub.stafihub.mining.UserRewardInfo.prototype.setRewardpoolindex = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string rewardTokenDenom = 2;
 * @return {string}
 */
proto.stafihub.stafihub.mining.UserRewardInfo.prototype.getRewardtokendenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.mining.UserRewardInfo} returns this
 */
proto.stafihub.stafihub.mining.UserRewardInfo.prototype.setRewardtokendenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string rewardDebt = 3;
 * @return {string}
 */
proto.stafihub.stafihub.mining.UserRewardInfo.prototype.getRewarddebt = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.mining.UserRewardInfo} returns this
 */
proto.stafihub.stafihub.mining.UserRewardInfo.prototype.setRewarddebt = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string claimedAmount = 4;
 * @return {string}
 */
proto.stafihub.stafihub.mining.UserRewardInfo.prototype.getClaimedamount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.mining.UserRewardInfo} returns this
 */
proto.stafihub.stafihub.mining.UserRewardInfo.prototype.setClaimedamount = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


