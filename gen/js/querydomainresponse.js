// source: iov/starname/v1beta1/query.proto
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

goog.provide('proto.starnamed.x.starname.v1beta1.QueryDomainResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.starnamed.x.starname.v1beta1.Domain');

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
proto.starnamed.x.starname.v1beta1.QueryDomainResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.starnamed.x.starname.v1beta1.QueryDomainResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.starnamed.x.starname.v1beta1.QueryDomainResponse.displayName = 'proto.starnamed.x.starname.v1beta1.QueryDomainResponse';
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
proto.starnamed.x.starname.v1beta1.QueryDomainResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.starnamed.x.starname.v1beta1.QueryDomainResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.starnamed.x.starname.v1beta1.QueryDomainResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.starname.v1beta1.QueryDomainResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    domain: (f = msg.getDomain()) && proto.starnamed.x.starname.v1beta1.Domain.toObject(includeInstance, f)
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
 * @return {!proto.starnamed.x.starname.v1beta1.QueryDomainResponse}
 */
proto.starnamed.x.starname.v1beta1.QueryDomainResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.starnamed.x.starname.v1beta1.QueryDomainResponse;
  return proto.starnamed.x.starname.v1beta1.QueryDomainResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.starnamed.x.starname.v1beta1.QueryDomainResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.starnamed.x.starname.v1beta1.QueryDomainResponse}
 */
proto.starnamed.x.starname.v1beta1.QueryDomainResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.starnamed.x.starname.v1beta1.Domain;
      reader.readMessage(value,proto.starnamed.x.starname.v1beta1.Domain.deserializeBinaryFromReader);
      msg.setDomain(value);
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
proto.starnamed.x.starname.v1beta1.QueryDomainResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.starnamed.x.starname.v1beta1.QueryDomainResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.starnamed.x.starname.v1beta1.QueryDomainResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.starname.v1beta1.QueryDomainResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDomain();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.starnamed.x.starname.v1beta1.Domain.serializeBinaryToWriter
    );
  }
};


/**
 * optional Domain domain = 1;
 * @return {?proto.starnamed.x.starname.v1beta1.Domain}
 */
proto.starnamed.x.starname.v1beta1.QueryDomainResponse.prototype.getDomain = function() {
  return /** @type{?proto.starnamed.x.starname.v1beta1.Domain} */ (
    jspb.Message.getWrapperField(this, proto.starnamed.x.starname.v1beta1.Domain, 1));
};


/**
 * @param {?proto.starnamed.x.starname.v1beta1.Domain|undefined} value
 * @return {!proto.starnamed.x.starname.v1beta1.QueryDomainResponse} returns this
*/
proto.starnamed.x.starname.v1beta1.QueryDomainResponse.prototype.setDomain = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.starnamed.x.starname.v1beta1.QueryDomainResponse} returns this
 */
proto.starnamed.x.starname.v1beta1.QueryDomainResponse.prototype.clearDomain = function() {
  return this.setDomain(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.starnamed.x.starname.v1beta1.QueryDomainResponse.prototype.hasDomain = function() {
  return jspb.Message.getField(this, 1) != null;
};


