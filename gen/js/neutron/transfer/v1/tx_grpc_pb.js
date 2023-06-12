// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var neutron_transfer_v1_tx_pb = require('../../../neutron/transfer/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var ibc_core_client_v1_client_pb = require('../../../ibc/core/client/v1/client_pb.js');
var neutron_feerefunder_fee_pb = require('../../../neutron/feerefunder/fee_pb.js');

function serialize_neutron_transfer_MsgTransfer(arg) {
  if (!(arg instanceof neutron_transfer_v1_tx_pb.MsgTransfer)) {
    throw new Error('Expected argument of type neutron.transfer.MsgTransfer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_transfer_MsgTransfer(buffer_arg) {
  return neutron_transfer_v1_tx_pb.MsgTransfer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_transfer_MsgTransferResponse(arg) {
  if (!(arg instanceof neutron_transfer_v1_tx_pb.MsgTransferResponse)) {
    throw new Error('Expected argument of type neutron.transfer.MsgTransferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_transfer_MsgTransferResponse(buffer_arg) {
  return neutron_transfer_v1_tx_pb.MsgTransferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the ibc/transfer Msg service.
var MsgService = exports.MsgService = {
  // Transfer defines a rpc handler method for MsgTransfer.
transfer: {
    path: '/neutron.transfer.Msg/Transfer',
    requestStream: false,
    responseStream: false,
    requestType: neutron_transfer_v1_tx_pb.MsgTransfer,
    responseType: neutron_transfer_v1_tx_pb.MsgTransferResponse,
    requestSerialize: serialize_neutron_transfer_MsgTransfer,
    requestDeserialize: deserialize_neutron_transfer_MsgTransfer,
    responseSerialize: serialize_neutron_transfer_MsgTransferResponse,
    responseDeserialize: deserialize_neutron_transfer_MsgTransferResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
