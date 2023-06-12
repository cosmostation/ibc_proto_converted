// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_global_v1beta1_tx_pb = require('../../../kyve/global/v1beta1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_kyve_global_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof kyve_global_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type kyve.global.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_global_v1beta1_MsgUpdateParams(buffer_arg) {
  return kyve_global_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_global_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof kyve_global_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type kyve.global.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_global_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return kyve_global_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // UpdateParams defines a governance operation for updating the x/global
// module parameters. The authority is hard-coded to the x/gov module
// account.
updateParams: {
    path: '/kyve.global.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: kyve_global_v1beta1_tx_pb.MsgUpdateParams,
    responseType: kyve_global_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_kyve_global_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_kyve_global_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_kyve_global_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_kyve_global_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
