// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_mining_query_pb = require('../../stafihub/mining/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var stafihub_mining_params_pb = require('../../stafihub/mining/params_pb.js');
var stafihub_mining_models_pb = require('../../stafihub/mining/models_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_stafihub_stafihub_mining_QueryMaxRewardPoolNumberRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryMaxRewardPoolNumberRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryMaxRewardPoolNumberRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryMaxRewardPoolNumberRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryMaxRewardPoolNumberRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryMaxRewardPoolNumberResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryMaxRewardPoolNumberResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryMaxRewardPoolNumberResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryMaxRewardPoolNumberResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryMaxRewardPoolNumberResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryMaxStakeItemNumberRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryMaxStakeItemNumberRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryMaxStakeItemNumberRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryMaxStakeItemNumberRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryMaxStakeItemNumberRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryMaxStakeItemNumberResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryMaxStakeItemNumberResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryMaxStakeItemNumberResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryMaxStakeItemNumberResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryMaxStakeItemNumberResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryMiningProviderListRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryMiningProviderListRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryMiningProviderListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryMiningProviderListRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryMiningProviderListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryMiningProviderListResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryMiningProviderListResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryMiningProviderListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryMiningProviderListResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryMiningProviderListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryParamsRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryParamsRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryParamsResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryParamsResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryProviderSwitchRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryProviderSwitchRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryProviderSwitchRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryProviderSwitchRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryProviderSwitchRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryProviderSwitchResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryProviderSwitchResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryProviderSwitchResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryProviderSwitchResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryProviderSwitchResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryRewardTokenListRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryRewardTokenListRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryRewardTokenListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryRewardTokenListRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryRewardTokenListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryRewardTokenListResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryRewardTokenListResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryRewardTokenListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryRewardTokenListResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryRewardTokenListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakeItemListRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakeItemListRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakeItemListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakeItemListRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakeItemListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakeItemListResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakeItemListResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakeItemListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakeItemListResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakeItemListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakePoolInfoRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakePoolInfoRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakePoolInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakePoolInfoRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakePoolInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakePoolInfoResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakePoolInfoResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakePoolInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakePoolInfoResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakePoolInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakePoolListRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakePoolListRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakePoolListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakePoolListRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakePoolListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakePoolListResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakePoolListResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakePoolListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakePoolListResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakePoolListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakeRecordCountRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakeRecordCountRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakeRecordCountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakeRecordCountRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakeRecordCountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakeRecordCountResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakeRecordCountResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakeRecordCountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakeRecordCountResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakeRecordCountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakeRecordListRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakeRecordListRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakeRecordListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakeRecordListRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakeRecordListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakeRecordListResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakeRecordListResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakeRecordListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakeRecordListResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakeRecordListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakeRecordRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakeRecordRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakeRecordRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakeRecordRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakeRecordRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakeRecordResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakeRecordResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakeRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakeRecordResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakeRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakeRewardRequest(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakeRewardRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakeRewardRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakeRewardRequest(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakeRewardRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_mining_QueryStakeRewardResponse(arg) {
  if (!(arg instanceof stafihub_mining_query_pb.QueryStakeRewardResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.mining.QueryStakeRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_mining_QueryStakeRewardResponse(buffer_arg) {
  return stafihub_mining_query_pb.QueryStakeRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stafihub.stafihub.mining.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryParamsRequest,
    responseType: stafihub_mining_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryParamsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryParamsRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryParamsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryParamsResponse,
  },
  // Queries a list of StakePoolInfo items.
stakePoolInfo: {
    path: '/stafihub.stafihub.mining.Query/StakePoolInfo',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryStakePoolInfoRequest,
    responseType: stafihub_mining_query_pb.QueryStakePoolInfoResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryStakePoolInfoRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryStakePoolInfoRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryStakePoolInfoResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryStakePoolInfoResponse,
  },
  // Queries a list of StakeItemList items.
stakeItemList: {
    path: '/stafihub.stafihub.mining.Query/StakeItemList',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryStakeItemListRequest,
    responseType: stafihub_mining_query_pb.QueryStakeItemListResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryStakeItemListRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryStakeItemListRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryStakeItemListResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryStakeItemListResponse,
  },
  // Queries a list of StakeReward items.
stakeReward: {
    path: '/stafihub.stafihub.mining.Query/StakeReward',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryStakeRewardRequest,
    responseType: stafihub_mining_query_pb.QueryStakeRewardResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryStakeRewardRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryStakeRewardRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryStakeRewardResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryStakeRewardResponse,
  },
  // Queries a list of StakeRecordCount items.
stakeRecordCount: {
    path: '/stafihub.stafihub.mining.Query/StakeRecordCount',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryStakeRecordCountRequest,
    responseType: stafihub_mining_query_pb.QueryStakeRecordCountResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryStakeRecordCountRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryStakeRecordCountRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryStakeRecordCountResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryStakeRecordCountResponse,
  },
  // Queries a list of StakeRecord items.
stakeRecord: {
    path: '/stafihub.stafihub.mining.Query/StakeRecord',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryStakeRecordRequest,
    responseType: stafihub_mining_query_pb.QueryStakeRecordResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryStakeRecordRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryStakeRecordRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryStakeRecordResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryStakeRecordResponse,
  },
  // Queries a list of StakeRecordList items.
stakeRecordList: {
    path: '/stafihub.stafihub.mining.Query/StakeRecordList',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryStakeRecordListRequest,
    responseType: stafihub_mining_query_pb.QueryStakeRecordListResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryStakeRecordListRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryStakeRecordListRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryStakeRecordListResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryStakeRecordListResponse,
  },
  // Queries a list of StakePoolList items.
stakePoolList: {
    path: '/stafihub.stafihub.mining.Query/StakePoolList',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryStakePoolListRequest,
    responseType: stafihub_mining_query_pb.QueryStakePoolListResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryStakePoolListRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryStakePoolListRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryStakePoolListResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryStakePoolListResponse,
  },
  // Queries a list of MiningProviderList items.
miningProviderList: {
    path: '/stafihub.stafihub.mining.Query/MiningProviderList',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryMiningProviderListRequest,
    responseType: stafihub_mining_query_pb.QueryMiningProviderListResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryMiningProviderListRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryMiningProviderListRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryMiningProviderListResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryMiningProviderListResponse,
  },
  // Queries a list of RewardTokenList items.
rewardTokenList: {
    path: '/stafihub.stafihub.mining.Query/RewardTokenList',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryRewardTokenListRequest,
    responseType: stafihub_mining_query_pb.QueryRewardTokenListResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryRewardTokenListRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryRewardTokenListRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryRewardTokenListResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryRewardTokenListResponse,
  },
  // Queries a list of MaxRewardPoolNumber items.
maxRewardPoolNumber: {
    path: '/stafihub.stafihub.mining.Query/MaxRewardPoolNumber',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryMaxRewardPoolNumberRequest,
    responseType: stafihub_mining_query_pb.QueryMaxRewardPoolNumberResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryMaxRewardPoolNumberRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryMaxRewardPoolNumberRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryMaxRewardPoolNumberResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryMaxRewardPoolNumberResponse,
  },
  // Queries a list of MaxStakeItemNumber items.
maxStakeItemNumber: {
    path: '/stafihub.stafihub.mining.Query/MaxStakeItemNumber',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryMaxStakeItemNumberRequest,
    responseType: stafihub_mining_query_pb.QueryMaxStakeItemNumberResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryMaxStakeItemNumberRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryMaxStakeItemNumberRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryMaxStakeItemNumberResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryMaxStakeItemNumberResponse,
  },
  // Queries a list of ProviderSwitch items.
providerSwitch: {
    path: '/stafihub.stafihub.mining.Query/ProviderSwitch',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_mining_query_pb.QueryProviderSwitchRequest,
    responseType: stafihub_mining_query_pb.QueryProviderSwitchResponse,
    requestSerialize: serialize_stafihub_stafihub_mining_QueryProviderSwitchRequest,
    requestDeserialize: deserialize_stafihub_stafihub_mining_QueryProviderSwitchRequest,
    responseSerialize: serialize_stafihub_stafihub_mining_QueryProviderSwitchResponse,
    responseDeserialize: deserialize_stafihub_stafihub_mining_QueryProviderSwitchResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
