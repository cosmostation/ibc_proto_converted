// source: injective/wasmx/v1/proposal.proto
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

goog.provide('proto.injective.wasmx.v1.BatchStoreCodeProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmwasm.wasm.v1.StoreCodeProposal');

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
proto.injective.wasmx.v1.BatchStoreCodeProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.injective.wasmx.v1.BatchStoreCodeProposal.repeatedFields_, null);
};
goog.inherits(proto.injective.wasmx.v1.BatchStoreCodeProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.wasmx.v1.BatchStoreCodeProposal.displayName = 'proto.injective.wasmx.v1.BatchStoreCodeProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.repeatedFields_ = [3];



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
proto.injective.wasmx.v1.BatchStoreCodeProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.wasmx.v1.BatchStoreCodeProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.wasmx.v1.BatchStoreCodeProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    proposalsList: jspb.Message.toObjectList(msg.getProposalsList(),
    proto.cosmwasm.wasm.v1.StoreCodeProposal.toObject, includeInstance)
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
 * @return {!proto.injective.wasmx.v1.BatchStoreCodeProposal}
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.wasmx.v1.BatchStoreCodeProposal;
  return proto.injective.wasmx.v1.BatchStoreCodeProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.wasmx.v1.BatchStoreCodeProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.wasmx.v1.BatchStoreCodeProposal}
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = new proto.cosmwasm.wasm.v1.StoreCodeProposal;
      reader.readMessage(value,proto.cosmwasm.wasm.v1.StoreCodeProposal.deserializeBinaryFromReader);
      msg.addProposals(value);
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
proto.injective.wasmx.v1.BatchStoreCodeProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.wasmx.v1.BatchStoreCodeProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.wasmx.v1.BatchStoreCodeProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getProposalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmwasm.wasm.v1.StoreCodeProposal.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.wasmx.v1.BatchStoreCodeProposal} returns this
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.wasmx.v1.BatchStoreCodeProposal} returns this
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated cosmwasm.wasm.v1.StoreCodeProposal proposals = 3;
 * @return {!Array<!proto.cosmwasm.wasm.v1.StoreCodeProposal>}
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.prototype.getProposalsList = function() {
  return /** @type{!Array<!proto.cosmwasm.wasm.v1.StoreCodeProposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmwasm.wasm.v1.StoreCodeProposal, 3));
};


/**
 * @param {!Array<!proto.cosmwasm.wasm.v1.StoreCodeProposal>} value
 * @return {!proto.injective.wasmx.v1.BatchStoreCodeProposal} returns this
*/
proto.injective.wasmx.v1.BatchStoreCodeProposal.prototype.setProposalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmwasm.wasm.v1.StoreCodeProposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmwasm.wasm.v1.StoreCodeProposal}
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.prototype.addProposals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmwasm.wasm.v1.StoreCodeProposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.injective.wasmx.v1.BatchStoreCodeProposal} returns this
 */
proto.injective.wasmx.v1.BatchStoreCodeProposal.prototype.clearProposalsList = function() {
  return this.setProposalsList([]);
};


