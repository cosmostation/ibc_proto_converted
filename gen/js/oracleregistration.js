// source: panacea/oracle/v2alpha2/oracle.proto
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

goog.provide('proto.panacea.oracle.v2alpha2.OracleRegistration');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.panacea.oracle.v2alpha2.TallyResult');
goog.require('proto.panacea.oracle.v2alpha2.VotingPeriod');

goog.forwardDeclare('proto.panacea.oracle.v2alpha2.OracleRegistrationStatus');
goog.forwardDeclare('proto.panacea.oracle.v2alpha2.OracleRegistrationType');
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
proto.panacea.oracle.v2alpha2.OracleRegistration = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.panacea.oracle.v2alpha2.OracleRegistration, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.panacea.oracle.v2alpha2.OracleRegistration.displayName = 'proto.panacea.oracle.v2alpha2.OracleRegistration';
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
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.toObject = function(opt_includeInstance) {
  return proto.panacea.oracle.v2alpha2.OracleRegistration.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.panacea.oracle.v2alpha2.OracleRegistration} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.toObject = function(includeInstance, msg) {
  var f, obj = {
    uniqueId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    address: jspb.Message.getFieldWithDefault(msg, 2, ""),
    nodePubKey: msg.getNodePubKey_asB64(),
    nodePubKeyRemoteReport: msg.getNodePubKeyRemoteReport_asB64(),
    trustedBlockHeight: jspb.Message.getFieldWithDefault(msg, 5, 0),
    trustedBlockHash: msg.getTrustedBlockHash_asB64(),
    encryptedOraclePrivKey: msg.getEncryptedOraclePrivKey_asB64(),
    status: jspb.Message.getFieldWithDefault(msg, 8, 0),
    votingPeriod: (f = msg.getVotingPeriod()) && proto.panacea.oracle.v2alpha2.VotingPeriod.toObject(includeInstance, f),
    tallyResult: (f = msg.getTallyResult()) && proto.panacea.oracle.v2alpha2.TallyResult.toObject(includeInstance, f),
    nonce: msg.getNonce_asB64(),
    registrationType: jspb.Message.getFieldWithDefault(msg, 12, 0)
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
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.panacea.oracle.v2alpha2.OracleRegistration;
  return proto.panacea.oracle.v2alpha2.OracleRegistration.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.panacea.oracle.v2alpha2.OracleRegistration} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setUniqueId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setNodePubKey(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setNodePubKeyRemoteReport(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setTrustedBlockHeight(value);
      break;
    case 6:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setTrustedBlockHash(value);
      break;
    case 7:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setEncryptedOraclePrivKey(value);
      break;
    case 8:
      var value = /** @type {!proto.panacea.oracle.v2alpha2.OracleRegistrationStatus} */ (reader.readEnum());
      msg.setStatus(value);
      break;
    case 9:
      var value = new proto.panacea.oracle.v2alpha2.VotingPeriod;
      reader.readMessage(value,proto.panacea.oracle.v2alpha2.VotingPeriod.deserializeBinaryFromReader);
      msg.setVotingPeriod(value);
      break;
    case 10:
      var value = new proto.panacea.oracle.v2alpha2.TallyResult;
      reader.readMessage(value,proto.panacea.oracle.v2alpha2.TallyResult.deserializeBinaryFromReader);
      msg.setTallyResult(value);
      break;
    case 11:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setNonce(value);
      break;
    case 12:
      var value = /** @type {!proto.panacea.oracle.v2alpha2.OracleRegistrationType} */ (reader.readEnum());
      msg.setRegistrationType(value);
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
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.panacea.oracle.v2alpha2.OracleRegistration.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.panacea.oracle.v2alpha2.OracleRegistration} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUniqueId();
  if (f.length > 0) {
    writer.writeString(
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
  f = message.getNodePubKey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getNodePubKeyRemoteReport_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getTrustedBlockHeight();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getTrustedBlockHash_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      6,
      f
    );
  }
  f = message.getEncryptedOraclePrivKey_asU8();
  if (f.length > 0) {
    writer.writeBytes(
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
  f = message.getVotingPeriod();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.panacea.oracle.v2alpha2.VotingPeriod.serializeBinaryToWriter
    );
  }
  f = message.getTallyResult();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.panacea.oracle.v2alpha2.TallyResult.serializeBinaryToWriter
    );
  }
  f = message.getNonce_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      11,
      f
    );
  }
  f = message.getRegistrationType();
  if (f !== 0.0) {
    writer.writeEnum(
      12,
      f
    );
  }
};


/**
 * optional string unique_id = 1;
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getUniqueId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setUniqueId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string address = 2;
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional bytes node_pub_key = 3;
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getNodePubKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes node_pub_key = 3;
 * This is a type-conversion wrapper around `getNodePubKey()`
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getNodePubKey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getNodePubKey()));
};


/**
 * optional bytes node_pub_key = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getNodePubKey()`
 * @return {!Uint8Array}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getNodePubKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getNodePubKey()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setNodePubKey = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional bytes node_pub_key_remote_report = 4;
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getNodePubKeyRemoteReport = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes node_pub_key_remote_report = 4;
 * This is a type-conversion wrapper around `getNodePubKeyRemoteReport()`
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getNodePubKeyRemoteReport_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getNodePubKeyRemoteReport()));
};


/**
 * optional bytes node_pub_key_remote_report = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getNodePubKeyRemoteReport()`
 * @return {!Uint8Array}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getNodePubKeyRemoteReport_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getNodePubKeyRemoteReport()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setNodePubKeyRemoteReport = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * optional int64 trusted_block_height = 5;
 * @return {number}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getTrustedBlockHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setTrustedBlockHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional bytes trusted_block_hash = 6;
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getTrustedBlockHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * optional bytes trusted_block_hash = 6;
 * This is a type-conversion wrapper around `getTrustedBlockHash()`
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getTrustedBlockHash_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getTrustedBlockHash()));
};


/**
 * optional bytes trusted_block_hash = 6;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getTrustedBlockHash()`
 * @return {!Uint8Array}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getTrustedBlockHash_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getTrustedBlockHash()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setTrustedBlockHash = function(value) {
  return jspb.Message.setProto3BytesField(this, 6, value);
};


/**
 * optional bytes encrypted_oracle_priv_key = 7;
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getEncryptedOraclePrivKey = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * optional bytes encrypted_oracle_priv_key = 7;
 * This is a type-conversion wrapper around `getEncryptedOraclePrivKey()`
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getEncryptedOraclePrivKey_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getEncryptedOraclePrivKey()));
};


/**
 * optional bytes encrypted_oracle_priv_key = 7;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getEncryptedOraclePrivKey()`
 * @return {!Uint8Array}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getEncryptedOraclePrivKey_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getEncryptedOraclePrivKey()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setEncryptedOraclePrivKey = function(value) {
  return jspb.Message.setProto3BytesField(this, 7, value);
};


/**
 * optional OracleRegistrationStatus status = 8;
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistrationStatus}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getStatus = function() {
  return /** @type {!proto.panacea.oracle.v2alpha2.OracleRegistrationStatus} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {!proto.panacea.oracle.v2alpha2.OracleRegistrationStatus} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 8, value);
};


/**
 * optional VotingPeriod voting_period = 9;
 * @return {?proto.panacea.oracle.v2alpha2.VotingPeriod}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getVotingPeriod = function() {
  return /** @type{?proto.panacea.oracle.v2alpha2.VotingPeriod} */ (
    jspb.Message.getWrapperField(this, proto.panacea.oracle.v2alpha2.VotingPeriod, 9));
};


/**
 * @param {?proto.panacea.oracle.v2alpha2.VotingPeriod|undefined} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
*/
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setVotingPeriod = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.clearVotingPeriod = function() {
  return this.setVotingPeriod(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.hasVotingPeriod = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional TallyResult tally_result = 10;
 * @return {?proto.panacea.oracle.v2alpha2.TallyResult}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getTallyResult = function() {
  return /** @type{?proto.panacea.oracle.v2alpha2.TallyResult} */ (
    jspb.Message.getWrapperField(this, proto.panacea.oracle.v2alpha2.TallyResult, 10));
};


/**
 * @param {?proto.panacea.oracle.v2alpha2.TallyResult|undefined} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
*/
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setTallyResult = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.clearTallyResult = function() {
  return this.setTallyResult(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.hasTallyResult = function() {
  return jspb.Message.getField(this, 10) != null;
};


/**
 * optional bytes nonce = 11;
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getNonce = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * optional bytes nonce = 11;
 * This is a type-conversion wrapper around `getNonce()`
 * @return {string}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getNonce_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getNonce()));
};


/**
 * optional bytes nonce = 11;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getNonce()`
 * @return {!Uint8Array}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getNonce_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getNonce()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setNonce = function(value) {
  return jspb.Message.setProto3BytesField(this, 11, value);
};


/**
 * optional OracleRegistrationType registration_type = 12;
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistrationType}
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.getRegistrationType = function() {
  return /** @type {!proto.panacea.oracle.v2alpha2.OracleRegistrationType} */ (jspb.Message.getFieldWithDefault(this, 12, 0));
};


/**
 * @param {!proto.panacea.oracle.v2alpha2.OracleRegistrationType} value
 * @return {!proto.panacea.oracle.v2alpha2.OracleRegistration} returns this
 */
proto.panacea.oracle.v2alpha2.OracleRegistration.prototype.setRegistrationType = function(value) {
  return jspb.Message.setProto3EnumField(this, 12, value);
};


