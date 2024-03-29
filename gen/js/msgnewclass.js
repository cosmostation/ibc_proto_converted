// source: likechain/likenft/v1/tx.proto
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

goog.provide('proto.likechain.likenft.v1.MsgNewClass');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.likechain.likenft.v1.ClassInput');
goog.require('proto.likechain.likenft.v1.ClassParentInput');

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
proto.likechain.likenft.v1.MsgNewClass = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.likechain.likenft.v1.MsgNewClass, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.likenft.v1.MsgNewClass.displayName = 'proto.likechain.likenft.v1.MsgNewClass';
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
proto.likechain.likenft.v1.MsgNewClass.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.likenft.v1.MsgNewClass.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.likenft.v1.MsgNewClass} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.MsgNewClass.toObject = function(includeInstance, msg) {
  var f, obj = {
    creator: jspb.Message.getFieldWithDefault(msg, 1, ""),
    parent: (f = msg.getParent()) && proto.likechain.likenft.v1.ClassParentInput.toObject(includeInstance, f),
    input: (f = msg.getInput()) && proto.likechain.likenft.v1.ClassInput.toObject(includeInstance, f)
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
 * @return {!proto.likechain.likenft.v1.MsgNewClass}
 */
proto.likechain.likenft.v1.MsgNewClass.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.likenft.v1.MsgNewClass;
  return proto.likechain.likenft.v1.MsgNewClass.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.likenft.v1.MsgNewClass} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.likenft.v1.MsgNewClass}
 */
proto.likechain.likenft.v1.MsgNewClass.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 2:
      var value = new proto.likechain.likenft.v1.ClassParentInput;
      reader.readMessage(value,proto.likechain.likenft.v1.ClassParentInput.deserializeBinaryFromReader);
      msg.setParent(value);
      break;
    case 3:
      var value = new proto.likechain.likenft.v1.ClassInput;
      reader.readMessage(value,proto.likechain.likenft.v1.ClassInput.deserializeBinaryFromReader);
      msg.setInput(value);
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
proto.likechain.likenft.v1.MsgNewClass.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.likenft.v1.MsgNewClass.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.likenft.v1.MsgNewClass} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.MsgNewClass.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getParent();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.likechain.likenft.v1.ClassParentInput.serializeBinaryToWriter
    );
  }
  f = message.getInput();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.likechain.likenft.v1.ClassInput.serializeBinaryToWriter
    );
  }
};


/**
 * optional string creator = 1;
 * @return {string}
 */
proto.likechain.likenft.v1.MsgNewClass.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.MsgNewClass} returns this
 */
proto.likechain.likenft.v1.MsgNewClass.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional ClassParentInput parent = 2;
 * @return {?proto.likechain.likenft.v1.ClassParentInput}
 */
proto.likechain.likenft.v1.MsgNewClass.prototype.getParent = function() {
  return /** @type{?proto.likechain.likenft.v1.ClassParentInput} */ (
    jspb.Message.getWrapperField(this, proto.likechain.likenft.v1.ClassParentInput, 2));
};


/**
 * @param {?proto.likechain.likenft.v1.ClassParentInput|undefined} value
 * @return {!proto.likechain.likenft.v1.MsgNewClass} returns this
*/
proto.likechain.likenft.v1.MsgNewClass.prototype.setParent = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.likechain.likenft.v1.MsgNewClass} returns this
 */
proto.likechain.likenft.v1.MsgNewClass.prototype.clearParent = function() {
  return this.setParent(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.likechain.likenft.v1.MsgNewClass.prototype.hasParent = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional ClassInput input = 3;
 * @return {?proto.likechain.likenft.v1.ClassInput}
 */
proto.likechain.likenft.v1.MsgNewClass.prototype.getInput = function() {
  return /** @type{?proto.likechain.likenft.v1.ClassInput} */ (
    jspb.Message.getWrapperField(this, proto.likechain.likenft.v1.ClassInput, 3));
};


/**
 * @param {?proto.likechain.likenft.v1.ClassInput|undefined} value
 * @return {!proto.likechain.likenft.v1.MsgNewClass} returns this
*/
proto.likechain.likenft.v1.MsgNewClass.prototype.setInput = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.likechain.likenft.v1.MsgNewClass} returns this
 */
proto.likechain.likenft.v1.MsgNewClass.prototype.clearInput = function() {
  return this.setInput(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.likechain.likenft.v1.MsgNewClass.prototype.hasInput = function() {
  return jspb.Message.getField(this, 3) != null;
};


