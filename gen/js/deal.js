// source: panacea/datadeal/v2alpha2/deal.proto
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

goog.provide('proto.panacea.datadeal.v2alpha2.Deal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

goog.forwardDeclare('proto.panacea.datadeal.v2alpha2.DealStatus');
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
proto.panacea.datadeal.v2alpha2.Deal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.panacea.datadeal.v2alpha2.Deal.repeatedFields_, null);
};
goog.inherits(proto.panacea.datadeal.v2alpha2.Deal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.datadeal.v2alpha2.Deal.displayName = 'proto.panacea.datadeal.v2alpha2.Deal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.panacea.datadeal.v2alpha2.Deal.repeatedFields_ = [3];



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
proto.panacea.datadeal.v2alpha2.Deal.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.datadeal.v2alpha2.Deal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.datadeal.v2alpha2.Deal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datadeal.v2alpha2.Deal.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    address: jspb.Message.getFieldWithDefault(msg, 2, ""),
    dataSchemaList: (f = jspb.Message.getRepeatedField(msg, 3)) == null ? undefined : f,
    budget: (f = msg.getBudget()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    maxNumData: jspb.Message.getFieldWithDefault(msg, 5, 0),
    curNumData: jspb.Message.getFieldWithDefault(msg, 6, 0),
    buyerAddress: jspb.Message.getFieldWithDefault(msg, 7, ""),
    status: jspb.Message.getFieldWithDefault(msg, 8, 0),
    nonce: msg.getNonce_asB64()
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
 * @return {!proto.panacea.datadeal.v2alpha2.Deal}
 */
proto.panacea.datadeal.v2alpha2.Deal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.datadeal.v2alpha2.Deal;
  return proto.panacea.datadeal.v2alpha2.Deal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.datadeal.v2alpha2.Deal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.datadeal.v2alpha2.Deal}
 */
proto.panacea.datadeal.v2alpha2.Deal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.addDataSchema(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setBudget(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxNumData(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCurNumData(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setBuyerAddress(value);
      break;
    case 8:
      var value = /** @type {!proto.panacea.datadeal.v2alpha2.DealStatus} */ (reader.readEnum());
      msg.setStatus(value);
      break;
    case 9:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setNonce(value);
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
proto.panacea.datadeal.v2alpha2.Deal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.datadeal.v2alpha2.Deal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.datadeal.v2alpha2.Deal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.datadeal.v2alpha2.Deal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDataSchemaList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      3,
      f
    );
  }
  f = message.getBudget();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getMaxNumData();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getCurNumData();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getBuyerAddress();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      8,
      f
    );
  }
  f = message.getNonce_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      9,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string address = 2;
 * @return {string}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated string data_schema = 3;
 * @return {!Array<string>}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.getDataSchemaList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.setDataSchemaList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.addDataSchema = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.clearDataSchemaList = function() {
  return this.setDataSchemaList([]);
};


/**
 * optional cosmos.base.v1beta1.Coin budget = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.getBudget = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
*/
proto.panacea.datadeal.v2alpha2.Deal.prototype.setBudget = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.clearBudget = function() {
  return this.setBudget(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.hasBudget = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional uint64 max_num_data = 5;
 * @return {number}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.getMaxNumData = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.setMaxNumData = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional uint64 cur_num_data = 6;
 * @return {number}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.getCurNumData = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.setCurNumData = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional string buyer_address = 7;
 * @return {string}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.getBuyerAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.setBuyerAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional DealStatus status = 8;
 * @return {!proto.panacea.datadeal.v2alpha2.DealStatus}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.getStatus = function() {
  return /** @type {!proto.panacea.datadeal.v2alpha2.DealStatus} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {!proto.panacea.datadeal.v2alpha2.DealStatus} value
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.setStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 8, value);
};


/**
 * optional bytes nonce = 9;
 * @return {string}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.getNonce = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * optional bytes nonce = 9;
 * This is a type-conversion wrapper around `getNonce()`
 * @return {string}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.getNonce_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getNonce()));
};


/**
 * optional bytes nonce = 9;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getNonce()`
 * @return {!Uint8Array}
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.getNonce_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getNonce()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.panacea.datadeal.v2alpha2.Deal} returns this
 */
proto.panacea.datadeal.v2alpha2.Deal.prototype.setNonce = function(value) {
  return jspb.Message.setProto3BytesField(this, 9, value);
};


