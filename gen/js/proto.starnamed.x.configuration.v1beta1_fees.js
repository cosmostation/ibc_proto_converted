// source: iov/configuration/v1beta1/types.proto
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

goog.provide('proto.starnamed.x.configuration.v1beta1.Fees');

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
proto.starnamed.x.configuration.v1beta1.Fees = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.starnamed.x.configuration.v1beta1.Fees, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.starnamed.x.configuration.v1beta1.Fees.displayName = 'proto.starnamed.x.configuration.v1beta1.Fees';
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
proto.starnamed.x.configuration.v1beta1.Fees.prototype.toObject = function(opt_includeInstance) {
  return proto.starnamed.x.configuration.v1beta1.Fees.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.starnamed.x.configuration.v1beta1.Fees} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.configuration.v1beta1.Fees.toObject = function(includeInstance, msg) {
  var f, obj = {
    feeCoinDenom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    feeCoinPrice: jspb.Message.getFieldWithDefault(msg, 2, ""),
    feeDefault: jspb.Message.getFieldWithDefault(msg, 3, ""),
    registerAccountClosed: jspb.Message.getFieldWithDefault(msg, 4, ""),
    registerAccountOpen: jspb.Message.getFieldWithDefault(msg, 5, ""),
    transferAccountClosed: jspb.Message.getFieldWithDefault(msg, 6, ""),
    transferAccountOpen: jspb.Message.getFieldWithDefault(msg, 7, ""),
    replaceAccountResources: jspb.Message.getFieldWithDefault(msg, 8, ""),
    addAccountCertificate: jspb.Message.getFieldWithDefault(msg, 9, ""),
    delAccountCertificate: jspb.Message.getFieldWithDefault(msg, 10, ""),
    setAccountMetadata: jspb.Message.getFieldWithDefault(msg, 11, ""),
    registerDomain1: jspb.Message.getFieldWithDefault(msg, 12, ""),
    registerDomain2: jspb.Message.getFieldWithDefault(msg, 13, ""),
    registerDomain3: jspb.Message.getFieldWithDefault(msg, 14, ""),
    registerDomain4: jspb.Message.getFieldWithDefault(msg, 15, ""),
    registerDomain5: jspb.Message.getFieldWithDefault(msg, 16, ""),
    registerDomainDefault: jspb.Message.getFieldWithDefault(msg, 17, ""),
    registerOpenDomainMultiplier: jspb.Message.getFieldWithDefault(msg, 18, ""),
    transferDomainClosed: jspb.Message.getFieldWithDefault(msg, 19, ""),
    transferDomainOpen: jspb.Message.getFieldWithDefault(msg, 20, ""),
    renewDomainOpen: jspb.Message.getFieldWithDefault(msg, 21, ""),
    createEscrow: jspb.Message.getFieldWithDefault(msg, 22, ""),
    updateEscrow: jspb.Message.getFieldWithDefault(msg, 23, ""),
    transferToEscrow: jspb.Message.getFieldWithDefault(msg, 24, ""),
    refundEscrow: jspb.Message.getFieldWithDefault(msg, 25, "")
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
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees}
 */
proto.starnamed.x.configuration.v1beta1.Fees.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.starnamed.x.configuration.v1beta1.Fees;
  return proto.starnamed.x.configuration.v1beta1.Fees.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.starnamed.x.configuration.v1beta1.Fees} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees}
 */
proto.starnamed.x.configuration.v1beta1.Fees.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeeCoinDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeeCoinPrice(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setFeeDefault(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setRegisterAccountClosed(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setRegisterAccountOpen(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransferAccountClosed(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransferAccountOpen(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setReplaceAccountResources(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddAccountCertificate(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setDelAccountCertificate(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.setSetAccountMetadata(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setRegisterDomain1(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.setRegisterDomain2(value);
      break;
    case 14:
      var value = /** @type {string} */ (reader.readString());
      msg.setRegisterDomain3(value);
      break;
    case 15:
      var value = /** @type {string} */ (reader.readString());
      msg.setRegisterDomain4(value);
      break;
    case 16:
      var value = /** @type {string} */ (reader.readString());
      msg.setRegisterDomain5(value);
      break;
    case 17:
      var value = /** @type {string} */ (reader.readString());
      msg.setRegisterDomainDefault(value);
      break;
    case 18:
      var value = /** @type {string} */ (reader.readString());
      msg.setRegisterOpenDomainMultiplier(value);
      break;
    case 19:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransferDomainClosed(value);
      break;
    case 20:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransferDomainOpen(value);
      break;
    case 21:
      var value = /** @type {string} */ (reader.readString());
      msg.setRenewDomainOpen(value);
      break;
    case 22:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreateEscrow(value);
      break;
    case 23:
      var value = /** @type {string} */ (reader.readString());
      msg.setUpdateEscrow(value);
      break;
    case 24:
      var value = /** @type {string} */ (reader.readString());
      msg.setTransferToEscrow(value);
      break;
    case 25:
      var value = /** @type {string} */ (reader.readString());
      msg.setRefundEscrow(value);
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
proto.starnamed.x.configuration.v1beta1.Fees.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.starnamed.x.configuration.v1beta1.Fees.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.starnamed.x.configuration.v1beta1.Fees} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.configuration.v1beta1.Fees.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFeeCoinDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getFeeCoinPrice();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getFeeDefault();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getRegisterAccountClosed();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getRegisterAccountOpen();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getTransferAccountClosed();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getTransferAccountOpen();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getReplaceAccountResources();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getAddAccountCertificate();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getDelAccountCertificate();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getSetAccountMetadata();
  if (f.length > 0) {
    writer.writeString(
      11,
      f
    );
  }
  f = message.getRegisterDomain1();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
  f = message.getRegisterDomain2();
  if (f.length > 0) {
    writer.writeString(
      13,
      f
    );
  }
  f = message.getRegisterDomain3();
  if (f.length > 0) {
    writer.writeString(
      14,
      f
    );
  }
  f = message.getRegisterDomain4();
  if (f.length > 0) {
    writer.writeString(
      15,
      f
    );
  }
  f = message.getRegisterDomain5();
  if (f.length > 0) {
    writer.writeString(
      16,
      f
    );
  }
  f = message.getRegisterDomainDefault();
  if (f.length > 0) {
    writer.writeString(
      17,
      f
    );
  }
  f = message.getRegisterOpenDomainMultiplier();
  if (f.length > 0) {
    writer.writeString(
      18,
      f
    );
  }
  f = message.getTransferDomainClosed();
  if (f.length > 0) {
    writer.writeString(
      19,
      f
    );
  }
  f = message.getTransferDomainOpen();
  if (f.length > 0) {
    writer.writeString(
      20,
      f
    );
  }
  f = message.getRenewDomainOpen();
  if (f.length > 0) {
    writer.writeString(
      21,
      f
    );
  }
  f = message.getCreateEscrow();
  if (f.length > 0) {
    writer.writeString(
      22,
      f
    );
  }
  f = message.getUpdateEscrow();
  if (f.length > 0) {
    writer.writeString(
      23,
      f
    );
  }
  f = message.getTransferToEscrow();
  if (f.length > 0) {
    writer.writeString(
      24,
      f
    );
  }
  f = message.getRefundEscrow();
  if (f.length > 0) {
    writer.writeString(
      25,
      f
    );
  }
};


/**
 * optional string fee_coin_denom = 1;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getFeeCoinDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setFeeCoinDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string fee_coin_price = 2;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getFeeCoinPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setFeeCoinPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string fee_default = 3;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getFeeDefault = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setFeeDefault = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string register_account_closed = 4;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getRegisterAccountClosed = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setRegisterAccountClosed = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string register_account_open = 5;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getRegisterAccountOpen = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setRegisterAccountOpen = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string transfer_account_closed = 6;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getTransferAccountClosed = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setTransferAccountClosed = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string transfer_account_open = 7;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getTransferAccountOpen = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setTransferAccountOpen = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string replace_account_resources = 8;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getReplaceAccountResources = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setReplaceAccountResources = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string add_account_certificate = 9;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getAddAccountCertificate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setAddAccountCertificate = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional string del_account_certificate = 10;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getDelAccountCertificate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setDelAccountCertificate = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * optional string set_account_metadata = 11;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getSetAccountMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setSetAccountMetadata = function(value) {
  return jspb.Message.setProto3StringField(this, 11, value);
};


/**
 * optional string register_domain_1 = 12;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getRegisterDomain1 = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setRegisterDomain1 = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


/**
 * optional string register_domain_2 = 13;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getRegisterDomain2 = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 13, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setRegisterDomain2 = function(value) {
  return jspb.Message.setProto3StringField(this, 13, value);
};


/**
 * optional string register_domain_3 = 14;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getRegisterDomain3 = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 14, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setRegisterDomain3 = function(value) {
  return jspb.Message.setProto3StringField(this, 14, value);
};


/**
 * optional string register_domain_4 = 15;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getRegisterDomain4 = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 15, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setRegisterDomain4 = function(value) {
  return jspb.Message.setProto3StringField(this, 15, value);
};


/**
 * optional string register_domain_5 = 16;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getRegisterDomain5 = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 16, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setRegisterDomain5 = function(value) {
  return jspb.Message.setProto3StringField(this, 16, value);
};


/**
 * optional string register_domain_default = 17;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getRegisterDomainDefault = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 17, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setRegisterDomainDefault = function(value) {
  return jspb.Message.setProto3StringField(this, 17, value);
};


/**
 * optional string register_open_domain_multiplier = 18;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getRegisterOpenDomainMultiplier = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 18, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setRegisterOpenDomainMultiplier = function(value) {
  return jspb.Message.setProto3StringField(this, 18, value);
};


/**
 * optional string transfer_domain_closed = 19;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getTransferDomainClosed = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 19, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setTransferDomainClosed = function(value) {
  return jspb.Message.setProto3StringField(this, 19, value);
};


/**
 * optional string transfer_domain_open = 20;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getTransferDomainOpen = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 20, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setTransferDomainOpen = function(value) {
  return jspb.Message.setProto3StringField(this, 20, value);
};


/**
 * optional string renew_domain_open = 21;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getRenewDomainOpen = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 21, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setRenewDomainOpen = function(value) {
  return jspb.Message.setProto3StringField(this, 21, value);
};


/**
 * optional string create_escrow = 22;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getCreateEscrow = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 22, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setCreateEscrow = function(value) {
  return jspb.Message.setProto3StringField(this, 22, value);
};


/**
 * optional string update_escrow = 23;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getUpdateEscrow = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 23, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setUpdateEscrow = function(value) {
  return jspb.Message.setProto3StringField(this, 23, value);
};


/**
 * optional string transfer_to_escrow = 24;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getTransferToEscrow = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 24, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setTransferToEscrow = function(value) {
  return jspb.Message.setProto3StringField(this, 24, value);
};


/**
 * optional string refund_escrow = 25;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.getRefundEscrow = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 25, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Fees} returns this
 */
proto.starnamed.x.configuration.v1beta1.Fees.prototype.setRefundEscrow = function(value) {
  return jspb.Message.setProto3StringField(this, 25, value);
};


