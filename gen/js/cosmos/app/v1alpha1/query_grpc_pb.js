// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_app_v1alpha1_query_pb = require('../../../cosmos/app/v1alpha1/query_pb.js');
var cosmos_app_v1alpha1_config_pb = require('../../../cosmos/app/v1alpha1/config_pb.js');

function serialize_cosmos_app_v1alpha1_QueryConfigRequest(arg) {
  if (!(arg instanceof cosmos_app_v1alpha1_query_pb.QueryConfigRequest)) {
    throw new Error('Expected argument of type cosmos.app.v1alpha1.QueryConfigRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_app_v1alpha1_QueryConfigRequest(buffer_arg) {
  return cosmos_app_v1alpha1_query_pb.QueryConfigRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_app_v1alpha1_QueryConfigResponse(arg) {
  if (!(arg instanceof cosmos_app_v1alpha1_query_pb.QueryConfigResponse)) {
    throw new Error('Expected argument of type cosmos.app.v1alpha1.QueryConfigResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_app_v1alpha1_QueryConfigResponse(buffer_arg) {
  return cosmos_app_v1alpha1_query_pb.QueryConfigResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query is the app module query service.
var QueryService = exports.QueryService = {
  // Config returns the current app config.
config: {
    path: '/cosmos.app.v1alpha1.Query/Config',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_app_v1alpha1_query_pb.QueryConfigRequest,
    responseType: cosmos_app_v1alpha1_query_pb.QueryConfigResponse,
    requestSerialize: serialize_cosmos_app_v1alpha1_QueryConfigRequest,
    requestDeserialize: deserialize_cosmos_app_v1alpha1_QueryConfigRequest,
    responseSerialize: serialize_cosmos_app_v1alpha1_QueryConfigResponse,
    responseDeserialize: deserialize_cosmos_app_v1alpha1_QueryConfigResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
