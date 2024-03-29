// source: comdex/locker/v1beta1/query.proto
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

goog.provide('proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.locker.v1beta1.LockerLookupTableData');
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
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.repeatedFields_, null);
};
goog.inherits(proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.displayName = 'proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.repeatedFields_ = [1];



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
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    tokenToLockerMappingList: jspb.Message.toObjectList(msg.getTokenToLockerMappingList(),
    proto.comdex.locker.v1beta1.LockerLookupTableData.toObject, includeInstance),
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
 * @return {!proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse}
 */
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse;
  return proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse}
 */
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.comdex.locker.v1beta1.LockerLookupTableData;
      reader.readMessage(value,proto.comdex.locker.v1beta1.LockerLookupTableData.deserializeBinaryFromReader);
      msg.addTokenToLockerMapping(value);
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
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTokenToLockerMappingList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.comdex.locker.v1beta1.LockerLookupTableData.serializeBinaryToWriter
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
 * repeated LockerLookupTableData token_to_locker_mapping = 1;
 * @return {!Array<!proto.comdex.locker.v1beta1.LockerLookupTableData>}
 */
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.prototype.getTokenToLockerMappingList = function() {
  return /** @type{!Array<!proto.comdex.locker.v1beta1.LockerLookupTableData>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.locker.v1beta1.LockerLookupTableData, 1));
};


/**
 * @param {!Array<!proto.comdex.locker.v1beta1.LockerLookupTableData>} value
 * @return {!proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse} returns this
*/
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.prototype.setTokenToLockerMappingList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.comdex.locker.v1beta1.LockerLookupTableData=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.locker.v1beta1.LockerLookupTableData}
 */
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.prototype.addTokenToLockerMapping = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.comdex.locker.v1beta1.LockerLookupTableData, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse} returns this
 */
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.prototype.clearTokenToLockerMappingList = function() {
  return this.setTokenToLockerMappingList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse} returns this
*/
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse} returns this
 */
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.locker.v1beta1.QueryLockerLookupTableByAppResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


