// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var secret_intertx_v1beta1_tx_pb = require('../../../secret/intertx/v1beta1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_secret_intertx_v1beta1_MsgRegisterAccount(arg) {
  if (!(arg instanceof secret_intertx_v1beta1_tx_pb.MsgRegisterAccount)) {
    throw new Error('Expected argument of type secret.intertx.v1beta1.MsgRegisterAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_intertx_v1beta1_MsgRegisterAccount(buffer_arg) {
  return secret_intertx_v1beta1_tx_pb.MsgRegisterAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_intertx_v1beta1_MsgRegisterAccountResponse(arg) {
  if (!(arg instanceof secret_intertx_v1beta1_tx_pb.MsgRegisterAccountResponse)) {
    throw new Error('Expected argument of type secret.intertx.v1beta1.MsgRegisterAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_intertx_v1beta1_MsgRegisterAccountResponse(buffer_arg) {
  return secret_intertx_v1beta1_tx_pb.MsgRegisterAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_intertx_v1beta1_MsgSubmitTx(arg) {
  if (!(arg instanceof secret_intertx_v1beta1_tx_pb.MsgSubmitTx)) {
    throw new Error('Expected argument of type secret.intertx.v1beta1.MsgSubmitTx');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_intertx_v1beta1_MsgSubmitTx(buffer_arg) {
  return secret_intertx_v1beta1_tx_pb.MsgSubmitTx.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_intertx_v1beta1_MsgSubmitTxResponse(arg) {
  if (!(arg instanceof secret_intertx_v1beta1_tx_pb.MsgSubmitTxResponse)) {
    throw new Error('Expected argument of type secret.intertx.v1beta1.MsgSubmitTxResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_intertx_v1beta1_MsgSubmitTxResponse(buffer_arg) {
  return secret_intertx_v1beta1_tx_pb.MsgSubmitTxResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the ica-authentication Msg service.
var MsgService = exports.MsgService = {
  // Register defines a rpc handler for MsgRegisterAccount
registerAccount: {
    path: '/secret.intertx.v1beta1.Msg/RegisterAccount',
    requestStream: false,
    responseStream: false,
    requestType: secret_intertx_v1beta1_tx_pb.MsgRegisterAccount,
    responseType: secret_intertx_v1beta1_tx_pb.MsgRegisterAccountResponse,
    requestSerialize: serialize_secret_intertx_v1beta1_MsgRegisterAccount,
    requestDeserialize: deserialize_secret_intertx_v1beta1_MsgRegisterAccount,
    responseSerialize: serialize_secret_intertx_v1beta1_MsgRegisterAccountResponse,
    responseDeserialize: deserialize_secret_intertx_v1beta1_MsgRegisterAccountResponse,
  },
  submitTx: {
    path: '/secret.intertx.v1beta1.Msg/SubmitTx',
    requestStream: false,
    responseStream: false,
    requestType: secret_intertx_v1beta1_tx_pb.MsgSubmitTx,
    responseType: secret_intertx_v1beta1_tx_pb.MsgSubmitTxResponse,
    requestSerialize: serialize_secret_intertx_v1beta1_MsgSubmitTx,
    requestDeserialize: deserialize_secret_intertx_v1beta1_MsgSubmitTx,
    responseSerialize: serialize_secret_intertx_v1beta1_MsgSubmitTxResponse,
    responseDeserialize: deserialize_secret_intertx_v1beta1_MsgSubmitTxResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
