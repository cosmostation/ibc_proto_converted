// source: injective/peggy/v1/attestation.proto
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

goog.provide('proto.injective.peggy.v1.Attestation');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');

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
proto.injective.peggy.v1.Attestation = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.peggy.v1.Attestation.repeatedFields_, null);
};
goog.inherits(proto.injective.peggy.v1.Attestation, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.peggy.v1.Attestation.displayName = 'proto.injective.peggy.v1.Attestation';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.peggy.v1.Attestation.repeatedFields_ = [2];



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
proto.injective.peggy.v1.Attestation.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.peggy.v1.Attestation.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.peggy.v1.Attestation} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.Attestation.toObject = function(includeInstance, msg) {
  var f, obj = {
    observed: jspb.Message.getBooleanFieldWithDefault(msg, 1, false),
    votesList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    height: jspb.Message.getFieldWithDefault(msg, 3, 0),
    claim: (f = msg.getClaim()) && proto.google.protobuf.Any.toObject(includeInstance, f)
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
 * @return {!proto.injective.peggy.v1.Attestation}
 */
proto.injective.peggy.v1.Attestation.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.peggy.v1.Attestation;
  return proto.injective.peggy.v1.Attestation.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.peggy.v1.Attestation} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.peggy.v1.Attestation}
 */
proto.injective.peggy.v1.Attestation.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setObserved(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addVotes(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setHeight(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setClaim(value);
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
proto.injective.peggy.v1.Attestation.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.peggy.v1.Attestation.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.peggy.v1.Attestation} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.peggy.v1.Attestation.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getObserved();
  if (f) {
    writer.writeBool(
      1,
      f
    );
  }
  f = message.getVotesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getHeight();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getClaim();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
};


/**
 * optional bool observed = 1;
 * @return {boolean}
 */
proto.injective.peggy.v1.Attestation.prototype.getObserved = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 1, false));
};


/**
 * @param {boolean} value
 * @return {!proto.injective.peggy.v1.Attestation} returns this
 */
proto.injective.peggy.v1.Attestation.prototype.setObserved = function(value) {
  return jspb.Message.setProto3BooleanField(this, 1, value);
};


/**
 * repeated string votes = 2;
 * @return {!Array<string>}
 */
proto.injective.peggy.v1.Attestation.prototype.getVotesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.peggy.v1.Attestation} returns this
 */
proto.injective.peggy.v1.Attestation.prototype.setVotesList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.peggy.v1.Attestation} returns this
 */
proto.injective.peggy.v1.Attestation.prototype.addVotes = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.peggy.v1.Attestation} returns this
 */
proto.injective.peggy.v1.Attestation.prototype.clearVotesList = function() {
  return this.setVotesList([]);
};


/**
 * optional uint64 height = 3;
 * @return {number}
 */
proto.injective.peggy.v1.Attestation.prototype.getHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.peggy.v1.Attestation} returns this
 */
proto.injective.peggy.v1.Attestation.prototype.setHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional google.protobuf.Any claim = 4;
 * @return {?proto.google.protobuf.Any}
 */
proto.injective.peggy.v1.Attestation.prototype.getClaim = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 4));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.injective.peggy.v1.Attestation} returns this
*/
proto.injective.peggy.v1.Attestation.prototype.setClaim = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.peggy.v1.Attestation} returns this
 */
proto.injective.peggy.v1.Attestation.prototype.clearClaim = function() {
  return this.setClaim(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.peggy.v1.Attestation.prototype.hasClaim = function() {
  return jspb.Message.getField(this, 4) != null;
};


