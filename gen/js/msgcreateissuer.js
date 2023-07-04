// source: em/authority/v1/tx.proto
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

goog.provide('proto.em.authority.v1.MsgCreateIssuer');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.em.authority.v1.Denomination');

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
proto.em.authority.v1.MsgCreateIssuer = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.em.authority.v1.MsgCreateIssuer.repeatedFields_, null);
};
goog.inherits(proto.em.authority.v1.MsgCreateIssuer, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.em.authority.v1.MsgCreateIssuer.displayName = 'proto.em.authority.v1.MsgCreateIssuer';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.em.authority.v1.MsgCreateIssuer.repeatedFields_ = [3];



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
proto.em.authority.v1.MsgCreateIssuer.prototype.toObject = function(opt_includeInstance) {
  return proto.em.authority.v1.MsgCreateIssuer.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.em.authority.v1.MsgCreateIssuer} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.authority.v1.MsgCreateIssuer.toObject = function(includeInstance, msg) {
  var f, obj = {
    authority: jspb.Message.getFieldWithDefault(msg, 1, ""),
    issuer: jspb.Message.getFieldWithDefault(msg, 2, ""),
    denominationsList: jspb.Message.toObjectList(msg.getDenominationsList(),
    proto.em.authority.v1.Denomination.toObject, includeInstance)
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
 * @return {!proto.em.authority.v1.MsgCreateIssuer}
 */
proto.em.authority.v1.MsgCreateIssuer.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.em.authority.v1.MsgCreateIssuer;
  return proto.em.authority.v1.MsgCreateIssuer.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.em.authority.v1.MsgCreateIssuer} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.em.authority.v1.MsgCreateIssuer}
 */
proto.em.authority.v1.MsgCreateIssuer.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAuthority(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setIssuer(value);
      break;
    case 3:
      var value = new proto.em.authority.v1.Denomination;
      reader.readMessage(value,proto.em.authority.v1.Denomination.deserializeBinaryFromReader);
      msg.addDenominations(value);
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
proto.em.authority.v1.MsgCreateIssuer.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.em.authority.v1.MsgCreateIssuer.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.em.authority.v1.MsgCreateIssuer} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.authority.v1.MsgCreateIssuer.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAuthority();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getIssuer();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getDenominationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.em.authority.v1.Denomination.serializeBinaryToWriter
    );
  }
};


/**
 * optional string authority = 1;
 * @return {string}
 */
proto.em.authority.v1.MsgCreateIssuer.prototype.getAuthority = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.authority.v1.MsgCreateIssuer} returns this
 */
proto.em.authority.v1.MsgCreateIssuer.prototype.setAuthority = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string issuer = 2;
 * @return {string}
 */
proto.em.authority.v1.MsgCreateIssuer.prototype.getIssuer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.authority.v1.MsgCreateIssuer} returns this
 */
proto.em.authority.v1.MsgCreateIssuer.prototype.setIssuer = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated Denomination denominations = 3;
 * @return {!Array<!proto.em.authority.v1.Denomination>}
 */
proto.em.authority.v1.MsgCreateIssuer.prototype.getDenominationsList = function() {
  return /** @type{!Array<!proto.em.authority.v1.Denomination>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.em.authority.v1.Denomination, 3));
};


/**
 * @param {!Array<!proto.em.authority.v1.Denomination>} value
 * @return {!proto.em.authority.v1.MsgCreateIssuer} returns this
*/
proto.em.authority.v1.MsgCreateIssuer.prototype.setDenominationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.em.authority.v1.Denomination=} opt_value
 * @param {number=} opt_index
 * @return {!proto.em.authority.v1.Denomination}
 */
proto.em.authority.v1.MsgCreateIssuer.prototype.addDenominations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.em.authority.v1.Denomination, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.em.authority.v1.MsgCreateIssuer} returns this
 */
proto.em.authority.v1.MsgCreateIssuer.prototype.clearDenominationsList = function() {
  return this.setDenominationsList([]);
};

