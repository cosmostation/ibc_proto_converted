// source: iov/escrow/v1beta1/query.proto
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

goog.provide('proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.displayName = 'proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest';
}



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
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    seller: jspb.Message.getFieldWithDefault(msg, 1, ""),
    state: jspb.Message.getFieldWithDefault(msg, 2, ""),
    objectKey: jspb.Message.getFieldWithDefault(msg, 3, ""),
    paginationStart: jspb.Message.getFieldWithDefault(msg, 4, 0),
    paginationLength: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest}
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest;
  return proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest}
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSeller(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setState(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setObjectKey(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPaginationStart(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPaginationLength(value);
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
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSeller();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getState();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getObjectKey();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPaginationStart();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getPaginationLength();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
};


/**
 * optional string seller = 1;
 * @return {string}
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.getSeller = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest} returns this
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.setSeller = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string state = 2;
 * @return {string}
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.getState = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest} returns this
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.setState = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string object_key = 3;
 * @return {string}
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.getObjectKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest} returns this
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.setObjectKey = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint64 pagination_start = 4;
 * @return {number}
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.getPaginationStart = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest} returns this
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.setPaginationStart = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 pagination_length = 5;
 * @return {number}
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.getPaginationLength = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest} returns this
 */
proto.starnamed.x.escrow.v1beta1.QueryEscrowsRequest.prototype.setPaginationLength = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


