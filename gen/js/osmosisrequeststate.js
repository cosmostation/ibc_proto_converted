// source: quasar/qoracle/osmosis/osmosis.proto
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

goog.provide('proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState');

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
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.displayName = 'proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState';
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
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.prototype.toObject = function(opt_includeInstance) {
  return proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.toObject = function(includeInstance, msg) {
  var f, obj = {
    packetSequence: jspb.Message.getFieldWithDefault(msg, 1, 0),
    acknowledged: jspb.Message.getBooleanFieldWithDefault(msg, 2, false),
    failed: jspb.Message.getBooleanFieldWithDefault(msg, 3, false),
    updatedAtHeight: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState;
  return proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPacketSequence(value);
      break;
    case 2:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setAcknowledged(value);
      break;
    case 3:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setFailed(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setUpdatedAtHeight(value);
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
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPacketSequence();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAcknowledged();
  if (f) {
    writer.writeBool(
      2,
      f
    );
  }
  f = message.getFailed();
  if (f) {
    writer.writeBool(
      3,
      f
    );
  }
  f = message.getUpdatedAtHeight();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
};


/**
 * optional uint64 packet_sequence = 1;
 * @return {number}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.prototype.getPacketSequence = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.prototype.setPacketSequence = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional bool acknowledged = 2;
 * @return {boolean}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.prototype.getAcknowledged = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 2, false));
};


/**
 * @param {boolean} value
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.prototype.setAcknowledged = function(value) {
  return jspb.Message.setProto3BooleanField(this, 2, value);
};


/**
 * optional bool failed = 3;
 * @return {boolean}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.prototype.getFailed = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 3, false));
};


/**
 * @param {boolean} value
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.prototype.setFailed = function(value) {
  return jspb.Message.setProto3BooleanField(this, 3, value);
};


/**
 * optional int64 updated_at_height = 4;
 * @return {number}
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.prototype.getUpdatedAtHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState} returns this
 */
proto.quasarlabs.quasarnode.qoracle.osmosis.OsmosisRequestState.prototype.setUpdatedAtHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


