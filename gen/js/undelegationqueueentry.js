// source: kyve/delegation/v1beta1/delegation.proto
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

goog.provide('proto.kyve.delegation.v1beta1.UndelegationQueueEntry');

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
proto.kyve.delegation.v1beta1.UndelegationQueueEntry = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.delegation.v1beta1.UndelegationQueueEntry, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.delegation.v1beta1.UndelegationQueueEntry.displayName = 'proto.kyve.delegation.v1beta1.UndelegationQueueEntry';
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
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.delegation.v1beta1.UndelegationQueueEntry.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.toObject = function(includeInstance, msg) {
  var f, obj = {
    index: jspb.Message.getFieldWithDefault(msg, 1, 0),
    staker: jspb.Message.getFieldWithDefault(msg, 2, ""),
    delegator: jspb.Message.getFieldWithDefault(msg, 3, ""),
    amount: jspb.Message.getFieldWithDefault(msg, 4, 0),
    creationTime: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry}
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.delegation.v1beta1.UndelegationQueueEntry;
  return proto.kyve.delegation.v1beta1.UndelegationQueueEntry.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry}
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setIndex(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setStaker(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDelegator(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAmount(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCreationTime(value);
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
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.delegation.v1beta1.UndelegationQueueEntry.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIndex();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getStaker();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDelegator();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAmount();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getCreationTime();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
};


/**
 * optional uint64 index = 1;
 * @return {number}
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.getIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry} returns this
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.setIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string staker = 2;
 * @return {string}
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.getStaker = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry} returns this
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.setStaker = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string delegator = 3;
 * @return {string}
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.getDelegator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry} returns this
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.setDelegator = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint64 amount = 4;
 * @return {number}
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.getAmount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry} returns this
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.setAmount = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 creation_time = 5;
 * @return {number}
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.getCreationTime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.delegation.v1beta1.UndelegationQueueEntry} returns this
 */
proto.kyve.delegation.v1beta1.UndelegationQueueEntry.prototype.setCreationTime = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


