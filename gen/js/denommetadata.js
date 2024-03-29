// source: OmniFlix/onft/v1beta1/onft.proto
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

goog.provide('proto.OmniFlix.onft.v1beta1.DenomMetadata');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.OmniFlix.onft.v1beta1.WeightedAddress');

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
proto.OmniFlix.onft.v1beta1.DenomMetadata = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.OmniFlix.onft.v1beta1.DenomMetadata.repeatedFields_, null);
};
goog.inherits(proto.OmniFlix.onft.v1beta1.DenomMetadata, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.OmniFlix.onft.v1beta1.DenomMetadata.displayName = 'proto.OmniFlix.onft.v1beta1.DenomMetadata';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.repeatedFields_ = [7];



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
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.toObject = function(opt_includeInstance) {
  return proto.OmniFlix.onft.v1beta1.DenomMetadata.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.OmniFlix.onft.v1beta1.DenomMetadata} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.toObject = function(includeInstance, msg) {
  var f, obj = {
    creator: jspb.Message.getFieldWithDefault(msg, 1, ""),
    schema: jspb.Message.getFieldWithDefault(msg, 2, ""),
    description: jspb.Message.getFieldWithDefault(msg, 3, ""),
    previewUri: jspb.Message.getFieldWithDefault(msg, 4, ""),
    data: jspb.Message.getFieldWithDefault(msg, 5, ""),
    uriHash: jspb.Message.getFieldWithDefault(msg, 6, ""),
    royaltyReceiversList: jspb.Message.toObjectList(msg.getRoyaltyReceiversList(),
    proto.OmniFlix.onft.v1beta1.WeightedAddress.toObject, includeInstance)
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
 * @return {!proto.OmniFlix.onft.v1beta1.DenomMetadata}
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.OmniFlix.onft.v1beta1.DenomMetadata;
  return proto.OmniFlix.onft.v1beta1.DenomMetadata.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.OmniFlix.onft.v1beta1.DenomMetadata} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.OmniFlix.onft.v1beta1.DenomMetadata}
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setSchema(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setPreviewUri(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setData(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setUriHash(value);
      break;
    case 7:
      var value = new proto.OmniFlix.onft.v1beta1.WeightedAddress;
      reader.readMessage(value,proto.OmniFlix.onft.v1beta1.WeightedAddress.deserializeBinaryFromReader);
      msg.addRoyaltyReceivers(value);
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
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.OmniFlix.onft.v1beta1.DenomMetadata.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.OmniFlix.onft.v1beta1.DenomMetadata} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getSchema();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPreviewUri();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getData();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getUriHash();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getRoyaltyReceiversList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.OmniFlix.onft.v1beta1.WeightedAddress.serializeBinaryToWriter
    );
  }
};


/**
 * optional string creator = 1;
 * @return {string}
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.onft.v1beta1.DenomMetadata} returns this
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string schema = 2;
 * @return {string}
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.getSchema = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.onft.v1beta1.DenomMetadata} returns this
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.setSchema = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string description = 3;
 * @return {string}
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.onft.v1beta1.DenomMetadata} returns this
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string preview_uri = 4;
 * @return {string}
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.getPreviewUri = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.onft.v1beta1.DenomMetadata} returns this
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.setPreviewUri = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string data = 5;
 * @return {string}
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.getData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.onft.v1beta1.DenomMetadata} returns this
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.setData = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string uri_hash = 6;
 * @return {string}
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.getUriHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.OmniFlix.onft.v1beta1.DenomMetadata} returns this
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.setUriHash = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * repeated WeightedAddress royalty_receivers = 7;
 * @return {!Array<!proto.OmniFlix.onft.v1beta1.WeightedAddress>}
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.getRoyaltyReceiversList = function() {
  return /** @type{!Array<!proto.OmniFlix.onft.v1beta1.WeightedAddress>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.OmniFlix.onft.v1beta1.WeightedAddress, 7));
};


/**
 * @param {!Array<!proto.OmniFlix.onft.v1beta1.WeightedAddress>} value
 * @return {!proto.OmniFlix.onft.v1beta1.DenomMetadata} returns this
*/
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.setRoyaltyReceiversList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.OmniFlix.onft.v1beta1.WeightedAddress=} opt_value
 * @param {number=} opt_index
 * @return {!proto.OmniFlix.onft.v1beta1.WeightedAddress}
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.addRoyaltyReceivers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.OmniFlix.onft.v1beta1.WeightedAddress, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.OmniFlix.onft.v1beta1.DenomMetadata} returns this
 */
proto.OmniFlix.onft.v1beta1.DenomMetadata.prototype.clearRoyaltyReceiversList = function() {
  return this.setRoyaltyReceiversList([]);
};


