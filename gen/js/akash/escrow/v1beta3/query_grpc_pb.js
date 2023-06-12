// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_escrow_v1beta3_query_pb = require('../../../akash/escrow/v1beta3/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var akash_escrow_v1beta3_types_pb = require('../../../akash/escrow/v1beta3/types_pb.js');

function serialize_akash_escrow_v1beta3_QueryAccountsRequest(arg) {
  if (!(arg instanceof akash_escrow_v1beta3_query_pb.QueryAccountsRequest)) {
    throw new Error('Expected argument of type akash.escrow.v1beta3.QueryAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_escrow_v1beta3_QueryAccountsRequest(buffer_arg) {
  return akash_escrow_v1beta3_query_pb.QueryAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_escrow_v1beta3_QueryAccountsResponse(arg) {
  if (!(arg instanceof akash_escrow_v1beta3_query_pb.QueryAccountsResponse)) {
    throw new Error('Expected argument of type akash.escrow.v1beta3.QueryAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_escrow_v1beta3_QueryAccountsResponse(buffer_arg) {
  return akash_escrow_v1beta3_query_pb.QueryAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_escrow_v1beta3_QueryPaymentsRequest(arg) {
  if (!(arg instanceof akash_escrow_v1beta3_query_pb.QueryPaymentsRequest)) {
    throw new Error('Expected argument of type akash.escrow.v1beta3.QueryPaymentsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_escrow_v1beta3_QueryPaymentsRequest(buffer_arg) {
  return akash_escrow_v1beta3_query_pb.QueryPaymentsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_escrow_v1beta3_QueryPaymentsResponse(arg) {
  if (!(arg instanceof akash_escrow_v1beta3_query_pb.QueryPaymentsResponse)) {
    throw new Error('Expected argument of type akash.escrow.v1beta3.QueryPaymentsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_escrow_v1beta3_QueryPaymentsResponse(buffer_arg) {
  return akash_escrow_v1beta3_query_pb.QueryPaymentsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
// buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
// Accounts queries all accounts
accounts: {
    path: '/akash.escrow.v1beta3.Query/Accounts',
    requestStream: false,
    responseStream: false,
    requestType: akash_escrow_v1beta3_query_pb.QueryAccountsRequest,
    responseType: akash_escrow_v1beta3_query_pb.QueryAccountsResponse,
    requestSerialize: serialize_akash_escrow_v1beta3_QueryAccountsRequest,
    requestDeserialize: deserialize_akash_escrow_v1beta3_QueryAccountsRequest,
    responseSerialize: serialize_akash_escrow_v1beta3_QueryAccountsResponse,
    responseDeserialize: deserialize_akash_escrow_v1beta3_QueryAccountsResponse,
  },
  // buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
// buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
// Payments queries all payments
payments: {
    path: '/akash.escrow.v1beta3.Query/Payments',
    requestStream: false,
    responseStream: false,
    requestType: akash_escrow_v1beta3_query_pb.QueryPaymentsRequest,
    responseType: akash_escrow_v1beta3_query_pb.QueryPaymentsResponse,
    requestSerialize: serialize_akash_escrow_v1beta3_QueryPaymentsRequest,
    requestDeserialize: deserialize_akash_escrow_v1beta3_QueryPaymentsRequest,
    responseSerialize: serialize_akash_escrow_v1beta3_QueryPaymentsResponse,
    responseDeserialize: deserialize_akash_escrow_v1beta3_QueryPaymentsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
