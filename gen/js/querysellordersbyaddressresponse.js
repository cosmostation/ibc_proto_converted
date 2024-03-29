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

goog.provide('proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.regen.ecocredit.v1alpha2.SellOrder');

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
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.repeatedFields_, null);
};
goog.inherits(proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.displayName = 'proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.repeatedFields_ = [1];



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
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    sellOrdersList: jspb.Message.toObjectList(msg.getSellOrdersList(),
    proto.regen.ecocredit.v1alpha2.SellOrder.toObject, includeInstance),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse}
 */
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse;
  return proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse}
 */
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.regen.ecocredit.v1alpha2.SellOrder;
      reader.readMessage(value,proto.regen.ecocredit.v1alpha2.SellOrder.deserializeBinaryFromReader);
      msg.addSellOrders(value);
      break;
    case 2:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSellOrdersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.regen.ecocredit.v1alpha2.SellOrder.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated SellOrder sell_orders = 1;
 * @return {!Array<!proto.regen.ecocredit.v1alpha2.SellOrder>}
 */
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.prototype.getSellOrdersList = function() {
  return /** @type{!Array<!proto.regen.ecocredit.v1alpha2.SellOrder>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.regen.ecocredit.v1alpha2.SellOrder, 1));
};


/**
 * @param {!Array<!proto.regen.ecocredit.v1alpha2.SellOrder>} value
 * @return {!proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse} returns this
*/
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.prototype.setSellOrdersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.regen.ecocredit.v1alpha2.SellOrder=} opt_value
 * @param {number=} opt_index
 * @return {!proto.regen.ecocredit.v1alpha2.SellOrder}
 */
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.prototype.addSellOrders = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.regen.ecocredit.v1alpha2.SellOrder, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse} returns this
 */
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.prototype.clearSellOrdersList = function() {
  return this.setSellOrdersList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse} returns this
*/
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse} returns this
 */
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.regen.ecocredit.v1alpha2.QuerySellOrdersByAddressResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


