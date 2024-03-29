// source: osmosis/superfluid/query.proto
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

goog.provide('proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.cosmos.staking.v1beta1.DelegationResponse');
goog.require('proto.osmosis.superfluid.SuperfluidDelegationRecord');

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
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.repeatedFields_, null);
};
goog.inherits(proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.displayName = 'proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.repeatedFields_ = [1,2,3];



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
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    superfluidDelegationRecordsList: jspb.Message.toObjectList(msg.getSuperfluidDelegationRecordsList(),
    proto.osmosis.superfluid.SuperfluidDelegationRecord.toObject, includeInstance),
    delegationResponseList: jspb.Message.toObjectList(msg.getDelegationResponseList(),
    proto.cosmos.staking.v1beta1.DelegationResponse.toObject, includeInstance),
    totalDelegatedCoinsList: jspb.Message.toObjectList(msg.getTotalDelegatedCoinsList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    totalEquivalentStakedAmount: (f = msg.getTotalEquivalentStakedAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse}
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse;
  return proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse}
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.superfluid.SuperfluidDelegationRecord;
      reader.readMessage(value,proto.osmosis.superfluid.SuperfluidDelegationRecord.deserializeBinaryFromReader);
      msg.addSuperfluidDelegationRecords(value);
      break;
    case 2:
      var value = new proto.cosmos.staking.v1beta1.DelegationResponse;
      reader.readMessage(value,proto.cosmos.staking.v1beta1.DelegationResponse.deserializeBinaryFromReader);
      msg.addDelegationResponse(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addTotalDelegatedCoins(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setTotalEquivalentStakedAmount(value);
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
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSuperfluidDelegationRecordsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.osmosis.superfluid.SuperfluidDelegationRecord.serializeBinaryToWriter
    );
  }
  f = message.getDelegationResponseList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.staking.v1beta1.DelegationResponse.serializeBinaryToWriter
    );
  }
  f = message.getTotalDelegatedCoinsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTotalEquivalentStakedAmount();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * repeated SuperfluidDelegationRecord superfluid_delegation_records = 1;
 * @return {!Array<!proto.osmosis.superfluid.SuperfluidDelegationRecord>}
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.getSuperfluidDelegationRecordsList = function() {
  return /** @type{!Array<!proto.osmosis.superfluid.SuperfluidDelegationRecord>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.superfluid.SuperfluidDelegationRecord, 1));
};


/**
 * @param {!Array<!proto.osmosis.superfluid.SuperfluidDelegationRecord>} value
 * @return {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse} returns this
*/
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.setSuperfluidDelegationRecordsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.osmosis.superfluid.SuperfluidDelegationRecord=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.superfluid.SuperfluidDelegationRecord}
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.addSuperfluidDelegationRecords = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.osmosis.superfluid.SuperfluidDelegationRecord, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse} returns this
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.clearSuperfluidDelegationRecordsList = function() {
  return this.setSuperfluidDelegationRecordsList([]);
};


/**
 * repeated cosmos.staking.v1beta1.DelegationResponse delegation_response = 2;
 * @return {!Array<!proto.cosmos.staking.v1beta1.DelegationResponse>}
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.getDelegationResponseList = function() {
  return /** @type{!Array<!proto.cosmos.staking.v1beta1.DelegationResponse>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.staking.v1beta1.DelegationResponse, 2));
};


/**
 * @param {!Array<!proto.cosmos.staking.v1beta1.DelegationResponse>} value
 * @return {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse} returns this
*/
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.setDelegationResponseList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.staking.v1beta1.DelegationResponse=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.staking.v1beta1.DelegationResponse}
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.addDelegationResponse = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.staking.v1beta1.DelegationResponse, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse} returns this
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.clearDelegationResponseList = function() {
  return this.setDelegationResponseList([]);
};


/**
 * repeated cosmos.base.v1beta1.Coin total_delegated_coins = 3;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.getTotalDelegatedCoinsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse} returns this
*/
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.setTotalDelegatedCoinsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.addTotalDelegatedCoins = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse} returns this
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.clearTotalDelegatedCoinsList = function() {
  return this.setTotalDelegatedCoinsList([]);
};


/**
 * optional cosmos.base.v1beta1.Coin total_equivalent_staked_amount = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.getTotalEquivalentStakedAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse} returns this
*/
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.setTotalEquivalentStakedAmount = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse} returns this
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.clearTotalEquivalentStakedAmount = function() {
  return this.setTotalEquivalentStakedAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.superfluid.QueryTotalDelegationByDelegatorResponse.prototype.hasTotalEquivalentStakedAmount = function() {
  return jspb.Message.getField(this, 4) != null;
};


