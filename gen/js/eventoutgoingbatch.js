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

goog.provide('proto.injective.peggy.v1.EventOutgoingBatch');

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
proto.injective.peggy.v1.EventOutgoingBatch = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.peggy.v1.EventOutgoingBatch.repeatedFields_, null);
};
goog.inherits(proto.injective.peggy.v1.EventOutgoingBatch, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.peggy.v1.EventOutgoingBatch.displayName = 'proto.injective.peggy.v1.EventOutgoingBatch';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.peggy.v1.EventOutgoingBatch.repeatedFields_ = [5];



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
proto.injective.peggy.v1.EventOutgoingBatch.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.peggy.v1.EventOutgoingBatch.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.peggy.v1.EventOutgoingBatch} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.EventOutgoingBatch.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    orchestratorAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
    batchNonce: jspb.Message.getFieldWithDefault(msg, 3, 0),
    batchTimeout: jspb.Message.getFieldWithDefault(msg, 4, 0),
    batchTxIdsList: (f = jspb.Message.getRepeatedField(msg, 5)) == null ? undefined : f
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
 * @return {!proto.injective.peggy.v1.EventOutgoingBatch}
 */
proto.injective.peggy.v1.EventOutgoingBatch.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.peggy.v1.EventOutgoingBatch;
  return proto.injective.peggy.v1.EventOutgoingBatch.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.peggy.v1.EventOutgoingBatch} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.peggy.v1.EventOutgoingBatch}
 */
proto.injective.peggy.v1.EventOutgoingBatch.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setOrchestratorAddress(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBatchNonce(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBatchTimeout(value);
      break;
    case 5:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint64() : [reader.readUint64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addBatchTxIds(values[i]);
      }
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
proto.injective.peggy.v1.EventOutgoingBatch.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.peggy.v1.EventOutgoingBatch.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.peggy.v1.EventOutgoingBatch} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.EventOutgoingBatch.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getOrchestratorAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getBatchNonce();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getBatchTimeout();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getBatchTxIdsList();
  if (f.length > 0) {
    writer.writePackedUint64(
      5,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.EventOutgoingBatch} returns this
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string orchestrator_address = 2;
 * @return {string}
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.getOrchestratorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.peggy.v1.EventOutgoingBatch} returns this
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.setOrchestratorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 batch_nonce = 3;
 * @return {number}
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.getBatchNonce = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.EventOutgoingBatch} returns this
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.setBatchNonce = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 batch_timeout = 4;
 * @return {number}
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.getBatchTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.EventOutgoingBatch} returns this
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.setBatchTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * repeated uint64 batch_tx_ids = 5;
 * @return {!Array<number>}
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.getBatchTxIdsList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 5));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.injective.peggy.v1.EventOutgoingBatch} returns this
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.setBatchTxIdsList = function(value) {
  return jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.injective.peggy.v1.EventOutgoingBatch} returns this
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.addBatchTxIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.peggy.v1.EventOutgoingBatch} returns this
 */
proto.injective.peggy.v1.EventOutgoingBatch.prototype.clearBatchTxIdsList = function() {
  return this.setBatchTxIdsList([]);
};


