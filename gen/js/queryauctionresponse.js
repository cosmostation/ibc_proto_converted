// source: kava/auction/v1beta1/query.proto
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

goog.provide('proto.kava.auction.v1beta1.QueryAuctionResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');

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
proto.kava.auction.v1beta1.QueryAuctionResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kava.auction.v1beta1.QueryAuctionResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.auction.v1beta1.QueryAuctionResponse.displayName = 'proto.kava.auction.v1beta1.QueryAuctionResponse';
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
proto.kava.auction.v1beta1.QueryAuctionResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.auction.v1beta1.QueryAuctionResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.auction.v1beta1.QueryAuctionResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.auction.v1beta1.QueryAuctionResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    auction: (f = msg.getAuction()) && proto.google.protobuf.Any.toObject(includeInstance, f)
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
 * @return {!proto.kava.auction.v1beta1.QueryAuctionResponse}
 */
proto.kava.auction.v1beta1.QueryAuctionResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.auction.v1beta1.QueryAuctionResponse;
  return proto.kava.auction.v1beta1.QueryAuctionResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.auction.v1beta1.QueryAuctionResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.auction.v1beta1.QueryAuctionResponse}
 */
proto.kava.auction.v1beta1.QueryAuctionResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setAuction(value);
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
proto.kava.auction.v1beta1.QueryAuctionResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.auction.v1beta1.QueryAuctionResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.auction.v1beta1.QueryAuctionResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.auction.v1beta1.QueryAuctionResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAuction();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
};


/**
 * optional google.protobuf.Any auction = 1;
 * @return {?proto.google.protobuf.Any}
 */
proto.kava.auction.v1beta1.QueryAuctionResponse.prototype.getAuction = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 1));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.kava.auction.v1beta1.QueryAuctionResponse} returns this
*/
proto.kava.auction.v1beta1.QueryAuctionResponse.prototype.setAuction = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.auction.v1beta1.QueryAuctionResponse} returns this
 */
proto.kava.auction.v1beta1.QueryAuctionResponse.prototype.clearAuction = function() {
  return this.setAuction(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.auction.v1beta1.QueryAuctionResponse.prototype.hasAuction = function() {
  return jspb.Message.getField(this, 1) != null;
};


