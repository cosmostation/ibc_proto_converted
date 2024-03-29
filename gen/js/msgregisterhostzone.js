// source: stride/stakeibc/tx.proto
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

goog.provide('proto.stride.stakeibc.MsgRegisterHostZone');

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
proto.stride.stakeibc.MsgRegisterHostZone = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stride.stakeibc.MsgRegisterHostZone, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.stakeibc.MsgRegisterHostZone.displayName = 'proto.stride.stakeibc.MsgRegisterHostZone';
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
proto.stride.stakeibc.MsgRegisterHostZone.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.stakeibc.MsgRegisterHostZone.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.stakeibc.MsgRegisterHostZone} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.stakeibc.MsgRegisterHostZone.toObject = function(includeInstance, msg) {
  var f, obj = {
    connectionId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    bech32prefix: jspb.Message.getFieldWithDefault(msg, 12, ""),
    hostDenom: jspb.Message.getFieldWithDefault(msg, 4, ""),
    ibcDenom: jspb.Message.getFieldWithDefault(msg, 5, ""),
    creator: jspb.Message.getFieldWithDefault(msg, 6, ""),
    transferChannelId: jspb.Message.getFieldWithDefault(msg, 10, ""),
    unbondingFrequency: jspb.Message.getFieldWithDefault(msg, 11, 0),
    minRedemptionRate: jspb.Message.getFieldWithDefault(msg, 13, ""),
    maxRedemptionRate: jspb.Message.getFieldWithDefault(msg, 14, "")
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
 * @return {!proto.stride.stakeibc.MsgRegisterHostZone}
 */
proto.stride.stakeibc.MsgRegisterHostZone.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.stakeibc.MsgRegisterHostZone;
  return proto.stride.stakeibc.MsgRegisterHostZone.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.stakeibc.MsgRegisterHostZone} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.stakeibc.MsgRegisterHostZone}
 */
proto.stride.stakeibc.MsgRegisterHostZone.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setConnectionId(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setBech32prefix(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setHostDenom(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setIbcDenom(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransferChannelId(value);
      break;
    case 11:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setUnbondingFrequency(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinRedemptionRate(value);
      break;
    case 14:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaxRedemptionRate(value);
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
proto.stride.stakeibc.MsgRegisterHostZone.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.stakeibc.MsgRegisterHostZone.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.stakeibc.MsgRegisterHostZone} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.stakeibc.MsgRegisterHostZone.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConnectionId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getBech32prefix();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
  f = message.getHostDenom();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getIbcDenom();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getTransferChannelId();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getUnbondingFrequency();
  if (f !== 0) {
    writer.writeUint64(
      11,
      f
    );
  }
  f = message.getMinRedemptionRate();
  if (f.length > 0) {
    writer.writeString(
      13,
      f
    );
  }
  f = message.getMaxRedemptionRate();
  if (f.length > 0) {
    writer.writeString(
      14,
      f
    );
  }
};


/**
 * optional string connection_id = 2;
 * @return {string}
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.getConnectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.MsgRegisterHostZone} returns this
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.setConnectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string bech32prefix = 12;
 * @return {string}
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.getBech32prefix = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.MsgRegisterHostZone} returns this
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.setBech32prefix = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


/**
 * optional string host_denom = 4;
 * @return {string}
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.getHostDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.MsgRegisterHostZone} returns this
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.setHostDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string ibc_denom = 5;
 * @return {string}
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.getIbcDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.MsgRegisterHostZone} returns this
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.setIbcDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string creator = 6;
 * @return {string}
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.MsgRegisterHostZone} returns this
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string transfer_channel_id = 10;
 * @return {string}
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.getTransferChannelId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.MsgRegisterHostZone} returns this
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.setTransferChannelId = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * optional uint64 unbonding_frequency = 11;
 * @return {number}
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.getUnbondingFrequency = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.MsgRegisterHostZone} returns this
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.setUnbondingFrequency = function(value) {
  return jspb.Message.setProto3IntField(this, 11, value);
};


/**
 * optional string min_redemption_rate = 13;
 * @return {string}
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.getMinRedemptionRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 13, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.MsgRegisterHostZone} returns this
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.setMinRedemptionRate = function(value) {
  return jspb.Message.setProto3StringField(this, 13, value);
};


/**
 * optional string max_redemption_rate = 14;
 * @return {string}
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.getMaxRedemptionRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 14, ""));
};


/**
 * @param {string} value
 * @return {!proto.stride.stakeibc.MsgRegisterHostZone} returns this
 */
proto.stride.stakeibc.MsgRegisterHostZone.prototype.setMaxRedemptionRate = function(value) {
  return jspb.Message.setProto3StringField(this, 14, value);
};


