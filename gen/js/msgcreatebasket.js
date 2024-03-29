// source: regen/ecocredit/v1alpha2/tx.proto
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

goog.provide('proto.regen.ecocredit.v1alpha2.MsgCreateBasket');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.regen.ecocredit.v1alpha2.BasketCriteria');

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
proto.regen.ecocredit.v1alpha2.MsgCreateBasket = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.regen.ecocredit.v1alpha2.MsgCreateBasket.repeatedFields_, null);
};
goog.inherits(proto.regen.ecocredit.v1alpha2.MsgCreateBasket, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.ecocredit.v1alpha2.MsgCreateBasket.displayName = 'proto.regen.ecocredit.v1alpha2.MsgCreateBasket';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.repeatedFields_ = [5];



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
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.ecocredit.v1alpha2.MsgCreateBasket.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.toObject = function(includeInstance, msg) {
  var f, obj = {
    curator: jspb.Message.getFieldWithDefault(msg, 1, ""),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    displayName: jspb.Message.getFieldWithDefault(msg, 3, ""),
    exponent: jspb.Message.getFieldWithDefault(msg, 4, 0),
    basketCriteriaList: jspb.Message.toObjectList(msg.getBasketCriteriaList(),
    proto.regen.ecocredit.v1alpha2.BasketCriteria.toObject, includeInstance),
    disableAutoRetire: jspb.Message.getBooleanFieldWithDefault(msg, 6, false),
    allowPicking: jspb.Message.getBooleanFieldWithDefault(msg, 7, false)
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
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket}
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.ecocredit.v1alpha2.MsgCreateBasket;
  return proto.regen.ecocredit.v1alpha2.MsgCreateBasket.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket}
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCurator(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setDisplayName(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setExponent(value);
      break;
    case 5:
      var value = new proto.regen.ecocredit.v1alpha2.BasketCriteria;
      reader.readMessage(value,proto.regen.ecocredit.v1alpha2.BasketCriteria.deserializeBinaryFromReader);
      msg.addBasketCriteria(value);
      break;
    case 6:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setDisableAutoRetire(value);
      break;
    case 7:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setAllowPicking(value);
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
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.ecocredit.v1alpha2.MsgCreateBasket.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCurator();
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
  f = message.getDisplayName();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getExponent();
  if (f !== 0) {
    writer.writeUint32(
      4,
      f
    );
  }
  f = message.getBasketCriteriaList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.regen.ecocredit.v1alpha2.BasketCriteria.serializeBinaryToWriter
    );
  }
  f = message.getDisableAutoRetire();
  if (f) {
    writer.writeBool(
      6,
      f
    );
  }
  f = message.getAllowPicking();
  if (f) {
    writer.writeBool(
      7,
      f
    );
  }
};


/**
 * optional string curator = 1;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.getCurator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.setCurator = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string display_name = 3;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.getDisplayName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.setDisplayName = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint32 exponent = 4;
 * @return {number}
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.getExponent = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.setExponent = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * repeated BasketCriteria basket_criteria = 5;
 * @return {!Array<!proto.regen.ecocredit.v1alpha2.BasketCriteria>}
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.getBasketCriteriaList = function() {
  return /** @type{!Array<!proto.regen.ecocredit.v1alpha2.BasketCriteria>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.regen.ecocredit.v1alpha2.BasketCriteria, 5));
};


/**
 * @param {!Array<!proto.regen.ecocredit.v1alpha2.BasketCriteria>} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket} returns this
*/
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.setBasketCriteriaList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.regen.ecocredit.v1alpha2.BasketCriteria=} opt_value
 * @param {number=} opt_index
 * @return {!proto.regen.ecocredit.v1alpha2.BasketCriteria}
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.addBasketCriteria = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.regen.ecocredit.v1alpha2.BasketCriteria, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.clearBasketCriteriaList = function() {
  return this.setBasketCriteriaList([]);
};


/**
 * optional bool disable_auto_retire = 6;
 * @return {boolean}
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.getDisableAutoRetire = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 6, false));
};


/**
 * @param {boolean} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.setDisableAutoRetire = function(value) {
  return jspb.Message.setProto3BooleanField(this, 6, value);
};


/**
 * optional bool allow_picking = 7;
 * @return {boolean}
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.getAllowPicking = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 7, false));
};


/**
 * @param {boolean} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCreateBasket} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgCreateBasket.prototype.setAllowPicking = function(value) {
  return jspb.Message.setProto3BooleanField(this, 7, value);
};


