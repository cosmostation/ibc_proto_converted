// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_identities_transactions_issue_message_pb = require('../../../../assetmantle/identities/transactions/issue/message_pb.js');
var assetmantle_identities_transactions_issue_transaction_response_pb = require('../../../../assetmantle/identities/transactions/issue/transaction_response_pb.js');

function serialize_assetmantle_modules_identities_transactions_issue_Message(arg) {
  if (!(arg instanceof assetmantle_identities_transactions_issue_message_pb.Message)) {
    throw new Error('Expected argument of type assetmantle.modules.identities.transactions.issue.Message');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_identities_transactions_issue_Message(buffer_arg) {
  return assetmantle_identities_transactions_issue_message_pb.Message.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_identities_transactions_issue_TransactionResponse(arg) {
  if (!(arg instanceof assetmantle_identities_transactions_issue_transaction_response_pb.TransactionResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.identities.transactions.issue.TransactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_identities_transactions_issue_TransactionResponse(buffer_arg) {
  return assetmantle_identities_transactions_issue_transaction_response_pb.TransactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.identities.transactions.issue.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_identities_transactions_issue_message_pb.Message,
    responseType: assetmantle_identities_transactions_issue_transaction_response_pb.TransactionResponse,
    requestSerialize: serialize_assetmantle_modules_identities_transactions_issue_Message,
    requestDeserialize: deserialize_assetmantle_modules_identities_transactions_issue_Message,
    responseSerialize: serialize_assetmantle_modules_identities_transactions_issue_TransactionResponse,
    responseDeserialize: deserialize_assetmantle_modules_identities_transactions_issue_TransactionResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
