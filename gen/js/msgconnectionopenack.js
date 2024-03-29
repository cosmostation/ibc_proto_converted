// source: ibc/core/connection/v1/tx.proto
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

goog.provide('proto.ibc.core.connection.v1.MsgConnectionOpenAck');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');
goog.require('proto.ibc.core.client.v1.Height');
goog.require('proto.ibc.core.connection.v1.Version');

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
proto.ibc.core.connection.v1.MsgConnectionOpenAck = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.core.connection.v1.MsgConnectionOpenAck, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.core.connection.v1.MsgConnectionOpenAck.displayName = 'proto.ibc.core.connection.v1.MsgConnectionOpenAck';
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
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.core.connection.v1.MsgConnectionOpenAck.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.toObject = function(includeInstance, msg) {
  var f, obj = {
    connectionId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    counterpartyConnectionId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    version: (f = msg.getVersion()) && proto.ibc.core.connection.v1.Version.toObject(includeInstance, f),
    clientState: (f = msg.getClientState()) && proto.google.protobuf.Any.toObject(includeInstance, f),
    proofHeight: (f = msg.getProofHeight()) && proto.ibc.core.client.v1.Height.toObject(includeInstance, f),
    proofTry: msg.getProofTry_asB64(),
    proofClient: msg.getProofClient_asB64(),
    proofConsensus: msg.getProofConsensus_asB64(),
    consensusHeight: (f = msg.getConsensusHeight()) && proto.ibc.core.client.v1.Height.toObject(includeInstance, f),
    signer: jspb.Message.getFieldWithDefault(msg, 10, ""),
    hostConsensusStateProof: msg.getHostConsensusStateProof_asB64()
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
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.core.connection.v1.MsgConnectionOpenAck;
  return proto.ibc.core.connection.v1.MsgConnectionOpenAck.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setConnectionId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setCounterpartyConnectionId(value);
      break;
    case 3:
      var value = new proto.ibc.core.connection.v1.Version;
      reader.readMessage(value,proto.ibc.core.connection.v1.Version.deserializeBinaryFromReader);
      msg.setVersion(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setClientState(value);
      break;
    case 5:
      var value = new proto.ibc.core.client.v1.Height;
      reader.readMessage(value,proto.ibc.core.client.v1.Height.deserializeBinaryFromReader);
      msg.setProofHeight(value);
      break;
    case 6:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setProofTry(value);
      break;
    case 7:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setProofClient(value);
      break;
    case 8:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setProofConsensus(value);
      break;
    case 9:
      var value = new proto.ibc.core.client.v1.Height;
      reader.readMessage(value,proto.ibc.core.client.v1.Height.deserializeBinaryFromReader);
      msg.setConsensusHeight(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setSigner(value);
      break;
    case 11:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setHostConsensusStateProof(value);
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
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.core.connection.v1.MsgConnectionOpenAck.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getConnectionId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCounterpartyConnectionId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getVersion();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.ibc.core.connection.v1.Version.serializeBinaryToWriter
    );
  }
  f = message.getClientState();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getProofHeight();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.ibc.core.client.v1.Height.serializeBinaryToWriter
    );
  }
  f = message.getProofTry_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      6,
      f
    );
  }
  f = message.getProofClient_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      7,
      f
    );
  }
  f = message.getProofConsensus_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      8,
      f
    );
  }
  f = message.getConsensusHeight();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.ibc.core.client.v1.Height.serializeBinaryToWriter
    );
  }
  f = message.getSigner();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getHostConsensusStateProof_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      11,
      f
    );
  }
};


/**
 * optional string connection_id = 1;
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getConnectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.setConnectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string counterparty_connection_id = 2;
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getCounterpartyConnectionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.setCounterpartyConnectionId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional Version version = 3;
 * @return {?proto.ibc.core.connection.v1.Version}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getVersion = function() {
  return /** @type{?proto.ibc.core.connection.v1.Version} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.connection.v1.Version, 3));
};


/**
 * @param {?proto.ibc.core.connection.v1.Version|undefined} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
*/
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.setVersion = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.clearVersion = function() {
  return this.setVersion(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.hasVersion = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional google.protobuf.Any client_state = 4;
 * @return {?proto.google.protobuf.Any}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getClientState = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 4));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
*/
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.setClientState = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.clearClientState = function() {
  return this.setClientState(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.hasClientState = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional ibc.core.client.v1.Height proof_height = 5;
 * @return {?proto.ibc.core.client.v1.Height}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getProofHeight = function() {
  return /** @type{?proto.ibc.core.client.v1.Height} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.client.v1.Height, 5));
};


/**
 * @param {?proto.ibc.core.client.v1.Height|undefined} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
*/
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.setProofHeight = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.clearProofHeight = function() {
  return this.setProofHeight(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.hasProofHeight = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional bytes proof_try = 6;
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getProofTry = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * optional bytes proof_try = 6;
 * This is a type-conversion wrapper around `getProofTry()`
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getProofTry_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getProofTry()));
};


/**
 * optional bytes proof_try = 6;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getProofTry()`
 * @return {!Uint8Array}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getProofTry_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getProofTry()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.setProofTry = function(value) {
  return jspb.Message.setProto3BytesField(this, 6, value);
};


/**
 * optional bytes proof_client = 7;
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getProofClient = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * optional bytes proof_client = 7;
 * This is a type-conversion wrapper around `getProofClient()`
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getProofClient_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getProofClient()));
};


/**
 * optional bytes proof_client = 7;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getProofClient()`
 * @return {!Uint8Array}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getProofClient_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getProofClient()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.setProofClient = function(value) {
  return jspb.Message.setProto3BytesField(this, 7, value);
};


/**
 * optional bytes proof_consensus = 8;
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getProofConsensus = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * optional bytes proof_consensus = 8;
 * This is a type-conversion wrapper around `getProofConsensus()`
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getProofConsensus_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getProofConsensus()));
};


/**
 * optional bytes proof_consensus = 8;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getProofConsensus()`
 * @return {!Uint8Array}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getProofConsensus_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getProofConsensus()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.setProofConsensus = function(value) {
  return jspb.Message.setProto3BytesField(this, 8, value);
};


/**
 * optional ibc.core.client.v1.Height consensus_height = 9;
 * @return {?proto.ibc.core.client.v1.Height}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getConsensusHeight = function() {
  return /** @type{?proto.ibc.core.client.v1.Height} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.client.v1.Height, 9));
};


/**
 * @param {?proto.ibc.core.client.v1.Height|undefined} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
*/
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.setConsensusHeight = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.clearConsensusHeight = function() {
  return this.setConsensusHeight(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.hasConsensusHeight = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional string signer = 10;
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getSigner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.setSigner = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * optional bytes host_consensus_state_proof = 11;
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getHostConsensusStateProof = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * optional bytes host_consensus_state_proof = 11;
 * This is a type-conversion wrapper around `getHostConsensusStateProof()`
 * @return {string}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getHostConsensusStateProof_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getHostConsensusStateProof()));
};


/**
 * optional bytes host_consensus_state_proof = 11;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getHostConsensusStateProof()`
 * @return {!Uint8Array}
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.getHostConsensusStateProof_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getHostConsensusStateProof()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ibc.core.connection.v1.MsgConnectionOpenAck} returns this
 */
proto.ibc.core.connection.v1.MsgConnectionOpenAck.prototype.setHostConsensusStateProof = function(value) {
  return jspb.Message.setProto3BytesField(this, 11, value);
};


