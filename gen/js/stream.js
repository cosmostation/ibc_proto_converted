// source: dymension/streamer/stream.proto
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

goog.provide('proto.dymensionxyz.dymension.streamer.Stream');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');
goog.require('proto.dymensionxyz.dymension.streamer.DistrInfo');
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
proto.dymensionxyz.dymension.streamer.Stream = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.dymensionxyz.dymension.streamer.Stream.repeatedFields_, null);
};
goog.inherits(proto.dymensionxyz.dymension.streamer.Stream, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.dymensionxyz.dymension.streamer.Stream.displayName = 'proto.dymensionxyz.dymension.streamer.Stream';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.dymensionxyz.dymension.streamer.Stream.repeatedFields_ = [3,8];



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
proto.dymensionxyz.dymension.streamer.Stream.prototype.toObject = function(opt_includeInstance) {
  return proto.dymensionxyz.dymension.streamer.Stream.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.dymensionxyz.dymension.streamer.Stream} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.streamer.Stream.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    distributeTo: (f = msg.getDistributeTo()) && proto.dymensionxyz.dymension.streamer.DistrInfo.toObject(includeInstance, f),
    coinsList: jspb.Message.toObjectList(msg.getCoinsList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance),
    startTime: (f = msg.getStartTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    distrEpochIdentifier: jspb.Message.getFieldWithDefault(msg, 5, ""),
    numEpochsPaidOver: jspb.Message.getFieldWithDefault(msg, 6, 0),
    filledEpochs: jspb.Message.getFieldWithDefault(msg, 7, 0),
    distributedCoinsList: jspb.Message.toObjectList(msg.getDistributedCoinsList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance)
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
 * @return {!proto.dymensionxyz.dymension.streamer.Stream}
 */
proto.dymensionxyz.dymension.streamer.Stream.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.dymensionxyz.dymension.streamer.Stream;
  return proto.dymensionxyz.dymension.streamer.Stream.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.dymensionxyz.dymension.streamer.Stream} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.dymensionxyz.dymension.streamer.Stream}
 */
proto.dymensionxyz.dymension.streamer.Stream.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = new proto.dymensionxyz.dymension.streamer.DistrInfo;
      reader.readMessage(value,proto.dymensionxyz.dymension.streamer.DistrInfo.deserializeBinaryFromReader);
      msg.setDistributeTo(value);
      break;
    case 3:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addCoins(value);
      break;
    case 4:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setStartTime(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setDistrEpochIdentifier(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setNumEpochsPaidOver(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setFilledEpochs(value);
      break;
    case 8:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addDistributedCoins(value);
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
proto.dymensionxyz.dymension.streamer.Stream.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.dymensionxyz.dymension.streamer.Stream.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.dymensionxyz.dymension.streamer.Stream} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.dymensionxyz.dymension.streamer.Stream.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getDistributeTo();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.dymensionxyz.dymension.streamer.DistrInfo.serializeBinaryToWriter
    );
  }
  f = message.getCoinsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
  f = message.getStartTime();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getDistrEpochIdentifier();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getNumEpochsPaidOver();
  if (f !== 0) {
    writer.writeUint64(
      6,
      f
    );
  }
  f = message.getFilledEpochs();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
  f = message.getDistributedCoinsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      8,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional DistrInfo distribute_to = 2;
 * @return {?proto.dymensionxyz.dymension.streamer.DistrInfo}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.getDistributeTo = function() {
  return /** @type{?proto.dymensionxyz.dymension.streamer.DistrInfo} */ (
    jspb.Message.getWrapperField(this, proto.dymensionxyz.dymension.streamer.DistrInfo, 2));
};


/**
 * @param {?proto.dymensionxyz.dymension.streamer.DistrInfo|undefined} value
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
*/
proto.dymensionxyz.dymension.streamer.Stream.prototype.setDistributeTo = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.clearDistributeTo = function() {
  return this.setDistributeTo(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.hasDistributeTo = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * repeated cosmos.base.v1beta1.Coin coins = 3;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.getCoinsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 3));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
*/
proto.dymensionxyz.dymension.streamer.Stream.prototype.setCoinsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.addCoins = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.clearCoinsList = function() {
  return this.setCoinsList([]);
};


/**
 * optional google.protobuf.Timestamp start_time = 4;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.getStartTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 4));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
*/
proto.dymensionxyz.dymension.streamer.Stream.prototype.setStartTime = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.clearStartTime = function() {
  return this.setStartTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.hasStartTime = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional string distr_epoch_identifier = 5;
 * @return {string}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.getDistrEpochIdentifier = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.setDistrEpochIdentifier = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional uint64 num_epochs_paid_over = 6;
 * @return {number}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.getNumEpochsPaidOver = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.setNumEpochsPaidOver = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional uint64 filled_epochs = 7;
 * @return {number}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.getFilledEpochs = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.setFilledEpochs = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin distributed_coins = 8;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.getDistributedCoinsList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 8));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
*/
proto.dymensionxyz.dymension.streamer.Stream.prototype.setDistributedCoinsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 8, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.addDistributedCoins = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 8, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.dymensionxyz.dymension.streamer.Stream} returns this
 */
proto.dymensionxyz.dymension.streamer.Stream.prototype.clearDistributedCoinsList = function() {
  return this.setDistributedCoinsList([]);
};


