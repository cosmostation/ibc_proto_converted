// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_identities_transactions_quash_message_pb = require('../../../../assetmantle/identities/transactions/quash/message_pb.js');
var assetmantle_identities_transactions_quash_transaction_response_pb = require('../../../../assetmantle/identities/transactions/quash/transaction_response_pb.js');

function serialize_assetmantle_modules_identities_transactions_quash_Message(arg) {
  if (!(arg instanceof assetmantle_identities_transactions_quash_message_pb.Message)) {
    throw new Error('Expected argument of type assetmantle.modules.identities.transactions.quash.Message');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_identities_transactions_quash_Message(buffer_arg) {
  return assetmantle_identities_transactions_quash_message_pb.Message.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_identities_transactions_quash_TransactionResponse(arg) {
  if (!(arg instanceof assetmantle_identities_transactions_quash_transaction_response_pb.TransactionResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.identities.transactions.quash.TransactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_identities_transactions_quash_TransactionResponse(buffer_arg) {
  return assetmantle_identities_transactions_quash_transaction_response_pb.TransactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.identities.transactions.quash.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_identities_transactions_quash_message_pb.Message,
    responseType: assetmantle_identities_transactions_quash_transaction_response_pb.TransactionResponse,
    requestSerialize: serialize_assetmantle_modules_identities_transactions_quash_Message,
    requestDeserialize: deserialize_assetmantle_modules_identities_transactions_quash_Message,
    responseSerialize: serialize_assetmantle_modules_identities_transactions_quash_TransactionResponse,
    responseDeserialize: deserialize_assetmantle_modules_identities_transactions_quash_TransactionResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
