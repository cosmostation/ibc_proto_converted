// source: axelar/multisig/v1beta1/genesis.proto
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

goog.provide('proto.axelar.multisig.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.multisig.v1beta1.Key');
goog.require('proto.axelar.multisig.v1beta1.KeyEpoch');
goog.require('proto.axelar.multisig.v1beta1.KeygenSession');
goog.require('proto.axelar.multisig.v1beta1.Params');
goog.require('proto.axelar.multisig.v1beta1.SigningSession');

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
proto.axelar.multisig.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.multisig.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.axelar.multisig.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.multisig.v1beta1.GenesisState.displayName = 'proto.axelar.multisig.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.multisig.v1beta1.GenesisState.repeatedFields_ = [2,3,4,5];



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
proto.axelar.multisig.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.multisig.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.multisig.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.multisig.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.axelar.multisig.v1beta1.Params.toObject(includeInstance, f),
    keygenSessionsList: jspb.Message.toObjectList(msg.getKeygenSessionsList(),
    proto.axelar.multisig.v1beta1.KeygenSession.toObject, includeInstance),
    signingSessionsList: jspb.Message.toObjectList(msg.getSigningSessionsList(),
    proto.axelar.multisig.v1beta1.SigningSession.toObject, includeInstance),
    keysList: jspb.Message.toObjectList(msg.getKeysList(),
    proto.axelar.multisig.v1beta1.Key.toObject, includeInstance),
    keyEpochsList: jspb.Message.toObjectList(msg.getKeyEpochsList(),
    proto.axelar.multisig.v1beta1.KeyEpoch.toObject, includeInstance)
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
 * @return {!proto.axelar.multisig.v1beta1.GenesisState}
 */
proto.axelar.multisig.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.multisig.v1beta1.GenesisState;
  return proto.axelar.multisig.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.multisig.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.multisig.v1beta1.GenesisState}
 */
proto.axelar.multisig.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.axelar.multisig.v1beta1.Params;
      reader.readMessage(value,proto.axelar.multisig.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.axelar.multisig.v1beta1.KeygenSession;
      reader.readMessage(value,proto.axelar.multisig.v1beta1.KeygenSession.deserializeBinaryFromReader);
      msg.addKeygenSessions(value);
      break;
    case 3:
      var value = new proto.axelar.multisig.v1beta1.SigningSession;
      reader.readMessage(value,proto.axelar.multisig.v1beta1.SigningSession.deserializeBinaryFromReader);
      msg.addSigningSessions(value);
      break;
    case 4:
      var value = new proto.axelar.multisig.v1beta1.Key;
      reader.readMessage(value,proto.axelar.multisig.v1beta1.Key.deserializeBinaryFromReader);
      msg.addKeys(value);
      break;
    case 5:
      var value = new proto.axelar.multisig.v1beta1.KeyEpoch;
      reader.readMessage(value,proto.axelar.multisig.v1beta1.KeyEpoch.deserializeBinaryFromReader);
      msg.addKeyEpochs(value);
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
proto.axelar.multisig.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.multisig.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.multisig.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.multisig.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.axelar.multisig.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getKeygenSessionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.axelar.multisig.v1beta1.KeygenSession.serializeBinaryToWriter
    );
  }
  f = message.getSigningSessionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.axelar.multisig.v1beta1.SigningSession.serializeBinaryToWriter
    );
  }
  f = message.getKeysList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.axelar.multisig.v1beta1.Key.serializeBinaryToWriter
    );
  }
  f = message.getKeyEpochsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.axelar.multisig.v1beta1.KeyEpoch.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.axelar.multisig.v1beta1.Params}
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.axelar.multisig.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.axelar.multisig.v1beta1.Params, 1));
};


/**
 * @param {?proto.axelar.multisig.v1beta1.Params|undefined} value
 * @return {!proto.axelar.multisig.v1beta1.GenesisState} returns this
*/
proto.axelar.multisig.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.multisig.v1beta1.GenesisState} returns this
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated KeygenSession keygen_sessions = 2;
 * @return {!Array<!proto.axelar.multisig.v1beta1.KeygenSession>}
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.getKeygenSessionsList = function() {
  return /** @type{!Array<!proto.axelar.multisig.v1beta1.KeygenSession>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.multisig.v1beta1.KeygenSession, 2));
};


/**
 * @param {!Array<!proto.axelar.multisig.v1beta1.KeygenSession>} value
 * @return {!proto.axelar.multisig.v1beta1.GenesisState} returns this
*/
proto.axelar.multisig.v1beta1.GenesisState.prototype.setKeygenSessionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.axelar.multisig.v1beta1.KeygenSession=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession}
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.addKeygenSessions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.axelar.multisig.v1beta1.KeygenSession, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.multisig.v1beta1.GenesisState} returns this
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.clearKeygenSessionsList = function() {
  return this.setKeygenSessionsList([]);
};


/**
 * repeated SigningSession signing_sessions = 3;
 * @return {!Array<!proto.axelar.multisig.v1beta1.SigningSession>}
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.getSigningSessionsList = function() {
  return /** @type{!Array<!proto.axelar.multisig.v1beta1.SigningSession>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.multisig.v1beta1.SigningSession, 3));
};


/**
 * @param {!Array<!proto.axelar.multisig.v1beta1.SigningSession>} value
 * @return {!proto.axelar.multisig.v1beta1.GenesisState} returns this
*/
proto.axelar.multisig.v1beta1.GenesisState.prototype.setSigningSessionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.axelar.multisig.v1beta1.SigningSession=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.multisig.v1beta1.SigningSession}
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.addSigningSessions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.axelar.multisig.v1beta1.SigningSession, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.multisig.v1beta1.GenesisState} returns this
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.clearSigningSessionsList = function() {
  return this.setSigningSessionsList([]);
};


/**
 * repeated Key keys = 4;
 * @return {!Array<!proto.axelar.multisig.v1beta1.Key>}
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.getKeysList = function() {
  return /** @type{!Array<!proto.axelar.multisig.v1beta1.Key>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.multisig.v1beta1.Key, 4));
};


/**
 * @param {!Array<!proto.axelar.multisig.v1beta1.Key>} value
 * @return {!proto.axelar.multisig.v1beta1.GenesisState} returns this
*/
proto.axelar.multisig.v1beta1.GenesisState.prototype.setKeysList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.axelar.multisig.v1beta1.Key=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.multisig.v1beta1.Key}
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.addKeys = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.axelar.multisig.v1beta1.Key, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.multisig.v1beta1.GenesisState} returns this
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.clearKeysList = function() {
  return this.setKeysList([]);
};


/**
 * repeated KeyEpoch key_epochs = 5;
 * @return {!Array<!proto.axelar.multisig.v1beta1.KeyEpoch>}
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.getKeyEpochsList = function() {
  return /** @type{!Array<!proto.axelar.multisig.v1beta1.KeyEpoch>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.multisig.v1beta1.KeyEpoch, 5));
};


/**
 * @param {!Array<!proto.axelar.multisig.v1beta1.KeyEpoch>} value
 * @return {!proto.axelar.multisig.v1beta1.GenesisState} returns this
*/
proto.axelar.multisig.v1beta1.GenesisState.prototype.setKeyEpochsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.axelar.multisig.v1beta1.KeyEpoch=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.multisig.v1beta1.KeyEpoch}
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.addKeyEpochs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.axelar.multisig.v1beta1.KeyEpoch, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.multisig.v1beta1.GenesisState} returns this
 */
proto.axelar.multisig.v1beta1.GenesisState.prototype.clearKeyEpochsList = function() {
  return this.setKeyEpochsList([]);
};


