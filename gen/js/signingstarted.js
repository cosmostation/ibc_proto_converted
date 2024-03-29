// source: axelar/multisig/v1beta1/events.proto
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

goog.provide('proto.axelar.multisig.v1beta1.SigningStarted');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Map');
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
proto.axelar.multisig.v1beta1.SigningStarted = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.multisig.v1beta1.SigningStarted, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.multisig.v1beta1.SigningStarted.displayName = 'proto.axelar.multisig.v1beta1.SigningStarted';
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
proto.axelar.multisig.v1beta1.SigningStarted.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.multisig.v1beta1.SigningStarted.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.multisig.v1beta1.SigningStarted} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.multisig.v1beta1.SigningStarted.toObject = function(includeInstance, msg) {
  var f, obj = {
    module: jspb.Message.getFieldWithDefault(msg, 1, ""),
    sigId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    keyId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    pubKeysMap: (f = msg.getPubKeysMap()) ? f.toObject(includeInstance, undefined) : [],
    payloadHash: msg.getPayloadHash_asB64(),
    requestingModule: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.axelar.multisig.v1beta1.SigningStarted}
 */
proto.axelar.multisig.v1beta1.SigningStarted.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.multisig.v1beta1.SigningStarted;
  return proto.axelar.multisig.v1beta1.SigningStarted.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.multisig.v1beta1.SigningStarted} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.multisig.v1beta1.SigningStarted}
 */
proto.axelar.multisig.v1beta1.SigningStarted.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setModule(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSigId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setKeyId(value);
      break;
    case 4:
      var value = msg.getPubKeysMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readBytes, null, "", "");
         });
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setPayloadHash(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setRequestingModule(value);
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
proto.axelar.multisig.v1beta1.SigningStarted.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.multisig.v1beta1.SigningStarted.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.multisig.v1beta1.SigningStarted} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.multisig.v1beta1.SigningStarted.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getModule();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSigId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getKeyId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPubKeysMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(4, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeBytes);
  }
  f = message.getPayloadHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
  f = message.getRequestingModule();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional string module = 1;
 * @return {string}
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.getModule = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.multisig.v1beta1.SigningStarted} returns this
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.setModule = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 sig_id = 2;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.getSigId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.SigningStarted} returns this
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.setSigId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string key_id = 3;
 * @return {string}
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.getKeyId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.multisig.v1beta1.SigningStarted} returns this
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.setKeyId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * map<string, bytes> pub_keys = 4;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,!(string|Uint8Array)>}
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.getPubKeysMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,!(string|Uint8Array)>} */ (
      jspb.Message.getMapField(this, 4, opt_noLazyCreate,
      null));
};


/**
 * Clears values from the map. The map will be non-null.
 * @return {!proto.axelar.multisig.v1beta1.SigningStarted} returns this
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.clearPubKeysMap = function() {
  this.getPubKeysMap().clear();
  return this;
};


/**
 * optional bytes payload_hash = 5;
 * @return {string}
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.getPayloadHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes payload_hash = 5;
 * This is a type-conversion wrapper around `getPayloadHash()`
 * @return {string}
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.getPayloadHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getPayloadHash()));
};


/**
 * optional bytes payload_hash = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getPayloadHash()`
 * @return {!Uint8Array}
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.getPayloadHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getPayloadHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.multisig.v1beta1.SigningStarted} returns this
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.setPayloadHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


/**
 * optional string requesting_module = 6;
 * @return {string}
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.getRequestingModule = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.multisig.v1beta1.SigningStarted} returns this
 */
proto.axelar.multisig.v1beta1.SigningStarted.prototype.setRequestingModule = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


