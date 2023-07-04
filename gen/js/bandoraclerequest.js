// source: injective/oracle/v1beta1/oracle.proto
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

goog.provide('proto.injective.oracle.v1beta1.BandOracleRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.injective.oracle.v1beta1.BandOracleRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.oracle.v1beta1.BandOracleRequest.repeatedFields_, null);
};
goog.inherits(proto.injective.oracle.v1beta1.BandOracleRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.oracle.v1beta1.BandOracleRequest.displayName = 'proto.injective.oracle.v1beta1.BandOracleRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.oracle.v1beta1.BandOracleRequest.repeatedFields_ = [3,6];



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
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.oracle.v1beta1.BandOracleRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.oracle.v1beta1.BandOracleRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.BandOracleRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    requestId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    oracleScriptId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    symbolsList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    askCount: jspb.Message.getFieldWithDefault(msg, 4, 0),
    minCount: jspb.Message.getFieldWithDefault(msg, 5, 0),
    feeLimitList: jspb.Message.toObjectList(msg.getFeeLimitList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    prepareGas: jspb.Message.getFieldWithDefault(msg, 7, 0),
    executeGas: jspb.Message.getFieldWithDefault(msg, 8, 0),
    minSourceCount: jspb.Message.getFieldWithDefault(msg, 9, 0)
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
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.oracle.v1beta1.BandOracleRequest;
  return proto.injective.oracle.v1beta1.BandOracleRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.oracle.v1beta1.BandOracleRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRequestId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setOracleScriptId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addSymbols(value);
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
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addFeeLimit(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPrepareGas(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setExecuteGas(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMinSourceCount(value);
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
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.oracle.v1beta1.BandOracleRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.oracle.v1beta1.BandOracleRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.BandOracleRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRequestId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getOracleScriptId();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
  f = message.getSymbolsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
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
  f = message.getFeeLimitList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getPrepareGas();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getExecuteGas();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
  f = message.getMinSourceCount();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
};


/**
 * optional uint64 request_id = 1;
 * @return {number}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.getRequestId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.setRequestId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional int64 oracle_script_id = 2;
 * @return {number}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.getOracleScriptId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.setOracleScriptId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * repeated string symbols = 3;
 * @return {!Array<string>}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.getSymbolsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.setSymbolsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.addSymbols = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.clearSymbolsList = function() {
  return this.setSymbolsList([]);
};


/**
 * optional uint64 ask_count = 4;
 * @return {number}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.getAskCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.setAskCount = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 min_count = 5;
 * @return {number}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.getMinCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.setMinCount = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin fee_limit = 6;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.getFeeLimitList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 6));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
*/
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.setFeeLimitList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.addFeeLimit = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.clearFeeLimitList = function() {
  return this.setFeeLimitList([]);
};


/**
 * optional uint64 prepare_gas = 7;
 * @return {number}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.getPrepareGas = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.setPrepareGas = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional uint64 execute_gas = 8;
 * @return {number}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.getExecuteGas = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.setExecuteGas = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional uint64 min_source_count = 9;
 * @return {number}
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.getMinSourceCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.BandOracleRequest} returns this
 */
proto.injective.oracle.v1beta1.BandOracleRequest.prototype.setMinSourceCount = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};

