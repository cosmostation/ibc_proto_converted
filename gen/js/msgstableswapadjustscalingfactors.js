// source: osmosis/gamm/pool-models/stableswap/tx.proto
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

goog.provide('proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors');

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
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.repeatedFields_, null);
};
goog.inherits(proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.displayName = 'proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.repeatedFields_ = [3];



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
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    poolId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    scalingFactorsList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f
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
 * @return {!proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors}
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors;
  return proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors}
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 3:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint64() : [reader.readUint64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addScalingFactors(values[i]);
      }
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
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getScalingFactorsList();
  if (f.length > 0) {
    writer.writePackedUint64(
      3,
      f
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors} returns this
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 pool_id = 2;
 * @return {number}
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors} returns this
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * repeated uint64 scaling_factors = 3;
 * @return {!Array<number>}
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.prototype.getScalingFactorsList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors} returns this
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.prototype.setScalingFactorsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors} returns this
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.prototype.addScalingFactors = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors} returns this
 */
proto.osmosis.gamm.poolmodels.stableswap.v1beta1.MsgStableSwapAdjustScalingFactors.prototype.clearScalingFactorsList = function() {
  return this.setScalingFactorsList([]);
};

