// source: dymension/rollapp/rollapp.proto
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

goog.provide('proto.dymensionxyz.dymension.rollapp.Rollapp');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.dymensionxyz.dymension.rollapp.TokenMetadata');

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
proto.dymensionxyz.dymension.rollapp.Rollapp = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.dymensionxyz.dymension.rollapp.Rollapp.repeatedFields_, null);
};
goog.inherits(proto.dymensionxyz.dymension.rollapp.Rollapp, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.dymensionxyz.dymension.rollapp.Rollapp.displayName = 'proto.dymensionxyz.dymension.rollapp.Rollapp';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.repeatedFields_ = [8,9];



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
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.toObject = function(opt_includeInstance) {
  return proto.dymensionxyz.dymension.rollapp.Rollapp.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.dymensionxyz.dymension.rollapp.Rollapp} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.toObject = function(includeInstance, msg) {
  var f, obj = {
    rollappid: jspb.Message.getFieldWithDefault(msg, 1, ""),
    creator: jspb.Message.getFieldWithDefault(msg, 2, ""),
    version: jspb.Message.getFieldWithDefault(msg, 3, 0),
    codestamp: jspb.Message.getFieldWithDefault(msg, 4, ""),
    genesispath: jspb.Message.getFieldWithDefault(msg, 5, ""),
    maxwithholdingblocks: jspb.Message.getFieldWithDefault(msg, 6, 0),
    maxsequencers: jspb.Message.getFieldWithDefault(msg, 7, 0),
    permissionedaddressesList: (f = jspb.Message.getRepeatedField(msg, 8)) == null ? undefined : f,
    tokenmetadataList: jspb.Message.toObjectList(msg.getTokenmetadataList(),
    proto.dymensionxyz.dymension.rollapp.TokenMetadata.toObject, includeInstance)
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
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.dymensionxyz.dymension.rollapp.Rollapp;
  return proto.dymensionxyz.dymension.rollapp.Rollapp.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.dymensionxyz.dymension.rollapp.Rollapp} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRollappid(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setVersion(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setCodestamp(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setGenesispath(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxwithholdingblocks(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxsequencers(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.addPermissionedaddresses(value);
      break;
    case 9:
      var value = new proto.dymensionxyz.dymension.rollapp.TokenMetadata;
      reader.readMessage(value,proto.dymensionxyz.dymension.rollapp.TokenMetadata.deserializeBinaryFromReader);
      msg.addTokenmetadata(value);
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
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.dymensionxyz.dymension.rollapp.Rollapp.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.dymensionxyz.dymension.rollapp.Rollapp} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRollappid();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getVersion();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getCodestamp();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getGenesispath();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getMaxwithholdingblocks();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getMaxsequencers();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getPermissionedaddressesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      8,
      f
    );
  }
  f = message.getTokenmetadataList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      9,
      f,
      proto.dymensionxyz.dymension.rollapp.TokenMetadata.serializeBinaryToWriter
    );
  }
};


/**
 * optional string rollappId = 1;
 * @return {string}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.getRollappid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.setRollappid = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string creator = 2;
 * @return {string}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 version = 3;
 * @return {number}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.getVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.setVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string codeStamp = 4;
 * @return {string}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.getCodestamp = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.setCodestamp = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string genesisPath = 5;
 * @return {string}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.getGenesispath = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.setGenesispath = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional uint64 maxWithholdingBlocks = 6;
 * @return {number}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.getMaxwithholdingblocks = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.setMaxwithholdingblocks = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional uint64 maxSequencers = 7;
 * @return {number}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.getMaxsequencers = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.setMaxsequencers = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * repeated string permissionedAddresses = 8;
 * @return {!Array<string>}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.getPermissionedaddressesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 8));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.setPermissionedaddressesList = function(value) {
  return jspb.Message.setField(this, 8, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.addPermissionedaddresses = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 8, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.clearPermissionedaddressesList = function() {
  return this.setPermissionedaddressesList([]);
};


/**
 * repeated TokenMetadata tokenMetadata = 9;
 * @return {!Array<!proto.dymensionxyz.dymension.rollapp.TokenMetadata>}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.getTokenmetadataList = function() {
  return /** @type{!Array<!proto.dymensionxyz.dymension.rollapp.TokenMetadata>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.dymensionxyz.dymension.rollapp.TokenMetadata, 9));
};


/**
 * @param {!Array<!proto.dymensionxyz.dymension.rollapp.TokenMetadata>} value
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
*/
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.setTokenmetadataList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 9, value);
};


/**
 * @param {!proto.dymensionxyz.dymension.rollapp.TokenMetadata=} opt_value
 * @param {number=} opt_index
 * @return {!proto.dymensionxyz.dymension.rollapp.TokenMetadata}
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.addTokenmetadata = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 9, opt_value, proto.dymensionxyz.dymension.rollapp.TokenMetadata, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.dymensionxyz.dymension.rollapp.Rollapp} returns this
 */
proto.dymensionxyz.dymension.rollapp.Rollapp.prototype.clearTokenmetadataList = function() {
  return this.setTokenmetadataList([]);
};


