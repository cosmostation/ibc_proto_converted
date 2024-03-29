// source: dymension/streamer/gov_distribution.proto
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

goog.provide('proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.dymensionxyz.dymension.streamer.DistrRecord');

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
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.repeatedFields_, null);
};
goog.inherits(proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.displayName = 'proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.repeatedFields_ = [4];



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
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    streamId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    recordsList: jspb.Message.toObjectList(msg.getRecordsList(),
    proto.dymensionxyz.dymension.streamer.DistrRecord.toObject, includeInstance)
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
 * @return {!proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal}
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal;
  return proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal}
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setStreamId(value);
      break;
    case 4:
      var value = new proto.dymensionxyz.dymension.streamer.DistrRecord;
      reader.readMessage(value,proto.dymensionxyz.dymension.streamer.DistrRecord.deserializeBinaryFromReader);
      msg.addRecords(value);
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
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getStreamId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getRecordsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.dymensionxyz.dymension.streamer.DistrRecord.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal} returns this
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal} returns this
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 stream_id = 3;
 * @return {number}
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.getStreamId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal} returns this
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.setStreamId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * repeated DistrRecord records = 4;
 * @return {!Array<!proto.dymensionxyz.dymension.streamer.DistrRecord>}
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.getRecordsList = function() {
  return /** @type{!Array<!proto.dymensionxyz.dymension.streamer.DistrRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.dymensionxyz.dymension.streamer.DistrRecord, 4));
};


/**
 * @param {!Array<!proto.dymensionxyz.dymension.streamer.DistrRecord>} value
 * @return {!proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal} returns this
*/
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.setRecordsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.dymensionxyz.dymension.streamer.DistrRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.dymensionxyz.dymension.streamer.DistrRecord}
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.addRecords = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.dymensionxyz.dymension.streamer.DistrRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal} returns this
 */
proto.dymensionxyz.dymension.streamer.UpdateStreamDistributionProposal.prototype.clearRecordsList = function() {
  return this.setRecordsList([]);
};


