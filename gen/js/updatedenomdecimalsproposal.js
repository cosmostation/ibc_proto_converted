// source: injective/exchange/v1beta1/tx.proto
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

goog.provide('proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.DenomDecimals');

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
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.repeatedFields_, null);
};
goog.inherits(proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.displayName = 'proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.repeatedFields_ = [3];



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
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    denomDecimalsList: jspb.Message.toObjectList(msg.getDenomDecimalsList(),
    proto.injective.exchange.v1beta1.DenomDecimals.toObject, includeInstance)
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
 * @return {!proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal}
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal;
  return proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal}
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = new proto.injective.exchange.v1beta1.DenomDecimals;
      reader.readMessage(value,proto.injective.exchange.v1beta1.DenomDecimals.deserializeBinaryFromReader);
      msg.addDenomDecimals(value);
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
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
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
  f = message.getDenomDecimalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.injective.exchange.v1beta1.DenomDecimals.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal} returns this
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal} returns this
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated DenomDecimals denom_decimals = 3;
 * @return {!Array<!proto.injective.exchange.v1beta1.DenomDecimals>}
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.prototype.getDenomDecimalsList = function() {
  return /** @type{!Array<!proto.injective.exchange.v1beta1.DenomDecimals>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.exchange.v1beta1.DenomDecimals, 3));
};


/**
 * @param {!Array<!proto.injective.exchange.v1beta1.DenomDecimals>} value
 * @return {!proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal} returns this
*/
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.prototype.setDenomDecimalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.injective.exchange.v1beta1.DenomDecimals=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.exchange.v1beta1.DenomDecimals}
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.prototype.addDenomDecimals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.injective.exchange.v1beta1.DenomDecimals, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal} returns this
 */
proto.injective.exchange.v1beta1.UpdateDenomDecimalsProposal.prototype.clearDenomDecimalsList = function() {
  return this.setDenomDecimalsList([]);
};


