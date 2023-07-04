// source: kava/cdp/v1beta1/tx.proto
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

goog.provide('proto.kava.cdp.v1beta1.MsgCreateCDP');

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
proto.kava.cdp.v1beta1.MsgCreateCDP = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.cdp.v1beta1.MsgCreateCDP, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.cdp.v1beta1.MsgCreateCDP.displayName = 'proto.kava.cdp.v1beta1.MsgCreateCDP';
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
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.cdp.v1beta1.MsgCreateCDP.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.cdp.v1beta1.MsgCreateCDP} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    collateral: (f = msg.getCollateral()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    principal: (f = msg.getPrincipal()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    collateralType: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.kava.cdp.v1beta1.MsgCreateCDP}
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.cdp.v1beta1.MsgCreateCDP;
  return proto.kava.cdp.v1beta1.MsgCreateCDP.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.cdp.v1beta1.MsgCreateCDP} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.cdp.v1beta1.MsgCreateCDP}
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setCollateral(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setPrincipal(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setCollateralType(value);
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
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.cdp.v1beta1.MsgCreateCDP.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.cdp.v1beta1.MsgCreateCDP} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCollateral();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getPrincipal();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getCollateralType();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.MsgCreateCDP} returns this
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional cosmos.base.v1beta1.Coin collateral = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.getCollateral = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.kava.cdp.v1beta1.MsgCreateCDP} returns this
*/
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.setCollateral = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.cdp.v1beta1.MsgCreateCDP} returns this
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.clearCollateral = function() {
  return this.setCollateral(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.hasCollateral = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin principal = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.getPrincipal = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.kava.cdp.v1beta1.MsgCreateCDP} returns this
*/
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.setPrincipal = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.cdp.v1beta1.MsgCreateCDP} returns this
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.clearPrincipal = function() {
  return this.setPrincipal(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.hasPrincipal = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string collateral_type = 4;
 * @return {string}
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.getCollateralType = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.cdp.v1beta1.MsgCreateCDP} returns this
 */
proto.kava.cdp.v1beta1.MsgCreateCDP.prototype.setCollateralType = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};

