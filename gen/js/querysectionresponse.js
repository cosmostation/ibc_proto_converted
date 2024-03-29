// source: desmos/subspaces/v3/query.proto
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

goog.provide('proto.desmos.subspaces.v3.QuerySectionResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.desmos.subspaces.v3.Section');

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
proto.desmos.subspaces.v3.QuerySectionResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.subspaces.v3.QuerySectionResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.subspaces.v3.QuerySectionResponse.displayName = 'proto.desmos.subspaces.v3.QuerySectionResponse';
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
proto.desmos.subspaces.v3.QuerySectionResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.subspaces.v3.QuerySectionResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.subspaces.v3.QuerySectionResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.subspaces.v3.QuerySectionResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    section: (f = msg.getSection()) && proto.desmos.subspaces.v3.Section.toObject(includeInstance, f)
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
 * @return {!proto.desmos.subspaces.v3.QuerySectionResponse}
 */
proto.desmos.subspaces.v3.QuerySectionResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.subspaces.v3.QuerySectionResponse;
  return proto.desmos.subspaces.v3.QuerySectionResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.subspaces.v3.QuerySectionResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.subspaces.v3.QuerySectionResponse}
 */
proto.desmos.subspaces.v3.QuerySectionResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.desmos.subspaces.v3.Section;
      reader.readMessage(value,proto.desmos.subspaces.v3.Section.deserializeBinaryFromReader);
      msg.setSection(value);
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
proto.desmos.subspaces.v3.QuerySectionResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.subspaces.v3.QuerySectionResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.subspaces.v3.QuerySectionResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.subspaces.v3.QuerySectionResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSection();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.desmos.subspaces.v3.Section.serializeBinaryToWriter
    );
  }
};


/**
 * optional Section section = 1;
 * @return {?proto.desmos.subspaces.v3.Section}
 */
proto.desmos.subspaces.v3.QuerySectionResponse.prototype.getSection = function() {
  return /** @type{?proto.desmos.subspaces.v3.Section} */ (
    jspb.Message.getWrapperField(this, proto.desmos.subspaces.v3.Section, 1));
};


/**
 * @param {?proto.desmos.subspaces.v3.Section|undefined} value
 * @return {!proto.desmos.subspaces.v3.QuerySectionResponse} returns this
*/
proto.desmos.subspaces.v3.QuerySectionResponse.prototype.setSection = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.subspaces.v3.QuerySectionResponse} returns this
 */
proto.desmos.subspaces.v3.QuerySectionResponse.prototype.clearSection = function() {
  return this.setSection(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.subspaces.v3.QuerySectionResponse.prototype.hasSection = function() {
  return jspb.Message.getField(this, 1) != null;
};


