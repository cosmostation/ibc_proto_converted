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

goog.provide('proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.RecordSpecificationWrapper');
goog.require('proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest');

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
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.displayName = 'proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.repeatedFields_ = [1];



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
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    recordSpecificationsList: jspb.Message.toObjectList(msg.getRecordSpecificationsList(),
    proto.provenance.metadata.v1.RecordSpecificationWrapper.toObject, includeInstance),
    contractSpecificationUuid: jspb.Message.getFieldWithDefault(msg, 2, ""),
    contractSpecificationAddr: jspb.Message.getFieldWithDefault(msg, 3, ""),
    request: (f = msg.getRequest()) && proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest.toObject(includeInstance, f)
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
 * @return {!proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse}
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse;
  return proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse}
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.metadata.v1.RecordSpecificationWrapper;
      reader.readMessage(value,proto.provenance.metadata.v1.RecordSpecificationWrapper.deserializeBinaryFromReader);
      msg.addRecordSpecifications(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractSpecificationUuid(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setContractSpecificationAddr(value);
      break;
    case 98:
      var value = new proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest;
      reader.readMessage(value,proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest.deserializeBinaryFromReader);
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
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getRecordSpecificationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.provenance.metadata.v1.RecordSpecificationWrapper.serializeBinaryToWriter
    );
  }
  f = message.getContractSpecificationUuid();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getContractSpecificationAddr();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getRequest();
  if (f != null) {
    writer.writeMessage(
      98,
      f,
      proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest.serializeBinaryToWriter
    );
  }
};


/**
 * repeated RecordSpecificationWrapper record_specifications = 1;
 * @return {!Array<!proto.provenance.metadata.v1.RecordSpecificationWrapper>}
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.getRecordSpecificationsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.RecordSpecificationWrapper>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.RecordSpecificationWrapper, 1));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.RecordSpecificationWrapper>} value
 * @return {!proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse} returns this
*/
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.setRecordSpecificationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.provenance.metadata.v1.RecordSpecificationWrapper=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.RecordSpecificationWrapper}
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.addRecordSpecifications = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.provenance.metadata.v1.RecordSpecificationWrapper, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse} returns this
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.clearRecordSpecificationsList = function() {
  return this.setRecordSpecificationsList([]);
};


/**
 * optional string contract_specification_uuid = 2;
 * @return {string}
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.getContractSpecificationUuid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse} returns this
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.setContractSpecificationUuid = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string contract_specification_addr = 3;
 * @return {string}
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.getContractSpecificationAddr = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse} returns this
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.setContractSpecificationAddr = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional RecordSpecificationsForContractSpecificationRequest request = 98;
 * @return {?proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest}
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.getRequest = function() {
  return /** @type{?proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest, 98));
};


/**
 * @param {?proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest|undefined} value
 * @return {!proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse} returns this
*/
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.setRequest = function(value) {
  return jspb.Message.setWrapperField(this, 98, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse} returns this
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.clearRequest = function() {
  return this.setRequest(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse.prototype.hasRequest = function() {
  return jspb.Message.getField(this, 98) != null;
};


