// source: akash/deployment/v1beta3/query.proto
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

goog.provide('proto.akash.deployment.v1beta3.QueryDeploymentsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.akash.deployment.v1beta3.QueryDeploymentResponse');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');

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
proto.akash.deployment.v1beta3.QueryDeploymentsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.akash.deployment.v1beta3.QueryDeploymentsResponse.repeatedFields_, null);
};
goog.inherits(proto.akash.deployment.v1beta3.QueryDeploymentsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.akash.deployment.v1beta3.QueryDeploymentsResponse.displayName = 'proto.akash.deployment.v1beta3.QueryDeploymentsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.repeatedFields_ = [1];



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
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.akash.deployment.v1beta3.QueryDeploymentsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.akash.deployment.v1beta3.QueryDeploymentsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    deploymentsList: jspb.Message.toObjectList(msg.getDeploymentsList(),
    proto.akash.deployment.v1beta3.QueryDeploymentResponse.toObject, includeInstance),
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
 * @return {!proto.akash.deployment.v1beta3.QueryDeploymentsResponse}
 */
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.akash.deployment.v1beta3.QueryDeploymentsResponse;
  return proto.akash.deployment.v1beta3.QueryDeploymentsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.akash.deployment.v1beta3.QueryDeploymentsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.akash.deployment.v1beta3.QueryDeploymentsResponse}
 */
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.akash.deployment.v1beta3.QueryDeploymentResponse;
      reader.readMessage(value,proto.akash.deployment.v1beta3.QueryDeploymentResponse.deserializeBinaryFromReader);
      msg.addDeployments(value);
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
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.akash.deployment.v1beta3.QueryDeploymentsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.akash.deployment.v1beta3.QueryDeploymentsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDeploymentsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.akash.deployment.v1beta3.QueryDeploymentResponse.serializeBinaryToWriter
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
 * repeated QueryDeploymentResponse deployments = 1;
 * @return {!Array<!proto.akash.deployment.v1beta3.QueryDeploymentResponse>}
 */
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.prototype.getDeploymentsList = function() {
  return /** @type{!Array<!proto.akash.deployment.v1beta3.QueryDeploymentResponse>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.akash.deployment.v1beta3.QueryDeploymentResponse, 1));
};


/**
 * @param {!Array<!proto.akash.deployment.v1beta3.QueryDeploymentResponse>} value
 * @return {!proto.akash.deployment.v1beta3.QueryDeploymentsResponse} returns this
*/
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.prototype.setDeploymentsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.akash.deployment.v1beta3.QueryDeploymentResponse=} opt_value
 * @param {number=} opt_index
 * @return {!proto.akash.deployment.v1beta3.QueryDeploymentResponse}
 */
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.prototype.addDeployments = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.akash.deployment.v1beta3.QueryDeploymentResponse, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.akash.deployment.v1beta3.QueryDeploymentsResponse} returns this
 */
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.prototype.clearDeploymentsList = function() {
  return this.setDeploymentsList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.akash.deployment.v1beta3.QueryDeploymentsResponse} returns this
*/
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.akash.deployment.v1beta3.QueryDeploymentsResponse} returns this
 */
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.akash.deployment.v1beta3.QueryDeploymentsResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


