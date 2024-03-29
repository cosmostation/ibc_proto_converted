// source: comdex/rewards/v1beta1/tx.proto
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

goog.provide('proto.comdex.rewards.v1beta1.MsgCreateGauge');
goog.provide('proto.comdex.rewards.v1beta1.MsgCreateGauge.KindCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Duration');
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
proto.comdex.rewards.v1beta1.MsgCreateGauge = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.comdex.rewards.v1beta1.MsgCreateGauge.oneofGroups_);
};
goog.inherits(proto.comdex.rewards.v1beta1.MsgCreateGauge, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.rewards.v1beta1.MsgCreateGauge.displayName = 'proto.comdex.rewards.v1beta1.MsgCreateGauge';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.oneofGroups_ = [[7]];

/**
 * @enum {number}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.KindCase = {
  KIND_NOT_SET: 0,
  LIQUIDITY_META_DATA: 7
};

/**
 * @return {proto.comdex.rewards.v1beta1.MsgCreateGauge.KindCase}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.getKindCase = function() {
  return /** @type {proto.comdex.rewards.v1beta1.MsgCreateGauge.KindCase} */(jspb.Message.computeOneofCase(this, proto.comdex.rewards.v1beta1.MsgCreateGauge.oneofGroups_[0]));
};



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
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.rewards.v1beta1.MsgCreateGauge.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.rewards.v1beta1.MsgCreateGauge} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.toObject = function(includeInstance, msg) {
  var f, obj = {
    from: jspb.Message.getFieldWithDefault(msg, 1, ""),
    gaugeTypeId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    triggerDuration: (f = msg.getTriggerDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    depositAmount: (f = msg.getDepositAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    totalTriggers: jspb.Message.getFieldWithDefault(msg, 5, 0),
    startTime: (f = msg.getStartTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    liquidityMetaData: (f = msg.getLiquidityMetaData()) && proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.toObject(includeInstance, f),
    appId: jspb.Message.getFieldWithDefault(msg, 8, 0)
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
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.rewards.v1beta1.MsgCreateGauge;
  return proto.comdex.rewards.v1beta1.MsgCreateGauge.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.rewards.v1beta1.MsgCreateGauge} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFrom(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGaugeTypeId(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setTriggerDuration(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setDepositAmount(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTotalTriggers(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartTime(value);
      break;
    case 7:
      var value = new proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData;
      reader.readMessage(value,proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.deserializeBinaryFromReader);
      msg.setLiquidityMetaData(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
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
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.rewards.v1beta1.MsgCreateGauge.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.rewards.v1beta1.MsgCreateGauge} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFrom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getGaugeTypeId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getTriggerDuration();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getDepositAmount();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTotalTriggers();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getStartTime();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getLiquidityMetaData();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData.serializeBinaryToWriter
    );
  }
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
};


/**
 * optional string from = 1;
 * @return {string}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.getFrom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.setFrom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 gauge_type_id = 2;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.getGaugeTypeId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.setGaugeTypeId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional google.protobuf.Duration trigger_duration = 3;
 * @return {?proto.google.protobuf.Duration}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.getTriggerDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 3));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
*/
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.setTriggerDuration = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.clearTriggerDuration = function() {
  return this.setTriggerDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.hasTriggerDuration = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin deposit_amount = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.getDepositAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
*/
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.setDepositAmount = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.clearDepositAmount = function() {
  return this.setDepositAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.hasDepositAmount = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional uint64 total_triggers = 5;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.getTotalTriggers = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.setTotalTriggers = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional google.protobuf.Timestamp start_time = 6;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.getStartTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 6));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
*/
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.setStartTime = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.clearStartTime = function() {
  return this.setStartTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.hasStartTime = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional LiquidtyGaugeMetaData liquidity_meta_data = 7;
 * @return {?proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.getLiquidityMetaData = function() {
  return /** @type{?proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData} */ (
    jspb.Message.getWrapperField(this, proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData, 7));
};


/**
 * @param {?proto.comdex.rewards.v1beta1.LiquidtyGaugeMetaData|undefined} value
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
*/
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.setLiquidityMetaData = function(value) {
  return jspb.Message.setOneofWrapperField(this, 7, proto.comdex.rewards.v1beta1.MsgCreateGauge.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.clearLiquidityMetaData = function() {
  return this.setLiquidityMetaData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.hasLiquidityMetaData = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional uint64 app_id = 8;
 * @return {number}
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.rewards.v1beta1.MsgCreateGauge} returns this
 */
proto.comdex.rewards.v1beta1.MsgCreateGauge.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


