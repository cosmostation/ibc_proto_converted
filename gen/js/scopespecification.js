// source: provenance/metadata/v1/specification.proto
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

goog.provide('proto.provenance.metadata.v1.ScopeSpecification');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.Description');

goog.forwardDeclare('proto.provenance.metadata.v1.PartyType');
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
proto.provenance.metadata.v1.ScopeSpecification = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.ScopeSpecification.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.ScopeSpecification, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.ScopeSpecification.displayName = 'proto.provenance.metadata.v1.ScopeSpecification';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.ScopeSpecification.repeatedFields_ = [3,4,5];



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
proto.provenance.metadata.v1.ScopeSpecification.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.ScopeSpecification.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.ScopeSpecification} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ScopeSpecification.toObject = function(includeInstance, msg) {
  var f, obj = {
    specificationId: msg.getSpecificationId_asB64(),
    description: (f = msg.getDescription()) && proto.provenance.metadata.v1.Description.toObject(includeInstance, f),
    ownerAddressesList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    partiesInvolvedList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f,
    contractSpecIdsList: msg.getContractSpecIdsList_asB64()
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
 * @return {!proto.provenance.metadata.v1.ScopeSpecification}
 */
proto.provenance.metadata.v1.ScopeSpecification.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.ScopeSpecification;
  return proto.provenance.metadata.v1.ScopeSpecification.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.ScopeSpecification} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.ScopeSpecification}
 */
proto.provenance.metadata.v1.ScopeSpecification.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSpecificationId(value);
      break;
    case 2:
      var value = new proto.provenance.metadata.v1.Description;
      reader.readMessage(value,proto.provenance.metadata.v1.Description.deserializeBinaryFromReader);
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addOwnerAddresses(value);
      break;
    case 4:
      var values = /** @type {!Array<!proto.provenance.metadata.v1.PartyType>} */ (reader.isDelimited() ? reader.readPackedEnum() : [reader.readEnum()]);
      for (var i = 0; i < values.length; i++) {
        msg.addPartiesInvolved(values[i]);
      }
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addContractSpecIds(value);
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
proto.provenance.metadata.v1.ScopeSpecification.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.ScopeSpecification.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.ScopeSpecification} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ScopeSpecification.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSpecificationId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.provenance.metadata.v1.Description.serializeBinaryToWriter
    );
  }
  f = message.getOwnerAddressesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
  f = message.getPartiesInvolvedList();
  if (f.length > 0) {
    writer.writePackedEnum(
      4,
      f
    );
  }
  f = message.getContractSpecIdsList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      5,
      f
    );
  }
};


/**
 * optional bytes specification_id = 1;
 * @return {string}
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.getSpecificationId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes specification_id = 1;
 * This is a type-conversion wrapper around `getSpecificationId()`
 * @return {string}
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.getSpecificationId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSpecificationId()));
};


/**
 * optional bytes specification_id = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSpecificationId()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.getSpecificationId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSpecificationId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.setSpecificationId = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional Description description = 2;
 * @return {?proto.provenance.metadata.v1.Description}
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.getDescription = function() {
  return /** @type{?proto.provenance.metadata.v1.Description} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.Description, 2));
};


/**
 * @param {?proto.provenance.metadata.v1.Description|undefined} value
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
*/
proto.provenance.metadata.v1.ScopeSpecification.prototype.setDescription = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.clearDescription = function() {
  return this.setDescription(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.hasDescription = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated string owner_addresses = 3;
 * @return {!Array<string>}
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.getOwnerAddressesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.setOwnerAddressesList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.addOwnerAddresses = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.clearOwnerAddressesList = function() {
  return this.setOwnerAddressesList([]);
};


/**
 * repeated PartyType parties_involved = 4;
 * @return {!Array<!proto.provenance.metadata.v1.PartyType>}
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.getPartiesInvolvedList = function() {
  return /** @type {!Array<!proto.provenance.metadata.v1.PartyType>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.PartyType>} value
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.setPartiesInvolvedList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {!proto.provenance.metadata.v1.PartyType} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.addPartiesInvolved = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.clearPartiesInvolvedList = function() {
  return this.setPartiesInvolvedList([]);
};


/**
 * repeated bytes contract_spec_ids = 5;
 * @return {!Array<string>}
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.getContractSpecIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 5));
};


/**
 * repeated bytes contract_spec_ids = 5;
 * This is a type-conversion wrapper around `getContractSpecIdsList()`
 * @return {!Array<string>}
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.getContractSpecIdsList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getContractSpecIdsList()));
};


/**
 * repeated bytes contract_spec_ids = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getContractSpecIdsList()`
 * @return {!Array<!Uint8Array>}
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.getContractSpecIdsList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getContractSpecIdsList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.setContractSpecIdsList = function(value) {
  return jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.addContractSpecIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.ScopeSpecification} returns this
 */
proto.provenance.metadata.v1.ScopeSpecification.prototype.clearContractSpecIdsList = function() {
  return this.setContractSpecIdsList([]);
};

