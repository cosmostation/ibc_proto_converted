// source: em/liquidityprovider/v1/tx.proto
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

goog.provide('proto.em.liquidityprovider.v1.MsgBurnTokens');

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
proto.em.liquidityprovider.v1.MsgBurnTokens = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.em.liquidityprovider.v1.MsgBurnTokens.repeatedFields_, null);
};
goog.inherits(proto.em.liquidityprovider.v1.MsgBurnTokens, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.em.liquidityprovider.v1.MsgBurnTokens.displayName = 'proto.em.liquidityprovider.v1.MsgBurnTokens';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.em.liquidityprovider.v1.MsgBurnTokens.repeatedFields_ = [2];



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
proto.em.liquidityprovider.v1.MsgBurnTokens.prototype.toObject = function(opt_includeInstance) {
  return proto.em.liquidityprovider.v1.MsgBurnTokens.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.em.liquidityprovider.v1.MsgBurnTokens} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.liquidityprovider.v1.MsgBurnTokens.toObject = function(includeInstance, msg) {
  var f, obj = {
    liquidityProvider: jspb.Message.getFieldWithDefault(msg, 1, ""),
    amountList: jspb.Message.toObjectList(msg.getAmountList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance)
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
 * @return {!proto.em.liquidityprovider.v1.MsgBurnTokens}
 */
proto.em.liquidityprovider.v1.MsgBurnTokens.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.em.liquidityprovider.v1.MsgBurnTokens;
  return proto.em.liquidityprovider.v1.MsgBurnTokens.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.em.liquidityprovider.v1.MsgBurnTokens} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.em.liquidityprovider.v1.MsgBurnTokens}
 */
proto.em.liquidityprovider.v1.MsgBurnTokens.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setLiquidityProvider(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addAmount(value);
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
proto.em.liquidityprovider.v1.MsgBurnTokens.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.em.liquidityprovider.v1.MsgBurnTokens.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.em.liquidityprovider.v1.MsgBurnTokens} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.liquidityprovider.v1.MsgBurnTokens.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLiquidityProvider();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAmountList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string liquidity_provider = 1;
 * @return {string}
 */
proto.em.liquidityprovider.v1.MsgBurnTokens.prototype.getLiquidityProvider = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.liquidityprovider.v1.MsgBurnTokens} returns this
 */
proto.em.liquidityprovider.v1.MsgBurnTokens.prototype.setLiquidityProvider = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin amount = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.em.liquidityprovider.v1.MsgBurnTokens.prototype.getAmountList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.em.liquidityprovider.v1.MsgBurnTokens} returns this
*/
proto.em.liquidityprovider.v1.MsgBurnTokens.prototype.setAmountList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.em.liquidityprovider.v1.MsgBurnTokens.prototype.addAmount = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.em.liquidityprovider.v1.MsgBurnTokens} returns this
 */
proto.em.liquidityprovider.v1.MsgBurnTokens.prototype.clearAmountList = function() {
  return this.setAmountList([]);
};


