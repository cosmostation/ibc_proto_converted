// source: osmosis/protorev/v1beta1/protorev.proto
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

goog.provide('proto.osmosis.protorev.v1beta1.TokenPairArbRoutes');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.protorev.v1beta1.Route');

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
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.repeatedFields_, null);
};
goog.inherits(proto.osmosis.protorev.v1beta1.TokenPairArbRoutes, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.displayName = 'proto.osmosis.protorev.v1beta1.TokenPairArbRoutes';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.repeatedFields_ = [1];



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
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.toObject = function(includeInstance, msg) {
  var f, obj = {
    arbRoutesList: jspb.Message.toObjectList(msg.getArbRoutesList(),
    proto.osmosis.protorev.v1beta1.Route.toObject, includeInstance),
    tokenIn: jspb.Message.getFieldWithDefault(msg, 2, ""),
    tokenOut: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes}
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.protorev.v1beta1.TokenPairArbRoutes;
  return proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes}
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.protorev.v1beta1.Route;
      reader.readMessage(value,proto.osmosis.protorev.v1beta1.Route.deserializeBinaryFromReader);
      msg.addArbRoutes(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setTokenIn(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setTokenOut(value);
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
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getArbRoutesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.osmosis.protorev.v1beta1.Route.serializeBinaryToWriter
    );
  }
  f = message.getTokenIn();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getTokenOut();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * repeated Route arb_routes = 1;
 * @return {!Array<!proto.osmosis.protorev.v1beta1.Route>}
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.prototype.getArbRoutesList = function() {
  return /** @type{!Array<!proto.osmosis.protorev.v1beta1.Route>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.protorev.v1beta1.Route, 1));
};


/**
 * @param {!Array<!proto.osmosis.protorev.v1beta1.Route>} value
 * @return {!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes} returns this
*/
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.prototype.setArbRoutesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.osmosis.protorev.v1beta1.Route=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.protorev.v1beta1.Route}
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.prototype.addArbRoutes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.osmosis.protorev.v1beta1.Route, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes} returns this
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.prototype.clearArbRoutesList = function() {
  return this.setArbRoutesList([]);
};


/**
 * optional string token_in = 2;
 * @return {string}
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.prototype.getTokenIn = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes} returns this
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.prototype.setTokenIn = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string token_out = 3;
 * @return {string}
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.prototype.getTokenOut = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.protorev.v1beta1.TokenPairArbRoutes} returns this
 */
proto.osmosis.protorev.v1beta1.TokenPairArbRoutes.prototype.setTokenOut = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


