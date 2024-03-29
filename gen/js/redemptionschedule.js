// source: injective/insurance/v1beta1/insurance.proto
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

goog.provide('proto.injective.insurance.v1beta1.RedemptionSchedule');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
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
proto.injective.insurance.v1beta1.RedemptionSchedule = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.insurance.v1beta1.RedemptionSchedule, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.insurance.v1beta1.RedemptionSchedule.displayName = 'proto.injective.insurance.v1beta1.RedemptionSchedule';
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
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.insurance.v1beta1.RedemptionSchedule.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.insurance.v1beta1.RedemptionSchedule} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    marketid: jspb.Message.getFieldWithDefault(msg, 2, ""),
    redeemer: jspb.Message.getFieldWithDefault(msg, 3, ""),
    claimableRedemptionTime: (f = msg.getClaimableRedemptionTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    redemptionAmount: (f = msg.getRedemptionAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.injective.insurance.v1beta1.RedemptionSchedule}
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.insurance.v1beta1.RedemptionSchedule;
  return proto.injective.insurance.v1beta1.RedemptionSchedule.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.insurance.v1beta1.RedemptionSchedule} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.insurance.v1beta1.RedemptionSchedule}
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setMarketid(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setRedeemer(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setClaimableRedemptionTime(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setRedemptionAmount(value);
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
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.insurance.v1beta1.RedemptionSchedule.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.insurance.v1beta1.RedemptionSchedule} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getMarketid();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getRedeemer();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getClaimableRedemptionTime();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getRedemptionAmount();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.insurance.v1beta1.RedemptionSchedule} returns this
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string marketId = 2;
 * @return {string}
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.getMarketid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.insurance.v1beta1.RedemptionSchedule} returns this
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.setMarketid = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string redeemer = 3;
 * @return {string}
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.getRedeemer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.insurance.v1beta1.RedemptionSchedule} returns this
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.setRedeemer = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional google.protobuf.Timestamp claimable_redemption_time = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.getClaimableRedemptionTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.injective.insurance.v1beta1.RedemptionSchedule} returns this
*/
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.setClaimableRedemptionTime = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.insurance.v1beta1.RedemptionSchedule} returns this
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.clearClaimableRedemptionTime = function() {
  return this.setClaimableRedemptionTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.hasClaimableRedemptionTime = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin redemption_amount = 5;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.getRedemptionAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.injective.insurance.v1beta1.RedemptionSchedule} returns this
*/
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.setRedemptionAmount = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.insurance.v1beta1.RedemptionSchedule} returns this
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.clearRedemptionAmount = function() {
  return this.setRedemptionAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.insurance.v1beta1.RedemptionSchedule.prototype.hasRedemptionAmount = function() {
  return jspb.Message.getField(this, 5) != null;
};


