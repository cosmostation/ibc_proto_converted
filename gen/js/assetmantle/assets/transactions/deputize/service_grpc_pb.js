// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_assets_transactions_deputize_message_pb = require('../../../../assetmantle/assets/transactions/deputize/message_pb.js');
var assetmantle_assets_transactions_deputize_transaction_response_pb = require('../../../../assetmantle/assets/transactions/deputize/transaction_response_pb.js');

function serialize_assetmantle_modules_assets_transactions_deputize_Message(arg) {
  if (!(arg instanceof assetmantle_assets_transactions_deputize_message_pb.Message)) {
    throw new Error('Expected argument of type assetmantle.modules.assets.transactions.deputize.Message');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_assets_transactions_deputize_Message(buffer_arg) {
  return assetmantle_assets_transactions_deputize_message_pb.Message.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_assets_transactions_deputize_TransactionResponse(arg) {
  if (!(arg instanceof assetmantle_assets_transactions_deputize_transaction_response_pb.TransactionResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.assets.transactions.deputize.TransactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_assets_transactions_deputize_TransactionResponse(buffer_arg) {
  return assetmantle_assets_transactions_deputize_transaction_response_pb.TransactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.assets.transactions.deputize.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_assets_transactions_deputize_message_pb.Message,
    responseType: assetmantle_assets_transactions_deputize_transaction_response_pb.TransactionResponse,
    requestSerialize: serialize_assetmantle_modules_assets_transactions_deputize_Message,
    requestDeserialize: deserialize_assetmantle_modules_assets_transactions_deputize_Message,
    responseSerialize: serialize_assetmantle_modules_assets_transactions_deputize_TransactionResponse,
    responseDeserialize: deserialize_assetmantle_modules_assets_transactions_deputize_TransactionResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
