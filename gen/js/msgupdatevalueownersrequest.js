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

goog.provide('proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest');

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
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.displayName = 'proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.repeatedFields_ = [1,3];



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
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    scopeIdsList: msg.getScopeIdsList_asB64(),
    valueOwnerAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
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
 * @return {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest}
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest;
  return proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest}
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addScopeIds(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setValueOwnerAddress(value);
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
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getScopeIdsList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      1,
      f
    );
  }
  f = message.getValueOwnerAddress();
  if (f.length > 0) {
    writer.writeString(
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
 * repeated bytes scope_ids = 1;
 * @return {!Array<string>}
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.getScopeIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * repeated bytes scope_ids = 1;
 * This is a type-conversion wrapper around `getScopeIdsList()`
 * @return {!Array<string>}
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.getScopeIdsList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getScopeIdsList()));
};


/**
 * repeated bytes scope_ids = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getScopeIdsList()`
 * @return {!Array<!Uint8Array>}
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.getScopeIdsList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getScopeIdsList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest} returns this
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.setScopeIdsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest} returns this
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.addScopeIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest} returns this
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.clearScopeIdsList = function() {
  return this.setScopeIdsList([]);
};


/**
 * optional string value_owner_address = 2;
 * @return {string}
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.getValueOwnerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest} returns this
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.setValueOwnerAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated string signers = 3;
 * @return {!Array<string>}
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.getSignersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest} returns this
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.setSignersList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest} returns this
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.addSigners = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest} returns this
 */
proto.provenance.metadata.v1.MsgUpdateValueOwnersRequest.prototype.clearSignersList = function() {
  return this.setSignersList([]);
};


