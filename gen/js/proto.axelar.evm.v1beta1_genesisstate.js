// source: axelar/evm/v1beta1/genesis.proto
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

goog.provide('proto.axelar.evm.v1beta1.GenesisState');
goog.provide('proto.axelar.evm.v1beta1.GenesisState.Chain');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.evm.v1beta1.BurnerInfo');
goog.require('proto.axelar.evm.v1beta1.CommandBatchMetadata');
goog.require('proto.axelar.evm.v1beta1.ERC20Deposit');
goog.require('proto.axelar.evm.v1beta1.ERC20TokenMetadata');
goog.require('proto.axelar.evm.v1beta1.Event');
goog.require('proto.axelar.evm.v1beta1.Gateway');
goog.require('proto.axelar.evm.v1beta1.Params');
goog.require('proto.axelar.utils.v1beta1.QueueState');

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
proto.axelar.evm.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.evm.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.axelar.evm.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.GenesisState.displayName = 'proto.axelar.evm.v1beta1.GenesisState';
}
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
proto.axelar.evm.v1beta1.GenesisState.Chain = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.evm.v1beta1.GenesisState.Chain.repeatedFields_, null);
};
goog.inherits(proto.axelar.evm.v1beta1.GenesisState.Chain, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.GenesisState.Chain.displayName = 'proto.axelar.evm.v1beta1.GenesisState.Chain';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.evm.v1beta1.GenesisState.repeatedFields_ = [3];



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
proto.axelar.evm.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    chainsList: jspb.Message.toObjectList(msg.getChainsList(),
    proto.axelar.evm.v1beta1.GenesisState.Chain.toObject, includeInstance)
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
 * @return {!proto.axelar.evm.v1beta1.GenesisState}
 */
proto.axelar.evm.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.GenesisState;
  return proto.axelar.evm.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.GenesisState}
 */
proto.axelar.evm.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 3:
      var value = new proto.axelar.evm.v1beta1.GenesisState.Chain;
      reader.readMessage(value,proto.axelar.evm.v1beta1.GenesisState.Chain.deserializeBinaryFromReader);
      msg.addChains(value);
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
proto.axelar.evm.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChainsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.axelar.evm.v1beta1.GenesisState.Chain.serializeBinaryToWriter
    );
  }
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.repeatedFields_ = [2,4,5,8,10,11,13,14];



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
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.GenesisState.Chain.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.GenesisState.Chain} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.axelar.evm.v1beta1.Params.toObject(includeInstance, f),
    burnerInfosList: jspb.Message.toObjectList(msg.getBurnerInfosList(),
    proto.axelar.evm.v1beta1.BurnerInfo.toObject, includeInstance),
    commandQueue: (f = msg.getCommandQueue()) && proto.axelar.utils.v1beta1.QueueState.toObject(includeInstance, f),
    confirmedDepositsList: jspb.Message.toObjectList(msg.getConfirmedDepositsList(),
    proto.axelar.evm.v1beta1.ERC20Deposit.toObject, includeInstance),
    burnedDepositsList: jspb.Message.toObjectList(msg.getBurnedDepositsList(),
    proto.axelar.evm.v1beta1.ERC20Deposit.toObject, includeInstance),
    commandBatchesList: jspb.Message.toObjectList(msg.getCommandBatchesList(),
    proto.axelar.evm.v1beta1.CommandBatchMetadata.toObject, includeInstance),
    gateway: (f = msg.getGateway()) && proto.axelar.evm.v1beta1.Gateway.toObject(includeInstance, f),
    tokensList: jspb.Message.toObjectList(msg.getTokensList(),
    proto.axelar.evm.v1beta1.ERC20TokenMetadata.toObject, includeInstance),
    eventsList: jspb.Message.toObjectList(msg.getEventsList(),
    proto.axelar.evm.v1beta1.Event.toObject, includeInstance),
    confirmedEventQueue: (f = msg.getConfirmedEventQueue()) && proto.axelar.utils.v1beta1.QueueState.toObject(includeInstance, f),
    legacyConfirmedDepositsList: jspb.Message.toObjectList(msg.getLegacyConfirmedDepositsList(),
    proto.axelar.evm.v1beta1.ERC20Deposit.toObject, includeInstance),
    legacyBurnedDepositsList: jspb.Message.toObjectList(msg.getLegacyBurnedDepositsList(),
    proto.axelar.evm.v1beta1.ERC20Deposit.toObject, includeInstance)
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
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.GenesisState.Chain;
  return proto.axelar.evm.v1beta1.GenesisState.Chain.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.GenesisState.Chain} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.axelar.evm.v1beta1.Params;
      reader.readMessage(value,proto.axelar.evm.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.axelar.evm.v1beta1.BurnerInfo;
      reader.readMessage(value,proto.axelar.evm.v1beta1.BurnerInfo.deserializeBinaryFromReader);
      msg.addBurnerInfos(value);
      break;
    case 3:
      var value = new proto.axelar.utils.v1beta1.QueueState;
      reader.readMessage(value,proto.axelar.utils.v1beta1.QueueState.deserializeBinaryFromReader);
      msg.setCommandQueue(value);
      break;
    case 4:
      var value = new proto.axelar.evm.v1beta1.ERC20Deposit;
      reader.readMessage(value,proto.axelar.evm.v1beta1.ERC20Deposit.deserializeBinaryFromReader);
      msg.addConfirmedDeposits(value);
      break;
    case 5:
      var value = new proto.axelar.evm.v1beta1.ERC20Deposit;
      reader.readMessage(value,proto.axelar.evm.v1beta1.ERC20Deposit.deserializeBinaryFromReader);
      msg.addBurnedDeposits(value);
      break;
    case 8:
      var value = new proto.axelar.evm.v1beta1.CommandBatchMetadata;
      reader.readMessage(value,proto.axelar.evm.v1beta1.CommandBatchMetadata.deserializeBinaryFromReader);
      msg.addCommandBatches(value);
      break;
    case 9:
      var value = new proto.axelar.evm.v1beta1.Gateway;
      reader.readMessage(value,proto.axelar.evm.v1beta1.Gateway.deserializeBinaryFromReader);
      msg.setGateway(value);
      break;
    case 10:
      var value = new proto.axelar.evm.v1beta1.ERC20TokenMetadata;
      reader.readMessage(value,proto.axelar.evm.v1beta1.ERC20TokenMetadata.deserializeBinaryFromReader);
      msg.addTokens(value);
      break;
    case 11:
      var value = new proto.axelar.evm.v1beta1.Event;
      reader.readMessage(value,proto.axelar.evm.v1beta1.Event.deserializeBinaryFromReader);
      msg.addEvents(value);
      break;
    case 12:
      var value = new proto.axelar.utils.v1beta1.QueueState;
      reader.readMessage(value,proto.axelar.utils.v1beta1.QueueState.deserializeBinaryFromReader);
      msg.setConfirmedEventQueue(value);
      break;
    case 13:
      var value = new proto.axelar.evm.v1beta1.ERC20Deposit;
      reader.readMessage(value,proto.axelar.evm.v1beta1.ERC20Deposit.deserializeBinaryFromReader);
      msg.addLegacyConfirmedDeposits(value);
      break;
    case 14:
      var value = new proto.axelar.evm.v1beta1.ERC20Deposit;
      reader.readMessage(value,proto.axelar.evm.v1beta1.ERC20Deposit.deserializeBinaryFromReader);
      msg.addLegacyBurnedDeposits(value);
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
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.GenesisState.Chain.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.GenesisState.Chain} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.axelar.evm.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getBurnerInfosList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.axelar.evm.v1beta1.BurnerInfo.serializeBinaryToWriter
    );
  }
  f = message.getCommandQueue();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.axelar.utils.v1beta1.QueueState.serializeBinaryToWriter
    );
  }
  f = message.getConfirmedDepositsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.axelar.evm.v1beta1.ERC20Deposit.serializeBinaryToWriter
    );
  }
  f = message.getBurnedDepositsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.axelar.evm.v1beta1.ERC20Deposit.serializeBinaryToWriter
    );
  }
  f = message.getCommandBatchesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      8,
      f,
      proto.axelar.evm.v1beta1.CommandBatchMetadata.serializeBinaryToWriter
    );
  }
  f = message.getGateway();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.axelar.evm.v1beta1.Gateway.serializeBinaryToWriter
    );
  }
  f = message.getTokensList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      10,
      f,
      proto.axelar.evm.v1beta1.ERC20TokenMetadata.serializeBinaryToWriter
    );
  }
  f = message.getEventsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      11,
      f,
      proto.axelar.evm.v1beta1.Event.serializeBinaryToWriter
    );
  }
  f = message.getConfirmedEventQueue();
  if (f != null) {
    writer.writeMessage(
      12,
      f,
      proto.axelar.utils.v1beta1.QueueState.serializeBinaryToWriter
    );
  }
  f = message.getLegacyConfirmedDepositsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      13,
      f,
      proto.axelar.evm.v1beta1.ERC20Deposit.serializeBinaryToWriter
    );
  }
  f = message.getLegacyBurnedDepositsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      14,
      f,
      proto.axelar.evm.v1beta1.ERC20Deposit.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.axelar.evm.v1beta1.Params}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getParams = function() {
  return /** @type{?proto.axelar.evm.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.axelar.evm.v1beta1.Params, 1));
};


/**
 * @param {?proto.axelar.evm.v1beta1.Params|undefined} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated BurnerInfo burner_infos = 2;
 * @return {!Array<!proto.axelar.evm.v1beta1.BurnerInfo>}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getBurnerInfosList = function() {
  return /** @type{!Array<!proto.axelar.evm.v1beta1.BurnerInfo>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.evm.v1beta1.BurnerInfo, 2));
};


/**
 * @param {!Array<!proto.axelar.evm.v1beta1.BurnerInfo>} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setBurnerInfosList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.axelar.evm.v1beta1.BurnerInfo=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.BurnerInfo}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.addBurnerInfos = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.axelar.evm.v1beta1.BurnerInfo, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearBurnerInfosList = function() {
  return this.setBurnerInfosList([]);
};


/**
 * optional axelar.utils.v1beta1.QueueState command_queue = 3;
 * @return {?proto.axelar.utils.v1beta1.QueueState}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getCommandQueue = function() {
  return /** @type{?proto.axelar.utils.v1beta1.QueueState} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.QueueState, 3));
};


/**
 * @param {?proto.axelar.utils.v1beta1.QueueState|undefined} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setCommandQueue = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearCommandQueue = function() {
  return this.setCommandQueue(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.hasCommandQueue = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * repeated ERC20Deposit confirmed_deposits = 4;
 * @return {!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getConfirmedDepositsList = function() {
  return /** @type{!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.evm.v1beta1.ERC20Deposit, 4));
};


/**
 * @param {!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setConfirmedDepositsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.axelar.evm.v1beta1.ERC20Deposit=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.addConfirmedDeposits = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.axelar.evm.v1beta1.ERC20Deposit, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearConfirmedDepositsList = function() {
  return this.setConfirmedDepositsList([]);
};


/**
 * repeated ERC20Deposit burned_deposits = 5;
 * @return {!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getBurnedDepositsList = function() {
  return /** @type{!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.evm.v1beta1.ERC20Deposit, 5));
};


/**
 * @param {!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setBurnedDepositsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.axelar.evm.v1beta1.ERC20Deposit=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.addBurnedDeposits = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.axelar.evm.v1beta1.ERC20Deposit, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearBurnedDepositsList = function() {
  return this.setBurnedDepositsList([]);
};


/**
 * repeated CommandBatchMetadata command_batches = 8;
 * @return {!Array<!proto.axelar.evm.v1beta1.CommandBatchMetadata>}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getCommandBatchesList = function() {
  return /** @type{!Array<!proto.axelar.evm.v1beta1.CommandBatchMetadata>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.evm.v1beta1.CommandBatchMetadata, 8));
};


/**
 * @param {!Array<!proto.axelar.evm.v1beta1.CommandBatchMetadata>} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setCommandBatchesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 8, value);
};


/**
 * @param {!proto.axelar.evm.v1beta1.CommandBatchMetadata=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.CommandBatchMetadata}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.addCommandBatches = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 8, opt_value, proto.axelar.evm.v1beta1.CommandBatchMetadata, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearCommandBatchesList = function() {
  return this.setCommandBatchesList([]);
};


/**
 * optional Gateway gateway = 9;
 * @return {?proto.axelar.evm.v1beta1.Gateway}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getGateway = function() {
  return /** @type{?proto.axelar.evm.v1beta1.Gateway} */ (
    jspb.Message.getWrapperField(this, proto.axelar.evm.v1beta1.Gateway, 9));
};


/**
 * @param {?proto.axelar.evm.v1beta1.Gateway|undefined} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setGateway = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearGateway = function() {
  return this.setGateway(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.hasGateway = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * repeated ERC20TokenMetadata tokens = 10;
 * @return {!Array<!proto.axelar.evm.v1beta1.ERC20TokenMetadata>}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getTokensList = function() {
  return /** @type{!Array<!proto.axelar.evm.v1beta1.ERC20TokenMetadata>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.evm.v1beta1.ERC20TokenMetadata, 10));
};


/**
 * @param {!Array<!proto.axelar.evm.v1beta1.ERC20TokenMetadata>} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setTokensList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 10, value);
};


/**
 * @param {!proto.axelar.evm.v1beta1.ERC20TokenMetadata=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.ERC20TokenMetadata}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.addTokens = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 10, opt_value, proto.axelar.evm.v1beta1.ERC20TokenMetadata, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearTokensList = function() {
  return this.setTokensList([]);
};


/**
 * repeated Event events = 11;
 * @return {!Array<!proto.axelar.evm.v1beta1.Event>}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getEventsList = function() {
  return /** @type{!Array<!proto.axelar.evm.v1beta1.Event>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.evm.v1beta1.Event, 11));
};


/**
 * @param {!Array<!proto.axelar.evm.v1beta1.Event>} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setEventsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 11, value);
};


/**
 * @param {!proto.axelar.evm.v1beta1.Event=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.Event}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.addEvents = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 11, opt_value, proto.axelar.evm.v1beta1.Event, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearEventsList = function() {
  return this.setEventsList([]);
};


/**
 * optional axelar.utils.v1beta1.QueueState confirmed_event_queue = 12;
 * @return {?proto.axelar.utils.v1beta1.QueueState}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getConfirmedEventQueue = function() {
  return /** @type{?proto.axelar.utils.v1beta1.QueueState} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.QueueState, 12));
};


/**
 * @param {?proto.axelar.utils.v1beta1.QueueState|undefined} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setConfirmedEventQueue = function(value) {
  return jspb.Message.setWrapperField(this, 12, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearConfirmedEventQueue = function() {
  return this.setConfirmedEventQueue(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.hasConfirmedEventQueue = function() {
  return jspb.Message.getField(this, 12) != null;
};


/**
 * repeated ERC20Deposit legacy_confirmed_deposits = 13;
 * @return {!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getLegacyConfirmedDepositsList = function() {
  return /** @type{!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.evm.v1beta1.ERC20Deposit, 13));
};


/**
 * @param {!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setLegacyConfirmedDepositsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 13, value);
};


/**
 * @param {!proto.axelar.evm.v1beta1.ERC20Deposit=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.addLegacyConfirmedDeposits = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 13, opt_value, proto.axelar.evm.v1beta1.ERC20Deposit, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearLegacyConfirmedDepositsList = function() {
  return this.setLegacyConfirmedDepositsList([]);
};


/**
 * repeated ERC20Deposit legacy_burned_deposits = 14;
 * @return {!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.getLegacyBurnedDepositsList = function() {
  return /** @type{!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.evm.v1beta1.ERC20Deposit, 14));
};


/**
 * @param {!Array<!proto.axelar.evm.v1beta1.ERC20Deposit>} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.setLegacyBurnedDepositsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 14, value);
};


/**
 * @param {!proto.axelar.evm.v1beta1.ERC20Deposit=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.ERC20Deposit}
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.addLegacyBurnedDeposits = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 14, opt_value, proto.axelar.evm.v1beta1.ERC20Deposit, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.Chain.prototype.clearLegacyBurnedDepositsList = function() {
  return this.setLegacyBurnedDepositsList([]);
};


/**
 * repeated Chain chains = 3;
 * @return {!Array<!proto.axelar.evm.v1beta1.GenesisState.Chain>}
 */
proto.axelar.evm.v1beta1.GenesisState.prototype.getChainsList = function() {
  return /** @type{!Array<!proto.axelar.evm.v1beta1.GenesisState.Chain>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.evm.v1beta1.GenesisState.Chain, 3));
};


/**
 * @param {!Array<!proto.axelar.evm.v1beta1.GenesisState.Chain>} value
 * @return {!proto.axelar.evm.v1beta1.GenesisState} returns this
*/
proto.axelar.evm.v1beta1.GenesisState.prototype.setChainsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.axelar.evm.v1beta1.GenesisState.Chain=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.GenesisState.Chain}
 */
proto.axelar.evm.v1beta1.GenesisState.prototype.addChains = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.axelar.evm.v1beta1.GenesisState.Chain, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.GenesisState} returns this
 */
proto.axelar.evm.v1beta1.GenesisState.prototype.clearChainsList = function() {
  return this.setChainsList([]);
};


