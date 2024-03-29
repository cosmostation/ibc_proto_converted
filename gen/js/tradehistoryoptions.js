// source: injective/exchange/v1beta1/query.proto
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

goog.provide('proto.injective.exchange.v1beta1.TradeHistoryOptions');

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
proto.injective.exchange.v1beta1.TradeHistoryOptions = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.TradeHistoryOptions, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.TradeHistoryOptions.displayName = 'proto.injective.exchange.v1beta1.TradeHistoryOptions';
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
proto.injective.exchange.v1beta1.TradeHistoryOptions.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.TradeHistoryOptions.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.TradeHistoryOptions} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.toObject = function(includeInstance, msg) {
  var f, obj = {
    tradeGroupingSec: jspb.Message.getFieldWithDefault(msg, 1, 0),
    maxAge: jspb.Message.getFieldWithDefault(msg, 2, 0),
    includeRawHistory: jspb.Message.getBooleanFieldWithDefault(msg, 4, false),
    includeMetadata: jspb.Message.getBooleanFieldWithDefault(msg, 5, false)
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
 * @return {!proto.injective.exchange.v1beta1.TradeHistoryOptions}
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.TradeHistoryOptions;
  return proto.injective.exchange.v1beta1.TradeHistoryOptions.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.TradeHistoryOptions} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.TradeHistoryOptions}
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTradeGroupingSec(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxAge(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIncludeRawHistory(value);
      break;
    case 5:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIncludeMetadata(value);
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
proto.injective.exchange.v1beta1.TradeHistoryOptions.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.TradeHistoryOptions.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.TradeHistoryOptions} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTradeGroupingSec();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getMaxAge();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getIncludeRawHistory();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
  f = message.getIncludeMetadata();
  if (f) {
    writer.writeBool(
      5,
      f
    );
  }
};


/**
 * optional uint64 trade_grouping_sec = 1;
 * @return {number}
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.prototype.getTradeGroupingSec = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.TradeHistoryOptions} returns this
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.prototype.setTradeGroupingSec = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 max_age = 2;
 * @return {number}
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.prototype.getMaxAge = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.TradeHistoryOptions} returns this
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.prototype.setMaxAge = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional bool include_raw_history = 4;
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.prototype.getIncludeRawHistory = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.injective.exchange.v1beta1.TradeHistoryOptions} returns this
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.prototype.setIncludeRawHistory = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};


/**
 * optional bool include_metadata = 5;
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.prototype.getIncludeMetadata = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 5, false));
};


/**
 * @param {boolean} value
 * @return {!proto.injective.exchange.v1beta1.TradeHistoryOptions} returns this
 */
proto.injective.exchange.v1beta1.TradeHistoryOptions.prototype.setIncludeMetadata = function(value) {
  return jspb.Message.setProto3BooleanField(this, 5, value);
};


