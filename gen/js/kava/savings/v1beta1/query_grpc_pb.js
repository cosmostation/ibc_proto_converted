// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_savings_v1beta1_query_pb = require('../../../kava/savings/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kava_savings_v1beta1_store_pb = require('../../../kava/savings/v1beta1/store_pb.js');

function serialize_kava_savings_v1beta1_QueryDepositsRequest(arg) {
  if (!(arg instanceof kava_savings_v1beta1_query_pb.QueryDepositsRequest)) {
    throw new Error('Expected argument of type kava.savings.v1beta1.QueryDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_savings_v1beta1_QueryDepositsRequest(buffer_arg) {
  return kava_savings_v1beta1_query_pb.QueryDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_savings_v1beta1_QueryDepositsResponse(arg) {
  if (!(arg instanceof kava_savings_v1beta1_query_pb.QueryDepositsResponse)) {
    throw new Error('Expected argument of type kava.savings.v1beta1.QueryDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_savings_v1beta1_QueryDepositsResponse(buffer_arg) {
  return kava_savings_v1beta1_query_pb.QueryDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_savings_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof kava_savings_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type kava.savings.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_savings_v1beta1_QueryParamsRequest(buffer_arg) {
  return kava_savings_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_savings_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof kava_savings_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type kava.savings.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_savings_v1beta1_QueryParamsResponse(buffer_arg) {
  return kava_savings_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_savings_v1beta1_QueryTotalSupplyRequest(arg) {
  if (!(arg instanceof kava_savings_v1beta1_query_pb.QueryTotalSupplyRequest)) {
    throw new Error('Expected argument of type kava.savings.v1beta1.QueryTotalSupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_savings_v1beta1_QueryTotalSupplyRequest(buffer_arg) {
  return kava_savings_v1beta1_query_pb.QueryTotalSupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_savings_v1beta1_QueryTotalSupplyResponse(arg) {
  if (!(arg instanceof kava_savings_v1beta1_query_pb.QueryTotalSupplyResponse)) {
    throw new Error('Expected argument of type kava.savings.v1beta1.QueryTotalSupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_savings_v1beta1_QueryTotalSupplyResponse(buffer_arg) {
  return kava_savings_v1beta1_query_pb.QueryTotalSupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for savings module
var QueryService = exports.QueryService = {
  // Params queries all parameters of the savings module.
params: {
    path: '/kava.savings.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: kava_savings_v1beta1_query_pb.QueryParamsRequest,
    responseType: kava_savings_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_kava_savings_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_kava_savings_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_kava_savings_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_kava_savings_v1beta1_QueryParamsResponse,
  },
  // Deposits queries savings deposits.
deposits: {
    path: '/kava.savings.v1beta1.Query/Deposits',
    requestStream: false,
    responseStream: false,
    requestType: kava_savings_v1beta1_query_pb.QueryDepositsRequest,
    responseType: kava_savings_v1beta1_query_pb.QueryDepositsResponse,
    requestSerialize: serialize_kava_savings_v1beta1_QueryDepositsRequest,
    requestDeserialize: deserialize_kava_savings_v1beta1_QueryDepositsRequest,
    responseSerialize: serialize_kava_savings_v1beta1_QueryDepositsResponse,
    responseDeserialize: deserialize_kava_savings_v1beta1_QueryDepositsResponse,
  },
  // TotalSupply returns the total sum of all coins currently locked into the savings module.
totalSupply: {
    path: '/kava.savings.v1beta1.Query/TotalSupply',
    requestStream: false,
    responseStream: false,
    requestType: kava_savings_v1beta1_query_pb.QueryTotalSupplyRequest,
    responseType: kava_savings_v1beta1_query_pb.QueryTotalSupplyResponse,
    requestSerialize: serialize_kava_savings_v1beta1_QueryTotalSupplyRequest,
    requestDeserialize: deserialize_kava_savings_v1beta1_QueryTotalSupplyRequest,
    responseSerialize: serialize_kava_savings_v1beta1_QueryTotalSupplyResponse,
    responseDeserialize: deserialize_kava_savings_v1beta1_QueryTotalSupplyResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
