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

goog.provide('proto.starnamed.x.configuration.v1beta1.Config');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');

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
proto.starnamed.x.configuration.v1beta1.Config = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.starnamed.x.configuration.v1beta1.Config, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.starnamed.x.configuration.v1beta1.Config.displayName = 'proto.starnamed.x.configuration.v1beta1.Config';
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
proto.starnamed.x.configuration.v1beta1.Config.prototype.toObject = function(opt_includeInstance) {
  return proto.starnamed.x.configuration.v1beta1.Config.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.starnamed.x.configuration.v1beta1.Config} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.configuration.v1beta1.Config.toObject = function(includeInstance, msg) {
  var f, obj = {
    configurer: jspb.Message.getFieldWithDefault(msg, 1, ""),
    validDomainName: jspb.Message.getFieldWithDefault(msg, 2, ""),
    validAccountName: jspb.Message.getFieldWithDefault(msg, 3, ""),
    validUri: jspb.Message.getFieldWithDefault(msg, 4, ""),
    validResource: jspb.Message.getFieldWithDefault(msg, 5, ""),
    domainRenewalPeriod: (f = msg.getDomainRenewalPeriod()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    domainRenewalCountMax: jspb.Message.getFieldWithDefault(msg, 7, 0),
    domainGracePeriod: (f = msg.getDomainGracePeriod()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    accountRenewalPeriod: (f = msg.getAccountRenewalPeriod()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    accountRenewalCountMax: jspb.Message.getFieldWithDefault(msg, 10, 0),
    accountGracePeriod: (f = msg.getAccountGracePeriod()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    resourcesMax: jspb.Message.getFieldWithDefault(msg, 12, 0),
    certificateSizeMax: jspb.Message.getFieldWithDefault(msg, 13, 0),
    certificateCountMax: jspb.Message.getFieldWithDefault(msg, 14, 0),
    metadataSizeMax: jspb.Message.getFieldWithDefault(msg, 15, 0),
    escrowBroker: jspb.Message.getFieldWithDefault(msg, 16, ""),
    escrowCommission: jspb.Message.getFieldWithDefault(msg, 17, ""),
    escrowMaxPeriod: (f = msg.getEscrowMaxPeriod()) && proto.google.protobuf.Duration.toObject(includeInstance, f)
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
 * @return {!proto.starnamed.x.configuration.v1beta1.Config}
 */
proto.starnamed.x.configuration.v1beta1.Config.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.starnamed.x.configuration.v1beta1.Config;
  return proto.starnamed.x.configuration.v1beta1.Config.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.starnamed.x.configuration.v1beta1.Config} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.starnamed.x.configuration.v1beta1.Config}
 */
proto.starnamed.x.configuration.v1beta1.Config.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setConfigurer(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setValidDomainName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setValidAccountName(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setValidUri(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setValidResource(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setDomainRenewalPeriod(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setDomainRenewalCountMax(value);
      break;
    case 8:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setDomainGracePeriod(value);
      break;
    case 9:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setAccountRenewalPeriod(value);
      break;
    case 10:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setAccountRenewalCountMax(value);
      break;
    case 11:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setAccountGracePeriod(value);
      break;
    case 12:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setResourcesMax(value);
      break;
    case 13:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCertificateSizeMax(value);
      break;
    case 14:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setCertificateCountMax(value);
      break;
    case 15:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMetadataSizeMax(value);
      break;
    case 16:
      var value = /** @type {string} */ (reader.readString());
      msg.setEscrowBroker(value);
      break;
    case 17:
      var value = /** @type {string} */ (reader.readString());
      msg.setEscrowCommission(value);
      break;
    case 18:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setEscrowMaxPeriod(value);
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
proto.starnamed.x.configuration.v1beta1.Config.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.starnamed.x.configuration.v1beta1.Config.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.starnamed.x.configuration.v1beta1.Config} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.configuration.v1beta1.Config.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConfigurer();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getValidDomainName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getValidAccountName();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getValidUri();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getValidResource();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getDomainRenewalPeriod();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getDomainRenewalCountMax();
  if (f !== 0) {
    writer.writeUint32(
      7,
      f
    );
  }
  f = message.getDomainGracePeriod();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getAccountRenewalPeriod();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getAccountRenewalCountMax();
  if (f !== 0) {
    writer.writeUint32(
      10,
      f
    );
  }
  f = message.getAccountGracePeriod();
  if (f != null) {
    writer.writeMessage(
      11,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getResourcesMax();
  if (f !== 0) {
    writer.writeUint32(
      12,
      f
    );
  }
  f = message.getCertificateSizeMax();
  if (f !== 0) {
    writer.writeUint64(
      13,
      f
    );
  }
  f = message.getCertificateCountMax();
  if (f !== 0) {
    writer.writeUint32(
      14,
      f
    );
  }
  f = message.getMetadataSizeMax();
  if (f !== 0) {
    writer.writeUint64(
      15,
      f
    );
  }
  f = message.getEscrowBroker();
  if (f.length > 0) {
    writer.writeString(
      16,
      f
    );
  }
  f = message.getEscrowCommission();
  if (f.length > 0) {
    writer.writeString(
      17,
      f
    );
  }
  f = message.getEscrowMaxPeriod();
  if (f != null) {
    writer.writeMessage(
      18,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
};


/**
 * optional string configurer = 1;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getConfigurer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setConfigurer = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string valid_domain_name = 2;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getValidDomainName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setValidDomainName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string valid_account_name = 3;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getValidAccountName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setValidAccountName = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string valid_uri = 4;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getValidUri = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setValidUri = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string valid_resource = 5;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getValidResource = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setValidResource = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional google.protobuf.Duration domain_renewal_period = 6;
 * @return {?proto.google.protobuf.Duration}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getDomainRenewalPeriod = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 6));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
*/
proto.starnamed.x.configuration.v1beta1.Config.prototype.setDomainRenewalPeriod = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.clearDomainRenewalPeriod = function() {
  return this.setDomainRenewalPeriod(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.hasDomainRenewalPeriod = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional uint32 domain_renewal_count_max = 7;
 * @return {number}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getDomainRenewalCountMax = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setDomainRenewalCountMax = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional google.protobuf.Duration domain_grace_period = 8;
 * @return {?proto.google.protobuf.Duration}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getDomainGracePeriod = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 8));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
*/
proto.starnamed.x.configuration.v1beta1.Config.prototype.setDomainGracePeriod = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.clearDomainGracePeriod = function() {
  return this.setDomainGracePeriod(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.hasDomainGracePeriod = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional google.protobuf.Duration account_renewal_period = 9;
 * @return {?proto.google.protobuf.Duration}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getAccountRenewalPeriod = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 9));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
*/
proto.starnamed.x.configuration.v1beta1.Config.prototype.setAccountRenewalPeriod = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.clearAccountRenewalPeriod = function() {
  return this.setAccountRenewalPeriod(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.hasAccountRenewalPeriod = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional uint32 account_renewal_count_max = 10;
 * @return {number}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getAccountRenewalCountMax = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 10, 0));
};


/**
 * @param {number} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setAccountRenewalCountMax = function(value) {
  return jspb.Message.setProto3IntField(this, 10, value);
};


/**
 * optional google.protobuf.Duration account_grace_period = 11;
 * @return {?proto.google.protobuf.Duration}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getAccountGracePeriod = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 11));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
*/
proto.starnamed.x.configuration.v1beta1.Config.prototype.setAccountGracePeriod = function(value) {
  return jspb.Message.setWrapperField(this, 11, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.clearAccountGracePeriod = function() {
  return this.setAccountGracePeriod(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.hasAccountGracePeriod = function() {
  return jspb.Message.getField(this, 11) != null;
};


/**
 * optional uint32 resources_max = 12;
 * @return {number}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getResourcesMax = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {number} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setResourcesMax = function(value) {
  return jspb.Message.setProto3IntField(this, 12, value);
};


/**
 * optional uint64 certificate_size_max = 13;
 * @return {number}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getCertificateSizeMax = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 13, 0));
};


/**
 * @param {number} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setCertificateSizeMax = function(value) {
  return jspb.Message.setProto3IntField(this, 13, value);
};


/**
 * optional uint32 certificate_count_max = 14;
 * @return {number}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getCertificateCountMax = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 14, 0));
};


/**
 * @param {number} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setCertificateCountMax = function(value) {
  return jspb.Message.setProto3IntField(this, 14, value);
};


/**
 * optional uint64 metadata_size_max = 15;
 * @return {number}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getMetadataSizeMax = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 15, 0));
};


/**
 * @param {number} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setMetadataSizeMax = function(value) {
  return jspb.Message.setProto3IntField(this, 15, value);
};


/**
 * optional string escrow_broker = 16;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getEscrowBroker = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 16, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setEscrowBroker = function(value) {
  return jspb.Message.setProto3StringField(this, 16, value);
};


/**
 * optional string escrow_commission = 17;
 * @return {string}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getEscrowCommission = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 17, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.setEscrowCommission = function(value) {
  return jspb.Message.setProto3StringField(this, 17, value);
};


/**
 * optional google.protobuf.Duration escrow_max_period = 18;
 * @return {?proto.google.protobuf.Duration}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.getEscrowMaxPeriod = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 18));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
*/
proto.starnamed.x.configuration.v1beta1.Config.prototype.setEscrowMaxPeriod = function(value) {
  return jspb.Message.setWrapperField(this, 18, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.starnamed.x.configuration.v1beta1.Config} returns this
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.clearEscrowMaxPeriod = function() {
  return this.setEscrowMaxPeriod(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.starnamed.x.configuration.v1beta1.Config.prototype.hasEscrowMaxPeriod = function() {
  return jspb.Message.getField(this, 18) != null;
};

