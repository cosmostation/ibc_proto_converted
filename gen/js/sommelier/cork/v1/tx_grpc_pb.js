// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sommelier_cork_v1_tx_pb = require('../../../sommelier/cork/v1/tx_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var sommelier_cork_v1_cork_pb = require('../../../sommelier/cork/v1/cork_pb.js');

function serialize_cork_v1_MsgScheduleCorkRequest(arg) {
  if (!(arg instanceof sommelier_cork_v1_tx_pb.MsgScheduleCorkRequest)) {
    throw new Error('Expected argument of type cork.v1.MsgScheduleCorkRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_MsgScheduleCorkRequest(buffer_arg) {
  return sommelier_cork_v1_tx_pb.MsgScheduleCorkRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_MsgScheduleCorkResponse(arg) {
  if (!(arg instanceof sommelier_cork_v1_tx_pb.MsgScheduleCorkResponse)) {
    throw new Error('Expected argument of type cork.v1.MsgScheduleCorkResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_MsgScheduleCorkResponse(buffer_arg) {
  return sommelier_cork_v1_tx_pb.MsgScheduleCorkResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_MsgSubmitCorkRequest(arg) {
  if (!(arg instanceof sommelier_cork_v1_tx_pb.MsgSubmitCorkRequest)) {
    throw new Error('Expected argument of type cork.v1.MsgSubmitCorkRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_MsgSubmitCorkRequest(buffer_arg) {
  return sommelier_cork_v1_tx_pb.MsgSubmitCorkRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_MsgSubmitCorkResponse(arg) {
  if (!(arg instanceof sommelier_cork_v1_tx_pb.MsgSubmitCorkResponse)) {
    throw new Error('Expected argument of type cork.v1.MsgSubmitCorkResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_MsgSubmitCorkResponse(buffer_arg) {
  return sommelier_cork_v1_tx_pb.MsgSubmitCorkResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// MsgService defines the msgs that the cork module handles
var MsgService = exports.MsgService = {
  submitCork: {
    path: '/cork.v1.Msg/SubmitCork',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v1_tx_pb.MsgSubmitCorkRequest,
    responseType: sommelier_cork_v1_tx_pb.MsgSubmitCorkResponse,
    requestSerialize: serialize_cork_v1_MsgSubmitCorkRequest,
    requestDeserialize: deserialize_cork_v1_MsgSubmitCorkRequest,
    responseSerialize: serialize_cork_v1_MsgSubmitCorkResponse,
    responseDeserialize: deserialize_cork_v1_MsgSubmitCorkResponse,
  },
  scheduleCork: {
    path: '/cork.v1.Msg/ScheduleCork',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v1_tx_pb.MsgScheduleCorkRequest,
    responseType: sommelier_cork_v1_tx_pb.MsgScheduleCorkResponse,
    requestSerialize: serialize_cork_v1_MsgScheduleCorkRequest,
    requestDeserialize: deserialize_cork_v1_MsgScheduleCorkRequest,
    responseSerialize: serialize_cork_v1_MsgScheduleCorkResponse,
    responseDeserialize: deserialize_cork_v1_MsgScheduleCorkResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
