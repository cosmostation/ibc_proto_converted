// source: axelar/evm/v1beta1/tx.proto
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

goog.provide('proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest');

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
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.repeatedFields_, null);
};
goog.inherits(proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.displayName = 'proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.repeatedFields_ = [3];



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
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: msg.getSender_asB64(),
    chain: jspb.Message.getFieldWithDefault(msg, 2, ""),
    txIdsList: msg.getTxIdsList_asB64()
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
 * @return {!proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest}
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest;
  return proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest}
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSender(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setChain(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addTxIds(value);
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
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getChain();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTxIdsList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      3,
      f
    );
  }
};


/**
 * optional bytes sender = 1;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes sender = 1;
 * This is a type-conversion wrapper around `getSender()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.getSender_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSender()));
};


/**
 * optional bytes sender = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSender()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.getSender_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSender()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest} returns this
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.setSender = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional string chain = 2;
 * @return {string}
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.getChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest} returns this
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.setChain = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated bytes tx_ids = 3;
 * @return {!Array<string>}
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.getTxIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * repeated bytes tx_ids = 3;
 * This is a type-conversion wrapper around `getTxIdsList()`
 * @return {!Array<string>}
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.getTxIdsList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getTxIdsList()));
};


/**
 * repeated bytes tx_ids = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getTxIdsList()`
 * @return {!Array<!Uint8Array>}
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.getTxIdsList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getTxIdsList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest} returns this
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.setTxIdsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest} returns this
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.addTxIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest} returns this
 */
proto.axelar.evm.v1beta1.ConfirmGatewayTxsRequest.prototype.clearTxIdsList = function() {
  return this.setTxIdsList([]);
};


