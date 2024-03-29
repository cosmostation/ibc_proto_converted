// source: kava/earn/v1beta1/tx.proto
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

goog.provide('proto.kava.earn.v1beta1.MsgDepositResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kava.earn.v1beta1.VaultShare');

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
proto.kava.earn.v1beta1.MsgDepositResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.earn.v1beta1.MsgDepositResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.earn.v1beta1.MsgDepositResponse.displayName = 'proto.kava.earn.v1beta1.MsgDepositResponse';
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
proto.kava.earn.v1beta1.MsgDepositResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.earn.v1beta1.MsgDepositResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.earn.v1beta1.MsgDepositResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.earn.v1beta1.MsgDepositResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    shares: (f = msg.getShares()) && proto.kava.earn.v1beta1.VaultShare.toObject(includeInstance, f)
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
 * @return {!proto.kava.earn.v1beta1.MsgDepositResponse}
 */
proto.kava.earn.v1beta1.MsgDepositResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.earn.v1beta1.MsgDepositResponse;
  return proto.kava.earn.v1beta1.MsgDepositResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.earn.v1beta1.MsgDepositResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.earn.v1beta1.MsgDepositResponse}
 */
proto.kava.earn.v1beta1.MsgDepositResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kava.earn.v1beta1.VaultShare;
      reader.readMessage(value,proto.kava.earn.v1beta1.VaultShare.deserializeBinaryFromReader);
      msg.setShares(value);
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
proto.kava.earn.v1beta1.MsgDepositResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.earn.v1beta1.MsgDepositResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.earn.v1beta1.MsgDepositResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.earn.v1beta1.MsgDepositResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getShares();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.kava.earn.v1beta1.VaultShare.serializeBinaryToWriter
    );
  }
};


/**
 * optional VaultShare shares = 1;
 * @return {?proto.kava.earn.v1beta1.VaultShare}
 */
proto.kava.earn.v1beta1.MsgDepositResponse.prototype.getShares = function() {
  return /** @type{?proto.kava.earn.v1beta1.VaultShare} */ (
    jspb.Message.getWrapperField(this, proto.kava.earn.v1beta1.VaultShare, 1));
};


/**
 * @param {?proto.kava.earn.v1beta1.VaultShare|undefined} value
 * @return {!proto.kava.earn.v1beta1.MsgDepositResponse} returns this
*/
proto.kava.earn.v1beta1.MsgDepositResponse.prototype.setShares = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.earn.v1beta1.MsgDepositResponse} returns this
 */
proto.kava.earn.v1beta1.MsgDepositResponse.prototype.clearShares = function() {
  return this.setShares(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.earn.v1beta1.MsgDepositResponse.prototype.hasShares = function() {
  return jspb.Message.getField(this, 1) != null;
};


