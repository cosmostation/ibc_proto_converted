// source: panacea/datapool/v2alpha1/pool.proto
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

goog.provide('proto.panacea.datapool.v2alpha1.PoolParams');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.panacea.datapool.v2alpha1.PoolParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.panacea.datapool.v2alpha1.PoolParams.repeatedFields_, null);
};
goog.inherits(proto.panacea.datapool.v2alpha1.PoolParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.datapool.v2alpha1.PoolParams.displayName = 'proto.panacea.datapool.v2alpha1.PoolParams';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.panacea.datapool.v2alpha1.PoolParams.repeatedFields_ = [1,5,6];



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
proto.panacea.datapool.v2alpha1.PoolParams.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.datapool.v2alpha1.PoolParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.datapool.v2alpha1.PoolParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datapool.v2alpha1.PoolParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    dataSchemaList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
    targetNumData: jspb.Message.getFieldWithDefault(msg, 2, 0),
    maxNftSupply: jspb.Message.getFieldWithDefault(msg, 3, 0),
    nftPrice: (f = msg.getNftPrice()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    trustedOraclesList: (f = jspb.Message.getRepeatedField(msg, 5)) == null ? undefined : f,
    trustedDataIssuersList: (f = jspb.Message.getRepeatedField(msg, 6)) == null ? undefined : f
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
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams}
 */
proto.panacea.datapool.v2alpha1.PoolParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.datapool.v2alpha1.PoolParams;
  return proto.panacea.datapool.v2alpha1.PoolParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.datapool.v2alpha1.PoolParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams}
 */
proto.panacea.datapool.v2alpha1.PoolParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addDataSchema(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTargetNumData(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxNftSupply(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setNftPrice(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.addTrustedOracles(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.addTrustedDataIssuers(value);
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
proto.panacea.datapool.v2alpha1.PoolParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.datapool.v2alpha1.PoolParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.datapool.v2alpha1.PoolParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datapool.v2alpha1.PoolParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDataSchemaList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
  f = message.getTargetNumData();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getMaxNftSupply();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getNftPrice();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTrustedOraclesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      5,
      f
    );
  }
  f = message.getTrustedDataIssuersList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      6,
      f
    );
  }
};


/**
 * repeated string data_schema = 1;
 * @return {!Array<string>}
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.getDataSchemaList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.setDataSchemaList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.addDataSchema = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.clearDataSchemaList = function() {
  return this.setDataSchemaList([]);
};


/**
 * optional uint64 target_num_data = 2;
 * @return {number}
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.getTargetNumData = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.setTargetNumData = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 max_nft_supply = 3;
 * @return {number}
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.getMaxNftSupply = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.setMaxNftSupply = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional cosmos.base.v1beta1.Coin nft_price = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.getNftPrice = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
*/
proto.panacea.datapool.v2alpha1.PoolParams.prototype.setNftPrice = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.clearNftPrice = function() {
  return this.setNftPrice(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.hasNftPrice = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * repeated string trusted_oracles = 5;
 * @return {!Array<string>}
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.getTrustedOraclesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 5));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.setTrustedOraclesList = function(value) {
  return jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.addTrustedOracles = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.clearTrustedOraclesList = function() {
  return this.setTrustedOraclesList([]);
};


/**
 * repeated string trusted_data_issuers = 6;
 * @return {!Array<string>}
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.getTrustedDataIssuersList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 6));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.setTrustedDataIssuersList = function(value) {
  return jspb.Message.setField(this, 6, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.addTrustedDataIssuers = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 6, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.panacea.datapool.v2alpha1.PoolParams} returns this
 */
proto.panacea.datapool.v2alpha1.PoolParams.prototype.clearTrustedDataIssuersList = function() {
  return this.setTrustedDataIssuersList([]);
};


