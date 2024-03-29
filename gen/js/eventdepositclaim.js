// source: injective/peggy/v1/events.proto
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

goog.provide('proto.injective.peggy.v1.EventDepositClaim');

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
proto.injective.peggy.v1.EventDepositClaim = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.peggy.v1.EventDepositClaim, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.peggy.v1.EventDepositClaim.displayName = 'proto.injective.peggy.v1.EventDepositClaim';
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
proto.injective.peggy.v1.EventDepositClaim.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.peggy.v1.EventDepositClaim.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.peggy.v1.EventDepositClaim} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.EventDepositClaim.toObject = function(includeInstance, msg) {
  var f, obj = {
    eventNonce: jspb.Message.getFieldWithDefault(msg, 1, 0),
    eventHeight: jspb.Message.getFieldWithDefault(msg, 2, 0),
    attestationId: msg.getAttestationId_asB64(),
    ethereumSender: jspb.Message.getFieldWithDefault(msg, 4, ""),
    cosmosReceiver: jspb.Message.getFieldWithDefault(msg, 5, ""),
    tokenContract: jspb.Message.getFieldWithDefault(msg, 6, ""),
    amount: jspb.Message.getFieldWithDefault(msg, 7, ""),
    orchestratorAddress: jspb.Message.getFieldWithDefault(msg, 8, ""),
    data: jspb.Message.getFieldWithDefault(msg, 9, "")
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
 * @return {!proto.injective.peggy.v1.EventDepositClaim}
 */
proto.injective.peggy.v1.EventDepositClaim.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.peggy.v1.EventDepositClaim;
  return proto.injective.peggy.v1.EventDepositClaim.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.peggy.v1.EventDepositClaim} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.peggy.v1.EventDepositClaim}
 */
proto.injective.peggy.v1.EventDepositClaim.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setEventNonce(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setEventHeight(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setAttestationId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setEthereumSender(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setCosmosReceiver(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setTokenContract(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmount(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setOrchestratorAddress(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setData(value);
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
proto.injective.peggy.v1.EventDepositClaim.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.peggy.v1.EventDepositClaim.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.peggy.v1.EventDepositClaim} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.EventDepositClaim.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEventNonce();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getEventHeight();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getAttestationId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getEthereumSender();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getCosmosReceiver();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getTokenContract();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getAmount();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getOrchestratorAddress();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getData();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
};


/**
 * optional uint64 event_nonce = 1;
 * @return {number}
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.getEventNonce = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.EventDepositClaim} returns this
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.setEventNonce = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 event_height = 2;
 * @return {number}
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.getEventHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.EventDepositClaim} returns this
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.setEventHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional bytes attestation_id = 3;
 * @return {string}
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.getAttestationId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes attestation_id = 3;
 * This is a type-conversion wrapper around `getAttestationId()`
 * @return {string}
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.getAttestationId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getAttestationId()));
};


/**
 * optional bytes attestation_id = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getAttestationId()`
 * @return {!Uint8Array}
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.getAttestationId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getAttestationId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.peggy.v1.EventDepositClaim} returns this
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.setAttestationId = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional string ethereum_sender = 4;
 * @return {string}
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.getEthereumSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.EventDepositClaim} returns this
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.setEthereumSender = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string cosmos_receiver = 5;
 * @return {string}
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.getCosmosReceiver = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.EventDepositClaim} returns this
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.setCosmosReceiver = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string token_contract = 6;
 * @return {string}
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.getTokenContract = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.EventDepositClaim} returns this
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.setTokenContract = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string amount = 7;
 * @return {string}
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.getAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.EventDepositClaim} returns this
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.setAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string orchestrator_address = 8;
 * @return {string}
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.getOrchestratorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.EventDepositClaim} returns this
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.setOrchestratorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string data = 9;
 * @return {string}
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.getData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.EventDepositClaim} returns this
 */
proto.injective.peggy.v1.EventDepositClaim.prototype.setData = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


