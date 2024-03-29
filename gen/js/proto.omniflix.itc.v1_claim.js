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

goog.provide('proto.OmniFlix.itc.v1.Claim');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.OmniFlix.itc.v1.Claim = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.OmniFlix.itc.v1.Claim, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.OmniFlix.itc.v1.Claim.displayName = 'proto.OmniFlix.itc.v1.Claim';
}



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
proto.OmniFlix.itc.v1.Claim.prototype.toObject = function(opt_includeInstance) {
  return proto.OmniFlix.itc.v1.Claim.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.OmniFlix.itc.v1.Claim} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.itc.v1.Claim.toObject = function(includeInstance, msg) {
  var f, obj = {
    campaignId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    address: jspb.Message.getFieldWithDefault(msg, 2, ""),
    nftId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    interaction: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.OmniFlix.itc.v1.Claim}
 */
proto.OmniFlix.itc.v1.Claim.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.OmniFlix.itc.v1.Claim;
  return proto.OmniFlix.itc.v1.Claim.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.OmniFlix.itc.v1.Claim} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.OmniFlix.itc.v1.Claim}
 */
proto.OmniFlix.itc.v1.Claim.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCampaignId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setNftId(value);
      break;
    case 4:
      var value = /** @type {!proto.OmniFlix.itc.v1.InteractionType} */ (reader.readEnum());
      msg.setInteraction(value);
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
proto.OmniFlix.itc.v1.Claim.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.OmniFlix.itc.v1.Claim.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.OmniFlix.itc.v1.Claim} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.itc.v1.Claim.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCampaignId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getNftId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getInteraction();
  if (f !== 0.0) {
    writer.writeEnum(
      4,
      f
    );
  }
};


/**
 * optional uint64 campaign_id = 1;
 * @return {number}
 */
proto.OmniFlix.itc.v1.Claim.prototype.getCampaignId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.OmniFlix.itc.v1.Claim} returns this
 */
proto.OmniFlix.itc.v1.Claim.prototype.setCampaignId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string address = 2;
 * @return {string}
 */
proto.OmniFlix.itc.v1.Claim.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.itc.v1.Claim} returns this
 */
proto.OmniFlix.itc.v1.Claim.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string nft_id = 3;
 * @return {string}
 */
proto.OmniFlix.itc.v1.Claim.prototype.getNftId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.itc.v1.Claim} returns this
 */
proto.OmniFlix.itc.v1.Claim.prototype.setNftId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional InteractionType interaction = 4;
 * @return {!proto.OmniFlix.itc.v1.InteractionType}
 */
proto.OmniFlix.itc.v1.Claim.prototype.getInteraction = function() {
  return /** @type {!proto.OmniFlix.itc.v1.InteractionType} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {!proto.OmniFlix.itc.v1.InteractionType} value
 * @return {!proto.OmniFlix.itc.v1.Claim} returns this
 */
proto.OmniFlix.itc.v1.Claim.prototype.setInteraction = function(value) {
  return jspb.Message.setProto3EnumField(this, 4, value);
};


