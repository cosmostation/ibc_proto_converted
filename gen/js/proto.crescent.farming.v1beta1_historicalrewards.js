// source: crescent/farming/v1beta1/farming.proto
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

goog.provide('proto.crescent.farming.v1beta1.HistoricalRewards');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.DecCoin');

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
proto.crescent.farming.v1beta1.HistoricalRewards = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.crescent.farming.v1beta1.HistoricalRewards.repeatedFields_, null);
};
goog.inherits(proto.crescent.farming.v1beta1.HistoricalRewards, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.farming.v1beta1.HistoricalRewards.displayName = 'proto.crescent.farming.v1beta1.HistoricalRewards';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.crescent.farming.v1beta1.HistoricalRewards.repeatedFields_ = [1];



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
proto.crescent.farming.v1beta1.HistoricalRewards.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.farming.v1beta1.HistoricalRewards.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.farming.v1beta1.HistoricalRewards} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.farming.v1beta1.HistoricalRewards.toObject = function(includeInstance, msg) {
  var f, obj = {
    cumulativeUnitRewardsList: jspb.Message.toObjectList(msg.getCumulativeUnitRewardsList(),
    proto.cosmos.base.v1beta1.DecCoin.toObject, includeInstance)
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
 * @return {!proto.crescent.farming.v1beta1.HistoricalRewards}
 */
proto.crescent.farming.v1beta1.HistoricalRewards.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.farming.v1beta1.HistoricalRewards;
  return proto.crescent.farming.v1beta1.HistoricalRewards.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.farming.v1beta1.HistoricalRewards} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.farming.v1beta1.HistoricalRewards}
 */
proto.crescent.farming.v1beta1.HistoricalRewards.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.addCumulativeUnitRewards(value);
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
proto.crescent.farming.v1beta1.HistoricalRewards.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.farming.v1beta1.HistoricalRewards.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.farming.v1beta1.HistoricalRewards} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.farming.v1beta1.HistoricalRewards.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCumulativeUnitRewardsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.DecCoin cumulative_unit_rewards = 1;
 * @return {!Array<!proto.cosmos.base.v1beta1.DecCoin>}
 */
proto.crescent.farming.v1beta1.HistoricalRewards.prototype.getCumulativeUnitRewardsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.DecCoin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 1));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.DecCoin>} value
 * @return {!proto.crescent.farming.v1beta1.HistoricalRewards} returns this
*/
proto.crescent.farming.v1beta1.HistoricalRewards.prototype.setCumulativeUnitRewardsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.DecCoin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.DecCoin}
 */
proto.crescent.farming.v1beta1.HistoricalRewards.prototype.addCumulativeUnitRewards = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.base.v1beta1.DecCoin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.farming.v1beta1.HistoricalRewards} returns this
 */
proto.crescent.farming.v1beta1.HistoricalRewards.prototype.clearCumulativeUnitRewardsList = function() {
  return this.setCumulativeUnitRewardsList([]);
};


