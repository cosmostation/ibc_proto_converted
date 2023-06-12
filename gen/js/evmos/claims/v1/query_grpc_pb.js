// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var evmos_claims_v1_query_pb = require('../../../evmos/claims/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var evmos_claims_v1_claims_pb = require('../../../evmos/claims/v1/claims_pb.js');
var evmos_claims_v1_genesis_pb = require('../../../evmos/claims/v1/genesis_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_evmos_claims_v1_QueryClaimsRecordRequest(arg) {
  if (!(arg instanceof evmos_claims_v1_query_pb.QueryClaimsRecordRequest)) {
    throw new Error('Expected argument of type evmos.claims.v1.QueryClaimsRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_claims_v1_QueryClaimsRecordRequest(buffer_arg) {
  return evmos_claims_v1_query_pb.QueryClaimsRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_claims_v1_QueryClaimsRecordResponse(arg) {
  if (!(arg instanceof evmos_claims_v1_query_pb.QueryClaimsRecordResponse)) {
    throw new Error('Expected argument of type evmos.claims.v1.QueryClaimsRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_claims_v1_QueryClaimsRecordResponse(buffer_arg) {
  return evmos_claims_v1_query_pb.QueryClaimsRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_claims_v1_QueryClaimsRecordsRequest(arg) {
  if (!(arg instanceof evmos_claims_v1_query_pb.QueryClaimsRecordsRequest)) {
    throw new Error('Expected argument of type evmos.claims.v1.QueryClaimsRecordsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_claims_v1_QueryClaimsRecordsRequest(buffer_arg) {
  return evmos_claims_v1_query_pb.QueryClaimsRecordsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_claims_v1_QueryClaimsRecordsResponse(arg) {
  if (!(arg instanceof evmos_claims_v1_query_pb.QueryClaimsRecordsResponse)) {
    throw new Error('Expected argument of type evmos.claims.v1.QueryClaimsRecordsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_claims_v1_QueryClaimsRecordsResponse(buffer_arg) {
  return evmos_claims_v1_query_pb.QueryClaimsRecordsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_claims_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof evmos_claims_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type evmos.claims.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_claims_v1_QueryParamsRequest(buffer_arg) {
  return evmos_claims_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_claims_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof evmos_claims_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type evmos.claims.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_claims_v1_QueryParamsResponse(buffer_arg) {
  return evmos_claims_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_claims_v1_QueryTotalUnclaimedRequest(arg) {
  if (!(arg instanceof evmos_claims_v1_query_pb.QueryTotalUnclaimedRequest)) {
    throw new Error('Expected argument of type evmos.claims.v1.QueryTotalUnclaimedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_claims_v1_QueryTotalUnclaimedRequest(buffer_arg) {
  return evmos_claims_v1_query_pb.QueryTotalUnclaimedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_claims_v1_QueryTotalUnclaimedResponse(arg) {
  if (!(arg instanceof evmos_claims_v1_query_pb.QueryTotalUnclaimedResponse)) {
    throw new Error('Expected argument of type evmos.claims.v1.QueryTotalUnclaimedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_claims_v1_QueryTotalUnclaimedResponse(buffer_arg) {
  return evmos_claims_v1_query_pb.QueryTotalUnclaimedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // TotalUnclaimed queries the total unclaimed tokens from the airdrop
totalUnclaimed: {
    path: '/evmos.claims.v1.Query/TotalUnclaimed',
    requestStream: false,
    responseStream: false,
    requestType: evmos_claims_v1_query_pb.QueryTotalUnclaimedRequest,
    responseType: evmos_claims_v1_query_pb.QueryTotalUnclaimedResponse,
    requestSerialize: serialize_evmos_claims_v1_QueryTotalUnclaimedRequest,
    requestDeserialize: deserialize_evmos_claims_v1_QueryTotalUnclaimedRequest,
    responseSerialize: serialize_evmos_claims_v1_QueryTotalUnclaimedResponse,
    responseDeserialize: deserialize_evmos_claims_v1_QueryTotalUnclaimedResponse,
  },
  // Params returns the claims module parameters
params: {
    path: '/evmos.claims.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: evmos_claims_v1_query_pb.QueryParamsRequest,
    responseType: evmos_claims_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_evmos_claims_v1_QueryParamsRequest,
    requestDeserialize: deserialize_evmos_claims_v1_QueryParamsRequest,
    responseSerialize: serialize_evmos_claims_v1_QueryParamsResponse,
    responseDeserialize: deserialize_evmos_claims_v1_QueryParamsResponse,
  },
  // ClaimsRecords returns all claims records
claimsRecords: {
    path: '/evmos.claims.v1.Query/ClaimsRecords',
    requestStream: false,
    responseStream: false,
    requestType: evmos_claims_v1_query_pb.QueryClaimsRecordsRequest,
    responseType: evmos_claims_v1_query_pb.QueryClaimsRecordsResponse,
    requestSerialize: serialize_evmos_claims_v1_QueryClaimsRecordsRequest,
    requestDeserialize: deserialize_evmos_claims_v1_QueryClaimsRecordsRequest,
    responseSerialize: serialize_evmos_claims_v1_QueryClaimsRecordsResponse,
    responseDeserialize: deserialize_evmos_claims_v1_QueryClaimsRecordsResponse,
  },
  // ClaimsRecord returns the claims record for a given address
claimsRecord: {
    path: '/evmos.claims.v1.Query/ClaimsRecord',
    requestStream: false,
    responseStream: false,
    requestType: evmos_claims_v1_query_pb.QueryClaimsRecordRequest,
    responseType: evmos_claims_v1_query_pb.QueryClaimsRecordResponse,
    requestSerialize: serialize_evmos_claims_v1_QueryClaimsRecordRequest,
    requestDeserialize: deserialize_evmos_claims_v1_QueryClaimsRecordRequest,
    responseSerialize: serialize_evmos_claims_v1_QueryClaimsRecordResponse,
    responseDeserialize: deserialize_evmos_claims_v1_QueryClaimsRecordResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
