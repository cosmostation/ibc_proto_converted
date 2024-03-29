// source: likechain/iscn/genesis.proto
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

goog.provide('proto.likechain.iscn.GenesisState');
goog.provide('proto.likechain.iscn.GenesisState.ContentIdRecord');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.likechain.iscn.Params');

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
proto.likechain.iscn.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.likechain.iscn.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.likechain.iscn.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.iscn.GenesisState.displayName = 'proto.likechain.iscn.GenesisState';
}
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
proto.likechain.iscn.GenesisState.ContentIdRecord = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.likechain.iscn.GenesisState.ContentIdRecord, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.iscn.GenesisState.ContentIdRecord.displayName = 'proto.likechain.iscn.GenesisState.ContentIdRecord';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.likechain.iscn.GenesisState.repeatedFields_ = [2,3];



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
proto.likechain.iscn.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.iscn.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.iscn.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.iscn.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.likechain.iscn.Params.toObject(includeInstance, f),
    contentIdRecordsList: jspb.Message.toObjectList(msg.getContentIdRecordsList(),
    proto.likechain.iscn.GenesisState.ContentIdRecord.toObject, includeInstance),
    iscnRecordsList: msg.getIscnRecordsList_asB64()
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
 * @return {!proto.likechain.iscn.GenesisState}
 */
proto.likechain.iscn.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.iscn.GenesisState;
  return proto.likechain.iscn.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.iscn.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.iscn.GenesisState}
 */
proto.likechain.iscn.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.likechain.iscn.Params;
      reader.readMessage(value,proto.likechain.iscn.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.likechain.iscn.GenesisState.ContentIdRecord;
      reader.readMessage(value,proto.likechain.iscn.GenesisState.ContentIdRecord.deserializeBinaryFromReader);
      msg.addContentIdRecords(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addIscnRecords(value);
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
proto.likechain.iscn.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.iscn.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.iscn.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.iscn.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.likechain.iscn.Params.serializeBinaryToWriter
    );
  }
  f = message.getContentIdRecordsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.likechain.iscn.GenesisState.ContentIdRecord.serializeBinaryToWriter
    );
  }
  f = message.getIscnRecordsList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      3,
      f
    );
  }
};





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
proto.likechain.iscn.GenesisState.ContentIdRecord.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.iscn.GenesisState.ContentIdRecord.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.iscn.GenesisState.ContentIdRecord} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.iscn.GenesisState.ContentIdRecord.toObject = function(includeInstance, msg) {
  var f, obj = {
    iscnId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    owner: jspb.Message.getFieldWithDefault(msg, 2, ""),
    latestVersion: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.likechain.iscn.GenesisState.ContentIdRecord}
 */
proto.likechain.iscn.GenesisState.ContentIdRecord.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.iscn.GenesisState.ContentIdRecord;
  return proto.likechain.iscn.GenesisState.ContentIdRecord.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.iscn.GenesisState.ContentIdRecord} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.iscn.GenesisState.ContentIdRecord}
 */
proto.likechain.iscn.GenesisState.ContentIdRecord.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setIscnId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLatestVersion(value);
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
proto.likechain.iscn.GenesisState.ContentIdRecord.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.iscn.GenesisState.ContentIdRecord.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.iscn.GenesisState.ContentIdRecord} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.iscn.GenesisState.ContentIdRecord.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIscnId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getLatestVersion();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
};


/**
 * optional string iscn_id = 1;
 * @return {string}
 */
proto.likechain.iscn.GenesisState.ContentIdRecord.prototype.getIscnId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.iscn.GenesisState.ContentIdRecord} returns this
 */
proto.likechain.iscn.GenesisState.ContentIdRecord.prototype.setIscnId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string owner = 2;
 * @return {string}
 */
proto.likechain.iscn.GenesisState.ContentIdRecord.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.iscn.GenesisState.ContentIdRecord} returns this
 */
proto.likechain.iscn.GenesisState.ContentIdRecord.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 latest_version = 3;
 * @return {number}
 */
proto.likechain.iscn.GenesisState.ContentIdRecord.prototype.getLatestVersion = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.likechain.iscn.GenesisState.ContentIdRecord} returns this
 */
proto.likechain.iscn.GenesisState.ContentIdRecord.prototype.setLatestVersion = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional Params params = 1;
 * @return {?proto.likechain.iscn.Params}
 */
proto.likechain.iscn.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.likechain.iscn.Params} */ (
    jspb.Message.getWrapperField(this, proto.likechain.iscn.Params, 1));
};


/**
 * @param {?proto.likechain.iscn.Params|undefined} value
 * @return {!proto.likechain.iscn.GenesisState} returns this
*/
proto.likechain.iscn.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.likechain.iscn.GenesisState} returns this
 */
proto.likechain.iscn.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.likechain.iscn.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated ContentIdRecord content_id_records = 2;
 * @return {!Array<!proto.likechain.iscn.GenesisState.ContentIdRecord>}
 */
proto.likechain.iscn.GenesisState.prototype.getContentIdRecordsList = function() {
  return /** @type{!Array<!proto.likechain.iscn.GenesisState.ContentIdRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.likechain.iscn.GenesisState.ContentIdRecord, 2));
};


/**
 * @param {!Array<!proto.likechain.iscn.GenesisState.ContentIdRecord>} value
 * @return {!proto.likechain.iscn.GenesisState} returns this
*/
proto.likechain.iscn.GenesisState.prototype.setContentIdRecordsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.likechain.iscn.GenesisState.ContentIdRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.likechain.iscn.GenesisState.ContentIdRecord}
 */
proto.likechain.iscn.GenesisState.prototype.addContentIdRecords = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.likechain.iscn.GenesisState.ContentIdRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.likechain.iscn.GenesisState} returns this
 */
proto.likechain.iscn.GenesisState.prototype.clearContentIdRecordsList = function() {
  return this.setContentIdRecordsList([]);
};


/**
 * repeated bytes iscn_records = 3;
 * @return {!Array<string>}
 */
proto.likechain.iscn.GenesisState.prototype.getIscnRecordsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * repeated bytes iscn_records = 3;
 * This is a type-conversion wrapper around `getIscnRecordsList()`
 * @return {!Array<string>}
 */
proto.likechain.iscn.GenesisState.prototype.getIscnRecordsList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getIscnRecordsList()));
};


/**
 * repeated bytes iscn_records = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getIscnRecordsList()`
 * @return {!Array<!Uint8Array>}
 */
proto.likechain.iscn.GenesisState.prototype.getIscnRecordsList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getIscnRecordsList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.likechain.iscn.GenesisState} returns this
 */
proto.likechain.iscn.GenesisState.prototype.setIscnRecordsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.likechain.iscn.GenesisState} returns this
 */
proto.likechain.iscn.GenesisState.prototype.addIscnRecords = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.likechain.iscn.GenesisState} returns this
 */
proto.likechain.iscn.GenesisState.prototype.clearIscnRecordsList = function() {
  return this.setIscnRecordsList([]);
};


