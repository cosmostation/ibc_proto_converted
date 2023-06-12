// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_swap_v1beta1_query_pb = require('../../../kava/swap/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kava_swap_v1beta1_swap_pb = require('../../../kava/swap/v1beta1/swap_pb.js');

function serialize_kava_swap_v1beta1_QueryDepositsRequest(arg) {
  if (!(arg instanceof kava_swap_v1beta1_query_pb.QueryDepositsRequest)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.QueryDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_QueryDepositsRequest(buffer_arg) {
  return kava_swap_v1beta1_query_pb.QueryDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_QueryDepositsResponse(arg) {
  if (!(arg instanceof kava_swap_v1beta1_query_pb.QueryDepositsResponse)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.QueryDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_QueryDepositsResponse(buffer_arg) {
  return kava_swap_v1beta1_query_pb.QueryDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof kava_swap_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_QueryParamsRequest(buffer_arg) {
  return kava_swap_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof kava_swap_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_QueryParamsResponse(buffer_arg) {
  return kava_swap_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_QueryPoolsRequest(arg) {
  if (!(arg instanceof kava_swap_v1beta1_query_pb.QueryPoolsRequest)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.QueryPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_QueryPoolsRequest(buffer_arg) {
  return kava_swap_v1beta1_query_pb.QueryPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_swap_v1beta1_QueryPoolsResponse(arg) {
  if (!(arg instanceof kava_swap_v1beta1_query_pb.QueryPoolsResponse)) {
    throw new Error('Expected argument of type kava.swap.v1beta1.QueryPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_swap_v1beta1_QueryPoolsResponse(buffer_arg) {
  return kava_swap_v1beta1_query_pb.QueryPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for swap module
var QueryService = exports.QueryService = {
  // Params queries all parameters of the swap module.
params: {
    path: '/kava.swap.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: kava_swap_v1beta1_query_pb.QueryParamsRequest,
    responseType: kava_swap_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_kava_swap_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_kava_swap_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_kava_swap_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_kava_swap_v1beta1_QueryParamsResponse,
  },
  // Pools queries pools based on pool ID
pools: {
    path: '/kava.swap.v1beta1.Query/Pools',
    requestStream: false,
    responseStream: false,
    requestType: kava_swap_v1beta1_query_pb.QueryPoolsRequest,
    responseType: kava_swap_v1beta1_query_pb.QueryPoolsResponse,
    requestSerialize: serialize_kava_swap_v1beta1_QueryPoolsRequest,
    requestDeserialize: deserialize_kava_swap_v1beta1_QueryPoolsRequest,
    responseSerialize: serialize_kava_swap_v1beta1_QueryPoolsResponse,
    responseDeserialize: deserialize_kava_swap_v1beta1_QueryPoolsResponse,
  },
  // Deposits queries deposit details based on owner address and pool
deposits: {
    path: '/kava.swap.v1beta1.Query/Deposits',
    requestStream: false,
    responseStream: false,
    requestType: kava_swap_v1beta1_query_pb.QueryDepositsRequest,
    responseType: kava_swap_v1beta1_query_pb.QueryDepositsResponse,
    requestSerialize: serialize_kava_swap_v1beta1_QueryDepositsRequest,
    requestDeserialize: deserialize_kava_swap_v1beta1_QueryDepositsRequest,
    responseSerialize: serialize_kava_swap_v1beta1_QueryDepositsResponse,
    responseDeserialize: deserialize_kava_swap_v1beta1_QueryDepositsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
