// source: archway/rewards/v1/query.proto
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

goog.provide('proto.archway.rewards.v1.QueryEstimateTxFeesRequest');

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
proto.archway.rewards.v1.QueryEstimateTxFeesRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.archway.rewards.v1.QueryEstimateTxFeesRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.archway.rewards.v1.QueryEstimateTxFeesRequest.displayName = 'proto.archway.rewards.v1.QueryEstimateTxFeesRequest';
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
proto.archway.rewards.v1.QueryEstimateTxFeesRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.archway.rewards.v1.QueryEstimateTxFeesRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.archway.rewards.v1.QueryEstimateTxFeesRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.archway.rewards.v1.QueryEstimateTxFeesRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    gasLimit: jspb.Message.getFieldWithDefault(msg, 1, 0),
    contractAddress: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.archway.rewards.v1.QueryEstimateTxFeesRequest}
 */
proto.archway.rewards.v1.QueryEstimateTxFeesRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.archway.rewards.v1.QueryEstimateTxFeesRequest;
  return proto.archway.rewards.v1.QueryEstimateTxFeesRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.archway.rewards.v1.QueryEstimateTxFeesRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.archway.rewards.v1.QueryEstimateTxFeesRequest}
 */
proto.archway.rewards.v1.QueryEstimateTxFeesRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGasLimit(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractAddress(value);
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
proto.archway.rewards.v1.QueryEstimateTxFeesRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.archway.rewards.v1.QueryEstimateTxFeesRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.archway.rewards.v1.QueryEstimateTxFeesRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.archway.rewards.v1.QueryEstimateTxFeesRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getGasLimit();
  if (f !== 0) {
    writer.writeUint64(
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
};


/**
 * optional uint64 gas_limit = 1;
 * @return {number}
 */
proto.archway.rewards.v1.QueryEstimateTxFeesRequest.prototype.getGasLimit = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.archway.rewards.v1.QueryEstimateTxFeesRequest} returns this
 */
proto.archway.rewards.v1.QueryEstimateTxFeesRequest.prototype.setGasLimit = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string contract_address = 2;
 * @return {string}
 */
proto.archway.rewards.v1.QueryEstimateTxFeesRequest.prototype.getContractAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.archway.rewards.v1.QueryEstimateTxFeesRequest} returns this
 */
proto.archway.rewards.v1.QueryEstimateTxFeesRequest.prototype.setContractAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


