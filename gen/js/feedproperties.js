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

goog.provide('proto.injective.ocr.v1beta1.FeedProperties');

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
proto.injective.ocr.v1beta1.FeedProperties = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.ocr.v1beta1.FeedProperties, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.ocr.v1beta1.FeedProperties.displayName = 'proto.injective.ocr.v1beta1.FeedProperties';
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
proto.injective.ocr.v1beta1.FeedProperties.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.ocr.v1beta1.FeedProperties.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.ocr.v1beta1.FeedProperties} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.FeedProperties.toObject = function(includeInstance, msg) {
  var f, obj = {
    feedId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    f: jspb.Message.getFieldWithDefault(msg, 2, 0),
    onchainConfig: msg.getOnchainConfig_asB64(),
    offchainConfigVersion: jspb.Message.getFieldWithDefault(msg, 4, 0),
    offchainConfig: msg.getOffchainConfig_asB64(),
    minAnswer: jspb.Message.getFieldWithDefault(msg, 6, ""),
    maxAnswer: jspb.Message.getFieldWithDefault(msg, 7, ""),
    linkPerObservation: jspb.Message.getFieldWithDefault(msg, 8, ""),
    linkPerTransmission: jspb.Message.getFieldWithDefault(msg, 9, ""),
    uniqueReports: jspb.Message.getBooleanFieldWithDefault(msg, 10, false),
    description: jspb.Message.getFieldWithDefault(msg, 11, "")
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
 * @return {!proto.injective.ocr.v1beta1.FeedProperties}
 */
proto.injective.ocr.v1beta1.FeedProperties.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.ocr.v1beta1.FeedProperties;
  return proto.injective.ocr.v1beta1.FeedProperties.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.ocr.v1beta1.FeedProperties} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.ocr.v1beta1.FeedProperties}
 */
proto.injective.ocr.v1beta1.FeedProperties.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeedId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setF(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setOnchainConfig(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setOffchainConfigVersion(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setOffchainConfig(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinAnswer(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaxAnswer(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setLinkPerObservation(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setLinkPerTransmission(value);
      break;
    case 10:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setUniqueReports(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
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
proto.injective.ocr.v1beta1.FeedProperties.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.ocr.v1beta1.FeedProperties.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.ocr.v1beta1.FeedProperties} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.FeedProperties.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFeedId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getF();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getOnchainConfig_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getOffchainConfigVersion();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getOffchainConfig_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      5,
      f
    );
  }
  f = message.getMinAnswer();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getMaxAnswer();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getLinkPerObservation();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getLinkPerTransmission();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getUniqueReports();
  if (f) {
    writer.writeBool(
      10,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      11,
      f
    );
  }
};


/**
 * optional string feed_id = 1;
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getFeedId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.FeedProperties} returns this
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.setFeedId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint32 f = 2;
 * @return {number}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getF = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.ocr.v1beta1.FeedProperties} returns this
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.setF = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional bytes onchain_config = 3;
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getOnchainConfig = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes onchain_config = 3;
 * This is a type-conversion wrapper around `getOnchainConfig()`
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getOnchainConfig_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getOnchainConfig()));
};


/**
 * optional bytes onchain_config = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getOnchainConfig()`
 * @return {!Uint8Array}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getOnchainConfig_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getOnchainConfig()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.ocr.v1beta1.FeedProperties} returns this
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.setOnchainConfig = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional uint64 offchain_config_version = 4;
 * @return {number}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getOffchainConfigVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.ocr.v1beta1.FeedProperties} returns this
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.setOffchainConfigVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional bytes offchain_config = 5;
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getOffchainConfig = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * optional bytes offchain_config = 5;
 * This is a type-conversion wrapper around `getOffchainConfig()`
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getOffchainConfig_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getOffchainConfig()));
};


/**
 * optional bytes offchain_config = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getOffchainConfig()`
 * @return {!Uint8Array}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getOffchainConfig_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getOffchainConfig()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.ocr.v1beta1.FeedProperties} returns this
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.setOffchainConfig = function(value) {
  return jspb.Message.setProto3BytesField(this, 5, value);
};


/**
 * optional string min_answer = 6;
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getMinAnswer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.FeedProperties} returns this
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.setMinAnswer = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string max_answer = 7;
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getMaxAnswer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.FeedProperties} returns this
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.setMaxAnswer = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string link_per_observation = 8;
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getLinkPerObservation = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.FeedProperties} returns this
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.setLinkPerObservation = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string link_per_transmission = 9;
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getLinkPerTransmission = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.FeedProperties} returns this
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.setLinkPerTransmission = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional bool unique_reports = 10;
 * @return {boolean}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getUniqueReports = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 10, false));
};


/**
 * @param {boolean} value
 * @return {!proto.injective.ocr.v1beta1.FeedProperties} returns this
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.setUniqueReports = function(value) {
  return jspb.Message.setProto3BooleanField(this, 10, value);
};


/**
 * optional string description = 11;
 * @return {string}
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.FeedProperties} returns this
 */
proto.injective.ocr.v1beta1.FeedProperties.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 11, value);
};


