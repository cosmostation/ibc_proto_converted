// source: kyve/stakers/v1beta1/stakers.proto
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

goog.provide('proto.kyve.stakers.v1beta1.QueueState');

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
proto.kyve.stakers.v1beta1.QueueState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.stakers.v1beta1.QueueState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.stakers.v1beta1.QueueState.displayName = 'proto.kyve.stakers.v1beta1.QueueState';
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
proto.kyve.stakers.v1beta1.QueueState.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.stakers.v1beta1.QueueState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.stakers.v1beta1.QueueState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.stakers.v1beta1.QueueState.toObject = function(includeInstance, msg) {
  var f, obj = {
    lowIndex: jspb.Message.getFieldWithDefault(msg, 1, 0),
    highIndex: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.kyve.stakers.v1beta1.QueueState}
 */
proto.kyve.stakers.v1beta1.QueueState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.stakers.v1beta1.QueueState;
  return proto.kyve.stakers.v1beta1.QueueState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.stakers.v1beta1.QueueState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.stakers.v1beta1.QueueState}
 */
proto.kyve.stakers.v1beta1.QueueState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLowIndex(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setHighIndex(value);
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
proto.kyve.stakers.v1beta1.QueueState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.stakers.v1beta1.QueueState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.stakers.v1beta1.QueueState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.stakers.v1beta1.QueueState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLowIndex();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getHighIndex();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
};


/**
 * optional uint64 low_index = 1;
 * @return {number}
 */
proto.kyve.stakers.v1beta1.QueueState.prototype.getLowIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.stakers.v1beta1.QueueState} returns this
 */
proto.kyve.stakers.v1beta1.QueueState.prototype.setLowIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 high_index = 2;
 * @return {number}
 */
proto.kyve.stakers.v1beta1.QueueState.prototype.getHighIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.stakers.v1beta1.QueueState} returns this
 */
proto.kyve.stakers.v1beta1.QueueState.prototype.setHighIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


