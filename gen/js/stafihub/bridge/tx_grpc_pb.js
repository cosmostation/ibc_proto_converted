// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_bridge_tx_pb = require('../../stafihub/bridge/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var stafihub_bridge_genesis_pb = require('../../stafihub/bridge/genesis_pb.js');

function serialize_stafihub_stafihub_bridge_MsgAddBannedDenom(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgAddBannedDenom)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgAddBannedDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgAddBannedDenom(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgAddBannedDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgAddBannedDenomResponse(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgAddBannedDenomResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgAddBannedDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgAddBannedDenomResponse(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgAddBannedDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgAddChainId(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgAddChainId)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgAddChainId');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgAddChainId(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgAddChainId.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgAddChainIdResponse(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgAddChainIdResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgAddChainIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgAddChainIdResponse(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgAddChainIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgDeposit(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgDeposit(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgDepositResponse(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgDepositResponse(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgRmBannedDenom(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgRmBannedDenom)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgRmBannedDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgRmBannedDenom(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgRmBannedDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgRmBannedDenomResponse(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgRmBannedDenomResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgRmBannedDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgRmBannedDenomResponse(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgRmBannedDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgRmChainId(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgRmChainId)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgRmChainId');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgRmChainId(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgRmChainId.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgRmChainIdResponse(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgRmChainIdResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgRmChainIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgRmChainIdResponse(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgRmChainIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgSetRelayFee(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgSetRelayFee)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgSetRelayFee');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgSetRelayFee(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgSetRelayFee.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgSetRelayFeeReceiver(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgSetRelayFeeReceiver)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgSetRelayFeeReceiver');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgSetRelayFeeReceiver(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgSetRelayFeeReceiver.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgSetRelayFeeReceiverResponse(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgSetRelayFeeReceiverResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgSetRelayFeeReceiverResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgSetRelayFeeReceiverResponse(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgSetRelayFeeReceiverResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgSetRelayFeeResponse(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgSetRelayFeeResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgSetRelayFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgSetRelayFeeResponse(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgSetRelayFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgSetResourceidToDenom(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgSetResourceidToDenom)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgSetResourceidToDenom');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgSetResourceidToDenom(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgSetResourceidToDenom.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgSetResourceidToDenomResponse(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgSetResourceidToDenomResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgSetResourceidToDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgSetResourceidToDenomResponse(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgSetResourceidToDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgVoteProposal(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgVoteProposal)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgVoteProposal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgVoteProposal(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgVoteProposal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_MsgVoteProposalResponse(arg) {
  if (!(arg instanceof stafihub_bridge_tx_pb.MsgVoteProposalResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.MsgVoteProposalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_MsgVoteProposalResponse(buffer_arg) {
  return stafihub_bridge_tx_pb.MsgVoteProposalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  setResourceidToDenom: {
    path: '/stafihub.stafihub.bridge.Msg/SetResourceidToDenom',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_tx_pb.MsgSetResourceidToDenom,
    responseType: stafihub_bridge_tx_pb.MsgSetResourceidToDenomResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_MsgSetResourceidToDenom,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_MsgSetResourceidToDenom,
    responseSerialize: serialize_stafihub_stafihub_bridge_MsgSetResourceidToDenomResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_MsgSetResourceidToDenomResponse,
  },
  deposit: {
    path: '/stafihub.stafihub.bridge.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_tx_pb.MsgDeposit,
    responseType: stafihub_bridge_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_MsgDeposit,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_MsgDeposit,
    responseSerialize: serialize_stafihub_stafihub_bridge_MsgDepositResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_MsgDepositResponse,
  },
  addChainId: {
    path: '/stafihub.stafihub.bridge.Msg/AddChainId',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_tx_pb.MsgAddChainId,
    responseType: stafihub_bridge_tx_pb.MsgAddChainIdResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_MsgAddChainId,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_MsgAddChainId,
    responseSerialize: serialize_stafihub_stafihub_bridge_MsgAddChainIdResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_MsgAddChainIdResponse,
  },
  voteProposal: {
    path: '/stafihub.stafihub.bridge.Msg/VoteProposal',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_tx_pb.MsgVoteProposal,
    responseType: stafihub_bridge_tx_pb.MsgVoteProposalResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_MsgVoteProposal,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_MsgVoteProposal,
    responseSerialize: serialize_stafihub_stafihub_bridge_MsgVoteProposalResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_MsgVoteProposalResponse,
  },
  rmChainId: {
    path: '/stafihub.stafihub.bridge.Msg/RmChainId',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_tx_pb.MsgRmChainId,
    responseType: stafihub_bridge_tx_pb.MsgRmChainIdResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_MsgRmChainId,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_MsgRmChainId,
    responseSerialize: serialize_stafihub_stafihub_bridge_MsgRmChainIdResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_MsgRmChainIdResponse,
  },
  setRelayFeeReceiver: {
    path: '/stafihub.stafihub.bridge.Msg/SetRelayFeeReceiver',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_tx_pb.MsgSetRelayFeeReceiver,
    responseType: stafihub_bridge_tx_pb.MsgSetRelayFeeReceiverResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_MsgSetRelayFeeReceiver,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_MsgSetRelayFeeReceiver,
    responseSerialize: serialize_stafihub_stafihub_bridge_MsgSetRelayFeeReceiverResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_MsgSetRelayFeeReceiverResponse,
  },
  setRelayFee: {
    path: '/stafihub.stafihub.bridge.Msg/SetRelayFee',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_tx_pb.MsgSetRelayFee,
    responseType: stafihub_bridge_tx_pb.MsgSetRelayFeeResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_MsgSetRelayFee,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_MsgSetRelayFee,
    responseSerialize: serialize_stafihub_stafihub_bridge_MsgSetRelayFeeResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_MsgSetRelayFeeResponse,
  },
  addBannedDenom: {
    path: '/stafihub.stafihub.bridge.Msg/AddBannedDenom',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_tx_pb.MsgAddBannedDenom,
    responseType: stafihub_bridge_tx_pb.MsgAddBannedDenomResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_MsgAddBannedDenom,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_MsgAddBannedDenom,
    responseSerialize: serialize_stafihub_stafihub_bridge_MsgAddBannedDenomResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_MsgAddBannedDenomResponse,
  },
  rmBannedDenom: {
    path: '/stafihub.stafihub.bridge.Msg/RmBannedDenom',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_tx_pb.MsgRmBannedDenom,
    responseType: stafihub_bridge_tx_pb.MsgRmBannedDenomResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_MsgRmBannedDenom,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_MsgRmBannedDenom,
    responseSerialize: serialize_stafihub_stafihub_bridge_MsgRmBannedDenomResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_MsgRmBannedDenomResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
