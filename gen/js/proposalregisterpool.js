// source: lum-network/millions/gov.proto
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

goog.provide('proto.lum.network.millions.ProposalRegisterPool');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.lum.network.millions.DrawSchedule');
goog.require('proto.lum.network.millions.PrizeStrategy');

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
proto.lum.network.millions.ProposalRegisterPool = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.lum.network.millions.ProposalRegisterPool.repeatedFields_, null);
};
goog.inherits(proto.lum.network.millions.ProposalRegisterPool, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.millions.ProposalRegisterPool.displayName = 'proto.lum.network.millions.ProposalRegisterPool';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.lum.network.millions.ProposalRegisterPool.repeatedFields_ = [7];



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
proto.lum.network.millions.ProposalRegisterPool.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.millions.ProposalRegisterPool.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.millions.ProposalRegisterPool} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.millions.ProposalRegisterPool.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    chainId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    denom: jspb.Message.getFieldWithDefault(msg, 4, ""),
    nativeDenom: jspb.Message.getFieldWithDefault(msg, 5, ""),
    connectionId: jspb.Message.getFieldWithDefault(msg, 6, ""),
    validatorsList: (f = jspb.Message.getRepeatedField(msg, 7)) == null ? undefined : f,
    minDepositAmount: jspb.Message.getFieldWithDefault(msg, 8, ""),
    drawSchedule: (f = msg.getDrawSchedule()) && proto.lum.network.millions.DrawSchedule.toObject(includeInstance, f),
    prizeStrategy: (f = msg.getPrizeStrategy()) && proto.lum.network.millions.PrizeStrategy.toObject(includeInstance, f),
    bech32PrefixAccAddr: jspb.Message.getFieldWithDefault(msg, 11, ""),
    bech32PrefixValAddr: jspb.Message.getFieldWithDefault(msg, 12, ""),
    transferChannelId: jspb.Message.getFieldWithDefault(msg, 13, "")
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
 * @return {!proto.lum.network.millions.ProposalRegisterPool}
 */
proto.lum.network.millions.ProposalRegisterPool.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.millions.ProposalRegisterPool;
  return proto.lum.network.millions.ProposalRegisterPool.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.millions.ProposalRegisterPool} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.millions.ProposalRegisterPool}
 */
proto.lum.network.millions.ProposalRegisterPool.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setChainId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setNativeDenom(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setConnectionId(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.addValidators(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinDepositAmount(value);
      break;
    case 9:
      var value = new proto.lum.network.millions.DrawSchedule;
      reader.readMessage(value,proto.lum.network.millions.DrawSchedule.deserializeBinaryFromReader);
      msg.setDrawSchedule(value);
      break;
    case 10:
      var value = new proto.lum.network.millions.PrizeStrategy;
      reader.readMessage(value,proto.lum.network.millions.PrizeStrategy.deserializeBinaryFromReader);
      msg.setPrizeStrategy(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.setBech32PrefixAccAddr(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setBech32PrefixValAddr(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransferChannelId(value);
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
proto.lum.network.millions.ProposalRegisterPool.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.millions.ProposalRegisterPool.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.millions.ProposalRegisterPool} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.millions.ProposalRegisterPool.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getChainId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getNativeDenom();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getConnectionId();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getValidatorsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      7,
      f
    );
  }
  f = message.getMinDepositAmount();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getDrawSchedule();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.lum.network.millions.DrawSchedule.serializeBinaryToWriter
    );
  }
  f = message.getPrizeStrategy();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.lum.network.millions.PrizeStrategy.serializeBinaryToWriter
    );
  }
  f = message.getBech32PrefixAccAddr();
  if (f.length > 0) {
    writer.writeString(
      11,
      f
    );
  }
  f = message.getBech32PrefixValAddr();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
  f = message.getTransferChannelId();
  if (f.length > 0) {
    writer.writeString(
      13,
      f
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string chain_id = 3;
 * @return {string}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getChainId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.setChainId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string denom = 4;
 * @return {string}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string native_denom = 5;
 * @return {string}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getNativeDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.setNativeDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string connection_id = 6;
 * @return {string}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getConnectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.setConnectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * repeated string validators = 7;
 * @return {!Array<string>}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getValidatorsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 7));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.setValidatorsList = function(value) {
  return jspb.Message.setField(this, 7, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.addValidators = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 7, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.clearValidatorsList = function() {
  return this.setValidatorsList([]);
};


/**
 * optional string min_deposit_amount = 8;
 * @return {string}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getMinDepositAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.setMinDepositAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional DrawSchedule draw_schedule = 9;
 * @return {?proto.lum.network.millions.DrawSchedule}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getDrawSchedule = function() {
  return /** @type{?proto.lum.network.millions.DrawSchedule} */ (
    jspb.Message.getWrapperField(this, proto.lum.network.millions.DrawSchedule, 9));
};


/**
 * @param {?proto.lum.network.millions.DrawSchedule|undefined} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
*/
proto.lum.network.millions.ProposalRegisterPool.prototype.setDrawSchedule = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.clearDrawSchedule = function() {
  return this.setDrawSchedule(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.hasDrawSchedule = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional PrizeStrategy prize_strategy = 10;
 * @return {?proto.lum.network.millions.PrizeStrategy}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getPrizeStrategy = function() {
  return /** @type{?proto.lum.network.millions.PrizeStrategy} */ (
    jspb.Message.getWrapperField(this, proto.lum.network.millions.PrizeStrategy, 10));
};


/**
 * @param {?proto.lum.network.millions.PrizeStrategy|undefined} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
*/
proto.lum.network.millions.ProposalRegisterPool.prototype.setPrizeStrategy = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.clearPrizeStrategy = function() {
  return this.setPrizeStrategy(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.hasPrizeStrategy = function() {
  return jspb.Message.getField(this, 10) != null;
};


/**
 * optional string bech32_prefix_acc_addr = 11;
 * @return {string}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getBech32PrefixAccAddr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.setBech32PrefixAccAddr = function(value) {
  return jspb.Message.setProto3StringField(this, 11, value);
};


/**
 * optional string bech32_prefix_val_addr = 12;
 * @return {string}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getBech32PrefixValAddr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.setBech32PrefixValAddr = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


/**
 * optional string transfer_channel_id = 13;
 * @return {string}
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.getTransferChannelId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 13, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.ProposalRegisterPool} returns this
 */
proto.lum.network.millions.ProposalRegisterPool.prototype.setTransferChannelId = function(value) {
  return jspb.Message.setProto3StringField(this, 13, value);
};


