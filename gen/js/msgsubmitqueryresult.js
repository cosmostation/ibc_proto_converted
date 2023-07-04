// source: neutron/interchainqueries/tx.proto
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

goog.provide('proto.neutron.interchainqueries.MsgSubmitQueryResult');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.neutron.interchainqueries.QueryResult');

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
proto.neutron.interchainqueries.MsgSubmitQueryResult = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.neutron.interchainqueries.MsgSubmitQueryResult, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.neutron.interchainqueries.MsgSubmitQueryResult.displayName = 'proto.neutron.interchainqueries.MsgSubmitQueryResult';
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
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.toObject = function(opt_includeInstance) {
  return proto.neutron.interchainqueries.MsgSubmitQueryResult.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.neutron.interchainqueries.MsgSubmitQueryResult} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.toObject = function(includeInstance, msg) {
  var f, obj = {
    queryId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    sender: jspb.Message.getFieldWithDefault(msg, 2, ""),
    clientId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    result: (f = msg.getResult()) && proto.neutron.interchainqueries.QueryResult.toObject(includeInstance, f)
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
 * @return {!proto.neutron.interchainqueries.MsgSubmitQueryResult}
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.neutron.interchainqueries.MsgSubmitQueryResult;
  return proto.neutron.interchainqueries.MsgSubmitQueryResult.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.neutron.interchainqueries.MsgSubmitQueryResult} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.neutron.interchainqueries.MsgSubmitQueryResult}
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setQueryId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setClientId(value);
      break;
    case 4:
      var value = new proto.neutron.interchainqueries.QueryResult;
      reader.readMessage(value,proto.neutron.interchainqueries.QueryResult.deserializeBinaryFromReader);
      msg.setResult(value);
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
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.neutron.interchainqueries.MsgSubmitQueryResult.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.neutron.interchainqueries.MsgSubmitQueryResult} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getQueryId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getClientId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getResult();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.neutron.interchainqueries.QueryResult.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 query_id = 1;
 * @return {number}
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.getQueryId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.neutron.interchainqueries.MsgSubmitQueryResult} returns this
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.setQueryId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string sender = 2;
 * @return {string}
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchainqueries.MsgSubmitQueryResult} returns this
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string client_id = 3;
 * @return {string}
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.getClientId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.neutron.interchainqueries.MsgSubmitQueryResult} returns this
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.setClientId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional QueryResult result = 4;
 * @return {?proto.neutron.interchainqueries.QueryResult}
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.getResult = function() {
  return /** @type{?proto.neutron.interchainqueries.QueryResult} */ (
    jspb.Message.getWrapperField(this, proto.neutron.interchainqueries.QueryResult, 4));
};


/**
 * @param {?proto.neutron.interchainqueries.QueryResult|undefined} value
 * @return {!proto.neutron.interchainqueries.MsgSubmitQueryResult} returns this
*/
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.setResult = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.neutron.interchainqueries.MsgSubmitQueryResult} returns this
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.clearResult = function() {
  return this.setResult(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.neutron.interchainqueries.MsgSubmitQueryResult.prototype.hasResult = function() {
  return jspb.Message.getField(this, 4) != null;
};

