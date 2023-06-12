// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ethermint_evm_v1_tx_pb = require('../../../ethermint/evm/v1/tx_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var ethermint_evm_v1_evm_pb = require('../../../ethermint/evm/v1/evm_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');

function serialize_ethermint_evm_v1_MsgEthereumTx(arg) {
  if (!(arg instanceof ethermint_evm_v1_tx_pb.MsgEthereumTx)) {
    throw new Error('Expected argument of type ethermint.evm.v1.MsgEthereumTx');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_MsgEthereumTx(buffer_arg) {
  return ethermint_evm_v1_tx_pb.MsgEthereumTx.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_MsgEthereumTxResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_tx_pb.MsgEthereumTxResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.MsgEthereumTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_MsgEthereumTxResponse(buffer_arg) {
  return ethermint_evm_v1_tx_pb.MsgEthereumTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof ethermint_evm_v1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type ethermint.evm.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_MsgUpdateParams(buffer_arg) {
  return ethermint_evm_v1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_evm_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof ethermint_evm_v1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type ethermint.evm.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_evm_v1_MsgUpdateParamsResponse(buffer_arg) {
  return ethermint_evm_v1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the evm Msg service.
var MsgService = exports.MsgService = {
  // EthereumTx defines a method submitting Ethereum transactions.
ethereumTx: {
    path: '/ethermint.evm.v1.Msg/EthereumTx',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_tx_pb.MsgEthereumTx,
    responseType: ethermint_evm_v1_tx_pb.MsgEthereumTxResponse,
    requestSerialize: serialize_ethermint_evm_v1_MsgEthereumTx,
    requestDeserialize: deserialize_ethermint_evm_v1_MsgEthereumTx,
    responseSerialize: serialize_ethermint_evm_v1_MsgEthereumTxResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_MsgEthereumTxResponse,
  },
  // UpdateParams defined a governance operation for updating the x/evm module parameters.
// The authority is hard-coded to the Cosmos SDK x/gov module account
updateParams: {
    path: '/ethermint.evm.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_evm_v1_tx_pb.MsgUpdateParams,
    responseType: ethermint_evm_v1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_ethermint_evm_v1_MsgUpdateParams,
    requestDeserialize: deserialize_ethermint_evm_v1_MsgUpdateParams,
    responseSerialize: serialize_ethermint_evm_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_ethermint_evm_v1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
