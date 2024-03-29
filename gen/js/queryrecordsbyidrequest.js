// source: likechain/iscn/query.proto
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

goog.provide('proto.likechain.iscn.QueryRecordsByIdRequest');

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
proto.likechain.iscn.QueryRecordsByIdRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.likechain.iscn.QueryRecordsByIdRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.iscn.QueryRecordsByIdRequest.displayName = 'proto.likechain.iscn.QueryRecordsByIdRequest';
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
proto.likechain.iscn.QueryRecordsByIdRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.iscn.QueryRecordsByIdRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.iscn.QueryRecordsByIdRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.iscn.QueryRecordsByIdRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    iscnId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    fromVersion: jspb.Message.getFieldWithDefault(msg, 2, 0),
    toVersion: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.likechain.iscn.QueryRecordsByIdRequest}
 */
proto.likechain.iscn.QueryRecordsByIdRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.iscn.QueryRecordsByIdRequest;
  return proto.likechain.iscn.QueryRecordsByIdRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.iscn.QueryRecordsByIdRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.iscn.QueryRecordsByIdRequest}
 */
proto.likechain.iscn.QueryRecordsByIdRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setIscnId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setFromVersion(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setToVersion(value);
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
proto.likechain.iscn.QueryRecordsByIdRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.iscn.QueryRecordsByIdRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.iscn.QueryRecordsByIdRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.iscn.QueryRecordsByIdRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIscnId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getFromVersion();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getToVersion();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
};


/**
 * optional string iscn_id = 1;
 * @return {string}
 */
proto.likechain.iscn.QueryRecordsByIdRequest.prototype.getIscnId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.iscn.QueryRecordsByIdRequest} returns this
 */
proto.likechain.iscn.QueryRecordsByIdRequest.prototype.setIscnId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 from_version = 2;
 * @return {number}
 */
proto.likechain.iscn.QueryRecordsByIdRequest.prototype.getFromVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.likechain.iscn.QueryRecordsByIdRequest} returns this
 */
proto.likechain.iscn.QueryRecordsByIdRequest.prototype.setFromVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 to_version = 3;
 * @return {number}
 */
proto.likechain.iscn.QueryRecordsByIdRequest.prototype.getToVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.likechain.iscn.QueryRecordsByIdRequest} returns this
 */
proto.likechain.iscn.QueryRecordsByIdRequest.prototype.setToVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


