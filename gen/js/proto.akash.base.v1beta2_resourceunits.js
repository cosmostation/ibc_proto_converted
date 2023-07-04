// source: akash/base/v1beta2/resourceunits.proto
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

goog.provide('proto.akash.base.v1beta2.ResourceUnits');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.base.v1beta2.CPU');
goog.require('proto.akash.base.v1beta2.Endpoint');
goog.require('proto.akash.base.v1beta2.Memory');
goog.require('proto.akash.base.v1beta2.Storage');

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
proto.akash.base.v1beta2.ResourceUnits = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.akash.base.v1beta2.ResourceUnits.repeatedFields_, null);
};
goog.inherits(proto.akash.base.v1beta2.ResourceUnits, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.base.v1beta2.ResourceUnits.displayName = 'proto.akash.base.v1beta2.ResourceUnits';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.akash.base.v1beta2.ResourceUnits.repeatedFields_ = [3,4];



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
proto.akash.base.v1beta2.ResourceUnits.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.base.v1beta2.ResourceUnits.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.base.v1beta2.ResourceUnits} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.base.v1beta2.ResourceUnits.toObject = function(includeInstance, msg) {
  var f, obj = {
    cpu: (f = msg.getCpu()) && proto.akash.base.v1beta2.CPU.toObject(includeInstance, f),
    memory: (f = msg.getMemory()) && proto.akash.base.v1beta2.Memory.toObject(includeInstance, f),
    storageList: jspb.Message.toObjectList(msg.getStorageList(),
    proto.akash.base.v1beta2.Storage.toObject, includeInstance),
    endpointsList: jspb.Message.toObjectList(msg.getEndpointsList(),
    proto.akash.base.v1beta2.Endpoint.toObject, includeInstance)
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
 * @return {!proto.akash.base.v1beta2.ResourceUnits}
 */
proto.akash.base.v1beta2.ResourceUnits.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.base.v1beta2.ResourceUnits;
  return proto.akash.base.v1beta2.ResourceUnits.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.base.v1beta2.ResourceUnits} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.base.v1beta2.ResourceUnits}
 */
proto.akash.base.v1beta2.ResourceUnits.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.akash.base.v1beta2.CPU;
      reader.readMessage(value,proto.akash.base.v1beta2.CPU.deserializeBinaryFromReader);
      msg.setCpu(value);
      break;
    case 2:
      var value = new proto.akash.base.v1beta2.Memory;
      reader.readMessage(value,proto.akash.base.v1beta2.Memory.deserializeBinaryFromReader);
      msg.setMemory(value);
      break;
    case 3:
      var value = new proto.akash.base.v1beta2.Storage;
      reader.readMessage(value,proto.akash.base.v1beta2.Storage.deserializeBinaryFromReader);
      msg.addStorage(value);
      break;
    case 4:
      var value = new proto.akash.base.v1beta2.Endpoint;
      reader.readMessage(value,proto.akash.base.v1beta2.Endpoint.deserializeBinaryFromReader);
      msg.addEndpoints(value);
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
proto.akash.base.v1beta2.ResourceUnits.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.base.v1beta2.ResourceUnits.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.base.v1beta2.ResourceUnits} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.base.v1beta2.ResourceUnits.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCpu();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.akash.base.v1beta2.CPU.serializeBinaryToWriter
    );
  }
  f = message.getMemory();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.akash.base.v1beta2.Memory.serializeBinaryToWriter
    );
  }
  f = message.getStorageList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.akash.base.v1beta2.Storage.serializeBinaryToWriter
    );
  }
  f = message.getEndpointsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.akash.base.v1beta2.Endpoint.serializeBinaryToWriter
    );
  }
};


/**
 * optional CPU cpu = 1;
 * @return {?proto.akash.base.v1beta2.CPU}
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.getCpu = function() {
  return /** @type{?proto.akash.base.v1beta2.CPU} */ (
    jspb.Message.getWrapperField(this, proto.akash.base.v1beta2.CPU, 1));
};


/**
 * @param {?proto.akash.base.v1beta2.CPU|undefined} value
 * @return {!proto.akash.base.v1beta2.ResourceUnits} returns this
*/
proto.akash.base.v1beta2.ResourceUnits.prototype.setCpu = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.base.v1beta2.ResourceUnits} returns this
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.clearCpu = function() {
  return this.setCpu(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.hasCpu = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Memory memory = 2;
 * @return {?proto.akash.base.v1beta2.Memory}
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.getMemory = function() {
  return /** @type{?proto.akash.base.v1beta2.Memory} */ (
    jspb.Message.getWrapperField(this, proto.akash.base.v1beta2.Memory, 2));
};


/**
 * @param {?proto.akash.base.v1beta2.Memory|undefined} value
 * @return {!proto.akash.base.v1beta2.ResourceUnits} returns this
*/
proto.akash.base.v1beta2.ResourceUnits.prototype.setMemory = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.base.v1beta2.ResourceUnits} returns this
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.clearMemory = function() {
  return this.setMemory(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.hasMemory = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated Storage storage = 3;
 * @return {!Array<!proto.akash.base.v1beta2.Storage>}
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.getStorageList = function() {
  return /** @type{!Array<!proto.akash.base.v1beta2.Storage>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.akash.base.v1beta2.Storage, 3));
};


/**
 * @param {!Array<!proto.akash.base.v1beta2.Storage>} value
 * @return {!proto.akash.base.v1beta2.ResourceUnits} returns this
*/
proto.akash.base.v1beta2.ResourceUnits.prototype.setStorageList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.akash.base.v1beta2.Storage=} opt_value
 * @param {number=} opt_index
 * @return {!proto.akash.base.v1beta2.Storage}
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.addStorage = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.akash.base.v1beta2.Storage, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.akash.base.v1beta2.ResourceUnits} returns this
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.clearStorageList = function() {
  return this.setStorageList([]);
};


/**
 * repeated Endpoint endpoints = 4;
 * @return {!Array<!proto.akash.base.v1beta2.Endpoint>}
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.getEndpointsList = function() {
  return /** @type{!Array<!proto.akash.base.v1beta2.Endpoint>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.akash.base.v1beta2.Endpoint, 4));
};


/**
 * @param {!Array<!proto.akash.base.v1beta2.Endpoint>} value
 * @return {!proto.akash.base.v1beta2.ResourceUnits} returns this
*/
proto.akash.base.v1beta2.ResourceUnits.prototype.setEndpointsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.akash.base.v1beta2.Endpoint=} opt_value
 * @param {number=} opt_index
 * @return {!proto.akash.base.v1beta2.Endpoint}
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.addEndpoints = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.akash.base.v1beta2.Endpoint, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.akash.base.v1beta2.ResourceUnits} returns this
 */
proto.akash.base.v1beta2.ResourceUnits.prototype.clearEndpointsList = function() {
  return this.setEndpointsList([]);
};

