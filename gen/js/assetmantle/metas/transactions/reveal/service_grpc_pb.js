// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_metas_transactions_reveal_message_pb = require('../../../../assetmantle/metas/transactions/reveal/message_pb.js');
var assetmantle_metas_transactions_reveal_transaction_response_pb = require('../../../../assetmantle/metas/transactions/reveal/transaction_response_pb.js');

function serialize_assetmantle_modules_metas_transactions_reveal_Message(arg) {
  if (!(arg instanceof assetmantle_metas_transactions_reveal_message_pb.Message)) {
    throw new Error('Expected argument of type assetmantle.modules.metas.transactions.reveal.Message');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_metas_transactions_reveal_Message(buffer_arg) {
  return assetmantle_metas_transactions_reveal_message_pb.Message.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_metas_transactions_reveal_TransactionResponse(arg) {
  if (!(arg instanceof assetmantle_metas_transactions_reveal_transaction_response_pb.TransactionResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.metas.transactions.reveal.TransactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_metas_transactions_reveal_TransactionResponse(buffer_arg) {
  return assetmantle_metas_transactions_reveal_transaction_response_pb.TransactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.metas.transactions.reveal.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_metas_transactions_reveal_message_pb.Message,
    responseType: assetmantle_metas_transactions_reveal_transaction_response_pb.TransactionResponse,
    requestSerialize: serialize_assetmantle_modules_metas_transactions_reveal_Message,
    requestDeserialize: deserialize_assetmantle_modules_metas_transactions_reveal_Message,
    responseSerialize: serialize_assetmantle_modules_metas_transactions_reveal_TransactionResponse,
    responseDeserialize: deserialize_assetmantle_modules_metas_transactions_reveal_TransactionResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
