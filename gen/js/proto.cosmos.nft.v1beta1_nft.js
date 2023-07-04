// source: cosmos/nft/v1beta1/nft.proto
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

goog.provide('proto.cosmos.nft.v1beta1.NFT');

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
proto.cosmos.nft.v1beta1.NFT = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.nft.v1beta1.NFT, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.nft.v1beta1.NFT.displayName = 'proto.cosmos.nft.v1beta1.NFT';
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
proto.cosmos.nft.v1beta1.NFT.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.nft.v1beta1.NFT.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.nft.v1beta1.NFT} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.nft.v1beta1.NFT.toObject = function(includeInstance, msg) {
  var f, obj = {
    classId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    id: jspb.Message.getFieldWithDefault(msg, 2, ""),
    uri: jspb.Message.getFieldWithDefault(msg, 3, ""),
    uriHash: jspb.Message.getFieldWithDefault(msg, 4, ""),
    data: (f = msg.getData()) && proto.google.protobuf.Any.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.nft.v1beta1.NFT}
 */
proto.cosmos.nft.v1beta1.NFT.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.nft.v1beta1.NFT;
  return proto.cosmos.nft.v1beta1.NFT.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.nft.v1beta1.NFT} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.nft.v1beta1.NFT}
 */
proto.cosmos.nft.v1beta1.NFT.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setClassId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setUri(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setUriHash(value);
      break;
    case 10:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setData(value);
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
proto.cosmos.nft.v1beta1.NFT.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.nft.v1beta1.NFT.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.nft.v1beta1.NFT} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.nft.v1beta1.NFT.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClassId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getUri();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getUriHash();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getData();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
};


/**
 * optional string class_id = 1;
 * @return {string}
 */
proto.cosmos.nft.v1beta1.NFT.prototype.getClassId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.nft.v1beta1.NFT} returns this
 */
proto.cosmos.nft.v1beta1.NFT.prototype.setClassId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string id = 2;
 * @return {string}
 */
proto.cosmos.nft.v1beta1.NFT.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.nft.v1beta1.NFT} returns this
 */
proto.cosmos.nft.v1beta1.NFT.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string uri = 3;
 * @return {string}
 */
proto.cosmos.nft.v1beta1.NFT.prototype.getUri = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.nft.v1beta1.NFT} returns this
 */
proto.cosmos.nft.v1beta1.NFT.prototype.setUri = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string uri_hash = 4;
 * @return {string}
 */
proto.cosmos.nft.v1beta1.NFT.prototype.getUriHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.nft.v1beta1.NFT} returns this
 */
proto.cosmos.nft.v1beta1.NFT.prototype.setUriHash = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional google.protobuf.Any data = 10;
 * @return {?proto.google.protobuf.Any}
 */
proto.cosmos.nft.v1beta1.NFT.prototype.getData = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 10));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.cosmos.nft.v1beta1.NFT} returns this
*/
proto.cosmos.nft.v1beta1.NFT.prototype.setData = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.nft.v1beta1.NFT} returns this
 */
proto.cosmos.nft.v1beta1.NFT.prototype.clearData = function() {
  return this.setData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.nft.v1beta1.NFT.prototype.hasData = function() {
  return jspb.Message.getField(this, 10) != null;
};

