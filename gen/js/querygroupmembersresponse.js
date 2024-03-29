// source: regen/group/v1alpha1/query.proto
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

goog.provide('proto.regen.group.v1alpha1.QueryGroupMembersResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.regen.group.v1alpha1.GroupMember');

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
proto.regen.group.v1alpha1.QueryGroupMembersResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.regen.group.v1alpha1.QueryGroupMembersResponse.repeatedFields_, null);
};
goog.inherits(proto.regen.group.v1alpha1.QueryGroupMembersResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.regen.group.v1alpha1.QueryGroupMembersResponse.displayName = 'proto.regen.group.v1alpha1.QueryGroupMembersResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.regen.group.v1alpha1.QueryGroupMembersResponse.repeatedFields_ = [1];



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
proto.regen.group.v1alpha1.QueryGroupMembersResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.regen.group.v1alpha1.QueryGroupMembersResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.regen.group.v1alpha1.QueryGroupMembersResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.group.v1alpha1.QueryGroupMembersResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    membersList: jspb.Message.toObjectList(msg.getMembersList(),
    proto.regen.group.v1alpha1.GroupMember.toObject, includeInstance),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.regen.group.v1alpha1.QueryGroupMembersResponse}
 */
proto.regen.group.v1alpha1.QueryGroupMembersResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.regen.group.v1alpha1.QueryGroupMembersResponse;
  return proto.regen.group.v1alpha1.QueryGroupMembersResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.regen.group.v1alpha1.QueryGroupMembersResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.regen.group.v1alpha1.QueryGroupMembersResponse}
 */
proto.regen.group.v1alpha1.QueryGroupMembersResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.regen.group.v1alpha1.GroupMember;
      reader.readMessage(value,proto.regen.group.v1alpha1.GroupMember.deserializeBinaryFromReader);
      msg.addMembers(value);
      break;
    case 2:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.regen.group.v1alpha1.QueryGroupMembersResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.regen.group.v1alpha1.QueryGroupMembersResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.regen.group.v1alpha1.QueryGroupMembersResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.regen.group.v1alpha1.QueryGroupMembersResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMembersList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.regen.group.v1alpha1.GroupMember.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated GroupMember members = 1;
 * @return {!Array<!proto.regen.group.v1alpha1.GroupMember>}
 */
proto.regen.group.v1alpha1.QueryGroupMembersResponse.prototype.getMembersList = function() {
  return /** @type{!Array<!proto.regen.group.v1alpha1.GroupMember>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.regen.group.v1alpha1.GroupMember, 1));
};


/**
 * @param {!Array<!proto.regen.group.v1alpha1.GroupMember>} value
 * @return {!proto.regen.group.v1alpha1.QueryGroupMembersResponse} returns this
*/
proto.regen.group.v1alpha1.QueryGroupMembersResponse.prototype.setMembersList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.regen.group.v1alpha1.GroupMember=} opt_value
 * @param {number=} opt_index
 * @return {!proto.regen.group.v1alpha1.GroupMember}
 */
proto.regen.group.v1alpha1.QueryGroupMembersResponse.prototype.addMembers = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.regen.group.v1alpha1.GroupMember, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.regen.group.v1alpha1.QueryGroupMembersResponse} returns this
 */
proto.regen.group.v1alpha1.QueryGroupMembersResponse.prototype.clearMembersList = function() {
  return this.setMembersList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.regen.group.v1alpha1.QueryGroupMembersResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.regen.group.v1alpha1.QueryGroupMembersResponse} returns this
*/
proto.regen.group.v1alpha1.QueryGroupMembersResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.regen.group.v1alpha1.QueryGroupMembersResponse} returns this
 */
proto.regen.group.v1alpha1.QueryGroupMembersResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.regen.group.v1alpha1.QueryGroupMembersResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


