// source: stargaze/globalfee/v1/globalfee.proto
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

goog.provide('proto.publicawesome.stargaze.globalfee.v1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.DecCoin');

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
proto.publicawesome.stargaze.globalfee.v1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.publicawesome.stargaze.globalfee.v1.Params.repeatedFields_, null);
};
goog.inherits(proto.publicawesome.stargaze.globalfee.v1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.publicawesome.stargaze.globalfee.v1.Params.displayName = 'proto.publicawesome.stargaze.globalfee.v1.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.publicawesome.stargaze.globalfee.v1.Params.repeatedFields_ = [1,2];



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
proto.publicawesome.stargaze.globalfee.v1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.publicawesome.stargaze.globalfee.v1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.publicawesome.stargaze.globalfee.v1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.publicawesome.stargaze.globalfee.v1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    privilegedAddressesList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
    minimumGasPricesList: jspb.Message.toObjectList(msg.getMinimumGasPricesList(),
    proto.cosmos.base.v1beta1.DecCoin.toObject, includeInstance)
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
 * @return {!proto.publicawesome.stargaze.globalfee.v1.Params}
 */
proto.publicawesome.stargaze.globalfee.v1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.publicawesome.stargaze.globalfee.v1.Params;
  return proto.publicawesome.stargaze.globalfee.v1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.publicawesome.stargaze.globalfee.v1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.publicawesome.stargaze.globalfee.v1.Params}
 */
proto.publicawesome.stargaze.globalfee.v1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addPrivilegedAddresses(value);
      break;
    case 2:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.addMinimumGasPrices(value);
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
proto.publicawesome.stargaze.globalfee.v1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.publicawesome.stargaze.globalfee.v1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.publicawesome.stargaze.globalfee.v1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.publicawesome.stargaze.globalfee.v1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPrivilegedAddressesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
  f = message.getMinimumGasPricesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
};


/**
 * repeated string privileged_addresses = 1;
 * @return {!Array<string>}
 */
proto.publicawesome.stargaze.globalfee.v1.Params.prototype.getPrivilegedAddressesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.publicawesome.stargaze.globalfee.v1.Params} returns this
 */
proto.publicawesome.stargaze.globalfee.v1.Params.prototype.setPrivilegedAddressesList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.publicawesome.stargaze.globalfee.v1.Params} returns this
 */
proto.publicawesome.stargaze.globalfee.v1.Params.prototype.addPrivilegedAddresses = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.publicawesome.stargaze.globalfee.v1.Params} returns this
 */
proto.publicawesome.stargaze.globalfee.v1.Params.prototype.clearPrivilegedAddressesList = function() {
  return this.setPrivilegedAddressesList([]);
};


/**
 * repeated cosmos.base.v1beta1.DecCoin minimum_gas_prices = 2;
 * @return {!Array<!proto.cosmos.base.v1beta1.DecCoin>}
 */
proto.publicawesome.stargaze.globalfee.v1.Params.prototype.getMinimumGasPricesList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.DecCoin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.DecCoin>} value
 * @return {!proto.publicawesome.stargaze.globalfee.v1.Params} returns this
*/
proto.publicawesome.stargaze.globalfee.v1.Params.prototype.setMinimumGasPricesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.DecCoin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.DecCoin}
 */
proto.publicawesome.stargaze.globalfee.v1.Params.prototype.addMinimumGasPrices = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.v1beta1.DecCoin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.publicawesome.stargaze.globalfee.v1.Params} returns this
 */
proto.publicawesome.stargaze.globalfee.v1.Params.prototype.clearMinimumGasPricesList = function() {
  return this.setMinimumGasPricesList([]);
};

