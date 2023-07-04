// source: crescent/liquidfarming/v1beta1/query.proto
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

goog.provide('proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.crescent.liquidfarming.v1beta1.ExchangeRateResponse');

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
proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.displayName = 'proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse';
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
proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    exchangeRate: (f = msg.getExchangeRate()) && proto.crescent.liquidfarming.v1beta1.ExchangeRateResponse.toObject(includeInstance, f)
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
 * @return {!proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse}
 */
proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse;
  return proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse}
 */
proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.crescent.liquidfarming.v1beta1.ExchangeRateResponse;
      reader.readMessage(value,proto.crescent.liquidfarming.v1beta1.ExchangeRateResponse.deserializeBinaryFromReader);
      msg.setExchangeRate(value);
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
proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getExchangeRate();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.crescent.liquidfarming.v1beta1.ExchangeRateResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional ExchangeRateResponse exchange_rate = 1;
 * @return {?proto.crescent.liquidfarming.v1beta1.ExchangeRateResponse}
 */
proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.prototype.getExchangeRate = function() {
  return /** @type{?proto.crescent.liquidfarming.v1beta1.ExchangeRateResponse} */ (
    jspb.Message.getWrapperField(this, proto.crescent.liquidfarming.v1beta1.ExchangeRateResponse, 1));
};


/**
 * @param {?proto.crescent.liquidfarming.v1beta1.ExchangeRateResponse|undefined} value
 * @return {!proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse} returns this
*/
proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.prototype.setExchangeRate = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse} returns this
 */
proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.prototype.clearExchangeRate = function() {
  return this.setExchangeRate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.liquidfarming.v1beta1.QueryExchangeRateResponse.prototype.hasExchangeRate = function() {
  return jspb.Message.getField(this, 1) != null;
};

