// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Since: cosmos-sdk 0.50
'use strict';
var grpc = require('grpc');
var cosmos_protocolpool_v1_tx_pb = require('../../../cosmos/protocolpool/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');

function serialize_cosmos_protocolpool_v1_MsgCommunityPoolSpend(arg) {
  if (!(arg instanceof cosmos_protocolpool_v1_tx_pb.MsgCommunityPoolSpend)) {
    throw new Error('Expected argument of type cosmos.protocolpool.v1.MsgCommunityPoolSpend');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_protocolpool_v1_MsgCommunityPoolSpend(buffer_arg) {
  return cosmos_protocolpool_v1_tx_pb.MsgCommunityPoolSpend.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_protocolpool_v1_MsgCommunityPoolSpendResponse(arg) {
  if (!(arg instanceof cosmos_protocolpool_v1_tx_pb.MsgCommunityPoolSpendResponse)) {
    throw new Error('Expected argument of type cosmos.protocolpool.v1.MsgCommunityPoolSpendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_protocolpool_v1_MsgCommunityPoolSpendResponse(buffer_arg) {
  return cosmos_protocolpool_v1_tx_pb.MsgCommunityPoolSpendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_protocolpool_v1_MsgFundCommunityPool(arg) {
  if (!(arg instanceof cosmos_protocolpool_v1_tx_pb.MsgFundCommunityPool)) {
    throw new Error('Expected argument of type cosmos.protocolpool.v1.MsgFundCommunityPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_protocolpool_v1_MsgFundCommunityPool(buffer_arg) {
  return cosmos_protocolpool_v1_tx_pb.MsgFundCommunityPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_protocolpool_v1_MsgFundCommunityPoolResponse(arg) {
  if (!(arg instanceof cosmos_protocolpool_v1_tx_pb.MsgFundCommunityPoolResponse)) {
    throw new Error('Expected argument of type cosmos.protocolpool.v1.MsgFundCommunityPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_protocolpool_v1_MsgFundCommunityPoolResponse(buffer_arg) {
  return cosmos_protocolpool_v1_tx_pb.MsgFundCommunityPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the pool Msg service.
var MsgService = exports.MsgService = {
  // FundCommunityPool defines a method to allow an account to directly
// fund the community pool.
//
// Since: cosmos-sdk 0.50
fundCommunityPool: {
    path: '/cosmos.protocolpool.v1.Msg/FundCommunityPool',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_protocolpool_v1_tx_pb.MsgFundCommunityPool,
    responseType: cosmos_protocolpool_v1_tx_pb.MsgFundCommunityPoolResponse,
    requestSerialize: serialize_cosmos_protocolpool_v1_MsgFundCommunityPool,
    requestDeserialize: deserialize_cosmos_protocolpool_v1_MsgFundCommunityPool,
    responseSerialize: serialize_cosmos_protocolpool_v1_MsgFundCommunityPoolResponse,
    responseDeserialize: deserialize_cosmos_protocolpool_v1_MsgFundCommunityPoolResponse,
  },
  // CommunityPoolSpend defines a governance operation for sending tokens from
// the community pool in the x/protocolpool module to another account, which
// could be the governance module itself. The authority is defined in the
// keeper.
//
// Since: cosmos-sdk 0.50
communityPoolSpend: {
    path: '/cosmos.protocolpool.v1.Msg/CommunityPoolSpend',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_protocolpool_v1_tx_pb.MsgCommunityPoolSpend,
    responseType: cosmos_protocolpool_v1_tx_pb.MsgCommunityPoolSpendResponse,
    requestSerialize: serialize_cosmos_protocolpool_v1_MsgCommunityPoolSpend,
    requestDeserialize: deserialize_cosmos_protocolpool_v1_MsgCommunityPoolSpend,
    responseSerialize: serialize_cosmos_protocolpool_v1_MsgCommunityPoolSpendResponse,
    responseDeserialize: deserialize_cosmos_protocolpool_v1_MsgCommunityPoolSpendResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
