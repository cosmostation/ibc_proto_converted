// source: cosmos/base/abci/v1beta1/abci.proto
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

goog.provide('proto.cosmos.base.abci.v1beta1.Result');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');
goog.require('proto.tendermint.abci.Event');

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
proto.cosmos.base.abci.v1beta1.Result = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.base.abci.v1beta1.Result.repeatedFields_, null);
};
goog.inherits(proto.cosmos.base.abci.v1beta1.Result, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.base.abci.v1beta1.Result.displayName = 'proto.cosmos.base.abci.v1beta1.Result';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.base.abci.v1beta1.Result.repeatedFields_ = [3,4];



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
proto.cosmos.base.abci.v1beta1.Result.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.base.abci.v1beta1.Result.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.base.abci.v1beta1.Result} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.abci.v1beta1.Result.toObject = function(includeInstance, msg) {
  var f, obj = {
    data: msg.getData_asB64(),
    log: jspb.Message.getFieldWithDefault(msg, 2, ""),
    eventsList: jspb.Message.toObjectList(msg.getEventsList(),
    proto.tendermint.abci.Event.toObject, includeInstance),
    msgResponsesList: jspb.Message.toObjectList(msg.getMsgResponsesList(),
    proto.google.protobuf.Any.toObject, includeInstance)
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
 * @return {!proto.cosmos.base.abci.v1beta1.Result}
 */
proto.cosmos.base.abci.v1beta1.Result.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.base.abci.v1beta1.Result;
  return proto.cosmos.base.abci.v1beta1.Result.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.base.abci.v1beta1.Result} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.base.abci.v1beta1.Result}
 */
proto.cosmos.base.abci.v1beta1.Result.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setData(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setLog(value);
      break;
    case 3:
      var value = new proto.tendermint.abci.Event;
      reader.readMessage(value,proto.tendermint.abci.Event.deserializeBinaryFromReader);
      msg.addEvents(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.addMsgResponses(value);
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
proto.cosmos.base.abci.v1beta1.Result.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.base.abci.v1beta1.Result.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.base.abci.v1beta1.Result} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.abci.v1beta1.Result.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getData_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getLog();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getEventsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.tendermint.abci.Event.serializeBinaryToWriter
    );
  }
  f = message.getMsgResponsesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes data = 1;
 * @return {string}
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.getData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes data = 1;
 * This is a type-conversion wrapper around `getData()`
 * @return {string}
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.getData_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getData()));
};


/**
 * optional bytes data = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getData()`
 * @return {!Uint8Array}
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.getData_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getData()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmos.base.abci.v1beta1.Result} returns this
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.setData = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional string log = 2;
 * @return {string}
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.getLog = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.base.abci.v1beta1.Result} returns this
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.setLog = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated tendermint.abci.Event events = 3;
 * @return {!Array<!proto.tendermint.abci.Event>}
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.getEventsList = function() {
  return /** @type{!Array<!proto.tendermint.abci.Event>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.tendermint.abci.Event, 3));
};


/**
 * @param {!Array<!proto.tendermint.abci.Event>} value
 * @return {!proto.cosmos.base.abci.v1beta1.Result} returns this
*/
proto.cosmos.base.abci.v1beta1.Result.prototype.setEventsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.tendermint.abci.Event=} opt_value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.Event}
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.addEvents = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.tendermint.abci.Event, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.base.abci.v1beta1.Result} returns this
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.clearEventsList = function() {
  return this.setEventsList([]);
};


/**
 * repeated google.protobuf.Any msg_responses = 4;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.getMsgResponsesList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 4));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.cosmos.base.abci.v1beta1.Result} returns this
*/
proto.cosmos.base.abci.v1beta1.Result.prototype.setMsgResponsesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.addMsgResponses = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.base.abci.v1beta1.Result} returns this
 */
proto.cosmos.base.abci.v1beta1.Result.prototype.clearMsgResponsesList = function() {
  return this.setMsgResponsesList([]);
};


