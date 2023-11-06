// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_circuit_v1_query_pb = require('../../../cosmos/circuit/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_circuit_v1_types_pb = require('../../../cosmos/circuit/v1/types_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_query_v1_query_pb = require('../../../cosmos/query/v1/query_pb.js');

function serialize_cosmos_circuit_v1_AccountResponse(arg) {
  if (!(arg instanceof cosmos_circuit_v1_query_pb.AccountResponse)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.AccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_AccountResponse(buffer_arg) {
  return cosmos_circuit_v1_query_pb.AccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_circuit_v1_AccountsResponse(arg) {
  if (!(arg instanceof cosmos_circuit_v1_query_pb.AccountsResponse)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.AccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_AccountsResponse(buffer_arg) {
  return cosmos_circuit_v1_query_pb.AccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_circuit_v1_DisabledListResponse(arg) {
  if (!(arg instanceof cosmos_circuit_v1_query_pb.DisabledListResponse)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.DisabledListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_DisabledListResponse(buffer_arg) {
  return cosmos_circuit_v1_query_pb.DisabledListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_circuit_v1_QueryAccountRequest(arg) {
  if (!(arg instanceof cosmos_circuit_v1_query_pb.QueryAccountRequest)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.QueryAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_QueryAccountRequest(buffer_arg) {
  return cosmos_circuit_v1_query_pb.QueryAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_circuit_v1_QueryAccountsRequest(arg) {
  if (!(arg instanceof cosmos_circuit_v1_query_pb.QueryAccountsRequest)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.QueryAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_QueryAccountsRequest(buffer_arg) {
  return cosmos_circuit_v1_query_pb.QueryAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_circuit_v1_QueryDisabledListRequest(arg) {
  if (!(arg instanceof cosmos_circuit_v1_query_pb.QueryDisabledListRequest)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.QueryDisabledListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_QueryDisabledListRequest(buffer_arg) {
  return cosmos_circuit_v1_query_pb.QueryDisabledListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the circuit gRPC querier service.
var QueryService = exports.QueryService = {
  // Account returns account permissions.
account: {
    path: '/cosmos.circuit.v1.Query/Account',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_circuit_v1_query_pb.QueryAccountRequest,
    responseType: cosmos_circuit_v1_query_pb.AccountResponse,
    requestSerialize: serialize_cosmos_circuit_v1_QueryAccountRequest,
    requestDeserialize: deserialize_cosmos_circuit_v1_QueryAccountRequest,
    responseSerialize: serialize_cosmos_circuit_v1_AccountResponse,
    responseDeserialize: deserialize_cosmos_circuit_v1_AccountResponse,
  },
  // Account returns account permissions.
accounts: {
    path: '/cosmos.circuit.v1.Query/Accounts',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_circuit_v1_query_pb.QueryAccountsRequest,
    responseType: cosmos_circuit_v1_query_pb.AccountsResponse,
    requestSerialize: serialize_cosmos_circuit_v1_QueryAccountsRequest,
    requestDeserialize: deserialize_cosmos_circuit_v1_QueryAccountsRequest,
    responseSerialize: serialize_cosmos_circuit_v1_AccountsResponse,
    responseDeserialize: deserialize_cosmos_circuit_v1_AccountsResponse,
  },
  // DisabledList returns a list of disabled message urls
disabledList: {
    path: '/cosmos.circuit.v1.Query/DisabledList',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_circuit_v1_query_pb.QueryDisabledListRequest,
    responseType: cosmos_circuit_v1_query_pb.DisabledListResponse,
    requestSerialize: serialize_cosmos_circuit_v1_QueryDisabledListRequest,
    requestDeserialize: deserialize_cosmos_circuit_v1_QueryDisabledListRequest,
    responseSerialize: serialize_cosmos_circuit_v1_DisabledListResponse,
    responseDeserialize: deserialize_cosmos_circuit_v1_DisabledListResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
