// source: cosmos/distribution/v1beta1/query.proto
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

goog.provide('proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.cosmos.distribution.v1beta1.ValidatorSlashEvent');

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
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.repeatedFields_, null);
};
goog.inherits(proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.displayName = 'proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.repeatedFields_ = [1];



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
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    slashesList: jspb.Message.toObjectList(msg.getSlashesList(),
    proto.cosmos.distribution.v1beta1.ValidatorSlashEvent.toObject, includeInstance),
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
 * @return {!proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse}
 */
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse;
  return proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse}
 */
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.distribution.v1beta1.ValidatorSlashEvent;
      reader.readMessage(value,proto.cosmos.distribution.v1beta1.ValidatorSlashEvent.deserializeBinaryFromReader);
      msg.addSlashes(value);
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
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSlashesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.distribution.v1beta1.ValidatorSlashEvent.serializeBinaryToWriter
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
 * repeated ValidatorSlashEvent slashes = 1;
 * @return {!Array<!proto.cosmos.distribution.v1beta1.ValidatorSlashEvent>}
 */
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.prototype.getSlashesList = function() {
  return /** @type{!Array<!proto.cosmos.distribution.v1beta1.ValidatorSlashEvent>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.distribution.v1beta1.ValidatorSlashEvent, 1));
};


/**
 * @param {!Array<!proto.cosmos.distribution.v1beta1.ValidatorSlashEvent>} value
 * @return {!proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse} returns this
*/
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.prototype.setSlashesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.distribution.v1beta1.ValidatorSlashEvent=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.distribution.v1beta1.ValidatorSlashEvent}
 */
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.prototype.addSlashes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.distribution.v1beta1.ValidatorSlashEvent, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse} returns this
 */
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.prototype.clearSlashesList = function() {
  return this.setSlashesList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse} returns this
*/
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse} returns this
 */
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.distribution.v1beta1.QueryValidatorSlashesResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};

