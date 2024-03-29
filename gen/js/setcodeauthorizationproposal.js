// source: stargaze/globalfee/v1/proposal.proto
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

goog.provide('proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization');

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
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.displayName = 'proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal';
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
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    codeAuthorization: (f = msg.getCodeAuthorization()) && proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization.toObject(includeInstance, f)
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
 * @return {!proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal}
 */
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal;
  return proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal}
 */
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = new proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization;
      reader.readMessage(value,proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization.deserializeBinaryFromReader);
      msg.setCodeAuthorization(value);
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
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getCodeAuthorization();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization.serializeBinaryToWriter
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal} returns this
 */
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal} returns this
 */
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional CodeAuthorization code_authorization = 3;
 * @return {?proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization}
 */
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.prototype.getCodeAuthorization = function() {
  return /** @type{?proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization} */ (
    jspb.Message.getWrapperField(this, proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization, 3));
};


/**
 * @param {?proto.publicawesome.stargaze.globalfee.v1.CodeAuthorization|undefined} value
 * @return {!proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal} returns this
*/
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.prototype.setCodeAuthorization = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal} returns this
 */
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.prototype.clearCodeAuthorization = function() {
  return this.setCodeAuthorization(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.publicawesome.stargaze.globalfee.v1.SetCodeAuthorizationProposal.prototype.hasCodeAuthorization = function() {
  return jspb.Message.getField(this, 3) != null;
};


