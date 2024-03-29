// source: crescent/marketmaker/v1beta1/marketmaker.proto
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

goog.provide('proto.crescent.marketmaker.v1beta1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.crescent.marketmaker.v1beta1.Common');
goog.require('proto.crescent.marketmaker.v1beta1.IncentivePair');

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
proto.crescent.marketmaker.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.crescent.marketmaker.v1beta1.Params.repeatedFields_, null);
};
goog.inherits(proto.crescent.marketmaker.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.marketmaker.v1beta1.Params.displayName = 'proto.crescent.marketmaker.v1beta1.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.crescent.marketmaker.v1beta1.Params.repeatedFields_ = [2,4];



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
proto.crescent.marketmaker.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.marketmaker.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.marketmaker.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.marketmaker.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    incentiveBudgetAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    depositAmountList: jspb.Message.toObjectList(msg.getDepositAmountList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    common: (f = msg.getCommon()) && proto.crescent.marketmaker.v1beta1.Common.toObject(includeInstance, f),
    incentivePairsList: jspb.Message.toObjectList(msg.getIncentivePairsList(),
    proto.crescent.marketmaker.v1beta1.IncentivePair.toObject, includeInstance)
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
 * @return {!proto.crescent.marketmaker.v1beta1.Params}
 */
proto.crescent.marketmaker.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.marketmaker.v1beta1.Params;
  return proto.crescent.marketmaker.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.marketmaker.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.marketmaker.v1beta1.Params}
 */
proto.crescent.marketmaker.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setIncentiveBudgetAddress(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addDepositAmount(value);
      break;
    case 3:
      var value = new proto.crescent.marketmaker.v1beta1.Common;
      reader.readMessage(value,proto.crescent.marketmaker.v1beta1.Common.deserializeBinaryFromReader);
      msg.setCommon(value);
      break;
    case 4:
      var value = new proto.crescent.marketmaker.v1beta1.IncentivePair;
      reader.readMessage(value,proto.crescent.marketmaker.v1beta1.IncentivePair.deserializeBinaryFromReader);
      msg.addIncentivePairs(value);
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
proto.crescent.marketmaker.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.marketmaker.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.marketmaker.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.marketmaker.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIncentiveBudgetAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDepositAmountList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getCommon();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.crescent.marketmaker.v1beta1.Common.serializeBinaryToWriter
    );
  }
  f = message.getIncentivePairsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.crescent.marketmaker.v1beta1.IncentivePair.serializeBinaryToWriter
    );
  }
};


/**
 * optional string incentive_budget_address = 1;
 * @return {string}
 */
proto.crescent.marketmaker.v1beta1.Params.prototype.getIncentiveBudgetAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.marketmaker.v1beta1.Params} returns this
 */
proto.crescent.marketmaker.v1beta1.Params.prototype.setIncentiveBudgetAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin deposit_amount = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.crescent.marketmaker.v1beta1.Params.prototype.getDepositAmountList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.crescent.marketmaker.v1beta1.Params} returns this
*/
proto.crescent.marketmaker.v1beta1.Params.prototype.setDepositAmountList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.crescent.marketmaker.v1beta1.Params.prototype.addDepositAmount = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.marketmaker.v1beta1.Params} returns this
 */
proto.crescent.marketmaker.v1beta1.Params.prototype.clearDepositAmountList = function() {
  return this.setDepositAmountList([]);
};


/**
 * optional Common common = 3;
 * @return {?proto.crescent.marketmaker.v1beta1.Common}
 */
proto.crescent.marketmaker.v1beta1.Params.prototype.getCommon = function() {
  return /** @type{?proto.crescent.marketmaker.v1beta1.Common} */ (
    jspb.Message.getWrapperField(this, proto.crescent.marketmaker.v1beta1.Common, 3));
};


/**
 * @param {?proto.crescent.marketmaker.v1beta1.Common|undefined} value
 * @return {!proto.crescent.marketmaker.v1beta1.Params} returns this
*/
proto.crescent.marketmaker.v1beta1.Params.prototype.setCommon = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.marketmaker.v1beta1.Params} returns this
 */
proto.crescent.marketmaker.v1beta1.Params.prototype.clearCommon = function() {
  return this.setCommon(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.marketmaker.v1beta1.Params.prototype.hasCommon = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * repeated IncentivePair incentive_pairs = 4;
 * @return {!Array<!proto.crescent.marketmaker.v1beta1.IncentivePair>}
 */
proto.crescent.marketmaker.v1beta1.Params.prototype.getIncentivePairsList = function() {
  return /** @type{!Array<!proto.crescent.marketmaker.v1beta1.IncentivePair>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.crescent.marketmaker.v1beta1.IncentivePair, 4));
};


/**
 * @param {!Array<!proto.crescent.marketmaker.v1beta1.IncentivePair>} value
 * @return {!proto.crescent.marketmaker.v1beta1.Params} returns this
*/
proto.crescent.marketmaker.v1beta1.Params.prototype.setIncentivePairsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.crescent.marketmaker.v1beta1.IncentivePair=} opt_value
 * @param {number=} opt_index
 * @return {!proto.crescent.marketmaker.v1beta1.IncentivePair}
 */
proto.crescent.marketmaker.v1beta1.Params.prototype.addIncentivePairs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.crescent.marketmaker.v1beta1.IncentivePair, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.crescent.marketmaker.v1beta1.Params} returns this
 */
proto.crescent.marketmaker.v1beta1.Params.prototype.clearIncentivePairsList = function() {
  return this.setIncentivePairsList([]);
};


