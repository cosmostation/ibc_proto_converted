// source: likechain/likenft/v1/royalty_config.proto
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

goog.provide('proto.likechain.likenft.v1.RoyaltyConfigInput');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.likechain.likenft.v1.RoyaltyStakeholderInput');

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
proto.likechain.likenft.v1.RoyaltyConfigInput = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.likechain.likenft.v1.RoyaltyConfigInput.repeatedFields_, null);
};
goog.inherits(proto.likechain.likenft.v1.RoyaltyConfigInput, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.likenft.v1.RoyaltyConfigInput.displayName = 'proto.likechain.likenft.v1.RoyaltyConfigInput';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.likechain.likenft.v1.RoyaltyConfigInput.repeatedFields_ = [2];



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
proto.likechain.likenft.v1.RoyaltyConfigInput.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.likenft.v1.RoyaltyConfigInput.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.likenft.v1.RoyaltyConfigInput} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.RoyaltyConfigInput.toObject = function(includeInstance, msg) {
  var f, obj = {
    rateBasisPoints: jspb.Message.getFieldWithDefault(msg, 1, 0),
    stakeholdersList: jspb.Message.toObjectList(msg.getStakeholdersList(),
    proto.likechain.likenft.v1.RoyaltyStakeholderInput.toObject, includeInstance)
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
 * @return {!proto.likechain.likenft.v1.RoyaltyConfigInput}
 */
proto.likechain.likenft.v1.RoyaltyConfigInput.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.likenft.v1.RoyaltyConfigInput;
  return proto.likechain.likenft.v1.RoyaltyConfigInput.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.likenft.v1.RoyaltyConfigInput} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.likenft.v1.RoyaltyConfigInput}
 */
proto.likechain.likenft.v1.RoyaltyConfigInput.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setRateBasisPoints(value);
      break;
    case 2:
      var value = new proto.likechain.likenft.v1.RoyaltyStakeholderInput;
      reader.readMessage(value,proto.likechain.likenft.v1.RoyaltyStakeholderInput.deserializeBinaryFromReader);
      msg.addStakeholders(value);
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
proto.likechain.likenft.v1.RoyaltyConfigInput.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.likenft.v1.RoyaltyConfigInput.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.likenft.v1.RoyaltyConfigInput} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.RoyaltyConfigInput.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRateBasisPoints();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getStakeholdersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.likechain.likenft.v1.RoyaltyStakeholderInput.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 rate_basis_points = 1;
 * @return {number}
 */
proto.likechain.likenft.v1.RoyaltyConfigInput.prototype.getRateBasisPoints = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.likechain.likenft.v1.RoyaltyConfigInput} returns this
 */
proto.likechain.likenft.v1.RoyaltyConfigInput.prototype.setRateBasisPoints = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated RoyaltyStakeholderInput stakeholders = 2;
 * @return {!Array<!proto.likechain.likenft.v1.RoyaltyStakeholderInput>}
 */
proto.likechain.likenft.v1.RoyaltyConfigInput.prototype.getStakeholdersList = function() {
  return /** @type{!Array<!proto.likechain.likenft.v1.RoyaltyStakeholderInput>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.likechain.likenft.v1.RoyaltyStakeholderInput, 2));
};


/**
 * @param {!Array<!proto.likechain.likenft.v1.RoyaltyStakeholderInput>} value
 * @return {!proto.likechain.likenft.v1.RoyaltyConfigInput} returns this
*/
proto.likechain.likenft.v1.RoyaltyConfigInput.prototype.setStakeholdersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.likechain.likenft.v1.RoyaltyStakeholderInput=} opt_value
 * @param {number=} opt_index
 * @return {!proto.likechain.likenft.v1.RoyaltyStakeholderInput}
 */
proto.likechain.likenft.v1.RoyaltyConfigInput.prototype.addStakeholders = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.likechain.likenft.v1.RoyaltyStakeholderInput, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.likechain.likenft.v1.RoyaltyConfigInput} returns this
 */
proto.likechain.likenft.v1.RoyaltyConfigInput.prototype.clearStakeholdersList = function() {
  return this.setStakeholdersList([]);
};

