// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_pool$incentives_v1beta1_query_pb = require('../../../osmosis/pool-incentives/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var osmosis_incentives_gauge_pb = require('../../../osmosis/incentives/gauge_pb.js');
var osmosis_pool$incentives_v1beta1_incentives_pb = require('../../../osmosis/pool-incentives/v1beta1/incentives_pb.js');

function serialize_osmosis_poolincentives_v1beta1_QueryDistrInfoRequest(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryDistrInfoRequest)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryDistrInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryDistrInfoRequest(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryDistrInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolincentives_v1beta1_QueryDistrInfoResponse(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryDistrInfoResponse)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryDistrInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryDistrInfoResponse(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryDistrInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolincentives_v1beta1_QueryExternalIncentiveGaugesRequest(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryExternalIncentiveGaugesRequest)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryExternalIncentiveGaugesRequest(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryExternalIncentiveGaugesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolincentives_v1beta1_QueryExternalIncentiveGaugesResponse(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryExternalIncentiveGaugesResponse)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryExternalIncentiveGaugesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryExternalIncentiveGaugesResponse(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryExternalIncentiveGaugesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolincentives_v1beta1_QueryGaugeIdsRequest(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryGaugeIdsRequest)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryGaugeIdsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryGaugeIdsRequest(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryGaugeIdsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolincentives_v1beta1_QueryGaugeIdsResponse(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryGaugeIdsResponse)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryGaugeIdsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryGaugeIdsResponse(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryGaugeIdsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsRequest(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryIncentivizedPoolsRequest)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsRequest(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryIncentivizedPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsResponse(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryIncentivizedPoolsResponse)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryIncentivizedPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsResponse(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryIncentivizedPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolincentives_v1beta1_QueryLockableDurationsRequest(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryLockableDurationsRequest)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryLockableDurationsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryLockableDurationsRequest(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryLockableDurationsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolincentives_v1beta1_QueryLockableDurationsResponse(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryLockableDurationsResponse)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryLockableDurationsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryLockableDurationsResponse(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryLockableDurationsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolincentives_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryParamsRequest(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_poolincentives_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof osmosis_pool$incentives_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type osmosis.poolincentives.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_poolincentives_v1beta1_QueryParamsResponse(buffer_arg) {
  return osmosis_pool$incentives_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  // GaugeIds takes the pool id and returns the matching gauge ids and durations
gaugeIds: {
    path: '/osmosis.poolincentives.v1beta1.Query/GaugeIds',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_pool$incentives_v1beta1_query_pb.QueryGaugeIdsRequest,
    responseType: osmosis_pool$incentives_v1beta1_query_pb.QueryGaugeIdsResponse,
    requestSerialize: serialize_osmosis_poolincentives_v1beta1_QueryGaugeIdsRequest,
    requestDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryGaugeIdsRequest,
    responseSerialize: serialize_osmosis_poolincentives_v1beta1_QueryGaugeIdsResponse,
    responseDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryGaugeIdsResponse,
  },
  // DistrInfo returns the pool's matching gauge ids and weights.
distrInfo: {
    path: '/osmosis.poolincentives.v1beta1.Query/DistrInfo',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_pool$incentives_v1beta1_query_pb.QueryDistrInfoRequest,
    responseType: osmosis_pool$incentives_v1beta1_query_pb.QueryDistrInfoResponse,
    requestSerialize: serialize_osmosis_poolincentives_v1beta1_QueryDistrInfoRequest,
    requestDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryDistrInfoRequest,
    responseSerialize: serialize_osmosis_poolincentives_v1beta1_QueryDistrInfoResponse,
    responseDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryDistrInfoResponse,
  },
  // Params returns pool incentives params.
params: {
    path: '/osmosis.poolincentives.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_pool$incentives_v1beta1_query_pb.QueryParamsRequest,
    responseType: osmosis_pool$incentives_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_osmosis_poolincentives_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_osmosis_poolincentives_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryParamsResponse,
  },
  // LockableDurations returns lock durations for pools.
lockableDurations: {
    path: '/osmosis.poolincentives.v1beta1.Query/LockableDurations',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_pool$incentives_v1beta1_query_pb.QueryLockableDurationsRequest,
    responseType: osmosis_pool$incentives_v1beta1_query_pb.QueryLockableDurationsResponse,
    requestSerialize: serialize_osmosis_poolincentives_v1beta1_QueryLockableDurationsRequest,
    requestDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryLockableDurationsRequest,
    responseSerialize: serialize_osmosis_poolincentives_v1beta1_QueryLockableDurationsResponse,
    responseDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryLockableDurationsResponse,
  },
  // IncentivizedPools returns currently incentivized pools
incentivizedPools: {
    path: '/osmosis.poolincentives.v1beta1.Query/IncentivizedPools',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_pool$incentives_v1beta1_query_pb.QueryIncentivizedPoolsRequest,
    responseType: osmosis_pool$incentives_v1beta1_query_pb.QueryIncentivizedPoolsResponse,
    requestSerialize: serialize_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsRequest,
    requestDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsRequest,
    responseSerialize: serialize_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsResponse,
    responseDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryIncentivizedPoolsResponse,
  },
  // ExternalIncentiveGauges returns external incentive gauges.
externalIncentiveGauges: {
    path: '/osmosis.poolincentives.v1beta1.Query/ExternalIncentiveGauges',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_pool$incentives_v1beta1_query_pb.QueryExternalIncentiveGaugesRequest,
    responseType: osmosis_pool$incentives_v1beta1_query_pb.QueryExternalIncentiveGaugesResponse,
    requestSerialize: serialize_osmosis_poolincentives_v1beta1_QueryExternalIncentiveGaugesRequest,
    requestDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryExternalIncentiveGaugesRequest,
    responseSerialize: serialize_osmosis_poolincentives_v1beta1_QueryExternalIncentiveGaugesResponse,
    responseDeserialize: deserialize_osmosis_poolincentives_v1beta1_QueryExternalIncentiveGaugesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
