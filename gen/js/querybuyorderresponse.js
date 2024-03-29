// source: regen/ecocredit/v1alpha2/query.proto
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

goog.provide('proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.regen.ecocredit.v1alpha2.BuyOrder');

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
proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.displayName = 'proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse';
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
proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    buyOrder: (f = msg.getBuyOrder()) && proto.regen.ecocredit.v1alpha2.BuyOrder.toObject(includeInstance, f)
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
 * @return {!proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse}
 */
proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse;
  return proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse}
 */
proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.regen.ecocredit.v1alpha2.BuyOrder;
      reader.readMessage(value,proto.regen.ecocredit.v1alpha2.BuyOrder.deserializeBinaryFromReader);
      msg.setBuyOrder(value);
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
proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBuyOrder();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.regen.ecocredit.v1alpha2.BuyOrder.serializeBinaryToWriter
    );
  }
};


/**
 * optional BuyOrder buy_order = 1;
 * @return {?proto.regen.ecocredit.v1alpha2.BuyOrder}
 */
proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.prototype.getBuyOrder = function() {
  return /** @type{?proto.regen.ecocredit.v1alpha2.BuyOrder} */ (
    jspb.Message.getWrapperField(this, proto.regen.ecocredit.v1alpha2.BuyOrder, 1));
};


/**
 * @param {?proto.regen.ecocredit.v1alpha2.BuyOrder|undefined} value
 * @return {!proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse} returns this
*/
proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.prototype.setBuyOrder = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse} returns this
 */
proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.prototype.clearBuyOrder = function() {
  return this.setBuyOrder(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.regen.ecocredit.v1alpha2.QueryBuyOrderResponse.prototype.hasBuyOrder = function() {
  return jspb.Message.getField(this, 1) != null;
};


