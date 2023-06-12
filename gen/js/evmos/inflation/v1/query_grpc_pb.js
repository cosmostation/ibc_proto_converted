// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var evmos_inflation_v1_query_pb = require('../../../evmos/inflation/v1/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var evmos_inflation_v1_genesis_pb = require('../../../evmos/inflation/v1/genesis_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_evmos_inflation_v1_QueryCirculatingSupplyRequest(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QueryCirculatingSupplyRequest)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QueryCirculatingSupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QueryCirculatingSupplyRequest(buffer_arg) {
  return evmos_inflation_v1_query_pb.QueryCirculatingSupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_QueryCirculatingSupplyResponse(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QueryCirculatingSupplyResponse)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QueryCirculatingSupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QueryCirculatingSupplyResponse(buffer_arg) {
  return evmos_inflation_v1_query_pb.QueryCirculatingSupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_QueryEpochMintProvisionRequest(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QueryEpochMintProvisionRequest)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QueryEpochMintProvisionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QueryEpochMintProvisionRequest(buffer_arg) {
  return evmos_inflation_v1_query_pb.QueryEpochMintProvisionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_QueryEpochMintProvisionResponse(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QueryEpochMintProvisionResponse)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QueryEpochMintProvisionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QueryEpochMintProvisionResponse(buffer_arg) {
  return evmos_inflation_v1_query_pb.QueryEpochMintProvisionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_QueryInflationRateRequest(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QueryInflationRateRequest)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QueryInflationRateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QueryInflationRateRequest(buffer_arg) {
  return evmos_inflation_v1_query_pb.QueryInflationRateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_QueryInflationRateResponse(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QueryInflationRateResponse)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QueryInflationRateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QueryInflationRateResponse(buffer_arg) {
  return evmos_inflation_v1_query_pb.QueryInflationRateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QueryParamsRequest(buffer_arg) {
  return evmos_inflation_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QueryParamsResponse(buffer_arg) {
  return evmos_inflation_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_QueryPeriodRequest(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QueryPeriodRequest)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QueryPeriodRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QueryPeriodRequest(buffer_arg) {
  return evmos_inflation_v1_query_pb.QueryPeriodRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_QueryPeriodResponse(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QueryPeriodResponse)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QueryPeriodResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QueryPeriodResponse(buffer_arg) {
  return evmos_inflation_v1_query_pb.QueryPeriodResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_QuerySkippedEpochsRequest(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QuerySkippedEpochsRequest)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QuerySkippedEpochsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QuerySkippedEpochsRequest(buffer_arg) {
  return evmos_inflation_v1_query_pb.QuerySkippedEpochsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_QuerySkippedEpochsResponse(arg) {
  if (!(arg instanceof evmos_inflation_v1_query_pb.QuerySkippedEpochsResponse)) {
    throw new Error('Expected argument of type evmos.inflation.v1.QuerySkippedEpochsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_QuerySkippedEpochsResponse(buffer_arg) {
  return evmos_inflation_v1_query_pb.QuerySkippedEpochsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Period retrieves current period.
period: {
    path: '/evmos.inflation.v1.Query/Period',
    requestStream: false,
    responseStream: false,
    requestType: evmos_inflation_v1_query_pb.QueryPeriodRequest,
    responseType: evmos_inflation_v1_query_pb.QueryPeriodResponse,
    requestSerialize: serialize_evmos_inflation_v1_QueryPeriodRequest,
    requestDeserialize: deserialize_evmos_inflation_v1_QueryPeriodRequest,
    responseSerialize: serialize_evmos_inflation_v1_QueryPeriodResponse,
    responseDeserialize: deserialize_evmos_inflation_v1_QueryPeriodResponse,
  },
  // EpochMintProvision retrieves current minting epoch provision value.
epochMintProvision: {
    path: '/evmos.inflation.v1.Query/EpochMintProvision',
    requestStream: false,
    responseStream: false,
    requestType: evmos_inflation_v1_query_pb.QueryEpochMintProvisionRequest,
    responseType: evmos_inflation_v1_query_pb.QueryEpochMintProvisionResponse,
    requestSerialize: serialize_evmos_inflation_v1_QueryEpochMintProvisionRequest,
    requestDeserialize: deserialize_evmos_inflation_v1_QueryEpochMintProvisionRequest,
    responseSerialize: serialize_evmos_inflation_v1_QueryEpochMintProvisionResponse,
    responseDeserialize: deserialize_evmos_inflation_v1_QueryEpochMintProvisionResponse,
  },
  // SkippedEpochs retrieves the total number of skipped epochs.
skippedEpochs: {
    path: '/evmos.inflation.v1.Query/SkippedEpochs',
    requestStream: false,
    responseStream: false,
    requestType: evmos_inflation_v1_query_pb.QuerySkippedEpochsRequest,
    responseType: evmos_inflation_v1_query_pb.QuerySkippedEpochsResponse,
    requestSerialize: serialize_evmos_inflation_v1_QuerySkippedEpochsRequest,
    requestDeserialize: deserialize_evmos_inflation_v1_QuerySkippedEpochsRequest,
    responseSerialize: serialize_evmos_inflation_v1_QuerySkippedEpochsResponse,
    responseDeserialize: deserialize_evmos_inflation_v1_QuerySkippedEpochsResponse,
  },
  // CirculatingSupply retrieves the total number of tokens that are in
// circulation (i.e. excluding unvested tokens).
circulatingSupply: {
    path: '/evmos.inflation.v1.Query/CirculatingSupply',
    requestStream: false,
    responseStream: false,
    requestType: evmos_inflation_v1_query_pb.QueryCirculatingSupplyRequest,
    responseType: evmos_inflation_v1_query_pb.QueryCirculatingSupplyResponse,
    requestSerialize: serialize_evmos_inflation_v1_QueryCirculatingSupplyRequest,
    requestDeserialize: deserialize_evmos_inflation_v1_QueryCirculatingSupplyRequest,
    responseSerialize: serialize_evmos_inflation_v1_QueryCirculatingSupplyResponse,
    responseDeserialize: deserialize_evmos_inflation_v1_QueryCirculatingSupplyResponse,
  },
  // InflationRate retrieves the inflation rate of the current period.
inflationRate: {
    path: '/evmos.inflation.v1.Query/InflationRate',
    requestStream: false,
    responseStream: false,
    requestType: evmos_inflation_v1_query_pb.QueryInflationRateRequest,
    responseType: evmos_inflation_v1_query_pb.QueryInflationRateResponse,
    requestSerialize: serialize_evmos_inflation_v1_QueryInflationRateRequest,
    requestDeserialize: deserialize_evmos_inflation_v1_QueryInflationRateRequest,
    responseSerialize: serialize_evmos_inflation_v1_QueryInflationRateResponse,
    responseDeserialize: deserialize_evmos_inflation_v1_QueryInflationRateResponse,
  },
  // Params retrieves the total set of minting parameters.
params: {
    path: '/evmos.inflation.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: evmos_inflation_v1_query_pb.QueryParamsRequest,
    responseType: evmos_inflation_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_evmos_inflation_v1_QueryParamsRequest,
    requestDeserialize: deserialize_evmos_inflation_v1_QueryParamsRequest,
    responseSerialize: serialize_evmos_inflation_v1_QueryParamsResponse,
    responseDeserialize: deserialize_evmos_inflation_v1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
