// source: sentinel/session/v2/session.proto
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

goog.provide('proto.sentinel.session.v2.Session');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');
goog.require('proto.google.protobuf.Timestamp');
goog.require('proto.sentinel.types.v1.Bandwidth');

goog.forwardDeclare('proto.sentinel.types.v1.Status');
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
proto.sentinel.session.v2.Session = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.sentinel.session.v2.Session, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.sentinel.session.v2.Session.displayName = 'proto.sentinel.session.v2.Session';
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
proto.sentinel.session.v2.Session.prototype.toObject = function(opt_includeInstance) {
  return proto.sentinel.session.v2.Session.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.sentinel.session.v2.Session} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.session.v2.Session.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    subscriptionId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    nodeAddress: jspb.Message.getFieldWithDefault(msg, 3, ""),
    address: jspb.Message.getFieldWithDefault(msg, 4, ""),
    bandwidth: (f = msg.getBandwidth()) && proto.sentinel.types.v1.Bandwidth.toObject(includeInstance, f),
    duration: (f = msg.getDuration()) && proto.google.protobuf.Duration.toObject(includeInstance, f),
    expiryAt: (f = msg.getExpiryAt()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    status: jspb.Message.getFieldWithDefault(msg, 8, 0),
    statusAt: (f = msg.getStatusAt()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.sentinel.session.v2.Session}
 */
proto.sentinel.session.v2.Session.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.sentinel.session.v2.Session;
  return proto.sentinel.session.v2.Session.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.sentinel.session.v2.Session} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.sentinel.session.v2.Session}
 */
proto.sentinel.session.v2.Session.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSubscriptionId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setNodeAddress(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setAddress(value);
      break;
    case 5:
      var value = new proto.sentinel.types.v1.Bandwidth;
      reader.readMessage(value,proto.sentinel.types.v1.Bandwidth.deserializeBinaryFromReader);
      msg.setBandwidth(value);
      break;
    case 6:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.setDuration(value);
      break;
    case 7:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setExpiryAt(value);
      break;
    case 8:
      var value = /** @type {!proto.sentinel.types.v1.Status} */ (reader.readEnum());
      msg.setStatus(value);
      break;
    case 9:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStatusAt(value);
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
proto.sentinel.session.v2.Session.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.sentinel.session.v2.Session.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.sentinel.session.v2.Session} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.sentinel.session.v2.Session.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getSubscriptionId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getNodeAddress();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getAddress();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getBandwidth();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.sentinel.types.v1.Bandwidth.serializeBinaryToWriter
    );
  }
  f = message.getDuration();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
  f = message.getExpiryAt();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      8,
      f
    );
  }
  f = message.getStatusAt();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.sentinel.session.v2.Session.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.sentinel.session.v2.Session} returns this
 */
proto.sentinel.session.v2.Session.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 subscription_id = 2;
 * @return {number}
 */
proto.sentinel.session.v2.Session.prototype.getSubscriptionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.sentinel.session.v2.Session} returns this
 */
proto.sentinel.session.v2.Session.prototype.setSubscriptionId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string node_address = 3;
 * @return {string}
 */
proto.sentinel.session.v2.Session.prototype.getNodeAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.sentinel.session.v2.Session} returns this
 */
proto.sentinel.session.v2.Session.prototype.setNodeAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string address = 4;
 * @return {string}
 */
proto.sentinel.session.v2.Session.prototype.getAddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.sentinel.session.v2.Session} returns this
 */
proto.sentinel.session.v2.Session.prototype.setAddress = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional sentinel.types.v1.Bandwidth bandwidth = 5;
 * @return {?proto.sentinel.types.v1.Bandwidth}
 */
proto.sentinel.session.v2.Session.prototype.getBandwidth = function() {
  return /** @type{?proto.sentinel.types.v1.Bandwidth} */ (
    jspb.Message.getWrapperField(this, proto.sentinel.types.v1.Bandwidth, 5));
};


/**
 * @param {?proto.sentinel.types.v1.Bandwidth|undefined} value
 * @return {!proto.sentinel.session.v2.Session} returns this
*/
proto.sentinel.session.v2.Session.prototype.setBandwidth = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.session.v2.Session} returns this
 */
proto.sentinel.session.v2.Session.prototype.clearBandwidth = function() {
  return this.setBandwidth(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.session.v2.Session.prototype.hasBandwidth = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional google.protobuf.Duration duration = 6;
 * @return {?proto.google.protobuf.Duration}
 */
proto.sentinel.session.v2.Session.prototype.getDuration = function() {
  return /** @type{?proto.google.protobuf.Duration} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Duration, 6));
};


/**
 * @param {?proto.google.protobuf.Duration|undefined} value
 * @return {!proto.sentinel.session.v2.Session} returns this
*/
proto.sentinel.session.v2.Session.prototype.setDuration = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.session.v2.Session} returns this
 */
proto.sentinel.session.v2.Session.prototype.clearDuration = function() {
  return this.setDuration(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.session.v2.Session.prototype.hasDuration = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional google.protobuf.Timestamp expiry_at = 7;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.sentinel.session.v2.Session.prototype.getExpiryAt = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 7));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.sentinel.session.v2.Session} returns this
*/
proto.sentinel.session.v2.Session.prototype.setExpiryAt = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.session.v2.Session} returns this
 */
proto.sentinel.session.v2.Session.prototype.clearExpiryAt = function() {
  return this.setExpiryAt(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.session.v2.Session.prototype.hasExpiryAt = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional sentinel.types.v1.Status status = 8;
 * @return {!proto.sentinel.types.v1.Status}
 */
proto.sentinel.session.v2.Session.prototype.getStatus = function() {
  return /** @type {!proto.sentinel.types.v1.Status} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {!proto.sentinel.types.v1.Status} value
 * @return {!proto.sentinel.session.v2.Session} returns this
 */
proto.sentinel.session.v2.Session.prototype.setStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 8, value);
};


/**
 * optional google.protobuf.Timestamp status_at = 9;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.sentinel.session.v2.Session.prototype.getStatusAt = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 9));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.sentinel.session.v2.Session} returns this
*/
proto.sentinel.session.v2.Session.prototype.setStatusAt = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.sentinel.session.v2.Session} returns this
 */
proto.sentinel.session.v2.Session.prototype.clearStatusAt = function() {
  return this.setStatusAt(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.sentinel.session.v2.Session.prototype.hasStatusAt = function() {
  return jspb.Message.getField(this, 9) != null;
};

