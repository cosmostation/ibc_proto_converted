// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sommelier_cellarfees_v1_query_pb = require('../../../sommelier/cellarfees/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var sommelier_cellarfees_v1_params_pb = require('../../../sommelier/cellarfees/v1/params_pb.js');
var sommelier_cellarfees_v1_cellarfees_pb = require('../../../sommelier/cellarfees/v1/cellarfees_pb.js');

function serialize_cellarfees_v1_QueryAPYRequest(arg) {
  if (!(arg instanceof sommelier_cellarfees_v1_query_pb.QueryAPYRequest)) {
    throw new Error('Expected argument of type cellarfees.v1.QueryAPYRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cellarfees_v1_QueryAPYRequest(buffer_arg) {
  return sommelier_cellarfees_v1_query_pb.QueryAPYRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cellarfees_v1_QueryAPYResponse(arg) {
  if (!(arg instanceof sommelier_cellarfees_v1_query_pb.QueryAPYResponse)) {
    throw new Error('Expected argument of type cellarfees.v1.QueryAPYResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cellarfees_v1_QueryAPYResponse(buffer_arg) {
  return sommelier_cellarfees_v1_query_pb.QueryAPYResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cellarfees_v1_QueryFeeAccrualCountersRequest(arg) {
  if (!(arg instanceof sommelier_cellarfees_v1_query_pb.QueryFeeAccrualCountersRequest)) {
    throw new Error('Expected argument of type cellarfees.v1.QueryFeeAccrualCountersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cellarfees_v1_QueryFeeAccrualCountersRequest(buffer_arg) {
  return sommelier_cellarfees_v1_query_pb.QueryFeeAccrualCountersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cellarfees_v1_QueryFeeAccrualCountersResponse(arg) {
  if (!(arg instanceof sommelier_cellarfees_v1_query_pb.QueryFeeAccrualCountersResponse)) {
    throw new Error('Expected argument of type cellarfees.v1.QueryFeeAccrualCountersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cellarfees_v1_QueryFeeAccrualCountersResponse(buffer_arg) {
  return sommelier_cellarfees_v1_query_pb.QueryFeeAccrualCountersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cellarfees_v1_QueryLastRewardSupplyPeakRequest(arg) {
  if (!(arg instanceof sommelier_cellarfees_v1_query_pb.QueryLastRewardSupplyPeakRequest)) {
    throw new Error('Expected argument of type cellarfees.v1.QueryLastRewardSupplyPeakRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cellarfees_v1_QueryLastRewardSupplyPeakRequest(buffer_arg) {
  return sommelier_cellarfees_v1_query_pb.QueryLastRewardSupplyPeakRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cellarfees_v1_QueryLastRewardSupplyPeakResponse(arg) {
  if (!(arg instanceof sommelier_cellarfees_v1_query_pb.QueryLastRewardSupplyPeakResponse)) {
    throw new Error('Expected argument of type cellarfees.v1.QueryLastRewardSupplyPeakResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cellarfees_v1_QueryLastRewardSupplyPeakResponse(buffer_arg) {
  return sommelier_cellarfees_v1_query_pb.QueryLastRewardSupplyPeakResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cellarfees_v1_QueryModuleAccountsRequest(arg) {
  if (!(arg instanceof sommelier_cellarfees_v1_query_pb.QueryModuleAccountsRequest)) {
    throw new Error('Expected argument of type cellarfees.v1.QueryModuleAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cellarfees_v1_QueryModuleAccountsRequest(buffer_arg) {
  return sommelier_cellarfees_v1_query_pb.QueryModuleAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cellarfees_v1_QueryModuleAccountsResponse(arg) {
  if (!(arg instanceof sommelier_cellarfees_v1_query_pb.QueryModuleAccountsResponse)) {
    throw new Error('Expected argument of type cellarfees.v1.QueryModuleAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cellarfees_v1_QueryModuleAccountsResponse(buffer_arg) {
  return sommelier_cellarfees_v1_query_pb.QueryModuleAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cellarfees_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof sommelier_cellarfees_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type cellarfees.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cellarfees_v1_QueryParamsRequest(buffer_arg) {
  return sommelier_cellarfees_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cellarfees_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof sommelier_cellarfees_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type cellarfees.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cellarfees_v1_QueryParamsResponse(buffer_arg) {
  return sommelier_cellarfees_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  queryParams: {
    path: '/cellarfees.v1.Query/QueryParams',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cellarfees_v1_query_pb.QueryParamsRequest,
    responseType: sommelier_cellarfees_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_cellarfees_v1_QueryParamsRequest,
    requestDeserialize: deserialize_cellarfees_v1_QueryParamsRequest,
    responseSerialize: serialize_cellarfees_v1_QueryParamsResponse,
    responseDeserialize: deserialize_cellarfees_v1_QueryParamsResponse,
  },
  queryModuleAccounts: {
    path: '/cellarfees.v1.Query/QueryModuleAccounts',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cellarfees_v1_query_pb.QueryModuleAccountsRequest,
    responseType: sommelier_cellarfees_v1_query_pb.QueryModuleAccountsResponse,
    requestSerialize: serialize_cellarfees_v1_QueryModuleAccountsRequest,
    requestDeserialize: deserialize_cellarfees_v1_QueryModuleAccountsRequest,
    responseSerialize: serialize_cellarfees_v1_QueryModuleAccountsResponse,
    responseDeserialize: deserialize_cellarfees_v1_QueryModuleAccountsResponse,
  },
  queryLastRewardSupplyPeak: {
    path: '/cellarfees.v1.Query/QueryLastRewardSupplyPeak',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cellarfees_v1_query_pb.QueryLastRewardSupplyPeakRequest,
    responseType: sommelier_cellarfees_v1_query_pb.QueryLastRewardSupplyPeakResponse,
    requestSerialize: serialize_cellarfees_v1_QueryLastRewardSupplyPeakRequest,
    requestDeserialize: deserialize_cellarfees_v1_QueryLastRewardSupplyPeakRequest,
    responseSerialize: serialize_cellarfees_v1_QueryLastRewardSupplyPeakResponse,
    responseDeserialize: deserialize_cellarfees_v1_QueryLastRewardSupplyPeakResponse,
  },
  queryFeeAccrualCounters: {
    path: '/cellarfees.v1.Query/QueryFeeAccrualCounters',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cellarfees_v1_query_pb.QueryFeeAccrualCountersRequest,
    responseType: sommelier_cellarfees_v1_query_pb.QueryFeeAccrualCountersResponse,
    requestSerialize: serialize_cellarfees_v1_QueryFeeAccrualCountersRequest,
    requestDeserialize: deserialize_cellarfees_v1_QueryFeeAccrualCountersRequest,
    responseSerialize: serialize_cellarfees_v1_QueryFeeAccrualCountersResponse,
    responseDeserialize: deserialize_cellarfees_v1_QueryFeeAccrualCountersResponse,
  },
  queryAPY: {
    path: '/cellarfees.v1.Query/QueryAPY',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cellarfees_v1_query_pb.QueryAPYRequest,
    responseType: sommelier_cellarfees_v1_query_pb.QueryAPYResponse,
    requestSerialize: serialize_cellarfees_v1_QueryAPYRequest,
    requestDeserialize: deserialize_cellarfees_v1_QueryAPYRequest,
    responseSerialize: serialize_cellarfees_v1_QueryAPYResponse,
    responseDeserialize: deserialize_cellarfees_v1_QueryAPYResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
