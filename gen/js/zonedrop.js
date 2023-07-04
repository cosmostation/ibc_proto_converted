// source: quicksilver/airdrop/v1/airdrop.proto
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

goog.provide('proto.quicksilver.airdrop.v1.ZoneDrop');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');
goog.require('proto.google.protobuf.Timestamp');

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
proto.quicksilver.airdrop.v1.ZoneDrop = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.quicksilver.airdrop.v1.ZoneDrop.repeatedFields_, null);
};
goog.inherits(proto.quicksilver.airdrop.v1.ZoneDrop, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quicksilver.airdrop.v1.ZoneDrop.displayName = 'proto.quicksilver.airdrop.v1.ZoneDrop';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.quicksilver.airdrop.v1.ZoneDrop.repeatedFields_ = [6];



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
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.toObject = function(opt_includeInstance) {
  return proto.quicksilver.airdrop.v1.ZoneDrop.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quicksilver.airdrop.v1.ZoneDrop} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.airdrop.v1.ZoneDrop.toObject = function(includeInstance, msg) {
  var f, obj = {
    chainId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    startTime: (f = msg.getStartTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    duration: (f = msg.getDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    decay: (f = msg.getDecay()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    allocation: jspb.Message.getFieldWithDefault(msg, 5, 0),
    actionsList: (f = jspb.Message.getRepeatedField(msg, 6)) == null ? undefined : f,
    isConcluded: jspb.Message.getBooleanFieldWithDefault(msg, 7, false)
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
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quicksilver.airdrop.v1.ZoneDrop;
  return proto.quicksilver.airdrop.v1.ZoneDrop.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quicksilver.airdrop.v1.ZoneDrop} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setChainId(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartTime(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setDuration(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setDecay(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAllocation(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.addActions(value);
      break;
    case 7:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsConcluded(value);
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
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quicksilver.airdrop.v1.ZoneDrop.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quicksilver.airdrop.v1.ZoneDrop} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.airdrop.v1.ZoneDrop.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChainId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getStartTime();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getDuration();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getDecay();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getAllocation();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getActionsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      6,
      f
    );
  }
  f = message.getIsConcluded();
  if (f) {
    writer.writeBool(
      7,
      f
    );
  }
};


/**
 * optional string chain_id = 1;
 * @return {string}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.getChainId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.setChainId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional google.protobuf.Timestamp start_time = 2;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.getStartTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 2));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
*/
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.setStartTime = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.clearStartTime = function() {
  return this.setStartTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.hasStartTime = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional google.protobuf.Duration duration = 3;
 * @return {?proto.google.protobuf.Duration}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.getDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 3));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
*/
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.setDuration = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.clearDuration = function() {
  return this.setDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.hasDuration = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional google.protobuf.Duration decay = 4;
 * @return {?proto.google.protobuf.Duration}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.getDecay = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 4));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
*/
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.setDecay = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.clearDecay = function() {
  return this.setDecay(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.hasDecay = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional uint64 allocation = 5;
 * @return {number}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.getAllocation = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.setAllocation = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * repeated string actions = 6;
 * @return {!Array<string>}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.getActionsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 6));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.setActionsList = function(value) {
  return jspb.Message.setField(this, 6, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.addActions = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 6, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.clearActionsList = function() {
  return this.setActionsList([]);
};


/**
 * optional bool is_concluded = 7;
 * @return {boolean}
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.getIsConcluded = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 7, false));
};


/**
 * @param {boolean} value
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop} returns this
 */
proto.quicksilver.airdrop.v1.ZoneDrop.prototype.setIsConcluded = function(value) {
  return jspb.Message.setProto3BooleanField(this, 7, value);
};

