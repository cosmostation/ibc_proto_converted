// source: kava/incentive/v1beta1/params.proto
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

goog.provide('proto.kava.incentive.v1beta1.MultipliersPerDenom');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kava.incentive.v1beta1.Multiplier');

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
proto.kava.incentive.v1beta1.MultipliersPerDenom = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.incentive.v1beta1.MultipliersPerDenom.repeatedFields_, null);
};
goog.inherits(proto.kava.incentive.v1beta1.MultipliersPerDenom, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.incentive.v1beta1.MultipliersPerDenom.displayName = 'proto.kava.incentive.v1beta1.MultipliersPerDenom';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.incentive.v1beta1.MultipliersPerDenom.repeatedFields_ = [2];



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
proto.kava.incentive.v1beta1.MultipliersPerDenom.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.incentive.v1beta1.MultipliersPerDenom.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.incentive.v1beta1.MultipliersPerDenom} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.incentive.v1beta1.MultipliersPerDenom.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    multipliersList: jspb.Message.toObjectList(msg.getMultipliersList(),
    proto.kava.incentive.v1beta1.Multiplier.toObject, includeInstance)
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
 * @return {!proto.kava.incentive.v1beta1.MultipliersPerDenom}
 */
proto.kava.incentive.v1beta1.MultipliersPerDenom.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.incentive.v1beta1.MultipliersPerDenom;
  return proto.kava.incentive.v1beta1.MultipliersPerDenom.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.incentive.v1beta1.MultipliersPerDenom} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.incentive.v1beta1.MultipliersPerDenom}
 */
proto.kava.incentive.v1beta1.MultipliersPerDenom.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.kava.incentive.v1beta1.Multiplier;
      reader.readMessage(value,proto.kava.incentive.v1beta1.Multiplier.deserializeBinaryFromReader);
      msg.addMultipliers(value);
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
proto.kava.incentive.v1beta1.MultipliersPerDenom.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.incentive.v1beta1.MultipliersPerDenom.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.incentive.v1beta1.MultipliersPerDenom} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.incentive.v1beta1.MultipliersPerDenom.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getMultipliersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.kava.incentive.v1beta1.Multiplier.serializeBinaryToWriter
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.kava.incentive.v1beta1.MultipliersPerDenom.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kava.incentive.v1beta1.MultipliersPerDenom} returns this
 */
proto.kava.incentive.v1beta1.MultipliersPerDenom.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated Multiplier multipliers = 2;
 * @return {!Array<!proto.kava.incentive.v1beta1.Multiplier>}
 */
proto.kava.incentive.v1beta1.MultipliersPerDenom.prototype.getMultipliersList = function() {
  return /** @type{!Array<!proto.kava.incentive.v1beta1.Multiplier>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.incentive.v1beta1.Multiplier, 2));
};


/**
 * @param {!Array<!proto.kava.incentive.v1beta1.Multiplier>} value
 * @return {!proto.kava.incentive.v1beta1.MultipliersPerDenom} returns this
*/
proto.kava.incentive.v1beta1.MultipliersPerDenom.prototype.setMultipliersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.kava.incentive.v1beta1.Multiplier=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.incentive.v1beta1.Multiplier}
 */
proto.kava.incentive.v1beta1.MultipliersPerDenom.prototype.addMultipliers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.kava.incentive.v1beta1.Multiplier, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.incentive.v1beta1.MultipliersPerDenom} returns this
 */
proto.kava.incentive.v1beta1.MultipliersPerDenom.prototype.clearMultipliersList = function() {
  return this.setMultipliersList([]);
};

