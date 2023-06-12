// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_claim_query_pb = require('../../stride/claim/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var stride_claim_claim_pb = require('../../stride/claim/claim_pb.js');
var stride_claim_params_pb = require('../../stride/claim/params_pb.js');
var stride_vesting_vesting_pb = require('../../stride/vesting/vesting_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_stride_claim_QueryClaimMetadataRequest(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryClaimMetadataRequest)) {
    throw new Error('Expected argument of type stride.claim.QueryClaimMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryClaimMetadataRequest(buffer_arg) {
  return stride_claim_query_pb.QueryClaimMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryClaimMetadataResponse(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryClaimMetadataResponse)) {
    throw new Error('Expected argument of type stride.claim.QueryClaimMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryClaimMetadataResponse(buffer_arg) {
  return stride_claim_query_pb.QueryClaimMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryClaimRecordRequest(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryClaimRecordRequest)) {
    throw new Error('Expected argument of type stride.claim.QueryClaimRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryClaimRecordRequest(buffer_arg) {
  return stride_claim_query_pb.QueryClaimRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryClaimRecordResponse(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryClaimRecordResponse)) {
    throw new Error('Expected argument of type stride.claim.QueryClaimRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryClaimRecordResponse(buffer_arg) {
  return stride_claim_query_pb.QueryClaimRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryClaimStatusRequest(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryClaimStatusRequest)) {
    throw new Error('Expected argument of type stride.claim.QueryClaimStatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryClaimStatusRequest(buffer_arg) {
  return stride_claim_query_pb.QueryClaimStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryClaimStatusResponse(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryClaimStatusResponse)) {
    throw new Error('Expected argument of type stride.claim.QueryClaimStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryClaimStatusResponse(buffer_arg) {
  return stride_claim_query_pb.QueryClaimStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryClaimableForActionRequest(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryClaimableForActionRequest)) {
    throw new Error('Expected argument of type stride.claim.QueryClaimableForActionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryClaimableForActionRequest(buffer_arg) {
  return stride_claim_query_pb.QueryClaimableForActionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryClaimableForActionResponse(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryClaimableForActionResponse)) {
    throw new Error('Expected argument of type stride.claim.QueryClaimableForActionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryClaimableForActionResponse(buffer_arg) {
  return stride_claim_query_pb.QueryClaimableForActionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryDistributorAccountBalanceRequest(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryDistributorAccountBalanceRequest)) {
    throw new Error('Expected argument of type stride.claim.QueryDistributorAccountBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryDistributorAccountBalanceRequest(buffer_arg) {
  return stride_claim_query_pb.QueryDistributorAccountBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryDistributorAccountBalanceResponse(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryDistributorAccountBalanceResponse)) {
    throw new Error('Expected argument of type stride.claim.QueryDistributorAccountBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryDistributorAccountBalanceResponse(buffer_arg) {
  return stride_claim_query_pb.QueryDistributorAccountBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryParamsRequest(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stride.claim.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryParamsRequest(buffer_arg) {
  return stride_claim_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryParamsResponse(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stride.claim.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryParamsResponse(buffer_arg) {
  return stride_claim_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryTotalClaimableRequest(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryTotalClaimableRequest)) {
    throw new Error('Expected argument of type stride.claim.QueryTotalClaimableRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryTotalClaimableRequest(buffer_arg) {
  return stride_claim_query_pb.QueryTotalClaimableRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryTotalClaimableResponse(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryTotalClaimableResponse)) {
    throw new Error('Expected argument of type stride.claim.QueryTotalClaimableResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryTotalClaimableResponse(buffer_arg) {
  return stride_claim_query_pb.QueryTotalClaimableResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryUserVestingsRequest(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryUserVestingsRequest)) {
    throw new Error('Expected argument of type stride.claim.QueryUserVestingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryUserVestingsRequest(buffer_arg) {
  return stride_claim_query_pb.QueryUserVestingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_claim_QueryUserVestingsResponse(arg) {
  if (!(arg instanceof stride_claim_query_pb.QueryUserVestingsResponse)) {
    throw new Error('Expected argument of type stride.claim.QueryUserVestingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_claim_QueryUserVestingsResponse(buffer_arg) {
  return stride_claim_query_pb.QueryUserVestingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  distributorAccountBalance: {
    path: '/stride.claim.Query/DistributorAccountBalance',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_query_pb.QueryDistributorAccountBalanceRequest,
    responseType: stride_claim_query_pb.QueryDistributorAccountBalanceResponse,
    requestSerialize: serialize_stride_claim_QueryDistributorAccountBalanceRequest,
    requestDeserialize: deserialize_stride_claim_QueryDistributorAccountBalanceRequest,
    responseSerialize: serialize_stride_claim_QueryDistributorAccountBalanceResponse,
    responseDeserialize: deserialize_stride_claim_QueryDistributorAccountBalanceResponse,
  },
  params: {
    path: '/stride.claim.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_query_pb.QueryParamsRequest,
    responseType: stride_claim_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stride_claim_QueryParamsRequest,
    requestDeserialize: deserialize_stride_claim_QueryParamsRequest,
    responseSerialize: serialize_stride_claim_QueryParamsResponse,
    responseDeserialize: deserialize_stride_claim_QueryParamsResponse,
  },
  claimRecord: {
    path: '/stride.claim.Query/ClaimRecord',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_query_pb.QueryClaimRecordRequest,
    responseType: stride_claim_query_pb.QueryClaimRecordResponse,
    requestSerialize: serialize_stride_claim_QueryClaimRecordRequest,
    requestDeserialize: deserialize_stride_claim_QueryClaimRecordRequest,
    responseSerialize: serialize_stride_claim_QueryClaimRecordResponse,
    responseDeserialize: deserialize_stride_claim_QueryClaimRecordResponse,
  },
  claimableForAction: {
    path: '/stride.claim.Query/ClaimableForAction',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_query_pb.QueryClaimableForActionRequest,
    responseType: stride_claim_query_pb.QueryClaimableForActionResponse,
    requestSerialize: serialize_stride_claim_QueryClaimableForActionRequest,
    requestDeserialize: deserialize_stride_claim_QueryClaimableForActionRequest,
    responseSerialize: serialize_stride_claim_QueryClaimableForActionResponse,
    responseDeserialize: deserialize_stride_claim_QueryClaimableForActionResponse,
  },
  totalClaimable: {
    path: '/stride.claim.Query/TotalClaimable',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_query_pb.QueryTotalClaimableRequest,
    responseType: stride_claim_query_pb.QueryTotalClaimableResponse,
    requestSerialize: serialize_stride_claim_QueryTotalClaimableRequest,
    requestDeserialize: deserialize_stride_claim_QueryTotalClaimableRequest,
    responseSerialize: serialize_stride_claim_QueryTotalClaimableResponse,
    responseDeserialize: deserialize_stride_claim_QueryTotalClaimableResponse,
  },
  userVestings: {
    path: '/stride.claim.Query/UserVestings',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_query_pb.QueryUserVestingsRequest,
    responseType: stride_claim_query_pb.QueryUserVestingsResponse,
    requestSerialize: serialize_stride_claim_QueryUserVestingsRequest,
    requestDeserialize: deserialize_stride_claim_QueryUserVestingsRequest,
    responseSerialize: serialize_stride_claim_QueryUserVestingsResponse,
    responseDeserialize: deserialize_stride_claim_QueryUserVestingsResponse,
  },
  claimStatus: {
    path: '/stride.claim.Query/ClaimStatus',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_query_pb.QueryClaimStatusRequest,
    responseType: stride_claim_query_pb.QueryClaimStatusResponse,
    requestSerialize: serialize_stride_claim_QueryClaimStatusRequest,
    requestDeserialize: deserialize_stride_claim_QueryClaimStatusRequest,
    responseSerialize: serialize_stride_claim_QueryClaimStatusResponse,
    responseDeserialize: deserialize_stride_claim_QueryClaimStatusResponse,
  },
  claimMetadata: {
    path: '/stride.claim.Query/ClaimMetadata',
    requestStream: false,
    responseStream: false,
    requestType: stride_claim_query_pb.QueryClaimMetadataRequest,
    responseType: stride_claim_query_pb.QueryClaimMetadataResponse,
    requestSerialize: serialize_stride_claim_QueryClaimMetadataRequest,
    requestDeserialize: deserialize_stride_claim_QueryClaimMetadataRequest,
    responseSerialize: serialize_stride_claim_QueryClaimMetadataResponse,
    responseDeserialize: deserialize_stride_claim_QueryClaimMetadataResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
