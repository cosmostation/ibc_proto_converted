// source: cudos/nft/nft.proto
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

goog.provide('proto.cudosnode.cudosnode.nft.Collection');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cudosnode.cudosnode.nft.BaseNFT');
goog.require('proto.cudosnode.cudosnode.nft.Denom');

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
proto.cudosnode.cudosnode.nft.Collection = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cudosnode.cudosnode.nft.Collection.repeatedFields_, null);
};
goog.inherits(proto.cudosnode.cudosnode.nft.Collection, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cudosnode.cudosnode.nft.Collection.displayName = 'proto.cudosnode.cudosnode.nft.Collection';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cudosnode.cudosnode.nft.Collection.repeatedFields_ = [2];



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
proto.cudosnode.cudosnode.nft.Collection.prototype.toObject = function(opt_includeInstance) {
  return proto.cudosnode.cudosnode.nft.Collection.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cudosnode.cudosnode.nft.Collection} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.Collection.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: (f = msg.getDenom()) && proto.cudosnode.cudosnode.nft.Denom.toObject(includeInstance, f),
    nftsList: jspb.Message.toObjectList(msg.getNftsList(),
    proto.cudosnode.cudosnode.nft.BaseNFT.toObject, includeInstance)
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
 * @return {!proto.cudosnode.cudosnode.nft.Collection}
 */
proto.cudosnode.cudosnode.nft.Collection.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cudosnode.cudosnode.nft.Collection;
  return proto.cudosnode.cudosnode.nft.Collection.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cudosnode.cudosnode.nft.Collection} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cudosnode.cudosnode.nft.Collection}
 */
proto.cudosnode.cudosnode.nft.Collection.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cudosnode.cudosnode.nft.Denom;
      reader.readMessage(value,proto.cudosnode.cudosnode.nft.Denom.deserializeBinaryFromReader);
      msg.setDenom(value);
      break;
    case 2:
      var value = new proto.cudosnode.cudosnode.nft.BaseNFT;
      reader.readMessage(value,proto.cudosnode.cudosnode.nft.BaseNFT.deserializeBinaryFromReader);
      msg.addNfts(value);
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
proto.cudosnode.cudosnode.nft.Collection.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cudosnode.cudosnode.nft.Collection.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cudosnode.cudosnode.nft.Collection} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.Collection.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cudosnode.cudosnode.nft.Denom.serializeBinaryToWriter
    );
  }
  f = message.getNftsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cudosnode.cudosnode.nft.BaseNFT.serializeBinaryToWriter
    );
  }
};


/**
 * optional Denom denom = 1;
 * @return {?proto.cudosnode.cudosnode.nft.Denom}
 */
proto.cudosnode.cudosnode.nft.Collection.prototype.getDenom = function() {
  return /** @type{?proto.cudosnode.cudosnode.nft.Denom} */ (
    jspb.Message.getWrapperField(this, proto.cudosnode.cudosnode.nft.Denom, 1));
};


/**
 * @param {?proto.cudosnode.cudosnode.nft.Denom|undefined} value
 * @return {!proto.cudosnode.cudosnode.nft.Collection} returns this
*/
proto.cudosnode.cudosnode.nft.Collection.prototype.setDenom = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cudosnode.cudosnode.nft.Collection} returns this
 */
proto.cudosnode.cudosnode.nft.Collection.prototype.clearDenom = function() {
  return this.setDenom(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cudosnode.cudosnode.nft.Collection.prototype.hasDenom = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated BaseNFT nfts = 2;
 * @return {!Array<!proto.cudosnode.cudosnode.nft.BaseNFT>}
 */
proto.cudosnode.cudosnode.nft.Collection.prototype.getNftsList = function() {
  return /** @type{!Array<!proto.cudosnode.cudosnode.nft.BaseNFT>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cudosnode.cudosnode.nft.BaseNFT, 2));
};


/**
 * @param {!Array<!proto.cudosnode.cudosnode.nft.BaseNFT>} value
 * @return {!proto.cudosnode.cudosnode.nft.Collection} returns this
*/
proto.cudosnode.cudosnode.nft.Collection.prototype.setNftsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cudosnode.cudosnode.nft.BaseNFT=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cudosnode.cudosnode.nft.BaseNFT}
 */
proto.cudosnode.cudosnode.nft.Collection.prototype.addNfts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cudosnode.cudosnode.nft.BaseNFT, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cudosnode.cudosnode.nft.Collection} returns this
 */
proto.cudosnode.cudosnode.nft.Collection.prototype.clearNftsList = function() {
  return this.setNftsList([]);
};


