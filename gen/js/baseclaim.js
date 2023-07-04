// source: kava/incentive/v1beta1/claims.proto
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

goog.provide('proto.kava.incentive.v1beta1.BaseClaim');

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
proto.kava.incentive.v1beta1.BaseClaim = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.incentive.v1beta1.BaseClaim, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.incentive.v1beta1.BaseClaim.displayName = 'proto.kava.incentive.v1beta1.BaseClaim';
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
proto.kava.incentive.v1beta1.BaseClaim.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.incentive.v1beta1.BaseClaim.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.incentive.v1beta1.BaseClaim} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.incentive.v1beta1.BaseClaim.toObject = function(includeInstance, msg) {
  var f, obj = {
    owner: msg.getOwner_asB64(),
    reward: (f = msg.getReward()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.kava.incentive.v1beta1.BaseClaim}
 */
proto.kava.incentive.v1beta1.BaseClaim.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.incentive.v1beta1.BaseClaim;
  return proto.kava.incentive.v1beta1.BaseClaim.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.incentive.v1beta1.BaseClaim} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.incentive.v1beta1.BaseClaim}
 */
proto.kava.incentive.v1beta1.BaseClaim.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setOwner(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setReward(value);
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
proto.kava.incentive.v1beta1.BaseClaim.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.incentive.v1beta1.BaseClaim.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.incentive.v1beta1.BaseClaim} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.incentive.v1beta1.BaseClaim.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOwner_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getReward();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes owner = 1;
 * @return {string}
 */
proto.kava.incentive.v1beta1.BaseClaim.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes owner = 1;
 * This is a type-conversion wrapper around `getOwner()`
 * @return {string}
 */
proto.kava.incentive.v1beta1.BaseClaim.prototype.getOwner_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getOwner()));
};


/**
 * optional bytes owner = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getOwner()`
 * @return {!Uint8Array}
 */
proto.kava.incentive.v1beta1.BaseClaim.prototype.getOwner_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getOwner()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.kava.incentive.v1beta1.BaseClaim} returns this
 */
proto.kava.incentive.v1beta1.BaseClaim.prototype.setOwner = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional cosmos.base.v1beta1.Coin reward = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.kava.incentive.v1beta1.BaseClaim.prototype.getReward = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.kava.incentive.v1beta1.BaseClaim} returns this
*/
proto.kava.incentive.v1beta1.BaseClaim.prototype.setReward = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.incentive.v1beta1.BaseClaim} returns this
 */
proto.kava.incentive.v1beta1.BaseClaim.prototype.clearReward = function() {
  return this.setReward(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.incentive.v1beta1.BaseClaim.prototype.hasReward = function() {
  return jspb.Message.getField(this, 2) != null;
};

