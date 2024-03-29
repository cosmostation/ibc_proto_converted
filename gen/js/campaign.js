// source: OmniFlix/itc/v1/itc.proto
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

goog.provide('proto.OmniFlix.itc.v1.Campaign');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.OmniFlix.itc.v1.Distribution');
goog.require('proto.OmniFlix.itc.v1.NFTDetails');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Timestamp');

goog.forwardDeclare('proto.OmniFlix.itc.v1.ClaimType');
goog.forwardDeclare('proto.OmniFlix.itc.v1.InteractionType');
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
proto.OmniFlix.itc.v1.Campaign = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.OmniFlix.itc.v1.Campaign.repeatedFields_, null);
};
goog.inherits(proto.OmniFlix.itc.v1.Campaign, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.OmniFlix.itc.v1.Campaign.displayName = 'proto.OmniFlix.itc.v1.Campaign';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.OmniFlix.itc.v1.Campaign.repeatedFields_ = [14];



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
proto.OmniFlix.itc.v1.Campaign.prototype.toObject = function(opt_includeInstance) {
  return proto.OmniFlix.itc.v1.Campaign.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.OmniFlix.itc.v1.Campaign} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.itc.v1.Campaign.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    description: jspb.Message.getFieldWithDefault(msg, 3, ""),
    startTime: (f = msg.getStartTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    endTime: (f = msg.getEndTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    creator: jspb.Message.getFieldWithDefault(msg, 6, ""),
    nftDenomId: jspb.Message.getFieldWithDefault(msg, 7, ""),
    maxAllowedClaims: jspb.Message.getFieldWithDefault(msg, 8, 0),
    interaction: jspb.Message.getFieldWithDefault(msg, 9, 0),
    claimType: jspb.Message.getFieldWithDefault(msg, 10, 0),
    tokensPerClaim: (f = msg.getTokensPerClaim()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    totalTokens: (f = msg.getTotalTokens()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    availableTokens: (f = msg.getAvailableTokens()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    receivedNftIdsList: (f = jspb.Message.getRepeatedField(msg, 14)) == null ? undefined : f,
    nftMintDetails: (f = msg.getNftMintDetails()) && proto.OmniFlix.itc.v1.NFTDetails.toObject(includeInstance, f),
    distribution: (f = msg.getDistribution()) && proto.OmniFlix.itc.v1.Distribution.toObject(includeInstance, f),
    mintCount: jspb.Message.getFieldWithDefault(msg, 17, 0),
    claimCount: jspb.Message.getFieldWithDefault(msg, 18, 0)
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
 * @return {!proto.OmniFlix.itc.v1.Campaign}
 */
proto.OmniFlix.itc.v1.Campaign.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.OmniFlix.itc.v1.Campaign;
  return proto.OmniFlix.itc.v1.Campaign.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.OmniFlix.itc.v1.Campaign} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.OmniFlix.itc.v1.Campaign}
 */
proto.OmniFlix.itc.v1.Campaign.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartTime(value);
      break;
    case 5:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setEndTime(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setNftDenomId(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxAllowedClaims(value);
      break;
    case 9:
      var value = /** @type {!proto.OmniFlix.itc.v1.InteractionType} */ (reader.readEnum());
      msg.setInteraction(value);
      break;
    case 10:
      var value = /** @type {!proto.OmniFlix.itc.v1.ClaimType} */ (reader.readEnum());
      msg.setClaimType(value);
      break;
    case 11:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTokensPerClaim(value);
      break;
    case 12:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTotalTokens(value);
      break;
    case 13:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAvailableTokens(value);
      break;
    case 14:
      var value = /** @type {string} */ (reader.readString());
      msg.addReceivedNftIds(value);
      break;
    case 15:
      var value = new proto.OmniFlix.itc.v1.NFTDetails;
      reader.readMessage(value,proto.OmniFlix.itc.v1.NFTDetails.deserializeBinaryFromReader);
      msg.setNftMintDetails(value);
      break;
    case 16:
      var value = new proto.OmniFlix.itc.v1.Distribution;
      reader.readMessage(value,proto.OmniFlix.itc.v1.Distribution.deserializeBinaryFromReader);
      msg.setDistribution(value);
      break;
    case 17:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMintCount(value);
      break;
    case 18:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setClaimCount(value);
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
proto.OmniFlix.itc.v1.Campaign.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.OmniFlix.itc.v1.Campaign.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.OmniFlix.itc.v1.Campaign} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.itc.v1.Campaign.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getStartTime();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getEndTime();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getNftDenomId();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getMaxAllowedClaims();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
  f = message.getInteraction();
  if (f !== 0.0) {
    writer.writeEnum(
      9,
      f
    );
  }
  f = message.getClaimType();
  if (f !== 0.0) {
    writer.writeEnum(
      10,
      f
    );
  }
  f = message.getTokensPerClaim();
  if (f != null) {
    writer.writeMessage(
      11,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTotalTokens();
  if (f != null) {
    writer.writeMessage(
      12,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getAvailableTokens();
  if (f != null) {
    writer.writeMessage(
      13,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getReceivedNftIdsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      14,
      f
    );
  }
  f = message.getNftMintDetails();
  if (f != null) {
    writer.writeMessage(
      15,
      f,
      proto.OmniFlix.itc.v1.NFTDetails.serializeBinaryToWriter
    );
  }
  f = message.getDistribution();
  if (f != null) {
    writer.writeMessage(
      16,
      f,
      proto.OmniFlix.itc.v1.Distribution.serializeBinaryToWriter
    );
  }
  f = message.getMintCount();
  if (f !== 0) {
    writer.writeUint64(
      17,
      f
    );
  }
  f = message.getClaimCount();
  if (f !== 0) {
    writer.writeUint64(
      18,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string description = 3;
 * @return {string}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional google.protobuf.Timestamp start_time = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getStartTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
*/
proto.OmniFlix.itc.v1.Campaign.prototype.setStartTime = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.clearStartTime = function() {
  return this.setStartTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.hasStartTime = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional google.protobuf.Timestamp end_time = 5;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getEndTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 5));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
*/
proto.OmniFlix.itc.v1.Campaign.prototype.setEndTime = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.clearEndTime = function() {
  return this.setEndTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.hasEndTime = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional string creator = 6;
 * @return {string}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string nft_denom_id = 7;
 * @return {string}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getNftDenomId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.setNftDenomId = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional uint64 max_allowed_claims = 8;
 * @return {number}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getMaxAllowedClaims = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.setMaxAllowedClaims = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional InteractionType interaction = 9;
 * @return {!proto.OmniFlix.itc.v1.InteractionType}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getInteraction = function() {
  return /** @type {!proto.OmniFlix.itc.v1.InteractionType} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {!proto.OmniFlix.itc.v1.InteractionType} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.setInteraction = function(value) {
  return jspb.Message.setProto3EnumField(this, 9, value);
};


/**
 * optional ClaimType claim_type = 10;
 * @return {!proto.OmniFlix.itc.v1.ClaimType}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getClaimType = function() {
  return /** @type {!proto.OmniFlix.itc.v1.ClaimType} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {!proto.OmniFlix.itc.v1.ClaimType} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.setClaimType = function(value) {
  return jspb.Message.setProto3EnumField(this, 10, value);
};


/**
 * optional cosmos.base.v1beta1.Coin tokens_per_claim = 11;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getTokensPerClaim = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 11));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
*/
proto.OmniFlix.itc.v1.Campaign.prototype.setTokensPerClaim = function(value) {
  return jspb.Message.setWrapperField(this, 11, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.clearTokensPerClaim = function() {
  return this.setTokensPerClaim(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.hasTokensPerClaim = function() {
  return jspb.Message.getField(this, 11) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin total_tokens = 12;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getTotalTokens = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 12));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
*/
proto.OmniFlix.itc.v1.Campaign.prototype.setTotalTokens = function(value) {
  return jspb.Message.setWrapperField(this, 12, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.clearTotalTokens = function() {
  return this.setTotalTokens(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.hasTotalTokens = function() {
  return jspb.Message.getField(this, 12) != null;
};


/**
 * optional cosmos.base.v1beta1.Coin available_tokens = 13;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getAvailableTokens = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 13));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
*/
proto.OmniFlix.itc.v1.Campaign.prototype.setAvailableTokens = function(value) {
  return jspb.Message.setWrapperField(this, 13, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.clearAvailableTokens = function() {
  return this.setAvailableTokens(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.hasAvailableTokens = function() {
  return jspb.Message.getField(this, 13) != null;
};


/**
 * repeated string received_nft_ids = 14;
 * @return {!Array<string>}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getReceivedNftIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 14));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.setReceivedNftIdsList = function(value) {
  return jspb.Message.setField(this, 14, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.addReceivedNftIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 14, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.clearReceivedNftIdsList = function() {
  return this.setReceivedNftIdsList([]);
};


/**
 * optional NFTDetails nft_mint_details = 15;
 * @return {?proto.OmniFlix.itc.v1.NFTDetails}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getNftMintDetails = function() {
  return /** @type{?proto.OmniFlix.itc.v1.NFTDetails} */ (
    jspb.Message.getWrapperField(this, proto.OmniFlix.itc.v1.NFTDetails, 15));
};


/**
 * @param {?proto.OmniFlix.itc.v1.NFTDetails|undefined} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
*/
proto.OmniFlix.itc.v1.Campaign.prototype.setNftMintDetails = function(value) {
  return jspb.Message.setWrapperField(this, 15, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.clearNftMintDetails = function() {
  return this.setNftMintDetails(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.hasNftMintDetails = function() {
  return jspb.Message.getField(this, 15) != null;
};


/**
 * optional Distribution distribution = 16;
 * @return {?proto.OmniFlix.itc.v1.Distribution}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getDistribution = function() {
  return /** @type{?proto.OmniFlix.itc.v1.Distribution} */ (
    jspb.Message.getWrapperField(this, proto.OmniFlix.itc.v1.Distribution, 16));
};


/**
 * @param {?proto.OmniFlix.itc.v1.Distribution|undefined} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
*/
proto.OmniFlix.itc.v1.Campaign.prototype.setDistribution = function(value) {
  return jspb.Message.setWrapperField(this, 16, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.clearDistribution = function() {
  return this.setDistribution(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.hasDistribution = function() {
  return jspb.Message.getField(this, 16) != null;
};


/**
 * optional uint64 mint_count = 17;
 * @return {number}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getMintCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 17, 0));
};


/**
 * @param {number} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.setMintCount = function(value) {
  return jspb.Message.setProto3IntField(this, 17, value);
};


/**
 * optional uint64 claim_count = 18;
 * @return {number}
 */
proto.OmniFlix.itc.v1.Campaign.prototype.getClaimCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 18, 0));
};


/**
 * @param {number} value
 * @return {!proto.OmniFlix.itc.v1.Campaign} returns this
 */
proto.OmniFlix.itc.v1.Campaign.prototype.setClaimCount = function(value) {
  return jspb.Message.setProto3IntField(this, 18, value);
};


