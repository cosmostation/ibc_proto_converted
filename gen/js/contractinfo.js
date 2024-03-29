// source: secret/compute/v1beta1/types.proto
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

goog.provide('proto.secret.compute.v1beta1.ContractInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.secret.compute.v1beta1.AbsoluteTxPosition');

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
proto.secret.compute.v1beta1.ContractInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.secret.compute.v1beta1.ContractInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.secret.compute.v1beta1.ContractInfo.displayName = 'proto.secret.compute.v1beta1.ContractInfo';
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
proto.secret.compute.v1beta1.ContractInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.secret.compute.v1beta1.ContractInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.secret.compute.v1beta1.ContractInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.ContractInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    codeId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    creator: msg.getCreator_asB64(),
    label: jspb.Message.getFieldWithDefault(msg, 4, ""),
    created: (f = msg.getCreated()) && proto.secret.compute.v1beta1.AbsoluteTxPosition.toObject(includeInstance, f),
    ibcPortId: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.secret.compute.v1beta1.ContractInfo}
 */
proto.secret.compute.v1beta1.ContractInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.secret.compute.v1beta1.ContractInfo;
  return proto.secret.compute.v1beta1.ContractInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.secret.compute.v1beta1.ContractInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.secret.compute.v1beta1.ContractInfo}
 */
proto.secret.compute.v1beta1.ContractInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCodeId(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setCreator(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setLabel(value);
      break;
    case 5:
      var value = new proto.secret.compute.v1beta1.AbsoluteTxPosition;
      reader.readMessage(value,proto.secret.compute.v1beta1.AbsoluteTxPosition.deserializeBinaryFromReader);
      msg.setCreated(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setIbcPortId(value);
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
proto.secret.compute.v1beta1.ContractInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.secret.compute.v1beta1.ContractInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.secret.compute.v1beta1.ContractInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.ContractInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCodeId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getCreator_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getLabel();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getCreated();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.secret.compute.v1beta1.AbsoluteTxPosition.serializeBinaryToWriter
    );
  }
  f = message.getIbcPortId();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional uint64 code_id = 1;
 * @return {number}
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.getCodeId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.secret.compute.v1beta1.ContractInfo} returns this
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.setCodeId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional bytes creator = 2;
 * @return {string}
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes creator = 2;
 * This is a type-conversion wrapper around `getCreator()`
 * @return {string}
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.getCreator_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getCreator()));
};


/**
 * optional bytes creator = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getCreator()`
 * @return {!Uint8Array}
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.getCreator_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getCreator()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.secret.compute.v1beta1.ContractInfo} returns this
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.setCreator = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional string label = 4;
 * @return {string}
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.getLabel = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.compute.v1beta1.ContractInfo} returns this
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.setLabel = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional AbsoluteTxPosition created = 5;
 * @return {?proto.secret.compute.v1beta1.AbsoluteTxPosition}
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.getCreated = function() {
  return /** @type{?proto.secret.compute.v1beta1.AbsoluteTxPosition} */ (
    jspb.Message.getWrapperField(this, proto.secret.compute.v1beta1.AbsoluteTxPosition, 5));
};


/**
 * @param {?proto.secret.compute.v1beta1.AbsoluteTxPosition|undefined} value
 * @return {!proto.secret.compute.v1beta1.ContractInfo} returns this
*/
proto.secret.compute.v1beta1.ContractInfo.prototype.setCreated = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.secret.compute.v1beta1.ContractInfo} returns this
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.clearCreated = function() {
  return this.setCreated(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.hasCreated = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional string ibc_port_id = 6;
 * @return {string}
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.getIbcPortId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.compute.v1beta1.ContractInfo} returns this
 */
proto.secret.compute.v1beta1.ContractInfo.prototype.setIbcPortId = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


