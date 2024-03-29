// source: provenance/metadata/v1/metadata.proto
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

goog.provide('proto.provenance.metadata.v1.SessionIdInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.ScopeIdInfo');

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
proto.provenance.metadata.v1.SessionIdInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.provenance.metadata.v1.SessionIdInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.SessionIdInfo.displayName = 'proto.provenance.metadata.v1.SessionIdInfo';
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
proto.provenance.metadata.v1.SessionIdInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.SessionIdInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.SessionIdInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.SessionIdInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    sessionId: msg.getSessionId_asB64(),
    sessionIdPrefix: msg.getSessionIdPrefix_asB64(),
    sessionIdScopeUuid: msg.getSessionIdScopeUuid_asB64(),
    sessionIdSessionUuid: msg.getSessionIdSessionUuid_asB64(),
    sessionAddr: jspb.Message.getFieldWithDefault(msg, 5, ""),
    sessionUuid: jspb.Message.getFieldWithDefault(msg, 6, ""),
    scopeIdInfo: (f = msg.getScopeIdInfo()) && proto.provenance.metadata.v1.ScopeIdInfo.toObject(includeInstance, f)
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
 * @return {!proto.provenance.metadata.v1.SessionIdInfo}
 */
proto.provenance.metadata.v1.SessionIdInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.SessionIdInfo;
  return proto.provenance.metadata.v1.SessionIdInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.SessionIdInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.SessionIdInfo}
 */
proto.provenance.metadata.v1.SessionIdInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSessionId(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSessionIdPrefix(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSessionIdScopeUuid(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSessionIdSessionUuid(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSessionAddr(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setSessionUuid(value);
      break;
    case 7:
      var value = new proto.provenance.metadata.v1.ScopeIdInfo;
      reader.readMessage(value,proto.provenance.metadata.v1.ScopeIdInfo.deserializeBinaryFromReader);
      msg.setScopeIdInfo(value);
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
proto.provenance.metadata.v1.SessionIdInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.SessionIdInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.SessionIdInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.SessionIdInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSessionId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getSessionIdPrefix_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getSessionIdScopeUuid_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getSessionIdSessionUuid_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getSessionAddr();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getSessionUuid();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getScopeIdInfo();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.provenance.metadata.v1.ScopeIdInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes session_id = 1;
 * @return {string}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes session_id = 1;
 * This is a type-conversion wrapper around `getSessionId()`
 * @return {string}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSessionId()));
};


/**
 * optional bytes session_id = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSessionId()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSessionId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.SessionIdInfo} returns this
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.setSessionId = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes session_id_prefix = 2;
 * @return {string}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionIdPrefix = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes session_id_prefix = 2;
 * This is a type-conversion wrapper around `getSessionIdPrefix()`
 * @return {string}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionIdPrefix_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSessionIdPrefix()));
};


/**
 * optional bytes session_id_prefix = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSessionIdPrefix()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionIdPrefix_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSessionIdPrefix()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.SessionIdInfo} returns this
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.setSessionIdPrefix = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional bytes session_id_scope_uuid = 3;
 * @return {string}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionIdScopeUuid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes session_id_scope_uuid = 3;
 * This is a type-conversion wrapper around `getSessionIdScopeUuid()`
 * @return {string}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionIdScopeUuid_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSessionIdScopeUuid()));
};


/**
 * optional bytes session_id_scope_uuid = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSessionIdScopeUuid()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionIdScopeUuid_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSessionIdScopeUuid()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.SessionIdInfo} returns this
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.setSessionIdScopeUuid = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional bytes session_id_session_uuid = 4;
 * @return {string}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionIdSessionUuid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes session_id_session_uuid = 4;
 * This is a type-conversion wrapper around `getSessionIdSessionUuid()`
 * @return {string}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionIdSessionUuid_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSessionIdSessionUuid()));
};


/**
 * optional bytes session_id_session_uuid = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSessionIdSessionUuid()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionIdSessionUuid_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSessionIdSessionUuid()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.SessionIdInfo} returns this
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.setSessionIdSessionUuid = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional string session_addr = 5;
 * @return {string}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionAddr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.SessionIdInfo} returns this
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.setSessionAddr = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string session_uuid = 6;
 * @return {string}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getSessionUuid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.SessionIdInfo} returns this
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.setSessionUuid = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional ScopeIdInfo scope_id_info = 7;
 * @return {?proto.provenance.metadata.v1.ScopeIdInfo}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.getScopeIdInfo = function() {
  return /** @type{?proto.provenance.metadata.v1.ScopeIdInfo} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.ScopeIdInfo, 7));
};


/**
 * @param {?proto.provenance.metadata.v1.ScopeIdInfo|undefined} value
 * @return {!proto.provenance.metadata.v1.SessionIdInfo} returns this
*/
proto.provenance.metadata.v1.SessionIdInfo.prototype.setScopeIdInfo = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.SessionIdInfo} returns this
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.clearScopeIdInfo = function() {
  return this.setScopeIdInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.SessionIdInfo.prototype.hasScopeIdInfo = function() {
  return jspb.Message.getField(this, 7) != null;
};


