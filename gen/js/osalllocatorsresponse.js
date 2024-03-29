// source: provenance/metadata/v1/query.proto
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

goog.provide('proto.provenance.metadata.v1.OSAllLocatorsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.provenance.metadata.v1.OSAllLocatorsRequest');
goog.require('proto.provenance.metadata.v1.ObjectStoreLocator');

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
proto.provenance.metadata.v1.OSAllLocatorsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.OSAllLocatorsResponse.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.OSAllLocatorsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.OSAllLocatorsResponse.displayName = 'proto.provenance.metadata.v1.OSAllLocatorsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.repeatedFields_ = [1];



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
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.OSAllLocatorsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.OSAllLocatorsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    locatorsList: jspb.Message.toObjectList(msg.getLocatorsList(),
    proto.provenance.metadata.v1.ObjectStoreLocator.toObject, includeInstance),
    request: (f = msg.getRequest()) && proto.provenance.metadata.v1.OSAllLocatorsRequest.toObject(includeInstance, f),
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
 * @return {!proto.provenance.metadata.v1.OSAllLocatorsResponse}
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.OSAllLocatorsResponse;
  return proto.provenance.metadata.v1.OSAllLocatorsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.OSAllLocatorsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.OSAllLocatorsResponse}
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.metadata.v1.ObjectStoreLocator;
      reader.readMessage(value,proto.provenance.metadata.v1.ObjectStoreLocator.deserializeBinaryFromReader);
      msg.addLocators(value);
      break;
    case 98:
      var value = new proto.provenance.metadata.v1.OSAllLocatorsRequest;
      reader.readMessage(value,proto.provenance.metadata.v1.OSAllLocatorsRequest.deserializeBinaryFromReader);
      msg.setRequest(value);
      break;
    case 99:
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
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.OSAllLocatorsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.OSAllLocatorsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLocatorsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.provenance.metadata.v1.ObjectStoreLocator.serializeBinaryToWriter
    );
  }
  f = message.getRequest();
  if (f != null) {
    writer.writeMessage(
      98,
      f,
      proto.provenance.metadata.v1.OSAllLocatorsRequest.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      99,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated ObjectStoreLocator locators = 1;
 * @return {!Array<!proto.provenance.metadata.v1.ObjectStoreLocator>}
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.getLocatorsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.ObjectStoreLocator>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.ObjectStoreLocator, 1));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.ObjectStoreLocator>} value
 * @return {!proto.provenance.metadata.v1.OSAllLocatorsResponse} returns this
*/
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.setLocatorsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.provenance.metadata.v1.ObjectStoreLocator=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.ObjectStoreLocator}
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.addLocators = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.provenance.metadata.v1.ObjectStoreLocator, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.OSAllLocatorsResponse} returns this
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.clearLocatorsList = function() {
  return this.setLocatorsList([]);
};


/**
 * optional OSAllLocatorsRequest request = 98;
 * @return {?proto.provenance.metadata.v1.OSAllLocatorsRequest}
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.getRequest = function() {
  return /** @type{?proto.provenance.metadata.v1.OSAllLocatorsRequest} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.OSAllLocatorsRequest, 98));
};


/**
 * @param {?proto.provenance.metadata.v1.OSAllLocatorsRequest|undefined} value
 * @return {!proto.provenance.metadata.v1.OSAllLocatorsResponse} returns this
*/
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.setRequest = function(value) {
  return jspb.Message.setWrapperField(this, 98, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.OSAllLocatorsResponse} returns this
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.clearRequest = function() {
  return this.setRequest(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.hasRequest = function() {
  return jspb.Message.getField(this, 98) != null;
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 99;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 99));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.provenance.metadata.v1.OSAllLocatorsResponse} returns this
*/
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 99, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.OSAllLocatorsResponse} returns this
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.OSAllLocatorsResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 99) != null;
};


