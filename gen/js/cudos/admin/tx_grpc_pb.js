// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cudos_admin_tx_pb = require('../../cudos/admin/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../cosmos_proto/cosmos_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_cudosnode_cudosnode_pocbasecosmos_MsgAdminSpendCommunityPool(arg) {
  if (!(arg instanceof cudos_admin_tx_pb.MsgAdminSpendCommunityPool)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.pocbasecosmos.MsgAdminSpendCommunityPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_pocbasecosmos_MsgAdminSpendCommunityPool(buffer_arg) {
  return cudos_admin_tx_pb.MsgAdminSpendCommunityPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_pocbasecosmos_MsgAdminSpendResponse(arg) {
  if (!(arg instanceof cudos_admin_tx_pb.MsgAdminSpendResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.pocbasecosmos.MsgAdminSpendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_pocbasecosmos_MsgAdminSpendResponse(buffer_arg) {
  return cudos_admin_tx_pb.MsgAdminSpendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // this line is used by starport scaffolding # proto/tx/rpc
adminSpendCommunityPool: {
    path: '/cudosnode.cudosnode.pocbasecosmos.Msg/AdminSpendCommunityPool',
    requestStream: false,
    responseStream: false,
    requestType: cudos_admin_tx_pb.MsgAdminSpendCommunityPool,
    responseType: cudos_admin_tx_pb.MsgAdminSpendResponse,
    requestSerialize: serialize_cudosnode_cudosnode_pocbasecosmos_MsgAdminSpendCommunityPool,
    requestDeserialize: deserialize_cudosnode_cudosnode_pocbasecosmos_MsgAdminSpendCommunityPool,
    responseSerialize: serialize_cudosnode_cudosnode_pocbasecosmos_MsgAdminSpendResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_pocbasecosmos_MsgAdminSpendResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
