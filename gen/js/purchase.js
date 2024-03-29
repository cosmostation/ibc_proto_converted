// source: shentu/shield/v1alpha1/shield.proto
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

goog.provide('proto.shentu.shield.v1alpha1.Purchase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.DecCoin');
goog.require('proto.google.protobuf.Timestamp');

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
proto.shentu.shield.v1alpha1.Purchase = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.shentu.shield.v1alpha1.Purchase.repeatedFields_, null);
};
goog.inherits(proto.shentu.shield.v1alpha1.Purchase, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.shield.v1alpha1.Purchase.displayName = 'proto.shentu.shield.v1alpha1.Purchase';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.shentu.shield.v1alpha1.Purchase.repeatedFields_ = [6];



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
proto.shentu.shield.v1alpha1.Purchase.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.shield.v1alpha1.Purchase.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.shield.v1alpha1.Purchase} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.Purchase.toObject = function(includeInstance, msg) {
  var f, obj = {
    purchaseId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    protectionEndTime: (f = msg.getProtectionEndTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    deletionTime: (f = msg.getDeletionTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    description: jspb.Message.getFieldWithDefault(msg, 4, ""),
    shield: jspb.Message.getFieldWithDefault(msg, 5, ""),
    serviceFeesList: jspb.Message.toObjectList(msg.getServiceFeesList(),
    proto.cosmos.base.v1beta1.DecCoin.toObject, includeInstance)
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
 * @return {!proto.shentu.shield.v1alpha1.Purchase}
 */
proto.shentu.shield.v1alpha1.Purchase.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.shield.v1alpha1.Purchase;
  return proto.shentu.shield.v1alpha1.Purchase.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.shield.v1alpha1.Purchase} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.shield.v1alpha1.Purchase}
 */
proto.shentu.shield.v1alpha1.Purchase.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPurchaseId(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setProtectionEndTime(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setDeletionTime(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setShield(value);
      break;
    case 6:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.addServiceFees(value);
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
proto.shentu.shield.v1alpha1.Purchase.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.shield.v1alpha1.Purchase.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.shield.v1alpha1.Purchase} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.Purchase.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPurchaseId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getProtectionEndTime();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getDeletionTime();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getShield();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getServiceFeesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 purchase_id = 1;
 * @return {number}
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.getPurchaseId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.shentu.shield.v1alpha1.Purchase} returns this
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.setPurchaseId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional google.protobuf.Timestamp protection_end_time = 2;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.getProtectionEndTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 2));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.shentu.shield.v1alpha1.Purchase} returns this
*/
proto.shentu.shield.v1alpha1.Purchase.prototype.setProtectionEndTime = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.shield.v1alpha1.Purchase} returns this
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.clearProtectionEndTime = function() {
  return this.setProtectionEndTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.hasProtectionEndTime = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional google.protobuf.Timestamp deletion_time = 3;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.getDeletionTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 3));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.shentu.shield.v1alpha1.Purchase} returns this
*/
proto.shentu.shield.v1alpha1.Purchase.prototype.setDeletionTime = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.shentu.shield.v1alpha1.Purchase} returns this
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.clearDeletionTime = function() {
  return this.setDeletionTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.hasDeletionTime = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string description = 4;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.Purchase} returns this
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string shield = 5;
 * @return {string}
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.getShield = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.shentu.shield.v1alpha1.Purchase} returns this
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.setShield = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * repeated cosmos.base.v1beta1.DecCoin service_fees = 6;
 * @return {!Array<!proto.cosmos.base.v1beta1.DecCoin>}
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.getServiceFeesList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.DecCoin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 6));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.DecCoin>} value
 * @return {!proto.shentu.shield.v1alpha1.Purchase} returns this
*/
proto.shentu.shield.v1alpha1.Purchase.prototype.setServiceFeesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.DecCoin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.DecCoin}
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.addServiceFees = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.cosmos.base.v1beta1.DecCoin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.Purchase} returns this
 */
proto.shentu.shield.v1alpha1.Purchase.prototype.clearServiceFeesList = function() {
  return this.setServiceFeesList([]);
};


