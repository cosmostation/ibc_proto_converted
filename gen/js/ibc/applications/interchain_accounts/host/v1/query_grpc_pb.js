// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ibc_applications_interchain_accounts_host_v1_query_pb = require('../../../../../ibc/applications/interchain_accounts/host/v1/query_pb.js');
var google_api_annotations_pb = require('../../../../../google/api/annotations_pb.js');
var ibc_applications_interchain_accounts_host_v1_host_pb = require('../../../../../ibc/applications/interchain_accounts/host/v1/host_pb.js');

function serialize_ibc_applications_interchain_accounts_host_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_host_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.host.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_host_v1_QueryParamsRequest(buffer_arg) {
  return ibc_applications_interchain_accounts_host_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_interchain_accounts_host_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_host_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.host.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_host_v1_QueryParamsResponse(buffer_arg) {
  return ibc_applications_interchain_accounts_host_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params queries all parameters of the ICA host submodule.
params: {
    path: '/ibc.applications.interchain_accounts.host.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_interchain_accounts_host_v1_query_pb.QueryParamsRequest,
    responseType: ibc_applications_interchain_accounts_host_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_ibc_applications_interchain_accounts_host_v1_QueryParamsRequest,
    requestDeserialize: deserialize_ibc_applications_interchain_accounts_host_v1_QueryParamsRequest,
    responseSerialize: serialize_ibc_applications_interchain_accounts_host_v1_QueryParamsResponse,
    responseDeserialize: deserialize_ibc_applications_interchain_accounts_host_v1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
