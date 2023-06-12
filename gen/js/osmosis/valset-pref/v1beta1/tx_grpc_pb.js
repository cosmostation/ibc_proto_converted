// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_valset$pref_v1beta1_tx_pb = require('../../../osmosis/valset-pref/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var osmosis_valset$pref_v1beta1_state_pb = require('../../../osmosis/valset-pref/v1beta1/state_pb.js');

function serialize_osmosis_valsetpref_v1beta1_MsgDelegateBondedTokens(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateBondedTokens)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgDelegateBondedTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgDelegateBondedTokens(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateBondedTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_MsgDelegateBondedTokensResponse(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateBondedTokensResponse)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgDelegateBondedTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgDelegateBondedTokensResponse(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateBondedTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_MsgDelegateToValidatorSet(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateToValidatorSet)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgDelegateToValidatorSet');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgDelegateToValidatorSet(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateToValidatorSet.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_MsgDelegateToValidatorSetResponse(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateToValidatorSetResponse)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgDelegateToValidatorSetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgDelegateToValidatorSetResponse(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateToValidatorSetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_MsgRedelegateValidatorSet(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgRedelegateValidatorSet)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgRedelegateValidatorSet');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgRedelegateValidatorSet(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgRedelegateValidatorSet.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_MsgRedelegateValidatorSetResponse(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgRedelegateValidatorSetResponse)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgRedelegateValidatorSetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgRedelegateValidatorSetResponse(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgRedelegateValidatorSetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreference(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgSetValidatorSetPreference)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreference');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreference(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgSetValidatorSetPreference.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreferenceResponse(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgSetValidatorSetPreferenceResponse)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgSetValidatorSetPreferenceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreferenceResponse(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgSetValidatorSetPreferenceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSet(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgUndelegateFromValidatorSet)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSet');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSet(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgUndelegateFromValidatorSet.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSetResponse(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgUndelegateFromValidatorSetResponse)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgUndelegateFromValidatorSetResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSetResponse(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgUndelegateFromValidatorSetResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewards(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgWithdrawDelegationRewards)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewards(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgWithdrawDelegationRewards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewardsResponse(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_tx_pb.MsgWithdrawDelegationRewardsResponse)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.MsgWithdrawDelegationRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewardsResponse(buffer_arg) {
  return osmosis_valset$pref_v1beta1_tx_pb.MsgWithdrawDelegationRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the valset-pref modules's gRPC message service.
var MsgService = exports.MsgService = {
  // SetValidatorSetPreference creates a set of validator preference.
// This message will process both create + update request.
setValidatorSetPreference: {
    path: '/osmosis.valsetpref.v1beta1.Msg/SetValidatorSetPreference',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_valset$pref_v1beta1_tx_pb.MsgSetValidatorSetPreference,
    responseType: osmosis_valset$pref_v1beta1_tx_pb.MsgSetValidatorSetPreferenceResponse,
    requestSerialize: serialize_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreference,
    requestDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreference,
    responseSerialize: serialize_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreferenceResponse,
    responseDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgSetValidatorSetPreferenceResponse,
  },
  // DelegateToValidatorSet gets the owner, coins and delegates to a
// validator-set.
delegateToValidatorSet: {
    path: '/osmosis.valsetpref.v1beta1.Msg/DelegateToValidatorSet',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateToValidatorSet,
    responseType: osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateToValidatorSetResponse,
    requestSerialize: serialize_osmosis_valsetpref_v1beta1_MsgDelegateToValidatorSet,
    requestDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgDelegateToValidatorSet,
    responseSerialize: serialize_osmosis_valsetpref_v1beta1_MsgDelegateToValidatorSetResponse,
    responseDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgDelegateToValidatorSetResponse,
  },
  // UndelegateFromValidatorSet gets the owner and coins and undelegates from
// validator-set. The unbonding logic will follow the `Undelegate` logic from
// the sdk.
undelegateFromValidatorSet: {
    path: '/osmosis.valsetpref.v1beta1.Msg/UndelegateFromValidatorSet',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_valset$pref_v1beta1_tx_pb.MsgUndelegateFromValidatorSet,
    responseType: osmosis_valset$pref_v1beta1_tx_pb.MsgUndelegateFromValidatorSetResponse,
    requestSerialize: serialize_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSet,
    requestDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSet,
    responseSerialize: serialize_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSetResponse,
    responseDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgUndelegateFromValidatorSetResponse,
  },
  // RedelegateValidatorSet takes the existing validator set and redelegates to
// a new set.
redelegateValidatorSet: {
    path: '/osmosis.valsetpref.v1beta1.Msg/RedelegateValidatorSet',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_valset$pref_v1beta1_tx_pb.MsgRedelegateValidatorSet,
    responseType: osmosis_valset$pref_v1beta1_tx_pb.MsgRedelegateValidatorSetResponse,
    requestSerialize: serialize_osmosis_valsetpref_v1beta1_MsgRedelegateValidatorSet,
    requestDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgRedelegateValidatorSet,
    responseSerialize: serialize_osmosis_valsetpref_v1beta1_MsgRedelegateValidatorSetResponse,
    responseDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgRedelegateValidatorSetResponse,
  },
  // WithdrawDelegationRewards allows users to claim rewards from the
// validator-set.
withdrawDelegationRewards: {
    path: '/osmosis.valsetpref.v1beta1.Msg/WithdrawDelegationRewards',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_valset$pref_v1beta1_tx_pb.MsgWithdrawDelegationRewards,
    responseType: osmosis_valset$pref_v1beta1_tx_pb.MsgWithdrawDelegationRewardsResponse,
    requestSerialize: serialize_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewards,
    requestDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewards,
    responseSerialize: serialize_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewardsResponse,
    responseDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgWithdrawDelegationRewardsResponse,
  },
  // DelegateBondedTokens allows users to break the lockup bond and delegate
// osmo tokens to a predefined validator-set.
delegateBondedTokens: {
    path: '/osmosis.valsetpref.v1beta1.Msg/DelegateBondedTokens',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateBondedTokens,
    responseType: osmosis_valset$pref_v1beta1_tx_pb.MsgDelegateBondedTokensResponse,
    requestSerialize: serialize_osmosis_valsetpref_v1beta1_MsgDelegateBondedTokens,
    requestDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgDelegateBondedTokens,
    responseSerialize: serialize_osmosis_valsetpref_v1beta1_MsgDelegateBondedTokensResponse,
    responseDeserialize: deserialize_osmosis_valsetpref_v1beta1_MsgDelegateBondedTokensResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
