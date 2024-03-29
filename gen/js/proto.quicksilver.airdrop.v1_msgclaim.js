// source: quicksilver/airdrop/v1/messages.proto
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

goog.provide('proto.quicksilver.airdrop.v1.MsgClaim');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.quicksilver.claimsmanager.v1.Proof');

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
proto.quicksilver.airdrop.v1.MsgClaim = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.quicksilver.airdrop.v1.MsgClaim.repeatedFields_, null);
};
goog.inherits(proto.quicksilver.airdrop.v1.MsgClaim, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quicksilver.airdrop.v1.MsgClaim.displayName = 'proto.quicksilver.airdrop.v1.MsgClaim';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.quicksilver.airdrop.v1.MsgClaim.repeatedFields_ = [4];



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
proto.quicksilver.airdrop.v1.MsgClaim.prototype.toObject = function(opt_includeInstance) {
  return proto.quicksilver.airdrop.v1.MsgClaim.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quicksilver.airdrop.v1.MsgClaim} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.airdrop.v1.MsgClaim.toObject = function(includeInstance, msg) {
  var f, obj = {
    chainId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    action: jspb.Message.getFieldWithDefault(msg, 2, 0),
    address: jspb.Message.getFieldWithDefault(msg, 3, ""),
    proofsList: jspb.Message.toObjectList(msg.getProofsList(),
    proto.quicksilver.claimsmanager.v1.Proof.toObject, includeInstance)
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
 * @return {!proto.quicksilver.airdrop.v1.MsgClaim}
 */
proto.quicksilver.airdrop.v1.MsgClaim.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quicksilver.airdrop.v1.MsgClaim;
  return proto.quicksilver.airdrop.v1.MsgClaim.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quicksilver.airdrop.v1.MsgClaim} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quicksilver.airdrop.v1.MsgClaim}
 */
proto.quicksilver.airdrop.v1.MsgClaim.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setChainId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setAction(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 4:
      var value = new proto.quicksilver.claimsmanager.v1.Proof;
      reader.readMessage(value,proto.quicksilver.claimsmanager.v1.Proof.deserializeBinaryFromReader);
      msg.addProofs(value);
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
proto.quicksilver.airdrop.v1.MsgClaim.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quicksilver.airdrop.v1.MsgClaim.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quicksilver.airdrop.v1.MsgClaim} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.airdrop.v1.MsgClaim.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChainId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAction();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getProofsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.quicksilver.claimsmanager.v1.Proof.serializeBinaryToWriter
    );
  }
};


/**
 * optional string chain_id = 1;
 * @return {string}
 */
proto.quicksilver.airdrop.v1.MsgClaim.prototype.getChainId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.airdrop.v1.MsgClaim} returns this
 */
proto.quicksilver.airdrop.v1.MsgClaim.prototype.setChainId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional int64 action = 2;
 * @return {number}
 */
proto.quicksilver.airdrop.v1.MsgClaim.prototype.getAction = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.quicksilver.airdrop.v1.MsgClaim} returns this
 */
proto.quicksilver.airdrop.v1.MsgClaim.prototype.setAction = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string address = 3;
 * @return {string}
 */
proto.quicksilver.airdrop.v1.MsgClaim.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.airdrop.v1.MsgClaim} returns this
 */
proto.quicksilver.airdrop.v1.MsgClaim.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated quicksilver.claimsmanager.v1.Proof proofs = 4;
 * @return {!Array<!proto.quicksilver.claimsmanager.v1.Proof>}
 */
proto.quicksilver.airdrop.v1.MsgClaim.prototype.getProofsList = function() {
  return /** @type{!Array<!proto.quicksilver.claimsmanager.v1.Proof>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.quicksilver.claimsmanager.v1.Proof, 4));
};


/**
 * @param {!Array<!proto.quicksilver.claimsmanager.v1.Proof>} value
 * @return {!proto.quicksilver.airdrop.v1.MsgClaim} returns this
*/
proto.quicksilver.airdrop.v1.MsgClaim.prototype.setProofsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.quicksilver.claimsmanager.v1.Proof=} opt_value
 * @param {number=} opt_index
 * @return {!proto.quicksilver.claimsmanager.v1.Proof}
 */
proto.quicksilver.airdrop.v1.MsgClaim.prototype.addProofs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.quicksilver.claimsmanager.v1.Proof, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.quicksilver.airdrop.v1.MsgClaim} returns this
 */
proto.quicksilver.airdrop.v1.MsgClaim.prototype.clearProofsList = function() {
  return this.setProofsList([]);
};


