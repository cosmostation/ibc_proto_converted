// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var iov_configuration_v1beta1_query_pb = require('../../../iov/configuration/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var iov_configuration_v1beta1_types_pb = require('../../../iov/configuration/v1beta1/types_pb.js');

function serialize_starnamed_x_configuration_v1beta1_QueryConfigRequest(arg) {
  if (!(arg instanceof iov_configuration_v1beta1_query_pb.QueryConfigRequest)) {
    throw new Error('Expected argument of type starnamed.x.configuration.v1beta1.QueryConfigRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_configuration_v1beta1_QueryConfigRequest(buffer_arg) {
  return iov_configuration_v1beta1_query_pb.QueryConfigRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_configuration_v1beta1_QueryConfigResponse(arg) {
  if (!(arg instanceof iov_configuration_v1beta1_query_pb.QueryConfigResponse)) {
    throw new Error('Expected argument of type starnamed.x.configuration.v1beta1.QueryConfigResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_configuration_v1beta1_QueryConfigResponse(buffer_arg) {
  return iov_configuration_v1beta1_query_pb.QueryConfigResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_configuration_v1beta1_QueryFeesRequest(arg) {
  if (!(arg instanceof iov_configuration_v1beta1_query_pb.QueryFeesRequest)) {
    throw new Error('Expected argument of type starnamed.x.configuration.v1beta1.QueryFeesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_configuration_v1beta1_QueryFeesRequest(buffer_arg) {
  return iov_configuration_v1beta1_query_pb.QueryFeesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_configuration_v1beta1_QueryFeesResponse(arg) {
  if (!(arg instanceof iov_configuration_v1beta1_query_pb.QueryFeesResponse)) {
    throw new Error('Expected argument of type starnamed.x.configuration.v1beta1.QueryFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_configuration_v1beta1_QueryFeesResponse(buffer_arg) {
  return iov_configuration_v1beta1_query_pb.QueryFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Config gets starname configuration.
config: {
    path: '/starnamed.x.configuration.v1beta1.Query/Config',
    requestStream: false,
    responseStream: false,
    requestType: iov_configuration_v1beta1_query_pb.QueryConfigRequest,
    responseType: iov_configuration_v1beta1_query_pb.QueryConfigResponse,
    requestSerialize: serialize_starnamed_x_configuration_v1beta1_QueryConfigRequest,
    requestDeserialize: deserialize_starnamed_x_configuration_v1beta1_QueryConfigRequest,
    responseSerialize: serialize_starnamed_x_configuration_v1beta1_QueryConfigResponse,
    responseDeserialize: deserialize_starnamed_x_configuration_v1beta1_QueryConfigResponse,
  },
  // Fees gets starname product fees.
fees: {
    path: '/starnamed.x.configuration.v1beta1.Query/Fees',
    requestStream: false,
    responseStream: false,
    requestType: iov_configuration_v1beta1_query_pb.QueryFeesRequest,
    responseType: iov_configuration_v1beta1_query_pb.QueryFeesResponse,
    requestSerialize: serialize_starnamed_x_configuration_v1beta1_QueryFeesRequest,
    requestDeserialize: deserialize_starnamed_x_configuration_v1beta1_QueryFeesRequest,
    responseSerialize: serialize_starnamed_x_configuration_v1beta1_QueryFeesResponse,
    responseDeserialize: deserialize_starnamed_x_configuration_v1beta1_QueryFeesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
