// source: cosmos/vesting/v1beta1/vesting.proto
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

goog.provide('proto.cosmos.vesting.v1beta1.ContinuousVestingAccount');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.vesting.v1beta1.BaseVestingAccount');

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
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.vesting.v1beta1.ContinuousVestingAccount, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.displayName = 'proto.cosmos.vesting.v1beta1.ContinuousVestingAccount';
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
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.vesting.v1beta1.ContinuousVestingAccount} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.toObject = function(includeInstance, msg) {
  var f, obj = {
    baseVestingAccount: (f = msg.getBaseVestingAccount()) && proto.cosmos.vesting.v1beta1.BaseVestingAccount.toObject(includeInstance, f),
    startTime: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.cosmos.vesting.v1beta1.ContinuousVestingAccount}
 */
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.vesting.v1beta1.ContinuousVestingAccount;
  return proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.vesting.v1beta1.ContinuousVestingAccount} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.vesting.v1beta1.ContinuousVestingAccount}
 */
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.vesting.v1beta1.BaseVestingAccount;
      reader.readMessage(value,proto.cosmos.vesting.v1beta1.BaseVestingAccount.deserializeBinaryFromReader);
      msg.setBaseVestingAccount(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setStartTime(value);
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
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.vesting.v1beta1.ContinuousVestingAccount} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBaseVestingAccount();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.vesting.v1beta1.BaseVestingAccount.serializeBinaryToWriter
    );
  }
  f = message.getStartTime();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
};


/**
 * optional BaseVestingAccount base_vesting_account = 1;
 * @return {?proto.cosmos.vesting.v1beta1.BaseVestingAccount}
 */
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.prototype.getBaseVestingAccount = function() {
  return /** @type{?proto.cosmos.vesting.v1beta1.BaseVestingAccount} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.vesting.v1beta1.BaseVestingAccount, 1));
};


/**
 * @param {?proto.cosmos.vesting.v1beta1.BaseVestingAccount|undefined} value
 * @return {!proto.cosmos.vesting.v1beta1.ContinuousVestingAccount} returns this
*/
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.prototype.setBaseVestingAccount = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.vesting.v1beta1.ContinuousVestingAccount} returns this
 */
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.prototype.clearBaseVestingAccount = function() {
  return this.setBaseVestingAccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.prototype.hasBaseVestingAccount = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional int64 start_time = 2;
 * @return {number}
 */
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.prototype.getStartTime = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.vesting.v1beta1.ContinuousVestingAccount} returns this
 */
proto.cosmos.vesting.v1beta1.ContinuousVestingAccount.prototype.setStartTime = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


