// source: coreum/asset/ft/v1/token.proto
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

goog.provide('proto.coreum.asset.ft.v1.Token');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.coreum.asset.ft.v1.Feature');
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
proto.coreum.asset.ft.v1.Token = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.coreum.asset.ft.v1.Token.repeatedFields_, null);
};
goog.inherits(proto.coreum.asset.ft.v1.Token, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.coreum.asset.ft.v1.Token.displayName = 'proto.coreum.asset.ft.v1.Token';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.coreum.asset.ft.v1.Token.repeatedFields_ = [8];



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
proto.coreum.asset.ft.v1.Token.prototype.toObject = function(opt_includeInstance) {
  return proto.coreum.asset.ft.v1.Token.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.coreum.asset.ft.v1.Token} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.asset.ft.v1.Token.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    issuer: jspb.Message.getFieldWithDefault(msg, 2, ""),
    symbol: jspb.Message.getFieldWithDefault(msg, 3, ""),
    subunit: jspb.Message.getFieldWithDefault(msg, 4, ""),
    precision: jspb.Message.getFieldWithDefault(msg, 5, 0),
    description: jspb.Message.getFieldWithDefault(msg, 6, ""),
    globallyFrozen: jspb.Message.getBooleanFieldWithDefault(msg, 7, false),
    featuresList: (f = jspb.Message.getRepeatedField(msg, 8)) == null ? undefined : f,
    burnRate: jspb.Message.getFieldWithDefault(msg, 9, ""),
    sendCommissionRate: jspb.Message.getFieldWithDefault(msg, 10, "")
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
 * @return {!proto.coreum.asset.ft.v1.Token}
 */
proto.coreum.asset.ft.v1.Token.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.coreum.asset.ft.v1.Token;
  return proto.coreum.asset.ft.v1.Token.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.coreum.asset.ft.v1.Token} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.coreum.asset.ft.v1.Token}
 */
proto.coreum.asset.ft.v1.Token.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {string} */ (reader.readString());
      msg.setIssuer(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSymbol(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setSubunit(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setPrecision(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 7:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setGloballyFrozen(value);
      break;
    case 8:
      var values = /** @type {!Array<!proto.coreum.asset.ft.v1.Feature>} */ (reader.isDelimited() ? reader.readPackedEnum() : [reader.readEnum()]);
      for (var i = 0; i < values.length; i++) {
        msg.addFeatures(values[i]);
      }
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setBurnRate(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setSendCommissionRate(value);
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
proto.coreum.asset.ft.v1.Token.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.coreum.asset.ft.v1.Token.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.coreum.asset.ft.v1.Token} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.asset.ft.v1.Token.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getIssuer();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSymbol();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getSubunit();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getPrecision();
  if (f !== 0) {
    writer.writeUint32(
      5,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getGloballyFrozen();
  if (f) {
    writer.writeBool(
      7,
      f
    );
  }
  f = message.getFeaturesList();
  if (f.length > 0) {
    writer.writePackedEnum(
      8,
      f
    );
  }
  f = message.getBurnRate();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getSendCommissionRate();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.coreum.asset.ft.v1.Token.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string issuer = 2;
 * @return {string}
 */
proto.coreum.asset.ft.v1.Token.prototype.getIssuer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.setIssuer = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string symbol = 3;
 * @return {string}
 */
proto.coreum.asset.ft.v1.Token.prototype.getSymbol = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.setSymbol = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string subunit = 4;
 * @return {string}
 */
proto.coreum.asset.ft.v1.Token.prototype.getSubunit = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.setSubunit = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional uint32 precision = 5;
 * @return {number}
 */
proto.coreum.asset.ft.v1.Token.prototype.getPrecision = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.setPrecision = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional string description = 6;
 * @return {string}
 */
proto.coreum.asset.ft.v1.Token.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional bool globally_frozen = 7;
 * @return {boolean}
 */
proto.coreum.asset.ft.v1.Token.prototype.getGloballyFrozen = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 7, false));
};


/**
 * @param {boolean} value
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.setGloballyFrozen = function(value) {
  return jspb.Message.setProto3BooleanField(this, 7, value);
};


/**
 * repeated Feature features = 8;
 * @return {!Array<!proto.coreum.asset.ft.v1.Feature>}
 */
proto.coreum.asset.ft.v1.Token.prototype.getFeaturesList = function() {
  return /** @type {!Array<!proto.coreum.asset.ft.v1.Feature>} */ (jspb.Message.getRepeatedField(this, 8));
};


/**
 * @param {!Array<!proto.coreum.asset.ft.v1.Feature>} value
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.setFeaturesList = function(value) {
  return jspb.Message.setField(this, 8, value || []);
};


/**
 * @param {!proto.coreum.asset.ft.v1.Feature} value
 * @param {number=} opt_index
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.addFeatures = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 8, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.clearFeaturesList = function() {
  return this.setFeaturesList([]);
};


/**
 * optional string burn_rate = 9;
 * @return {string}
 */
proto.coreum.asset.ft.v1.Token.prototype.getBurnRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.setBurnRate = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional string send_commission_rate = 10;
 * @return {string}
 */
proto.coreum.asset.ft.v1.Token.prototype.getSendCommissionRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.asset.ft.v1.Token} returns this
 */
proto.coreum.asset.ft.v1.Token.prototype.setSendCommissionRate = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};

