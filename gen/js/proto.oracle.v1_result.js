// source: band/oracle/v1/oracle.proto
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

goog.provide('proto.oracle.v1.Result');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.oracle.v1.ResolveStatus');
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
proto.oracle.v1.Result = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.oracle.v1.Result, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.oracle.v1.Result.displayName = 'proto.oracle.v1.Result';
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
proto.oracle.v1.Result.prototype.toObject = function(opt_includeInstance) {
  return proto.oracle.v1.Result.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.oracle.v1.Result} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.oracle.v1.Result.toObject = function(includeInstance, msg) {
  var f, obj = {
    clientId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    oracleScriptId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    calldata: msg.getCalldata_asB64(),
    askCount: jspb.Message.getFieldWithDefault(msg, 4, 0),
    minCount: jspb.Message.getFieldWithDefault(msg, 5, 0),
    requestId: jspb.Message.getFieldWithDefault(msg, 6, 0),
    ansCount: jspb.Message.getFieldWithDefault(msg, 7, 0),
    requestTime: jspb.Message.getFieldWithDefault(msg, 8, 0),
    resolveTime: jspb.Message.getFieldWithDefault(msg, 9, 0),
    resolveStatus: jspb.Message.getFieldWithDefault(msg, 10, 0),
    result: msg.getResult_asB64()
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
 * @return {!proto.oracle.v1.Result}
 */
proto.oracle.v1.Result.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.oracle.v1.Result;
  return proto.oracle.v1.Result.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.oracle.v1.Result} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.oracle.v1.Result}
 */
proto.oracle.v1.Result.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setClientId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setOracleScriptId(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setCalldata(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAskCount(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMinCount(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRequestId(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAnsCount(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setRequestTime(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setResolveTime(value);
      break;
    case 10:
      var value = /** @type {!proto.oracle.v1.ResolveStatus} */ (reader.readEnum());
      msg.setResolveStatus(value);
      break;
    case 11:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setResult(value);
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
proto.oracle.v1.Result.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.oracle.v1.Result.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.oracle.v1.Result} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.oracle.v1.Result.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClientId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getOracleScriptId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getCalldata_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getAskCount();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getMinCount();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getRequestId();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getAnsCount();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getRequestTime();
  if (f !== 0) {
    writer.writeInt64(
      8,
      f
    );
  }
  f = message.getResolveTime();
  if (f !== 0) {
    writer.writeInt64(
      9,
      f
    );
  }
  f = message.getResolveStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      10,
      f
    );
  }
  f = message.getResult_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      11,
      f
    );
  }
};


/**
 * optional string client_id = 1;
 * @return {string}
 */
proto.oracle.v1.Result.prototype.getClientId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.oracle.v1.Result} returns this
 */
proto.oracle.v1.Result.prototype.setClientId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 oracle_script_id = 2;
 * @return {number}
 */
proto.oracle.v1.Result.prototype.getOracleScriptId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.oracle.v1.Result} returns this
 */
proto.oracle.v1.Result.prototype.setOracleScriptId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional bytes calldata = 3;
 * @return {string}
 */
proto.oracle.v1.Result.prototype.getCalldata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes calldata = 3;
 * This is a type-conversion wrapper around `getCalldata()`
 * @return {string}
 */
proto.oracle.v1.Result.prototype.getCalldata_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getCalldata()));
};


/**
 * optional bytes calldata = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getCalldata()`
 * @return {!Uint8Array}
 */
proto.oracle.v1.Result.prototype.getCalldata_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getCalldata()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.oracle.v1.Result} returns this
 */
proto.oracle.v1.Result.prototype.setCalldata = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional uint64 ask_count = 4;
 * @return {number}
 */
proto.oracle.v1.Result.prototype.getAskCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.oracle.v1.Result} returns this
 */
proto.oracle.v1.Result.prototype.setAskCount = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 min_count = 5;
 * @return {number}
 */
proto.oracle.v1.Result.prototype.getMinCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.oracle.v1.Result} returns this
 */
proto.oracle.v1.Result.prototype.setMinCount = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional uint64 request_id = 6;
 * @return {number}
 */
proto.oracle.v1.Result.prototype.getRequestId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.oracle.v1.Result} returns this
 */
proto.oracle.v1.Result.prototype.setRequestId = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional uint64 ans_count = 7;
 * @return {number}
 */
proto.oracle.v1.Result.prototype.getAnsCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.oracle.v1.Result} returns this
 */
proto.oracle.v1.Result.prototype.setAnsCount = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional int64 request_time = 8;
 * @return {number}
 */
proto.oracle.v1.Result.prototype.getRequestTime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.oracle.v1.Result} returns this
 */
proto.oracle.v1.Result.prototype.setRequestTime = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional int64 resolve_time = 9;
 * @return {number}
 */
proto.oracle.v1.Result.prototype.getResolveTime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.oracle.v1.Result} returns this
 */
proto.oracle.v1.Result.prototype.setResolveTime = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional ResolveStatus resolve_status = 10;
 * @return {!proto.oracle.v1.ResolveStatus}
 */
proto.oracle.v1.Result.prototype.getResolveStatus = function() {
  return /** @type {!proto.oracle.v1.ResolveStatus} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {!proto.oracle.v1.ResolveStatus} value
 * @return {!proto.oracle.v1.Result} returns this
 */
proto.oracle.v1.Result.prototype.setResolveStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 10, value);
};


/**
 * optional bytes result = 11;
 * @return {string}
 */
proto.oracle.v1.Result.prototype.getResult = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * optional bytes result = 11;
 * This is a type-conversion wrapper around `getResult()`
 * @return {string}
 */
proto.oracle.v1.Result.prototype.getResult_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getResult()));
};


/**
 * optional bytes result = 11;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getResult()`
 * @return {!Uint8Array}
 */
proto.oracle.v1.Result.prototype.getResult_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getResult()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.oracle.v1.Result} returns this
 */
proto.oracle.v1.Result.prototype.setResult = function(value) {
  return jspb.Message.setProto3BytesField(this, 11, value);
};


