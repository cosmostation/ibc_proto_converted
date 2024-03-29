// source: evmos/erc20/v1/erc20.proto
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

goog.provide('proto.evmos.erc20.v1.RegisterCoinProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.bank.v1beta1.Metadata');

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
proto.evmos.erc20.v1.RegisterCoinProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.evmos.erc20.v1.RegisterCoinProposal.repeatedFields_, null);
};
goog.inherits(proto.evmos.erc20.v1.RegisterCoinProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.evmos.erc20.v1.RegisterCoinProposal.displayName = 'proto.evmos.erc20.v1.RegisterCoinProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.evmos.erc20.v1.RegisterCoinProposal.repeatedFields_ = [3];



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
proto.evmos.erc20.v1.RegisterCoinProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.evmos.erc20.v1.RegisterCoinProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.evmos.erc20.v1.RegisterCoinProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.evmos.erc20.v1.RegisterCoinProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    metadataList: jspb.Message.toObjectList(msg.getMetadataList(),
    proto.cosmos.bank.v1beta1.Metadata.toObject, includeInstance)
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
 * @return {!proto.evmos.erc20.v1.RegisterCoinProposal}
 */
proto.evmos.erc20.v1.RegisterCoinProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.evmos.erc20.v1.RegisterCoinProposal;
  return proto.evmos.erc20.v1.RegisterCoinProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.evmos.erc20.v1.RegisterCoinProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.evmos.erc20.v1.RegisterCoinProposal}
 */
proto.evmos.erc20.v1.RegisterCoinProposal.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.cosmos.bank.v1beta1.Metadata;
      reader.readMessage(value,proto.cosmos.bank.v1beta1.Metadata.deserializeBinaryFromReader);
      msg.addMetadata(value);
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
proto.evmos.erc20.v1.RegisterCoinProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.evmos.erc20.v1.RegisterCoinProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.evmos.erc20.v1.RegisterCoinProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.evmos.erc20.v1.RegisterCoinProposal.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getMetadataList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.bank.v1beta1.Metadata.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.evmos.erc20.v1.RegisterCoinProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.evmos.erc20.v1.RegisterCoinProposal} returns this
 */
proto.evmos.erc20.v1.RegisterCoinProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.evmos.erc20.v1.RegisterCoinProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.evmos.erc20.v1.RegisterCoinProposal} returns this
 */
proto.evmos.erc20.v1.RegisterCoinProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated cosmos.bank.v1beta1.Metadata metadata = 3;
 * @return {!Array<!proto.cosmos.bank.v1beta1.Metadata>}
 */
proto.evmos.erc20.v1.RegisterCoinProposal.prototype.getMetadataList = function() {
  return /** @type{!Array<!proto.cosmos.bank.v1beta1.Metadata>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.bank.v1beta1.Metadata, 3));
};


/**
 * @param {!Array<!proto.cosmos.bank.v1beta1.Metadata>} value
 * @return {!proto.evmos.erc20.v1.RegisterCoinProposal} returns this
*/
proto.evmos.erc20.v1.RegisterCoinProposal.prototype.setMetadataList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.bank.v1beta1.Metadata=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.bank.v1beta1.Metadata}
 */
proto.evmos.erc20.v1.RegisterCoinProposal.prototype.addMetadata = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.bank.v1beta1.Metadata, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.evmos.erc20.v1.RegisterCoinProposal} returns this
 */
proto.evmos.erc20.v1.RegisterCoinProposal.prototype.clearMetadataList = function() {
  return this.setMetadataList([]);
};


