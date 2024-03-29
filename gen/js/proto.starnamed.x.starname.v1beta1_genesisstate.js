// source: iov/starname/v1beta1/genesis.proto
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

goog.provide('proto.starnamed.x.starname.v1beta1.GenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.starnamed.x.starname.v1beta1.Account');
goog.require('proto.starnamed.x.starname.v1beta1.Domain');

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
proto.starnamed.x.starname.v1beta1.GenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.starnamed.x.starname.v1beta1.GenesisState.repeatedFields_, null);
};
goog.inherits(proto.starnamed.x.starname.v1beta1.GenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.starnamed.x.starname.v1beta1.GenesisState.displayName = 'proto.starnamed.x.starname.v1beta1.GenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.starnamed.x.starname.v1beta1.GenesisState.repeatedFields_ = [1,2];



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
proto.starnamed.x.starname.v1beta1.GenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.starnamed.x.starname.v1beta1.GenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.starnamed.x.starname.v1beta1.GenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.starname.v1beta1.GenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    domainsList: jspb.Message.toObjectList(msg.getDomainsList(),
    proto.starnamed.x.starname.v1beta1.Domain.toObject, includeInstance),
    accountsList: jspb.Message.toObjectList(msg.getAccountsList(),
    proto.starnamed.x.starname.v1beta1.Account.toObject, includeInstance)
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
 * @return {!proto.starnamed.x.starname.v1beta1.GenesisState}
 */
proto.starnamed.x.starname.v1beta1.GenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.starnamed.x.starname.v1beta1.GenesisState;
  return proto.starnamed.x.starname.v1beta1.GenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.starnamed.x.starname.v1beta1.GenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.starnamed.x.starname.v1beta1.GenesisState}
 */
proto.starnamed.x.starname.v1beta1.GenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.starnamed.x.starname.v1beta1.Domain;
      reader.readMessage(value,proto.starnamed.x.starname.v1beta1.Domain.deserializeBinaryFromReader);
      msg.addDomains(value);
      break;
    case 2:
      var value = new proto.starnamed.x.starname.v1beta1.Account;
      reader.readMessage(value,proto.starnamed.x.starname.v1beta1.Account.deserializeBinaryFromReader);
      msg.addAccounts(value);
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
proto.starnamed.x.starname.v1beta1.GenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.starnamed.x.starname.v1beta1.GenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.starnamed.x.starname.v1beta1.GenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.starname.v1beta1.GenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDomainsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.starnamed.x.starname.v1beta1.Domain.serializeBinaryToWriter
    );
  }
  f = message.getAccountsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.starnamed.x.starname.v1beta1.Account.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Domain domains = 1;
 * @return {!Array<!proto.starnamed.x.starname.v1beta1.Domain>}
 */
proto.starnamed.x.starname.v1beta1.GenesisState.prototype.getDomainsList = function() {
  return /** @type{!Array<!proto.starnamed.x.starname.v1beta1.Domain>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.starnamed.x.starname.v1beta1.Domain, 1));
};


/**
 * @param {!Array<!proto.starnamed.x.starname.v1beta1.Domain>} value
 * @return {!proto.starnamed.x.starname.v1beta1.GenesisState} returns this
*/
proto.starnamed.x.starname.v1beta1.GenesisState.prototype.setDomainsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.starnamed.x.starname.v1beta1.Domain=} opt_value
 * @param {number=} opt_index
 * @return {!proto.starnamed.x.starname.v1beta1.Domain}
 */
proto.starnamed.x.starname.v1beta1.GenesisState.prototype.addDomains = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.starnamed.x.starname.v1beta1.Domain, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.starnamed.x.starname.v1beta1.GenesisState} returns this
 */
proto.starnamed.x.starname.v1beta1.GenesisState.prototype.clearDomainsList = function() {
  return this.setDomainsList([]);
};


/**
 * repeated Account accounts = 2;
 * @return {!Array<!proto.starnamed.x.starname.v1beta1.Account>}
 */
proto.starnamed.x.starname.v1beta1.GenesisState.prototype.getAccountsList = function() {
  return /** @type{!Array<!proto.starnamed.x.starname.v1beta1.Account>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.starnamed.x.starname.v1beta1.Account, 2));
};


/**
 * @param {!Array<!proto.starnamed.x.starname.v1beta1.Account>} value
 * @return {!proto.starnamed.x.starname.v1beta1.GenesisState} returns this
*/
proto.starnamed.x.starname.v1beta1.GenesisState.prototype.setAccountsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.starnamed.x.starname.v1beta1.Account=} opt_value
 * @param {number=} opt_index
 * @return {!proto.starnamed.x.starname.v1beta1.Account}
 */
proto.starnamed.x.starname.v1beta1.GenesisState.prototype.addAccounts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.starnamed.x.starname.v1beta1.Account, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.starnamed.x.starname.v1beta1.GenesisState} returns this
 */
proto.starnamed.x.starname.v1beta1.GenesisState.prototype.clearAccountsList = function() {
  return this.setAccountsList([]);
};


