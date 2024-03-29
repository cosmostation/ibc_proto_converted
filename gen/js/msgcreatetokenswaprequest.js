// source: rizon/tokenswap/tx.proto
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

goog.provide('proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest');

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
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.displayName = 'proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest';
}



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
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    txHash: jspb.Message.getFieldWithDefault(msg, 1, ""),
    receiver: jspb.Message.getFieldWithDefault(msg, 2, ""),
    signer: jspb.Message.getFieldWithDefault(msg, 3, ""),
    amount: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest}
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest;
  return proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest}
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTxHash(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setReceiver(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSigner(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmount(value);
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
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTxHash();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getReceiver();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSigner();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAmount();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string tx_hash = 1;
 * @return {string}
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.prototype.getTxHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest} returns this
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.prototype.setTxHash = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string receiver = 2;
 * @return {string}
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.prototype.getReceiver = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest} returns this
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.prototype.setReceiver = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string signer = 3;
 * @return {string}
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.prototype.getSigner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest} returns this
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.prototype.setSigner = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string amount = 4;
 * @return {string}
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.prototype.getAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest} returns this
 */
proto.rizonworld.rizon.tokenswap.MsgCreateTokenswapRequest.prototype.setAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


