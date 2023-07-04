// source: panacea/did/v2/query.proto
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

goog.provide('proto.panacea.did.v2.QueryDIDResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.panacea.did.v2.DIDDocumentWithSeq');

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
proto.panacea.did.v2.QueryDIDResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.panacea.did.v2.QueryDIDResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.did.v2.QueryDIDResponse.displayName = 'proto.panacea.did.v2.QueryDIDResponse';
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
proto.panacea.did.v2.QueryDIDResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.did.v2.QueryDIDResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.did.v2.QueryDIDResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.did.v2.QueryDIDResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    didDocumentWithSeq: (f = msg.getDidDocumentWithSeq()) && proto.panacea.did.v2.DIDDocumentWithSeq.toObject(includeInstance, f)
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
 * @return {!proto.panacea.did.v2.QueryDIDResponse}
 */
proto.panacea.did.v2.QueryDIDResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.did.v2.QueryDIDResponse;
  return proto.panacea.did.v2.QueryDIDResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.did.v2.QueryDIDResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.did.v2.QueryDIDResponse}
 */
proto.panacea.did.v2.QueryDIDResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.panacea.did.v2.DIDDocumentWithSeq;
      reader.readMessage(value,proto.panacea.did.v2.DIDDocumentWithSeq.deserializeBinaryFromReader);
      msg.setDidDocumentWithSeq(value);
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
proto.panacea.did.v2.QueryDIDResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.did.v2.QueryDIDResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.did.v2.QueryDIDResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.did.v2.QueryDIDResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDidDocumentWithSeq();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.panacea.did.v2.DIDDocumentWithSeq.serializeBinaryToWriter
    );
  }
};


/**
 * optional DIDDocumentWithSeq did_document_with_seq = 1;
 * @return {?proto.panacea.did.v2.DIDDocumentWithSeq}
 */
proto.panacea.did.v2.QueryDIDResponse.prototype.getDidDocumentWithSeq = function() {
  return /** @type{?proto.panacea.did.v2.DIDDocumentWithSeq} */ (
    jspb.Message.getWrapperField(this, proto.panacea.did.v2.DIDDocumentWithSeq, 1));
};


/**
 * @param {?proto.panacea.did.v2.DIDDocumentWithSeq|undefined} value
 * @return {!proto.panacea.did.v2.QueryDIDResponse} returns this
*/
proto.panacea.did.v2.QueryDIDResponse.prototype.setDidDocumentWithSeq = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.panacea.did.v2.QueryDIDResponse} returns this
 */
proto.panacea.did.v2.QueryDIDResponse.prototype.clearDidDocumentWithSeq = function() {
  return this.setDidDocumentWithSeq(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.panacea.did.v2.QueryDIDResponse.prototype.hasDidDocumentWithSeq = function() {
  return jspb.Message.getField(this, 1) != null;
};

