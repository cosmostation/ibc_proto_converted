// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_delegation_v1beta1_tx_pb = require('../../../kyve/delegation/v1beta1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_kyve_delegation_v1beta1_MsgDelegate(arg) {
  if (!(arg instanceof kyve_delegation_v1beta1_tx_pb.MsgDelegate)) {
    throw new Error('Expected argument of type kyve.delegation.v1beta1.MsgDelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_delegation_v1beta1_MsgDelegate(buffer_arg) {
  return kyve_delegation_v1beta1_tx_pb.MsgDelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_delegation_v1beta1_MsgDelegateResponse(arg) {
  if (!(arg instanceof kyve_delegation_v1beta1_tx_pb.MsgDelegateResponse)) {
    throw new Error('Expected argument of type kyve.delegation.v1beta1.MsgDelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_delegation_v1beta1_MsgDelegateResponse(buffer_arg) {
  return kyve_delegation_v1beta1_tx_pb.MsgDelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_delegation_v1beta1_MsgRedelegate(arg) {
  if (!(arg instanceof kyve_delegation_v1beta1_tx_pb.MsgRedelegate)) {
    throw new Error('Expected argument of type kyve.delegation.v1beta1.MsgRedelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_delegation_v1beta1_MsgRedelegate(buffer_arg) {
  return kyve_delegation_v1beta1_tx_pb.MsgRedelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_delegation_v1beta1_MsgRedelegateResponse(arg) {
  if (!(arg instanceof kyve_delegation_v1beta1_tx_pb.MsgRedelegateResponse)) {
    throw new Error('Expected argument of type kyve.delegation.v1beta1.MsgRedelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_delegation_v1beta1_MsgRedelegateResponse(buffer_arg) {
  return kyve_delegation_v1beta1_tx_pb.MsgRedelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_delegation_v1beta1_MsgUndelegate(arg) {
  if (!(arg instanceof kyve_delegation_v1beta1_tx_pb.MsgUndelegate)) {
    throw new Error('Expected argument of type kyve.delegation.v1beta1.MsgUndelegate');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_delegation_v1beta1_MsgUndelegate(buffer_arg) {
  return kyve_delegation_v1beta1_tx_pb.MsgUndelegate.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_delegation_v1beta1_MsgUndelegateResponse(arg) {
  if (!(arg instanceof kyve_delegation_v1beta1_tx_pb.MsgUndelegateResponse)) {
    throw new Error('Expected argument of type kyve.delegation.v1beta1.MsgUndelegateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_delegation_v1beta1_MsgUndelegateResponse(buffer_arg) {
  return kyve_delegation_v1beta1_tx_pb.MsgUndelegateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_delegation_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof kyve_delegation_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type kyve.delegation.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_delegation_v1beta1_MsgUpdateParams(buffer_arg) {
  return kyve_delegation_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_delegation_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof kyve_delegation_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type kyve.delegation.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_delegation_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return kyve_delegation_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_delegation_v1beta1_MsgWithdrawRewards(arg) {
  if (!(arg instanceof kyve_delegation_v1beta1_tx_pb.MsgWithdrawRewards)) {
    throw new Error('Expected argument of type kyve.delegation.v1beta1.MsgWithdrawRewards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_delegation_v1beta1_MsgWithdrawRewards(buffer_arg) {
  return kyve_delegation_v1beta1_tx_pb.MsgWithdrawRewards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_delegation_v1beta1_MsgWithdrawRewardsResponse(arg) {
  if (!(arg instanceof kyve_delegation_v1beta1_tx_pb.MsgWithdrawRewardsResponse)) {
    throw new Error('Expected argument of type kyve.delegation.v1beta1.MsgWithdrawRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_delegation_v1beta1_MsgWithdrawRewardsResponse(buffer_arg) {
  return kyve_delegation_v1beta1_tx_pb.MsgWithdrawRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // Delegate ...
delegate: {
    path: '/kyve.delegation.v1beta1.Msg/Delegate',
    requestStream: false,
    responseStream: false,
    requestType: kyve_delegation_v1beta1_tx_pb.MsgDelegate,
    responseType: kyve_delegation_v1beta1_tx_pb.MsgDelegateResponse,
    requestSerialize: serialize_kyve_delegation_v1beta1_MsgDelegate,
    requestDeserialize: deserialize_kyve_delegation_v1beta1_MsgDelegate,
    responseSerialize: serialize_kyve_delegation_v1beta1_MsgDelegateResponse,
    responseDeserialize: deserialize_kyve_delegation_v1beta1_MsgDelegateResponse,
  },
  // Withdraw ...
withdrawRewards: {
    path: '/kyve.delegation.v1beta1.Msg/WithdrawRewards',
    requestStream: false,
    responseStream: false,
    requestType: kyve_delegation_v1beta1_tx_pb.MsgWithdrawRewards,
    responseType: kyve_delegation_v1beta1_tx_pb.MsgWithdrawRewardsResponse,
    requestSerialize: serialize_kyve_delegation_v1beta1_MsgWithdrawRewards,
    requestDeserialize: deserialize_kyve_delegation_v1beta1_MsgWithdrawRewards,
    responseSerialize: serialize_kyve_delegation_v1beta1_MsgWithdrawRewardsResponse,
    responseDeserialize: deserialize_kyve_delegation_v1beta1_MsgWithdrawRewardsResponse,
  },
  // Undelegate ...
undelegate: {
    path: '/kyve.delegation.v1beta1.Msg/Undelegate',
    requestStream: false,
    responseStream: false,
    requestType: kyve_delegation_v1beta1_tx_pb.MsgUndelegate,
    responseType: kyve_delegation_v1beta1_tx_pb.MsgUndelegateResponse,
    requestSerialize: serialize_kyve_delegation_v1beta1_MsgUndelegate,
    requestDeserialize: deserialize_kyve_delegation_v1beta1_MsgUndelegate,
    responseSerialize: serialize_kyve_delegation_v1beta1_MsgUndelegateResponse,
    responseDeserialize: deserialize_kyve_delegation_v1beta1_MsgUndelegateResponse,
  },
  // Redelegate ...
redelegate: {
    path: '/kyve.delegation.v1beta1.Msg/Redelegate',
    requestStream: false,
    responseStream: false,
    requestType: kyve_delegation_v1beta1_tx_pb.MsgRedelegate,
    responseType: kyve_delegation_v1beta1_tx_pb.MsgRedelegateResponse,
    requestSerialize: serialize_kyve_delegation_v1beta1_MsgRedelegate,
    requestDeserialize: deserialize_kyve_delegation_v1beta1_MsgRedelegate,
    responseSerialize: serialize_kyve_delegation_v1beta1_MsgRedelegateResponse,
    responseDeserialize: deserialize_kyve_delegation_v1beta1_MsgRedelegateResponse,
  },
  // UpdateParams defines a governance operation for updating the x/delegation module
// parameters. The authority is hard-coded to the x/gov module account.
updateParams: {
    path: '/kyve.delegation.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: kyve_delegation_v1beta1_tx_pb.MsgUpdateParams,
    responseType: kyve_delegation_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_kyve_delegation_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_kyve_delegation_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_kyve_delegation_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_kyve_delegation_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
