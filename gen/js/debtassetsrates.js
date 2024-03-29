// source: comdex/esm/v1beta1/esm.proto
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

goog.provide('proto.comdex.esm.v1beta1.DebtAssetsRates');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.comdex.esm.v1beta1.DebtAssetsRates = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.comdex.esm.v1beta1.DebtAssetsRates, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.esm.v1beta1.DebtAssetsRates.displayName = 'proto.comdex.esm.v1beta1.DebtAssetsRates';
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
proto.comdex.esm.v1beta1.DebtAssetsRates.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.esm.v1beta1.DebtAssetsRates.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.esm.v1beta1.DebtAssetsRates} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.esm.v1beta1.DebtAssetsRates.toObject = function(includeInstance, msg) {
  var f, obj = {
    assetId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    rates: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.comdex.esm.v1beta1.DebtAssetsRates}
 */
proto.comdex.esm.v1beta1.DebtAssetsRates.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.esm.v1beta1.DebtAssetsRates;
  return proto.comdex.esm.v1beta1.DebtAssetsRates.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.esm.v1beta1.DebtAssetsRates} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.esm.v1beta1.DebtAssetsRates}
 */
proto.comdex.esm.v1beta1.DebtAssetsRates.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAssetId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRates(value);
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
proto.comdex.esm.v1beta1.DebtAssetsRates.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.esm.v1beta1.DebtAssetsRates.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.esm.v1beta1.DebtAssetsRates} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.esm.v1beta1.DebtAssetsRates.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAssetId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getRates();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
};


/**
 * optional uint64 asset_id = 1;
 * @return {number}
 */
proto.comdex.esm.v1beta1.DebtAssetsRates.prototype.getAssetId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.esm.v1beta1.DebtAssetsRates} returns this
 */
proto.comdex.esm.v1beta1.DebtAssetsRates.prototype.setAssetId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 rates = 2;
 * @return {number}
 */
proto.comdex.esm.v1beta1.DebtAssetsRates.prototype.getRates = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.comdex.esm.v1beta1.DebtAssetsRates} returns this
 */
proto.comdex.esm.v1beta1.DebtAssetsRates.prototype.setRates = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


