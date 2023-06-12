// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var persistence_oracle_v1beta1_tx_pb = require('../../../persistence/oracle/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_persistence_oracle_v1beta1_MsgAddFundsToRewardPool(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_tx_pb.MsgAddFundsToRewardPool)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.MsgAddFundsToRewardPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_MsgAddFundsToRewardPool(buffer_arg) {
  return persistence_oracle_v1beta1_tx_pb.MsgAddFundsToRewardPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_MsgAddFundsToRewardPoolResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_tx_pb.MsgAddFundsToRewardPoolResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.MsgAddFundsToRewardPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_MsgAddFundsToRewardPoolResponse(buffer_arg) {
  return persistence_oracle_v1beta1_tx_pb.MsgAddFundsToRewardPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_MsgAggregateExchangeRatePrevote(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRatePrevote)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_MsgAggregateExchangeRatePrevote(buffer_arg) {
  return persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRatePrevote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_MsgAggregateExchangeRatePrevoteResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRatePrevoteResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.MsgAggregateExchangeRatePrevoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_MsgAggregateExchangeRatePrevoteResponse(buffer_arg) {
  return persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRatePrevoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_MsgAggregateExchangeRateVote(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRateVote)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.MsgAggregateExchangeRateVote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_MsgAggregateExchangeRateVote(buffer_arg) {
  return persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRateVote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_MsgAggregateExchangeRateVoteResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRateVoteResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.MsgAggregateExchangeRateVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_MsgAggregateExchangeRateVoteResponse(buffer_arg) {
  return persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRateVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_MsgDelegateFeedConsent(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_tx_pb.MsgDelegateFeedConsent)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.MsgDelegateFeedConsent');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_MsgDelegateFeedConsent(buffer_arg) {
  return persistence_oracle_v1beta1_tx_pb.MsgDelegateFeedConsent.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_oracle_v1beta1_MsgDelegateFeedConsentResponse(arg) {
  if (!(arg instanceof persistence_oracle_v1beta1_tx_pb.MsgDelegateFeedConsentResponse)) {
    throw new Error('Expected argument of type persistence.oracle.v1beta1.MsgDelegateFeedConsentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_oracle_v1beta1_MsgDelegateFeedConsentResponse(buffer_arg) {
  return persistence_oracle_v1beta1_tx_pb.MsgDelegateFeedConsentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the oracle Msg service.
var MsgService = exports.MsgService = {
  // AggregateExchangeRatePrevote defines a method for submitting an aggregate
// exchange rate prevote.
aggregateExchangeRatePrevote: {
    path: '/persistence.oracle.v1beta1.Msg/AggregateExchangeRatePrevote',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRatePrevote,
    responseType: persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRatePrevoteResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_MsgAggregateExchangeRatePrevote,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_MsgAggregateExchangeRatePrevote,
    responseSerialize: serialize_persistence_oracle_v1beta1_MsgAggregateExchangeRatePrevoteResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_MsgAggregateExchangeRatePrevoteResponse,
  },
  // AggregateExchangeRateVote defines a method for submitting an aggregate
// exchange rate vote.
aggregateExchangeRateVote: {
    path: '/persistence.oracle.v1beta1.Msg/AggregateExchangeRateVote',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRateVote,
    responseType: persistence_oracle_v1beta1_tx_pb.MsgAggregateExchangeRateVoteResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_MsgAggregateExchangeRateVote,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_MsgAggregateExchangeRateVote,
    responseSerialize: serialize_persistence_oracle_v1beta1_MsgAggregateExchangeRateVoteResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_MsgAggregateExchangeRateVoteResponse,
  },
  // DelegateFeedConsent defines a method for setting the feeder delegation.
delegateFeedConsent: {
    path: '/persistence.oracle.v1beta1.Msg/DelegateFeedConsent',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_tx_pb.MsgDelegateFeedConsent,
    responseType: persistence_oracle_v1beta1_tx_pb.MsgDelegateFeedConsentResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_MsgDelegateFeedConsent,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_MsgDelegateFeedConsent,
    responseSerialize: serialize_persistence_oracle_v1beta1_MsgDelegateFeedConsentResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_MsgDelegateFeedConsentResponse,
  },
  // AddFundsToRewardPool
addFundsToRewardPool: {
    path: '/persistence.oracle.v1beta1.Msg/AddFundsToRewardPool',
    requestStream: false,
    responseStream: false,
    requestType: persistence_oracle_v1beta1_tx_pb.MsgAddFundsToRewardPool,
    responseType: persistence_oracle_v1beta1_tx_pb.MsgAddFundsToRewardPoolResponse,
    requestSerialize: serialize_persistence_oracle_v1beta1_MsgAddFundsToRewardPool,
    requestDeserialize: deserialize_persistence_oracle_v1beta1_MsgAddFundsToRewardPool,
    responseSerialize: serialize_persistence_oracle_v1beta1_MsgAddFundsToRewardPoolResponse,
    responseDeserialize: deserialize_persistence_oracle_v1beta1_MsgAddFundsToRewardPoolResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
