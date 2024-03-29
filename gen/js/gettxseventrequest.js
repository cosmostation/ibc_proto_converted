// source: cosmos/tx/v1beta1/service.proto
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

goog.provide('proto.cosmos.tx.v1beta1.GetTxsEventRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageRequest');

goog.forwardDeclare('proto.cosmos.tx.v1beta1.OrderBy');
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
proto.cosmos.tx.v1beta1.GetTxsEventRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.tx.v1beta1.GetTxsEventRequest.repeatedFields_, null);
};
goog.inherits(proto.cosmos.tx.v1beta1.GetTxsEventRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.tx.v1beta1.GetTxsEventRequest.displayName = 'proto.cosmos.tx.v1beta1.GetTxsEventRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.repeatedFields_ = [1];



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
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.tx.v1beta1.GetTxsEventRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.tx.v1beta1.GetTxsEventRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    eventsList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageRequest.toObject(includeInstance, f),
    orderBy: jspb.Message.getFieldWithDefault(msg, 3, 0),
    page: jspb.Message.getFieldWithDefault(msg, 4, 0),
    limit: jspb.Message.getFieldWithDefault(msg, 5, 0)
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
 * @return {!proto.cosmos.tx.v1beta1.GetTxsEventRequest}
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.tx.v1beta1.GetTxsEventRequest;
  return proto.cosmos.tx.v1beta1.GetTxsEventRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.tx.v1beta1.GetTxsEventRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.tx.v1beta1.GetTxsEventRequest}
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addEvents(value);
      break;
    case 2:
      var value = new proto.cosmos.base.query.v1beta1.PageRequest;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageRequest.deserializeBinaryFromReader);
      msg.setPagination(value);
      break;
    case 3:
      var value = /** @type {!proto.cosmos.tx.v1beta1.OrderBy} */ (reader.readEnum());
      msg.setOrderBy(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPage(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setLimit(value);
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
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.tx.v1beta1.GetTxsEventRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.tx.v1beta1.GetTxsEventRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEventsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageRequest.serializeBinaryToWriter
    );
  }
  f = message.getOrderBy();
  if (f !== 0.0) {
    writer.writeEnum(
      3,
      f
    );
  }
  f = message.getPage();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getLimit();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
};


/**
 * repeated string events = 1;
 * @return {!Array<string>}
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.getEventsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cosmos.tx.v1beta1.GetTxsEventRequest} returns this
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.setEventsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cosmos.tx.v1beta1.GetTxsEventRequest} returns this
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.addEvents = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.tx.v1beta1.GetTxsEventRequest} returns this
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.clearEventsList = function() {
  return this.setEventsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageRequest pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageRequest}
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageRequest} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageRequest, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageRequest|undefined} value
 * @return {!proto.cosmos.tx.v1beta1.GetTxsEventRequest} returns this
*/
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.tx.v1beta1.GetTxsEventRequest} returns this
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional OrderBy order_by = 3;
 * @return {!proto.cosmos.tx.v1beta1.OrderBy}
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.getOrderBy = function() {
  return /** @type {!proto.cosmos.tx.v1beta1.OrderBy} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {!proto.cosmos.tx.v1beta1.OrderBy} value
 * @return {!proto.cosmos.tx.v1beta1.GetTxsEventRequest} returns this
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.setOrderBy = function(value) {
  return jspb.Message.setProto3EnumField(this, 3, value);
};


/**
 * optional uint64 page = 4;
 * @return {number}
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.getPage = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.tx.v1beta1.GetTxsEventRequest} returns this
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.setPage = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 limit = 5;
 * @return {number}
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.getLimit = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.cosmos.tx.v1beta1.GetTxsEventRequest} returns this
 */
proto.cosmos.tx.v1beta1.GetTxsEventRequest.prototype.setLimit = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


