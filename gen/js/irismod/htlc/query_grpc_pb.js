// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_htlc_query_pb = require('../../irismod/htlc/query_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var irismod_htlc_htlc_pb = require('../../irismod/htlc/htlc_pb.js');

function serialize_irismod_htlc_QueryAssetSuppliesRequest(arg) {
  if (!(arg instanceof irismod_htlc_query_pb.QueryAssetSuppliesRequest)) {
    throw new Error('Expected argument of type irismod.htlc.QueryAssetSuppliesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_QueryAssetSuppliesRequest(buffer_arg) {
  return irismod_htlc_query_pb.QueryAssetSuppliesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_htlc_QueryAssetSuppliesResponse(arg) {
  if (!(arg instanceof irismod_htlc_query_pb.QueryAssetSuppliesResponse)) {
    throw new Error('Expected argument of type irismod.htlc.QueryAssetSuppliesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_QueryAssetSuppliesResponse(buffer_arg) {
  return irismod_htlc_query_pb.QueryAssetSuppliesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_htlc_QueryAssetSupplyRequest(arg) {
  if (!(arg instanceof irismod_htlc_query_pb.QueryAssetSupplyRequest)) {
    throw new Error('Expected argument of type irismod.htlc.QueryAssetSupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_QueryAssetSupplyRequest(buffer_arg) {
  return irismod_htlc_query_pb.QueryAssetSupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_htlc_QueryAssetSupplyResponse(arg) {
  if (!(arg instanceof irismod_htlc_query_pb.QueryAssetSupplyResponse)) {
    throw new Error('Expected argument of type irismod.htlc.QueryAssetSupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_QueryAssetSupplyResponse(buffer_arg) {
  return irismod_htlc_query_pb.QueryAssetSupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_htlc_QueryHTLCRequest(arg) {
  if (!(arg instanceof irismod_htlc_query_pb.QueryHTLCRequest)) {
    throw new Error('Expected argument of type irismod.htlc.QueryHTLCRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_QueryHTLCRequest(buffer_arg) {
  return irismod_htlc_query_pb.QueryHTLCRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_htlc_QueryHTLCResponse(arg) {
  if (!(arg instanceof irismod_htlc_query_pb.QueryHTLCResponse)) {
    throw new Error('Expected argument of type irismod.htlc.QueryHTLCResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_QueryHTLCResponse(buffer_arg) {
  return irismod_htlc_query_pb.QueryHTLCResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_htlc_QueryParamsRequest(arg) {
  if (!(arg instanceof irismod_htlc_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type irismod.htlc.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_QueryParamsRequest(buffer_arg) {
  return irismod_htlc_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_htlc_QueryParamsResponse(arg) {
  if (!(arg instanceof irismod_htlc_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type irismod.htlc.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_htlc_QueryParamsResponse(buffer_arg) {
  return irismod_htlc_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service
var QueryService = exports.QueryService = {
  // HTLC queries the HTLC by the specified hash lock
hTLC: {
    path: '/irismod.htlc.Query/HTLC',
    requestStream: false,
    responseStream: false,
    requestType: irismod_htlc_query_pb.QueryHTLCRequest,
    responseType: irismod_htlc_query_pb.QueryHTLCResponse,
    requestSerialize: serialize_irismod_htlc_QueryHTLCRequest,
    requestDeserialize: deserialize_irismod_htlc_QueryHTLCRequest,
    responseSerialize: serialize_irismod_htlc_QueryHTLCResponse,
    responseDeserialize: deserialize_irismod_htlc_QueryHTLCResponse,
  },
  // AssetSupply queries the supply of an asset
assetSupply: {
    path: '/irismod.htlc.Query/AssetSupply',
    requestStream: false,
    responseStream: false,
    requestType: irismod_htlc_query_pb.QueryAssetSupplyRequest,
    responseType: irismod_htlc_query_pb.QueryAssetSupplyResponse,
    requestSerialize: serialize_irismod_htlc_QueryAssetSupplyRequest,
    requestDeserialize: deserialize_irismod_htlc_QueryAssetSupplyRequest,
    responseSerialize: serialize_irismod_htlc_QueryAssetSupplyResponse,
    responseDeserialize: deserialize_irismod_htlc_QueryAssetSupplyResponse,
  },
  // AssetSupplies queries the supplies of all assets
assetSupplies: {
    path: '/irismod.htlc.Query/AssetSupplies',
    requestStream: false,
    responseStream: false,
    requestType: irismod_htlc_query_pb.QueryAssetSuppliesRequest,
    responseType: irismod_htlc_query_pb.QueryAssetSuppliesResponse,
    requestSerialize: serialize_irismod_htlc_QueryAssetSuppliesRequest,
    requestDeserialize: deserialize_irismod_htlc_QueryAssetSuppliesRequest,
    responseSerialize: serialize_irismod_htlc_QueryAssetSuppliesResponse,
    responseDeserialize: deserialize_irismod_htlc_QueryAssetSuppliesResponse,
  },
  // Params queries the htlc parameters
params: {
    path: '/irismod.htlc.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: irismod_htlc_query_pb.QueryParamsRequest,
    responseType: irismod_htlc_query_pb.QueryParamsResponse,
    requestSerialize: serialize_irismod_htlc_QueryParamsRequest,
    requestDeserialize: deserialize_irismod_htlc_QueryParamsRequest,
    responseSerialize: serialize_irismod_htlc_QueryParamsResponse,
    responseDeserialize: deserialize_irismod_htlc_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
