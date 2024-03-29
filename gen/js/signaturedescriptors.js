// source: cosmos/tx/signing/v1beta1/signing.proto
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

goog.provide('proto.cosmos.tx.signing.v1beta1.SignatureDescriptors');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.tx.signing.v1beta1.SignatureDescriptor');

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
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.repeatedFields_, null);
};
goog.inherits(proto.cosmos.tx.signing.v1beta1.SignatureDescriptors, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.displayName = 'proto.cosmos.tx.signing.v1beta1.SignatureDescriptors';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.repeatedFields_ = [1];



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
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.tx.signing.v1beta1.SignatureDescriptors} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.toObject = function(includeInstance, msg) {
  var f, obj = {
    signaturesList: jspb.Message.toObjectList(msg.getSignaturesList(),
    proto.cosmos.tx.signing.v1beta1.SignatureDescriptor.toObject, includeInstance)
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
 * @return {!proto.cosmos.tx.signing.v1beta1.SignatureDescriptors}
 */
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.tx.signing.v1beta1.SignatureDescriptors;
  return proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.tx.signing.v1beta1.SignatureDescriptors} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.tx.signing.v1beta1.SignatureDescriptors}
 */
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.tx.signing.v1beta1.SignatureDescriptor;
      reader.readMessage(value,proto.cosmos.tx.signing.v1beta1.SignatureDescriptor.deserializeBinaryFromReader);
      msg.addSignatures(value);
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
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.tx.signing.v1beta1.SignatureDescriptors} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSignaturesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.tx.signing.v1beta1.SignatureDescriptor.serializeBinaryToWriter
    );
  }
};


/**
 * repeated SignatureDescriptor signatures = 1;
 * @return {!Array<!proto.cosmos.tx.signing.v1beta1.SignatureDescriptor>}
 */
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.prototype.getSignaturesList = function() {
  return /** @type{!Array<!proto.cosmos.tx.signing.v1beta1.SignatureDescriptor>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.tx.signing.v1beta1.SignatureDescriptor, 1));
};


/**
 * @param {!Array<!proto.cosmos.tx.signing.v1beta1.SignatureDescriptor>} value
 * @return {!proto.cosmos.tx.signing.v1beta1.SignatureDescriptors} returns this
*/
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.prototype.setSignaturesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.tx.signing.v1beta1.SignatureDescriptor=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.tx.signing.v1beta1.SignatureDescriptor}
 */
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.prototype.addSignatures = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.tx.signing.v1beta1.SignatureDescriptor, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.tx.signing.v1beta1.SignatureDescriptors} returns this
 */
proto.cosmos.tx.signing.v1beta1.SignatureDescriptors.prototype.clearSignaturesList = function() {
  return this.setSignaturesList([]);
};


