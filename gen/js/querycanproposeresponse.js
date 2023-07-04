// source: kyve/query/v1beta1/bundles.proto
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

goog.provide('proto.kyve.query.v1beta1.QueryCanProposeResponse');

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
proto.kyve.query.v1beta1.QueryCanProposeResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.query.v1beta1.QueryCanProposeResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.query.v1beta1.QueryCanProposeResponse.displayName = 'proto.kyve.query.v1beta1.QueryCanProposeResponse';
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
proto.kyve.query.v1beta1.QueryCanProposeResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.query.v1beta1.QueryCanProposeResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.query.v1beta1.QueryCanProposeResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.query.v1beta1.QueryCanProposeResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    possible: jspb.Message.getBooleanFieldWithDefault(msg, 1, false),
    reason: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.kyve.query.v1beta1.QueryCanProposeResponse}
 */
proto.kyve.query.v1beta1.QueryCanProposeResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.query.v1beta1.QueryCanProposeResponse;
  return proto.kyve.query.v1beta1.QueryCanProposeResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.query.v1beta1.QueryCanProposeResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.query.v1beta1.QueryCanProposeResponse}
 */
proto.kyve.query.v1beta1.QueryCanProposeResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setPossible(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setReason(value);
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
proto.kyve.query.v1beta1.QueryCanProposeResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.query.v1beta1.QueryCanProposeResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.query.v1beta1.QueryCanProposeResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.query.v1beta1.QueryCanProposeResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPossible();
  if (f) {
    writer.writeBool(
      1,
      f
    );
  }
  f = message.getReason();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional bool possible = 1;
 * @return {boolean}
 */
proto.kyve.query.v1beta1.QueryCanProposeResponse.prototype.getPossible = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 1, false));
};


/**
 * @param {boolean} value
 * @return {!proto.kyve.query.v1beta1.QueryCanProposeResponse} returns this
 */
proto.kyve.query.v1beta1.QueryCanProposeResponse.prototype.setPossible = function(value) {
  return jspb.Message.setProto3BooleanField(this, 1, value);
};


/**
 * optional string reason = 2;
 * @return {string}
 */
proto.kyve.query.v1beta1.QueryCanProposeResponse.prototype.getReason = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.query.v1beta1.QueryCanProposeResponse} returns this
 */
proto.kyve.query.v1beta1.QueryCanProposeResponse.prototype.setReason = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};

