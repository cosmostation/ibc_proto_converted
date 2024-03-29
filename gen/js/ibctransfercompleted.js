// source: axelar/axelarnet/v1beta1/events.proto
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

goog.provide('proto.axelar.axelarnet.v1beta1.IBCTransferCompleted');

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
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.axelarnet.v1beta1.IBCTransferCompleted, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.displayName = 'proto.axelar.axelarnet.v1beta1.IBCTransferCompleted';
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
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.axelarnet.v1beta1.IBCTransferCompleted} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    sequence: jspb.Message.getFieldWithDefault(msg, 2, 0),
    portId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    channelId: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.axelar.axelarnet.v1beta1.IBCTransferCompleted}
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.axelarnet.v1beta1.IBCTransferCompleted;
  return proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.axelarnet.v1beta1.IBCTransferCompleted} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.axelarnet.v1beta1.IBCTransferCompleted}
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSequence(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setPortId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setChannelId(value);
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
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.axelarnet.v1beta1.IBCTransferCompleted} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getSequence();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getPortId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getChannelId();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.axelarnet.v1beta1.IBCTransferCompleted} returns this
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 sequence = 2;
 * @return {number}
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.prototype.getSequence = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.axelarnet.v1beta1.IBCTransferCompleted} returns this
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.prototype.setSequence = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string port_id = 3;
 * @return {string}
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.prototype.getPortId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.axelarnet.v1beta1.IBCTransferCompleted} returns this
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.prototype.setPortId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string channel_id = 4;
 * @return {string}
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.prototype.getChannelId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.axelarnet.v1beta1.IBCTransferCompleted} returns this
 */
proto.axelar.axelarnet.v1beta1.IBCTransferCompleted.prototype.setChannelId = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


