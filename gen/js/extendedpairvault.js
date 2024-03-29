// source: comdex/asset/v1beta1/extendedPairVault.proto
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

goog.provide('proto.comdex.asset.v1beta1.ExtendedPairVault');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');

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
proto.comdex.asset.v1beta1.ExtendedPairVault = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.asset.v1beta1.ExtendedPairVault, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.asset.v1beta1.ExtendedPairVault.displayName = 'proto.comdex.asset.v1beta1.ExtendedPairVault';
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
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.asset.v1beta1.ExtendedPairVault.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.asset.v1beta1.ExtendedPairVault} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    appId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    pairId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    stabilityFee: jspb.Message.getFieldWithDefault(msg, 4, ""),
    closingFee: jspb.Message.getFieldWithDefault(msg, 5, ""),
    liquidationPenalty: jspb.Message.getFieldWithDefault(msg, 6, ""),
    drawDownFee: jspb.Message.getFieldWithDefault(msg, 7, ""),
    isVaultActive: jspb.Message.getBooleanFieldWithDefault(msg, 8, false),
    debtCeiling: jspb.Message.getFieldWithDefault(msg, 9, ""),
    debtFloor: jspb.Message.getFieldWithDefault(msg, 10, ""),
    isStableMintVault: jspb.Message.getBooleanFieldWithDefault(msg, 11, false),
    minCr: jspb.Message.getFieldWithDefault(msg, 12, ""),
    pairName: jspb.Message.getFieldWithDefault(msg, 13, ""),
    assetOutOraclePrice: jspb.Message.getBooleanFieldWithDefault(msg, 14, false),
    assetOutPrice: jspb.Message.getFieldWithDefault(msg, 15, 0),
    minUsdValueLeft: jspb.Message.getFieldWithDefault(msg, 16, 0),
    blockHeight: jspb.Message.getFieldWithDefault(msg, 17, 0),
    blockTime: (f = msg.getBlockTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.asset.v1beta1.ExtendedPairVault;
  return proto.comdex.asset.v1beta1.ExtendedPairVault.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.asset.v1beta1.ExtendedPairVault} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAppId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPairId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setStabilityFee(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setClosingFee(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setLiquidationPenalty(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setDrawDownFee(value);
      break;
    case 8:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsVaultActive(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setDebtCeiling(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setDebtFloor(value);
      break;
    case 11:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsStableMintVault(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinCr(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.setPairName(value);
      break;
    case 14:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setAssetOutOraclePrice(value);
      break;
    case 15:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAssetOutPrice(value);
      break;
    case 16:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMinUsdValueLeft(value);
      break;
    case 17:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setBlockHeight(value);
      break;
    case 18:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setBlockTime(value);
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
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.asset.v1beta1.ExtendedPairVault.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.asset.v1beta1.ExtendedPairVault} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAppId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getPairId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getStabilityFee();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getClosingFee();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getLiquidationPenalty();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getDrawDownFee();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getIsVaultActive();
  if (f) {
    writer.writeBool(
      8,
      f
    );
  }
  f = message.getDebtCeiling();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getDebtFloor();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getIsStableMintVault();
  if (f) {
    writer.writeBool(
      11,
      f
    );
  }
  f = message.getMinCr();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
  f = message.getPairName();
  if (f.length > 0) {
    writer.writeString(
      13,
      f
    );
  }
  f = message.getAssetOutOraclePrice();
  if (f) {
    writer.writeBool(
      14,
      f
    );
  }
  f = message.getAssetOutPrice();
  if (f !== 0) {
    writer.writeUint64(
      15,
      f
    );
  }
  f = message.getMinUsdValueLeft();
  if (f !== 0) {
    writer.writeUint64(
      16,
      f
    );
  }
  f = message.getBlockHeight();
  if (f !== 0) {
    writer.writeInt64(
      17,
      f
    );
  }
  f = message.getBlockTime();
  if (f != null) {
    writer.writeMessage(
      18,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 app_id = 2;
 * @return {number}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getAppId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setAppId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 pair_id = 3;
 * @return {number}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getPairId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setPairId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string stability_fee = 4;
 * @return {string}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getStabilityFee = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setStabilityFee = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string closing_fee = 5;
 * @return {string}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getClosingFee = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setClosingFee = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string liquidation_penalty = 6;
 * @return {string}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getLiquidationPenalty = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setLiquidationPenalty = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string draw_down_fee = 7;
 * @return {string}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getDrawDownFee = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setDrawDownFee = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional bool is_vault_active = 8;
 * @return {boolean}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getIsVaultActive = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 8, false));
};


/**
 * @param {boolean} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setIsVaultActive = function(value) {
  return jspb.Message.setProto3BooleanField(this, 8, value);
};


/**
 * optional string debt_ceiling = 9;
 * @return {string}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getDebtCeiling = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setDebtCeiling = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional string debt_floor = 10;
 * @return {string}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getDebtFloor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setDebtFloor = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * optional bool is_stable_mint_vault = 11;
 * @return {boolean}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getIsStableMintVault = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 11, false));
};


/**
 * @param {boolean} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setIsStableMintVault = function(value) {
  return jspb.Message.setProto3BooleanField(this, 11, value);
};


/**
 * optional string min_cr = 12;
 * @return {string}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getMinCr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setMinCr = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


/**
 * optional string pair_name = 13;
 * @return {string}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getPairName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 13, ""));
};


/**
 * @param {string} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setPairName = function(value) {
  return jspb.Message.setProto3StringField(this, 13, value);
};


/**
 * optional bool asset_out_oracle_price = 14;
 * @return {boolean}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getAssetOutOraclePrice = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 14, false));
};


/**
 * @param {boolean} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setAssetOutOraclePrice = function(value) {
  return jspb.Message.setProto3BooleanField(this, 14, value);
};


/**
 * optional uint64 asset_out_price = 15;
 * @return {number}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getAssetOutPrice = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 15, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setAssetOutPrice = function(value) {
  return jspb.Message.setProto3IntField(this, 15, value);
};


/**
 * optional uint64 min_usd_value_left = 16;
 * @return {number}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getMinUsdValueLeft = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 16, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setMinUsdValueLeft = function(value) {
  return jspb.Message.setProto3IntField(this, 16, value);
};


/**
 * optional int64 block_height = 17;
 * @return {number}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getBlockHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 17, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setBlockHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 17, value);
};


/**
 * optional google.protobuf.Timestamp block_time = 18;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.getBlockTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 18));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
*/
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.setBlockTime = function(value) {
  return jspb.Message.setWrapperField(this, 18, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.comdex.asset.v1beta1.ExtendedPairVault} returns this
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.clearBlockTime = function() {
  return this.setBlockTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.comdex.asset.v1beta1.ExtendedPairVault.prototype.hasBlockTime = function() {
  return jspb.Message.getField(this, 18) != null;
};


