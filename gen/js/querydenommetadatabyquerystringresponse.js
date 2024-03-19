// source: cosmos/bank/v1beta1/query.proto
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

goog.provide('proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.bank.v1beta1.Metadata');

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
proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.displayName = 'proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse';
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
proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    metadata: (f = msg.getMetadata()) && proto.cosmos.bank.v1beta1.Metadata.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse}
 */
proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse;
  return proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse}
 */
proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.bank.v1beta1.Metadata;
      reader.readMessage(value,proto.cosmos.bank.v1beta1.Metadata.deserializeBinaryFromReader);
      msg.setMetadata(value);
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
proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMetadata();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.bank.v1beta1.Metadata.serializeBinaryToWriter
    );
  }
};


/**
 * optional Metadata metadata = 1;
 * @return {?proto.cosmos.bank.v1beta1.Metadata}
 */
proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.prototype.getMetadata = function() {
  return /** @type{?proto.cosmos.bank.v1beta1.Metadata} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.bank.v1beta1.Metadata, 1));
};


/**
 * @param {?proto.cosmos.bank.v1beta1.Metadata|undefined} value
 * @return {!proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse} returns this
*/
proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.prototype.setMetadata = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse} returns this
 */
proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.prototype.clearMetadata = function() {
  return this.setMetadata(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.bank.v1beta1.QueryDenomMetadataByQueryStringResponse.prototype.hasMetadata = function() {
  return jspb.Message.getField(this, 1) != null;
};

