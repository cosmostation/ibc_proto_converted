// source: persistence/oracle/v1beta1/query.proto
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

goog.provide('proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote');

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
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.repeatedFields_, null);
};
goog.inherits(proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.displayName = 'proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.repeatedFields_ = [1];



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
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    aggregatePrevotesList: jspb.Message.toObjectList(msg.getAggregatePrevotesList(),
    proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote.toObject, includeInstance)
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
 * @return {!proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse}
 */
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse;
  return proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse}
 */
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote;
      reader.readMessage(value,proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote.deserializeBinaryFromReader);
      msg.addAggregatePrevotes(value);
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
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAggregatePrevotesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote.serializeBinaryToWriter
    );
  }
};


/**
 * repeated AggregateExchangeRatePrevote aggregate_prevotes = 1;
 * @return {!Array<!proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote>}
 */
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.prototype.getAggregatePrevotesList = function() {
  return /** @type{!Array<!proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote, 1));
};


/**
 * @param {!Array<!proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote>} value
 * @return {!proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse} returns this
*/
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.prototype.setAggregatePrevotesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote=} opt_value
 * @param {number=} opt_index
 * @return {!proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote}
 */
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.prototype.addAggregatePrevotes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.persistence.oracle.v1beta1.AggregateExchangeRatePrevote, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse} returns this
 */
proto.persistence.oracle.v1beta1.QueryAggregatePrevotesResponse.prototype.clearAggregatePrevotesList = function() {
  return this.setAggregatePrevotesList([]);
};


