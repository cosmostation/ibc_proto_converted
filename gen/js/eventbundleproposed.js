// source: kyve/bundles/v1beta1/events.proto
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

goog.provide('proto.kyve.bundles.v1beta1.EventBundleProposed');

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
proto.kyve.bundles.v1beta1.EventBundleProposed = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.bundles.v1beta1.EventBundleProposed, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.bundles.v1beta1.EventBundleProposed.displayName = 'proto.kyve.bundles.v1beta1.EventBundleProposed';
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
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.bundles.v1beta1.EventBundleProposed.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.bundles.v1beta1.EventBundleProposed} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    id: jspb.Message.getFieldWithDefault(msg, 2, 0),
    storageId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    uploader: jspb.Message.getFieldWithDefault(msg, 4, ""),
    dataSize: jspb.Message.getFieldWithDefault(msg, 5, 0),
    fromIndex: jspb.Message.getFieldWithDefault(msg, 6, 0),
    bundleSize: jspb.Message.getFieldWithDefault(msg, 7, 0),
    fromKey: jspb.Message.getFieldWithDefault(msg, 8, ""),
    toKey: jspb.Message.getFieldWithDefault(msg, 9, ""),
    bundleSummary: jspb.Message.getFieldWithDefault(msg, 10, ""),
    dataHash: jspb.Message.getFieldWithDefault(msg, 11, ""),
    proposedAt: jspb.Message.getFieldWithDefault(msg, 12, 0),
    storageProviderId: jspb.Message.getFieldWithDefault(msg, 13, 0),
    compressionId: jspb.Message.getFieldWithDefault(msg, 14, 0)
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
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.bundles.v1beta1.EventBundleProposed;
  return proto.kyve.bundles.v1beta1.EventBundleProposed.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.bundles.v1beta1.EventBundleProposed} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setStorageId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setUploader(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDataSize(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setFromIndex(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBundleSize(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setFromKey(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setToKey(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setBundleSummary(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.setDataHash(value);
      break;
    case 12:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setProposedAt(value);
      break;
    case 13:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setStorageProviderId(value);
      break;
    case 14:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setCompressionId(value);
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
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.bundles.v1beta1.EventBundleProposed.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.bundles.v1beta1.EventBundleProposed} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getStorageId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getUploader();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getDataSize();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getFromIndex();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getBundleSize();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getFromKey();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getToKey();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getBundleSummary();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getDataHash();
  if (f.length > 0) {
    writer.writeString(
      11,
      f
    );
  }
  f = message.getProposedAt();
  if (f !== 0) {
    writer.writeUint64(
      12,
      f
    );
  }
  f = message.getStorageProviderId();
  if (f !== 0) {
    writer.writeUint32(
      13,
      f
    );
  }
  f = message.getCompressionId();
  if (f !== 0) {
    writer.writeUint32(
      14,
      f
    );
  }
};


/**
 * optional uint64 pool_id = 1;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 id = 2;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string storage_id = 3;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getStorageId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setStorageId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string uploader = 4;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getUploader = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setUploader = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional uint64 data_size = 5;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getDataSize = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setDataSize = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional uint64 from_index = 6;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getFromIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setFromIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional uint64 bundle_size = 7;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getBundleSize = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setBundleSize = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional string from_key = 8;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getFromKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setFromKey = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string to_key = 9;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getToKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setToKey = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional string bundle_summary = 10;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getBundleSummary = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setBundleSummary = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * optional string data_hash = 11;
 * @return {string}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getDataHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setDataHash = function(value) {
  return jspb.Message.setProto3StringField(this, 11, value);
};


/**
 * optional uint64 proposed_at = 12;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getProposedAt = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setProposedAt = function(value) {
  return jspb.Message.setProto3IntField(this, 12, value);
};


/**
 * optional uint32 storage_provider_id = 13;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getStorageProviderId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 13, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setStorageProviderId = function(value) {
  return jspb.Message.setProto3IntField(this, 13, value);
};


/**
 * optional uint32 compression_id = 14;
 * @return {number}
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.getCompressionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 14, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.bundles.v1beta1.EventBundleProposed} returns this
 */
proto.kyve.bundles.v1beta1.EventBundleProposed.prototype.setCompressionId = function(value) {
  return jspb.Message.setProto3IntField(this, 14, value);
};


