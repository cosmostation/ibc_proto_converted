// source: axelar/tss/v1beta1/types.proto
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

goog.provide('proto.axelar.tss.v1beta1.KeygenVoteData');

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
proto.axelar.tss.v1beta1.KeygenVoteData = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.tss.v1beta1.KeygenVoteData, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.tss.v1beta1.KeygenVoteData.displayName = 'proto.axelar.tss.v1beta1.KeygenVoteData';
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
proto.axelar.tss.v1beta1.KeygenVoteData.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.tss.v1beta1.KeygenVoteData.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.tss.v1beta1.KeygenVoteData} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.tss.v1beta1.KeygenVoteData.toObject = function(includeInstance, msg) {
  var f, obj = {
    pubKey: msg.getPubKey_asB64(),
    groupRecoveryInfo: msg.getGroupRecoveryInfo_asB64()
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
 * @return {!proto.axelar.tss.v1beta1.KeygenVoteData}
 */
proto.axelar.tss.v1beta1.KeygenVoteData.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.tss.v1beta1.KeygenVoteData;
  return proto.axelar.tss.v1beta1.KeygenVoteData.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.tss.v1beta1.KeygenVoteData} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.tss.v1beta1.KeygenVoteData}
 */
proto.axelar.tss.v1beta1.KeygenVoteData.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setPubKey(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setGroupRecoveryInfo(value);
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
proto.axelar.tss.v1beta1.KeygenVoteData.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.tss.v1beta1.KeygenVoteData.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.tss.v1beta1.KeygenVoteData} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.tss.v1beta1.KeygenVoteData.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPubKey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getGroupRecoveryInfo_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
};


/**
 * optional bytes pub_key = 1;
 * @return {string}
 */
proto.axelar.tss.v1beta1.KeygenVoteData.prototype.getPubKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes pub_key = 1;
 * This is a type-conversion wrapper around `getPubKey()`
 * @return {string}
 */
proto.axelar.tss.v1beta1.KeygenVoteData.prototype.getPubKey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getPubKey()));
};


/**
 * optional bytes pub_key = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getPubKey()`
 * @return {!Uint8Array}
 */
proto.axelar.tss.v1beta1.KeygenVoteData.prototype.getPubKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getPubKey()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.tss.v1beta1.KeygenVoteData} returns this
 */
proto.axelar.tss.v1beta1.KeygenVoteData.prototype.setPubKey = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes group_recovery_info = 2;
 * @return {string}
 */
proto.axelar.tss.v1beta1.KeygenVoteData.prototype.getGroupRecoveryInfo = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes group_recovery_info = 2;
 * This is a type-conversion wrapper around `getGroupRecoveryInfo()`
 * @return {string}
 */
proto.axelar.tss.v1beta1.KeygenVoteData.prototype.getGroupRecoveryInfo_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getGroupRecoveryInfo()));
};


/**
 * optional bytes group_recovery_info = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getGroupRecoveryInfo()`
 * @return {!Uint8Array}
 */
proto.axelar.tss.v1beta1.KeygenVoteData.prototype.getGroupRecoveryInfo_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getGroupRecoveryInfo()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.tss.v1beta1.KeygenVoteData} returns this
 */
proto.axelar.tss.v1beta1.KeygenVoteData.prototype.setGroupRecoveryInfo = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


