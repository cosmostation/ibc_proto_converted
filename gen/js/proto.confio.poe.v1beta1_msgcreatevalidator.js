// source: confio/poe/v1beta1/tx.proto
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

goog.provide('proto.confio.poe.v1beta1.MsgCreateValidator');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.cosmos.staking.v1beta1.Description');
goog.require('proto.google.protobuf.Any');

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
proto.confio.poe.v1beta1.MsgCreateValidator = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.confio.poe.v1beta1.MsgCreateValidator, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.confio.poe.v1beta1.MsgCreateValidator.displayName = 'proto.confio.poe.v1beta1.MsgCreateValidator';
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
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.toObject = function(opt_includeInstance) {
  return proto.confio.poe.v1beta1.MsgCreateValidator.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.confio.poe.v1beta1.MsgCreateValidator} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.confio.poe.v1beta1.MsgCreateValidator.toObject = function(includeInstance, msg) {
  var f, obj = {
    description: (f = msg.getDescription()) && proto.cosmos.staking.v1beta1.Description.toObject(includeInstance, f),
    operatorAddress: jspb.Message.getFieldWithDefault(msg, 4, ""),
    pubkey: (f = msg.getPubkey()) && proto.google.protobuf.Any.toObject(includeInstance, f),
    amount: (f = msg.getAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    vestingAmount: (f = msg.getVestingAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.confio.poe.v1beta1.MsgCreateValidator}
 */
proto.confio.poe.v1beta1.MsgCreateValidator.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.confio.poe.v1beta1.MsgCreateValidator;
  return proto.confio.poe.v1beta1.MsgCreateValidator.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.confio.poe.v1beta1.MsgCreateValidator} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.confio.poe.v1beta1.MsgCreateValidator}
 */
proto.confio.poe.v1beta1.MsgCreateValidator.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.staking.v1beta1.Description;
      reader.readMessage(value,proto.cosmos.staking.v1beta1.Description.deserializeBinaryFromReader);
      msg.setDescription(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setOperatorAddress(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setPubkey(value);
      break;
    case 7:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmount(value);
      break;
    case 8:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setVestingAmount(value);
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
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.confio.poe.v1beta1.MsgCreateValidator.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.confio.poe.v1beta1.MsgCreateValidator} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.confio.poe.v1beta1.MsgCreateValidator.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDescription();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.staking.v1beta1.Description.serializeBinaryToWriter
    );
  }
  f = message.getOperatorAddress();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getPubkey();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getAmount();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getVestingAmount();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional cosmos.staking.v1beta1.Description description = 1;
 * @return {?proto.cosmos.staking.v1beta1.Description}
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.getDescription = function() {
  return /** @type{?proto.cosmos.staking.v1beta1.Description} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.staking.v1beta1.Description, 1));
};


/**
 * @param {?proto.cosmos.staking.v1beta1.Description|undefined} value
 * @return {!proto.confio.poe.v1beta1.MsgCreateValidator} returns this
*/
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.setDescription = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.MsgCreateValidator} returns this
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.clearDescription = function() {
  return this.setDescription(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.hasDescription = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string operator_address = 4;
 * @return {string}
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.getOperatorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.confio.poe.v1beta1.MsgCreateValidator} returns this
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.setOperatorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional google.protobuf.Any pubkey = 6;
 * @return {?proto.google.protobuf.Any}
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.getPubkey = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 6));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.confio.poe.v1beta1.MsgCreateValidator} returns this
*/
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.setPubkey = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.MsgCreateValidator} returns this
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.clearPubkey = function() {
  return this.setPubkey(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.hasPubkey = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin amount = 7;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.getAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 7));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.confio.poe.v1beta1.MsgCreateValidator} returns this
*/
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.setAmount = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.MsgCreateValidator} returns this
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.clearAmount = function() {
  return this.setAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.hasAmount = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin vesting_amount = 8;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.getVestingAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 8));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.confio.poe.v1beta1.MsgCreateValidator} returns this
*/
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.setVestingAmount = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.confio.poe.v1beta1.MsgCreateValidator} returns this
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.clearVestingAmount = function() {
  return this.setVestingAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.confio.poe.v1beta1.MsgCreateValidator.prototype.hasVestingAmount = function() {
  return jspb.Message.getField(this, 8) != null;
};


