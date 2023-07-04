// source: cudos/nft/nft.proto
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

goog.provide('proto.cudosnode.cudosnode.nft.BaseNFT');

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
proto.cudosnode.cudosnode.nft.BaseNFT = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cudosnode.cudosnode.nft.BaseNFT.repeatedFields_, null);
};
goog.inherits(proto.cudosnode.cudosnode.nft.BaseNFT, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cudosnode.cudosnode.nft.BaseNFT.displayName = 'proto.cudosnode.cudosnode.nft.BaseNFT';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cudosnode.cudosnode.nft.BaseNFT.repeatedFields_ = [6];



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
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.toObject = function(opt_includeInstance) {
  return proto.cudosnode.cudosnode.nft.BaseNFT.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cudosnode.cudosnode.nft.BaseNFT} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.BaseNFT.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, ""),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    uri: jspb.Message.getFieldWithDefault(msg, 3, ""),
    data: jspb.Message.getFieldWithDefault(msg, 4, ""),
    owner: jspb.Message.getFieldWithDefault(msg, 5, ""),
    approvedaddressesList: (f = jspb.Message.getRepeatedField(msg, 6)) == null ? undefined : f
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
 * @return {!proto.cudosnode.cudosnode.nft.BaseNFT}
 */
proto.cudosnode.cudosnode.nft.BaseNFT.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cudosnode.cudosnode.nft.BaseNFT;
  return proto.cudosnode.cudosnode.nft.BaseNFT.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cudosnode.cudosnode.nft.BaseNFT} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cudosnode.cudosnode.nft.BaseNFT}
 */
proto.cudosnode.cudosnode.nft.BaseNFT.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setUri(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setData(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.addApprovedaddresses(value);
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
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cudosnode.cudosnode.nft.BaseNFT.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cudosnode.cudosnode.nft.BaseNFT} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.BaseNFT.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getUri();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getData();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getApprovedaddressesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      6,
      f
    );
  }
};


/**
 * optional string id = 1;
 * @return {string}
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.getId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudosnode.cudosnode.nft.BaseNFT} returns this
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.setId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudosnode.cudosnode.nft.BaseNFT} returns this
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string uri = 3;
 * @return {string}
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.getUri = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudosnode.cudosnode.nft.BaseNFT} returns this
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.setUri = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string data = 4;
 * @return {string}
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.getData = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudosnode.cudosnode.nft.BaseNFT} returns this
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.setData = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string owner = 5;
 * @return {string}
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudosnode.cudosnode.nft.BaseNFT} returns this
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * repeated string approvedAddresses = 6;
 * @return {!Array<string>}
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.getApprovedaddressesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 6));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cudosnode.cudosnode.nft.BaseNFT} returns this
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.setApprovedaddressesList = function(value) {
  return jspb.Message.setField(this, 6, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cudosnode.cudosnode.nft.BaseNFT} returns this
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.addApprovedaddresses = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 6, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cudosnode.cudosnode.nft.BaseNFT} returns this
 */
proto.cudosnode.cudosnode.nft.BaseNFT.prototype.clearApprovedaddressesList = function() {
  return this.setApprovedaddressesList([]);
};

