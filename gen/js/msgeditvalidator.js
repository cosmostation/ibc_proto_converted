// source: cosmos/staking/v1beta1/tx.proto
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

goog.provide('proto.cosmos.staking.v1beta1.MsgEditValidator');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.staking.v1beta1.Description');

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
proto.cosmos.staking.v1beta1.MsgEditValidator = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.staking.v1beta1.MsgEditValidator, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.staking.v1beta1.MsgEditValidator.displayName = 'proto.cosmos.staking.v1beta1.MsgEditValidator';
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
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.staking.v1beta1.MsgEditValidator.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.staking.v1beta1.MsgEditValidator} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.toObject = function(includeInstance, msg) {
  var f, obj = {
    description: (f = msg.getDescription()) && proto.cosmos.staking.v1beta1.Description.toObject(includeInstance, f),
    validatorAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
    commissionRate: jspb.Message.getFieldWithDefault(msg, 3, ""),
    minSelfDelegation: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.cosmos.staking.v1beta1.MsgEditValidator}
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.staking.v1beta1.MsgEditValidator;
  return proto.cosmos.staking.v1beta1.MsgEditValidator.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.staking.v1beta1.MsgEditValidator} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.staking.v1beta1.MsgEditValidator}
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.deserializeBinaryFromReader = function(msg, reader) {
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
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setValidatorAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setCommissionRate(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinSelfDelegation(value);
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
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.staking.v1beta1.MsgEditValidator.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.staking.v1beta1.MsgEditValidator} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDescription();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.staking.v1beta1.Description.serializeBinaryToWriter
    );
  }
  f = message.getValidatorAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getCommissionRate();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getMinSelfDelegation();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional Description description = 1;
 * @return {?proto.cosmos.staking.v1beta1.Description}
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.getDescription = function() {
  return /** @type{?proto.cosmos.staking.v1beta1.Description} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.staking.v1beta1.Description, 1));
};


/**
 * @param {?proto.cosmos.staking.v1beta1.Description|undefined} value
 * @return {!proto.cosmos.staking.v1beta1.MsgEditValidator} returns this
*/
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.setDescription = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.staking.v1beta1.MsgEditValidator} returns this
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.clearDescription = function() {
  return this.setDescription(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.hasDescription = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional string validator_address = 2;
 * @return {string}
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.getValidatorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.staking.v1beta1.MsgEditValidator} returns this
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.setValidatorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string commission_rate = 3;
 * @return {string}
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.getCommissionRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.staking.v1beta1.MsgEditValidator} returns this
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.setCommissionRate = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string min_self_delegation = 4;
 * @return {string}
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.getMinSelfDelegation = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.staking.v1beta1.MsgEditValidator} returns this
 */
proto.cosmos.staking.v1beta1.MsgEditValidator.prototype.setMinSelfDelegation = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


