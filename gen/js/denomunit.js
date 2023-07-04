// source: cosmos/bank/v1beta1/bank.proto
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

goog.provide('proto.cosmos.bank.v1beta1.DenomUnit');

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
proto.cosmos.bank.v1beta1.DenomUnit = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.bank.v1beta1.DenomUnit.repeatedFields_, null);
};
goog.inherits(proto.cosmos.bank.v1beta1.DenomUnit, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.bank.v1beta1.DenomUnit.displayName = 'proto.cosmos.bank.v1beta1.DenomUnit';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.bank.v1beta1.DenomUnit.repeatedFields_ = [3];



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
proto.cosmos.bank.v1beta1.DenomUnit.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.bank.v1beta1.DenomUnit.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.bank.v1beta1.DenomUnit} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.bank.v1beta1.DenomUnit.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    exponent: jspb.Message.getFieldWithDefault(msg, 2, 0),
    aliasesList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f
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
 * @return {!proto.cosmos.bank.v1beta1.DenomUnit}
 */
proto.cosmos.bank.v1beta1.DenomUnit.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.bank.v1beta1.DenomUnit;
  return proto.cosmos.bank.v1beta1.DenomUnit.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.bank.v1beta1.DenomUnit} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.bank.v1beta1.DenomUnit}
 */
proto.cosmos.bank.v1beta1.DenomUnit.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setExponent(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addAliases(value);
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
proto.cosmos.bank.v1beta1.DenomUnit.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.bank.v1beta1.DenomUnit.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.bank.v1beta1.DenomUnit} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.bank.v1beta1.DenomUnit.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getExponent();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getAliasesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.cosmos.bank.v1beta1.DenomUnit.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.bank.v1beta1.DenomUnit} returns this
 */
proto.cosmos.bank.v1beta1.DenomUnit.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint32 exponent = 2;
 * @return {number}
 */
proto.cosmos.bank.v1beta1.DenomUnit.prototype.getExponent = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.bank.v1beta1.DenomUnit} returns this
 */
proto.cosmos.bank.v1beta1.DenomUnit.prototype.setExponent = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * repeated string aliases = 3;
 * @return {!Array<string>}
 */
proto.cosmos.bank.v1beta1.DenomUnit.prototype.getAliasesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cosmos.bank.v1beta1.DenomUnit} returns this
 */
proto.cosmos.bank.v1beta1.DenomUnit.prototype.setAliasesList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cosmos.bank.v1beta1.DenomUnit} returns this
 */
proto.cosmos.bank.v1beta1.DenomUnit.prototype.addAliases = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.bank.v1beta1.DenomUnit} returns this
 */
proto.cosmos.bank.v1beta1.DenomUnit.prototype.clearAliasesList = function() {
  return this.setAliasesList([]);
};

