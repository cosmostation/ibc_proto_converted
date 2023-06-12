// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_auth_v1beta1_query_pb = require('../../../cosmos/auth/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_auth_v1beta1_auth_pb = require('../../../cosmos/auth/v1beta1/auth_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_query_v1_query_pb = require('../../../cosmos/query/v1/query_pb.js');

function serialize_cosmos_auth_v1beta1_AddressBytesToStringRequest(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.AddressBytesToStringRequest)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.AddressBytesToStringRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_AddressBytesToStringRequest(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.AddressBytesToStringRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_AddressBytesToStringResponse(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.AddressBytesToStringResponse)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.AddressBytesToStringResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_AddressBytesToStringResponse(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.AddressBytesToStringResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_AddressStringToBytesRequest(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.AddressStringToBytesRequest)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.AddressStringToBytesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_AddressStringToBytesRequest(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.AddressStringToBytesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_AddressStringToBytesResponse(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.AddressStringToBytesResponse)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.AddressStringToBytesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_AddressStringToBytesResponse(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.AddressStringToBytesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_Bech32PrefixRequest(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.Bech32PrefixRequest)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.Bech32PrefixRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_Bech32PrefixRequest(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.Bech32PrefixRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_Bech32PrefixResponse(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.Bech32PrefixResponse)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.Bech32PrefixResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_Bech32PrefixResponse(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.Bech32PrefixResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryAccountAddressByIDRequest(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryAccountAddressByIDRequest)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryAccountAddressByIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryAccountAddressByIDRequest(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryAccountAddressByIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryAccountAddressByIDResponse(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryAccountAddressByIDResponse)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryAccountAddressByIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryAccountAddressByIDResponse(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryAccountAddressByIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryAccountInfoRequest(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryAccountInfoRequest)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryAccountInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryAccountInfoRequest(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryAccountInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryAccountInfoResponse(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryAccountInfoResponse)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryAccountInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryAccountInfoResponse(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryAccountInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryAccountRequest(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryAccountRequest)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryAccountRequest(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryAccountResponse(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryAccountResponse)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryAccountResponse(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryAccountsRequest(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryAccountsRequest)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryAccountsRequest(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryAccountsResponse(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryAccountsResponse)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryAccountsResponse(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryModuleAccountByNameRequest(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryModuleAccountByNameRequest)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryModuleAccountByNameRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryModuleAccountByNameRequest(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryModuleAccountByNameRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryModuleAccountByNameResponse(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryModuleAccountByNameResponse)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryModuleAccountByNameResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryModuleAccountByNameResponse(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryModuleAccountByNameResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryModuleAccountsRequest(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryModuleAccountsRequest)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryModuleAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryModuleAccountsRequest(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryModuleAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryModuleAccountsResponse(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryModuleAccountsResponse)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryModuleAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryModuleAccountsResponse(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryModuleAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryParamsRequest(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_auth_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof cosmos_auth_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type cosmos.auth.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_auth_v1beta1_QueryParamsResponse(buffer_arg) {
  return cosmos_auth_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Accounts returns all the existing accounts.
//
// When called from another module, this query might consume a high amount of
// gas if the pagination field is incorrectly set.
//
// Since: cosmos-sdk 0.43
accounts: {
    path: '/cosmos.auth.v1beta1.Query/Accounts',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_auth_v1beta1_query_pb.QueryAccountsRequest,
    responseType: cosmos_auth_v1beta1_query_pb.QueryAccountsResponse,
    requestSerialize: serialize_cosmos_auth_v1beta1_QueryAccountsRequest,
    requestDeserialize: deserialize_cosmos_auth_v1beta1_QueryAccountsRequest,
    responseSerialize: serialize_cosmos_auth_v1beta1_QueryAccountsResponse,
    responseDeserialize: deserialize_cosmos_auth_v1beta1_QueryAccountsResponse,
  },
  // Account returns account details based on address.
account: {
    path: '/cosmos.auth.v1beta1.Query/Account',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_auth_v1beta1_query_pb.QueryAccountRequest,
    responseType: cosmos_auth_v1beta1_query_pb.QueryAccountResponse,
    requestSerialize: serialize_cosmos_auth_v1beta1_QueryAccountRequest,
    requestDeserialize: deserialize_cosmos_auth_v1beta1_QueryAccountRequest,
    responseSerialize: serialize_cosmos_auth_v1beta1_QueryAccountResponse,
    responseDeserialize: deserialize_cosmos_auth_v1beta1_QueryAccountResponse,
  },
  // AccountAddressByID returns account address based on account number.
//
// Since: cosmos-sdk 0.46.2
accountAddressByID: {
    path: '/cosmos.auth.v1beta1.Query/AccountAddressByID',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_auth_v1beta1_query_pb.QueryAccountAddressByIDRequest,
    responseType: cosmos_auth_v1beta1_query_pb.QueryAccountAddressByIDResponse,
    requestSerialize: serialize_cosmos_auth_v1beta1_QueryAccountAddressByIDRequest,
    requestDeserialize: deserialize_cosmos_auth_v1beta1_QueryAccountAddressByIDRequest,
    responseSerialize: serialize_cosmos_auth_v1beta1_QueryAccountAddressByIDResponse,
    responseDeserialize: deserialize_cosmos_auth_v1beta1_QueryAccountAddressByIDResponse,
  },
  // Params queries all parameters.
params: {
    path: '/cosmos.auth.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_auth_v1beta1_query_pb.QueryParamsRequest,
    responseType: cosmos_auth_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_cosmos_auth_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_cosmos_auth_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_cosmos_auth_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_cosmos_auth_v1beta1_QueryParamsResponse,
  },
  // ModuleAccounts returns all the existing module accounts.
//
// Since: cosmos-sdk 0.46
moduleAccounts: {
    path: '/cosmos.auth.v1beta1.Query/ModuleAccounts',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_auth_v1beta1_query_pb.QueryModuleAccountsRequest,
    responseType: cosmos_auth_v1beta1_query_pb.QueryModuleAccountsResponse,
    requestSerialize: serialize_cosmos_auth_v1beta1_QueryModuleAccountsRequest,
    requestDeserialize: deserialize_cosmos_auth_v1beta1_QueryModuleAccountsRequest,
    responseSerialize: serialize_cosmos_auth_v1beta1_QueryModuleAccountsResponse,
    responseDeserialize: deserialize_cosmos_auth_v1beta1_QueryModuleAccountsResponse,
  },
  // ModuleAccountByName returns the module account info by module name
moduleAccountByName: {
    path: '/cosmos.auth.v1beta1.Query/ModuleAccountByName',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_auth_v1beta1_query_pb.QueryModuleAccountByNameRequest,
    responseType: cosmos_auth_v1beta1_query_pb.QueryModuleAccountByNameResponse,
    requestSerialize: serialize_cosmos_auth_v1beta1_QueryModuleAccountByNameRequest,
    requestDeserialize: deserialize_cosmos_auth_v1beta1_QueryModuleAccountByNameRequest,
    responseSerialize: serialize_cosmos_auth_v1beta1_QueryModuleAccountByNameResponse,
    responseDeserialize: deserialize_cosmos_auth_v1beta1_QueryModuleAccountByNameResponse,
  },
  // Bech32Prefix queries bech32Prefix
//
// Since: cosmos-sdk 0.46
bech32Prefix: {
    path: '/cosmos.auth.v1beta1.Query/Bech32Prefix',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_auth_v1beta1_query_pb.Bech32PrefixRequest,
    responseType: cosmos_auth_v1beta1_query_pb.Bech32PrefixResponse,
    requestSerialize: serialize_cosmos_auth_v1beta1_Bech32PrefixRequest,
    requestDeserialize: deserialize_cosmos_auth_v1beta1_Bech32PrefixRequest,
    responseSerialize: serialize_cosmos_auth_v1beta1_Bech32PrefixResponse,
    responseDeserialize: deserialize_cosmos_auth_v1beta1_Bech32PrefixResponse,
  },
  // AddressBytesToString converts Account Address bytes to string
//
// Since: cosmos-sdk 0.46
addressBytesToString: {
    path: '/cosmos.auth.v1beta1.Query/AddressBytesToString',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_auth_v1beta1_query_pb.AddressBytesToStringRequest,
    responseType: cosmos_auth_v1beta1_query_pb.AddressBytesToStringResponse,
    requestSerialize: serialize_cosmos_auth_v1beta1_AddressBytesToStringRequest,
    requestDeserialize: deserialize_cosmos_auth_v1beta1_AddressBytesToStringRequest,
    responseSerialize: serialize_cosmos_auth_v1beta1_AddressBytesToStringResponse,
    responseDeserialize: deserialize_cosmos_auth_v1beta1_AddressBytesToStringResponse,
  },
  // AddressStringToBytes converts Address string to bytes
//
// Since: cosmos-sdk 0.46
addressStringToBytes: {
    path: '/cosmos.auth.v1beta1.Query/AddressStringToBytes',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_auth_v1beta1_query_pb.AddressStringToBytesRequest,
    responseType: cosmos_auth_v1beta1_query_pb.AddressStringToBytesResponse,
    requestSerialize: serialize_cosmos_auth_v1beta1_AddressStringToBytesRequest,
    requestDeserialize: deserialize_cosmos_auth_v1beta1_AddressStringToBytesRequest,
    responseSerialize: serialize_cosmos_auth_v1beta1_AddressStringToBytesResponse,
    responseDeserialize: deserialize_cosmos_auth_v1beta1_AddressStringToBytesResponse,
  },
  // AccountInfo queries account info which is common to all account types.
//
// Since: cosmos-sdk 0.47
accountInfo: {
    path: '/cosmos.auth.v1beta1.Query/AccountInfo',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_auth_v1beta1_query_pb.QueryAccountInfoRequest,
    responseType: cosmos_auth_v1beta1_query_pb.QueryAccountInfoResponse,
    requestSerialize: serialize_cosmos_auth_v1beta1_QueryAccountInfoRequest,
    requestDeserialize: deserialize_cosmos_auth_v1beta1_QueryAccountInfoRequest,
    responseSerialize: serialize_cosmos_auth_v1beta1_QueryAccountInfoResponse,
    responseDeserialize: deserialize_cosmos_auth_v1beta1_QueryAccountInfoResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
