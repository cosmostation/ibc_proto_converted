// source: stride/stakeibc/query.proto
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

goog.provide('proto.stride.stakeibc.QueryAddressUnbondingsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stride.stakeibc.AddressUnbonding');

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
proto.stride.stakeibc.QueryAddressUnbondingsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.stride.stakeibc.QueryAddressUnbondingsResponse.repeatedFields_, null);
};
goog.inherits(proto.stride.stakeibc.QueryAddressUnbondingsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.stakeibc.QueryAddressUnbondingsResponse.displayName = 'proto.stride.stakeibc.QueryAddressUnbondingsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.stride.stakeibc.QueryAddressUnbondingsResponse.repeatedFields_ = [1];



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
proto.stride.stakeibc.QueryAddressUnbondingsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.stakeibc.QueryAddressUnbondingsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.stakeibc.QueryAddressUnbondingsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.stakeibc.QueryAddressUnbondingsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    addressUnbondingsList: jspb.Message.toObjectList(msg.getAddressUnbondingsList(),
    proto.stride.stakeibc.AddressUnbonding.toObject, includeInstance)
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
 * @return {!proto.stride.stakeibc.QueryAddressUnbondingsResponse}
 */
proto.stride.stakeibc.QueryAddressUnbondingsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.stakeibc.QueryAddressUnbondingsResponse;
  return proto.stride.stakeibc.QueryAddressUnbondingsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.stakeibc.QueryAddressUnbondingsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.stakeibc.QueryAddressUnbondingsResponse}
 */
proto.stride.stakeibc.QueryAddressUnbondingsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stride.stakeibc.AddressUnbonding;
      reader.readMessage(value,proto.stride.stakeibc.AddressUnbonding.deserializeBinaryFromReader);
      msg.addAddressUnbondings(value);
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
proto.stride.stakeibc.QueryAddressUnbondingsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.stakeibc.QueryAddressUnbondingsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.stakeibc.QueryAddressUnbondingsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.stakeibc.QueryAddressUnbondingsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAddressUnbondingsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.stride.stakeibc.AddressUnbonding.serializeBinaryToWriter
    );
  }
};


/**
 * repeated AddressUnbonding address_unbondings = 1;
 * @return {!Array<!proto.stride.stakeibc.AddressUnbonding>}
 */
proto.stride.stakeibc.QueryAddressUnbondingsResponse.prototype.getAddressUnbondingsList = function() {
  return /** @type{!Array<!proto.stride.stakeibc.AddressUnbonding>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.stride.stakeibc.AddressUnbonding, 1));
};


/**
 * @param {!Array<!proto.stride.stakeibc.AddressUnbonding>} value
 * @return {!proto.stride.stakeibc.QueryAddressUnbondingsResponse} returns this
*/
proto.stride.stakeibc.QueryAddressUnbondingsResponse.prototype.setAddressUnbondingsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.stride.stakeibc.AddressUnbonding=} opt_value
 * @param {number=} opt_index
 * @return {!proto.stride.stakeibc.AddressUnbonding}
 */
proto.stride.stakeibc.QueryAddressUnbondingsResponse.prototype.addAddressUnbondings = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.stride.stakeibc.AddressUnbonding, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.stride.stakeibc.QueryAddressUnbondingsResponse} returns this
 */
proto.stride.stakeibc.QueryAddressUnbondingsResponse.prototype.clearAddressUnbondingsList = function() {
  return this.setAddressUnbondingsList([]);
};

