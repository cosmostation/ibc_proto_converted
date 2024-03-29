// source: injective/exchange/v1beta1/exchange.proto
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

goog.provide('proto.injective.exchange.v1beta1.SubaccountPosition');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.exchange.v1beta1.Position');

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
proto.injective.exchange.v1beta1.SubaccountPosition = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.SubaccountPosition, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.SubaccountPosition.displayName = 'proto.injective.exchange.v1beta1.SubaccountPosition';
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
proto.injective.exchange.v1beta1.SubaccountPosition.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.SubaccountPosition.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.SubaccountPosition} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.SubaccountPosition.toObject = function(includeInstance, msg) {
  var f, obj = {
    position: (f = msg.getPosition()) && proto.injective.exchange.v1beta1.Position.toObject(includeInstance, f),
    subaccountId: msg.getSubaccountId_asB64()
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
 * @return {!proto.injective.exchange.v1beta1.SubaccountPosition}
 */
proto.injective.exchange.v1beta1.SubaccountPosition.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.SubaccountPosition;
  return proto.injective.exchange.v1beta1.SubaccountPosition.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.SubaccountPosition} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.SubaccountPosition}
 */
proto.injective.exchange.v1beta1.SubaccountPosition.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.injective.exchange.v1beta1.Position;
      reader.readMessage(value,proto.injective.exchange.v1beta1.Position.deserializeBinaryFromReader);
      msg.setPosition(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setSubaccountId(value);
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
proto.injective.exchange.v1beta1.SubaccountPosition.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.SubaccountPosition.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.SubaccountPosition} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.SubaccountPosition.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPosition();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.injective.exchange.v1beta1.Position.serializeBinaryToWriter
    );
  }
  f = message.getSubaccountId_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
};


/**
 * optional Position position = 1;
 * @return {?proto.injective.exchange.v1beta1.Position}
 */
proto.injective.exchange.v1beta1.SubaccountPosition.prototype.getPosition = function() {
  return /** @type{?proto.injective.exchange.v1beta1.Position} */ (
    jspb.Message.getWrapperField(this, proto.injective.exchange.v1beta1.Position, 1));
};


/**
 * @param {?proto.injective.exchange.v1beta1.Position|undefined} value
 * @return {!proto.injective.exchange.v1beta1.SubaccountPosition} returns this
*/
proto.injective.exchange.v1beta1.SubaccountPosition.prototype.setPosition = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.exchange.v1beta1.SubaccountPosition} returns this
 */
proto.injective.exchange.v1beta1.SubaccountPosition.prototype.clearPosition = function() {
  return this.setPosition(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.exchange.v1beta1.SubaccountPosition.prototype.hasPosition = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional bytes subaccount_id = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SubaccountPosition.prototype.getSubaccountId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes subaccount_id = 2;
 * This is a type-conversion wrapper around `getSubaccountId()`
 * @return {string}
 */
proto.injective.exchange.v1beta1.SubaccountPosition.prototype.getSubaccountId_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getSubaccountId()));
};


/**
 * optional bytes subaccount_id = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getSubaccountId()`
 * @return {!Uint8Array}
 */
proto.injective.exchange.v1beta1.SubaccountPosition.prototype.getSubaccountId_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getSubaccountId()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.injective.exchange.v1beta1.SubaccountPosition} returns this
 */
proto.injective.exchange.v1beta1.SubaccountPosition.prototype.setSubaccountId = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


