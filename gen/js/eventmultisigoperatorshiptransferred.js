// source: axelar/evm/v1beta1/types.proto
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

goog.provide('proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred');

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
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.repeatedFields_, null);
};
goog.inherits(proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.displayName = 'proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.repeatedFields_ = [3,5];



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
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.toObject = function(includeInstance, msg) {
  var f, obj = {
    newOperatorsList: msg.getNewOperatorsList_asB64(),
    newThreshold: msg.getNewThreshold_asB64(),
    newWeightsList: msg.getNewWeightsList_asB64()
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
 * @return {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred}
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred;
  return proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred}
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addNewOperators(value);
      break;
    case 4:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setNewThreshold(value);
      break;
    case 5:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.addNewWeights(value);
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
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getNewOperatorsList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      3,
      f
    );
  }
  f = message.getNewThreshold_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      4,
      f
    );
  }
  f = message.getNewWeightsList_asU8();
  if (f.length > 0) {
    writer.writeRepeatedBytes(
      5,
      f
    );
  }
};


/**
 * repeated bytes new_operators = 3;
 * @return {!Array<string>}
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.getNewOperatorsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 3));
};


/**
 * repeated bytes new_operators = 3;
 * This is a type-conversion wrapper around `getNewOperatorsList()`
 * @return {!Array<string>}
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.getNewOperatorsList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getNewOperatorsList()));
};


/**
 * repeated bytes new_operators = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getNewOperatorsList()`
 * @return {!Array<!Uint8Array>}
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.getNewOperatorsList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getNewOperatorsList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred} returns this
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.setNewOperatorsList = function(value) {
  return jspb.Message.setField(this, 3, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred} returns this
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.addNewOperators = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 3, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred} returns this
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.clearNewOperatorsList = function() {
  return this.setNewOperatorsList([]);
};


/**
 * optional bytes new_threshold = 4;
 * @return {string}
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.getNewThreshold = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * optional bytes new_threshold = 4;
 * This is a type-conversion wrapper around `getNewThreshold()`
 * @return {string}
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.getNewThreshold_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getNewThreshold()));
};


/**
 * optional bytes new_threshold = 4;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getNewThreshold()`
 * @return {!Uint8Array}
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.getNewThreshold_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getNewThreshold()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred} returns this
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.setNewThreshold = function(value) {
  return jspb.Message.setProto3BytesField(this, 4, value);
};


/**
 * repeated bytes new_weights = 5;
 * @return {!Array<string>}
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.getNewWeightsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 5));
};


/**
 * repeated bytes new_weights = 5;
 * This is a type-conversion wrapper around `getNewWeightsList()`
 * @return {!Array<string>}
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.getNewWeightsList_asB64 = function() {
  return /** @type {!Array<string>} */ (jspb.Message.bytesListAsB64(
      this.getNewWeightsList()));
};


/**
 * repeated bytes new_weights = 5;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getNewWeightsList()`
 * @return {!Array<!Uint8Array>}
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.getNewWeightsList_asU8 = function() {
  return /** @type {!Array<!Uint8Array>} */ (jspb.Message.bytesListAsU8(
      this.getNewWeightsList()));
};


/**
 * @param {!(Array<!Uint8Array>|Array<string>)} value
 * @return {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred} returns this
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.setNewWeightsList = function(value) {
  return jspb.Message.setField(this, 5, value || []);
};


/**
 * @param {!(string|Uint8Array)} value
 * @param {number=} opt_index
 * @return {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred} returns this
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.addNewWeights = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 5, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred} returns this
 */
proto.axelar.evm.v1beta1.EventMultisigOperatorshipTransferred.prototype.clearNewWeightsList = function() {
  return this.setNewWeightsList([]);
};


