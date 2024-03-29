// source: comdex/lend/v1beta1/lend.proto
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

goog.provide('proto.comdex.lend.v1beta1.ModuleBalance');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.comdex.lend.v1beta1.ModuleBalanceStats');

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
proto.comdex.lend.v1beta1.ModuleBalance = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.lend.v1beta1.ModuleBalance.repeatedFields_, null);
};
goog.inherits(proto.comdex.lend.v1beta1.ModuleBalance, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.lend.v1beta1.ModuleBalance.displayName = 'proto.comdex.lend.v1beta1.ModuleBalance';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.lend.v1beta1.ModuleBalance.repeatedFields_ = [2];



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
proto.comdex.lend.v1beta1.ModuleBalance.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.lend.v1beta1.ModuleBalance.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.lend.v1beta1.ModuleBalance} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.ModuleBalance.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    moduleBalanceStatsList: jspb.Message.toObjectList(msg.getModuleBalanceStatsList(),
    proto.comdex.lend.v1beta1.ModuleBalanceStats.toObject, includeInstance)
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
 * @return {!proto.comdex.lend.v1beta1.ModuleBalance}
 */
proto.comdex.lend.v1beta1.ModuleBalance.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.lend.v1beta1.ModuleBalance;
  return proto.comdex.lend.v1beta1.ModuleBalance.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.lend.v1beta1.ModuleBalance} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.lend.v1beta1.ModuleBalance}
 */
proto.comdex.lend.v1beta1.ModuleBalance.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 2:
      var value = new proto.comdex.lend.v1beta1.ModuleBalanceStats;
      reader.readMessage(value,proto.comdex.lend.v1beta1.ModuleBalanceStats.deserializeBinaryFromReader);
      msg.addModuleBalanceStats(value);
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
proto.comdex.lend.v1beta1.ModuleBalance.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.lend.v1beta1.ModuleBalance.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.lend.v1beta1.ModuleBalance} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.lend.v1beta1.ModuleBalance.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getModuleBalanceStatsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.comdex.lend.v1beta1.ModuleBalanceStats.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 pool_id = 1;
 * @return {number}
 */
proto.comdex.lend.v1beta1.ModuleBalance.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.lend.v1beta1.ModuleBalance} returns this
 */
proto.comdex.lend.v1beta1.ModuleBalance.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated ModuleBalanceStats module_balance_stats = 2;
 * @return {!Array<!proto.comdex.lend.v1beta1.ModuleBalanceStats>}
 */
proto.comdex.lend.v1beta1.ModuleBalance.prototype.getModuleBalanceStatsList = function() {
  return /** @type{!Array<!proto.comdex.lend.v1beta1.ModuleBalanceStats>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.comdex.lend.v1beta1.ModuleBalanceStats, 2));
};


/**
 * @param {!Array<!proto.comdex.lend.v1beta1.ModuleBalanceStats>} value
 * @return {!proto.comdex.lend.v1beta1.ModuleBalance} returns this
*/
proto.comdex.lend.v1beta1.ModuleBalance.prototype.setModuleBalanceStatsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.comdex.lend.v1beta1.ModuleBalanceStats=} opt_value
 * @param {number=} opt_index
 * @return {!proto.comdex.lend.v1beta1.ModuleBalanceStats}
 */
proto.comdex.lend.v1beta1.ModuleBalance.prototype.addModuleBalanceStats = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.comdex.lend.v1beta1.ModuleBalanceStats, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.lend.v1beta1.ModuleBalance} returns this
 */
proto.comdex.lend.v1beta1.ModuleBalance.prototype.clearModuleBalanceStatsList = function() {
  return this.setModuleBalanceStatsList([]);
};


