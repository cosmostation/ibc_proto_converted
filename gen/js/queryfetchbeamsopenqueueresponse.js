// source: lum-network/beam/query.proto
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

goog.provide('proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');

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
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.repeatedFields_, null);
};
goog.inherits(proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.displayName = 'proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.repeatedFields_ = [1];



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
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    beamIdsList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
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
 * @return {!proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse}
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse;
  return proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse}
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addBeamIds(value);
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
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBeamIdsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
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
 * repeated string beam_ids = 1;
 * @return {!Array<string>}
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.prototype.getBeamIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse} returns this
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.prototype.setBeamIdsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse} returns this
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.prototype.addBeamIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse} returns this
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.prototype.clearBeamIdsList = function() {
  return this.setBeamIdsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse} returns this
*/
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse} returns this
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.beam.QueryFetchBeamsOpenQueueResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


