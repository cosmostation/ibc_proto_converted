// source: cosmos/gov/v1beta1/query.proto
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

goog.provide('proto.cosmos.gov.v1beta1.QueryProposalsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.cosmos.gov.v1beta1.Proposal');

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
proto.cosmos.gov.v1beta1.QueryProposalsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.gov.v1beta1.QueryProposalsResponse.repeatedFields_, null);
};
goog.inherits(proto.cosmos.gov.v1beta1.QueryProposalsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.gov.v1beta1.QueryProposalsResponse.displayName = 'proto.cosmos.gov.v1beta1.QueryProposalsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.gov.v1beta1.QueryProposalsResponse.repeatedFields_ = [1];



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
proto.cosmos.gov.v1beta1.QueryProposalsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.gov.v1beta1.QueryProposalsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.gov.v1beta1.QueryProposalsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.gov.v1beta1.QueryProposalsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    proposalsList: jspb.Message.toObjectList(msg.getProposalsList(),
    proto.cosmos.gov.v1beta1.Proposal.toObject, includeInstance),
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
 * @return {!proto.cosmos.gov.v1beta1.QueryProposalsResponse}
 */
proto.cosmos.gov.v1beta1.QueryProposalsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.gov.v1beta1.QueryProposalsResponse;
  return proto.cosmos.gov.v1beta1.QueryProposalsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.gov.v1beta1.QueryProposalsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.gov.v1beta1.QueryProposalsResponse}
 */
proto.cosmos.gov.v1beta1.QueryProposalsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.gov.v1beta1.Proposal;
      reader.readMessage(value,proto.cosmos.gov.v1beta1.Proposal.deserializeBinaryFromReader);
      msg.addProposals(value);
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
proto.cosmos.gov.v1beta1.QueryProposalsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.gov.v1beta1.QueryProposalsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.gov.v1beta1.QueryProposalsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.gov.v1beta1.QueryProposalsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProposalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.gov.v1beta1.Proposal.serializeBinaryToWriter
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
 * repeated Proposal proposals = 1;
 * @return {!Array<!proto.cosmos.gov.v1beta1.Proposal>}
 */
proto.cosmos.gov.v1beta1.QueryProposalsResponse.prototype.getProposalsList = function() {
  return /** @type{!Array<!proto.cosmos.gov.v1beta1.Proposal>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.gov.v1beta1.Proposal, 1));
};


/**
 * @param {!Array<!proto.cosmos.gov.v1beta1.Proposal>} value
 * @return {!proto.cosmos.gov.v1beta1.QueryProposalsResponse} returns this
*/
proto.cosmos.gov.v1beta1.QueryProposalsResponse.prototype.setProposalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.gov.v1beta1.Proposal=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.gov.v1beta1.Proposal}
 */
proto.cosmos.gov.v1beta1.QueryProposalsResponse.prototype.addProposals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.gov.v1beta1.Proposal, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.gov.v1beta1.QueryProposalsResponse} returns this
 */
proto.cosmos.gov.v1beta1.QueryProposalsResponse.prototype.clearProposalsList = function() {
  return this.setProposalsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.cosmos.gov.v1beta1.QueryProposalsResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.cosmos.gov.v1beta1.QueryProposalsResponse} returns this
*/
proto.cosmos.gov.v1beta1.QueryProposalsResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.gov.v1beta1.QueryProposalsResponse} returns this
 */
proto.cosmos.gov.v1beta1.QueryProposalsResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.gov.v1beta1.QueryProposalsResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


