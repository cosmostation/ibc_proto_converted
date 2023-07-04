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

goog.provide('proto.comdex.vault.v1beta1.Vault');

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
proto.comdex.vault.v1beta1.Vault = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.vault.v1beta1.Vault, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.vault.v1beta1.Vault.displayName = 'proto.comdex.vault.v1beta1.Vault';
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
proto.comdex.vault.v1beta1.Vault.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.vault.v1beta1.Vault.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.vault.v1beta1.Vault} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.Vault.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    appId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    extendedPairVaultId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    owner: jspb.Message.getFieldWithDefault(msg, 4, ""),
    amountIn: jspb.Message.getFieldWithDefault(msg, 5, ""),
    amountOut: jspb.Message.getFieldWithDefault(msg, 6, ""),
    createdAt: (f = msg.getCreatedAt()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    interestAccumulated: jspb.Message.getFieldWithDefault(msg, 8, ""),
    closingFeeAccumulated: jspb.Message.getFieldWithDefault(msg, 9, ""),
    blockHeight: jspb.Message.getFieldWithDefault(msg, 10, 0),
    blockTime: (f = msg.getBlockTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.comdex.vault.v1beta1.Vault}
 */
proto.comdex.vault.v1beta1.Vault.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.vault.v1beta1.Vault;
  return proto.comdex.vault.v1beta1.Vault.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.vault.v1beta1.Vault} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.vault.v1beta1.Vault}
 */
proto.comdex.vault.v1beta1.Vault.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setExtendedPairVaultId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmountIn(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmountOut(value);
      break;
    case 7:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCreatedAt(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setInterestAccumulated(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setClosingFeeAccumulated(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setBlockHeight(value);
      break;
    case 11:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setBlockTime(value);
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
proto.comdex.vault.v1beta1.Vault.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.vault.v1beta1.Vault.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.vault.v1beta1.Vault} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.vault.v1beta1.Vault.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getExtendedPairVaultId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getAmountIn();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getAmountOut();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getCreatedAt();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getInterestAccumulated();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getClosingFeeAccumulated();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getBlockHeight();
  if (f !== 0) {
    writer.writeInt64(
      10,
      f
    );
  }
  f = message.getBlockTime();
  if (f != null) {
    writer.writeMessage(
      11,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.comdex.vault.v1beta1.Vault.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
 */
proto.comdex.vault.v1beta1.Vault.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 app_id = 2;
 * @return {number}
 */
proto.comdex.vault.v1beta1.Vault.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
 */
proto.comdex.vault.v1beta1.Vault.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 extended_pair_vault_id = 3;
 * @return {number}
 */
proto.comdex.vault.v1beta1.Vault.prototype.getExtendedPairVaultId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
 */
proto.comdex.vault.v1beta1.Vault.prototype.setExtendedPairVaultId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string owner = 4;
 * @return {string}
 */
proto.comdex.vault.v1beta1.Vault.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
 */
proto.comdex.vault.v1beta1.Vault.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string amount_in = 5;
 * @return {string}
 */
proto.comdex.vault.v1beta1.Vault.prototype.getAmountIn = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
 */
proto.comdex.vault.v1beta1.Vault.prototype.setAmountIn = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string amount_out = 6;
 * @return {string}
 */
proto.comdex.vault.v1beta1.Vault.prototype.getAmountOut = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
 */
proto.comdex.vault.v1beta1.Vault.prototype.setAmountOut = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional google.protobuf.Timestamp created_at = 7;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.comdex.vault.v1beta1.Vault.prototype.getCreatedAt = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 7));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
*/
proto.comdex.vault.v1beta1.Vault.prototype.setCreatedAt = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
 */
proto.comdex.vault.v1beta1.Vault.prototype.clearCreatedAt = function() {
  return this.setCreatedAt(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.vault.v1beta1.Vault.prototype.hasCreatedAt = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional string interest_accumulated = 8;
 * @return {string}
 */
proto.comdex.vault.v1beta1.Vault.prototype.getInterestAccumulated = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
 */
proto.comdex.vault.v1beta1.Vault.prototype.setInterestAccumulated = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string closing_fee_accumulated = 9;
 * @return {string}
 */
proto.comdex.vault.v1beta1.Vault.prototype.getClosingFeeAccumulated = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
 */
proto.comdex.vault.v1beta1.Vault.prototype.setClosingFeeAccumulated = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional int64 block_height = 10;
 * @return {number}
 */
proto.comdex.vault.v1beta1.Vault.prototype.getBlockHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
 */
proto.comdex.vault.v1beta1.Vault.prototype.setBlockHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


/**
 * optional google.protobuf.Timestamp block_time = 11;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.comdex.vault.v1beta1.Vault.prototype.getBlockTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 11));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
*/
proto.comdex.vault.v1beta1.Vault.prototype.setBlockTime = function(value) {
  return jspb.Message.setWrapperField(this, 11, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.vault.v1beta1.Vault} returns this
 */
proto.comdex.vault.v1beta1.Vault.prototype.clearBlockTime = function() {
  return this.setBlockTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.vault.v1beta1.Vault.prototype.hasBlockTime = function() {
  return jspb.Message.getField(this, 11) != null;
};

