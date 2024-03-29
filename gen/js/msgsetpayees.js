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

goog.provide('proto.injective.ocr.v1beta1.MsgSetPayees');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.injective.ocr.v1beta1.MsgSetPayees = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.ocr.v1beta1.MsgSetPayees.repeatedFields_, null);
};
goog.inherits(proto.injective.ocr.v1beta1.MsgSetPayees, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.ocr.v1beta1.MsgSetPayees.displayName = 'proto.injective.ocr.v1beta1.MsgSetPayees';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.ocr.v1beta1.MsgSetPayees.repeatedFields_ = [3,4];



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
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.ocr.v1beta1.MsgSetPayees.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.ocr.v1beta1.MsgSetPayees} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.MsgSetPayees.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    feedId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    transmittersList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    payeesList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f
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
 * @return {!proto.injective.ocr.v1beta1.MsgSetPayees}
 */
proto.injective.ocr.v1beta1.MsgSetPayees.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.ocr.v1beta1.MsgSetPayees;
  return proto.injective.ocr.v1beta1.MsgSetPayees.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.ocr.v1beta1.MsgSetPayees} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.ocr.v1beta1.MsgSetPayees}
 */
proto.injective.ocr.v1beta1.MsgSetPayees.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeedId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addTransmitters(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.addPayees(value);
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
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.ocr.v1beta1.MsgSetPayees.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.ocr.v1beta1.MsgSetPayees} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.MsgSetPayees.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getFeedId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTransmittersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
  f = message.getPayeesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      4,
      f
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.MsgSetPayees} returns this
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string feed_id = 2;
 * @return {string}
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.getFeedId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.MsgSetPayees} returns this
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.setFeedId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated string transmitters = 3;
 * @return {!Array<string>}
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.getTransmittersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.ocr.v1beta1.MsgSetPayees} returns this
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.setTransmittersList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.ocr.v1beta1.MsgSetPayees} returns this
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.addTransmitters = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.ocr.v1beta1.MsgSetPayees} returns this
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.clearTransmittersList = function() {
  return this.setTransmittersList([]);
};


/**
 * repeated string payees = 4;
 * @return {!Array<string>}
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.getPayeesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.ocr.v1beta1.MsgSetPayees} returns this
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.setPayeesList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.ocr.v1beta1.MsgSetPayees} returns this
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.addPayees = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.ocr.v1beta1.MsgSetPayees} returns this
 */
proto.injective.ocr.v1beta1.MsgSetPayees.prototype.clearPayeesList = function() {
  return this.setPayeesList([]);
};


