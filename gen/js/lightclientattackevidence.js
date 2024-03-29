// source: tendermint/types/evidence.proto
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

goog.provide('proto.tendermint.types.LightClientAttackEvidence');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');
goog.require('proto.tendermint.types.LightBlock');
goog.require('proto.tendermint.types.Validator');

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
proto.tendermint.types.LightClientAttackEvidence = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.tendermint.types.LightClientAttackEvidence.repeatedFields_, null);
};
goog.inherits(proto.tendermint.types.LightClientAttackEvidence, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.types.LightClientAttackEvidence.displayName = 'proto.tendermint.types.LightClientAttackEvidence';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.tendermint.types.LightClientAttackEvidence.repeatedFields_ = [3];



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
proto.tendermint.types.LightClientAttackEvidence.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.types.LightClientAttackEvidence.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.types.LightClientAttackEvidence} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.types.LightClientAttackEvidence.toObject = function(includeInstance, msg) {
  var f, obj = {
    conflictingBlock: (f = msg.getConflictingBlock()) && proto.tendermint.types.LightBlock.toObject(includeInstance, f),
    commonHeight: jspb.Message.getFieldWithDefault(msg, 2, 0),
    byzantineValidatorsList: jspb.Message.toObjectList(msg.getByzantineValidatorsList(),
    proto.tendermint.types.Validator.toObject, includeInstance),
    totalVotingPower: jspb.Message.getFieldWithDefault(msg, 4, 0),
    timestamp: (f = msg.getTimestamp()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.tendermint.types.LightClientAttackEvidence}
 */
proto.tendermint.types.LightClientAttackEvidence.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.types.LightClientAttackEvidence;
  return proto.tendermint.types.LightClientAttackEvidence.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.types.LightClientAttackEvidence} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.types.LightClientAttackEvidence}
 */
proto.tendermint.types.LightClientAttackEvidence.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tendermint.types.LightBlock;
      reader.readMessage(value,proto.tendermint.types.LightBlock.deserializeBinaryFromReader);
      msg.setConflictingBlock(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setCommonHeight(value);
      break;
    case 3:
      var value = new proto.tendermint.types.Validator;
      reader.readMessage(value,proto.tendermint.types.Validator.deserializeBinaryFromReader);
      msg.addByzantineValidators(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setTotalVotingPower(value);
      break;
    case 5:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setTimestamp(value);
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
proto.tendermint.types.LightClientAttackEvidence.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.types.LightClientAttackEvidence.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.types.LightClientAttackEvidence} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.types.LightClientAttackEvidence.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConflictingBlock();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.tendermint.types.LightBlock.serializeBinaryToWriter
    );
  }
  f = message.getCommonHeight();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
  f = message.getByzantineValidatorsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.tendermint.types.Validator.serializeBinaryToWriter
    );
  }
  f = message.getTotalVotingPower();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
  f = message.getTimestamp();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional LightBlock conflicting_block = 1;
 * @return {?proto.tendermint.types.LightBlock}
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.getConflictingBlock = function() {
  return /** @type{?proto.tendermint.types.LightBlock} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.LightBlock, 1));
};


/**
 * @param {?proto.tendermint.types.LightBlock|undefined} value
 * @return {!proto.tendermint.types.LightClientAttackEvidence} returns this
*/
proto.tendermint.types.LightClientAttackEvidence.prototype.setConflictingBlock = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.LightClientAttackEvidence} returns this
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.clearConflictingBlock = function() {
  return this.setConflictingBlock(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.hasConflictingBlock = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional int64 common_height = 2;
 * @return {number}
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.getCommonHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.tendermint.types.LightClientAttackEvidence} returns this
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.setCommonHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * repeated Validator byzantine_validators = 3;
 * @return {!Array<!proto.tendermint.types.Validator>}
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.getByzantineValidatorsList = function() {
  return /** @type{!Array<!proto.tendermint.types.Validator>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.tendermint.types.Validator, 3));
};


/**
 * @param {!Array<!proto.tendermint.types.Validator>} value
 * @return {!proto.tendermint.types.LightClientAttackEvidence} returns this
*/
proto.tendermint.types.LightClientAttackEvidence.prototype.setByzantineValidatorsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.tendermint.types.Validator=} opt_value
 * @param {number=} opt_index
 * @return {!proto.tendermint.types.Validator}
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.addByzantineValidators = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.tendermint.types.Validator, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tendermint.types.LightClientAttackEvidence} returns this
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.clearByzantineValidatorsList = function() {
  return this.setByzantineValidatorsList([]);
};


/**
 * optional int64 total_voting_power = 4;
 * @return {number}
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.getTotalVotingPower = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.tendermint.types.LightClientAttackEvidence} returns this
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.setTotalVotingPower = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional google.protobuf.Timestamp timestamp = 5;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.getTimestamp = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 5));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.tendermint.types.LightClientAttackEvidence} returns this
*/
proto.tendermint.types.LightClientAttackEvidence.prototype.setTimestamp = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.LightClientAttackEvidence} returns this
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.clearTimestamp = function() {
  return this.setTimestamp(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.LightClientAttackEvidence.prototype.hasTimestamp = function() {
  return jspb.Message.getField(this, 5) != null;
};


