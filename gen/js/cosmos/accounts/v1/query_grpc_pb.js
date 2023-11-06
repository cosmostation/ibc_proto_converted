// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_accounts_v1_query_pb = require('../../../cosmos/accounts/v1/query_pb.js');

function serialize_cosmos_accounts_v1_AccountQueryRequest(arg) {
  if (!(arg instanceof cosmos_accounts_v1_query_pb.AccountQueryRequest)) {
    throw new Error('Expected argument of type cosmos.accounts.v1.AccountQueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_accounts_v1_AccountQueryRequest(buffer_arg) {
  return cosmos_accounts_v1_query_pb.AccountQueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_accounts_v1_AccountQueryResponse(arg) {
  if (!(arg instanceof cosmos_accounts_v1_query_pb.AccountQueryResponse)) {
    throw new Error('Expected argument of type cosmos.accounts.v1.AccountQueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_accounts_v1_AccountQueryResponse(buffer_arg) {
  return cosmos_accounts_v1_query_pb.AccountQueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_accounts_v1_AccountTypeRequest(arg) {
  if (!(arg instanceof cosmos_accounts_v1_query_pb.AccountTypeRequest)) {
    throw new Error('Expected argument of type cosmos.accounts.v1.AccountTypeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_accounts_v1_AccountTypeRequest(buffer_arg) {
  return cosmos_accounts_v1_query_pb.AccountTypeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_accounts_v1_AccountTypeResponse(arg) {
  if (!(arg instanceof cosmos_accounts_v1_query_pb.AccountTypeResponse)) {
    throw new Error('Expected argument of type cosmos.accounts.v1.AccountTypeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_accounts_v1_AccountTypeResponse(buffer_arg) {
  return cosmos_accounts_v1_query_pb.AccountTypeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_accounts_v1_SchemaRequest(arg) {
  if (!(arg instanceof cosmos_accounts_v1_query_pb.SchemaRequest)) {
    throw new Error('Expected argument of type cosmos.accounts.v1.SchemaRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_accounts_v1_SchemaRequest(buffer_arg) {
  return cosmos_accounts_v1_query_pb.SchemaRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_accounts_v1_SchemaResponse(arg) {
  if (!(arg instanceof cosmos_accounts_v1_query_pb.SchemaResponse)) {
    throw new Error('Expected argument of type cosmos.accounts.v1.SchemaResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_accounts_v1_SchemaResponse(buffer_arg) {
  return cosmos_accounts_v1_query_pb.SchemaResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the Query service for the x/accounts module.
var QueryService = exports.QueryService = {
  // AccountQuery runs an account query.
accountQuery: {
    path: '/cosmos.accounts.v1.Query/AccountQuery',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_accounts_v1_query_pb.AccountQueryRequest,
    responseType: cosmos_accounts_v1_query_pb.AccountQueryResponse,
    requestSerialize: serialize_cosmos_accounts_v1_AccountQueryRequest,
    requestDeserialize: deserialize_cosmos_accounts_v1_AccountQueryRequest,
    responseSerialize: serialize_cosmos_accounts_v1_AccountQueryResponse,
    responseDeserialize: deserialize_cosmos_accounts_v1_AccountQueryResponse,
  },
  // Schema returns an x/account schema. Unstable.
schema: {
    path: '/cosmos.accounts.v1.Query/Schema',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_accounts_v1_query_pb.SchemaRequest,
    responseType: cosmos_accounts_v1_query_pb.SchemaResponse,
    requestSerialize: serialize_cosmos_accounts_v1_SchemaRequest,
    requestDeserialize: deserialize_cosmos_accounts_v1_SchemaRequest,
    responseSerialize: serialize_cosmos_accounts_v1_SchemaResponse,
    responseDeserialize: deserialize_cosmos_accounts_v1_SchemaResponse,
  },
  // AccountType returns the account type for an address.
accountType: {
    path: '/cosmos.accounts.v1.Query/AccountType',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_accounts_v1_query_pb.AccountTypeRequest,
    responseType: cosmos_accounts_v1_query_pb.AccountTypeResponse,
    requestSerialize: serialize_cosmos_accounts_v1_AccountTypeRequest,
    requestDeserialize: deserialize_cosmos_accounts_v1_AccountTypeRequest,
    responseSerialize: serialize_cosmos_accounts_v1_AccountTypeResponse,
    responseDeserialize: deserialize_cosmos_accounts_v1_AccountTypeResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
