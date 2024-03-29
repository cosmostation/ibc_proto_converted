// source: stafihub/rvalidator/proposal.proto
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

goog.provide('proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.rvalidator.Cycle');

goog.forwardDeclare('proto.stafihub.stafihub.rvalidator.UpdateRValidatorStatus');
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
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.displayName = 'proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal';
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
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    creator: jspb.Message.getFieldWithDefault(msg, 1, ""),
    denom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    pooladdress: jspb.Message.getFieldWithDefault(msg, 3, ""),
    propid: jspb.Message.getFieldWithDefault(msg, 4, ""),
    cycle: (f = msg.getCycle()) && proto.stafihub.stafihub.rvalidator.Cycle.toObject(includeInstance, f),
    status: jspb.Message.getFieldWithDefault(msg, 6, 0)
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
 * @return {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal}
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal;
  return proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal}
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setPooladdress(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setPropid(value);
      break;
    case 5:
      var value = new proto.stafihub.stafihub.rvalidator.Cycle;
      reader.readMessage(value,proto.stafihub.stafihub.rvalidator.Cycle.deserializeBinaryFromReader);
      msg.setCycle(value);
      break;
    case 6:
      var value = /** @type {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorStatus} */ (reader.readEnum());
      msg.setStatus(value);
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
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getPooladdress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPropid();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getCycle();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.stafihub.stafihub.rvalidator.Cycle.serializeBinaryToWriter
    );
  }
  f = message.getStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      6,
      f
    );
  }
};


/**
 * optional string creator = 1;
 * @return {string}
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal} returns this
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string denom = 2;
 * @return {string}
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal} returns this
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string poolAddress = 3;
 * @return {string}
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.getPooladdress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal} returns this
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.setPooladdress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string propId = 4;
 * @return {string}
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.getPropid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal} returns this
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.setPropid = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional Cycle cycle = 5;
 * @return {?proto.stafihub.stafihub.rvalidator.Cycle}
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.getCycle = function() {
  return /** @type{?proto.stafihub.stafihub.rvalidator.Cycle} */ (
    jspb.Message.getWrapperField(this, proto.stafihub.stafihub.rvalidator.Cycle, 5));
};


/**
 * @param {?proto.stafihub.stafihub.rvalidator.Cycle|undefined} value
 * @return {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal} returns this
*/
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.setCycle = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal} returns this
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.clearCycle = function() {
  return this.setCycle(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.hasCycle = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional UpdateRValidatorStatus status = 6;
 * @return {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorStatus}
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.getStatus = function() {
  return /** @type {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorStatus} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorStatus} value
 * @return {!proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal} returns this
 */
proto.stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal.prototype.setStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 6, value);
};


