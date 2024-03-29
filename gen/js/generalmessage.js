// source: axelar/nexus/exported/v1beta1/types.proto
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

goog.provide('proto.axelar.nexus.exported.v1beta1.GeneralMessage');
goog.provide('proto.axelar.nexus.exported.v1beta1.GeneralMessage.Status');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.nexus.exported.v1beta1.CrossChainAddress');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.axelar.nexus.exported.v1beta1.GeneralMessage = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.nexus.exported.v1beta1.GeneralMessage, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.nexus.exported.v1beta1.GeneralMessage.displayName = 'proto.axelar.nexus.exported.v1beta1.GeneralMessage';
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
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.nexus.exported.v1beta1.GeneralMessage.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    sender: (f = msg.getSender()) && proto.axelar.nexus.exported.v1beta1.CrossChainAddress.toObject(includeInstance, f),
    recipient: (f = msg.getRecipient()) && proto.axelar.nexus.exported.v1beta1.CrossChainAddress.toObject(includeInstance, f),
    payloadHash: msg.getPayloadHash_asB64(),
    status: jspb.Message.getFieldWithDefault(msg, 5, 0),
    asset: (f = msg.getAsset()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    sourceTxId: msg.getSourceTxId_asB64(),
    sourceTxIndex: jspb.Message.getFieldWithDefault(msg, 8, 0)
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
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.nexus.exported.v1beta1.GeneralMessage;
  return proto.axelar.nexus.exported.v1beta1.GeneralMessage.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = new proto.axelar.nexus.exported.v1beta1.CrossChainAddress;
      reader.readMessage(value,proto.axelar.nexus.exported.v1beta1.CrossChainAddress.deserializeBinaryFromReader);
      msg.setSender(value);
      break;
    case 3:
      var value = new proto.axelar.nexus.exported.v1beta1.CrossChainAddress;
      reader.readMessage(value,proto.axelar.nexus.exported.v1beta1.CrossChainAddress.deserializeBinaryFromReader);
      msg.setRecipient(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setPayloadHash(value);
      break;
    case 5:
      var value = /** @type {!proto.axelar.nexus.exported.v1beta1.GeneralMessage.Status} */ (reader.readEnum());
      msg.setStatus(value);
      break;
    case 6:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAsset(value);
      break;
    case 7:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSourceTxId(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSourceTxIndex(value);
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
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.nexus.exported.v1beta1.GeneralMessage.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSender();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.axelar.nexus.exported.v1beta1.CrossChainAddress.serializeBinaryToWriter
    );
  }
  f = message.getRecipient();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.axelar.nexus.exported.v1beta1.CrossChainAddress.serializeBinaryToWriter
    );
  }
  f = message.getPayloadHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      5,
      f
    );
  }
  f = message.getAsset();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getSourceTxId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      7,
      f
    );
  }
  f = message.getSourceTxIndex();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
};


/**
 * @enum {number}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.Status = {
  STATUS_UNSPECIFIED: 0,
  STATUS_APPROVED: 1,
  STATUS_PROCESSING: 2,
  STATUS_EXECUTED: 3,
  STATUS_FAILED: 4
};

/**
 * optional string id = 1;
 * @return {string}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} returns this
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional CrossChainAddress sender = 2;
 * @return {?proto.axelar.nexus.exported.v1beta1.CrossChainAddress}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getSender = function() {
  return /** @type{?proto.axelar.nexus.exported.v1beta1.CrossChainAddress} */ (
    jspb.Message.getWrapperField(this, proto.axelar.nexus.exported.v1beta1.CrossChainAddress, 2));
};


/**
 * @param {?proto.axelar.nexus.exported.v1beta1.CrossChainAddress|undefined} value
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} returns this
*/
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.setSender = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} returns this
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.clearSender = function() {
  return this.setSender(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.hasSender = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional CrossChainAddress recipient = 3;
 * @return {?proto.axelar.nexus.exported.v1beta1.CrossChainAddress}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getRecipient = function() {
  return /** @type{?proto.axelar.nexus.exported.v1beta1.CrossChainAddress} */ (
    jspb.Message.getWrapperField(this, proto.axelar.nexus.exported.v1beta1.CrossChainAddress, 3));
};


/**
 * @param {?proto.axelar.nexus.exported.v1beta1.CrossChainAddress|undefined} value
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} returns this
*/
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.setRecipient = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} returns this
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.clearRecipient = function() {
  return this.setRecipient(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.hasRecipient = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional bytes payload_hash = 4;
 * @return {string}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getPayloadHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes payload_hash = 4;
 * This is a type-conversion wrapper around `getPayloadHash()`
 * @return {string}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getPayloadHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getPayloadHash()));
};


/**
 * optional bytes payload_hash = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getPayloadHash()`
 * @return {!Uint8Array}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getPayloadHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getPayloadHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} returns this
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.setPayloadHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional Status status = 5;
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage.Status}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getStatus = function() {
  return /** @type {!proto.axelar.nexus.exported.v1beta1.GeneralMessage.Status} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {!proto.axelar.nexus.exported.v1beta1.GeneralMessage.Status} value
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} returns this
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.setStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 5, value);
};


/**
 * optional cosmos.base.v1beta1.Coin asset = 6;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getAsset = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 6));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} returns this
*/
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.setAsset = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} returns this
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.clearAsset = function() {
  return this.setAsset(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.hasAsset = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional bytes source_tx_id = 7;
 * @return {string}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getSourceTxId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * optional bytes source_tx_id = 7;
 * This is a type-conversion wrapper around `getSourceTxId()`
 * @return {string}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getSourceTxId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSourceTxId()));
};


/**
 * optional bytes source_tx_id = 7;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSourceTxId()`
 * @return {!Uint8Array}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getSourceTxId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSourceTxId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} returns this
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.setSourceTxId = function(value) {
  return jspb.Message.setProto3BytesField(this, 7, value);
};


/**
 * optional uint64 source_tx_index = 8;
 * @return {number}
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.getSourceTxIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.nexus.exported.v1beta1.GeneralMessage} returns this
 */
proto.axelar.nexus.exported.v1beta1.GeneralMessage.prototype.setSourceTxIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


