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

goog.provide('proto.comdex.vault.v1beta1.StableMintVaultRewards');

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
proto.comdex.vault.v1beta1.StableMintVaultRewards = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.vault.v1beta1.StableMintVaultRewards, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.vault.v1beta1.StableMintVaultRewards.displayName = 'proto.comdex.vault.v1beta1.StableMintVaultRewards';
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
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.vault.v1beta1.StableMintVaultRewards.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.vault.v1beta1.StableMintVaultRewards} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.toObject = function(includeInstance, msg) {
  var f, obj = {
    appId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    stableExtendedPairId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    user: jspb.Message.getFieldWithDefault(msg, 3, ""),
    blockHeight: jspb.Message.getFieldWithDefault(msg, 4, 0),
    amount: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.comdex.vault.v1beta1.StableMintVaultRewards}
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.vault.v1beta1.StableMintVaultRewards;
  return proto.comdex.vault.v1beta1.StableMintVaultRewards.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.vault.v1beta1.StableMintVaultRewards} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.vault.v1beta1.StableMintVaultRewards}
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setStableExtendedPairId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setUser(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBlockHeight(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmount(value);
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
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.vault.v1beta1.StableMintVaultRewards.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.vault.v1beta1.StableMintVaultRewards} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getStableExtendedPairId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getUser();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getBlockHeight();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getAmount();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional uint64 app_id = 1;
 * @return {number}
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.StableMintVaultRewards} returns this
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 stable_extended_pair_id = 2;
 * @return {number}
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.getStableExtendedPairId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.StableMintVaultRewards} returns this
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.setStableExtendedPairId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string user = 3;
 * @return {string}
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.getUser = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.vault.v1beta1.StableMintVaultRewards} returns this
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.setUser = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint64 block_height = 4;
 * @return {number}
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.getBlockHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.StableMintVaultRewards} returns this
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.setBlockHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional string amount = 5;
 * @return {string}
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.getAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.vault.v1beta1.StableMintVaultRewards} returns this
 */
proto.comdex.vault.v1beta1.StableMintVaultRewards.prototype.setAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};

