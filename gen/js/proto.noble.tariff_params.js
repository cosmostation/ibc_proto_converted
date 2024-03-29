// source: noble/tariff/params.proto
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

goog.provide('proto.noble.tariff.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.noble.tariff.DistributionEntity');

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
proto.noble.tariff.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.noble.tariff.Params.repeatedFields_, null);
};
goog.inherits(proto.noble.tariff.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.noble.tariff.Params.displayName = 'proto.noble.tariff.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.noble.tariff.Params.repeatedFields_ = [2];



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
proto.noble.tariff.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.noble.tariff.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.noble.tariff.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.noble.tariff.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    share: jspb.Message.getFieldWithDefault(msg, 1, ""),
    distributionEntitiesList: jspb.Message.toObjectList(msg.getDistributionEntitiesList(),
    proto.noble.tariff.DistributionEntity.toObject, includeInstance),
    transferFeeBps: jspb.Message.getFieldWithDefault(msg, 3, ""),
    transferFeeMax: jspb.Message.getFieldWithDefault(msg, 4, ""),
    transferFeeDenom: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.noble.tariff.Params}
 */
proto.noble.tariff.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.noble.tariff.Params;
  return proto.noble.tariff.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.noble.tariff.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.noble.tariff.Params}
 */
proto.noble.tariff.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setShare(value);
      break;
    case 2:
      var value = new proto.noble.tariff.DistributionEntity;
      reader.readMessage(value,proto.noble.tariff.DistributionEntity.deserializeBinaryFromReader);
      msg.addDistributionEntities(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransferFeeBps(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransferFeeMax(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransferFeeDenom(value);
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
proto.noble.tariff.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.noble.tariff.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.noble.tariff.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.noble.tariff.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getShare();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDistributionEntitiesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.noble.tariff.DistributionEntity.serializeBinaryToWriter
    );
  }
  f = message.getTransferFeeBps();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getTransferFeeMax();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getTransferFeeDenom();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional string share = 1;
 * @return {string}
 */
proto.noble.tariff.Params.prototype.getShare = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.noble.tariff.Params} returns this
 */
proto.noble.tariff.Params.prototype.setShare = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated DistributionEntity distribution_entities = 2;
 * @return {!Array<!proto.noble.tariff.DistributionEntity>}
 */
proto.noble.tariff.Params.prototype.getDistributionEntitiesList = function() {
  return /** @type{!Array<!proto.noble.tariff.DistributionEntity>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.noble.tariff.DistributionEntity, 2));
};


/**
 * @param {!Array<!proto.noble.tariff.DistributionEntity>} value
 * @return {!proto.noble.tariff.Params} returns this
*/
proto.noble.tariff.Params.prototype.setDistributionEntitiesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.noble.tariff.DistributionEntity=} opt_value
 * @param {number=} opt_index
 * @return {!proto.noble.tariff.DistributionEntity}
 */
proto.noble.tariff.Params.prototype.addDistributionEntities = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.noble.tariff.DistributionEntity, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.noble.tariff.Params} returns this
 */
proto.noble.tariff.Params.prototype.clearDistributionEntitiesList = function() {
  return this.setDistributionEntitiesList([]);
};


/**
 * optional string transfer_fee_bps = 3;
 * @return {string}
 */
proto.noble.tariff.Params.prototype.getTransferFeeBps = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.noble.tariff.Params} returns this
 */
proto.noble.tariff.Params.prototype.setTransferFeeBps = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string transfer_fee_max = 4;
 * @return {string}
 */
proto.noble.tariff.Params.prototype.getTransferFeeMax = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.noble.tariff.Params} returns this
 */
proto.noble.tariff.Params.prototype.setTransferFeeMax = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string transfer_fee_denom = 5;
 * @return {string}
 */
proto.noble.tariff.Params.prototype.getTransferFeeDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.noble.tariff.Params} returns this
 */
proto.noble.tariff.Params.prototype.setTransferFeeDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


