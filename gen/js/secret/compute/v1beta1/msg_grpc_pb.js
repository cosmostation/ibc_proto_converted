// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var secret_compute_v1beta1_msg_pb = require('../../../secret/compute/v1beta1/msg_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_secret_compute_v1beta1_MsgExecuteContract(arg) {
  if (!(arg instanceof secret_compute_v1beta1_msg_pb.MsgExecuteContract)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.MsgExecuteContract');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_MsgExecuteContract(buffer_arg) {
  return secret_compute_v1beta1_msg_pb.MsgExecuteContract.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_MsgExecuteContractResponse(arg) {
  if (!(arg instanceof secret_compute_v1beta1_msg_pb.MsgExecuteContractResponse)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.MsgExecuteContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_MsgExecuteContractResponse(buffer_arg) {
  return secret_compute_v1beta1_msg_pb.MsgExecuteContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_MsgInstantiateContract(arg) {
  if (!(arg instanceof secret_compute_v1beta1_msg_pb.MsgInstantiateContract)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.MsgInstantiateContract');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_MsgInstantiateContract(buffer_arg) {
  return secret_compute_v1beta1_msg_pb.MsgInstantiateContract.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_MsgInstantiateContractResponse(arg) {
  if (!(arg instanceof secret_compute_v1beta1_msg_pb.MsgInstantiateContractResponse)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.MsgInstantiateContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_MsgInstantiateContractResponse(buffer_arg) {
  return secret_compute_v1beta1_msg_pb.MsgInstantiateContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_MsgStoreCode(arg) {
  if (!(arg instanceof secret_compute_v1beta1_msg_pb.MsgStoreCode)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.MsgStoreCode');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_MsgStoreCode(buffer_arg) {
  return secret_compute_v1beta1_msg_pb.MsgStoreCode.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_MsgStoreCodeResponse(arg) {
  if (!(arg instanceof secret_compute_v1beta1_msg_pb.MsgStoreCodeResponse)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.MsgStoreCodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_MsgStoreCodeResponse(buffer_arg) {
  return secret_compute_v1beta1_msg_pb.MsgStoreCodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the wasm Msg service.
var MsgService = exports.MsgService = {
  // StoreCode to submit Wasm code to the system
storeCode: {
    path: '/secret.compute.v1beta1.Msg/StoreCode',
    requestStream: false,
    responseStream: false,
    requestType: secret_compute_v1beta1_msg_pb.MsgStoreCode,
    responseType: secret_compute_v1beta1_msg_pb.MsgStoreCodeResponse,
    requestSerialize: serialize_secret_compute_v1beta1_MsgStoreCode,
    requestDeserialize: deserialize_secret_compute_v1beta1_MsgStoreCode,
    responseSerialize: serialize_secret_compute_v1beta1_MsgStoreCodeResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_MsgStoreCodeResponse,
  },
  //  Instantiate creates a new smart contract instance for the given code id.
instantiateContract: {
    path: '/secret.compute.v1beta1.Msg/InstantiateContract',
    requestStream: false,
    responseStream: false,
    requestType: secret_compute_v1beta1_msg_pb.MsgInstantiateContract,
    responseType: secret_compute_v1beta1_msg_pb.MsgInstantiateContractResponse,
    requestSerialize: serialize_secret_compute_v1beta1_MsgInstantiateContract,
    requestDeserialize: deserialize_secret_compute_v1beta1_MsgInstantiateContract,
    responseSerialize: serialize_secret_compute_v1beta1_MsgInstantiateContractResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_MsgInstantiateContractResponse,
  },
  // Execute submits the given message data to a smart contract
executeContract: {
    path: '/secret.compute.v1beta1.Msg/ExecuteContract',
    requestStream: false,
    responseStream: false,
    requestType: secret_compute_v1beta1_msg_pb.MsgExecuteContract,
    responseType: secret_compute_v1beta1_msg_pb.MsgExecuteContractResponse,
    requestSerialize: serialize_secret_compute_v1beta1_MsgExecuteContract,
    requestDeserialize: deserialize_secret_compute_v1beta1_MsgExecuteContract,
    responseSerialize: serialize_secret_compute_v1beta1_MsgExecuteContractResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_MsgExecuteContractResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
