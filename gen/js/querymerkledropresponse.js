// source: bitsong/merkledrop/v1beta1/query.proto
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

goog.provide('proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.bitsong.merkledrop.v1beta1.Merkledrop');

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
proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.displayName = 'proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse';
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
proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    merkledrop: (f = msg.getMerkledrop()) && proto.bitsong.merkledrop.v1beta1.Merkledrop.toObject(includeInstance, f)
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
 * @return {!proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse}
 */
proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse;
  return proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse}
 */
proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.bitsong.merkledrop.v1beta1.Merkledrop;
      reader.readMessage(value,proto.bitsong.merkledrop.v1beta1.Merkledrop.deserializeBinaryFromReader);
      msg.setMerkledrop(value);
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
proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMerkledrop();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.bitsong.merkledrop.v1beta1.Merkledrop.serializeBinaryToWriter
    );
  }
};


/**
 * optional Merkledrop merkledrop = 1;
 * @return {?proto.bitsong.merkledrop.v1beta1.Merkledrop}
 */
proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.prototype.getMerkledrop = function() {
  return /** @type{?proto.bitsong.merkledrop.v1beta1.Merkledrop} */ (
    jspb.Message.getWrapperField(this, proto.bitsong.merkledrop.v1beta1.Merkledrop, 1));
};


/**
 * @param {?proto.bitsong.merkledrop.v1beta1.Merkledrop|undefined} value
 * @return {!proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse} returns this
*/
proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.prototype.setMerkledrop = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse} returns this
 */
proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.prototype.clearMerkledrop = function() {
  return this.setMerkledrop(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.bitsong.merkledrop.v1beta1.QueryMerkledropResponse.prototype.hasMerkledrop = function() {
  return jspb.Message.getField(this, 1) != null;
};

