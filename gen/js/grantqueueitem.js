// source: cosmos/authz/v1beta1/authz.proto
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

goog.provide('proto.cosmos.authz.v1beta1.GrantQueueItem');

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
proto.cosmos.authz.v1beta1.GrantQueueItem = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.authz.v1beta1.GrantQueueItem.repeatedFields_, null);
};
goog.inherits(proto.cosmos.authz.v1beta1.GrantQueueItem, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.authz.v1beta1.GrantQueueItem.displayName = 'proto.cosmos.authz.v1beta1.GrantQueueItem';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.authz.v1beta1.GrantQueueItem.repeatedFields_ = [1];



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
proto.cosmos.authz.v1beta1.GrantQueueItem.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.authz.v1beta1.GrantQueueItem.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.authz.v1beta1.GrantQueueItem} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.authz.v1beta1.GrantQueueItem.toObject = function(includeInstance, msg) {
  var f, obj = {
    msgTypeUrlsList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f
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
 * @return {!proto.cosmos.authz.v1beta1.GrantQueueItem}
 */
proto.cosmos.authz.v1beta1.GrantQueueItem.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.authz.v1beta1.GrantQueueItem;
  return proto.cosmos.authz.v1beta1.GrantQueueItem.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.authz.v1beta1.GrantQueueItem} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.authz.v1beta1.GrantQueueItem}
 */
proto.cosmos.authz.v1beta1.GrantQueueItem.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addMsgTypeUrls(value);
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
proto.cosmos.authz.v1beta1.GrantQueueItem.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.authz.v1beta1.GrantQueueItem.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.authz.v1beta1.GrantQueueItem} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.authz.v1beta1.GrantQueueItem.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMsgTypeUrlsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
};


/**
 * repeated string msg_type_urls = 1;
 * @return {!Array<string>}
 */
proto.cosmos.authz.v1beta1.GrantQueueItem.prototype.getMsgTypeUrlsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cosmos.authz.v1beta1.GrantQueueItem} returns this
 */
proto.cosmos.authz.v1beta1.GrantQueueItem.prototype.setMsgTypeUrlsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cosmos.authz.v1beta1.GrantQueueItem} returns this
 */
proto.cosmos.authz.v1beta1.GrantQueueItem.prototype.addMsgTypeUrls = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.authz.v1beta1.GrantQueueItem} returns this
 */
proto.cosmos.authz.v1beta1.GrantQueueItem.prototype.clearMsgTypeUrlsList = function() {
  return this.setMsgTypeUrlsList([]);
};


