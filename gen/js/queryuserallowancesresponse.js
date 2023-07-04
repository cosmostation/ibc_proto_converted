// source: desmos/subspaces/v3/query.proto
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

goog.provide('proto.desmos.subspaces.v3.QueryUserAllowancesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.desmos.subspaces.v3.Grant');

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
proto.desmos.subspaces.v3.QueryUserAllowancesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.desmos.subspaces.v3.QueryUserAllowancesResponse.repeatedFields_, null);
};
goog.inherits(proto.desmos.subspaces.v3.QueryUserAllowancesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.subspaces.v3.QueryUserAllowancesResponse.displayName = 'proto.desmos.subspaces.v3.QueryUserAllowancesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.repeatedFields_ = [1];



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
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.subspaces.v3.QueryUserAllowancesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.subspaces.v3.QueryUserAllowancesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    grantsList: jspb.Message.toObjectList(msg.getGrantsList(),
    proto.desmos.subspaces.v3.Grant.toObject, includeInstance),
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
 * @return {!proto.desmos.subspaces.v3.QueryUserAllowancesResponse}
 */
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.subspaces.v3.QueryUserAllowancesResponse;
  return proto.desmos.subspaces.v3.QueryUserAllowancesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.subspaces.v3.QueryUserAllowancesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.subspaces.v3.QueryUserAllowancesResponse}
 */
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.desmos.subspaces.v3.Grant;
      reader.readMessage(value,proto.desmos.subspaces.v3.Grant.deserializeBinaryFromReader);
      msg.addGrants(value);
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
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.subspaces.v3.QueryUserAllowancesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.subspaces.v3.QueryUserAllowancesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getGrantsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.desmos.subspaces.v3.Grant.serializeBinaryToWriter
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
 * repeated Grant grants = 1;
 * @return {!Array<!proto.desmos.subspaces.v3.Grant>}
 */
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.prototype.getGrantsList = function() {
  return /** @type{!Array<!proto.desmos.subspaces.v3.Grant>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.desmos.subspaces.v3.Grant, 1));
};


/**
 * @param {!Array<!proto.desmos.subspaces.v3.Grant>} value
 * @return {!proto.desmos.subspaces.v3.QueryUserAllowancesResponse} returns this
*/
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.prototype.setGrantsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.desmos.subspaces.v3.Grant=} opt_value
 * @param {number=} opt_index
 * @return {!proto.desmos.subspaces.v3.Grant}
 */
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.prototype.addGrants = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.desmos.subspaces.v3.Grant, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.subspaces.v3.QueryUserAllowancesResponse} returns this
 */
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.prototype.clearGrantsList = function() {
  return this.setGrantsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.desmos.subspaces.v3.QueryUserAllowancesResponse} returns this
*/
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.subspaces.v3.QueryUserAllowancesResponse} returns this
 */
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.subspaces.v3.QueryUserAllowancesResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};

