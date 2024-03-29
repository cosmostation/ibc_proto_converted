// source: umee/leverage/v1/tx.proto
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

goog.provide('proto.umee.leverage.v1.MsgMaxWithdrawResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.umee.leverage.v1.MsgMaxWithdrawResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.umee.leverage.v1.MsgMaxWithdrawResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.umee.leverage.v1.MsgMaxWithdrawResponse.displayName = 'proto.umee.leverage.v1.MsgMaxWithdrawResponse';
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
proto.umee.leverage.v1.MsgMaxWithdrawResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.umee.leverage.v1.MsgMaxWithdrawResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.umee.leverage.v1.MsgMaxWithdrawResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.leverage.v1.MsgMaxWithdrawResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    withdrawn: (f = msg.getWithdrawn()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    received: (f = msg.getReceived()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.umee.leverage.v1.MsgMaxWithdrawResponse}
 */
proto.umee.leverage.v1.MsgMaxWithdrawResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.umee.leverage.v1.MsgMaxWithdrawResponse;
  return proto.umee.leverage.v1.MsgMaxWithdrawResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.umee.leverage.v1.MsgMaxWithdrawResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.umee.leverage.v1.MsgMaxWithdrawResponse}
 */
proto.umee.leverage.v1.MsgMaxWithdrawResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setWithdrawn(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setReceived(value);
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
proto.umee.leverage.v1.MsgMaxWithdrawResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.umee.leverage.v1.MsgMaxWithdrawResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.umee.leverage.v1.MsgMaxWithdrawResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.leverage.v1.MsgMaxWithdrawResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getWithdrawn();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getReceived();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional cosmos.base.v1beta1.Coin withdrawn = 1;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.umee.leverage.v1.MsgMaxWithdrawResponse.prototype.getWithdrawn = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.umee.leverage.v1.MsgMaxWithdrawResponse} returns this
*/
proto.umee.leverage.v1.MsgMaxWithdrawResponse.prototype.setWithdrawn = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.umee.leverage.v1.MsgMaxWithdrawResponse} returns this
 */
proto.umee.leverage.v1.MsgMaxWithdrawResponse.prototype.clearWithdrawn = function() {
  return this.setWithdrawn(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.umee.leverage.v1.MsgMaxWithdrawResponse.prototype.hasWithdrawn = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin received = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.umee.leverage.v1.MsgMaxWithdrawResponse.prototype.getReceived = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.umee.leverage.v1.MsgMaxWithdrawResponse} returns this
*/
proto.umee.leverage.v1.MsgMaxWithdrawResponse.prototype.setReceived = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.umee.leverage.v1.MsgMaxWithdrawResponse} returns this
 */
proto.umee.leverage.v1.MsgMaxWithdrawResponse.prototype.clearReceived = function() {
  return this.setReceived(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.umee.leverage.v1.MsgMaxWithdrawResponse.prototype.hasReceived = function() {
  return jspb.Message.getField(this, 2) != null;
};


