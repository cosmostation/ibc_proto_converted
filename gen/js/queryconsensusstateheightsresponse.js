// source: ibc/core/client/v1/query.proto
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

goog.provide('proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.ibc.core.client.v1.Height');

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
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.repeatedFields_, null);
};
goog.inherits(proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.displayName = 'proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.repeatedFields_ = [1];



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
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    consensusStateHeightsList: jspb.Message.toObjectList(msg.getConsensusStateHeightsList(),
    proto.ibc.core.client.v1.Height.toObject, includeInstance),
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
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse}
 */
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse;
  return proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse}
 */
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.ibc.core.client.v1.Height;
      reader.readMessage(value,proto.ibc.core.client.v1.Height.deserializeBinaryFromReader);
      msg.addConsensusStateHeights(value);
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
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConsensusStateHeightsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.ibc.core.client.v1.Height.serializeBinaryToWriter
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
 * repeated Height consensus_state_heights = 1;
 * @return {!Array<!proto.ibc.core.client.v1.Height>}
 */
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.prototype.getConsensusStateHeightsList = function() {
  return /** @type{!Array<!proto.ibc.core.client.v1.Height>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ibc.core.client.v1.Height, 1));
};


/**
 * @param {!Array<!proto.ibc.core.client.v1.Height>} value
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse} returns this
*/
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.prototype.setConsensusStateHeightsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.ibc.core.client.v1.Height=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ibc.core.client.v1.Height}
 */
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.prototype.addConsensusStateHeights = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.ibc.core.client.v1.Height, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse} returns this
 */
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.prototype.clearConsensusStateHeightsList = function() {
  return this.setConsensusStateHeightsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse} returns this
*/
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse} returns this
 */
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.core.client.v1.QueryConsensusStateHeightsResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


