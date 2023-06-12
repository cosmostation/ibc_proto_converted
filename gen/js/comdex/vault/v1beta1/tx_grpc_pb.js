// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_vault_v1beta1_tx_pb = require('../../../comdex/vault/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_comdex_vault_v1beta1_MsgCloseRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgCloseRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgCloseRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgCloseRequest(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgCloseRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgCloseResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgCloseResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgCloseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgCloseResponse(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgCloseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgCreateRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgCreateRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgCreateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgCreateRequest(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgCreateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgCreateResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgCreateResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgCreateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgCreateResponse(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgCreateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgCreateStableMintRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgCreateStableMintRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgCreateStableMintRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgCreateStableMintRequest(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgCreateStableMintRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgCreateStableMintResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgCreateStableMintResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgCreateStableMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgCreateStableMintResponse(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgCreateStableMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgDepositAndDrawRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgDepositAndDrawRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgDepositAndDrawRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgDepositAndDrawRequest(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgDepositAndDrawRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgDepositAndDrawResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgDepositAndDrawResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgDepositAndDrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgDepositAndDrawResponse(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgDepositAndDrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgDepositRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgDepositRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgDepositRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgDepositRequest(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgDepositRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgDepositResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgDepositResponse(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgDepositStableMintRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgDepositStableMintRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgDepositStableMintRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgDepositStableMintRequest(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgDepositStableMintRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgDepositStableMintResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgDepositStableMintResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgDepositStableMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgDepositStableMintResponse(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgDepositStableMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgDrawRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgDrawRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgDrawRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgDrawRequest(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgDrawRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgDrawResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgDrawResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgDrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgDrawResponse(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgDrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgRepayRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgRepayRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgRepayRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgRepayRequest(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgRepayRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgRepayResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgRepayResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgRepayResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgRepayResponse(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgRepayResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgVaultInterestCalcRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgVaultInterestCalcRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgVaultInterestCalcRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgVaultInterestCalcRequest(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgVaultInterestCalcRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgVaultInterestCalcResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgVaultInterestCalcResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgVaultInterestCalcResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgVaultInterestCalcResponse(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgVaultInterestCalcResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgWithdrawRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgWithdrawRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgWithdrawRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgWithdrawRequest(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgWithdrawRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgWithdrawResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgWithdrawResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgWithdrawResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgWithdrawResponse(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgWithdrawResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgWithdrawStableMintRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgWithdrawStableMintRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgWithdrawStableMintRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgWithdrawStableMintRequest(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgWithdrawStableMintRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_MsgWithdrawStableMintResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_tx_pb.MsgWithdrawStableMintResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.MsgWithdrawStableMintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_MsgWithdrawStableMintResponse(buffer_arg) {
  return comdex_vault_v1beta1_tx_pb.MsgWithdrawStableMintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  msgCreate: {
    path: '/comdex.vault.v1beta1.Msg/MsgCreate',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_tx_pb.MsgCreateRequest,
    responseType: comdex_vault_v1beta1_tx_pb.MsgCreateResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_MsgCreateRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_MsgCreateRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_MsgCreateResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_MsgCreateResponse,
  },
  msgDeposit: {
    path: '/comdex.vault.v1beta1.Msg/MsgDeposit',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_tx_pb.MsgDepositRequest,
    responseType: comdex_vault_v1beta1_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_MsgDepositRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_MsgDepositRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_MsgDepositResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_MsgDepositResponse,
  },
  msgWithdraw: {
    path: '/comdex.vault.v1beta1.Msg/MsgWithdraw',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_tx_pb.MsgWithdrawRequest,
    responseType: comdex_vault_v1beta1_tx_pb.MsgWithdrawResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_MsgWithdrawRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_MsgWithdrawRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_MsgWithdrawResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_MsgWithdrawResponse,
  },
  msgDraw: {
    path: '/comdex.vault.v1beta1.Msg/MsgDraw',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_tx_pb.MsgDrawRequest,
    responseType: comdex_vault_v1beta1_tx_pb.MsgDrawResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_MsgDrawRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_MsgDrawRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_MsgDrawResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_MsgDrawResponse,
  },
  msgRepay: {
    path: '/comdex.vault.v1beta1.Msg/MsgRepay',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_tx_pb.MsgRepayRequest,
    responseType: comdex_vault_v1beta1_tx_pb.MsgRepayResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_MsgRepayRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_MsgRepayRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_MsgRepayResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_MsgRepayResponse,
  },
  msgClose: {
    path: '/comdex.vault.v1beta1.Msg/MsgClose',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_tx_pb.MsgCloseRequest,
    responseType: comdex_vault_v1beta1_tx_pb.MsgCloseResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_MsgCloseRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_MsgCloseRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_MsgCloseResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_MsgCloseResponse,
  },
  msgDepositAndDraw: {
    path: '/comdex.vault.v1beta1.Msg/MsgDepositAndDraw',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_tx_pb.MsgDepositAndDrawRequest,
    responseType: comdex_vault_v1beta1_tx_pb.MsgDepositAndDrawResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_MsgDepositAndDrawRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_MsgDepositAndDrawRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_MsgDepositAndDrawResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_MsgDepositAndDrawResponse,
  },
  msgCreateStableMint: {
    path: '/comdex.vault.v1beta1.Msg/MsgCreateStableMint',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_tx_pb.MsgCreateStableMintRequest,
    responseType: comdex_vault_v1beta1_tx_pb.MsgCreateStableMintResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_MsgCreateStableMintRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_MsgCreateStableMintRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_MsgCreateStableMintResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_MsgCreateStableMintResponse,
  },
  msgDepositStableMint: {
    path: '/comdex.vault.v1beta1.Msg/MsgDepositStableMint',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_tx_pb.MsgDepositStableMintRequest,
    responseType: comdex_vault_v1beta1_tx_pb.MsgDepositStableMintResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_MsgDepositStableMintRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_MsgDepositStableMintRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_MsgDepositStableMintResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_MsgDepositStableMintResponse,
  },
  msgWithdrawStableMint: {
    path: '/comdex.vault.v1beta1.Msg/MsgWithdrawStableMint',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_tx_pb.MsgWithdrawStableMintRequest,
    responseType: comdex_vault_v1beta1_tx_pb.MsgWithdrawStableMintResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_MsgWithdrawStableMintRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_MsgWithdrawStableMintRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_MsgWithdrawStableMintResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_MsgWithdrawStableMintResponse,
  },
  msgVaultInterestCalc: {
    path: '/comdex.vault.v1beta1.Msg/MsgVaultInterestCalc',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_tx_pb.MsgVaultInterestCalcRequest,
    responseType: comdex_vault_v1beta1_tx_pb.MsgVaultInterestCalcResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_MsgVaultInterestCalcRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_MsgVaultInterestCalcRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_MsgVaultInterestCalcResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_MsgVaultInterestCalcResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
