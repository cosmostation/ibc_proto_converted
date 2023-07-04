// source: desmos/profiles/v3/models_packets.proto
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

goog.provide('proto.desmos.profiles.v3.LinkChainAccountPacketData');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.desmos.profiles.v3.ChainConfig');
goog.require('proto.desmos.profiles.v3.Proof');
goog.require('proto.google.protobuf.Any');

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
proto.desmos.profiles.v3.LinkChainAccountPacketData = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.profiles.v3.LinkChainAccountPacketData, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v3.LinkChainAccountPacketData.displayName = 'proto.desmos.profiles.v3.LinkChainAccountPacketData';
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
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v3.LinkChainAccountPacketData.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v3.LinkChainAccountPacketData} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.toObject = function(includeInstance, msg) {
  var f, obj = {
    sourceAddress: (f = msg.getSourceAddress()) && proto.google.protobuf.Any.toObject(includeInstance, f),
    sourceProof: (f = msg.getSourceProof()) && proto.desmos.profiles.v3.Proof.toObject(includeInstance, f),
    sourceChainConfig: (f = msg.getSourceChainConfig()) && proto.desmos.profiles.v3.ChainConfig.toObject(includeInstance, f),
    destinationAddress: jspb.Message.getFieldWithDefault(msg, 4, ""),
    destinationProof: (f = msg.getDestinationProof()) && proto.desmos.profiles.v3.Proof.toObject(includeInstance, f)
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
 * @return {!proto.desmos.profiles.v3.LinkChainAccountPacketData}
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v3.LinkChainAccountPacketData;
  return proto.desmos.profiles.v3.LinkChainAccountPacketData.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v3.LinkChainAccountPacketData} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v3.LinkChainAccountPacketData}
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setSourceAddress(value);
      break;
    case 2:
      var value = new proto.desmos.profiles.v3.Proof;
      reader.readMessage(value,proto.desmos.profiles.v3.Proof.deserializeBinaryFromReader);
      msg.setSourceProof(value);
      break;
    case 3:
      var value = new proto.desmos.profiles.v3.ChainConfig;
      reader.readMessage(value,proto.desmos.profiles.v3.ChainConfig.deserializeBinaryFromReader);
      msg.setSourceChainConfig(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setDestinationAddress(value);
      break;
    case 5:
      var value = new proto.desmos.profiles.v3.Proof;
      reader.readMessage(value,proto.desmos.profiles.v3.Proof.deserializeBinaryFromReader);
      msg.setDestinationProof(value);
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
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v3.LinkChainAccountPacketData.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v3.LinkChainAccountPacketData} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSourceAddress();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getSourceProof();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.desmos.profiles.v3.Proof.serializeBinaryToWriter
    );
  }
  f = message.getSourceChainConfig();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.desmos.profiles.v3.ChainConfig.serializeBinaryToWriter
    );
  }
  f = message.getDestinationAddress();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getDestinationProof();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.desmos.profiles.v3.Proof.serializeBinaryToWriter
    );
  }
};


/**
 * optional google.protobuf.Any source_address = 1;
 * @return {?proto.google.protobuf.Any}
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.getSourceAddress = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 1));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.desmos.profiles.v3.LinkChainAccountPacketData} returns this
*/
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.setSourceAddress = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v3.LinkChainAccountPacketData} returns this
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.clearSourceAddress = function() {
  return this.setSourceAddress(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.hasSourceAddress = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Proof source_proof = 2;
 * @return {?proto.desmos.profiles.v3.Proof}
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.getSourceProof = function() {
  return /** @type{?proto.desmos.profiles.v3.Proof} */ (
    jspb.Message.getWrapperField(this, proto.desmos.profiles.v3.Proof, 2));
};


/**
 * @param {?proto.desmos.profiles.v3.Proof|undefined} value
 * @return {!proto.desmos.profiles.v3.LinkChainAccountPacketData} returns this
*/
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.setSourceProof = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v3.LinkChainAccountPacketData} returns this
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.clearSourceProof = function() {
  return this.setSourceProof(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.hasSourceProof = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional ChainConfig source_chain_config = 3;
 * @return {?proto.desmos.profiles.v3.ChainConfig}
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.getSourceChainConfig = function() {
  return /** @type{?proto.desmos.profiles.v3.ChainConfig} */ (
    jspb.Message.getWrapperField(this, proto.desmos.profiles.v3.ChainConfig, 3));
};


/**
 * @param {?proto.desmos.profiles.v3.ChainConfig|undefined} value
 * @return {!proto.desmos.profiles.v3.LinkChainAccountPacketData} returns this
*/
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.setSourceChainConfig = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v3.LinkChainAccountPacketData} returns this
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.clearSourceChainConfig = function() {
  return this.setSourceChainConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.hasSourceChainConfig = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string destination_address = 4;
 * @return {string}
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.getDestinationAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v3.LinkChainAccountPacketData} returns this
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.setDestinationAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional Proof destination_proof = 5;
 * @return {?proto.desmos.profiles.v3.Proof}
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.getDestinationProof = function() {
  return /** @type{?proto.desmos.profiles.v3.Proof} */ (
    jspb.Message.getWrapperField(this, proto.desmos.profiles.v3.Proof, 5));
};


/**
 * @param {?proto.desmos.profiles.v3.Proof|undefined} value
 * @return {!proto.desmos.profiles.v3.LinkChainAccountPacketData} returns this
*/
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.setDestinationProof = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v3.LinkChainAccountPacketData} returns this
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.clearDestinationProof = function() {
  return this.setDestinationProof(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v3.LinkChainAccountPacketData.prototype.hasDestinationProof = function() {
  return jspb.Message.getField(this, 5) != null;
};

