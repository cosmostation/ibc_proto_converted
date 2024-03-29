// source: teritori/mint/v1beta1/tx.proto
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

goog.provide('proto.teritori.mint.v1beta1.MsgBurnTokens');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.teritori.mint.v1beta1.MsgBurnTokens = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.teritori.mint.v1beta1.MsgBurnTokens.repeatedFields_, null);
};
goog.inherits(proto.teritori.mint.v1beta1.MsgBurnTokens, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.teritori.mint.v1beta1.MsgBurnTokens.displayName = 'proto.teritori.mint.v1beta1.MsgBurnTokens';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.teritori.mint.v1beta1.MsgBurnTokens.repeatedFields_ = [2];



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
proto.teritori.mint.v1beta1.MsgBurnTokens.prototype.toObject = function(opt_includeInstance) {
  return proto.teritori.mint.v1beta1.MsgBurnTokens.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.teritori.mint.v1beta1.MsgBurnTokens} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.teritori.mint.v1beta1.MsgBurnTokens.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    amountList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f
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
 * @return {!proto.teritori.mint.v1beta1.MsgBurnTokens}
 */
proto.teritori.mint.v1beta1.MsgBurnTokens.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.teritori.mint.v1beta1.MsgBurnTokens;
  return proto.teritori.mint.v1beta1.MsgBurnTokens.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.teritori.mint.v1beta1.MsgBurnTokens} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.teritori.mint.v1beta1.MsgBurnTokens}
 */
proto.teritori.mint.v1beta1.MsgBurnTokens.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
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
proto.teritori.mint.v1beta1.MsgBurnTokens.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.teritori.mint.v1beta1.MsgBurnTokens.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.teritori.mint.v1beta1.MsgBurnTokens} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.teritori.mint.v1beta1.MsgBurnTokens.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAmountList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.teritori.mint.v1beta1.MsgBurnTokens.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.teritori.mint.v1beta1.MsgBurnTokens} returns this
 */
proto.teritori.mint.v1beta1.MsgBurnTokens.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated string amount = 2;
 * @return {!Array<string>}
 */
proto.teritori.mint.v1beta1.MsgBurnTokens.prototype.getAmountList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.teritori.mint.v1beta1.MsgBurnTokens} returns this
 */
proto.teritori.mint.v1beta1.MsgBurnTokens.prototype.setAmountList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.teritori.mint.v1beta1.MsgBurnTokens} returns this
 */
proto.teritori.mint.v1beta1.MsgBurnTokens.prototype.addAmount = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.teritori.mint.v1beta1.MsgBurnTokens} returns this
 */
proto.teritori.mint.v1beta1.MsgBurnTokens.prototype.clearAmountList = function() {
  return this.setAmountList([]);
};


