// source: irismod/record/record.proto
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

goog.provide('proto.irismod.record.Record');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.irismod.record.Content');

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
proto.irismod.record.Record = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.irismod.record.Record.repeatedFields_, null);
};
goog.inherits(proto.irismod.record.Record, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.record.Record.displayName = 'proto.irismod.record.Record';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.irismod.record.Record.repeatedFields_ = [2];



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
proto.irismod.record.Record.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.record.Record.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.record.Record} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.record.Record.toObject = function(includeInstance, msg) {
  var f, obj = {
    txHash: jspb.Message.getFieldWithDefault(msg, 1, ""),
    contentsList: jspb.Message.toObjectList(msg.getContentsList(),
    proto.irismod.record.Content.toObject, includeInstance),
    creator: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.irismod.record.Record}
 */
proto.irismod.record.Record.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.record.Record;
  return proto.irismod.record.Record.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.record.Record} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.record.Record}
 */
proto.irismod.record.Record.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTxHash(value);
      break;
    case 2:
      var value = new proto.irismod.record.Content;
      reader.readMessage(value,proto.irismod.record.Content.deserializeBinaryFromReader);
      msg.addContents(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
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
proto.irismod.record.Record.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.record.Record.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.record.Record} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.record.Record.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTxHash();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getContentsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.irismod.record.Content.serializeBinaryToWriter
    );
  }
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string tx_hash = 1;
 * @return {string}
 */
proto.irismod.record.Record.prototype.getTxHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.record.Record} returns this
 */
proto.irismod.record.Record.prototype.setTxHash = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated Content contents = 2;
 * @return {!Array<!proto.irismod.record.Content>}
 */
proto.irismod.record.Record.prototype.getContentsList = function() {
  return /** @type{!Array<!proto.irismod.record.Content>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.irismod.record.Content, 2));
};


/**
 * @param {!Array<!proto.irismod.record.Content>} value
 * @return {!proto.irismod.record.Record} returns this
*/
proto.irismod.record.Record.prototype.setContentsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.irismod.record.Content=} opt_value
 * @param {number=} opt_index
 * @return {!proto.irismod.record.Content}
 */
proto.irismod.record.Record.prototype.addContents = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.irismod.record.Content, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.record.Record} returns this
 */
proto.irismod.record.Record.prototype.clearContentsList = function() {
  return this.setContentsList([]);
};


/**
 * optional string creator = 3;
 * @return {string}
 */
proto.irismod.record.Record.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.record.Record} returns this
 */
proto.irismod.record.Record.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


