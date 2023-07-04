// source: lum-network/beam/tx.proto
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

goog.provide('proto.lum.network.beam.MsgOpenBeam');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.lum.network.beam.BeamData');

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
proto.lum.network.beam.MsgOpenBeam = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lum.network.beam.MsgOpenBeam, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.beam.MsgOpenBeam.displayName = 'proto.lum.network.beam.MsgOpenBeam';
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
proto.lum.network.beam.MsgOpenBeam.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.beam.MsgOpenBeam.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.beam.MsgOpenBeam} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.beam.MsgOpenBeam.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    creatorAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
    secret: jspb.Message.getFieldWithDefault(msg, 3, ""),
    amount: (f = msg.getAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    schema: jspb.Message.getFieldWithDefault(msg, 5, ""),
    data: (f = msg.getData()) && proto.lum.network.beam.BeamData.toObject(includeInstance, f),
    claimAddress: jspb.Message.getFieldWithDefault(msg, 7, ""),
    claimExpiresAtBlock: jspb.Message.getFieldWithDefault(msg, 8, 0),
    closesAtBlock: jspb.Message.getFieldWithDefault(msg, 9, 0)
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
 * @return {!proto.lum.network.beam.MsgOpenBeam}
 */
proto.lum.network.beam.MsgOpenBeam.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.beam.MsgOpenBeam;
  return proto.lum.network.beam.MsgOpenBeam.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.beam.MsgOpenBeam} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.beam.MsgOpenBeam}
 */
proto.lum.network.beam.MsgOpenBeam.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreatorAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSecret(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setAmount(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSchema(value);
      break;
    case 6:
      var value = new proto.lum.network.beam.BeamData;
      reader.readMessage(value,proto.lum.network.beam.BeamData.deserializeBinaryFromReader);
      msg.setData(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setClaimAddress(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setClaimExpiresAtBlock(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setClosesAtBlock(value);
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
proto.lum.network.beam.MsgOpenBeam.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.beam.MsgOpenBeam.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.beam.MsgOpenBeam} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.beam.MsgOpenBeam.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCreatorAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSecret();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAmount();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getSchema();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getData();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.lum.network.beam.BeamData.serializeBinaryToWriter
    );
  }
  f = message.getClaimAddress();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getClaimExpiresAtBlock();
  if (f !== 0) {
    writer.writeInt32(
      8,
      f
    );
  }
  f = message.getClosesAtBlock();
  if (f !== 0) {
    writer.writeInt32(
      9,
      f
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.lum.network.beam.MsgOpenBeam.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.MsgOpenBeam} returns this
 */
proto.lum.network.beam.MsgOpenBeam.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string creator_address = 2;
 * @return {string}
 */
proto.lum.network.beam.MsgOpenBeam.prototype.getCreatorAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.MsgOpenBeam} returns this
 */
proto.lum.network.beam.MsgOpenBeam.prototype.setCreatorAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string secret = 3;
 * @return {string}
 */
proto.lum.network.beam.MsgOpenBeam.prototype.getSecret = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.MsgOpenBeam} returns this
 */
proto.lum.network.beam.MsgOpenBeam.prototype.setSecret = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional cosmos.base.v1beta1.Coin amount = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.lum.network.beam.MsgOpenBeam.prototype.getAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.lum.network.beam.MsgOpenBeam} returns this
*/
proto.lum.network.beam.MsgOpenBeam.prototype.setAmount = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.beam.MsgOpenBeam} returns this
 */
proto.lum.network.beam.MsgOpenBeam.prototype.clearAmount = function() {
  return this.setAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.beam.MsgOpenBeam.prototype.hasAmount = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional string schema = 5;
 * @return {string}
 */
proto.lum.network.beam.MsgOpenBeam.prototype.getSchema = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.MsgOpenBeam} returns this
 */
proto.lum.network.beam.MsgOpenBeam.prototype.setSchema = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional BeamData data = 6;
 * @return {?proto.lum.network.beam.BeamData}
 */
proto.lum.network.beam.MsgOpenBeam.prototype.getData = function() {
  return /** @type{?proto.lum.network.beam.BeamData} */ (
    jspb.Message.getWrapperField(this, proto.lum.network.beam.BeamData, 6));
};


/**
 * @param {?proto.lum.network.beam.BeamData|undefined} value
 * @return {!proto.lum.network.beam.MsgOpenBeam} returns this
*/
proto.lum.network.beam.MsgOpenBeam.prototype.setData = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.beam.MsgOpenBeam} returns this
 */
proto.lum.network.beam.MsgOpenBeam.prototype.clearData = function() {
  return this.setData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.beam.MsgOpenBeam.prototype.hasData = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional string claim_address = 7;
 * @return {string}
 */
proto.lum.network.beam.MsgOpenBeam.prototype.getClaimAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.MsgOpenBeam} returns this
 */
proto.lum.network.beam.MsgOpenBeam.prototype.setClaimAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional int32 claim_expires_at_block = 8;
 * @return {number}
 */
proto.lum.network.beam.MsgOpenBeam.prototype.getClaimExpiresAtBlock = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.lum.network.beam.MsgOpenBeam} returns this
 */
proto.lum.network.beam.MsgOpenBeam.prototype.setClaimExpiresAtBlock = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional int32 closes_at_block = 9;
 * @return {number}
 */
proto.lum.network.beam.MsgOpenBeam.prototype.getClosesAtBlock = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.lum.network.beam.MsgOpenBeam} returns this
 */
proto.lum.network.beam.MsgOpenBeam.prototype.setClosesAtBlock = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};

