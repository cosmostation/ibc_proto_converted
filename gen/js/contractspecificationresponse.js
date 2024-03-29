// source: provenance/metadata/v1/query.proto
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

goog.provide('proto.provenance.metadata.v1.ContractSpecificationResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.ContractSpecificationRequest');
goog.require('proto.provenance.metadata.v1.ContractSpecificationWrapper');
goog.require('proto.provenance.metadata.v1.RecordSpecificationWrapper');

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
proto.provenance.metadata.v1.ContractSpecificationResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.ContractSpecificationResponse.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.ContractSpecificationResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.ContractSpecificationResponse.displayName = 'proto.provenance.metadata.v1.ContractSpecificationResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.repeatedFields_ = [3];



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
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.ContractSpecificationResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.ContractSpecificationResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    contractSpecification: (f = msg.getContractSpecification()) && proto.provenance.metadata.v1.ContractSpecificationWrapper.toObject(includeInstance, f),
    recordSpecificationsList: jspb.Message.toObjectList(msg.getRecordSpecificationsList(),
    proto.provenance.metadata.v1.RecordSpecificationWrapper.toObject, includeInstance),
    request: (f = msg.getRequest()) && proto.provenance.metadata.v1.ContractSpecificationRequest.toObject(includeInstance, f)
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
 * @return {!proto.provenance.metadata.v1.ContractSpecificationResponse}
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.ContractSpecificationResponse;
  return proto.provenance.metadata.v1.ContractSpecificationResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.ContractSpecificationResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.ContractSpecificationResponse}
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.metadata.v1.ContractSpecificationWrapper;
      reader.readMessage(value,proto.provenance.metadata.v1.ContractSpecificationWrapper.deserializeBinaryFromReader);
      msg.setContractSpecification(value);
      break;
    case 3:
      var value = new proto.provenance.metadata.v1.RecordSpecificationWrapper;
      reader.readMessage(value,proto.provenance.metadata.v1.RecordSpecificationWrapper.deserializeBinaryFromReader);
      msg.addRecordSpecifications(value);
      break;
    case 98:
      var value = new proto.provenance.metadata.v1.ContractSpecificationRequest;
      reader.readMessage(value,proto.provenance.metadata.v1.ContractSpecificationRequest.deserializeBinaryFromReader);
      msg.setRequest(value);
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
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.ContractSpecificationResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.ContractSpecificationResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getContractSpecification();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.provenance.metadata.v1.ContractSpecificationWrapper.serializeBinaryToWriter
    );
  }
  f = message.getRecordSpecificationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.provenance.metadata.v1.RecordSpecificationWrapper.serializeBinaryToWriter
    );
  }
  f = message.getRequest();
  if (f != null) {
    writer.writeMessage(
      98,
      f,
      proto.provenance.metadata.v1.ContractSpecificationRequest.serializeBinaryToWriter
    );
  }
};


/**
 * optional ContractSpecificationWrapper contract_specification = 1;
 * @return {?proto.provenance.metadata.v1.ContractSpecificationWrapper}
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.getContractSpecification = function() {
  return /** @type{?proto.provenance.metadata.v1.ContractSpecificationWrapper} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.ContractSpecificationWrapper, 1));
};


/**
 * @param {?proto.provenance.metadata.v1.ContractSpecificationWrapper|undefined} value
 * @return {!proto.provenance.metadata.v1.ContractSpecificationResponse} returns this
*/
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.setContractSpecification = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.ContractSpecificationResponse} returns this
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.clearContractSpecification = function() {
  return this.setContractSpecification(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.hasContractSpecification = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated RecordSpecificationWrapper record_specifications = 3;
 * @return {!Array<!proto.provenance.metadata.v1.RecordSpecificationWrapper>}
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.getRecordSpecificationsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.RecordSpecificationWrapper>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.RecordSpecificationWrapper, 3));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.RecordSpecificationWrapper>} value
 * @return {!proto.provenance.metadata.v1.ContractSpecificationResponse} returns this
*/
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.setRecordSpecificationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.provenance.metadata.v1.RecordSpecificationWrapper=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.RecordSpecificationWrapper}
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.addRecordSpecifications = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.provenance.metadata.v1.RecordSpecificationWrapper, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.ContractSpecificationResponse} returns this
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.clearRecordSpecificationsList = function() {
  return this.setRecordSpecificationsList([]);
};


/**
 * optional ContractSpecificationRequest request = 98;
 * @return {?proto.provenance.metadata.v1.ContractSpecificationRequest}
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.getRequest = function() {
  return /** @type{?proto.provenance.metadata.v1.ContractSpecificationRequest} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.ContractSpecificationRequest, 98));
};


/**
 * @param {?proto.provenance.metadata.v1.ContractSpecificationRequest|undefined} value
 * @return {!proto.provenance.metadata.v1.ContractSpecificationResponse} returns this
*/
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.setRequest = function(value) {
  return jspb.Message.setWrapperField(this, 98, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.ContractSpecificationResponse} returns this
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.clearRequest = function() {
  return this.setRequest(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.ContractSpecificationResponse.prototype.hasRequest = function() {
  return jspb.Message.getField(this, 98) != null;
};


