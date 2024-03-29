// source: neutron/feerefunder/genesis.proto
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

goog.provide('proto.neutron.feerefunder.FeeInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.neutron.feerefunder.Fee');
goog.require('proto.neutron.feerefunder.PacketID');

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
proto.neutron.feerefunder.FeeInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.neutron.feerefunder.FeeInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.neutron.feerefunder.FeeInfo.displayName = 'proto.neutron.feerefunder.FeeInfo';
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
proto.neutron.feerefunder.FeeInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.neutron.feerefunder.FeeInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.neutron.feerefunder.FeeInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.feerefunder.FeeInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    payer: jspb.Message.getFieldWithDefault(msg, 1, ""),
    packetId: (f = msg.getPacketId()) && proto.neutron.feerefunder.PacketID.toObject(includeInstance, f),
    fee: (f = msg.getFee()) && proto.neutron.feerefunder.Fee.toObject(includeInstance, f)
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
 * @return {!proto.neutron.feerefunder.FeeInfo}
 */
proto.neutron.feerefunder.FeeInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.neutron.feerefunder.FeeInfo;
  return proto.neutron.feerefunder.FeeInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.neutron.feerefunder.FeeInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.neutron.feerefunder.FeeInfo}
 */
proto.neutron.feerefunder.FeeInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setPayer(value);
      break;
    case 2:
      var value = new proto.neutron.feerefunder.PacketID;
      reader.readMessage(value,proto.neutron.feerefunder.PacketID.deserializeBinaryFromReader);
      msg.setPacketId(value);
      break;
    case 3:
      var value = new proto.neutron.feerefunder.Fee;
      reader.readMessage(value,proto.neutron.feerefunder.Fee.deserializeBinaryFromReader);
      msg.setFee(value);
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
proto.neutron.feerefunder.FeeInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.neutron.feerefunder.FeeInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.neutron.feerefunder.FeeInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.feerefunder.FeeInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPayer();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPacketId();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.neutron.feerefunder.PacketID.serializeBinaryToWriter
    );
  }
  f = message.getFee();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.neutron.feerefunder.Fee.serializeBinaryToWriter
    );
  }
};


/**
 * optional string payer = 1;
 * @return {string}
 */
proto.neutron.feerefunder.FeeInfo.prototype.getPayer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.feerefunder.FeeInfo} returns this
 */
proto.neutron.feerefunder.FeeInfo.prototype.setPayer = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional PacketID packet_id = 2;
 * @return {?proto.neutron.feerefunder.PacketID}
 */
proto.neutron.feerefunder.FeeInfo.prototype.getPacketId = function() {
  return /** @type{?proto.neutron.feerefunder.PacketID} */ (
    jspb.Message.getWrapperField(this, proto.neutron.feerefunder.PacketID, 2));
};


/**
 * @param {?proto.neutron.feerefunder.PacketID|undefined} value
 * @return {!proto.neutron.feerefunder.FeeInfo} returns this
*/
proto.neutron.feerefunder.FeeInfo.prototype.setPacketId = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.neutron.feerefunder.FeeInfo} returns this
 */
proto.neutron.feerefunder.FeeInfo.prototype.clearPacketId = function() {
  return this.setPacketId(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.neutron.feerefunder.FeeInfo.prototype.hasPacketId = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional Fee fee = 3;
 * @return {?proto.neutron.feerefunder.Fee}
 */
proto.neutron.feerefunder.FeeInfo.prototype.getFee = function() {
  return /** @type{?proto.neutron.feerefunder.Fee} */ (
    jspb.Message.getWrapperField(this, proto.neutron.feerefunder.Fee, 3));
};


/**
 * @param {?proto.neutron.feerefunder.Fee|undefined} value
 * @return {!proto.neutron.feerefunder.FeeInfo} returns this
*/
proto.neutron.feerefunder.FeeInfo.prototype.setFee = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.neutron.feerefunder.FeeInfo} returns this
 */
proto.neutron.feerefunder.FeeInfo.prototype.clearFee = function() {
  return this.setFee(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.neutron.feerefunder.FeeInfo.prototype.hasFee = function() {
  return jspb.Message.getField(this, 3) != null;
};


