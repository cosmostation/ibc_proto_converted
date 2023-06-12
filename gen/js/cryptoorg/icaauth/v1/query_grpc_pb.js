// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cryptoorg_icaauth_v1_query_pb = require('../../../cryptoorg/icaauth/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cryptoorg_icaauth_v1_params_pb = require('../../../cryptoorg/icaauth/v1/params_pb.js');

function serialize_chainmain_icaauth_v1_QueryInterchainAccountAddressRequest(arg) {
  if (!(arg instanceof cryptoorg_icaauth_v1_query_pb.QueryInterchainAccountAddressRequest)) {
    throw new Error('Expected argument of type chainmain.icaauth.v1.QueryInterchainAccountAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_icaauth_v1_QueryInterchainAccountAddressRequest(buffer_arg) {
  return cryptoorg_icaauth_v1_query_pb.QueryInterchainAccountAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_icaauth_v1_QueryInterchainAccountAddressResponse(arg) {
  if (!(arg instanceof cryptoorg_icaauth_v1_query_pb.QueryInterchainAccountAddressResponse)) {
    throw new Error('Expected argument of type chainmain.icaauth.v1.QueryInterchainAccountAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_icaauth_v1_QueryInterchainAccountAddressResponse(buffer_arg) {
  return cryptoorg_icaauth_v1_query_pb.QueryInterchainAccountAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_icaauth_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof cryptoorg_icaauth_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type chainmain.icaauth.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_icaauth_v1_QueryParamsRequest(buffer_arg) {
  return cryptoorg_icaauth_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_icaauth_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof cryptoorg_icaauth_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type chainmain.icaauth.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_icaauth_v1_QueryParamsResponse(buffer_arg) {
  return cryptoorg_icaauth_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/chainmain.icaauth.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_icaauth_v1_query_pb.QueryParamsRequest,
    responseType: cryptoorg_icaauth_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_chainmain_icaauth_v1_QueryParamsRequest,
    requestDeserialize: deserialize_chainmain_icaauth_v1_QueryParamsRequest,
    responseSerialize: serialize_chainmain_icaauth_v1_QueryParamsResponse,
    responseDeserialize: deserialize_chainmain_icaauth_v1_QueryParamsResponse,
  },
  // InterchainAccountAddress queries the interchain account address for given `connectionId` and `owner`
interchainAccountAddress: {
    path: '/chainmain.icaauth.v1.Query/InterchainAccountAddress',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_icaauth_v1_query_pb.QueryInterchainAccountAddressRequest,
    responseType: cryptoorg_icaauth_v1_query_pb.QueryInterchainAccountAddressResponse,
    requestSerialize: serialize_chainmain_icaauth_v1_QueryInterchainAccountAddressRequest,
    requestDeserialize: deserialize_chainmain_icaauth_v1_QueryInterchainAccountAddressRequest,
    responseSerialize: serialize_chainmain_icaauth_v1_QueryInterchainAccountAddressResponse,
    responseDeserialize: deserialize_chainmain_icaauth_v1_QueryInterchainAccountAddressResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
