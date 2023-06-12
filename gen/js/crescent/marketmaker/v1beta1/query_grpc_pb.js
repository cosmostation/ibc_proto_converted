// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_marketmaker_v1beta1_query_pb = require('../../../crescent/marketmaker/v1beta1/query_pb.js');
var crescent_marketmaker_v1beta1_marketmaker_pb = require('../../../crescent/marketmaker/v1beta1/marketmaker_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_crescent_marketmaker_v1beta1_QueryIncentiveRequest(arg) {
  if (!(arg instanceof crescent_marketmaker_v1beta1_query_pb.QueryIncentiveRequest)) {
    throw new Error('Expected argument of type crescent.marketmaker.v1beta1.QueryIncentiveRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marketmaker_v1beta1_QueryIncentiveRequest(buffer_arg) {
  return crescent_marketmaker_v1beta1_query_pb.QueryIncentiveRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_marketmaker_v1beta1_QueryIncentiveResponse(arg) {
  if (!(arg instanceof crescent_marketmaker_v1beta1_query_pb.QueryIncentiveResponse)) {
    throw new Error('Expected argument of type crescent.marketmaker.v1beta1.QueryIncentiveResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marketmaker_v1beta1_QueryIncentiveResponse(buffer_arg) {
  return crescent_marketmaker_v1beta1_query_pb.QueryIncentiveResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_marketmaker_v1beta1_QueryMarketMakersRequest(arg) {
  if (!(arg instanceof crescent_marketmaker_v1beta1_query_pb.QueryMarketMakersRequest)) {
    throw new Error('Expected argument of type crescent.marketmaker.v1beta1.QueryMarketMakersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marketmaker_v1beta1_QueryMarketMakersRequest(buffer_arg) {
  return crescent_marketmaker_v1beta1_query_pb.QueryMarketMakersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_marketmaker_v1beta1_QueryMarketMakersResponse(arg) {
  if (!(arg instanceof crescent_marketmaker_v1beta1_query_pb.QueryMarketMakersResponse)) {
    throw new Error('Expected argument of type crescent.marketmaker.v1beta1.QueryMarketMakersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marketmaker_v1beta1_QueryMarketMakersResponse(buffer_arg) {
  return crescent_marketmaker_v1beta1_query_pb.QueryMarketMakersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_marketmaker_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof crescent_marketmaker_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type crescent.marketmaker.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marketmaker_v1beta1_QueryParamsRequest(buffer_arg) {
  return crescent_marketmaker_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_marketmaker_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof crescent_marketmaker_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type crescent.marketmaker.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marketmaker_v1beta1_QueryParamsResponse(buffer_arg) {
  return crescent_marketmaker_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC query service for the marketmaker module.
var QueryService = exports.QueryService = {
  // Params returns parameters of the marketmaker module.
params: {
    path: '/crescent.marketmaker.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: crescent_marketmaker_v1beta1_query_pb.QueryParamsRequest,
    responseType: crescent_marketmaker_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_crescent_marketmaker_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_crescent_marketmaker_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_crescent_marketmaker_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_crescent_marketmaker_v1beta1_QueryParamsResponse,
  },
  // MarketMakers returns all market makers.
marketMakers: {
    path: '/crescent.marketmaker.v1beta1.Query/MarketMakers',
    requestStream: false,
    responseStream: false,
    requestType: crescent_marketmaker_v1beta1_query_pb.QueryMarketMakersRequest,
    responseType: crescent_marketmaker_v1beta1_query_pb.QueryMarketMakersResponse,
    requestSerialize: serialize_crescent_marketmaker_v1beta1_QueryMarketMakersRequest,
    requestDeserialize: deserialize_crescent_marketmaker_v1beta1_QueryMarketMakersRequest,
    responseSerialize: serialize_crescent_marketmaker_v1beta1_QueryMarketMakersResponse,
    responseDeserialize: deserialize_crescent_marketmaker_v1beta1_QueryMarketMakersResponse,
  },
  // Incentive returns a specific incentive.
incentive: {
    path: '/crescent.marketmaker.v1beta1.Query/Incentive',
    requestStream: false,
    responseStream: false,
    requestType: crescent_marketmaker_v1beta1_query_pb.QueryIncentiveRequest,
    responseType: crescent_marketmaker_v1beta1_query_pb.QueryIncentiveResponse,
    requestSerialize: serialize_crescent_marketmaker_v1beta1_QueryIncentiveRequest,
    requestDeserialize: deserialize_crescent_marketmaker_v1beta1_QueryIncentiveRequest,
    responseSerialize: serialize_crescent_marketmaker_v1beta1_QueryIncentiveResponse,
    responseDeserialize: deserialize_crescent_marketmaker_v1beta1_QueryIncentiveResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
