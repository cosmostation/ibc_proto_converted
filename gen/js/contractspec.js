// source: provenance/metadata/v1/p8e/p8e.proto
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

goog.provide('proto.provenance.metadata.v1.p8e.ContractSpec');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.p8e.ConditionSpec');
goog.require('proto.provenance.metadata.v1.p8e.ConsiderationSpec');
goog.require('proto.provenance.metadata.v1.p8e.DefinitionSpec');

goog.forwardDeclare('proto.provenance.metadata.v1.p8e.PartyType');
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
proto.provenance.metadata.v1.p8e.ContractSpec = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.p8e.ContractSpec.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.p8e.ContractSpec, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.p8e.ContractSpec.displayName = 'proto.provenance.metadata.v1.p8e.ContractSpec';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.p8e.ContractSpec.repeatedFields_ = [2,3,4,5];



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
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.p8e.ContractSpec.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.p8e.ContractSpec} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.p8e.ContractSpec.toObject = function(includeInstance, msg) {
  var f, obj = {
    definition: (f = msg.getDefinition()) && proto.provenance.metadata.v1.p8e.DefinitionSpec.toObject(includeInstance, f),
    inputSpecsList: jspb.Message.toObjectList(msg.getInputSpecsList(),
    proto.provenance.metadata.v1.p8e.DefinitionSpec.toObject, includeInstance),
    partiesInvolvedList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    conditionSpecsList: jspb.Message.toObjectList(msg.getConditionSpecsList(),
    proto.provenance.metadata.v1.p8e.ConditionSpec.toObject, includeInstance),
    considerationSpecsList: jspb.Message.toObjectList(msg.getConsiderationSpecsList(),
    proto.provenance.metadata.v1.p8e.ConsiderationSpec.toObject, includeInstance)
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
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec}
 */
proto.provenance.metadata.v1.p8e.ContractSpec.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.p8e.ContractSpec;
  return proto.provenance.metadata.v1.p8e.ContractSpec.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.p8e.ContractSpec} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec}
 */
proto.provenance.metadata.v1.p8e.ContractSpec.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.metadata.v1.p8e.DefinitionSpec;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.DefinitionSpec.deserializeBinaryFromReader);
      msg.setDefinition(value);
      break;
    case 2:
      var value = new proto.provenance.metadata.v1.p8e.DefinitionSpec;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.DefinitionSpec.deserializeBinaryFromReader);
      msg.addInputSpecs(value);
      break;
    case 3:
      var values = /** @type {!Array<!proto.provenance.metadata.v1.p8e.PartyType>} */ (reader.isDelimited() ? reader.readPackedEnum() : [reader.readEnum()]);
      for (var i = 0; i < values.length; i++) {
        msg.addPartiesInvolved(values[i]);
      }
      break;
    case 4:
      var value = new proto.provenance.metadata.v1.p8e.ConditionSpec;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.ConditionSpec.deserializeBinaryFromReader);
      msg.addConditionSpecs(value);
      break;
    case 5:
      var value = new proto.provenance.metadata.v1.p8e.ConsiderationSpec;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.ConsiderationSpec.deserializeBinaryFromReader);
      msg.addConsiderationSpecs(value);
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
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.p8e.ContractSpec.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.p8e.ContractSpec} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.p8e.ContractSpec.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDefinition();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.provenance.metadata.v1.p8e.DefinitionSpec.serializeBinaryToWriter
    );
  }
  f = message.getInputSpecsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.provenance.metadata.v1.p8e.DefinitionSpec.serializeBinaryToWriter
    );
  }
  f = message.getPartiesInvolvedList();
  if (f.length > 0) {
    writer.writePackedEnum(
      3,
      f
    );
  }
  f = message.getConditionSpecsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.provenance.metadata.v1.p8e.ConditionSpec.serializeBinaryToWriter
    );
  }
  f = message.getConsiderationSpecsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.provenance.metadata.v1.p8e.ConsiderationSpec.serializeBinaryToWriter
    );
  }
};


/**
 * optional DefinitionSpec definition = 1;
 * @return {?proto.provenance.metadata.v1.p8e.DefinitionSpec}
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.getDefinition = function() {
  return /** @type{?proto.provenance.metadata.v1.p8e.DefinitionSpec} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.p8e.DefinitionSpec, 1));
};


/**
 * @param {?proto.provenance.metadata.v1.p8e.DefinitionSpec|undefined} value
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec} returns this
*/
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.setDefinition = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec} returns this
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.clearDefinition = function() {
  return this.setDefinition(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.hasDefinition = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated DefinitionSpec input_specs = 2;
 * @return {!Array<!proto.provenance.metadata.v1.p8e.DefinitionSpec>}
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.getInputSpecsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.p8e.DefinitionSpec>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.p8e.DefinitionSpec, 2));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.p8e.DefinitionSpec>} value
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec} returns this
*/
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.setInputSpecsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.provenance.metadata.v1.p8e.DefinitionSpec=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.p8e.DefinitionSpec}
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.addInputSpecs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.provenance.metadata.v1.p8e.DefinitionSpec, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec} returns this
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.clearInputSpecsList = function() {
  return this.setInputSpecsList([]);
};


/**
 * repeated PartyType parties_involved = 3;
 * @return {!Array<!proto.provenance.metadata.v1.p8e.PartyType>}
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.getPartiesInvolvedList = function() {
  return /** @type {!Array<!proto.provenance.metadata.v1.p8e.PartyType>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.p8e.PartyType>} value
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec} returns this
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.setPartiesInvolvedList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {!proto.provenance.metadata.v1.p8e.PartyType} value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec} returns this
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.addPartiesInvolved = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec} returns this
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.clearPartiesInvolvedList = function() {
  return this.setPartiesInvolvedList([]);
};


/**
 * repeated ConditionSpec condition_specs = 4;
 * @return {!Array<!proto.provenance.metadata.v1.p8e.ConditionSpec>}
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.getConditionSpecsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.p8e.ConditionSpec>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.p8e.ConditionSpec, 4));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.p8e.ConditionSpec>} value
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec} returns this
*/
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.setConditionSpecsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.provenance.metadata.v1.p8e.ConditionSpec=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.p8e.ConditionSpec}
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.addConditionSpecs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.provenance.metadata.v1.p8e.ConditionSpec, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec} returns this
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.clearConditionSpecsList = function() {
  return this.setConditionSpecsList([]);
};


/**
 * repeated ConsiderationSpec consideration_specs = 5;
 * @return {!Array<!proto.provenance.metadata.v1.p8e.ConsiderationSpec>}
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.getConsiderationSpecsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.p8e.ConsiderationSpec>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.p8e.ConsiderationSpec, 5));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.p8e.ConsiderationSpec>} value
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec} returns this
*/
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.setConsiderationSpecsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.provenance.metadata.v1.p8e.ConsiderationSpec=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.p8e.ConsiderationSpec}
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.addConsiderationSpecs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.provenance.metadata.v1.p8e.ConsiderationSpec, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.p8e.ContractSpec} returns this
 */
proto.provenance.metadata.v1.p8e.ContractSpec.prototype.clearConsiderationSpecsList = function() {
  return this.setConsiderationSpecsList([]);
};


