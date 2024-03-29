// source: assetmantle/assets/transactions/mint/message.proto
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

goog.provide('proto.assetmantle.modules.assets.transactions.mint.Message');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.assetmantle.schema.ids.base.ClassificationID');
goog.require('proto.assetmantle.schema.ids.base.IdentityID');
goog.require('proto.assetmantle.schema.lists.base.PropertyList');

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
proto.assetmantle.modules.assets.transactions.mint.Message = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.assetmantle.modules.assets.transactions.mint.Message, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.assetmantle.modules.assets.transactions.mint.Message.displayName = 'proto.assetmantle.modules.assets.transactions.mint.Message';
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
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.toObject = function(opt_includeInstance) {
  return proto.assetmantle.modules.assets.transactions.mint.Message.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.assetmantle.modules.assets.transactions.mint.Message} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.assets.transactions.mint.Message.toObject = function(includeInstance, msg) {
  var f, obj = {
    from: jspb.Message.getFieldWithDefault(msg, 1, ""),
    fromID: (f = msg.getFromID()) && proto.assetmantle.schema.ids.base.IdentityID.toObject(includeInstance, f),
    toID: (f = msg.getToID()) && proto.assetmantle.schema.ids.base.IdentityID.toObject(includeInstance, f),
    classificationID: (f = msg.getClassificationID()) && proto.assetmantle.schema.ids.base.ClassificationID.toObject(includeInstance, f),
    immutableMetaProperties: (f = msg.getImmutableMetaProperties()) && proto.assetmantle.schema.lists.base.PropertyList.toObject(includeInstance, f),
    immutableProperties: (f = msg.getImmutableProperties()) && proto.assetmantle.schema.lists.base.PropertyList.toObject(includeInstance, f),
    mutableMetaProperties: (f = msg.getMutableMetaProperties()) && proto.assetmantle.schema.lists.base.PropertyList.toObject(includeInstance, f),
    mutableProperties: (f = msg.getMutableProperties()) && proto.assetmantle.schema.lists.base.PropertyList.toObject(includeInstance, f)
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
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.assetmantle.modules.assets.transactions.mint.Message;
  return proto.assetmantle.modules.assets.transactions.mint.Message.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.assetmantle.modules.assets.transactions.mint.Message} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFrom(value);
      break;
    case 2:
      var value = new proto.assetmantle.schema.ids.base.IdentityID;
      reader.readMessage(value,proto.assetmantle.schema.ids.base.IdentityID.deserializeBinaryFromReader);
      msg.setFromID(value);
      break;
    case 3:
      var value = new proto.assetmantle.schema.ids.base.IdentityID;
      reader.readMessage(value,proto.assetmantle.schema.ids.base.IdentityID.deserializeBinaryFromReader);
      msg.setToID(value);
      break;
    case 4:
      var value = new proto.assetmantle.schema.ids.base.ClassificationID;
      reader.readMessage(value,proto.assetmantle.schema.ids.base.ClassificationID.deserializeBinaryFromReader);
      msg.setClassificationID(value);
      break;
    case 5:
      var value = new proto.assetmantle.schema.lists.base.PropertyList;
      reader.readMessage(value,proto.assetmantle.schema.lists.base.PropertyList.deserializeBinaryFromReader);
      msg.setImmutableMetaProperties(value);
      break;
    case 6:
      var value = new proto.assetmantle.schema.lists.base.PropertyList;
      reader.readMessage(value,proto.assetmantle.schema.lists.base.PropertyList.deserializeBinaryFromReader);
      msg.setImmutableProperties(value);
      break;
    case 7:
      var value = new proto.assetmantle.schema.lists.base.PropertyList;
      reader.readMessage(value,proto.assetmantle.schema.lists.base.PropertyList.deserializeBinaryFromReader);
      msg.setMutableMetaProperties(value);
      break;
    case 8:
      var value = new proto.assetmantle.schema.lists.base.PropertyList;
      reader.readMessage(value,proto.assetmantle.schema.lists.base.PropertyList.deserializeBinaryFromReader);
      msg.setMutableProperties(value);
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
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.assetmantle.modules.assets.transactions.mint.Message.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.assetmantle.modules.assets.transactions.mint.Message} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.assetmantle.modules.assets.transactions.mint.Message.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFrom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getFromID();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.assetmantle.schema.ids.base.IdentityID.serializeBinaryToWriter
    );
  }
  f = message.getToID();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.assetmantle.schema.ids.base.IdentityID.serializeBinaryToWriter
    );
  }
  f = message.getClassificationID();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.assetmantle.schema.ids.base.ClassificationID.serializeBinaryToWriter
    );
  }
  f = message.getImmutableMetaProperties();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.assetmantle.schema.lists.base.PropertyList.serializeBinaryToWriter
    );
  }
  f = message.getImmutableProperties();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.assetmantle.schema.lists.base.PropertyList.serializeBinaryToWriter
    );
  }
  f = message.getMutableMetaProperties();
  if (f != null) {
    writer.writeMessage(
      7,
      f,
      proto.assetmantle.schema.lists.base.PropertyList.serializeBinaryToWriter
    );
  }
  f = message.getMutableProperties();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.assetmantle.schema.lists.base.PropertyList.serializeBinaryToWriter
    );
  }
};


/**
 * optional string from = 1;
 * @return {string}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.getFrom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.setFrom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional assetmantle.schema.ids.base.IdentityID from_i_d = 2;
 * @return {?proto.assetmantle.schema.ids.base.IdentityID}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.getFromID = function() {
  return /** @type{?proto.assetmantle.schema.ids.base.IdentityID} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.ids.base.IdentityID, 2));
};


/**
 * @param {?proto.assetmantle.schema.ids.base.IdentityID|undefined} value
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
*/
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.setFromID = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.clearFromID = function() {
  return this.setFromID(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.hasFromID = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional assetmantle.schema.ids.base.IdentityID to_i_d = 3;
 * @return {?proto.assetmantle.schema.ids.base.IdentityID}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.getToID = function() {
  return /** @type{?proto.assetmantle.schema.ids.base.IdentityID} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.ids.base.IdentityID, 3));
};


/**
 * @param {?proto.assetmantle.schema.ids.base.IdentityID|undefined} value
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
*/
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.setToID = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.clearToID = function() {
  return this.setToID(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.hasToID = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional assetmantle.schema.ids.base.ClassificationID classification_i_d = 4;
 * @return {?proto.assetmantle.schema.ids.base.ClassificationID}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.getClassificationID = function() {
  return /** @type{?proto.assetmantle.schema.ids.base.ClassificationID} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.ids.base.ClassificationID, 4));
};


/**
 * @param {?proto.assetmantle.schema.ids.base.ClassificationID|undefined} value
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
*/
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.setClassificationID = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.clearClassificationID = function() {
  return this.setClassificationID(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.hasClassificationID = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional assetmantle.schema.lists.base.PropertyList immutable_meta_properties = 5;
 * @return {?proto.assetmantle.schema.lists.base.PropertyList}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.getImmutableMetaProperties = function() {
  return /** @type{?proto.assetmantle.schema.lists.base.PropertyList} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.lists.base.PropertyList, 5));
};


/**
 * @param {?proto.assetmantle.schema.lists.base.PropertyList|undefined} value
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
*/
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.setImmutableMetaProperties = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.clearImmutableMetaProperties = function() {
  return this.setImmutableMetaProperties(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.hasImmutableMetaProperties = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional assetmantle.schema.lists.base.PropertyList immutable_properties = 6;
 * @return {?proto.assetmantle.schema.lists.base.PropertyList}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.getImmutableProperties = function() {
  return /** @type{?proto.assetmantle.schema.lists.base.PropertyList} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.lists.base.PropertyList, 6));
};


/**
 * @param {?proto.assetmantle.schema.lists.base.PropertyList|undefined} value
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
*/
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.setImmutableProperties = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.clearImmutableProperties = function() {
  return this.setImmutableProperties(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.hasImmutableProperties = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional assetmantle.schema.lists.base.PropertyList mutable_meta_properties = 7;
 * @return {?proto.assetmantle.schema.lists.base.PropertyList}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.getMutableMetaProperties = function() {
  return /** @type{?proto.assetmantle.schema.lists.base.PropertyList} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.lists.base.PropertyList, 7));
};


/**
 * @param {?proto.assetmantle.schema.lists.base.PropertyList|undefined} value
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
*/
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.setMutableMetaProperties = function(value) {
  return jspb.Message.setWrapperField(this, 7, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.clearMutableMetaProperties = function() {
  return this.setMutableMetaProperties(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.hasMutableMetaProperties = function() {
  return jspb.Message.getField(this, 7) != null;
};


/**
 * optional assetmantle.schema.lists.base.PropertyList mutable_properties = 8;
 * @return {?proto.assetmantle.schema.lists.base.PropertyList}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.getMutableProperties = function() {
  return /** @type{?proto.assetmantle.schema.lists.base.PropertyList} */ (
    jspb.Message.getWrapperField(this, proto.assetmantle.schema.lists.base.PropertyList, 8));
};


/**
 * @param {?proto.assetmantle.schema.lists.base.PropertyList|undefined} value
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
*/
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.setMutableProperties = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.assetmantle.modules.assets.transactions.mint.Message} returns this
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.clearMutableProperties = function() {
  return this.setMutableProperties(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.assetmantle.modules.assets.transactions.mint.Message.prototype.hasMutableProperties = function() {
  return jspb.Message.getField(this, 8) != null;
};


