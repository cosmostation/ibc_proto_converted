// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_query_v1beta1_account_pb = require('../../../kyve/query/v1beta1/account_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kyve_query_v1beta1_query_pb = require('../../../kyve/query/v1beta1/query_pb.js');

function serialize_kyve_query_v1beta1_QueryAccountAssetsRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_account_pb.QueryAccountAssetsRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryAccountAssetsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryAccountAssetsRequest(buffer_arg) {
  return kyve_query_v1beta1_account_pb.QueryAccountAssetsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryAccountAssetsResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_account_pb.QueryAccountAssetsResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryAccountAssetsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryAccountAssetsResponse(buffer_arg) {
  return kyve_query_v1beta1_account_pb.QueryAccountAssetsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryAccountDelegationUnbondingsRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_account_pb.QueryAccountDelegationUnbondingsRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryAccountDelegationUnbondingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryAccountDelegationUnbondingsRequest(buffer_arg) {
  return kyve_query_v1beta1_account_pb.QueryAccountDelegationUnbondingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryAccountDelegationUnbondingsResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_account_pb.QueryAccountDelegationUnbondingsResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryAccountDelegationUnbondingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryAccountDelegationUnbondingsResponse(buffer_arg) {
  return kyve_query_v1beta1_account_pb.QueryAccountDelegationUnbondingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryAccountFundedListRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_account_pb.QueryAccountFundedListRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryAccountFundedListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryAccountFundedListRequest(buffer_arg) {
  return kyve_query_v1beta1_account_pb.QueryAccountFundedListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryAccountFundedListResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_account_pb.QueryAccountFundedListResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryAccountFundedListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryAccountFundedListResponse(buffer_arg) {
  return kyve_query_v1beta1_account_pb.QueryAccountFundedListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryAccountRedelegationRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_account_pb.QueryAccountRedelegationRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryAccountRedelegationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryAccountRedelegationRequest(buffer_arg) {
  return kyve_query_v1beta1_account_pb.QueryAccountRedelegationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryAccountRedelegationResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_account_pb.QueryAccountRedelegationResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryAccountRedelegationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryAccountRedelegationResponse(buffer_arg) {
  return kyve_query_v1beta1_account_pb.QueryAccountRedelegationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// QueryDelegation contains all rpc requests related to direct delegation data
var QueryAccountService = exports.QueryAccountService = {
  // AccountAssets returns an overview of the sum of all balances for a given user. e.g. balance, staking, funding, etc.
accountAssets: {
    path: '/kyve.query.v1beta1.QueryAccount/AccountAssets',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_account_pb.QueryAccountAssetsRequest,
    responseType: kyve_query_v1beta1_account_pb.QueryAccountAssetsResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryAccountAssetsRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryAccountAssetsRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryAccountAssetsResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryAccountAssetsResponse,
  },
  // AccountDelegationUnbondings ...
accountDelegationUnbondings: {
    path: '/kyve.query.v1beta1.QueryAccount/AccountDelegationUnbondings',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_account_pb.QueryAccountDelegationUnbondingsRequest,
    responseType: kyve_query_v1beta1_account_pb.QueryAccountDelegationUnbondingsResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryAccountDelegationUnbondingsRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryAccountDelegationUnbondingsRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryAccountDelegationUnbondingsResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryAccountDelegationUnbondingsResponse,
  },
  // AccountFundedList returns all pools the given user has funded into.
accountFundedList: {
    path: '/kyve.query.v1beta1.QueryAccount/AccountFundedList',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_account_pb.QueryAccountFundedListRequest,
    responseType: kyve_query_v1beta1_account_pb.QueryAccountFundedListResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryAccountFundedListRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryAccountFundedListRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryAccountFundedListResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryAccountFundedListResponse,
  },
  // AccountRedelegation ...
accountRedelegation: {
    path: '/kyve.query.v1beta1.QueryAccount/AccountRedelegation',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_account_pb.QueryAccountRedelegationRequest,
    responseType: kyve_query_v1beta1_account_pb.QueryAccountRedelegationResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryAccountRedelegationRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryAccountRedelegationRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryAccountRedelegationResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryAccountRedelegationResponse,
  },
};

exports.QueryAccountClient = grpc.makeGenericClientConstructor(QueryAccountService);
