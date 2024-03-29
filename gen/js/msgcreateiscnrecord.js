// source: likechain/iscn/tx.proto
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

goog.provide('proto.likechain.iscn.MsgCreateIscnRecord');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.likechain.iscn.IscnRecord');

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
proto.likechain.iscn.MsgCreateIscnRecord = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.likechain.iscn.MsgCreateIscnRecord, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.iscn.MsgCreateIscnRecord.displayName = 'proto.likechain.iscn.MsgCreateIscnRecord';
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
proto.likechain.iscn.MsgCreateIscnRecord.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.iscn.MsgCreateIscnRecord.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.iscn.MsgCreateIscnRecord} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.iscn.MsgCreateIscnRecord.toObject = function(includeInstance, msg) {
  var f, obj = {
    from: jspb.Message.getFieldWithDefault(msg, 1, ""),
    record: (f = msg.getRecord()) && proto.likechain.iscn.IscnRecord.toObject(includeInstance, f),
    nonce: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.likechain.iscn.MsgCreateIscnRecord}
 */
proto.likechain.iscn.MsgCreateIscnRecord.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.iscn.MsgCreateIscnRecord;
  return proto.likechain.iscn.MsgCreateIscnRecord.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.iscn.MsgCreateIscnRecord} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.iscn.MsgCreateIscnRecord}
 */
proto.likechain.iscn.MsgCreateIscnRecord.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFrom(value);
      break;
    case 2:
      var value = new proto.likechain.iscn.IscnRecord;
      reader.readMessage(value,proto.likechain.iscn.IscnRecord.deserializeBinaryFromReader);
      msg.setRecord(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setNonce(value);
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
proto.likechain.iscn.MsgCreateIscnRecord.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.iscn.MsgCreateIscnRecord.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.iscn.MsgCreateIscnRecord} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.iscn.MsgCreateIscnRecord.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFrom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getRecord();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.likechain.iscn.IscnRecord.serializeBinaryToWriter
    );
  }
  f = message.getNonce();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
};


/**
 * optional string from = 1;
 * @return {string}
 */
proto.likechain.iscn.MsgCreateIscnRecord.prototype.getFrom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.iscn.MsgCreateIscnRecord} returns this
 */
proto.likechain.iscn.MsgCreateIscnRecord.prototype.setFrom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional IscnRecord record = 2;
 * @return {?proto.likechain.iscn.IscnRecord}
 */
proto.likechain.iscn.MsgCreateIscnRecord.prototype.getRecord = function() {
  return /** @type{?proto.likechain.iscn.IscnRecord} */ (
    jspb.Message.getWrapperField(this, proto.likechain.iscn.IscnRecord, 2));
};


/**
 * @param {?proto.likechain.iscn.IscnRecord|undefined} value
 * @return {!proto.likechain.iscn.MsgCreateIscnRecord} returns this
*/
proto.likechain.iscn.MsgCreateIscnRecord.prototype.setRecord = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.likechain.iscn.MsgCreateIscnRecord} returns this
 */
proto.likechain.iscn.MsgCreateIscnRecord.prototype.clearRecord = function() {
  return this.setRecord(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.likechain.iscn.MsgCreateIscnRecord.prototype.hasRecord = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional uint64 nonce = 3;
 * @return {number}
 */
proto.likechain.iscn.MsgCreateIscnRecord.prototype.getNonce = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.likechain.iscn.MsgCreateIscnRecord} returns this
 */
proto.likechain.iscn.MsgCreateIscnRecord.prototype.setNonce = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


