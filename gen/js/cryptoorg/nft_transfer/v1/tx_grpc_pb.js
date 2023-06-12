// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cryptoorg_nft_transfer_v1_tx_pb = require('../../../cryptoorg/nft_transfer/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var ibc_core_client_v1_client_pb = require('../../../ibc/core/client/v1/client_pb.js');

function serialize_chainmain_nft_transfer_v1_MsgTransfer(arg) {
  if (!(arg instanceof cryptoorg_nft_transfer_v1_tx_pb.MsgTransfer)) {
    throw new Error('Expected argument of type chainmain.nft_transfer.v1.MsgTransfer');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_transfer_v1_MsgTransfer(buffer_arg) {
  return cryptoorg_nft_transfer_v1_tx_pb.MsgTransfer.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_transfer_v1_MsgTransferResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_transfer_v1_tx_pb.MsgTransferResponse)) {
    throw new Error('Expected argument of type chainmain.nft_transfer.v1.MsgTransferResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_transfer_v1_MsgTransferResponse(buffer_arg) {
  return cryptoorg_nft_transfer_v1_tx_pb.MsgTransferResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the ibc/nft-transfer Msg service.
var MsgService = exports.MsgService = {
  // Transfer defines a rpc handler method for MsgTransfer.
transfer: {
    path: '/chainmain.nft_transfer.v1.Msg/Transfer',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_transfer_v1_tx_pb.MsgTransfer,
    responseType: cryptoorg_nft_transfer_v1_tx_pb.MsgTransferResponse,
    requestSerialize: serialize_chainmain_nft_transfer_v1_MsgTransfer,
    requestDeserialize: deserialize_chainmain_nft_transfer_v1_MsgTransfer,
    responseSerialize: serialize_chainmain_nft_transfer_v1_MsgTransferResponse,
    responseDeserialize: deserialize_chainmain_nft_transfer_v1_MsgTransferResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
