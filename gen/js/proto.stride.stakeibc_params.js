// source: stride/stakeibc/params.proto
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

goog.provide('proto.stride.stakeibc.Params');

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
proto.stride.stakeibc.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stride.stakeibc.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.stakeibc.Params.displayName = 'proto.stride.stakeibc.Params';
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
proto.stride.stakeibc.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.stakeibc.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.stakeibc.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.stakeibc.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    rewardsInterval: jspb.Message.getFieldWithDefault(msg, 1, 0),
    delegateInterval: jspb.Message.getFieldWithDefault(msg, 6, 0),
    depositInterval: jspb.Message.getFieldWithDefault(msg, 2, 0),
    redemptionRateInterval: jspb.Message.getFieldWithDefault(msg, 3, 0),
    strideCommission: jspb.Message.getFieldWithDefault(msg, 4, 0),
    reinvestInterval: jspb.Message.getFieldWithDefault(msg, 7, 0),
    icaTimeoutNanos: jspb.Message.getFieldWithDefault(msg, 9, 0),
    bufferSize: jspb.Message.getFieldWithDefault(msg, 10, 0),
    ibcTimeoutBlocks: jspb.Message.getFieldWithDefault(msg, 11, 0),
    feeTransferTimeoutNanos: jspb.Message.getFieldWithDefault(msg, 12, 0),
    maxStakeIcaCallsPerEpoch: jspb.Message.getFieldWithDefault(msg, 13, 0),
    defaultMinRedemptionRateThreshold: jspb.Message.getFieldWithDefault(msg, 14, 0),
    defaultMaxRedemptionRateThreshold: jspb.Message.getFieldWithDefault(msg, 15, 0),
    ibcTransferTimeoutNanos: jspb.Message.getFieldWithDefault(msg, 16, 0),
    safetyNumValidators: jspb.Message.getFieldWithDefault(msg, 17, 0),
    safetyMaxSlashPercent: jspb.Message.getFieldWithDefault(msg, 18, 0)
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
 * @return {!proto.stride.stakeibc.Params}
 */
proto.stride.stakeibc.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.stakeibc.Params;
  return proto.stride.stakeibc.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.stakeibc.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.stakeibc.Params}
 */
proto.stride.stakeibc.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRewardsInterval(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDelegateInterval(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDepositInterval(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRedemptionRateInterval(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setStrideCommission(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setReinvestInterval(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setIcaTimeoutNanos(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBufferSize(value);
      break;
    case 11:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setIbcTimeoutBlocks(value);
      break;
    case 12:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setFeeTransferTimeoutNanos(value);
      break;
    case 13:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxStakeIcaCallsPerEpoch(value);
      break;
    case 14:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDefaultMinRedemptionRateThreshold(value);
      break;
    case 15:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDefaultMaxRedemptionRateThreshold(value);
      break;
    case 16:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setIbcTransferTimeoutNanos(value);
      break;
    case 17:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSafetyNumValidators(value);
      break;
    case 18:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSafetyMaxSlashPercent(value);
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
proto.stride.stakeibc.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.stakeibc.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.stakeibc.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.stakeibc.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRewardsInterval();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getDelegateInterval();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getDepositInterval();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getRedemptionRateInterval();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getStrideCommission();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getReinvestInterval();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getIcaTimeoutNanos();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
  f = message.getBufferSize();
  if (f !== 0) {
    writer.writeUint64(
      10,
      f
    );
  }
  f = message.getIbcTimeoutBlocks();
  if (f !== 0) {
    writer.writeUint64(
      11,
      f
    );
  }
  f = message.getFeeTransferTimeoutNanos();
  if (f !== 0) {
    writer.writeUint64(
      12,
      f
    );
  }
  f = message.getMaxStakeIcaCallsPerEpoch();
  if (f !== 0) {
    writer.writeUint64(
      13,
      f
    );
  }
  f = message.getDefaultMinRedemptionRateThreshold();
  if (f !== 0) {
    writer.writeUint64(
      14,
      f
    );
  }
  f = message.getDefaultMaxRedemptionRateThreshold();
  if (f !== 0) {
    writer.writeUint64(
      15,
      f
    );
  }
  f = message.getIbcTransferTimeoutNanos();
  if (f !== 0) {
    writer.writeUint64(
      16,
      f
    );
  }
  f = message.getSafetyNumValidators();
  if (f !== 0) {
    writer.writeUint64(
      17,
      f
    );
  }
  f = message.getSafetyMaxSlashPercent();
  if (f !== 0) {
    writer.writeUint64(
      18,
      f
    );
  }
};


/**
 * optional uint64 rewards_interval = 1;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getRewardsInterval = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setRewardsInterval = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 delegate_interval = 6;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getDelegateInterval = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setDelegateInterval = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional uint64 deposit_interval = 2;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getDepositInterval = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setDepositInterval = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 redemption_rate_interval = 3;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getRedemptionRateInterval = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setRedemptionRateInterval = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 stride_commission = 4;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getStrideCommission = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setStrideCommission = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 reinvest_interval = 7;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getReinvestInterval = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setReinvestInterval = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional uint64 ica_timeout_nanos = 9;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getIcaTimeoutNanos = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setIcaTimeoutNanos = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional uint64 buffer_size = 10;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getBufferSize = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setBufferSize = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


/**
 * optional uint64 ibc_timeout_blocks = 11;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getIbcTimeoutBlocks = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setIbcTimeoutBlocks = function(value) {
  return jspb.Message.setProto3IntField(this, 11, value);
};


/**
 * optional uint64 fee_transfer_timeout_nanos = 12;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getFeeTransferTimeoutNanos = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setFeeTransferTimeoutNanos = function(value) {
  return jspb.Message.setProto3IntField(this, 12, value);
};


/**
 * optional uint64 max_stake_ica_calls_per_epoch = 13;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getMaxStakeIcaCallsPerEpoch = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 13, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setMaxStakeIcaCallsPerEpoch = function(value) {
  return jspb.Message.setProto3IntField(this, 13, value);
};


/**
 * optional uint64 default_min_redemption_rate_threshold = 14;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getDefaultMinRedemptionRateThreshold = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 14, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setDefaultMinRedemptionRateThreshold = function(value) {
  return jspb.Message.setProto3IntField(this, 14, value);
};


/**
 * optional uint64 default_max_redemption_rate_threshold = 15;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getDefaultMaxRedemptionRateThreshold = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 15, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setDefaultMaxRedemptionRateThreshold = function(value) {
  return jspb.Message.setProto3IntField(this, 15, value);
};


/**
 * optional uint64 ibc_transfer_timeout_nanos = 16;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getIbcTransferTimeoutNanos = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 16, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setIbcTransferTimeoutNanos = function(value) {
  return jspb.Message.setProto3IntField(this, 16, value);
};


/**
 * optional uint64 safety_num_validators = 17;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getSafetyNumValidators = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 17, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setSafetyNumValidators = function(value) {
  return jspb.Message.setProto3IntField(this, 17, value);
};


/**
 * optional uint64 safety_max_slash_percent = 18;
 * @return {number}
 */
proto.stride.stakeibc.Params.prototype.getSafetyMaxSlashPercent = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 18, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.Params} returns this
 */
proto.stride.stakeibc.Params.prototype.setSafetyMaxSlashPercent = function(value) {
  return jspb.Message.setProto3IntField(this, 18, value);
};


