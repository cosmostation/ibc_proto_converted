// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rdex_query_pb = require('../../stafihub/rdex/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var stafihub_rdex_params_pb = require('../../stafihub/rdex/params_pb.js');
var stafihub_rdex_models_pb = require('../../stafihub/rdex/models_pb.js');

function serialize_stafihub_stafihub_rdex_QueryParamsRequest(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QueryParamsRequest(buffer_arg) {
  return stafihub_rdex_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_QueryParamsResponse(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QueryParamsResponse(buffer_arg) {
  return stafihub_rdex_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_QueryPoolCreatorListRequest(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QueryPoolCreatorListRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QueryPoolCreatorListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QueryPoolCreatorListRequest(buffer_arg) {
  return stafihub_rdex_query_pb.QueryPoolCreatorListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_QueryPoolCreatorListResponse(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QueryPoolCreatorListResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QueryPoolCreatorListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QueryPoolCreatorListResponse(buffer_arg) {
  return stafihub_rdex_query_pb.QueryPoolCreatorListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_QueryProviderListRequest(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QueryProviderListRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QueryProviderListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QueryProviderListRequest(buffer_arg) {
  return stafihub_rdex_query_pb.QueryProviderListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_QueryProviderListResponse(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QueryProviderListResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QueryProviderListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QueryProviderListResponse(buffer_arg) {
  return stafihub_rdex_query_pb.QueryProviderListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_QueryProviderSwitchRequest(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QueryProviderSwitchRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QueryProviderSwitchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QueryProviderSwitchRequest(buffer_arg) {
  return stafihub_rdex_query_pb.QueryProviderSwitchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_QueryProviderSwitchResponse(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QueryProviderSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QueryProviderSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QueryProviderSwitchResponse(buffer_arg) {
  return stafihub_rdex_query_pb.QueryProviderSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_QuerySwapPoolInfoRequest(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QuerySwapPoolInfoRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QuerySwapPoolInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QuerySwapPoolInfoRequest(buffer_arg) {
  return stafihub_rdex_query_pb.QuerySwapPoolInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_QuerySwapPoolInfoResponse(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QuerySwapPoolInfoResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QuerySwapPoolInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QuerySwapPoolInfoResponse(buffer_arg) {
  return stafihub_rdex_query_pb.QuerySwapPoolInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_QuerySwapPoolListRequest(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QuerySwapPoolListRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QuerySwapPoolListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QuerySwapPoolListRequest(buffer_arg) {
  return stafihub_rdex_query_pb.QuerySwapPoolListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rdex_QuerySwapPoolListResponse(arg) {
  if (!(arg instanceof stafihub_rdex_query_pb.QuerySwapPoolListResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rdex.QuerySwapPoolListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rdex_QuerySwapPoolListResponse(buffer_arg) {
  return stafihub_rdex_query_pb.QuerySwapPoolListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stafihub.stafihub.rdex.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_query_pb.QueryParamsRequest,
    responseType: stafihub_rdex_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_QueryParamsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_QueryParamsRequest,
    responseSerialize: serialize_stafihub_stafihub_rdex_QueryParamsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_QueryParamsResponse,
  },
  // Queries a list of SwapPoolInfo items.
swapPoolInfo: {
    path: '/stafihub.stafihub.rdex.Query/SwapPoolInfo',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_query_pb.QuerySwapPoolInfoRequest,
    responseType: stafihub_rdex_query_pb.QuerySwapPoolInfoResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_QuerySwapPoolInfoRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_QuerySwapPoolInfoRequest,
    responseSerialize: serialize_stafihub_stafihub_rdex_QuerySwapPoolInfoResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_QuerySwapPoolInfoResponse,
  },
  // Queries a list of SwapPoolList items.
swapPoolList: {
    path: '/stafihub.stafihub.rdex.Query/SwapPoolList',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_query_pb.QuerySwapPoolListRequest,
    responseType: stafihub_rdex_query_pb.QuerySwapPoolListResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_QuerySwapPoolListRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_QuerySwapPoolListRequest,
    responseSerialize: serialize_stafihub_stafihub_rdex_QuerySwapPoolListResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_QuerySwapPoolListResponse,
  },
  // Queries a list of ProviderList items.
providerList: {
    path: '/stafihub.stafihub.rdex.Query/ProviderList',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_query_pb.QueryProviderListRequest,
    responseType: stafihub_rdex_query_pb.QueryProviderListResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_QueryProviderListRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_QueryProviderListRequest,
    responseSerialize: serialize_stafihub_stafihub_rdex_QueryProviderListResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_QueryProviderListResponse,
  },
  // Queries a list of PoolCreatorList items.
poolCreatorList: {
    path: '/stafihub.stafihub.rdex.Query/PoolCreatorList',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_query_pb.QueryPoolCreatorListRequest,
    responseType: stafihub_rdex_query_pb.QueryPoolCreatorListResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_QueryPoolCreatorListRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_QueryPoolCreatorListRequest,
    responseSerialize: serialize_stafihub_stafihub_rdex_QueryPoolCreatorListResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_QueryPoolCreatorListResponse,
  },
  // Queries a list of ProviderSwitch items.
providerSwitch: {
    path: '/stafihub.stafihub.rdex.Query/ProviderSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rdex_query_pb.QueryProviderSwitchRequest,
    responseType: stafihub_rdex_query_pb.QueryProviderSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_rdex_QueryProviderSwitchRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rdex_QueryProviderSwitchRequest,
    responseSerialize: serialize_stafihub_stafihub_rdex_QueryProviderSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rdex_QueryProviderSwitchResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
