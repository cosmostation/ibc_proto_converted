// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var persistence_oracle_v1beta1_query_pb = require('../../../persistence/oracle/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var persistence_oracle_v1beta1_oracle_pb = require('../../../persistence/oracle/v1beta1/oracle_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_persistence_oracle_v1beta1_QueryActiveExchangeRatesRequest(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryActiveExchangeRatesRequest)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryActiveExchangeRatesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryActiveExchangeRatesRequest(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryActiveExchangeRatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryActiveExchangeRatesResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryActiveExchangeRatesResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryActiveExchangeRatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryActiveExchangeRatesResponse(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryActiveExchangeRatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryAggregatePrevoteRequest(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryAggregatePrevoteRequest)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryAggregatePrevoteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryAggregatePrevoteRequest(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryAggregatePrevoteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryAggregatePrevoteResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryAggregatePrevoteResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryAggregatePrevoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryAggregatePrevoteResponse(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryAggregatePrevoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryAggregatePrevotesRequest(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryAggregatePrevotesRequest)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryAggregatePrevotesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryAggregatePrevotesRequest(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryAggregatePrevotesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryAggregatePrevotesResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryAggregatePrevotesResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryAggregatePrevotesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryAggregatePrevotesResponse(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryAggregatePrevotesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryAggregateVoteRequest(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryAggregateVoteRequest)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryAggregateVoteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryAggregateVoteRequest(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryAggregateVoteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryAggregateVoteResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryAggregateVoteResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryAggregateVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryAggregateVoteResponse(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryAggregateVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryAggregateVotesRequest(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryAggregateVotesRequest)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryAggregateVotesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryAggregateVotesRequest(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryAggregateVotesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryAggregateVotesResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryAggregateVotesResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryAggregateVotesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryAggregateVotesResponse(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryAggregateVotesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryAllExchangeRatesRequest(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryAllExchangeRatesRequest)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryAllExchangeRatesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryAllExchangeRatesRequest(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryAllExchangeRatesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryAllExchangeRatesResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryAllExchangeRatesResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryAllExchangeRatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryAllExchangeRatesResponse(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryAllExchangeRatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryExchangeRateRequest(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryExchangeRateRequest)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryExchangeRateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryExchangeRateRequest(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryExchangeRateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryExchangeRateResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryExchangeRateResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryExchangeRateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryExchangeRateResponse(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryExchangeRateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryFeederDelegationRequest(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryFeederDelegationRequest)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryFeederDelegationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryFeederDelegationRequest(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryFeederDelegationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryFeederDelegationResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryFeederDelegationResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryFeederDelegationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryFeederDelegationResponse(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryFeederDelegationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryMissCounterRequest(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryMissCounterRequest)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryMissCounterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryMissCounterRequest(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryMissCounterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryMissCounterResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryMissCounterResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryMissCounterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryMissCounterResponse(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryMissCounterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryParamsRequest(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryParamsResponse(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryRewardPoolBalanceRequest(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryRewardPoolBalanceRequest)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryRewardPoolBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryRewardPoolBalanceRequest(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryRewardPoolBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_QueryRewardPoolBalanceResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_query_pb.QueryRewardPoolBalanceResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.QueryRewardPoolBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_QueryRewardPoolBalanceResponse(buffer_arg) {
  return persistence_oracle_v1beta1_query_pb.QueryRewardPoolBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // ExchangeRates returns exchange rates of all denoms.
allExchangeRates: {
    path: '/persistence.oracle.v1beta1.Query/AllExchangeRates',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_query_pb.QueryAllExchangeRatesRequest,
    responseType: persistence_oracle_v1beta1_query_pb.QueryAllExchangeRatesResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_QueryAllExchangeRatesRequest,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_QueryAllExchangeRatesRequest,
    responseSerialize: serialize_persistence_oracle_v1beta1_QueryAllExchangeRatesResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_QueryAllExchangeRatesResponse,
  },
  // ExchangeRate returns exchange rates of a specified denom.
exchangeRate: {
    path: '/persistence.oracle.v1beta1.Query/ExchangeRate',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_query_pb.QueryExchangeRateRequest,
    responseType: persistence_oracle_v1beta1_query_pb.QueryExchangeRateResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_QueryExchangeRateRequest,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_QueryExchangeRateRequest,
    responseSerialize: serialize_persistence_oracle_v1beta1_QueryExchangeRateResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_QueryExchangeRateResponse,
  },
  // ActiveExchangeRates returns all active denoms
activeExchangeRates: {
    path: '/persistence.oracle.v1beta1.Query/ActiveExchangeRates',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_query_pb.QueryActiveExchangeRatesRequest,
    responseType: persistence_oracle_v1beta1_query_pb.QueryActiveExchangeRatesResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_QueryActiveExchangeRatesRequest,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_QueryActiveExchangeRatesRequest,
    responseSerialize: serialize_persistence_oracle_v1beta1_QueryActiveExchangeRatesResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_QueryActiveExchangeRatesResponse,
  },
  // FeederDelegation returns feeder delegation of a validator
feederDelegation: {
    path: '/persistence.oracle.v1beta1.Query/FeederDelegation',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_query_pb.QueryFeederDelegationRequest,
    responseType: persistence_oracle_v1beta1_query_pb.QueryFeederDelegationResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_QueryFeederDelegationRequest,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_QueryFeederDelegationRequest,
    responseSerialize: serialize_persistence_oracle_v1beta1_QueryFeederDelegationResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_QueryFeederDelegationResponse,
  },
  // MissCounter returns oracle miss counter of a validator
missCounter: {
    path: '/persistence.oracle.v1beta1.Query/MissCounter',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_query_pb.QueryMissCounterRequest,
    responseType: persistence_oracle_v1beta1_query_pb.QueryMissCounterResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_QueryMissCounterRequest,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_QueryMissCounterRequest,
    responseSerialize: serialize_persistence_oracle_v1beta1_QueryMissCounterResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_QueryMissCounterResponse,
  },
  // AggregatePrevote returns an aggregate prevote of a validator
aggregatePrevote: {
    path: '/persistence.oracle.v1beta1.Query/AggregatePrevote',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_query_pb.QueryAggregatePrevoteRequest,
    responseType: persistence_oracle_v1beta1_query_pb.QueryAggregatePrevoteResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_QueryAggregatePrevoteRequest,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_QueryAggregatePrevoteRequest,
    responseSerialize: serialize_persistence_oracle_v1beta1_QueryAggregatePrevoteResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_QueryAggregatePrevoteResponse,
  },
  // AggregatePrevotes returns aggregate prevotes of all validators
aggregatePrevotes: {
    path: '/persistence.oracle.v1beta1.Query/AggregatePrevotes',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_query_pb.QueryAggregatePrevotesRequest,
    responseType: persistence_oracle_v1beta1_query_pb.QueryAggregatePrevotesResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_QueryAggregatePrevotesRequest,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_QueryAggregatePrevotesRequest,
    responseSerialize: serialize_persistence_oracle_v1beta1_QueryAggregatePrevotesResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_QueryAggregatePrevotesResponse,
  },
  // AggregateVote returns an aggregate vote of a validator
aggregateVote: {
    path: '/persistence.oracle.v1beta1.Query/AggregateVote',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_query_pb.QueryAggregateVoteRequest,
    responseType: persistence_oracle_v1beta1_query_pb.QueryAggregateVoteResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_QueryAggregateVoteRequest,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_QueryAggregateVoteRequest,
    responseSerialize: serialize_persistence_oracle_v1beta1_QueryAggregateVoteResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_QueryAggregateVoteResponse,
  },
  // AggregateVotes returns aggregate votes of all validators
aggregateVotes: {
    path: '/persistence.oracle.v1beta1.Query/AggregateVotes',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_query_pb.QueryAggregateVotesRequest,
    responseType: persistence_oracle_v1beta1_query_pb.QueryAggregateVotesResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_QueryAggregateVotesRequest,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_QueryAggregateVotesRequest,
    responseSerialize: serialize_persistence_oracle_v1beta1_QueryAggregateVotesResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_QueryAggregateVotesResponse,
  },
  // Params queries all parameters.
params: {
    path: '/persistence.oracle.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_query_pb.QueryParamsRequest,
    responseType: persistence_oracle_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_persistence_oracle_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_QueryParamsResponse,
  },
  // QueryRewardPoolBalance queries funds left in the reward pool.
queryRewardPoolBalance: {
    path: '/persistence.oracle.v1beta1.Query/QueryRewardPoolBalance',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_query_pb.QueryRewardPoolBalanceRequest,
    responseType: persistence_oracle_v1beta1_query_pb.QueryRewardPoolBalanceResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_QueryRewardPoolBalanceRequest,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_QueryRewardPoolBalanceRequest,
    responseSerialize: serialize_persistence_oracle_v1beta1_QueryRewardPoolBalanceResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_QueryRewardPoolBalanceResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
