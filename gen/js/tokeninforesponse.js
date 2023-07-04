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

goog.provide('proto.axelar.evm.v1beta1.TokenInfoResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.evm.v1beta1.TokenDetails');

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
proto.axelar.evm.v1beta1.TokenInfoResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.evm.v1beta1.TokenInfoResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.TokenInfoResponse.displayName = 'proto.axelar.evm.v1beta1.TokenInfoResponse';
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
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.TokenInfoResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.TokenInfoResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    asset: jspb.Message.getFieldWithDefault(msg, 1, ""),
    details: (f = msg.getDetails()) && proto.axelar.evm.v1beta1.TokenDetails.toObject(includeInstance, f),
    address: jspb.Message.getFieldWithDefault(msg, 3, ""),
    confirmed: jspb.Message.getBooleanFieldWithDefault(msg, 4, false),
    isExternal: jspb.Message.getBooleanFieldWithDefault(msg, 5, false),
    burnerCodeHash: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.axelar.evm.v1beta1.TokenInfoResponse}
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.TokenInfoResponse;
  return proto.axelar.evm.v1beta1.TokenInfoResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.TokenInfoResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.TokenInfoResponse}
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAsset(value);
      break;
    case 2:
      var value = new proto.axelar.evm.v1beta1.TokenDetails;
      reader.readMessage(value,proto.axelar.evm.v1beta1.TokenDetails.deserializeBinaryFromReader);
      msg.setDetails(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 4:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setConfirmed(value);
      break;
    case 5:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setIsExternal(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setBurnerCodeHash(value);
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
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.TokenInfoResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.TokenInfoResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAsset();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDetails();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.axelar.evm.v1beta1.TokenDetails.serializeBinaryToWriter
    );
  }
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getConfirmed();
  if (f) {
    writer.writeBool(
      4,
      f
    );
  }
  f = message.getIsExternal();
  if (f) {
    writer.writeBool(
      5,
      f
    );
  }
  f = message.getBurnerCodeHash();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional string asset = 1;
 * @return {string}
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.getAsset = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.TokenInfoResponse} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.setAsset = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional TokenDetails details = 2;
 * @return {?proto.axelar.evm.v1beta1.TokenDetails}
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.getDetails = function() {
  return /** @type{?proto.axelar.evm.v1beta1.TokenDetails} */ (
    jspb.Message.getWrapperField(this, proto.axelar.evm.v1beta1.TokenDetails, 2));
};


/**
 * @param {?proto.axelar.evm.v1beta1.TokenDetails|undefined} value
 * @return {!proto.axelar.evm.v1beta1.TokenInfoResponse} returns this
*/
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.setDetails = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.evm.v1beta1.TokenInfoResponse} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.clearDetails = function() {
  return this.setDetails(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.hasDetails = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional string address = 3;
 * @return {string}
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.TokenInfoResponse} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional bool confirmed = 4;
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.getConfirmed = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 4, false));
};


/**
 * @param {boolean} value
 * @return {!proto.axelar.evm.v1beta1.TokenInfoResponse} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.setConfirmed = function(value) {
  return jspb.Message.setProto3BooleanField(this, 4, value);
};


/**
 * optional bool is_external = 5;
 * @return {boolean}
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.getIsExternal = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 5, false));
};


/**
 * @param {boolean} value
 * @return {!proto.axelar.evm.v1beta1.TokenInfoResponse} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.setIsExternal = function(value) {
  return jspb.Message.setProto3BooleanField(this, 5, value);
};


/**
 * optional string burner_code_hash = 6;
 * @return {string}
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.getBurnerCodeHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.axelar.evm.v1beta1.TokenInfoResponse} returns this
 */
proto.axelar.evm.v1beta1.TokenInfoResponse.prototype.setBurnerCodeHash = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};

