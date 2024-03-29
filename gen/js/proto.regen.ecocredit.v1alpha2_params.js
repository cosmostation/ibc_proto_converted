// source: regen/ecocredit/v1alpha2/types.proto
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

goog.provide('proto.regen.ecocredit.v1alpha2.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.regen.ecocredit.v1alpha2.CreditType');

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
proto.regen.ecocredit.v1alpha2.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.regen.ecocredit.v1alpha2.Params.repeatedFields_, null);
};
goog.inherits(proto.regen.ecocredit.v1alpha2.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.ecocredit.v1alpha2.Params.displayName = 'proto.regen.ecocredit.v1alpha2.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.regen.ecocredit.v1alpha2.Params.repeatedFields_ = [1,2,4];



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
proto.regen.ecocredit.v1alpha2.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.ecocredit.v1alpha2.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.ecocredit.v1alpha2.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    creditClassFeeList: jspb.Message.toObjectList(msg.getCreditClassFeeList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    allowedClassCreatorsList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f,
    allowlistEnabled: jspb.Message.getBooleanFieldWithDefault(msg, 3, false),
    creditTypesList: jspb.Message.toObjectList(msg.getCreditTypesList(),
    proto.regen.ecocredit.v1alpha2.CreditType.toObject, includeInstance)
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
 * @return {!proto.regen.ecocredit.v1alpha2.Params}
 */
proto.regen.ecocredit.v1alpha2.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.ecocredit.v1alpha2.Params;
  return proto.regen.ecocredit.v1alpha2.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.ecocredit.v1alpha2.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.ecocredit.v1alpha2.Params}
 */
proto.regen.ecocredit.v1alpha2.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addCreditClassFee(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addAllowedClassCreators(value);
      break;
    case 3:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setAllowlistEnabled(value);
      break;
    case 4:
      var value = new proto.regen.ecocredit.v1alpha2.CreditType;
      reader.readMessage(value,proto.regen.ecocredit.v1alpha2.CreditType.deserializeBinaryFromReader);
      msg.addCreditTypes(value);
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
proto.regen.ecocredit.v1alpha2.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.ecocredit.v1alpha2.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.ecocredit.v1alpha2.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCreditClassFeeList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getAllowedClassCreatorsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
  f = message.getAllowlistEnabled();
  if (f) {
    writer.writeBool(
      3,
      f
    );
  }
  f = message.getCreditTypesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.regen.ecocredit.v1alpha2.CreditType.serializeBinaryToWriter
    );
  }
};


/**
 * repeated cosmos.base.v1beta1.Coin credit_class_fee = 1;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.getCreditClassFeeList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 1));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.regen.ecocredit.v1alpha2.Params} returns this
*/
proto.regen.ecocredit.v1alpha2.Params.prototype.setCreditClassFeeList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.addCreditClassFee = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.regen.ecocredit.v1alpha2.Params} returns this
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.clearCreditClassFeeList = function() {
  return this.setCreditClassFeeList([]);
};


/**
 * repeated string allowed_class_creators = 2;
 * @return {!Array<string>}
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.getAllowedClassCreatorsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.regen.ecocredit.v1alpha2.Params} returns this
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.setAllowedClassCreatorsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.regen.ecocredit.v1alpha2.Params} returns this
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.addAllowedClassCreators = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.regen.ecocredit.v1alpha2.Params} returns this
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.clearAllowedClassCreatorsList = function() {
  return this.setAllowedClassCreatorsList([]);
};


/**
 * optional bool allowlist_enabled = 3;
 * @return {boolean}
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.getAllowlistEnabled = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 3, false));
};


/**
 * @param {boolean} value
 * @return {!proto.regen.ecocredit.v1alpha2.Params} returns this
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.setAllowlistEnabled = function(value) {
  return jspb.Message.setProto3BooleanField(this, 3, value);
};


/**
 * repeated CreditType credit_types = 4;
 * @return {!Array<!proto.regen.ecocredit.v1alpha2.CreditType>}
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.getCreditTypesList = function() {
  return /** @type{!Array<!proto.regen.ecocredit.v1alpha2.CreditType>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.regen.ecocredit.v1alpha2.CreditType, 4));
};


/**
 * @param {!Array<!proto.regen.ecocredit.v1alpha2.CreditType>} value
 * @return {!proto.regen.ecocredit.v1alpha2.Params} returns this
*/
proto.regen.ecocredit.v1alpha2.Params.prototype.setCreditTypesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.regen.ecocredit.v1alpha2.CreditType=} opt_value
 * @param {number=} opt_index
 * @return {!proto.regen.ecocredit.v1alpha2.CreditType}
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.addCreditTypes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.regen.ecocredit.v1alpha2.CreditType, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.regen.ecocredit.v1alpha2.Params} returns this
 */
proto.regen.ecocredit.v1alpha2.Params.prototype.clearCreditTypesList = function() {
  return this.setCreditTypesList([]);
};


