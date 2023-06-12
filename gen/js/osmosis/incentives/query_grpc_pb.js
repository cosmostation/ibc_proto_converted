// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_incentives_query_pb = require('../../osmosis/incentives/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var osmosis_incentives_gauge_pb = require('../../osmosis/incentives/gauge_pb.js');
var osmosis_lockup_lock_pb = require('../../osmosis/lockup/lock_pb.js');

function serialize_osmosis_incentives_ActiveGaugesPerDenomRequest(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.ActiveGaugesPerDenomRequest)) {
    throw new Error('Expected argument of type osmosis.incentives.ActiveGaugesPerDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_ActiveGaugesPerDenomRequest(buffer_arg) {
  return osmosis_incentives_query_pb.ActiveGaugesPerDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_ActiveGaugesPerDenomResponse(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.ActiveGaugesPerDenomResponse)) {
    throw new Error('Expected argument of type osmosis.incentives.ActiveGaugesPerDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_ActiveGaugesPerDenomResponse(buffer_arg) {
  return osmosis_incentives_query_pb.ActiveGaugesPerDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_ActiveGaugesRequest(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.ActiveGaugesRequest)) {
    throw new Error('Expected argument of type osmosis.incentives.ActiveGaugesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_ActiveGaugesRequest(buffer_arg) {
  return osmosis_incentives_query_pb.ActiveGaugesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_ActiveGaugesResponse(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.ActiveGaugesResponse)) {
    throw new Error('Expected argument of type osmosis.incentives.ActiveGaugesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_ActiveGaugesResponse(buffer_arg) {
  return osmosis_incentives_query_pb.ActiveGaugesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_GaugeByIDRequest(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.GaugeByIDRequest)) {
    throw new Error('Expected argument of type osmosis.incentives.GaugeByIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_GaugeByIDRequest(buffer_arg) {
  return osmosis_incentives_query_pb.GaugeByIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_GaugeByIDResponse(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.GaugeByIDResponse)) {
    throw new Error('Expected argument of type osmosis.incentives.GaugeByIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_GaugeByIDResponse(buffer_arg) {
  return osmosis_incentives_query_pb.GaugeByIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_GaugesRequest(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.GaugesRequest)) {
    throw new Error('Expected argument of type osmosis.incentives.GaugesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_GaugesRequest(buffer_arg) {
  return osmosis_incentives_query_pb.GaugesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_GaugesResponse(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.GaugesResponse)) {
    throw new Error('Expected argument of type osmosis.incentives.GaugesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_GaugesResponse(buffer_arg) {
  return osmosis_incentives_query_pb.GaugesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_ModuleToDistributeCoinsRequest(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.ModuleToDistributeCoinsRequest)) {
    throw new Error('Expected argument of type osmosis.incentives.ModuleToDistributeCoinsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_ModuleToDistributeCoinsRequest(buffer_arg) {
  return osmosis_incentives_query_pb.ModuleToDistributeCoinsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_ModuleToDistributeCoinsResponse(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.ModuleToDistributeCoinsResponse)) {
    throw new Error('Expected argument of type osmosis.incentives.ModuleToDistributeCoinsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_ModuleToDistributeCoinsResponse(buffer_arg) {
  return osmosis_incentives_query_pb.ModuleToDistributeCoinsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_QueryLockableDurationsRequest(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.QueryLockableDurationsRequest)) {
    throw new Error('Expected argument of type osmosis.incentives.QueryLockableDurationsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_QueryLockableDurationsRequest(buffer_arg) {
  return osmosis_incentives_query_pb.QueryLockableDurationsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_QueryLockableDurationsResponse(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.QueryLockableDurationsResponse)) {
    throw new Error('Expected argument of type osmosis.incentives.QueryLockableDurationsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_QueryLockableDurationsResponse(buffer_arg) {
  return osmosis_incentives_query_pb.QueryLockableDurationsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_RewardsEstRequest(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.RewardsEstRequest)) {
    throw new Error('Expected argument of type osmosis.incentives.RewardsEstRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_RewardsEstRequest(buffer_arg) {
  return osmosis_incentives_query_pb.RewardsEstRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_RewardsEstResponse(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.RewardsEstResponse)) {
    throw new Error('Expected argument of type osmosis.incentives.RewardsEstResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_RewardsEstResponse(buffer_arg) {
  return osmosis_incentives_query_pb.RewardsEstResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_UpcomingGaugesPerDenomRequest(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.UpcomingGaugesPerDenomRequest)) {
    throw new Error('Expected argument of type osmosis.incentives.UpcomingGaugesPerDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_UpcomingGaugesPerDenomRequest(buffer_arg) {
  return osmosis_incentives_query_pb.UpcomingGaugesPerDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_UpcomingGaugesPerDenomResponse(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.UpcomingGaugesPerDenomResponse)) {
    throw new Error('Expected argument of type osmosis.incentives.UpcomingGaugesPerDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_UpcomingGaugesPerDenomResponse(buffer_arg) {
  return osmosis_incentives_query_pb.UpcomingGaugesPerDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_UpcomingGaugesRequest(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.UpcomingGaugesRequest)) {
    throw new Error('Expected argument of type osmosis.incentives.UpcomingGaugesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_UpcomingGaugesRequest(buffer_arg) {
  return osmosis_incentives_query_pb.UpcomingGaugesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_incentives_UpcomingGaugesResponse(arg) {
  if (!(arg instanceof osmosis_incentives_query_pb.UpcomingGaugesResponse)) {
    throw new Error('Expected argument of type osmosis.incentives.UpcomingGaugesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_incentives_UpcomingGaugesResponse(buffer_arg) {
  return osmosis_incentives_query_pb.UpcomingGaugesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // ModuleToDistributeCoins returns coins that are going to be distributed
moduleToDistributeCoins: {
    path: '/osmosis.incentives.Query/ModuleToDistributeCoins',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_incentives_query_pb.ModuleToDistributeCoinsRequest,
    responseType: osmosis_incentives_query_pb.ModuleToDistributeCoinsResponse,
    requestSerialize: serialize_osmosis_incentives_ModuleToDistributeCoinsRequest,
    requestDeserialize: deserialize_osmosis_incentives_ModuleToDistributeCoinsRequest,
    responseSerialize: serialize_osmosis_incentives_ModuleToDistributeCoinsResponse,
    responseDeserialize: deserialize_osmosis_incentives_ModuleToDistributeCoinsResponse,
  },
  // GaugeByID returns gauges by their respective ID
gaugeByID: {
    path: '/osmosis.incentives.Query/GaugeByID',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_incentives_query_pb.GaugeByIDRequest,
    responseType: osmosis_incentives_query_pb.GaugeByIDResponse,
    requestSerialize: serialize_osmosis_incentives_GaugeByIDRequest,
    requestDeserialize: deserialize_osmosis_incentives_GaugeByIDRequest,
    responseSerialize: serialize_osmosis_incentives_GaugeByIDResponse,
    responseDeserialize: deserialize_osmosis_incentives_GaugeByIDResponse,
  },
  // Gauges returns both upcoming and active gauges
gauges: {
    path: '/osmosis.incentives.Query/Gauges',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_incentives_query_pb.GaugesRequest,
    responseType: osmosis_incentives_query_pb.GaugesResponse,
    requestSerialize: serialize_osmosis_incentives_GaugesRequest,
    requestDeserialize: deserialize_osmosis_incentives_GaugesRequest,
    responseSerialize: serialize_osmosis_incentives_GaugesResponse,
    responseDeserialize: deserialize_osmosis_incentives_GaugesResponse,
  },
  // ActiveGauges returns active gauges
activeGauges: {
    path: '/osmosis.incentives.Query/ActiveGauges',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_incentives_query_pb.ActiveGaugesRequest,
    responseType: osmosis_incentives_query_pb.ActiveGaugesResponse,
    requestSerialize: serialize_osmosis_incentives_ActiveGaugesRequest,
    requestDeserialize: deserialize_osmosis_incentives_ActiveGaugesRequest,
    responseSerialize: serialize_osmosis_incentives_ActiveGaugesResponse,
    responseDeserialize: deserialize_osmosis_incentives_ActiveGaugesResponse,
  },
  // ActiveGaugesPerDenom returns active gauges by denom
activeGaugesPerDenom: {
    path: '/osmosis.incentives.Query/ActiveGaugesPerDenom',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_incentives_query_pb.ActiveGaugesPerDenomRequest,
    responseType: osmosis_incentives_query_pb.ActiveGaugesPerDenomResponse,
    requestSerialize: serialize_osmosis_incentives_ActiveGaugesPerDenomRequest,
    requestDeserialize: deserialize_osmosis_incentives_ActiveGaugesPerDenomRequest,
    responseSerialize: serialize_osmosis_incentives_ActiveGaugesPerDenomResponse,
    responseDeserialize: deserialize_osmosis_incentives_ActiveGaugesPerDenomResponse,
  },
  // Returns scheduled gauges that have not yet occured
upcomingGauges: {
    path: '/osmosis.incentives.Query/UpcomingGauges',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_incentives_query_pb.UpcomingGaugesRequest,
    responseType: osmosis_incentives_query_pb.UpcomingGaugesResponse,
    requestSerialize: serialize_osmosis_incentives_UpcomingGaugesRequest,
    requestDeserialize: deserialize_osmosis_incentives_UpcomingGaugesRequest,
    responseSerialize: serialize_osmosis_incentives_UpcomingGaugesResponse,
    responseDeserialize: deserialize_osmosis_incentives_UpcomingGaugesResponse,
  },
  // UpcomingGaugesPerDenom returns scheduled gauges that have not yet occured
// by denom
upcomingGaugesPerDenom: {
    path: '/osmosis.incentives.Query/UpcomingGaugesPerDenom',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_incentives_query_pb.UpcomingGaugesPerDenomRequest,
    responseType: osmosis_incentives_query_pb.UpcomingGaugesPerDenomResponse,
    requestSerialize: serialize_osmosis_incentives_UpcomingGaugesPerDenomRequest,
    requestDeserialize: deserialize_osmosis_incentives_UpcomingGaugesPerDenomRequest,
    responseSerialize: serialize_osmosis_incentives_UpcomingGaugesPerDenomResponse,
    responseDeserialize: deserialize_osmosis_incentives_UpcomingGaugesPerDenomResponse,
  },
  // RewardsEst returns an estimate of the rewards from now until a specified
// time in the future The querier either provides an address or a set of locks
// for which they want to find the associated rewards
rewardsEst: {
    path: '/osmosis.incentives.Query/RewardsEst',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_incentives_query_pb.RewardsEstRequest,
    responseType: osmosis_incentives_query_pb.RewardsEstResponse,
    requestSerialize: serialize_osmosis_incentives_RewardsEstRequest,
    requestDeserialize: deserialize_osmosis_incentives_RewardsEstRequest,
    responseSerialize: serialize_osmosis_incentives_RewardsEstResponse,
    responseDeserialize: deserialize_osmosis_incentives_RewardsEstResponse,
  },
  // LockableDurations returns lockable durations that are valid to distribute
// incentives for
lockableDurations: {
    path: '/osmosis.incentives.Query/LockableDurations',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_incentives_query_pb.QueryLockableDurationsRequest,
    responseType: osmosis_incentives_query_pb.QueryLockableDurationsResponse,
    requestSerialize: serialize_osmosis_incentives_QueryLockableDurationsRequest,
    requestDeserialize: deserialize_osmosis_incentives_QueryLockableDurationsRequest,
    responseSerialize: serialize_osmosis_incentives_QueryLockableDurationsResponse,
    responseDeserialize: deserialize_osmosis_incentives_QueryLockableDurationsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
