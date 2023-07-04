// source: akash/base/v1beta3/gpu.proto
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

goog.provide('proto.akash.base.v1beta3.GPU');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.base.v1beta3.Attribute');
goog.require('proto.akash.base.v1beta3.ResourceValue');

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
proto.akash.base.v1beta3.GPU = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.akash.base.v1beta3.GPU.repeatedFields_, null);
};
goog.inherits(proto.akash.base.v1beta3.GPU, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.base.v1beta3.GPU.displayName = 'proto.akash.base.v1beta3.GPU';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.akash.base.v1beta3.GPU.repeatedFields_ = [2];



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
proto.akash.base.v1beta3.GPU.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.base.v1beta3.GPU.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.base.v1beta3.GPU} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.base.v1beta3.GPU.toObject = function(includeInstance, msg) {
  var f, obj = {
    units: (f = msg.getUnits()) && proto.akash.base.v1beta3.ResourceValue.toObject(includeInstance, f),
    attributesList: jspb.Message.toObjectList(msg.getAttributesList(),
    proto.akash.base.v1beta3.Attribute.toObject, includeInstance)
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
 * @return {!proto.akash.base.v1beta3.GPU}
 */
proto.akash.base.v1beta3.GPU.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.base.v1beta3.GPU;
  return proto.akash.base.v1beta3.GPU.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.base.v1beta3.GPU} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.base.v1beta3.GPU}
 */
proto.akash.base.v1beta3.GPU.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.akash.base.v1beta3.ResourceValue;
      reader.readMessage(value,proto.akash.base.v1beta3.ResourceValue.deserializeBinaryFromReader);
      msg.setUnits(value);
      break;
    case 2:
      var value = new proto.akash.base.v1beta3.Attribute;
      reader.readMessage(value,proto.akash.base.v1beta3.Attribute.deserializeBinaryFromReader);
      msg.addAttributes(value);
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
proto.akash.base.v1beta3.GPU.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.base.v1beta3.GPU.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.base.v1beta3.GPU} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.base.v1beta3.GPU.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUnits();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.akash.base.v1beta3.ResourceValue.serializeBinaryToWriter
    );
  }
  f = message.getAttributesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.akash.base.v1beta3.Attribute.serializeBinaryToWriter
    );
  }
};


/**
 * optional ResourceValue units = 1;
 * @return {?proto.akash.base.v1beta3.ResourceValue}
 */
proto.akash.base.v1beta3.GPU.prototype.getUnits = function() {
  return /** @type{?proto.akash.base.v1beta3.ResourceValue} */ (
    jspb.Message.getWrapperField(this, proto.akash.base.v1beta3.ResourceValue, 1));
};


/**
 * @param {?proto.akash.base.v1beta3.ResourceValue|undefined} value
 * @return {!proto.akash.base.v1beta3.GPU} returns this
*/
proto.akash.base.v1beta3.GPU.prototype.setUnits = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.base.v1beta3.GPU} returns this
 */
proto.akash.base.v1beta3.GPU.prototype.clearUnits = function() {
  return this.setUnits(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.base.v1beta3.GPU.prototype.hasUnits = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Attribute attributes = 2;
 * @return {!Array<!proto.akash.base.v1beta3.Attribute>}
 */
proto.akash.base.v1beta3.GPU.prototype.getAttributesList = function() {
  return /** @type{!Array<!proto.akash.base.v1beta3.Attribute>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.akash.base.v1beta3.Attribute, 2));
};


/**
 * @param {!Array<!proto.akash.base.v1beta3.Attribute>} value
 * @return {!proto.akash.base.v1beta3.GPU} returns this
*/
proto.akash.base.v1beta3.GPU.prototype.setAttributesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.akash.base.v1beta3.Attribute=} opt_value
 * @param {number=} opt_index
 * @return {!proto.akash.base.v1beta3.Attribute}
 */
proto.akash.base.v1beta3.GPU.prototype.addAttributes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.akash.base.v1beta3.Attribute, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.akash.base.v1beta3.GPU} returns this
 */
proto.akash.base.v1beta3.GPU.prototype.clearAttributesList = function() {
  return this.setAttributesList([]);
};

