// source: sommelier/pubsub/v1/tx.proto
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

goog.provide('proto.pubsub.v1.MsgRemovePublisherIntentRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.pubsub.v1.MsgRemovePublisherIntentRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.pubsub.v1.MsgRemovePublisherIntentRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.pubsub.v1.MsgRemovePublisherIntentRequest.displayName = 'proto.pubsub.v1.MsgRemovePublisherIntentRequest';
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
proto.pubsub.v1.MsgRemovePublisherIntentRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.pubsub.v1.MsgRemovePublisherIntentRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.pubsub.v1.MsgRemovePublisherIntentRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pubsub.v1.MsgRemovePublisherIntentRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    subscriptionId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    publisherDomain: jspb.Message.getFieldWithDefault(msg, 2, ""),
    signer: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.pubsub.v1.MsgRemovePublisherIntentRequest}
 */
proto.pubsub.v1.MsgRemovePublisherIntentRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.pubsub.v1.MsgRemovePublisherIntentRequest;
  return proto.pubsub.v1.MsgRemovePublisherIntentRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.pubsub.v1.MsgRemovePublisherIntentRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.pubsub.v1.MsgRemovePublisherIntentRequest}
 */
proto.pubsub.v1.MsgRemovePublisherIntentRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSubscriptionId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setPublisherDomain(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setSigner(value);
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
proto.pubsub.v1.MsgRemovePublisherIntentRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.pubsub.v1.MsgRemovePublisherIntentRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.pubsub.v1.MsgRemovePublisherIntentRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pubsub.v1.MsgRemovePublisherIntentRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubscriptionId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPublisherDomain();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getSigner();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string subscription_id = 1;
 * @return {string}
 */
proto.pubsub.v1.MsgRemovePublisherIntentRequest.prototype.getSubscriptionId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.pubsub.v1.MsgRemovePublisherIntentRequest} returns this
 */
proto.pubsub.v1.MsgRemovePublisherIntentRequest.prototype.setSubscriptionId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string publisher_domain = 2;
 * @return {string}
 */
proto.pubsub.v1.MsgRemovePublisherIntentRequest.prototype.getPublisherDomain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.pubsub.v1.MsgRemovePublisherIntentRequest} returns this
 */
proto.pubsub.v1.MsgRemovePublisherIntentRequest.prototype.setPublisherDomain = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string signer = 3;
 * @return {string}
 */
proto.pubsub.v1.MsgRemovePublisherIntentRequest.prototype.getSigner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.pubsub.v1.MsgRemovePublisherIntentRequest} returns this
 */
proto.pubsub.v1.MsgRemovePublisherIntentRequest.prototype.setSigner = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


