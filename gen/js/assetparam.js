// source: kava/bep3/v1beta1/bep3.proto
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

goog.provide('proto.kava.bep3.v1beta1.AssetParam');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kava.bep3.v1beta1.SupplyLimit');

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
proto.kava.bep3.v1beta1.AssetParam = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.bep3.v1beta1.AssetParam, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.bep3.v1beta1.AssetParam.displayName = 'proto.kava.bep3.v1beta1.AssetParam';
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
proto.kava.bep3.v1beta1.AssetParam.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.bep3.v1beta1.AssetParam.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.bep3.v1beta1.AssetParam} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.bep3.v1beta1.AssetParam.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    coinId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    supplyLimit: (f = msg.getSupplyLimit()) && proto.kava.bep3.v1beta1.SupplyLimit.toObject(includeInstance, f),
    active: jspb.Message.getBooleanFieldWithDefault(msg, 4, false),
    deputyAddress: msg.getDeputyAddress_asB64(),
    fixedFee: jspb.Message.getFieldWithDefault(msg, 6, ""),
    minSwapAmount: jspb.Message.getFieldWithDefault(msg, 7, ""),
    maxSwapAmount: jspb.Message.getFieldWithDefault(msg, 8, ""),
    minBlockLock: jspb.Message.getFieldWithDefault(msg, 9, 0),
    maxBlockLock: jspb.Message.getFieldWithDefault(msg, 10, 0)
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
 * @return {!proto.kava.bep3.v1beta1.AssetParam}
 */
proto.kava.bep3.v1beta1.AssetParam.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.bep3.v1beta1.AssetParam;
  return proto.kava.bep3.v1beta1.AssetParam.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.bep3.v1beta1.AssetParam} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.bep3.v1beta1.AssetParam}
 */
proto.kava.bep3.v1beta1.AssetParam.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setCoinId(value);
      break;
    case 3:
      var value = new proto.kava.bep3.v1beta1.SupplyLimit;
      reader.readMessage(value,proto.kava.bep3.v1beta1.SupplyLimit.deserializeBinaryFromReader);
      msg.setSupplyLimit(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setActive(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setDeputyAddress(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setFixedFee(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinSwapAmount(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaxSwapAmount(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMinBlockLock(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxBlockLock(value);
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
proto.kava.bep3.v1beta1.AssetParam.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.bep3.v1beta1.AssetParam.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.bep3.v1beta1.AssetParam} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.bep3.v1beta1.AssetParam.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCoinId();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
  f = message.getSupplyLimit();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.kava.bep3.v1beta1.SupplyLimit.serializeBinaryToWriter
    );
  }
  f = message.getActive();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
  f = message.getDeputyAddress_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
  f = message.getFixedFee();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getMinSwapAmount();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getMaxSwapAmount();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getMinBlockLock();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
  f = message.getMaxBlockLock();
  if (f !== 0) {
    writer.writeUint64(
      10,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.bep3.v1beta1.AssetParam} returns this
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional int64 coin_id = 2;
 * @return {number}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getCoinId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.kava.bep3.v1beta1.AssetParam} returns this
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.setCoinId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional SupplyLimit supply_limit = 3;
 * @return {?proto.kava.bep3.v1beta1.SupplyLimit}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getSupplyLimit = function() {
  return /** @type{?proto.kava.bep3.v1beta1.SupplyLimit} */ (
    jspb.Message.getWrapperField(this, proto.kava.bep3.v1beta1.SupplyLimit, 3));
};


/**
 * @param {?proto.kava.bep3.v1beta1.SupplyLimit|undefined} value
 * @return {!proto.kava.bep3.v1beta1.AssetParam} returns this
*/
proto.kava.bep3.v1beta1.AssetParam.prototype.setSupplyLimit = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.bep3.v1beta1.AssetParam} returns this
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.clearSupplyLimit = function() {
  return this.setSupplyLimit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.hasSupplyLimit = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional bool active = 4;
 * @return {boolean}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getActive = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.kava.bep3.v1beta1.AssetParam} returns this
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.setActive = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};


/**
 * optional bytes deputy_address = 5;
 * @return {string}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getDeputyAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes deputy_address = 5;
 * This is a type-conversion wrapper around `getDeputyAddress()`
 * @return {string}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getDeputyAddress_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getDeputyAddress()));
};


/**
 * optional bytes deputy_address = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getDeputyAddress()`
 * @return {!Uint8Array}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getDeputyAddress_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getDeputyAddress()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.kava.bep3.v1beta1.AssetParam} returns this
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.setDeputyAddress = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


/**
 * optional string fixed_fee = 6;
 * @return {string}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getFixedFee = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.bep3.v1beta1.AssetParam} returns this
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.setFixedFee = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string min_swap_amount = 7;
 * @return {string}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getMinSwapAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.bep3.v1beta1.AssetParam} returns this
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.setMinSwapAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string max_swap_amount = 8;
 * @return {string}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getMaxSwapAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.bep3.v1beta1.AssetParam} returns this
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.setMaxSwapAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional uint64 min_block_lock = 9;
 * @return {number}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getMinBlockLock = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.kava.bep3.v1beta1.AssetParam} returns this
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.setMinBlockLock = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional uint64 max_block_lock = 10;
 * @return {number}
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.getMaxBlockLock = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.kava.bep3.v1beta1.AssetParam} returns this
 */
proto.kava.bep3.v1beta1.AssetParam.prototype.setMaxBlockLock = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


