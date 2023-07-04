// source: cosmos/gov/v1/tx.proto
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

goog.provide('proto.cosmos.gov.v1.MsgSubmitProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
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
proto.cosmos.gov.v1.MsgSubmitProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.gov.v1.MsgSubmitProposal.repeatedFields_, null);
};
goog.inherits(proto.cosmos.gov.v1.MsgSubmitProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.gov.v1.MsgSubmitProposal.displayName = 'proto.cosmos.gov.v1.MsgSubmitProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.gov.v1.MsgSubmitProposal.repeatedFields_ = [1,2];



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
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.gov.v1.MsgSubmitProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.gov.v1.MsgSubmitProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.gov.v1.MsgSubmitProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    messagesList: jspb.Message.toObjectList(msg.getMessagesList(),
    proto.google.protobuf.Any.toObject, includeInstance),
    initialDepositList: jspb.Message.toObjectList(msg.getInitialDepositList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    proposer: jspb.Message.getFieldWithDefault(msg, 3, ""),
    metadata: jspb.Message.getFieldWithDefault(msg, 4, ""),
    title: jspb.Message.getFieldWithDefault(msg, 5, ""),
    summary: jspb.Message.getFieldWithDefault(msg, 6, ""),
    expedited: jspb.Message.getBooleanFieldWithDefault(msg, 7, false)
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
 * @return {!proto.cosmos.gov.v1.MsgSubmitProposal}
 */
proto.cosmos.gov.v1.MsgSubmitProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.gov.v1.MsgSubmitProposal;
  return proto.cosmos.gov.v1.MsgSubmitProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.gov.v1.MsgSubmitProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.gov.v1.MsgSubmitProposal}
 */
proto.cosmos.gov.v1.MsgSubmitProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.addMessages(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addInitialDeposit(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setProposer(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setMetadata(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setSummary(value);
      break;
    case 7:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setExpedited(value);
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
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.gov.v1.MsgSubmitProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.gov.v1.MsgSubmitProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.gov.v1.MsgSubmitProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMessagesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getInitialDepositList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getProposer();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getMetadata();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getSummary();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getExpedited();
  if (f) {
    writer.writeBool(
      7,
      f
    );
  }
};


/**
 * repeated google.protobuf.Any messages = 1;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.getMessagesList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 1));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.cosmos.gov.v1.MsgSubmitProposal} returns this
*/
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.setMessagesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.addMessages = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.gov.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.clearMessagesList = function() {
  return this.setMessagesList([]);
};


/**
 * repeated cosmos.base.v1beta1.Coin initial_deposit = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.getInitialDepositList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.cosmos.gov.v1.MsgSubmitProposal} returns this
*/
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.setInitialDepositList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.addInitialDeposit = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.gov.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.clearInitialDepositList = function() {
  return this.setInitialDepositList([]);
};


/**
 * optional string proposer = 3;
 * @return {string}
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.getProposer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.gov.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.setProposer = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string metadata = 4;
 * @return {string}
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.gov.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.setMetadata = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string title = 5;
 * @return {string}
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.gov.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string summary = 6;
 * @return {string}
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.getSummary = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.gov.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.setSummary = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional bool expedited = 7;
 * @return {boolean}
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.getExpedited = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 7, false));
};


/**
 * @param {boolean} value
 * @return {!proto.cosmos.gov.v1.MsgSubmitProposal} returns this
 */
proto.cosmos.gov.v1.MsgSubmitProposal.prototype.setExpedited = function(value) {
  return jspb.Message.setProto3BooleanField(this, 7, value);
};

