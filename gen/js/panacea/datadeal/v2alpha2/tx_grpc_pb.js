// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_datadeal_v2alpha2_tx_pb = require('../../../panacea/datadeal/v2alpha2/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var panacea_oracle_v2alpha2_oracle_pb = require('../../../panacea/oracle/v2alpha2/oracle_pb.js');

function serialize_panacea_datadeal_v2alpha2_MsgCreateDeal(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgCreateDeal)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgCreateDeal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgCreateDeal(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgCreateDeal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_MsgCreateDealResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgCreateDealResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgCreateDealResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgCreateDealResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgCreateDealResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_MsgDeactivateDeal(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgDeactivateDeal)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgDeactivateDeal');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgDeactivateDeal(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgDeactivateDeal.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_MsgDeactivateDealResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgDeactivateDealResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgDeactivateDealResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgDeactivateDealResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgDeactivateDealResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_MsgReRequestDataDeliveryVote(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgReRequestDataDeliveryVote)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgReRequestDataDeliveryVote');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgReRequestDataDeliveryVote(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgReRequestDataDeliveryVote.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_MsgReRequestDataDeliveryVoteResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgReRequestDataDeliveryVoteResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgReRequestDataDeliveryVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgReRequestDataDeliveryVoteResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgReRequestDataDeliveryVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_MsgSellData(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgSellData)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgSellData');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgSellData(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgSellData.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_MsgSellDataResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgSellDataResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgSellDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgSellDataResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgSellDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_MsgVoteDataDelivery(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataDelivery)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgVoteDataDelivery');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgVoteDataDelivery(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataDelivery.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_MsgVoteDataDeliveryResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataDeliveryResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgVoteDataDeliveryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgVoteDataDeliveryResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataDeliveryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_MsgVoteDataVerification(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataVerification)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgVoteDataVerification');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgVoteDataVerification(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataVerification.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_datadeal_v2alpha2_MsgVoteDataVerificationResponse(arg) {
  if (!(arg instanceof panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataVerificationResponse)) {
    throw new Error('Expected argument of type panacea.datadeal.v2alpha2.MsgVoteDataVerificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_datadeal_v2alpha2_MsgVoteDataVerificationResponse(buffer_arg) {
  return panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataVerificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // CreateDeal defines a method for creating a deal.
createDeal: {
    path: '/panacea.datadeal.v2alpha2.Msg/CreateDeal',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_tx_pb.MsgCreateDeal,
    responseType: panacea_datadeal_v2alpha2_tx_pb.MsgCreateDealResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_MsgCreateDeal,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgCreateDeal,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_MsgCreateDealResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgCreateDealResponse,
  },
  // SellData defines a method for selling a data.
sellData: {
    path: '/panacea.datadeal.v2alpha2.Msg/SellData',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_tx_pb.MsgSellData,
    responseType: panacea_datadeal_v2alpha2_tx_pb.MsgSellDataResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_MsgSellData,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgSellData,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_MsgSellDataResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgSellDataResponse,
  },
  // VoteDataVerification defines a method for voting data verification.
voteDataVerification: {
    path: '/panacea.datadeal.v2alpha2.Msg/VoteDataVerification',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataVerification,
    responseType: panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataVerificationResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_MsgVoteDataVerification,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgVoteDataVerification,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_MsgVoteDataVerificationResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgVoteDataVerificationResponse,
  },
  // VoteDataDelivery defines a method for voting data delivery.
voteDataDelivery: {
    path: '/panacea.datadeal.v2alpha2.Msg/VoteDataDelivery',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataDelivery,
    responseType: panacea_datadeal_v2alpha2_tx_pb.MsgVoteDataDeliveryResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_MsgVoteDataDelivery,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgVoteDataDelivery,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_MsgVoteDataDeliveryResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgVoteDataDeliveryResponse,
  },
  // DeactivateDeal defines a method for deactivating the deal.
deactivateDeal: {
    path: '/panacea.datadeal.v2alpha2.Msg/DeactivateDeal',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_tx_pb.MsgDeactivateDeal,
    responseType: panacea_datadeal_v2alpha2_tx_pb.MsgDeactivateDealResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_MsgDeactivateDeal,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgDeactivateDeal,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_MsgDeactivateDealResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgDeactivateDealResponse,
  },
  // ReRequestDataDeliveryVote defines a method for requesting DataDeliveryVote.
reRequestDataDeliveryVote: {
    path: '/panacea.datadeal.v2alpha2.Msg/ReRequestDataDeliveryVote',
    requestStream: false,
    responseStream: false,
    requestType: panacea_datadeal_v2alpha2_tx_pb.MsgReRequestDataDeliveryVote,
    responseType: panacea_datadeal_v2alpha2_tx_pb.MsgReRequestDataDeliveryVoteResponse,
    requestSerialize: serialize_panacea_datadeal_v2alpha2_MsgReRequestDataDeliveryVote,
    requestDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgReRequestDataDeliveryVote,
    responseSerialize: serialize_panacea_datadeal_v2alpha2_MsgReRequestDataDeliveryVoteResponse,
    responseDeserialize: deserialize_panacea_datadeal_v2alpha2_MsgReRequestDataDeliveryVoteResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
