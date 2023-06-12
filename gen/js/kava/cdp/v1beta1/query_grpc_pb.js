// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kava_cdp_v1beta1_query_pb = require('../../../kava/cdp/v1beta1/query_pb.js');
var cosmos_auth_v1beta1_auth_pb = require('../../../cosmos/auth/v1beta1/auth_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var kava_cdp_v1beta1_cdp_pb = require('../../../kava/cdp/v1beta1/cdp_pb.js');
var kava_cdp_v1beta1_genesis_pb = require('../../../kava/cdp/v1beta1/genesis_pb.js');

function serialize_kava_cdp_v1beta1_QueryAccountsRequest(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryAccountsRequest)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryAccountsRequest(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryAccountsResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryAccountsResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryAccountsResponse(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryCdpRequest(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryCdpRequest)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryCdpRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryCdpRequest(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryCdpRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryCdpResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryCdpResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryCdpResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryCdpResponse(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryCdpResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryCdpsRequest(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryCdpsRequest)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryCdpsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryCdpsRequest(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryCdpsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryCdpsResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryCdpsResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryCdpsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryCdpsResponse(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryCdpsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryDepositsRequest(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryDepositsRequest)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryDepositsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryDepositsRequest(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryDepositsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryDepositsResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryDepositsResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryDepositsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryDepositsResponse(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryDepositsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryParamsRequest(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryParamsResponse(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryTotalCollateralRequest(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryTotalCollateralRequest)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryTotalCollateralRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryTotalCollateralRequest(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryTotalCollateralRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryTotalCollateralResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryTotalCollateralResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryTotalCollateralResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryTotalCollateralResponse(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryTotalCollateralResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryTotalPrincipalRequest(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryTotalPrincipalRequest)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryTotalPrincipalRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryTotalPrincipalRequest(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryTotalPrincipalRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kava_cdp_v1beta1_QueryTotalPrincipalResponse(arg) {
  if (!(arg instanceof kava_cdp_v1beta1_query_pb.QueryTotalPrincipalResponse)) {
    throw new Error('Expected argument of type kava.cdp.v1beta1.QueryTotalPrincipalResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kava_cdp_v1beta1_QueryTotalPrincipalResponse(buffer_arg) {
  return kava_cdp_v1beta1_query_pb.QueryTotalPrincipalResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for cdp module
var QueryService = exports.QueryService = {
  // Params queries all parameters of the cdp module.
params: {
    path: '/kava.cdp.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_query_pb.QueryParamsRequest,
    responseType: kava_cdp_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_kava_cdp_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_kava_cdp_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_QueryParamsResponse,
  },
  // Accounts queries the CDP module accounts.
accounts: {
    path: '/kava.cdp.v1beta1.Query/Accounts',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_query_pb.QueryAccountsRequest,
    responseType: kava_cdp_v1beta1_query_pb.QueryAccountsResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_QueryAccountsRequest,
    requestDeserialize: deserialize_kava_cdp_v1beta1_QueryAccountsRequest,
    responseSerialize: serialize_kava_cdp_v1beta1_QueryAccountsResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_QueryAccountsResponse,
  },
  // TotalPrincipal queries the total principal of a given collateral type.
totalPrincipal: {
    path: '/kava.cdp.v1beta1.Query/TotalPrincipal',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_query_pb.QueryTotalPrincipalRequest,
    responseType: kava_cdp_v1beta1_query_pb.QueryTotalPrincipalResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_QueryTotalPrincipalRequest,
    requestDeserialize: deserialize_kava_cdp_v1beta1_QueryTotalPrincipalRequest,
    responseSerialize: serialize_kava_cdp_v1beta1_QueryTotalPrincipalResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_QueryTotalPrincipalResponse,
  },
  // TotalCollateral queries the total collateral of a given collateral type.
totalCollateral: {
    path: '/kava.cdp.v1beta1.Query/TotalCollateral',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_query_pb.QueryTotalCollateralRequest,
    responseType: kava_cdp_v1beta1_query_pb.QueryTotalCollateralResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_QueryTotalCollateralRequest,
    requestDeserialize: deserialize_kava_cdp_v1beta1_QueryTotalCollateralRequest,
    responseSerialize: serialize_kava_cdp_v1beta1_QueryTotalCollateralResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_QueryTotalCollateralResponse,
  },
  // Cdps queries all active CDPs.
cdps: {
    path: '/kava.cdp.v1beta1.Query/Cdps',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_query_pb.QueryCdpsRequest,
    responseType: kava_cdp_v1beta1_query_pb.QueryCdpsResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_QueryCdpsRequest,
    requestDeserialize: deserialize_kava_cdp_v1beta1_QueryCdpsRequest,
    responseSerialize: serialize_kava_cdp_v1beta1_QueryCdpsResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_QueryCdpsResponse,
  },
  // Cdp queries a CDP with the input owner address and collateral type.
cdp: {
    path: '/kava.cdp.v1beta1.Query/Cdp',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_query_pb.QueryCdpRequest,
    responseType: kava_cdp_v1beta1_query_pb.QueryCdpResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_QueryCdpRequest,
    requestDeserialize: deserialize_kava_cdp_v1beta1_QueryCdpRequest,
    responseSerialize: serialize_kava_cdp_v1beta1_QueryCdpResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_QueryCdpResponse,
  },
  // Deposits queries deposits associated with the CDP owned by an address for a collateral type.
deposits: {
    path: '/kava.cdp.v1beta1.Query/Deposits',
    requestStream: false,
    responseStream: false,
    requestType: kava_cdp_v1beta1_query_pb.QueryDepositsRequest,
    responseType: kava_cdp_v1beta1_query_pb.QueryDepositsResponse,
    requestSerialize: serialize_kava_cdp_v1beta1_QueryDepositsRequest,
    requestDeserialize: deserialize_kava_cdp_v1beta1_QueryDepositsRequest,
    responseSerialize: serialize_kava_cdp_v1beta1_QueryDepositsResponse,
    responseDeserialize: deserialize_kava_cdp_v1beta1_QueryDepositsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
