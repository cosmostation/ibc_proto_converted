// source: kava/pricefeed/v1beta1/store.proto
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

goog.provide('proto.kava.pricefeed.v1beta1.PostedPrice');

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
proto.kava.pricefeed.v1beta1.PostedPrice = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.pricefeed.v1beta1.PostedPrice, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.pricefeed.v1beta1.PostedPrice.displayName = 'proto.kava.pricefeed.v1beta1.PostedPrice';
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
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.pricefeed.v1beta1.PostedPrice.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.pricefeed.v1beta1.PostedPrice} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.pricefeed.v1beta1.PostedPrice.toObject = function(includeInstance, msg) {
  var f, obj = {
    marketId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    oracleAddress: msg.getOracleAddress_asB64(),
    price: jspb.Message.getFieldWithDefault(msg, 3, ""),
    expiry: (f = msg.getExpiry()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.kava.pricefeed.v1beta1.PostedPrice}
 */
proto.kava.pricefeed.v1beta1.PostedPrice.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.pricefeed.v1beta1.PostedPrice;
  return proto.kava.pricefeed.v1beta1.PostedPrice.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.pricefeed.v1beta1.PostedPrice} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.pricefeed.v1beta1.PostedPrice}
 */
proto.kava.pricefeed.v1beta1.PostedPrice.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setOracleAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setPrice(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setExpiry(value);
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
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.pricefeed.v1beta1.PostedPrice.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.pricefeed.v1beta1.PostedPrice} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.pricefeed.v1beta1.PostedPrice.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMarketId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getOracleAddress_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getPrice();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getExpiry();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional string market_id = 1;
 * @return {string}
 */
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.getMarketId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.pricefeed.v1beta1.PostedPrice} returns this
 */
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.setMarketId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bytes oracle_address = 2;
 * @return {string}
 */
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.getOracleAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes oracle_address = 2;
 * This is a type-conversion wrapper around `getOracleAddress()`
 * @return {string}
 */
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.getOracleAddress_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getOracleAddress()));
};


/**
 * optional bytes oracle_address = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getOracleAddress()`
 * @return {!Uint8Array}
 */
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.getOracleAddress_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getOracleAddress()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.kava.pricefeed.v1beta1.PostedPrice} returns this
 */
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.setOracleAddress = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional string price = 3;
 * @return {string}
 */
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.getPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.pricefeed.v1beta1.PostedPrice} returns this
 */
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.setPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional google.protobuf.Timestamp expiry = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.getExpiry = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.kava.pricefeed.v1beta1.PostedPrice} returns this
*/
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.setExpiry = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.pricefeed.v1beta1.PostedPrice} returns this
 */
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.clearExpiry = function() {
  return this.setExpiry(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.pricefeed.v1beta1.PostedPrice.prototype.hasExpiry = function() {
  return jspb.Message.getField(this, 4) != null;
};


