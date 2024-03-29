// source: shentu/shield/v1alpha1/tx.proto
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

goog.provide('proto.shentu.shield.v1alpha1.MsgUpdatePool');

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
proto.shentu.shield.v1alpha1.MsgUpdatePool = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.shentu.shield.v1alpha1.MsgUpdatePool.repeatedFields_, null);
};
goog.inherits(proto.shentu.shield.v1alpha1.MsgUpdatePool, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.shield.v1alpha1.MsgUpdatePool.displayName = 'proto.shentu.shield.v1alpha1.MsgUpdatePool';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.repeatedFields_ = [2,3];



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
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.shield.v1alpha1.MsgUpdatePool.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.shield.v1alpha1.MsgUpdatePool} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.toObject = function(includeInstance, msg) {
  var f, obj = {
    from: jspb.Message.getFieldWithDefault(msg, 1, ""),
    shieldList: jspb.Message.toObjectList(msg.getShieldList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    serviceFeesList: jspb.Message.toObjectList(msg.getServiceFeesList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    poolId: jspb.Message.getFieldWithDefault(msg, 4, 0),
    description: jspb.Message.getFieldWithDefault(msg, 5, ""),
    shieldLimit: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.shentu.shield.v1alpha1.MsgUpdatePool}
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.shield.v1alpha1.MsgUpdatePool;
  return proto.shentu.shield.v1alpha1.MsgUpdatePool.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.shield.v1alpha1.MsgUpdatePool} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.shield.v1alpha1.MsgUpdatePool}
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFrom(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addShield(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addServiceFees(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setShieldLimit(value);
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
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.shield.v1alpha1.MsgUpdatePool.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.shield.v1alpha1.MsgUpdatePool} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFrom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getShieldList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getServiceFeesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getShieldLimit();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional string from = 1;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.getFrom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.MsgUpdatePool} returns this
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.setFrom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin shield = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.getShieldList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.shentu.shield.v1alpha1.MsgUpdatePool} returns this
*/
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.setShieldList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.addShield = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.MsgUpdatePool} returns this
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.clearShieldList = function() {
  return this.setShieldList([]);
};


/**
 * repeated cosmos.base.v1beta1.Coin service_fees = 3;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.getServiceFeesList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.shentu.shield.v1alpha1.MsgUpdatePool} returns this
*/
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.setServiceFeesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.addServiceFees = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.MsgUpdatePool} returns this
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.clearServiceFeesList = function() {
  return this.setServiceFeesList([]);
};


/**
 * optional uint64 pool_id = 4;
 * @return {number}
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.shentu.shield.v1alpha1.MsgUpdatePool} returns this
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional string description = 5;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.MsgUpdatePool} returns this
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string shield_limit = 6;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.getShieldLimit = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.MsgUpdatePool} returns this
 */
proto.shentu.shield.v1alpha1.MsgUpdatePool.prototype.setShieldLimit = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


