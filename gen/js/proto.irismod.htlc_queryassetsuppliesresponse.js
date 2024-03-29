// source: irismod/htlc/query.proto
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

goog.provide('proto.irismod.htlc.QueryAssetSuppliesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.irismod.htlc.AssetSupply');

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
proto.irismod.htlc.QueryAssetSuppliesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.irismod.htlc.QueryAssetSuppliesResponse.repeatedFields_, null);
};
goog.inherits(proto.irismod.htlc.QueryAssetSuppliesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.irismod.htlc.QueryAssetSuppliesResponse.displayName = 'proto.irismod.htlc.QueryAssetSuppliesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.irismod.htlc.QueryAssetSuppliesResponse.repeatedFields_ = [1];



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
proto.irismod.htlc.QueryAssetSuppliesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.irismod.htlc.QueryAssetSuppliesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.irismod.htlc.QueryAssetSuppliesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.htlc.QueryAssetSuppliesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    assetSuppliesList: jspb.Message.toObjectList(msg.getAssetSuppliesList(),
    proto.irismod.htlc.AssetSupply.toObject, includeInstance)
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
 * @return {!proto.irismod.htlc.QueryAssetSuppliesResponse}
 */
proto.irismod.htlc.QueryAssetSuppliesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.irismod.htlc.QueryAssetSuppliesResponse;
  return proto.irismod.htlc.QueryAssetSuppliesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.irismod.htlc.QueryAssetSuppliesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.irismod.htlc.QueryAssetSuppliesResponse}
 */
proto.irismod.htlc.QueryAssetSuppliesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.irismod.htlc.AssetSupply;
      reader.readMessage(value,proto.irismod.htlc.AssetSupply.deserializeBinaryFromReader);
      msg.addAssetSupplies(value);
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
proto.irismod.htlc.QueryAssetSuppliesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.irismod.htlc.QueryAssetSuppliesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.irismod.htlc.QueryAssetSuppliesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.irismod.htlc.QueryAssetSuppliesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAssetSuppliesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.irismod.htlc.AssetSupply.serializeBinaryToWriter
    );
  }
};


/**
 * repeated AssetSupply asset_supplies = 1;
 * @return {!Array<!proto.irismod.htlc.AssetSupply>}
 */
proto.irismod.htlc.QueryAssetSuppliesResponse.prototype.getAssetSuppliesList = function() {
  return /** @type{!Array<!proto.irismod.htlc.AssetSupply>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.irismod.htlc.AssetSupply, 1));
};


/**
 * @param {!Array<!proto.irismod.htlc.AssetSupply>} value
 * @return {!proto.irismod.htlc.QueryAssetSuppliesResponse} returns this
*/
proto.irismod.htlc.QueryAssetSuppliesResponse.prototype.setAssetSuppliesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.irismod.htlc.AssetSupply=} opt_value
 * @param {number=} opt_index
 * @return {!proto.irismod.htlc.AssetSupply}
 */
proto.irismod.htlc.QueryAssetSuppliesResponse.prototype.addAssetSupplies = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.irismod.htlc.AssetSupply, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.irismod.htlc.QueryAssetSuppliesResponse} returns this
 */
proto.irismod.htlc.QueryAssetSuppliesResponse.prototype.clearAssetSuppliesList = function() {
  return this.setAssetSuppliesList([]);
};


