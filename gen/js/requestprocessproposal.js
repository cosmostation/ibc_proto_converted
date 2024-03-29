// source: tendermint/abci/types.proto
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

goog.provide('proto.tendermint.abci.RequestProcessProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');
goog.require('proto.tendermint.abci.CommitInfo');
goog.require('proto.tendermint.abci.Misbehavior');

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
proto.tendermint.abci.RequestProcessProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.tendermint.abci.RequestProcessProposal.repeatedFields_, null);
};
goog.inherits(proto.tendermint.abci.RequestProcessProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.abci.RequestProcessProposal.displayName = 'proto.tendermint.abci.RequestProcessProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.tendermint.abci.RequestProcessProposal.repeatedFields_ = [1,3];



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
proto.tendermint.abci.RequestProcessProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.abci.RequestProcessProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.abci.RequestProcessProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.RequestProcessProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    txsList: msg.getTxsList_asB64(),
    proposedLastCommit: (f = msg.getProposedLastCommit()) && proto.tendermint.abci.CommitInfo.toObject(includeInstance, f),
    misbehaviorList: jspb.Message.toObjectList(msg.getMisbehaviorList(),
    proto.tendermint.abci.Misbehavior.toObject, includeInstance),
    hash: msg.getHash_asB64(),
    height: jspb.Message.getFieldWithDefault(msg, 5, 0),
    time: (f = msg.getTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    nextValidatorsHash: msg.getNextValidatorsHash_asB64(),
    proposerAddress: msg.getProposerAddress_asB64()
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
 * @return {!proto.tendermint.abci.RequestProcessProposal}
 */
proto.tendermint.abci.RequestProcessProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.abci.RequestProcessProposal;
  return proto.tendermint.abci.RequestProcessProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.abci.RequestProcessProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.abci.RequestProcessProposal}
 */
proto.tendermint.abci.RequestProcessProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addTxs(value);
      break;
    case 2:
      var value = new proto.tendermint.abci.CommitInfo;
      reader.readMessage(value,proto.tendermint.abci.CommitInfo.deserializeBinaryFromReader);
      msg.setProposedLastCommit(value);
      break;
    case 3:
      var value = new proto.tendermint.abci.Misbehavior;
      reader.readMessage(value,proto.tendermint.abci.Misbehavior.deserializeBinaryFromReader);
      msg.addMisbehavior(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setHash(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setHeight(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setTime(value);
      break;
    case 7:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setNextValidatorsHash(value);
      break;
    case 8:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setProposerAddress(value);
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
proto.tendermint.abci.RequestProcessProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.abci.RequestProcessProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.abci.RequestProcessProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.RequestProcessProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTxsList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      1,
      f
    );
  }
  f = message.getProposedLastCommit();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.tendermint.abci.CommitInfo.serializeBinaryToWriter
    );
  }
  f = message.getMisbehaviorList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.tendermint.abci.Misbehavior.serializeBinaryToWriter
    );
  }
  f = message.getHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getHeight();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getTime();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getNextValidatorsHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      7,
      f
    );
  }
  f = message.getProposerAddress_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      8,
      f
    );
  }
};


/**
 * repeated bytes txs = 1;
 * @return {!Array<string>}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getTxsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * repeated bytes txs = 1;
 * This is a type-conversion wrapper around `getTxsList()`
 * @return {!Array<string>}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getTxsList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getTxsList()));
};


/**
 * repeated bytes txs = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getTxsList()`
 * @return {!Array<!Uint8Array>}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getTxsList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getTxsList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
 */
proto.tendermint.abci.RequestProcessProposal.prototype.setTxsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
 */
proto.tendermint.abci.RequestProcessProposal.prototype.addTxs = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
 */
proto.tendermint.abci.RequestProcessProposal.prototype.clearTxsList = function() {
  return this.setTxsList([]);
};


/**
 * optional CommitInfo proposed_last_commit = 2;
 * @return {?proto.tendermint.abci.CommitInfo}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getProposedLastCommit = function() {
  return /** @type{?proto.tendermint.abci.CommitInfo} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.CommitInfo, 2));
};


/**
 * @param {?proto.tendermint.abci.CommitInfo|undefined} value
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
*/
proto.tendermint.abci.RequestProcessProposal.prototype.setProposedLastCommit = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
 */
proto.tendermint.abci.RequestProcessProposal.prototype.clearProposedLastCommit = function() {
  return this.setProposedLastCommit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.hasProposedLastCommit = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated Misbehavior misbehavior = 3;
 * @return {!Array<!proto.tendermint.abci.Misbehavior>}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getMisbehaviorList = function() {
  return /** @type{!Array<!proto.tendermint.abci.Misbehavior>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.tendermint.abci.Misbehavior, 3));
};


/**
 * @param {!Array<!proto.tendermint.abci.Misbehavior>} value
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
*/
proto.tendermint.abci.RequestProcessProposal.prototype.setMisbehaviorList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.tendermint.abci.Misbehavior=} opt_value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.Misbehavior}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.addMisbehavior = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.tendermint.abci.Misbehavior, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
 */
proto.tendermint.abci.RequestProcessProposal.prototype.clearMisbehaviorList = function() {
  return this.setMisbehaviorList([]);
};


/**
 * optional bytes hash = 4;
 * @return {string}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes hash = 4;
 * This is a type-conversion wrapper around `getHash()`
 * @return {string}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getHash()));
};


/**
 * optional bytes hash = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getHash()`
 * @return {!Uint8Array}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
 */
proto.tendermint.abci.RequestProcessProposal.prototype.setHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional int64 height = 5;
 * @return {number}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
 */
proto.tendermint.abci.RequestProcessProposal.prototype.setHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional google.protobuf.Timestamp time = 6;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 6));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
*/
proto.tendermint.abci.RequestProcessProposal.prototype.setTime = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
 */
proto.tendermint.abci.RequestProcessProposal.prototype.clearTime = function() {
  return this.setTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.hasTime = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional bytes next_validators_hash = 7;
 * @return {string}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getNextValidatorsHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * optional bytes next_validators_hash = 7;
 * This is a type-conversion wrapper around `getNextValidatorsHash()`
 * @return {string}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getNextValidatorsHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getNextValidatorsHash()));
};


/**
 * optional bytes next_validators_hash = 7;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getNextValidatorsHash()`
 * @return {!Uint8Array}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getNextValidatorsHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getNextValidatorsHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
 */
proto.tendermint.abci.RequestProcessProposal.prototype.setNextValidatorsHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 7, value);
};


/**
 * optional bytes proposer_address = 8;
 * @return {string}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getProposerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * optional bytes proposer_address = 8;
 * This is a type-conversion wrapper around `getProposerAddress()`
 * @return {string}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getProposerAddress_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getProposerAddress()));
};


/**
 * optional bytes proposer_address = 8;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getProposerAddress()`
 * @return {!Uint8Array}
 */
proto.tendermint.abci.RequestProcessProposal.prototype.getProposerAddress_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getProposerAddress()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.tendermint.abci.RequestProcessProposal} returns this
 */
proto.tendermint.abci.RequestProcessProposal.prototype.setProposerAddress = function(value) {
  return jspb.Message.setProto3BytesField(this, 8, value);
};


