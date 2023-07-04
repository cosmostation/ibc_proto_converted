// source: osmosis/protorev/v1beta1/genesis.proto
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

goog.provide('proto.osmosis.protorev.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.osmosis.protorev.v1beta1.BaseDenom');
goog.require('proto.osmosis.protorev.v1beta1.Params');
goog.require('proto.osmosis.protorev.v1beta1.PoolWeights');
goog.require('proto.osmosis.protorev.v1beta1.TokenPairArbRoutes');

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
proto.osmosis.protorev.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.protorev.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.osmosis.protorev.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.protorev.v1beta1.GenesisState.displayName = 'proto.osmosis.protorev.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.protorev.v1beta1.GenesisState.repeatedFields_ = [2,3,6];



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
proto.osmosis.protorev.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.protorev.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.protorev.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.protorev.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.osmosis.protorev.v1beta1.Params.toObject(includeInstance, f),
    tokenPairArbRoutesList: jspb.Message.toObjectList(msg.getTokenPairArbRoutesList(),
    proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.toObject, includeInstance),
    baseDenomsList: jspb.Message.toObjectList(msg.getBaseDenomsList(),
    proto.osmosis.protorev.v1beta1.BaseDenom.toObject, includeInstance),
    poolWeights: (f = msg.getPoolWeights()) && proto.osmosis.protorev.v1beta1.PoolWeights.toObject(includeInstance, f),
    daysSinceModuleGenesis: jspb.Message.getFieldWithDefault(msg, 5, 0),
    developerFeesList: jspb.Message.toObjectList(msg.getDeveloperFeesList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    latestBlockHeight: jspb.Message.getFieldWithDefault(msg, 7, 0),
    developerAddress: jspb.Message.getFieldWithDefault(msg, 8, ""),
    maxPoolPointsPerBlock: jspb.Message.getFieldWithDefault(msg, 9, 0),
    maxPoolPointsPerTx: jspb.Message.getFieldWithDefault(msg, 10, 0),
    pointCountForBlock: jspb.Message.getFieldWithDefault(msg, 11, 0)
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
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState}
 */
proto.osmosis.protorev.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.protorev.v1beta1.GenesisState;
  return proto.osmosis.protorev.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.protorev.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState}
 */
proto.osmosis.protorev.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.protorev.v1beta1.Params;
      reader.readMessage(value,proto.osmosis.protorev.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.osmosis.protorev.v1beta1.TokenPairArbRoutes;
      reader.readMessage(value,proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.deserializeBinaryFromReader);
      msg.addTokenPairArbRoutes(value);
      break;
    case 3:
      var value = new proto.osmosis.protorev.v1beta1.BaseDenom;
      reader.readMessage(value,proto.osmosis.protorev.v1beta1.BaseDenom.deserializeBinaryFromReader);
      msg.addBaseDenoms(value);
      break;
    case 4:
      var value = new proto.osmosis.protorev.v1beta1.PoolWeights;
      reader.readMessage(value,proto.osmosis.protorev.v1beta1.PoolWeights.deserializeBinaryFromReader);
      msg.setPoolWeights(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDaysSinceModuleGenesis(value);
      break;
    case 6:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addDeveloperFees(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLatestBlockHeight(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setDeveloperAddress(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxPoolPointsPerBlock(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxPoolPointsPerTx(value);
      break;
    case 11:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPointCountForBlock(value);
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
proto.osmosis.protorev.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.protorev.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.protorev.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.protorev.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.osmosis.protorev.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getTokenPairArbRoutesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.serializeBinaryToWriter
    );
  }
  f = message.getBaseDenomsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.osmosis.protorev.v1beta1.BaseDenom.serializeBinaryToWriter
    );
  }
  f = message.getPoolWeights();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.osmosis.protorev.v1beta1.PoolWeights.serializeBinaryToWriter
    );
  }
  f = message.getDaysSinceModuleGenesis();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getDeveloperFeesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getLatestBlockHeight();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getDeveloperAddress();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getMaxPoolPointsPerBlock();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
  f = message.getMaxPoolPointsPerTx();
  if (f !== 0) {
    writer.writeUint64(
      10,
      f
    );
  }
  f = message.getPointCountForBlock();
  if (f !== 0) {
    writer.writeUint64(
      11,
      f
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.osmosis.protorev.v1beta1.Params}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.osmosis.protorev.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.protorev.v1beta1.Params, 1));
};


/**
 * @param {?proto.osmosis.protorev.v1beta1.Params|undefined} value
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
*/
proto.osmosis.protorev.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated TokenPairArbRoutes token_pair_arb_routes = 2;
 * @return {!Array<!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes>}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.getTokenPairArbRoutesList = function() {
  return /** @type{!Array<!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.protorev.v1beta1.TokenPairArbRoutes, 2));
};


/**
 * @param {!Array<!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes>} value
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
*/
proto.osmosis.protorev.v1beta1.GenesisState.prototype.setTokenPairArbRoutesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.addTokenPairArbRoutes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.osmosis.protorev.v1beta1.TokenPairArbRoutes, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.clearTokenPairArbRoutesList = function() {
  return this.setTokenPairArbRoutesList([]);
};


/**
 * repeated BaseDenom base_denoms = 3;
 * @return {!Array<!proto.osmosis.protorev.v1beta1.BaseDenom>}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.getBaseDenomsList = function() {
  return /** @type{!Array<!proto.osmosis.protorev.v1beta1.BaseDenom>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.protorev.v1beta1.BaseDenom, 3));
};


/**
 * @param {!Array<!proto.osmosis.protorev.v1beta1.BaseDenom>} value
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
*/
proto.osmosis.protorev.v1beta1.GenesisState.prototype.setBaseDenomsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.osmosis.protorev.v1beta1.BaseDenom=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.protorev.v1beta1.BaseDenom}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.addBaseDenoms = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.osmosis.protorev.v1beta1.BaseDenom, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.clearBaseDenomsList = function() {
  return this.setBaseDenomsList([]);
};


/**
 * optional PoolWeights pool_weights = 4;
 * @return {?proto.osmosis.protorev.v1beta1.PoolWeights}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.getPoolWeights = function() {
  return /** @type{?proto.osmosis.protorev.v1beta1.PoolWeights} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.protorev.v1beta1.PoolWeights, 4));
};


/**
 * @param {?proto.osmosis.protorev.v1beta1.PoolWeights|undefined} value
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
*/
proto.osmosis.protorev.v1beta1.GenesisState.prototype.setPoolWeights = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.clearPoolWeights = function() {
  return this.setPoolWeights(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.hasPoolWeights = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional uint64 days_since_module_genesis = 5;
 * @return {number}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.getDaysSinceModuleGenesis = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.setDaysSinceModuleGenesis = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin developer_fees = 6;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.getDeveloperFeesList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 6));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
*/
proto.osmosis.protorev.v1beta1.GenesisState.prototype.setDeveloperFeesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.addDeveloperFees = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.clearDeveloperFeesList = function() {
  return this.setDeveloperFeesList([]);
};


/**
 * optional uint64 latest_block_height = 7;
 * @return {number}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.getLatestBlockHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.setLatestBlockHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional string developer_address = 8;
 * @return {string}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.getDeveloperAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.setDeveloperAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional uint64 max_pool_points_per_block = 9;
 * @return {number}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.getMaxPoolPointsPerBlock = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.setMaxPoolPointsPerBlock = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional uint64 max_pool_points_per_tx = 10;
 * @return {number}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.getMaxPoolPointsPerTx = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.setMaxPoolPointsPerTx = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


/**
 * optional uint64 point_count_for_block = 11;
 * @return {number}
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.getPointCountForBlock = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.protorev.v1beta1.GenesisState} returns this
 */
proto.osmosis.protorev.v1beta1.GenesisState.prototype.setPointCountForBlock = function(value) {
  return jspb.Message.setProto3IntField(this, 11, value);
};

