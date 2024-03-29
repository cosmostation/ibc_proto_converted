// source: cosmos/base/tendermint/v1beta1/query.proto
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

goog.provide('proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.cosmos.base.tendermint.v1beta1.Validator');

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
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.repeatedFields_, null);
};
goog.inherits(proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.displayName = 'proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.repeatedFields_ = [2];



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
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    blockHeight: jspb.Message.getFieldWithDefault(msg, 1, 0),
    validatorsList: jspb.Message.toObjectList(msg.getValidatorsList(),
    proto.cosmos.base.tendermint.v1beta1.Validator.toObject, includeInstance),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse}
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse;
  return proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse}
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setBlockHeight(value);
      break;
    case 2:
      var value = new proto.cosmos.base.tendermint.v1beta1.Validator;
      reader.readMessage(value,proto.cosmos.base.tendermint.v1beta1.Validator.deserializeBinaryFromReader);
      msg.addValidators(value);
      break;
    case 3:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBlockHeight();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getValidatorsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.base.tendermint.v1beta1.Validator.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional int64 block_height = 1;
 * @return {number}
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.getBlockHeight = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse} returns this
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.setBlockHeight = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * repeated Validator validators = 2;
 * @return {!Array<!proto.cosmos.base.tendermint.v1beta1.Validator>}
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.getValidatorsList = function() {
  return /** @type{!Array<!proto.cosmos.base.tendermint.v1beta1.Validator>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.tendermint.v1beta1.Validator, 2));
};


/**
 * @param {!Array<!proto.cosmos.base.tendermint.v1beta1.Validator>} value
 * @return {!proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse} returns this
*/
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.setValidatorsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.base.tendermint.v1beta1.Validator=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.tendermint.v1beta1.Validator}
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.addValidators = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.base.tendermint.v1beta1.Validator, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse} returns this
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.clearValidatorsList = function() {
  return this.setValidatorsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 3;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 3));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse} returns this
*/
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse} returns this
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.base.tendermint.v1beta1.GetValidatorSetByHeightResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 3) != null;
};


