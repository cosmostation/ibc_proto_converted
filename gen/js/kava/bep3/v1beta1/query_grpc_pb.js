// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_bep3_v1beta1_query_pb = require('../../../kava/bep3/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var kava_bep3_v1beta1_bep3_pb = require('../../../kava/bep3/v1beta1/bep3_pb.js');

function serialize_kava_bep3_v1beta1_QueryAssetSuppliesRequest(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_query_pb.QueryAssetSuppliesRequest)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.QueryAssetSuppliesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_QueryAssetSuppliesRequest(buffer_arg) {
  return kava_bep3_v1beta1_query_pb.QueryAssetSuppliesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_QueryAssetSuppliesResponse(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_query_pb.QueryAssetSuppliesResponse)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.QueryAssetSuppliesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_QueryAssetSuppliesResponse(buffer_arg) {
  return kava_bep3_v1beta1_query_pb.QueryAssetSuppliesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_QueryAssetSupplyRequest(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_query_pb.QueryAssetSupplyRequest)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.QueryAssetSupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_QueryAssetSupplyRequest(buffer_arg) {
  return kava_bep3_v1beta1_query_pb.QueryAssetSupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_QueryAssetSupplyResponse(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_query_pb.QueryAssetSupplyResponse)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.QueryAssetSupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_QueryAssetSupplyResponse(buffer_arg) {
  return kava_bep3_v1beta1_query_pb.QueryAssetSupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_QueryAtomicSwapRequest(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_query_pb.QueryAtomicSwapRequest)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.QueryAtomicSwapRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_QueryAtomicSwapRequest(buffer_arg) {
  return kava_bep3_v1beta1_query_pb.QueryAtomicSwapRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_QueryAtomicSwapResponse(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_query_pb.QueryAtomicSwapResponse)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.QueryAtomicSwapResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_QueryAtomicSwapResponse(buffer_arg) {
  return kava_bep3_v1beta1_query_pb.QueryAtomicSwapResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_QueryAtomicSwapsRequest(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_query_pb.QueryAtomicSwapsRequest)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.QueryAtomicSwapsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_QueryAtomicSwapsRequest(buffer_arg) {
  return kava_bep3_v1beta1_query_pb.QueryAtomicSwapsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_QueryAtomicSwapsResponse(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_query_pb.QueryAtomicSwapsResponse)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.QueryAtomicSwapsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_QueryAtomicSwapsResponse(buffer_arg) {
  return kava_bep3_v1beta1_query_pb.QueryAtomicSwapsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_QueryParamsRequest(buffer_arg) {
  return kava_bep3_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_bep3_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof kava_bep3_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type kava.bep3.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_bep3_v1beta1_QueryParamsResponse(buffer_arg) {
  return kava_bep3_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for bep3 module
var QueryService = exports.QueryService = {
  // Params queries module params
params: {
    path: '/kava.bep3.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: kava_bep3_v1beta1_query_pb.QueryParamsRequest,
    responseType: kava_bep3_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_kava_bep3_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_kava_bep3_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_kava_bep3_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_kava_bep3_v1beta1_QueryParamsResponse,
  },
  // AssetSupply queries info about an asset's supply
assetSupply: {
    path: '/kava.bep3.v1beta1.Query/AssetSupply',
    requestStream: false,
    responseStream: false,
    requestType: kava_bep3_v1beta1_query_pb.QueryAssetSupplyRequest,
    responseType: kava_bep3_v1beta1_query_pb.QueryAssetSupplyResponse,
    requestSerialize: serialize_kava_bep3_v1beta1_QueryAssetSupplyRequest,
    requestDeserialize: deserialize_kava_bep3_v1beta1_QueryAssetSupplyRequest,
    responseSerialize: serialize_kava_bep3_v1beta1_QueryAssetSupplyResponse,
    responseDeserialize: deserialize_kava_bep3_v1beta1_QueryAssetSupplyResponse,
  },
  // AssetSupplies queries a list of asset supplies
assetSupplies: {
    path: '/kava.bep3.v1beta1.Query/AssetSupplies',
    requestStream: false,
    responseStream: false,
    requestType: kava_bep3_v1beta1_query_pb.QueryAssetSuppliesRequest,
    responseType: kava_bep3_v1beta1_query_pb.QueryAssetSuppliesResponse,
    requestSerialize: serialize_kava_bep3_v1beta1_QueryAssetSuppliesRequest,
    requestDeserialize: deserialize_kava_bep3_v1beta1_QueryAssetSuppliesRequest,
    responseSerialize: serialize_kava_bep3_v1beta1_QueryAssetSuppliesResponse,
    responseDeserialize: deserialize_kava_bep3_v1beta1_QueryAssetSuppliesResponse,
  },
  // AtomicSwap queries info about an atomic swap
atomicSwap: {
    path: '/kava.bep3.v1beta1.Query/AtomicSwap',
    requestStream: false,
    responseStream: false,
    requestType: kava_bep3_v1beta1_query_pb.QueryAtomicSwapRequest,
    responseType: kava_bep3_v1beta1_query_pb.QueryAtomicSwapResponse,
    requestSerialize: serialize_kava_bep3_v1beta1_QueryAtomicSwapRequest,
    requestDeserialize: deserialize_kava_bep3_v1beta1_QueryAtomicSwapRequest,
    responseSerialize: serialize_kava_bep3_v1beta1_QueryAtomicSwapResponse,
    responseDeserialize: deserialize_kava_bep3_v1beta1_QueryAtomicSwapResponse,
  },
  // AtomicSwaps queries a list of atomic swaps
atomicSwaps: {
    path: '/kava.bep3.v1beta1.Query/AtomicSwaps',
    requestStream: false,
    responseStream: false,
    requestType: kava_bep3_v1beta1_query_pb.QueryAtomicSwapsRequest,
    responseType: kava_bep3_v1beta1_query_pb.QueryAtomicSwapsResponse,
    requestSerialize: serialize_kava_bep3_v1beta1_QueryAtomicSwapsRequest,
    requestDeserialize: deserialize_kava_bep3_v1beta1_QueryAtomicSwapsRequest,
    responseSerialize: serialize_kava_bep3_v1beta1_QueryAtomicSwapsResponse,
    responseDeserialize: deserialize_kava_bep3_v1beta1_QueryAtomicSwapsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
