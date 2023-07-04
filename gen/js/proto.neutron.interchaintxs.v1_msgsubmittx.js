// source: neutron/interchaintxs/v1/tx.proto
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

goog.provide('proto.neutron.interchaintxs.v1.MsgSubmitTx');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');
goog.require('proto.neutron.feerefunder.Fee');

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
proto.neutron.interchaintxs.v1.MsgSubmitTx = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.neutron.interchaintxs.v1.MsgSubmitTx.repeatedFields_, null);
};
goog.inherits(proto.neutron.interchaintxs.v1.MsgSubmitTx, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.neutron.interchaintxs.v1.MsgSubmitTx.displayName = 'proto.neutron.interchaintxs.v1.MsgSubmitTx';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.repeatedFields_ = [4];



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
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.toObject = function(opt_includeInstance) {
  return proto.neutron.interchaintxs.v1.MsgSubmitTx.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.neutron.interchaintxs.v1.MsgSubmitTx} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.toObject = function(includeInstance, msg) {
  var f, obj = {
    fromAddress: jspb.Message.getFieldWithDefault(msg, 1, ""),
    interchainAccountId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    connectionId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    msgsList: jspb.Message.toObjectList(msg.getMsgsList(),
    proto.google.protobuf.Any.toObject, includeInstance),
    memo: jspb.Message.getFieldWithDefault(msg, 5, ""),
    timeout: jspb.Message.getFieldWithDefault(msg, 6, 0),
    fee: (f = msg.getFee()) && proto.neutron.feerefunder.Fee.toObject(includeInstance, f)
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
 * @return {!proto.neutron.interchaintxs.v1.MsgSubmitTx}
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.neutron.interchaintxs.v1.MsgSubmitTx;
  return proto.neutron.interchaintxs.v1.MsgSubmitTx.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.neutron.interchaintxs.v1.MsgSubmitTx} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.neutron.interchaintxs.v1.MsgSubmitTx}
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFromAddress(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setInterchainAccountId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setConnectionId(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.addMsgs(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setMemo(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setTimeout(value);
      break;
    case 7:
      var value = new proto.neutron.feerefunder.Fee;
      reader.readMessage(value,proto.neutron.feerefunder.Fee.deserializeBinaryFromReader);
      msg.setFee(value);
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
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.neutron.interchaintxs.v1.MsgSubmitTx.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.neutron.interchaintxs.v1.MsgSubmitTx} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFromAddress();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getInterchainAccountId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getConnectionId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getMsgsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getMemo();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getTimeout();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getFee();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.neutron.feerefunder.Fee.serializeBinaryToWriter
    );
  }
};


/**
 * optional string from_address = 1;
 * @return {string}
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.getFromAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchaintxs.v1.MsgSubmitTx} returns this
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.setFromAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string interchain_account_id = 2;
 * @return {string}
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.getInterchainAccountId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchaintxs.v1.MsgSubmitTx} returns this
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.setInterchainAccountId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string connection_id = 3;
 * @return {string}
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.getConnectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchaintxs.v1.MsgSubmitTx} returns this
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.setConnectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated google.protobuf.Any msgs = 4;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.getMsgsList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 4));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.neutron.interchaintxs.v1.MsgSubmitTx} returns this
*/
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.setMsgsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.addMsgs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.neutron.interchaintxs.v1.MsgSubmitTx} returns this
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.clearMsgsList = function() {
  return this.setMsgsList([]);
};


/**
 * optional string memo = 5;
 * @return {string}
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.getMemo = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchaintxs.v1.MsgSubmitTx} returns this
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.setMemo = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional uint64 timeout = 6;
 * @return {number}
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.getTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.neutron.interchaintxs.v1.MsgSubmitTx} returns this
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.setTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional neutron.feerefunder.Fee fee = 7;
 * @return {?proto.neutron.feerefunder.Fee}
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.getFee = function() {
  return /** @type{?proto.neutron.feerefunder.Fee} */ (
    jspb.Message.getWrapperField(this, proto.neutron.feerefunder.Fee, 7));
};


/**
 * @param {?proto.neutron.feerefunder.Fee|undefined} value
 * @return {!proto.neutron.interchaintxs.v1.MsgSubmitTx} returns this
*/
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.setFee = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.neutron.interchaintxs.v1.MsgSubmitTx} returns this
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.clearFee = function() {
  return this.setFee(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.neutron.interchaintxs.v1.MsgSubmitTx.prototype.hasFee = function() {
  return jspb.Message.getField(this, 7) != null;
};

