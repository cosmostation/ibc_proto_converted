// source: injective/ocr/v1beta1/tx.proto
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

goog.provide('proto.injective.ocr.v1beta1.MsgAcceptPayeeship');

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
proto.injective.ocr.v1beta1.MsgAcceptPayeeship = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.ocr.v1beta1.MsgAcceptPayeeship, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.ocr.v1beta1.MsgAcceptPayeeship.displayName = 'proto.injective.ocr.v1beta1.MsgAcceptPayeeship';
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
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.ocr.v1beta1.MsgAcceptPayeeship.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.ocr.v1beta1.MsgAcceptPayeeship} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.toObject = function(includeInstance, msg) {
  var f, obj = {
    payee: jspb.Message.getFieldWithDefault(msg, 1, ""),
    transmitter: jspb.Message.getFieldWithDefault(msg, 2, ""),
    feedId: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.injective.ocr.v1beta1.MsgAcceptPayeeship}
 */
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.ocr.v1beta1.MsgAcceptPayeeship;
  return proto.injective.ocr.v1beta1.MsgAcceptPayeeship.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.ocr.v1beta1.MsgAcceptPayeeship} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.ocr.v1beta1.MsgAcceptPayeeship}
 */
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setPayee(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransmitter(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeedId(value);
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
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.ocr.v1beta1.MsgAcceptPayeeship.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.ocr.v1beta1.MsgAcceptPayeeship} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPayee();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTransmitter();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getFeedId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string payee = 1;
 * @return {string}
 */
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.prototype.getPayee = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.MsgAcceptPayeeship} returns this
 */
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.prototype.setPayee = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string transmitter = 2;
 * @return {string}
 */
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.prototype.getTransmitter = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.MsgAcceptPayeeship} returns this
 */
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.prototype.setTransmitter = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string feed_id = 3;
 * @return {string}
 */
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.prototype.getFeedId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.ocr.v1beta1.MsgAcceptPayeeship} returns this
 */
proto.injective.ocr.v1beta1.MsgAcceptPayeeship.prototype.setFeedId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};

