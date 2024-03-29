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

goog.provide('proto.regen.ecocredit.v1alpha2.MsgAddToBasket');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.regen.ecocredit.v1alpha2.BasketCredit');

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
proto.regen.ecocredit.v1alpha2.MsgAddToBasket = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.regen.ecocredit.v1alpha2.MsgAddToBasket.repeatedFields_, null);
};
goog.inherits(proto.regen.ecocredit.v1alpha2.MsgAddToBasket, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.ecocredit.v1alpha2.MsgAddToBasket.displayName = 'proto.regen.ecocredit.v1alpha2.MsgAddToBasket';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.repeatedFields_ = [3];



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
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.ecocredit.v1alpha2.MsgAddToBasket.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.ecocredit.v1alpha2.MsgAddToBasket} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.toObject = function(includeInstance, msg) {
  var f, obj = {
    owner: jspb.Message.getFieldWithDefault(msg, 1, ""),
    basketDenom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    creditsList: jspb.Message.toObjectList(msg.getCreditsList(),
    proto.regen.ecocredit.v1alpha2.BasketCredit.toObject, includeInstance)
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
 * @return {!proto.regen.ecocredit.v1alpha2.MsgAddToBasket}
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.ecocredit.v1alpha2.MsgAddToBasket;
  return proto.regen.ecocredit.v1alpha2.MsgAddToBasket.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.ecocredit.v1alpha2.MsgAddToBasket} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.ecocredit.v1alpha2.MsgAddToBasket}
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setBasketDenom(value);
      break;
    case 3:
      var value = new proto.regen.ecocredit.v1alpha2.BasketCredit;
      reader.readMessage(value,proto.regen.ecocredit.v1alpha2.BasketCredit.deserializeBinaryFromReader);
      msg.addCredits(value);
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
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.ecocredit.v1alpha2.MsgAddToBasket.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.ecocredit.v1alpha2.MsgAddToBasket} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getBasketDenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getCreditsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.regen.ecocredit.v1alpha2.BasketCredit.serializeBinaryToWriter
    );
  }
};


/**
 * optional string owner = 1;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgAddToBasket} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string basket_denom = 2;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.prototype.getBasketDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgAddToBasket} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.prototype.setBasketDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated BasketCredit credits = 3;
 * @return {!Array<!proto.regen.ecocredit.v1alpha2.BasketCredit>}
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.prototype.getCreditsList = function() {
  return /** @type{!Array<!proto.regen.ecocredit.v1alpha2.BasketCredit>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.regen.ecocredit.v1alpha2.BasketCredit, 3));
};


/**
 * @param {!Array<!proto.regen.ecocredit.v1alpha2.BasketCredit>} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgAddToBasket} returns this
*/
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.prototype.setCreditsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.regen.ecocredit.v1alpha2.BasketCredit=} opt_value
 * @param {number=} opt_index
 * @return {!proto.regen.ecocredit.v1alpha2.BasketCredit}
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.prototype.addCredits = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.regen.ecocredit.v1alpha2.BasketCredit, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.regen.ecocredit.v1alpha2.MsgAddToBasket} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgAddToBasket.prototype.clearCreditsList = function() {
  return this.setCreditsList([]);
};


