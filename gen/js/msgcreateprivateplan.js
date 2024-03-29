// source: crescent/lpfarm/v1beta1/tx.proto
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

goog.provide('proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.crescent.lpfarm.v1beta1.RewardAllocation');
goog.require('proto.google.protobuf.Timestamp');

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
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.repeatedFields_, null);
};
goog.inherits(proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.displayName = 'proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.repeatedFields_ = [3];



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
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.toObject = function(includeInstance, msg) {
  var f, obj = {
    creator: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    rewardAllocationsList: jspb.Message.toObjectList(msg.getRewardAllocationsList(),
    proto.crescent.lpfarm.v1beta1.RewardAllocation.toObject, includeInstance),
    startTime: (f = msg.getStartTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    endTime: (f = msg.getEndTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan}
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan;
  return proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan}
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = new proto.crescent.lpfarm.v1beta1.RewardAllocation;
      reader.readMessage(value,proto.crescent.lpfarm.v1beta1.RewardAllocation.deserializeBinaryFromReader);
      msg.addRewardAllocations(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartTime(value);
      break;
    case 5:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setEndTime(value);
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
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCreator();
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
  f = message.getRewardAllocationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.crescent.lpfarm.v1beta1.RewardAllocation.serializeBinaryToWriter
    );
  }
  f = message.getStartTime();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getEndTime();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional string creator = 1;
 * @return {string}
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan} returns this
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan} returns this
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated RewardAllocation reward_allocations = 3;
 * @return {!Array<!proto.crescent.lpfarm.v1beta1.RewardAllocation>}
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.getRewardAllocationsList = function() {
  return /** @type{!Array<!proto.crescent.lpfarm.v1beta1.RewardAllocation>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.crescent.lpfarm.v1beta1.RewardAllocation, 3));
};


/**
 * @param {!Array<!proto.crescent.lpfarm.v1beta1.RewardAllocation>} value
 * @return {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan} returns this
*/
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.setRewardAllocationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.crescent.lpfarm.v1beta1.RewardAllocation=} opt_value
 * @param {number=} opt_index
 * @return {!proto.crescent.lpfarm.v1beta1.RewardAllocation}
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.addRewardAllocations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.crescent.lpfarm.v1beta1.RewardAllocation, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan} returns this
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.clearRewardAllocationsList = function() {
  return this.setRewardAllocationsList([]);
};


/**
 * optional google.protobuf.Timestamp start_time = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.getStartTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan} returns this
*/
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.setStartTime = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan} returns this
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.clearStartTime = function() {
  return this.setStartTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.hasStartTime = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional google.protobuf.Timestamp end_time = 5;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.getEndTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 5));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan} returns this
*/
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.setEndTime = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan} returns this
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.clearEndTime = function() {
  return this.setEndTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.lpfarm.v1beta1.MsgCreatePrivatePlan.prototype.hasEndTime = function() {
  return jspb.Message.getField(this, 5) != null;
};


