// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var umee_oracle_v1_query_pb = require('../../../umee/oracle/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var umee_oracle_v1_oracle_pb = require('../../../umee/oracle/v1/oracle_pb.js');
var umee_oracle_v1_genesis_pb = require('../../../umee/oracle/v1/genesis_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_umee_oracle_v1_QueryActiveExchangeRates(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryActiveExchangeRates)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryActiveExchangeRates');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryActiveExchangeRates(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryActiveExchangeRates.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryActiveExchangeRatesResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryActiveExchangeRatesResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryActiveExchangeRatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryActiveExchangeRatesResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryActiveExchangeRatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryAggregatePrevote(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryAggregatePrevote)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryAggregatePrevote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryAggregatePrevote(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryAggregatePrevote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryAggregatePrevoteResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryAggregatePrevoteResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryAggregatePrevoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryAggregatePrevoteResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryAggregatePrevoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryAggregatePrevotes(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryAggregatePrevotes)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryAggregatePrevotes');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryAggregatePrevotes(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryAggregatePrevotes.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryAggregatePrevotesResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryAggregatePrevotesResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryAggregatePrevotesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryAggregatePrevotesResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryAggregatePrevotesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryAggregateVote(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryAggregateVote)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryAggregateVote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryAggregateVote(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryAggregateVote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryAggregateVoteResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryAggregateVoteResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryAggregateVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryAggregateVoteResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryAggregateVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryAggregateVotes(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryAggregateVotes)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryAggregateVotes');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryAggregateVotes(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryAggregateVotes.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryAggregateVotesResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryAggregateVotesResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryAggregateVotesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryAggregateVotesResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryAggregateVotesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryAvgPrice(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryAvgPrice)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryAvgPrice');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryAvgPrice(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryAvgPrice.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryAvgPriceResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryAvgPriceResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryAvgPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryAvgPriceResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryAvgPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryExchangeRates(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryExchangeRates)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryExchangeRates');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryExchangeRates(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryExchangeRates.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryExchangeRatesResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryExchangeRatesResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryExchangeRatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryExchangeRatesResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryExchangeRatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryFeederDelegation(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryFeederDelegation)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryFeederDelegation');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryFeederDelegation(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryFeederDelegation.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryFeederDelegationResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryFeederDelegationResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryFeederDelegationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryFeederDelegationResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryFeederDelegationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryMedianDeviations(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryMedianDeviations)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryMedianDeviations');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryMedianDeviations(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryMedianDeviations.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryMedianDeviationsResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryMedianDeviationsResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryMedianDeviationsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryMedianDeviationsResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryMedianDeviationsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryMedians(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryMedians)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryMedians');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryMedians(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryMedians.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryMediansResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryMediansResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryMediansResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryMediansResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryMediansResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryMissCounter(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryMissCounter)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryMissCounter');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryMissCounter(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryMissCounter.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryMissCounterResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryMissCounterResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryMissCounterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryMissCounterResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryMissCounterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryParams(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryParams)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryParams(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QueryParamsResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QuerySlashWindow(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QuerySlashWindow)) {
    throw new Error('Expected argument of type umee.oracle.v1.QuerySlashWindow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QuerySlashWindow(buffer_arg) {
  return umee_oracle_v1_query_pb.QuerySlashWindow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_QuerySlashWindowResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_query_pb.QuerySlashWindowResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.QuerySlashWindowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_QuerySlashWindowResponse(buffer_arg) {
  return umee_oracle_v1_query_pb.QuerySlashWindowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // ExchangeRates returns exchange rates of all denoms,
// or, if specified, returns a single denom
exchangeRates: {
    path: '/umee.oracle.v1.Query/ExchangeRates',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryExchangeRates,
    responseType: umee_oracle_v1_query_pb.QueryExchangeRatesResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryExchangeRates,
    requestDeserialize: deserialize_umee_oracle_v1_QueryExchangeRates,
    responseSerialize: serialize_umee_oracle_v1_QueryExchangeRatesResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryExchangeRatesResponse,
  },
  // ActiveExchangeRates returns all active denoms
activeExchangeRates: {
    path: '/umee.oracle.v1.Query/ActiveExchangeRates',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryActiveExchangeRates,
    responseType: umee_oracle_v1_query_pb.QueryActiveExchangeRatesResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryActiveExchangeRates,
    requestDeserialize: deserialize_umee_oracle_v1_QueryActiveExchangeRates,
    responseSerialize: serialize_umee_oracle_v1_QueryActiveExchangeRatesResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryActiveExchangeRatesResponse,
  },
  // FeederDelegation returns feeder delegation of a validator
feederDelegation: {
    path: '/umee.oracle.v1.Query/FeederDelegation',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryFeederDelegation,
    responseType: umee_oracle_v1_query_pb.QueryFeederDelegationResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryFeederDelegation,
    requestDeserialize: deserialize_umee_oracle_v1_QueryFeederDelegation,
    responseSerialize: serialize_umee_oracle_v1_QueryFeederDelegationResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryFeederDelegationResponse,
  },
  // MissCounter returns oracle miss counter of a validator
missCounter: {
    path: '/umee.oracle.v1.Query/MissCounter',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryMissCounter,
    responseType: umee_oracle_v1_query_pb.QueryMissCounterResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryMissCounter,
    requestDeserialize: deserialize_umee_oracle_v1_QueryMissCounter,
    responseSerialize: serialize_umee_oracle_v1_QueryMissCounterResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryMissCounterResponse,
  },
  // SlashWindow returns slash window information
slashWindow: {
    path: '/umee.oracle.v1.Query/SlashWindow',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QuerySlashWindow,
    responseType: umee_oracle_v1_query_pb.QuerySlashWindowResponse,
    requestSerialize: serialize_umee_oracle_v1_QuerySlashWindow,
    requestDeserialize: deserialize_umee_oracle_v1_QuerySlashWindow,
    responseSerialize: serialize_umee_oracle_v1_QuerySlashWindowResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QuerySlashWindowResponse,
  },
  // AggregatePrevote returns an aggregate prevote of a validator
aggregatePrevote: {
    path: '/umee.oracle.v1.Query/AggregatePrevote',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryAggregatePrevote,
    responseType: umee_oracle_v1_query_pb.QueryAggregatePrevoteResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryAggregatePrevote,
    requestDeserialize: deserialize_umee_oracle_v1_QueryAggregatePrevote,
    responseSerialize: serialize_umee_oracle_v1_QueryAggregatePrevoteResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryAggregatePrevoteResponse,
  },
  // AggregatePrevotes returns aggregate prevotes of all validators
aggregatePrevotes: {
    path: '/umee.oracle.v1.Query/AggregatePrevotes',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryAggregatePrevotes,
    responseType: umee_oracle_v1_query_pb.QueryAggregatePrevotesResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryAggregatePrevotes,
    requestDeserialize: deserialize_umee_oracle_v1_QueryAggregatePrevotes,
    responseSerialize: serialize_umee_oracle_v1_QueryAggregatePrevotesResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryAggregatePrevotesResponse,
  },
  // AggregateVote returns an aggregate vote of a validator
aggregateVote: {
    path: '/umee.oracle.v1.Query/AggregateVote',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryAggregateVote,
    responseType: umee_oracle_v1_query_pb.QueryAggregateVoteResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryAggregateVote,
    requestDeserialize: deserialize_umee_oracle_v1_QueryAggregateVote,
    responseSerialize: serialize_umee_oracle_v1_QueryAggregateVoteResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryAggregateVoteResponse,
  },
  // AggregateVotes returns aggregate votes of all validators
aggregateVotes: {
    path: '/umee.oracle.v1.Query/AggregateVotes',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryAggregateVotes,
    responseType: umee_oracle_v1_query_pb.QueryAggregateVotesResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryAggregateVotes,
    requestDeserialize: deserialize_umee_oracle_v1_QueryAggregateVotes,
    responseSerialize: serialize_umee_oracle_v1_QueryAggregateVotesResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryAggregateVotesResponse,
  },
  // Params queries all parameters.
params: {
    path: '/umee.oracle.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryParams,
    responseType: umee_oracle_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryParams,
    requestDeserialize: deserialize_umee_oracle_v1_QueryParams,
    responseSerialize: serialize_umee_oracle_v1_QueryParamsResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryParamsResponse,
  },
  // Medians returns medians of all denoms,
// or, if specified, returns a single median
medians: {
    path: '/umee.oracle.v1.Query/Medians',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryMedians,
    responseType: umee_oracle_v1_query_pb.QueryMediansResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryMedians,
    requestDeserialize: deserialize_umee_oracle_v1_QueryMedians,
    responseSerialize: serialize_umee_oracle_v1_QueryMediansResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryMediansResponse,
  },
  // MedianDeviations returns median deviations of all denoms,
// or, if specified, returns a single median deviation
medianDeviations: {
    path: '/umee.oracle.v1.Query/MedianDeviations',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryMedianDeviations,
    responseType: umee_oracle_v1_query_pb.QueryMedianDeviationsResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryMedianDeviations,
    requestDeserialize: deserialize_umee_oracle_v1_QueryMedianDeviations,
    responseSerialize: serialize_umee_oracle_v1_QueryMedianDeviationsResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryMedianDeviationsResponse,
  },
  // QueryAvgPrice returns avg price of a given denom (required).
avgPrice: {
    path: '/umee.oracle.v1.Query/AvgPrice',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_query_pb.QueryAvgPrice,
    responseType: umee_oracle_v1_query_pb.QueryAvgPriceResponse,
    requestSerialize: serialize_umee_oracle_v1_QueryAvgPrice,
    requestDeserialize: deserialize_umee_oracle_v1_QueryAvgPrice,
    responseSerialize: serialize_umee_oracle_v1_QueryAvgPriceResponse,
    responseDeserialize: deserialize_umee_oracle_v1_QueryAvgPriceResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
