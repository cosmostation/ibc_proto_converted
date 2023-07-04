// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var archway_rewards_v1_query_pb = require('../../../archway/rewards/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var archway_rewards_v1_rewards_pb = require('../../../archway/rewards/v1/rewards_pb.js');

function serialize_archway_rewards_v1_QueryBlockRewardsTrackingRequest(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryBlockRewardsTrackingRequest)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryBlockRewardsTrackingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryBlockRewardsTrackingRequest(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryBlockRewardsTrackingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryBlockRewardsTrackingResponse(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryBlockRewardsTrackingResponse)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryBlockRewardsTrackingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryBlockRewardsTrackingResponse(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryBlockRewardsTrackingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryContractMetadataRequest(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryContractMetadataRequest)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryContractMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryContractMetadataRequest(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryContractMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryContractMetadataResponse(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryContractMetadataResponse)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryContractMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryContractMetadataResponse(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryContractMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryEstimateTxFeesRequest(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryEstimateTxFeesRequest)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryEstimateTxFeesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryEstimateTxFeesRequest(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryEstimateTxFeesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryEstimateTxFeesResponse(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryEstimateTxFeesResponse)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryEstimateTxFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryEstimateTxFeesResponse(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryEstimateTxFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryFlatFeeRequest(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryFlatFeeRequest)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryFlatFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryFlatFeeRequest(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryFlatFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryFlatFeeResponse(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryFlatFeeResponse)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryFlatFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryFlatFeeResponse(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryFlatFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryOutstandingRewardsRequest(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryOutstandingRewardsRequest)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryOutstandingRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryOutstandingRewardsRequest(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryOutstandingRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryOutstandingRewardsResponse(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryOutstandingRewardsResponse)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryOutstandingRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryOutstandingRewardsResponse(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryOutstandingRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryParamsRequest(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryParamsResponse(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryRewardsPoolRequest(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryRewardsPoolRequest)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryRewardsPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryRewardsPoolRequest(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryRewardsPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryRewardsPoolResponse(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryRewardsPoolResponse)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryRewardsPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryRewardsPoolResponse(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryRewardsPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryRewardsRecordsRequest(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryRewardsRecordsRequest)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryRewardsRecordsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryRewardsRecordsRequest(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryRewardsRecordsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_archway_rewards_v1_QueryRewardsRecordsResponse(arg) {
  if (!(arg instanceof archway_rewards_v1_query_pb.QueryRewardsRecordsResponse)) {
    throw new Error('Expected argument of type archway.rewards.v1.QueryRewardsRecordsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_archway_rewards_v1_QueryRewardsRecordsResponse(buffer_arg) {
  return archway_rewards_v1_query_pb.QueryRewardsRecordsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query service for the tracking module.
var QueryService = exports.QueryService = {
  // Params returns module parameters.
params: {
    path: '/archway.rewards.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: archway_rewards_v1_query_pb.QueryParamsRequest,
    responseType: archway_rewards_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_archway_rewards_v1_QueryParamsRequest,
    requestDeserialize: deserialize_archway_rewards_v1_QueryParamsRequest,
    responseSerialize: serialize_archway_rewards_v1_QueryParamsResponse,
    responseDeserialize: deserialize_archway_rewards_v1_QueryParamsResponse,
  },
  // ContractMetadata returns the contract rewards parameters (metadata).
contractMetadata: {
    path: '/archway.rewards.v1.Query/ContractMetadata',
    requestStream: false,
    responseStream: false,
    requestType: archway_rewards_v1_query_pb.QueryContractMetadataRequest,
    responseType: archway_rewards_v1_query_pb.QueryContractMetadataResponse,
    requestSerialize: serialize_archway_rewards_v1_QueryContractMetadataRequest,
    requestDeserialize: deserialize_archway_rewards_v1_QueryContractMetadataRequest,
    responseSerialize: serialize_archway_rewards_v1_QueryContractMetadataResponse,
    responseDeserialize: deserialize_archway_rewards_v1_QueryContractMetadataResponse,
  },
  // BlockRewardsTracking returns block rewards tracking for the current block.
blockRewardsTracking: {
    path: '/archway.rewards.v1.Query/BlockRewardsTracking',
    requestStream: false,
    responseStream: false,
    requestType: archway_rewards_v1_query_pb.QueryBlockRewardsTrackingRequest,
    responseType: archway_rewards_v1_query_pb.QueryBlockRewardsTrackingResponse,
    requestSerialize: serialize_archway_rewards_v1_QueryBlockRewardsTrackingRequest,
    requestDeserialize: deserialize_archway_rewards_v1_QueryBlockRewardsTrackingRequest,
    responseSerialize: serialize_archway_rewards_v1_QueryBlockRewardsTrackingResponse,
    responseDeserialize: deserialize_archway_rewards_v1_QueryBlockRewardsTrackingResponse,
  },
  // RewardsPool returns the current undistributed rewards pool funds.
rewardsPool: {
    path: '/archway.rewards.v1.Query/RewardsPool',
    requestStream: false,
    responseStream: false,
    requestType: archway_rewards_v1_query_pb.QueryRewardsPoolRequest,
    responseType: archway_rewards_v1_query_pb.QueryRewardsPoolResponse,
    requestSerialize: serialize_archway_rewards_v1_QueryRewardsPoolRequest,
    requestDeserialize: deserialize_archway_rewards_v1_QueryRewardsPoolRequest,
    responseSerialize: serialize_archway_rewards_v1_QueryRewardsPoolResponse,
    responseDeserialize: deserialize_archway_rewards_v1_QueryRewardsPoolResponse,
  },
  // EstimateTxFees returns the estimated transaction fees for the given
// transaction gas limit using the minimum consensus fee value for the current
// block.
estimateTxFees: {
    path: '/archway.rewards.v1.Query/EstimateTxFees',
    requestStream: false,
    responseStream: false,
    requestType: archway_rewards_v1_query_pb.QueryEstimateTxFeesRequest,
    responseType: archway_rewards_v1_query_pb.QueryEstimateTxFeesResponse,
    requestSerialize: serialize_archway_rewards_v1_QueryEstimateTxFeesRequest,
    requestDeserialize: deserialize_archway_rewards_v1_QueryEstimateTxFeesRequest,
    responseSerialize: serialize_archway_rewards_v1_QueryEstimateTxFeesResponse,
    responseDeserialize: deserialize_archway_rewards_v1_QueryEstimateTxFeesResponse,
  },
  // RewardsRecords returns the paginated list of RewardsRecord objects stored
// for the provided rewards_address.
rewardsRecords: {
    path: '/archway.rewards.v1.Query/RewardsRecords',
    requestStream: false,
    responseStream: false,
    requestType: archway_rewards_v1_query_pb.QueryRewardsRecordsRequest,
    responseType: archway_rewards_v1_query_pb.QueryRewardsRecordsResponse,
    requestSerialize: serialize_archway_rewards_v1_QueryRewardsRecordsRequest,
    requestDeserialize: deserialize_archway_rewards_v1_QueryRewardsRecordsRequest,
    responseSerialize: serialize_archway_rewards_v1_QueryRewardsRecordsResponse,
    responseDeserialize: deserialize_archway_rewards_v1_QueryRewardsRecordsResponse,
  },
  // OutstandingRewards returns total rewards credited from different contracts
// for the provided rewards_address.
outstandingRewards: {
    path: '/archway.rewards.v1.Query/OutstandingRewards',
    requestStream: false,
    responseStream: false,
    requestType: archway_rewards_v1_query_pb.QueryOutstandingRewardsRequest,
    responseType: archway_rewards_v1_query_pb.QueryOutstandingRewardsResponse,
    requestSerialize: serialize_archway_rewards_v1_QueryOutstandingRewardsRequest,
    requestDeserialize: deserialize_archway_rewards_v1_QueryOutstandingRewardsRequest,
    responseSerialize: serialize_archway_rewards_v1_QueryOutstandingRewardsResponse,
    responseDeserialize: deserialize_archway_rewards_v1_QueryOutstandingRewardsResponse,
  },
  // FlatFee returns the flat fee set by the contract owner for the provided
// contract_address
flatFee: {
    path: '/archway.rewards.v1.Query/FlatFee',
    requestStream: false,
    responseStream: false,
    requestType: archway_rewards_v1_query_pb.QueryFlatFeeRequest,
    responseType: archway_rewards_v1_query_pb.QueryFlatFeeResponse,
    requestSerialize: serialize_archway_rewards_v1_QueryFlatFeeRequest,
    requestDeserialize: deserialize_archway_rewards_v1_QueryFlatFeeRequest,
    responseSerialize: serialize_archway_rewards_v1_QueryFlatFeeResponse,
    responseDeserialize: deserialize_archway_rewards_v1_QueryFlatFeeResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
