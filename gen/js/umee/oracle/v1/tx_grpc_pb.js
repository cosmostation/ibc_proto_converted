// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var umee_oracle_v1_tx_pb = require('../../../umee/oracle/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_umee_oracle_v1_MsgAggregateExchangeRatePrevote(arg) {
  if (!(arg instanceof umee_oracle_v1_tx_pb.MsgAggregateExchangeRatePrevote)) {
    throw new Error('Expected argument of type umee.oracle.v1.MsgAggregateExchangeRatePrevote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_MsgAggregateExchangeRatePrevote(buffer_arg) {
  return umee_oracle_v1_tx_pb.MsgAggregateExchangeRatePrevote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_MsgAggregateExchangeRatePrevoteResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_tx_pb.MsgAggregateExchangeRatePrevoteResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.MsgAggregateExchangeRatePrevoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_MsgAggregateExchangeRatePrevoteResponse(buffer_arg) {
  return umee_oracle_v1_tx_pb.MsgAggregateExchangeRatePrevoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_MsgAggregateExchangeRateVote(arg) {
  if (!(arg instanceof umee_oracle_v1_tx_pb.MsgAggregateExchangeRateVote)) {
    throw new Error('Expected argument of type umee.oracle.v1.MsgAggregateExchangeRateVote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_MsgAggregateExchangeRateVote(buffer_arg) {
  return umee_oracle_v1_tx_pb.MsgAggregateExchangeRateVote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_MsgAggregateExchangeRateVoteResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_tx_pb.MsgAggregateExchangeRateVoteResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.MsgAggregateExchangeRateVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_MsgAggregateExchangeRateVoteResponse(buffer_arg) {
  return umee_oracle_v1_tx_pb.MsgAggregateExchangeRateVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_MsgDelegateFeedConsent(arg) {
  if (!(arg instanceof umee_oracle_v1_tx_pb.MsgDelegateFeedConsent)) {
    throw new Error('Expected argument of type umee.oracle.v1.MsgDelegateFeedConsent');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_MsgDelegateFeedConsent(buffer_arg) {
  return umee_oracle_v1_tx_pb.MsgDelegateFeedConsent.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_oracle_v1_MsgDelegateFeedConsentResponse(arg) {
  if (!(arg instanceof umee_oracle_v1_tx_pb.MsgDelegateFeedConsentResponse)) {
    throw new Error('Expected argument of type umee.oracle.v1.MsgDelegateFeedConsentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_oracle_v1_MsgDelegateFeedConsentResponse(buffer_arg) {
  return umee_oracle_v1_tx_pb.MsgDelegateFeedConsentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the oracle Msg service.
var MsgService = exports.MsgService = {
  // AggregateExchangeRatePrevote defines a method for submitting an aggregate
// exchange rate prevote.
aggregateExchangeRatePrevote: {
    path: '/umee.oracle.v1.Msg/AggregateExchangeRatePrevote',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_tx_pb.MsgAggregateExchangeRatePrevote,
    responseType: umee_oracle_v1_tx_pb.MsgAggregateExchangeRatePrevoteResponse,
    requestSerialize: serialize_umee_oracle_v1_MsgAggregateExchangeRatePrevote,
    requestDeserialize: deserialize_umee_oracle_v1_MsgAggregateExchangeRatePrevote,
    responseSerialize: serialize_umee_oracle_v1_MsgAggregateExchangeRatePrevoteResponse,
    responseDeserialize: deserialize_umee_oracle_v1_MsgAggregateExchangeRatePrevoteResponse,
  },
  // AggregateExchangeRateVote defines a method for submitting an aggregate
// exchange rate vote.
aggregateExchangeRateVote: {
    path: '/umee.oracle.v1.Msg/AggregateExchangeRateVote',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_tx_pb.MsgAggregateExchangeRateVote,
    responseType: umee_oracle_v1_tx_pb.MsgAggregateExchangeRateVoteResponse,
    requestSerialize: serialize_umee_oracle_v1_MsgAggregateExchangeRateVote,
    requestDeserialize: deserialize_umee_oracle_v1_MsgAggregateExchangeRateVote,
    responseSerialize: serialize_umee_oracle_v1_MsgAggregateExchangeRateVoteResponse,
    responseDeserialize: deserialize_umee_oracle_v1_MsgAggregateExchangeRateVoteResponse,
  },
  // DelegateFeedConsent defines a method for setting the feeder delegation.
delegateFeedConsent: {
    path: '/umee.oracle.v1.Msg/DelegateFeedConsent',
    requestStream: false,
    responseStream: false,
    requestType: umee_oracle_v1_tx_pb.MsgDelegateFeedConsent,
    responseType: umee_oracle_v1_tx_pb.MsgDelegateFeedConsentResponse,
    requestSerialize: serialize_umee_oracle_v1_MsgDelegateFeedConsent,
    requestDeserialize: deserialize_umee_oracle_v1_MsgDelegateFeedConsent,
    responseSerialize: serialize_umee_oracle_v1_MsgDelegateFeedConsentResponse,
    responseDeserialize: deserialize_umee_oracle_v1_MsgDelegateFeedConsentResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
