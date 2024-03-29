// source: shentu/shield/v1alpha1/query.proto
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

goog.provide('proto.shentu.shield.v1alpha1.QueryProvidersResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.shentu.shield.v1alpha1.Provider');

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
proto.shentu.shield.v1alpha1.QueryProvidersResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.shentu.shield.v1alpha1.QueryProvidersResponse.repeatedFields_, null);
};
goog.inherits(proto.shentu.shield.v1alpha1.QueryProvidersResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.shentu.shield.v1alpha1.QueryProvidersResponse.displayName = 'proto.shentu.shield.v1alpha1.QueryProvidersResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.shentu.shield.v1alpha1.QueryProvidersResponse.repeatedFields_ = [1];



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
proto.shentu.shield.v1alpha1.QueryProvidersResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.shentu.shield.v1alpha1.QueryProvidersResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.shentu.shield.v1alpha1.QueryProvidersResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.QueryProvidersResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    providersList: jspb.Message.toObjectList(msg.getProvidersList(),
    proto.shentu.shield.v1alpha1.Provider.toObject, includeInstance)
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
 * @return {!proto.shentu.shield.v1alpha1.QueryProvidersResponse}
 */
proto.shentu.shield.v1alpha1.QueryProvidersResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.shentu.shield.v1alpha1.QueryProvidersResponse;
  return proto.shentu.shield.v1alpha1.QueryProvidersResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.shentu.shield.v1alpha1.QueryProvidersResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.shentu.shield.v1alpha1.QueryProvidersResponse}
 */
proto.shentu.shield.v1alpha1.QueryProvidersResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.shentu.shield.v1alpha1.Provider;
      reader.readMessage(value,proto.shentu.shield.v1alpha1.Provider.deserializeBinaryFromReader);
      msg.addProviders(value);
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
proto.shentu.shield.v1alpha1.QueryProvidersResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.shentu.shield.v1alpha1.QueryProvidersResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.shentu.shield.v1alpha1.QueryProvidersResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.shentu.shield.v1alpha1.QueryProvidersResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getProvidersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.shentu.shield.v1alpha1.Provider.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Provider providers = 1;
 * @return {!Array<!proto.shentu.shield.v1alpha1.Provider>}
 */
proto.shentu.shield.v1alpha1.QueryProvidersResponse.prototype.getProvidersList = function() {
  return /** @type{!Array<!proto.shentu.shield.v1alpha1.Provider>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.shentu.shield.v1alpha1.Provider, 1));
};


/**
 * @param {!Array<!proto.shentu.shield.v1alpha1.Provider>} value
 * @return {!proto.shentu.shield.v1alpha1.QueryProvidersResponse} returns this
*/
proto.shentu.shield.v1alpha1.QueryProvidersResponse.prototype.setProvidersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.shentu.shield.v1alpha1.Provider=} opt_value
 * @param {number=} opt_index
 * @return {!proto.shentu.shield.v1alpha1.Provider}
 */
proto.shentu.shield.v1alpha1.QueryProvidersResponse.prototype.addProviders = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.shentu.shield.v1alpha1.Provider, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.shentu.shield.v1alpha1.QueryProvidersResponse} returns this
 */
proto.shentu.shield.v1alpha1.QueryProvidersResponse.prototype.clearProvidersList = function() {
  return this.setProvidersList([]);
};


