// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var shentu_cvm_v1alpha1_tx_pb = require('../../../shentu/cvm/v1alpha1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var shentu_cvm_v1alpha1_cvm_pb = require('../../../shentu/cvm/v1alpha1/cvm_pb.js');
var shentu_burrow_payload_pb = require('../../../shentu/burrow/payload_pb.js');

function serialize_shentu_cvm_v1alpha1_MsgCall(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_tx_pb.MsgCall)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.MsgCall');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_MsgCall(buffer_arg) {
  return shentu_cvm_v1alpha1_tx_pb.MsgCall.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_MsgCallResponse(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_tx_pb.MsgCallResponse)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.MsgCallResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_MsgCallResponse(buffer_arg) {
  return shentu_cvm_v1alpha1_tx_pb.MsgCallResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_MsgDeploy(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_tx_pb.MsgDeploy)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.MsgDeploy');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_MsgDeploy(buffer_arg) {
  return shentu_cvm_v1alpha1_tx_pb.MsgDeploy.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_MsgDeployResponse(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_tx_pb.MsgDeployResponse)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.MsgDeployResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_MsgDeployResponse(buffer_arg) {
  return shentu_cvm_v1alpha1_tx_pb.MsgDeployResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  call: {
    path: '/shentu.cvm.v1alpha1.Msg/Call',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cvm_v1alpha1_tx_pb.MsgCall,
    responseType: shentu_cvm_v1alpha1_tx_pb.MsgCallResponse,
    requestSerialize: serialize_shentu_cvm_v1alpha1_MsgCall,
    requestDeserialize: deserialize_shentu_cvm_v1alpha1_MsgCall,
    responseSerialize: serialize_shentu_cvm_v1alpha1_MsgCallResponse,
    responseDeserialize: deserialize_shentu_cvm_v1alpha1_MsgCallResponse,
  },
  deploy: {
    path: '/shentu.cvm.v1alpha1.Msg/Deploy',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cvm_v1alpha1_tx_pb.MsgDeploy,
    responseType: shentu_cvm_v1alpha1_tx_pb.MsgDeployResponse,
    requestSerialize: serialize_shentu_cvm_v1alpha1_MsgDeploy,
    requestDeserialize: deserialize_shentu_cvm_v1alpha1_MsgDeploy,
    responseSerialize: serialize_shentu_cvm_v1alpha1_MsgDeployResponse,
    responseDeserialize: deserialize_shentu_cvm_v1alpha1_MsgDeployResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
