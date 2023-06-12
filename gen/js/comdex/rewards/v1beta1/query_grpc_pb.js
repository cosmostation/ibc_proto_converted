// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_rewards_v1beta1_query_pb = require('../../../comdex/rewards/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var comdex_rewards_v1beta1_params_pb = require('../../../comdex/rewards/v1beta1/params_pb.js');
var comdex_rewards_v1beta1_rewards_pb = require('../../../comdex/rewards/v1beta1/rewards_pb.js');
var comdex_rewards_v1beta1_gauge_pb = require('../../../comdex/rewards/v1beta1/gauge_pb.js');
var comdex_rewards_v1beta1_epochs_pb = require('../../../comdex/rewards/v1beta1/epochs_pb.js');

function serialize_comdex_rewards_v1beta1_QueryAllEpochsInfoRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryAllEpochsInfoRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryAllEpochsInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryAllEpochsInfoRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryAllEpochsInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryAllEpochsInfoResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryAllEpochsInfoResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryAllEpochsInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryAllEpochsInfoResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryAllEpochsInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryAllGaugesRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryAllGaugesRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryAllGaugesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryAllGaugesRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryAllGaugesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryAllGaugesResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryAllGaugesResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryAllGaugesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryAllGaugesResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryAllGaugesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryEpochInfoByDurationRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryEpochInfoByDurationRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryEpochInfoByDurationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryEpochInfoByDurationRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryEpochInfoByDurationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryEpochInfoByDurationResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryEpochInfoByDurationResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryEpochInfoByDurationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryEpochInfoByDurationResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryEpochInfoByDurationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryEpochTimeRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryEpochTimeRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryEpochTimeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryEpochTimeRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryEpochTimeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryEpochTimeResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryEpochTimeResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryEpochTimeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryEpochTimeResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryEpochTimeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryExtLendRewardsAPRRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryExtLendRewardsAPRRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryExtLendRewardsAPRRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryExtLendRewardsAPRRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryExtLendRewardsAPRRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryExtLendRewardsAPRResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryExtLendRewardsAPRResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryExtLendRewardsAPRResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryExtLendRewardsAPRResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryExtLendRewardsAPRResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryExternalRewardLendsRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryExternalRewardLendsRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryExternalRewardLendsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryExternalRewardLendsRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryExternalRewardLendsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryExternalRewardLendsResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryExternalRewardLendsResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryExternalRewardLendsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryExternalRewardLendsResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryExternalRewardLendsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryExternalRewardStableMintRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryExternalRewardStableMintRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryExternalRewardStableMintRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryExternalRewardStableMintRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryExternalRewardStableMintRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryExternalRewardStableMintResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryExternalRewardStableMintResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryExternalRewardStableMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryExternalRewardStableMintResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryExternalRewardStableMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryExternalRewardVaultsRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryExternalRewardVaultsRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryExternalRewardVaultsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryExternalRewardVaultsRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryExternalRewardVaultsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryExternalRewardVaultsResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryExternalRewardVaultsResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryExternalRewardVaultsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryExternalRewardVaultsResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryExternalRewardVaultsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryExternalRewardsLockersRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryExternalRewardsLockersRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryExternalRewardsLockersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryExternalRewardsLockersRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryExternalRewardsLockersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryExternalRewardsLockersResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryExternalRewardsLockersResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryExternalRewardsLockersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryExternalRewardsLockersResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryExternalRewardsLockersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryGaugeByDurationResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryGaugeByDurationResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryGaugeByDurationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryGaugeByDurationResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryGaugeByDurationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryGaugeByIdRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryGaugeByIdRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryGaugeByIdRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryGaugeByIdRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryGaugeByIdRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryGaugeByIdResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryGaugeByIdResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryGaugeByIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryGaugeByIdResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryGaugeByIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryGaugesByDurationRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryGaugesByDurationRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryGaugesByDurationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryGaugesByDurationRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryGaugesByDurationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryParamsRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryParamsResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryRewardRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryRewardRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryRewardRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryRewardRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryRewardRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryRewardResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryRewardResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryRewardResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryRewardsRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryRewardsRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryRewardsRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryRewardsResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryRewardsResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryRewardsResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryWhitelistedAppIdsVaultRequest(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryWhitelistedAppIdsVaultRequest)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryWhitelistedAppIdsVaultRequest(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryWhitelistedAppIdsVaultRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_rewards_v1beta1_QueryWhitelistedAppIdsVaultResponse(arg) {
  if (!(arg instanceof comdex_rewards_v1beta1_query_pb.QueryWhitelistedAppIdsVaultResponse)) {
    throw new Error('Expected argument of type comdex.rewards.v1beta1.QueryWhitelistedAppIdsVaultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_rewards_v1beta1_QueryWhitelistedAppIdsVaultResponse(buffer_arg) {
  return comdex_rewards_v1beta1_query_pb.QueryWhitelistedAppIdsVaultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  params: {
    path: '/comdex.rewards.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryParamsRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryParamsResponse,
  },
  queryAllEpochsInfo: {
    path: '/comdex.rewards.v1beta1.Query/QueryAllEpochsInfo',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryAllEpochsInfoRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryAllEpochsInfoResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryAllEpochsInfoRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryAllEpochsInfoRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryAllEpochsInfoResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryAllEpochsInfoResponse,
  },
  queryEpochInfoByDuration: {
    path: '/comdex.rewards.v1beta1.Query/QueryEpochInfoByDuration',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryEpochInfoByDurationRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryEpochInfoByDurationResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryEpochInfoByDurationRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryEpochInfoByDurationRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryEpochInfoByDurationResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryEpochInfoByDurationResponse,
  },
  queryAllGauges: {
    path: '/comdex.rewards.v1beta1.Query/QueryAllGauges',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryAllGaugesRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryAllGaugesResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryAllGaugesRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryAllGaugesRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryAllGaugesResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryAllGaugesResponse,
  },
  queryGaugeByID: {
    path: '/comdex.rewards.v1beta1.Query/QueryGaugeByID',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryGaugeByIdRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryGaugeByIdResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryGaugeByIdRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryGaugeByIdRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryGaugeByIdResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryGaugeByIdResponse,
  },
  queryGaugeByDuration: {
    path: '/comdex.rewards.v1beta1.Query/QueryGaugeByDuration',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryGaugesByDurationRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryGaugeByDurationResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryGaugesByDurationRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryGaugesByDurationRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryGaugeByDurationResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryGaugeByDurationResponse,
  },
  queryRewards: {
    path: '/comdex.rewards.v1beta1.Query/QueryRewards',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryRewardsRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryRewardsResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryRewardsRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryRewardsRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryRewardsResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryRewardsResponse,
  },
  queryReward: {
    path: '/comdex.rewards.v1beta1.Query/QueryReward',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryRewardRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryRewardResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryRewardRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryRewardRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryRewardResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryRewardResponse,
  },
  queryExternalRewardsLockers: {
    path: '/comdex.rewards.v1beta1.Query/QueryExternalRewardsLockers',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryExternalRewardsLockersRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryExternalRewardsLockersResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryExternalRewardsLockersRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryExternalRewardsLockersRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryExternalRewardsLockersResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryExternalRewardsLockersResponse,
  },
  queryExternalRewardVaults: {
    path: '/comdex.rewards.v1beta1.Query/QueryExternalRewardVaults',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryExternalRewardVaultsRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryExternalRewardVaultsResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryExternalRewardVaultsRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryExternalRewardVaultsRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryExternalRewardVaultsResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryExternalRewardVaultsResponse,
  },
  queryWhitelistedAppIdsVault: {
    path: '/comdex.rewards.v1beta1.Query/QueryWhitelistedAppIdsVault',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryWhitelistedAppIdsVaultRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryWhitelistedAppIdsVaultResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryWhitelistedAppIdsVaultRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryWhitelistedAppIdsVaultRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryWhitelistedAppIdsVaultResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryWhitelistedAppIdsVaultResponse,
  },
  queryExternalRewardLends: {
    path: '/comdex.rewards.v1beta1.Query/QueryExternalRewardLends',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryExternalRewardLendsRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryExternalRewardLendsResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryExternalRewardLendsRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryExternalRewardLendsRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryExternalRewardLendsResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryExternalRewardLendsResponse,
  },
  queryExternalRewardStableMint: {
    path: '/comdex.rewards.v1beta1.Query/QueryExternalRewardStableMint',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryExternalRewardStableMintRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryExternalRewardStableMintResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryExternalRewardStableMintRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryExternalRewardStableMintRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryExternalRewardStableMintResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryExternalRewardStableMintResponse,
  },
  queryEpochTime: {
    path: '/comdex.rewards.v1beta1.Query/QueryEpochTime',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryEpochTimeRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryEpochTimeResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryEpochTimeRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryEpochTimeRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryEpochTimeResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryEpochTimeResponse,
  },
  queryExtLendRewardsAPR: {
    path: '/comdex.rewards.v1beta1.Query/QueryExtLendRewardsAPR',
    requestStream: false,
    responseStream: false,
    requestType: comdex_rewards_v1beta1_query_pb.QueryExtLendRewardsAPRRequest,
    responseType: comdex_rewards_v1beta1_query_pb.QueryExtLendRewardsAPRResponse,
    requestSerialize: serialize_comdex_rewards_v1beta1_QueryExtLendRewardsAPRRequest,
    requestDeserialize: deserialize_comdex_rewards_v1beta1_QueryExtLendRewardsAPRRequest,
    responseSerialize: serialize_comdex_rewards_v1beta1_QueryExtLendRewardsAPRResponse,
    responseDeserialize: deserialize_comdex_rewards_v1beta1_QueryExtLendRewardsAPRResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
