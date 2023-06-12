// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_farm_query_pb = require('../../irismod/farm/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var irismod_farm_farm_pb = require('../../irismod/farm/farm_pb.js');

function serialize_irismod_farm_QueryFarmPoolRequest(arg) {
  if (!(arg instanceof irismod_farm_query_pb.QueryFarmPoolRequest)) {
    throw new Error('Expected argument of type irismod.farm.QueryFarmPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_QueryFarmPoolRequest(buffer_arg) {
  return irismod_farm_query_pb.QueryFarmPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_QueryFarmPoolResponse(arg) {
  if (!(arg instanceof irismod_farm_query_pb.QueryFarmPoolResponse)) {
    throw new Error('Expected argument of type irismod.farm.QueryFarmPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_QueryFarmPoolResponse(buffer_arg) {
  return irismod_farm_query_pb.QueryFarmPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_QueryFarmPoolsRequest(arg) {
  if (!(arg instanceof irismod_farm_query_pb.QueryFarmPoolsRequest)) {
    throw new Error('Expected argument of type irismod.farm.QueryFarmPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_QueryFarmPoolsRequest(buffer_arg) {
  return irismod_farm_query_pb.QueryFarmPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_QueryFarmPoolsResponse(arg) {
  if (!(arg instanceof irismod_farm_query_pb.QueryFarmPoolsResponse)) {
    throw new Error('Expected argument of type irismod.farm.QueryFarmPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_QueryFarmPoolsResponse(buffer_arg) {
  return irismod_farm_query_pb.QueryFarmPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_QueryFarmerRequest(arg) {
  if (!(arg instanceof irismod_farm_query_pb.QueryFarmerRequest)) {
    throw new Error('Expected argument of type irismod.farm.QueryFarmerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_QueryFarmerRequest(buffer_arg) {
  return irismod_farm_query_pb.QueryFarmerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_QueryFarmerResponse(arg) {
  if (!(arg instanceof irismod_farm_query_pb.QueryFarmerResponse)) {
    throw new Error('Expected argument of type irismod.farm.QueryFarmerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_QueryFarmerResponse(buffer_arg) {
  return irismod_farm_query_pb.QueryFarmerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_QueryParamsRequest(arg) {
  if (!(arg instanceof irismod_farm_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type irismod.farm.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_QueryParamsRequest(buffer_arg) {
  return irismod_farm_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_farm_QueryParamsResponse(arg) {
  if (!(arg instanceof irismod_farm_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type irismod.farm.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_farm_QueryParamsResponse(buffer_arg) {
  return irismod_farm_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  farmPools: {
    path: '/irismod.farm.Query/FarmPools',
    requestStream: false,
    responseStream: false,
    requestType: irismod_farm_query_pb.QueryFarmPoolsRequest,
    responseType: irismod_farm_query_pb.QueryFarmPoolsResponse,
    requestSerialize: serialize_irismod_farm_QueryFarmPoolsRequest,
    requestDeserialize: deserialize_irismod_farm_QueryFarmPoolsRequest,
    responseSerialize: serialize_irismod_farm_QueryFarmPoolsResponse,
    responseDeserialize: deserialize_irismod_farm_QueryFarmPoolsResponse,
  },
  farmPool: {
    path: '/irismod.farm.Query/FarmPool',
    requestStream: false,
    responseStream: false,
    requestType: irismod_farm_query_pb.QueryFarmPoolRequest,
    responseType: irismod_farm_query_pb.QueryFarmPoolResponse,
    requestSerialize: serialize_irismod_farm_QueryFarmPoolRequest,
    requestDeserialize: deserialize_irismod_farm_QueryFarmPoolRequest,
    responseSerialize: serialize_irismod_farm_QueryFarmPoolResponse,
    responseDeserialize: deserialize_irismod_farm_QueryFarmPoolResponse,
  },
  farmer: {
    path: '/irismod.farm.Query/Farmer',
    requestStream: false,
    responseStream: false,
    requestType: irismod_farm_query_pb.QueryFarmerRequest,
    responseType: irismod_farm_query_pb.QueryFarmerResponse,
    requestSerialize: serialize_irismod_farm_QueryFarmerRequest,
    requestDeserialize: deserialize_irismod_farm_QueryFarmerRequest,
    responseSerialize: serialize_irismod_farm_QueryFarmerResponse,
    responseDeserialize: deserialize_irismod_farm_QueryFarmerResponse,
  },
  // Params queries the htlc parameters
params: {
    path: '/irismod.farm.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: irismod_farm_query_pb.QueryParamsRequest,
    responseType: irismod_farm_query_pb.QueryParamsResponse,
    requestSerialize: serialize_irismod_farm_QueryParamsRequest,
    requestDeserialize: deserialize_irismod_farm_QueryParamsRequest,
    responseSerialize: serialize_irismod_farm_QueryParamsResponse,
    responseDeserialize: deserialize_irismod_farm_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
