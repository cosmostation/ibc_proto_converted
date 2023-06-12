// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_lpfarm_v1beta1_query_pb = require('../../../crescent/lpfarm/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var crescent_lpfarm_v1beta1_lpfarm_pb = require('../../../crescent/lpfarm/v1beta1/lpfarm_pb.js');

function serialize_crescent_lpfarm_v1beta1_QueryFarmRequest(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryFarmRequest)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryFarmRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryFarmRequest(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryFarmRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryFarmResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryFarmResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryFarmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryFarmResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryFarmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryHistoricalRewardsRequest(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryHistoricalRewardsRequest)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryHistoricalRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryHistoricalRewardsRequest(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryHistoricalRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryHistoricalRewardsResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryHistoricalRewardsResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryHistoricalRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryHistoricalRewardsResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryHistoricalRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryParamsRequest(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryParamsResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryPlanRequest(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryPlanRequest)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryPlanRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryPlanRequest(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryPlanRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryPlanResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryPlanResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryPlanResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryPlanResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryPlanResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryPlansRequest(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryPlansRequest)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryPlansRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryPlansRequest(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryPlansRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryPlansResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryPlansResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryPlansResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryPlansResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryPlansResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryPositionRequest(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryPositionRequest)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryPositionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryPositionRequest(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryPositionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryPositionResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryPositionResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryPositionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryPositionResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryPositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryPositionsRequest(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryPositionsRequest)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryPositionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryPositionsRequest(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryPositionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryPositionsResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryPositionsResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryPositionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryPositionsResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryPositionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryRewardsRequest(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryRewardsRequest)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryRewardsRequest(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryRewardsResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryRewardsResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryRewardsResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryTotalRewardsRequest(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryTotalRewardsRequest)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryTotalRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryTotalRewardsRequest(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryTotalRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_lpfarm_v1beta1_QueryTotalRewardsResponse(arg) {
  if (!(arg instanceof crescent_lpfarm_v1beta1_query_pb.QueryTotalRewardsResponse)) {
    throw new Error('Expected argument of type crescent.lpfarm.v1beta1.QueryTotalRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_lpfarm_v1beta1_QueryTotalRewardsResponse(buffer_arg) {
  return crescent_lpfarm_v1beta1_query_pb.QueryTotalRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  params: {
    path: '/crescent.lpfarm.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_query_pb.QueryParamsRequest,
    responseType: crescent_lpfarm_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryParamsResponse,
  },
  plans: {
    path: '/crescent.lpfarm.v1beta1.Query/Plans',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_query_pb.QueryPlansRequest,
    responseType: crescent_lpfarm_v1beta1_query_pb.QueryPlansResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_QueryPlansRequest,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryPlansRequest,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_QueryPlansResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryPlansResponse,
  },
  plan: {
    path: '/crescent.lpfarm.v1beta1.Query/Plan',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_query_pb.QueryPlanRequest,
    responseType: crescent_lpfarm_v1beta1_query_pb.QueryPlanResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_QueryPlanRequest,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryPlanRequest,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_QueryPlanResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryPlanResponse,
  },
  farm: {
    path: '/crescent.lpfarm.v1beta1.Query/Farm',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_query_pb.QueryFarmRequest,
    responseType: crescent_lpfarm_v1beta1_query_pb.QueryFarmResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_QueryFarmRequest,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryFarmRequest,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_QueryFarmResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryFarmResponse,
  },
  positions: {
    path: '/crescent.lpfarm.v1beta1.Query/Positions',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_query_pb.QueryPositionsRequest,
    responseType: crescent_lpfarm_v1beta1_query_pb.QueryPositionsResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_QueryPositionsRequest,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryPositionsRequest,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_QueryPositionsResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryPositionsResponse,
  },
  position: {
    path: '/crescent.lpfarm.v1beta1.Query/Position',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_query_pb.QueryPositionRequest,
    responseType: crescent_lpfarm_v1beta1_query_pb.QueryPositionResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_QueryPositionRequest,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryPositionRequest,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_QueryPositionResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryPositionResponse,
  },
  historicalRewards: {
    path: '/crescent.lpfarm.v1beta1.Query/HistoricalRewards',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_query_pb.QueryHistoricalRewardsRequest,
    responseType: crescent_lpfarm_v1beta1_query_pb.QueryHistoricalRewardsResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_QueryHistoricalRewardsRequest,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryHistoricalRewardsRequest,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_QueryHistoricalRewardsResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryHistoricalRewardsResponse,
  },
  totalRewards: {
    path: '/crescent.lpfarm.v1beta1.Query/TotalRewards',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_query_pb.QueryTotalRewardsRequest,
    responseType: crescent_lpfarm_v1beta1_query_pb.QueryTotalRewardsResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_QueryTotalRewardsRequest,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryTotalRewardsRequest,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_QueryTotalRewardsResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryTotalRewardsResponse,
  },
  rewards: {
    path: '/crescent.lpfarm.v1beta1.Query/Rewards',
    requestStream: false,
    responseStream: false,
    requestType: crescent_lpfarm_v1beta1_query_pb.QueryRewardsRequest,
    responseType: crescent_lpfarm_v1beta1_query_pb.QueryRewardsResponse,
    requestSerialize: serialize_crescent_lpfarm_v1beta1_QueryRewardsRequest,
    requestDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryRewardsRequest,
    responseSerialize: serialize_crescent_lpfarm_v1beta1_QueryRewardsResponse,
    responseDeserialize: deserialize_crescent_lpfarm_v1beta1_QueryRewardsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
