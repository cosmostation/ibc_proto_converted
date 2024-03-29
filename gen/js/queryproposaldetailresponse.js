// source: stafihub/bridge/query.proto
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

goog.provide('proto.stafihub.stafihub.bridge.QueryProposalDetailResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.bridge.Proposal');

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
proto.stafihub.stafihub.bridge.QueryProposalDetailResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stafihub.stafihub.bridge.QueryProposalDetailResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.displayName = 'proto.stafihub.stafihub.bridge.QueryProposalDetailResponse';
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
proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.bridge.QueryProposalDetailResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    proposal: (f = msg.getProposal()) && proto.stafihub.stafihub.bridge.Proposal.toObject(includeInstance, f)
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
 * @return {!proto.stafihub.stafihub.bridge.QueryProposalDetailResponse}
 */
proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.bridge.QueryProposalDetailResponse;
  return proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.bridge.QueryProposalDetailResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.bridge.QueryProposalDetailResponse}
 */
proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stafihub.stafihub.bridge.Proposal;
      reader.readMessage(value,proto.stafihub.stafihub.bridge.Proposal.deserializeBinaryFromReader);
      msg.setProposal(value);
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
proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.bridge.QueryProposalDetailResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProposal();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.stafihub.stafihub.bridge.Proposal.serializeBinaryToWriter
    );
  }
};


/**
 * optional Proposal proposal = 1;
 * @return {?proto.stafihub.stafihub.bridge.Proposal}
 */
proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.prototype.getProposal = function() {
  return /** @type{?proto.stafihub.stafihub.bridge.Proposal} */ (
    jspb.Message.getWrapperField(this, proto.stafihub.stafihub.bridge.Proposal, 1));
};


/**
 * @param {?proto.stafihub.stafihub.bridge.Proposal|undefined} value
 * @return {!proto.stafihub.stafihub.bridge.QueryProposalDetailResponse} returns this
*/
proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.prototype.setProposal = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stafihub.stafihub.bridge.QueryProposalDetailResponse} returns this
 */
proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.prototype.clearProposal = function() {
  return this.setProposal(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stafihub.stafihub.bridge.QueryProposalDetailResponse.prototype.hasProposal = function() {
  return jspb.Message.getField(this, 1) != null;
};


