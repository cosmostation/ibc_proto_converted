// source: osmosis/lockup/query.proto
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

goog.provide('proto.osmosis.lockup.AccountLockedPastTimeResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.lockup.PeriodLock');

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
proto.osmosis.lockup.AccountLockedPastTimeResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.lockup.AccountLockedPastTimeResponse.repeatedFields_, null);
};
goog.inherits(proto.osmosis.lockup.AccountLockedPastTimeResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.lockup.AccountLockedPastTimeResponse.displayName = 'proto.osmosis.lockup.AccountLockedPastTimeResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.lockup.AccountLockedPastTimeResponse.repeatedFields_ = [1];



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
proto.osmosis.lockup.AccountLockedPastTimeResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.lockup.AccountLockedPastTimeResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.lockup.AccountLockedPastTimeResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.lockup.AccountLockedPastTimeResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    locksList: jspb.Message.toObjectList(msg.getLocksList(),
    proto.osmosis.lockup.PeriodLock.toObject, includeInstance)
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
 * @return {!proto.osmosis.lockup.AccountLockedPastTimeResponse}
 */
proto.osmosis.lockup.AccountLockedPastTimeResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.lockup.AccountLockedPastTimeResponse;
  return proto.osmosis.lockup.AccountLockedPastTimeResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.lockup.AccountLockedPastTimeResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.lockup.AccountLockedPastTimeResponse}
 */
proto.osmosis.lockup.AccountLockedPastTimeResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.lockup.PeriodLock;
      reader.readMessage(value,proto.osmosis.lockup.PeriodLock.deserializeBinaryFromReader);
      msg.addLocks(value);
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
proto.osmosis.lockup.AccountLockedPastTimeResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.lockup.AccountLockedPastTimeResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.lockup.AccountLockedPastTimeResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.lockup.AccountLockedPastTimeResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLocksList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.osmosis.lockup.PeriodLock.serializeBinaryToWriter
    );
  }
};


/**
 * repeated PeriodLock locks = 1;
 * @return {!Array<!proto.osmosis.lockup.PeriodLock>}
 */
proto.osmosis.lockup.AccountLockedPastTimeResponse.prototype.getLocksList = function() {
  return /** @type{!Array<!proto.osmosis.lockup.PeriodLock>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.lockup.PeriodLock, 1));
};


/**
 * @param {!Array<!proto.osmosis.lockup.PeriodLock>} value
 * @return {!proto.osmosis.lockup.AccountLockedPastTimeResponse} returns this
*/
proto.osmosis.lockup.AccountLockedPastTimeResponse.prototype.setLocksList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.osmosis.lockup.PeriodLock=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.lockup.PeriodLock}
 */
proto.osmosis.lockup.AccountLockedPastTimeResponse.prototype.addLocks = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.osmosis.lockup.PeriodLock, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.lockup.AccountLockedPastTimeResponse} returns this
 */
proto.osmosis.lockup.AccountLockedPastTimeResponse.prototype.clearLocksList = function() {
  return this.setLocksList([]);
};


