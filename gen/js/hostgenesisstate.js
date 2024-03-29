// source: ibc/applications/interchain_accounts/genesis/v1/genesis.proto
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

goog.provide('proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel');
goog.require('proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount');
goog.require('proto.ibc.applications.interchain_accounts.host.v1.Params');

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
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.repeatedFields_, null);
};
goog.inherits(proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.displayName = 'proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.repeatedFields_ = [1,2];



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
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.toObject = function(includeInstance, msg) {
  var f, obj = {
    activeChannelsList: jspb.Message.toObjectList(msg.getActiveChannelsList(),
    proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.toObject, includeInstance),
    interchainAccountsList: jspb.Message.toObjectList(msg.getInterchainAccountsList(),
    proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount.toObject, includeInstance),
    port: jspb.Message.getFieldWithDefault(msg, 3, ""),
    params: (f = msg.getParams()) && proto.ibc.applications.interchain_accounts.host.v1.Params.toObject(includeInstance, f)
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
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState;
  return proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel;
      reader.readMessage(value,proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.deserializeBinaryFromReader);
      msg.addActiveChannels(value);
      break;
    case 2:
      var value = new proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount;
      reader.readMessage(value,proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount.deserializeBinaryFromReader);
      msg.addInterchainAccounts(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setPort(value);
      break;
    case 4:
      var value = new proto.ibc.applications.interchain_accounts.host.v1.Params;
      reader.readMessage(value,proto.ibc.applications.interchain_accounts.host.v1.Params.deserializeBinaryFromReader);
      msg.setParams(value);
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
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getActiveChannelsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel.serializeBinaryToWriter
    );
  }
  f = message.getInterchainAccountsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount.serializeBinaryToWriter
    );
  }
  f = message.getPort();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getParams();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.ibc.applications.interchain_accounts.host.v1.Params.serializeBinaryToWriter
    );
  }
};


/**
 * repeated ActiveChannel active_channels = 1;
 * @return {!Array<!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel>}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.getActiveChannelsList = function() {
  return /** @type{!Array<!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel, 1));
};


/**
 * @param {!Array<!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel>} value
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState} returns this
*/
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.setActiveChannelsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.addActiveChannels = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.ibc.applications.interchain_accounts.genesis.v1.ActiveChannel, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState} returns this
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.clearActiveChannelsList = function() {
  return this.setActiveChannelsList([]);
};


/**
 * repeated RegisteredInterchainAccount interchain_accounts = 2;
 * @return {!Array<!proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount>}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.getInterchainAccountsList = function() {
  return /** @type{!Array<!proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount, 2));
};


/**
 * @param {!Array<!proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount>} value
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState} returns this
*/
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.setInterchainAccountsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount=} opt_value
 * @param {number=} opt_index
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.addInterchainAccounts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.ibc.applications.interchain_accounts.genesis.v1.RegisteredInterchainAccount, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState} returns this
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.clearInterchainAccountsList = function() {
  return this.setInterchainAccountsList([]);
};


/**
 * optional string port = 3;
 * @return {string}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.getPort = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState} returns this
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.setPort = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional ibc.applications.interchain_accounts.host.v1.Params params = 4;
 * @return {?proto.ibc.applications.interchain_accounts.host.v1.Params}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.getParams = function() {
  return /** @type{?proto.ibc.applications.interchain_accounts.host.v1.Params} */ (
    jspb.Message.getWrapperField(this, proto.ibc.applications.interchain_accounts.host.v1.Params, 4));
};


/**
 * @param {?proto.ibc.applications.interchain_accounts.host.v1.Params|undefined} value
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState} returns this
*/
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.setParams = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState} returns this
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.clearParams = function() {
  return this.setParams(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.applications.interchain_accounts.genesis.v1.HostGenesisState.prototype.hasParams = function() {
  return jspb.Message.getField(this, 4) != null;
};


