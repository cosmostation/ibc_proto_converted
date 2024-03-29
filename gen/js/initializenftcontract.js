// source: ixo/entity/v1beta1/proposal.proto
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

goog.provide('proto.ixo.entity.v1beta1.InitializeNftContract');

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
proto.ixo.entity.v1beta1.InitializeNftContract = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ixo.entity.v1beta1.InitializeNftContract, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ixo.entity.v1beta1.InitializeNftContract.displayName = 'proto.ixo.entity.v1beta1.InitializeNftContract';
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
proto.ixo.entity.v1beta1.InitializeNftContract.prototype.toObject = function(opt_includeInstance) {
  return proto.ixo.entity.v1beta1.InitializeNftContract.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ixo.entity.v1beta1.InitializeNftContract} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.entity.v1beta1.InitializeNftContract.toObject = function(includeInstance, msg) {
  var f, obj = {
    nftcontractcodeid: jspb.Message.getFieldWithDefault(msg, 1, 0),
    nftminteraddress: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.ixo.entity.v1beta1.InitializeNftContract}
 */
proto.ixo.entity.v1beta1.InitializeNftContract.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ixo.entity.v1beta1.InitializeNftContract;
  return proto.ixo.entity.v1beta1.InitializeNftContract.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ixo.entity.v1beta1.InitializeNftContract} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ixo.entity.v1beta1.InitializeNftContract}
 */
proto.ixo.entity.v1beta1.InitializeNftContract.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setNftcontractcodeid(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setNftminteraddress(value);
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
proto.ixo.entity.v1beta1.InitializeNftContract.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ixo.entity.v1beta1.InitializeNftContract.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ixo.entity.v1beta1.InitializeNftContract} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ixo.entity.v1beta1.InitializeNftContract.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getNftcontractcodeid();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getNftminteraddress();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional uint64 NftContractCodeId = 1;
 * @return {number}
 */
proto.ixo.entity.v1beta1.InitializeNftContract.prototype.getNftcontractcodeid = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.ixo.entity.v1beta1.InitializeNftContract} returns this
 */
proto.ixo.entity.v1beta1.InitializeNftContract.prototype.setNftcontractcodeid = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string NftMinterAddress = 2;
 * @return {string}
 */
proto.ixo.entity.v1beta1.InitializeNftContract.prototype.getNftminteraddress = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.ixo.entity.v1beta1.InitializeNftContract} returns this
 */
proto.ixo.entity.v1beta1.InitializeNftContract.prototype.setNftminteraddress = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


