// source: osmosis/concentrated-liquidity/incentive_record.proto
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

goog.provide('proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
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
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.displayName = 'proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody';
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
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.toObject = function(includeInstance, msg) {
  var f, obj = {
    remainingAmount: jspb.Message.getFieldWithDefault(msg, 1, ""),
    emissionRate: jspb.Message.getFieldWithDefault(msg, 2, ""),
    startTime: (f = msg.getStartTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody}
 */
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody;
  return proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody}
 */
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setRemainingAmount(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setEmissionRate(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartTime(value);
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
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRemainingAmount();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getEmissionRate();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getStartTime();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional string remaining_amount = 1;
 * @return {string}
 */
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.prototype.getRemainingAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.prototype.setRemainingAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string emission_rate = 2;
 * @return {string}
 */
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.prototype.getEmissionRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.prototype.setEmissionRate = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional google.protobuf.Timestamp start_time = 3;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.prototype.getStartTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 3));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody} returns this
*/
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.prototype.setStartTime = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody} returns this
 */
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.prototype.clearStartTime = function() {
  return this.setStartTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.concentratedliquidity.v1beta1.IncentiveRecordBody.prototype.hasStartTime = function() {
  return jspb.Message.getField(this, 3) != null;
};


