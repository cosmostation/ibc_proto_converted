// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var crescent_marketmaker_v1beta1_tx_pb = require('../../../crescent/marketmaker/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_crescent_marketmaker_v1beta1_MsgApplyMarketMaker(arg) {
  if (!(arg instanceof crescent_marketmaker_v1beta1_tx_pb.MsgApplyMarketMaker)) {
    throw new Error('Expected argument of type crescent.marketmaker.v1beta1.MsgApplyMarketMaker');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marketmaker_v1beta1_MsgApplyMarketMaker(buffer_arg) {
  return crescent_marketmaker_v1beta1_tx_pb.MsgApplyMarketMaker.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_marketmaker_v1beta1_MsgApplyMarketMakerResponse(arg) {
  if (!(arg instanceof crescent_marketmaker_v1beta1_tx_pb.MsgApplyMarketMakerResponse)) {
    throw new Error('Expected argument of type crescent.marketmaker.v1beta1.MsgApplyMarketMakerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marketmaker_v1beta1_MsgApplyMarketMakerResponse(buffer_arg) {
  return crescent_marketmaker_v1beta1_tx_pb.MsgApplyMarketMakerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_marketmaker_v1beta1_MsgClaimIncentives(arg) {
  if (!(arg instanceof crescent_marketmaker_v1beta1_tx_pb.MsgClaimIncentives)) {
    throw new Error('Expected argument of type crescent.marketmaker.v1beta1.MsgClaimIncentives');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marketmaker_v1beta1_MsgClaimIncentives(buffer_arg) {
  return crescent_marketmaker_v1beta1_tx_pb.MsgClaimIncentives.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_crescent_marketmaker_v1beta1_MsgClaimIncentivesResponse(arg) {
  if (!(arg instanceof crescent_marketmaker_v1beta1_tx_pb.MsgClaimIncentivesResponse)) {
    throw new Error('Expected argument of type crescent.marketmaker.v1beta1.MsgClaimIncentivesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_crescent_marketmaker_v1beta1_MsgClaimIncentivesResponse(buffer_arg) {
  return crescent_marketmaker_v1beta1_tx_pb.MsgClaimIncentivesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the marketmaker Msg service.
var MsgService = exports.MsgService = {
  applyMarketMaker: {
    path: '/crescent.marketmaker.v1beta1.Msg/ApplyMarketMaker',
    requestStream: false,
    responseStream: false,
    requestType: crescent_marketmaker_v1beta1_tx_pb.MsgApplyMarketMaker,
    responseType: crescent_marketmaker_v1beta1_tx_pb.MsgApplyMarketMakerResponse,
    requestSerialize: serialize_crescent_marketmaker_v1beta1_MsgApplyMarketMaker,
    requestDeserialize: deserialize_crescent_marketmaker_v1beta1_MsgApplyMarketMaker,
    responseSerialize: serialize_crescent_marketmaker_v1beta1_MsgApplyMarketMakerResponse,
    responseDeserialize: deserialize_crescent_marketmaker_v1beta1_MsgApplyMarketMakerResponse,
  },
  claimIncentives: {
    path: '/crescent.marketmaker.v1beta1.Msg/ClaimIncentives',
    requestStream: false,
    responseStream: false,
    requestType: crescent_marketmaker_v1beta1_tx_pb.MsgClaimIncentives,
    responseType: crescent_marketmaker_v1beta1_tx_pb.MsgClaimIncentivesResponse,
    requestSerialize: serialize_crescent_marketmaker_v1beta1_MsgClaimIncentives,
    requestDeserialize: deserialize_crescent_marketmaker_v1beta1_MsgClaimIncentives,
    responseSerialize: serialize_crescent_marketmaker_v1beta1_MsgClaimIncentivesResponse,
    responseDeserialize: deserialize_crescent_marketmaker_v1beta1_MsgClaimIncentivesResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
