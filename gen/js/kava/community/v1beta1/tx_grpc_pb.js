// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_community_v1beta1_tx_pb = require('../../../kava/community/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_kava_community_v1beta1_MsgFundCommunityPool(arg) {
  if (!(arg instanceof kava_community_v1beta1_tx_pb.MsgFundCommunityPool)) {
    throw new Error('Expected argument of type kava.community.v1beta1.MsgFundCommunityPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_community_v1beta1_MsgFundCommunityPool(buffer_arg) {
  return kava_community_v1beta1_tx_pb.MsgFundCommunityPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_community_v1beta1_MsgFundCommunityPoolResponse(arg) {
  if (!(arg instanceof kava_community_v1beta1_tx_pb.MsgFundCommunityPoolResponse)) {
    throw new Error('Expected argument of type kava.community.v1beta1.MsgFundCommunityPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_community_v1beta1_MsgFundCommunityPoolResponse(buffer_arg) {
  return kava_community_v1beta1_tx_pb.MsgFundCommunityPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the community Msg service.
var MsgService = exports.MsgService = {
  // FundCommunityPool defines a method to allow an account to directly fund the community module account.
fundCommunityPool: {
    path: '/kava.community.v1beta1.Msg/FundCommunityPool',
    requestStream: false,
    responseStream: false,
    requestType: kava_community_v1beta1_tx_pb.MsgFundCommunityPool,
    responseType: kava_community_v1beta1_tx_pb.MsgFundCommunityPoolResponse,
    requestSerialize: serialize_kava_community_v1beta1_MsgFundCommunityPool,
    requestDeserialize: deserialize_kava_community_v1beta1_MsgFundCommunityPool,
    responseSerialize: serialize_kava_community_v1beta1_MsgFundCommunityPoolResponse,
    responseDeserialize: deserialize_kava_community_v1beta1_MsgFundCommunityPoolResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
