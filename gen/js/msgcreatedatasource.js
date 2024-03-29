// source: band/oracle/v1/tx.proto
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

goog.provide('proto.oracle.v1.MsgCreateDataSource');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.oracle.v1.MsgCreateDataSource = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.oracle.v1.MsgCreateDataSource.repeatedFields_, null);
};
goog.inherits(proto.oracle.v1.MsgCreateDataSource, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.oracle.v1.MsgCreateDataSource.displayName = 'proto.oracle.v1.MsgCreateDataSource';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.oracle.v1.MsgCreateDataSource.repeatedFields_ = [4];



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
proto.oracle.v1.MsgCreateDataSource.prototype.toObject = function(opt_includeInstance) {
  return proto.oracle.v1.MsgCreateDataSource.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.oracle.v1.MsgCreateDataSource} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.oracle.v1.MsgCreateDataSource.toObject = function(includeInstance, msg) {
  var f, obj = {
    name: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    executable: msg.getExecutable_asB64(),
    feeList: jspb.Message.toObjectList(msg.getFeeList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    treasury: jspb.Message.getFieldWithDefault(msg, 5, ""),
    owner: jspb.Message.getFieldWithDefault(msg, 6, ""),
    sender: jspb.Message.getFieldWithDefault(msg, 7, "")
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
 * @return {!proto.oracle.v1.MsgCreateDataSource}
 */
proto.oracle.v1.MsgCreateDataSource.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.oracle.v1.MsgCreateDataSource;
  return proto.oracle.v1.MsgCreateDataSource.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.oracle.v1.MsgCreateDataSource} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.oracle.v1.MsgCreateDataSource}
 */
proto.oracle.v1.MsgCreateDataSource.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setExecutable(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addFee(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setTreasury(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
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
proto.oracle.v1.MsgCreateDataSource.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.oracle.v1.MsgCreateDataSource.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.oracle.v1.MsgCreateDataSource} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.oracle.v1.MsgCreateDataSource.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getExecutable_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getFeeList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getTreasury();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
};


/**
 * optional string name = 1;
 * @return {string}
 */
proto.oracle.v1.MsgCreateDataSource.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.oracle.v1.MsgCreateDataSource} returns this
 */
proto.oracle.v1.MsgCreateDataSource.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.oracle.v1.MsgCreateDataSource.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.oracle.v1.MsgCreateDataSource} returns this
 */
proto.oracle.v1.MsgCreateDataSource.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bytes executable = 3;
 * @return {string}
 */
proto.oracle.v1.MsgCreateDataSource.prototype.getExecutable = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes executable = 3;
 * This is a type-conversion wrapper around `getExecutable()`
 * @return {string}
 */
proto.oracle.v1.MsgCreateDataSource.prototype.getExecutable_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getExecutable()));
};


/**
 * optional bytes executable = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getExecutable()`
 * @return {!Uint8Array}
 */
proto.oracle.v1.MsgCreateDataSource.prototype.getExecutable_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getExecutable()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.oracle.v1.MsgCreateDataSource} returns this
 */
proto.oracle.v1.MsgCreateDataSource.prototype.setExecutable = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin fee = 4;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.oracle.v1.MsgCreateDataSource.prototype.getFeeList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.oracle.v1.MsgCreateDataSource} returns this
*/
proto.oracle.v1.MsgCreateDataSource.prototype.setFeeList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.oracle.v1.MsgCreateDataSource.prototype.addFee = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.oracle.v1.MsgCreateDataSource} returns this
 */
proto.oracle.v1.MsgCreateDataSource.prototype.clearFeeList = function() {
  return this.setFeeList([]);
};


/**
 * optional string treasury = 5;
 * @return {string}
 */
proto.oracle.v1.MsgCreateDataSource.prototype.getTreasury = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.oracle.v1.MsgCreateDataSource} returns this
 */
proto.oracle.v1.MsgCreateDataSource.prototype.setTreasury = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string owner = 6;
 * @return {string}
 */
proto.oracle.v1.MsgCreateDataSource.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.oracle.v1.MsgCreateDataSource} returns this
 */
proto.oracle.v1.MsgCreateDataSource.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string sender = 7;
 * @return {string}
 */
proto.oracle.v1.MsgCreateDataSource.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.oracle.v1.MsgCreateDataSource} returns this
 */
proto.oracle.v1.MsgCreateDataSource.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


