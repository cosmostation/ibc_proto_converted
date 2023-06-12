// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_liquidfarming_v1beta1_query_pb = require('../../../crescent/liquidfarming/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var crescent_liquidfarming_v1beta1_liquidfarming_pb = require('../../../crescent/liquidfarming/v1beta1/liquidfarming_pb.js');
var crescent_liquidfarming_v1beta1_params_pb = require('../../../crescent/liquidfarming/v1beta1/params_pb.js');

function serialize_crescent_liquidfarming_v1beta1_QueryBidsRequest(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryBidsRequest)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryBidsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryBidsRequest(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryBidsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryBidsResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryBidsResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryBidsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryBidsResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryBidsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryExchangeRateRequest(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryExchangeRateRequest)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryExchangeRateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryExchangeRateRequest(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryExchangeRateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryExchangeRateResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryExchangeRateResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryExchangeRateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryExchangeRateResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryExchangeRateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmRequest(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmRequest)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryLiquidFarmRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmRequest(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryLiquidFarmResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmsRequest(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmsRequest)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryLiquidFarmsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmsRequest(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmsResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmsResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryLiquidFarmsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmsResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryParamsRequest(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryParamsResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionRequest(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionRequest)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryRewardsAuctionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionRequest(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryRewardsAuctionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsRequest(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionsRequest)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryRewardsAuctionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsRequest(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionsResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryRewardsAuctionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryRewardsRequest(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryRewardsRequest)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryRewardsRequest(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_liquidfarming_v1beta1_QueryRewardsResponse(arg) {
  if (!(arg instanceof crescent_liquidfarming_v1beta1_query_pb.QueryRewardsResponse)) {
    throw new Error('Expected argument of type crescent.liquidfarming.v1beta1.QueryRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_liquidfarming_v1beta1_QueryRewardsResponse(buffer_arg) {
  return crescent_liquidfarming_v1beta1_query_pb.QueryRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns parameters of the module
params: {
    path: '/crescent.liquidfarming.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_query_pb.QueryParamsRequest,
    responseType: crescent_liquidfarming_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryParamsResponse,
  },
  // LiquidFarms returns all liquid farms registered in params
liquidFarms: {
    path: '/crescent.liquidfarming.v1beta1.Query/LiquidFarms',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmsRequest,
    responseType: crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmsResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmsRequest,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmsRequest,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmsResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmsResponse,
  },
  // LiquidFarm returns the specific liquid farm
liquidFarm: {
    path: '/crescent.liquidfarming.v1beta1.Query/LiquidFarm',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmRequest,
    responseType: crescent_liquidfarming_v1beta1_query_pb.QueryLiquidFarmResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmRequest,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmRequest,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryLiquidFarmResponse,
  },
  // RewardsAuctions returns all rewards auctions that correspond to the given pool id
rewardsAuctions: {
    path: '/crescent.liquidfarming.v1beta1.Query/RewardsAuctions',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionsRequest,
    responseType: crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionsResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsRequest,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsRequest,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionsResponse,
  },
  // RewardsAuction returns the specific rewards auction
rewardsAuction: {
    path: '/crescent.liquidfarming.v1beta1.Query/RewardsAuction',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionRequest,
    responseType: crescent_liquidfarming_v1beta1_query_pb.QueryRewardsAuctionResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionRequest,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionRequest,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryRewardsAuctionResponse,
  },
  // Bids returns all bids for the liquid farm
bids: {
    path: '/crescent.liquidfarming.v1beta1.Query/Bids',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_query_pb.QueryBidsRequest,
    responseType: crescent_liquidfarming_v1beta1_query_pb.QueryBidsResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_QueryBidsRequest,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryBidsRequest,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_QueryBidsResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryBidsResponse,
  },
  // Rewards returns all accumulated farming rewards for the liquid farm
rewards: {
    path: '/crescent.liquidfarming.v1beta1.Query/Rewards',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_query_pb.QueryRewardsRequest,
    responseType: crescent_liquidfarming_v1beta1_query_pb.QueryRewardsResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_QueryRewardsRequest,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryRewardsRequest,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_QueryRewardsResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryRewardsResponse,
  },
  // ExchangeRate returns exchange rates (mint rate and burn rate) for the liquid farm
exchangeRate: {
    path: '/crescent.liquidfarming.v1beta1.Query/ExchangeRate',
    requestStream: false,
    responseStream: false,
    requestType: crescent_liquidfarming_v1beta1_query_pb.QueryExchangeRateRequest,
    responseType: crescent_liquidfarming_v1beta1_query_pb.QueryExchangeRateResponse,
    requestSerialize: serialize_crescent_liquidfarming_v1beta1_QueryExchangeRateRequest,
    requestDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryExchangeRateRequest,
    responseSerialize: serialize_crescent_liquidfarming_v1beta1_QueryExchangeRateResponse,
    responseDeserialize: deserialize_crescent_liquidfarming_v1beta1_QueryExchangeRateResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
