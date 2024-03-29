// source: osmosis/superfluid/query.proto
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

goog.provide('proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo');

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
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.displayName = 'proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo';
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
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    valAddr: jspb.Message.getFieldWithDefault(msg, 2, ""),
    gaugeId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    address: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo}
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo;
  return proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo}
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setValAddr(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setGaugeId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
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
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getValAddr();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getGaugeId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo} returns this
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string val_addr = 2;
 * @return {string}
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.prototype.getValAddr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo} returns this
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.prototype.setValAddr = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 gauge_id = 3;
 * @return {number}
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.prototype.getGaugeId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo} returns this
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.prototype.setGaugeId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string address = 4;
 * @return {string}
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo} returns this
 */
proto.osmosis.superfluid.SuperfluidIntermediaryAccountInfo.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


