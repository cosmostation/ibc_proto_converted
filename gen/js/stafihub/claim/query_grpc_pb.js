// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_claim_query_pb = require('../../stafihub/claim/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var stafihub_claim_params_pb = require('../../stafihub/claim/params_pb.js');

function serialize_stafihub_stafihub_claim_QueryClaimSwitchRequest(arg) {
  if (!(arg instanceof stafihub_claim_query_pb.QueryClaimSwitchRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.QueryClaimSwitchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_QueryClaimSwitchRequest(buffer_arg) {
  return stafihub_claim_query_pb.QueryClaimSwitchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_QueryClaimSwitchResponse(arg) {
  if (!(arg instanceof stafihub_claim_query_pb.QueryClaimSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.QueryClaimSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_QueryClaimSwitchResponse(buffer_arg) {
  return stafihub_claim_query_pb.QueryClaimSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_QueryIsClaimedRequest(arg) {
  if (!(arg instanceof stafihub_claim_query_pb.QueryIsClaimedRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.QueryIsClaimedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_QueryIsClaimedRequest(buffer_arg) {
  return stafihub_claim_query_pb.QueryIsClaimedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_QueryIsClaimedResponse(arg) {
  if (!(arg instanceof stafihub_claim_query_pb.QueryIsClaimedResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.QueryIsClaimedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_QueryIsClaimedResponse(buffer_arg) {
  return stafihub_claim_query_pb.QueryIsClaimedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_QueryParamsRequest(arg) {
  if (!(arg instanceof stafihub_claim_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_QueryParamsRequest(buffer_arg) {
  return stafihub_claim_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_claim_QueryParamsResponse(arg) {
  if (!(arg instanceof stafihub_claim_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.claim.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_claim_QueryParamsResponse(buffer_arg) {
  return stafihub_claim_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stafihub.stafihub.claim.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_claim_query_pb.QueryParamsRequest,
    responseType: stafihub_claim_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stafihub_stafihub_claim_QueryParamsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_claim_QueryParamsRequest,
    responseSerialize: serialize_stafihub_stafihub_claim_QueryParamsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_claim_QueryParamsResponse,
  },
  // Queries a list of IsClaimed items.
isClaimed: {
    path: '/stafihub.stafihub.claim.Query/IsClaimed',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_claim_query_pb.QueryIsClaimedRequest,
    responseType: stafihub_claim_query_pb.QueryIsClaimedResponse,
    requestSerialize: serialize_stafihub_stafihub_claim_QueryIsClaimedRequest,
    requestDeserialize: deserialize_stafihub_stafihub_claim_QueryIsClaimedRequest,
    responseSerialize: serialize_stafihub_stafihub_claim_QueryIsClaimedResponse,
    responseDeserialize: deserialize_stafihub_stafihub_claim_QueryIsClaimedResponse,
  },
  // Queries a list of ClaimSwitch items.
claimSwitch: {
    path: '/stafihub.stafihub.claim.Query/ClaimSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_claim_query_pb.QueryClaimSwitchRequest,
    responseType: stafihub_claim_query_pb.QueryClaimSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_claim_QueryClaimSwitchRequest,
    requestDeserialize: deserialize_stafihub_stafihub_claim_QueryClaimSwitchRequest,
    responseSerialize: serialize_stafihub_stafihub_claim_QueryClaimSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_claim_QueryClaimSwitchResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
