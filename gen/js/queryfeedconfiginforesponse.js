// source: injective/ocr/v1beta1/query.proto
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

goog.provide('proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.ocr.v1beta1.EpochAndRound');
goog.require('proto.injective.ocr.v1beta1.FeedConfigInfo');

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
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.displayName = 'proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse';
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
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    feedConfigInfo: (f = msg.getFeedConfigInfo()) && proto.injective.ocr.v1beta1.FeedConfigInfo.toObject(includeInstance, f),
    epochAndRound: (f = msg.getEpochAndRound()) && proto.injective.ocr.v1beta1.EpochAndRound.toObject(includeInstance, f)
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
 * @return {!proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse}
 */
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse;
  return proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse}
 */
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.injective.ocr.v1beta1.FeedConfigInfo;
      reader.readMessage(value,proto.injective.ocr.v1beta1.FeedConfigInfo.deserializeBinaryFromReader);
      msg.setFeedConfigInfo(value);
      break;
    case 2:
      var value = new proto.injective.ocr.v1beta1.EpochAndRound;
      reader.readMessage(value,proto.injective.ocr.v1beta1.EpochAndRound.deserializeBinaryFromReader);
      msg.setEpochAndRound(value);
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
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFeedConfigInfo();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.injective.ocr.v1beta1.FeedConfigInfo.serializeBinaryToWriter
    );
  }
  f = message.getEpochAndRound();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.injective.ocr.v1beta1.EpochAndRound.serializeBinaryToWriter
    );
  }
};


/**
 * optional FeedConfigInfo feed_config_info = 1;
 * @return {?proto.injective.ocr.v1beta1.FeedConfigInfo}
 */
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.prototype.getFeedConfigInfo = function() {
  return /** @type{?proto.injective.ocr.v1beta1.FeedConfigInfo} */ (
    jspb.Message.getWrapperField(this, proto.injective.ocr.v1beta1.FeedConfigInfo, 1));
};


/**
 * @param {?proto.injective.ocr.v1beta1.FeedConfigInfo|undefined} value
 * @return {!proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse} returns this
*/
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.prototype.setFeedConfigInfo = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse} returns this
 */
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.prototype.clearFeedConfigInfo = function() {
  return this.setFeedConfigInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.prototype.hasFeedConfigInfo = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional EpochAndRound epoch_and_round = 2;
 * @return {?proto.injective.ocr.v1beta1.EpochAndRound}
 */
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.prototype.getEpochAndRound = function() {
  return /** @type{?proto.injective.ocr.v1beta1.EpochAndRound} */ (
    jspb.Message.getWrapperField(this, proto.injective.ocr.v1beta1.EpochAndRound, 2));
};


/**
 * @param {?proto.injective.ocr.v1beta1.EpochAndRound|undefined} value
 * @return {!proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse} returns this
*/
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.prototype.setEpochAndRound = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse} returns this
 */
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.prototype.clearEpochAndRound = function() {
  return this.setEpochAndRound(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.ocr.v1beta1.QueryFeedConfigInfoResponse.prototype.hasEpochAndRound = function() {
  return jspb.Message.getField(this, 2) != null;
};


