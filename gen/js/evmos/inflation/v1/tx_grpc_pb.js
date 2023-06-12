// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var evmos_inflation_v1_tx_pb = require('../../../evmos/inflation/v1/tx_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var evmos_inflation_v1_genesis_pb = require('../../../evmos/inflation/v1/genesis_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_evmos_inflation_v1_MsgUpdateParams(arg) {
  if (!(arg instanceof evmos_inflation_v1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type evmos.inflation.v1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_MsgUpdateParams(buffer_arg) {
  return evmos_inflation_v1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_inflation_v1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof evmos_inflation_v1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type evmos.inflation.v1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_inflation_v1_MsgUpdateParamsResponse(buffer_arg) {
  return evmos_inflation_v1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the evm Msg service.
var MsgService = exports.MsgService = {
  // UpdateParams defined a governance operation for updating the x/inflation module parameters.
// The authority is hard-coded to the Cosmos SDK x/gov module account
updateParams: {
    path: '/evmos.inflation.v1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: evmos_inflation_v1_tx_pb.MsgUpdateParams,
    responseType: evmos_inflation_v1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_evmos_inflation_v1_MsgUpdateParams,
    requestDeserialize: deserialize_evmos_inflation_v1_MsgUpdateParams,
    responseSerialize: serialize_evmos_inflation_v1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_evmos_inflation_v1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
