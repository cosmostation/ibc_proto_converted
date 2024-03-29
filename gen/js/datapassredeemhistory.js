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

goog.provide('proto.panacea.datapool.v2alpha1.DataPassRedeemHistory');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt');

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
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.repeatedFields_, null);
};
goog.inherits(proto.panacea.datapool.v2alpha1.DataPassRedeemHistory, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.displayName = 'proto.panacea.datapool.v2alpha1.DataPassRedeemHistory';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.repeatedFields_ = [3];



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
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.datapool.v2alpha1.DataPassRedeemHistory} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.toObject = function(includeInstance, msg) {
  var f, obj = {
    redeemer: jspb.Message.getFieldWithDefault(msg, 1, ""),
    poolId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    dataPassRedeemReceiptsList: jspb.Message.toObjectList(msg.getDataPassRedeemReceiptsList(),
    proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt.toObject, includeInstance)
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
 * @return {!proto.panacea.datapool.v2alpha1.DataPassRedeemHistory}
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.datapool.v2alpha1.DataPassRedeemHistory;
  return proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.datapool.v2alpha1.DataPassRedeemHistory} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.datapool.v2alpha1.DataPassRedeemHistory}
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRedeemer(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 3:
      var value = new proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt;
      reader.readMessage(value,proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt.deserializeBinaryFromReader);
      msg.addDataPassRedeemReceipts(value);
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
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.datapool.v2alpha1.DataPassRedeemHistory} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRedeemer();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getDataPassRedeemReceiptsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt.serializeBinaryToWriter
    );
  }
};


/**
 * optional string redeemer = 1;
 * @return {string}
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.prototype.getRedeemer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.datapool.v2alpha1.DataPassRedeemHistory} returns this
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.prototype.setRedeemer = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 pool_id = 2;
 * @return {number}
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.datapool.v2alpha1.DataPassRedeemHistory} returns this
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * repeated DataPassRedeemReceipt data_pass_redeem_receipts = 3;
 * @return {!Array<!proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt>}
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.prototype.getDataPassRedeemReceiptsList = function() {
  return /** @type{!Array<!proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt, 3));
};


/**
 * @param {!Array<!proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt>} value
 * @return {!proto.panacea.datapool.v2alpha1.DataPassRedeemHistory} returns this
*/
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.prototype.setDataPassRedeemReceiptsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt=} opt_value
 * @param {number=} opt_index
 * @return {!proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt}
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.prototype.addDataPassRedeemReceipts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.panacea.datapool.v2alpha1.DataPassRedeemReceipt, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.panacea.datapool.v2alpha1.DataPassRedeemHistory} returns this
 */
proto.panacea.datapool.v2alpha1.DataPassRedeemHistory.prototype.clearDataPassRedeemReceiptsList = function() {
  return this.setDataPassRedeemReceiptsList([]);
};


