// source: em/market/v1/query.proto
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

goog.provide('proto.em.market.v1.QueryInstrumentsResponse');
goog.provide('proto.em.market.v1.QueryInstrumentsResponse.Element');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Timestamp');

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
proto.em.market.v1.QueryInstrumentsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.em.market.v1.QueryInstrumentsResponse.repeatedFields_, null);
};
goog.inherits(proto.em.market.v1.QueryInstrumentsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.em.market.v1.QueryInstrumentsResponse.displayName = 'proto.em.market.v1.QueryInstrumentsResponse';
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
proto.em.market.v1.QueryInstrumentsResponse.Element = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.em.market.v1.QueryInstrumentsResponse.Element, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.em.market.v1.QueryInstrumentsResponse.Element.displayName = 'proto.em.market.v1.QueryInstrumentsResponse.Element';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.em.market.v1.QueryInstrumentsResponse.repeatedFields_ = [1];



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
proto.em.market.v1.QueryInstrumentsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.em.market.v1.QueryInstrumentsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.em.market.v1.QueryInstrumentsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.market.v1.QueryInstrumentsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    instrumentsList: jspb.Message.toObjectList(msg.getInstrumentsList(),
    proto.em.market.v1.QueryInstrumentsResponse.Element.toObject, includeInstance)
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
 * @return {!proto.em.market.v1.QueryInstrumentsResponse}
 */
proto.em.market.v1.QueryInstrumentsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.em.market.v1.QueryInstrumentsResponse;
  return proto.em.market.v1.QueryInstrumentsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.em.market.v1.QueryInstrumentsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.em.market.v1.QueryInstrumentsResponse}
 */
proto.em.market.v1.QueryInstrumentsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.em.market.v1.QueryInstrumentsResponse.Element;
      reader.readMessage(value,proto.em.market.v1.QueryInstrumentsResponse.Element.deserializeBinaryFromReader);
      msg.addInstruments(value);
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
proto.em.market.v1.QueryInstrumentsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.em.market.v1.QueryInstrumentsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.em.market.v1.QueryInstrumentsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.market.v1.QueryInstrumentsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getInstrumentsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.em.market.v1.QueryInstrumentsResponse.Element.serializeBinaryToWriter
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
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.toObject = function(opt_includeInstance) {
  return proto.em.market.v1.QueryInstrumentsResponse.Element.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.em.market.v1.QueryInstrumentsResponse.Element} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.toObject = function(includeInstance, msg) {
  var f, obj = {
    source: jspb.Message.getFieldWithDefault(msg, 1, ""),
    destination: jspb.Message.getFieldWithDefault(msg, 2, ""),
    lastPrice: jspb.Message.getFieldWithDefault(msg, 3, ""),
    bestPrice: jspb.Message.getFieldWithDefault(msg, 4, ""),
    lastTraded: (f = msg.getLastTraded()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.em.market.v1.QueryInstrumentsResponse.Element}
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.em.market.v1.QueryInstrumentsResponse.Element;
  return proto.em.market.v1.QueryInstrumentsResponse.Element.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.em.market.v1.QueryInstrumentsResponse.Element} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.em.market.v1.QueryInstrumentsResponse.Element}
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSource(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDestination(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setLastPrice(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setBestPrice(value);
      break;
    case 5:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setLastTraded(value);
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
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.em.market.v1.QueryInstrumentsResponse.Element.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.em.market.v1.QueryInstrumentsResponse.Element} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSource();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDestination();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getLastPrice();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getBestPrice();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getLastTraded();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional string source = 1;
 * @return {string}
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.getSource = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.QueryInstrumentsResponse.Element} returns this
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.setSource = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string destination = 2;
 * @return {string}
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.getDestination = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.QueryInstrumentsResponse.Element} returns this
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.setDestination = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string last_price = 3;
 * @return {string}
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.getLastPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.QueryInstrumentsResponse.Element} returns this
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.setLastPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string best_price = 4;
 * @return {string}
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.getBestPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.em.market.v1.QueryInstrumentsResponse.Element} returns this
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.setBestPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional google.protobuf.Timestamp last_traded = 5;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.getLastTraded = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 5));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.em.market.v1.QueryInstrumentsResponse.Element} returns this
*/
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.setLastTraded = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.em.market.v1.QueryInstrumentsResponse.Element} returns this
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.clearLastTraded = function() {
  return this.setLastTraded(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.em.market.v1.QueryInstrumentsResponse.Element.prototype.hasLastTraded = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * repeated Element instruments = 1;
 * @return {!Array<!proto.em.market.v1.QueryInstrumentsResponse.Element>}
 */
proto.em.market.v1.QueryInstrumentsResponse.prototype.getInstrumentsList = function() {
  return /** @type{!Array<!proto.em.market.v1.QueryInstrumentsResponse.Element>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.em.market.v1.QueryInstrumentsResponse.Element, 1));
};


/**
 * @param {!Array<!proto.em.market.v1.QueryInstrumentsResponse.Element>} value
 * @return {!proto.em.market.v1.QueryInstrumentsResponse} returns this
*/
proto.em.market.v1.QueryInstrumentsResponse.prototype.setInstrumentsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.em.market.v1.QueryInstrumentsResponse.Element=} opt_value
 * @param {number=} opt_index
 * @return {!proto.em.market.v1.QueryInstrumentsResponse.Element}
 */
proto.em.market.v1.QueryInstrumentsResponse.prototype.addInstruments = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.em.market.v1.QueryInstrumentsResponse.Element, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.em.market.v1.QueryInstrumentsResponse} returns this
 */
proto.em.market.v1.QueryInstrumentsResponse.prototype.clearInstrumentsList = function() {
  return this.setInstrumentsList([]);
};


