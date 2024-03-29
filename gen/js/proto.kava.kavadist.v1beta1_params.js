// source: kava/kavadist/v1beta1/params.proto
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

goog.provide('proto.kava.kavadist.v1beta1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.kava.kavadist.v1beta1.InfrastructureParams');
goog.require('proto.kava.kavadist.v1beta1.Period');

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
proto.kava.kavadist.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.kava.kavadist.v1beta1.Params.repeatedFields_, null);
};
goog.inherits(proto.kava.kavadist.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kava.kavadist.v1beta1.Params.displayName = 'proto.kava.kavadist.v1beta1.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.kava.kavadist.v1beta1.Params.repeatedFields_ = [3];



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
proto.kava.kavadist.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.kava.kavadist.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kava.kavadist.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.kavadist.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    active: jspb.Message.getBooleanFieldWithDefault(msg, 1, false),
    periodsList: jspb.Message.toObjectList(msg.getPeriodsList(),
    proto.kava.kavadist.v1beta1.Period.toObject, includeInstance),
    infrastructureParams: (f = msg.getInfrastructureParams()) && proto.kava.kavadist.v1beta1.InfrastructureParams.toObject(includeInstance, f)
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
 * @return {!proto.kava.kavadist.v1beta1.Params}
 */
proto.kava.kavadist.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kava.kavadist.v1beta1.Params;
  return proto.kava.kavadist.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kava.kavadist.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kava.kavadist.v1beta1.Params}
 */
proto.kava.kavadist.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setActive(value);
      break;
    case 3:
      var value = new proto.kava.kavadist.v1beta1.Period;
      reader.readMessage(value,proto.kava.kavadist.v1beta1.Period.deserializeBinaryFromReader);
      msg.addPeriods(value);
      break;
    case 4:
      var value = new proto.kava.kavadist.v1beta1.InfrastructureParams;
      reader.readMessage(value,proto.kava.kavadist.v1beta1.InfrastructureParams.deserializeBinaryFromReader);
      msg.setInfrastructureParams(value);
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
proto.kava.kavadist.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kava.kavadist.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kava.kavadist.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kava.kavadist.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getActive();
  if (f) {
    writer.writeBool(
      1,
      f
    );
  }
  f = message.getPeriodsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.kava.kavadist.v1beta1.Period.serializeBinaryToWriter
    );
  }
  f = message.getInfrastructureParams();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.kava.kavadist.v1beta1.InfrastructureParams.serializeBinaryToWriter
    );
  }
};


/**
 * optional bool active = 1;
 * @return {boolean}
 */
proto.kava.kavadist.v1beta1.Params.prototype.getActive = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 1, false));
};


/**
 * @param {boolean} value
 * @return {!proto.kava.kavadist.v1beta1.Params} returns this
 */
proto.kava.kavadist.v1beta1.Params.prototype.setActive = function(value) {
  return jspb.Message.setProto3BooleanField(this, 1, value);
};


/**
 * repeated Period periods = 3;
 * @return {!Array<!proto.kava.kavadist.v1beta1.Period>}
 */
proto.kava.kavadist.v1beta1.Params.prototype.getPeriodsList = function() {
  return /** @type{!Array<!proto.kava.kavadist.v1beta1.Period>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.kava.kavadist.v1beta1.Period, 3));
};


/**
 * @param {!Array<!proto.kava.kavadist.v1beta1.Period>} value
 * @return {!proto.kava.kavadist.v1beta1.Params} returns this
*/
proto.kava.kavadist.v1beta1.Params.prototype.setPeriodsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.kava.kavadist.v1beta1.Period=} opt_value
 * @param {number=} opt_index
 * @return {!proto.kava.kavadist.v1beta1.Period}
 */
proto.kava.kavadist.v1beta1.Params.prototype.addPeriods = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.kava.kavadist.v1beta1.Period, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.kava.kavadist.v1beta1.Params} returns this
 */
proto.kava.kavadist.v1beta1.Params.prototype.clearPeriodsList = function() {
  return this.setPeriodsList([]);
};


/**
 * optional InfrastructureParams infrastructure_params = 4;
 * @return {?proto.kava.kavadist.v1beta1.InfrastructureParams}
 */
proto.kava.kavadist.v1beta1.Params.prototype.getInfrastructureParams = function() {
  return /** @type{?proto.kava.kavadist.v1beta1.InfrastructureParams} */ (
    jspb.Message.getWrapperField(this, proto.kava.kavadist.v1beta1.InfrastructureParams, 4));
};


/**
 * @param {?proto.kava.kavadist.v1beta1.InfrastructureParams|undefined} value
 * @return {!proto.kava.kavadist.v1beta1.Params} returns this
*/
proto.kava.kavadist.v1beta1.Params.prototype.setInfrastructureParams = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.kava.kavadist.v1beta1.Params} returns this
 */
proto.kava.kavadist.v1beta1.Params.prototype.clearInfrastructureParams = function() {
  return this.setInfrastructureParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.kava.kavadist.v1beta1.Params.prototype.hasInfrastructureParams = function() {
  return jspb.Message.getField(this, 4) != null;
};


