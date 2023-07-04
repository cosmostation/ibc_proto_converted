// source: regen/ecocredit/v1alpha2/tx.proto
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

goog.provide('proto.regen.ecocredit.v1alpha2.MsgCancel');
goog.provide('proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.regen.ecocredit.v1alpha2.MsgCancel = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.regen.ecocredit.v1alpha2.MsgCancel.repeatedFields_, null);
};
goog.inherits(proto.regen.ecocredit.v1alpha2.MsgCancel, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.ecocredit.v1alpha2.MsgCancel.displayName = 'proto.regen.ecocredit.v1alpha2.MsgCancel';
}
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
proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.displayName = 'proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.repeatedFields_ = [2];



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
proto.regen.ecocredit.v1alpha2.MsgCancel.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.ecocredit.v1alpha2.MsgCancel.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.ecocredit.v1alpha2.MsgCancel} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.toObject = function(includeInstance, msg) {
  var f, obj = {
    holder: jspb.Message.getFieldWithDefault(msg, 1, ""),
    creditsList: jspb.Message.toObjectList(msg.getCreditsList(),
    proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.toObject, includeInstance)
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
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCancel}
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.ecocredit.v1alpha2.MsgCancel;
  return proto.regen.ecocredit.v1alpha2.MsgCancel.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.ecocredit.v1alpha2.MsgCancel} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCancel}
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setHolder(value);
      break;
    case 2:
      var value = new proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits;
      reader.readMessage(value,proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.deserializeBinaryFromReader);
      msg.addCredits(value);
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
proto.regen.ecocredit.v1alpha2.MsgCancel.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.ecocredit.v1alpha2.MsgCancel.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.ecocredit.v1alpha2.MsgCancel} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHolder();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCreditsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.serializeBinaryToWriter
    );
  }
};





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
proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.toObject = function(includeInstance, msg) {
  var f, obj = {
    batchDenom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    amount: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits}
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits;
  return proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits}
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setBatchDenom(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAmount(value);
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
proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBatchDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAmount();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional string batch_denom = 1;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.prototype.getBatchDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.prototype.setBatchDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string amount = 2;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.prototype.getAmount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits.prototype.setAmount = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string holder = 1;
 * @return {string}
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.prototype.getHolder = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCancel} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.prototype.setHolder = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated CancelCredits credits = 2;
 * @return {!Array<!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits>}
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.prototype.getCreditsList = function() {
  return /** @type{!Array<!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits, 2));
};


/**
 * @param {!Array<!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits>} value
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCancel} returns this
*/
proto.regen.ecocredit.v1alpha2.MsgCancel.prototype.setCreditsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits=} opt_value
 * @param {number=} opt_index
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits}
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.prototype.addCredits = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.regen.ecocredit.v1alpha2.MsgCancel.CancelCredits, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.regen.ecocredit.v1alpha2.MsgCancel} returns this
 */
proto.regen.ecocredit.v1alpha2.MsgCancel.prototype.clearCreditsList = function() {
  return this.setCreditsList([]);
};

