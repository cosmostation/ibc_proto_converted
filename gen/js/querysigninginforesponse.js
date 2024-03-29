// source: cosmos/slashing/v1beta1/query.proto
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

goog.provide('proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.slashing.v1beta1.ValidatorSigningInfo');

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
proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.displayName = 'proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse';
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
proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    valSigningInfo: (f = msg.getValSigningInfo()) && proto.cosmos.slashing.v1beta1.ValidatorSigningInfo.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse}
 */
proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse;
  return proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse}
 */
proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.slashing.v1beta1.ValidatorSigningInfo;
      reader.readMessage(value,proto.cosmos.slashing.v1beta1.ValidatorSigningInfo.deserializeBinaryFromReader);
      msg.setValSigningInfo(value);
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
proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getValSigningInfo();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.slashing.v1beta1.ValidatorSigningInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional ValidatorSigningInfo val_signing_info = 1;
 * @return {?proto.cosmos.slashing.v1beta1.ValidatorSigningInfo}
 */
proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.prototype.getValSigningInfo = function() {
  return /** @type{?proto.cosmos.slashing.v1beta1.ValidatorSigningInfo} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.slashing.v1beta1.ValidatorSigningInfo, 1));
};


/**
 * @param {?proto.cosmos.slashing.v1beta1.ValidatorSigningInfo|undefined} value
 * @return {!proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse} returns this
*/
proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.prototype.setValSigningInfo = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse} returns this
 */
proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.prototype.clearValSigningInfo = function() {
  return this.setValSigningInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.slashing.v1beta1.QuerySigningInfoResponse.prototype.hasValSigningInfo = function() {
  return jspb.Message.getField(this, 1) != null;
};


