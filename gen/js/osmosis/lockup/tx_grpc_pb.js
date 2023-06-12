// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_lockup_tx_pb = require('../../osmosis/lockup/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var amino_amino_pb = require('../../amino/amino_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var osmosis_lockup_lock_pb = require('../../osmosis/lockup/lock_pb.js');

function serialize_osmosis_lockup_MsgBeginUnlocking(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgBeginUnlocking)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgBeginUnlocking');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgBeginUnlocking(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgBeginUnlocking.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_MsgBeginUnlockingAll(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgBeginUnlockingAll)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgBeginUnlockingAll');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgBeginUnlockingAll(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgBeginUnlockingAll.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_MsgBeginUnlockingAllResponse(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgBeginUnlockingAllResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgBeginUnlockingAllResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgBeginUnlockingAllResponse(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgBeginUnlockingAllResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_MsgBeginUnlockingResponse(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgBeginUnlockingResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgBeginUnlockingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgBeginUnlockingResponse(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgBeginUnlockingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_MsgExtendLockup(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgExtendLockup)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgExtendLockup');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgExtendLockup(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgExtendLockup.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_MsgExtendLockupResponse(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgExtendLockupResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgExtendLockupResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgExtendLockupResponse(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgExtendLockupResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_MsgForceUnlock(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgForceUnlock)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgForceUnlock');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgForceUnlock(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgForceUnlock.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_MsgForceUnlockResponse(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgForceUnlockResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgForceUnlockResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgForceUnlockResponse(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgForceUnlockResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_MsgLockTokens(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgLockTokens)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgLockTokens');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgLockTokens(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgLockTokens.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_MsgLockTokensResponse(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgLockTokensResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgLockTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgLockTokensResponse(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgLockTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_MsgSetRewardReceiverAddress(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgSetRewardReceiverAddress)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgSetRewardReceiverAddress');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgSetRewardReceiverAddress(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgSetRewardReceiverAddress.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_lockup_MsgSetRewardReceiverAddressResponse(arg) {
  if (!(arg instanceof osmosis_lockup_tx_pb.MsgSetRewardReceiverAddressResponse)) {
    throw new Error('Expected argument of type osmosis.lockup.MsgSetRewardReceiverAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_lockup_MsgSetRewardReceiverAddressResponse(buffer_arg) {
  return osmosis_lockup_tx_pb.MsgSetRewardReceiverAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // LockTokens lock tokens
lockTokens: {
    path: '/osmosis.lockup.Msg/LockTokens',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_tx_pb.MsgLockTokens,
    responseType: osmosis_lockup_tx_pb.MsgLockTokensResponse,
    requestSerialize: serialize_osmosis_lockup_MsgLockTokens,
    requestDeserialize: deserialize_osmosis_lockup_MsgLockTokens,
    responseSerialize: serialize_osmosis_lockup_MsgLockTokensResponse,
    responseDeserialize: deserialize_osmosis_lockup_MsgLockTokensResponse,
  },
  // BeginUnlockingAll begin unlocking all tokens
beginUnlockingAll: {
    path: '/osmosis.lockup.Msg/BeginUnlockingAll',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_tx_pb.MsgBeginUnlockingAll,
    responseType: osmosis_lockup_tx_pb.MsgBeginUnlockingAllResponse,
    requestSerialize: serialize_osmosis_lockup_MsgBeginUnlockingAll,
    requestDeserialize: deserialize_osmosis_lockup_MsgBeginUnlockingAll,
    responseSerialize: serialize_osmosis_lockup_MsgBeginUnlockingAllResponse,
    responseDeserialize: deserialize_osmosis_lockup_MsgBeginUnlockingAllResponse,
  },
  // MsgBeginUnlocking begins unlocking tokens by lock ID
beginUnlocking: {
    path: '/osmosis.lockup.Msg/BeginUnlocking',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_tx_pb.MsgBeginUnlocking,
    responseType: osmosis_lockup_tx_pb.MsgBeginUnlockingResponse,
    requestSerialize: serialize_osmosis_lockup_MsgBeginUnlocking,
    requestDeserialize: deserialize_osmosis_lockup_MsgBeginUnlocking,
    responseSerialize: serialize_osmosis_lockup_MsgBeginUnlockingResponse,
    responseDeserialize: deserialize_osmosis_lockup_MsgBeginUnlockingResponse,
  },
  // MsgEditLockup edits the existing lockups by lock ID
extendLockup: {
    path: '/osmosis.lockup.Msg/ExtendLockup',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_tx_pb.MsgExtendLockup,
    responseType: osmosis_lockup_tx_pb.MsgExtendLockupResponse,
    requestSerialize: serialize_osmosis_lockup_MsgExtendLockup,
    requestDeserialize: deserialize_osmosis_lockup_MsgExtendLockup,
    responseSerialize: serialize_osmosis_lockup_MsgExtendLockupResponse,
    responseDeserialize: deserialize_osmosis_lockup_MsgExtendLockupResponse,
  },
  forceUnlock: {
    path: '/osmosis.lockup.Msg/ForceUnlock',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_tx_pb.MsgForceUnlock,
    responseType: osmosis_lockup_tx_pb.MsgForceUnlockResponse,
    requestSerialize: serialize_osmosis_lockup_MsgForceUnlock,
    requestDeserialize: deserialize_osmosis_lockup_MsgForceUnlock,
    responseSerialize: serialize_osmosis_lockup_MsgForceUnlockResponse,
    responseDeserialize: deserialize_osmosis_lockup_MsgForceUnlockResponse,
  },
  // SetRewardReceiverAddress edits the reward receiver for the given lock ID
setRewardReceiverAddress: {
    path: '/osmosis.lockup.Msg/SetRewardReceiverAddress',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_lockup_tx_pb.MsgSetRewardReceiverAddress,
    responseType: osmosis_lockup_tx_pb.MsgSetRewardReceiverAddressResponse,
    requestSerialize: serialize_osmosis_lockup_MsgSetRewardReceiverAddress,
    requestDeserialize: deserialize_osmosis_lockup_MsgSetRewardReceiverAddress,
    responseSerialize: serialize_osmosis_lockup_MsgSetRewardReceiverAddressResponse,
    responseDeserialize: deserialize_osmosis_lockup_MsgSetRewardReceiverAddressResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
