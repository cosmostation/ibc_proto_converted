// source: cosmos/tx/v1beta1/tx.proto
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

goog.provide('proto.cosmos.tx.v1beta1.AuthInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.tx.v1beta1.Fee');
goog.require('proto.cosmos.tx.v1beta1.SignerInfo');
goog.require('proto.cosmos.tx.v1beta1.Tip');

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
proto.cosmos.tx.v1beta1.AuthInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.tx.v1beta1.AuthInfo.repeatedFields_, null);
};
goog.inherits(proto.cosmos.tx.v1beta1.AuthInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.tx.v1beta1.AuthInfo.displayName = 'proto.cosmos.tx.v1beta1.AuthInfo';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.tx.v1beta1.AuthInfo.repeatedFields_ = [1];



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
proto.cosmos.tx.v1beta1.AuthInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.tx.v1beta1.AuthInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.tx.v1beta1.AuthInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.AuthInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    signerInfosList: jspb.Message.toObjectList(msg.getSignerInfosList(),
    proto.cosmos.tx.v1beta1.SignerInfo.toObject, includeInstance),
    fee: (f = msg.getFee()) && proto.cosmos.tx.v1beta1.Fee.toObject(includeInstance, f),
    tip: (f = msg.getTip()) && proto.cosmos.tx.v1beta1.Tip.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.tx.v1beta1.AuthInfo}
 */
proto.cosmos.tx.v1beta1.AuthInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.tx.v1beta1.AuthInfo;
  return proto.cosmos.tx.v1beta1.AuthInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.tx.v1beta1.AuthInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.tx.v1beta1.AuthInfo}
 */
proto.cosmos.tx.v1beta1.AuthInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.tx.v1beta1.SignerInfo;
      reader.readMessage(value,proto.cosmos.tx.v1beta1.SignerInfo.deserializeBinaryFromReader);
      msg.addSignerInfos(value);
      break;
    case 2:
      var value = new proto.cosmos.tx.v1beta1.Fee;
      reader.readMessage(value,proto.cosmos.tx.v1beta1.Fee.deserializeBinaryFromReader);
      msg.setFee(value);
      break;
    case 3:
      var value = new proto.cosmos.tx.v1beta1.Tip;
      reader.readMessage(value,proto.cosmos.tx.v1beta1.Tip.deserializeBinaryFromReader);
      msg.setTip(value);
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
proto.cosmos.tx.v1beta1.AuthInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.tx.v1beta1.AuthInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.tx.v1beta1.AuthInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.tx.v1beta1.AuthInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSignerInfosList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.cosmos.tx.v1beta1.SignerInfo.serializeBinaryToWriter
    );
  }
  f = message.getFee();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.tx.v1beta1.Fee.serializeBinaryToWriter
    );
  }
  f = message.getTip();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.tx.v1beta1.Tip.serializeBinaryToWriter
    );
  }
};


/**
 * repeated SignerInfo signer_infos = 1;
 * @return {!Array<!proto.cosmos.tx.v1beta1.SignerInfo>}
 */
proto.cosmos.tx.v1beta1.AuthInfo.prototype.getSignerInfosList = function() {
  return /** @type{!Array<!proto.cosmos.tx.v1beta1.SignerInfo>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.tx.v1beta1.SignerInfo, 1));
};


/**
 * @param {!Array<!proto.cosmos.tx.v1beta1.SignerInfo>} value
 * @return {!proto.cosmos.tx.v1beta1.AuthInfo} returns this
*/
proto.cosmos.tx.v1beta1.AuthInfo.prototype.setSignerInfosList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.cosmos.tx.v1beta1.SignerInfo=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.tx.v1beta1.SignerInfo}
 */
proto.cosmos.tx.v1beta1.AuthInfo.prototype.addSignerInfos = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.cosmos.tx.v1beta1.SignerInfo, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.tx.v1beta1.AuthInfo} returns this
 */
proto.cosmos.tx.v1beta1.AuthInfo.prototype.clearSignerInfosList = function() {
  return this.setSignerInfosList([]);
};


/**
 * optional Fee fee = 2;
 * @return {?proto.cosmos.tx.v1beta1.Fee}
 */
proto.cosmos.tx.v1beta1.AuthInfo.prototype.getFee = function() {
  return /** @type{?proto.cosmos.tx.v1beta1.Fee} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.tx.v1beta1.Fee, 2));
};


/**
 * @param {?proto.cosmos.tx.v1beta1.Fee|undefined} value
 * @return {!proto.cosmos.tx.v1beta1.AuthInfo} returns this
*/
proto.cosmos.tx.v1beta1.AuthInfo.prototype.setFee = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.tx.v1beta1.AuthInfo} returns this
 */
proto.cosmos.tx.v1beta1.AuthInfo.prototype.clearFee = function() {
  return this.setFee(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.tx.v1beta1.AuthInfo.prototype.hasFee = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional Tip tip = 3;
 * @return {?proto.cosmos.tx.v1beta1.Tip}
 */
proto.cosmos.tx.v1beta1.AuthInfo.prototype.getTip = function() {
  return /** @type{?proto.cosmos.tx.v1beta1.Tip} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.tx.v1beta1.Tip, 3));
};


/**
 * @param {?proto.cosmos.tx.v1beta1.Tip|undefined} value
 * @return {!proto.cosmos.tx.v1beta1.AuthInfo} returns this
*/
proto.cosmos.tx.v1beta1.AuthInfo.prototype.setTip = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.tx.v1beta1.AuthInfo} returns this
 */
proto.cosmos.tx.v1beta1.AuthInfo.prototype.clearTip = function() {
  return this.setTip(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.tx.v1beta1.AuthInfo.prototype.hasTip = function() {
  return jspb.Message.getField(this, 3) != null;
};

