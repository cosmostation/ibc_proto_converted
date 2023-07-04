// source: injective/exchange/v1beta1/tx.proto
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

goog.provide('proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.CampaignRewardPool');
goog.require('proto.injective.exchange.v1beta1.TradingRewardCampaignInfo');

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
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.displayName = 'proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.repeatedFields_ = [4];



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
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    campaignInfo: (f = msg.getCampaignInfo()) && proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.toObject(includeInstance, f),
    campaignRewardPoolsList: jspb.Message.toObjectList(msg.getCampaignRewardPoolsList(),
    proto.injective.exchange.v1beta1.CampaignRewardPool.toObject, includeInstance)
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
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal;
  return proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = new proto.injective.exchange.v1beta1.TradingRewardCampaignInfo;
      reader.readMessage(value,proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.deserializeBinaryFromReader);
      msg.setCampaignInfo(value);
      break;
    case 4:
      var value = new proto.injective.exchange.v1beta1.CampaignRewardPool;
      reader.readMessage(value,proto.injective.exchange.v1beta1.CampaignRewardPool.deserializeBinaryFromReader);
      msg.addCampaignRewardPools(value);
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
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
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
  f = message.getCampaignInfo();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.injective.exchange.v1beta1.TradingRewardCampaignInfo.serializeBinaryToWriter
    );
  }
  f = message.getCampaignRewardPoolsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.injective.exchange.v1beta1.CampaignRewardPool.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional TradingRewardCampaignInfo campaign_info = 3;
 * @return {?proto.injective.exchange.v1beta1.TradingRewardCampaignInfo}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.getCampaignInfo = function() {
  return /** @type{?proto.injective.exchange.v1beta1.TradingRewardCampaignInfo} */ (
    jspb.Message.getWrapperField(this, proto.injective.exchange.v1beta1.TradingRewardCampaignInfo, 3));
};


/**
 * @param {?proto.injective.exchange.v1beta1.TradingRewardCampaignInfo|undefined} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal} returns this
*/
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.setCampaignInfo = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.clearCampaignInfo = function() {
  return this.setCampaignInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.hasCampaignInfo = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * repeated CampaignRewardPool campaign_reward_pools = 4;
 * @return {!Array<!proto.injective.exchange.v1beta1.CampaignRewardPool>}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.getCampaignRewardPoolsList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.CampaignRewardPool>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.CampaignRewardPool, 4));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.CampaignRewardPool>} value
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal} returns this
*/
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.setCampaignRewardPoolsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.CampaignRewardPool=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.CampaignRewardPool}
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.addCampaignRewardPools = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.injective.exchange.v1beta1.CampaignRewardPool, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.TradingRewardCampaignLaunchProposal.prototype.clearCampaignRewardPoolsList = function() {
  return this.setCampaignRewardPoolsList([]);
};

