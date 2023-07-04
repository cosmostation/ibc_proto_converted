// source: cosmwasm/wasm/v1/proposal.proto
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

goog.provide('proto.cosmwasm.wasm.v1.InstantiateContractProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
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
proto.cosmwasm.wasm.v1.InstantiateContractProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmwasm.wasm.v1.InstantiateContractProposal.repeatedFields_, null);
};
goog.inherits(proto.cosmwasm.wasm.v1.InstantiateContractProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmwasm.wasm.v1.InstantiateContractProposal.displayName = 'proto.cosmwasm.wasm.v1.InstantiateContractProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.repeatedFields_ = [8];



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
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmwasm.wasm.v1.InstantiateContractProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    runAs: jspb.Message.getFieldWithDefault(msg, 3, ""),
    admin: jspb.Message.getFieldWithDefault(msg, 4, ""),
    codeId: jspb.Message.getFieldWithDefault(msg, 5, 0),
    label: jspb.Message.getFieldWithDefault(msg, 6, ""),
    msg: msg.getMsg_asB64(),
    fundsList: jspb.Message.toObjectList(msg.getFundsList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance)
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
 * @return {!proto.cosmwasm.wasm.v1.InstantiateContractProposal}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmwasm.wasm.v1.InstantiateContractProposal;
  return proto.cosmwasm.wasm.v1.InstantiateContractProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmwasm.wasm.v1.InstantiateContractProposal}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {string} */ (reader.readString());
      msg.setRunAs(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setAdmin(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCodeId(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setLabel(value);
      break;
    case 7:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMsg(value);
      break;
    case 8:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addFunds(value);
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
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmwasm.wasm.v1.InstantiateContractProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getRunAs();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAdmin();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getCodeId();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getLabel();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getMsg_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      7,
      f
    );
  }
  f = message.getFundsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      8,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} returns this
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} returns this
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string run_as = 3;
 * @return {string}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.getRunAs = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} returns this
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.setRunAs = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string admin = 4;
 * @return {string}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.getAdmin = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} returns this
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.setAdmin = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional uint64 code_id = 5;
 * @return {number}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.getCodeId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} returns this
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.setCodeId = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional string label = 6;
 * @return {string}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.getLabel = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} returns this
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.setLabel = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional bytes msg = 7;
 * @return {string}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.getMsg = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * optional bytes msg = 7;
 * This is a type-conversion wrapper around `getMsg()`
 * @return {string}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.getMsg_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMsg()));
};


/**
 * optional bytes msg = 7;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMsg()`
 * @return {!Uint8Array}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.getMsg_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMsg()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} returns this
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.setMsg = function(value) {
  return jspb.Message.setProto3BytesField(this, 7, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin funds = 8;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.getFundsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 8));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} returns this
*/
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.setFundsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 8, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.addFunds = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 8, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmwasm.wasm.v1.InstantiateContractProposal} returns this
 */
proto.cosmwasm.wasm.v1.InstantiateContractProposal.prototype.clearFundsList = function() {
  return this.setFundsList([]);
};

