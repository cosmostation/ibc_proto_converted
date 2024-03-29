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

goog.provide('proto.injective.exchange.v1beta1.BatchExchangeModificationProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal');
goog.require('proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal');
goog.require('proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal');
goog.require('proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal');
goog.require('proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal');
goog.require('proto.injective.exchange.v1beta1.SpotMarketLaunchProposal');
goog.require('proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal');
goog.require('proto.injective.exchange.v1beta1.TradingRewardCampaignUpdateProposal');
goog.require('proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal');

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
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.BatchExchangeModificationProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.displayName = 'proto.injective.exchange.v1beta1.BatchExchangeModificationProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.repeatedFields_ = [3,4,5,6,7,9,10];



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
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    spotMarketParamUpdateProposalsList: jspb.Message.toObjectList(msg.getSpotMarketParamUpdateProposalsList(),
    proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.toObject, includeInstance),
    derivativeMarketParamUpdateProposalsList: jspb.Message.toObjectList(msg.getDerivativeMarketParamUpdateProposalsList(),
    proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal.toObject, includeInstance),
    spotMarketLaunchProposalsList: jspb.Message.toObjectList(msg.getSpotMarketLaunchProposalsList(),
    proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.toObject, includeInstance),
    perpetualMarketLaunchProposalsList: jspb.Message.toObjectList(msg.getPerpetualMarketLaunchProposalsList(),
    proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal.toObject, includeInstance),
    expiryFuturesMarketLaunchProposalsList: jspb.Message.toObjectList(msg.getExpiryFuturesMarketLaunchProposalsList(),
    proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.toObject, includeInstance),
    tradingRewardCampaignUpdateProposal: (f = msg.getTradingRewardCampaignUpdateProposal()) && proto.injective.exchange.v1beta1.TradingRewardCampaignUpdateProposal.toObject(includeInstance, f),
    binaryOptionsMarketLaunchProposalsList: jspb.Message.toObjectList(msg.getBinaryOptionsMarketLaunchProposalsList(),
    proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal.toObject, includeInstance),
    binaryOptionsParamUpdateProposalsList: jspb.Message.toObjectList(msg.getBinaryOptionsParamUpdateProposalsList(),
    proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal.toObject, includeInstance),
    denomDecimalsUpdateProposal: (f = msg.getDenomDecimalsUpdateProposal()) && proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.toObject(includeInstance, f)
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
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.BatchExchangeModificationProposal;
  return proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal;
      reader.readMessage(value,proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.deserializeBinaryFromReader);
      msg.addSpotMarketParamUpdateProposals(value);
      break;
    case 4:
      var value = new proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal;
      reader.readMessage(value,proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal.deserializeBinaryFromReader);
      msg.addDerivativeMarketParamUpdateProposals(value);
      break;
    case 5:
      var value = new proto.injective.exchange.v1beta1.SpotMarketLaunchProposal;
      reader.readMessage(value,proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.deserializeBinaryFromReader);
      msg.addSpotMarketLaunchProposals(value);
      break;
    case 6:
      var value = new proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal;
      reader.readMessage(value,proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal.deserializeBinaryFromReader);
      msg.addPerpetualMarketLaunchProposals(value);
      break;
    case 7:
      var value = new proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal;
      reader.readMessage(value,proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.deserializeBinaryFromReader);
      msg.addExpiryFuturesMarketLaunchProposals(value);
      break;
    case 8:
      var value = new proto.injective.exchange.v1beta1.TradingRewardCampaignUpdateProposal;
      reader.readMessage(value,proto.injective.exchange.v1beta1.TradingRewardCampaignUpdateProposal.deserializeBinaryFromReader);
      msg.setTradingRewardCampaignUpdateProposal(value);
      break;
    case 9:
      var value = new proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal;
      reader.readMessage(value,proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal.deserializeBinaryFromReader);
      msg.addBinaryOptionsMarketLaunchProposals(value);
      break;
    case 10:
      var value = new proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal;
      reader.readMessage(value,proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal.deserializeBinaryFromReader);
      msg.addBinaryOptionsParamUpdateProposals(value);
      break;
    case 11:
      var value = new proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal;
      reader.readMessage(value,proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.deserializeBinaryFromReader);
      msg.setDenomDecimalsUpdateProposal(value);
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
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getSpotMarketParamUpdateProposalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.serializeBinaryToWriter
    );
  }
  f = message.getDerivativeMarketParamUpdateProposalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal.serializeBinaryToWriter
    );
  }
  f = message.getSpotMarketLaunchProposalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.injective.exchange.v1beta1.SpotMarketLaunchProposal.serializeBinaryToWriter
    );
  }
  f = message.getPerpetualMarketLaunchProposalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal.serializeBinaryToWriter
    );
  }
  f = message.getExpiryFuturesMarketLaunchProposalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.serializeBinaryToWriter
    );
  }
  f = message.getTradingRewardCampaignUpdateProposal();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.injective.exchange.v1beta1.TradingRewardCampaignUpdateProposal.serializeBinaryToWriter
    );
  }
  f = message.getBinaryOptionsMarketLaunchProposalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      9,
      f,
      proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal.serializeBinaryToWriter
    );
  }
  f = message.getBinaryOptionsParamUpdateProposalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      10,
      f,
      proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal.serializeBinaryToWriter
    );
  }
  f = message.getDenomDecimalsUpdateProposal();
  if (f != null) {
    writer.writeMessage(
      11,
      f,
      proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated SpotMarketParamUpdateProposal spot_market_param_update_proposals = 3;
 * @return {!Array<!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal>}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.getSpotMarketParamUpdateProposalsList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal, 3));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal>} value
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
*/
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.setSpotMarketParamUpdateProposalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.addSpotMarketParamUpdateProposals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.clearSpotMarketParamUpdateProposalsList = function() {
  return this.setSpotMarketParamUpdateProposalsList([]);
};


/**
 * repeated DerivativeMarketParamUpdateProposal derivative_market_param_update_proposals = 4;
 * @return {!Array<!proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal>}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.getDerivativeMarketParamUpdateProposalsList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal, 4));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal>} value
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
*/
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.setDerivativeMarketParamUpdateProposalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.addDerivativeMarketParamUpdateProposals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.injective.exchange.v1beta1.DerivativeMarketParamUpdateProposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.clearDerivativeMarketParamUpdateProposalsList = function() {
  return this.setDerivativeMarketParamUpdateProposalsList([]);
};


/**
 * repeated SpotMarketLaunchProposal spot_market_launch_proposals = 5;
 * @return {!Array<!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal>}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.getSpotMarketLaunchProposalsList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.SpotMarketLaunchProposal, 5));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal>} value
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
*/
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.setSpotMarketLaunchProposalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.SpotMarketLaunchProposal}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.addSpotMarketLaunchProposals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.injective.exchange.v1beta1.SpotMarketLaunchProposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.clearSpotMarketLaunchProposalsList = function() {
  return this.setSpotMarketLaunchProposalsList([]);
};


/**
 * repeated PerpetualMarketLaunchProposal perpetual_market_launch_proposals = 6;
 * @return {!Array<!proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal>}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.getPerpetualMarketLaunchProposalsList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal, 6));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal>} value
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
*/
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.setPerpetualMarketLaunchProposalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.addPerpetualMarketLaunchProposals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.injective.exchange.v1beta1.PerpetualMarketLaunchProposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.clearPerpetualMarketLaunchProposalsList = function() {
  return this.setPerpetualMarketLaunchProposalsList([]);
};


/**
 * repeated ExpiryFuturesMarketLaunchProposal expiry_futures_market_launch_proposals = 7;
 * @return {!Array<!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal>}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.getExpiryFuturesMarketLaunchProposalsList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal, 7));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal>} value
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
*/
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.setExpiryFuturesMarketLaunchProposalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.addExpiryFuturesMarketLaunchProposals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.clearExpiryFuturesMarketLaunchProposalsList = function() {
  return this.setExpiryFuturesMarketLaunchProposalsList([]);
};


/**
 * optional TradingRewardCampaignUpdateProposal trading_reward_campaign_update_proposal = 8;
 * @return {?proto.injective.exchange.v1beta1.TradingRewardCampaignUpdateProposal}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.getTradingRewardCampaignUpdateProposal = function() {
  return /** @type{?proto.injective.exchange.v1beta1.TradingRewardCampaignUpdateProposal} */ (
    jspb.Message.getWrapperField(this, proto.injective.exchange.v1beta1.TradingRewardCampaignUpdateProposal, 8));
};


/**
 * @param {?proto.injective.exchange.v1beta1.TradingRewardCampaignUpdateProposal|undefined} value
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
*/
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.setTradingRewardCampaignUpdateProposal = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.clearTradingRewardCampaignUpdateProposal = function() {
  return this.setTradingRewardCampaignUpdateProposal(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.hasTradingRewardCampaignUpdateProposal = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * repeated BinaryOptionsMarketLaunchProposal binary_options_market_launch_proposals = 9;
 * @return {!Array<!proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal>}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.getBinaryOptionsMarketLaunchProposalsList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal, 9));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal>} value
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
*/
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.setBinaryOptionsMarketLaunchProposalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 9, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.addBinaryOptionsMarketLaunchProposals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 9, opt_value, proto.injective.exchange.v1beta1.BinaryOptionsMarketLaunchProposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.clearBinaryOptionsMarketLaunchProposalsList = function() {
  return this.setBinaryOptionsMarketLaunchProposalsList([]);
};


/**
 * repeated BinaryOptionsMarketParamUpdateProposal binary_options_param_update_proposals = 10;
 * @return {!Array<!proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal>}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.getBinaryOptionsParamUpdateProposalsList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal, 10));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal>} value
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
*/
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.setBinaryOptionsParamUpdateProposalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 10, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.addBinaryOptionsParamUpdateProposals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 10, opt_value, proto.injective.exchange.v1beta1.BinaryOptionsMarketParamUpdateProposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.clearBinaryOptionsParamUpdateProposalsList = function() {
  return this.setBinaryOptionsParamUpdateProposalsList([]);
};


/**
 * optional UpdateDenomDecimalsProposal denom_decimals_update_proposal = 11;
 * @return {?proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.getDenomDecimalsUpdateProposal = function() {
  return /** @type{?proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal} */ (
    jspb.Message.getWrapperField(this, proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal, 11));
};


/**
 * @param {?proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal|undefined} value
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
*/
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.setDenomDecimalsUpdateProposal = function(value) {
  return jspb.Message.setWrapperField(this, 11, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.exchange.v1beta1.BatchExchangeModificationProposal} returns this
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.clearDenomDecimalsUpdateProposal = function() {
  return this.setDenomDecimalsUpdateProposal(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.BatchExchangeModificationProposal.prototype.hasDenomDecimalsUpdateProposal = function() {
  return jspb.Message.getField(this, 11) != null;
};


