// source: pstake/lscosmos/v1beta1/lscosmos.proto
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

goog.provide('proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue');

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
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.displayName = 'proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue';
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
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.toObject = function(opt_includeInstance) {
  return proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.toObject = function(includeInstance, msg) {
  var f, obj = {
    epochNumber: jspb.Message.getFieldWithDefault(msg, 1, 0),
    sTKBurn: (f = msg.getSTKBurn()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    amountUnbonded: (f = msg.getAmountUnbonded()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    isMatured: jspb.Message.getBooleanFieldWithDefault(msg, 4, false),
    isFailed: jspb.Message.getBooleanFieldWithDefault(msg, 5, false)
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
 * @return {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue}
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue;
  return proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue}
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setEpochNumber(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setSTKBurn(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmountUnbonded(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsMatured(value);
      break;
    case 5:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsFailed(value);
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
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEpochNumber();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getSTKBurn();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getAmountUnbonded();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getIsMatured();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
  f = message.getIsFailed();
  if (f) {
    writer.writeBool(
      5,
      f
    );
  }
};


/**
 * optional int64 epoch_number = 1;
 * @return {number}
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.getEpochNumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue} returns this
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.setEpochNumber = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional cosmos.base.v1beta1.Coin s_t_k_burn = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.getSTKBurn = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue} returns this
*/
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.setSTKBurn = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue} returns this
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.clearSTKBurn = function() {
  return this.setSTKBurn(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.hasSTKBurn = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin amount_unbonded = 3;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.getAmountUnbonded = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue} returns this
*/
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.setAmountUnbonded = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue} returns this
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.clearAmountUnbonded = function() {
  return this.setAmountUnbonded(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.hasAmountUnbonded = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional bool is_matured = 4;
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.getIsMatured = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue} returns this
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.setIsMatured = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};


/**
 * optional bool is_failed = 5;
 * @return {boolean}
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.getIsFailed = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 5, false));
};


/**
 * @param {boolean} value
 * @return {!proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue} returns this
 */
proto.pstake.lscosmos.v1beta1.UnbondingEpochCValue.prototype.setIsFailed = function(value) {
  return jspb.Message.setProto3BooleanField(this, 5, value);
};

