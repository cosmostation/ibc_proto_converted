// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_accounts_v1_tx_pb = require('../../../cosmos/accounts/v1/tx_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');

function serialize_cosmos_accounts_v1_MsgExecute(arg) {
  if (!(arg instanceof cosmos_accounts_v1_tx_pb.MsgExecute)) {
    throw new Error('Expected argument of type cosmos.accounts.v1.MsgExecute');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_accounts_v1_MsgExecute(buffer_arg) {
  return cosmos_accounts_v1_tx_pb.MsgExecute.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_accounts_v1_MsgExecuteResponse(arg) {
  if (!(arg instanceof cosmos_accounts_v1_tx_pb.MsgExecuteResponse)) {
    throw new Error('Expected argument of type cosmos.accounts.v1.MsgExecuteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_accounts_v1_MsgExecuteResponse(buffer_arg) {
  return cosmos_accounts_v1_tx_pb.MsgExecuteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_accounts_v1_MsgInit(arg) {
  if (!(arg instanceof cosmos_accounts_v1_tx_pb.MsgInit)) {
    throw new Error('Expected argument of type cosmos.accounts.v1.MsgInit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_accounts_v1_MsgInit(buffer_arg) {
  return cosmos_accounts_v1_tx_pb.MsgInit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_accounts_v1_MsgInitResponse(arg) {
  if (!(arg instanceof cosmos_accounts_v1_tx_pb.MsgInitResponse)) {
    throw new Error('Expected argument of type cosmos.accounts.v1.MsgInitResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_accounts_v1_MsgInitResponse(buffer_arg) {
  return cosmos_accounts_v1_tx_pb.MsgInitResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service for the x/accounts module.
var MsgService = exports.MsgService = {
  // Init creates a new account in the chain.
init: {
    path: '/cosmos.accounts.v1.Msg/Init',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_accounts_v1_tx_pb.MsgInit,
    responseType: cosmos_accounts_v1_tx_pb.MsgInitResponse,
    requestSerialize: serialize_cosmos_accounts_v1_MsgInit,
    requestDeserialize: deserialize_cosmos_accounts_v1_MsgInit,
    responseSerialize: serialize_cosmos_accounts_v1_MsgInitResponse,
    responseDeserialize: deserialize_cosmos_accounts_v1_MsgInitResponse,
  },
  // Execute executes a message to the target account.
execute: {
    path: '/cosmos.accounts.v1.Msg/Execute',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_accounts_v1_tx_pb.MsgExecute,
    responseType: cosmos_accounts_v1_tx_pb.MsgExecuteResponse,
    requestSerialize: serialize_cosmos_accounts_v1_MsgExecute,
    requestDeserialize: deserialize_cosmos_accounts_v1_MsgExecute,
    responseSerialize: serialize_cosmos_accounts_v1_MsgExecuteResponse,
    responseDeserialize: deserialize_cosmos_accounts_v1_MsgExecuteResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
