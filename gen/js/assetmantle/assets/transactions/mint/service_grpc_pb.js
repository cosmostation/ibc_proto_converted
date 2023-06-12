// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_assets_transactions_mint_message_pb = require('../../../../assetmantle/assets/transactions/mint/message_pb.js');
var assetmantle_assets_transactions_mint_transaction_response_pb = require('../../../../assetmantle/assets/transactions/mint/transaction_response_pb.js');

function serialize_assetmantle_modules_assets_transactions_mint_Message(arg) {
  if (!(arg instanceof assetmantle_assets_transactions_mint_message_pb.Message)) {
    throw new Error('Expected argument of type assetmantle.modules.assets.transactions.mint.Message');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_assets_transactions_mint_Message(buffer_arg) {
  return assetmantle_assets_transactions_mint_message_pb.Message.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_assets_transactions_mint_TransactionResponse(arg) {
  if (!(arg instanceof assetmantle_assets_transactions_mint_transaction_response_pb.TransactionResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.assets.transactions.mint.TransactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_assets_transactions_mint_TransactionResponse(buffer_arg) {
  return assetmantle_assets_transactions_mint_transaction_response_pb.TransactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.assets.transactions.mint.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_assets_transactions_mint_message_pb.Message,
    responseType: assetmantle_assets_transactions_mint_transaction_response_pb.TransactionResponse,
    requestSerialize: serialize_assetmantle_modules_assets_transactions_mint_Message,
    requestDeserialize: deserialize_assetmantle_modules_assets_transactions_mint_Message,
    responseSerialize: serialize_assetmantle_modules_assets_transactions_mint_TransactionResponse,
    responseDeserialize: deserialize_assetmantle_modules_assets_transactions_mint_TransactionResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
