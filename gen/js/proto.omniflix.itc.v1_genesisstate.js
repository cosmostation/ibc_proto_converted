// source: OmniFlix/itc/v1/genesis.proto
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

goog.provide('proto.OmniFlix.itc.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.OmniFlix.itc.v1.Campaign');
goog.require('proto.OmniFlix.itc.v1.Claim');
goog.require('proto.OmniFlix.itc.v1.Params');

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
proto.OmniFlix.itc.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.OmniFlix.itc.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.OmniFlix.itc.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.OmniFlix.itc.v1.GenesisState.displayName = 'proto.OmniFlix.itc.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.OmniFlix.itc.v1.GenesisState.repeatedFields_ = [1,3];



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
proto.OmniFlix.itc.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.OmniFlix.itc.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.OmniFlix.itc.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.itc.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    campaignsList: jspb.Message.toObjectList(msg.getCampaignsList(),
    proto.OmniFlix.itc.v1.Campaign.toObject, includeInstance),
    nextCampaignNumber: jspb.Message.getFieldWithDefault(msg, 2, 0),
    claimsList: jspb.Message.toObjectList(msg.getClaimsList(),
    proto.OmniFlix.itc.v1.Claim.toObject, includeInstance),
    params: (f = msg.getParams()) && proto.OmniFlix.itc.v1.Params.toObject(includeInstance, f)
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
 * @return {!proto.OmniFlix.itc.v1.GenesisState}
 */
proto.OmniFlix.itc.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.OmniFlix.itc.v1.GenesisState;
  return proto.OmniFlix.itc.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.OmniFlix.itc.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.OmniFlix.itc.v1.GenesisState}
 */
proto.OmniFlix.itc.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.OmniFlix.itc.v1.Campaign;
      reader.readMessage(value,proto.OmniFlix.itc.v1.Campaign.deserializeBinaryFromReader);
      msg.addCampaigns(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setNextCampaignNumber(value);
      break;
    case 3:
      var value = new proto.OmniFlix.itc.v1.Claim;
      reader.readMessage(value,proto.OmniFlix.itc.v1.Claim.deserializeBinaryFromReader);
      msg.addClaims(value);
      break;
    case 4:
      var value = new proto.OmniFlix.itc.v1.Params;
      reader.readMessage(value,proto.OmniFlix.itc.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
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
proto.OmniFlix.itc.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.OmniFlix.itc.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.OmniFlix.itc.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.itc.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCampaignsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.OmniFlix.itc.v1.Campaign.serializeBinaryToWriter
    );
  }
  f = message.getNextCampaignNumber();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getClaimsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.OmniFlix.itc.v1.Claim.serializeBinaryToWriter
    );
  }
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.OmniFlix.itc.v1.Params.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Campaign campaigns = 1;
 * @return {!Array<!proto.OmniFlix.itc.v1.Campaign>}
 */
proto.OmniFlix.itc.v1.GenesisState.prototype.getCampaignsList = function() {
  return /** @type{!Array<!proto.OmniFlix.itc.v1.Campaign>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.OmniFlix.itc.v1.Campaign, 1));
};


/**
 * @param {!Array<!proto.OmniFlix.itc.v1.Campaign>} value
 * @return {!proto.OmniFlix.itc.v1.GenesisState} returns this
*/
proto.OmniFlix.itc.v1.GenesisState.prototype.setCampaignsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.OmniFlix.itc.v1.Campaign=} opt_value
 * @param {number=} opt_index
 * @return {!proto.OmniFlix.itc.v1.Campaign}
 */
proto.OmniFlix.itc.v1.GenesisState.prototype.addCampaigns = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.OmniFlix.itc.v1.Campaign, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.OmniFlix.itc.v1.GenesisState} returns this
 */
proto.OmniFlix.itc.v1.GenesisState.prototype.clearCampaignsList = function() {
  return this.setCampaignsList([]);
};


/**
 * optional uint64 next_campaign_number = 2;
 * @return {number}
 */
proto.OmniFlix.itc.v1.GenesisState.prototype.getNextCampaignNumber = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.OmniFlix.itc.v1.GenesisState} returns this
 */
proto.OmniFlix.itc.v1.GenesisState.prototype.setNextCampaignNumber = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * repeated Claim claims = 3;
 * @return {!Array<!proto.OmniFlix.itc.v1.Claim>}
 */
proto.OmniFlix.itc.v1.GenesisState.prototype.getClaimsList = function() {
  return /** @type{!Array<!proto.OmniFlix.itc.v1.Claim>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.OmniFlix.itc.v1.Claim, 3));
};


/**
 * @param {!Array<!proto.OmniFlix.itc.v1.Claim>} value
 * @return {!proto.OmniFlix.itc.v1.GenesisState} returns this
*/
proto.OmniFlix.itc.v1.GenesisState.prototype.setClaimsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.OmniFlix.itc.v1.Claim=} opt_value
 * @param {number=} opt_index
 * @return {!proto.OmniFlix.itc.v1.Claim}
 */
proto.OmniFlix.itc.v1.GenesisState.prototype.addClaims = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.OmniFlix.itc.v1.Claim, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.OmniFlix.itc.v1.GenesisState} returns this
 */
proto.OmniFlix.itc.v1.GenesisState.prototype.clearClaimsList = function() {
  return this.setClaimsList([]);
};


/**
 * optional Params params = 4;
 * @return {?proto.OmniFlix.itc.v1.Params}
 */
proto.OmniFlix.itc.v1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.OmniFlix.itc.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.OmniFlix.itc.v1.Params, 4));
};


/**
 * @param {?proto.OmniFlix.itc.v1.Params|undefined} value
 * @return {!proto.OmniFlix.itc.v1.GenesisState} returns this
*/
proto.OmniFlix.itc.v1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.itc.v1.GenesisState} returns this
 */
proto.OmniFlix.itc.v1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.itc.v1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 4) != null;
};


