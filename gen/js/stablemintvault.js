// source: comdex/vault/v1beta1/vault.proto
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

goog.provide('proto.comdex.vault.v1beta1.StableMintVault');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');

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
proto.comdex.vault.v1beta1.StableMintVault = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.vault.v1beta1.StableMintVault, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.vault.v1beta1.StableMintVault.displayName = 'proto.comdex.vault.v1beta1.StableMintVault';
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
proto.comdex.vault.v1beta1.StableMintVault.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.vault.v1beta1.StableMintVault.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.vault.v1beta1.StableMintVault} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.StableMintVault.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    amountIn: jspb.Message.getFieldWithDefault(msg, 2, ""),
    amountOut: jspb.Message.getFieldWithDefault(msg, 3, ""),
    appId: jspb.Message.getFieldWithDefault(msg, 4, 0),
    extendedPairVaultId: jspb.Message.getFieldWithDefault(msg, 5, 0),
    createdAt: (f = msg.getCreatedAt()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.comdex.vault.v1beta1.StableMintVault}
 */
proto.comdex.vault.v1beta1.StableMintVault.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.vault.v1beta1.StableMintVault;
  return proto.comdex.vault.v1beta1.StableMintVault.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.vault.v1beta1.StableMintVault} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.vault.v1beta1.StableMintVault}
 */
proto.comdex.vault.v1beta1.StableMintVault.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmountIn(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmountOut(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setExtendedPairVaultId(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCreatedAt(value);
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
proto.comdex.vault.v1beta1.StableMintVault.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.vault.v1beta1.StableMintVault.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.vault.v1beta1.StableMintVault} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.StableMintVault.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAmountIn();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAmountOut();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getExtendedPairVaultId();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getCreatedAt();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.StableMintVault} returns this
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string amount_in = 2;
 * @return {string}
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.getAmountIn = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.vault.v1beta1.StableMintVault} returns this
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.setAmountIn = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string amount_out = 3;
 * @return {string}
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.getAmountOut = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.vault.v1beta1.StableMintVault} returns this
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.setAmountOut = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint64 app_id = 4;
 * @return {number}
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.StableMintVault} returns this
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 extended_pair_vault_id = 5;
 * @return {number}
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.getExtendedPairVaultId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.StableMintVault} returns this
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.setExtendedPairVaultId = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional google.protobuf.Timestamp created_at = 6;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.getCreatedAt = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 6));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.comdex.vault.v1beta1.StableMintVault} returns this
*/
proto.comdex.vault.v1beta1.StableMintVault.prototype.setCreatedAt = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.vault.v1beta1.StableMintVault} returns this
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.clearCreatedAt = function() {
  return this.setCreatedAt(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.vault.v1beta1.StableMintVault.prototype.hasCreatedAt = function() {
  return jspb.Message.getField(this, 6) != null;
};


