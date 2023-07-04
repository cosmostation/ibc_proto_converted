// source: ixo/token/v1beta1/tx.proto
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

goog.provide('proto.ixo.token.v1beta1.MsgPauseToken');

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
proto.ixo.token.v1beta1.MsgPauseToken = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ixo.token.v1beta1.MsgPauseToken, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.token.v1beta1.MsgPauseToken.displayName = 'proto.ixo.token.v1beta1.MsgPauseToken';
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
proto.ixo.token.v1beta1.MsgPauseToken.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.token.v1beta1.MsgPauseToken.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.token.v1beta1.MsgPauseToken} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.token.v1beta1.MsgPauseToken.toObject = function(includeInstance, msg) {
  var f, obj = {
    minter: jspb.Message.getFieldWithDefault(msg, 1, ""),
    contractAddress: jspb.Message.getFieldWithDefault(msg, 2, ""),
    paused: jspb.Message.getBooleanFieldWithDefault(msg, 3, false)
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
 * @return {!proto.ixo.token.v1beta1.MsgPauseToken}
 */
proto.ixo.token.v1beta1.MsgPauseToken.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.token.v1beta1.MsgPauseToken;
  return proto.ixo.token.v1beta1.MsgPauseToken.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.token.v1beta1.MsgPauseToken} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.token.v1beta1.MsgPauseToken}
 */
proto.ixo.token.v1beta1.MsgPauseToken.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinter(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractAddress(value);
      break;
    case 3:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setPaused(value);
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
proto.ixo.token.v1beta1.MsgPauseToken.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.token.v1beta1.MsgPauseToken.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.token.v1beta1.MsgPauseToken} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.token.v1beta1.MsgPauseToken.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMinter();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getContractAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getPaused();
  if (f) {
    writer.writeBool(
      3,
      f
    );
  }
};


/**
 * optional string minter = 1;
 * @return {string}
 */
proto.ixo.token.v1beta1.MsgPauseToken.prototype.getMinter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.token.v1beta1.MsgPauseToken} returns this
 */
proto.ixo.token.v1beta1.MsgPauseToken.prototype.setMinter = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string contract_address = 2;
 * @return {string}
 */
proto.ixo.token.v1beta1.MsgPauseToken.prototype.getContractAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.token.v1beta1.MsgPauseToken} returns this
 */
proto.ixo.token.v1beta1.MsgPauseToken.prototype.setContractAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bool paused = 3;
 * @return {boolean}
 */
proto.ixo.token.v1beta1.MsgPauseToken.prototype.getPaused = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 3, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ixo.token.v1beta1.MsgPauseToken} returns this
 */
proto.ixo.token.v1beta1.MsgPauseToken.prototype.setPaused = function(value) {
  return jspb.Message.setProto3BooleanField(this, 3, value);
};

