// source: axelar/axelarnet/v1beta1/types.proto
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

goog.provide('proto.axelar.axelarnet.v1beta1.CosmosChain');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.axelarnet.v1beta1.Asset');

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
proto.axelar.axelarnet.v1beta1.CosmosChain = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.axelarnet.v1beta1.CosmosChain.repeatedFields_, null);
};
goog.inherits(proto.axelar.axelarnet.v1beta1.CosmosChain, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.axelarnet.v1beta1.CosmosChain.displayName = 'proto.axelar.axelarnet.v1beta1.CosmosChain';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.repeatedFields_ = [3];



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
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.axelarnet.v1beta1.CosmosChain.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.axelarnet.v1beta1.CosmosChain} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.toObject = function(includeInstance, msg) {
  var f, obj = {
    name: jspb.Message.getFieldWithDefault(msg, 1, ""),
    ibcPath: jspb.Message.getFieldWithDefault(msg, 2, ""),
    assetsList: jspb.Message.toObjectList(msg.getAssetsList(),
    proto.axelar.axelarnet.v1beta1.Asset.toObject, includeInstance),
    addrPrefix: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.axelar.axelarnet.v1beta1.CosmosChain}
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.axelarnet.v1beta1.CosmosChain;
  return proto.axelar.axelarnet.v1beta1.CosmosChain.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.axelarnet.v1beta1.CosmosChain} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.axelarnet.v1beta1.CosmosChain}
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setIbcPath(value);
      break;
    case 3:
      var value = new proto.axelar.axelarnet.v1beta1.Asset;
      reader.readMessage(value,proto.axelar.axelarnet.v1beta1.Asset.deserializeBinaryFromReader);
      msg.addAssets(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddrPrefix(value);
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
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.axelarnet.v1beta1.CosmosChain.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.axelarnet.v1beta1.CosmosChain} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getIbcPath();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAssetsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.axelar.axelarnet.v1beta1.Asset.serializeBinaryToWriter
    );
  }
  f = message.getAddrPrefix();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string name = 1;
 * @return {string}
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.axelarnet.v1beta1.CosmosChain} returns this
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string ibc_path = 2;
 * @return {string}
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.getIbcPath = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.axelarnet.v1beta1.CosmosChain} returns this
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.setIbcPath = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated Asset assets = 3;
 * @return {!Array<!proto.axelar.axelarnet.v1beta1.Asset>}
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.getAssetsList = function() {
  return /** @type{!Array<!proto.axelar.axelarnet.v1beta1.Asset>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.axelarnet.v1beta1.Asset, 3));
};


/**
 * @param {!Array<!proto.axelar.axelarnet.v1beta1.Asset>} value
 * @return {!proto.axelar.axelarnet.v1beta1.CosmosChain} returns this
*/
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.setAssetsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.axelar.axelarnet.v1beta1.Asset=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.axelarnet.v1beta1.Asset}
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.addAssets = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.axelar.axelarnet.v1beta1.Asset, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.axelarnet.v1beta1.CosmosChain} returns this
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.clearAssetsList = function() {
  return this.setAssetsList([]);
};


/**
 * optional string addr_prefix = 4;
 * @return {string}
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.getAddrPrefix = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.axelarnet.v1beta1.CosmosChain} returns this
 */
proto.axelar.axelarnet.v1beta1.CosmosChain.prototype.setAddrPrefix = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};

