// source: irismod/nft/query.proto
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

goog.provide('proto.irismod.nft.QueryCollectionResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.irismod.nft.Collection');

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
proto.irismod.nft.QueryCollectionResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.irismod.nft.QueryCollectionResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.nft.QueryCollectionResponse.displayName = 'proto.irismod.nft.QueryCollectionResponse';
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
proto.irismod.nft.QueryCollectionResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.nft.QueryCollectionResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.nft.QueryCollectionResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.nft.QueryCollectionResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    collection: (f = msg.getCollection()) && proto.irismod.nft.Collection.toObject(includeInstance, f),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.irismod.nft.QueryCollectionResponse}
 */
proto.irismod.nft.QueryCollectionResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.nft.QueryCollectionResponse;
  return proto.irismod.nft.QueryCollectionResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.nft.QueryCollectionResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.nft.QueryCollectionResponse}
 */
proto.irismod.nft.QueryCollectionResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.irismod.nft.Collection;
      reader.readMessage(value,proto.irismod.nft.Collection.deserializeBinaryFromReader);
      msg.setCollection(value);
      break;
    case 2:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.irismod.nft.QueryCollectionResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.nft.QueryCollectionResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.nft.QueryCollectionResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.nft.QueryCollectionResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCollection();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.irismod.nft.Collection.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional Collection collection = 1;
 * @return {?proto.irismod.nft.Collection}
 */
proto.irismod.nft.QueryCollectionResponse.prototype.getCollection = function() {
  return /** @type{?proto.irismod.nft.Collection} */ (
    jspb.Message.getWrapperField(this, proto.irismod.nft.Collection, 1));
};


/**
 * @param {?proto.irismod.nft.Collection|undefined} value
 * @return {!proto.irismod.nft.QueryCollectionResponse} returns this
*/
proto.irismod.nft.QueryCollectionResponse.prototype.setCollection = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.nft.QueryCollectionResponse} returns this
 */
proto.irismod.nft.QueryCollectionResponse.prototype.clearCollection = function() {
  return this.setCollection(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.nft.QueryCollectionResponse.prototype.hasCollection = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.irismod.nft.QueryCollectionResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.irismod.nft.QueryCollectionResponse} returns this
*/
proto.irismod.nft.QueryCollectionResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.irismod.nft.QueryCollectionResponse} returns this
 */
proto.irismod.nft.QueryCollectionResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.irismod.nft.QueryCollectionResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


