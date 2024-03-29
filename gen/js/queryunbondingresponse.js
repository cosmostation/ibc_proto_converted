// source: pstake/liquidstakeibc/v1beta1/query.proto
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

goog.provide('proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.pstake.liquidstakeibc.v1beta1.Unbonding');

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
proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.displayName = 'proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse';
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
proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    unbonding: (f = msg.getUnbonding()) && proto.pstake.liquidstakeibc.v1beta1.Unbonding.toObject(includeInstance, f)
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
 * @return {!proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse}
 */
proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse;
  return proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse}
 */
proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.pstake.liquidstakeibc.v1beta1.Unbonding;
      reader.readMessage(value,proto.pstake.liquidstakeibc.v1beta1.Unbonding.deserializeBinaryFromReader);
      msg.setUnbonding(value);
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
proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUnbonding();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.pstake.liquidstakeibc.v1beta1.Unbonding.serializeBinaryToWriter
    );
  }
};


/**
 * optional Unbonding unbonding = 1;
 * @return {?proto.pstake.liquidstakeibc.v1beta1.Unbonding}
 */
proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.prototype.getUnbonding = function() {
  return /** @type{?proto.pstake.liquidstakeibc.v1beta1.Unbonding} */ (
    jspb.Message.getWrapperField(this, proto.pstake.liquidstakeibc.v1beta1.Unbonding, 1));
};


/**
 * @param {?proto.pstake.liquidstakeibc.v1beta1.Unbonding|undefined} value
 * @return {!proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse} returns this
*/
proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.prototype.setUnbonding = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse} returns this
 */
proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.prototype.clearUnbonding = function() {
  return this.setUnbonding(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pstake.liquidstakeibc.v1beta1.QueryUnbondingResponse.prototype.hasUnbonding = function() {
  return jspb.Message.getField(this, 1) != null;
};


