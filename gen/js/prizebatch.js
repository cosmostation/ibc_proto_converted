// source: lum-network/millions/prize_batch.proto
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

goog.provide('proto.lum.network.millions.PrizeBatch');

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
proto.lum.network.millions.PrizeBatch = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lum.network.millions.PrizeBatch, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.millions.PrizeBatch.displayName = 'proto.lum.network.millions.PrizeBatch';
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
proto.lum.network.millions.PrizeBatch.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.millions.PrizeBatch.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.millions.PrizeBatch} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.millions.PrizeBatch.toObject = function(includeInstance, msg) {
  var f, obj = {
    poolPercent: jspb.Message.getFieldWithDefault(msg, 1, 0),
    quantity: jspb.Message.getFieldWithDefault(msg, 2, 0),
    drawProbability: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.lum.network.millions.PrizeBatch}
 */
proto.lum.network.millions.PrizeBatch.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.millions.PrizeBatch;
  return proto.lum.network.millions.PrizeBatch.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.millions.PrizeBatch} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.millions.PrizeBatch}
 */
proto.lum.network.millions.PrizeBatch.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolPercent(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setQuantity(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDrawProbability(value);
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
proto.lum.network.millions.PrizeBatch.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.millions.PrizeBatch.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.millions.PrizeBatch} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.millions.PrizeBatch.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPoolPercent();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getQuantity();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getDrawProbability();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional uint64 pool_percent = 1;
 * @return {number}
 */
proto.lum.network.millions.PrizeBatch.prototype.getPoolPercent = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.lum.network.millions.PrizeBatch} returns this
 */
proto.lum.network.millions.PrizeBatch.prototype.setPoolPercent = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 quantity = 2;
 * @return {number}
 */
proto.lum.network.millions.PrizeBatch.prototype.getQuantity = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.lum.network.millions.PrizeBatch} returns this
 */
proto.lum.network.millions.PrizeBatch.prototype.setQuantity = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string draw_probability = 3;
 * @return {string}
 */
proto.lum.network.millions.PrizeBatch.prototype.getDrawProbability = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.millions.PrizeBatch} returns this
 */
proto.lum.network.millions.PrizeBatch.prototype.setDrawProbability = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


