// source: capability/v1/genesis.proto
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

goog.provide('proto.capability.v1.GenesisOwners');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.capability.v1.CapabilityOwners');

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
proto.capability.v1.GenesisOwners = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.capability.v1.GenesisOwners, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.capability.v1.GenesisOwners.displayName = 'proto.capability.v1.GenesisOwners';
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
proto.capability.v1.GenesisOwners.prototype.toObject = function(opt_includeInstance) {
  return proto.capability.v1.GenesisOwners.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.capability.v1.GenesisOwners} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.capability.v1.GenesisOwners.toObject = function(includeInstance, msg) {
  var f, obj = {
    index: jspb.Message.getFieldWithDefault(msg, 1, 0),
    indexOwners: (f = msg.getIndexOwners()) && proto.capability.v1.CapabilityOwners.toObject(includeInstance, f)
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
 * @return {!proto.capability.v1.GenesisOwners}
 */
proto.capability.v1.GenesisOwners.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.capability.v1.GenesisOwners;
  return proto.capability.v1.GenesisOwners.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.capability.v1.GenesisOwners} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.capability.v1.GenesisOwners}
 */
proto.capability.v1.GenesisOwners.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setIndex(value);
      break;
    case 2:
      var value = new proto.capability.v1.CapabilityOwners;
      reader.readMessage(value,proto.capability.v1.CapabilityOwners.deserializeBinaryFromReader);
      msg.setIndexOwners(value);
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
proto.capability.v1.GenesisOwners.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.capability.v1.GenesisOwners.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.capability.v1.GenesisOwners} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.capability.v1.GenesisOwners.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIndex();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getIndexOwners();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.capability.v1.CapabilityOwners.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 index = 1;
 * @return {number}
 */
proto.capability.v1.GenesisOwners.prototype.getIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.capability.v1.GenesisOwners} returns this
 */
proto.capability.v1.GenesisOwners.prototype.setIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional CapabilityOwners index_owners = 2;
 * @return {?proto.capability.v1.CapabilityOwners}
 */
proto.capability.v1.GenesisOwners.prototype.getIndexOwners = function() {
  return /** @type{?proto.capability.v1.CapabilityOwners} */ (
    jspb.Message.getWrapperField(this, proto.capability.v1.CapabilityOwners, 2));
};


/**
 * @param {?proto.capability.v1.CapabilityOwners|undefined} value
 * @return {!proto.capability.v1.GenesisOwners} returns this
*/
proto.capability.v1.GenesisOwners.prototype.setIndexOwners = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.capability.v1.GenesisOwners} returns this
 */
proto.capability.v1.GenesisOwners.prototype.clearIndexOwners = function() {
  return this.setIndexOwners(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.capability.v1.GenesisOwners.prototype.hasIndexOwners = function() {
  return jspb.Message.getField(this, 2) != null;
};


