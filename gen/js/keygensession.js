// source: axelar/multisig/v1beta1/types.proto
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

goog.provide('proto.axelar.multisig.v1beta1.KeygenSession');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Map');
goog.require('jspb.Message');
goog.require('proto.axelar.multisig.v1beta1.Key');
goog.require('proto.axelar.utils.v1beta1.Threshold');

goog.forwardDeclare('proto.axelar.multisig.exported.v1beta1.MultisigState');
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
proto.axelar.multisig.v1beta1.KeygenSession = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.multisig.v1beta1.KeygenSession, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.multisig.v1beta1.KeygenSession.displayName = 'proto.axelar.multisig.v1beta1.KeygenSession';
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
proto.axelar.multisig.v1beta1.KeygenSession.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.multisig.v1beta1.KeygenSession.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.multisig.v1beta1.KeygenSession} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.multisig.v1beta1.KeygenSession.toObject = function(includeInstance, msg) {
  var f, obj = {
    key: (f = msg.getKey()) && proto.axelar.multisig.v1beta1.Key.toObject(includeInstance, f),
    state: jspb.Message.getFieldWithDefault(msg, 2, 0),
    keygenThreshold: (f = msg.getKeygenThreshold()) && proto.axelar.utils.v1beta1.Threshold.toObject(includeInstance, f),
    expiresAt: jspb.Message.getFieldWithDefault(msg, 4, 0),
    completedAt: jspb.Message.getFieldWithDefault(msg, 5, 0),
    isPubKeyReceivedMap: (f = msg.getIsPubKeyReceivedMap()) ? f.toObject(includeInstance, undefined) : [],
    gracePeriod: jspb.Message.getFieldWithDefault(msg, 7, 0)
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
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession}
 */
proto.axelar.multisig.v1beta1.KeygenSession.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.multisig.v1beta1.KeygenSession;
  return proto.axelar.multisig.v1beta1.KeygenSession.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.multisig.v1beta1.KeygenSession} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession}
 */
proto.axelar.multisig.v1beta1.KeygenSession.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.axelar.multisig.v1beta1.Key;
      reader.readMessage(value,proto.axelar.multisig.v1beta1.Key.deserializeBinaryFromReader);
      msg.setKey(value);
      break;
    case 2:
      var value = /** @type {!proto.axelar.multisig.exported.v1beta1.MultisigState} */ (reader.readEnum());
      msg.setState(value);
      break;
    case 3:
      var value = new proto.axelar.utils.v1beta1.Threshold;
      reader.readMessage(value,proto.axelar.utils.v1beta1.Threshold.deserializeBinaryFromReader);
      msg.setKeygenThreshold(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setExpiresAt(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setCompletedAt(value);
      break;
    case 6:
      var value = msg.getIsPubKeyReceivedMap();
      reader.readMessage(value, function(message, reader) {
        jspb.Map.deserializeBinary(message, reader, jspb.BinaryReader.prototype.readString, jspb.BinaryReader.prototype.readBool, null, "", false);
         });
      break;
    case 7:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setGracePeriod(value);
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
proto.axelar.multisig.v1beta1.KeygenSession.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.multisig.v1beta1.KeygenSession.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.multisig.v1beta1.KeygenSession} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.multisig.v1beta1.KeygenSession.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getKey();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.axelar.multisig.v1beta1.Key.serializeBinaryToWriter
    );
  }
  f = message.getState();
  if (f !== 0.0) {
    writer.writeEnum(
      2,
      f
    );
  }
  f = message.getKeygenThreshold();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.axelar.utils.v1beta1.Threshold.serializeBinaryToWriter
    );
  }
  f = message.getExpiresAt();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
  f = message.getCompletedAt();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getIsPubKeyReceivedMap(true);
  if (f && f.getLength() > 0) {
    f.serializeBinary(6, writer, jspb.BinaryWriter.prototype.writeString, jspb.BinaryWriter.prototype.writeBool);
  }
  f = message.getGracePeriod();
  if (f !== 0) {
    writer.writeInt64(
      7,
      f
    );
  }
};


/**
 * optional Key key = 1;
 * @return {?proto.axelar.multisig.v1beta1.Key}
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.getKey = function() {
  return /** @type{?proto.axelar.multisig.v1beta1.Key} */ (
    jspb.Message.getWrapperField(this, proto.axelar.multisig.v1beta1.Key, 1));
};


/**
 * @param {?proto.axelar.multisig.v1beta1.Key|undefined} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession} returns this
*/
proto.axelar.multisig.v1beta1.KeygenSession.prototype.setKey = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.clearKey = function() {
  return this.setKey(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.hasKey = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional axelar.multisig.exported.v1beta1.MultisigState state = 2;
 * @return {!proto.axelar.multisig.exported.v1beta1.MultisigState}
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.getState = function() {
  return /** @type {!proto.axelar.multisig.exported.v1beta1.MultisigState} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {!proto.axelar.multisig.exported.v1beta1.MultisigState} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.setState = function(value) {
  return jspb.Message.setProto3EnumField(this, 2, value);
};


/**
 * optional axelar.utils.v1beta1.Threshold keygen_threshold = 3;
 * @return {?proto.axelar.utils.v1beta1.Threshold}
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.getKeygenThreshold = function() {
  return /** @type{?proto.axelar.utils.v1beta1.Threshold} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.Threshold, 3));
};


/**
 * @param {?proto.axelar.utils.v1beta1.Threshold|undefined} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession} returns this
*/
proto.axelar.multisig.v1beta1.KeygenSession.prototype.setKeygenThreshold = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.clearKeygenThreshold = function() {
  return this.setKeygenThreshold(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.hasKeygenThreshold = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional int64 expires_at = 4;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.getExpiresAt = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.setExpiresAt = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional int64 completed_at = 5;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.getCompletedAt = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.setCompletedAt = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * map<string, bool> is_pub_key_received = 6;
 * @param {boolean=} opt_noLazyCreate Do not create the map if
 * empty, instead returning `undefined`
 * @return {!jspb.Map<string,boolean>}
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.getIsPubKeyReceivedMap = function(opt_noLazyCreate) {
  return /** @type {!jspb.Map<string,boolean>} */ (
      jspb.Message.getMapField(this, 6, opt_noLazyCreate,
      null));
};


/**
 * Clears values from the map. The map will be non-null.
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.clearIsPubKeyReceivedMap = function() {
  this.getIsPubKeyReceivedMap().clear();
  return this;
};


/**
 * optional int64 grace_period = 7;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.getGracePeriod = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.KeygenSession} returns this
 */
proto.axelar.multisig.v1beta1.KeygenSession.prototype.setGracePeriod = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};

