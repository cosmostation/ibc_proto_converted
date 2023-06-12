// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var canto_fees_v1_tx_pb = require('../../../canto/fees/v1/tx_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_canto_fees_v1_MsgCancelFee(arg) {
  if (!(arg instanceof canto_fees_v1_tx_pb.MsgCancelFee)) {
    throw new Error('Expected argument of type canto.fees.v1.MsgCancelFee');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_MsgCancelFee(buffer_arg) {
  return canto_fees_v1_tx_pb.MsgCancelFee.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_MsgCancelFeeResponse(arg) {
  if (!(arg instanceof canto_fees_v1_tx_pb.MsgCancelFeeResponse)) {
    throw new Error('Expected argument of type canto.fees.v1.MsgCancelFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_MsgCancelFeeResponse(buffer_arg) {
  return canto_fees_v1_tx_pb.MsgCancelFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_MsgRegisterFee(arg) {
  if (!(arg instanceof canto_fees_v1_tx_pb.MsgRegisterFee)) {
    throw new Error('Expected argument of type canto.fees.v1.MsgRegisterFee');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_MsgRegisterFee(buffer_arg) {
  return canto_fees_v1_tx_pb.MsgRegisterFee.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_MsgRegisterFeeResponse(arg) {
  if (!(arg instanceof canto_fees_v1_tx_pb.MsgRegisterFeeResponse)) {
    throw new Error('Expected argument of type canto.fees.v1.MsgRegisterFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_MsgRegisterFeeResponse(buffer_arg) {
  return canto_fees_v1_tx_pb.MsgRegisterFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_MsgUpdateFee(arg) {
  if (!(arg instanceof canto_fees_v1_tx_pb.MsgUpdateFee)) {
    throw new Error('Expected argument of type canto.fees.v1.MsgUpdateFee');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_MsgUpdateFee(buffer_arg) {
  return canto_fees_v1_tx_pb.MsgUpdateFee.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_fees_v1_MsgUpdateFeeResponse(arg) {
  if (!(arg instanceof canto_fees_v1_tx_pb.MsgUpdateFeeResponse)) {
    throw new Error('Expected argument of type canto.fees.v1.MsgUpdateFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_fees_v1_MsgUpdateFeeResponse(buffer_arg) {
  return canto_fees_v1_tx_pb.MsgUpdateFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the fees Msg service.
var MsgService = exports.MsgService = {
  // RegisterFee registers a new contract for receiving transaction fees
registerFee: {
    path: '/canto.fees.v1.Msg/RegisterFee',
    requestStream: false,
    responseStream: false,
    requestType: canto_fees_v1_tx_pb.MsgRegisterFee,
    responseType: canto_fees_v1_tx_pb.MsgRegisterFeeResponse,
    requestSerialize: serialize_canto_fees_v1_MsgRegisterFee,
    requestDeserialize: deserialize_canto_fees_v1_MsgRegisterFee,
    responseSerialize: serialize_canto_fees_v1_MsgRegisterFeeResponse,
    responseDeserialize: deserialize_canto_fees_v1_MsgRegisterFeeResponse,
  },
  // CancelFee cancels a contract's fee registration and further receival of
// transaction fees
cancelFee: {
    path: '/canto.fees.v1.Msg/CancelFee',
    requestStream: false,
    responseStream: false,
    requestType: canto_fees_v1_tx_pb.MsgCancelFee,
    responseType: canto_fees_v1_tx_pb.MsgCancelFeeResponse,
    requestSerialize: serialize_canto_fees_v1_MsgCancelFee,
    requestDeserialize: deserialize_canto_fees_v1_MsgCancelFee,
    responseSerialize: serialize_canto_fees_v1_MsgCancelFeeResponse,
    responseDeserialize: deserialize_canto_fees_v1_MsgCancelFeeResponse,
  },
  // UpdateFee updates the withdraw address
updateFee: {
    path: '/canto.fees.v1.Msg/UpdateFee',
    requestStream: false,
    responseStream: false,
    requestType: canto_fees_v1_tx_pb.MsgUpdateFee,
    responseType: canto_fees_v1_tx_pb.MsgUpdateFeeResponse,
    requestSerialize: serialize_canto_fees_v1_MsgUpdateFee,
    requestDeserialize: deserialize_canto_fees_v1_MsgUpdateFee,
    responseSerialize: serialize_canto_fees_v1_MsgUpdateFeeResponse,
    responseDeserialize: deserialize_canto_fees_v1_MsgUpdateFeeResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
