// source: assetmantle/data/base/any_listable_data.proto
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

goog.provide('proto.assetmantle.schema.data.base.AnyListableData');
goog.provide('proto.assetmantle.schema.data.base.AnyListableData.ImplCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.assetmantle.schema.data.base.AccAddressData');
goog.require('proto.assetmantle.schema.data.base.BooleanData');
goog.require('proto.assetmantle.schema.data.base.DecData');
goog.require('proto.assetmantle.schema.data.base.HeightData');
goog.require('proto.assetmantle.schema.data.base.IDData');
goog.require('proto.assetmantle.schema.data.base.NumberData');
goog.require('proto.assetmantle.schema.data.base.StringData');

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
proto.assetmantle.schema.data.base.AnyListableData = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.assetmantle.schema.data.base.AnyListableData.oneofGroups_);
};
goog.inherits(proto.assetmantle.schema.data.base.AnyListableData, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.assetmantle.schema.data.base.AnyListableData.displayName = 'proto.assetmantle.schema.data.base.AnyListableData';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.assetmantle.schema.data.base.AnyListableData.oneofGroups_ = [[1,2,3,4,5,6,7]];

/**
 * @enum {number}
 */
proto.assetmantle.schema.data.base.AnyListableData.ImplCase = {
  IMPL_NOT_SET: 0,
  ACC_ADDRESS_DATA: 1,
  BOOLEAN_DATA: 2,
  DEC_DATA: 3,
  HEIGHT_DATA: 4,
  I_D_DATA: 5,
  NUMBER_DATA: 6,
  STRING_DATA: 7
};

/**
 * @return {proto.assetmantle.schema.data.base.AnyListableData.ImplCase}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.getImplCase = function() {
  return /** @type {proto.assetmantle.schema.data.base.AnyListableData.ImplCase} */(jspb.Message.computeOneofCase(this, proto.assetmantle.schema.data.base.AnyListableData.oneofGroups_[0]));
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
proto.assetmantle.schema.data.base.AnyListableData.prototype.toObject = function(opt_includeInstance) {
  return proto.assetmantle.schema.data.base.AnyListableData.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.assetmantle.schema.data.base.AnyListableData} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.schema.data.base.AnyListableData.toObject = function(includeInstance, msg) {
  var f, obj = {
    accAddressData: (f = msg.getAccAddressData()) && proto.assetmantle.schema.data.base.AccAddressData.toObject(includeInstance, f),
    booleanData: (f = msg.getBooleanData()) && proto.assetmantle.schema.data.base.BooleanData.toObject(includeInstance, f),
    decData: (f = msg.getDecData()) && proto.assetmantle.schema.data.base.DecData.toObject(includeInstance, f),
    heightData: (f = msg.getHeightData()) && proto.assetmantle.schema.data.base.HeightData.toObject(includeInstance, f),
    iDData: (f = msg.getIDData()) && proto.assetmantle.schema.data.base.IDData.toObject(includeInstance, f),
    numberData: (f = msg.getNumberData()) && proto.assetmantle.schema.data.base.NumberData.toObject(includeInstance, f),
    stringData: (f = msg.getStringData()) && proto.assetmantle.schema.data.base.StringData.toObject(includeInstance, f)
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
 * @return {!proto.assetmantle.schema.data.base.AnyListableData}
 */
proto.assetmantle.schema.data.base.AnyListableData.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.assetmantle.schema.data.base.AnyListableData;
  return proto.assetmantle.schema.data.base.AnyListableData.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.assetmantle.schema.data.base.AnyListableData} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.assetmantle.schema.data.base.AnyListableData}
 */
proto.assetmantle.schema.data.base.AnyListableData.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.assetmantle.schema.data.base.AccAddressData;
      reader.readMessage(value,proto.assetmantle.schema.data.base.AccAddressData.deserializeBinaryFromReader);
      msg.setAccAddressData(value);
      break;
    case 2:
      var value = new proto.assetmantle.schema.data.base.BooleanData;
      reader.readMessage(value,proto.assetmantle.schema.data.base.BooleanData.deserializeBinaryFromReader);
      msg.setBooleanData(value);
      break;
    case 3:
      var value = new proto.assetmantle.schema.data.base.DecData;
      reader.readMessage(value,proto.assetmantle.schema.data.base.DecData.deserializeBinaryFromReader);
      msg.setDecData(value);
      break;
    case 4:
      var value = new proto.assetmantle.schema.data.base.HeightData;
      reader.readMessage(value,proto.assetmantle.schema.data.base.HeightData.deserializeBinaryFromReader);
      msg.setHeightData(value);
      break;
    case 5:
      var value = new proto.assetmantle.schema.data.base.IDData;
      reader.readMessage(value,proto.assetmantle.schema.data.base.IDData.deserializeBinaryFromReader);
      msg.setIDData(value);
      break;
    case 6:
      var value = new proto.assetmantle.schema.data.base.NumberData;
      reader.readMessage(value,proto.assetmantle.schema.data.base.NumberData.deserializeBinaryFromReader);
      msg.setNumberData(value);
      break;
    case 7:
      var value = new proto.assetmantle.schema.data.base.StringData;
      reader.readMessage(value,proto.assetmantle.schema.data.base.StringData.deserializeBinaryFromReader);
      msg.setStringData(value);
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
proto.assetmantle.schema.data.base.AnyListableData.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.assetmantle.schema.data.base.AnyListableData.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.assetmantle.schema.data.base.AnyListableData} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.schema.data.base.AnyListableData.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAccAddressData();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.assetmantle.schema.data.base.AccAddressData.serializeBinaryToWriter
    );
  }
  f = message.getBooleanData();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.assetmantle.schema.data.base.BooleanData.serializeBinaryToWriter
    );
  }
  f = message.getDecData();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.assetmantle.schema.data.base.DecData.serializeBinaryToWriter
    );
  }
  f = message.getHeightData();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.assetmantle.schema.data.base.HeightData.serializeBinaryToWriter
    );
  }
  f = message.getIDData();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.assetmantle.schema.data.base.IDData.serializeBinaryToWriter
    );
  }
  f = message.getNumberData();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.assetmantle.schema.data.base.NumberData.serializeBinaryToWriter
    );
  }
  f = message.getStringData();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.assetmantle.schema.data.base.StringData.serializeBinaryToWriter
    );
  }
};


/**
 * optional AccAddressData acc_address_data = 1;
 * @return {?proto.assetmantle.schema.data.base.AccAddressData}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.getAccAddressData = function() {
  return /** @type{?proto.assetmantle.schema.data.base.AccAddressData} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.data.base.AccAddressData, 1));
};


/**
 * @param {?proto.assetmantle.schema.data.base.AccAddressData|undefined} value
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
*/
proto.assetmantle.schema.data.base.AnyListableData.prototype.setAccAddressData = function(value) {
  return jspb.Message.setOneofWrapperField(this, 1, proto.assetmantle.schema.data.base.AnyListableData.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.clearAccAddressData = function() {
  return this.setAccAddressData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.hasAccAddressData = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional BooleanData boolean_data = 2;
 * @return {?proto.assetmantle.schema.data.base.BooleanData}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.getBooleanData = function() {
  return /** @type{?proto.assetmantle.schema.data.base.BooleanData} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.data.base.BooleanData, 2));
};


/**
 * @param {?proto.assetmantle.schema.data.base.BooleanData|undefined} value
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
*/
proto.assetmantle.schema.data.base.AnyListableData.prototype.setBooleanData = function(value) {
  return jspb.Message.setOneofWrapperField(this, 2, proto.assetmantle.schema.data.base.AnyListableData.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.clearBooleanData = function() {
  return this.setBooleanData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.hasBooleanData = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional DecData dec_data = 3;
 * @return {?proto.assetmantle.schema.data.base.DecData}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.getDecData = function() {
  return /** @type{?proto.assetmantle.schema.data.base.DecData} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.data.base.DecData, 3));
};


/**
 * @param {?proto.assetmantle.schema.data.base.DecData|undefined} value
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
*/
proto.assetmantle.schema.data.base.AnyListableData.prototype.setDecData = function(value) {
  return jspb.Message.setOneofWrapperField(this, 3, proto.assetmantle.schema.data.base.AnyListableData.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.clearDecData = function() {
  return this.setDecData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.hasDecData = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional HeightData height_data = 4;
 * @return {?proto.assetmantle.schema.data.base.HeightData}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.getHeightData = function() {
  return /** @type{?proto.assetmantle.schema.data.base.HeightData} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.data.base.HeightData, 4));
};


/**
 * @param {?proto.assetmantle.schema.data.base.HeightData|undefined} value
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
*/
proto.assetmantle.schema.data.base.AnyListableData.prototype.setHeightData = function(value) {
  return jspb.Message.setOneofWrapperField(this, 4, proto.assetmantle.schema.data.base.AnyListableData.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.clearHeightData = function() {
  return this.setHeightData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.hasHeightData = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional IDData i_d_data = 5;
 * @return {?proto.assetmantle.schema.data.base.IDData}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.getIDData = function() {
  return /** @type{?proto.assetmantle.schema.data.base.IDData} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.data.base.IDData, 5));
};


/**
 * @param {?proto.assetmantle.schema.data.base.IDData|undefined} value
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
*/
proto.assetmantle.schema.data.base.AnyListableData.prototype.setIDData = function(value) {
  return jspb.Message.setOneofWrapperField(this, 5, proto.assetmantle.schema.data.base.AnyListableData.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.clearIDData = function() {
  return this.setIDData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.hasIDData = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional NumberData number_data = 6;
 * @return {?proto.assetmantle.schema.data.base.NumberData}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.getNumberData = function() {
  return /** @type{?proto.assetmantle.schema.data.base.NumberData} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.data.base.NumberData, 6));
};


/**
 * @param {?proto.assetmantle.schema.data.base.NumberData|undefined} value
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
*/
proto.assetmantle.schema.data.base.AnyListableData.prototype.setNumberData = function(value) {
  return jspb.Message.setOneofWrapperField(this, 6, proto.assetmantle.schema.data.base.AnyListableData.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.clearNumberData = function() {
  return this.setNumberData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.hasNumberData = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional StringData string_data = 7;
 * @return {?proto.assetmantle.schema.data.base.StringData}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.getStringData = function() {
  return /** @type{?proto.assetmantle.schema.data.base.StringData} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.data.base.StringData, 7));
};


/**
 * @param {?proto.assetmantle.schema.data.base.StringData|undefined} value
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
*/
proto.assetmantle.schema.data.base.AnyListableData.prototype.setStringData = function(value) {
  return jspb.Message.setOneofWrapperField(this, 7, proto.assetmantle.schema.data.base.AnyListableData.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.schema.data.base.AnyListableData} returns this
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.clearStringData = function() {
  return this.setStringData(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.schema.data.base.AnyListableData.prototype.hasStringData = function() {
  return jspb.Message.getField(this, 7) != null;
};


