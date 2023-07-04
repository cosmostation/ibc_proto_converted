// source: ixo/token/v1beta1/genesis.proto
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

goog.provide('proto.ixo.token.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ixo.token.v1beta1.Params');
goog.require('proto.ixo.token.v1beta1.Token');
goog.require('proto.ixo.token.v1beta1.TokenProperties');

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
proto.ixo.token.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ixo.token.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.ixo.token.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.token.v1beta1.GenesisState.displayName = 'proto.ixo.token.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ixo.token.v1beta1.GenesisState.repeatedFields_ = [2,3];



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
proto.ixo.token.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.token.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.token.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.token.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.ixo.token.v1beta1.Params.toObject(includeInstance, f),
    tokensList: jspb.Message.toObjectList(msg.getTokensList(),
    proto.ixo.token.v1beta1.Token.toObject, includeInstance),
    tokenPropertiesList: jspb.Message.toObjectList(msg.getTokenPropertiesList(),
    proto.ixo.token.v1beta1.TokenProperties.toObject, includeInstance)
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
 * @return {!proto.ixo.token.v1beta1.GenesisState}
 */
proto.ixo.token.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.token.v1beta1.GenesisState;
  return proto.ixo.token.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.token.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.token.v1beta1.GenesisState}
 */
proto.ixo.token.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.ixo.token.v1beta1.Params;
      reader.readMessage(value,proto.ixo.token.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.ixo.token.v1beta1.Token;
      reader.readMessage(value,proto.ixo.token.v1beta1.Token.deserializeBinaryFromReader);
      msg.addTokens(value);
      break;
    case 3:
      var value = new proto.ixo.token.v1beta1.TokenProperties;
      reader.readMessage(value,proto.ixo.token.v1beta1.TokenProperties.deserializeBinaryFromReader);
      msg.addTokenProperties(value);
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
proto.ixo.token.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.token.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.token.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.token.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.ixo.token.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getTokensList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.ixo.token.v1beta1.Token.serializeBinaryToWriter
    );
  }
  f = message.getTokenPropertiesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.ixo.token.v1beta1.TokenProperties.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.ixo.token.v1beta1.Params}
 */
proto.ixo.token.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.ixo.token.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.ixo.token.v1beta1.Params, 1));
};


/**
 * @param {?proto.ixo.token.v1beta1.Params|undefined} value
 * @return {!proto.ixo.token.v1beta1.GenesisState} returns this
*/
proto.ixo.token.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.token.v1beta1.GenesisState} returns this
 */
proto.ixo.token.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.token.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Token tokens = 2;
 * @return {!Array<!proto.ixo.token.v1beta1.Token>}
 */
proto.ixo.token.v1beta1.GenesisState.prototype.getTokensList = function() {
  return /** @type{!Array<!proto.ixo.token.v1beta1.Token>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ixo.token.v1beta1.Token, 2));
};


/**
 * @param {!Array<!proto.ixo.token.v1beta1.Token>} value
 * @return {!proto.ixo.token.v1beta1.GenesisState} returns this
*/
proto.ixo.token.v1beta1.GenesisState.prototype.setTokensList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.ixo.token.v1beta1.Token=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ixo.token.v1beta1.Token}
 */
proto.ixo.token.v1beta1.GenesisState.prototype.addTokens = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.ixo.token.v1beta1.Token, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.token.v1beta1.GenesisState} returns this
 */
proto.ixo.token.v1beta1.GenesisState.prototype.clearTokensList = function() {
  return this.setTokensList([]);
};


/**
 * repeated TokenProperties token_properties = 3;
 * @return {!Array<!proto.ixo.token.v1beta1.TokenProperties>}
 */
proto.ixo.token.v1beta1.GenesisState.prototype.getTokenPropertiesList = function() {
  return /** @type{!Array<!proto.ixo.token.v1beta1.TokenProperties>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ixo.token.v1beta1.TokenProperties, 3));
};


/**
 * @param {!Array<!proto.ixo.token.v1beta1.TokenProperties>} value
 * @return {!proto.ixo.token.v1beta1.GenesisState} returns this
*/
proto.ixo.token.v1beta1.GenesisState.prototype.setTokenPropertiesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.ixo.token.v1beta1.TokenProperties=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ixo.token.v1beta1.TokenProperties}
 */
proto.ixo.token.v1beta1.GenesisState.prototype.addTokenProperties = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.ixo.token.v1beta1.TokenProperties, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.token.v1beta1.GenesisState} returns this
 */
proto.ixo.token.v1beta1.GenesisState.prototype.clearTokenPropertiesList = function() {
  return this.setTokenPropertiesList([]);
};

