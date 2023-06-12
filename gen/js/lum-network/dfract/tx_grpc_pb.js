// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var lum$network_dfract_tx_pb = require('../../lum-network/dfract/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_lum_network_dfract_MsgDeposit(arg) {
  if (!(arg instanceof lum$network_dfract_tx_pb.MsgDeposit)) {
    throw new Error('Expected argument of type lum.network.dfract.MsgDeposit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_dfract_MsgDeposit(buffer_arg) {
  return lum$network_dfract_tx_pb.MsgDeposit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_dfract_MsgDepositResponse(arg) {
  if (!(arg instanceof lum$network_dfract_tx_pb.MsgDepositResponse)) {
    throw new Error('Expected argument of type lum.network.dfract.MsgDepositResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_dfract_MsgDepositResponse(buffer_arg) {
  return lum$network_dfract_tx_pb.MsgDepositResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  deposit: {
    path: '/lum.network.dfract.Msg/Deposit',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_dfract_tx_pb.MsgDeposit,
    responseType: lum$network_dfract_tx_pb.MsgDepositResponse,
    requestSerialize: serialize_lum_network_dfract_MsgDeposit,
    requestDeserialize: deserialize_lum_network_dfract_MsgDeposit,
    responseSerialize: serialize_lum_network_dfract_MsgDepositResponse,
    responseDeserialize: deserialize_lum_network_dfract_MsgDepositResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
