// source: ibc/core/commitment/v1/commitment.proto
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

goog.provide('proto.ibc.core.commitment.v1.MerkleProof');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.ics23.v1.CommitmentProof');

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
proto.ibc.core.commitment.v1.MerkleProof = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ibc.core.commitment.v1.MerkleProof.repeatedFields_, null);
};
goog.inherits(proto.ibc.core.commitment.v1.MerkleProof, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.core.commitment.v1.MerkleProof.displayName = 'proto.ibc.core.commitment.v1.MerkleProof';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ibc.core.commitment.v1.MerkleProof.repeatedFields_ = [1];



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
proto.ibc.core.commitment.v1.MerkleProof.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.core.commitment.v1.MerkleProof.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.core.commitment.v1.MerkleProof} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.commitment.v1.MerkleProof.toObject = function(includeInstance, msg) {
  var f, obj = {
    proofsList: jspb.Message.toObjectList(msg.getProofsList(),
    proto.cosmos.ics23.v1.CommitmentProof.toObject, includeInstance)
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
 * @return {!proto.ibc.core.commitment.v1.MerkleProof}
 */
proto.ibc.core.commitment.v1.MerkleProof.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.core.commitment.v1.MerkleProof;
  return proto.ibc.core.commitment.v1.MerkleProof.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.core.commitment.v1.MerkleProof} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.core.commitment.v1.MerkleProof}
 */
proto.ibc.core.commitment.v1.MerkleProof.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.ics23.v1.CommitmentProof;
      reader.readMessage(value,proto.cosmos.ics23.v1.CommitmentProof.deserializeBinaryFromReader);
      msg.addProofs(value);
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
proto.ibc.core.commitment.v1.MerkleProof.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.core.commitment.v1.MerkleProof.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.core.commitment.v1.MerkleProof} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.commitment.v1.MerkleProof.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProofsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.ics23.v1.CommitmentProof.serializeBinaryToWriter
    );
  }
};


/**
 * repeated cosmos.ics23.v1.CommitmentProof proofs = 1;
 * @return {!Array<!proto.cosmos.ics23.v1.CommitmentProof>}
 */
proto.ibc.core.commitment.v1.MerkleProof.prototype.getProofsList = function() {
  return /** @type{!Array<!proto.cosmos.ics23.v1.CommitmentProof>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.ics23.v1.CommitmentProof, 1));
};


/**
 * @param {!Array<!proto.cosmos.ics23.v1.CommitmentProof>} value
 * @return {!proto.ibc.core.commitment.v1.MerkleProof} returns this
*/
proto.ibc.core.commitment.v1.MerkleProof.prototype.setProofsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.ics23.v1.CommitmentProof=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.ics23.v1.CommitmentProof}
 */
proto.ibc.core.commitment.v1.MerkleProof.prototype.addProofs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.ics23.v1.CommitmentProof, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ibc.core.commitment.v1.MerkleProof} returns this
 */
proto.ibc.core.commitment.v1.MerkleProof.prototype.clearProofsList = function() {
  return this.setProofsList([]);
};


