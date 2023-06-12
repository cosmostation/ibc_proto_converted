// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_farming_v1beta1_query_pb = require('../../../crescent/farming/v1beta1/query_pb.js');
var crescent_farming_v1beta1_farming_pb = require('../../../crescent/farming/v1beta1/farming_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_crescent_farming_v1beta1_QueryCurrentEpochDaysRequest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryCurrentEpochDaysRequest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryCurrentEpochDaysRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryCurrentEpochDaysRequest(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryCurrentEpochDaysRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryCurrentEpochDaysResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryCurrentEpochDaysResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryCurrentEpochDaysResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryCurrentEpochDaysResponse(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryCurrentEpochDaysResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryHistoricalRewardsRequest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryHistoricalRewardsRequest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryHistoricalRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryHistoricalRewardsRequest(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryHistoricalRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryHistoricalRewardsResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryHistoricalRewardsResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryHistoricalRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryHistoricalRewardsResponse(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryHistoricalRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryParamsRequest(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryParamsResponse(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryPlanRequest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryPlanRequest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryPlanRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryPlanRequest(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryPlanRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryPlanResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryPlanResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryPlanResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryPlanResponse(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryPlanResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryPlansRequest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryPlansRequest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryPlansRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryPlansRequest(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryPlansRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryPlansResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryPlansResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryPlansResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryPlansResponse(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryPlansResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryPositionRequest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryPositionRequest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryPositionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryPositionRequest(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryPositionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryPositionResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryPositionResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryPositionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryPositionResponse(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryPositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryQueuedStakingsRequest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryQueuedStakingsRequest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryQueuedStakingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryQueuedStakingsRequest(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryQueuedStakingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryQueuedStakingsResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryQueuedStakingsResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryQueuedStakingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryQueuedStakingsResponse(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryQueuedStakingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryRewardsRequest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryRewardsRequest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryRewardsRequest(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryRewardsResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryRewardsResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryRewardsResponse(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryStakingsRequest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryStakingsRequest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryStakingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryStakingsRequest(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryStakingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryStakingsResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryStakingsResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryStakingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryStakingsResponse(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryStakingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryTotalStakingsRequest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryTotalStakingsRequest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryTotalStakingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryTotalStakingsRequest(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryTotalStakingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryTotalStakingsResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryTotalStakingsResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryTotalStakingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryTotalStakingsResponse(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryTotalStakingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryUnharvestedRewardsRequest(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryUnharvestedRewardsRequest)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryUnharvestedRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryUnharvestedRewardsRequest(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryUnharvestedRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_farming_v1beta1_QueryUnharvestedRewardsResponse(arg) {
  if (!(arg instanceof crescent_farming_v1beta1_query_pb.QueryUnharvestedRewardsResponse)) {
    throw new Error('Expected argument of type crescent.farming.v1beta1.QueryUnharvestedRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_farming_v1beta1_QueryUnharvestedRewardsResponse(buffer_arg) {
  return crescent_farming_v1beta1_query_pb.QueryUnharvestedRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC query service for the farming module.
var QueryService = exports.QueryService = {
  // Params returns parameters of the farming module.
params: {
    path: '/crescent.farming.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_query_pb.QueryParamsRequest,
    responseType: crescent_farming_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_crescent_farming_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_QueryParamsResponse,
  },
  // Plans returns all plans.
plans: {
    path: '/crescent.farming.v1beta1.Query/Plans',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_query_pb.QueryPlansRequest,
    responseType: crescent_farming_v1beta1_query_pb.QueryPlansResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_QueryPlansRequest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_QueryPlansRequest,
    responseSerialize: serialize_crescent_farming_v1beta1_QueryPlansResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_QueryPlansResponse,
  },
  // Plan returns a specific plan.
plan: {
    path: '/crescent.farming.v1beta1.Query/Plan',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_query_pb.QueryPlanRequest,
    responseType: crescent_farming_v1beta1_query_pb.QueryPlanResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_QueryPlanRequest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_QueryPlanRequest,
    responseSerialize: serialize_crescent_farming_v1beta1_QueryPlanResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_QueryPlanResponse,
  },
  position: {
    path: '/crescent.farming.v1beta1.Query/Position',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_query_pb.QueryPositionRequest,
    responseType: crescent_farming_v1beta1_query_pb.QueryPositionResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_QueryPositionRequest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_QueryPositionRequest,
    responseSerialize: serialize_crescent_farming_v1beta1_QueryPositionResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_QueryPositionResponse,
  },
  // Stakings returns all stakings by a farmer.
stakings: {
    path: '/crescent.farming.v1beta1.Query/Stakings',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_query_pb.QueryStakingsRequest,
    responseType: crescent_farming_v1beta1_query_pb.QueryStakingsResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_QueryStakingsRequest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_QueryStakingsRequest,
    responseSerialize: serialize_crescent_farming_v1beta1_QueryStakingsResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_QueryStakingsResponse,
  },
  // QueryStakings returns all queued stakings by a farmer.
queuedStakings: {
    path: '/crescent.farming.v1beta1.Query/QueuedStakings',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_query_pb.QueryQueuedStakingsRequest,
    responseType: crescent_farming_v1beta1_query_pb.QueryQueuedStakingsResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_QueryQueuedStakingsRequest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_QueryQueuedStakingsRequest,
    responseSerialize: serialize_crescent_farming_v1beta1_QueryQueuedStakingsResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_QueryQueuedStakingsResponse,
  },
  // TotalStakings returns total staking amount for a staking coin denom
totalStakings: {
    path: '/crescent.farming.v1beta1.Query/TotalStakings',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_query_pb.QueryTotalStakingsRequest,
    responseType: crescent_farming_v1beta1_query_pb.QueryTotalStakingsResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_QueryTotalStakingsRequest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_QueryTotalStakingsRequest,
    responseSerialize: serialize_crescent_farming_v1beta1_QueryTotalStakingsResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_QueryTotalStakingsResponse,
  },
  // Rewards returns rewards for a farmer
rewards: {
    path: '/crescent.farming.v1beta1.Query/Rewards',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_query_pb.QueryRewardsRequest,
    responseType: crescent_farming_v1beta1_query_pb.QueryRewardsResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_QueryRewardsRequest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_QueryRewardsRequest,
    responseSerialize: serialize_crescent_farming_v1beta1_QueryRewardsResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_QueryRewardsResponse,
  },
  // UnharvestedRewards returns unharvested rewards for a farmer
unharvestedRewards: {
    path: '/crescent.farming.v1beta1.Query/UnharvestedRewards',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_query_pb.QueryUnharvestedRewardsRequest,
    responseType: crescent_farming_v1beta1_query_pb.QueryUnharvestedRewardsResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_QueryUnharvestedRewardsRequest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_QueryUnharvestedRewardsRequest,
    responseSerialize: serialize_crescent_farming_v1beta1_QueryUnharvestedRewardsResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_QueryUnharvestedRewardsResponse,
  },
  // CurrentEpochDays returns current epoch days.
currentEpochDays: {
    path: '/crescent.farming.v1beta1.Query/CurrentEpochDays',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_query_pb.QueryCurrentEpochDaysRequest,
    responseType: crescent_farming_v1beta1_query_pb.QueryCurrentEpochDaysResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_QueryCurrentEpochDaysRequest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_QueryCurrentEpochDaysRequest,
    responseSerialize: serialize_crescent_farming_v1beta1_QueryCurrentEpochDaysResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_QueryCurrentEpochDaysResponse,
  },
  // HistoricalRewards returns HistoricalRewards records for a staking coin denom.
historicalRewards: {
    path: '/crescent.farming.v1beta1.Query/HistoricalRewards',
    requestStream: false,
    responseStream: false,
    requestType: crescent_farming_v1beta1_query_pb.QueryHistoricalRewardsRequest,
    responseType: crescent_farming_v1beta1_query_pb.QueryHistoricalRewardsResponse,
    requestSerialize: serialize_crescent_farming_v1beta1_QueryHistoricalRewardsRequest,
    requestDeserialize: deserialize_crescent_farming_v1beta1_QueryHistoricalRewardsRequest,
    responseSerialize: serialize_crescent_farming_v1beta1_QueryHistoricalRewardsResponse,
    responseDeserialize: deserialize_crescent_farming_v1beta1_QueryHistoricalRewardsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
