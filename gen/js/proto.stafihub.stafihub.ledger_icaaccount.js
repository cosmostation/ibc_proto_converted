// source: stafihub/ledger/ledger.proto
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

goog.provide('proto.stafihub.stafihub.ledger.IcaAccount');

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
proto.stafihub.stafihub.ledger.IcaAccount = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stafihub.stafihub.ledger.IcaAccount, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.ledger.IcaAccount.displayName = 'proto.stafihub.stafihub.ledger.IcaAccount';
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
proto.stafihub.stafihub.ledger.IcaAccount.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.ledger.IcaAccount.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.ledger.IcaAccount} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.ledger.IcaAccount.toObject = function(includeInstance, msg) {
  var f, obj = {
    owner: jspb.Message.getFieldWithDefault(msg, 1, ""),
    address: jspb.Message.getFieldWithDefault(msg, 2, ""),
    ctrlconnectionid: jspb.Message.getFieldWithDefault(msg, 3, ""),
    ctrlportid: jspb.Message.getFieldWithDefault(msg, 4, ""),
    ctrlchannelid: jspb.Message.getFieldWithDefault(msg, 5, ""),
    hostconnectionid: jspb.Message.getFieldWithDefault(msg, 6, ""),
    hostportid: jspb.Message.getFieldWithDefault(msg, 7, ""),
    hostchannelid: jspb.Message.getFieldWithDefault(msg, 8, "")
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
 * @return {!proto.stafihub.stafihub.ledger.IcaAccount}
 */
proto.stafihub.stafihub.ledger.IcaAccount.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.ledger.IcaAccount;
  return proto.stafihub.stafihub.ledger.IcaAccount.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.ledger.IcaAccount} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.ledger.IcaAccount}
 */
proto.stafihub.stafihub.ledger.IcaAccount.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setCtrlconnectionid(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setCtrlportid(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setCtrlchannelid(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setHostconnectionid(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setHostportid(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setHostchannelid(value);
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
proto.stafihub.stafihub.ledger.IcaAccount.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.ledger.IcaAccount.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.ledger.IcaAccount} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.ledger.IcaAccount.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getCtrlconnectionid();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getCtrlportid();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getCtrlchannelid();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getHostconnectionid();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getHostportid();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getHostchannelid();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
};


/**
 * optional string owner = 1;
 * @return {string}
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.ledger.IcaAccount} returns this
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string address = 2;
 * @return {string}
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.ledger.IcaAccount} returns this
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string ctrlConnectionId = 3;
 * @return {string}
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.getCtrlconnectionid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.ledger.IcaAccount} returns this
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.setCtrlconnectionid = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string ctrlPortId = 4;
 * @return {string}
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.getCtrlportid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.ledger.IcaAccount} returns this
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.setCtrlportid = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string ctrlChannelId = 5;
 * @return {string}
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.getCtrlchannelid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.ledger.IcaAccount} returns this
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.setCtrlchannelid = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string hostConnectionId = 6;
 * @return {string}
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.getHostconnectionid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.ledger.IcaAccount} returns this
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.setHostconnectionid = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string hostPortId = 7;
 * @return {string}
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.getHostportid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.ledger.IcaAccount} returns this
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.setHostportid = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string hostChannelId = 8;
 * @return {string}
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.getHostchannelid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.ledger.IcaAccount} returns this
 */
proto.stafihub.stafihub.ledger.IcaAccount.prototype.setHostchannelid = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


