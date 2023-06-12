// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var iov_escrow_v1beta1_tx_pb = require('../../../iov/escrow/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_starnamed_x_escrow_v1beta1_MsgCreateEscrow(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_tx_pb.MsgCreateEscrow)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.MsgCreateEscrow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_MsgCreateEscrow(buffer_arg) {
  return iov_escrow_v1beta1_tx_pb.MsgCreateEscrow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_escrow_v1beta1_MsgCreateEscrowResponse(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_tx_pb.MsgCreateEscrowResponse)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.MsgCreateEscrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_MsgCreateEscrowResponse(buffer_arg) {
  return iov_escrow_v1beta1_tx_pb.MsgCreateEscrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_escrow_v1beta1_MsgRefundEscrow(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_tx_pb.MsgRefundEscrow)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.MsgRefundEscrow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_MsgRefundEscrow(buffer_arg) {
  return iov_escrow_v1beta1_tx_pb.MsgRefundEscrow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_escrow_v1beta1_MsgRefundEscrowResponse(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_tx_pb.MsgRefundEscrowResponse)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.MsgRefundEscrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_MsgRefundEscrowResponse(buffer_arg) {
  return iov_escrow_v1beta1_tx_pb.MsgRefundEscrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_escrow_v1beta1_MsgTransferToEscrow(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_tx_pb.MsgTransferToEscrow)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.MsgTransferToEscrow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_MsgTransferToEscrow(buffer_arg) {
  return iov_escrow_v1beta1_tx_pb.MsgTransferToEscrow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_escrow_v1beta1_MsgTransferToEscrowResponse(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_tx_pb.MsgTransferToEscrowResponse)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.MsgTransferToEscrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_MsgTransferToEscrowResponse(buffer_arg) {
  return iov_escrow_v1beta1_tx_pb.MsgTransferToEscrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_escrow_v1beta1_MsgUpdateEscrow(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_tx_pb.MsgUpdateEscrow)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.MsgUpdateEscrow');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_MsgUpdateEscrow(buffer_arg) {
  return iov_escrow_v1beta1_tx_pb.MsgUpdateEscrow.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_starnamed_x_escrow_v1beta1_MsgUpdateEscrowResponse(arg) {
  if (!(arg instanceof iov_escrow_v1beta1_tx_pb.MsgUpdateEscrowResponse)) {
    throw new Error('Expected argument of type starnamed.x.escrow.v1beta1.MsgUpdateEscrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_starnamed_x_escrow_v1beta1_MsgUpdateEscrowResponse(buffer_arg) {
  return iov_escrow_v1beta1_tx_pb.MsgUpdateEscrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the escrow Msg service
var MsgService = exports.MsgService = {
  // CreateEscrow defines a method for creating an escrow
createEscrow: {
    path: '/starnamed.x.escrow.v1beta1.Msg/CreateEscrow',
    requestStream: false,
    responseStream: false,
    requestType: iov_escrow_v1beta1_tx_pb.MsgCreateEscrow,
    responseType: iov_escrow_v1beta1_tx_pb.MsgCreateEscrowResponse,
    requestSerialize: serialize_starnamed_x_escrow_v1beta1_MsgCreateEscrow,
    requestDeserialize: deserialize_starnamed_x_escrow_v1beta1_MsgCreateEscrow,
    responseSerialize: serialize_starnamed_x_escrow_v1beta1_MsgCreateEscrowResponse,
    responseDeserialize: deserialize_starnamed_x_escrow_v1beta1_MsgCreateEscrowResponse,
  },
  // UpdateEscrow defines a method for updating an escrow
updateEscrow: {
    path: '/starnamed.x.escrow.v1beta1.Msg/UpdateEscrow',
    requestStream: false,
    responseStream: false,
    requestType: iov_escrow_v1beta1_tx_pb.MsgUpdateEscrow,
    responseType: iov_escrow_v1beta1_tx_pb.MsgUpdateEscrowResponse,
    requestSerialize: serialize_starnamed_x_escrow_v1beta1_MsgUpdateEscrow,
    requestDeserialize: deserialize_starnamed_x_escrow_v1beta1_MsgUpdateEscrow,
    responseSerialize: serialize_starnamed_x_escrow_v1beta1_MsgUpdateEscrowResponse,
    responseDeserialize: deserialize_starnamed_x_escrow_v1beta1_MsgUpdateEscrowResponse,
  },
  // TransferToEscrow defines a method for a buyer to transfer funds to the
// escrow
transferToEscrow: {
    path: '/starnamed.x.escrow.v1beta1.Msg/TransferToEscrow',
    requestStream: false,
    responseStream: false,
    requestType: iov_escrow_v1beta1_tx_pb.MsgTransferToEscrow,
    responseType: iov_escrow_v1beta1_tx_pb.MsgTransferToEscrowResponse,
    requestSerialize: serialize_starnamed_x_escrow_v1beta1_MsgTransferToEscrow,
    requestDeserialize: deserialize_starnamed_x_escrow_v1beta1_MsgTransferToEscrow,
    responseSerialize: serialize_starnamed_x_escrow_v1beta1_MsgTransferToEscrowResponse,
    responseDeserialize: deserialize_starnamed_x_escrow_v1beta1_MsgTransferToEscrowResponse,
  },
  // RefundEscrow defines a method for the seller to return the assets locked in
// the escrow
refundEscrow: {
    path: '/starnamed.x.escrow.v1beta1.Msg/RefundEscrow',
    requestStream: false,
    responseStream: false,
    requestType: iov_escrow_v1beta1_tx_pb.MsgRefundEscrow,
    responseType: iov_escrow_v1beta1_tx_pb.MsgRefundEscrowResponse,
    requestSerialize: serialize_starnamed_x_escrow_v1beta1_MsgRefundEscrow,
    requestDeserialize: deserialize_starnamed_x_escrow_v1beta1_MsgRefundEscrow,
    responseSerialize: serialize_starnamed_x_escrow_v1beta1_MsgRefundEscrowResponse,
    responseDeserialize: deserialize_starnamed_x_escrow_v1beta1_MsgRefundEscrowResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
