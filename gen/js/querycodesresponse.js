// source: secret/compute/v1beta1/query.proto
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

goog.provide('proto.secret.compute.v1beta1.QueryCodesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.secret.compute.v1beta1.CodeInfoResponse');

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
proto.secret.compute.v1beta1.QueryCodesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.secret.compute.v1beta1.QueryCodesResponse.repeatedFields_, null);
};
goog.inherits(proto.secret.compute.v1beta1.QueryCodesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.secret.compute.v1beta1.QueryCodesResponse.displayName = 'proto.secret.compute.v1beta1.QueryCodesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.secret.compute.v1beta1.QueryCodesResponse.repeatedFields_ = [1];



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
proto.secret.compute.v1beta1.QueryCodesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.secret.compute.v1beta1.QueryCodesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.secret.compute.v1beta1.QueryCodesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.QueryCodesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    codeInfosList: jspb.Message.toObjectList(msg.getCodeInfosList(),
    proto.secret.compute.v1beta1.CodeInfoResponse.toObject, includeInstance)
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
 * @return {!proto.secret.compute.v1beta1.QueryCodesResponse}
 */
proto.secret.compute.v1beta1.QueryCodesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.secret.compute.v1beta1.QueryCodesResponse;
  return proto.secret.compute.v1beta1.QueryCodesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.secret.compute.v1beta1.QueryCodesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.secret.compute.v1beta1.QueryCodesResponse}
 */
proto.secret.compute.v1beta1.QueryCodesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.secret.compute.v1beta1.CodeInfoResponse;
      reader.readMessage(value,proto.secret.compute.v1beta1.CodeInfoResponse.deserializeBinaryFromReader);
      msg.addCodeInfos(value);
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
proto.secret.compute.v1beta1.QueryCodesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.secret.compute.v1beta1.QueryCodesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.secret.compute.v1beta1.QueryCodesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.QueryCodesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCodeInfosList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.secret.compute.v1beta1.CodeInfoResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated CodeInfoResponse code_infos = 1;
 * @return {!Array<!proto.secret.compute.v1beta1.CodeInfoResponse>}
 */
proto.secret.compute.v1beta1.QueryCodesResponse.prototype.getCodeInfosList = function() {
  return /** @type{!Array<!proto.secret.compute.v1beta1.CodeInfoResponse>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.secret.compute.v1beta1.CodeInfoResponse, 1));
};


/**
 * @param {!Array<!proto.secret.compute.v1beta1.CodeInfoResponse>} value
 * @return {!proto.secret.compute.v1beta1.QueryCodesResponse} returns this
*/
proto.secret.compute.v1beta1.QueryCodesResponse.prototype.setCodeInfosList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.secret.compute.v1beta1.CodeInfoResponse=} opt_value
 * @param {number=} opt_index
 * @return {!proto.secret.compute.v1beta1.CodeInfoResponse}
 */
proto.secret.compute.v1beta1.QueryCodesResponse.prototype.addCodeInfos = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.secret.compute.v1beta1.CodeInfoResponse, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.secret.compute.v1beta1.QueryCodesResponse} returns this
 */
proto.secret.compute.v1beta1.QueryCodesResponse.prototype.clearCodeInfosList = function() {
  return this.setCodeInfosList([]);
};


