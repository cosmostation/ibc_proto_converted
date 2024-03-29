// source: osmosis/concentrated-liquidity/query.proto
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

goog.provide('proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
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
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.repeatedFields_, null);
};
goog.inherits(proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.displayName = 'proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.repeatedFields_ = [1];



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
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolsList: jspb.Message.toObjectList(msg.getPoolsList(),
    proto.google.protobuf.Any.toObject, includeInstance),
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
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse}
 */
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse;
  return proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse}
 */
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.addPools(value);
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
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
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
 * repeated google.protobuf.Any pools = 1;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.prototype.getPoolsList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 1));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse} returns this
*/
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.prototype.setPoolsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.prototype.addPools = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.prototype.clearPoolsList = function() {
  return this.setPoolsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse} returns this
*/
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.concentratedliquidity.v1beta1.PoolsResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


