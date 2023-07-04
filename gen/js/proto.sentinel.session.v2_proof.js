// source: sentinel/session/v2/proof.proto
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

goog.provide('proto.sentinel.session.v2.Proof');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');
goog.require('proto.sentinel.types.v1.Bandwidth');

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
proto.sentinel.session.v2.Proof = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.sentinel.session.v2.Proof, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.sentinel.session.v2.Proof.displayName = 'proto.sentinel.session.v2.Proof';
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
proto.sentinel.session.v2.Proof.prototype.toObject = function(opt_includeInstance) {
  return proto.sentinel.session.v2.Proof.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.sentinel.session.v2.Proof} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.session.v2.Proof.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    bandwidth: (f = msg.getBandwidth()) && proto.sentinel.types.v1.Bandwidth.toObject(includeInstance, f),
    duration: (f = msg.getDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f)
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
 * @return {!proto.sentinel.session.v2.Proof}
 */
proto.sentinel.session.v2.Proof.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.sentinel.session.v2.Proof;
  return proto.sentinel.session.v2.Proof.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.sentinel.session.v2.Proof} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.sentinel.session.v2.Proof}
 */
proto.sentinel.session.v2.Proof.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = new proto.sentinel.types.v1.Bandwidth;
      reader.readMessage(value,proto.sentinel.types.v1.Bandwidth.deserializeBinaryFromReader);
      msg.setBandwidth(value);
      break;
    case 3:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setDuration(value);
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
proto.sentinel.session.v2.Proof.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.sentinel.session.v2.Proof.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.sentinel.session.v2.Proof} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.session.v2.Proof.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getBandwidth();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.sentinel.types.v1.Bandwidth.serializeBinaryToWriter
    );
  }
  f = message.getDuration();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.sentinel.session.v2.Proof.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.sentinel.session.v2.Proof} returns this
 */
proto.sentinel.session.v2.Proof.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional sentinel.types.v1.Bandwidth bandwidth = 2;
 * @return {?proto.sentinel.types.v1.Bandwidth}
 */
proto.sentinel.session.v2.Proof.prototype.getBandwidth = function() {
  return /** @type{?proto.sentinel.types.v1.Bandwidth} */ (
    jspb.Message.getWrapperField(this, proto.sentinel.types.v1.Bandwidth, 2));
};


/**
 * @param {?proto.sentinel.types.v1.Bandwidth|undefined} value
 * @return {!proto.sentinel.session.v2.Proof} returns this
*/
proto.sentinel.session.v2.Proof.prototype.setBandwidth = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.session.v2.Proof} returns this
 */
proto.sentinel.session.v2.Proof.prototype.clearBandwidth = function() {
  return this.setBandwidth(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.session.v2.Proof.prototype.hasBandwidth = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional google.protobuf.Duration duration = 3;
 * @return {?proto.google.protobuf.Duration}
 */
proto.sentinel.session.v2.Proof.prototype.getDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 3));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.sentinel.session.v2.Proof} returns this
*/
proto.sentinel.session.v2.Proof.prototype.setDuration = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.session.v2.Proof} returns this
 */
proto.sentinel.session.v2.Proof.prototype.clearDuration = function() {
  return this.setDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.session.v2.Proof.prototype.hasDuration = function() {
  return jspb.Message.getField(this, 3) != null;
};

