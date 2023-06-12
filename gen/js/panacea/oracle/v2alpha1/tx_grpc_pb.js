// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_oracle_v2alpha1_tx_pb = require('../../../panacea/oracle/v2alpha1/tx_pb.js');
var panacea_oracle_v2alpha1_oracle_pb = require('../../../panacea/oracle/v2alpha1/oracle_pb.js');

function serialize_panacea_oracle_v2alpha1_MsgRegisterOracle(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha1_tx_pb.MsgRegisterOracle)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha1.MsgRegisterOracle');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha1_MsgRegisterOracle(buffer_arg) {
  return panacea_oracle_v2alpha1_tx_pb.MsgRegisterOracle.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha1_MsgRegisterOracleResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha1_tx_pb.MsgRegisterOracleResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha1.MsgRegisterOracleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha1_MsgRegisterOracleResponse(buffer_arg) {
  return panacea_oracle_v2alpha1_tx_pb.MsgRegisterOracleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha1_MsgUpdateOracle(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha1_tx_pb.MsgUpdateOracle)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha1.MsgUpdateOracle');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha1_MsgUpdateOracle(buffer_arg) {
  return panacea_oracle_v2alpha1_tx_pb.MsgUpdateOracle.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha1_MsgUpdateOracleResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha1_tx_pb.MsgUpdateOracleResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha1.MsgUpdateOracleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha1_MsgUpdateOracleResponse(buffer_arg) {
  return panacea_oracle_v2alpha1_tx_pb.MsgUpdateOracleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // RegisterOracle defines a method for registration of oracle.
registerOracle: {
    path: '/panacea.oracle.v2alpha1.Msg/RegisterOracle',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha1_tx_pb.MsgRegisterOracle,
    responseType: panacea_oracle_v2alpha1_tx_pb.MsgRegisterOracleResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha1_MsgRegisterOracle,
    requestDeserialize: deserialize_panacea_oracle_v2alpha1_MsgRegisterOracle,
    responseSerialize: serialize_panacea_oracle_v2alpha1_MsgRegisterOracleResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha1_MsgRegisterOracleResponse,
  },
  // UpdateOracle defines a method for updating of oracle.
updateOracle: {
    path: '/panacea.oracle.v2alpha1.Msg/UpdateOracle',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha1_tx_pb.MsgUpdateOracle,
    responseType: panacea_oracle_v2alpha1_tx_pb.MsgUpdateOracleResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha1_MsgUpdateOracle,
    requestDeserialize: deserialize_panacea_oracle_v2alpha1_MsgUpdateOracle,
    responseSerialize: serialize_panacea_oracle_v2alpha1_MsgUpdateOracleResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha1_MsgUpdateOracleResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
