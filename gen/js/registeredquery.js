// source: neutron/interchainqueries/genesis.proto
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

goog.provide('proto.neutron.interchainqueries.RegisteredQuery');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.ibc.core.client.v1.Height');
goog.require('proto.neutron.interchainqueries.KVKey');

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
proto.neutron.interchainqueries.RegisteredQuery = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.neutron.interchainqueries.RegisteredQuery.repeatedFields_, null);
};
goog.inherits(proto.neutron.interchainqueries.RegisteredQuery, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.neutron.interchainqueries.RegisteredQuery.displayName = 'proto.neutron.interchainqueries.RegisteredQuery';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.neutron.interchainqueries.RegisteredQuery.repeatedFields_ = [4,10];



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
proto.neutron.interchainqueries.RegisteredQuery.prototype.toObject = function(opt_includeInstance) {
  return proto.neutron.interchainqueries.RegisteredQuery.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.neutron.interchainqueries.RegisteredQuery} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchainqueries.RegisteredQuery.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    owner: jspb.Message.getFieldWithDefault(msg, 2, ""),
    queryType: jspb.Message.getFieldWithDefault(msg, 3, ""),
    keysList: jspb.Message.toObjectList(msg.getKeysList(),
    proto.neutron.interchainqueries.KVKey.toObject, includeInstance),
    transactionsFilter: jspb.Message.getFieldWithDefault(msg, 5, ""),
    connectionId: jspb.Message.getFieldWithDefault(msg, 6, ""),
    updatePeriod: jspb.Message.getFieldWithDefault(msg, 7, 0),
    lastSubmittedResultLocalHeight: jspb.Message.getFieldWithDefault(msg, 8, 0),
    lastSubmittedResultRemoteHeight: (f = msg.getLastSubmittedResultRemoteHeight()) && proto.ibc.core.client.v1.Height.toObject(includeInstance, f),
    depositList: jspb.Message.toObjectList(msg.getDepositList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    submitTimeout: jspb.Message.getFieldWithDefault(msg, 11, 0),
    registeredAtHeight: jspb.Message.getFieldWithDefault(msg, 12, 0)
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
 * @return {!proto.neutron.interchainqueries.RegisteredQuery}
 */
proto.neutron.interchainqueries.RegisteredQuery.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.neutron.interchainqueries.RegisteredQuery;
  return proto.neutron.interchainqueries.RegisteredQuery.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.neutron.interchainqueries.RegisteredQuery} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.neutron.interchainqueries.RegisteredQuery}
 */
proto.neutron.interchainqueries.RegisteredQuery.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setOwner(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setQueryType(value);
      break;
    case 4:
      var value = new proto.neutron.interchainqueries.KVKey;
      reader.readMessage(value,proto.neutron.interchainqueries.KVKey.deserializeBinaryFromReader);
      msg.addKeys(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransactionsFilter(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setConnectionId(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setUpdatePeriod(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLastSubmittedResultLocalHeight(value);
      break;
    case 9:
      var value = new proto.ibc.core.client.v1.Height;
      reader.readMessage(value,proto.ibc.core.client.v1.Height.deserializeBinaryFromReader);
      msg.setLastSubmittedResultRemoteHeight(value);
      break;
    case 10:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addDeposit(value);
      break;
    case 11:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSubmitTimeout(value);
      break;
    case 12:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRegisteredAtHeight(value);
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
proto.neutron.interchainqueries.RegisteredQuery.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.neutron.interchainqueries.RegisteredQuery.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.neutron.interchainqueries.RegisteredQuery} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchainqueries.RegisteredQuery.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getQueryType();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getKeysList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.neutron.interchainqueries.KVKey.serializeBinaryToWriter
    );
  }
  f = message.getTransactionsFilter();
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
  f = message.getUpdatePeriod();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getLastSubmittedResultLocalHeight();
  if (f !== 0) {
    writer.writeUint64(
      8,
      f
    );
  }
  f = message.getLastSubmittedResultRemoteHeight();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.ibc.core.client.v1.Height.serializeBinaryToWriter
    );
  }
  f = message.getDepositList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      10,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getSubmitTimeout();
  if (f !== 0) {
    writer.writeUint64(
      11,
      f
    );
  }
  f = message.getRegisteredAtHeight();
  if (f !== 0) {
    writer.writeUint64(
      12,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string owner = 2;
 * @return {string}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string query_type = 3;
 * @return {string}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getQueryType = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.setQueryType = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated KVKey keys = 4;
 * @return {!Array<!proto.neutron.interchainqueries.KVKey>}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getKeysList = function() {
  return /** @type{!Array<!proto.neutron.interchainqueries.KVKey>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.neutron.interchainqueries.KVKey, 4));
};


/**
 * @param {!Array<!proto.neutron.interchainqueries.KVKey>} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
*/
proto.neutron.interchainqueries.RegisteredQuery.prototype.setKeysList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.neutron.interchainqueries.KVKey=} opt_value
 * @param {number=} opt_index
 * @return {!proto.neutron.interchainqueries.KVKey}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.addKeys = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.neutron.interchainqueries.KVKey, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.clearKeysList = function() {
  return this.setKeysList([]);
};


/**
 * optional string transactions_filter = 5;
 * @return {string}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getTransactionsFilter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.setTransactionsFilter = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string connection_id = 6;
 * @return {string}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getConnectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.setConnectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional uint64 update_period = 7;
 * @return {number}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getUpdatePeriod = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.setUpdatePeriod = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional uint64 last_submitted_result_local_height = 8;
 * @return {number}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getLastSubmittedResultLocalHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.setLastSubmittedResultLocalHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional ibc.core.client.v1.Height last_submitted_result_remote_height = 9;
 * @return {?proto.ibc.core.client.v1.Height}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getLastSubmittedResultRemoteHeight = function() {
  return /** @type{?proto.ibc.core.client.v1.Height} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.client.v1.Height, 9));
};


/**
 * @param {?proto.ibc.core.client.v1.Height|undefined} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
*/
proto.neutron.interchainqueries.RegisteredQuery.prototype.setLastSubmittedResultRemoteHeight = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.clearLastSubmittedResultRemoteHeight = function() {
  return this.setLastSubmittedResultRemoteHeight(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.hasLastSubmittedResultRemoteHeight = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * repeated cosmos.base.v1beta1.Coin deposit = 10;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getDepositList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 10));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
*/
proto.neutron.interchainqueries.RegisteredQuery.prototype.setDepositList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 10, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.addDeposit = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 10, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.clearDepositList = function() {
  return this.setDepositList([]);
};


/**
 * optional uint64 submit_timeout = 11;
 * @return {number}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getSubmitTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {number} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.setSubmitTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 11, value);
};


/**
 * optional uint64 registered_at_height = 12;
 * @return {number}
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.getRegisteredAtHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {number} value
 * @return {!proto.neutron.interchainqueries.RegisteredQuery} returns this
 */
proto.neutron.interchainqueries.RegisteredQuery.prototype.setRegisteredAtHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 12, value);
};


