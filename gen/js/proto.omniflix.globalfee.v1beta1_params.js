// source: OmniFlix/globalfee/v1beta1/genesis.proto
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

goog.provide('proto.OmniFlix.globalfee.v1beta1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.DecCoin');

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
proto.OmniFlix.globalfee.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.OmniFlix.globalfee.v1beta1.Params.repeatedFields_, null);
};
goog.inherits(proto.OmniFlix.globalfee.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.OmniFlix.globalfee.v1beta1.Params.displayName = 'proto.OmniFlix.globalfee.v1beta1.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.OmniFlix.globalfee.v1beta1.Params.repeatedFields_ = [1,2];



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
proto.OmniFlix.globalfee.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.OmniFlix.globalfee.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.OmniFlix.globalfee.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.globalfee.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    minimumGasPricesList: jspb.Message.toObjectList(msg.getMinimumGasPricesList(),
    proto.cosmos.base.v1beta1.DecCoin.toObject, includeInstance),
    bypassMinFeeMsgTypesList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    maxTotalBypassMinFeeMsgGasUsage: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.OmniFlix.globalfee.v1beta1.Params}
 */
proto.OmniFlix.globalfee.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.OmniFlix.globalfee.v1beta1.Params;
  return proto.OmniFlix.globalfee.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.OmniFlix.globalfee.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.OmniFlix.globalfee.v1beta1.Params}
 */
proto.OmniFlix.globalfee.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.addMinimumGasPrices(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addBypassMinFeeMsgTypes(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxTotalBypassMinFeeMsgGasUsage(value);
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
proto.OmniFlix.globalfee.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.OmniFlix.globalfee.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.OmniFlix.globalfee.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.globalfee.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMinimumGasPricesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
  f = message.getBypassMinFeeMsgTypesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getMaxTotalBypassMinFeeMsgGasUsage();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.DecCoin minimum_gas_prices = 1;
 * @return {!Array<!proto.cosmos.base.v1beta1.DecCoin>}
 */
proto.OmniFlix.globalfee.v1beta1.Params.prototype.getMinimumGasPricesList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.DecCoin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 1));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.DecCoin>} value
 * @return {!proto.OmniFlix.globalfee.v1beta1.Params} returns this
*/
proto.OmniFlix.globalfee.v1beta1.Params.prototype.setMinimumGasPricesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.DecCoin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.DecCoin}
 */
proto.OmniFlix.globalfee.v1beta1.Params.prototype.addMinimumGasPrices = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.base.v1beta1.DecCoin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.OmniFlix.globalfee.v1beta1.Params} returns this
 */
proto.OmniFlix.globalfee.v1beta1.Params.prototype.clearMinimumGasPricesList = function() {
  return this.setMinimumGasPricesList([]);
};


/**
 * repeated string bypass_min_fee_msg_types = 2;
 * @return {!Array<string>}
 */
proto.OmniFlix.globalfee.v1beta1.Params.prototype.getBypassMinFeeMsgTypesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.OmniFlix.globalfee.v1beta1.Params} returns this
 */
proto.OmniFlix.globalfee.v1beta1.Params.prototype.setBypassMinFeeMsgTypesList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.OmniFlix.globalfee.v1beta1.Params} returns this
 */
proto.OmniFlix.globalfee.v1beta1.Params.prototype.addBypassMinFeeMsgTypes = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.OmniFlix.globalfee.v1beta1.Params} returns this
 */
proto.OmniFlix.globalfee.v1beta1.Params.prototype.clearBypassMinFeeMsgTypesList = function() {
  return this.setBypassMinFeeMsgTypesList([]);
};


/**
 * optional uint64 max_total_bypass_min_fee_msg_gas_usage = 3;
 * @return {number}
 */
proto.OmniFlix.globalfee.v1beta1.Params.prototype.getMaxTotalBypassMinFeeMsgGasUsage = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.OmniFlix.globalfee.v1beta1.Params} returns this
 */
proto.OmniFlix.globalfee.v1beta1.Params.prototype.setMaxTotalBypassMinFeeMsgGasUsage = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


