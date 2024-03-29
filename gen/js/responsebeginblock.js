// source: tendermint/abci/types.proto
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

goog.provide('proto.tendermint.abci.ResponseBeginBlock');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
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
proto.tendermint.abci.ResponseBeginBlock = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.tendermint.abci.ResponseBeginBlock.repeatedFields_, null);
};
goog.inherits(proto.tendermint.abci.ResponseBeginBlock, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.abci.ResponseBeginBlock.displayName = 'proto.tendermint.abci.ResponseBeginBlock';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.tendermint.abci.ResponseBeginBlock.repeatedFields_ = [1];



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
proto.tendermint.abci.ResponseBeginBlock.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.abci.ResponseBeginBlock.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.abci.ResponseBeginBlock} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.ResponseBeginBlock.toObject = function(includeInstance, msg) {
  var f, obj = {
    eventsList: jspb.Message.toObjectList(msg.getEventsList(),
    proto.tendermint.abci.Event.toObject, includeInstance)
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
 * @return {!proto.tendermint.abci.ResponseBeginBlock}
 */
proto.tendermint.abci.ResponseBeginBlock.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.abci.ResponseBeginBlock;
  return proto.tendermint.abci.ResponseBeginBlock.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.abci.ResponseBeginBlock} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.abci.ResponseBeginBlock}
 */
proto.tendermint.abci.ResponseBeginBlock.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tendermint.abci.Event;
      reader.readMessage(value,proto.tendermint.abci.Event.deserializeBinaryFromReader);
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
proto.tendermint.abci.ResponseBeginBlock.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.abci.ResponseBeginBlock.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.abci.ResponseBeginBlock} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.ResponseBeginBlock.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEventsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.tendermint.abci.Event.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Event events = 1;
 * @return {!Array<!proto.tendermint.abci.Event>}
 */
proto.tendermint.abci.ResponseBeginBlock.prototype.getEventsList = function() {
  return /** @type{!Array<!proto.tendermint.abci.Event>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.tendermint.abci.Event, 1));
};


/**
 * @param {!Array<!proto.tendermint.abci.Event>} value
 * @return {!proto.tendermint.abci.ResponseBeginBlock} returns this
*/
proto.tendermint.abci.ResponseBeginBlock.prototype.setEventsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.tendermint.abci.Event=} opt_value
 * @param {number=} opt_index
 * @return {!proto.tendermint.abci.Event}
 */
proto.tendermint.abci.ResponseBeginBlock.prototype.addEvents = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.tendermint.abci.Event, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.tendermint.abci.ResponseBeginBlock} returns this
 */
proto.tendermint.abci.ResponseBeginBlock.prototype.clearEventsList = function() {
  return this.setEventsList([]);
};


