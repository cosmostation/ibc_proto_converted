// source: injective/ocr/v1beta1/ocr.proto
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

goog.provide('proto.injective.ocr.v1beta1.FeedConfig');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.ocr.v1beta1.ModuleParams');

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
proto.injective.ocr.v1beta1.FeedConfig = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.ocr.v1beta1.FeedConfig.repeatedFields_, null);
};
goog.inherits(proto.injective.ocr.v1beta1.FeedConfig, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.ocr.v1beta1.FeedConfig.displayName = 'proto.injective.ocr.v1beta1.FeedConfig';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.ocr.v1beta1.FeedConfig.repeatedFields_ = [1,2];



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
proto.injective.ocr.v1beta1.FeedConfig.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.ocr.v1beta1.FeedConfig.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.ocr.v1beta1.FeedConfig} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.FeedConfig.toObject = function(includeInstance, msg) {
  var f, obj = {
    signersList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
    transmittersList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    f: jspb.Message.getFieldWithDefault(msg, 3, 0),
    onchainConfig: msg.getOnchainConfig_asB64(),
    offchainConfigVersion: jspb.Message.getFieldWithDefault(msg, 5, 0),
    offchainConfig: msg.getOffchainConfig_asB64(),
    moduleParams: (f = msg.getModuleParams()) && proto.injective.ocr.v1beta1.ModuleParams.toObject(includeInstance, f)
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
 * @return {!proto.injective.ocr.v1beta1.FeedConfig}
 */
proto.injective.ocr.v1beta1.FeedConfig.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.ocr.v1beta1.FeedConfig;
  return proto.injective.ocr.v1beta1.FeedConfig.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.ocr.v1beta1.FeedConfig} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.ocr.v1beta1.FeedConfig}
 */
proto.injective.ocr.v1beta1.FeedConfig.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addSigners(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addTransmitters(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setF(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setOnchainConfig(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setOffchainConfigVersion(value);
      break;
    case 6:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setOffchainConfig(value);
      break;
    case 7:
      var value = new proto.injective.ocr.v1beta1.ModuleParams;
      reader.readMessage(value,proto.injective.ocr.v1beta1.ModuleParams.deserializeBinaryFromReader);
      msg.setModuleParams(value);
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
proto.injective.ocr.v1beta1.FeedConfig.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.ocr.v1beta1.FeedConfig.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.ocr.v1beta1.FeedConfig} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.FeedConfig.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSignersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
  f = message.getTransmittersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getF();
  if (f !== 0) {
    writer.writeUint32(
      3,
      f
    );
  }
  f = message.getOnchainConfig_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getOffchainConfigVersion();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getOffchainConfig_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      6,
      f
    );
  }
  f = message.getModuleParams();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.injective.ocr.v1beta1.ModuleParams.serializeBinaryToWriter
    );
  }
};


/**
 * repeated string signers = 1;
 * @return {!Array<string>}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.getSignersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.setSignersList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.addSigners = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.clearSignersList = function() {
  return this.setSignersList([]);
};


/**
 * repeated string transmitters = 2;
 * @return {!Array<string>}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.getTransmittersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.setTransmittersList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.addTransmitters = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.clearTransmittersList = function() {
  return this.setTransmittersList([]);
};


/**
 * optional uint32 f = 3;
 * @return {number}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.getF = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.setF = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional bytes onchain_config = 4;
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.getOnchainConfig = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes onchain_config = 4;
 * This is a type-conversion wrapper around `getOnchainConfig()`
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.getOnchainConfig_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getOnchainConfig()));
};


/**
 * optional bytes onchain_config = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getOnchainConfig()`
 * @return {!Uint8Array}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.getOnchainConfig_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getOnchainConfig()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.setOnchainConfig = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional uint64 offchain_config_version = 5;
 * @return {number}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.getOffchainConfigVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.setOffchainConfigVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional bytes offchain_config = 6;
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.getOffchainConfig = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * optional bytes offchain_config = 6;
 * This is a type-conversion wrapper around `getOffchainConfig()`
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.getOffchainConfig_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getOffchainConfig()));
};


/**
 * optional bytes offchain_config = 6;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getOffchainConfig()`
 * @return {!Uint8Array}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.getOffchainConfig_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getOffchainConfig()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.setOffchainConfig = function(value) {
  return jspb.Message.setProto3BytesField(this, 6, value);
};


/**
 * optional ModuleParams module_params = 7;
 * @return {?proto.injective.ocr.v1beta1.ModuleParams}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.getModuleParams = function() {
  return /** @type{?proto.injective.ocr.v1beta1.ModuleParams} */ (
    jspb.Message.getWrapperField(this, proto.injective.ocr.v1beta1.ModuleParams, 7));
};


/**
 * @param {?proto.injective.ocr.v1beta1.ModuleParams|undefined} value
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
*/
proto.injective.ocr.v1beta1.FeedConfig.prototype.setModuleParams = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.ocr.v1beta1.FeedConfig} returns this
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.clearModuleParams = function() {
  return this.setModuleParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.ocr.v1beta1.FeedConfig.prototype.hasModuleParams = function() {
  return jspb.Message.getField(this, 7) != null;
};


