// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_bank_v1beta1_tx_pb = require('../../../cosmos/bank/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_bank_v1beta1_bank_pb = require('../../../cosmos/bank/v1beta1/bank_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');

function serialize_cosmos_bank_v1beta1_MsgMultiSend(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_tx_pb.MsgMultiSend)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.MsgMultiSend');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_MsgMultiSend(buffer_arg) {
  return cosmos_bank_v1beta1_tx_pb.MsgMultiSend.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_MsgMultiSendResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_tx_pb.MsgMultiSendResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.MsgMultiSendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_MsgMultiSendResponse(buffer_arg) {
  return cosmos_bank_v1beta1_tx_pb.MsgMultiSendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_MsgSend(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_tx_pb.MsgSend)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.MsgSend');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_MsgSend(buffer_arg) {
  return cosmos_bank_v1beta1_tx_pb.MsgSend.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_MsgSendResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_tx_pb.MsgSendResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.MsgSendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_MsgSendResponse(buffer_arg) {
  return cosmos_bank_v1beta1_tx_pb.MsgSendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_MsgSetSendEnabled(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_tx_pb.MsgSetSendEnabled)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.MsgSetSendEnabled');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_MsgSetSendEnabled(buffer_arg) {
  return cosmos_bank_v1beta1_tx_pb.MsgSetSendEnabled.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_MsgSetSendEnabledResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_tx_pb.MsgSetSendEnabledResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.MsgSetSendEnabledResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_MsgSetSendEnabledResponse(buffer_arg) {
  return cosmos_bank_v1beta1_tx_pb.MsgSetSendEnabledResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_MsgUpdateParams(buffer_arg) {
  return cosmos_bank_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_bank_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof cosmos_bank_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type cosmos.bank.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_bank_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return cosmos_bank_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the bank Msg service.
var MsgService = exports.MsgService = {
  // Send defines a method for sending coins from one account to another account.
send: {
    path: '/cosmos.bank.v1beta1.Msg/Send',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_tx_pb.MsgSend,
    responseType: cosmos_bank_v1beta1_tx_pb.MsgSendResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_MsgSend,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_MsgSend,
    responseSerialize: serialize_cosmos_bank_v1beta1_MsgSendResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_MsgSendResponse,
  },
  // MultiSend defines a method for sending coins from some accounts to other accounts.
multiSend: {
    path: '/cosmos.bank.v1beta1.Msg/MultiSend',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_tx_pb.MsgMultiSend,
    responseType: cosmos_bank_v1beta1_tx_pb.MsgMultiSendResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_MsgMultiSend,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_MsgMultiSend,
    responseSerialize: serialize_cosmos_bank_v1beta1_MsgMultiSendResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_MsgMultiSendResponse,
  },
  // UpdateParams defines a governance operation for updating the x/bank module parameters.
// The authority is defined in the keeper.
//
// Since: cosmos-sdk 0.47
updateParams: {
    path: '/cosmos.bank.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_tx_pb.MsgUpdateParams,
    responseType: cosmos_bank_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_cosmos_bank_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_MsgUpdateParamsResponse,
  },
  // SetSendEnabled is a governance operation for setting the SendEnabled flag
// on any number of Denoms. Only the entries to add or update should be
// included. Entries that already exist in the store, but that aren't
// included in this message, will be left unchanged.
//
// Since: cosmos-sdk 0.47
setSendEnabled: {
    path: '/cosmos.bank.v1beta1.Msg/SetSendEnabled',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_bank_v1beta1_tx_pb.MsgSetSendEnabled,
    responseType: cosmos_bank_v1beta1_tx_pb.MsgSetSendEnabledResponse,
    requestSerialize: serialize_cosmos_bank_v1beta1_MsgSetSendEnabled,
    requestDeserialize: deserialize_cosmos_bank_v1beta1_MsgSetSendEnabled,
    responseSerialize: serialize_cosmos_bank_v1beta1_MsgSetSendEnabledResponse,
    responseDeserialize: deserialize_cosmos_bank_v1beta1_MsgSetSendEnabledResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
