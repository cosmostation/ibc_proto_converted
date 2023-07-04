// source: cosmos/slashing/v1beta1/slashing.proto
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

goog.provide('proto.cosmos.slashing.v1beta1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');

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
proto.cosmos.slashing.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.slashing.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.slashing.v1beta1.Params.displayName = 'proto.cosmos.slashing.v1beta1.Params';
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
proto.cosmos.slashing.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.slashing.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.slashing.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.slashing.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    signedBlocksWindow: jspb.Message.getFieldWithDefault(msg, 1, 0),
    minSignedPerWindow: msg.getMinSignedPerWindow_asB64(),
    downtimeJailDuration: (f = msg.getDowntimeJailDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    slashFractionDoubleSign: msg.getSlashFractionDoubleSign_asB64(),
    slashFractionDowntime: msg.getSlashFractionDowntime_asB64()
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
 * @return {!proto.cosmos.slashing.v1beta1.Params}
 */
proto.cosmos.slashing.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.slashing.v1beta1.Params;
  return proto.cosmos.slashing.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.slashing.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.slashing.v1beta1.Params}
 */
proto.cosmos.slashing.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setSignedBlocksWindow(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMinSignedPerWindow(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setDowntimeJailDuration(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSlashFractionDoubleSign(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSlashFractionDowntime(value);
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
proto.cosmos.slashing.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.slashing.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.slashing.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.slashing.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSignedBlocksWindow();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getMinSignedPerWindow_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getDowntimeJailDuration();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getSlashFractionDoubleSign_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getSlashFractionDowntime_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
};


/**
 * optional int64 signed_blocks_window = 1;
 * @return {number}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.getSignedBlocksWindow = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.slashing.v1beta1.Params} returns this
 */
proto.cosmos.slashing.v1beta1.Params.prototype.setSignedBlocksWindow = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional bytes min_signed_per_window = 2;
 * @return {string}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.getMinSignedPerWindow = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes min_signed_per_window = 2;
 * This is a type-conversion wrapper around `getMinSignedPerWindow()`
 * @return {string}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.getMinSignedPerWindow_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMinSignedPerWindow()));
};


/**
 * optional bytes min_signed_per_window = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMinSignedPerWindow()`
 * @return {!Uint8Array}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.getMinSignedPerWindow_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMinSignedPerWindow()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmos.slashing.v1beta1.Params} returns this
 */
proto.cosmos.slashing.v1beta1.Params.prototype.setMinSignedPerWindow = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional google.protobuf.Duration downtime_jail_duration = 3;
 * @return {?proto.google.protobuf.Duration}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.getDowntimeJailDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 3));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.cosmos.slashing.v1beta1.Params} returns this
*/
proto.cosmos.slashing.v1beta1.Params.prototype.setDowntimeJailDuration = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.slashing.v1beta1.Params} returns this
 */
proto.cosmos.slashing.v1beta1.Params.prototype.clearDowntimeJailDuration = function() {
  return this.setDowntimeJailDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.hasDowntimeJailDuration = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional bytes slash_fraction_double_sign = 4;
 * @return {string}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.getSlashFractionDoubleSign = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes slash_fraction_double_sign = 4;
 * This is a type-conversion wrapper around `getSlashFractionDoubleSign()`
 * @return {string}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.getSlashFractionDoubleSign_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSlashFractionDoubleSign()));
};


/**
 * optional bytes slash_fraction_double_sign = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSlashFractionDoubleSign()`
 * @return {!Uint8Array}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.getSlashFractionDoubleSign_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSlashFractionDoubleSign()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmos.slashing.v1beta1.Params} returns this
 */
proto.cosmos.slashing.v1beta1.Params.prototype.setSlashFractionDoubleSign = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional bytes slash_fraction_downtime = 5;
 * @return {string}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.getSlashFractionDowntime = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes slash_fraction_downtime = 5;
 * This is a type-conversion wrapper around `getSlashFractionDowntime()`
 * @return {string}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.getSlashFractionDowntime_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSlashFractionDowntime()));
};


/**
 * optional bytes slash_fraction_downtime = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSlashFractionDowntime()`
 * @return {!Uint8Array}
 */
proto.cosmos.slashing.v1beta1.Params.prototype.getSlashFractionDowntime_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSlashFractionDowntime()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmos.slashing.v1beta1.Params} returns this
 */
proto.cosmos.slashing.v1beta1.Params.prototype.setSlashFractionDowntime = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};

