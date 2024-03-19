// source: dymension/rollapp/query.proto
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

goog.provide('proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest');

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
proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.displayName = 'proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest';
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
proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    rollappid: jspb.Message.getFieldWithDefault(msg, 1, ""),
    finalized: jspb.Message.getBooleanFieldWithDefault(msg, 2, false)
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
 * @return {!proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest}
 */
proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest;
  return proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest}
 */
proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRollappid(value);
      break;
    case 2:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setFinalized(value);
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
proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRollappid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getFinalized();
  if (f) {
    writer.writeBool(
      2,
      f
    );
  }
};


/**
 * optional string rollappId = 1;
 * @return {string}
 */
proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.prototype.getRollappid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest} returns this
 */
proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.prototype.setRollappid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bool finalized = 2;
 * @return {boolean}
 */
proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.prototype.getFinalized = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 2, false));
};


/**
 * @param {boolean} value
 * @return {!proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest} returns this
 */
proto.dymensionxyz.dymension.rollapp.QueryGetLatestStateIndexRequest.prototype.setFinalized = function(value) {
  return jspb.Message.setProto3BooleanField(this, 2, value);
};

