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

goog.provide('proto.ibc.core.client.v1.QueryConsensusStateRequest');

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
proto.ibc.core.client.v1.QueryConsensusStateRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.core.client.v1.QueryConsensusStateRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.core.client.v1.QueryConsensusStateRequest.displayName = 'proto.ibc.core.client.v1.QueryConsensusStateRequest';
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
proto.ibc.core.client.v1.QueryConsensusStateRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.core.client.v1.QueryConsensusStateRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.core.client.v1.QueryConsensusStateRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    clientId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    revisionNumber: jspb.Message.getFieldWithDefault(msg, 2, 0),
    revisionHeight: jspb.Message.getFieldWithDefault(msg, 3, 0),
    latestHeight: jspb.Message.getBooleanFieldWithDefault(msg, 4, false)
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
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateRequest}
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.core.client.v1.QueryConsensusStateRequest;
  return proto.ibc.core.client.v1.QueryConsensusStateRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.core.client.v1.QueryConsensusStateRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateRequest}
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setClientId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRevisionNumber(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRevisionHeight(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setLatestHeight(value);
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
proto.ibc.core.client.v1.QueryConsensusStateRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.core.client.v1.QueryConsensusStateRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.core.client.v1.QueryConsensusStateRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClientId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getRevisionNumber();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getRevisionHeight();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getLatestHeight();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
};


/**
 * optional string client_id = 1;
 * @return {string}
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.prototype.getClientId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateRequest} returns this
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.prototype.setClientId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 revision_number = 2;
 * @return {number}
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.prototype.getRevisionNumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateRequest} returns this
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.prototype.setRevisionNumber = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 revision_height = 3;
 * @return {number}
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.prototype.getRevisionHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateRequest} returns this
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.prototype.setRevisionHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional bool latest_height = 4;
 * @return {boolean}
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.prototype.getLatestHeight = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ibc.core.client.v1.QueryConsensusStateRequest} returns this
 */
proto.ibc.core.client.v1.QueryConsensusStateRequest.prototype.setLatestHeight = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};


