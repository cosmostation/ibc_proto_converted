// source: akash/escrow/v1beta1/types.proto
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

goog.provide('proto.akash.escrow.v1beta1.Payment');
goog.provide('proto.akash.escrow.v1beta1.Payment.State');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.escrow.v1beta1.AccountID');
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
proto.akash.escrow.v1beta1.Payment = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.akash.escrow.v1beta1.Payment, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.escrow.v1beta1.Payment.displayName = 'proto.akash.escrow.v1beta1.Payment';
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
proto.akash.escrow.v1beta1.Payment.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.escrow.v1beta1.Payment.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.escrow.v1beta1.Payment} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.escrow.v1beta1.Payment.toObject = function(includeInstance, msg) {
  var f, obj = {
    accountId: (f = msg.getAccountId()) && proto.akash.escrow.v1beta1.AccountID.toObject(includeInstance, f),
    paymentId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    owner: jspb.Message.getFieldWithDefault(msg, 3, ""),
    state: jspb.Message.getFieldWithDefault(msg, 4, 0),
    rate: (f = msg.getRate()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    balance: (f = msg.getBalance()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    withdrawn: (f = msg.getWithdrawn()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.akash.escrow.v1beta1.Payment}
 */
proto.akash.escrow.v1beta1.Payment.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.escrow.v1beta1.Payment;
  return proto.akash.escrow.v1beta1.Payment.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.escrow.v1beta1.Payment} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.escrow.v1beta1.Payment}
 */
proto.akash.escrow.v1beta1.Payment.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.akash.escrow.v1beta1.AccountID;
      reader.readMessage(value,proto.akash.escrow.v1beta1.AccountID.deserializeBinaryFromReader);
      msg.setAccountId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setPaymentId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 4:
      var value = /** @type {!proto.akash.escrow.v1beta1.Payment.State} */ (reader.readEnum());
      msg.setState(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setRate(value);
      break;
    case 6:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setBalance(value);
      break;
    case 7:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setWithdrawn(value);
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
proto.akash.escrow.v1beta1.Payment.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.escrow.v1beta1.Payment.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.escrow.v1beta1.Payment} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.escrow.v1beta1.Payment.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAccountId();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.akash.escrow.v1beta1.AccountID.serializeBinaryToWriter
    );
  }
  f = message.getPaymentId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getState();
  if (f !== 0.0) {
    writer.writeEnum(
      4,
      f
    );
  }
  f = message.getRate();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getBalance();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getWithdrawn();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * @enum {number}
 */
proto.akash.escrow.v1beta1.Payment.State = {
  INVALID: 0,
  OPEN: 1,
  CLOSED: 2,
  OVERDRAWN: 3
};

/**
 * optional AccountID account_id = 1;
 * @return {?proto.akash.escrow.v1beta1.AccountID}
 */
proto.akash.escrow.v1beta1.Payment.prototype.getAccountId = function() {
  return /** @type{?proto.akash.escrow.v1beta1.AccountID} */ (
    jspb.Message.getWrapperField(this, proto.akash.escrow.v1beta1.AccountID, 1));
};


/**
 * @param {?proto.akash.escrow.v1beta1.AccountID|undefined} value
 * @return {!proto.akash.escrow.v1beta1.Payment} returns this
*/
proto.akash.escrow.v1beta1.Payment.prototype.setAccountId = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.escrow.v1beta1.Payment} returns this
 */
proto.akash.escrow.v1beta1.Payment.prototype.clearAccountId = function() {
  return this.setAccountId(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.escrow.v1beta1.Payment.prototype.hasAccountId = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string payment_id = 2;
 * @return {string}
 */
proto.akash.escrow.v1beta1.Payment.prototype.getPaymentId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.akash.escrow.v1beta1.Payment} returns this
 */
proto.akash.escrow.v1beta1.Payment.prototype.setPaymentId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string owner = 3;
 * @return {string}
 */
proto.akash.escrow.v1beta1.Payment.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.akash.escrow.v1beta1.Payment} returns this
 */
proto.akash.escrow.v1beta1.Payment.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional State state = 4;
 * @return {!proto.akash.escrow.v1beta1.Payment.State}
 */
proto.akash.escrow.v1beta1.Payment.prototype.getState = function() {
  return /** @type {!proto.akash.escrow.v1beta1.Payment.State} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {!proto.akash.escrow.v1beta1.Payment.State} value
 * @return {!proto.akash.escrow.v1beta1.Payment} returns this
 */
proto.akash.escrow.v1beta1.Payment.prototype.setState = function(value) {
  return jspb.Message.setProto3EnumField(this, 4, value);
};


/**
 * optional cosmos.base.v1beta1.Coin rate = 5;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.akash.escrow.v1beta1.Payment.prototype.getRate = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.akash.escrow.v1beta1.Payment} returns this
*/
proto.akash.escrow.v1beta1.Payment.prototype.setRate = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.escrow.v1beta1.Payment} returns this
 */
proto.akash.escrow.v1beta1.Payment.prototype.clearRate = function() {
  return this.setRate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.escrow.v1beta1.Payment.prototype.hasRate = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin balance = 6;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.akash.escrow.v1beta1.Payment.prototype.getBalance = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 6));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.akash.escrow.v1beta1.Payment} returns this
*/
proto.akash.escrow.v1beta1.Payment.prototype.setBalance = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.escrow.v1beta1.Payment} returns this
 */
proto.akash.escrow.v1beta1.Payment.prototype.clearBalance = function() {
  return this.setBalance(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.escrow.v1beta1.Payment.prototype.hasBalance = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin withdrawn = 7;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.akash.escrow.v1beta1.Payment.prototype.getWithdrawn = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 7));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.akash.escrow.v1beta1.Payment} returns this
*/
proto.akash.escrow.v1beta1.Payment.prototype.setWithdrawn = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.escrow.v1beta1.Payment} returns this
 */
proto.akash.escrow.v1beta1.Payment.prototype.clearWithdrawn = function() {
  return this.setWithdrawn(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.escrow.v1beta1.Payment.prototype.hasWithdrawn = function() {
  return jspb.Message.getField(this, 7) != null;
};

