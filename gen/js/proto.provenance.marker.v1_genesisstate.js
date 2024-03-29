// source: provenance/marker/v1/genesis.proto
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

goog.provide('proto.provenance.marker.v1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.marker.v1.MarkerAccount');
goog.require('proto.provenance.marker.v1.Params');

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
proto.provenance.marker.v1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.marker.v1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.provenance.marker.v1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.marker.v1.GenesisState.displayName = 'proto.provenance.marker.v1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.marker.v1.GenesisState.repeatedFields_ = [2];



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
proto.provenance.marker.v1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.marker.v1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.marker.v1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.provenance.marker.v1.Params.toObject(includeInstance, f),
    markersList: jspb.Message.toObjectList(msg.getMarkersList(),
    proto.provenance.marker.v1.MarkerAccount.toObject, includeInstance)
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
 * @return {!proto.provenance.marker.v1.GenesisState}
 */
proto.provenance.marker.v1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.marker.v1.GenesisState;
  return proto.provenance.marker.v1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.marker.v1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.marker.v1.GenesisState}
 */
proto.provenance.marker.v1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.marker.v1.Params;
      reader.readMessage(value,proto.provenance.marker.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.provenance.marker.v1.MarkerAccount;
      reader.readMessage(value,proto.provenance.marker.v1.MarkerAccount.deserializeBinaryFromReader);
      msg.addMarkers(value);
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
proto.provenance.marker.v1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.marker.v1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.marker.v1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.marker.v1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.provenance.marker.v1.Params.serializeBinaryToWriter
    );
  }
  f = message.getMarkersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.provenance.marker.v1.MarkerAccount.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.provenance.marker.v1.Params}
 */
proto.provenance.marker.v1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.provenance.marker.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.provenance.marker.v1.Params, 1));
};


/**
 * @param {?proto.provenance.marker.v1.Params|undefined} value
 * @return {!proto.provenance.marker.v1.GenesisState} returns this
*/
proto.provenance.marker.v1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.marker.v1.GenesisState} returns this
 */
proto.provenance.marker.v1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.marker.v1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated MarkerAccount markers = 2;
 * @return {!Array<!proto.provenance.marker.v1.MarkerAccount>}
 */
proto.provenance.marker.v1.GenesisState.prototype.getMarkersList = function() {
  return /** @type{!Array<!proto.provenance.marker.v1.MarkerAccount>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.marker.v1.MarkerAccount, 2));
};


/**
 * @param {!Array<!proto.provenance.marker.v1.MarkerAccount>} value
 * @return {!proto.provenance.marker.v1.GenesisState} returns this
*/
proto.provenance.marker.v1.GenesisState.prototype.setMarkersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.provenance.marker.v1.MarkerAccount=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.marker.v1.MarkerAccount}
 */
proto.provenance.marker.v1.GenesisState.prototype.addMarkers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.provenance.marker.v1.MarkerAccount, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.marker.v1.GenesisState} returns this
 */
proto.provenance.marker.v1.GenesisState.prototype.clearMarkersList = function() {
  return this.setMarkersList([]);
};


