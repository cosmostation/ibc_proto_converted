// source: osmosis/superfluid/tx.proto
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

goog.provide('proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.displayName = 'proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition';
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
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.toObject = function(includeInstance, msg) {
  var f, obj = {
    positionId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    sender: jspb.Message.getFieldWithDefault(msg, 2, ""),
    tokenDesired0: (f = msg.getTokenDesired0()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    tokenDesired1: (f = msg.getTokenDesired1()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition}
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition;
  return proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition}
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPositionId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTokenDesired0(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTokenDesired1(value);
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
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPositionId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTokenDesired0();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTokenDesired1();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 position_id = 1;
 * @return {number}
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.getPositionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition} returns this
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.setPositionId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string sender = 2;
 * @return {string}
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition} returns this
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional cosmos.base.v1beta1.Coin token_desired0 = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.getTokenDesired0 = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition} returns this
*/
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.setTokenDesired0 = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition} returns this
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.clearTokenDesired0 = function() {
  return this.setTokenDesired0(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.hasTokenDesired0 = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin token_desired1 = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.getTokenDesired1 = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition} returns this
*/
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.setTokenDesired1 = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition} returns this
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.clearTokenDesired1 = function() {
  return this.setTokenDesired1(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition.prototype.hasTokenDesired1 = function() {
  return jspb.Message.getField(this, 4) != null;
};


