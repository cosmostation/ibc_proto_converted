// source: shentu/burrow/payload.proto
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

goog.provide('proto.payload.UnbondTx');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.payload.TxInput');
goog.require('proto.payload.TxOutput');

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
proto.payload.UnbondTx = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.payload.UnbondTx, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.payload.UnbondTx.displayName = 'proto.payload.UnbondTx';
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
proto.payload.UnbondTx.prototype.toObject = function(opt_includeInstance) {
  return proto.payload.UnbondTx.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.payload.UnbondTx} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.payload.UnbondTx.toObject = function(includeInstance, msg) {
  var f, obj = {
    input: (f = msg.getInput()) && proto.payload.TxInput.toObject(includeInstance, f),
    output: (f = msg.getOutput()) && proto.payload.TxOutput.toObject(includeInstance, f)
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
 * @return {!proto.payload.UnbondTx}
 */
proto.payload.UnbondTx.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.payload.UnbondTx;
  return proto.payload.UnbondTx.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.payload.UnbondTx} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.payload.UnbondTx}
 */
proto.payload.UnbondTx.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.payload.TxInput;
      reader.readMessage(value,proto.payload.TxInput.deserializeBinaryFromReader);
      msg.setInput(value);
      break;
    case 2:
      var value = new proto.payload.TxOutput;
      reader.readMessage(value,proto.payload.TxOutput.deserializeBinaryFromReader);
      msg.setOutput(value);
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
proto.payload.UnbondTx.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.payload.UnbondTx.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.payload.UnbondTx} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.payload.UnbondTx.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getInput();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.payload.TxInput.serializeBinaryToWriter
    );
  }
  f = message.getOutput();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.payload.TxOutput.serializeBinaryToWriter
    );
  }
};


/**
 * optional TxInput Input = 1;
 * @return {?proto.payload.TxInput}
 */
proto.payload.UnbondTx.prototype.getInput = function() {
  return /** @type{?proto.payload.TxInput} */ (
    jspb.Message.getWrapperField(this, proto.payload.TxInput, 1));
};


/**
 * @param {?proto.payload.TxInput|undefined} value
 * @return {!proto.payload.UnbondTx} returns this
*/
proto.payload.UnbondTx.prototype.setInput = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.payload.UnbondTx} returns this
 */
proto.payload.UnbondTx.prototype.clearInput = function() {
  return this.setInput(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.payload.UnbondTx.prototype.hasInput = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional TxOutput Output = 2;
 * @return {?proto.payload.TxOutput}
 */
proto.payload.UnbondTx.prototype.getOutput = function() {
  return /** @type{?proto.payload.TxOutput} */ (
    jspb.Message.getWrapperField(this, proto.payload.TxOutput, 2));
};


/**
 * @param {?proto.payload.TxOutput|undefined} value
 * @return {!proto.payload.UnbondTx} returns this
*/
proto.payload.UnbondTx.prototype.setOutput = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.payload.UnbondTx} returns this
 */
proto.payload.UnbondTx.prototype.clearOutput = function() {
  return this.setOutput(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.payload.UnbondTx.prototype.hasOutput = function() {
  return jspb.Message.getField(this, 2) != null;
};


