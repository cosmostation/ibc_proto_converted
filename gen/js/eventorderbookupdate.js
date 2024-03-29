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

goog.provide('proto.injective.exchange.v1beta1.EventOrderbookUpdate');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.OrderbookUpdate');

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
proto.injective.exchange.v1beta1.EventOrderbookUpdate = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.EventOrderbookUpdate.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.EventOrderbookUpdate, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.EventOrderbookUpdate.displayName = 'proto.injective.exchange.v1beta1.EventOrderbookUpdate';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.EventOrderbookUpdate.repeatedFields_ = [1,2];



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
proto.injective.exchange.v1beta1.EventOrderbookUpdate.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.EventOrderbookUpdate.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.EventOrderbookUpdate} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.EventOrderbookUpdate.toObject = function(includeInstance, msg) {
  var f, obj = {
    spotUpdatesList: jspb.Message.toObjectList(msg.getSpotUpdatesList(),
    proto.injective.exchange.v1beta1.OrderbookUpdate.toObject, includeInstance),
    derivativeUpdatesList: jspb.Message.toObjectList(msg.getDerivativeUpdatesList(),
    proto.injective.exchange.v1beta1.OrderbookUpdate.toObject, includeInstance)
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
 * @return {!proto.injective.exchange.v1beta1.EventOrderbookUpdate}
 */
proto.injective.exchange.v1beta1.EventOrderbookUpdate.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.EventOrderbookUpdate;
  return proto.injective.exchange.v1beta1.EventOrderbookUpdate.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.EventOrderbookUpdate} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.EventOrderbookUpdate}
 */
proto.injective.exchange.v1beta1.EventOrderbookUpdate.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.injective.exchange.v1beta1.OrderbookUpdate;
      reader.readMessage(value,proto.injective.exchange.v1beta1.OrderbookUpdate.deserializeBinaryFromReader);
      msg.addSpotUpdates(value);
      break;
    case 2:
      var value = new proto.injective.exchange.v1beta1.OrderbookUpdate;
      reader.readMessage(value,proto.injective.exchange.v1beta1.OrderbookUpdate.deserializeBinaryFromReader);
      msg.addDerivativeUpdates(value);
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
proto.injective.exchange.v1beta1.EventOrderbookUpdate.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.EventOrderbookUpdate.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.EventOrderbookUpdate} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.EventOrderbookUpdate.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSpotUpdatesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.injective.exchange.v1beta1.OrderbookUpdate.serializeBinaryToWriter
    );
  }
  f = message.getDerivativeUpdatesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.injective.exchange.v1beta1.OrderbookUpdate.serializeBinaryToWriter
    );
  }
};


/**
 * repeated OrderbookUpdate spot_updates = 1;
 * @return {!Array<!proto.injective.exchange.v1beta1.OrderbookUpdate>}
 */
proto.injective.exchange.v1beta1.EventOrderbookUpdate.prototype.getSpotUpdatesList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.OrderbookUpdate>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.OrderbookUpdate, 1));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.OrderbookUpdate>} value
 * @return {!proto.injective.exchange.v1beta1.EventOrderbookUpdate} returns this
*/
proto.injective.exchange.v1beta1.EventOrderbookUpdate.prototype.setSpotUpdatesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.OrderbookUpdate=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.OrderbookUpdate}
 */
proto.injective.exchange.v1beta1.EventOrderbookUpdate.prototype.addSpotUpdates = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.injective.exchange.v1beta1.OrderbookUpdate, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.EventOrderbookUpdate} returns this
 */
proto.injective.exchange.v1beta1.EventOrderbookUpdate.prototype.clearSpotUpdatesList = function() {
  return this.setSpotUpdatesList([]);
};


/**
 * repeated OrderbookUpdate derivative_updates = 2;
 * @return {!Array<!proto.injective.exchange.v1beta1.OrderbookUpdate>}
 */
proto.injective.exchange.v1beta1.EventOrderbookUpdate.prototype.getDerivativeUpdatesList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.OrderbookUpdate>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.OrderbookUpdate, 2));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.OrderbookUpdate>} value
 * @return {!proto.injective.exchange.v1beta1.EventOrderbookUpdate} returns this
*/
proto.injective.exchange.v1beta1.EventOrderbookUpdate.prototype.setDerivativeUpdatesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.OrderbookUpdate=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.OrderbookUpdate}
 */
proto.injective.exchange.v1beta1.EventOrderbookUpdate.prototype.addDerivativeUpdates = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.injective.exchange.v1beta1.OrderbookUpdate, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.EventOrderbookUpdate} returns this
 */
proto.injective.exchange.v1beta1.EventOrderbookUpdate.prototype.clearDerivativeUpdatesList = function() {
  return this.setDerivativeUpdatesList([]);
};


