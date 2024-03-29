// source: akash/deployment/v1beta2/deploymentmsg.proto
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

goog.provide('proto.akash.deployment.v1beta2.MsgCreateDeployment');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.deployment.v1beta2.DeploymentID');
goog.require('proto.akash.deployment.v1beta2.GroupSpec');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.akash.deployment.v1beta2.MsgCreateDeployment = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.akash.deployment.v1beta2.MsgCreateDeployment.repeatedFields_, null);
};
goog.inherits(proto.akash.deployment.v1beta2.MsgCreateDeployment, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.deployment.v1beta2.MsgCreateDeployment.displayName = 'proto.akash.deployment.v1beta2.MsgCreateDeployment';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.repeatedFields_ = [2];



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
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.deployment.v1beta2.MsgCreateDeployment.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.deployment.v1beta2.MsgCreateDeployment} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: (f = msg.getId()) && proto.akash.deployment.v1beta2.DeploymentID.toObject(includeInstance, f),
    groupsList: jspb.Message.toObjectList(msg.getGroupsList(),
    proto.akash.deployment.v1beta2.GroupSpec.toObject, includeInstance),
    version: msg.getVersion_asB64(),
    deposit: (f = msg.getDeposit()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f),
    depositor: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.akash.deployment.v1beta2.MsgCreateDeployment}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.deployment.v1beta2.MsgCreateDeployment;
  return proto.akash.deployment.v1beta2.MsgCreateDeployment.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.deployment.v1beta2.MsgCreateDeployment} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.deployment.v1beta2.MsgCreateDeployment}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.akash.deployment.v1beta2.DeploymentID;
      reader.readMessage(value,proto.akash.deployment.v1beta2.DeploymentID.deserializeBinaryFromReader);
      msg.setId(value);
      break;
    case 2:
      var value = new proto.akash.deployment.v1beta2.GroupSpec;
      reader.readMessage(value,proto.akash.deployment.v1beta2.GroupSpec.deserializeBinaryFromReader);
      msg.addGroups(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setVersion(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setDeposit(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setDepositor(value);
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
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.deployment.v1beta2.MsgCreateDeployment.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.deployment.v1beta2.MsgCreateDeployment} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.akash.deployment.v1beta2.DeploymentID.serializeBinaryToWriter
    );
  }
  f = message.getGroupsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.akash.deployment.v1beta2.GroupSpec.serializeBinaryToWriter
    );
  }
  f = message.getVersion_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getDeposit();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getDepositor();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional DeploymentID id = 1;
 * @return {?proto.akash.deployment.v1beta2.DeploymentID}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.getId = function() {
  return /** @type{?proto.akash.deployment.v1beta2.DeploymentID} */ (
    jspb.Message.getWrapperField(this, proto.akash.deployment.v1beta2.DeploymentID, 1));
};


/**
 * @param {?proto.akash.deployment.v1beta2.DeploymentID|undefined} value
 * @return {!proto.akash.deployment.v1beta2.MsgCreateDeployment} returns this
*/
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.setId = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.deployment.v1beta2.MsgCreateDeployment} returns this
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.clearId = function() {
  return this.setId(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.hasId = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated GroupSpec groups = 2;
 * @return {!Array<!proto.akash.deployment.v1beta2.GroupSpec>}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.getGroupsList = function() {
  return /** @type{!Array<!proto.akash.deployment.v1beta2.GroupSpec>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.akash.deployment.v1beta2.GroupSpec, 2));
};


/**
 * @param {!Array<!proto.akash.deployment.v1beta2.GroupSpec>} value
 * @return {!proto.akash.deployment.v1beta2.MsgCreateDeployment} returns this
*/
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.setGroupsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.akash.deployment.v1beta2.GroupSpec=} opt_value
 * @param {number=} opt_index
 * @return {!proto.akash.deployment.v1beta2.GroupSpec}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.addGroups = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.akash.deployment.v1beta2.GroupSpec, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.akash.deployment.v1beta2.MsgCreateDeployment} returns this
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.clearGroupsList = function() {
  return this.setGroupsList([]);
};


/**
 * optional bytes version = 3;
 * @return {string}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.getVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes version = 3;
 * This is a type-conversion wrapper around `getVersion()`
 * @return {string}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.getVersion_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getVersion()));
};


/**
 * optional bytes version = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getVersion()`
 * @return {!Uint8Array}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.getVersion_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getVersion()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.akash.deployment.v1beta2.MsgCreateDeployment} returns this
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.setVersion = function(value) {
  return jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional cosmos.base.v1beta1.Coin deposit = 4;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.getDeposit = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 4));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.akash.deployment.v1beta2.MsgCreateDeployment} returns this
*/
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.setDeposit = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.deployment.v1beta2.MsgCreateDeployment} returns this
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.clearDeposit = function() {
  return this.setDeposit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.hasDeposit = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional string depositor = 5;
 * @return {string}
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.getDepositor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.akash.deployment.v1beta2.MsgCreateDeployment} returns this
 */
proto.akash.deployment.v1beta2.MsgCreateDeployment.prototype.setDepositor = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


