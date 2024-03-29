// source: cosmos/feegrant/v1beta1/feegrant.proto
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

goog.provide('proto.cosmos.feegrant.v1beta1.BasicAllowance');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.google.protobuf.Timestamp');

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
proto.cosmos.feegrant.v1beta1.BasicAllowance = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.feegrant.v1beta1.BasicAllowance.repeatedFields_, null);
};
goog.inherits(proto.cosmos.feegrant.v1beta1.BasicAllowance, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.feegrant.v1beta1.BasicAllowance.displayName = 'proto.cosmos.feegrant.v1beta1.BasicAllowance';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.feegrant.v1beta1.BasicAllowance.repeatedFields_ = [1];



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
proto.cosmos.feegrant.v1beta1.BasicAllowance.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.feegrant.v1beta1.BasicAllowance.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.feegrant.v1beta1.BasicAllowance} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.feegrant.v1beta1.BasicAllowance.toObject = function(includeInstance, msg) {
  var f, obj = {
    spendLimitList: jspb.Message.toObjectList(msg.getSpendLimitList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    expiration: (f = msg.getExpiration()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.feegrant.v1beta1.BasicAllowance}
 */
proto.cosmos.feegrant.v1beta1.BasicAllowance.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.feegrant.v1beta1.BasicAllowance;
  return proto.cosmos.feegrant.v1beta1.BasicAllowance.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.feegrant.v1beta1.BasicAllowance} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.feegrant.v1beta1.BasicAllowance}
 */
proto.cosmos.feegrant.v1beta1.BasicAllowance.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addSpendLimit(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setExpiration(value);
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
proto.cosmos.feegrant.v1beta1.BasicAllowance.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.feegrant.v1beta1.BasicAllowance.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.feegrant.v1beta1.BasicAllowance} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.feegrant.v1beta1.BasicAllowance.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSpendLimitList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getExpiration();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.Coin spend_limit = 1;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.cosmos.feegrant.v1beta1.BasicAllowance.prototype.getSpendLimitList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.cosmos.feegrant.v1beta1.BasicAllowance} returns this
*/
proto.cosmos.feegrant.v1beta1.BasicAllowance.prototype.setSpendLimitList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.cosmos.feegrant.v1beta1.BasicAllowance.prototype.addSpendLimit = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.feegrant.v1beta1.BasicAllowance} returns this
 */
proto.cosmos.feegrant.v1beta1.BasicAllowance.prototype.clearSpendLimitList = function() {
  return this.setSpendLimitList([]);
};


/**
 * optional google.protobuf.Timestamp expiration = 2;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.cosmos.feegrant.v1beta1.BasicAllowance.prototype.getExpiration = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 2));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.cosmos.feegrant.v1beta1.BasicAllowance} returns this
*/
proto.cosmos.feegrant.v1beta1.BasicAllowance.prototype.setExpiration = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.feegrant.v1beta1.BasicAllowance} returns this
 */
proto.cosmos.feegrant.v1beta1.BasicAllowance.prototype.clearExpiration = function() {
  return this.setExpiration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.feegrant.v1beta1.BasicAllowance.prototype.hasExpiration = function() {
  return jspb.Message.getField(this, 2) != null;
};


