// source: injective/oracle/v1beta1/oracle.proto
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

goog.provide('proto.injective.oracle.v1beta1.ProviderState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.injective.oracle.v1beta1.ProviderInfo');
goog.require('proto.injective.oracle.v1beta1.ProviderPriceState');

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
proto.injective.oracle.v1beta1.ProviderState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.oracle.v1beta1.ProviderState.repeatedFields_, null);
};
goog.inherits(proto.injective.oracle.v1beta1.ProviderState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.oracle.v1beta1.ProviderState.displayName = 'proto.injective.oracle.v1beta1.ProviderState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.oracle.v1beta1.ProviderState.repeatedFields_ = [2];



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
proto.injective.oracle.v1beta1.ProviderState.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.oracle.v1beta1.ProviderState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.oracle.v1beta1.ProviderState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.ProviderState.toObject = function(includeInstance, msg) {
  var f, obj = {
    providerInfo: (f = msg.getProviderInfo()) && proto.injective.oracle.v1beta1.ProviderInfo.toObject(includeInstance, f),
    providerPriceStatesList: jspb.Message.toObjectList(msg.getProviderPriceStatesList(),
    proto.injective.oracle.v1beta1.ProviderPriceState.toObject, includeInstance)
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
 * @return {!proto.injective.oracle.v1beta1.ProviderState}
 */
proto.injective.oracle.v1beta1.ProviderState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.oracle.v1beta1.ProviderState;
  return proto.injective.oracle.v1beta1.ProviderState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.oracle.v1beta1.ProviderState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.oracle.v1beta1.ProviderState}
 */
proto.injective.oracle.v1beta1.ProviderState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.injective.oracle.v1beta1.ProviderInfo;
      reader.readMessage(value,proto.injective.oracle.v1beta1.ProviderInfo.deserializeBinaryFromReader);
      msg.setProviderInfo(value);
      break;
    case 2:
      var value = new proto.injective.oracle.v1beta1.ProviderPriceState;
      reader.readMessage(value,proto.injective.oracle.v1beta1.ProviderPriceState.deserializeBinaryFromReader);
      msg.addProviderPriceStates(value);
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
proto.injective.oracle.v1beta1.ProviderState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.oracle.v1beta1.ProviderState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.oracle.v1beta1.ProviderState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.oracle.v1beta1.ProviderState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProviderInfo();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.injective.oracle.v1beta1.ProviderInfo.serializeBinaryToWriter
    );
  }
  f = message.getProviderPriceStatesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.injective.oracle.v1beta1.ProviderPriceState.serializeBinaryToWriter
    );
  }
};


/**
 * optional ProviderInfo provider_info = 1;
 * @return {?proto.injective.oracle.v1beta1.ProviderInfo}
 */
proto.injective.oracle.v1beta1.ProviderState.prototype.getProviderInfo = function() {
  return /** @type{?proto.injective.oracle.v1beta1.ProviderInfo} */ (
    jspb.Message.getWrapperField(this, proto.injective.oracle.v1beta1.ProviderInfo, 1));
};


/**
 * @param {?proto.injective.oracle.v1beta1.ProviderInfo|undefined} value
 * @return {!proto.injective.oracle.v1beta1.ProviderState} returns this
*/
proto.injective.oracle.v1beta1.ProviderState.prototype.setProviderInfo = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.oracle.v1beta1.ProviderState} returns this
 */
proto.injective.oracle.v1beta1.ProviderState.prototype.clearProviderInfo = function() {
  return this.setProviderInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.oracle.v1beta1.ProviderState.prototype.hasProviderInfo = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated ProviderPriceState provider_price_states = 2;
 * @return {!Array<!proto.injective.oracle.v1beta1.ProviderPriceState>}
 */
proto.injective.oracle.v1beta1.ProviderState.prototype.getProviderPriceStatesList = function() {
  return /** @type{!Array<!proto.injective.oracle.v1beta1.ProviderPriceState>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.injective.oracle.v1beta1.ProviderPriceState, 2));
};


/**
 * @param {!Array<!proto.injective.oracle.v1beta1.ProviderPriceState>} value
 * @return {!proto.injective.oracle.v1beta1.ProviderState} returns this
*/
proto.injective.oracle.v1beta1.ProviderState.prototype.setProviderPriceStatesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.injective.oracle.v1beta1.ProviderPriceState=} opt_value
 * @param {number=} opt_index
 * @return {!proto.injective.oracle.v1beta1.ProviderPriceState}
 */
proto.injective.oracle.v1beta1.ProviderState.prototype.addProviderPriceStates = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.injective.oracle.v1beta1.ProviderPriceState, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.oracle.v1beta1.ProviderState} returns this
 */
proto.injective.oracle.v1beta1.ProviderState.prototype.clearProviderPriceStatesList = function() {
  return this.setProviderPriceStatesList([]);
};


