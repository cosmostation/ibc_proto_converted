// source: osmosis/superfluid/query.proto
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

goog.provide('proto.osmosis.superfluid.AssetMultiplierResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.superfluid.OsmoEquivalentMultiplierRecord');

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
proto.osmosis.superfluid.AssetMultiplierResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.superfluid.AssetMultiplierResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.superfluid.AssetMultiplierResponse.displayName = 'proto.osmosis.superfluid.AssetMultiplierResponse';
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
proto.osmosis.superfluid.AssetMultiplierResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.superfluid.AssetMultiplierResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.superfluid.AssetMultiplierResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.AssetMultiplierResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    osmoEquivalentMultiplier: (f = msg.getOsmoEquivalentMultiplier()) && proto.osmosis.superfluid.OsmoEquivalentMultiplierRecord.toObject(includeInstance, f)
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
 * @return {!proto.osmosis.superfluid.AssetMultiplierResponse}
 */
proto.osmosis.superfluid.AssetMultiplierResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.superfluid.AssetMultiplierResponse;
  return proto.osmosis.superfluid.AssetMultiplierResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.superfluid.AssetMultiplierResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.superfluid.AssetMultiplierResponse}
 */
proto.osmosis.superfluid.AssetMultiplierResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.superfluid.OsmoEquivalentMultiplierRecord;
      reader.readMessage(value,proto.osmosis.superfluid.OsmoEquivalentMultiplierRecord.deserializeBinaryFromReader);
      msg.setOsmoEquivalentMultiplier(value);
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
proto.osmosis.superfluid.AssetMultiplierResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.superfluid.AssetMultiplierResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.superfluid.AssetMultiplierResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.superfluid.AssetMultiplierResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOsmoEquivalentMultiplier();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.osmosis.superfluid.OsmoEquivalentMultiplierRecord.serializeBinaryToWriter
    );
  }
};


/**
 * optional OsmoEquivalentMultiplierRecord osmo_equivalent_multiplier = 1;
 * @return {?proto.osmosis.superfluid.OsmoEquivalentMultiplierRecord}
 */
proto.osmosis.superfluid.AssetMultiplierResponse.prototype.getOsmoEquivalentMultiplier = function() {
  return /** @type{?proto.osmosis.superfluid.OsmoEquivalentMultiplierRecord} */ (
    jspb.Message.getWrapperField(this, proto.osmosis.superfluid.OsmoEquivalentMultiplierRecord, 1));
};


/**
 * @param {?proto.osmosis.superfluid.OsmoEquivalentMultiplierRecord|undefined} value
 * @return {!proto.osmosis.superfluid.AssetMultiplierResponse} returns this
*/
proto.osmosis.superfluid.AssetMultiplierResponse.prototype.setOsmoEquivalentMultiplier = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.osmosis.superfluid.AssetMultiplierResponse} returns this
 */
proto.osmosis.superfluid.AssetMultiplierResponse.prototype.clearOsmoEquivalentMultiplier = function() {
  return this.setOsmoEquivalentMultiplier(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.osmosis.superfluid.AssetMultiplierResponse.prototype.hasOsmoEquivalentMultiplier = function() {
  return jspb.Message.getField(this, 1) != null;
};


