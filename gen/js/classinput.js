// source: likechain/likenft/v1/class_input.proto
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

goog.provide('proto.likechain.likenft.v1.ClassInput');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.likechain.likenft.v1.ClassConfig');

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
proto.likechain.likenft.v1.ClassInput = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.likechain.likenft.v1.ClassInput, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.likenft.v1.ClassInput.displayName = 'proto.likechain.likenft.v1.ClassInput';
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
proto.likechain.likenft.v1.ClassInput.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.likenft.v1.ClassInput.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.likenft.v1.ClassInput} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.ClassInput.toObject = function(includeInstance, msg) {
  var f, obj = {
    name: jspb.Message.getFieldWithDefault(msg, 1, ""),
    symbol: jspb.Message.getFieldWithDefault(msg, 2, ""),
    description: jspb.Message.getFieldWithDefault(msg, 3, ""),
    uri: jspb.Message.getFieldWithDefault(msg, 4, ""),
    uriHash: jspb.Message.getFieldWithDefault(msg, 5, ""),
    metadata: msg.getMetadata_asB64(),
    config: (f = msg.getConfig()) && proto.likechain.likenft.v1.ClassConfig.toObject(includeInstance, f)
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
 * @return {!proto.likechain.likenft.v1.ClassInput}
 */
proto.likechain.likenft.v1.ClassInput.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.likenft.v1.ClassInput;
  return proto.likechain.likenft.v1.ClassInput.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.likenft.v1.ClassInput} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.likenft.v1.ClassInput}
 */
proto.likechain.likenft.v1.ClassInput.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setSymbol(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setUri(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setUriHash(value);
      break;
    case 6:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMetadata(value);
      break;
    case 7:
      var value = new proto.likechain.likenft.v1.ClassConfig;
      reader.readMessage(value,proto.likechain.likenft.v1.ClassConfig.deserializeBinaryFromReader);
      msg.setConfig(value);
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
proto.likechain.likenft.v1.ClassInput.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.likenft.v1.ClassInput.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.likenft.v1.ClassInput} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.ClassInput.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSymbol();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getUri();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getUriHash();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getMetadata_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      6,
      f
    );
  }
  f = message.getConfig();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.likechain.likenft.v1.ClassConfig.serializeBinaryToWriter
    );
  }
};


/**
 * optional string name = 1;
 * @return {string}
 */
proto.likechain.likenft.v1.ClassInput.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.ClassInput} returns this
 */
proto.likechain.likenft.v1.ClassInput.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string symbol = 2;
 * @return {string}
 */
proto.likechain.likenft.v1.ClassInput.prototype.getSymbol = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.ClassInput} returns this
 */
proto.likechain.likenft.v1.ClassInput.prototype.setSymbol = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string description = 3;
 * @return {string}
 */
proto.likechain.likenft.v1.ClassInput.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.ClassInput} returns this
 */
proto.likechain.likenft.v1.ClassInput.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string uri = 4;
 * @return {string}
 */
proto.likechain.likenft.v1.ClassInput.prototype.getUri = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.ClassInput} returns this
 */
proto.likechain.likenft.v1.ClassInput.prototype.setUri = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string uri_hash = 5;
 * @return {string}
 */
proto.likechain.likenft.v1.ClassInput.prototype.getUriHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.ClassInput} returns this
 */
proto.likechain.likenft.v1.ClassInput.prototype.setUriHash = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional bytes metadata = 6;
 * @return {string}
 */
proto.likechain.likenft.v1.ClassInput.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * optional bytes metadata = 6;
 * This is a type-conversion wrapper around `getMetadata()`
 * @return {string}
 */
proto.likechain.likenft.v1.ClassInput.prototype.getMetadata_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMetadata()));
};


/**
 * optional bytes metadata = 6;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMetadata()`
 * @return {!Uint8Array}
 */
proto.likechain.likenft.v1.ClassInput.prototype.getMetadata_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMetadata()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.likechain.likenft.v1.ClassInput} returns this
 */
proto.likechain.likenft.v1.ClassInput.prototype.setMetadata = function(value) {
  return jspb.Message.setProto3BytesField(this, 6, value);
};


/**
 * optional ClassConfig config = 7;
 * @return {?proto.likechain.likenft.v1.ClassConfig}
 */
proto.likechain.likenft.v1.ClassInput.prototype.getConfig = function() {
  return /** @type{?proto.likechain.likenft.v1.ClassConfig} */ (
    jspb.Message.getWrapperField(this, proto.likechain.likenft.v1.ClassConfig, 7));
};


/**
 * @param {?proto.likechain.likenft.v1.ClassConfig|undefined} value
 * @return {!proto.likechain.likenft.v1.ClassInput} returns this
*/
proto.likechain.likenft.v1.ClassInput.prototype.setConfig = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.likechain.likenft.v1.ClassInput} returns this
 */
proto.likechain.likenft.v1.ClassInput.prototype.clearConfig = function() {
  return this.setConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.likechain.likenft.v1.ClassInput.prototype.hasConfig = function() {
  return jspb.Message.getField(this, 7) != null;
};


