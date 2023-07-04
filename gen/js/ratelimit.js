// source: stride/ratelimit/ratelimit.proto
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

goog.provide('proto.stride.ratelimit.RateLimit');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stride.ratelimit.Flow');
goog.require('proto.stride.ratelimit.Path');
goog.require('proto.stride.ratelimit.Quota');

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
proto.stride.ratelimit.RateLimit = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stride.ratelimit.RateLimit, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stride.ratelimit.RateLimit.displayName = 'proto.stride.ratelimit.RateLimit';
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
proto.stride.ratelimit.RateLimit.prototype.toObject = function(opt_includeInstance) {
  return proto.stride.ratelimit.RateLimit.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stride.ratelimit.RateLimit} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.ratelimit.RateLimit.toObject = function(includeInstance, msg) {
  var f, obj = {
    path: (f = msg.getPath()) && proto.stride.ratelimit.Path.toObject(includeInstance, f),
    quota: (f = msg.getQuota()) && proto.stride.ratelimit.Quota.toObject(includeInstance, f),
    flow: (f = msg.getFlow()) && proto.stride.ratelimit.Flow.toObject(includeInstance, f)
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
 * @return {!proto.stride.ratelimit.RateLimit}
 */
proto.stride.ratelimit.RateLimit.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stride.ratelimit.RateLimit;
  return proto.stride.ratelimit.RateLimit.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stride.ratelimit.RateLimit} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stride.ratelimit.RateLimit}
 */
proto.stride.ratelimit.RateLimit.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stride.ratelimit.Path;
      reader.readMessage(value,proto.stride.ratelimit.Path.deserializeBinaryFromReader);
      msg.setPath(value);
      break;
    case 2:
      var value = new proto.stride.ratelimit.Quota;
      reader.readMessage(value,proto.stride.ratelimit.Quota.deserializeBinaryFromReader);
      msg.setQuota(value);
      break;
    case 3:
      var value = new proto.stride.ratelimit.Flow;
      reader.readMessage(value,proto.stride.ratelimit.Flow.deserializeBinaryFromReader);
      msg.setFlow(value);
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
proto.stride.ratelimit.RateLimit.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stride.ratelimit.RateLimit.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stride.ratelimit.RateLimit} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stride.ratelimit.RateLimit.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPath();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.stride.ratelimit.Path.serializeBinaryToWriter
    );
  }
  f = message.getQuota();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.stride.ratelimit.Quota.serializeBinaryToWriter
    );
  }
  f = message.getFlow();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.stride.ratelimit.Flow.serializeBinaryToWriter
    );
  }
};


/**
 * optional Path path = 1;
 * @return {?proto.stride.ratelimit.Path}
 */
proto.stride.ratelimit.RateLimit.prototype.getPath = function() {
  return /** @type{?proto.stride.ratelimit.Path} */ (
    jspb.Message.getWrapperField(this, proto.stride.ratelimit.Path, 1));
};


/**
 * @param {?proto.stride.ratelimit.Path|undefined} value
 * @return {!proto.stride.ratelimit.RateLimit} returns this
*/
proto.stride.ratelimit.RateLimit.prototype.setPath = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stride.ratelimit.RateLimit} returns this
 */
proto.stride.ratelimit.RateLimit.prototype.clearPath = function() {
  return this.setPath(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stride.ratelimit.RateLimit.prototype.hasPath = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Quota quota = 2;
 * @return {?proto.stride.ratelimit.Quota}
 */
proto.stride.ratelimit.RateLimit.prototype.getQuota = function() {
  return /** @type{?proto.stride.ratelimit.Quota} */ (
    jspb.Message.getWrapperField(this, proto.stride.ratelimit.Quota, 2));
};


/**
 * @param {?proto.stride.ratelimit.Quota|undefined} value
 * @return {!proto.stride.ratelimit.RateLimit} returns this
*/
proto.stride.ratelimit.RateLimit.prototype.setQuota = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stride.ratelimit.RateLimit} returns this
 */
proto.stride.ratelimit.RateLimit.prototype.clearQuota = function() {
  return this.setQuota(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stride.ratelimit.RateLimit.prototype.hasQuota = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional Flow flow = 3;
 * @return {?proto.stride.ratelimit.Flow}
 */
proto.stride.ratelimit.RateLimit.prototype.getFlow = function() {
  return /** @type{?proto.stride.ratelimit.Flow} */ (
    jspb.Message.getWrapperField(this, proto.stride.ratelimit.Flow, 3));
};


/**
 * @param {?proto.stride.ratelimit.Flow|undefined} value
 * @return {!proto.stride.ratelimit.RateLimit} returns this
*/
proto.stride.ratelimit.RateLimit.prototype.setFlow = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stride.ratelimit.RateLimit} returns this
 */
proto.stride.ratelimit.RateLimit.prototype.clearFlow = function() {
  return this.setFlow(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stride.ratelimit.RateLimit.prototype.hasFlow = function() {
  return jspb.Message.getField(this, 3) != null;
};

