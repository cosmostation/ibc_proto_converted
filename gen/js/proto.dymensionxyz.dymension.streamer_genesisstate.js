// source: dymension/streamer/genesis.proto
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

goog.provide('proto.dymensionxyz.dymension.streamer.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.dymensionxyz.dymension.streamer.Params');
goog.require('proto.dymensionxyz.dymension.streamer.Stream');

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
proto.dymensionxyz.dymension.streamer.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.dymensionxyz.dymension.streamer.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.dymensionxyz.dymension.streamer.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.dymensionxyz.dymension.streamer.GenesisState.displayName = 'proto.dymensionxyz.dymension.streamer.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.dymensionxyz.dymension.streamer.GenesisState.repeatedFields_ = [2];



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
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.dymensionxyz.dymension.streamer.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.dymensionxyz.dymension.streamer.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.streamer.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.dymensionxyz.dymension.streamer.Params.toObject(includeInstance, f),
    streamsList: jspb.Message.toObjectList(msg.getStreamsList(),
    proto.dymensionxyz.dymension.streamer.Stream.toObject, includeInstance),
    lastStreamId: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.dymensionxyz.dymension.streamer.GenesisState}
 */
proto.dymensionxyz.dymension.streamer.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.dymensionxyz.dymension.streamer.GenesisState;
  return proto.dymensionxyz.dymension.streamer.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.dymensionxyz.dymension.streamer.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.dymensionxyz.dymension.streamer.GenesisState}
 */
proto.dymensionxyz.dymension.streamer.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.dymensionxyz.dymension.streamer.Params;
      reader.readMessage(value,proto.dymensionxyz.dymension.streamer.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.dymensionxyz.dymension.streamer.Stream;
      reader.readMessage(value,proto.dymensionxyz.dymension.streamer.Stream.deserializeBinaryFromReader);
      msg.addStreams(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLastStreamId(value);
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
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.dymensionxyz.dymension.streamer.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.dymensionxyz.dymension.streamer.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.streamer.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.dymensionxyz.dymension.streamer.Params.serializeBinaryToWriter
    );
  }
  f = message.getStreamsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.dymensionxyz.dymension.streamer.Stream.serializeBinaryToWriter
    );
  }
  f = message.getLastStreamId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.dymensionxyz.dymension.streamer.Params}
 */
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.dymensionxyz.dymension.streamer.Params} */ (
    jspb.Message.getWrapperField(this, proto.dymensionxyz.dymension.streamer.Params, 1));
};


/**
 * @param {?proto.dymensionxyz.dymension.streamer.Params|undefined} value
 * @return {!proto.dymensionxyz.dymension.streamer.GenesisState} returns this
*/
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.dymensionxyz.dymension.streamer.GenesisState} returns this
 */
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Stream streams = 2;
 * @return {!Array<!proto.dymensionxyz.dymension.streamer.Stream>}
 */
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.getStreamsList = function() {
  return /** @type{!Array<!proto.dymensionxyz.dymension.streamer.Stream>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.dymensionxyz.dymension.streamer.Stream, 2));
};


/**
 * @param {!Array<!proto.dymensionxyz.dymension.streamer.Stream>} value
 * @return {!proto.dymensionxyz.dymension.streamer.GenesisState} returns this
*/
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.setStreamsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.dymensionxyz.dymension.streamer.Stream=} opt_value
 * @param {number=} opt_index
 * @return {!proto.dymensionxyz.dymension.streamer.Stream}
 */
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.addStreams = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.dymensionxyz.dymension.streamer.Stream, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.dymensionxyz.dymension.streamer.GenesisState} returns this
 */
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.clearStreamsList = function() {
  return this.setStreamsList([]);
};


/**
 * optional uint64 last_stream_id = 3;
 * @return {number}
 */
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.getLastStreamId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.dymensionxyz.dymension.streamer.GenesisState} returns this
 */
proto.dymensionxyz.dymension.streamer.GenesisState.prototype.setLastStreamId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


