// source: injective/peggy/v1/msgs.proto
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

goog.provide('proto.injective.peggy.v1.MsgValsetUpdatedClaim');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.peggy.v1.BridgeValidator');

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
proto.injective.peggy.v1.MsgValsetUpdatedClaim = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.peggy.v1.MsgValsetUpdatedClaim.repeatedFields_, null);
};
goog.inherits(proto.injective.peggy.v1.MsgValsetUpdatedClaim, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.peggy.v1.MsgValsetUpdatedClaim.displayName = 'proto.injective.peggy.v1.MsgValsetUpdatedClaim';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.repeatedFields_ = [4];



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
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.peggy.v1.MsgValsetUpdatedClaim.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.peggy.v1.MsgValsetUpdatedClaim} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.toObject = function(includeInstance, msg) {
  var f, obj = {
    eventNonce: jspb.Message.getFieldWithDefault(msg, 1, 0),
    valsetNonce: jspb.Message.getFieldWithDefault(msg, 2, 0),
    blockHeight: jspb.Message.getFieldWithDefault(msg, 3, 0),
    membersList: jspb.Message.toObjectList(msg.getMembersList(),
    proto.injective.peggy.v1.BridgeValidator.toObject, includeInstance),
    rewardAmount: jspb.Message.getFieldWithDefault(msg, 5, ""),
    rewardToken: jspb.Message.getFieldWithDefault(msg, 6, ""),
    orchestrator: jspb.Message.getFieldWithDefault(msg, 7, "")
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
 * @return {!proto.injective.peggy.v1.MsgValsetUpdatedClaim}
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.peggy.v1.MsgValsetUpdatedClaim;
  return proto.injective.peggy.v1.MsgValsetUpdatedClaim.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.peggy.v1.MsgValsetUpdatedClaim} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.peggy.v1.MsgValsetUpdatedClaim}
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setEventNonce(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setValsetNonce(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBlockHeight(value);
      break;
    case 4:
      var value = new proto.injective.peggy.v1.BridgeValidator;
      reader.readMessage(value,proto.injective.peggy.v1.BridgeValidator.deserializeBinaryFromReader);
      msg.addMembers(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setRewardAmount(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setRewardToken(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setOrchestrator(value);
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
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.peggy.v1.MsgValsetUpdatedClaim.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.peggy.v1.MsgValsetUpdatedClaim} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEventNonce();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getValsetNonce();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getBlockHeight();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getMembersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.injective.peggy.v1.BridgeValidator.serializeBinaryToWriter
    );
  }
  f = message.getRewardAmount();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getRewardToken();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getOrchestrator();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
};


/**
 * optional uint64 event_nonce = 1;
 * @return {number}
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.getEventNonce = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.MsgValsetUpdatedClaim} returns this
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.setEventNonce = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 valset_nonce = 2;
 * @return {number}
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.getValsetNonce = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.MsgValsetUpdatedClaim} returns this
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.setValsetNonce = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 block_height = 3;
 * @return {number}
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.getBlockHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.MsgValsetUpdatedClaim} returns this
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.setBlockHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * repeated BridgeValidator members = 4;
 * @return {!Array<!proto.injective.peggy.v1.BridgeValidator>}
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.getMembersList = function() {
  return /** @type{!Array<!proto.injective.peggy.v1.BridgeValidator>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.peggy.v1.BridgeValidator, 4));
};


/**
 * @param {!Array<!proto.injective.peggy.v1.BridgeValidator>} value
 * @return {!proto.injective.peggy.v1.MsgValsetUpdatedClaim} returns this
*/
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.setMembersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.injective.peggy.v1.BridgeValidator=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.peggy.v1.BridgeValidator}
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.addMembers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.injective.peggy.v1.BridgeValidator, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.peggy.v1.MsgValsetUpdatedClaim} returns this
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.clearMembersList = function() {
  return this.setMembersList([]);
};


/**
 * optional string reward_amount = 5;
 * @return {string}
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.getRewardAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.MsgValsetUpdatedClaim} returns this
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.setRewardAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string reward_token = 6;
 * @return {string}
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.getRewardToken = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.MsgValsetUpdatedClaim} returns this
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.setRewardToken = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string orchestrator = 7;
 * @return {string}
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.getOrchestrator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.MsgValsetUpdatedClaim} returns this
 */
proto.injective.peggy.v1.MsgValsetUpdatedClaim.prototype.setOrchestrator = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};

