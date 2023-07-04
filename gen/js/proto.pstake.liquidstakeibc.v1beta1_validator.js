// source: pstake/liquidstakeibc/v1beta1/liquidstakeibc.proto
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

goog.provide('proto.pstake.liquidstakeibc.v1beta1.Validator');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.pstake.liquidstakeibc.v1beta1.Validator = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.pstake.liquidstakeibc.v1beta1.Validator, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.pstake.liquidstakeibc.v1beta1.Validator.displayName = 'proto.pstake.liquidstakeibc.v1beta1.Validator';
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
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.toObject = function(opt_includeInstance) {
  return proto.pstake.liquidstakeibc.v1beta1.Validator.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.pstake.liquidstakeibc.v1beta1.Validator} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.toObject = function(includeInstance, msg) {
  var f, obj = {
    operatorAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    status: jspb.Message.getFieldWithDefault(msg, 2, ""),
    weight: jspb.Message.getFieldWithDefault(msg, 3, ""),
    delegatedAmount: jspb.Message.getFieldWithDefault(msg, 4, ""),
    totalAmount: jspb.Message.getFieldWithDefault(msg, 5, ""),
    unbondingEpoch: jspb.Message.getFieldWithDefault(msg, 6, 0)
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
 * @return {!proto.pstake.liquidstakeibc.v1beta1.Validator}
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.pstake.liquidstakeibc.v1beta1.Validator;
  return proto.pstake.liquidstakeibc.v1beta1.Validator.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.pstake.liquidstakeibc.v1beta1.Validator} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.pstake.liquidstakeibc.v1beta1.Validator}
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {string} */ (reader.readString());
      msg.setStatus(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setWeight(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDelegatedAmount(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setTotalAmount(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setUnbondingEpoch(value);
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
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.pstake.liquidstakeibc.v1beta1.Validator.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.pstake.liquidstakeibc.v1beta1.Validator} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOperatorAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getStatus();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getWeight();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getDelegatedAmount();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getTotalAmount();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getUnbondingEpoch();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
};


/**
 * optional string operator_address = 1;
 * @return {string}
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.getOperatorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.pstake.liquidstakeibc.v1beta1.Validator} returns this
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.setOperatorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string status = 2;
 * @return {string}
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.getStatus = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.pstake.liquidstakeibc.v1beta1.Validator} returns this
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.setStatus = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string weight = 3;
 * @return {string}
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.getWeight = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.pstake.liquidstakeibc.v1beta1.Validator} returns this
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.setWeight = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string delegated_amount = 4;
 * @return {string}
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.getDelegatedAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.pstake.liquidstakeibc.v1beta1.Validator} returns this
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.setDelegatedAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string total_amount = 5;
 * @return {string}
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.getTotalAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.pstake.liquidstakeibc.v1beta1.Validator} returns this
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.setTotalAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional int64 unbonding_epoch = 6;
 * @return {number}
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.getUnbondingEpoch = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.pstake.liquidstakeibc.v1beta1.Validator} returns this
 */
proto.pstake.liquidstakeibc.v1beta1.Validator.prototype.setUnbondingEpoch = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};

