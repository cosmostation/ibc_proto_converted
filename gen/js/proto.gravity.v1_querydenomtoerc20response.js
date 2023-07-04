// source: gravity/v1/query.proto
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

goog.provide('proto.gravity.v1.QueryDenomToERC20Response');

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
proto.gravity.v1.QueryDenomToERC20Response = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.gravity.v1.QueryDenomToERC20Response, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.gravity.v1.QueryDenomToERC20Response.displayName = 'proto.gravity.v1.QueryDenomToERC20Response';
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
proto.gravity.v1.QueryDenomToERC20Response.prototype.toObject = function(opt_includeInstance) {
  return proto.gravity.v1.QueryDenomToERC20Response.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.gravity.v1.QueryDenomToERC20Response} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gravity.v1.QueryDenomToERC20Response.toObject = function(includeInstance, msg) {
  var f, obj = {
    erc20: jspb.Message.getFieldWithDefault(msg, 1, ""),
    cosmosOriginated: jspb.Message.getBooleanFieldWithDefault(msg, 2, false)
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
 * @return {!proto.gravity.v1.QueryDenomToERC20Response}
 */
proto.gravity.v1.QueryDenomToERC20Response.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.gravity.v1.QueryDenomToERC20Response;
  return proto.gravity.v1.QueryDenomToERC20Response.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.gravity.v1.QueryDenomToERC20Response} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.gravity.v1.QueryDenomToERC20Response}
 */
proto.gravity.v1.QueryDenomToERC20Response.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setErc20(value);
      break;
    case 2:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setCosmosOriginated(value);
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
proto.gravity.v1.QueryDenomToERC20Response.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.gravity.v1.QueryDenomToERC20Response.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.gravity.v1.QueryDenomToERC20Response} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.gravity.v1.QueryDenomToERC20Response.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getErc20();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCosmosOriginated();
  if (f) {
    writer.writeBool(
      2,
      f
    );
  }
};


/**
 * optional string erc20 = 1;
 * @return {string}
 */
proto.gravity.v1.QueryDenomToERC20Response.prototype.getErc20 = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.gravity.v1.QueryDenomToERC20Response} returns this
 */
proto.gravity.v1.QueryDenomToERC20Response.prototype.setErc20 = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bool cosmos_originated = 2;
 * @return {boolean}
 */
proto.gravity.v1.QueryDenomToERC20Response.prototype.getCosmosOriginated = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 2, false));
};


/**
 * @param {boolean} value
 * @return {!proto.gravity.v1.QueryDenomToERC20Response} returns this
 */
proto.gravity.v1.QueryDenomToERC20Response.prototype.setCosmosOriginated = function(value) {
  return jspb.Message.setProto3BooleanField(this, 2, value);
};

