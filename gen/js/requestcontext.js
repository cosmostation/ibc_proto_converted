// source: irismod/service/service.proto
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

goog.provide('proto.irismod.service.RequestContext');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

goog.forwardDeclare('proto.irismod.service.RequestContextBatchState');
goog.forwardDeclare('proto.irismod.service.RequestContextState');
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
proto.irismod.service.RequestContext = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.irismod.service.RequestContext.repeatedFields_, null);
};
goog.inherits(proto.irismod.service.RequestContext, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.service.RequestContext.displayName = 'proto.irismod.service.RequestContext';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.irismod.service.RequestContext.repeatedFields_ = [2,5];



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
proto.irismod.service.RequestContext.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.service.RequestContext.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.service.RequestContext} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.service.RequestContext.toObject = function(includeInstance, msg) {
  var f, obj = {
    serviceName: jspb.Message.getFieldWithDefault(msg, 1, ""),
    providersList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    consumer: jspb.Message.getFieldWithDefault(msg, 3, ""),
    input: jspb.Message.getFieldWithDefault(msg, 4, ""),
    serviceFeeCapList: jspb.Message.toObjectList(msg.getServiceFeeCapList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    moduleName: jspb.Message.getFieldWithDefault(msg, 6, ""),
    timeout: jspb.Message.getFieldWithDefault(msg, 7, 0),
    repeated: jspb.Message.getBooleanFieldWithDefault(msg, 8, false),
    repeatedFrequency: jspb.Message.getFieldWithDefault(msg, 9, 0),
    repeatedTotal: jspb.Message.getFieldWithDefault(msg, 10, 0),
    batchCounter: jspb.Message.getFieldWithDefault(msg, 11, 0),
    batchRequestCount: jspb.Message.getFieldWithDefault(msg, 12, 0),
    batchResponseCount: jspb.Message.getFieldWithDefault(msg, 13, 0),
    batchResponseThreshold: jspb.Message.getFieldWithDefault(msg, 14, 0),
    responseThreshold: jspb.Message.getFieldWithDefault(msg, 15, 0),
    batchState: jspb.Message.getFieldWithDefault(msg, 16, 0),
    state: jspb.Message.getFieldWithDefault(msg, 17, 0)
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
 * @return {!proto.irismod.service.RequestContext}
 */
proto.irismod.service.RequestContext.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.service.RequestContext;
  return proto.irismod.service.RequestContext.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.service.RequestContext} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.service.RequestContext}
 */
proto.irismod.service.RequestContext.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setServiceName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addProviders(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setConsumer(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setInput(value);
      break;
    case 5:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addServiceFeeCap(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setModuleName(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setTimeout(value);
      break;
    case 8:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setRepeated(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRepeatedFrequency(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setRepeatedTotal(value);
      break;
    case 11:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setBatchCounter(value);
      break;
    case 12:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setBatchRequestCount(value);
      break;
    case 13:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setBatchResponseCount(value);
      break;
    case 14:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setBatchResponseThreshold(value);
      break;
    case 15:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setResponseThreshold(value);
      break;
    case 16:
      var value = /** @type {!proto.irismod.service.RequestContextBatchState} */ (reader.readEnum());
      msg.setBatchState(value);
      break;
    case 17:
      var value = /** @type {!proto.irismod.service.RequestContextState} */ (reader.readEnum());
      msg.setState(value);
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
proto.irismod.service.RequestContext.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.service.RequestContext.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.service.RequestContext} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.service.RequestContext.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getServiceName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getProvidersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getConsumer();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getInput();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getServiceFeeCapList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getModuleName();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getTimeout();
  if (f !== 0) {
    writer.writeInt64(
      7,
      f
    );
  }
  f = message.getRepeated();
  if (f) {
    writer.writeBool(
      8,
      f
    );
  }
  f = message.getRepeatedFrequency();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
  f = message.getRepeatedTotal();
  if (f !== 0) {
    writer.writeInt64(
      10,
      f
    );
  }
  f = message.getBatchCounter();
  if (f !== 0) {
    writer.writeUint64(
      11,
      f
    );
  }
  f = message.getBatchRequestCount();
  if (f !== 0) {
    writer.writeUint32(
      12,
      f
    );
  }
  f = message.getBatchResponseCount();
  if (f !== 0) {
    writer.writeUint32(
      13,
      f
    );
  }
  f = message.getBatchResponseThreshold();
  if (f !== 0) {
    writer.writeUint32(
      14,
      f
    );
  }
  f = message.getResponseThreshold();
  if (f !== 0) {
    writer.writeUint32(
      15,
      f
    );
  }
  f = message.getBatchState();
  if (f !== 0.0) {
    writer.writeEnum(
      16,
      f
    );
  }
  f = message.getState();
  if (f !== 0.0) {
    writer.writeEnum(
      17,
      f
    );
  }
};


/**
 * optional string service_name = 1;
 * @return {string}
 */
proto.irismod.service.RequestContext.prototype.getServiceName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setServiceName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated string providers = 2;
 * @return {!Array<string>}
 */
proto.irismod.service.RequestContext.prototype.getProvidersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setProvidersList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.addProviders = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.clearProvidersList = function() {
  return this.setProvidersList([]);
};


/**
 * optional string consumer = 3;
 * @return {string}
 */
proto.irismod.service.RequestContext.prototype.getConsumer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setConsumer = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string input = 4;
 * @return {string}
 */
proto.irismod.service.RequestContext.prototype.getInput = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setInput = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin service_fee_cap = 5;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.irismod.service.RequestContext.prototype.getServiceFeeCapList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 5));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.irismod.service.RequestContext} returns this
*/
proto.irismod.service.RequestContext.prototype.setServiceFeeCapList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.irismod.service.RequestContext.prototype.addServiceFeeCap = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.clearServiceFeeCapList = function() {
  return this.setServiceFeeCapList([]);
};


/**
 * optional string module_name = 6;
 * @return {string}
 */
proto.irismod.service.RequestContext.prototype.getModuleName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setModuleName = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional int64 timeout = 7;
 * @return {number}
 */
proto.irismod.service.RequestContext.prototype.getTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional bool repeated = 8;
 * @return {boolean}
 */
proto.irismod.service.RequestContext.prototype.getRepeated = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 8, false));
};


/**
 * @param {boolean} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setRepeated = function(value) {
  return jspb.Message.setProto3BooleanField(this, 8, value);
};


/**
 * optional uint64 repeated_frequency = 9;
 * @return {number}
 */
proto.irismod.service.RequestContext.prototype.getRepeatedFrequency = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setRepeatedFrequency = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional int64 repeated_total = 10;
 * @return {number}
 */
proto.irismod.service.RequestContext.prototype.getRepeatedTotal = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setRepeatedTotal = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


/**
 * optional uint64 batch_counter = 11;
 * @return {number}
 */
proto.irismod.service.RequestContext.prototype.getBatchCounter = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setBatchCounter = function(value) {
  return jspb.Message.setProto3IntField(this, 11, value);
};


/**
 * optional uint32 batch_request_count = 12;
 * @return {number}
 */
proto.irismod.service.RequestContext.prototype.getBatchRequestCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setBatchRequestCount = function(value) {
  return jspb.Message.setProto3IntField(this, 12, value);
};


/**
 * optional uint32 batch_response_count = 13;
 * @return {number}
 */
proto.irismod.service.RequestContext.prototype.getBatchResponseCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 13, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setBatchResponseCount = function(value) {
  return jspb.Message.setProto3IntField(this, 13, value);
};


/**
 * optional uint32 batch_response_threshold = 14;
 * @return {number}
 */
proto.irismod.service.RequestContext.prototype.getBatchResponseThreshold = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 14, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setBatchResponseThreshold = function(value) {
  return jspb.Message.setProto3IntField(this, 14, value);
};


/**
 * optional uint32 response_threshold = 15;
 * @return {number}
 */
proto.irismod.service.RequestContext.prototype.getResponseThreshold = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 15, 0));
};


/**
 * @param {number} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setResponseThreshold = function(value) {
  return jspb.Message.setProto3IntField(this, 15, value);
};


/**
 * optional RequestContextBatchState batch_state = 16;
 * @return {!proto.irismod.service.RequestContextBatchState}
 */
proto.irismod.service.RequestContext.prototype.getBatchState = function() {
  return /** @type {!proto.irismod.service.RequestContextBatchState} */ (jspb.Message.getFieldWithDefault(this, 16, 0));
};


/**
 * @param {!proto.irismod.service.RequestContextBatchState} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setBatchState = function(value) {
  return jspb.Message.setProto3EnumField(this, 16, value);
};


/**
 * optional RequestContextState state = 17;
 * @return {!proto.irismod.service.RequestContextState}
 */
proto.irismod.service.RequestContext.prototype.getState = function() {
  return /** @type {!proto.irismod.service.RequestContextState} */ (jspb.Message.getFieldWithDefault(this, 17, 0));
};


/**
 * @param {!proto.irismod.service.RequestContextState} value
 * @return {!proto.irismod.service.RequestContext} returns this
 */
proto.irismod.service.RequestContext.prototype.setState = function(value) {
  return jspb.Message.setProto3EnumField(this, 17, value);
};


