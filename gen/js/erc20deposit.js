// source: axelar/evm/v1beta1/types.proto
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

goog.provide('proto.axelar.evm.v1beta1.ERC20Deposit');

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
proto.axelar.evm.v1beta1.ERC20Deposit = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.evm.v1beta1.ERC20Deposit, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.ERC20Deposit.displayName = 'proto.axelar.evm.v1beta1.ERC20Deposit';
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
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.ERC20Deposit.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.ERC20Deposit} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.ERC20Deposit.toObject = function(includeInstance, msg) {
  var f, obj = {
    txId: msg.getTxId_asB64(),
    amount: msg.getAmount_asB64(),
    asset: jspb.Message.getFieldWithDefault(msg, 3, ""),
    destinationChain: jspb.Message.getFieldWithDefault(msg, 4, ""),
    burnerAddress: msg.getBurnerAddress_asB64(),
    logIndex: jspb.Message.getFieldWithDefault(msg, 6, 0)
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
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.ERC20Deposit;
  return proto.axelar.evm.v1beta1.ERC20Deposit.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.ERC20Deposit} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setTxId(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAmount(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAsset(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDestinationChain(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setBurnerAddress(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLogIndex(value);
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
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.ERC20Deposit.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.ERC20Deposit} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.ERC20Deposit.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTxId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getAmount_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getAsset();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getDestinationChain();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getBurnerAddress_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
  f = message.getLogIndex();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
};


/**
 * optional bytes tx_id = 1;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getTxId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes tx_id = 1;
 * This is a type-conversion wrapper around `getTxId()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getTxId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getTxId()));
};


/**
 * optional bytes tx_id = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getTxId()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getTxId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getTxId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit} returns this
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.setTxId = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes amount = 2;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes amount = 2;
 * This is a type-conversion wrapper around `getAmount()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getAmount_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAmount()));
};


/**
 * optional bytes amount = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAmount()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getAmount_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAmount()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit} returns this
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.setAmount = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional string asset = 3;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getAsset = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit} returns this
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.setAsset = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string destination_chain = 4;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getDestinationChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit} returns this
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.setDestinationChain = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional bytes burner_address = 5;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getBurnerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes burner_address = 5;
 * This is a type-conversion wrapper around `getBurnerAddress()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getBurnerAddress_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getBurnerAddress()));
};


/**
 * optional bytes burner_address = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getBurnerAddress()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getBurnerAddress_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getBurnerAddress()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit} returns this
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.setBurnerAddress = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


/**
 * optional uint64 log_index = 6;
 * @return {number}
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.getLogIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit} returns this
 */
proto.axelar.evm.v1beta1.ERC20Deposit.prototype.setLogIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


