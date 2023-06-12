// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_oracle_v1beta1_query_pb = require('../../../injective/oracle/v1beta1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var injective_oracle_v1beta1_oracle_pb = require('../../../injective/oracle/v1beta1/oracle_pb.js');
var injective_oracle_v1beta1_genesis_pb = require('../../../injective/oracle/v1beta1/genesis_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_injective_oracle_v1beta1_QueryBandIBCPriceStatesRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryBandIBCPriceStatesRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryBandIBCPriceStatesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryBandIBCPriceStatesRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryBandIBCPriceStatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryBandIBCPriceStatesResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryBandIBCPriceStatesResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryBandIBCPriceStatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryBandIBCPriceStatesResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryBandIBCPriceStatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryBandPriceStatesRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryBandPriceStatesRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryBandPriceStatesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryBandPriceStatesRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryBandPriceStatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryBandPriceStatesResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryBandPriceStatesResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryBandPriceStatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryBandPriceStatesResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryBandPriceStatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryBandRelayersRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryBandRelayersRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryBandRelayersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryBandRelayersRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryBandRelayersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryBandRelayersResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryBandRelayersResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryBandRelayersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryBandRelayersResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryBandRelayersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryCoinbasePriceStatesRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryCoinbasePriceStatesRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryCoinbasePriceStatesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryCoinbasePriceStatesRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryCoinbasePriceStatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryCoinbasePriceStatesResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryCoinbasePriceStatesResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryCoinbasePriceStatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryCoinbasePriceStatesResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryCoinbasePriceStatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryHistoricalPriceRecordsRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryHistoricalPriceRecordsRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryHistoricalPriceRecordsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryHistoricalPriceRecordsRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryHistoricalPriceRecordsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryHistoricalPriceRecordsResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryHistoricalPriceRecordsResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryHistoricalPriceRecordsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryHistoricalPriceRecordsResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryHistoricalPriceRecordsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryModuleStateRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryModuleStateRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryModuleStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryModuleStateRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryModuleStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryModuleStateResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryModuleStateResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryModuleStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryModuleStateResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryModuleStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryOraclePriceRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryOraclePriceRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryOraclePriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryOraclePriceRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryOraclePriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryOraclePriceResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryOraclePriceResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryOraclePriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryOraclePriceResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryOraclePriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryOracleProviderPricesRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryOracleProviderPricesRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryOracleProviderPricesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryOracleProviderPricesRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryOracleProviderPricesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryOracleProviderPricesResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryOracleProviderPricesResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryOracleProviderPricesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryOracleProviderPricesResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryOracleProviderPricesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryOracleProvidersInfoRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryOracleProvidersInfoRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryOracleProvidersInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryOracleProvidersInfoRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryOracleProvidersInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryOracleProvidersInfoResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryOracleProvidersInfoResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryOracleProvidersInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryOracleProvidersInfoResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryOracleProvidersInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryOracleVolatilityRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryOracleVolatilityRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryOracleVolatilityRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryOracleVolatilityRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryOracleVolatilityRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryOracleVolatilityResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryOracleVolatilityResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryOracleVolatilityResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryOracleVolatilityResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryOracleVolatilityResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryParamsRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryParamsResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryPriceFeedPriceStatesRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryPriceFeedPriceStatesRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryPriceFeedPriceStatesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryPriceFeedPriceStatesRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryPriceFeedPriceStatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryPriceFeedPriceStatesResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryPriceFeedPriceStatesResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryPriceFeedPriceStatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryPriceFeedPriceStatesResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryPriceFeedPriceStatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryProviderPriceStateRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryProviderPriceStateRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryProviderPriceStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryProviderPriceStateRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryProviderPriceStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryProviderPriceStateResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryProviderPriceStateResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryProviderPriceStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryProviderPriceStateResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryProviderPriceStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryPythPriceRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryPythPriceRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryPythPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryPythPriceRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryPythPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryPythPriceResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryPythPriceResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryPythPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryPythPriceResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryPythPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryPythPriceStatesRequest(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryPythPriceStatesRequest)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryPythPriceStatesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryPythPriceStatesRequest(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryPythPriceStatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_oracle_v1beta1_QueryPythPriceStatesResponse(arg) {
  if (!(arg instanceof injective_oracle_v1beta1_query_pb.QueryPythPriceStatesResponse)) {
    throw new Error('Expected argument of type injective.oracle.v1beta1.QueryPythPriceStatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_oracle_v1beta1_QueryPythPriceStatesResponse(buffer_arg) {
  return injective_oracle_v1beta1_query_pb.QueryPythPriceStatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Retrieves oracle params
params: {
    path: '/injective.oracle.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryParamsRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryParamsResponse,
  },
  // Retrieves the band relayers
bandRelayers: {
    path: '/injective.oracle.v1beta1.Query/BandRelayers',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryBandRelayersRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryBandRelayersResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryBandRelayersRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryBandRelayersRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryBandRelayersResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryBandRelayersResponse,
  },
  // Retrieves the state for all band price feeds
bandPriceStates: {
    path: '/injective.oracle.v1beta1.Query/BandPriceStates',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryBandPriceStatesRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryBandPriceStatesResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryBandPriceStatesRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryBandPriceStatesRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryBandPriceStatesResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryBandPriceStatesResponse,
  },
  // Retrieves the state for all band ibc price feeds
bandIBCPriceStates: {
    path: '/injective.oracle.v1beta1.Query/BandIBCPriceStates',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryBandIBCPriceStatesRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryBandIBCPriceStatesResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryBandIBCPriceStatesRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryBandIBCPriceStatesRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryBandIBCPriceStatesResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryBandIBCPriceStatesResponse,
  },
  // Retrieves the state for all price feeds
priceFeedPriceStates: {
    path: '/injective.oracle.v1beta1.Query/PriceFeedPriceStates',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryPriceFeedPriceStatesRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryPriceFeedPriceStatesResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryPriceFeedPriceStatesRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryPriceFeedPriceStatesRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryPriceFeedPriceStatesResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryPriceFeedPriceStatesResponse,
  },
  // Retrieves the state for all coinbase price feeds
coinbasePriceStates: {
    path: '/injective.oracle.v1beta1.Query/CoinbasePriceStates',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryCoinbasePriceStatesRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryCoinbasePriceStatesResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryCoinbasePriceStatesRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryCoinbasePriceStatesRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryCoinbasePriceStatesResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryCoinbasePriceStatesResponse,
  },
  // Retrieves the state for all pyth price feeds
pythPriceStates: {
    path: '/injective.oracle.v1beta1.Query/PythPriceStates',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryPythPriceStatesRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryPythPriceStatesResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryPythPriceStatesRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryPythPriceStatesRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryPythPriceStatesResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryPythPriceStatesResponse,
  },
  // Retrieves the state for all provider price feeds
providerPriceState: {
    path: '/injective.oracle.v1beta1.Query/ProviderPriceState',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryProviderPriceStateRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryProviderPriceStateResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryProviderPriceStateRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryProviderPriceStateRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryProviderPriceStateResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryProviderPriceStateResponse,
  },
  // Retrieves the entire oracle module's state
oracleModuleState: {
    path: '/injective.oracle.v1beta1.Query/OracleModuleState',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryModuleStateRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryModuleStateResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryModuleStateRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryModuleStateRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryModuleStateResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryModuleStateResponse,
  },
  // Retrieves historical price records for a given OracleType and Symbol
historicalPriceRecords: {
    path: '/injective.oracle.v1beta1.Query/HistoricalPriceRecords',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryHistoricalPriceRecordsRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryHistoricalPriceRecordsResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryHistoricalPriceRecordsRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryHistoricalPriceRecordsRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryHistoricalPriceRecordsResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryHistoricalPriceRecordsResponse,
  },
  // Retrieves mixed volatility value for the specified pair of base/quote
oracleVolatility: {
    path: '/injective.oracle.v1beta1.Query/OracleVolatility',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryOracleVolatilityRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryOracleVolatilityResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryOracleVolatilityRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryOracleVolatilityRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryOracleVolatilityResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryOracleVolatilityResponse,
  },
  oracleProvidersInfo: {
    path: '/injective.oracle.v1beta1.Query/OracleProvidersInfo',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryOracleProvidersInfoRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryOracleProvidersInfoResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryOracleProvidersInfoRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryOracleProvidersInfoRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryOracleProvidersInfoResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryOracleProvidersInfoResponse,
  },
  oracleProviderPrices: {
    path: '/injective.oracle.v1beta1.Query/OracleProviderPrices',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryOracleProviderPricesRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryOracleProviderPricesResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryOracleProviderPricesRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryOracleProviderPricesRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryOracleProviderPricesResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryOracleProviderPricesResponse,
  },
  oraclePrice: {
    path: '/injective.oracle.v1beta1.Query/OraclePrice',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryOraclePriceRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryOraclePriceResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryOraclePriceRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryOraclePriceRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryOraclePriceResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryOraclePriceResponse,
  },
  pythPrice: {
    path: '/injective.oracle.v1beta1.Query/PythPrice',
    requestStream: false,
    responseStream: false,
    requestType: injective_oracle_v1beta1_query_pb.QueryPythPriceRequest,
    responseType: injective_oracle_v1beta1_query_pb.QueryPythPriceResponse,
    requestSerialize: serialize_injective_oracle_v1beta1_QueryPythPriceRequest,
    requestDeserialize: deserialize_injective_oracle_v1beta1_QueryPythPriceRequest,
    responseSerialize: serialize_injective_oracle_v1beta1_QueryPythPriceResponse,
    responseDeserialize: deserialize_injective_oracle_v1beta1_QueryPythPriceResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
