// source: comdex/lend/v1beta1/query.proto
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

goog.provide('proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.lend.v1beta1.AssetToPairMapping');
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
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.repeatedFields_, null);
};
goog.inherits(proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.displayName = 'proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.repeatedFields_ = [1];



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
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    assettopairmappingsList: jspb.Message.toObjectList(msg.getAssettopairmappingsList(),
    proto.comdex.lend.v1beta1.AssetToPairMapping.toObject, includeInstance),
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
 * @return {!proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse}
 */
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse;
  return proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse}
 */
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.comdex.lend.v1beta1.AssetToPairMapping;
      reader.readMessage(value,proto.comdex.lend.v1beta1.AssetToPairMapping.deserializeBinaryFromReader);
      msg.addAssettopairmappings(value);
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
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAssettopairmappingsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.comdex.lend.v1beta1.AssetToPairMapping.serializeBinaryToWriter
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
 * repeated AssetToPairMapping assetToPairMappings = 1;
 * @return {!Array<!proto.comdex.lend.v1beta1.AssetToPairMapping>}
 */
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.prototype.getAssettopairmappingsList = function() {
  return /** @type{!Array<!proto.comdex.lend.v1beta1.AssetToPairMapping>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.lend.v1beta1.AssetToPairMapping, 1));
};


/**
 * @param {!Array<!proto.comdex.lend.v1beta1.AssetToPairMapping>} value
 * @return {!proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse} returns this
*/
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.prototype.setAssettopairmappingsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.comdex.lend.v1beta1.AssetToPairMapping=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.lend.v1beta1.AssetToPairMapping}
 */
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.prototype.addAssettopairmappings = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.comdex.lend.v1beta1.AssetToPairMapping, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse} returns this
 */
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.prototype.clearAssettopairmappingsList = function() {
  return this.setAssettopairmappingsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse} returns this
*/
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse} returns this
 */
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.lend.v1beta1.QueryAssetToPairMappingsResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};

