// source: injective/exchange/v1beta1/events.proto
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

goog.provide('proto.injective.exchange.v1beta1.EventCancelDerivativeOrder');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.DerivativeLimitOrder');
goog.require('proto.injective.exchange.v1beta1.DerivativeMarketOrderCancel');

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
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.EventCancelDerivativeOrder, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.displayName = 'proto.injective.exchange.v1beta1.EventCancelDerivativeOrder';
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
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.EventCancelDerivativeOrder} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.toObject = function(includeInstance, msg) {
  var f, obj = {
    marketId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    islimitcancel: jspb.Message.getBooleanFieldWithDefault(msg, 2, false),
    limitOrder: (f = msg.getLimitOrder()) && proto.injective.exchange.v1beta1.DerivativeLimitOrder.toObject(includeInstance, f),
    marketOrderCancel: (f = msg.getMarketOrderCancel()) && proto.injective.exchange.v1beta1.DerivativeMarketOrderCancel.toObject(includeInstance, f)
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
 * @return {!proto.injective.exchange.v1beta1.EventCancelDerivativeOrder}
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.EventCancelDerivativeOrder;
  return proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.EventCancelDerivativeOrder} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.EventCancelDerivativeOrder}
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setMarketId(value);
      break;
    case 2:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIslimitcancel(value);
      break;
    case 3:
      var value = new proto.injective.exchange.v1beta1.DerivativeLimitOrder;
      reader.readMessage(value,proto.injective.exchange.v1beta1.DerivativeLimitOrder.deserializeBinaryFromReader);
      msg.setLimitOrder(value);
      break;
    case 4:
      var value = new proto.injective.exchange.v1beta1.DerivativeMarketOrderCancel;
      reader.readMessage(value,proto.injective.exchange.v1beta1.DerivativeMarketOrderCancel.deserializeBinaryFromReader);
      msg.setMarketOrderCancel(value);
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
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.EventCancelDerivativeOrder} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMarketId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getIslimitcancel();
  if (f) {
    writer.writeBool(
      2,
      f
    );
  }
  f = message.getLimitOrder();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.injective.exchange.v1beta1.DerivativeLimitOrder.serializeBinaryToWriter
    );
  }
  f = message.getMarketOrderCancel();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.injective.exchange.v1beta1.DerivativeMarketOrderCancel.serializeBinaryToWriter
    );
  }
};


/**
 * optional string market_id = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.getMarketId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.EventCancelDerivativeOrder} returns this
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.setMarketId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bool isLimitCancel = 2;
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.getIslimitcancel = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 2, false));
};


/**
 * @param {boolean} value
 * @return {!proto.injective.exchange.v1beta1.EventCancelDerivativeOrder} returns this
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.setIslimitcancel = function(value) {
  return jspb.Message.setProto3BooleanField(this, 2, value);
};


/**
 * optional DerivativeLimitOrder limit_order = 3;
 * @return {?proto.injective.exchange.v1beta1.DerivativeLimitOrder}
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.getLimitOrder = function() {
  return /** @type{?proto.injective.exchange.v1beta1.DerivativeLimitOrder} */ (
    jspb.Message.getWrapperField(this, proto.injective.exchange.v1beta1.DerivativeLimitOrder, 3));
};


/**
 * @param {?proto.injective.exchange.v1beta1.DerivativeLimitOrder|undefined} value
 * @return {!proto.injective.exchange.v1beta1.EventCancelDerivativeOrder} returns this
*/
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.setLimitOrder = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.exchange.v1beta1.EventCancelDerivativeOrder} returns this
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.clearLimitOrder = function() {
  return this.setLimitOrder(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.hasLimitOrder = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional DerivativeMarketOrderCancel market_order_cancel = 4;
 * @return {?proto.injective.exchange.v1beta1.DerivativeMarketOrderCancel}
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.getMarketOrderCancel = function() {
  return /** @type{?proto.injective.exchange.v1beta1.DerivativeMarketOrderCancel} */ (
    jspb.Message.getWrapperField(this, proto.injective.exchange.v1beta1.DerivativeMarketOrderCancel, 4));
};


/**
 * @param {?proto.injective.exchange.v1beta1.DerivativeMarketOrderCancel|undefined} value
 * @return {!proto.injective.exchange.v1beta1.EventCancelDerivativeOrder} returns this
*/
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.setMarketOrderCancel = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.exchange.v1beta1.EventCancelDerivativeOrder} returns this
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.clearMarketOrderCancel = function() {
  return this.setMarketOrderCancel(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.EventCancelDerivativeOrder.prototype.hasMarketOrderCancel = function() {
  return jspb.Message.getField(this, 4) != null;
};


