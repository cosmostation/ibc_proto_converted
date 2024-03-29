// source: provenance/marker/v1/query.proto
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

goog.provide('proto.provenance.marker.v1.QueryHoldingResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.provenance.marker.v1.Balance');

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
proto.provenance.marker.v1.QueryHoldingResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.marker.v1.QueryHoldingResponse.repeatedFields_, null);
};
goog.inherits(proto.provenance.marker.v1.QueryHoldingResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.marker.v1.QueryHoldingResponse.displayName = 'proto.provenance.marker.v1.QueryHoldingResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.marker.v1.QueryHoldingResponse.repeatedFields_ = [1];



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
proto.provenance.marker.v1.QueryHoldingResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.marker.v1.QueryHoldingResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.marker.v1.QueryHoldingResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.QueryHoldingResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    balancesList: jspb.Message.toObjectList(msg.getBalancesList(),
    proto.provenance.marker.v1.Balance.toObject, includeInstance),
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
 * @return {!proto.provenance.marker.v1.QueryHoldingResponse}
 */
proto.provenance.marker.v1.QueryHoldingResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.marker.v1.QueryHoldingResponse;
  return proto.provenance.marker.v1.QueryHoldingResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.marker.v1.QueryHoldingResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.marker.v1.QueryHoldingResponse}
 */
proto.provenance.marker.v1.QueryHoldingResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.marker.v1.Balance;
      reader.readMessage(value,proto.provenance.marker.v1.Balance.deserializeBinaryFromReader);
      msg.addBalances(value);
      break;
    case 2:
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
proto.provenance.marker.v1.QueryHoldingResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.marker.v1.QueryHoldingResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.marker.v1.QueryHoldingResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.QueryHoldingResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBalancesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.provenance.marker.v1.Balance.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Balance balances = 1;
 * @return {!Array<!proto.provenance.marker.v1.Balance>}
 */
proto.provenance.marker.v1.QueryHoldingResponse.prototype.getBalancesList = function() {
  return /** @type{!Array<!proto.provenance.marker.v1.Balance>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.marker.v1.Balance, 1));
};


/**
 * @param {!Array<!proto.provenance.marker.v1.Balance>} value
 * @return {!proto.provenance.marker.v1.QueryHoldingResponse} returns this
*/
proto.provenance.marker.v1.QueryHoldingResponse.prototype.setBalancesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.provenance.marker.v1.Balance=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.marker.v1.Balance}
 */
proto.provenance.marker.v1.QueryHoldingResponse.prototype.addBalances = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.provenance.marker.v1.Balance, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.marker.v1.QueryHoldingResponse} returns this
 */
proto.provenance.marker.v1.QueryHoldingResponse.prototype.clearBalancesList = function() {
  return this.setBalancesList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.provenance.marker.v1.QueryHoldingResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.provenance.marker.v1.QueryHoldingResponse} returns this
*/
proto.provenance.marker.v1.QueryHoldingResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.marker.v1.QueryHoldingResponse} returns this
 */
proto.provenance.marker.v1.QueryHoldingResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.marker.v1.QueryHoldingResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


