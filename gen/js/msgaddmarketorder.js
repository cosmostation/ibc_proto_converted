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

goog.provide('proto.em.market.v1.MsgAddMarketOrder');

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
proto.em.market.v1.MsgAddMarketOrder = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.em.market.v1.MsgAddMarketOrder, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.em.market.v1.MsgAddMarketOrder.displayName = 'proto.em.market.v1.MsgAddMarketOrder';
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
proto.em.market.v1.MsgAddMarketOrder.prototype.toObject = function(opt_includeInstance) {
  return proto.em.market.v1.MsgAddMarketOrder.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.em.market.v1.MsgAddMarketOrder} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.market.v1.MsgAddMarketOrder.toObject = function(includeInstance, msg) {
  var f, obj = {
    owner: jspb.Message.getFieldWithDefault(msg, 1, ""),
    clientOrderId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    timeInForce: jspb.Message.getFieldWithDefault(msg, 3, 0),
    source: jspb.Message.getFieldWithDefault(msg, 4, ""),
    destination: (f = msg.getDestination()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    maximumSlippage: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.em.market.v1.MsgAddMarketOrder}
 */
proto.em.market.v1.MsgAddMarketOrder.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.em.market.v1.MsgAddMarketOrder;
  return proto.em.market.v1.MsgAddMarketOrder.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.em.market.v1.MsgAddMarketOrder} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.em.market.v1.MsgAddMarketOrder}
 */
proto.em.market.v1.MsgAddMarketOrder.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setClientOrderId(value);
      break;
    case 3:
      var value = /** @type {!proto.em.market.v1.TimeInForce} */ (reader.readEnum());
      msg.setTimeInForce(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setSource(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setDestination(value);
      break;
    case 6:
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
proto.em.market.v1.MsgAddMarketOrder.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.em.market.v1.MsgAddMarketOrder.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.em.market.v1.MsgAddMarketOrder} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.market.v1.MsgAddMarketOrder.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getClientOrderId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTimeInForce();
  if (f !== 0.0) {
    writer.writeEnum(
      3,
      f
    );
  }
  f = message.getSource();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getDestination();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getMaximumSlippage();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional string owner = 1;
 * @return {string}
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MsgAddMarketOrder} returns this
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string client_order_id = 2;
 * @return {string}
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.getClientOrderId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MsgAddMarketOrder} returns this
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.setClientOrderId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional TimeInForce time_in_force = 3;
 * @return {!proto.em.market.v1.TimeInForce}
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.getTimeInForce = function() {
  return /** @type {!proto.em.market.v1.TimeInForce} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {!proto.em.market.v1.TimeInForce} value
 * @return {!proto.em.market.v1.MsgAddMarketOrder} returns this
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.setTimeInForce = function(value) {
  return jspb.Message.setProto3EnumField(this, 3, value);
};


/**
 * optional string source = 4;
 * @return {string}
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.getSource = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MsgAddMarketOrder} returns this
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.setSource = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional cosmos.base.v1beta1.Coin destination = 5;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.getDestination = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.em.market.v1.MsgAddMarketOrder} returns this
*/
proto.em.market.v1.MsgAddMarketOrder.prototype.setDestination = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.em.market.v1.MsgAddMarketOrder} returns this
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.clearDestination = function() {
  return this.setDestination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.hasDestination = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional string maximum_slippage = 6;
 * @return {string}
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.getMaximumSlippage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MsgAddMarketOrder} returns this
 */
proto.em.market.v1.MsgAddMarketOrder.prototype.setMaximumSlippage = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


