// source: stafihub/bridge/genesis.proto
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

goog.provide('proto.stafihub.stafihub.bridge.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.bridge.BannedDenom');
goog.require('proto.stafihub.stafihub.bridge.DepositCount');
goog.require('proto.stafihub.stafihub.bridge.GenesisProposal');
goog.require('proto.stafihub.stafihub.bridge.Params');
goog.require('proto.stafihub.stafihub.bridge.RelayFee');
goog.require('proto.stafihub.stafihub.bridge.ResourceIdToDenom');

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
proto.stafihub.stafihub.bridge.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stafihub.stafihub.bridge.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.stafihub.stafihub.bridge.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.bridge.GenesisState.displayName = 'proto.stafihub.stafihub.bridge.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stafihub.stafihub.bridge.GenesisState.repeatedFields_ = [2,3,4,5,7,8];



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
proto.stafihub.stafihub.bridge.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.bridge.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.bridge.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.bridge.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.stafihub.stafihub.bridge.Params.toObject(includeInstance, f),
    depositcountlistList: jspb.Message.toObjectList(msg.getDepositcountlistList(),
    proto.stafihub.stafihub.bridge.DepositCount.toObject, includeInstance),
    proposallistList: jspb.Message.toObjectList(msg.getProposallistList(),
    proto.stafihub.stafihub.bridge.GenesisProposal.toObject, includeInstance),
    relayfeelistList: jspb.Message.toObjectList(msg.getRelayfeelistList(),
    proto.stafihub.stafihub.bridge.RelayFee.toObject, includeInstance),
    chainidlistList: (f = jspb.Message.getRepeatedField(msg, 5)) == null ? undefined : f,
    relayfeereceiver: jspb.Message.getFieldWithDefault(msg, 6, ""),
    resourceidtodenomlistList: jspb.Message.toObjectList(msg.getResourceidtodenomlistList(),
    proto.stafihub.stafihub.bridge.ResourceIdToDenom.toObject, includeInstance),
    banneddenomlistList: jspb.Message.toObjectList(msg.getBanneddenomlistList(),
    proto.stafihub.stafihub.bridge.BannedDenom.toObject, includeInstance)
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
 * @return {!proto.stafihub.stafihub.bridge.GenesisState}
 */
proto.stafihub.stafihub.bridge.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.bridge.GenesisState;
  return proto.stafihub.stafihub.bridge.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.bridge.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.bridge.GenesisState}
 */
proto.stafihub.stafihub.bridge.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stafihub.stafihub.bridge.Params;
      reader.readMessage(value,proto.stafihub.stafihub.bridge.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.stafihub.stafihub.bridge.DepositCount;
      reader.readMessage(value,proto.stafihub.stafihub.bridge.DepositCount.deserializeBinaryFromReader);
      msg.addDepositcountlist(value);
      break;
    case 3:
      var value = new proto.stafihub.stafihub.bridge.GenesisProposal;
      reader.readMessage(value,proto.stafihub.stafihub.bridge.GenesisProposal.deserializeBinaryFromReader);
      msg.addProposallist(value);
      break;
    case 4:
      var value = new proto.stafihub.stafihub.bridge.RelayFee;
      reader.readMessage(value,proto.stafihub.stafihub.bridge.RelayFee.deserializeBinaryFromReader);
      msg.addRelayfeelist(value);
      break;
    case 5:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint32() : [reader.readUint32()]);
      for (var i = 0; i < values.length; i++) {
        msg.addChainidlist(values[i]);
      }
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setRelayfeereceiver(value);
      break;
    case 7:
      var value = new proto.stafihub.stafihub.bridge.ResourceIdToDenom;
      reader.readMessage(value,proto.stafihub.stafihub.bridge.ResourceIdToDenom.deserializeBinaryFromReader);
      msg.addResourceidtodenomlist(value);
      break;
    case 8:
      var value = new proto.stafihub.stafihub.bridge.BannedDenom;
      reader.readMessage(value,proto.stafihub.stafihub.bridge.BannedDenom.deserializeBinaryFromReader);
      msg.addBanneddenomlist(value);
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
proto.stafihub.stafihub.bridge.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.bridge.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.bridge.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.bridge.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.stafihub.stafihub.bridge.Params.serializeBinaryToWriter
    );
  }
  f = message.getDepositcountlistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.stafihub.stafihub.bridge.DepositCount.serializeBinaryToWriter
    );
  }
  f = message.getProposallistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.stafihub.stafihub.bridge.GenesisProposal.serializeBinaryToWriter
    );
  }
  f = message.getRelayfeelistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.stafihub.stafihub.bridge.RelayFee.serializeBinaryToWriter
    );
  }
  f = message.getChainidlistList();
  if (f.length > 0) {
    writer.writePackedUint32(
      5,
      f
    );
  }
  f = message.getRelayfeereceiver();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getResourceidtodenomlistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.stafihub.stafihub.bridge.ResourceIdToDenom.serializeBinaryToWriter
    );
  }
  f = message.getBanneddenomlistList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      8,
      f,
      proto.stafihub.stafihub.bridge.BannedDenom.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.stafihub.stafihub.bridge.Params}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.stafihub.stafihub.bridge.Params} */ (
    jspb.Message.getWrapperField(this, proto.stafihub.stafihub.bridge.Params, 1));
};


/**
 * @param {?proto.stafihub.stafihub.bridge.Params|undefined} value
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
*/
proto.stafihub.stafihub.bridge.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated DepositCount depositCountList = 2;
 * @return {!Array<!proto.stafihub.stafihub.bridge.DepositCount>}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.getDepositcountlistList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.bridge.DepositCount>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.bridge.DepositCount, 2));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.bridge.DepositCount>} value
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
*/
proto.stafihub.stafihub.bridge.GenesisState.prototype.setDepositcountlistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.stafihub.stafihub.bridge.DepositCount=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.bridge.DepositCount}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.addDepositcountlist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.stafihub.stafihub.bridge.DepositCount, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.clearDepositcountlistList = function() {
  return this.setDepositcountlistList([]);
};


/**
 * repeated GenesisProposal proposalList = 3;
 * @return {!Array<!proto.stafihub.stafihub.bridge.GenesisProposal>}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.getProposallistList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.bridge.GenesisProposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.bridge.GenesisProposal, 3));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.bridge.GenesisProposal>} value
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
*/
proto.stafihub.stafihub.bridge.GenesisState.prototype.setProposallistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.stafihub.stafihub.bridge.GenesisProposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.bridge.GenesisProposal}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.addProposallist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.stafihub.stafihub.bridge.GenesisProposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.clearProposallistList = function() {
  return this.setProposallistList([]);
};


/**
 * repeated RelayFee relayFeeList = 4;
 * @return {!Array<!proto.stafihub.stafihub.bridge.RelayFee>}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.getRelayfeelistList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.bridge.RelayFee>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.bridge.RelayFee, 4));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.bridge.RelayFee>} value
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
*/
proto.stafihub.stafihub.bridge.GenesisState.prototype.setRelayfeelistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.stafihub.stafihub.bridge.RelayFee=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.bridge.RelayFee}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.addRelayfeelist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.stafihub.stafihub.bridge.RelayFee, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.clearRelayfeelistList = function() {
  return this.setRelayfeelistList([]);
};


/**
 * repeated uint32 chainIdList = 5;
 * @return {!Array<number>}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.getChainidlistList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 5));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.setChainidlistList = function(value) {
  return jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.addChainidlist = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.clearChainidlistList = function() {
  return this.setChainidlistList([]);
};


/**
 * optional string relayFeeReceiver = 6;
 * @return {string}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.getRelayfeereceiver = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.setRelayfeereceiver = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * repeated ResourceIdToDenom resourceIdToDenomList = 7;
 * @return {!Array<!proto.stafihub.stafihub.bridge.ResourceIdToDenom>}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.getResourceidtodenomlistList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.bridge.ResourceIdToDenom>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.bridge.ResourceIdToDenom, 7));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.bridge.ResourceIdToDenom>} value
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
*/
proto.stafihub.stafihub.bridge.GenesisState.prototype.setResourceidtodenomlistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.stafihub.stafihub.bridge.ResourceIdToDenom=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.bridge.ResourceIdToDenom}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.addResourceidtodenomlist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.stafihub.stafihub.bridge.ResourceIdToDenom, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.clearResourceidtodenomlistList = function() {
  return this.setResourceidtodenomlistList([]);
};


/**
 * repeated BannedDenom bannedDenomList = 8;
 * @return {!Array<!proto.stafihub.stafihub.bridge.BannedDenom>}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.getBanneddenomlistList = function() {
  return /** @type{!Array<!proto.stafihub.stafihub.bridge.BannedDenom>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stafihub.stafihub.bridge.BannedDenom, 8));
};


/**
 * @param {!Array<!proto.stafihub.stafihub.bridge.BannedDenom>} value
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
*/
proto.stafihub.stafihub.bridge.GenesisState.prototype.setBanneddenomlistList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 8, value);
};


/**
 * @param {!proto.stafihub.stafihub.bridge.BannedDenom=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stafihub.stafihub.bridge.BannedDenom}
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.addBanneddenomlist = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 8, opt_value, proto.stafihub.stafihub.bridge.BannedDenom, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stafihub.stafihub.bridge.GenesisState} returns this
 */
proto.stafihub.stafihub.bridge.GenesisState.prototype.clearBanneddenomlistList = function() {
  return this.setBanneddenomlistList([]);
};


