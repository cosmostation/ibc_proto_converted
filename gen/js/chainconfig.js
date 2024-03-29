// source: ethermint/evm/v1/evm.proto
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

goog.provide('proto.ethermint.evm.v1.ChainConfig');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.ethermint.evm.v1.ChainConfig = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ethermint.evm.v1.ChainConfig, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ethermint.evm.v1.ChainConfig.displayName = 'proto.ethermint.evm.v1.ChainConfig';
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
proto.ethermint.evm.v1.ChainConfig.prototype.toObject = function(opt_includeInstance) {
  return proto.ethermint.evm.v1.ChainConfig.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ethermint.evm.v1.ChainConfig} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.evm.v1.ChainConfig.toObject = function(includeInstance, msg) {
  var f, obj = {
    homesteadBlock: jspb.Message.getFieldWithDefault(msg, 1, ""),
    daoForkBlock: jspb.Message.getFieldWithDefault(msg, 2, ""),
    daoForkSupport: jspb.Message.getBooleanFieldWithDefault(msg, 3, false),
    eip150Block: jspb.Message.getFieldWithDefault(msg, 4, ""),
    eip150Hash: jspb.Message.getFieldWithDefault(msg, 5, ""),
    eip155Block: jspb.Message.getFieldWithDefault(msg, 6, ""),
    eip158Block: jspb.Message.getFieldWithDefault(msg, 7, ""),
    byzantiumBlock: jspb.Message.getFieldWithDefault(msg, 8, ""),
    constantinopleBlock: jspb.Message.getFieldWithDefault(msg, 9, ""),
    petersburgBlock: jspb.Message.getFieldWithDefault(msg, 10, ""),
    istanbulBlock: jspb.Message.getFieldWithDefault(msg, 11, ""),
    muirGlacierBlock: jspb.Message.getFieldWithDefault(msg, 12, ""),
    berlinBlock: jspb.Message.getFieldWithDefault(msg, 13, ""),
    londonBlock: jspb.Message.getFieldWithDefault(msg, 17, ""),
    arrowGlacierBlock: jspb.Message.getFieldWithDefault(msg, 18, ""),
    grayGlacierBlock: jspb.Message.getFieldWithDefault(msg, 20, ""),
    mergeNetsplitBlock: jspb.Message.getFieldWithDefault(msg, 21, ""),
    shanghaiBlock: jspb.Message.getFieldWithDefault(msg, 22, ""),
    cancunBlock: jspb.Message.getFieldWithDefault(msg, 23, "")
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
 * @return {!proto.ethermint.evm.v1.ChainConfig}
 */
proto.ethermint.evm.v1.ChainConfig.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ethermint.evm.v1.ChainConfig;
  return proto.ethermint.evm.v1.ChainConfig.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ethermint.evm.v1.ChainConfig} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ethermint.evm.v1.ChainConfig}
 */
proto.ethermint.evm.v1.ChainConfig.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setHomesteadBlock(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDaoForkBlock(value);
      break;
    case 3:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setDaoForkSupport(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setEip150Block(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setEip150Hash(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setEip155Block(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setEip158Block(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setByzantiumBlock(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setConstantinopleBlock(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setPetersburgBlock(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.setIstanbulBlock(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setMuirGlacierBlock(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.setBerlinBlock(value);
      break;
    case 17:
      var value = /** @type {string} */ (reader.readString());
      msg.setLondonBlock(value);
      break;
    case 18:
      var value = /** @type {string} */ (reader.readString());
      msg.setArrowGlacierBlock(value);
      break;
    case 20:
      var value = /** @type {string} */ (reader.readString());
      msg.setGrayGlacierBlock(value);
      break;
    case 21:
      var value = /** @type {string} */ (reader.readString());
      msg.setMergeNetsplitBlock(value);
      break;
    case 22:
      var value = /** @type {string} */ (reader.readString());
      msg.setShanghaiBlock(value);
      break;
    case 23:
      var value = /** @type {string} */ (reader.readString());
      msg.setCancunBlock(value);
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
proto.ethermint.evm.v1.ChainConfig.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ethermint.evm.v1.ChainConfig.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ethermint.evm.v1.ChainConfig} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.evm.v1.ChainConfig.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHomesteadBlock();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDaoForkBlock();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDaoForkSupport();
  if (f) {
    writer.writeBool(
      3,
      f
    );
  }
  f = message.getEip150Block();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getEip150Hash();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getEip155Block();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getEip158Block();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getByzantiumBlock();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getConstantinopleBlock();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getPetersburgBlock();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getIstanbulBlock();
  if (f.length > 0) {
    writer.writeString(
      11,
      f
    );
  }
  f = message.getMuirGlacierBlock();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
  f = message.getBerlinBlock();
  if (f.length > 0) {
    writer.writeString(
      13,
      f
    );
  }
  f = message.getLondonBlock();
  if (f.length > 0) {
    writer.writeString(
      17,
      f
    );
  }
  f = message.getArrowGlacierBlock();
  if (f.length > 0) {
    writer.writeString(
      18,
      f
    );
  }
  f = message.getGrayGlacierBlock();
  if (f.length > 0) {
    writer.writeString(
      20,
      f
    );
  }
  f = message.getMergeNetsplitBlock();
  if (f.length > 0) {
    writer.writeString(
      21,
      f
    );
  }
  f = message.getShanghaiBlock();
  if (f.length > 0) {
    writer.writeString(
      22,
      f
    );
  }
  f = message.getCancunBlock();
  if (f.length > 0) {
    writer.writeString(
      23,
      f
    );
  }
};


/**
 * optional string homestead_block = 1;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getHomesteadBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setHomesteadBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string dao_fork_block = 2;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getDaoForkBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setDaoForkBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bool dao_fork_support = 3;
 * @return {boolean}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getDaoForkSupport = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 3, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setDaoForkSupport = function(value) {
  return jspb.Message.setProto3BooleanField(this, 3, value);
};


/**
 * optional string eip150_block = 4;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getEip150Block = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setEip150Block = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string eip150_hash = 5;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getEip150Hash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setEip150Hash = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string eip155_block = 6;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getEip155Block = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setEip155Block = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string eip158_block = 7;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getEip158Block = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setEip158Block = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string byzantium_block = 8;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getByzantiumBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setByzantiumBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string constantinople_block = 9;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getConstantinopleBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setConstantinopleBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional string petersburg_block = 10;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getPetersburgBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setPetersburgBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * optional string istanbul_block = 11;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getIstanbulBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setIstanbulBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 11, value);
};


/**
 * optional string muir_glacier_block = 12;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getMuirGlacierBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setMuirGlacierBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


/**
 * optional string berlin_block = 13;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getBerlinBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 13, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setBerlinBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 13, value);
};


/**
 * optional string london_block = 17;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getLondonBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 17, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setLondonBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 17, value);
};


/**
 * optional string arrow_glacier_block = 18;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getArrowGlacierBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 18, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setArrowGlacierBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 18, value);
};


/**
 * optional string gray_glacier_block = 20;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getGrayGlacierBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 20, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setGrayGlacierBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 20, value);
};


/**
 * optional string merge_netsplit_block = 21;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getMergeNetsplitBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 21, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setMergeNetsplitBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 21, value);
};


/**
 * optional string shanghai_block = 22;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getShanghaiBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 22, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setShanghaiBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 22, value);
};


/**
 * optional string cancun_block = 23;
 * @return {string}
 */
proto.ethermint.evm.v1.ChainConfig.prototype.getCancunBlock = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 23, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.ChainConfig} returns this
 */
proto.ethermint.evm.v1.ChainConfig.prototype.setCancunBlock = function(value) {
  return jspb.Message.setProto3StringField(this, 23, value);
};


