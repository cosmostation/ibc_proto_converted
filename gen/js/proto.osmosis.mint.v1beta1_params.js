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

goog.provide('proto.osmosis.mint.v1beta1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.mint.v1beta1.DistributionProportions');
goog.require('proto.osmosis.mint.v1beta1.WeightedAddress');

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
proto.osmosis.mint.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.mint.v1beta1.Params.repeatedFields_, null);
};
goog.inherits(proto.osmosis.mint.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.mint.v1beta1.Params.displayName = 'proto.osmosis.mint.v1beta1.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.mint.v1beta1.Params.repeatedFields_ = [7];



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
proto.osmosis.mint.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.mint.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.mint.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.mint.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    mintDenom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    genesisEpochProvisions: jspb.Message.getFieldWithDefault(msg, 2, ""),
    epochIdentifier: jspb.Message.getFieldWithDefault(msg, 3, ""),
    reductionPeriodInEpochs: jspb.Message.getFieldWithDefault(msg, 4, 0),
    reductionFactor: jspb.Message.getFieldWithDefault(msg, 5, ""),
    distributionProportions: (f = msg.getDistributionProportions()) && proto.osmosis.mint.v1beta1.DistributionProportions.toObject(includeInstance, f),
    weightedDeveloperRewardsReceiversList: jspb.Message.toObjectList(msg.getWeightedDeveloperRewardsReceiversList(),
    proto.osmosis.mint.v1beta1.WeightedAddress.toObject, includeInstance),
    mintingRewardsDistributionStartEpoch: jspb.Message.getFieldWithDefault(msg, 8, 0)
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
 * @return {!proto.osmosis.mint.v1beta1.Params}
 */
proto.osmosis.mint.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.mint.v1beta1.Params;
  return proto.osmosis.mint.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.mint.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.mint.v1beta1.Params}
 */
proto.osmosis.mint.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setMintDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setGenesisEpochProvisions(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setEpochIdentifier(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setReductionPeriodInEpochs(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setReductionFactor(value);
      break;
    case 6:
      var value = new proto.osmosis.mint.v1beta1.DistributionProportions;
      reader.readMessage(value,proto.osmosis.mint.v1beta1.DistributionProportions.deserializeBinaryFromReader);
      msg.setDistributionProportions(value);
      break;
    case 7:
      var value = new proto.osmosis.mint.v1beta1.WeightedAddress;
      reader.readMessage(value,proto.osmosis.mint.v1beta1.WeightedAddress.deserializeBinaryFromReader);
      msg.addWeightedDeveloperRewardsReceivers(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setMintingRewardsDistributionStartEpoch(value);
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
proto.osmosis.mint.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.mint.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.mint.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.mint.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMintDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getGenesisEpochProvisions();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getEpochIdentifier();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getReductionPeriodInEpochs();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
  f = message.getReductionFactor();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getDistributionProportions();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.osmosis.mint.v1beta1.DistributionProportions.serializeBinaryToWriter
    );
  }
  f = message.getWeightedDeveloperRewardsReceiversList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.osmosis.mint.v1beta1.WeightedAddress.serializeBinaryToWriter
    );
  }
  f = message.getMintingRewardsDistributionStartEpoch();
  if (f !== 0) {
    writer.writeInt64(
      8,
      f
    );
  }
};


/**
 * optional string mint_denom = 1;
 * @return {string}
 */
proto.osmosis.mint.v1beta1.Params.prototype.getMintDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.mint.v1beta1.Params} returns this
 */
proto.osmosis.mint.v1beta1.Params.prototype.setMintDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string genesis_epoch_provisions = 2;
 * @return {string}
 */
proto.osmosis.mint.v1beta1.Params.prototype.getGenesisEpochProvisions = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.mint.v1beta1.Params} returns this
 */
proto.osmosis.mint.v1beta1.Params.prototype.setGenesisEpochProvisions = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string epoch_identifier = 3;
 * @return {string}
 */
proto.osmosis.mint.v1beta1.Params.prototype.getEpochIdentifier = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.mint.v1beta1.Params} returns this
 */
proto.osmosis.mint.v1beta1.Params.prototype.setEpochIdentifier = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional int64 reduction_period_in_epochs = 4;
 * @return {number}
 */
proto.osmosis.mint.v1beta1.Params.prototype.getReductionPeriodInEpochs = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.mint.v1beta1.Params} returns this
 */
proto.osmosis.mint.v1beta1.Params.prototype.setReductionPeriodInEpochs = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional string reduction_factor = 5;
 * @return {string}
 */
proto.osmosis.mint.v1beta1.Params.prototype.getReductionFactor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.mint.v1beta1.Params} returns this
 */
proto.osmosis.mint.v1beta1.Params.prototype.setReductionFactor = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional DistributionProportions distribution_proportions = 6;
 * @return {?proto.osmosis.mint.v1beta1.DistributionProportions}
 */
proto.osmosis.mint.v1beta1.Params.prototype.getDistributionProportions = function() {
  return /** @type{?proto.osmosis.mint.v1beta1.DistributionProportions} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.mint.v1beta1.DistributionProportions, 6));
};


/**
 * @param {?proto.osmosis.mint.v1beta1.DistributionProportions|undefined} value
 * @return {!proto.osmosis.mint.v1beta1.Params} returns this
*/
proto.osmosis.mint.v1beta1.Params.prototype.setDistributionProportions = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.mint.v1beta1.Params} returns this
 */
proto.osmosis.mint.v1beta1.Params.prototype.clearDistributionProportions = function() {
  return this.setDistributionProportions(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.mint.v1beta1.Params.prototype.hasDistributionProportions = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * repeated WeightedAddress weighted_developer_rewards_receivers = 7;
 * @return {!Array<!proto.osmosis.mint.v1beta1.WeightedAddress>}
 */
proto.osmosis.mint.v1beta1.Params.prototype.getWeightedDeveloperRewardsReceiversList = function() {
  return /** @type{!Array<!proto.osmosis.mint.v1beta1.WeightedAddress>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.mint.v1beta1.WeightedAddress, 7));
};


/**
 * @param {!Array<!proto.osmosis.mint.v1beta1.WeightedAddress>} value
 * @return {!proto.osmosis.mint.v1beta1.Params} returns this
*/
proto.osmosis.mint.v1beta1.Params.prototype.setWeightedDeveloperRewardsReceiversList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.osmosis.mint.v1beta1.WeightedAddress=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.mint.v1beta1.WeightedAddress}
 */
proto.osmosis.mint.v1beta1.Params.prototype.addWeightedDeveloperRewardsReceivers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.osmosis.mint.v1beta1.WeightedAddress, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.mint.v1beta1.Params} returns this
 */
proto.osmosis.mint.v1beta1.Params.prototype.clearWeightedDeveloperRewardsReceiversList = function() {
  return this.setWeightedDeveloperRewardsReceiversList([]);
};


/**
 * optional int64 minting_rewards_distribution_start_epoch = 8;
 * @return {number}
 */
proto.osmosis.mint.v1beta1.Params.prototype.getMintingRewardsDistributionStartEpoch = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.mint.v1beta1.Params} returns this
 */
proto.osmosis.mint.v1beta1.Params.prototype.setMintingRewardsDistributionStartEpoch = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


