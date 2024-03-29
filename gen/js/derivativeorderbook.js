// source: injective/exchange/v1beta1/genesis.proto
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

goog.provide('proto.injective.exchange.v1beta1.DerivativeOrderBook');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.DerivativeLimitOrder');

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
proto.injective.exchange.v1beta1.DerivativeOrderBook = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.DerivativeOrderBook.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.DerivativeOrderBook, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.DerivativeOrderBook.displayName = 'proto.injective.exchange.v1beta1.DerivativeOrderBook';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.repeatedFields_ = [3];



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
proto.injective.exchange.v1beta1.DerivativeOrderBook.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.DerivativeOrderBook.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.DerivativeOrderBook} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.toObject = function(includeInstance, msg) {
  var f, obj = {
    marketId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    isbuyside: jspb.Message.getBooleanFieldWithDefault(msg, 2, false),
    ordersList: jspb.Message.toObjectList(msg.getOrdersList(),
    proto.injective.exchange.v1beta1.DerivativeLimitOrder.toObject, includeInstance)
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
 * @return {!proto.injective.exchange.v1beta1.DerivativeOrderBook}
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.DerivativeOrderBook;
  return proto.injective.exchange.v1beta1.DerivativeOrderBook.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.DerivativeOrderBook} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.DerivativeOrderBook}
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setIsbuyside(value);
      break;
    case 3:
      var value = new proto.injective.exchange.v1beta1.DerivativeLimitOrder;
      reader.readMessage(value,proto.injective.exchange.v1beta1.DerivativeLimitOrder.deserializeBinaryFromReader);
      msg.addOrders(value);
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
proto.injective.exchange.v1beta1.DerivativeOrderBook.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.DerivativeOrderBook.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.DerivativeOrderBook} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMarketId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getIsbuyside();
  if (f) {
    writer.writeBool(
      2,
      f
    );
  }
  f = message.getOrdersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.injective.exchange.v1beta1.DerivativeLimitOrder.serializeBinaryToWriter
    );
  }
};


/**
 * optional string market_id = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.prototype.getMarketId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.DerivativeOrderBook} returns this
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.prototype.setMarketId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bool isBuySide = 2;
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.prototype.getIsbuyside = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 2, false));
};


/**
 * @param {boolean} value
 * @return {!proto.injective.exchange.v1beta1.DerivativeOrderBook} returns this
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.prototype.setIsbuyside = function(value) {
  return jspb.Message.setProto3BooleanField(this, 2, value);
};


/**
 * repeated DerivativeLimitOrder orders = 3;
 * @return {!Array<!proto.injective.exchange.v1beta1.DerivativeLimitOrder>}
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.prototype.getOrdersList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.DerivativeLimitOrder>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.DerivativeLimitOrder, 3));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.DerivativeLimitOrder>} value
 * @return {!proto.injective.exchange.v1beta1.DerivativeOrderBook} returns this
*/
proto.injective.exchange.v1beta1.DerivativeOrderBook.prototype.setOrdersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.DerivativeLimitOrder=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.DerivativeLimitOrder}
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.prototype.addOrders = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.injective.exchange.v1beta1.DerivativeLimitOrder, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.DerivativeOrderBook} returns this
 */
proto.injective.exchange.v1beta1.DerivativeOrderBook.prototype.clearOrdersList = function() {
  return this.setOrdersList([]);
};


