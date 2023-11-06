// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ibc_applications_interchain_accounts_controller_v1_tx_pb = require('../../../../../ibc/applications/interchain_accounts/controller/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../../../gogoproto/gogo_pb.js');
var ibc_applications_interchain_accounts_v1_packet_pb = require('../../../../../ibc/applications/interchain_accounts/v1/packet_pb.js');
var ibc_applications_interchain_accounts_controller_v1_controller_pb = require('../../../../../ibc/applications/interchain_accounts/controller/v1/controller_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../../../cosmos/msg/v1/msg_pb.js');

function serialize_ibc_applications_interchain_accounts_controller_v1_MsgRegisterInterchainAccount(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgRegisterInterchainAccount)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.controller.v1.MsgRegisterInterchainAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_controller_v1_MsgRegisterInterchainAccount(buffer_arg) {
  return ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgRegisterInterchainAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_interchain_accounts_controller_v1_MsgRegisterInterchainAccountResponse(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgRegisterInterchainAccountResponse)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.controller.v1.MsgRegisterInterchainAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_controller_v1_MsgRegisterInterchainAccountResponse(buffer_arg) {
  return ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgRegisterInterchainAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_interchain_accounts_controller_v1_MsgSendTx(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgSendTx)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.controller.v1.MsgSendTx');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_controller_v1_MsgSendTx(buffer_arg) {
  return ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgSendTx.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_interchain_accounts_controller_v1_MsgSendTxResponse(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgSendTxResponse)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.controller.v1.MsgSendTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_controller_v1_MsgSendTxResponse(buffer_arg) {
  return ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgSendTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_interchain_accounts_controller_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.controller.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_controller_v1_MsgUpdateParams(buffer_arg) {
  return ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_interchain_accounts_controller_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type ibc.applications.interchain_accounts.controller.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_interchain_accounts_controller_v1_MsgUpdateParamsResponse(buffer_arg) {
  return ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the 27-interchain-accounts/controller Msg service.
var MsgService = exports.MsgService = {
  // RegisterInterchainAccount defines a rpc handler for MsgRegisterInterchainAccount.
registerInterchainAccount: {
    path: '/ibc.applications.interchain_accounts.controller.v1.Msg/RegisterInterchainAccount',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgRegisterInterchainAccount,
    responseType: ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgRegisterInterchainAccountResponse,
    requestSerialize: serialize_ibc_applications_interchain_accounts_controller_v1_MsgRegisterInterchainAccount,
    requestDeserialize: deserialize_ibc_applications_interchain_accounts_controller_v1_MsgRegisterInterchainAccount,
    responseSerialize: serialize_ibc_applications_interchain_accounts_controller_v1_MsgRegisterInterchainAccountResponse,
    responseDeserialize: deserialize_ibc_applications_interchain_accounts_controller_v1_MsgRegisterInterchainAccountResponse,
  },
  // SendTx defines a rpc handler for MsgSendTx.
sendTx: {
    path: '/ibc.applications.interchain_accounts.controller.v1.Msg/SendTx',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgSendTx,
    responseType: ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgSendTxResponse,
    requestSerialize: serialize_ibc_applications_interchain_accounts_controller_v1_MsgSendTx,
    requestDeserialize: deserialize_ibc_applications_interchain_accounts_controller_v1_MsgSendTx,
    responseSerialize: serialize_ibc_applications_interchain_accounts_controller_v1_MsgSendTxResponse,
    responseDeserialize: deserialize_ibc_applications_interchain_accounts_controller_v1_MsgSendTxResponse,
  },
  // UpdateParams defines a rpc handler for MsgUpdateParams.
updateParams: {
    path: '/ibc.applications.interchain_accounts.controller.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgUpdateParams,
    responseType: ibc_applications_interchain_accounts_controller_v1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_ibc_applications_interchain_accounts_controller_v1_MsgUpdateParams,
    requestDeserialize: deserialize_ibc_applications_interchain_accounts_controller_v1_MsgUpdateParams,
    responseSerialize: serialize_ibc_applications_interchain_accounts_controller_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_ibc_applications_interchain_accounts_controller_v1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
