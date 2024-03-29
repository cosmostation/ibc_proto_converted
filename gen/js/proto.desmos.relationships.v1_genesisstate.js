// source: desmos/relationships/v1/genesis.proto
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

goog.provide('proto.desmos.relationships.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.desmos.relationships.v1.Relationship');
goog.require('proto.desmos.relationships.v1.UserBlock');

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
proto.desmos.relationships.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.desmos.relationships.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.desmos.relationships.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.relationships.v1.GenesisState.displayName = 'proto.desmos.relationships.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.desmos.relationships.v1.GenesisState.repeatedFields_ = [1,2];



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
proto.desmos.relationships.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.relationships.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.relationships.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.relationships.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    relationshipsList: jspb.Message.toObjectList(msg.getRelationshipsList(),
    proto.desmos.relationships.v1.Relationship.toObject, includeInstance),
    blocksList: jspb.Message.toObjectList(msg.getBlocksList(),
    proto.desmos.relationships.v1.UserBlock.toObject, includeInstance)
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
 * @return {!proto.desmos.relationships.v1.GenesisState}
 */
proto.desmos.relationships.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.relationships.v1.GenesisState;
  return proto.desmos.relationships.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.relationships.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.relationships.v1.GenesisState}
 */
proto.desmos.relationships.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.desmos.relationships.v1.Relationship;
      reader.readMessage(value,proto.desmos.relationships.v1.Relationship.deserializeBinaryFromReader);
      msg.addRelationships(value);
      break;
    case 2:
      var value = new proto.desmos.relationships.v1.UserBlock;
      reader.readMessage(value,proto.desmos.relationships.v1.UserBlock.deserializeBinaryFromReader);
      msg.addBlocks(value);
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
proto.desmos.relationships.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.relationships.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.relationships.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.relationships.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRelationshipsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.desmos.relationships.v1.Relationship.serializeBinaryToWriter
    );
  }
  f = message.getBlocksList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.desmos.relationships.v1.UserBlock.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Relationship relationships = 1;
 * @return {!Array<!proto.desmos.relationships.v1.Relationship>}
 */
proto.desmos.relationships.v1.GenesisState.prototype.getRelationshipsList = function() {
  return /** @type{!Array<!proto.desmos.relationships.v1.Relationship>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.desmos.relationships.v1.Relationship, 1));
};


/**
 * @param {!Array<!proto.desmos.relationships.v1.Relationship>} value
 * @return {!proto.desmos.relationships.v1.GenesisState} returns this
*/
proto.desmos.relationships.v1.GenesisState.prototype.setRelationshipsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.desmos.relationships.v1.Relationship=} opt_value
 * @param {number=} opt_index
 * @return {!proto.desmos.relationships.v1.Relationship}
 */
proto.desmos.relationships.v1.GenesisState.prototype.addRelationships = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.desmos.relationships.v1.Relationship, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.relationships.v1.GenesisState} returns this
 */
proto.desmos.relationships.v1.GenesisState.prototype.clearRelationshipsList = function() {
  return this.setRelationshipsList([]);
};


/**
 * repeated UserBlock blocks = 2;
 * @return {!Array<!proto.desmos.relationships.v1.UserBlock>}
 */
proto.desmos.relationships.v1.GenesisState.prototype.getBlocksList = function() {
  return /** @type{!Array<!proto.desmos.relationships.v1.UserBlock>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.desmos.relationships.v1.UserBlock, 2));
};


/**
 * @param {!Array<!proto.desmos.relationships.v1.UserBlock>} value
 * @return {!proto.desmos.relationships.v1.GenesisState} returns this
*/
proto.desmos.relationships.v1.GenesisState.prototype.setBlocksList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.desmos.relationships.v1.UserBlock=} opt_value
 * @param {number=} opt_index
 * @return {!proto.desmos.relationships.v1.UserBlock}
 */
proto.desmos.relationships.v1.GenesisState.prototype.addBlocks = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.desmos.relationships.v1.UserBlock, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.relationships.v1.GenesisState} returns this
 */
proto.desmos.relationships.v1.GenesisState.prototype.clearBlocksList = function() {
  return this.setBlocksList([]);
};


