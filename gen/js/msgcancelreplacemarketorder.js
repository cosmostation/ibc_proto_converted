// source: em/market/v1/tx.proto
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

goog.provide('proto.em.market.v1.MsgCancelReplaceMarketOrder');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

goog.forwardDeclare('proto.em.market.v1.TimeInForce');
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
proto.em.market.v1.MsgCancelReplaceMarketOrder = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.em.market.v1.MsgCancelReplaceMarketOrder, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.em.market.v1.MsgCancelReplaceMarketOrder.displayName = 'proto.em.market.v1.MsgCancelReplaceMarketOrder';
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
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.toObject = function(opt_includeInstance) {
  return proto.em.market.v1.MsgCancelReplaceMarketOrder.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.em.market.v1.MsgCancelReplaceMarketOrder} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.toObject = function(includeInstance, msg) {
  var f, obj = {
    owner: jspb.Message.getFieldWithDefault(msg, 1, ""),
    originalClientOrderId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    newClientOrderId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    timeInForce: jspb.Message.getFieldWithDefault(msg, 4, 0),
    source: jspb.Message.getFieldWithDefault(msg, 5, ""),
    destination: (f = msg.getDestination()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    maximumSlippage: jspb.Message.getFieldWithDefault(msg, 7, "")
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
 * @return {!proto.em.market.v1.MsgCancelReplaceMarketOrder}
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.em.market.v1.MsgCancelReplaceMarketOrder;
  return proto.em.market.v1.MsgCancelReplaceMarketOrder.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.em.market.v1.MsgCancelReplaceMarketOrder} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.em.market.v1.MsgCancelReplaceMarketOrder}
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setOriginalClientOrderId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setNewClientOrderId(value);
      break;
    case 4:
      var value = /** @type {!proto.em.market.v1.TimeInForce} */ (reader.readEnum());
      msg.setTimeInForce(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSource(value);
      break;
    case 6:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setDestination(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaximumSlippage(value);
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
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.em.market.v1.MsgCancelReplaceMarketOrder.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.em.market.v1.MsgCancelReplaceMarketOrder} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getOriginalClientOrderId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getNewClientOrderId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getTimeInForce();
  if (f !== 0.0) {
    writer.writeEnum(
      4,
      f
    );
  }
  f = message.getSource();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getDestination();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getMaximumSlippage();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
};


/**
 * optional string owner = 1;
 * @return {string}
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MsgCancelReplaceMarketOrder} returns this
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string original_client_order_id = 2;
 * @return {string}
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.getOriginalClientOrderId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MsgCancelReplaceMarketOrder} returns this
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.setOriginalClientOrderId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string new_client_order_id = 3;
 * @return {string}
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.getNewClientOrderId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MsgCancelReplaceMarketOrder} returns this
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.setNewClientOrderId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional TimeInForce time_in_force = 4;
 * @return {!proto.em.market.v1.TimeInForce}
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.getTimeInForce = function() {
  return /** @type {!proto.em.market.v1.TimeInForce} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {!proto.em.market.v1.TimeInForce} value
 * @return {!proto.em.market.v1.MsgCancelReplaceMarketOrder} returns this
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.setTimeInForce = function(value) {
  return jspb.Message.setProto3EnumField(this, 4, value);
};


/**
 * optional string source = 5;
 * @return {string}
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.getSource = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MsgCancelReplaceMarketOrder} returns this
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.setSource = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional cosmos.base.v1beta1.Coin destination = 6;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.getDestination = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 6));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.em.market.v1.MsgCancelReplaceMarketOrder} returns this
*/
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.setDestination = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.em.market.v1.MsgCancelReplaceMarketOrder} returns this
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.clearDestination = function() {
  return this.setDestination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.hasDestination = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional string maximum_slippage = 7;
 * @return {string}
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.getMaximumSlippage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MsgCancelReplaceMarketOrder} returns this
 */
proto.em.market.v1.MsgCancelReplaceMarketOrder.prototype.setMaximumSlippage = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


