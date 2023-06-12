// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var assetmantle_orders_transactions_modify_message_pb = require('../../../../assetmantle/orders/transactions/modify/message_pb.js');
var assetmantle_orders_transactions_modify_transaction_response_pb = require('../../../../assetmantle/orders/transactions/modify/transaction_response_pb.js');

function serialize_assetmantle_modules_orders_transactions_modify_Message(arg) {
  if (!(arg instanceof assetmantle_orders_transactions_modify_message_pb.Message)) {
    throw new Error('Expected argument of type assetmantle.modules.orders.transactions.modify.Message');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_orders_transactions_modify_Message(buffer_arg) {
  return assetmantle_orders_transactions_modify_message_pb.Message.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_assetmantle_modules_orders_transactions_modify_TransactionResponse(arg) {
  if (!(arg instanceof assetmantle_orders_transactions_modify_transaction_response_pb.TransactionResponse)) {
    throw new Error('Expected argument of type assetmantle.modules.orders.transactions.modify.TransactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_assetmantle_modules_orders_transactions_modify_TransactionResponse(buffer_arg) {
  return assetmantle_orders_transactions_modify_transaction_response_pb.TransactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var ServiceService = exports.ServiceService = {
  handle: {
    path: '/assetmantle.modules.orders.transactions.modify.Service/Handle',
    requestStream: false,
    responseStream: false,
    requestType: assetmantle_orders_transactions_modify_message_pb.Message,
    responseType: assetmantle_orders_transactions_modify_transaction_response_pb.TransactionResponse,
    requestSerialize: serialize_assetmantle_modules_orders_transactions_modify_Message,
    requestDeserialize: deserialize_assetmantle_modules_orders_transactions_modify_Message,
    responseSerialize: serialize_assetmantle_modules_orders_transactions_modify_TransactionResponse,
    responseDeserialize: deserialize_assetmantle_modules_orders_transactions_modify_TransactionResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
