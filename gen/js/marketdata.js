// source: em/market/v1/market.proto
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

goog.provide('proto.em.market.v1.MarketData');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
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
proto.em.market.v1.MarketData = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.em.market.v1.MarketData, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.em.market.v1.MarketData.displayName = 'proto.em.market.v1.MarketData';
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
proto.em.market.v1.MarketData.prototype.toObject = function(opt_includeInstance) {
  return proto.em.market.v1.MarketData.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.em.market.v1.MarketData} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.market.v1.MarketData.toObject = function(includeInstance, msg) {
  var f, obj = {
    source: jspb.Message.getFieldWithDefault(msg, 1, ""),
    destination: jspb.Message.getFieldWithDefault(msg, 2, ""),
    lastPrice: jspb.Message.getFieldWithDefault(msg, 3, ""),
    timestamp: (f = msg.getTimestamp()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.em.market.v1.MarketData}
 */
proto.em.market.v1.MarketData.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.em.market.v1.MarketData;
  return proto.em.market.v1.MarketData.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.em.market.v1.MarketData} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.em.market.v1.MarketData}
 */
proto.em.market.v1.MarketData.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSource(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDestination(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setLastPrice(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setTimestamp(value);
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
proto.em.market.v1.MarketData.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.em.market.v1.MarketData.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.em.market.v1.MarketData} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.market.v1.MarketData.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSource();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDestination();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getLastPrice();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getTimestamp();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional string source = 1;
 * @return {string}
 */
proto.em.market.v1.MarketData.prototype.getSource = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MarketData} returns this
 */
proto.em.market.v1.MarketData.prototype.setSource = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string destination = 2;
 * @return {string}
 */
proto.em.market.v1.MarketData.prototype.getDestination = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MarketData} returns this
 */
proto.em.market.v1.MarketData.prototype.setDestination = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string last_price = 3;
 * @return {string}
 */
proto.em.market.v1.MarketData.prototype.getLastPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.MarketData} returns this
 */
proto.em.market.v1.MarketData.prototype.setLastPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional google.protobuf.Timestamp timestamp = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.em.market.v1.MarketData.prototype.getTimestamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.em.market.v1.MarketData} returns this
*/
proto.em.market.v1.MarketData.prototype.setTimestamp = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.em.market.v1.MarketData} returns this
 */
proto.em.market.v1.MarketData.prototype.clearTimestamp = function() {
  return this.setTimestamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.em.market.v1.MarketData.prototype.hasTimestamp = function() {
  return jspb.Message.getField(this, 4) != null;
};


