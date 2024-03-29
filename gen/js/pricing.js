// source: irismod/service/service.proto
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

goog.provide('proto.irismod.service.Pricing');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.irismod.service.PromotionByTime');
goog.require('proto.irismod.service.PromotionByVolume');

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
proto.irismod.service.Pricing = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.irismod.service.Pricing.repeatedFields_, null);
};
goog.inherits(proto.irismod.service.Pricing, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.service.Pricing.displayName = 'proto.irismod.service.Pricing';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.irismod.service.Pricing.repeatedFields_ = [6,2,3];



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
proto.irismod.service.Pricing.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.service.Pricing.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.service.Pricing} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.service.Pricing.toObject = function(includeInstance, msg) {
  var f, obj = {
    priceList: jspb.Message.toObjectList(msg.getPriceList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    promotionsByTimeList: jspb.Message.toObjectList(msg.getPromotionsByTimeList(),
    proto.irismod.service.PromotionByTime.toObject, includeInstance),
    promotionsByVolumeList: jspb.Message.toObjectList(msg.getPromotionsByVolumeList(),
    proto.irismod.service.PromotionByVolume.toObject, includeInstance)
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
 * @return {!proto.irismod.service.Pricing}
 */
proto.irismod.service.Pricing.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.service.Pricing;
  return proto.irismod.service.Pricing.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.service.Pricing} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.service.Pricing}
 */
proto.irismod.service.Pricing.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 6:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addPrice(value);
      break;
    case 2:
      var value = new proto.irismod.service.PromotionByTime;
      reader.readMessage(value,proto.irismod.service.PromotionByTime.deserializeBinaryFromReader);
      msg.addPromotionsByTime(value);
      break;
    case 3:
      var value = new proto.irismod.service.PromotionByVolume;
      reader.readMessage(value,proto.irismod.service.PromotionByVolume.deserializeBinaryFromReader);
      msg.addPromotionsByVolume(value);
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
proto.irismod.service.Pricing.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.service.Pricing.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.service.Pricing} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.service.Pricing.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPriceList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getPromotionsByTimeList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.irismod.service.PromotionByTime.serializeBinaryToWriter
    );
  }
  f = message.getPromotionsByVolumeList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.irismod.service.PromotionByVolume.serializeBinaryToWriter
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.Coin price = 6;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.irismod.service.Pricing.prototype.getPriceList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 6));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.irismod.service.Pricing} returns this
*/
proto.irismod.service.Pricing.prototype.setPriceList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.irismod.service.Pricing.prototype.addPrice = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.service.Pricing} returns this
 */
proto.irismod.service.Pricing.prototype.clearPriceList = function() {
  return this.setPriceList([]);
};


/**
 * repeated PromotionByTime promotions_by_time = 2;
 * @return {!Array<!proto.irismod.service.PromotionByTime>}
 */
proto.irismod.service.Pricing.prototype.getPromotionsByTimeList = function() {
  return /** @type{!Array<!proto.irismod.service.PromotionByTime>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.irismod.service.PromotionByTime, 2));
};


/**
 * @param {!Array<!proto.irismod.service.PromotionByTime>} value
 * @return {!proto.irismod.service.Pricing} returns this
*/
proto.irismod.service.Pricing.prototype.setPromotionsByTimeList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.irismod.service.PromotionByTime=} opt_value
 * @param {number=} opt_index
 * @return {!proto.irismod.service.PromotionByTime}
 */
proto.irismod.service.Pricing.prototype.addPromotionsByTime = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.irismod.service.PromotionByTime, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.service.Pricing} returns this
 */
proto.irismod.service.Pricing.prototype.clearPromotionsByTimeList = function() {
  return this.setPromotionsByTimeList([]);
};


/**
 * repeated PromotionByVolume promotions_by_volume = 3;
 * @return {!Array<!proto.irismod.service.PromotionByVolume>}
 */
proto.irismod.service.Pricing.prototype.getPromotionsByVolumeList = function() {
  return /** @type{!Array<!proto.irismod.service.PromotionByVolume>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.irismod.service.PromotionByVolume, 3));
};


/**
 * @param {!Array<!proto.irismod.service.PromotionByVolume>} value
 * @return {!proto.irismod.service.Pricing} returns this
*/
proto.irismod.service.Pricing.prototype.setPromotionsByVolumeList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.irismod.service.PromotionByVolume=} opt_value
 * @param {number=} opt_index
 * @return {!proto.irismod.service.PromotionByVolume}
 */
proto.irismod.service.Pricing.prototype.addPromotionsByVolume = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.irismod.service.PromotionByVolume, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.service.Pricing} returns this
 */
proto.irismod.service.Pricing.prototype.clearPromotionsByVolumeList = function() {
  return this.setPromotionsByVolumeList([]);
};


