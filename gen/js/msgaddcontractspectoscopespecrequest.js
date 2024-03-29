// source: provenance/metadata/v1/tx.proto
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

goog.provide('proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest');

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
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.displayName = 'proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.repeatedFields_ = [3];



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
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    contractSpecificationId: msg.getContractSpecificationId_asB64(),
    scopeSpecificationId: msg.getScopeSpecificationId_asB64(),
    signersList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f
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
 * @return {!proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest}
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest;
  return proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest}
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setContractSpecificationId(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setScopeSpecificationId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addSigners(value);
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
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContractSpecificationId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getScopeSpecificationId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getSignersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
};


/**
 * optional bytes contract_specification_id = 1;
 * @return {string}
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.getContractSpecificationId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes contract_specification_id = 1;
 * This is a type-conversion wrapper around `getContractSpecificationId()`
 * @return {string}
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.getContractSpecificationId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getContractSpecificationId()));
};


/**
 * optional bytes contract_specification_id = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getContractSpecificationId()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.getContractSpecificationId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getContractSpecificationId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.setContractSpecificationId = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional bytes scope_specification_id = 2;
 * @return {string}
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.getScopeSpecificationId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes scope_specification_id = 2;
 * This is a type-conversion wrapper around `getScopeSpecificationId()`
 * @return {string}
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.getScopeSpecificationId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getScopeSpecificationId()));
};


/**
 * optional bytes scope_specification_id = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getScopeSpecificationId()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.getScopeSpecificationId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getScopeSpecificationId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.setScopeSpecificationId = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * repeated string signers = 3;
 * @return {!Array<string>}
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.getSignersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.setSignersList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.addSigners = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest} returns this
 */
proto.provenance.metadata.v1.MsgAddContractSpecToScopeSpecRequest.prototype.clearSignersList = function() {
  return this.setSignersList([]);
};


