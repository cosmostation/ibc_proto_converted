// source: quicksilver/interchainstaking/v1/genesis.proto
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

goog.provide('proto.quicksilver.interchainstaking.v1.DelegationsForZone');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.quicksilver.interchainstaking.v1.Delegation');

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
proto.quicksilver.interchainstaking.v1.DelegationsForZone = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.quicksilver.interchainstaking.v1.DelegationsForZone.repeatedFields_, null);
};
goog.inherits(proto.quicksilver.interchainstaking.v1.DelegationsForZone, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.quicksilver.interchainstaking.v1.DelegationsForZone.displayName = 'proto.quicksilver.interchainstaking.v1.DelegationsForZone';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.quicksilver.interchainstaking.v1.DelegationsForZone.repeatedFields_ = [2];



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
proto.quicksilver.interchainstaking.v1.DelegationsForZone.prototype.toObject = function(opt_includeInstance) {
  return proto.quicksilver.interchainstaking.v1.DelegationsForZone.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.quicksilver.interchainstaking.v1.DelegationsForZone} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainstaking.v1.DelegationsForZone.toObject = function(includeInstance, msg) {
  var f, obj = {
    chainId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    delegationsList: jspb.Message.toObjectList(msg.getDelegationsList(),
    proto.quicksilver.interchainstaking.v1.Delegation.toObject, includeInstance)
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
 * @return {!proto.quicksilver.interchainstaking.v1.DelegationsForZone}
 */
proto.quicksilver.interchainstaking.v1.DelegationsForZone.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.quicksilver.interchainstaking.v1.DelegationsForZone;
  return proto.quicksilver.interchainstaking.v1.DelegationsForZone.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.quicksilver.interchainstaking.v1.DelegationsForZone} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.quicksilver.interchainstaking.v1.DelegationsForZone}
 */
proto.quicksilver.interchainstaking.v1.DelegationsForZone.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.quicksilver.interchainstaking.v1.Delegation;
      reader.readMessage(value,proto.quicksilver.interchainstaking.v1.Delegation.deserializeBinaryFromReader);
      msg.addDelegations(value);
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
proto.quicksilver.interchainstaking.v1.DelegationsForZone.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.quicksilver.interchainstaking.v1.DelegationsForZone.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.quicksilver.interchainstaking.v1.DelegationsForZone} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.quicksilver.interchainstaking.v1.DelegationsForZone.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getChainId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDelegationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.quicksilver.interchainstaking.v1.Delegation.serializeBinaryToWriter
    );
  }
};


/**
 * optional string chain_id = 1;
 * @return {string}
 */
proto.quicksilver.interchainstaking.v1.DelegationsForZone.prototype.getChainId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.quicksilver.interchainstaking.v1.DelegationsForZone} returns this
 */
proto.quicksilver.interchainstaking.v1.DelegationsForZone.prototype.setChainId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated Delegation delegations = 2;
 * @return {!Array<!proto.quicksilver.interchainstaking.v1.Delegation>}
 */
proto.quicksilver.interchainstaking.v1.DelegationsForZone.prototype.getDelegationsList = function() {
  return /** @type{!Array<!proto.quicksilver.interchainstaking.v1.Delegation>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.quicksilver.interchainstaking.v1.Delegation, 2));
};


/**
 * @param {!Array<!proto.quicksilver.interchainstaking.v1.Delegation>} value
 * @return {!proto.quicksilver.interchainstaking.v1.DelegationsForZone} returns this
*/
proto.quicksilver.interchainstaking.v1.DelegationsForZone.prototype.setDelegationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.quicksilver.interchainstaking.v1.Delegation=} opt_value
 * @param {number=} opt_index
 * @return {!proto.quicksilver.interchainstaking.v1.Delegation}
 */
proto.quicksilver.interchainstaking.v1.DelegationsForZone.prototype.addDelegations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.quicksilver.interchainstaking.v1.Delegation, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.quicksilver.interchainstaking.v1.DelegationsForZone} returns this
 */
proto.quicksilver.interchainstaking.v1.DelegationsForZone.prototype.clearDelegationsList = function() {
  return this.setDelegationsList([]);
};


