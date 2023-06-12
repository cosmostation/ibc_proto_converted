// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var neutron_interchaintxs_v1_tx_pb = require('../../../neutron/interchaintxs/v1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_http_pb = require('../../../google/api/http_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var neutron_feerefunder_fee_pb = require('../../../neutron/feerefunder/fee_pb.js');

function serialize_neutron_interchaintxs_v1_MsgRegisterInterchainAccount(arg) {
  if (!(arg instanceof neutron_interchaintxs_v1_tx_pb.MsgRegisterInterchainAccount)) {
    throw new Error('Expected argument of type neutron.interchaintxs.v1.MsgRegisterInterchainAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchaintxs_v1_MsgRegisterInterchainAccount(buffer_arg) {
  return neutron_interchaintxs_v1_tx_pb.MsgRegisterInterchainAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchaintxs_v1_MsgRegisterInterchainAccountResponse(arg) {
  if (!(arg instanceof neutron_interchaintxs_v1_tx_pb.MsgRegisterInterchainAccountResponse)) {
    throw new Error('Expected argument of type neutron.interchaintxs.v1.MsgRegisterInterchainAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchaintxs_v1_MsgRegisterInterchainAccountResponse(buffer_arg) {
  return neutron_interchaintxs_v1_tx_pb.MsgRegisterInterchainAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchaintxs_v1_MsgSubmitTx(arg) {
  if (!(arg instanceof neutron_interchaintxs_v1_tx_pb.MsgSubmitTx)) {
    throw new Error('Expected argument of type neutron.interchaintxs.v1.MsgSubmitTx');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchaintxs_v1_MsgSubmitTx(buffer_arg) {
  return neutron_interchaintxs_v1_tx_pb.MsgSubmitTx.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchaintxs_v1_MsgSubmitTxResponse(arg) {
  if (!(arg instanceof neutron_interchaintxs_v1_tx_pb.MsgSubmitTxResponse)) {
    throw new Error('Expected argument of type neutron.interchaintxs.v1.MsgSubmitTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchaintxs_v1_MsgSubmitTxResponse(buffer_arg) {
  return neutron_interchaintxs_v1_tx_pb.MsgSubmitTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  registerInterchainAccount: {
    path: '/neutron.interchaintxs.v1.Msg/RegisterInterchainAccount',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchaintxs_v1_tx_pb.MsgRegisterInterchainAccount,
    responseType: neutron_interchaintxs_v1_tx_pb.MsgRegisterInterchainAccountResponse,
    requestSerialize: serialize_neutron_interchaintxs_v1_MsgRegisterInterchainAccount,
    requestDeserialize: deserialize_neutron_interchaintxs_v1_MsgRegisterInterchainAccount,
    responseSerialize: serialize_neutron_interchaintxs_v1_MsgRegisterInterchainAccountResponse,
    responseDeserialize: deserialize_neutron_interchaintxs_v1_MsgRegisterInterchainAccountResponse,
  },
  submitTx: {
    path: '/neutron.interchaintxs.v1.Msg/SubmitTx',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchaintxs_v1_tx_pb.MsgSubmitTx,
    responseType: neutron_interchaintxs_v1_tx_pb.MsgSubmitTxResponse,
    requestSerialize: serialize_neutron_interchaintxs_v1_MsgSubmitTx,
    requestDeserialize: deserialize_neutron_interchaintxs_v1_MsgSubmitTx,
    responseSerialize: serialize_neutron_interchaintxs_v1_MsgSubmitTxResponse,
    responseDeserialize: deserialize_neutron_interchaintxs_v1_MsgSubmitTxResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
