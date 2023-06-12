// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var umee_incentive_v1_query_pb = require('../../../umee/incentive/v1/query_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var umee_incentive_v1_incentive_pb = require('../../../umee/incentive/v1/incentive_pb.js');
var umee_incentive_v1_genesis_pb = require('../../../umee/incentive/v1/genesis_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_umee_incentive_v1_QueryAccountBonds(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryAccountBonds)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryAccountBonds');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryAccountBonds(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryAccountBonds.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryAccountBondsResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryAccountBondsResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryAccountBondsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryAccountBondsResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryAccountBondsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryActualRates(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryActualRates)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryActualRates');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryActualRates(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryActualRates.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryActualRatesResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryActualRatesResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryActualRatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryActualRatesResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryActualRatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryCompletedIncentivePrograms(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryCompletedIncentivePrograms)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryCompletedIncentivePrograms');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryCompletedIncentivePrograms(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryCompletedIncentivePrograms.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryCompletedIncentiveProgramsResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryCompletedIncentiveProgramsResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryCompletedIncentiveProgramsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryCompletedIncentiveProgramsResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryCompletedIncentiveProgramsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryCurrentRates(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryCurrentRates)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryCurrentRates');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryCurrentRates(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryCurrentRates.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryCurrentRatesResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryCurrentRatesResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryCurrentRatesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryCurrentRatesResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryCurrentRatesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryIncentiveProgram(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryIncentiveProgram)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryIncentiveProgram');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryIncentiveProgram(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryIncentiveProgram.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryIncentiveProgramResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryIncentiveProgramResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryIncentiveProgramResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryIncentiveProgramResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryIncentiveProgramResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryLastRewardTime(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryLastRewardTime)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryLastRewardTime');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryLastRewardTime(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryLastRewardTime.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryLastRewardTimeResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryLastRewardTimeResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryLastRewardTimeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryLastRewardTimeResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryLastRewardTimeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryOngoingIncentivePrograms(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryOngoingIncentivePrograms)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryOngoingIncentivePrograms');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryOngoingIncentivePrograms(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryOngoingIncentivePrograms.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryOngoingIncentiveProgramsResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryOngoingIncentiveProgramsResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryOngoingIncentiveProgramsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryOngoingIncentiveProgramsResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryOngoingIncentiveProgramsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryParams(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryParams)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryParams(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryParamsResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryPendingRewards(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryPendingRewards)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryPendingRewards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryPendingRewards(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryPendingRewards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryPendingRewardsResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryPendingRewardsResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryPendingRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryPendingRewardsResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryPendingRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryTotalBonded(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryTotalBonded)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryTotalBonded');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryTotalBonded(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryTotalBonded.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryTotalBondedResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryTotalBondedResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryTotalBondedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryTotalBondedResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryTotalBondedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryTotalUnbonding(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryTotalUnbonding)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryTotalUnbonding');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryTotalUnbonding(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryTotalUnbonding.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryTotalUnbondingResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryTotalUnbondingResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryTotalUnbondingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryTotalUnbondingResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryTotalUnbondingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryUpcomingIncentivePrograms(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryUpcomingIncentivePrograms)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryUpcomingIncentivePrograms');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryUpcomingIncentivePrograms(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryUpcomingIncentivePrograms.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_incentive_v1_QueryUpcomingIncentiveProgramsResponse(arg) {
  if (!(arg instanceof umee_incentive_v1_query_pb.QueryUpcomingIncentiveProgramsResponse)) {
    throw new Error('Expected argument of type umee.incentive.v1.QueryUpcomingIncentiveProgramsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_incentive_v1_QueryUpcomingIncentiveProgramsResponse(buffer_arg) {
  return umee_incentive_v1_query_pb.QueryUpcomingIncentiveProgramsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params queries the parameters of the x/incentive module.
params: {
    path: '/umee.incentive.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryParams,
    responseType: umee_incentive_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryParams,
    requestDeserialize: deserialize_umee_incentive_v1_QueryParams,
    responseSerialize: serialize_umee_incentive_v1_QueryParamsResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryParamsResponse,
  },
  // TotalBonded queries the sum of all bonded collateral uTokens.
totalBonded: {
    path: '/umee.incentive.v1.Query/TotalBonded',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryTotalBonded,
    responseType: umee_incentive_v1_query_pb.QueryTotalBondedResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryTotalBonded,
    requestDeserialize: deserialize_umee_incentive_v1_QueryTotalBonded,
    responseSerialize: serialize_umee_incentive_v1_QueryTotalBondedResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryTotalBondedResponse,
  },
  // TotalUnbonding queries the sum of all unbonding collateral uTokens.
totalUnbonding: {
    path: '/umee.incentive.v1.Query/TotalUnbonding',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryTotalUnbonding,
    responseType: umee_incentive_v1_query_pb.QueryTotalUnbondingResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryTotalUnbonding,
    requestDeserialize: deserialize_umee_incentive_v1_QueryTotalUnbonding,
    responseSerialize: serialize_umee_incentive_v1_QueryTotalUnbondingResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryTotalUnbondingResponse,
  },
  // AccountBonds queries all bonded collateral and unbondings associated with an account.
accountBonds: {
    path: '/umee.incentive.v1.Query/AccountBonds',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryAccountBonds,
    responseType: umee_incentive_v1_query_pb.QueryAccountBondsResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryAccountBonds,
    requestDeserialize: deserialize_umee_incentive_v1_QueryAccountBonds,
    responseSerialize: serialize_umee_incentive_v1_QueryAccountBondsResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryAccountBondsResponse,
  },
  // PendingRewards queries unclaimed incentive rewards associated with an account.
pendingRewards: {
    path: '/umee.incentive.v1.Query/PendingRewards',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryPendingRewards,
    responseType: umee_incentive_v1_query_pb.QueryPendingRewardsResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryPendingRewards,
    requestDeserialize: deserialize_umee_incentive_v1_QueryPendingRewards,
    responseSerialize: serialize_umee_incentive_v1_QueryPendingRewardsResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryPendingRewardsResponse,
  },
  // CompletedIncentivePrograms queries for all incentives programs that have been passed
// by governance, and either run to completion or expired immediately due to not being funded.
completedIncentivePrograms: {
    path: '/umee.incentive.v1.Query/CompletedIncentivePrograms',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryCompletedIncentivePrograms,
    responseType: umee_incentive_v1_query_pb.QueryCompletedIncentiveProgramsResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryCompletedIncentivePrograms,
    requestDeserialize: deserialize_umee_incentive_v1_QueryCompletedIncentivePrograms,
    responseSerialize: serialize_umee_incentive_v1_QueryCompletedIncentiveProgramsResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryCompletedIncentiveProgramsResponse,
  },
  // OngoingIncentivePrograms queries for all incentives programs that have been passed
// by governance, funded, and started but not yet completed.
ongoingIncentivePrograms: {
    path: '/umee.incentive.v1.Query/OngoingIncentivePrograms',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryOngoingIncentivePrograms,
    responseType: umee_incentive_v1_query_pb.QueryOngoingIncentiveProgramsResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryOngoingIncentivePrograms,
    requestDeserialize: deserialize_umee_incentive_v1_QueryOngoingIncentivePrograms,
    responseSerialize: serialize_umee_incentive_v1_QueryOngoingIncentiveProgramsResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryOngoingIncentiveProgramsResponse,
  },
  // UpcomingIncentivePrograms queries for all incentives programs that have been passed
// by governance, but not yet started. They may or may not have been funded.
upcomingIncentivePrograms: {
    path: '/umee.incentive.v1.Query/UpcomingIncentivePrograms',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryUpcomingIncentivePrograms,
    responseType: umee_incentive_v1_query_pb.QueryUpcomingIncentiveProgramsResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryUpcomingIncentivePrograms,
    requestDeserialize: deserialize_umee_incentive_v1_QueryUpcomingIncentivePrograms,
    responseSerialize: serialize_umee_incentive_v1_QueryUpcomingIncentiveProgramsResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryUpcomingIncentiveProgramsResponse,
  },
  // IncentiveProgram queries a single incentive program by ID.
incentiveProgram: {
    path: '/umee.incentive.v1.Query/IncentiveProgram',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryIncentiveProgram,
    responseType: umee_incentive_v1_query_pb.QueryIncentiveProgramResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryIncentiveProgram,
    requestDeserialize: deserialize_umee_incentive_v1_QueryIncentiveProgram,
    responseSerialize: serialize_umee_incentive_v1_QueryIncentiveProgramResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryIncentiveProgramResponse,
  },
  // CurrentRates queries the hypothetical return of a bonded uToken denomination
// if current incentive rewards continued for one year. The response is an sdk.Coins
// of base token rewards, per reference amount (usually 10^exponent of the uToken.)
currentRates: {
    path: '/umee.incentive.v1.Query/CurrentRates',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryCurrentRates,
    responseType: umee_incentive_v1_query_pb.QueryCurrentRatesResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryCurrentRates,
    requestDeserialize: deserialize_umee_incentive_v1_QueryCurrentRates,
    responseSerialize: serialize_umee_incentive_v1_QueryCurrentRatesResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryCurrentRatesResponse,
  },
  // ActualRates queries the hypothetical return of a bonded uToken denomination
// if current incentive rewards continued for one year. The response is an sdk.Dec
// representing an oracle-adjusted APY.
actualRates: {
    path: '/umee.incentive.v1.Query/ActualRates',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryActualRates,
    responseType: umee_incentive_v1_query_pb.QueryActualRatesResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryActualRates,
    requestDeserialize: deserialize_umee_incentive_v1_QueryActualRates,
    responseSerialize: serialize_umee_incentive_v1_QueryActualRatesResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryActualRatesResponse,
  },
  // LastRewardTime queries the last block time at which incentive rewards were calculated.
lastRewardTime: {
    path: '/umee.incentive.v1.Query/LastRewardTime',
    requestStream: false,
    responseStream: false,
    requestType: umee_incentive_v1_query_pb.QueryLastRewardTime,
    responseType: umee_incentive_v1_query_pb.QueryLastRewardTimeResponse,
    requestSerialize: serialize_umee_incentive_v1_QueryLastRewardTime,
    requestDeserialize: deserialize_umee_incentive_v1_QueryLastRewardTime,
    responseSerialize: serialize_umee_incentive_v1_QueryLastRewardTimeResponse,
    responseDeserialize: deserialize_umee_incentive_v1_QueryLastRewardTimeResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
