// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ibc_applications_interchain_accounts_controller_v1_query_pb = require('../../../../../ibc/applications/interchain_accounts/controller/v1/query_pb.js');
var ibc_applications_interchain_accounts_controller_v1_controller_pb = require('../../../../../ibc/applications/interchain_accounts/controller/v1/controller_pb.js');
var google_api_annotations_pb = require('../../../../../google/api/annotations_pb.js');

function serialize_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_controller_v1_query_pb.QueryInterchainAccountRequest)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.controller.v1.QueryInterchainAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest(buffer_arg) {
  return ibc_applications_interchain_accounts_controller_v1_query_pb.QueryInterchainAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_controller_v1_query_pb.QueryInterchainAccountResponse)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.controller.v1.QueryInterchainAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse(buffer_arg) {
  return ibc_applications_interchain_accounts_controller_v1_query_pb.QueryInterchainAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_controller_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.controller.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest(buffer_arg) {
  return ibc_applications_interchain_accounts_controller_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_controller_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.controller.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse(buffer_arg) {
  return ibc_applications_interchain_accounts_controller_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // InterchainAccount returns the interchain account address for a given owner address on a given connection
interchainAccount: {
    path: '/ibc.applications.interchain_accounts.controller.v1.Query/InterchainAccount',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_interchain_accounts_controller_v1_query_pb.QueryInterchainAccountRequest,
    responseType: ibc_applications_interchain_accounts_controller_v1_query_pb.QueryInterchainAccountResponse,
    requestSerialize: serialize_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest,
    requestDeserialize: deserialize_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountRequest,
    responseSerialize: serialize_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse,
    responseDeserialize: deserialize_ibc_applications_interchain_accounts_controller_v1_QueryInterchainAccountResponse,
  },
  // Params queries all parameters of the ICA controller submodule.
params: {
    path: '/ibc.applications.interchain_accounts.controller.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_interchain_accounts_controller_v1_query_pb.QueryParamsRequest,
    responseType: ibc_applications_interchain_accounts_controller_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest,
    requestDeserialize: deserialize_ibc_applications_interchain_accounts_controller_v1_QueryParamsRequest,
    responseSerialize: serialize_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse,
    responseDeserialize: deserialize_ibc_applications_interchain_accounts_controller_v1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
