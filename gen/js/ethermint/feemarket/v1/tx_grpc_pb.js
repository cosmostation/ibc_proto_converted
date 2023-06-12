// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ethermint_feemarket_v1_tx_pb = require('../../../ethermint/feemarket/v1/tx_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var ethermint_feemarket_v1_feemarket_pb = require('../../../ethermint/feemarket/v1/feemarket_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_ethermint_feemarket_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof ethermint_feemarket_v1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type ethermint.feemarket.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_feemarket_v1_MsgUpdateParams(buffer_arg) {
  return ethermint_feemarket_v1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ethermint_feemarket_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof ethermint_feemarket_v1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type ethermint.feemarket.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ethermint_feemarket_v1_MsgUpdateParamsResponse(buffer_arg) {
  return ethermint_feemarket_v1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the erc20 Msg service.
var MsgService = exports.MsgService = {
  // UpdateParams defined a governance operation for updating the x/feemarket module parameters.
// The authority is hard-coded to the Cosmos SDK x/gov module account
updateParams: {
    path: '/ethermint.feemarket.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: ethermint_feemarket_v1_tx_pb.MsgUpdateParams,
    responseType: ethermint_feemarket_v1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_ethermint_feemarket_v1_MsgUpdateParams,
    requestDeserialize: deserialize_ethermint_feemarket_v1_MsgUpdateParams,
    responseSerialize: serialize_ethermint_feemarket_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_ethermint_feemarket_v1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
