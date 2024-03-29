// source: lum-network/beam/beam.proto
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

goog.provide('proto.lum.network.beam.BeamMerchantReview');
goog.provide('proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent');
goog.provide('proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating');

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
proto.lum.network.beam.BeamMerchantReview = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lum.network.beam.BeamMerchantReview, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.beam.BeamMerchantReview.displayName = 'proto.lum.network.beam.BeamMerchantReview';
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
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.displayName = 'proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating';
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
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.displayName = 'proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent';
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
proto.lum.network.beam.BeamMerchantReview.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.beam.BeamMerchantReview.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.beam.BeamMerchantReview} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.beam.BeamMerchantReview.toObject = function(includeInstance, msg) {
  var f, obj = {
    orderId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    reviewId: jspb.Message.getFieldWithDefault(msg, 2, ""),
    merchantUrl: jspb.Message.getFieldWithDefault(msg, 3, ""),
    ratingUrl: jspb.Message.getFieldWithDefault(msg, 4, ""),
    reviewUrl: jspb.Message.getFieldWithDefault(msg, 5, ""),
    collectionMethod: jspb.Message.getFieldWithDefault(msg, 6, ""),
    timestamp: jspb.Message.getFieldWithDefault(msg, 7, ""),
    ratings: (f = msg.getRatings()) && proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.toObject(includeInstance, f),
    title: jspb.Message.getFieldWithDefault(msg, 9, ""),
    content: (f = msg.getContent()) && proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.toObject(includeInstance, f)
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
 * @return {!proto.lum.network.beam.BeamMerchantReview}
 */
proto.lum.network.beam.BeamMerchantReview.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.beam.BeamMerchantReview;
  return proto.lum.network.beam.BeamMerchantReview.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.beam.BeamMerchantReview} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.beam.BeamMerchantReview}
 */
proto.lum.network.beam.BeamMerchantReview.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOrderId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setReviewId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMerchantUrl(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setRatingUrl(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setReviewUrl(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setCollectionMethod(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setTimestamp(value);
      break;
    case 8:
      var value = new proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating;
      reader.readMessage(value,proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.deserializeBinaryFromReader);
      msg.setRatings(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 10:
      var value = new proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent;
      reader.readMessage(value,proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.deserializeBinaryFromReader);
      msg.setContent(value);
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
proto.lum.network.beam.BeamMerchantReview.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.beam.BeamMerchantReview.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.beam.BeamMerchantReview} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.beam.BeamMerchantReview.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOrderId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getReviewId();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMerchantUrl();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getRatingUrl();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getReviewUrl();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getCollectionMethod();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getTimestamp();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getRatings();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.serializeBinaryToWriter
    );
  }
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getContent();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.serializeBinaryToWriter
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
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.toObject = function(includeInstance, msg) {
  var f, obj = {
    overall: jspb.Message.getFloatingPointFieldWithDefault(msg, 1, 0.0),
    customerService: jspb.Message.getFloatingPointFieldWithDefault(msg, 2, 0.0),
    nps: jspb.Message.getFloatingPointFieldWithDefault(msg, 3, 0.0)
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
 * @return {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating}
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating;
  return proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating}
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setOverall(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setCustomerService(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readFloat());
      msg.setNps(value);
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
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOverall();
  if (f !== 0.0) {
    writer.writeFloat(
      1,
      f
    );
  }
  f = message.getCustomerService();
  if (f !== 0.0) {
    writer.writeFloat(
      2,
      f
    );
  }
  f = message.getNps();
  if (f !== 0.0) {
    writer.writeFloat(
      3,
      f
    );
  }
};


/**
 * optional float overall = 1;
 * @return {number}
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.prototype.getOverall = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 1, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating} returns this
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.prototype.setOverall = function(value) {
  return jspb.Message.setProto3FloatField(this, 1, value);
};


/**
 * optional float customer_service = 2;
 * @return {number}
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.prototype.getCustomerService = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 2, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating} returns this
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.prototype.setCustomerService = function(value) {
  return jspb.Message.setProto3FloatField(this, 2, value);
};


/**
 * optional float nps = 3;
 * @return {number}
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.prototype.getNps = function() {
  return /** @type {number} */ (jspb.Message.getFloatingPointFieldWithDefault(this, 3, 0.0));
};


/**
 * @param {number} value
 * @return {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating} returns this
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating.prototype.setNps = function(value) {
  return jspb.Message.setProto3FloatField(this, 3, value);
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
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.prototype.toObject = function(opt_includeInstance) {
  return proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.toObject = function(includeInstance, msg) {
  var f, obj = {
    overall: jspb.Message.getFieldWithDefault(msg, 1, ""),
    customerService: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent}
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent;
  return proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent}
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOverall(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setCustomerService(value);
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
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOverall();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getCustomerService();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional string overall = 1;
 * @return {string}
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.prototype.getOverall = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent} returns this
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.prototype.setOverall = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string customer_service = 2;
 * @return {string}
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.prototype.getCustomerService = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent} returns this
 */
proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent.prototype.setCustomerService = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string order_id = 1;
 * @return {string}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.getOrderId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
 */
proto.lum.network.beam.BeamMerchantReview.prototype.setOrderId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string review_id = 2;
 * @return {string}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.getReviewId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
 */
proto.lum.network.beam.BeamMerchantReview.prototype.setReviewId = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string merchant_url = 3;
 * @return {string}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.getMerchantUrl = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
 */
proto.lum.network.beam.BeamMerchantReview.prototype.setMerchantUrl = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string rating_url = 4;
 * @return {string}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.getRatingUrl = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
 */
proto.lum.network.beam.BeamMerchantReview.prototype.setRatingUrl = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string review_url = 5;
 * @return {string}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.getReviewUrl = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
 */
proto.lum.network.beam.BeamMerchantReview.prototype.setReviewUrl = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string collection_method = 6;
 * @return {string}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.getCollectionMethod = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
 */
proto.lum.network.beam.BeamMerchantReview.prototype.setCollectionMethod = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string timestamp = 7;
 * @return {string}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.getTimestamp = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
 */
proto.lum.network.beam.BeamMerchantReview.prototype.setTimestamp = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional BeamMerchantReviewRating ratings = 8;
 * @return {?proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.getRatings = function() {
  return /** @type{?proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating} */ (
    jspb.Message.getWrapperField(this, proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating, 8));
};


/**
 * @param {?proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRating|undefined} value
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
*/
proto.lum.network.beam.BeamMerchantReview.prototype.setRatings = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
 */
proto.lum.network.beam.BeamMerchantReview.prototype.clearRatings = function() {
  return this.setRatings(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.hasRatings = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional string title = 9;
 * @return {string}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
 */
proto.lum.network.beam.BeamMerchantReview.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional BeamMerchantReviewContent content = 10;
 * @return {?proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.getContent = function() {
  return /** @type{?proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent} */ (
    jspb.Message.getWrapperField(this, proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent, 10));
};


/**
 * @param {?proto.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContent|undefined} value
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
*/
proto.lum.network.beam.BeamMerchantReview.prototype.setContent = function(value) {
  return jspb.Message.setWrapperField(this, 10, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.lum.network.beam.BeamMerchantReview} returns this
 */
proto.lum.network.beam.BeamMerchantReview.prototype.clearContent = function() {
  return this.setContent(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.lum.network.beam.BeamMerchantReview.prototype.hasContent = function() {
  return jspb.Message.getField(this, 10) != null;
};


