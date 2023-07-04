// source: ixo/bonds/v1beta1/bonds.proto
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

goog.provide('proto.ixo.bonds.v1beta1.BaseOrder');

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
proto.ixo.bonds.v1beta1.BaseOrder = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ixo.bonds.v1beta1.BaseOrder, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.bonds.v1beta1.BaseOrder.displayName = 'proto.ixo.bonds.v1beta1.BaseOrder';
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
proto.ixo.bonds.v1beta1.BaseOrder.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.bonds.v1beta1.BaseOrder.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.bonds.v1beta1.BaseOrder} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.bonds.v1beta1.BaseOrder.toObject = function(includeInstance, msg) {
  var f, obj = {
    accountDid: jspb.Message.getFieldWithDefault(msg, 1, ""),
    amount: (f = msg.getAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    cancelled: jspb.Message.getBooleanFieldWithDefault(msg, 3, false),
    cancelReason: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.ixo.bonds.v1beta1.BaseOrder}
 */
proto.ixo.bonds.v1beta1.BaseOrder.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.bonds.v1beta1.BaseOrder;
  return proto.ixo.bonds.v1beta1.BaseOrder.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.bonds.v1beta1.BaseOrder} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.bonds.v1beta1.BaseOrder}
 */
proto.ixo.bonds.v1beta1.BaseOrder.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAccountDid(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmount(value);
      break;
    case 3:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setCancelled(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setCancelReason(value);
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
proto.ixo.bonds.v1beta1.BaseOrder.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.bonds.v1beta1.BaseOrder.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.bonds.v1beta1.BaseOrder} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.bonds.v1beta1.BaseOrder.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAccountDid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAmount();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getCancelled();
  if (f) {
    writer.writeBool(
      3,
      f
    );
  }
  f = message.getCancelReason();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string account_did = 1;
 * @return {string}
 */
proto.ixo.bonds.v1beta1.BaseOrder.prototype.getAccountDid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.bonds.v1beta1.BaseOrder} returns this
 */
proto.ixo.bonds.v1beta1.BaseOrder.prototype.setAccountDid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional cosmos.base.v1beta1.Coin amount = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.ixo.bonds.v1beta1.BaseOrder.prototype.getAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.ixo.bonds.v1beta1.BaseOrder} returns this
*/
proto.ixo.bonds.v1beta1.BaseOrder.prototype.setAmount = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.bonds.v1beta1.BaseOrder} returns this
 */
proto.ixo.bonds.v1beta1.BaseOrder.prototype.clearAmount = function() {
  return this.setAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.bonds.v1beta1.BaseOrder.prototype.hasAmount = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional bool cancelled = 3;
 * @return {boolean}
 */
proto.ixo.bonds.v1beta1.BaseOrder.prototype.getCancelled = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 3, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ixo.bonds.v1beta1.BaseOrder} returns this
 */
proto.ixo.bonds.v1beta1.BaseOrder.prototype.setCancelled = function(value) {
  return jspb.Message.setProto3BooleanField(this, 3, value);
};


/**
 * optional string cancel_reason = 4;
 * @return {string}
 */
proto.ixo.bonds.v1beta1.BaseOrder.prototype.getCancelReason = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.bonds.v1beta1.BaseOrder} returns this
 */
proto.ixo.bonds.v1beta1.BaseOrder.prototype.setCancelReason = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};

