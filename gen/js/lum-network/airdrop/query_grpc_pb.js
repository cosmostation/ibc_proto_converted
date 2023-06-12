// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var lum$network_airdrop_query_pb = require('../../lum-network/airdrop/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var lum$network_airdrop_claim_pb = require('../../lum-network/airdrop/claim_pb.js');
var lum$network_airdrop_params_pb = require('../../lum-network/airdrop/params_pb.js');

function serialize_lum_network_airdrop_QueryClaimRecordRequest(arg) {
  if (!(arg instanceof lum$network_airdrop_query_pb.QueryClaimRecordRequest)) {
    throw new Error('Expected argument of type lum.network.airdrop.QueryClaimRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_airdrop_QueryClaimRecordRequest(buffer_arg) {
  return lum$network_airdrop_query_pb.QueryClaimRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_airdrop_QueryClaimRecordResponse(arg) {
  if (!(arg instanceof lum$network_airdrop_query_pb.QueryClaimRecordResponse)) {
    throw new Error('Expected argument of type lum.network.airdrop.QueryClaimRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_airdrop_QueryClaimRecordResponse(buffer_arg) {
  return lum$network_airdrop_query_pb.QueryClaimRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_airdrop_QueryClaimableForActionRequest(arg) {
  if (!(arg instanceof lum$network_airdrop_query_pb.QueryClaimableForActionRequest)) {
    throw new Error('Expected argument of type lum.network.airdrop.QueryClaimableForActionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_airdrop_QueryClaimableForActionRequest(buffer_arg) {
  return lum$network_airdrop_query_pb.QueryClaimableForActionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_airdrop_QueryClaimableForActionResponse(arg) {
  if (!(arg instanceof lum$network_airdrop_query_pb.QueryClaimableForActionResponse)) {
    throw new Error('Expected argument of type lum.network.airdrop.QueryClaimableForActionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_airdrop_QueryClaimableForActionResponse(buffer_arg) {
  return lum$network_airdrop_query_pb.QueryClaimableForActionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_airdrop_QueryModuleAccountBalanceRequest(arg) {
  if (!(arg instanceof lum$network_airdrop_query_pb.QueryModuleAccountBalanceRequest)) {
    throw new Error('Expected argument of type lum.network.airdrop.QueryModuleAccountBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_airdrop_QueryModuleAccountBalanceRequest(buffer_arg) {
  return lum$network_airdrop_query_pb.QueryModuleAccountBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_airdrop_QueryModuleAccountBalanceResponse(arg) {
  if (!(arg instanceof lum$network_airdrop_query_pb.QueryModuleAccountBalanceResponse)) {
    throw new Error('Expected argument of type lum.network.airdrop.QueryModuleAccountBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_airdrop_QueryModuleAccountBalanceResponse(buffer_arg) {
  return lum$network_airdrop_query_pb.QueryModuleAccountBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_airdrop_QueryParamsRequest(arg) {
  if (!(arg instanceof lum$network_airdrop_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type lum.network.airdrop.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_airdrop_QueryParamsRequest(buffer_arg) {
  return lum$network_airdrop_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_airdrop_QueryParamsResponse(arg) {
  if (!(arg instanceof lum$network_airdrop_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type lum.network.airdrop.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_airdrop_QueryParamsResponse(buffer_arg) {
  return lum$network_airdrop_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_airdrop_QueryTotalClaimableRequest(arg) {
  if (!(arg instanceof lum$network_airdrop_query_pb.QueryTotalClaimableRequest)) {
    throw new Error('Expected argument of type lum.network.airdrop.QueryTotalClaimableRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_airdrop_QueryTotalClaimableRequest(buffer_arg) {
  return lum$network_airdrop_query_pb.QueryTotalClaimableRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_airdrop_QueryTotalClaimableResponse(arg) {
  if (!(arg instanceof lum$network_airdrop_query_pb.QueryTotalClaimableResponse)) {
    throw new Error('Expected argument of type lum.network.airdrop.QueryTotalClaimableResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_airdrop_QueryTotalClaimableResponse(buffer_arg) {
  return lum$network_airdrop_query_pb.QueryTotalClaimableResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  moduleAccountBalance: {
    path: '/lum.network.airdrop.Query/ModuleAccountBalance',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_airdrop_query_pb.QueryModuleAccountBalanceRequest,
    responseType: lum$network_airdrop_query_pb.QueryModuleAccountBalanceResponse,
    requestSerialize: serialize_lum_network_airdrop_QueryModuleAccountBalanceRequest,
    requestDeserialize: deserialize_lum_network_airdrop_QueryModuleAccountBalanceRequest,
    responseSerialize: serialize_lum_network_airdrop_QueryModuleAccountBalanceResponse,
    responseDeserialize: deserialize_lum_network_airdrop_QueryModuleAccountBalanceResponse,
  },
  params: {
    path: '/lum.network.airdrop.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_airdrop_query_pb.QueryParamsRequest,
    responseType: lum$network_airdrop_query_pb.QueryParamsResponse,
    requestSerialize: serialize_lum_network_airdrop_QueryParamsRequest,
    requestDeserialize: deserialize_lum_network_airdrop_QueryParamsRequest,
    responseSerialize: serialize_lum_network_airdrop_QueryParamsResponse,
    responseDeserialize: deserialize_lum_network_airdrop_QueryParamsResponse,
  },
  claimRecord: {
    path: '/lum.network.airdrop.Query/ClaimRecord',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_airdrop_query_pb.QueryClaimRecordRequest,
    responseType: lum$network_airdrop_query_pb.QueryClaimRecordResponse,
    requestSerialize: serialize_lum_network_airdrop_QueryClaimRecordRequest,
    requestDeserialize: deserialize_lum_network_airdrop_QueryClaimRecordRequest,
    responseSerialize: serialize_lum_network_airdrop_QueryClaimRecordResponse,
    responseDeserialize: deserialize_lum_network_airdrop_QueryClaimRecordResponse,
  },
  claimableForAction: {
    path: '/lum.network.airdrop.Query/ClaimableForAction',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_airdrop_query_pb.QueryClaimableForActionRequest,
    responseType: lum$network_airdrop_query_pb.QueryClaimableForActionResponse,
    requestSerialize: serialize_lum_network_airdrop_QueryClaimableForActionRequest,
    requestDeserialize: deserialize_lum_network_airdrop_QueryClaimableForActionRequest,
    responseSerialize: serialize_lum_network_airdrop_QueryClaimableForActionResponse,
    responseDeserialize: deserialize_lum_network_airdrop_QueryClaimableForActionResponse,
  },
  totalClaimable: {
    path: '/lum.network.airdrop.Query/TotalClaimable',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_airdrop_query_pb.QueryTotalClaimableRequest,
    responseType: lum$network_airdrop_query_pb.QueryTotalClaimableResponse,
    requestSerialize: serialize_lum_network_airdrop_QueryTotalClaimableRequest,
    requestDeserialize: deserialize_lum_network_airdrop_QueryTotalClaimableRequest,
    responseSerialize: serialize_lum_network_airdrop_QueryTotalClaimableResponse,
    responseDeserialize: deserialize_lum_network_airdrop_QueryTotalClaimableResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
