// source: band/oracle/v1/oracle.proto
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

goog.provide('proto.oracle.v1.RequestVerification');

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
proto.oracle.v1.RequestVerification = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.oracle.v1.RequestVerification, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.oracle.v1.RequestVerification.displayName = 'proto.oracle.v1.RequestVerification';
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
proto.oracle.v1.RequestVerification.prototype.toObject = function(opt_includeInstance) {
  return proto.oracle.v1.RequestVerification.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.oracle.v1.RequestVerification} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.oracle.v1.RequestVerification.toObject = function(includeInstance, msg) {
  var f, obj = {
    chainId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    validator: jspb.Message.getFieldWithDefault(msg, 2, ""),
    requestId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    externalId: jspb.Message.getFieldWithDefault(msg, 4, 0),
    dataSourceId: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.oracle.v1.RequestVerification}
 */
proto.oracle.v1.RequestVerification.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.oracle.v1.RequestVerification;
  return proto.oracle.v1.RequestVerification.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.oracle.v1.RequestVerification} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.oracle.v1.RequestVerification}
 */
proto.oracle.v1.RequestVerification.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setChainId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setValidator(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRequestId(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setExternalId(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDataSourceId(value);
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
proto.oracle.v1.RequestVerification.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.oracle.v1.RequestVerification.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.oracle.v1.RequestVerification} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.oracle.v1.RequestVerification.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChainId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getValidator();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getRequestId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getExternalId();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getDataSourceId();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
};


/**
 * optional string chain_id = 1;
 * @return {string}
 */
proto.oracle.v1.RequestVerification.prototype.getChainId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.oracle.v1.RequestVerification} returns this
 */
proto.oracle.v1.RequestVerification.prototype.setChainId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string validator = 2;
 * @return {string}
 */
proto.oracle.v1.RequestVerification.prototype.getValidator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.oracle.v1.RequestVerification} returns this
 */
proto.oracle.v1.RequestVerification.prototype.setValidator = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 request_id = 3;
 * @return {number}
 */
proto.oracle.v1.RequestVerification.prototype.getRequestId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.oracle.v1.RequestVerification} returns this
 */
proto.oracle.v1.RequestVerification.prototype.setRequestId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 external_id = 4;
 * @return {number}
 */
proto.oracle.v1.RequestVerification.prototype.getExternalId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.oracle.v1.RequestVerification} returns this
 */
proto.oracle.v1.RequestVerification.prototype.setExternalId = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 data_source_id = 5;
 * @return {number}
 */
proto.oracle.v1.RequestVerification.prototype.getDataSourceId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.oracle.v1.RequestVerification} returns this
 */
proto.oracle.v1.RequestVerification.prototype.setDataSourceId = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


