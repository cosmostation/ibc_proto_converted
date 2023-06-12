// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_oracle_v2alpha2_tx_pb = require('../../../panacea/oracle/v2alpha2/tx_pb.js');
var panacea_oracle_v2alpha2_oracle_pb = require('../../../panacea/oracle/v2alpha2/oracle_pb.js');
var panacea_oracle_v2alpha2_genesis_pb = require('../../../panacea/oracle/v2alpha2/genesis_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_panacea_oracle_v2alpha2_MsgRegisterOracle(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_tx_pb.MsgRegisterOracle)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.MsgRegisterOracle');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_MsgRegisterOracle(buffer_arg) {
  return panacea_oracle_v2alpha2_tx_pb.MsgRegisterOracle.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_MsgRegisterOracleResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_tx_pb.MsgRegisterOracleResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.MsgRegisterOracleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_MsgRegisterOracleResponse(buffer_arg) {
  return panacea_oracle_v2alpha2_tx_pb.MsgRegisterOracleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_MsgUpgradeOracle(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_tx_pb.MsgUpgradeOracle)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.MsgUpgradeOracle');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_MsgUpgradeOracle(buffer_arg) {
  return panacea_oracle_v2alpha2_tx_pb.MsgUpgradeOracle.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_MsgUpgradeOracleResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_tx_pb.MsgUpgradeOracleResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.MsgUpgradeOracleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_MsgUpgradeOracleResponse(buffer_arg) {
  return panacea_oracle_v2alpha2_tx_pb.MsgUpgradeOracleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_MsgVoteOracleRegistration(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_tx_pb.MsgVoteOracleRegistration)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.MsgVoteOracleRegistration');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_MsgVoteOracleRegistration(buffer_arg) {
  return panacea_oracle_v2alpha2_tx_pb.MsgVoteOracleRegistration.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_oracle_v2alpha2_MsgVoteOracleRegistrationResponse(arg) {
  if (!(arg instanceof panacea_oracle_v2alpha2_tx_pb.MsgVoteOracleRegistrationResponse)) {
    throw new Error('Expected argument of type panacea.oracle.v2alpha2.MsgVoteOracleRegistrationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_oracle_v2alpha2_MsgVoteOracleRegistrationResponse(buffer_arg) {
  return panacea_oracle_v2alpha2_tx_pb.MsgVoteOracleRegistrationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // RegisterOracle defines a method for registration of oracle.
registerOracle: {
    path: '/panacea.oracle.v2alpha2.Msg/RegisterOracle',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha2_tx_pb.MsgRegisterOracle,
    responseType: panacea_oracle_v2alpha2_tx_pb.MsgRegisterOracleResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha2_MsgRegisterOracle,
    requestDeserialize: deserialize_panacea_oracle_v2alpha2_MsgRegisterOracle,
    responseSerialize: serialize_panacea_oracle_v2alpha2_MsgRegisterOracleResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha2_MsgRegisterOracleResponse,
  },
  // VoteOracleRegistration  defines a method for voting registration of oracle.
voteOracleRegistration: {
    path: '/panacea.oracle.v2alpha2.Msg/VoteOracleRegistration',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha2_tx_pb.MsgVoteOracleRegistration,
    responseType: panacea_oracle_v2alpha2_tx_pb.MsgVoteOracleRegistrationResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha2_MsgVoteOracleRegistration,
    requestDeserialize: deserialize_panacea_oracle_v2alpha2_MsgVoteOracleRegistration,
    responseSerialize: serialize_panacea_oracle_v2alpha2_MsgVoteOracleRegistrationResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha2_MsgVoteOracleRegistrationResponse,
  },
  // UpgradeOracle defines a method for upgrade of oracle.
upgradeOracle: {
    path: '/panacea.oracle.v2alpha2.Msg/UpgradeOracle',
    requestStream: false,
    responseStream: false,
    requestType: panacea_oracle_v2alpha2_tx_pb.MsgUpgradeOracle,
    responseType: panacea_oracle_v2alpha2_tx_pb.MsgUpgradeOracleResponse,
    requestSerialize: serialize_panacea_oracle_v2alpha2_MsgUpgradeOracle,
    requestDeserialize: deserialize_panacea_oracle_v2alpha2_MsgUpgradeOracle,
    responseSerialize: serialize_panacea_oracle_v2alpha2_MsgUpgradeOracleResponse,
    responseDeserialize: deserialize_panacea_oracle_v2alpha2_MsgUpgradeOracleResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
