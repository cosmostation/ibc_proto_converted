// source: osmosis/mint/v1beta1/mint.proto
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

goog.provide('proto.osmosis.mint.v1beta1.DistributionProportions');

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
proto.osmosis.mint.v1beta1.DistributionProportions = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.mint.v1beta1.DistributionProportions, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.mint.v1beta1.DistributionProportions.displayName = 'proto.osmosis.mint.v1beta1.DistributionProportions';
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
proto.osmosis.mint.v1beta1.DistributionProportions.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.mint.v1beta1.DistributionProportions.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.mint.v1beta1.DistributionProportions} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.mint.v1beta1.DistributionProportions.toObject = function(includeInstance, msg) {
  var f, obj = {
    staking: jspb.Message.getFieldWithDefault(msg, 1, ""),
    poolIncentives: jspb.Message.getFieldWithDefault(msg, 2, ""),
    developerRewards: jspb.Message.getFieldWithDefault(msg, 3, ""),
    communityPool: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.osmosis.mint.v1beta1.DistributionProportions}
 */
proto.osmosis.mint.v1beta1.DistributionProportions.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.mint.v1beta1.DistributionProportions;
  return proto.osmosis.mint.v1beta1.DistributionProportions.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.mint.v1beta1.DistributionProportions} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.mint.v1beta1.DistributionProportions}
 */
proto.osmosis.mint.v1beta1.DistributionProportions.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setStaking(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setPoolIncentives(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDeveloperRewards(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setCommunityPool(value);
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
proto.osmosis.mint.v1beta1.DistributionProportions.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.mint.v1beta1.DistributionProportions.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.mint.v1beta1.DistributionProportions} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.mint.v1beta1.DistributionProportions.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getStaking();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPoolIncentives();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDeveloperRewards();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getCommunityPool();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string staking = 1;
 * @return {string}
 */
proto.osmosis.mint.v1beta1.DistributionProportions.prototype.getStaking = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.mint.v1beta1.DistributionProportions} returns this
 */
proto.osmosis.mint.v1beta1.DistributionProportions.prototype.setStaking = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string pool_incentives = 2;
 * @return {string}
 */
proto.osmosis.mint.v1beta1.DistributionProportions.prototype.getPoolIncentives = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.mint.v1beta1.DistributionProportions} returns this
 */
proto.osmosis.mint.v1beta1.DistributionProportions.prototype.setPoolIncentives = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string developer_rewards = 3;
 * @return {string}
 */
proto.osmosis.mint.v1beta1.DistributionProportions.prototype.getDeveloperRewards = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.mint.v1beta1.DistributionProportions} returns this
 */
proto.osmosis.mint.v1beta1.DistributionProportions.prototype.setDeveloperRewards = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string community_pool = 4;
 * @return {string}
 */
proto.osmosis.mint.v1beta1.DistributionProportions.prototype.getCommunityPool = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.mint.v1beta1.DistributionProportions} returns this
 */
proto.osmosis.mint.v1beta1.DistributionProportions.prototype.setCommunityPool = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};

