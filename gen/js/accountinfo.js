// source: mars/envoy/v1beta1/query.proto
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

goog.provide('proto.mars.envoy.v1beta1.AccountInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.mars.envoy.v1beta1.ChainInfo');

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
proto.mars.envoy.v1beta1.AccountInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.mars.envoy.v1beta1.AccountInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.mars.envoy.v1beta1.AccountInfo.displayName = 'proto.mars.envoy.v1beta1.AccountInfo';
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
proto.mars.envoy.v1beta1.AccountInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.mars.envoy.v1beta1.AccountInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.mars.envoy.v1beta1.AccountInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.mars.envoy.v1beta1.AccountInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    controller: (f = msg.getController()) && proto.mars.envoy.v1beta1.ChainInfo.toObject(includeInstance, f),
    host: (f = msg.getHost()) && proto.mars.envoy.v1beta1.ChainInfo.toObject(includeInstance, f),
    address: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.mars.envoy.v1beta1.AccountInfo}
 */
proto.mars.envoy.v1beta1.AccountInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.mars.envoy.v1beta1.AccountInfo;
  return proto.mars.envoy.v1beta1.AccountInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.mars.envoy.v1beta1.AccountInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.mars.envoy.v1beta1.AccountInfo}
 */
proto.mars.envoy.v1beta1.AccountInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.mars.envoy.v1beta1.ChainInfo;
      reader.readMessage(value,proto.mars.envoy.v1beta1.ChainInfo.deserializeBinaryFromReader);
      msg.setController(value);
      break;
    case 2:
      var value = new proto.mars.envoy.v1beta1.ChainInfo;
      reader.readMessage(value,proto.mars.envoy.v1beta1.ChainInfo.deserializeBinaryFromReader);
      msg.setHost(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
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
proto.mars.envoy.v1beta1.AccountInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.mars.envoy.v1beta1.AccountInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.mars.envoy.v1beta1.AccountInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.mars.envoy.v1beta1.AccountInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getController();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.mars.envoy.v1beta1.ChainInfo.serializeBinaryToWriter
    );
  }
  f = message.getHost();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.mars.envoy.v1beta1.ChainInfo.serializeBinaryToWriter
    );
  }
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional ChainInfo controller = 1;
 * @return {?proto.mars.envoy.v1beta1.ChainInfo}
 */
proto.mars.envoy.v1beta1.AccountInfo.prototype.getController = function() {
  return /** @type{?proto.mars.envoy.v1beta1.ChainInfo} */ (
    jspb.Message.getWrapperField(this, proto.mars.envoy.v1beta1.ChainInfo, 1));
};


/**
 * @param {?proto.mars.envoy.v1beta1.ChainInfo|undefined} value
 * @return {!proto.mars.envoy.v1beta1.AccountInfo} returns this
*/
proto.mars.envoy.v1beta1.AccountInfo.prototype.setController = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.mars.envoy.v1beta1.AccountInfo} returns this
 */
proto.mars.envoy.v1beta1.AccountInfo.prototype.clearController = function() {
  return this.setController(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.mars.envoy.v1beta1.AccountInfo.prototype.hasController = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional ChainInfo host = 2;
 * @return {?proto.mars.envoy.v1beta1.ChainInfo}
 */
proto.mars.envoy.v1beta1.AccountInfo.prototype.getHost = function() {
  return /** @type{?proto.mars.envoy.v1beta1.ChainInfo} */ (
    jspb.Message.getWrapperField(this, proto.mars.envoy.v1beta1.ChainInfo, 2));
};


/**
 * @param {?proto.mars.envoy.v1beta1.ChainInfo|undefined} value
 * @return {!proto.mars.envoy.v1beta1.AccountInfo} returns this
*/
proto.mars.envoy.v1beta1.AccountInfo.prototype.setHost = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.mars.envoy.v1beta1.AccountInfo} returns this
 */
proto.mars.envoy.v1beta1.AccountInfo.prototype.clearHost = function() {
  return this.setHost(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.mars.envoy.v1beta1.AccountInfo.prototype.hasHost = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional string address = 3;
 * @return {string}
 */
proto.mars.envoy.v1beta1.AccountInfo.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.mars.envoy.v1beta1.AccountInfo} returns this
 */
proto.mars.envoy.v1beta1.AccountInfo.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


