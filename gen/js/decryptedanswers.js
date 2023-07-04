// source: secret/compute/v1beta1/query.proto
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

goog.provide('proto.secret.compute.v1beta1.DecryptedAnswers');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.abci.v1beta1.StringEvent');
goog.require('proto.secret.compute.v1beta1.DecryptedAnswer');

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
proto.secret.compute.v1beta1.DecryptedAnswers = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.secret.compute.v1beta1.DecryptedAnswers.repeatedFields_, null);
};
goog.inherits(proto.secret.compute.v1beta1.DecryptedAnswers, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.secret.compute.v1beta1.DecryptedAnswers.displayName = 'proto.secret.compute.v1beta1.DecryptedAnswers';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.secret.compute.v1beta1.DecryptedAnswers.repeatedFields_ = [1,2];



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
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.toObject = function(opt_includeInstance) {
  return proto.secret.compute.v1beta1.DecryptedAnswers.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.secret.compute.v1beta1.DecryptedAnswers} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.DecryptedAnswers.toObject = function(includeInstance, msg) {
  var f, obj = {
    answersList: jspb.Message.toObjectList(msg.getAnswersList(),
    proto.secret.compute.v1beta1.DecryptedAnswer.toObject, includeInstance),
    outputLogsList: jspb.Message.toObjectList(msg.getOutputLogsList(),
    proto.cosmos.base.abci.v1beta1.StringEvent.toObject, includeInstance),
    outputError: jspb.Message.getFieldWithDefault(msg, 3, ""),
    plaintextError: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.secret.compute.v1beta1.DecryptedAnswers}
 */
proto.secret.compute.v1beta1.DecryptedAnswers.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.secret.compute.v1beta1.DecryptedAnswers;
  return proto.secret.compute.v1beta1.DecryptedAnswers.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.secret.compute.v1beta1.DecryptedAnswers} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.secret.compute.v1beta1.DecryptedAnswers}
 */
proto.secret.compute.v1beta1.DecryptedAnswers.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.secret.compute.v1beta1.DecryptedAnswer;
      reader.readMessage(value,proto.secret.compute.v1beta1.DecryptedAnswer.deserializeBinaryFromReader);
      msg.addAnswers(value);
      break;
    case 2:
      var value = new proto.cosmos.base.abci.v1beta1.StringEvent;
      reader.readMessage(value,proto.cosmos.base.abci.v1beta1.StringEvent.deserializeBinaryFromReader);
      msg.addOutputLogs(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setOutputError(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setPlaintextError(value);
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
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.secret.compute.v1beta1.DecryptedAnswers.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.secret.compute.v1beta1.DecryptedAnswers} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.DecryptedAnswers.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAnswersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.secret.compute.v1beta1.DecryptedAnswer.serializeBinaryToWriter
    );
  }
  f = message.getOutputLogsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.abci.v1beta1.StringEvent.serializeBinaryToWriter
    );
  }
  f = message.getOutputError();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPlaintextError();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * repeated DecryptedAnswer answers = 1;
 * @return {!Array<!proto.secret.compute.v1beta1.DecryptedAnswer>}
 */
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.getAnswersList = function() {
  return /** @type{!Array<!proto.secret.compute.v1beta1.DecryptedAnswer>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.secret.compute.v1beta1.DecryptedAnswer, 1));
};


/**
 * @param {!Array<!proto.secret.compute.v1beta1.DecryptedAnswer>} value
 * @return {!proto.secret.compute.v1beta1.DecryptedAnswers} returns this
*/
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.setAnswersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.secret.compute.v1beta1.DecryptedAnswer=} opt_value
 * @param {number=} opt_index
 * @return {!proto.secret.compute.v1beta1.DecryptedAnswer}
 */
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.addAnswers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.secret.compute.v1beta1.DecryptedAnswer, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.secret.compute.v1beta1.DecryptedAnswers} returns this
 */
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.clearAnswersList = function() {
  return this.setAnswersList([]);
};


/**
 * repeated cosmos.base.abci.v1beta1.StringEvent output_logs = 2;
 * @return {!Array<!proto.cosmos.base.abci.v1beta1.StringEvent>}
 */
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.getOutputLogsList = function() {
  return /** @type{!Array<!proto.cosmos.base.abci.v1beta1.StringEvent>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.abci.v1beta1.StringEvent, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.abci.v1beta1.StringEvent>} value
 * @return {!proto.secret.compute.v1beta1.DecryptedAnswers} returns this
*/
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.setOutputLogsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.abci.v1beta1.StringEvent=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.abci.v1beta1.StringEvent}
 */
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.addOutputLogs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.abci.v1beta1.StringEvent, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.secret.compute.v1beta1.DecryptedAnswers} returns this
 */
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.clearOutputLogsList = function() {
  return this.setOutputLogsList([]);
};


/**
 * optional string output_error = 3;
 * @return {string}
 */
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.getOutputError = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.compute.v1beta1.DecryptedAnswers} returns this
 */
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.setOutputError = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string plaintext_error = 4;
 * @return {string}
 */
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.getPlaintextError = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.compute.v1beta1.DecryptedAnswers} returns this
 */
proto.secret.compute.v1beta1.DecryptedAnswers.prototype.setPlaintextError = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};

