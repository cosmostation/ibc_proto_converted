// source: injective/oracle/v1beta1/oracle.proto
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

goog.provide('proto.injective.oracle.v1beta1.CoinbasePriceState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.oracle.v1beta1.PriceState');

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
proto.injective.oracle.v1beta1.CoinbasePriceState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.oracle.v1beta1.CoinbasePriceState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.oracle.v1beta1.CoinbasePriceState.displayName = 'proto.injective.oracle.v1beta1.CoinbasePriceState';
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
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.oracle.v1beta1.CoinbasePriceState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.oracle.v1beta1.CoinbasePriceState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.toObject = function(includeInstance, msg) {
  var f, obj = {
    kind: jspb.Message.getFieldWithDefault(msg, 1, ""),
    timestamp: jspb.Message.getFieldWithDefault(msg, 2, 0),
    key: jspb.Message.getFieldWithDefault(msg, 3, ""),
    value: jspb.Message.getFieldWithDefault(msg, 4, 0),
    priceState: (f = msg.getPriceState()) && proto.injective.oracle.v1beta1.PriceState.toObject(includeInstance, f)
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
 * @return {!proto.injective.oracle.v1beta1.CoinbasePriceState}
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.oracle.v1beta1.CoinbasePriceState;
  return proto.injective.oracle.v1beta1.CoinbasePriceState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.oracle.v1beta1.CoinbasePriceState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.oracle.v1beta1.CoinbasePriceState}
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setKind(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTimestamp(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setKey(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setValue(value);
      break;
    case 5:
      var value = new proto.injective.oracle.v1beta1.PriceState;
      reader.readMessage(value,proto.injective.oracle.v1beta1.PriceState.deserializeBinaryFromReader);
      msg.setPriceState(value);
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
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.oracle.v1beta1.CoinbasePriceState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.oracle.v1beta1.CoinbasePriceState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getKind();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTimestamp();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getKey();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getValue();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getPriceState();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.injective.oracle.v1beta1.PriceState.serializeBinaryToWriter
    );
  }
};


/**
 * optional string kind = 1;
 * @return {string}
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.getKind = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.oracle.v1beta1.CoinbasePriceState} returns this
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.setKind = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 timestamp = 2;
 * @return {number}
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.getTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.CoinbasePriceState} returns this
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.setTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string key = 3;
 * @return {string}
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.getKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.oracle.v1beta1.CoinbasePriceState} returns this
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.setKey = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint64 value = 4;
 * @return {number}
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.getValue = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.CoinbasePriceState} returns this
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.setValue = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional PriceState price_state = 5;
 * @return {?proto.injective.oracle.v1beta1.PriceState}
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.getPriceState = function() {
  return /** @type{?proto.injective.oracle.v1beta1.PriceState} */ (
    jspb.Message.getWrapperField(this, proto.injective.oracle.v1beta1.PriceState, 5));
};


/**
 * @param {?proto.injective.oracle.v1beta1.PriceState|undefined} value
 * @return {!proto.injective.oracle.v1beta1.CoinbasePriceState} returns this
*/
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.setPriceState = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.oracle.v1beta1.CoinbasePriceState} returns this
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.clearPriceState = function() {
  return this.setPriceState(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.oracle.v1beta1.CoinbasePriceState.prototype.hasPriceState = function() {
  return jspb.Message.getField(this, 5) != null;
};

