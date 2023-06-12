// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_poolmanager_v1beta1_query_pb = require('../../../osmosis/poolmanager/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var osmosis_poolmanager_v1beta1_genesis_pb = require('../../../osmosis/poolmanager/v1beta1/genesis_pb.js');
var osmosis_poolmanager_v1beta1_tx_pb = require('../../../osmosis/poolmanager/v1beta1/tx_pb.js');
var osmosis_poolmanager_v1beta1_swap_route_pb = require('../../../osmosis/poolmanager/v1beta1/swap_route_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_osmosis_poolmanager_v1beta1_AllPoolsRequest(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.AllPoolsRequest)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.AllPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_AllPoolsRequest(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.AllPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_AllPoolsResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.AllPoolsResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.AllPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_AllPoolsResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.AllPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_EstimateSinglePoolSwapExactAmountInRequest(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.EstimateSinglePoolSwapExactAmountInRequest)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountInRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_EstimateSinglePoolSwapExactAmountInRequest(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.EstimateSinglePoolSwapExactAmountInRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_EstimateSinglePoolSwapExactAmountOutRequest(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.EstimateSinglePoolSwapExactAmountOutRequest)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.EstimateSinglePoolSwapExactAmountOutRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_EstimateSinglePoolSwapExactAmountOutRequest(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.EstimateSinglePoolSwapExactAmountOutRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountInRequest(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountInRequest)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.EstimateSwapExactAmountInRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountInRequest(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountInRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountInResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountInResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.EstimateSwapExactAmountInResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountInResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountInResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountOutRequest(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountOutRequest)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.EstimateSwapExactAmountOutRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountOutRequest(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountOutRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountOutResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountOutResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.EstimateSwapExactAmountOutResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountOutResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountOutResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_NumPoolsRequest(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.NumPoolsRequest)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.NumPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_NumPoolsRequest(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.NumPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_NumPoolsResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.NumPoolsResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.NumPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_NumPoolsResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.NumPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_ParamsRequest(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.ParamsRequest)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.ParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_ParamsRequest(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.ParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_ParamsResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.ParamsResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.ParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_ParamsResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.ParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_PoolRequest(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.PoolRequest)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.PoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_PoolRequest(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.PoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_PoolResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.PoolResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.PoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_PoolResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.PoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_SpotPriceRequest(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.SpotPriceRequest)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.SpotPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_SpotPriceRequest(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.SpotPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_SpotPriceResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.SpotPriceResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.SpotPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_SpotPriceResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.SpotPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_TotalPoolLiquidityRequest(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.TotalPoolLiquidityRequest)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.TotalPoolLiquidityRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_TotalPoolLiquidityRequest(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.TotalPoolLiquidityRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolmanager_v1beta1_TotalPoolLiquidityResponse(arg) {
  if (!(arg instanceof osmosis_poolmanager_v1beta1_query_pb.TotalPoolLiquidityResponse)) {
    throw new Error('Expected argument of type osmosis.poolmanager.v1beta1.TotalPoolLiquidityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolmanager_v1beta1_TotalPoolLiquidityResponse(buffer_arg) {
  return osmosis_poolmanager_v1beta1_query_pb.TotalPoolLiquidityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  params: {
    path: '/osmosis.poolmanager.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_query_pb.ParamsRequest,
    responseType: osmosis_poolmanager_v1beta1_query_pb.ParamsResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_ParamsRequest,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_ParamsRequest,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_ParamsResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_ParamsResponse,
  },
  // Estimates swap amount out given in.
estimateSwapExactAmountIn: {
    path: '/osmosis.poolmanager.v1beta1.Query/EstimateSwapExactAmountIn',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountInRequest,
    responseType: osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountInResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountInRequest,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountInRequest,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountInResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountInResponse,
  },
  estimateSinglePoolSwapExactAmountIn: {
    path: '/osmosis.poolmanager.v1beta1.Query/EstimateSinglePoolSwapExactAmountIn',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_query_pb.EstimateSinglePoolSwapExactAmountInRequest,
    responseType: osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountInResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_EstimateSinglePoolSwapExactAmountInRequest,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_EstimateSinglePoolSwapExactAmountInRequest,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountInResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountInResponse,
  },
  // Estimates swap amount in given out.
estimateSwapExactAmountOut: {
    path: '/osmosis.poolmanager.v1beta1.Query/EstimateSwapExactAmountOut',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountOutRequest,
    responseType: osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountOutResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountOutRequest,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountOutRequest,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountOutResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountOutResponse,
  },
  estimateSinglePoolSwapExactAmountOut: {
    path: '/osmosis.poolmanager.v1beta1.Query/EstimateSinglePoolSwapExactAmountOut',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_query_pb.EstimateSinglePoolSwapExactAmountOutRequest,
    responseType: osmosis_poolmanager_v1beta1_query_pb.EstimateSwapExactAmountOutResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_EstimateSinglePoolSwapExactAmountOutRequest,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_EstimateSinglePoolSwapExactAmountOutRequest,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountOutResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_EstimateSwapExactAmountOutResponse,
  },
  // Returns the total number of pools existing in Osmosis.
numPools: {
    path: '/osmosis.poolmanager.v1beta1.Query/NumPools',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_query_pb.NumPoolsRequest,
    responseType: osmosis_poolmanager_v1beta1_query_pb.NumPoolsResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_NumPoolsRequest,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_NumPoolsRequest,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_NumPoolsResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_NumPoolsResponse,
  },
  // Pool returns the Pool specified by the pool id
pool: {
    path: '/osmosis.poolmanager.v1beta1.Query/Pool',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_query_pb.PoolRequest,
    responseType: osmosis_poolmanager_v1beta1_query_pb.PoolResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_PoolRequest,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_PoolRequest,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_PoolResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_PoolResponse,
  },
  // AllPools returns all pools on the Osmosis chain sorted by IDs.
allPools: {
    path: '/osmosis.poolmanager.v1beta1.Query/AllPools',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_query_pb.AllPoolsRequest,
    responseType: osmosis_poolmanager_v1beta1_query_pb.AllPoolsResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_AllPoolsRequest,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_AllPoolsRequest,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_AllPoolsResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_AllPoolsResponse,
  },
  // SpotPrice defines a gRPC query handler that returns the spot price given
// a base denomination and a quote denomination.
spotPrice: {
    path: '/osmosis.poolmanager.v1beta1.Query/SpotPrice',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_query_pb.SpotPriceRequest,
    responseType: osmosis_poolmanager_v1beta1_query_pb.SpotPriceResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_SpotPriceRequest,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_SpotPriceRequest,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_SpotPriceResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_SpotPriceResponse,
  },
  totalPoolLiquidity: {
    path: '/osmosis.poolmanager.v1beta1.Query/TotalPoolLiquidity',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_poolmanager_v1beta1_query_pb.TotalPoolLiquidityRequest,
    responseType: osmosis_poolmanager_v1beta1_query_pb.TotalPoolLiquidityResponse,
    requestSerialize: serialize_osmosis_poolmanager_v1beta1_TotalPoolLiquidityRequest,
    requestDeserialize: deserialize_osmosis_poolmanager_v1beta1_TotalPoolLiquidityRequest,
    responseSerialize: serialize_osmosis_poolmanager_v1beta1_TotalPoolLiquidityResponse,
    responseDeserialize: deserialize_osmosis_poolmanager_v1beta1_TotalPoolLiquidityResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
