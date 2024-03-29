// source: tendermint/abci/types.proto
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

goog.provide('proto.tendermint.abci.Response');
goog.provide('proto.tendermint.abci.Response.ValueCase');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tendermint.abci.ResponseApplySnapshotChunk');
goog.require('proto.tendermint.abci.ResponseBeginBlock');
goog.require('proto.tendermint.abci.ResponseCheckTx');
goog.require('proto.tendermint.abci.ResponseCommit');
goog.require('proto.tendermint.abci.ResponseDeliverTx');
goog.require('proto.tendermint.abci.ResponseEcho');
goog.require('proto.tendermint.abci.ResponseEndBlock');
goog.require('proto.tendermint.abci.ResponseException');
goog.require('proto.tendermint.abci.ResponseFlush');
goog.require('proto.tendermint.abci.ResponseInfo');
goog.require('proto.tendermint.abci.ResponseInitChain');
goog.require('proto.tendermint.abci.ResponseListSnapshots');
goog.require('proto.tendermint.abci.ResponseLoadSnapshotChunk');
goog.require('proto.tendermint.abci.ResponseOfferSnapshot');
goog.require('proto.tendermint.abci.ResponsePrepareProposal');
goog.require('proto.tendermint.abci.ResponseProcessProposal');
goog.require('proto.tendermint.abci.ResponseQuery');

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
proto.tendermint.abci.Response = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.tendermint.abci.Response.oneofGroups_);
};
goog.inherits(proto.tendermint.abci.Response, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.abci.Response.displayName = 'proto.tendermint.abci.Response';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.tendermint.abci.Response.oneofGroups_ = [[1,2,3,4,6,7,8,9,10,11,12,13,14,15,16,17,18]];

/**
 * @enum {number}
 */
proto.tendermint.abci.Response.ValueCase = {
  VALUE_NOT_SET: 0,
  EXCEPTION: 1,
  ECHO: 2,
  FLUSH: 3,
  INFO: 4,
  INIT_CHAIN: 6,
  QUERY: 7,
  BEGIN_BLOCK: 8,
  CHECK_TX: 9,
  DELIVER_TX: 10,
  END_BLOCK: 11,
  COMMIT: 12,
  LIST_SNAPSHOTS: 13,
  OFFER_SNAPSHOT: 14,
  LOAD_SNAPSHOT_CHUNK: 15,
  APPLY_SNAPSHOT_CHUNK: 16,
  PREPARE_PROPOSAL: 17,
  PROCESS_PROPOSAL: 18
};

/**
 * @return {proto.tendermint.abci.Response.ValueCase}
 */
proto.tendermint.abci.Response.prototype.getValueCase = function() {
  return /** @type {proto.tendermint.abci.Response.ValueCase} */(jspb.Message.computeOneofCase(this, proto.tendermint.abci.Response.oneofGroups_[0]));
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
proto.tendermint.abci.Response.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.abci.Response.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.abci.Response} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.Response.toObject = function(includeInstance, msg) {
  var f, obj = {
    exception: (f = msg.getException()) && proto.tendermint.abci.ResponseException.toObject(includeInstance, f),
    echo: (f = msg.getEcho()) && proto.tendermint.abci.ResponseEcho.toObject(includeInstance, f),
    flush: (f = msg.getFlush()) && proto.tendermint.abci.ResponseFlush.toObject(includeInstance, f),
    info: (f = msg.getInfo()) && proto.tendermint.abci.ResponseInfo.toObject(includeInstance, f),
    initChain: (f = msg.getInitChain()) && proto.tendermint.abci.ResponseInitChain.toObject(includeInstance, f),
    query: (f = msg.getQuery()) && proto.tendermint.abci.ResponseQuery.toObject(includeInstance, f),
    beginBlock: (f = msg.getBeginBlock()) && proto.tendermint.abci.ResponseBeginBlock.toObject(includeInstance, f),
    checkTx: (f = msg.getCheckTx()) && proto.tendermint.abci.ResponseCheckTx.toObject(includeInstance, f),
    deliverTx: (f = msg.getDeliverTx()) && proto.tendermint.abci.ResponseDeliverTx.toObject(includeInstance, f),
    endBlock: (f = msg.getEndBlock()) && proto.tendermint.abci.ResponseEndBlock.toObject(includeInstance, f),
    commit: (f = msg.getCommit()) && proto.tendermint.abci.ResponseCommit.toObject(includeInstance, f),
    listSnapshots: (f = msg.getListSnapshots()) && proto.tendermint.abci.ResponseListSnapshots.toObject(includeInstance, f),
    offerSnapshot: (f = msg.getOfferSnapshot()) && proto.tendermint.abci.ResponseOfferSnapshot.toObject(includeInstance, f),
    loadSnapshotChunk: (f = msg.getLoadSnapshotChunk()) && proto.tendermint.abci.ResponseLoadSnapshotChunk.toObject(includeInstance, f),
    applySnapshotChunk: (f = msg.getApplySnapshotChunk()) && proto.tendermint.abci.ResponseApplySnapshotChunk.toObject(includeInstance, f),
    prepareProposal: (f = msg.getPrepareProposal()) && proto.tendermint.abci.ResponsePrepareProposal.toObject(includeInstance, f),
    processProposal: (f = msg.getProcessProposal()) && proto.tendermint.abci.ResponseProcessProposal.toObject(includeInstance, f)
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
 * @return {!proto.tendermint.abci.Response}
 */
proto.tendermint.abci.Response.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.abci.Response;
  return proto.tendermint.abci.Response.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.abci.Response} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.abci.Response}
 */
proto.tendermint.abci.Response.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tendermint.abci.ResponseException;
      reader.readMessage(value,proto.tendermint.abci.ResponseException.deserializeBinaryFromReader);
      msg.setException(value);
      break;
    case 2:
      var value = new proto.tendermint.abci.ResponseEcho;
      reader.readMessage(value,proto.tendermint.abci.ResponseEcho.deserializeBinaryFromReader);
      msg.setEcho(value);
      break;
    case 3:
      var value = new proto.tendermint.abci.ResponseFlush;
      reader.readMessage(value,proto.tendermint.abci.ResponseFlush.deserializeBinaryFromReader);
      msg.setFlush(value);
      break;
    case 4:
      var value = new proto.tendermint.abci.ResponseInfo;
      reader.readMessage(value,proto.tendermint.abci.ResponseInfo.deserializeBinaryFromReader);
      msg.setInfo(value);
      break;
    case 6:
      var value = new proto.tendermint.abci.ResponseInitChain;
      reader.readMessage(value,proto.tendermint.abci.ResponseInitChain.deserializeBinaryFromReader);
      msg.setInitChain(value);
      break;
    case 7:
      var value = new proto.tendermint.abci.ResponseQuery;
      reader.readMessage(value,proto.tendermint.abci.ResponseQuery.deserializeBinaryFromReader);
      msg.setQuery(value);
      break;
    case 8:
      var value = new proto.tendermint.abci.ResponseBeginBlock;
      reader.readMessage(value,proto.tendermint.abci.ResponseBeginBlock.deserializeBinaryFromReader);
      msg.setBeginBlock(value);
      break;
    case 9:
      var value = new proto.tendermint.abci.ResponseCheckTx;
      reader.readMessage(value,proto.tendermint.abci.ResponseCheckTx.deserializeBinaryFromReader);
      msg.setCheckTx(value);
      break;
    case 10:
      var value = new proto.tendermint.abci.ResponseDeliverTx;
      reader.readMessage(value,proto.tendermint.abci.ResponseDeliverTx.deserializeBinaryFromReader);
      msg.setDeliverTx(value);
      break;
    case 11:
      var value = new proto.tendermint.abci.ResponseEndBlock;
      reader.readMessage(value,proto.tendermint.abci.ResponseEndBlock.deserializeBinaryFromReader);
      msg.setEndBlock(value);
      break;
    case 12:
      var value = new proto.tendermint.abci.ResponseCommit;
      reader.readMessage(value,proto.tendermint.abci.ResponseCommit.deserializeBinaryFromReader);
      msg.setCommit(value);
      break;
    case 13:
      var value = new proto.tendermint.abci.ResponseListSnapshots;
      reader.readMessage(value,proto.tendermint.abci.ResponseListSnapshots.deserializeBinaryFromReader);
      msg.setListSnapshots(value);
      break;
    case 14:
      var value = new proto.tendermint.abci.ResponseOfferSnapshot;
      reader.readMessage(value,proto.tendermint.abci.ResponseOfferSnapshot.deserializeBinaryFromReader);
      msg.setOfferSnapshot(value);
      break;
    case 15:
      var value = new proto.tendermint.abci.ResponseLoadSnapshotChunk;
      reader.readMessage(value,proto.tendermint.abci.ResponseLoadSnapshotChunk.deserializeBinaryFromReader);
      msg.setLoadSnapshotChunk(value);
      break;
    case 16:
      var value = new proto.tendermint.abci.ResponseApplySnapshotChunk;
      reader.readMessage(value,proto.tendermint.abci.ResponseApplySnapshotChunk.deserializeBinaryFromReader);
      msg.setApplySnapshotChunk(value);
      break;
    case 17:
      var value = new proto.tendermint.abci.ResponsePrepareProposal;
      reader.readMessage(value,proto.tendermint.abci.ResponsePrepareProposal.deserializeBinaryFromReader);
      msg.setPrepareProposal(value);
      break;
    case 18:
      var value = new proto.tendermint.abci.ResponseProcessProposal;
      reader.readMessage(value,proto.tendermint.abci.ResponseProcessProposal.deserializeBinaryFromReader);
      msg.setProcessProposal(value);
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
proto.tendermint.abci.Response.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.abci.Response.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.abci.Response} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.abci.Response.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getException();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.tendermint.abci.ResponseException.serializeBinaryToWriter
    );
  }
  f = message.getEcho();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.tendermint.abci.ResponseEcho.serializeBinaryToWriter
    );
  }
  f = message.getFlush();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.tendermint.abci.ResponseFlush.serializeBinaryToWriter
    );
  }
  f = message.getInfo();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.tendermint.abci.ResponseInfo.serializeBinaryToWriter
    );
  }
  f = message.getInitChain();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.tendermint.abci.ResponseInitChain.serializeBinaryToWriter
    );
  }
  f = message.getQuery();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.tendermint.abci.ResponseQuery.serializeBinaryToWriter
    );
  }
  f = message.getBeginBlock();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.tendermint.abci.ResponseBeginBlock.serializeBinaryToWriter
    );
  }
  f = message.getCheckTx();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.tendermint.abci.ResponseCheckTx.serializeBinaryToWriter
    );
  }
  f = message.getDeliverTx();
  if (f != null) {
    writer.writeMessage(
      10,
      f,
      proto.tendermint.abci.ResponseDeliverTx.serializeBinaryToWriter
    );
  }
  f = message.getEndBlock();
  if (f != null) {
    writer.writeMessage(
      11,
      f,
      proto.tendermint.abci.ResponseEndBlock.serializeBinaryToWriter
    );
  }
  f = message.getCommit();
  if (f != null) {
    writer.writeMessage(
      12,
      f,
      proto.tendermint.abci.ResponseCommit.serializeBinaryToWriter
    );
  }
  f = message.getListSnapshots();
  if (f != null) {
    writer.writeMessage(
      13,
      f,
      proto.tendermint.abci.ResponseListSnapshots.serializeBinaryToWriter
    );
  }
  f = message.getOfferSnapshot();
  if (f != null) {
    writer.writeMessage(
      14,
      f,
      proto.tendermint.abci.ResponseOfferSnapshot.serializeBinaryToWriter
    );
  }
  f = message.getLoadSnapshotChunk();
  if (f != null) {
    writer.writeMessage(
      15,
      f,
      proto.tendermint.abci.ResponseLoadSnapshotChunk.serializeBinaryToWriter
    );
  }
  f = message.getApplySnapshotChunk();
  if (f != null) {
    writer.writeMessage(
      16,
      f,
      proto.tendermint.abci.ResponseApplySnapshotChunk.serializeBinaryToWriter
    );
  }
  f = message.getPrepareProposal();
  if (f != null) {
    writer.writeMessage(
      17,
      f,
      proto.tendermint.abci.ResponsePrepareProposal.serializeBinaryToWriter
    );
  }
  f = message.getProcessProposal();
  if (f != null) {
    writer.writeMessage(
      18,
      f,
      proto.tendermint.abci.ResponseProcessProposal.serializeBinaryToWriter
    );
  }
};


/**
 * optional ResponseException exception = 1;
 * @return {?proto.tendermint.abci.ResponseException}
 */
proto.tendermint.abci.Response.prototype.getException = function() {
  return /** @type{?proto.tendermint.abci.ResponseException} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseException, 1));
};


/**
 * @param {?proto.tendermint.abci.ResponseException|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setException = function(value) {
  return jspb.Message.setOneofWrapperField(this, 1, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearException = function() {
  return this.setException(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasException = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional ResponseEcho echo = 2;
 * @return {?proto.tendermint.abci.ResponseEcho}
 */
proto.tendermint.abci.Response.prototype.getEcho = function() {
  return /** @type{?proto.tendermint.abci.ResponseEcho} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseEcho, 2));
};


/**
 * @param {?proto.tendermint.abci.ResponseEcho|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setEcho = function(value) {
  return jspb.Message.setOneofWrapperField(this, 2, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearEcho = function() {
  return this.setEcho(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasEcho = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional ResponseFlush flush = 3;
 * @return {?proto.tendermint.abci.ResponseFlush}
 */
proto.tendermint.abci.Response.prototype.getFlush = function() {
  return /** @type{?proto.tendermint.abci.ResponseFlush} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseFlush, 3));
};


/**
 * @param {?proto.tendermint.abci.ResponseFlush|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setFlush = function(value) {
  return jspb.Message.setOneofWrapperField(this, 3, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearFlush = function() {
  return this.setFlush(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasFlush = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional ResponseInfo info = 4;
 * @return {?proto.tendermint.abci.ResponseInfo}
 */
proto.tendermint.abci.Response.prototype.getInfo = function() {
  return /** @type{?proto.tendermint.abci.ResponseInfo} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseInfo, 4));
};


/**
 * @param {?proto.tendermint.abci.ResponseInfo|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setInfo = function(value) {
  return jspb.Message.setOneofWrapperField(this, 4, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearInfo = function() {
  return this.setInfo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasInfo = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional ResponseInitChain init_chain = 6;
 * @return {?proto.tendermint.abci.ResponseInitChain}
 */
proto.tendermint.abci.Response.prototype.getInitChain = function() {
  return /** @type{?proto.tendermint.abci.ResponseInitChain} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseInitChain, 6));
};


/**
 * @param {?proto.tendermint.abci.ResponseInitChain|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setInitChain = function(value) {
  return jspb.Message.setOneofWrapperField(this, 6, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearInitChain = function() {
  return this.setInitChain(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasInitChain = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional ResponseQuery query = 7;
 * @return {?proto.tendermint.abci.ResponseQuery}
 */
proto.tendermint.abci.Response.prototype.getQuery = function() {
  return /** @type{?proto.tendermint.abci.ResponseQuery} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseQuery, 7));
};


/**
 * @param {?proto.tendermint.abci.ResponseQuery|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setQuery = function(value) {
  return jspb.Message.setOneofWrapperField(this, 7, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearQuery = function() {
  return this.setQuery(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasQuery = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional ResponseBeginBlock begin_block = 8;
 * @return {?proto.tendermint.abci.ResponseBeginBlock}
 */
proto.tendermint.abci.Response.prototype.getBeginBlock = function() {
  return /** @type{?proto.tendermint.abci.ResponseBeginBlock} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseBeginBlock, 8));
};


/**
 * @param {?proto.tendermint.abci.ResponseBeginBlock|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setBeginBlock = function(value) {
  return jspb.Message.setOneofWrapperField(this, 8, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearBeginBlock = function() {
  return this.setBeginBlock(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasBeginBlock = function() {
  return jspb.Message.getField(this, 8) != null;
};


/**
 * optional ResponseCheckTx check_tx = 9;
 * @return {?proto.tendermint.abci.ResponseCheckTx}
 */
proto.tendermint.abci.Response.prototype.getCheckTx = function() {
  return /** @type{?proto.tendermint.abci.ResponseCheckTx} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseCheckTx, 9));
};


/**
 * @param {?proto.tendermint.abci.ResponseCheckTx|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setCheckTx = function(value) {
  return jspb.Message.setOneofWrapperField(this, 9, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearCheckTx = function() {
  return this.setCheckTx(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasCheckTx = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional ResponseDeliverTx deliver_tx = 10;
 * @return {?proto.tendermint.abci.ResponseDeliverTx}
 */
proto.tendermint.abci.Response.prototype.getDeliverTx = function() {
  return /** @type{?proto.tendermint.abci.ResponseDeliverTx} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseDeliverTx, 10));
};


/**
 * @param {?proto.tendermint.abci.ResponseDeliverTx|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setDeliverTx = function(value) {
  return jspb.Message.setOneofWrapperField(this, 10, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearDeliverTx = function() {
  return this.setDeliverTx(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasDeliverTx = function() {
  return jspb.Message.getField(this, 10) != null;
};


/**
 * optional ResponseEndBlock end_block = 11;
 * @return {?proto.tendermint.abci.ResponseEndBlock}
 */
proto.tendermint.abci.Response.prototype.getEndBlock = function() {
  return /** @type{?proto.tendermint.abci.ResponseEndBlock} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseEndBlock, 11));
};


/**
 * @param {?proto.tendermint.abci.ResponseEndBlock|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setEndBlock = function(value) {
  return jspb.Message.setOneofWrapperField(this, 11, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearEndBlock = function() {
  return this.setEndBlock(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasEndBlock = function() {
  return jspb.Message.getField(this, 11) != null;
};


/**
 * optional ResponseCommit commit = 12;
 * @return {?proto.tendermint.abci.ResponseCommit}
 */
proto.tendermint.abci.Response.prototype.getCommit = function() {
  return /** @type{?proto.tendermint.abci.ResponseCommit} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseCommit, 12));
};


/**
 * @param {?proto.tendermint.abci.ResponseCommit|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setCommit = function(value) {
  return jspb.Message.setOneofWrapperField(this, 12, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearCommit = function() {
  return this.setCommit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasCommit = function() {
  return jspb.Message.getField(this, 12) != null;
};


/**
 * optional ResponseListSnapshots list_snapshots = 13;
 * @return {?proto.tendermint.abci.ResponseListSnapshots}
 */
proto.tendermint.abci.Response.prototype.getListSnapshots = function() {
  return /** @type{?proto.tendermint.abci.ResponseListSnapshots} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseListSnapshots, 13));
};


/**
 * @param {?proto.tendermint.abci.ResponseListSnapshots|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setListSnapshots = function(value) {
  return jspb.Message.setOneofWrapperField(this, 13, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearListSnapshots = function() {
  return this.setListSnapshots(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasListSnapshots = function() {
  return jspb.Message.getField(this, 13) != null;
};


/**
 * optional ResponseOfferSnapshot offer_snapshot = 14;
 * @return {?proto.tendermint.abci.ResponseOfferSnapshot}
 */
proto.tendermint.abci.Response.prototype.getOfferSnapshot = function() {
  return /** @type{?proto.tendermint.abci.ResponseOfferSnapshot} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseOfferSnapshot, 14));
};


/**
 * @param {?proto.tendermint.abci.ResponseOfferSnapshot|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setOfferSnapshot = function(value) {
  return jspb.Message.setOneofWrapperField(this, 14, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearOfferSnapshot = function() {
  return this.setOfferSnapshot(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasOfferSnapshot = function() {
  return jspb.Message.getField(this, 14) != null;
};


/**
 * optional ResponseLoadSnapshotChunk load_snapshot_chunk = 15;
 * @return {?proto.tendermint.abci.ResponseLoadSnapshotChunk}
 */
proto.tendermint.abci.Response.prototype.getLoadSnapshotChunk = function() {
  return /** @type{?proto.tendermint.abci.ResponseLoadSnapshotChunk} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseLoadSnapshotChunk, 15));
};


/**
 * @param {?proto.tendermint.abci.ResponseLoadSnapshotChunk|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setLoadSnapshotChunk = function(value) {
  return jspb.Message.setOneofWrapperField(this, 15, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearLoadSnapshotChunk = function() {
  return this.setLoadSnapshotChunk(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasLoadSnapshotChunk = function() {
  return jspb.Message.getField(this, 15) != null;
};


/**
 * optional ResponseApplySnapshotChunk apply_snapshot_chunk = 16;
 * @return {?proto.tendermint.abci.ResponseApplySnapshotChunk}
 */
proto.tendermint.abci.Response.prototype.getApplySnapshotChunk = function() {
  return /** @type{?proto.tendermint.abci.ResponseApplySnapshotChunk} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseApplySnapshotChunk, 16));
};


/**
 * @param {?proto.tendermint.abci.ResponseApplySnapshotChunk|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setApplySnapshotChunk = function(value) {
  return jspb.Message.setOneofWrapperField(this, 16, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearApplySnapshotChunk = function() {
  return this.setApplySnapshotChunk(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasApplySnapshotChunk = function() {
  return jspb.Message.getField(this, 16) != null;
};


/**
 * optional ResponsePrepareProposal prepare_proposal = 17;
 * @return {?proto.tendermint.abci.ResponsePrepareProposal}
 */
proto.tendermint.abci.Response.prototype.getPrepareProposal = function() {
  return /** @type{?proto.tendermint.abci.ResponsePrepareProposal} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponsePrepareProposal, 17));
};


/**
 * @param {?proto.tendermint.abci.ResponsePrepareProposal|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setPrepareProposal = function(value) {
  return jspb.Message.setOneofWrapperField(this, 17, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearPrepareProposal = function() {
  return this.setPrepareProposal(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasPrepareProposal = function() {
  return jspb.Message.getField(this, 17) != null;
};


/**
 * optional ResponseProcessProposal process_proposal = 18;
 * @return {?proto.tendermint.abci.ResponseProcessProposal}
 */
proto.tendermint.abci.Response.prototype.getProcessProposal = function() {
  return /** @type{?proto.tendermint.abci.ResponseProcessProposal} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.abci.ResponseProcessProposal, 18));
};


/**
 * @param {?proto.tendermint.abci.ResponseProcessProposal|undefined} value
 * @return {!proto.tendermint.abci.Response} returns this
*/
proto.tendermint.abci.Response.prototype.setProcessProposal = function(value) {
  return jspb.Message.setOneofWrapperField(this, 18, proto.tendermint.abci.Response.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.abci.Response} returns this
 */
proto.tendermint.abci.Response.prototype.clearProcessProposal = function() {
  return this.setProcessProposal(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.abci.Response.prototype.hasProcessProposal = function() {
  return jspb.Message.getField(this, 18) != null;
};


