// source: injective/oracle/v1beta1/events.proto
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

goog.provide('proto.injective.oracle.v1beta1.SetBandIBCPriceEvent');

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
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.repeatedFields_, null);
};
goog.inherits(proto.injective.oracle.v1beta1.SetBandIBCPriceEvent, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.displayName = 'proto.injective.oracle.v1beta1.SetBandIBCPriceEvent';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.repeatedFields_ = [2,3];



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
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.toObject = function(includeInstance, msg) {
  var f, obj = {
    relayer: jspb.Message.getFieldWithDefault(msg, 1, ""),
    symbolsList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    pricesList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    resolveTime: jspb.Message.getFieldWithDefault(msg, 4, 0),
    requestId: jspb.Message.getFieldWithDefault(msg, 5, 0),
    clientId: jspb.Message.getFieldWithDefault(msg, 6, 0)
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
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent}
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.oracle.v1beta1.SetBandIBCPriceEvent;
  return proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent}
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRelayer(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addSymbols(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addPrices(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setResolveTime(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRequestId(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
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
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRelayer();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSymbolsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getPricesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
  f = message.getResolveTime();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getRequestId();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getClientId();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
};


/**
 * optional string relayer = 1;
 * @return {string}
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.getRelayer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} returns this
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.setRelayer = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated string symbols = 2;
 * @return {!Array<string>}
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.getSymbolsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} returns this
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.setSymbolsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} returns this
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.addSymbols = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} returns this
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.clearSymbolsList = function() {
  return this.setSymbolsList([]);
};


/**
 * repeated string prices = 3;
 * @return {!Array<string>}
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.getPricesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} returns this
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.setPricesList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} returns this
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.addPrices = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} returns this
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.clearPricesList = function() {
  return this.setPricesList([]);
};


/**
 * optional uint64 resolve_time = 4;
 * @return {number}
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.getResolveTime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} returns this
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.setResolveTime = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 request_id = 5;
 * @return {number}
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.getRequestId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} returns this
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.setRequestId = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional int64 client_id = 6;
 * @return {number}
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.getClientId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.oracle.v1beta1.SetBandIBCPriceEvent} returns this
 */
proto.injective.oracle.v1beta1.SetBandIBCPriceEvent.prototype.setClientId = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


