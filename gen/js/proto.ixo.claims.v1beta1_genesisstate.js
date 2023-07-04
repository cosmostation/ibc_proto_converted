// source: ixo/claims/v1beta1/genesis.proto
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

goog.provide('proto.ixo.claims.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ixo.claims.v1beta1.Claim');
goog.require('proto.ixo.claims.v1beta1.Collection');
goog.require('proto.ixo.claims.v1beta1.Dispute');
goog.require('proto.ixo.claims.v1beta1.Params');

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
proto.ixo.claims.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ixo.claims.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.ixo.claims.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.claims.v1beta1.GenesisState.displayName = 'proto.ixo.claims.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ixo.claims.v1beta1.GenesisState.repeatedFields_ = [2,3,4];



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
proto.ixo.claims.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.claims.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.claims.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    params: (f = msg.getParams()) && proto.ixo.claims.v1beta1.Params.toObject(includeInstance, f),
    collectionsList: jspb.Message.toObjectList(msg.getCollectionsList(),
    proto.ixo.claims.v1beta1.Collection.toObject, includeInstance),
    claimsList: jspb.Message.toObjectList(msg.getClaimsList(),
    proto.ixo.claims.v1beta1.Claim.toObject, includeInstance),
    disputesList: jspb.Message.toObjectList(msg.getDisputesList(),
    proto.ixo.claims.v1beta1.Dispute.toObject, includeInstance)
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
 * @return {!proto.ixo.claims.v1beta1.GenesisState}
 */
proto.ixo.claims.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.claims.v1beta1.GenesisState;
  return proto.ixo.claims.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.claims.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.claims.v1beta1.GenesisState}
 */
proto.ixo.claims.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.ixo.claims.v1beta1.Params;
      reader.readMessage(value,proto.ixo.claims.v1beta1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
      break;
    case 2:
      var value = new proto.ixo.claims.v1beta1.Collection;
      reader.readMessage(value,proto.ixo.claims.v1beta1.Collection.deserializeBinaryFromReader);
      msg.addCollections(value);
      break;
    case 3:
      var value = new proto.ixo.claims.v1beta1.Claim;
      reader.readMessage(value,proto.ixo.claims.v1beta1.Claim.deserializeBinaryFromReader);
      msg.addClaims(value);
      break;
    case 4:
      var value = new proto.ixo.claims.v1beta1.Dispute;
      reader.readMessage(value,proto.ixo.claims.v1beta1.Dispute.deserializeBinaryFromReader);
      msg.addDisputes(value);
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
proto.ixo.claims.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.claims.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.claims.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.claims.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.ixo.claims.v1beta1.Params.serializeBinaryToWriter
    );
  }
  f = message.getCollectionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.ixo.claims.v1beta1.Collection.serializeBinaryToWriter
    );
  }
  f = message.getClaimsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.ixo.claims.v1beta1.Claim.serializeBinaryToWriter
    );
  }
  f = message.getDisputesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.ixo.claims.v1beta1.Dispute.serializeBinaryToWriter
    );
  }
};


/**
 * optional Params params = 1;
 * @return {?proto.ixo.claims.v1beta1.Params}
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.getParams = function() {
  return /** @type{?proto.ixo.claims.v1beta1.Params} */ (
    jspb.Message.getWrapperField(this, proto.ixo.claims.v1beta1.Params, 1));
};


/**
 * @param {?proto.ixo.claims.v1beta1.Params|undefined} value
 * @return {!proto.ixo.claims.v1beta1.GenesisState} returns this
*/
proto.ixo.claims.v1beta1.GenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ixo.claims.v1beta1.GenesisState} returns this
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated Collection collections = 2;
 * @return {!Array<!proto.ixo.claims.v1beta1.Collection>}
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.getCollectionsList = function() {
  return /** @type{!Array<!proto.ixo.claims.v1beta1.Collection>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ixo.claims.v1beta1.Collection, 2));
};


/**
 * @param {!Array<!proto.ixo.claims.v1beta1.Collection>} value
 * @return {!proto.ixo.claims.v1beta1.GenesisState} returns this
*/
proto.ixo.claims.v1beta1.GenesisState.prototype.setCollectionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.ixo.claims.v1beta1.Collection=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ixo.claims.v1beta1.Collection}
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.addCollections = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.ixo.claims.v1beta1.Collection, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.claims.v1beta1.GenesisState} returns this
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.clearCollectionsList = function() {
  return this.setCollectionsList([]);
};


/**
 * repeated Claim claims = 3;
 * @return {!Array<!proto.ixo.claims.v1beta1.Claim>}
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.getClaimsList = function() {
  return /** @type{!Array<!proto.ixo.claims.v1beta1.Claim>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ixo.claims.v1beta1.Claim, 3));
};


/**
 * @param {!Array<!proto.ixo.claims.v1beta1.Claim>} value
 * @return {!proto.ixo.claims.v1beta1.GenesisState} returns this
*/
proto.ixo.claims.v1beta1.GenesisState.prototype.setClaimsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.ixo.claims.v1beta1.Claim=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ixo.claims.v1beta1.Claim}
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.addClaims = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.ixo.claims.v1beta1.Claim, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.claims.v1beta1.GenesisState} returns this
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.clearClaimsList = function() {
  return this.setClaimsList([]);
};


/**
 * repeated Dispute disputes = 4;
 * @return {!Array<!proto.ixo.claims.v1beta1.Dispute>}
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.getDisputesList = function() {
  return /** @type{!Array<!proto.ixo.claims.v1beta1.Dispute>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ixo.claims.v1beta1.Dispute, 4));
};


/**
 * @param {!Array<!proto.ixo.claims.v1beta1.Dispute>} value
 * @return {!proto.ixo.claims.v1beta1.GenesisState} returns this
*/
proto.ixo.claims.v1beta1.GenesisState.prototype.setDisputesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.ixo.claims.v1beta1.Dispute=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ixo.claims.v1beta1.Dispute}
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.addDisputes = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.ixo.claims.v1beta1.Dispute, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ixo.claims.v1beta1.GenesisState} returns this
 */
proto.ixo.claims.v1beta1.GenesisState.prototype.clearDisputesList = function() {
  return this.setDisputesList([]);
};

