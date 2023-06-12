// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_claim_v1beta1_query_pb = require('../../../crescent/claim/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var crescent_claim_v1beta1_claim_pb = require('../../../crescent/claim/v1beta1/claim_pb.js');

function serialize_crescent_claim_v1beta1_QueryAirdropRequest(arg) {
  if (!(arg instanceof crescent_claim_v1beta1_query_pb.QueryAirdropRequest)) {
    throw new Error('Expected argument of type crescent.claim.v1beta1.QueryAirdropRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_claim_v1beta1_QueryAirdropRequest(buffer_arg) {
  return crescent_claim_v1beta1_query_pb.QueryAirdropRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_claim_v1beta1_QueryAirdropResponse(arg) {
  if (!(arg instanceof crescent_claim_v1beta1_query_pb.QueryAirdropResponse)) {
    throw new Error('Expected argument of type crescent.claim.v1beta1.QueryAirdropResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_claim_v1beta1_QueryAirdropResponse(buffer_arg) {
  return crescent_claim_v1beta1_query_pb.QueryAirdropResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_claim_v1beta1_QueryAirdropsRequest(arg) {
  if (!(arg instanceof crescent_claim_v1beta1_query_pb.QueryAirdropsRequest)) {
    throw new Error('Expected argument of type crescent.claim.v1beta1.QueryAirdropsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_claim_v1beta1_QueryAirdropsRequest(buffer_arg) {
  return crescent_claim_v1beta1_query_pb.QueryAirdropsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_claim_v1beta1_QueryAirdropsResponse(arg) {
  if (!(arg instanceof crescent_claim_v1beta1_query_pb.QueryAirdropsResponse)) {
    throw new Error('Expected argument of type crescent.claim.v1beta1.QueryAirdropsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_claim_v1beta1_QueryAirdropsResponse(buffer_arg) {
  return crescent_claim_v1beta1_query_pb.QueryAirdropsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_claim_v1beta1_QueryClaimRecordRequest(arg) {
  if (!(arg instanceof crescent_claim_v1beta1_query_pb.QueryClaimRecordRequest)) {
    throw new Error('Expected argument of type crescent.claim.v1beta1.QueryClaimRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_claim_v1beta1_QueryClaimRecordRequest(buffer_arg) {
  return crescent_claim_v1beta1_query_pb.QueryClaimRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_claim_v1beta1_QueryClaimRecordResponse(arg) {
  if (!(arg instanceof crescent_claim_v1beta1_query_pb.QueryClaimRecordResponse)) {
    throw new Error('Expected argument of type crescent.claim.v1beta1.QueryClaimRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_claim_v1beta1_QueryClaimRecordResponse(buffer_arg) {
  return crescent_claim_v1beta1_query_pb.QueryClaimRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Airdrops returns all airdrops.
airdrops: {
    path: '/crescent.claim.v1beta1.Query/Airdrops',
    requestStream: false,
    responseStream: false,
    requestType: crescent_claim_v1beta1_query_pb.QueryAirdropsRequest,
    responseType: crescent_claim_v1beta1_query_pb.QueryAirdropsResponse,
    requestSerialize: serialize_crescent_claim_v1beta1_QueryAirdropsRequest,
    requestDeserialize: deserialize_crescent_claim_v1beta1_QueryAirdropsRequest,
    responseSerialize: serialize_crescent_claim_v1beta1_QueryAirdropsResponse,
    responseDeserialize: deserialize_crescent_claim_v1beta1_QueryAirdropsResponse,
  },
  // Airdrop returns the specific airdrop.
airdrop: {
    path: '/crescent.claim.v1beta1.Query/Airdrop',
    requestStream: false,
    responseStream: false,
    requestType: crescent_claim_v1beta1_query_pb.QueryAirdropRequest,
    responseType: crescent_claim_v1beta1_query_pb.QueryAirdropResponse,
    requestSerialize: serialize_crescent_claim_v1beta1_QueryAirdropRequest,
    requestDeserialize: deserialize_crescent_claim_v1beta1_QueryAirdropRequest,
    responseSerialize: serialize_crescent_claim_v1beta1_QueryAirdropResponse,
    responseDeserialize: deserialize_crescent_claim_v1beta1_QueryAirdropResponse,
  },
  // ClaimRecord returns the claim record for the recipient address.
claimRecord: {
    path: '/crescent.claim.v1beta1.Query/ClaimRecord',
    requestStream: false,
    responseStream: false,
    requestType: crescent_claim_v1beta1_query_pb.QueryClaimRecordRequest,
    responseType: crescent_claim_v1beta1_query_pb.QueryClaimRecordResponse,
    requestSerialize: serialize_crescent_claim_v1beta1_QueryClaimRecordRequest,
    requestDeserialize: deserialize_crescent_claim_v1beta1_QueryClaimRecordRequest,
    responseSerialize: serialize_crescent_claim_v1beta1_QueryClaimRecordResponse,
    responseDeserialize: deserialize_crescent_claim_v1beta1_QueryClaimRecordResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
