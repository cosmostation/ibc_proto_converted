// source: stride/stakeibc/query.proto
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

goog.provide('proto.stride.stakeibc.QueryGetNextPacketSequenceResponse');

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
proto.stride.stakeibc.QueryGetNextPacketSequenceResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stride.stakeibc.QueryGetNextPacketSequenceResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.displayName = 'proto.stride.stakeibc.QueryGetNextPacketSequenceResponse';
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
proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.stakeibc.QueryGetNextPacketSequenceResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    sequence: jspb.Message.getFieldWithDefault(msg, 1, 0)
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
 * @return {!proto.stride.stakeibc.QueryGetNextPacketSequenceResponse}
 */
proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.stakeibc.QueryGetNextPacketSequenceResponse;
  return proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.stakeibc.QueryGetNextPacketSequenceResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.stakeibc.QueryGetNextPacketSequenceResponse}
 */
proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSequence(value);
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
proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.stakeibc.QueryGetNextPacketSequenceResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSequence();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
};


/**
 * optional uint64 sequence = 1;
 * @return {number}
 */
proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.prototype.getSequence = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.stride.stakeibc.QueryGetNextPacketSequenceResponse} returns this
 */
proto.stride.stakeibc.QueryGetNextPacketSequenceResponse.prototype.setSequence = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};

