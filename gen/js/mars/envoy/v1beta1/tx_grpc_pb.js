// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var mars_envoy_v1beta1_tx_pb = require('../../../mars/envoy/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');

function serialize_mars_envoy_v1beta1_MsgRegisterAccount(arg) {
  if (!(arg instanceof mars_envoy_v1beta1_tx_pb.MsgRegisterAccount)) {
    throw new Error('Expected argument of type mars.envoy.v1beta1.MsgRegisterAccount');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_envoy_v1beta1_MsgRegisterAccount(buffer_arg) {
  return mars_envoy_v1beta1_tx_pb.MsgRegisterAccount.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_envoy_v1beta1_MsgRegisterAccountResponse(arg) {
  if (!(arg instanceof mars_envoy_v1beta1_tx_pb.MsgRegisterAccountResponse)) {
    throw new Error('Expected argument of type mars.envoy.v1beta1.MsgRegisterAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_envoy_v1beta1_MsgRegisterAccountResponse(buffer_arg) {
  return mars_envoy_v1beta1_tx_pb.MsgRegisterAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_envoy_v1beta1_MsgSendFunds(arg) {
  if (!(arg instanceof mars_envoy_v1beta1_tx_pb.MsgSendFunds)) {
    throw new Error('Expected argument of type mars.envoy.v1beta1.MsgSendFunds');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_envoy_v1beta1_MsgSendFunds(buffer_arg) {
  return mars_envoy_v1beta1_tx_pb.MsgSendFunds.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_envoy_v1beta1_MsgSendFundsResponse(arg) {
  if (!(arg instanceof mars_envoy_v1beta1_tx_pb.MsgSendFundsResponse)) {
    throw new Error('Expected argument of type mars.envoy.v1beta1.MsgSendFundsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_envoy_v1beta1_MsgSendFundsResponse(buffer_arg) {
  return mars_envoy_v1beta1_tx_pb.MsgSendFundsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_envoy_v1beta1_MsgSendMessages(arg) {
  if (!(arg instanceof mars_envoy_v1beta1_tx_pb.MsgSendMessages)) {
    throw new Error('Expected argument of type mars.envoy.v1beta1.MsgSendMessages');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_envoy_v1beta1_MsgSendMessages(buffer_arg) {
  return mars_envoy_v1beta1_tx_pb.MsgSendMessages.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_mars_envoy_v1beta1_MsgSendMessagesResponse(arg) {
  if (!(arg instanceof mars_envoy_v1beta1_tx_pb.MsgSendMessagesResponse)) {
    throw new Error('Expected argument of type mars.envoy.v1beta1.MsgSendMessagesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_mars_envoy_v1beta1_MsgSendMessagesResponse(buffer_arg) {
  return mars_envoy_v1beta1_tx_pb.MsgSendMessagesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the module's gRPC message service.
var MsgService = exports.MsgService = {
  // RegisterAccount creates a new interchain account on the given connection,
// or if an interchain account already exists but its channel is closed (due
// to a packet having timed out), open a new channel for this account.
registerAccount: {
    path: '/mars.envoy.v1beta1.Msg/RegisterAccount',
    requestStream: false,
    responseStream: false,
    requestType: mars_envoy_v1beta1_tx_pb.MsgRegisterAccount,
    responseType: mars_envoy_v1beta1_tx_pb.MsgRegisterAccountResponse,
    requestSerialize: serialize_mars_envoy_v1beta1_MsgRegisterAccount,
    requestDeserialize: deserialize_mars_envoy_v1beta1_MsgRegisterAccount,
    responseSerialize: serialize_mars_envoy_v1beta1_MsgRegisterAccountResponse,
    responseDeserialize: deserialize_mars_envoy_v1beta1_MsgRegisterAccountResponse,
  },
  // SendFunds is a governance operation for sending funds to an interchain
// account via ICS-20.
//
// The envoy module will first attempt to use the balance held in its own
// module account. If the balance is not sufficient, it will attempt to draw
// the difference from the community pool.
sendFunds: {
    path: '/mars.envoy.v1beta1.Msg/SendFunds',
    requestStream: false,
    responseStream: false,
    requestType: mars_envoy_v1beta1_tx_pb.MsgSendFunds,
    responseType: mars_envoy_v1beta1_tx_pb.MsgSendFundsResponse,
    requestSerialize: serialize_mars_envoy_v1beta1_MsgSendFunds,
    requestDeserialize: deserialize_mars_envoy_v1beta1_MsgSendFunds,
    responseSerialize: serialize_mars_envoy_v1beta1_MsgSendFundsResponse,
    responseDeserialize: deserialize_mars_envoy_v1beta1_MsgSendFundsResponse,
  },
  // SendMessages is a governance operation for sending one or more messages to
// the host chain to be executed by the interchain account.
sendMessages: {
    path: '/mars.envoy.v1beta1.Msg/SendMessages',
    requestStream: false,
    responseStream: false,
    requestType: mars_envoy_v1beta1_tx_pb.MsgSendMessages,
    responseType: mars_envoy_v1beta1_tx_pb.MsgSendMessagesResponse,
    requestSerialize: serialize_mars_envoy_v1beta1_MsgSendMessages,
    requestDeserialize: deserialize_mars_envoy_v1beta1_MsgSendMessages,
    responseSerialize: serialize_mars_envoy_v1beta1_MsgSendMessagesResponse,
    responseDeserialize: deserialize_mars_envoy_v1beta1_MsgSendMessagesResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
