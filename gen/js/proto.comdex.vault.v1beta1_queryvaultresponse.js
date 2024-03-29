// source: comdex/vault/v1beta1/query.proto
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

goog.provide('proto.comdex.vault.v1beta1.QueryVaultResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.vault.v1beta1.Vault');

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
proto.comdex.vault.v1beta1.QueryVaultResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.vault.v1beta1.QueryVaultResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.vault.v1beta1.QueryVaultResponse.displayName = 'proto.comdex.vault.v1beta1.QueryVaultResponse';
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
proto.comdex.vault.v1beta1.QueryVaultResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.vault.v1beta1.QueryVaultResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.vault.v1beta1.QueryVaultResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.QueryVaultResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    vault: (f = msg.getVault()) && proto.comdex.vault.v1beta1.Vault.toObject(includeInstance, f)
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
 * @return {!proto.comdex.vault.v1beta1.QueryVaultResponse}
 */
proto.comdex.vault.v1beta1.QueryVaultResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.vault.v1beta1.QueryVaultResponse;
  return proto.comdex.vault.v1beta1.QueryVaultResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.vault.v1beta1.QueryVaultResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.vault.v1beta1.QueryVaultResponse}
 */
proto.comdex.vault.v1beta1.QueryVaultResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.comdex.vault.v1beta1.Vault;
      reader.readMessage(value,proto.comdex.vault.v1beta1.Vault.deserializeBinaryFromReader);
      msg.setVault(value);
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
proto.comdex.vault.v1beta1.QueryVaultResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.vault.v1beta1.QueryVaultResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.vault.v1beta1.QueryVaultResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.QueryVaultResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getVault();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.comdex.vault.v1beta1.Vault.serializeBinaryToWriter
    );
  }
};


/**
 * optional Vault vault = 1;
 * @return {?proto.comdex.vault.v1beta1.Vault}
 */
proto.comdex.vault.v1beta1.QueryVaultResponse.prototype.getVault = function() {
  return /** @type{?proto.comdex.vault.v1beta1.Vault} */ (
    jspb.Message.getWrapperField(this, proto.comdex.vault.v1beta1.Vault, 1));
};


/**
 * @param {?proto.comdex.vault.v1beta1.Vault|undefined} value
 * @return {!proto.comdex.vault.v1beta1.QueryVaultResponse} returns this
*/
proto.comdex.vault.v1beta1.QueryVaultResponse.prototype.setVault = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.vault.v1beta1.QueryVaultResponse} returns this
 */
proto.comdex.vault.v1beta1.QueryVaultResponse.prototype.clearVault = function() {
  return this.setVault(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.vault.v1beta1.QueryVaultResponse.prototype.hasVault = function() {
  return jspb.Message.getField(this, 1) != null;
};


