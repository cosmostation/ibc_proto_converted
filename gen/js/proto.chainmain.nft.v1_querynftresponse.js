// source: cryptoorg/nft/v1/query.proto
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

goog.provide('proto.chainmain.nft.v1.QueryNFTResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.chainmain.nft.v1.BaseNFT');

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
proto.chainmain.nft.v1.QueryNFTResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.chainmain.nft.v1.QueryNFTResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.chainmain.nft.v1.QueryNFTResponse.displayName = 'proto.chainmain.nft.v1.QueryNFTResponse';
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
proto.chainmain.nft.v1.QueryNFTResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.chainmain.nft.v1.QueryNFTResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.chainmain.nft.v1.QueryNFTResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.chainmain.nft.v1.QueryNFTResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    nft: (f = msg.getNft()) && proto.chainmain.nft.v1.BaseNFT.toObject(includeInstance, f)
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
 * @return {!proto.chainmain.nft.v1.QueryNFTResponse}
 */
proto.chainmain.nft.v1.QueryNFTResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.chainmain.nft.v1.QueryNFTResponse;
  return proto.chainmain.nft.v1.QueryNFTResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.chainmain.nft.v1.QueryNFTResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.chainmain.nft.v1.QueryNFTResponse}
 */
proto.chainmain.nft.v1.QueryNFTResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.chainmain.nft.v1.BaseNFT;
      reader.readMessage(value,proto.chainmain.nft.v1.BaseNFT.deserializeBinaryFromReader);
      msg.setNft(value);
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
proto.chainmain.nft.v1.QueryNFTResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.chainmain.nft.v1.QueryNFTResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.chainmain.nft.v1.QueryNFTResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.chainmain.nft.v1.QueryNFTResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getNft();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.chainmain.nft.v1.BaseNFT.serializeBinaryToWriter
    );
  }
};


/**
 * optional BaseNFT nft = 1;
 * @return {?proto.chainmain.nft.v1.BaseNFT}
 */
proto.chainmain.nft.v1.QueryNFTResponse.prototype.getNft = function() {
  return /** @type{?proto.chainmain.nft.v1.BaseNFT} */ (
    jspb.Message.getWrapperField(this, proto.chainmain.nft.v1.BaseNFT, 1));
};


/**
 * @param {?proto.chainmain.nft.v1.BaseNFT|undefined} value
 * @return {!proto.chainmain.nft.v1.QueryNFTResponse} returns this
*/
proto.chainmain.nft.v1.QueryNFTResponse.prototype.setNft = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.chainmain.nft.v1.QueryNFTResponse} returns this
 */
proto.chainmain.nft.v1.QueryNFTResponse.prototype.clearNft = function() {
  return this.setNft(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.chainmain.nft.v1.QueryNFTResponse.prototype.hasNft = function() {
  return jspb.Message.getField(this, 1) != null;
};

