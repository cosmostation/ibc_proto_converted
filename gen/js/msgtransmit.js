// source: injective/ocr/v1beta1/tx.proto
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

goog.provide('proto.injective.ocr.v1beta1.MsgTransmit');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.ocr.v1beta1.Report');

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
proto.injective.ocr.v1beta1.MsgTransmit = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.ocr.v1beta1.MsgTransmit.repeatedFields_, null);
};
goog.inherits(proto.injective.ocr.v1beta1.MsgTransmit, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.ocr.v1beta1.MsgTransmit.displayName = 'proto.injective.ocr.v1beta1.MsgTransmit';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.ocr.v1beta1.MsgTransmit.repeatedFields_ = [8];



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
proto.injective.ocr.v1beta1.MsgTransmit.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.ocr.v1beta1.MsgTransmit.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.ocr.v1beta1.MsgTransmit} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.MsgTransmit.toObject = function(includeInstance, msg) {
  var f, obj = {
    transmitter: jspb.Message.getFieldWithDefault(msg, 1, ""),
    configDigest: msg.getConfigDigest_asB64(),
    feedId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    epoch: jspb.Message.getFieldWithDefault(msg, 4, 0),
    round: jspb.Message.getFieldWithDefault(msg, 5, 0),
    extraHash: msg.getExtraHash_asB64(),
    report: (f = msg.getReport()) && proto.injective.ocr.v1beta1.Report.toObject(includeInstance, f),
    signaturesList: msg.getSignaturesList_asB64()
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
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit}
 */
proto.injective.ocr.v1beta1.MsgTransmit.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.ocr.v1beta1.MsgTransmit;
  return proto.injective.ocr.v1beta1.MsgTransmit.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.ocr.v1beta1.MsgTransmit} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit}
 */
proto.injective.ocr.v1beta1.MsgTransmit.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransmitter(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setConfigDigest(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeedId(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setEpoch(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRound(value);
      break;
    case 6:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setExtraHash(value);
      break;
    case 7:
      var value = new proto.injective.ocr.v1beta1.Report;
      reader.readMessage(value,proto.injective.ocr.v1beta1.Report.deserializeBinaryFromReader);
      msg.setReport(value);
      break;
    case 8:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addSignatures(value);
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
proto.injective.ocr.v1beta1.MsgTransmit.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.ocr.v1beta1.MsgTransmit.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.ocr.v1beta1.MsgTransmit} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.MsgTransmit.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTransmitter();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getConfigDigest_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getFeedId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getEpoch();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getRound();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getExtraHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      6,
      f
    );
  }
  f = message.getReport();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.injective.ocr.v1beta1.Report.serializeBinaryToWriter
    );
  }
  f = message.getSignaturesList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      8,
      f
    );
  }
};


/**
 * optional string transmitter = 1;
 * @return {string}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getTransmitter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit} returns this
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.setTransmitter = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bytes config_digest = 2;
 * @return {string}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getConfigDigest = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes config_digest = 2;
 * This is a type-conversion wrapper around `getConfigDigest()`
 * @return {string}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getConfigDigest_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getConfigDigest()));
};


/**
 * optional bytes config_digest = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getConfigDigest()`
 * @return {!Uint8Array}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getConfigDigest_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getConfigDigest()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit} returns this
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.setConfigDigest = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional string feed_id = 3;
 * @return {string}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getFeedId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit} returns this
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.setFeedId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint64 epoch = 4;
 * @return {number}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getEpoch = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit} returns this
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.setEpoch = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 round = 5;
 * @return {number}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getRound = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit} returns this
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.setRound = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional bytes extra_hash = 6;
 * @return {string}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getExtraHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * optional bytes extra_hash = 6;
 * This is a type-conversion wrapper around `getExtraHash()`
 * @return {string}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getExtraHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getExtraHash()));
};


/**
 * optional bytes extra_hash = 6;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getExtraHash()`
 * @return {!Uint8Array}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getExtraHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getExtraHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit} returns this
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.setExtraHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 6, value);
};


/**
 * optional Report report = 7;
 * @return {?proto.injective.ocr.v1beta1.Report}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getReport = function() {
  return /** @type{?proto.injective.ocr.v1beta1.Report} */ (
    jspb.Message.getWrapperField(this, proto.injective.ocr.v1beta1.Report, 7));
};


/**
 * @param {?proto.injective.ocr.v1beta1.Report|undefined} value
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit} returns this
*/
proto.injective.ocr.v1beta1.MsgTransmit.prototype.setReport = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit} returns this
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.clearReport = function() {
  return this.setReport(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.hasReport = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * repeated bytes signatures = 8;
 * @return {!Array<string>}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getSignaturesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 8));
};


/**
 * repeated bytes signatures = 8;
 * This is a type-conversion wrapper around `getSignaturesList()`
 * @return {!Array<string>}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getSignaturesList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getSignaturesList()));
};


/**
 * repeated bytes signatures = 8;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSignaturesList()`
 * @return {!Array<!Uint8Array>}
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.getSignaturesList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getSignaturesList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit} returns this
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.setSignaturesList = function(value) {
  return jspb.Message.setField(this, 8, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit} returns this
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.addSignatures = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 8, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.ocr.v1beta1.MsgTransmit} returns this
 */
proto.injective.ocr.v1beta1.MsgTransmit.prototype.clearSignaturesList = function() {
  return this.setSignaturesList([]);
};

