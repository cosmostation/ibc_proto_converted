// source: iov/offchain/v1alpha1/offchain.proto
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

goog.provide('proto.cosmos.offchain.v1alpha1.ListOfMsgSignData');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.offchain.v1alpha1.MsgSignData');

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
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.repeatedFields_, null);
};
goog.inherits(proto.cosmos.offchain.v1alpha1.ListOfMsgSignData, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.displayName = 'proto.cosmos.offchain.v1alpha1.ListOfMsgSignData';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.repeatedFields_ = [1];



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
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.offchain.v1alpha1.ListOfMsgSignData} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.toObject = function(includeInstance, msg) {
  var f, obj = {
    msgsList: jspb.Message.toObjectList(msg.getMsgsList(),
    proto.cosmos.offchain.v1alpha1.MsgSignData.toObject, includeInstance)
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
 * @return {!proto.cosmos.offchain.v1alpha1.ListOfMsgSignData}
 */
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.offchain.v1alpha1.ListOfMsgSignData;
  return proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.offchain.v1alpha1.ListOfMsgSignData} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.offchain.v1alpha1.ListOfMsgSignData}
 */
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.offchain.v1alpha1.MsgSignData;
      reader.readMessage(value,proto.cosmos.offchain.v1alpha1.MsgSignData.deserializeBinaryFromReader);
      msg.addMsgs(value);
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
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.offchain.v1alpha1.ListOfMsgSignData} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMsgsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.offchain.v1alpha1.MsgSignData.serializeBinaryToWriter
    );
  }
};


/**
 * repeated MsgSignData msgs = 1;
 * @return {!Array<!proto.cosmos.offchain.v1alpha1.MsgSignData>}
 */
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.prototype.getMsgsList = function() {
  return /** @type{!Array<!proto.cosmos.offchain.v1alpha1.MsgSignData>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.offchain.v1alpha1.MsgSignData, 1));
};


/**
 * @param {!Array<!proto.cosmos.offchain.v1alpha1.MsgSignData>} value
 * @return {!proto.cosmos.offchain.v1alpha1.ListOfMsgSignData} returns this
*/
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.prototype.setMsgsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.offchain.v1alpha1.MsgSignData=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.offchain.v1alpha1.MsgSignData}
 */
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.prototype.addMsgs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.offchain.v1alpha1.MsgSignData, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.offchain.v1alpha1.ListOfMsgSignData} returns this
 */
proto.cosmos.offchain.v1alpha1.ListOfMsgSignData.prototype.clearMsgsList = function() {
  return this.setMsgsList([]);
};


