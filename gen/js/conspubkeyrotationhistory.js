// source: cosmos/staking/v1beta1/staking.proto
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

goog.provide('proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
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
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.displayName = 'proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory';
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
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.toObject = function(includeInstance, msg) {
  var f, obj = {
    operatorAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    oldConsPubkey: (f = msg.getOldConsPubkey()) && proto.google.protobuf.Any.toObject(includeInstance, f),
    newConsPubkey: (f = msg.getNewConsPubkey()) && proto.google.protobuf.Any.toObject(includeInstance, f),
    height: jspb.Message.getFieldWithDefault(msg, 4, 0),
    fee: (f = msg.getFee()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory}
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory;
  return proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory}
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOperatorAddress(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setOldConsPubkey(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setNewConsPubkey(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setHeight(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setFee(value);
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
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOperatorAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getOldConsPubkey();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getNewConsPubkey();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getHeight();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getFee();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string operator_address = 1;
 * @return {string}
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.getOperatorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory} returns this
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.setOperatorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional google.protobuf.Any old_cons_pubkey = 2;
 * @return {?proto.google.protobuf.Any}
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.getOldConsPubkey = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 2));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory} returns this
*/
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.setOldConsPubkey = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory} returns this
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.clearOldConsPubkey = function() {
  return this.setOldConsPubkey(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.hasOldConsPubkey = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional google.protobuf.Any new_cons_pubkey = 3;
 * @return {?proto.google.protobuf.Any}
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.getNewConsPubkey = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 3));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory} returns this
*/
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.setNewConsPubkey = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory} returns this
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.clearNewConsPubkey = function() {
  return this.setNewConsPubkey(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.hasNewConsPubkey = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional uint64 height = 4;
 * @return {number}
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.getHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory} returns this
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.setHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional cosmos.base.v1beta1.Coin fee = 5;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.getFee = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory} returns this
*/
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.setFee = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory} returns this
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.clearFee = function() {
  return this.setFee(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.staking.v1beta1.ConsPubKeyRotationHistory.prototype.hasFee = function() {
  return jspb.Message.getField(this, 5) != null;
};


