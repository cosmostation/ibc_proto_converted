// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_lockup_query_pb = require('../../osmosis/lockup/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var osmosis_lockup_lock_pb = require('../../osmosis/lockup/lock_pb.js');
var osmosis_lockup_params_pb = require('../../osmosis/lockup/params_pb.js');

function serialize_osmosis_lockup_AccountLockedCoinsRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedCoinsRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedCoinsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedCoinsRequest(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedCoinsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedCoinsResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedCoinsResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedCoinsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedCoinsResponse(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedCoinsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedDurationRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedDurationRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedDurationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedDurationRequest(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedDurationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedDurationResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedDurationResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedDurationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedDurationResponse(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedDurationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedLongerDurationDenomRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedLongerDurationDenomRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedLongerDurationDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedLongerDurationDenomRequest(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedLongerDurationDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedLongerDurationDenomResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedLongerDurationDenomResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedLongerDurationDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedLongerDurationDenomResponse(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedLongerDurationDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedLongerDurationNotUnlockingOnlyRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedLongerDurationNotUnlockingOnlyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedLongerDurationNotUnlockingOnlyResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedLongerDurationNotUnlockingOnlyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedLongerDurationNotUnlockingOnlyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedLongerDurationRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedLongerDurationRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedLongerDurationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedLongerDurationRequest(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedLongerDurationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedLongerDurationResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedLongerDurationResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedLongerDurationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedLongerDurationResponse(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedLongerDurationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedPastTimeDenomRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedPastTimeDenomRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedPastTimeDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedPastTimeDenomRequest(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedPastTimeDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedPastTimeDenomResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedPastTimeDenomResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedPastTimeDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedPastTimeDenomResponse(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedPastTimeDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedPastTimeNotUnlockingOnlyRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedPastTimeNotUnlockingOnlyRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedPastTimeNotUnlockingOnlyRequest(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedPastTimeNotUnlockingOnlyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedPastTimeNotUnlockingOnlyResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedPastTimeNotUnlockingOnlyResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedPastTimeNotUnlockingOnlyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedPastTimeNotUnlockingOnlyResponse(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedPastTimeNotUnlockingOnlyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedPastTimeRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedPastTimeRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedPastTimeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedPastTimeRequest(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedPastTimeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountLockedPastTimeResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountLockedPastTimeResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountLockedPastTimeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountLockedPastTimeResponse(buffer_arg) {
  return osmosis_lockup_query_pb.AccountLockedPastTimeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountUnlockableCoinsRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountUnlockableCoinsRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountUnlockableCoinsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountUnlockableCoinsRequest(buffer_arg) {
  return osmosis_lockup_query_pb.AccountUnlockableCoinsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountUnlockableCoinsResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountUnlockableCoinsResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountUnlockableCoinsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountUnlockableCoinsResponse(buffer_arg) {
  return osmosis_lockup_query_pb.AccountUnlockableCoinsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountUnlockedBeforeTimeRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountUnlockedBeforeTimeRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountUnlockedBeforeTimeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountUnlockedBeforeTimeRequest(buffer_arg) {
  return osmosis_lockup_query_pb.AccountUnlockedBeforeTimeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountUnlockedBeforeTimeResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountUnlockedBeforeTimeResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountUnlockedBeforeTimeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountUnlockedBeforeTimeResponse(buffer_arg) {
  return osmosis_lockup_query_pb.AccountUnlockedBeforeTimeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountUnlockingCoinsRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountUnlockingCoinsRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountUnlockingCoinsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountUnlockingCoinsRequest(buffer_arg) {
  return osmosis_lockup_query_pb.AccountUnlockingCoinsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_AccountUnlockingCoinsResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.AccountUnlockingCoinsResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.AccountUnlockingCoinsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_AccountUnlockingCoinsResponse(buffer_arg) {
  return osmosis_lockup_query_pb.AccountUnlockingCoinsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_LockedDenomRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.LockedDenomRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.LockedDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_LockedDenomRequest(buffer_arg) {
  return osmosis_lockup_query_pb.LockedDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_LockedDenomResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.LockedDenomResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.LockedDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_LockedDenomResponse(buffer_arg) {
  return osmosis_lockup_query_pb.LockedDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_LockedRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.LockedRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.LockedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_LockedRequest(buffer_arg) {
  return osmosis_lockup_query_pb.LockedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_LockedResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.LockedResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.LockedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_LockedResponse(buffer_arg) {
  return osmosis_lockup_query_pb.LockedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_ModuleBalanceRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.ModuleBalanceRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.ModuleBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_ModuleBalanceRequest(buffer_arg) {
  return osmosis_lockup_query_pb.ModuleBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_ModuleBalanceResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.ModuleBalanceResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.ModuleBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_ModuleBalanceResponse(buffer_arg) {
  return osmosis_lockup_query_pb.ModuleBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_ModuleLockedAmountRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.ModuleLockedAmountRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.ModuleLockedAmountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_ModuleLockedAmountRequest(buffer_arg) {
  return osmosis_lockup_query_pb.ModuleLockedAmountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_ModuleLockedAmountResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.ModuleLockedAmountResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.ModuleLockedAmountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_ModuleLockedAmountResponse(buffer_arg) {
  return osmosis_lockup_query_pb.ModuleLockedAmountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_NextLockIDRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.NextLockIDRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.NextLockIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_NextLockIDRequest(buffer_arg) {
  return osmosis_lockup_query_pb.NextLockIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_NextLockIDResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.NextLockIDResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.NextLockIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_NextLockIDResponse(buffer_arg) {
  return osmosis_lockup_query_pb.NextLockIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_QueryParamsRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_QueryParamsRequest(buffer_arg) {
  return osmosis_lockup_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_QueryParamsResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_QueryParamsResponse(buffer_arg) {
  return osmosis_lockup_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_SyntheticLockupByLockupIDRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.SyntheticLockupByLockupIDRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.SyntheticLockupByLockupIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_SyntheticLockupByLockupIDRequest(buffer_arg) {
  return osmosis_lockup_query_pb.SyntheticLockupByLockupIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_SyntheticLockupByLockupIDResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.SyntheticLockupByLockupIDResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.SyntheticLockupByLockupIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_SyntheticLockupByLockupIDResponse(buffer_arg) {
  return osmosis_lockup_query_pb.SyntheticLockupByLockupIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_SyntheticLockupsByLockupIDRequest(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.SyntheticLockupsByLockupIDRequest)) {
    throw new Error('Expected argument of type osmosis.lockup.SyntheticLockupsByLockupIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_SyntheticLockupsByLockupIDRequest(buffer_arg) {
  return osmosis_lockup_query_pb.SyntheticLockupsByLockupIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_SyntheticLockupsByLockupIDResponse(arg) {
  if (!(arg instanceof osmosis_lockup_query_pb.SyntheticLockupsByLockupIDResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.SyntheticLockupsByLockupIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_SyntheticLockupsByLockupIDResponse(buffer_arg) {
  return osmosis_lockup_query_pb.SyntheticLockupsByLockupIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Return full balance of the module
moduleBalance: {
    path: '/osmosis.lockup.Query/ModuleBalance',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.ModuleBalanceRequest,
    responseType: osmosis_lockup_query_pb.ModuleBalanceResponse,
    requestSerialize: serialize_osmosis_lockup_ModuleBalanceRequest,
    requestDeserialize: deserialize_osmosis_lockup_ModuleBalanceRequest,
    responseSerialize: serialize_osmosis_lockup_ModuleBalanceResponse,
    responseDeserialize: deserialize_osmosis_lockup_ModuleBalanceResponse,
  },
  // Return locked balance of the module
moduleLockedAmount: {
    path: '/osmosis.lockup.Query/ModuleLockedAmount',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.ModuleLockedAmountRequest,
    responseType: osmosis_lockup_query_pb.ModuleLockedAmountResponse,
    requestSerialize: serialize_osmosis_lockup_ModuleLockedAmountRequest,
    requestDeserialize: deserialize_osmosis_lockup_ModuleLockedAmountRequest,
    responseSerialize: serialize_osmosis_lockup_ModuleLockedAmountResponse,
    responseDeserialize: deserialize_osmosis_lockup_ModuleLockedAmountResponse,
  },
  // Returns unlockable coins which are not withdrawn yet
accountUnlockableCoins: {
    path: '/osmosis.lockup.Query/AccountUnlockableCoins',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.AccountUnlockableCoinsRequest,
    responseType: osmosis_lockup_query_pb.AccountUnlockableCoinsResponse,
    requestSerialize: serialize_osmosis_lockup_AccountUnlockableCoinsRequest,
    requestDeserialize: deserialize_osmosis_lockup_AccountUnlockableCoinsRequest,
    responseSerialize: serialize_osmosis_lockup_AccountUnlockableCoinsResponse,
    responseDeserialize: deserialize_osmosis_lockup_AccountUnlockableCoinsResponse,
  },
  // Returns unlocking coins
accountUnlockingCoins: {
    path: '/osmosis.lockup.Query/AccountUnlockingCoins',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.AccountUnlockingCoinsRequest,
    responseType: osmosis_lockup_query_pb.AccountUnlockingCoinsResponse,
    requestSerialize: serialize_osmosis_lockup_AccountUnlockingCoinsRequest,
    requestDeserialize: deserialize_osmosis_lockup_AccountUnlockingCoinsRequest,
    responseSerialize: serialize_osmosis_lockup_AccountUnlockingCoinsResponse,
    responseDeserialize: deserialize_osmosis_lockup_AccountUnlockingCoinsResponse,
  },
  // Return a locked coins that can't be withdrawn
accountLockedCoins: {
    path: '/osmosis.lockup.Query/AccountLockedCoins',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.AccountLockedCoinsRequest,
    responseType: osmosis_lockup_query_pb.AccountLockedCoinsResponse,
    requestSerialize: serialize_osmosis_lockup_AccountLockedCoinsRequest,
    requestDeserialize: deserialize_osmosis_lockup_AccountLockedCoinsRequest,
    responseSerialize: serialize_osmosis_lockup_AccountLockedCoinsResponse,
    responseDeserialize: deserialize_osmosis_lockup_AccountLockedCoinsResponse,
  },
  // Returns locked records of an account with unlock time beyond timestamp
accountLockedPastTime: {
    path: '/osmosis.lockup.Query/AccountLockedPastTime',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.AccountLockedPastTimeRequest,
    responseType: osmosis_lockup_query_pb.AccountLockedPastTimeResponse,
    requestSerialize: serialize_osmosis_lockup_AccountLockedPastTimeRequest,
    requestDeserialize: deserialize_osmosis_lockup_AccountLockedPastTimeRequest,
    responseSerialize: serialize_osmosis_lockup_AccountLockedPastTimeResponse,
    responseDeserialize: deserialize_osmosis_lockup_AccountLockedPastTimeResponse,
  },
  // Returns locked records of an account with unlock time beyond timestamp
// excluding tokens started unlocking
accountLockedPastTimeNotUnlockingOnly: {
    path: '/osmosis.lockup.Query/AccountLockedPastTimeNotUnlockingOnly',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.AccountLockedPastTimeNotUnlockingOnlyRequest,
    responseType: osmosis_lockup_query_pb.AccountLockedPastTimeNotUnlockingOnlyResponse,
    requestSerialize: serialize_osmosis_lockup_AccountLockedPastTimeNotUnlockingOnlyRequest,
    requestDeserialize: deserialize_osmosis_lockup_AccountLockedPastTimeNotUnlockingOnlyRequest,
    responseSerialize: serialize_osmosis_lockup_AccountLockedPastTimeNotUnlockingOnlyResponse,
    responseDeserialize: deserialize_osmosis_lockup_AccountLockedPastTimeNotUnlockingOnlyResponse,
  },
  // Returns unlocked records with unlock time before timestamp
accountUnlockedBeforeTime: {
    path: '/osmosis.lockup.Query/AccountUnlockedBeforeTime',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.AccountUnlockedBeforeTimeRequest,
    responseType: osmosis_lockup_query_pb.AccountUnlockedBeforeTimeResponse,
    requestSerialize: serialize_osmosis_lockup_AccountUnlockedBeforeTimeRequest,
    requestDeserialize: deserialize_osmosis_lockup_AccountUnlockedBeforeTimeRequest,
    responseSerialize: serialize_osmosis_lockup_AccountUnlockedBeforeTimeResponse,
    responseDeserialize: deserialize_osmosis_lockup_AccountUnlockedBeforeTimeResponse,
  },
  // Returns lock records by address, timestamp, denom
accountLockedPastTimeDenom: {
    path: '/osmosis.lockup.Query/AccountLockedPastTimeDenom',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.AccountLockedPastTimeDenomRequest,
    responseType: osmosis_lockup_query_pb.AccountLockedPastTimeDenomResponse,
    requestSerialize: serialize_osmosis_lockup_AccountLockedPastTimeDenomRequest,
    requestDeserialize: deserialize_osmosis_lockup_AccountLockedPastTimeDenomRequest,
    responseSerialize: serialize_osmosis_lockup_AccountLockedPastTimeDenomResponse,
    responseDeserialize: deserialize_osmosis_lockup_AccountLockedPastTimeDenomResponse,
  },
  // Returns total locked per denom with longer past given time
lockedDenom: {
    path: '/osmosis.lockup.Query/LockedDenom',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.LockedDenomRequest,
    responseType: osmosis_lockup_query_pb.LockedDenomResponse,
    requestSerialize: serialize_osmosis_lockup_LockedDenomRequest,
    requestDeserialize: deserialize_osmosis_lockup_LockedDenomRequest,
    responseSerialize: serialize_osmosis_lockup_LockedDenomResponse,
    responseDeserialize: deserialize_osmosis_lockup_LockedDenomResponse,
  },
  // Returns lock record by id
lockedByID: {
    path: '/osmosis.lockup.Query/LockedByID',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.LockedRequest,
    responseType: osmosis_lockup_query_pb.LockedResponse,
    requestSerialize: serialize_osmosis_lockup_LockedRequest,
    requestDeserialize: deserialize_osmosis_lockup_LockedRequest,
    responseSerialize: serialize_osmosis_lockup_LockedResponse,
    responseDeserialize: deserialize_osmosis_lockup_LockedResponse,
  },
  // Returns next lock ID
nextLockID: {
    path: '/osmosis.lockup.Query/NextLockID',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.NextLockIDRequest,
    responseType: osmosis_lockup_query_pb.NextLockIDResponse,
    requestSerialize: serialize_osmosis_lockup_NextLockIDRequest,
    requestDeserialize: deserialize_osmosis_lockup_NextLockIDRequest,
    responseSerialize: serialize_osmosis_lockup_NextLockIDResponse,
    responseDeserialize: deserialize_osmosis_lockup_NextLockIDResponse,
  },
  // Returns synthetic lockup by native lockup id
// Deprecated: use SyntheticLockupByLockupID instead
syntheticLockupsByLockupID: {
    path: '/osmosis.lockup.Query/SyntheticLockupsByLockupID',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.SyntheticLockupsByLockupIDRequest,
    responseType: osmosis_lockup_query_pb.SyntheticLockupsByLockupIDResponse,
    requestSerialize: serialize_osmosis_lockup_SyntheticLockupsByLockupIDRequest,
    requestDeserialize: deserialize_osmosis_lockup_SyntheticLockupsByLockupIDRequest,
    responseSerialize: serialize_osmosis_lockup_SyntheticLockupsByLockupIDResponse,
    responseDeserialize: deserialize_osmosis_lockup_SyntheticLockupsByLockupIDResponse,
  },
  // Returns synthetic lockup by native lockup id
syntheticLockupByLockupID: {
    path: '/osmosis.lockup.Query/SyntheticLockupByLockupID',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.SyntheticLockupByLockupIDRequest,
    responseType: osmosis_lockup_query_pb.SyntheticLockupByLockupIDResponse,
    requestSerialize: serialize_osmosis_lockup_SyntheticLockupByLockupIDRequest,
    requestDeserialize: deserialize_osmosis_lockup_SyntheticLockupByLockupIDRequest,
    responseSerialize: serialize_osmosis_lockup_SyntheticLockupByLockupIDResponse,
    responseDeserialize: deserialize_osmosis_lockup_SyntheticLockupByLockupIDResponse,
  },
  // Returns account locked records with longer duration
accountLockedLongerDuration: {
    path: '/osmosis.lockup.Query/AccountLockedLongerDuration',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.AccountLockedLongerDurationRequest,
    responseType: osmosis_lockup_query_pb.AccountLockedLongerDurationResponse,
    requestSerialize: serialize_osmosis_lockup_AccountLockedLongerDurationRequest,
    requestDeserialize: deserialize_osmosis_lockup_AccountLockedLongerDurationRequest,
    responseSerialize: serialize_osmosis_lockup_AccountLockedLongerDurationResponse,
    responseDeserialize: deserialize_osmosis_lockup_AccountLockedLongerDurationResponse,
  },
  // Returns account locked records with a specific duration
accountLockedDuration: {
    path: '/osmosis.lockup.Query/AccountLockedDuration',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.AccountLockedDurationRequest,
    responseType: osmosis_lockup_query_pb.AccountLockedDurationResponse,
    requestSerialize: serialize_osmosis_lockup_AccountLockedDurationRequest,
    requestDeserialize: deserialize_osmosis_lockup_AccountLockedDurationRequest,
    responseSerialize: serialize_osmosis_lockup_AccountLockedDurationResponse,
    responseDeserialize: deserialize_osmosis_lockup_AccountLockedDurationResponse,
  },
  // Returns account locked records with longer duration excluding tokens
// started unlocking
accountLockedLongerDurationNotUnlockingOnly: {
    path: '/osmosis.lockup.Query/AccountLockedLongerDurationNotUnlockingOnly',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.AccountLockedLongerDurationNotUnlockingOnlyRequest,
    responseType: osmosis_lockup_query_pb.AccountLockedLongerDurationNotUnlockingOnlyResponse,
    requestSerialize: serialize_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest,
    requestDeserialize: deserialize_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyRequest,
    responseSerialize: serialize_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse,
    responseDeserialize: deserialize_osmosis_lockup_AccountLockedLongerDurationNotUnlockingOnlyResponse,
  },
  // Returns account's locked records for a denom with longer duration
accountLockedLongerDurationDenom: {
    path: '/osmosis.lockup.Query/AccountLockedLongerDurationDenom',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.AccountLockedLongerDurationDenomRequest,
    responseType: osmosis_lockup_query_pb.AccountLockedLongerDurationDenomResponse,
    requestSerialize: serialize_osmosis_lockup_AccountLockedLongerDurationDenomRequest,
    requestDeserialize: deserialize_osmosis_lockup_AccountLockedLongerDurationDenomRequest,
    responseSerialize: serialize_osmosis_lockup_AccountLockedLongerDurationDenomResponse,
    responseDeserialize: deserialize_osmosis_lockup_AccountLockedLongerDurationDenomResponse,
  },
  // Params returns lockup params.
params: {
    path: '/osmosis.lockup.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_query_pb.QueryParamsRequest,
    responseType: osmosis_lockup_query_pb.QueryParamsResponse,
    requestSerialize: serialize_osmosis_lockup_QueryParamsRequest,
    requestDeserialize: deserialize_osmosis_lockup_QueryParamsRequest,
    responseSerialize: serialize_osmosis_lockup_QueryParamsResponse,
    responseDeserialize: deserialize_osmosis_lockup_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
