// source: desmos/profiles/v2/models_app_links.proto
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

goog.provide('proto.desmos.profiles.v2.OracleRequest');
goog.provide('proto.desmos.profiles.v2.OracleRequest.CallData');

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
proto.desmos.profiles.v2.OracleRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.profiles.v2.OracleRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v2.OracleRequest.displayName = 'proto.desmos.profiles.v2.OracleRequest';
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
proto.desmos.profiles.v2.OracleRequest.CallData = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.profiles.v2.OracleRequest.CallData, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v2.OracleRequest.CallData.displayName = 'proto.desmos.profiles.v2.OracleRequest.CallData';
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
proto.desmos.profiles.v2.OracleRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v2.OracleRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v2.OracleRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v2.OracleRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    oracleScriptId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    callData: (f = msg.getCallData()) && proto.desmos.profiles.v2.OracleRequest.CallData.toObject(includeInstance, f),
    clientId: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.desmos.profiles.v2.OracleRequest}
 */
proto.desmos.profiles.v2.OracleRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v2.OracleRequest;
  return proto.desmos.profiles.v2.OracleRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v2.OracleRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v2.OracleRequest}
 */
proto.desmos.profiles.v2.OracleRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setOracleScriptId(value);
      break;
    case 3:
      var value = new proto.desmos.profiles.v2.OracleRequest.CallData;
      reader.readMessage(value,proto.desmos.profiles.v2.OracleRequest.CallData.deserializeBinaryFromReader);
      msg.setCallData(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setClientId(value);
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
proto.desmos.profiles.v2.OracleRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v2.OracleRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v2.OracleRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v2.OracleRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
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
  f = message.getCallData();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.desmos.profiles.v2.OracleRequest.CallData.serializeBinaryToWriter
    );
  }
  f = message.getClientId();
  if (f.length > 0) {
    writer.writeString(
      4,
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
proto.desmos.profiles.v2.OracleRequest.CallData.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v2.OracleRequest.CallData.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v2.OracleRequest.CallData} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v2.OracleRequest.CallData.toObject = function(includeInstance, msg) {
  var f, obj = {
    application: jspb.Message.getFieldWithDefault(msg, 1, ""),
    callData: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.desmos.profiles.v2.OracleRequest.CallData}
 */
proto.desmos.profiles.v2.OracleRequest.CallData.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v2.OracleRequest.CallData;
  return proto.desmos.profiles.v2.OracleRequest.CallData.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v2.OracleRequest.CallData} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v2.OracleRequest.CallData}
 */
proto.desmos.profiles.v2.OracleRequest.CallData.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setApplication(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setCallData(value);
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
proto.desmos.profiles.v2.OracleRequest.CallData.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v2.OracleRequest.CallData.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v2.OracleRequest.CallData} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v2.OracleRequest.CallData.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getApplication();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCallData();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional string application = 1;
 * @return {string}
 */
proto.desmos.profiles.v2.OracleRequest.CallData.prototype.getApplication = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v2.OracleRequest.CallData} returns this
 */
proto.desmos.profiles.v2.OracleRequest.CallData.prototype.setApplication = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string call_data = 2;
 * @return {string}
 */
proto.desmos.profiles.v2.OracleRequest.CallData.prototype.getCallData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v2.OracleRequest.CallData} returns this
 */
proto.desmos.profiles.v2.OracleRequest.CallData.prototype.setCallData = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.desmos.profiles.v2.OracleRequest.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.profiles.v2.OracleRequest} returns this
 */
proto.desmos.profiles.v2.OracleRequest.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 oracle_script_id = 2;
 * @return {number}
 */
proto.desmos.profiles.v2.OracleRequest.prototype.getOracleScriptId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.profiles.v2.OracleRequest} returns this
 */
proto.desmos.profiles.v2.OracleRequest.prototype.setOracleScriptId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional CallData call_data = 3;
 * @return {?proto.desmos.profiles.v2.OracleRequest.CallData}
 */
proto.desmos.profiles.v2.OracleRequest.prototype.getCallData = function() {
  return /** @type{?proto.desmos.profiles.v2.OracleRequest.CallData} */ (
    jspb.Message.getWrapperField(this, proto.desmos.profiles.v2.OracleRequest.CallData, 3));
};


/**
 * @param {?proto.desmos.profiles.v2.OracleRequest.CallData|undefined} value
 * @return {!proto.desmos.profiles.v2.OracleRequest} returns this
*/
proto.desmos.profiles.v2.OracleRequest.prototype.setCallData = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v2.OracleRequest} returns this
 */
proto.desmos.profiles.v2.OracleRequest.prototype.clearCallData = function() {
  return this.setCallData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v2.OracleRequest.prototype.hasCallData = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string client_id = 4;
 * @return {string}
 */
proto.desmos.profiles.v2.OracleRequest.prototype.getClientId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v2.OracleRequest} returns this
 */
proto.desmos.profiles.v2.OracleRequest.prototype.setClientId = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


