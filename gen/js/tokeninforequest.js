// source: axelar/evm/v1beta1/query.proto
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

goog.provide('proto.axelar.evm.v1beta1.TokenInfoRequest');
goog.provide('proto.axelar.evm.v1beta1.TokenInfoRequest.FindByCase');

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
proto.axelar.evm.v1beta1.TokenInfoRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.axelar.evm.v1beta1.TokenInfoRequest.oneofGroups_);
};
goog.inherits(proto.axelar.evm.v1beta1.TokenInfoRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.TokenInfoRequest.displayName = 'proto.axelar.evm.v1beta1.TokenInfoRequest';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.oneofGroups_ = [[2,3,4]];

/**
 * @enum {number}
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.FindByCase = {
  FIND_BY_NOT_SET: 0,
  ASSET: 2,
  SYMBOL: 3,
  ADDRESS: 4
};

/**
 * @return {proto.axelar.evm.v1beta1.TokenInfoRequest.FindByCase}
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.getFindByCase = function() {
  return /** @type {proto.axelar.evm.v1beta1.TokenInfoRequest.FindByCase} */(jspb.Message.computeOneofCase(this, proto.axelar.evm.v1beta1.TokenInfoRequest.oneofGroups_[0]));
};



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
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.TokenInfoRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.TokenInfoRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    chain: jspb.Message.getFieldWithDefault(msg, 1, ""),
    asset: jspb.Message.getFieldWithDefault(msg, 2, ""),
    symbol: jspb.Message.getFieldWithDefault(msg, 3, ""),
    address: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.axelar.evm.v1beta1.TokenInfoRequest}
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.TokenInfoRequest;
  return proto.axelar.evm.v1beta1.TokenInfoRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.TokenInfoRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.TokenInfoRequest}
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setChain(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAsset(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSymbol(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
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
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.TokenInfoRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.TokenInfoRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChain();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 2));
  if (f != null) {
    writer.writeString(
      2,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 3));
  if (f != null) {
    writer.writeString(
      3,
      f
    );
  }
  f = /** @type {string} */ (jspb.Message.getField(message, 4));
  if (f != null) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string chain = 1;
 * @return {string}
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.getChain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.TokenInfoRequest} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.setChain = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string asset = 2;
 * @return {string}
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.getAsset = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.TokenInfoRequest} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.setAsset = function(value) {
  return jspb.Message.setOneofField(this, 2, proto.axelar.evm.v1beta1.TokenInfoRequest.oneofGroups_[0], value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.axelar.evm.v1beta1.TokenInfoRequest} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.clearAsset = function() {
  return jspb.Message.setOneofField(this, 2, proto.axelar.evm.v1beta1.TokenInfoRequest.oneofGroups_[0], undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.hasAsset = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional string symbol = 3;
 * @return {string}
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.getSymbol = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.TokenInfoRequest} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.setSymbol = function(value) {
  return jspb.Message.setOneofField(this, 3, proto.axelar.evm.v1beta1.TokenInfoRequest.oneofGroups_[0], value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.axelar.evm.v1beta1.TokenInfoRequest} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.clearSymbol = function() {
  return jspb.Message.setOneofField(this, 3, proto.axelar.evm.v1beta1.TokenInfoRequest.oneofGroups_[0], undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.hasSymbol = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional string address = 4;
 * @return {string}
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.TokenInfoRequest} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.setAddress = function(value) {
  return jspb.Message.setOneofField(this, 4, proto.axelar.evm.v1beta1.TokenInfoRequest.oneofGroups_[0], value);
};


/**
 * Clears the field making it undefined.
 * @return {!proto.axelar.evm.v1beta1.TokenInfoRequest} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.clearAddress = function() {
  return jspb.Message.setOneofField(this, 4, proto.axelar.evm.v1beta1.TokenInfoRequest.oneofGroups_[0], undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.TokenInfoRequest.prototype.hasAddress = function() {
  return jspb.Message.getField(this, 4) != null;
};


