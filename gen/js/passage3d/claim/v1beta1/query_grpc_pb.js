// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var passage3d_claim_v1beta1_query_pb = require('../../../passage3d/claim/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var passage3d_claim_v1beta1_params_pb = require('../../../passage3d/claim/v1beta1/params_pb.js');
var passage3d_claim_v1beta1_claim_record_pb = require('../../../passage3d/claim/v1beta1/claim_record_pb.js');

function serialize_passage3d_claim_v1beta1_QueryClaimRecordRequest(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_query_pb.QueryClaimRecordRequest)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.QueryClaimRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_QueryClaimRecordRequest(buffer_arg) {
  return passage3d_claim_v1beta1_query_pb.QueryClaimRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_passage3d_claim_v1beta1_QueryClaimRecordResponse(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_query_pb.QueryClaimRecordResponse)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.QueryClaimRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_QueryClaimRecordResponse(buffer_arg) {
  return passage3d_claim_v1beta1_query_pb.QueryClaimRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_passage3d_claim_v1beta1_QueryClaimableForActionRequest(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_query_pb.QueryClaimableForActionRequest)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.QueryClaimableForActionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_QueryClaimableForActionRequest(buffer_arg) {
  return passage3d_claim_v1beta1_query_pb.QueryClaimableForActionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_passage3d_claim_v1beta1_QueryClaimableForActionResponse(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_query_pb.QueryClaimableForActionResponse)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.QueryClaimableForActionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_QueryClaimableForActionResponse(buffer_arg) {
  return passage3d_claim_v1beta1_query_pb.QueryClaimableForActionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_passage3d_claim_v1beta1_QueryModuleAccountBalanceRequest(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_query_pb.QueryModuleAccountBalanceRequest)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.QueryModuleAccountBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_QueryModuleAccountBalanceRequest(buffer_arg) {
  return passage3d_claim_v1beta1_query_pb.QueryModuleAccountBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_passage3d_claim_v1beta1_QueryModuleAccountBalanceResponse(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_query_pb.QueryModuleAccountBalanceResponse)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.QueryModuleAccountBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_QueryModuleAccountBalanceResponse(buffer_arg) {
  return passage3d_claim_v1beta1_query_pb.QueryModuleAccountBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_passage3d_claim_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_QueryParamsRequest(buffer_arg) {
  return passage3d_claim_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_passage3d_claim_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_QueryParamsResponse(buffer_arg) {
  return passage3d_claim_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_passage3d_claim_v1beta1_QueryTotalClaimableRequest(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_query_pb.QueryTotalClaimableRequest)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.QueryTotalClaimableRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_QueryTotalClaimableRequest(buffer_arg) {
  return passage3d_claim_v1beta1_query_pb.QueryTotalClaimableRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_passage3d_claim_v1beta1_QueryTotalClaimableResponse(arg) {
  if (!(arg instanceof passage3d_claim_v1beta1_query_pb.QueryTotalClaimableResponse)) {
    throw new Error('Expected argument of type passage3d.claim.v1beta1.QueryTotalClaimableResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_passage3d_claim_v1beta1_QueryTotalClaimableResponse(buffer_arg) {
  return passage3d_claim_v1beta1_query_pb.QueryTotalClaimableResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // ModuleAccountBalance RPC returns the claim module account balance
moduleAccountBalance: {
    path: '/passage3d.claim.v1beta1.Query/ModuleAccountBalance',
    requestStream: false,
    responseStream: false,
    requestType: passage3d_claim_v1beta1_query_pb.QueryModuleAccountBalanceRequest,
    responseType: passage3d_claim_v1beta1_query_pb.QueryModuleAccountBalanceResponse,
    requestSerialize: serialize_passage3d_claim_v1beta1_QueryModuleAccountBalanceRequest,
    requestDeserialize: deserialize_passage3d_claim_v1beta1_QueryModuleAccountBalanceRequest,
    responseSerialize: serialize_passage3d_claim_v1beta1_QueryModuleAccountBalanceResponse,
    responseDeserialize: deserialize_passage3d_claim_v1beta1_QueryModuleAccountBalanceResponse,
  },
  // Params RPC returns claim module params
params: {
    path: '/passage3d.claim.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: passage3d_claim_v1beta1_query_pb.QueryParamsRequest,
    responseType: passage3d_claim_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_passage3d_claim_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_passage3d_claim_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_passage3d_claim_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_passage3d_claim_v1beta1_QueryParamsResponse,
  },
  // ClaimRecord RPC returns claim record for an address
claimRecord: {
    path: '/passage3d.claim.v1beta1.Query/ClaimRecord',
    requestStream: false,
    responseStream: false,
    requestType: passage3d_claim_v1beta1_query_pb.QueryClaimRecordRequest,
    responseType: passage3d_claim_v1beta1_query_pb.QueryClaimRecordResponse,
    requestSerialize: serialize_passage3d_claim_v1beta1_QueryClaimRecordRequest,
    requestDeserialize: deserialize_passage3d_claim_v1beta1_QueryClaimRecordRequest,
    responseSerialize: serialize_passage3d_claim_v1beta1_QueryClaimRecordResponse,
    responseDeserialize: deserialize_passage3d_claim_v1beta1_QueryClaimRecordResponse,
  },
  // ClaimableForAction RPC returns claimable amount for an action of an address
claimableForAction: {
    path: '/passage3d.claim.v1beta1.Query/ClaimableForAction',
    requestStream: false,
    responseStream: false,
    requestType: passage3d_claim_v1beta1_query_pb.QueryClaimableForActionRequest,
    responseType: passage3d_claim_v1beta1_query_pb.QueryClaimableForActionResponse,
    requestSerialize: serialize_passage3d_claim_v1beta1_QueryClaimableForActionRequest,
    requestDeserialize: deserialize_passage3d_claim_v1beta1_QueryClaimableForActionRequest,
    responseSerialize: serialize_passage3d_claim_v1beta1_QueryClaimableForActionResponse,
    responseDeserialize: deserialize_passage3d_claim_v1beta1_QueryClaimableForActionResponse,
  },
  // TotalClaimable RPC returns total claimable amount for address
totalClaimable: {
    path: '/passage3d.claim.v1beta1.Query/TotalClaimable',
    requestStream: false,
    responseStream: false,
    requestType: passage3d_claim_v1beta1_query_pb.QueryTotalClaimableRequest,
    responseType: passage3d_claim_v1beta1_query_pb.QueryTotalClaimableResponse,
    requestSerialize: serialize_passage3d_claim_v1beta1_QueryTotalClaimableRequest,
    requestDeserialize: deserialize_passage3d_claim_v1beta1_QueryTotalClaimableRequest,
    responseSerialize: serialize_passage3d_claim_v1beta1_QueryTotalClaimableResponse,
    responseDeserialize: deserialize_passage3d_claim_v1beta1_QueryTotalClaimableResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
