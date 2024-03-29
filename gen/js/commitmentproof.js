// source: cosmos/ics23/v1/proofs.proto
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

goog.provide('proto.cosmos.ics23.v1.CommitmentProof');
goog.provide('proto.cosmos.ics23.v1.CommitmentProof.ProofCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.ics23.v1.BatchProof');
goog.require('proto.cosmos.ics23.v1.CompressedBatchProof');
goog.require('proto.cosmos.ics23.v1.ExistenceProof');
goog.require('proto.cosmos.ics23.v1.NonExistenceProof');

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
proto.cosmos.ics23.v1.CommitmentProof = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.cosmos.ics23.v1.CommitmentProof.oneofGroups_);
};
goog.inherits(proto.cosmos.ics23.v1.CommitmentProof, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.ics23.v1.CommitmentProof.displayName = 'proto.cosmos.ics23.v1.CommitmentProof';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.cosmos.ics23.v1.CommitmentProof.oneofGroups_ = [[1,2,3,4]];

/**
 * @enum {number}
 */
proto.cosmos.ics23.v1.CommitmentProof.ProofCase = {
  PROOF_NOT_SET: 0,
  EXIST: 1,
  NONEXIST: 2,
  BATCH: 3,
  COMPRESSED: 4
};

/**
 * @return {proto.cosmos.ics23.v1.CommitmentProof.ProofCase}
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.getProofCase = function() {
  return /** @type {proto.cosmos.ics23.v1.CommitmentProof.ProofCase} */(jspb.Message.computeOneofCase(this, proto.cosmos.ics23.v1.CommitmentProof.oneofGroups_[0]));
};



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
proto.cosmos.ics23.v1.CommitmentProof.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.ics23.v1.CommitmentProof.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.ics23.v1.CommitmentProof} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.ics23.v1.CommitmentProof.toObject = function(includeInstance, msg) {
  var f, obj = {
    exist: (f = msg.getExist()) && proto.cosmos.ics23.v1.ExistenceProof.toObject(includeInstance, f),
    nonexist: (f = msg.getNonexist()) && proto.cosmos.ics23.v1.NonExistenceProof.toObject(includeInstance, f),
    batch: (f = msg.getBatch()) && proto.cosmos.ics23.v1.BatchProof.toObject(includeInstance, f),
    compressed: (f = msg.getCompressed()) && proto.cosmos.ics23.v1.CompressedBatchProof.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.ics23.v1.CommitmentProof}
 */
proto.cosmos.ics23.v1.CommitmentProof.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.ics23.v1.CommitmentProof;
  return proto.cosmos.ics23.v1.CommitmentProof.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.ics23.v1.CommitmentProof} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.ics23.v1.CommitmentProof}
 */
proto.cosmos.ics23.v1.CommitmentProof.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.ics23.v1.ExistenceProof;
      reader.readMessage(value,proto.cosmos.ics23.v1.ExistenceProof.deserializeBinaryFromReader);
      msg.setExist(value);
      break;
    case 2:
      var value = new proto.cosmos.ics23.v1.NonExistenceProof;
      reader.readMessage(value,proto.cosmos.ics23.v1.NonExistenceProof.deserializeBinaryFromReader);
      msg.setNonexist(value);
      break;
    case 3:
      var value = new proto.cosmos.ics23.v1.BatchProof;
      reader.readMessage(value,proto.cosmos.ics23.v1.BatchProof.deserializeBinaryFromReader);
      msg.setBatch(value);
      break;
    case 4:
      var value = new proto.cosmos.ics23.v1.CompressedBatchProof;
      reader.readMessage(value,proto.cosmos.ics23.v1.CompressedBatchProof.deserializeBinaryFromReader);
      msg.setCompressed(value);
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
proto.cosmos.ics23.v1.CommitmentProof.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.ics23.v1.CommitmentProof.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.ics23.v1.CommitmentProof} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.ics23.v1.CommitmentProof.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getExist();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.ics23.v1.ExistenceProof.serializeBinaryToWriter
    );
  }
  f = message.getNonexist();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.ics23.v1.NonExistenceProof.serializeBinaryToWriter
    );
  }
  f = message.getBatch();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.ics23.v1.BatchProof.serializeBinaryToWriter
    );
  }
  f = message.getCompressed();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.ics23.v1.CompressedBatchProof.serializeBinaryToWriter
    );
  }
};


/**
 * optional ExistenceProof exist = 1;
 * @return {?proto.cosmos.ics23.v1.ExistenceProof}
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.getExist = function() {
  return /** @type{?proto.cosmos.ics23.v1.ExistenceProof} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.ics23.v1.ExistenceProof, 1));
};


/**
 * @param {?proto.cosmos.ics23.v1.ExistenceProof|undefined} value
 * @return {!proto.cosmos.ics23.v1.CommitmentProof} returns this
*/
proto.cosmos.ics23.v1.CommitmentProof.prototype.setExist = function(value) {
  return jspb.Message.setOneofWrapperField(this, 1, proto.cosmos.ics23.v1.CommitmentProof.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.ics23.v1.CommitmentProof} returns this
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.clearExist = function() {
  return this.setExist(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.hasExist = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional NonExistenceProof nonexist = 2;
 * @return {?proto.cosmos.ics23.v1.NonExistenceProof}
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.getNonexist = function() {
  return /** @type{?proto.cosmos.ics23.v1.NonExistenceProof} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.ics23.v1.NonExistenceProof, 2));
};


/**
 * @param {?proto.cosmos.ics23.v1.NonExistenceProof|undefined} value
 * @return {!proto.cosmos.ics23.v1.CommitmentProof} returns this
*/
proto.cosmos.ics23.v1.CommitmentProof.prototype.setNonexist = function(value) {
  return jspb.Message.setOneofWrapperField(this, 2, proto.cosmos.ics23.v1.CommitmentProof.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.ics23.v1.CommitmentProof} returns this
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.clearNonexist = function() {
  return this.setNonexist(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.hasNonexist = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional BatchProof batch = 3;
 * @return {?proto.cosmos.ics23.v1.BatchProof}
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.getBatch = function() {
  return /** @type{?proto.cosmos.ics23.v1.BatchProof} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.ics23.v1.BatchProof, 3));
};


/**
 * @param {?proto.cosmos.ics23.v1.BatchProof|undefined} value
 * @return {!proto.cosmos.ics23.v1.CommitmentProof} returns this
*/
proto.cosmos.ics23.v1.CommitmentProof.prototype.setBatch = function(value) {
  return jspb.Message.setOneofWrapperField(this, 3, proto.cosmos.ics23.v1.CommitmentProof.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.ics23.v1.CommitmentProof} returns this
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.clearBatch = function() {
  return this.setBatch(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.hasBatch = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional CompressedBatchProof compressed = 4;
 * @return {?proto.cosmos.ics23.v1.CompressedBatchProof}
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.getCompressed = function() {
  return /** @type{?proto.cosmos.ics23.v1.CompressedBatchProof} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.ics23.v1.CompressedBatchProof, 4));
};


/**
 * @param {?proto.cosmos.ics23.v1.CompressedBatchProof|undefined} value
 * @return {!proto.cosmos.ics23.v1.CommitmentProof} returns this
*/
proto.cosmos.ics23.v1.CommitmentProof.prototype.setCompressed = function(value) {
  return jspb.Message.setOneofWrapperField(this, 4, proto.cosmos.ics23.v1.CommitmentProof.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.ics23.v1.CommitmentProof} returns this
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.clearCompressed = function() {
  return this.setCompressed(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.ics23.v1.CommitmentProof.prototype.hasCompressed = function() {
  return jspb.Message.getField(this, 4) != null;
};


