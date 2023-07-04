// source: tendermint/types/params.proto
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

goog.provide('proto.tendermint.types.ConsensusParams');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tendermint.types.ABCIParams');
goog.require('proto.tendermint.types.BlockParams');
goog.require('proto.tendermint.types.EvidenceParams');
goog.require('proto.tendermint.types.ValidatorParams');
goog.require('proto.tendermint.types.VersionParams');

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
proto.tendermint.types.ConsensusParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.tendermint.types.ConsensusParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.types.ConsensusParams.displayName = 'proto.tendermint.types.ConsensusParams';
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
proto.tendermint.types.ConsensusParams.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.types.ConsensusParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.types.ConsensusParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.types.ConsensusParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    block: (f = msg.getBlock()) && proto.tendermint.types.BlockParams.toObject(includeInstance, f),
    evidence: (f = msg.getEvidence()) && proto.tendermint.types.EvidenceParams.toObject(includeInstance, f),
    validator: (f = msg.getValidator()) && proto.tendermint.types.ValidatorParams.toObject(includeInstance, f),
    version: (f = msg.getVersion()) && proto.tendermint.types.VersionParams.toObject(includeInstance, f),
    abci: (f = msg.getAbci()) && proto.tendermint.types.ABCIParams.toObject(includeInstance, f)
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
 * @return {!proto.tendermint.types.ConsensusParams}
 */
proto.tendermint.types.ConsensusParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.types.ConsensusParams;
  return proto.tendermint.types.ConsensusParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.types.ConsensusParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.types.ConsensusParams}
 */
proto.tendermint.types.ConsensusParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tendermint.types.BlockParams;
      reader.readMessage(value,proto.tendermint.types.BlockParams.deserializeBinaryFromReader);
      msg.setBlock(value);
      break;
    case 2:
      var value = new proto.tendermint.types.EvidenceParams;
      reader.readMessage(value,proto.tendermint.types.EvidenceParams.deserializeBinaryFromReader);
      msg.setEvidence(value);
      break;
    case 3:
      var value = new proto.tendermint.types.ValidatorParams;
      reader.readMessage(value,proto.tendermint.types.ValidatorParams.deserializeBinaryFromReader);
      msg.setValidator(value);
      break;
    case 4:
      var value = new proto.tendermint.types.VersionParams;
      reader.readMessage(value,proto.tendermint.types.VersionParams.deserializeBinaryFromReader);
      msg.setVersion(value);
      break;
    case 5:
      var value = new proto.tendermint.types.ABCIParams;
      reader.readMessage(value,proto.tendermint.types.ABCIParams.deserializeBinaryFromReader);
      msg.setAbci(value);
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
proto.tendermint.types.ConsensusParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.types.ConsensusParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.types.ConsensusParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.types.ConsensusParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBlock();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.tendermint.types.BlockParams.serializeBinaryToWriter
    );
  }
  f = message.getEvidence();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.tendermint.types.EvidenceParams.serializeBinaryToWriter
    );
  }
  f = message.getValidator();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.tendermint.types.ValidatorParams.serializeBinaryToWriter
    );
  }
  f = message.getVersion();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.tendermint.types.VersionParams.serializeBinaryToWriter
    );
  }
  f = message.getAbci();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.tendermint.types.ABCIParams.serializeBinaryToWriter
    );
  }
};


/**
 * optional BlockParams block = 1;
 * @return {?proto.tendermint.types.BlockParams}
 */
proto.tendermint.types.ConsensusParams.prototype.getBlock = function() {
  return /** @type{?proto.tendermint.types.BlockParams} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.BlockParams, 1));
};


/**
 * @param {?proto.tendermint.types.BlockParams|undefined} value
 * @return {!proto.tendermint.types.ConsensusParams} returns this
*/
proto.tendermint.types.ConsensusParams.prototype.setBlock = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.ConsensusParams} returns this
 */
proto.tendermint.types.ConsensusParams.prototype.clearBlock = function() {
  return this.setBlock(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.ConsensusParams.prototype.hasBlock = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional EvidenceParams evidence = 2;
 * @return {?proto.tendermint.types.EvidenceParams}
 */
proto.tendermint.types.ConsensusParams.prototype.getEvidence = function() {
  return /** @type{?proto.tendermint.types.EvidenceParams} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.EvidenceParams, 2));
};


/**
 * @param {?proto.tendermint.types.EvidenceParams|undefined} value
 * @return {!proto.tendermint.types.ConsensusParams} returns this
*/
proto.tendermint.types.ConsensusParams.prototype.setEvidence = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.ConsensusParams} returns this
 */
proto.tendermint.types.ConsensusParams.prototype.clearEvidence = function() {
  return this.setEvidence(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.ConsensusParams.prototype.hasEvidence = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional ValidatorParams validator = 3;
 * @return {?proto.tendermint.types.ValidatorParams}
 */
proto.tendermint.types.ConsensusParams.prototype.getValidator = function() {
  return /** @type{?proto.tendermint.types.ValidatorParams} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.ValidatorParams, 3));
};


/**
 * @param {?proto.tendermint.types.ValidatorParams|undefined} value
 * @return {!proto.tendermint.types.ConsensusParams} returns this
*/
proto.tendermint.types.ConsensusParams.prototype.setValidator = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.ConsensusParams} returns this
 */
proto.tendermint.types.ConsensusParams.prototype.clearValidator = function() {
  return this.setValidator(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.ConsensusParams.prototype.hasValidator = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional VersionParams version = 4;
 * @return {?proto.tendermint.types.VersionParams}
 */
proto.tendermint.types.ConsensusParams.prototype.getVersion = function() {
  return /** @type{?proto.tendermint.types.VersionParams} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.VersionParams, 4));
};


/**
 * @param {?proto.tendermint.types.VersionParams|undefined} value
 * @return {!proto.tendermint.types.ConsensusParams} returns this
*/
proto.tendermint.types.ConsensusParams.prototype.setVersion = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.ConsensusParams} returns this
 */
proto.tendermint.types.ConsensusParams.prototype.clearVersion = function() {
  return this.setVersion(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.ConsensusParams.prototype.hasVersion = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional ABCIParams abci = 5;
 * @return {?proto.tendermint.types.ABCIParams}
 */
proto.tendermint.types.ConsensusParams.prototype.getAbci = function() {
  return /** @type{?proto.tendermint.types.ABCIParams} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.ABCIParams, 5));
};


/**
 * @param {?proto.tendermint.types.ABCIParams|undefined} value
 * @return {!proto.tendermint.types.ConsensusParams} returns this
*/
proto.tendermint.types.ConsensusParams.prototype.setAbci = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.ConsensusParams} returns this
 */
proto.tendermint.types.ConsensusParams.prototype.clearAbci = function() {
  return this.setAbci(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.ConsensusParams.prototype.hasAbci = function() {
  return jspb.Message.getField(this, 5) != null;
};

