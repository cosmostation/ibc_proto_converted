// source: desmos/subspaces/v1/models.proto
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

goog.provide('proto.desmos.subspaces.v1.PermissionDetail');
goog.provide('proto.desmos.subspaces.v1.PermissionDetail.Group');
goog.provide('proto.desmos.subspaces.v1.PermissionDetail.SumCase');
goog.provide('proto.desmos.subspaces.v1.PermissionDetail.User');

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
proto.desmos.subspaces.v1.PermissionDetail = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, proto.desmos.subspaces.v1.PermissionDetail.oneofGroups_);
};
goog.inherits(proto.desmos.subspaces.v1.PermissionDetail, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.subspaces.v1.PermissionDetail.displayName = 'proto.desmos.subspaces.v1.PermissionDetail';
}
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
proto.desmos.subspaces.v1.PermissionDetail.User = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.subspaces.v1.PermissionDetail.User, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.subspaces.v1.PermissionDetail.User.displayName = 'proto.desmos.subspaces.v1.PermissionDetail.User';
}
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
proto.desmos.subspaces.v1.PermissionDetail.Group = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.subspaces.v1.PermissionDetail.Group, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.subspaces.v1.PermissionDetail.Group.displayName = 'proto.desmos.subspaces.v1.PermissionDetail.Group';
}

/**
 * Oneof group definitions for this message. Each group defines the field
 * numbers belonging to that group. When of these fields' value is set, all
 * other fields in the group are cleared. During deserialization, if multiple
 * fields are encountered for a group, only the last value seen will be kept.
 * @private {!Array<!Array<number>>}
 * @const
 */
proto.desmos.subspaces.v1.PermissionDetail.oneofGroups_ = [[1,2]];

/**
 * @enum {number}
 */
proto.desmos.subspaces.v1.PermissionDetail.SumCase = {
  SUM_NOT_SET: 0,
  USER: 1,
  GROUP: 2
};

/**
 * @return {proto.desmos.subspaces.v1.PermissionDetail.SumCase}
 */
proto.desmos.subspaces.v1.PermissionDetail.prototype.getSumCase = function() {
  return /** @type {proto.desmos.subspaces.v1.PermissionDetail.SumCase} */(jspb.Message.computeOneofCase(this, proto.desmos.subspaces.v1.PermissionDetail.oneofGroups_[0]));
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
proto.desmos.subspaces.v1.PermissionDetail.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.subspaces.v1.PermissionDetail.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.subspaces.v1.PermissionDetail} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.subspaces.v1.PermissionDetail.toObject = function(includeInstance, msg) {
  var f, obj = {
    user: (f = msg.getUser()) && proto.desmos.subspaces.v1.PermissionDetail.User.toObject(includeInstance, f),
    group: (f = msg.getGroup()) && proto.desmos.subspaces.v1.PermissionDetail.Group.toObject(includeInstance, f)
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
 * @return {!proto.desmos.subspaces.v1.PermissionDetail}
 */
proto.desmos.subspaces.v1.PermissionDetail.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.subspaces.v1.PermissionDetail;
  return proto.desmos.subspaces.v1.PermissionDetail.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.subspaces.v1.PermissionDetail} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.subspaces.v1.PermissionDetail}
 */
proto.desmos.subspaces.v1.PermissionDetail.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.desmos.subspaces.v1.PermissionDetail.User;
      reader.readMessage(value,proto.desmos.subspaces.v1.PermissionDetail.User.deserializeBinaryFromReader);
      msg.setUser(value);
      break;
    case 2:
      var value = new proto.desmos.subspaces.v1.PermissionDetail.Group;
      reader.readMessage(value,proto.desmos.subspaces.v1.PermissionDetail.Group.deserializeBinaryFromReader);
      msg.setGroup(value);
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
proto.desmos.subspaces.v1.PermissionDetail.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.subspaces.v1.PermissionDetail.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.subspaces.v1.PermissionDetail} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.subspaces.v1.PermissionDetail.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUser();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.desmos.subspaces.v1.PermissionDetail.User.serializeBinaryToWriter
    );
  }
  f = message.getGroup();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.desmos.subspaces.v1.PermissionDetail.Group.serializeBinaryToWriter
    );
  }
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
proto.desmos.subspaces.v1.PermissionDetail.User.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.subspaces.v1.PermissionDetail.User.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.subspaces.v1.PermissionDetail.User} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.subspaces.v1.PermissionDetail.User.toObject = function(includeInstance, msg) {
  var f, obj = {
    user: jspb.Message.getFieldWithDefault(msg, 1, ""),
    permission: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.desmos.subspaces.v1.PermissionDetail.User}
 */
proto.desmos.subspaces.v1.PermissionDetail.User.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.subspaces.v1.PermissionDetail.User;
  return proto.desmos.subspaces.v1.PermissionDetail.User.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.subspaces.v1.PermissionDetail.User} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.subspaces.v1.PermissionDetail.User}
 */
proto.desmos.subspaces.v1.PermissionDetail.User.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setUser(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setPermission(value);
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
proto.desmos.subspaces.v1.PermissionDetail.User.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.subspaces.v1.PermissionDetail.User.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.subspaces.v1.PermissionDetail.User} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.subspaces.v1.PermissionDetail.User.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUser();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getPermission();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
};


/**
 * optional string user = 1;
 * @return {string}
 */
proto.desmos.subspaces.v1.PermissionDetail.User.prototype.getUser = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.subspaces.v1.PermissionDetail.User} returns this
 */
proto.desmos.subspaces.v1.PermissionDetail.User.prototype.setUser = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint32 permission = 2;
 * @return {number}
 */
proto.desmos.subspaces.v1.PermissionDetail.User.prototype.getPermission = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.subspaces.v1.PermissionDetail.User} returns this
 */
proto.desmos.subspaces.v1.PermissionDetail.User.prototype.setPermission = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
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
proto.desmos.subspaces.v1.PermissionDetail.Group.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.subspaces.v1.PermissionDetail.Group.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.subspaces.v1.PermissionDetail.Group} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.subspaces.v1.PermissionDetail.Group.toObject = function(includeInstance, msg) {
  var f, obj = {
    groupId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    permission: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.desmos.subspaces.v1.PermissionDetail.Group}
 */
proto.desmos.subspaces.v1.PermissionDetail.Group.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.subspaces.v1.PermissionDetail.Group;
  return proto.desmos.subspaces.v1.PermissionDetail.Group.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.subspaces.v1.PermissionDetail.Group} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.subspaces.v1.PermissionDetail.Group}
 */
proto.desmos.subspaces.v1.PermissionDetail.Group.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setGroupId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setPermission(value);
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
proto.desmos.subspaces.v1.PermissionDetail.Group.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.subspaces.v1.PermissionDetail.Group.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.subspaces.v1.PermissionDetail.Group} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.subspaces.v1.PermissionDetail.Group.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getGroupId();
  if (f !== 0) {
    writer.writeUint32(
      1,
      f
    );
  }
  f = message.getPermission();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
};


/**
 * optional uint32 group_id = 1;
 * @return {number}
 */
proto.desmos.subspaces.v1.PermissionDetail.Group.prototype.getGroupId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.subspaces.v1.PermissionDetail.Group} returns this
 */
proto.desmos.subspaces.v1.PermissionDetail.Group.prototype.setGroupId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint32 permission = 2;
 * @return {number}
 */
proto.desmos.subspaces.v1.PermissionDetail.Group.prototype.getPermission = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.subspaces.v1.PermissionDetail.Group} returns this
 */
proto.desmos.subspaces.v1.PermissionDetail.Group.prototype.setPermission = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional User user = 1;
 * @return {?proto.desmos.subspaces.v1.PermissionDetail.User}
 */
proto.desmos.subspaces.v1.PermissionDetail.prototype.getUser = function() {
  return /** @type{?proto.desmos.subspaces.v1.PermissionDetail.User} */ (
    jspb.Message.getWrapperField(this, proto.desmos.subspaces.v1.PermissionDetail.User, 1));
};


/**
 * @param {?proto.desmos.subspaces.v1.PermissionDetail.User|undefined} value
 * @return {!proto.desmos.subspaces.v1.PermissionDetail} returns this
*/
proto.desmos.subspaces.v1.PermissionDetail.prototype.setUser = function(value) {
  return jspb.Message.setOneofWrapperField(this, 1, proto.desmos.subspaces.v1.PermissionDetail.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.subspaces.v1.PermissionDetail} returns this
 */
proto.desmos.subspaces.v1.PermissionDetail.prototype.clearUser = function() {
  return this.setUser(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.subspaces.v1.PermissionDetail.prototype.hasUser = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Group group = 2;
 * @return {?proto.desmos.subspaces.v1.PermissionDetail.Group}
 */
proto.desmos.subspaces.v1.PermissionDetail.prototype.getGroup = function() {
  return /** @type{?proto.desmos.subspaces.v1.PermissionDetail.Group} */ (
    jspb.Message.getWrapperField(this, proto.desmos.subspaces.v1.PermissionDetail.Group, 2));
};


/**
 * @param {?proto.desmos.subspaces.v1.PermissionDetail.Group|undefined} value
 * @return {!proto.desmos.subspaces.v1.PermissionDetail} returns this
*/
proto.desmos.subspaces.v1.PermissionDetail.prototype.setGroup = function(value) {
  return jspb.Message.setOneofWrapperField(this, 2, proto.desmos.subspaces.v1.PermissionDetail.oneofGroups_[0], value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.subspaces.v1.PermissionDetail} returns this
 */
proto.desmos.subspaces.v1.PermissionDetail.prototype.clearGroup = function() {
  return this.setGroup(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.subspaces.v1.PermissionDetail.prototype.hasGroup = function() {
  return jspb.Message.getField(this, 2) != null;
};

