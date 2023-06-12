// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_collector_v1beta1_query_pb = require('../../../comdex/collector/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var comdex_collector_v1beta1_params_pb = require('../../../comdex/collector/v1beta1/params_pb.js');
var comdex_collector_v1beta1_collector_pb = require('../../../comdex/collector/v1beta1/collector_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_comdex_collector_v1beta1_QueryAuctionMappingForAppAndAssetRequest(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryAuctionMappingForAppAndAssetRequest)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryAuctionMappingForAppAndAssetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryAuctionMappingForAppAndAssetRequest(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryAuctionMappingForAppAndAssetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_collector_v1beta1_QueryAuctionMappingForAppAndAssetResponse(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryAuctionMappingForAppAndAssetResponse)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryAuctionMappingForAppAndAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryAuctionMappingForAppAndAssetResponse(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryAuctionMappingForAppAndAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_collector_v1beta1_QueryCollectorDataByAppAndAssetRequest(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryCollectorDataByAppAndAssetRequest)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryCollectorDataByAppAndAssetRequest(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryCollectorDataByAppAndAssetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_collector_v1beta1_QueryCollectorDataByAppAndAssetResponse(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryCollectorDataByAppAndAssetResponse)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryCollectorDataByAppAndAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryCollectorDataByAppAndAssetResponse(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryCollectorDataByAppAndAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_collector_v1beta1_QueryCollectorLookupByAppAndAssetRequest(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppAndAssetRequest)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryCollectorLookupByAppAndAssetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryCollectorLookupByAppAndAssetRequest(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppAndAssetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_collector_v1beta1_QueryCollectorLookupByAppAndAssetResponse(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppAndAssetResponse)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryCollectorLookupByAppAndAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryCollectorLookupByAppAndAssetResponse(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppAndAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_collector_v1beta1_QueryCollectorLookupByAppRequest(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppRequest)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryCollectorLookupByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryCollectorLookupByAppRequest(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_collector_v1beta1_QueryCollectorLookupByAppResponse(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppResponse)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryCollectorLookupByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryCollectorLookupByAppResponse(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_collector_v1beta1_QueryNetFeeCollectedForAppAndAssetRequest(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryNetFeeCollectedForAppAndAssetRequest)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryNetFeeCollectedForAppAndAssetRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryNetFeeCollectedForAppAndAssetRequest(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryNetFeeCollectedForAppAndAssetRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_collector_v1beta1_QueryNetFeeCollectedForAppAndAssetResponse(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryNetFeeCollectedForAppAndAssetResponse)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryNetFeeCollectedForAppAndAssetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryNetFeeCollectedForAppAndAssetResponse(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryNetFeeCollectedForAppAndAssetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_collector_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryParamsRequest(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_collector_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof comdex_collector_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type comdex.collector.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_collector_v1beta1_QueryParamsResponse(buffer_arg) {
  return comdex_collector_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/comdex.collector.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: comdex_collector_v1beta1_query_pb.QueryParamsRequest,
    responseType: comdex_collector_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_comdex_collector_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_comdex_collector_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_comdex_collector_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_comdex_collector_v1beta1_QueryParamsResponse,
  },
  queryCollectorLookupByApp: {
    path: '/comdex.collector.v1beta1.Query/QueryCollectorLookupByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppRequest,
    responseType: comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppResponse,
    requestSerialize: serialize_comdex_collector_v1beta1_QueryCollectorLookupByAppRequest,
    requestDeserialize: deserialize_comdex_collector_v1beta1_QueryCollectorLookupByAppRequest,
    responseSerialize: serialize_comdex_collector_v1beta1_QueryCollectorLookupByAppResponse,
    responseDeserialize: deserialize_comdex_collector_v1beta1_QueryCollectorLookupByAppResponse,
  },
  queryCollectorLookupByAppAndAsset: {
    path: '/comdex.collector.v1beta1.Query/QueryCollectorLookupByAppAndAsset',
    requestStream: false,
    responseStream: false,
    requestType: comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppAndAssetRequest,
    responseType: comdex_collector_v1beta1_query_pb.QueryCollectorLookupByAppAndAssetResponse,
    requestSerialize: serialize_comdex_collector_v1beta1_QueryCollectorLookupByAppAndAssetRequest,
    requestDeserialize: deserialize_comdex_collector_v1beta1_QueryCollectorLookupByAppAndAssetRequest,
    responseSerialize: serialize_comdex_collector_v1beta1_QueryCollectorLookupByAppAndAssetResponse,
    responseDeserialize: deserialize_comdex_collector_v1beta1_QueryCollectorLookupByAppAndAssetResponse,
  },
  queryCollectorDataByAppAndAsset: {
    path: '/comdex.collector.v1beta1.Query/QueryCollectorDataByAppAndAsset',
    requestStream: false,
    responseStream: false,
    requestType: comdex_collector_v1beta1_query_pb.QueryCollectorDataByAppAndAssetRequest,
    responseType: comdex_collector_v1beta1_query_pb.QueryCollectorDataByAppAndAssetResponse,
    requestSerialize: serialize_comdex_collector_v1beta1_QueryCollectorDataByAppAndAssetRequest,
    requestDeserialize: deserialize_comdex_collector_v1beta1_QueryCollectorDataByAppAndAssetRequest,
    responseSerialize: serialize_comdex_collector_v1beta1_QueryCollectorDataByAppAndAssetResponse,
    responseDeserialize: deserialize_comdex_collector_v1beta1_QueryCollectorDataByAppAndAssetResponse,
  },
  queryAuctionMappingForAppAndAsset: {
    path: '/comdex.collector.v1beta1.Query/QueryAuctionMappingForAppAndAsset',
    requestStream: false,
    responseStream: false,
    requestType: comdex_collector_v1beta1_query_pb.QueryAuctionMappingForAppAndAssetRequest,
    responseType: comdex_collector_v1beta1_query_pb.QueryAuctionMappingForAppAndAssetResponse,
    requestSerialize: serialize_comdex_collector_v1beta1_QueryAuctionMappingForAppAndAssetRequest,
    requestDeserialize: deserialize_comdex_collector_v1beta1_QueryAuctionMappingForAppAndAssetRequest,
    responseSerialize: serialize_comdex_collector_v1beta1_QueryAuctionMappingForAppAndAssetResponse,
    responseDeserialize: deserialize_comdex_collector_v1beta1_QueryAuctionMappingForAppAndAssetResponse,
  },
  queryNetFeeCollectedForAppAndAsset: {
    path: '/comdex.collector.v1beta1.Query/QueryNetFeeCollectedForAppAndAsset',
    requestStream: false,
    responseStream: false,
    requestType: comdex_collector_v1beta1_query_pb.QueryNetFeeCollectedForAppAndAssetRequest,
    responseType: comdex_collector_v1beta1_query_pb.QueryNetFeeCollectedForAppAndAssetResponse,
    requestSerialize: serialize_comdex_collector_v1beta1_QueryNetFeeCollectedForAppAndAssetRequest,
    requestDeserialize: deserialize_comdex_collector_v1beta1_QueryNetFeeCollectedForAppAndAssetRequest,
    responseSerialize: serialize_comdex_collector_v1beta1_QueryNetFeeCollectedForAppAndAssetResponse,
    responseDeserialize: deserialize_comdex_collector_v1beta1_QueryNetFeeCollectedForAppAndAssetResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
