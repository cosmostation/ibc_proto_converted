// source: neutron/interchainqueries/params.proto
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

goog.provide('proto.neutron.interchainqueries.Params');

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
proto.neutron.interchainqueries.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.neutron.interchainqueries.Params.repeatedFields_, null);
};
goog.inherits(proto.neutron.interchainqueries.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.neutron.interchainqueries.Params.displayName = 'proto.neutron.interchainqueries.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.neutron.interchainqueries.Params.repeatedFields_ = [2];



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
proto.neutron.interchainqueries.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.neutron.interchainqueries.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.neutron.interchainqueries.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchainqueries.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    querySubmitTimeout: jspb.Message.getFieldWithDefault(msg, 1, 0),
    queryDepositList: jspb.Message.toObjectList(msg.getQueryDepositList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    txQueryRemovalLimit: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.neutron.interchainqueries.Params}
 */
proto.neutron.interchainqueries.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.neutron.interchainqueries.Params;
  return proto.neutron.interchainqueries.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.neutron.interchainqueries.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.neutron.interchainqueries.Params}
 */
proto.neutron.interchainqueries.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setQuerySubmitTimeout(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addQueryDeposit(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTxQueryRemovalLimit(value);
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
proto.neutron.interchainqueries.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.neutron.interchainqueries.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.neutron.interchainqueries.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchainqueries.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getQuerySubmitTimeout();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getQueryDepositList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTxQueryRemovalLimit();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
};


/**
 * optional uint64 query_submit_timeout = 1;
 * @return {number}
 */
proto.neutron.interchainqueries.Params.prototype.getQuerySubmitTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.neutron.interchainqueries.Params} returns this
 */
proto.neutron.interchainqueries.Params.prototype.setQuerySubmitTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin query_deposit = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.neutron.interchainqueries.Params.prototype.getQueryDepositList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.neutron.interchainqueries.Params} returns this
*/
proto.neutron.interchainqueries.Params.prototype.setQueryDepositList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.neutron.interchainqueries.Params.prototype.addQueryDeposit = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.neutron.interchainqueries.Params} returns this
 */
proto.neutron.interchainqueries.Params.prototype.clearQueryDepositList = function() {
  return this.setQueryDepositList([]);
};


/**
 * optional uint64 tx_query_removal_limit = 3;
 * @return {number}
 */
proto.neutron.interchainqueries.Params.prototype.getTxQueryRemovalLimit = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.neutron.interchainqueries.Params} returns this
 */
proto.neutron.interchainqueries.Params.prototype.setTxQueryRemovalLimit = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


