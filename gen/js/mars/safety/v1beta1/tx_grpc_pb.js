// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var mars_safety_v1beta1_tx_pb = require('../../../mars/safety/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_mars_safety_v1beta1_MsgSafetyFundSpend(arg) {
  if (!(arg instanceof mars_safety_v1beta1_tx_pb.MsgSafetyFundSpend)) {
    throw new Error('Expected argument of type mars.safety.v1beta1.MsgSafetyFundSpend');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_safety_v1beta1_MsgSafetyFundSpend(buffer_arg) {
  return mars_safety_v1beta1_tx_pb.MsgSafetyFundSpend.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_safety_v1beta1_MsgSafetyFundSpendResponse(arg) {
  if (!(arg instanceof mars_safety_v1beta1_tx_pb.MsgSafetyFundSpendResponse)) {
    throw new Error('Expected argument of type mars.safety.v1beta1.MsgSafetyFundSpendResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_safety_v1beta1_MsgSafetyFundSpendResponse(buffer_arg) {
  return mars_safety_v1beta1_tx_pb.MsgSafetyFundSpendResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the safety module's Msg service
var MsgService = exports.MsgService = {
  // SafetyFundSpend is a governance operation for sending tokens from the
// safety fund module account to the designated recipient.
//
// NOTE: For now, this is just a copy of the distribution module's
// `CommunityFundSpend` method. The recipient is expected to be a multisig
// consisting of trusted community members who are respondible for using the
// funds appropriately to cover any bad debt.
//
// In the long term, the goal is that the module
// is able to detect bad debts incurred in the outposts via interchain query,
// and automatically dispense the appropriate amount of funds, without having
// to go through the governance process.
safetyFundSpend: {
    path: '/mars.safety.v1beta1.Msg/SafetyFundSpend',
    requestStream: false,
    responseStream: false,
    requestType: mars_safety_v1beta1_tx_pb.MsgSafetyFundSpend,
    responseType: mars_safety_v1beta1_tx_pb.MsgSafetyFundSpendResponse,
    requestSerialize: serialize_mars_safety_v1beta1_MsgSafetyFundSpend,
    requestDeserialize: deserialize_mars_safety_v1beta1_MsgSafetyFundSpend,
    responseSerialize: serialize_mars_safety_v1beta1_MsgSafetyFundSpendResponse,
    responseDeserialize: deserialize_mars_safety_v1beta1_MsgSafetyFundSpendResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
