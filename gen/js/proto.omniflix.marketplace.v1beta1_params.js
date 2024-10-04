// source: OmniFlix/marketplace/v1beta1/params.proto
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

goog.provide('proto.OmniFlix.marketplace.v1beta1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.OmniFlix.marketplace.v1beta1.Distribution');
goog.require('proto.google.protobuf.Duration');

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
proto.OmniFlix.marketplace.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.OmniFlix.marketplace.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.OmniFlix.marketplace.v1beta1.Params.displayName = 'proto.OmniFlix.marketplace.v1beta1.Params';
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
proto.OmniFlix.marketplace.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.OmniFlix.marketplace.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.OmniFlix.marketplace.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.marketplace.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    saleCommission: jspb.Message.getFieldWithDefault(msg, 1, ""),
    distribution: (f = msg.getDistribution()) && proto.OmniFlix.marketplace.v1beta1.Distribution.toObject(includeInstance, f),
    bidCloseDuration: (f = msg.getBidCloseDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    maxAuctionDuration: (f = msg.getMaxAuctionDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f)
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
 * @return {!proto.OmniFlix.marketplace.v1beta1.Params}
 */
proto.OmniFlix.marketplace.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.OmniFlix.marketplace.v1beta1.Params;
  return proto.OmniFlix.marketplace.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.OmniFlix.marketplace.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.OmniFlix.marketplace.v1beta1.Params}
 */
proto.OmniFlix.marketplace.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSaleCommission(value);
      break;
    case 2:
      var value = new proto.OmniFlix.marketplace.v1beta1.Distribution;
      reader.readMessage(value,proto.OmniFlix.marketplace.v1beta1.Distribution.deserializeBinaryFromReader);
      msg.setDistribution(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setBidCloseDuration(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setMaxAuctionDuration(value);
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
proto.OmniFlix.marketplace.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.OmniFlix.marketplace.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.OmniFlix.marketplace.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.marketplace.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSaleCommission();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDistribution();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.OmniFlix.marketplace.v1beta1.Distribution.serializeBinaryToWriter
    );
  }
  f = message.getBidCloseDuration();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getMaxAuctionDuration();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
};


/**
 * optional string sale_commission = 1;
 * @return {string}
 */
proto.OmniFlix.marketplace.v1beta1.Params.prototype.getSaleCommission = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.Params} returns this
 */
proto.OmniFlix.marketplace.v1beta1.Params.prototype.setSaleCommission = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional Distribution distribution = 2;
 * @return {?proto.OmniFlix.marketplace.v1beta1.Distribution}
 */
proto.OmniFlix.marketplace.v1beta1.Params.prototype.getDistribution = function() {
  return /** @type{?proto.OmniFlix.marketplace.v1beta1.Distribution} */ (
    jspb.Message.getWrapperField(this, proto.OmniFlix.marketplace.v1beta1.Distribution, 2));
};


/**
 * @param {?proto.OmniFlix.marketplace.v1beta1.Distribution|undefined} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.Params} returns this
*/
proto.OmniFlix.marketplace.v1beta1.Params.prototype.setDistribution = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.marketplace.v1beta1.Params} returns this
 */
proto.OmniFlix.marketplace.v1beta1.Params.prototype.clearDistribution = function() {
  return this.setDistribution(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.marketplace.v1beta1.Params.prototype.hasDistribution = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional google.protobuf.Duration bid_close_duration = 3;
 * @return {?proto.google.protobuf.Duration}
 */
proto.OmniFlix.marketplace.v1beta1.Params.prototype.getBidCloseDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 3));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.Params} returns this
*/
proto.OmniFlix.marketplace.v1beta1.Params.prototype.setBidCloseDuration = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.marketplace.v1beta1.Params} returns this
 */
proto.OmniFlix.marketplace.v1beta1.Params.prototype.clearBidCloseDuration = function() {
  return this.setBidCloseDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.marketplace.v1beta1.Params.prototype.hasBidCloseDuration = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional google.protobuf.Duration max_auction_duration = 4;
 * @return {?proto.google.protobuf.Duration}
 */
proto.OmniFlix.marketplace.v1beta1.Params.prototype.getMaxAuctionDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 4));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.OmniFlix.marketplace.v1beta1.Params} returns this
*/
proto.OmniFlix.marketplace.v1beta1.Params.prototype.setMaxAuctionDuration = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.marketplace.v1beta1.Params} returns this
 */
proto.OmniFlix.marketplace.v1beta1.Params.prototype.clearMaxAuctionDuration = function() {
  return this.setMaxAuctionDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.marketplace.v1beta1.Params.prototype.hasMaxAuctionDuration = function() {
  return jspb.Message.getField(this, 4) != null;
};

