// source: ixo/claims/v1beta1/authz.proto
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

goog.provide('proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ixo.claims.v1beta1.WithdrawPaymentConstraints');

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
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.repeatedFields_, null);
};
goog.inherits(proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.displayName = 'proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.repeatedFields_ = [2];



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
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.toObject = function(includeInstance, msg) {
  var f, obj = {
    admin: jspb.Message.getFieldWithDefault(msg, 1, ""),
    constraintsList: jspb.Message.toObjectList(msg.getConstraintsList(),
    proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.toObject, includeInstance)
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
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization;
  return proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAdmin(value);
      break;
    case 2:
      var value = new proto.ixo.claims.v1beta1.WithdrawPaymentConstraints;
      reader.readMessage(value,proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.deserializeBinaryFromReader);
      msg.addConstraints(value);
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
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAdmin();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getConstraintsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.ixo.claims.v1beta1.WithdrawPaymentConstraints.serializeBinaryToWriter
    );
  }
};


/**
 * optional string admin = 1;
 * @return {string}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.prototype.getAdmin = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization} returns this
 */
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.prototype.setAdmin = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated WithdrawPaymentConstraints constraints = 2;
 * @return {!Array<!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints>}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.prototype.getConstraintsList = function() {
  return /** @type{!Array<!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ixo.claims.v1beta1.WithdrawPaymentConstraints, 2));
};


/**
 * @param {!Array<!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints>} value
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization} returns this
*/
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.prototype.setConstraintsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentConstraints}
 */
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.prototype.addConstraints = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.ixo.claims.v1beta1.WithdrawPaymentConstraints, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization} returns this
 */
proto.ixo.claims.v1beta1.WithdrawPaymentAuthorization.prototype.clearConstraintsList = function() {
  return this.setConstraintsList([]);
};


