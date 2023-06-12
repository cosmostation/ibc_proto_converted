// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_kavadist_v1beta1_query_pb = require('../../../kava/kavadist/v1beta1/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kava_kavadist_v1beta1_params_pb = require('../../../kava/kavadist/v1beta1/params_pb.js');

function serialize_kava_kavadist_v1beta1_QueryBalanceRequest(arg) {
  if (!(arg instanceof kava_kavadist_v1beta1_query_pb.QueryBalanceRequest)) {
    throw new Error('Expected argument of type kava.kavadist.v1beta1.QueryBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_kavadist_v1beta1_QueryBalanceRequest(buffer_arg) {
  return kava_kavadist_v1beta1_query_pb.QueryBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_kavadist_v1beta1_QueryBalanceResponse(arg) {
  if (!(arg instanceof kava_kavadist_v1beta1_query_pb.QueryBalanceResponse)) {
    throw new Error('Expected argument of type kava.kavadist.v1beta1.QueryBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_kavadist_v1beta1_QueryBalanceResponse(buffer_arg) {
  return kava_kavadist_v1beta1_query_pb.QueryBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_kavadist_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof kava_kavadist_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type kava.kavadist.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_kavadist_v1beta1_QueryParamsRequest(buffer_arg) {
  return kava_kavadist_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_kavadist_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof kava_kavadist_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type kava.kavadist.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_kavadist_v1beta1_QueryParamsResponse(buffer_arg) {
  return kava_kavadist_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params queries the parameters of x/kavadist module.
params: {
    path: '/kava.kavadist.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: kava_kavadist_v1beta1_query_pb.QueryParamsRequest,
    responseType: kava_kavadist_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_kava_kavadist_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_kava_kavadist_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_kava_kavadist_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_kava_kavadist_v1beta1_QueryParamsResponse,
  },
  // Balance queries the balance of all coins of x/kavadist module.
balance: {
    path: '/kava.kavadist.v1beta1.Query/Balance',
    requestStream: false,
    responseStream: false,
    requestType: kava_kavadist_v1beta1_query_pb.QueryBalanceRequest,
    responseType: kava_kavadist_v1beta1_query_pb.QueryBalanceResponse,
    requestSerialize: serialize_kava_kavadist_v1beta1_QueryBalanceRequest,
    requestDeserialize: deserialize_kava_kavadist_v1beta1_QueryBalanceRequest,
    responseSerialize: serialize_kava_kavadist_v1beta1_QueryBalanceResponse,
    responseDeserialize: deserialize_kava_kavadist_v1beta1_QueryBalanceResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
