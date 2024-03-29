// source: kyve/team/v1beta1/query.proto
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

goog.provide('proto.kyve.team.v1beta1.QueryVestingStatus');

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
proto.kyve.team.v1beta1.QueryVestingStatus = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.team.v1beta1.QueryVestingStatus, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.team.v1beta1.QueryVestingStatus.displayName = 'proto.kyve.team.v1beta1.QueryVestingStatus';
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
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.team.v1beta1.QueryVestingStatus.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.team.v1beta1.QueryVestingStatus} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.team.v1beta1.QueryVestingStatus.toObject = function(includeInstance, msg) {
  var f, obj = {
    totalVestedAmount: jspb.Message.getFieldWithDefault(msg, 1, 0),
    totalUnlockedAmount: jspb.Message.getFieldWithDefault(msg, 2, 0),
    currentClaimableAmount: jspb.Message.getFieldWithDefault(msg, 3, 0),
    lockedVestedAmount: jspb.Message.getFieldWithDefault(msg, 4, 0),
    remainingUnvestedAmount: jspb.Message.getFieldWithDefault(msg, 5, 0),
    claimedAmount: jspb.Message.getFieldWithDefault(msg, 6, 0),
    totalRewards: jspb.Message.getFieldWithDefault(msg, 7, 0),
    claimedRewards: jspb.Message.getFieldWithDefault(msg, 8, 0),
    availableRewards: jspb.Message.getFieldWithDefault(msg, 9, 0)
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
 * @return {!proto.kyve.team.v1beta1.QueryVestingStatus}
 */
proto.kyve.team.v1beta1.QueryVestingStatus.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.team.v1beta1.QueryVestingStatus;
  return proto.kyve.team.v1beta1.QueryVestingStatus.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.team.v1beta1.QueryVestingStatus} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.team.v1beta1.QueryVestingStatus}
 */
proto.kyve.team.v1beta1.QueryVestingStatus.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTotalVestedAmount(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTotalUnlockedAmount(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCurrentClaimableAmount(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLockedVestedAmount(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRemainingUnvestedAmount(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setClaimedAmount(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTotalRewards(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setClaimedRewards(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAvailableRewards(value);
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
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.team.v1beta1.QueryVestingStatus.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.team.v1beta1.QueryVestingStatus} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.team.v1beta1.QueryVestingStatus.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTotalVestedAmount();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getTotalUnlockedAmount();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getCurrentClaimableAmount();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getLockedVestedAmount();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getRemainingUnvestedAmount();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getClaimedAmount();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getTotalRewards();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getClaimedRewards();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
  f = message.getAvailableRewards();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
};


/**
 * optional uint64 total_vested_amount = 1;
 * @return {number}
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.getTotalVestedAmount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.team.v1beta1.QueryVestingStatus} returns this
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.setTotalVestedAmount = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 total_unlocked_amount = 2;
 * @return {number}
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.getTotalUnlockedAmount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.team.v1beta1.QueryVestingStatus} returns this
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.setTotalUnlockedAmount = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 current_claimable_amount = 3;
 * @return {number}
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.getCurrentClaimableAmount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.team.v1beta1.QueryVestingStatus} returns this
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.setCurrentClaimableAmount = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 locked_vested_amount = 4;
 * @return {number}
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.getLockedVestedAmount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.team.v1beta1.QueryVestingStatus} returns this
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.setLockedVestedAmount = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 remaining_unvested_amount = 5;
 * @return {number}
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.getRemainingUnvestedAmount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.team.v1beta1.QueryVestingStatus} returns this
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.setRemainingUnvestedAmount = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional uint64 claimed_amount = 6;
 * @return {number}
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.getClaimedAmount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.team.v1beta1.QueryVestingStatus} returns this
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.setClaimedAmount = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional uint64 total_rewards = 7;
 * @return {number}
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.getTotalRewards = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.team.v1beta1.QueryVestingStatus} returns this
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.setTotalRewards = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional uint64 claimed_rewards = 8;
 * @return {number}
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.getClaimedRewards = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.team.v1beta1.QueryVestingStatus} returns this
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.setClaimedRewards = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional uint64 available_rewards = 9;
 * @return {number}
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.getAvailableRewards = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.team.v1beta1.QueryVestingStatus} returns this
 */
proto.kyve.team.v1beta1.QueryVestingStatus.prototype.setAvailableRewards = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


