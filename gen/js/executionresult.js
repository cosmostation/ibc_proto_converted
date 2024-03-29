// source: provenance/metadata/v1/p8e/p8e.proto
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

goog.provide('proto.provenance.metadata.v1.p8e.ExecutionResult');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.p8e.ProposedFact');
goog.require('proto.provenance.metadata.v1.p8e.Timestamp');

goog.forwardDeclare('proto.provenance.metadata.v1.p8e.ExecutionResultType');
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
proto.provenance.metadata.v1.p8e.ExecutionResult = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.metadata.v1.p8e.ExecutionResult, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.p8e.ExecutionResult.displayName = 'proto.provenance.metadata.v1.p8e.ExecutionResult';
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
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.p8e.ExecutionResult.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.p8e.ExecutionResult} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.toObject = function(includeInstance, msg) {
  var f, obj = {
    output: (f = msg.getOutput()) && proto.provenance.metadata.v1.p8e.ProposedFact.toObject(includeInstance, f),
    result: jspb.Message.getFieldWithDefault(msg, 2, 0),
    recordedAt: (f = msg.getRecordedAt()) && proto.provenance.metadata.v1.p8e.Timestamp.toObject(includeInstance, f),
    errorMessage: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.provenance.metadata.v1.p8e.ExecutionResult}
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.p8e.ExecutionResult;
  return proto.provenance.metadata.v1.p8e.ExecutionResult.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.p8e.ExecutionResult} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.p8e.ExecutionResult}
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.metadata.v1.p8e.ProposedFact;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.ProposedFact.deserializeBinaryFromReader);
      msg.setOutput(value);
      break;
    case 2:
      var value = /** @type {!proto.provenance.metadata.v1.p8e.ExecutionResultType} */ (reader.readEnum());
      msg.setResult(value);
      break;
    case 3:
      var value = new proto.provenance.metadata.v1.p8e.Timestamp;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.Timestamp.deserializeBinaryFromReader);
      msg.setRecordedAt(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setErrorMessage(value);
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
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.p8e.ExecutionResult.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.p8e.ExecutionResult} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOutput();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.provenance.metadata.v1.p8e.ProposedFact.serializeBinaryToWriter
    );
  }
  f = message.getResult();
  if (f !== 0.0) {
    writer.writeEnum(
      2,
      f
    );
  }
  f = message.getRecordedAt();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.provenance.metadata.v1.p8e.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getErrorMessage();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional ProposedFact output = 1;
 * @return {?proto.provenance.metadata.v1.p8e.ProposedFact}
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.getOutput = function() {
  return /** @type{?proto.provenance.metadata.v1.p8e.ProposedFact} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.p8e.ProposedFact, 1));
};


/**
 * @param {?proto.provenance.metadata.v1.p8e.ProposedFact|undefined} value
 * @return {!proto.provenance.metadata.v1.p8e.ExecutionResult} returns this
*/
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.setOutput = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.p8e.ExecutionResult} returns this
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.clearOutput = function() {
  return this.setOutput(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.hasOutput = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional ExecutionResultType result = 2;
 * @return {!proto.provenance.metadata.v1.p8e.ExecutionResultType}
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.getResult = function() {
  return /** @type {!proto.provenance.metadata.v1.p8e.ExecutionResultType} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {!proto.provenance.metadata.v1.p8e.ExecutionResultType} value
 * @return {!proto.provenance.metadata.v1.p8e.ExecutionResult} returns this
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.setResult = function(value) {
  return jspb.Message.setProto3EnumField(this, 2, value);
};


/**
 * optional Timestamp recorded_at = 3;
 * @return {?proto.provenance.metadata.v1.p8e.Timestamp}
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.getRecordedAt = function() {
  return /** @type{?proto.provenance.metadata.v1.p8e.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.p8e.Timestamp, 3));
};


/**
 * @param {?proto.provenance.metadata.v1.p8e.Timestamp|undefined} value
 * @return {!proto.provenance.metadata.v1.p8e.ExecutionResult} returns this
*/
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.setRecordedAt = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.p8e.ExecutionResult} returns this
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.clearRecordedAt = function() {
  return this.setRecordedAt(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.hasRecordedAt = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string error_message = 4;
 * @return {string}
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.getErrorMessage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.p8e.ExecutionResult} returns this
 */
proto.provenance.metadata.v1.p8e.ExecutionResult.prototype.setErrorMessage = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


