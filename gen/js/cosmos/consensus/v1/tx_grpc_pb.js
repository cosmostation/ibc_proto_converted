// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Since: cosmos-sdk 0.47
'use strict';
var grpc = require('grpc');
var cosmos_consensus_v1_tx_pb = require('../../../cosmos/consensus/v1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var tendermint_types_params_pb = require('../../../tendermint/types/params_pb.js');

function serialize_cosmos_consensus_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof cosmos_consensus_v1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type cosmos.consensus.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_consensus_v1_MsgUpdateParams(buffer_arg) {
  return cosmos_consensus_v1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_consensus_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof cosmos_consensus_v1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type cosmos.consensus.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_consensus_v1_MsgUpdateParamsResponse(buffer_arg) {
  return cosmos_consensus_v1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the bank Msg service.
var MsgService = exports.MsgService = {
  // UpdateParams defines a governance operation for updating the x/consensus_param module parameters.
// The authority is defined in the keeper.
//
// Since: cosmos-sdk 0.47
updateParams: {
    path: '/cosmos.consensus.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_consensus_v1_tx_pb.MsgUpdateParams,
    responseType: cosmos_consensus_v1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_cosmos_consensus_v1_MsgUpdateParams,
    requestDeserialize: deserialize_cosmos_consensus_v1_MsgUpdateParams,
    responseSerialize: serialize_cosmos_consensus_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_cosmos_consensus_v1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
