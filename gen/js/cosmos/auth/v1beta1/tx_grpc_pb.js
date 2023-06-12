// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_auth_v1beta1_tx_pb = require('../../../cosmos/auth/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var amino_amino_pb = require('../../../amino/amino_pb.js');
var cosmos_auth_v1beta1_auth_pb = require('../../../cosmos/auth/v1beta1/auth_pb.js');

function serialize_cosmos_auth_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_MsgUpdateParams(buffer_arg) {
  return cosmos_auth_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return cosmos_auth_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the x/auth Msg service.
var MsgService = exports.MsgService = {
  // UpdateParams defines a (governance) operation for updating the x/auth module
// parameters. The authority defaults to the x/gov module account.
//
// Since: cosmos-sdk 0.47
updateParams: {
    path: '/cosmos.auth.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_auth_v1beta1_tx_pb.MsgUpdateParams,
    responseType: cosmos_auth_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_cosmos_auth_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_cosmos_auth_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_cosmos_auth_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_cosmos_auth_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
