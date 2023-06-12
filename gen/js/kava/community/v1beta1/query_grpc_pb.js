// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_community_v1beta1_query_pb = require('../../../kava/community/v1beta1/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_kava_community_v1beta1_QueryBalanceRequest(arg) {
  if (!(arg instanceof kava_community_v1beta1_query_pb.QueryBalanceRequest)) {
    throw new Error('Expected argument of type kava.community.v1beta1.QueryBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_community_v1beta1_QueryBalanceRequest(buffer_arg) {
  return kava_community_v1beta1_query_pb.QueryBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_community_v1beta1_QueryBalanceResponse(arg) {
  if (!(arg instanceof kava_community_v1beta1_query_pb.QueryBalanceResponse)) {
    throw new Error('Expected argument of type kava.community.v1beta1.QueryBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_community_v1beta1_QueryBalanceResponse(buffer_arg) {
  return kava_community_v1beta1_query_pb.QueryBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_community_v1beta1_QueryTotalBalanceRequest(arg) {
  if (!(arg instanceof kava_community_v1beta1_query_pb.QueryTotalBalanceRequest)) {
    throw new Error('Expected argument of type kava.community.v1beta1.QueryTotalBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_community_v1beta1_QueryTotalBalanceRequest(buffer_arg) {
  return kava_community_v1beta1_query_pb.QueryTotalBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_community_v1beta1_QueryTotalBalanceResponse(arg) {
  if (!(arg instanceof kava_community_v1beta1_query_pb.QueryTotalBalanceResponse)) {
    throw new Error('Expected argument of type kava.community.v1beta1.QueryTotalBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_community_v1beta1_QueryTotalBalanceResponse(buffer_arg) {
  return kava_community_v1beta1_query_pb.QueryTotalBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for x/community.
var QueryService = exports.QueryService = {
  // Balance queries the balance of all coins of x/community module.
balance: {
    path: '/kava.community.v1beta1.Query/Balance',
    requestStream: false,
    responseStream: false,
    requestType: kava_community_v1beta1_query_pb.QueryBalanceRequest,
    responseType: kava_community_v1beta1_query_pb.QueryBalanceResponse,
    requestSerialize: serialize_kava_community_v1beta1_QueryBalanceRequest,
    requestDeserialize: deserialize_kava_community_v1beta1_QueryBalanceRequest,
    responseSerialize: serialize_kava_community_v1beta1_QueryBalanceResponse,
    responseDeserialize: deserialize_kava_community_v1beta1_QueryBalanceResponse,
  },
  // TotalBalance queries the balance of all coins, including x/distribution,
// x/community, and supplied balances.
totalBalance: {
    path: '/kava.community.v1beta1.Query/TotalBalance',
    requestStream: false,
    responseStream: false,
    requestType: kava_community_v1beta1_query_pb.QueryTotalBalanceRequest,
    responseType: kava_community_v1beta1_query_pb.QueryTotalBalanceResponse,
    requestSerialize: serialize_kava_community_v1beta1_QueryTotalBalanceRequest,
    requestDeserialize: deserialize_kava_community_v1beta1_QueryTotalBalanceRequest,
    responseSerialize: serialize_kava_community_v1beta1_QueryTotalBalanceResponse,
    responseDeserialize: deserialize_kava_community_v1beta1_QueryTotalBalanceResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
