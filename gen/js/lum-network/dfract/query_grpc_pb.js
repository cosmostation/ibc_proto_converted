// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var lum$network_dfract_query_pb = require('../../lum-network/dfract/query_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var lum$network_dfract_params_pb = require('../../lum-network/dfract/params_pb.js');
var lum$network_dfract_deposit_pb = require('../../lum-network/dfract/deposit_pb.js');

function serialize_lum_network_dfract_QueryFetchDepositsRequest(arg) {
  if (!(arg instanceof lum$network_dfract_query_pb.QueryFetchDepositsRequest)) {
    throw new Error('Expected argument of type lum.network.dfract.QueryFetchDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_dfract_QueryFetchDepositsRequest(buffer_arg) {
  return lum$network_dfract_query_pb.QueryFetchDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_dfract_QueryFetchDepositsResponse(arg) {
  if (!(arg instanceof lum$network_dfract_query_pb.QueryFetchDepositsResponse)) {
    throw new Error('Expected argument of type lum.network.dfract.QueryFetchDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_dfract_QueryFetchDepositsResponse(buffer_arg) {
  return lum$network_dfract_query_pb.QueryFetchDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_dfract_QueryGetDepositsForAddressRequest(arg) {
  if (!(arg instanceof lum$network_dfract_query_pb.QueryGetDepositsForAddressRequest)) {
    throw new Error('Expected argument of type lum.network.dfract.QueryGetDepositsForAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_dfract_QueryGetDepositsForAddressRequest(buffer_arg) {
  return lum$network_dfract_query_pb.QueryGetDepositsForAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_dfract_QueryGetDepositsForAddressResponse(arg) {
  if (!(arg instanceof lum$network_dfract_query_pb.QueryGetDepositsForAddressResponse)) {
    throw new Error('Expected argument of type lum.network.dfract.QueryGetDepositsForAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_dfract_QueryGetDepositsForAddressResponse(buffer_arg) {
  return lum$network_dfract_query_pb.QueryGetDepositsForAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_dfract_QueryModuleAccountBalanceRequest(arg) {
  if (!(arg instanceof lum$network_dfract_query_pb.QueryModuleAccountBalanceRequest)) {
    throw new Error('Expected argument of type lum.network.dfract.QueryModuleAccountBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_dfract_QueryModuleAccountBalanceRequest(buffer_arg) {
  return lum$network_dfract_query_pb.QueryModuleAccountBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_dfract_QueryModuleAccountBalanceResponse(arg) {
  if (!(arg instanceof lum$network_dfract_query_pb.QueryModuleAccountBalanceResponse)) {
    throw new Error('Expected argument of type lum.network.dfract.QueryModuleAccountBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_dfract_QueryModuleAccountBalanceResponse(buffer_arg) {
  return lum$network_dfract_query_pb.QueryModuleAccountBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_dfract_QueryParamsRequest(arg) {
  if (!(arg instanceof lum$network_dfract_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type lum.network.dfract.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_dfract_QueryParamsRequest(buffer_arg) {
  return lum$network_dfract_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_dfract_QueryParamsResponse(arg) {
  if (!(arg instanceof lum$network_dfract_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type lum.network.dfract.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_dfract_QueryParamsResponse(buffer_arg) {
  return lum$network_dfract_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  moduleAccountBalance: {
    path: '/lum.network.dfract.Query/ModuleAccountBalance',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_dfract_query_pb.QueryModuleAccountBalanceRequest,
    responseType: lum$network_dfract_query_pb.QueryModuleAccountBalanceResponse,
    requestSerialize: serialize_lum_network_dfract_QueryModuleAccountBalanceRequest,
    requestDeserialize: deserialize_lum_network_dfract_QueryModuleAccountBalanceRequest,
    responseSerialize: serialize_lum_network_dfract_QueryModuleAccountBalanceResponse,
    responseDeserialize: deserialize_lum_network_dfract_QueryModuleAccountBalanceResponse,
  },
  params: {
    path: '/lum.network.dfract.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_dfract_query_pb.QueryParamsRequest,
    responseType: lum$network_dfract_query_pb.QueryParamsResponse,
    requestSerialize: serialize_lum_network_dfract_QueryParamsRequest,
    requestDeserialize: deserialize_lum_network_dfract_QueryParamsRequest,
    responseSerialize: serialize_lum_network_dfract_QueryParamsResponse,
    responseDeserialize: deserialize_lum_network_dfract_QueryParamsResponse,
  },
  getDepositsForAddress: {
    path: '/lum.network.dfract.Query/GetDepositsForAddress',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_dfract_query_pb.QueryGetDepositsForAddressRequest,
    responseType: lum$network_dfract_query_pb.QueryGetDepositsForAddressResponse,
    requestSerialize: serialize_lum_network_dfract_QueryGetDepositsForAddressRequest,
    requestDeserialize: deserialize_lum_network_dfract_QueryGetDepositsForAddressRequest,
    responseSerialize: serialize_lum_network_dfract_QueryGetDepositsForAddressResponse,
    responseDeserialize: deserialize_lum_network_dfract_QueryGetDepositsForAddressResponse,
  },
  fetchDeposits: {
    path: '/lum.network.dfract.Query/FetchDeposits',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_dfract_query_pb.QueryFetchDepositsRequest,
    responseType: lum$network_dfract_query_pb.QueryFetchDepositsResponse,
    requestSerialize: serialize_lum_network_dfract_QueryFetchDepositsRequest,
    requestDeserialize: deserialize_lum_network_dfract_QueryFetchDepositsRequest,
    responseSerialize: serialize_lum_network_dfract_QueryFetchDepositsResponse,
    responseDeserialize: deserialize_lum_network_dfract_QueryFetchDepositsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
