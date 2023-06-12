// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cryptoorg_icaauth_v1_tx_pb = require('../../../cryptoorg/icaauth/v1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');

function serialize_chainmain_icaauth_v1_MsgRegisterAccount(arg) {
  if (!(arg instanceof cryptoorg_icaauth_v1_tx_pb.MsgRegisterAccount)) {
    throw new Error('Expected argument of type chainmain.icaauth.v1.MsgRegisterAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_icaauth_v1_MsgRegisterAccount(buffer_arg) {
  return cryptoorg_icaauth_v1_tx_pb.MsgRegisterAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_icaauth_v1_MsgRegisterAccountResponse(arg) {
  if (!(arg instanceof cryptoorg_icaauth_v1_tx_pb.MsgRegisterAccountResponse)) {
    throw new Error('Expected argument of type chainmain.icaauth.v1.MsgRegisterAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_icaauth_v1_MsgRegisterAccountResponse(buffer_arg) {
  return cryptoorg_icaauth_v1_tx_pb.MsgRegisterAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_icaauth_v1_MsgSubmitTx(arg) {
  if (!(arg instanceof cryptoorg_icaauth_v1_tx_pb.MsgSubmitTx)) {
    throw new Error('Expected argument of type chainmain.icaauth.v1.MsgSubmitTx');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_icaauth_v1_MsgSubmitTx(buffer_arg) {
  return cryptoorg_icaauth_v1_tx_pb.MsgSubmitTx.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_icaauth_v1_MsgSubmitTxResponse(arg) {
  if (!(arg instanceof cryptoorg_icaauth_v1_tx_pb.MsgSubmitTxResponse)) {
    throw new Error('Expected argument of type chainmain.icaauth.v1.MsgSubmitTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_icaauth_v1_MsgSubmitTxResponse(buffer_arg) {
  return cryptoorg_icaauth_v1_tx_pb.MsgSubmitTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // RegisterAccount registers an interchain account on host chain with given `connectionId`
registerAccount: {
    path: '/chainmain.icaauth.v1.Msg/RegisterAccount',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_icaauth_v1_tx_pb.MsgRegisterAccount,
    responseType: cryptoorg_icaauth_v1_tx_pb.MsgRegisterAccountResponse,
    requestSerialize: serialize_chainmain_icaauth_v1_MsgRegisterAccount,
    requestDeserialize: deserialize_chainmain_icaauth_v1_MsgRegisterAccount,
    responseSerialize: serialize_chainmain_icaauth_v1_MsgRegisterAccountResponse,
    responseDeserialize: deserialize_chainmain_icaauth_v1_MsgRegisterAccountResponse,
  },
  // SubmitTx submits a transaction to the host chain on behalf of interchain account
submitTx: {
    path: '/chainmain.icaauth.v1.Msg/SubmitTx',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_icaauth_v1_tx_pb.MsgSubmitTx,
    responseType: cryptoorg_icaauth_v1_tx_pb.MsgSubmitTxResponse,
    requestSerialize: serialize_chainmain_icaauth_v1_MsgSubmitTx,
    requestDeserialize: deserialize_chainmain_icaauth_v1_MsgSubmitTx,
    responseSerialize: serialize_chainmain_icaauth_v1_MsgSubmitTxResponse,
    responseDeserialize: deserialize_chainmain_icaauth_v1_MsgSubmitTxResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
