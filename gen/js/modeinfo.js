// source: cosmos/tx/v1beta1/tx.proto
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

goog.provide('proto.cosmos.tx.v1beta1.ModeInfo');
goog.provide('proto.cosmos.tx.v1beta1.ModeInfo.Multi');
goog.provide('proto.cosmos.tx.v1beta1.ModeInfo.Single');
goog.provide('proto.cosmos.tx.v1beta1.ModeInfo.SumCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.crypto.multisig.v1beta1.CompactBitArray');

goog.forwardDeclare('proto.cosmos.tx.signing.v1beta1.SignMode');
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
proto.cosmos.tx.v1beta1.ModeInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.cosmos.tx.v1beta1.ModeInfo.oneofGroups_);
};
goog.inherits(proto.cosmos.tx.v1beta1.ModeInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.tx.v1beta1.ModeInfo.displayName = 'proto.cosmos.tx.v1beta1.ModeInfo';
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
proto.cosmos.tx.v1beta1.ModeInfo.Single = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.tx.v1beta1.ModeInfo.Single, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.tx.v1beta1.ModeInfo.Single.displayName = 'proto.cosmos.tx.v1beta1.ModeInfo.Single';
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
proto.cosmos.tx.v1beta1.ModeInfo.Multi = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.tx.v1beta1.ModeInfo.Multi.repeatedFields_, null);
};
goog.inherits(proto.cosmos.tx.v1beta1.ModeInfo.Multi, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.tx.v1beta1.ModeInfo.Multi.displayName = 'proto.cosmos.tx.v1beta1.ModeInfo.Multi';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.cosmos.tx.v1beta1.ModeInfo.oneofGroups_ = [[1,2]];

/**
 * @enum {number}
 */
proto.cosmos.tx.v1beta1.ModeInfo.SumCase = {
  SUM_NOT_SET: 0,
  SINGLE: 1,
  MULTI: 2
};

/**
 * @return {proto.cosmos.tx.v1beta1.ModeInfo.SumCase}
 */
proto.cosmos.tx.v1beta1.ModeInfo.prototype.getSumCase = function() {
  return /** @type {proto.cosmos.tx.v1beta1.ModeInfo.SumCase} */(jspb.Message.computeOneofCase(this, proto.cosmos.tx.v1beta1.ModeInfo.oneofGroups_[0]));
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
proto.cosmos.tx.v1beta1.ModeInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.tx.v1beta1.ModeInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.tx.v1beta1.ModeInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.ModeInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    single: (f = msg.getSingle()) && proto.cosmos.tx.v1beta1.ModeInfo.Single.toObject(includeInstance, f),
    multi: (f = msg.getMulti()) && proto.cosmos.tx.v1beta1.ModeInfo.Multi.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo}
 */
proto.cosmos.tx.v1beta1.ModeInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.tx.v1beta1.ModeInfo;
  return proto.cosmos.tx.v1beta1.ModeInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.tx.v1beta1.ModeInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo}
 */
proto.cosmos.tx.v1beta1.ModeInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.tx.v1beta1.ModeInfo.Single;
      reader.readMessage(value,proto.cosmos.tx.v1beta1.ModeInfo.Single.deserializeBinaryFromReader);
      msg.setSingle(value);
      break;
    case 2:
      var value = new proto.cosmos.tx.v1beta1.ModeInfo.Multi;
      reader.readMessage(value,proto.cosmos.tx.v1beta1.ModeInfo.Multi.deserializeBinaryFromReader);
      msg.setMulti(value);
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
proto.cosmos.tx.v1beta1.ModeInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.tx.v1beta1.ModeInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.tx.v1beta1.ModeInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.ModeInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSingle();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.tx.v1beta1.ModeInfo.Single.serializeBinaryToWriter
    );
  }
  f = message.getMulti();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.tx.v1beta1.ModeInfo.Multi.serializeBinaryToWriter
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
proto.cosmos.tx.v1beta1.ModeInfo.Single.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.tx.v1beta1.ModeInfo.Single.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.tx.v1beta1.ModeInfo.Single} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.ModeInfo.Single.toObject = function(includeInstance, msg) {
  var f, obj = {
    mode: jspb.Message.getFieldWithDefault(msg, 1, 0)
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
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo.Single}
 */
proto.cosmos.tx.v1beta1.ModeInfo.Single.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.tx.v1beta1.ModeInfo.Single;
  return proto.cosmos.tx.v1beta1.ModeInfo.Single.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.tx.v1beta1.ModeInfo.Single} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo.Single}
 */
proto.cosmos.tx.v1beta1.ModeInfo.Single.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.cosmos.tx.signing.v1beta1.SignMode} */ (reader.readEnum());
      msg.setMode(value);
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
proto.cosmos.tx.v1beta1.ModeInfo.Single.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.tx.v1beta1.ModeInfo.Single.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.tx.v1beta1.ModeInfo.Single} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.ModeInfo.Single.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMode();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
};


/**
 * optional cosmos.tx.signing.v1beta1.SignMode mode = 1;
 * @return {!proto.cosmos.tx.signing.v1beta1.SignMode}
 */
proto.cosmos.tx.v1beta1.ModeInfo.Single.prototype.getMode = function() {
  return /** @type {!proto.cosmos.tx.signing.v1beta1.SignMode} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {!proto.cosmos.tx.signing.v1beta1.SignMode} value
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo.Single} returns this
 */
proto.cosmos.tx.v1beta1.ModeInfo.Single.prototype.setMode = function(value) {
  return jspb.Message.setProto3EnumField(this, 1, value);
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.tx.v1beta1.ModeInfo.Multi.repeatedFields_ = [2];



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
proto.cosmos.tx.v1beta1.ModeInfo.Multi.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.tx.v1beta1.ModeInfo.Multi.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.tx.v1beta1.ModeInfo.Multi} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.ModeInfo.Multi.toObject = function(includeInstance, msg) {
  var f, obj = {
    bitarray: (f = msg.getBitarray()) && proto.cosmos.crypto.multisig.v1beta1.CompactBitArray.toObject(includeInstance, f),
    modeInfosList: jspb.Message.toObjectList(msg.getModeInfosList(),
    proto.cosmos.tx.v1beta1.ModeInfo.toObject, includeInstance)
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
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo.Multi}
 */
proto.cosmos.tx.v1beta1.ModeInfo.Multi.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.tx.v1beta1.ModeInfo.Multi;
  return proto.cosmos.tx.v1beta1.ModeInfo.Multi.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.tx.v1beta1.ModeInfo.Multi} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo.Multi}
 */
proto.cosmos.tx.v1beta1.ModeInfo.Multi.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.crypto.multisig.v1beta1.CompactBitArray;
      reader.readMessage(value,proto.cosmos.crypto.multisig.v1beta1.CompactBitArray.deserializeBinaryFromReader);
      msg.setBitarray(value);
      break;
    case 2:
      var value = new proto.cosmos.tx.v1beta1.ModeInfo;
      reader.readMessage(value,proto.cosmos.tx.v1beta1.ModeInfo.deserializeBinaryFromReader);
      msg.addModeInfos(value);
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
proto.cosmos.tx.v1beta1.ModeInfo.Multi.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.tx.v1beta1.ModeInfo.Multi.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.tx.v1beta1.ModeInfo.Multi} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.ModeInfo.Multi.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBitarray();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.crypto.multisig.v1beta1.CompactBitArray.serializeBinaryToWriter
    );
  }
  f = message.getModeInfosList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.tx.v1beta1.ModeInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional cosmos.crypto.multisig.v1beta1.CompactBitArray bitarray = 1;
 * @return {?proto.cosmos.crypto.multisig.v1beta1.CompactBitArray}
 */
proto.cosmos.tx.v1beta1.ModeInfo.Multi.prototype.getBitarray = function() {
  return /** @type{?proto.cosmos.crypto.multisig.v1beta1.CompactBitArray} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.crypto.multisig.v1beta1.CompactBitArray, 1));
};


/**
 * @param {?proto.cosmos.crypto.multisig.v1beta1.CompactBitArray|undefined} value
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo.Multi} returns this
*/
proto.cosmos.tx.v1beta1.ModeInfo.Multi.prototype.setBitarray = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo.Multi} returns this
 */
proto.cosmos.tx.v1beta1.ModeInfo.Multi.prototype.clearBitarray = function() {
  return this.setBitarray(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.tx.v1beta1.ModeInfo.Multi.prototype.hasBitarray = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated ModeInfo mode_infos = 2;
 * @return {!Array<!proto.cosmos.tx.v1beta1.ModeInfo>}
 */
proto.cosmos.tx.v1beta1.ModeInfo.Multi.prototype.getModeInfosList = function() {
  return /** @type{!Array<!proto.cosmos.tx.v1beta1.ModeInfo>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.tx.v1beta1.ModeInfo, 2));
};


/**
 * @param {!Array<!proto.cosmos.tx.v1beta1.ModeInfo>} value
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo.Multi} returns this
*/
proto.cosmos.tx.v1beta1.ModeInfo.Multi.prototype.setModeInfosList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.tx.v1beta1.ModeInfo=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo}
 */
proto.cosmos.tx.v1beta1.ModeInfo.Multi.prototype.addModeInfos = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.tx.v1beta1.ModeInfo, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo.Multi} returns this
 */
proto.cosmos.tx.v1beta1.ModeInfo.Multi.prototype.clearModeInfosList = function() {
  return this.setModeInfosList([]);
};


/**
 * optional Single single = 1;
 * @return {?proto.cosmos.tx.v1beta1.ModeInfo.Single}
 */
proto.cosmos.tx.v1beta1.ModeInfo.prototype.getSingle = function() {
  return /** @type{?proto.cosmos.tx.v1beta1.ModeInfo.Single} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.tx.v1beta1.ModeInfo.Single, 1));
};


/**
 * @param {?proto.cosmos.tx.v1beta1.ModeInfo.Single|undefined} value
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo} returns this
*/
proto.cosmos.tx.v1beta1.ModeInfo.prototype.setSingle = function(value) {
  return jspb.Message.setOneofWrapperField(this, 1, proto.cosmos.tx.v1beta1.ModeInfo.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo} returns this
 */
proto.cosmos.tx.v1beta1.ModeInfo.prototype.clearSingle = function() {
  return this.setSingle(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.tx.v1beta1.ModeInfo.prototype.hasSingle = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Multi multi = 2;
 * @return {?proto.cosmos.tx.v1beta1.ModeInfo.Multi}
 */
proto.cosmos.tx.v1beta1.ModeInfo.prototype.getMulti = function() {
  return /** @type{?proto.cosmos.tx.v1beta1.ModeInfo.Multi} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.tx.v1beta1.ModeInfo.Multi, 2));
};


/**
 * @param {?proto.cosmos.tx.v1beta1.ModeInfo.Multi|undefined} value
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo} returns this
*/
proto.cosmos.tx.v1beta1.ModeInfo.prototype.setMulti = function(value) {
  return jspb.Message.setOneofWrapperField(this, 2, proto.cosmos.tx.v1beta1.ModeInfo.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.tx.v1beta1.ModeInfo} returns this
 */
proto.cosmos.tx.v1beta1.ModeInfo.prototype.clearMulti = function() {
  return this.setMulti(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.tx.v1beta1.ModeInfo.prototype.hasMulti = function() {
  return jspb.Message.getField(this, 2) != null;
};


