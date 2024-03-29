// source: tendermint/types/types.proto
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

goog.provide('proto.tendermint.types.LightBlock');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tendermint.types.SignedHeader');
goog.require('proto.tendermint.types.ValidatorSet');

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
proto.tendermint.types.LightBlock = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.tendermint.types.LightBlock, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.types.LightBlock.displayName = 'proto.tendermint.types.LightBlock';
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
proto.tendermint.types.LightBlock.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.types.LightBlock.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.types.LightBlock} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.types.LightBlock.toObject = function(includeInstance, msg) {
  var f, obj = {
    signedHeader: (f = msg.getSignedHeader()) && proto.tendermint.types.SignedHeader.toObject(includeInstance, f),
    validatorSet: (f = msg.getValidatorSet()) && proto.tendermint.types.ValidatorSet.toObject(includeInstance, f)
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
 * @return {!proto.tendermint.types.LightBlock}
 */
proto.tendermint.types.LightBlock.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.types.LightBlock;
  return proto.tendermint.types.LightBlock.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.types.LightBlock} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.types.LightBlock}
 */
proto.tendermint.types.LightBlock.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tendermint.types.SignedHeader;
      reader.readMessage(value,proto.tendermint.types.SignedHeader.deserializeBinaryFromReader);
      msg.setSignedHeader(value);
      break;
    case 2:
      var value = new proto.tendermint.types.ValidatorSet;
      reader.readMessage(value,proto.tendermint.types.ValidatorSet.deserializeBinaryFromReader);
      msg.setValidatorSet(value);
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
proto.tendermint.types.LightBlock.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.types.LightBlock.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.types.LightBlock} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.types.LightBlock.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSignedHeader();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.tendermint.types.SignedHeader.serializeBinaryToWriter
    );
  }
  f = message.getValidatorSet();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.tendermint.types.ValidatorSet.serializeBinaryToWriter
    );
  }
};


/**
 * optional SignedHeader signed_header = 1;
 * @return {?proto.tendermint.types.SignedHeader}
 */
proto.tendermint.types.LightBlock.prototype.getSignedHeader = function() {
  return /** @type{?proto.tendermint.types.SignedHeader} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.SignedHeader, 1));
};


/**
 * @param {?proto.tendermint.types.SignedHeader|undefined} value
 * @return {!proto.tendermint.types.LightBlock} returns this
*/
proto.tendermint.types.LightBlock.prototype.setSignedHeader = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.LightBlock} returns this
 */
proto.tendermint.types.LightBlock.prototype.clearSignedHeader = function() {
  return this.setSignedHeader(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.LightBlock.prototype.hasSignedHeader = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional ValidatorSet validator_set = 2;
 * @return {?proto.tendermint.types.ValidatorSet}
 */
proto.tendermint.types.LightBlock.prototype.getValidatorSet = function() {
  return /** @type{?proto.tendermint.types.ValidatorSet} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.ValidatorSet, 2));
};


/**
 * @param {?proto.tendermint.types.ValidatorSet|undefined} value
 * @return {!proto.tendermint.types.LightBlock} returns this
*/
proto.tendermint.types.LightBlock.prototype.setValidatorSet = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.LightBlock} returns this
 */
proto.tendermint.types.LightBlock.prototype.clearValidatorSet = function() {
  return this.setValidatorSet(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.LightBlock.prototype.hasValidatorSet = function() {
  return jspb.Message.getField(this, 2) != null;
};


