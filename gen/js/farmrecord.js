// source: crescent/lpfarm/v1beta1/genesis.proto
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

goog.provide('proto.crescent.lpfarm.v1beta1.FarmRecord');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.crescent.lpfarm.v1beta1.Farm');

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
proto.crescent.lpfarm.v1beta1.FarmRecord = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.crescent.lpfarm.v1beta1.FarmRecord, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.crescent.lpfarm.v1beta1.FarmRecord.displayName = 'proto.crescent.lpfarm.v1beta1.FarmRecord';
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
proto.crescent.lpfarm.v1beta1.FarmRecord.prototype.toObject = function(opt_includeInstance) {
  return proto.crescent.lpfarm.v1beta1.FarmRecord.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.crescent.lpfarm.v1beta1.FarmRecord} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.lpfarm.v1beta1.FarmRecord.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    farm: (f = msg.getFarm()) && proto.crescent.lpfarm.v1beta1.Farm.toObject(includeInstance, f)
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
 * @return {!proto.crescent.lpfarm.v1beta1.FarmRecord}
 */
proto.crescent.lpfarm.v1beta1.FarmRecord.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.crescent.lpfarm.v1beta1.FarmRecord;
  return proto.crescent.lpfarm.v1beta1.FarmRecord.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.crescent.lpfarm.v1beta1.FarmRecord} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.crescent.lpfarm.v1beta1.FarmRecord}
 */
proto.crescent.lpfarm.v1beta1.FarmRecord.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 2:
      var value = new proto.crescent.lpfarm.v1beta1.Farm;
      reader.readMessage(value,proto.crescent.lpfarm.v1beta1.Farm.deserializeBinaryFromReader);
      msg.setFarm(value);
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
proto.crescent.lpfarm.v1beta1.FarmRecord.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.crescent.lpfarm.v1beta1.FarmRecord.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.crescent.lpfarm.v1beta1.FarmRecord} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.crescent.lpfarm.v1beta1.FarmRecord.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getFarm();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.crescent.lpfarm.v1beta1.Farm.serializeBinaryToWriter
    );
  }
};


/**
 * optional string denom = 1;
 * @return {string}
 */
proto.crescent.lpfarm.v1beta1.FarmRecord.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.crescent.lpfarm.v1beta1.FarmRecord} returns this
 */
proto.crescent.lpfarm.v1beta1.FarmRecord.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional Farm farm = 2;
 * @return {?proto.crescent.lpfarm.v1beta1.Farm}
 */
proto.crescent.lpfarm.v1beta1.FarmRecord.prototype.getFarm = function() {
  return /** @type{?proto.crescent.lpfarm.v1beta1.Farm} */ (
    jspb.Message.getWrapperField(this, proto.crescent.lpfarm.v1beta1.Farm, 2));
};


/**
 * @param {?proto.crescent.lpfarm.v1beta1.Farm|undefined} value
 * @return {!proto.crescent.lpfarm.v1beta1.FarmRecord} returns this
*/
proto.crescent.lpfarm.v1beta1.FarmRecord.prototype.setFarm = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.crescent.lpfarm.v1beta1.FarmRecord} returns this
 */
proto.crescent.lpfarm.v1beta1.FarmRecord.prototype.clearFarm = function() {
  return this.setFarm(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.crescent.lpfarm.v1beta1.FarmRecord.prototype.hasFarm = function() {
  return jspb.Message.getField(this, 2) != null;
};


