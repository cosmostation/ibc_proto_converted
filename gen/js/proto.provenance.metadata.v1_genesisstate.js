// source: provenance/metadata/v1/genesis.proto
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

goog.provide('proto.provenance.metadata.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.ContractSpecification');
goog.require('proto.provenance.metadata.v1.OSLocatorParams');
goog.require('proto.provenance.metadata.v1.ObjectStoreLocator');
goog.require('proto.provenance.metadata.v1.Params');
goog.require('proto.provenance.metadata.v1.Record');
goog.require('proto.provenance.metadata.v1.RecordSpecification');
goog.require('proto.provenance.metadata.v1.Scope');
goog.require('proto.provenance.metadata.v1.ScopeSpecification');
goog.require('proto.provenance.metadata.v1.Session');

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
proto.provenance.metadata.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.GenesisState.displayName = 'proto.provenance.metadata.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.GenesisState.repeatedFields_ = [2,3,4,5,6,7,9];



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
proto.provenance.metadata.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.provenance.metadata.v1.Params.toObject(includeInstance, f),
    scopesList: jspb.Message.toObjectList(msg.getScopesList(),
    proto.provenance.metadata.v1.Scope.toObject, includeInstance),
    sessionsList: jspb.Message.toObjectList(msg.getSessionsList(),
    proto.provenance.metadata.v1.Session.toObject, includeInstance),
    recordsList: jspb.Message.toObjectList(msg.getRecordsList(),
    proto.provenance.metadata.v1.Record.toObject, includeInstance),
    scopeSpecificationsList: jspb.Message.toObjectList(msg.getScopeSpecificationsList(),
    proto.provenance.metadata.v1.ScopeSpecification.toObject, includeInstance),
    contractSpecificationsList: jspb.Message.toObjectList(msg.getContractSpecificationsList(),
    proto.provenance.metadata.v1.ContractSpecification.toObject, includeInstance),
    recordSpecificationsList: jspb.Message.toObjectList(msg.getRecordSpecificationsList(),
    proto.provenance.metadata.v1.RecordSpecification.toObject, includeInstance),
    oSLocatorParams: (f = msg.getOSLocatorParams()) && proto.provenance.metadata.v1.OSLocatorParams.toObject(includeInstance, f),
    objectStoreLocatorsList: jspb.Message.toObjectList(msg.getObjectStoreLocatorsList(),
    proto.provenance.metadata.v1.ObjectStoreLocator.toObject, includeInstance)
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
 * @return {!proto.provenance.metadata.v1.GenesisState}
 */
proto.provenance.metadata.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.GenesisState;
  return proto.provenance.metadata.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.GenesisState}
 */
proto.provenance.metadata.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.metadata.v1.Params;
      reader.readMessage(value,proto.provenance.metadata.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.provenance.metadata.v1.Scope;
      reader.readMessage(value,proto.provenance.metadata.v1.Scope.deserializeBinaryFromReader);
      msg.addScopes(value);
      break;
    case 3:
      var value = new proto.provenance.metadata.v1.Session;
      reader.readMessage(value,proto.provenance.metadata.v1.Session.deserializeBinaryFromReader);
      msg.addSessions(value);
      break;
    case 4:
      var value = new proto.provenance.metadata.v1.Record;
      reader.readMessage(value,proto.provenance.metadata.v1.Record.deserializeBinaryFromReader);
      msg.addRecords(value);
      break;
    case 5:
      var value = new proto.provenance.metadata.v1.ScopeSpecification;
      reader.readMessage(value,proto.provenance.metadata.v1.ScopeSpecification.deserializeBinaryFromReader);
      msg.addScopeSpecifications(value);
      break;
    case 6:
      var value = new proto.provenance.metadata.v1.ContractSpecification;
      reader.readMessage(value,proto.provenance.metadata.v1.ContractSpecification.deserializeBinaryFromReader);
      msg.addContractSpecifications(value);
      break;
    case 7:
      var value = new proto.provenance.metadata.v1.RecordSpecification;
      reader.readMessage(value,proto.provenance.metadata.v1.RecordSpecification.deserializeBinaryFromReader);
      msg.addRecordSpecifications(value);
      break;
    case 8:
      var value = new proto.provenance.metadata.v1.OSLocatorParams;
      reader.readMessage(value,proto.provenance.metadata.v1.OSLocatorParams.deserializeBinaryFromReader);
      msg.setOSLocatorParams(value);
      break;
    case 9:
      var value = new proto.provenance.metadata.v1.ObjectStoreLocator;
      reader.readMessage(value,proto.provenance.metadata.v1.ObjectStoreLocator.deserializeBinaryFromReader);
      msg.addObjectStoreLocators(value);
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
proto.provenance.metadata.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.provenance.metadata.v1.Params.serializeBinaryToWriter
    );
  }
  f = message.getScopesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.provenance.metadata.v1.Scope.serializeBinaryToWriter
    );
  }
  f = message.getSessionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.provenance.metadata.v1.Session.serializeBinaryToWriter
    );
  }
  f = message.getRecordsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.provenance.metadata.v1.Record.serializeBinaryToWriter
    );
  }
  f = message.getScopeSpecificationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.provenance.metadata.v1.ScopeSpecification.serializeBinaryToWriter
    );
  }
  f = message.getContractSpecificationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.provenance.metadata.v1.ContractSpecification.serializeBinaryToWriter
    );
  }
  f = message.getRecordSpecificationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.provenance.metadata.v1.RecordSpecification.serializeBinaryToWriter
    );
  }
  f = message.getOSLocatorParams();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.provenance.metadata.v1.OSLocatorParams.serializeBinaryToWriter
    );
  }
  f = message.getObjectStoreLocatorsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      9,
      f,
      proto.provenance.metadata.v1.ObjectStoreLocator.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.provenance.metadata.v1.Params}
 */
proto.provenance.metadata.v1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.provenance.metadata.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.Params, 1));
};


/**
 * @param {?proto.provenance.metadata.v1.Params|undefined} value
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
*/
proto.provenance.metadata.v1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
 */
proto.provenance.metadata.v1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Scope scopes = 2;
 * @return {!Array<!proto.provenance.metadata.v1.Scope>}
 */
proto.provenance.metadata.v1.GenesisState.prototype.getScopesList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.Scope>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.Scope, 2));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.Scope>} value
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
*/
proto.provenance.metadata.v1.GenesisState.prototype.setScopesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.provenance.metadata.v1.Scope=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.Scope}
 */
proto.provenance.metadata.v1.GenesisState.prototype.addScopes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.provenance.metadata.v1.Scope, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
 */
proto.provenance.metadata.v1.GenesisState.prototype.clearScopesList = function() {
  return this.setScopesList([]);
};


/**
 * repeated Session sessions = 3;
 * @return {!Array<!proto.provenance.metadata.v1.Session>}
 */
proto.provenance.metadata.v1.GenesisState.prototype.getSessionsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.Session>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.Session, 3));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.Session>} value
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
*/
proto.provenance.metadata.v1.GenesisState.prototype.setSessionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.provenance.metadata.v1.Session=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.Session}
 */
proto.provenance.metadata.v1.GenesisState.prototype.addSessions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.provenance.metadata.v1.Session, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
 */
proto.provenance.metadata.v1.GenesisState.prototype.clearSessionsList = function() {
  return this.setSessionsList([]);
};


/**
 * repeated Record records = 4;
 * @return {!Array<!proto.provenance.metadata.v1.Record>}
 */
proto.provenance.metadata.v1.GenesisState.prototype.getRecordsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.Record>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.Record, 4));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.Record>} value
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
*/
proto.provenance.metadata.v1.GenesisState.prototype.setRecordsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.provenance.metadata.v1.Record=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.Record}
 */
proto.provenance.metadata.v1.GenesisState.prototype.addRecords = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.provenance.metadata.v1.Record, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
 */
proto.provenance.metadata.v1.GenesisState.prototype.clearRecordsList = function() {
  return this.setRecordsList([]);
};


/**
 * repeated ScopeSpecification scope_specifications = 5;
 * @return {!Array<!proto.provenance.metadata.v1.ScopeSpecification>}
 */
proto.provenance.metadata.v1.GenesisState.prototype.getScopeSpecificationsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.ScopeSpecification>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.ScopeSpecification, 5));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.ScopeSpecification>} value
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
*/
proto.provenance.metadata.v1.GenesisState.prototype.setScopeSpecificationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.provenance.metadata.v1.ScopeSpecification=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.ScopeSpecification}
 */
proto.provenance.metadata.v1.GenesisState.prototype.addScopeSpecifications = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.provenance.metadata.v1.ScopeSpecification, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
 */
proto.provenance.metadata.v1.GenesisState.prototype.clearScopeSpecificationsList = function() {
  return this.setScopeSpecificationsList([]);
};


/**
 * repeated ContractSpecification contract_specifications = 6;
 * @return {!Array<!proto.provenance.metadata.v1.ContractSpecification>}
 */
proto.provenance.metadata.v1.GenesisState.prototype.getContractSpecificationsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.ContractSpecification>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.ContractSpecification, 6));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.ContractSpecification>} value
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
*/
proto.provenance.metadata.v1.GenesisState.prototype.setContractSpecificationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.provenance.metadata.v1.ContractSpecification=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.ContractSpecification}
 */
proto.provenance.metadata.v1.GenesisState.prototype.addContractSpecifications = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.provenance.metadata.v1.ContractSpecification, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
 */
proto.provenance.metadata.v1.GenesisState.prototype.clearContractSpecificationsList = function() {
  return this.setContractSpecificationsList([]);
};


/**
 * repeated RecordSpecification record_specifications = 7;
 * @return {!Array<!proto.provenance.metadata.v1.RecordSpecification>}
 */
proto.provenance.metadata.v1.GenesisState.prototype.getRecordSpecificationsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.RecordSpecification>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.RecordSpecification, 7));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.RecordSpecification>} value
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
*/
proto.provenance.metadata.v1.GenesisState.prototype.setRecordSpecificationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.provenance.metadata.v1.RecordSpecification=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.RecordSpecification}
 */
proto.provenance.metadata.v1.GenesisState.prototype.addRecordSpecifications = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.provenance.metadata.v1.RecordSpecification, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
 */
proto.provenance.metadata.v1.GenesisState.prototype.clearRecordSpecificationsList = function() {
  return this.setRecordSpecificationsList([]);
};


/**
 * optional OSLocatorParams o_s_locator_params = 8;
 * @return {?proto.provenance.metadata.v1.OSLocatorParams}
 */
proto.provenance.metadata.v1.GenesisState.prototype.getOSLocatorParams = function() {
  return /** @type{?proto.provenance.metadata.v1.OSLocatorParams} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.OSLocatorParams, 8));
};


/**
 * @param {?proto.provenance.metadata.v1.OSLocatorParams|undefined} value
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
*/
proto.provenance.metadata.v1.GenesisState.prototype.setOSLocatorParams = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
 */
proto.provenance.metadata.v1.GenesisState.prototype.clearOSLocatorParams = function() {
  return this.setOSLocatorParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.GenesisState.prototype.hasOSLocatorParams = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * repeated ObjectStoreLocator object_store_locators = 9;
 * @return {!Array<!proto.provenance.metadata.v1.ObjectStoreLocator>}
 */
proto.provenance.metadata.v1.GenesisState.prototype.getObjectStoreLocatorsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.ObjectStoreLocator>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.ObjectStoreLocator, 9));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.ObjectStoreLocator>} value
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
*/
proto.provenance.metadata.v1.GenesisState.prototype.setObjectStoreLocatorsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 9, value);
};


/**
 * @param {!proto.provenance.metadata.v1.ObjectStoreLocator=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.ObjectStoreLocator}
 */
proto.provenance.metadata.v1.GenesisState.prototype.addObjectStoreLocators = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 9, opt_value, proto.provenance.metadata.v1.ObjectStoreLocator, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.GenesisState} returns this
 */
proto.provenance.metadata.v1.GenesisState.prototype.clearObjectStoreLocatorsList = function() {
  return this.setObjectStoreLocatorsList([]);
};


