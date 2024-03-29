// source: cosmos/auth/v1beta1/auth.proto
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

goog.provide('proto.cosmos.auth.v1beta1.ModuleCredential');

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
proto.cosmos.auth.v1beta1.ModuleCredential = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.auth.v1beta1.ModuleCredential.repeatedFields_, null);
};
goog.inherits(proto.cosmos.auth.v1beta1.ModuleCredential, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.auth.v1beta1.ModuleCredential.displayName = 'proto.cosmos.auth.v1beta1.ModuleCredential';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.auth.v1beta1.ModuleCredential.repeatedFields_ = [2];



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
proto.cosmos.auth.v1beta1.ModuleCredential.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.auth.v1beta1.ModuleCredential.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.auth.v1beta1.ModuleCredential} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.auth.v1beta1.ModuleCredential.toObject = function(includeInstance, msg) {
  var f, obj = {
    moduleName: jspb.Message.getFieldWithDefault(msg, 1, ""),
    derivationKeysList: msg.getDerivationKeysList_asB64()
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
 * @return {!proto.cosmos.auth.v1beta1.ModuleCredential}
 */
proto.cosmos.auth.v1beta1.ModuleCredential.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.auth.v1beta1.ModuleCredential;
  return proto.cosmos.auth.v1beta1.ModuleCredential.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.auth.v1beta1.ModuleCredential} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.auth.v1beta1.ModuleCredential}
 */
proto.cosmos.auth.v1beta1.ModuleCredential.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setModuleName(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addDerivationKeys(value);
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
proto.cosmos.auth.v1beta1.ModuleCredential.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.auth.v1beta1.ModuleCredential.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.auth.v1beta1.ModuleCredential} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.auth.v1beta1.ModuleCredential.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getModuleName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDerivationKeysList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      2,
      f
    );
  }
};


/**
 * optional string module_name = 1;
 * @return {string}
 */
proto.cosmos.auth.v1beta1.ModuleCredential.prototype.getModuleName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.auth.v1beta1.ModuleCredential} returns this
 */
proto.cosmos.auth.v1beta1.ModuleCredential.prototype.setModuleName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated bytes derivation_keys = 2;
 * @return {!Array<string>}
 */
proto.cosmos.auth.v1beta1.ModuleCredential.prototype.getDerivationKeysList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * repeated bytes derivation_keys = 2;
 * This is a type-conversion wrapper around `getDerivationKeysList()`
 * @return {!Array<string>}
 */
proto.cosmos.auth.v1beta1.ModuleCredential.prototype.getDerivationKeysList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getDerivationKeysList()));
};


/**
 * repeated bytes derivation_keys = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getDerivationKeysList()`
 * @return {!Array<!Uint8Array>}
 */
proto.cosmos.auth.v1beta1.ModuleCredential.prototype.getDerivationKeysList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getDerivationKeysList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.cosmos.auth.v1beta1.ModuleCredential} returns this
 */
proto.cosmos.auth.v1beta1.ModuleCredential.prototype.setDerivationKeysList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.cosmos.auth.v1beta1.ModuleCredential} returns this
 */
proto.cosmos.auth.v1beta1.ModuleCredential.prototype.addDerivationKeys = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.auth.v1beta1.ModuleCredential} returns this
 */
proto.cosmos.auth.v1beta1.ModuleCredential.prototype.clearDerivationKeysList = function() {
  return this.setDerivationKeysList([]);
};


