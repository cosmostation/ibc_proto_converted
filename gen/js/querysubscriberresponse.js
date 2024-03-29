// source: sommelier/pubsub/v1/query.proto
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

goog.provide('proto.pubsub.v1.QuerySubscriberResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.pubsub.v1.Subscriber');

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
proto.pubsub.v1.QuerySubscriberResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.pubsub.v1.QuerySubscriberResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.pubsub.v1.QuerySubscriberResponse.displayName = 'proto.pubsub.v1.QuerySubscriberResponse';
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
proto.pubsub.v1.QuerySubscriberResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.pubsub.v1.QuerySubscriberResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.pubsub.v1.QuerySubscriberResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pubsub.v1.QuerySubscriberResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    subscriber: (f = msg.getSubscriber()) && proto.pubsub.v1.Subscriber.toObject(includeInstance, f)
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
 * @return {!proto.pubsub.v1.QuerySubscriberResponse}
 */
proto.pubsub.v1.QuerySubscriberResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.pubsub.v1.QuerySubscriberResponse;
  return proto.pubsub.v1.QuerySubscriberResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.pubsub.v1.QuerySubscriberResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.pubsub.v1.QuerySubscriberResponse}
 */
proto.pubsub.v1.QuerySubscriberResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.pubsub.v1.Subscriber;
      reader.readMessage(value,proto.pubsub.v1.Subscriber.deserializeBinaryFromReader);
      msg.setSubscriber(value);
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
proto.pubsub.v1.QuerySubscriberResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.pubsub.v1.QuerySubscriberResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.pubsub.v1.QuerySubscriberResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pubsub.v1.QuerySubscriberResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubscriber();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.pubsub.v1.Subscriber.serializeBinaryToWriter
    );
  }
};


/**
 * optional Subscriber subscriber = 1;
 * @return {?proto.pubsub.v1.Subscriber}
 */
proto.pubsub.v1.QuerySubscriberResponse.prototype.getSubscriber = function() {
  return /** @type{?proto.pubsub.v1.Subscriber} */ (
    jspb.Message.getWrapperField(this, proto.pubsub.v1.Subscriber, 1));
};


/**
 * @param {?proto.pubsub.v1.Subscriber|undefined} value
 * @return {!proto.pubsub.v1.QuerySubscriberResponse} returns this
*/
proto.pubsub.v1.QuerySubscriberResponse.prototype.setSubscriber = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.pubsub.v1.QuerySubscriberResponse} returns this
 */
proto.pubsub.v1.QuerySubscriberResponse.prototype.clearSubscriber = function() {
  return this.setSubscriber(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.pubsub.v1.QuerySubscriberResponse.prototype.hasSubscriber = function() {
  return jspb.Message.getField(this, 1) != null;
};


