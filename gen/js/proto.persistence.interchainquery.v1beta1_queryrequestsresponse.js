// source: persistence/interchainquery/v1beta1/query.proto
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

goog.provide('proto.persistence.interchainquery.v1beta1.QueryRequestsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.persistence.interchainquery.v1beta1.Query');

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
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.repeatedFields_, null);
};
goog.inherits(proto.persistence.interchainquery.v1beta1.QueryRequestsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.displayName = 'proto.persistence.interchainquery.v1beta1.QueryRequestsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.repeatedFields_ = [1];



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
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.persistence.interchainquery.v1beta1.QueryRequestsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    queriesList: jspb.Message.toObjectList(msg.getQueriesList(),
    proto.persistence.interchainquery.v1beta1.Query.toObject, includeInstance),
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
 * @return {!proto.persistence.interchainquery.v1beta1.QueryRequestsResponse}
 */
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.persistence.interchainquery.v1beta1.QueryRequestsResponse;
  return proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.persistence.interchainquery.v1beta1.QueryRequestsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.persistence.interchainquery.v1beta1.QueryRequestsResponse}
 */
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.persistence.interchainquery.v1beta1.Query;
      reader.readMessage(value,proto.persistence.interchainquery.v1beta1.Query.deserializeBinaryFromReader);
      msg.addQueries(value);
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
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.persistence.interchainquery.v1beta1.QueryRequestsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getQueriesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.persistence.interchainquery.v1beta1.Query.serializeBinaryToWriter
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
 * repeated Query queries = 1;
 * @return {!Array<!proto.persistence.interchainquery.v1beta1.Query>}
 */
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.prototype.getQueriesList = function() {
  return /** @type{!Array<!proto.persistence.interchainquery.v1beta1.Query>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.persistence.interchainquery.v1beta1.Query, 1));
};


/**
 * @param {!Array<!proto.persistence.interchainquery.v1beta1.Query>} value
 * @return {!proto.persistence.interchainquery.v1beta1.QueryRequestsResponse} returns this
*/
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.prototype.setQueriesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.persistence.interchainquery.v1beta1.Query=} opt_value
 * @param {number=} opt_index
 * @return {!proto.persistence.interchainquery.v1beta1.Query}
 */
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.prototype.addQueries = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.persistence.interchainquery.v1beta1.Query, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.persistence.interchainquery.v1beta1.QueryRequestsResponse} returns this
 */
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.prototype.clearQueriesList = function() {
  return this.setQueriesList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.persistence.interchainquery.v1beta1.QueryRequestsResponse} returns this
*/
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.persistence.interchainquery.v1beta1.QueryRequestsResponse} returns this
 */
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.persistence.interchainquery.v1beta1.QueryRequestsResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


