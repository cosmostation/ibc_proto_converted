// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_concentrated$liquidity_query_pb = require('../../osmosis/concentrated-liquidity/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var osmosis_concentrated$liquidity_params_pb = require('../../osmosis/concentrated-liquidity/params_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../cosmos_proto/cosmos_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var osmosis_concentrated$liquidity_position_pb = require('../../osmosis/concentrated-liquidity/position_pb.js');

function serialize_osmosis_concentratedliquidity_v1beta1_ClaimableIncentivesRequest(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.ClaimableIncentivesRequest)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_ClaimableIncentivesRequest(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.ClaimableIncentivesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_ClaimableIncentivesResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.ClaimableIncentivesResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.ClaimableIncentivesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_ClaimableIncentivesResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.ClaimableIncentivesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_ClaimableSpreadRewardsRequest(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.ClaimableSpreadRewardsRequest)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_ClaimableSpreadRewardsRequest(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.ClaimableSpreadRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_ClaimableSpreadRewardsResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.ClaimableSpreadRewardsResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.ClaimableSpreadRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_ClaimableSpreadRewardsResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.ClaimableSpreadRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_LiquidityNetInDirectionRequest(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.LiquidityNetInDirectionRequest)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_LiquidityNetInDirectionRequest(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.LiquidityNetInDirectionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_LiquidityNetInDirectionResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.LiquidityNetInDirectionResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.LiquidityNetInDirectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_LiquidityNetInDirectionResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.LiquidityNetInDirectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_LiquidityPerTickRangeRequest(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.LiquidityPerTickRangeRequest)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_LiquidityPerTickRangeRequest(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.LiquidityPerTickRangeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_LiquidityPerTickRangeResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.LiquidityPerTickRangeResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.LiquidityPerTickRangeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_LiquidityPerTickRangeResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.LiquidityPerTickRangeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_ParamsRequest(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.ParamsRequest)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.ParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_ParamsRequest(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.ParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_ParamsResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.ParamsResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.ParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_ParamsResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.ParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_PoolsRequest(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.PoolsRequest)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.PoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_PoolsRequest(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.PoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_PoolsResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.PoolsResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.PoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_PoolsResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.PoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_PositionByIdRequest(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.PositionByIdRequest)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.PositionByIdRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_PositionByIdRequest(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.PositionByIdRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_PositionByIdResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.PositionByIdResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.PositionByIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_PositionByIdResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.PositionByIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_UserPositionsRequest(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.UserPositionsRequest)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.UserPositionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_UserPositionsRequest(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.UserPositionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_UserPositionsResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_query_pb.UserPositionsResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.UserPositionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_UserPositionsResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_query_pb.UserPositionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  // Pools returns all concentrated liquidity pools
pools: {
    path: '/osmosis.concentratedliquidity.v1beta1.Query/Pools',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_query_pb.PoolsRequest,
    responseType: osmosis_concentrated$liquidity_query_pb.PoolsResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_PoolsRequest,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_PoolsRequest,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_PoolsResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_PoolsResponse,
  },
  // Params returns concentrated liquidity module params.
params: {
    path: '/osmosis.concentratedliquidity.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_query_pb.ParamsRequest,
    responseType: osmosis_concentrated$liquidity_query_pb.ParamsResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_ParamsRequest,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_ParamsRequest,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_ParamsResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_ParamsResponse,
  },
  // UserPositions returns all concentrated postitions of some address.
userPositions: {
    path: '/osmosis.concentratedliquidity.v1beta1.Query/UserPositions',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_query_pb.UserPositionsRequest,
    responseType: osmosis_concentrated$liquidity_query_pb.UserPositionsResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_UserPositionsRequest,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_UserPositionsRequest,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_UserPositionsResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_UserPositionsResponse,
  },
  // LiquidityPerTickRange returns the amount of liquidity per every tick range
// existing within the given pool
liquidityPerTickRange: {
    path: '/osmosis.concentratedliquidity.v1beta1.Query/LiquidityPerTickRange',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_query_pb.LiquidityPerTickRangeRequest,
    responseType: osmosis_concentrated$liquidity_query_pb.LiquidityPerTickRangeResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_LiquidityPerTickRangeRequest,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_LiquidityPerTickRangeRequest,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_LiquidityPerTickRangeResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_LiquidityPerTickRangeResponse,
  },
  // LiquidityNetInDirection returns liquidity net in the direction given.
// Uses the bound if specified, if not uses either min tick / max tick
// depending on the direction.
liquidityNetInDirection: {
    path: '/osmosis.concentratedliquidity.v1beta1.Query/LiquidityNetInDirection',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_query_pb.LiquidityNetInDirectionRequest,
    responseType: osmosis_concentrated$liquidity_query_pb.LiquidityNetInDirectionResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_LiquidityNetInDirectionRequest,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_LiquidityNetInDirectionRequest,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_LiquidityNetInDirectionResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_LiquidityNetInDirectionResponse,
  },
  // ClaimableSpreadRewards returns the amount of spread rewards that can be
// claimed by a position with the given id.
claimableSpreadRewards: {
    path: '/osmosis.concentratedliquidity.v1beta1.Query/ClaimableSpreadRewards',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_query_pb.ClaimableSpreadRewardsRequest,
    responseType: osmosis_concentrated$liquidity_query_pb.ClaimableSpreadRewardsResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_ClaimableSpreadRewardsRequest,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_ClaimableSpreadRewardsRequest,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_ClaimableSpreadRewardsResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_ClaimableSpreadRewardsResponse,
  },
  // ClaimableIncentives returns the amount of incentives that can be claimed
// and how many would be forfeited by a position with the given id.
claimableIncentives: {
    path: '/osmosis.concentratedliquidity.v1beta1.Query/ClaimableIncentives',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_query_pb.ClaimableIncentivesRequest,
    responseType: osmosis_concentrated$liquidity_query_pb.ClaimableIncentivesResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_ClaimableIncentivesRequest,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_ClaimableIncentivesRequest,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_ClaimableIncentivesResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_ClaimableIncentivesResponse,
  },
  // PositionById returns a position with the given id.
positionById: {
    path: '/osmosis.concentratedliquidity.v1beta1.Query/PositionById',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_query_pb.PositionByIdRequest,
    responseType: osmosis_concentrated$liquidity_query_pb.PositionByIdResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_PositionByIdRequest,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_PositionByIdRequest,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_PositionByIdResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_PositionByIdResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
