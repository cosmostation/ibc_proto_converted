// source: evmos/incentives/v1/incentives.proto
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

goog.provide('proto.evmos.incentives.v1.RegisterIncentiveProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.DecCoin');

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
proto.evmos.incentives.v1.RegisterIncentiveProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.evmos.incentives.v1.RegisterIncentiveProposal.repeatedFields_, null);
};
goog.inherits(proto.evmos.incentives.v1.RegisterIncentiveProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.evmos.incentives.v1.RegisterIncentiveProposal.displayName = 'proto.evmos.incentives.v1.RegisterIncentiveProposal';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.repeatedFields_ = [4];



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
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.evmos.incentives.v1.RegisterIncentiveProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.evmos.incentives.v1.RegisterIncentiveProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    contract: jspb.Message.getFieldWithDefault(msg, 3, ""),
    allocationsList: jspb.Message.toObjectList(msg.getAllocationsList(),
    proto.cosmos.base.v1beta1.DecCoin.toObject, includeInstance),
    epochs: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.evmos.incentives.v1.RegisterIncentiveProposal}
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.evmos.incentives.v1.RegisterIncentiveProposal;
  return proto.evmos.incentives.v1.RegisterIncentiveProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.evmos.incentives.v1.RegisterIncentiveProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.evmos.incentives.v1.RegisterIncentiveProposal}
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setContract(value);
      break;
    case 4:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.addAllocations(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setEpochs(value);
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
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.evmos.incentives.v1.RegisterIncentiveProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.evmos.incentives.v1.RegisterIncentiveProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getContract();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAllocationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
  f = message.getEpochs();
  if (f !== 0) {
    writer.writeUint32(
      5,
      f
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.evmos.incentives.v1.RegisterIncentiveProposal} returns this
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.evmos.incentives.v1.RegisterIncentiveProposal} returns this
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string contract = 3;
 * @return {string}
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.getContract = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.evmos.incentives.v1.RegisterIncentiveProposal} returns this
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.setContract = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * repeated cosmos.base.v1beta1.DecCoin allocations = 4;
 * @return {!Array<!proto.cosmos.base.v1beta1.DecCoin>}
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.getAllocationsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.DecCoin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 4));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.DecCoin>} value
 * @return {!proto.evmos.incentives.v1.RegisterIncentiveProposal} returns this
*/
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.setAllocationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.DecCoin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.DecCoin}
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.addAllocations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.cosmos.base.v1beta1.DecCoin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.evmos.incentives.v1.RegisterIncentiveProposal} returns this
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.clearAllocationsList = function() {
  return this.setAllocationsList([]);
};


/**
 * optional uint32 epochs = 5;
 * @return {number}
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.getEpochs = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.evmos.incentives.v1.RegisterIncentiveProposal} returns this
 */
proto.evmos.incentives.v1.RegisterIncentiveProposal.prototype.setEpochs = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};

