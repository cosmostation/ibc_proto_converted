// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var juno_feeshare_v1_tx_pb = require('../../../juno/feeshare/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_juno_feeshare_v1_MsgCancelFeeShare(arg) {
  if (!(arg instanceof juno_feeshare_v1_tx_pb.MsgCancelFeeShare)) {
    throw new Error('Expected argument of type juno.feeshare.v1.MsgCancelFeeShare');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_MsgCancelFeeShare(buffer_arg) {
  return juno_feeshare_v1_tx_pb.MsgCancelFeeShare.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_MsgCancelFeeShareResponse(arg) {
  if (!(arg instanceof juno_feeshare_v1_tx_pb.MsgCancelFeeShareResponse)) {
    throw new Error('Expected argument of type juno.feeshare.v1.MsgCancelFeeShareResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_MsgCancelFeeShareResponse(buffer_arg) {
  return juno_feeshare_v1_tx_pb.MsgCancelFeeShareResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_MsgRegisterFeeShare(arg) {
  if (!(arg instanceof juno_feeshare_v1_tx_pb.MsgRegisterFeeShare)) {
    throw new Error('Expected argument of type juno.feeshare.v1.MsgRegisterFeeShare');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_MsgRegisterFeeShare(buffer_arg) {
  return juno_feeshare_v1_tx_pb.MsgRegisterFeeShare.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_MsgRegisterFeeShareResponse(arg) {
  if (!(arg instanceof juno_feeshare_v1_tx_pb.MsgRegisterFeeShareResponse)) {
    throw new Error('Expected argument of type juno.feeshare.v1.MsgRegisterFeeShareResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_MsgRegisterFeeShareResponse(buffer_arg) {
  return juno_feeshare_v1_tx_pb.MsgRegisterFeeShareResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_MsgUpdateFeeShare(arg) {
  if (!(arg instanceof juno_feeshare_v1_tx_pb.MsgUpdateFeeShare)) {
    throw new Error('Expected argument of type juno.feeshare.v1.MsgUpdateFeeShare');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_MsgUpdateFeeShare(buffer_arg) {
  return juno_feeshare_v1_tx_pb.MsgUpdateFeeShare.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_juno_feeshare_v1_MsgUpdateFeeShareResponse(arg) {
  if (!(arg instanceof juno_feeshare_v1_tx_pb.MsgUpdateFeeShareResponse)) {
    throw new Error('Expected argument of type juno.feeshare.v1.MsgUpdateFeeShareResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_juno_feeshare_v1_MsgUpdateFeeShareResponse(buffer_arg) {
  return juno_feeshare_v1_tx_pb.MsgUpdateFeeShareResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the fees Msg service.
var MsgService = exports.MsgService = {
  // RegisterFeeShare registers a new contract for receiving transaction fees
registerFeeShare: {
    path: '/juno.feeshare.v1.Msg/RegisterFeeShare',
    requestStream: false,
    responseStream: false,
    requestType: juno_feeshare_v1_tx_pb.MsgRegisterFeeShare,
    responseType: juno_feeshare_v1_tx_pb.MsgRegisterFeeShareResponse,
    requestSerialize: serialize_juno_feeshare_v1_MsgRegisterFeeShare,
    requestDeserialize: deserialize_juno_feeshare_v1_MsgRegisterFeeShare,
    responseSerialize: serialize_juno_feeshare_v1_MsgRegisterFeeShareResponse,
    responseDeserialize: deserialize_juno_feeshare_v1_MsgRegisterFeeShareResponse,
  },
  // UpdateFeeShare updates the withdrawer address of a FeeShare
updateFeeShare: {
    path: '/juno.feeshare.v1.Msg/UpdateFeeShare',
    requestStream: false,
    responseStream: false,
    requestType: juno_feeshare_v1_tx_pb.MsgUpdateFeeShare,
    responseType: juno_feeshare_v1_tx_pb.MsgUpdateFeeShareResponse,
    requestSerialize: serialize_juno_feeshare_v1_MsgUpdateFeeShare,
    requestDeserialize: deserialize_juno_feeshare_v1_MsgUpdateFeeShare,
    responseSerialize: serialize_juno_feeshare_v1_MsgUpdateFeeShareResponse,
    responseDeserialize: deserialize_juno_feeshare_v1_MsgUpdateFeeShareResponse,
  },
  // CancelFeeShare cancels a contract's fee registration and further receival
// of transaction fees
cancelFeeShare: {
    path: '/juno.feeshare.v1.Msg/CancelFeeShare',
    requestStream: false,
    responseStream: false,
    requestType: juno_feeshare_v1_tx_pb.MsgCancelFeeShare,
    responseType: juno_feeshare_v1_tx_pb.MsgCancelFeeShareResponse,
    requestSerialize: serialize_juno_feeshare_v1_MsgCancelFeeShare,
    requestDeserialize: deserialize_juno_feeshare_v1_MsgCancelFeeShare,
    responseSerialize: serialize_juno_feeshare_v1_MsgCancelFeeShareResponse,
    responseDeserialize: deserialize_juno_feeshare_v1_MsgCancelFeeShareResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
