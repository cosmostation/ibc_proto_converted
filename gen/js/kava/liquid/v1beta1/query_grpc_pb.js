// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_liquid_v1beta1_query_pb = require('../../../kava/liquid/v1beta1/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_kava_liquid_v1beta1_QueryDelegatedBalanceRequest(arg) {
  if (!(arg instanceof kava_liquid_v1beta1_query_pb.QueryDelegatedBalanceRequest)) {
    throw new Error('Expected argument of type kava.liquid.v1beta1.QueryDelegatedBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_liquid_v1beta1_QueryDelegatedBalanceRequest(buffer_arg) {
  return kava_liquid_v1beta1_query_pb.QueryDelegatedBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_liquid_v1beta1_QueryDelegatedBalanceResponse(arg) {
  if (!(arg instanceof kava_liquid_v1beta1_query_pb.QueryDelegatedBalanceResponse)) {
    throw new Error('Expected argument of type kava.liquid.v1beta1.QueryDelegatedBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_liquid_v1beta1_QueryDelegatedBalanceResponse(buffer_arg) {
  return kava_liquid_v1beta1_query_pb.QueryDelegatedBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_liquid_v1beta1_QueryTotalSupplyRequest(arg) {
  if (!(arg instanceof kava_liquid_v1beta1_query_pb.QueryTotalSupplyRequest)) {
    throw new Error('Expected argument of type kava.liquid.v1beta1.QueryTotalSupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_liquid_v1beta1_QueryTotalSupplyRequest(buffer_arg) {
  return kava_liquid_v1beta1_query_pb.QueryTotalSupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_liquid_v1beta1_QueryTotalSupplyResponse(arg) {
  if (!(arg instanceof kava_liquid_v1beta1_query_pb.QueryTotalSupplyResponse)) {
    throw new Error('Expected argument of type kava.liquid.v1beta1.QueryTotalSupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_liquid_v1beta1_QueryTotalSupplyResponse(buffer_arg) {
  return kava_liquid_v1beta1_query_pb.QueryTotalSupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for liquid module
var QueryService = exports.QueryService = {
  // DelegatedBalance returns an account's vesting and vested coins currently delegated to validators.
// It ignores coins in unbonding delegations.
delegatedBalance: {
    path: '/kava.liquid.v1beta1.Query/DelegatedBalance',
    requestStream: false,
    responseStream: false,
    requestType: kava_liquid_v1beta1_query_pb.QueryDelegatedBalanceRequest,
    responseType: kava_liquid_v1beta1_query_pb.QueryDelegatedBalanceResponse,
    requestSerialize: serialize_kava_liquid_v1beta1_QueryDelegatedBalanceRequest,
    requestDeserialize: deserialize_kava_liquid_v1beta1_QueryDelegatedBalanceRequest,
    responseSerialize: serialize_kava_liquid_v1beta1_QueryDelegatedBalanceResponse,
    responseDeserialize: deserialize_kava_liquid_v1beta1_QueryDelegatedBalanceResponse,
  },
  // TotalSupply returns the total sum of all coins currently locked into the liquid module.
totalSupply: {
    path: '/kava.liquid.v1beta1.Query/TotalSupply',
    requestStream: false,
    responseStream: false,
    requestType: kava_liquid_v1beta1_query_pb.QueryTotalSupplyRequest,
    responseType: kava_liquid_v1beta1_query_pb.QueryTotalSupplyResponse,
    requestSerialize: serialize_kava_liquid_v1beta1_QueryTotalSupplyRequest,
    requestDeserialize: deserialize_kava_liquid_v1beta1_QueryTotalSupplyRequest,
    responseSerialize: serialize_kava_liquid_v1beta1_QueryTotalSupplyResponse,
    responseDeserialize: deserialize_kava_liquid_v1beta1_QueryTotalSupplyResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
