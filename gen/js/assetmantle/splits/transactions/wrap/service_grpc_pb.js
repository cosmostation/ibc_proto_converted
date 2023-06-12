// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_splits_transactions_wrap_message_pb = require('../../../../assetmantle/splits/transactions/wrap/message_pb.js');
var assetmantle_splits_transactions_wrap_transaction_response_pb = require('../../../../assetmantle/splits/transactions/wrap/transaction_response_pb.js');

function serialize_assetmantle_modules_splits_transactions_wrap_Message(arg) {
  if (!(arg instanceof assetmantle_splits_transactions_wrap_message_pb.Message)) {
    throw new Error('Expected argument of type assetmantle.modules.splits.transactions.wrap.Message');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_splits_transactions_wrap_Message(buffer_arg) {
  return assetmantle_splits_transactions_wrap_message_pb.Message.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_splits_transactions_wrap_TransactionResponse(arg) {
  if (!(arg instanceof assetmantle_splits_transactions_wrap_transaction_response_pb.TransactionResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.splits.transactions.wrap.TransactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_splits_transactions_wrap_TransactionResponse(buffer_arg) {
  return assetmantle_splits_transactions_wrap_transaction_response_pb.TransactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.splits.transactions.wrap.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_splits_transactions_wrap_message_pb.Message,
    responseType: assetmantle_splits_transactions_wrap_transaction_response_pb.TransactionResponse,
    requestSerialize: serialize_assetmantle_modules_splits_transactions_wrap_Message,
    requestDeserialize: deserialize_assetmantle_modules_splits_transactions_wrap_Message,
    responseSerialize: serialize_assetmantle_modules_splits_transactions_wrap_TransactionResponse,
    responseDeserialize: deserialize_assetmantle_modules_splits_transactions_wrap_TransactionResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
