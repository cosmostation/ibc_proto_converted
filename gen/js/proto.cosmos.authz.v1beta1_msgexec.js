// source: cosmos/authz/v1beta1/tx.proto
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

goog.provide('proto.cosmos.authz.v1beta1.MsgExec');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');

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
proto.cosmos.authz.v1beta1.MsgExec = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.authz.v1beta1.MsgExec.repeatedFields_, null);
};
goog.inherits(proto.cosmos.authz.v1beta1.MsgExec, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.authz.v1beta1.MsgExec.displayName = 'proto.cosmos.authz.v1beta1.MsgExec';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.authz.v1beta1.MsgExec.repeatedFields_ = [2];



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
proto.cosmos.authz.v1beta1.MsgExec.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.authz.v1beta1.MsgExec.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.authz.v1beta1.MsgExec} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.authz.v1beta1.MsgExec.toObject = function(includeInstance, msg) {
  var f, obj = {
    grantee: jspb.Message.getFieldWithDefault(msg, 1, ""),
    msgsList: jspb.Message.toObjectList(msg.getMsgsList(),
    proto.google.protobuf.Any.toObject, includeInstance)
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
 * @return {!proto.cosmos.authz.v1beta1.MsgExec}
 */
proto.cosmos.authz.v1beta1.MsgExec.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.authz.v1beta1.MsgExec;
  return proto.cosmos.authz.v1beta1.MsgExec.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.authz.v1beta1.MsgExec} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.authz.v1beta1.MsgExec}
 */
proto.cosmos.authz.v1beta1.MsgExec.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setGrantee(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
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
proto.cosmos.authz.v1beta1.MsgExec.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.authz.v1beta1.MsgExec.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.authz.v1beta1.MsgExec} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.authz.v1beta1.MsgExec.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getGrantee();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getMsgsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
};


/**
 * optional string grantee = 1;
 * @return {string}
 */
proto.cosmos.authz.v1beta1.MsgExec.prototype.getGrantee = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.authz.v1beta1.MsgExec} returns this
 */
proto.cosmos.authz.v1beta1.MsgExec.prototype.setGrantee = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated google.protobuf.Any msgs = 2;
 * @return {!Array<!proto.google.protobuf.Any>}
 */
proto.cosmos.authz.v1beta1.MsgExec.prototype.getMsgsList = function() {
  return /** @type{!Array<!proto.google.protobuf.Any>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Any, 2));
};


/**
 * @param {!Array<!proto.google.protobuf.Any>} value
 * @return {!proto.cosmos.authz.v1beta1.MsgExec} returns this
*/
proto.cosmos.authz.v1beta1.MsgExec.prototype.setMsgsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.google.protobuf.Any=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Any}
 */
proto.cosmos.authz.v1beta1.MsgExec.prototype.addMsgs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.google.protobuf.Any, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.authz.v1beta1.MsgExec} returns this
 */
proto.cosmos.authz.v1beta1.MsgExec.prototype.clearMsgsList = function() {
  return this.setMsgsList([]);
};

