// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_protorev_v1beta1_query_pb = require('../../../osmosis/protorev/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var osmosis_protorev_v1beta1_params_pb = require('../../../osmosis/protorev/v1beta1/params_pb.js');
var osmosis_protorev_v1beta1_protorev_pb = require('../../../osmosis/protorev/v1beta1/protorev_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAdminAccountRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAdminAccountRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevAdminAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAdminAccountRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAdminAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAdminAccountResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAdminAccountResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevAdminAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAdminAccountResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAdminAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllProfitsRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllProfitsRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevAllProfitsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllProfitsRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllProfitsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllProfitsResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllProfitsResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevAllProfitsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllProfitsResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllProfitsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllRouteStatisticsRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllRouteStatisticsRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevAllRouteStatisticsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllRouteStatisticsRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllRouteStatisticsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllRouteStatisticsResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllRouteStatisticsResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevAllRouteStatisticsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllRouteStatisticsResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllRouteStatisticsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevBaseDenomsRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevBaseDenomsRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevBaseDenomsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevBaseDenomsRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevBaseDenomsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevBaseDenomsResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevBaseDenomsResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevBaseDenomsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevBaseDenomsResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevBaseDenomsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevDeveloperAccountRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevDeveloperAccountRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevDeveloperAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevDeveloperAccountRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevDeveloperAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevDeveloperAccountResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevDeveloperAccountResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevDeveloperAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevDeveloperAccountResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevDeveloperAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevEnabledRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevEnabledRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevEnabledRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevEnabledRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevEnabledRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevEnabledResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevEnabledResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevEnabledResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevEnabledResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevEnabledResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerBlockRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerBlockRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevMaxPoolPointsPerBlockRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerBlockRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerBlockRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerBlockResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerBlockResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevMaxPoolPointsPerBlockResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerBlockResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerBlockResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerTxRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerTxRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevMaxPoolPointsPerTxRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerTxRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerTxRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerTxResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerTxResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevMaxPoolPointsPerTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerTxResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevNumberOfTradesRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevNumberOfTradesRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevNumberOfTradesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevNumberOfTradesRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevNumberOfTradesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevNumberOfTradesResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevNumberOfTradesResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevNumberOfTradesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevNumberOfTradesResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevNumberOfTradesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolWeightsRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolWeightsRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevPoolWeightsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolWeightsRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolWeightsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolWeightsResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolWeightsResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevPoolWeightsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolWeightsResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolWeightsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevProfitsByDenomRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevProfitsByDenomRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevProfitsByDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevProfitsByDenomRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevProfitsByDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevProfitsByDenomResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevProfitsByDenomResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevProfitsByDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevProfitsByDenomResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevProfitsByDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevStatisticsByRouteRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevStatisticsByRouteRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevStatisticsByRouteRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevStatisticsByRouteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevStatisticsByRouteResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevStatisticsByRouteResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevStatisticsByRouteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevStatisticsByRouteResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevStatisticsByRouteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevTokenPairArbRoutesRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevTokenPairArbRoutesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevTokenPairArbRoutesResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryGetProtoRevTokenPairArbRoutesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevTokenPairArbRoutesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryParamsRequest(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_protorev_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof osmosis_protorev_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type osmosis.protorev.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_protorev_v1beta1_QueryParamsResponse(buffer_arg) {
  return osmosis_protorev_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params queries the parameters of the module.
params: {
    path: '/osmosis.protorev.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryParamsRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryParamsResponse,
  },
  // GetProtoRevNumberOfTrades queries the number of arbitrage trades the module
// has executed
getProtoRevNumberOfTrades: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevNumberOfTrades',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevNumberOfTradesRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevNumberOfTradesResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevNumberOfTradesRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevNumberOfTradesRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevNumberOfTradesResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevNumberOfTradesResponse,
  },
  // GetProtoRevProfitsByDenom queries the profits of the module by denom
getProtoRevProfitsByDenom: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevProfitsByDenom',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevProfitsByDenomRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevProfitsByDenomResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevProfitsByDenomRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevProfitsByDenomRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevProfitsByDenomResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevProfitsByDenomResponse,
  },
  // GetProtoRevAllProfits queries all of the profits from the module
getProtoRevAllProfits: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevAllProfits',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllProfitsRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllProfitsResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllProfitsRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllProfitsRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllProfitsResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllProfitsResponse,
  },
  // GetProtoRevStatisticsByRoute queries the number of arbitrages and profits
// that have been executed for a given route
getProtoRevStatisticsByRoute: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevStatisticsByRoute',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevStatisticsByRouteRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevStatisticsByRouteResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevStatisticsByRouteRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevStatisticsByRouteRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevStatisticsByRouteResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevStatisticsByRouteResponse,
  },
  // GetProtoRevAllRouteStatistics queries all of routes that the module has
// arbitraged against and the number of trades and profits that have been
// accumulated for each route
getProtoRevAllRouteStatistics: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevAllRouteStatistics',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllRouteStatisticsRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAllRouteStatisticsResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllRouteStatisticsRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllRouteStatisticsRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllRouteStatisticsResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAllRouteStatisticsResponse,
  },
  // GetProtoRevTokenPairArbRoutes queries all of the hot routes that the module
// is currently arbitraging
getProtoRevTokenPairArbRoutes: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevTokenPairArbRoutes',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevTokenPairArbRoutesRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevTokenPairArbRoutesResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevTokenPairArbRoutesResponse,
  },
  // GetProtoRevAdminAccount queries the admin account of the module
getProtoRevAdminAccount: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevAdminAccount',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAdminAccountRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevAdminAccountResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAdminAccountRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAdminAccountRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevAdminAccountResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevAdminAccountResponse,
  },
  // GetProtoRevDeveloperAccount queries the developer account of the module
getProtoRevDeveloperAccount: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevDeveloperAccount',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevDeveloperAccountRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevDeveloperAccountResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevDeveloperAccountRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevDeveloperAccountRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevDeveloperAccountResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevDeveloperAccountResponse,
  },
  // GetProtoRevPoolWeights queries the weights of each pool type currently
// being used by the module
getProtoRevPoolWeights: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevPoolWeights',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolWeightsRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolWeightsResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolWeightsRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolWeightsRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolWeightsResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolWeightsResponse,
  },
  // GetProtoRevMaxPoolPointsPerTx queries the maximum number of pool points
// that can be consumed per transaction
getProtoRevMaxPoolPointsPerTx: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevMaxPoolPointsPerTx',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerTxRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerTxResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerTxRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerTxRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerTxResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerTxResponse,
  },
  // GetProtoRevMaxPoolPointsPerBlock queries the maximum number of pool points
// that can consumed per block
getProtoRevMaxPoolPointsPerBlock: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevMaxPoolPointsPerBlock',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerBlockRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevMaxPoolPointsPerBlockResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerBlockRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerBlockRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerBlockResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevMaxPoolPointsPerBlockResponse,
  },
  // GetProtoRevBaseDenoms queries the base denoms that the module is currently
// utilizing for arbitrage
getProtoRevBaseDenoms: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevBaseDenoms',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevBaseDenomsRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevBaseDenomsResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevBaseDenomsRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevBaseDenomsRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevBaseDenomsResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevBaseDenomsResponse,
  },
  // GetProtoRevEnabled queries whether the module is enabled or not
getProtoRevEnabled: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevEnabled',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevEnabledRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevEnabledResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevEnabledRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevEnabledRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevEnabledResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevEnabledResponse,
  },
  // GetProtoRevPool queries the pool id used via the highest liquidity method
// for arbitrage route building given a pair of denominations
getProtoRevPool: {
    path: '/osmosis.protorev.v1beta1.Query/GetProtoRevPool',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolRequest,
    responseType: osmosis_protorev_v1beta1_query_pb.QueryGetProtoRevPoolResponse,
    requestSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolRequest,
    requestDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolRequest,
    responseSerialize: serialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolResponse,
    responseDeserialize: deserialize_osmosis_protorev_v1beta1_QueryGetProtoRevPoolResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
