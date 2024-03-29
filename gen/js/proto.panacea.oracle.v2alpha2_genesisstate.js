// source: panacea/oracle/v2alpha2/genesis.proto
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

goog.provide('proto.panacea.oracle.v2alpha2.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.panacea.oracle.v2alpha2.Oracle');
goog.require('proto.panacea.oracle.v2alpha2.OracleRegistration');
goog.require('proto.panacea.oracle.v2alpha2.OracleRegistrationVote');
goog.require('proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement');
goog.require('proto.panacea.oracle.v2alpha2.OracleUpgradeInfo');
goog.require('proto.panacea.oracle.v2alpha2.Params');

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
proto.panacea.oracle.v2alpha2.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.panacea.oracle.v2alpha2.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.panacea.oracle.v2alpha2.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.oracle.v2alpha2.GenesisState.displayName = 'proto.panacea.oracle.v2alpha2.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.panacea.oracle.v2alpha2.GenesisState.repeatedFields_ = [1,2,3,6];



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
proto.panacea.oracle.v2alpha2.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.oracle.v2alpha2.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.oracle.v2alpha2.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.oracle.v2alpha2.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    oraclesList: jspb.Message.toObjectList(msg.getOraclesList(),
    proto.panacea.oracle.v2alpha2.Oracle.toObject, includeInstance),
    oracleRegistrationsList: jspb.Message.toObjectList(msg.getOracleRegistrationsList(),
    proto.panacea.oracle.v2alpha2.OracleRegistration.toObject, includeInstance),
    oracleRegistrationVotesList: jspb.Message.toObjectList(msg.getOracleRegistrationVotesList(),
    proto.panacea.oracle.v2alpha2.OracleRegistrationVote.toObject, includeInstance),
    params: (f = msg.getParams()) && proto.panacea.oracle.v2alpha2.Params.toObject(includeInstance, f),
    oracleUpgradeInfo: (f = msg.getOracleUpgradeInfo()) && proto.panacea.oracle.v2alpha2.OracleUpgradeInfo.toObject(includeInstance, f),
    oracleRegistrationVoteQueueElementsList: jspb.Message.toObjectList(msg.getOracleRegistrationVoteQueueElementsList(),
    proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement.toObject, includeInstance)
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
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState}
 */
proto.panacea.oracle.v2alpha2.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.oracle.v2alpha2.GenesisState;
  return proto.panacea.oracle.v2alpha2.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.oracle.v2alpha2.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState}
 */
proto.panacea.oracle.v2alpha2.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.panacea.oracle.v2alpha2.Oracle;
      reader.readMessage(value,proto.panacea.oracle.v2alpha2.Oracle.deserializeBinaryFromReader);
      msg.addOracles(value);
      break;
    case 2:
      var value = new proto.panacea.oracle.v2alpha2.OracleRegistration;
      reader.readMessage(value,proto.panacea.oracle.v2alpha2.OracleRegistration.deserializeBinaryFromReader);
      msg.addOracleRegistrations(value);
      break;
    case 3:
      var value = new proto.panacea.oracle.v2alpha2.OracleRegistrationVote;
      reader.readMessage(value,proto.panacea.oracle.v2alpha2.OracleRegistrationVote.deserializeBinaryFromReader);
      msg.addOracleRegistrationVotes(value);
      break;
    case 4:
      var value = new proto.panacea.oracle.v2alpha2.Params;
      reader.readMessage(value,proto.panacea.oracle.v2alpha2.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 5:
      var value = new proto.panacea.oracle.v2alpha2.OracleUpgradeInfo;
      reader.readMessage(value,proto.panacea.oracle.v2alpha2.OracleUpgradeInfo.deserializeBinaryFromReader);
      msg.setOracleUpgradeInfo(value);
      break;
    case 6:
      var value = new proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement;
      reader.readMessage(value,proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement.deserializeBinaryFromReader);
      msg.addOracleRegistrationVoteQueueElements(value);
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
proto.panacea.oracle.v2alpha2.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.oracle.v2alpha2.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.oracle.v2alpha2.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.oracle.v2alpha2.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOraclesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.panacea.oracle.v2alpha2.Oracle.serializeBinaryToWriter
    );
  }
  f = message.getOracleRegistrationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.panacea.oracle.v2alpha2.OracleRegistration.serializeBinaryToWriter
    );
  }
  f = message.getOracleRegistrationVotesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.panacea.oracle.v2alpha2.OracleRegistrationVote.serializeBinaryToWriter
    );
  }
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.panacea.oracle.v2alpha2.Params.serializeBinaryToWriter
    );
  }
  f = message.getOracleUpgradeInfo();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.panacea.oracle.v2alpha2.OracleUpgradeInfo.serializeBinaryToWriter
    );
  }
  f = message.getOracleRegistrationVoteQueueElementsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Oracle oracles = 1;
 * @return {!Array<!proto.panacea.oracle.v2alpha2.Oracle>}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.getOraclesList = function() {
  return /** @type{!Array<!proto.panacea.oracle.v2alpha2.Oracle>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.panacea.oracle.v2alpha2.Oracle, 1));
};


/**
 * @param {!Array<!proto.panacea.oracle.v2alpha2.Oracle>} value
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
*/
proto.panacea.oracle.v2alpha2.GenesisState.prototype.setOraclesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.panacea.oracle.v2alpha2.Oracle=} opt_value
 * @param {number=} opt_index
 * @return {!proto.panacea.oracle.v2alpha2.Oracle}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.addOracles = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.panacea.oracle.v2alpha2.Oracle, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.clearOraclesList = function() {
  return this.setOraclesList([]);
};


/**
 * repeated OracleRegistration oracle_registrations = 2;
 * @return {!Array<!proto.panacea.oracle.v2alpha2.OracleRegistration>}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.getOracleRegistrationsList = function() {
  return /** @type{!Array<!proto.panacea.oracle.v2alpha2.OracleRegistration>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.panacea.oracle.v2alpha2.OracleRegistration, 2));
};


/**
 * @param {!Array<!proto.panacea.oracle.v2alpha2.OracleRegistration>} value
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
*/
proto.panacea.oracle.v2alpha2.GenesisState.prototype.setOracleRegistrationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.panacea.oracle.v2alpha2.OracleRegistration=} opt_value
 * @param {number=} opt_index
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.addOracleRegistrations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.panacea.oracle.v2alpha2.OracleRegistration, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.clearOracleRegistrationsList = function() {
  return this.setOracleRegistrationsList([]);
};


/**
 * repeated OracleRegistrationVote oracle_registration_votes = 3;
 * @return {!Array<!proto.panacea.oracle.v2alpha2.OracleRegistrationVote>}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.getOracleRegistrationVotesList = function() {
  return /** @type{!Array<!proto.panacea.oracle.v2alpha2.OracleRegistrationVote>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.panacea.oracle.v2alpha2.OracleRegistrationVote, 3));
};


/**
 * @param {!Array<!proto.panacea.oracle.v2alpha2.OracleRegistrationVote>} value
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
*/
proto.panacea.oracle.v2alpha2.GenesisState.prototype.setOracleRegistrationVotesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.panacea.oracle.v2alpha2.OracleRegistrationVote=} opt_value
 * @param {number=} opt_index
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistrationVote}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.addOracleRegistrationVotes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.panacea.oracle.v2alpha2.OracleRegistrationVote, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.clearOracleRegistrationVotesList = function() {
  return this.setOracleRegistrationVotesList([]);
};


/**
 * optional Params params = 4;
 * @return {?proto.panacea.oracle.v2alpha2.Params}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.panacea.oracle.v2alpha2.Params} */ (
    jspb.Message.getWrapperField(this, proto.panacea.oracle.v2alpha2.Params, 4));
};


/**
 * @param {?proto.panacea.oracle.v2alpha2.Params|undefined} value
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
*/
proto.panacea.oracle.v2alpha2.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional OracleUpgradeInfo oracle_upgrade_info = 5;
 * @return {?proto.panacea.oracle.v2alpha2.OracleUpgradeInfo}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.getOracleUpgradeInfo = function() {
  return /** @type{?proto.panacea.oracle.v2alpha2.OracleUpgradeInfo} */ (
    jspb.Message.getWrapperField(this, proto.panacea.oracle.v2alpha2.OracleUpgradeInfo, 5));
};


/**
 * @param {?proto.panacea.oracle.v2alpha2.OracleUpgradeInfo|undefined} value
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
*/
proto.panacea.oracle.v2alpha2.GenesisState.prototype.setOracleUpgradeInfo = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.clearOracleUpgradeInfo = function() {
  return this.setOracleUpgradeInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.hasOracleUpgradeInfo = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * repeated OracleRegistrationVoteQueueElement oracle_registration_vote_queue_elements = 6;
 * @return {!Array<!proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement>}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.getOracleRegistrationVoteQueueElementsList = function() {
  return /** @type{!Array<!proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement, 6));
};


/**
 * @param {!Array<!proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement>} value
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
*/
proto.panacea.oracle.v2alpha2.GenesisState.prototype.setOracleRegistrationVoteQueueElementsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement=} opt_value
 * @param {number=} opt_index
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement}
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.addOracleRegistrationVoteQueueElements = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.panacea.oracle.v2alpha2.OracleRegistrationVoteQueueElement, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.panacea.oracle.v2alpha2.GenesisState} returns this
 */
proto.panacea.oracle.v2alpha2.GenesisState.prototype.clearOracleRegistrationVoteQueueElementsList = function() {
  return this.setOracleRegistrationVoteQueueElementsList([]);
};


