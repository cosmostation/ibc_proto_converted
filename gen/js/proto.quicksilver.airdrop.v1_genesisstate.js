// source: quicksilver/airdrop/v1/genesis.proto
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

goog.provide('proto.quicksilver.airdrop.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.quicksilver.airdrop.v1.ClaimRecord');
goog.require('proto.quicksilver.airdrop.v1.Params');
goog.require('proto.quicksilver.airdrop.v1.ZoneDrop');

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
proto.quicksilver.airdrop.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.quicksilver.airdrop.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.quicksilver.airdrop.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quicksilver.airdrop.v1.GenesisState.displayName = 'proto.quicksilver.airdrop.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.quicksilver.airdrop.v1.GenesisState.repeatedFields_ = [2,3];



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
proto.quicksilver.airdrop.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.quicksilver.airdrop.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quicksilver.airdrop.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.airdrop.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.quicksilver.airdrop.v1.Params.toObject(includeInstance, f),
    zoneDropsList: jspb.Message.toObjectList(msg.getZoneDropsList(),
    proto.quicksilver.airdrop.v1.ZoneDrop.toObject, includeInstance),
    claimRecordsList: jspb.Message.toObjectList(msg.getClaimRecordsList(),
    proto.quicksilver.airdrop.v1.ClaimRecord.toObject, includeInstance)
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
 * @return {!proto.quicksilver.airdrop.v1.GenesisState}
 */
proto.quicksilver.airdrop.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quicksilver.airdrop.v1.GenesisState;
  return proto.quicksilver.airdrop.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quicksilver.airdrop.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quicksilver.airdrop.v1.GenesisState}
 */
proto.quicksilver.airdrop.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.quicksilver.airdrop.v1.Params;
      reader.readMessage(value,proto.quicksilver.airdrop.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.quicksilver.airdrop.v1.ZoneDrop;
      reader.readMessage(value,proto.quicksilver.airdrop.v1.ZoneDrop.deserializeBinaryFromReader);
      msg.addZoneDrops(value);
      break;
    case 3:
      var value = new proto.quicksilver.airdrop.v1.ClaimRecord;
      reader.readMessage(value,proto.quicksilver.airdrop.v1.ClaimRecord.deserializeBinaryFromReader);
      msg.addClaimRecords(value);
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
proto.quicksilver.airdrop.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quicksilver.airdrop.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quicksilver.airdrop.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.airdrop.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.quicksilver.airdrop.v1.Params.serializeBinaryToWriter
    );
  }
  f = message.getZoneDropsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.quicksilver.airdrop.v1.ZoneDrop.serializeBinaryToWriter
    );
  }
  f = message.getClaimRecordsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.quicksilver.airdrop.v1.ClaimRecord.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.quicksilver.airdrop.v1.Params}
 */
proto.quicksilver.airdrop.v1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.quicksilver.airdrop.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.quicksilver.airdrop.v1.Params, 1));
};


/**
 * @param {?proto.quicksilver.airdrop.v1.Params|undefined} value
 * @return {!proto.quicksilver.airdrop.v1.GenesisState} returns this
*/
proto.quicksilver.airdrop.v1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.quicksilver.airdrop.v1.GenesisState} returns this
 */
proto.quicksilver.airdrop.v1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.quicksilver.airdrop.v1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated ZoneDrop zone_drops = 2;
 * @return {!Array<!proto.quicksilver.airdrop.v1.ZoneDrop>}
 */
proto.quicksilver.airdrop.v1.GenesisState.prototype.getZoneDropsList = function() {
  return /** @type{!Array<!proto.quicksilver.airdrop.v1.ZoneDrop>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.quicksilver.airdrop.v1.ZoneDrop, 2));
};


/**
 * @param {!Array<!proto.quicksilver.airdrop.v1.ZoneDrop>} value
 * @return {!proto.quicksilver.airdrop.v1.GenesisState} returns this
*/
proto.quicksilver.airdrop.v1.GenesisState.prototype.setZoneDropsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.quicksilver.airdrop.v1.ZoneDrop=} opt_value
 * @param {number=} opt_index
 * @return {!proto.quicksilver.airdrop.v1.ZoneDrop}
 */
proto.quicksilver.airdrop.v1.GenesisState.prototype.addZoneDrops = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.quicksilver.airdrop.v1.ZoneDrop, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.quicksilver.airdrop.v1.GenesisState} returns this
 */
proto.quicksilver.airdrop.v1.GenesisState.prototype.clearZoneDropsList = function() {
  return this.setZoneDropsList([]);
};


/**
 * repeated ClaimRecord claim_records = 3;
 * @return {!Array<!proto.quicksilver.airdrop.v1.ClaimRecord>}
 */
proto.quicksilver.airdrop.v1.GenesisState.prototype.getClaimRecordsList = function() {
  return /** @type{!Array<!proto.quicksilver.airdrop.v1.ClaimRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.quicksilver.airdrop.v1.ClaimRecord, 3));
};


/**
 * @param {!Array<!proto.quicksilver.airdrop.v1.ClaimRecord>} value
 * @return {!proto.quicksilver.airdrop.v1.GenesisState} returns this
*/
proto.quicksilver.airdrop.v1.GenesisState.prototype.setClaimRecordsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.quicksilver.airdrop.v1.ClaimRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.quicksilver.airdrop.v1.ClaimRecord}
 */
proto.quicksilver.airdrop.v1.GenesisState.prototype.addClaimRecords = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.quicksilver.airdrop.v1.ClaimRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.quicksilver.airdrop.v1.GenesisState} returns this
 */
proto.quicksilver.airdrop.v1.GenesisState.prototype.clearClaimRecordsList = function() {
  return this.setClaimRecordsList([]);
};


