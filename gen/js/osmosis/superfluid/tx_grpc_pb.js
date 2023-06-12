// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_superfluid_tx_pb = require('../../osmosis/superfluid/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var amino_amino_pb = require('../../amino/amino_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var osmosis_superfluid_superfluid_pb = require('../../osmosis/superfluid/superfluid_pb.js');

function serialize_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPosition(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgAddToConcentratedLiquiditySuperfluidPosition)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPosition');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPosition(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgAddToConcentratedLiquiditySuperfluidPosition.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPositionResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgAddToConcentratedLiquiditySuperfluidPositionResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgAddToConcentratedLiquiditySuperfluidPositionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPositionResponse(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgAddToConcentratedLiquiditySuperfluidPositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgCreateFullRangePositionAndSuperfluidDelegate(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgCreateFullRangePositionAndSuperfluidDelegate)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgCreateFullRangePositionAndSuperfluidDelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgCreateFullRangePositionAndSuperfluidDelegate(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgCreateFullRangePositionAndSuperfluidDelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgCreateFullRangePositionAndSuperfluidDelegateResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgCreateFullRangePositionAndSuperfluidDelegateResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgCreateFullRangePositionAndSuperfluidDelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgCreateFullRangePositionAndSuperfluidDelegateResponse(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgCreateFullRangePositionAndSuperfluidDelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgLockAndSuperfluidDelegate(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgLockAndSuperfluidDelegate)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgLockAndSuperfluidDelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgLockAndSuperfluidDelegate(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgLockAndSuperfluidDelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgLockAndSuperfluidDelegateResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgLockAndSuperfluidDelegateResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgLockAndSuperfluidDelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgLockAndSuperfluidDelegateResponse(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgLockAndSuperfluidDelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgSuperfluidDelegate(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgSuperfluidDelegate)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgSuperfluidDelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgSuperfluidDelegate(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgSuperfluidDelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgSuperfluidDelegateResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgSuperfluidDelegateResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgSuperfluidDelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgSuperfluidDelegateResponse(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgSuperfluidDelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgSuperfluidUnbondLock(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgSuperfluidUnbondLock)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgSuperfluidUnbondLock');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgSuperfluidUnbondLock(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgSuperfluidUnbondLock.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgSuperfluidUnbondLockResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgSuperfluidUnbondLockResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgSuperfluidUnbondLockResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgSuperfluidUnbondLockResponse(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgSuperfluidUnbondLockResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgSuperfluidUndelegate(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgSuperfluidUndelegate)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgSuperfluidUndelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgSuperfluidUndelegate(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgSuperfluidUndelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgSuperfluidUndelegateAndUnbondLock(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgSuperfluidUndelegateAndUnbondLock)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgSuperfluidUndelegateAndUnbondLock');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgSuperfluidUndelegateAndUnbondLock(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgSuperfluidUndelegateAndUnbondLock.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgSuperfluidUndelegateAndUnbondLockResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgSuperfluidUndelegateAndUnbondLockResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgSuperfluidUndelegateAndUnbondLockResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgSuperfluidUndelegateAndUnbondLockResponse(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgSuperfluidUndelegateAndUnbondLockResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgSuperfluidUndelegateResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgSuperfluidUndelegateResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgSuperfluidUndelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgSuperfluidUndelegateResponse(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgSuperfluidUndelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgUnPoolWhitelistedPool(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgUnPoolWhitelistedPool)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgUnPoolWhitelistedPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgUnPoolWhitelistedPool(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgUnPoolWhitelistedPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgUnPoolWhitelistedPoolResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgUnPoolWhitelistedPoolResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgUnPoolWhitelistedPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgUnPoolWhitelistedPoolResponse(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgUnPoolWhitelistedPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_tx_pb.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse(buffer_arg) {
  return osmosis_superfluid_tx_pb.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // Execute superfluid delegation for a lockup
superfluidDelegate: {
    path: '/osmosis.superfluid.Msg/SuperfluidDelegate',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_tx_pb.MsgSuperfluidDelegate,
    responseType: osmosis_superfluid_tx_pb.MsgSuperfluidDelegateResponse,
    requestSerialize: serialize_osmosis_superfluid_MsgSuperfluidDelegate,
    requestDeserialize: deserialize_osmosis_superfluid_MsgSuperfluidDelegate,
    responseSerialize: serialize_osmosis_superfluid_MsgSuperfluidDelegateResponse,
    responseDeserialize: deserialize_osmosis_superfluid_MsgSuperfluidDelegateResponse,
  },
  // Execute superfluid undelegation for a lockup
superfluidUndelegate: {
    path: '/osmosis.superfluid.Msg/SuperfluidUndelegate',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_tx_pb.MsgSuperfluidUndelegate,
    responseType: osmosis_superfluid_tx_pb.MsgSuperfluidUndelegateResponse,
    requestSerialize: serialize_osmosis_superfluid_MsgSuperfluidUndelegate,
    requestDeserialize: deserialize_osmosis_superfluid_MsgSuperfluidUndelegate,
    responseSerialize: serialize_osmosis_superfluid_MsgSuperfluidUndelegateResponse,
    responseDeserialize: deserialize_osmosis_superfluid_MsgSuperfluidUndelegateResponse,
  },
  // Execute superfluid redelegation for a lockup
// rpc SuperfluidRedelegate(MsgSuperfluidRedelegate) returns
// (MsgSuperfluidRedelegateResponse);
//
// For a given lock that is being superfluidly undelegated,
// also unbond the underlying lock.
superfluidUnbondLock: {
    path: '/osmosis.superfluid.Msg/SuperfluidUnbondLock',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_tx_pb.MsgSuperfluidUnbondLock,
    responseType: osmosis_superfluid_tx_pb.MsgSuperfluidUnbondLockResponse,
    requestSerialize: serialize_osmosis_superfluid_MsgSuperfluidUnbondLock,
    requestDeserialize: deserialize_osmosis_superfluid_MsgSuperfluidUnbondLock,
    responseSerialize: serialize_osmosis_superfluid_MsgSuperfluidUnbondLockResponse,
    responseDeserialize: deserialize_osmosis_superfluid_MsgSuperfluidUnbondLockResponse,
  },
  // Superfluid undelegate and unbond partial amount of the underlying lock.
superfluidUndelegateAndUnbondLock: {
    path: '/osmosis.superfluid.Msg/SuperfluidUndelegateAndUnbondLock',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_tx_pb.MsgSuperfluidUndelegateAndUnbondLock,
    responseType: osmosis_superfluid_tx_pb.MsgSuperfluidUndelegateAndUnbondLockResponse,
    requestSerialize: serialize_osmosis_superfluid_MsgSuperfluidUndelegateAndUnbondLock,
    requestDeserialize: deserialize_osmosis_superfluid_MsgSuperfluidUndelegateAndUnbondLock,
    responseSerialize: serialize_osmosis_superfluid_MsgSuperfluidUndelegateAndUnbondLockResponse,
    responseDeserialize: deserialize_osmosis_superfluid_MsgSuperfluidUndelegateAndUnbondLockResponse,
  },
  // Execute lockup lock and superfluid delegation in a single msg
lockAndSuperfluidDelegate: {
    path: '/osmosis.superfluid.Msg/LockAndSuperfluidDelegate',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_tx_pb.MsgLockAndSuperfluidDelegate,
    responseType: osmosis_superfluid_tx_pb.MsgLockAndSuperfluidDelegateResponse,
    requestSerialize: serialize_osmosis_superfluid_MsgLockAndSuperfluidDelegate,
    requestDeserialize: deserialize_osmosis_superfluid_MsgLockAndSuperfluidDelegate,
    responseSerialize: serialize_osmosis_superfluid_MsgLockAndSuperfluidDelegateResponse,
    responseDeserialize: deserialize_osmosis_superfluid_MsgLockAndSuperfluidDelegateResponse,
  },
  createFullRangePositionAndSuperfluidDelegate: {
    path: '/osmosis.superfluid.Msg/CreateFullRangePositionAndSuperfluidDelegate',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_tx_pb.MsgCreateFullRangePositionAndSuperfluidDelegate,
    responseType: osmosis_superfluid_tx_pb.MsgCreateFullRangePositionAndSuperfluidDelegateResponse,
    requestSerialize: serialize_osmosis_superfluid_MsgCreateFullRangePositionAndSuperfluidDelegate,
    requestDeserialize: deserialize_osmosis_superfluid_MsgCreateFullRangePositionAndSuperfluidDelegate,
    responseSerialize: serialize_osmosis_superfluid_MsgCreateFullRangePositionAndSuperfluidDelegateResponse,
    responseDeserialize: deserialize_osmosis_superfluid_MsgCreateFullRangePositionAndSuperfluidDelegateResponse,
  },
  unPoolWhitelistedPool: {
    path: '/osmosis.superfluid.Msg/UnPoolWhitelistedPool',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_tx_pb.MsgUnPoolWhitelistedPool,
    responseType: osmosis_superfluid_tx_pb.MsgUnPoolWhitelistedPoolResponse,
    requestSerialize: serialize_osmosis_superfluid_MsgUnPoolWhitelistedPool,
    requestDeserialize: deserialize_osmosis_superfluid_MsgUnPoolWhitelistedPool,
    responseSerialize: serialize_osmosis_superfluid_MsgUnPoolWhitelistedPoolResponse,
    responseDeserialize: deserialize_osmosis_superfluid_MsgUnPoolWhitelistedPoolResponse,
  },
  unlockAndMigrateSharesToFullRangeConcentratedPosition: {
    path: '/osmosis.superfluid.Msg/UnlockAndMigrateSharesToFullRangeConcentratedPosition',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_tx_pb.MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition,
    responseType: osmosis_superfluid_tx_pb.MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse,
    requestSerialize: serialize_osmosis_superfluid_MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition,
    requestDeserialize: deserialize_osmosis_superfluid_MsgUnlockAndMigrateSharesToFullRangeConcentratedPosition,
    responseSerialize: serialize_osmosis_superfluid_MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse,
    responseDeserialize: deserialize_osmosis_superfluid_MsgUnlockAndMigrateSharesToFullRangeConcentratedPositionResponse,
  },
  addToConcentratedLiquiditySuperfluidPosition: {
    path: '/osmosis.superfluid.Msg/AddToConcentratedLiquiditySuperfluidPosition',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_tx_pb.MsgAddToConcentratedLiquiditySuperfluidPosition,
    responseType: osmosis_superfluid_tx_pb.MsgAddToConcentratedLiquiditySuperfluidPositionResponse,
    requestSerialize: serialize_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPosition,
    requestDeserialize: deserialize_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPosition,
    responseSerialize: serialize_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPositionResponse,
    responseDeserialize: deserialize_osmosis_superfluid_MsgAddToConcentratedLiquiditySuperfluidPositionResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
