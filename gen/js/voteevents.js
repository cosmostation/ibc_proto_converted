// source: axelar/evm/v1beta1/types.proto
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

goog.provide('proto.axelar.evm.v1beta1.VoteEvents');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.evm.v1beta1.Event');

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
proto.axelar.evm.v1beta1.VoteEvents = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.evm.v1beta1.VoteEvents.repeatedFields_, null);
};
goog.inherits(proto.axelar.evm.v1beta1.VoteEvents, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.VoteEvents.displayName = 'proto.axelar.evm.v1beta1.VoteEvents';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.evm.v1beta1.VoteEvents.repeatedFields_ = [2];



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
proto.axelar.evm.v1beta1.VoteEvents.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.VoteEvents.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.VoteEvents} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.VoteEvents.toObject = function(includeInstance, msg) {
  var f, obj = {
    chain: jspb.Message.getFieldWithDefault(msg, 1, ""),
    eventsList: jspb.Message.toObjectList(msg.getEventsList(),
    proto.axelar.evm.v1beta1.Event.toObject, includeInstance)
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
 * @return {!proto.axelar.evm.v1beta1.VoteEvents}
 */
proto.axelar.evm.v1beta1.VoteEvents.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.VoteEvents;
  return proto.axelar.evm.v1beta1.VoteEvents.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.VoteEvents} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.VoteEvents}
 */
proto.axelar.evm.v1beta1.VoteEvents.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setChain(value);
      break;
    case 2:
      var value = new proto.axelar.evm.v1beta1.Event;
      reader.readMessage(value,proto.axelar.evm.v1beta1.Event.deserializeBinaryFromReader);
      msg.addEvents(value);
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
proto.axelar.evm.v1beta1.VoteEvents.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.VoteEvents.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.VoteEvents} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.VoteEvents.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChain();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getEventsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.axelar.evm.v1beta1.Event.serializeBinaryToWriter
    );
  }
};


/**
 * optional string chain = 1;
 * @return {string}
 */
proto.axelar.evm.v1beta1.VoteEvents.prototype.getChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.VoteEvents} returns this
 */
proto.axelar.evm.v1beta1.VoteEvents.prototype.setChain = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated Event events = 2;
 * @return {!Array<!proto.axelar.evm.v1beta1.Event>}
 */
proto.axelar.evm.v1beta1.VoteEvents.prototype.getEventsList = function() {
  return /** @type{!Array<!proto.axelar.evm.v1beta1.Event>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.evm.v1beta1.Event, 2));
};


/**
 * @param {!Array<!proto.axelar.evm.v1beta1.Event>} value
 * @return {!proto.axelar.evm.v1beta1.VoteEvents} returns this
*/
proto.axelar.evm.v1beta1.VoteEvents.prototype.setEventsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.axelar.evm.v1beta1.Event=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.Event}
 */
proto.axelar.evm.v1beta1.VoteEvents.prototype.addEvents = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.axelar.evm.v1beta1.Event, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.VoteEvents} returns this
 */
proto.axelar.evm.v1beta1.VoteEvents.prototype.clearEventsList = function() {
  return this.setEventsList([]);
};


