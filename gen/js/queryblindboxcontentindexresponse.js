// source: likechain/likenft/v1/query.proto
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

goog.provide('proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.likechain.likenft.v1.BlindBoxContent');

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
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.repeatedFields_, null);
};
goog.inherits(proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.displayName = 'proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.repeatedFields_ = [1];



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
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    blindBoxContentsList: jspb.Message.toObjectList(msg.getBlindBoxContentsList(),
    proto.likechain.likenft.v1.BlindBoxContent.toObject, includeInstance),
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
 * @return {!proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse}
 */
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse;
  return proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse}
 */
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.likechain.likenft.v1.BlindBoxContent;
      reader.readMessage(value,proto.likechain.likenft.v1.BlindBoxContent.deserializeBinaryFromReader);
      msg.addBlindBoxContents(value);
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
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBlindBoxContentsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.likechain.likenft.v1.BlindBoxContent.serializeBinaryToWriter
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
 * repeated BlindBoxContent blind_box_contents = 1;
 * @return {!Array<!proto.likechain.likenft.v1.BlindBoxContent>}
 */
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.prototype.getBlindBoxContentsList = function() {
  return /** @type{!Array<!proto.likechain.likenft.v1.BlindBoxContent>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.likechain.likenft.v1.BlindBoxContent, 1));
};


/**
 * @param {!Array<!proto.likechain.likenft.v1.BlindBoxContent>} value
 * @return {!proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse} returns this
*/
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.prototype.setBlindBoxContentsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.likechain.likenft.v1.BlindBoxContent=} opt_value
 * @param {number=} opt_index
 * @return {!proto.likechain.likenft.v1.BlindBoxContent}
 */
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.prototype.addBlindBoxContents = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.likechain.likenft.v1.BlindBoxContent, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse} returns this
 */
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.prototype.clearBlindBoxContentsList = function() {
  return this.setBlindBoxContentsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse} returns this
*/
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse} returns this
 */
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.likechain.likenft.v1.QueryBlindBoxContentIndexResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


