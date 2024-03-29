// source: ibc/lightclients/tendermint/v1/tendermint.proto
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

goog.provide('proto.ibc.lightclients.tendermint.v1.Header');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ibc.core.client.v1.Height');
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
proto.ibc.lightclients.tendermint.v1.Header = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.lightclients.tendermint.v1.Header, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.lightclients.tendermint.v1.Header.displayName = 'proto.ibc.lightclients.tendermint.v1.Header';
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
proto.ibc.lightclients.tendermint.v1.Header.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.lightclients.tendermint.v1.Header.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.lightclients.tendermint.v1.Header} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.lightclients.tendermint.v1.Header.toObject = function(includeInstance, msg) {
  var f, obj = {
    signedHeader: (f = msg.getSignedHeader()) && proto.tendermint.types.SignedHeader.toObject(includeInstance, f),
    validatorSet: (f = msg.getValidatorSet()) && proto.tendermint.types.ValidatorSet.toObject(includeInstance, f),
    trustedHeight: (f = msg.getTrustedHeight()) && proto.ibc.core.client.v1.Height.toObject(includeInstance, f),
    trustedValidators: (f = msg.getTrustedValidators()) && proto.tendermint.types.ValidatorSet.toObject(includeInstance, f)
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
 * @return {!proto.ibc.lightclients.tendermint.v1.Header}
 */
proto.ibc.lightclients.tendermint.v1.Header.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.lightclients.tendermint.v1.Header;
  return proto.ibc.lightclients.tendermint.v1.Header.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.lightclients.tendermint.v1.Header} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.lightclients.tendermint.v1.Header}
 */
proto.ibc.lightclients.tendermint.v1.Header.deserializeBinaryFromReader = function(msg, reader) {
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
    case 3:
      var value = new proto.ibc.core.client.v1.Height;
      reader.readMessage(value,proto.ibc.core.client.v1.Height.deserializeBinaryFromReader);
      msg.setTrustedHeight(value);
      break;
    case 4:
      var value = new proto.tendermint.types.ValidatorSet;
      reader.readMessage(value,proto.tendermint.types.ValidatorSet.deserializeBinaryFromReader);
      msg.setTrustedValidators(value);
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
proto.ibc.lightclients.tendermint.v1.Header.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.lightclients.tendermint.v1.Header.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.lightclients.tendermint.v1.Header} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.lightclients.tendermint.v1.Header.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getTrustedHeight();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.ibc.core.client.v1.Height.serializeBinaryToWriter
    );
  }
  f = message.getTrustedValidators();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.tendermint.types.ValidatorSet.serializeBinaryToWriter
    );
  }
};


/**
 * optional tendermint.types.SignedHeader signed_header = 1;
 * @return {?proto.tendermint.types.SignedHeader}
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.getSignedHeader = function() {
  return /** @type{?proto.tendermint.types.SignedHeader} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.SignedHeader, 1));
};


/**
 * @param {?proto.tendermint.types.SignedHeader|undefined} value
 * @return {!proto.ibc.lightclients.tendermint.v1.Header} returns this
*/
proto.ibc.lightclients.tendermint.v1.Header.prototype.setSignedHeader = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.lightclients.tendermint.v1.Header} returns this
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.clearSignedHeader = function() {
  return this.setSignedHeader(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.hasSignedHeader = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional tendermint.types.ValidatorSet validator_set = 2;
 * @return {?proto.tendermint.types.ValidatorSet}
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.getValidatorSet = function() {
  return /** @type{?proto.tendermint.types.ValidatorSet} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.ValidatorSet, 2));
};


/**
 * @param {?proto.tendermint.types.ValidatorSet|undefined} value
 * @return {!proto.ibc.lightclients.tendermint.v1.Header} returns this
*/
proto.ibc.lightclients.tendermint.v1.Header.prototype.setValidatorSet = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.lightclients.tendermint.v1.Header} returns this
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.clearValidatorSet = function() {
  return this.setValidatorSet(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.hasValidatorSet = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional ibc.core.client.v1.Height trusted_height = 3;
 * @return {?proto.ibc.core.client.v1.Height}
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.getTrustedHeight = function() {
  return /** @type{?proto.ibc.core.client.v1.Height} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.client.v1.Height, 3));
};


/**
 * @param {?proto.ibc.core.client.v1.Height|undefined} value
 * @return {!proto.ibc.lightclients.tendermint.v1.Header} returns this
*/
proto.ibc.lightclients.tendermint.v1.Header.prototype.setTrustedHeight = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.lightclients.tendermint.v1.Header} returns this
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.clearTrustedHeight = function() {
  return this.setTrustedHeight(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.hasTrustedHeight = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional tendermint.types.ValidatorSet trusted_validators = 4;
 * @return {?proto.tendermint.types.ValidatorSet}
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.getTrustedValidators = function() {
  return /** @type{?proto.tendermint.types.ValidatorSet} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.ValidatorSet, 4));
};


/**
 * @param {?proto.tendermint.types.ValidatorSet|undefined} value
 * @return {!proto.ibc.lightclients.tendermint.v1.Header} returns this
*/
proto.ibc.lightclients.tendermint.v1.Header.prototype.setTrustedValidators = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.lightclients.tendermint.v1.Header} returns this
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.clearTrustedValidators = function() {
  return this.setTrustedValidators(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.lightclients.tendermint.v1.Header.prototype.hasTrustedValidators = function() {
  return jspb.Message.getField(this, 4) != null;
};


