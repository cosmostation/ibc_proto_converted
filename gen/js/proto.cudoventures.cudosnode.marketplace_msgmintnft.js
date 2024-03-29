// source: cudos/marketplace/tx.proto
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

goog.provide('proto.cudoventures.cudosnode.marketplace.MsgMintNft');

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
proto.cudoventures.cudosnode.marketplace.MsgMintNft = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cudoventures.cudosnode.marketplace.MsgMintNft, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cudoventures.cudosnode.marketplace.MsgMintNft.displayName = 'proto.cudoventures.cudosnode.marketplace.MsgMintNft';
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
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.toObject = function(opt_includeInstance) {
  return proto.cudoventures.cudosnode.marketplace.MsgMintNft.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.toObject = function(includeInstance, msg) {
  var f, obj = {
    creator: jspb.Message.getFieldWithDefault(msg, 1, ""),
    denomid: jspb.Message.getFieldWithDefault(msg, 2, ""),
    recipient: jspb.Message.getFieldWithDefault(msg, 3, ""),
    price: (f = msg.getPrice()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    name: jspb.Message.getFieldWithDefault(msg, 5, ""),
    uri: jspb.Message.getFieldWithDefault(msg, 6, ""),
    data: jspb.Message.getFieldWithDefault(msg, 7, ""),
    uid: jspb.Message.getFieldWithDefault(msg, 8, "")
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
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgMintNft}
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cudoventures.cudosnode.marketplace.MsgMintNft;
  return proto.cudoventures.cudosnode.marketplace.MsgMintNft.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgMintNft}
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenomid(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setRecipient(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setPrice(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setUri(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setData(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setUid(value);
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
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cudoventures.cudosnode.marketplace.MsgMintNft.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDenomid();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getRecipient();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPrice();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getUri();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getData();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getUid();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
};


/**
 * optional string creator = 1;
 * @return {string}
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string denomId = 2;
 * @return {string}
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.getDenomid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.setDenomid = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string recipient = 3;
 * @return {string}
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.getRecipient = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.setRecipient = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional cosmos.base.v1beta1.Coin price = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.getPrice = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} returns this
*/
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.setPrice = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.clearPrice = function() {
  return this.setPrice(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.hasPrice = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional string name = 5;
 * @return {string}
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string uri = 6;
 * @return {string}
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.getUri = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.setUri = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string data = 7;
 * @return {string}
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.getData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.setData = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string uid = 8;
 * @return {string}
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.getUid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgMintNft} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgMintNft.prototype.setUid = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


