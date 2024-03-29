// source: kyve/query/v1beta1/stakers.proto
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

goog.provide('proto.kyve.query.v1beta1.StakerPoolResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kyve.query.v1beta1.FullStaker');
goog.require('proto.kyve.stakers.v1beta1.Valaccount');

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
proto.kyve.query.v1beta1.StakerPoolResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.query.v1beta1.StakerPoolResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.query.v1beta1.StakerPoolResponse.displayName = 'proto.kyve.query.v1beta1.StakerPoolResponse';
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
proto.kyve.query.v1beta1.StakerPoolResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.query.v1beta1.StakerPoolResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.query.v1beta1.StakerPoolResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.query.v1beta1.StakerPoolResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    staker: (f = msg.getStaker()) && proto.kyve.query.v1beta1.FullStaker.toObject(includeInstance, f),
    valaccount: (f = msg.getValaccount()) && proto.kyve.stakers.v1beta1.Valaccount.toObject(includeInstance, f)
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
 * @return {!proto.kyve.query.v1beta1.StakerPoolResponse}
 */
proto.kyve.query.v1beta1.StakerPoolResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.query.v1beta1.StakerPoolResponse;
  return proto.kyve.query.v1beta1.StakerPoolResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.query.v1beta1.StakerPoolResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.query.v1beta1.StakerPoolResponse}
 */
proto.kyve.query.v1beta1.StakerPoolResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.kyve.query.v1beta1.FullStaker;
      reader.readMessage(value,proto.kyve.query.v1beta1.FullStaker.deserializeBinaryFromReader);
      msg.setStaker(value);
      break;
    case 2:
      var value = new proto.kyve.stakers.v1beta1.Valaccount;
      reader.readMessage(value,proto.kyve.stakers.v1beta1.Valaccount.deserializeBinaryFromReader);
      msg.setValaccount(value);
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
proto.kyve.query.v1beta1.StakerPoolResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.query.v1beta1.StakerPoolResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.query.v1beta1.StakerPoolResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.query.v1beta1.StakerPoolResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getStaker();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.kyve.query.v1beta1.FullStaker.serializeBinaryToWriter
    );
  }
  f = message.getValaccount();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.kyve.stakers.v1beta1.Valaccount.serializeBinaryToWriter
    );
  }
};


/**
 * optional FullStaker staker = 1;
 * @return {?proto.kyve.query.v1beta1.FullStaker}
 */
proto.kyve.query.v1beta1.StakerPoolResponse.prototype.getStaker = function() {
  return /** @type{?proto.kyve.query.v1beta1.FullStaker} */ (
    jspb.Message.getWrapperField(this, proto.kyve.query.v1beta1.FullStaker, 1));
};


/**
 * @param {?proto.kyve.query.v1beta1.FullStaker|undefined} value
 * @return {!proto.kyve.query.v1beta1.StakerPoolResponse} returns this
*/
proto.kyve.query.v1beta1.StakerPoolResponse.prototype.setStaker = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.query.v1beta1.StakerPoolResponse} returns this
 */
proto.kyve.query.v1beta1.StakerPoolResponse.prototype.clearStaker = function() {
  return this.setStaker(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.query.v1beta1.StakerPoolResponse.prototype.hasStaker = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional kyve.stakers.v1beta1.Valaccount valaccount = 2;
 * @return {?proto.kyve.stakers.v1beta1.Valaccount}
 */
proto.kyve.query.v1beta1.StakerPoolResponse.prototype.getValaccount = function() {
  return /** @type{?proto.kyve.stakers.v1beta1.Valaccount} */ (
    jspb.Message.getWrapperField(this, proto.kyve.stakers.v1beta1.Valaccount, 2));
};


/**
 * @param {?proto.kyve.stakers.v1beta1.Valaccount|undefined} value
 * @return {!proto.kyve.query.v1beta1.StakerPoolResponse} returns this
*/
proto.kyve.query.v1beta1.StakerPoolResponse.prototype.setValaccount = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kyve.query.v1beta1.StakerPoolResponse} returns this
 */
proto.kyve.query.v1beta1.StakerPoolResponse.prototype.clearValaccount = function() {
  return this.setValaccount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kyve.query.v1beta1.StakerPoolResponse.prototype.hasValaccount = function() {
  return jspb.Message.getField(this, 2) != null;
};


