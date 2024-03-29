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

goog.provide('proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.pubsub.v1.PublisherIntent');

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
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.repeatedFields_, null);
};
goog.inherits(proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.displayName = 'proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.repeatedFields_ = [1];



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
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    publisherIntentsList: jspb.Message.toObjectList(msg.getPublisherIntentsList(),
    proto.pubsub.v1.PublisherIntent.toObject, includeInstance)
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
 * @return {!proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse}
 */
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse;
  return proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse}
 */
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.pubsub.v1.PublisherIntent;
      reader.readMessage(value,proto.pubsub.v1.PublisherIntent.deserializeBinaryFromReader);
      msg.addPublisherIntents(value);
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
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPublisherIntentsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.pubsub.v1.PublisherIntent.serializeBinaryToWriter
    );
  }
};


/**
 * repeated PublisherIntent publisher_intents = 1;
 * @return {!Array<!proto.pubsub.v1.PublisherIntent>}
 */
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.prototype.getPublisherIntentsList = function() {
  return /** @type{!Array<!proto.pubsub.v1.PublisherIntent>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.pubsub.v1.PublisherIntent, 1));
};


/**
 * @param {!Array<!proto.pubsub.v1.PublisherIntent>} value
 * @return {!proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse} returns this
*/
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.prototype.setPublisherIntentsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.pubsub.v1.PublisherIntent=} opt_value
 * @param {number=} opt_index
 * @return {!proto.pubsub.v1.PublisherIntent}
 */
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.prototype.addPublisherIntents = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.pubsub.v1.PublisherIntent, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse} returns this
 */
proto.pubsub.v1.QueryPublisherIntentsBySubscriptionIDResponse.prototype.clearPublisherIntentsList = function() {
  return this.setPublisherIntentsList([]);
};


