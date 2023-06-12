// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sommelier_cork_v2_tx_pb = require('../../../sommelier/cork/v2/tx_pb.js');
var sommelier_cork_v2_cork_pb = require('../../../sommelier/cork/v2/cork_pb.js');

function serialize_cork_v2_MsgScheduleCorkRequest(arg) {
  if (!(arg instanceof sommelier_cork_v2_tx_pb.MsgScheduleCorkRequest)) {
    throw new Error('Expected argument of type cork.v2.MsgScheduleCorkRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_MsgScheduleCorkRequest(buffer_arg) {
  return sommelier_cork_v2_tx_pb.MsgScheduleCorkRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_MsgScheduleCorkResponse(arg) {
  if (!(arg instanceof sommelier_cork_v2_tx_pb.MsgScheduleCorkResponse)) {
    throw new Error('Expected argument of type cork.v2.MsgScheduleCorkResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_MsgScheduleCorkResponse(buffer_arg) {
  return sommelier_cork_v2_tx_pb.MsgScheduleCorkResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// MsgService defines the msgs that the cork module handles
var MsgService = exports.MsgService = {
  scheduleCork: {
    path: '/cork.v2.Msg/ScheduleCork',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v2_tx_pb.MsgScheduleCorkRequest,
    responseType: sommelier_cork_v2_tx_pb.MsgScheduleCorkResponse,
    requestSerialize: serialize_cork_v2_MsgScheduleCorkRequest,
    requestDeserialize: deserialize_cork_v2_MsgScheduleCorkRequest,
    responseSerialize: serialize_cork_v2_MsgScheduleCorkResponse,
    responseDeserialize: deserialize_cork_v2_MsgScheduleCorkResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
