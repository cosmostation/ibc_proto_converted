// source: akash/market/v1beta2/query.proto
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

goog.provide('proto.akash.market.v1beta2.QueryLeaseResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.escrow.v1beta2.FractionalPayment');
goog.require('proto.akash.market.v1beta2.Lease');

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
proto.akash.market.v1beta2.QueryLeaseResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.akash.market.v1beta2.QueryLeaseResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.market.v1beta2.QueryLeaseResponse.displayName = 'proto.akash.market.v1beta2.QueryLeaseResponse';
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
proto.akash.market.v1beta2.QueryLeaseResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.market.v1beta2.QueryLeaseResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.market.v1beta2.QueryLeaseResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.market.v1beta2.QueryLeaseResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    lease: (f = msg.getLease()) && proto.akash.market.v1beta2.Lease.toObject(includeInstance, f),
    escrowPayment: (f = msg.getEscrowPayment()) && proto.akash.escrow.v1beta2.FractionalPayment.toObject(includeInstance, f)
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
 * @return {!proto.akash.market.v1beta2.QueryLeaseResponse}
 */
proto.akash.market.v1beta2.QueryLeaseResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.market.v1beta2.QueryLeaseResponse;
  return proto.akash.market.v1beta2.QueryLeaseResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.market.v1beta2.QueryLeaseResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.market.v1beta2.QueryLeaseResponse}
 */
proto.akash.market.v1beta2.QueryLeaseResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.akash.market.v1beta2.Lease;
      reader.readMessage(value,proto.akash.market.v1beta2.Lease.deserializeBinaryFromReader);
      msg.setLease(value);
      break;
    case 2:
      var value = new proto.akash.escrow.v1beta2.FractionalPayment;
      reader.readMessage(value,proto.akash.escrow.v1beta2.FractionalPayment.deserializeBinaryFromReader);
      msg.setEscrowPayment(value);
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
proto.akash.market.v1beta2.QueryLeaseResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.market.v1beta2.QueryLeaseResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.market.v1beta2.QueryLeaseResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.market.v1beta2.QueryLeaseResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLease();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.akash.market.v1beta2.Lease.serializeBinaryToWriter
    );
  }
  f = message.getEscrowPayment();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.akash.escrow.v1beta2.FractionalPayment.serializeBinaryToWriter
    );
  }
};


/**
 * optional Lease lease = 1;
 * @return {?proto.akash.market.v1beta2.Lease}
 */
proto.akash.market.v1beta2.QueryLeaseResponse.prototype.getLease = function() {
  return /** @type{?proto.akash.market.v1beta2.Lease} */ (
    jspb.Message.getWrapperField(this, proto.akash.market.v1beta2.Lease, 1));
};


/**
 * @param {?proto.akash.market.v1beta2.Lease|undefined} value
 * @return {!proto.akash.market.v1beta2.QueryLeaseResponse} returns this
*/
proto.akash.market.v1beta2.QueryLeaseResponse.prototype.setLease = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.market.v1beta2.QueryLeaseResponse} returns this
 */
proto.akash.market.v1beta2.QueryLeaseResponse.prototype.clearLease = function() {
  return this.setLease(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.market.v1beta2.QueryLeaseResponse.prototype.hasLease = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional akash.escrow.v1beta2.FractionalPayment escrow_payment = 2;
 * @return {?proto.akash.escrow.v1beta2.FractionalPayment}
 */
proto.akash.market.v1beta2.QueryLeaseResponse.prototype.getEscrowPayment = function() {
  return /** @type{?proto.akash.escrow.v1beta2.FractionalPayment} */ (
    jspb.Message.getWrapperField(this, proto.akash.escrow.v1beta2.FractionalPayment, 2));
};


/**
 * @param {?proto.akash.escrow.v1beta2.FractionalPayment|undefined} value
 * @return {!proto.akash.market.v1beta2.QueryLeaseResponse} returns this
*/
proto.akash.market.v1beta2.QueryLeaseResponse.prototype.setEscrowPayment = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.market.v1beta2.QueryLeaseResponse} returns this
 */
proto.akash.market.v1beta2.QueryLeaseResponse.prototype.clearEscrowPayment = function() {
  return this.setEscrowPayment(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.market.v1beta2.QueryLeaseResponse.prototype.hasEscrowPayment = function() {
  return jspb.Message.getField(this, 2) != null;
};


