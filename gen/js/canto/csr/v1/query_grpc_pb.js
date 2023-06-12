// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var canto_csr_v1_query_pb = require('../../../canto/csr/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var canto_csr_v1_params_pb = require('../../../canto/csr/v1/params_pb.js');
var canto_csr_v1_csr_pb = require('../../../canto/csr/v1/csr_pb.js');

function serialize_canto_csr_v1_QueryCSRByContractRequest(arg) {
  if (!(arg instanceof canto_csr_v1_query_pb.QueryCSRByContractRequest)) {
    throw new Error('Expected argument of type canto.csr.v1.QueryCSRByContractRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_csr_v1_QueryCSRByContractRequest(buffer_arg) {
  return canto_csr_v1_query_pb.QueryCSRByContractRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_csr_v1_QueryCSRByContractResponse(arg) {
  if (!(arg instanceof canto_csr_v1_query_pb.QueryCSRByContractResponse)) {
    throw new Error('Expected argument of type canto.csr.v1.QueryCSRByContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_csr_v1_QueryCSRByContractResponse(buffer_arg) {
  return canto_csr_v1_query_pb.QueryCSRByContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_csr_v1_QueryCSRByNFTRequest(arg) {
  if (!(arg instanceof canto_csr_v1_query_pb.QueryCSRByNFTRequest)) {
    throw new Error('Expected argument of type canto.csr.v1.QueryCSRByNFTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_csr_v1_QueryCSRByNFTRequest(buffer_arg) {
  return canto_csr_v1_query_pb.QueryCSRByNFTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_csr_v1_QueryCSRByNFTResponse(arg) {
  if (!(arg instanceof canto_csr_v1_query_pb.QueryCSRByNFTResponse)) {
    throw new Error('Expected argument of type canto.csr.v1.QueryCSRByNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_csr_v1_QueryCSRByNFTResponse(buffer_arg) {
  return canto_csr_v1_query_pb.QueryCSRByNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_csr_v1_QueryCSRsRequest(arg) {
  if (!(arg instanceof canto_csr_v1_query_pb.QueryCSRsRequest)) {
    throw new Error('Expected argument of type canto.csr.v1.QueryCSRsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_csr_v1_QueryCSRsRequest(buffer_arg) {
  return canto_csr_v1_query_pb.QueryCSRsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_csr_v1_QueryCSRsResponse(arg) {
  if (!(arg instanceof canto_csr_v1_query_pb.QueryCSRsResponse)) {
    throw new Error('Expected argument of type canto.csr.v1.QueryCSRsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_csr_v1_QueryCSRsResponse(buffer_arg) {
  return canto_csr_v1_query_pb.QueryCSRsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_csr_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof canto_csr_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type canto.csr.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_csr_v1_QueryParamsRequest(buffer_arg) {
  return canto_csr_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_csr_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof canto_csr_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type canto.csr.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_csr_v1_QueryParamsResponse(buffer_arg) {
  return canto_csr_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_csr_v1_QueryTurnstileRequest(arg) {
  if (!(arg instanceof canto_csr_v1_query_pb.QueryTurnstileRequest)) {
    throw new Error('Expected argument of type canto.csr.v1.QueryTurnstileRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_csr_v1_QueryTurnstileRequest(buffer_arg) {
  return canto_csr_v1_query_pb.QueryTurnstileRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_canto_csr_v1_QueryTurnstileResponse(arg) {
  if (!(arg instanceof canto_csr_v1_query_pb.QueryTurnstileResponse)) {
    throw new Error('Expected argument of type canto.csr.v1.QueryTurnstileResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_canto_csr_v1_QueryTurnstileResponse(buffer_arg) {
  return canto_csr_v1_query_pb.QueryTurnstileResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/canto.csr.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: canto_csr_v1_query_pb.QueryParamsRequest,
    responseType: canto_csr_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_canto_csr_v1_QueryParamsRequest,
    requestDeserialize: deserialize_canto_csr_v1_QueryParamsRequest,
    responseSerialize: serialize_canto_csr_v1_QueryParamsResponse,
    responseDeserialize: deserialize_canto_csr_v1_QueryParamsResponse,
  },
  // query all registered CSRs
cSRs: {
    path: '/canto.csr.v1.Query/CSRs',
    requestStream: false,
    responseStream: false,
    requestType: canto_csr_v1_query_pb.QueryCSRsRequest,
    responseType: canto_csr_v1_query_pb.QueryCSRsResponse,
    requestSerialize: serialize_canto_csr_v1_QueryCSRsRequest,
    requestDeserialize: deserialize_canto_csr_v1_QueryCSRsRequest,
    responseSerialize: serialize_canto_csr_v1_QueryCSRsResponse,
    responseDeserialize: deserialize_canto_csr_v1_QueryCSRsResponse,
  },
  // query a specific CSR by the nftId 
cSRByNFT: {
    path: '/canto.csr.v1.Query/CSRByNFT',
    requestStream: false,
    responseStream: false,
    requestType: canto_csr_v1_query_pb.QueryCSRByNFTRequest,
    responseType: canto_csr_v1_query_pb.QueryCSRByNFTResponse,
    requestSerialize: serialize_canto_csr_v1_QueryCSRByNFTRequest,
    requestDeserialize: deserialize_canto_csr_v1_QueryCSRByNFTRequest,
    responseSerialize: serialize_canto_csr_v1_QueryCSRByNFTResponse,
    responseDeserialize: deserialize_canto_csr_v1_QueryCSRByNFTResponse,
  },
  // query a CSR by smart contract address
cSRByContract: {
    path: '/canto.csr.v1.Query/CSRByContract',
    requestStream: false,
    responseStream: false,
    requestType: canto_csr_v1_query_pb.QueryCSRByContractRequest,
    responseType: canto_csr_v1_query_pb.QueryCSRByContractResponse,
    requestSerialize: serialize_canto_csr_v1_QueryCSRByContractRequest,
    requestDeserialize: deserialize_canto_csr_v1_QueryCSRByContractRequest,
    responseSerialize: serialize_canto_csr_v1_QueryCSRByContractResponse,
    responseDeserialize: deserialize_canto_csr_v1_QueryCSRByContractResponse,
  },
  // query the turnstile address
turnstile: {
    path: '/canto.csr.v1.Query/Turnstile',
    requestStream: false,
    responseStream: false,
    requestType: canto_csr_v1_query_pb.QueryTurnstileRequest,
    responseType: canto_csr_v1_query_pb.QueryTurnstileResponse,
    requestSerialize: serialize_canto_csr_v1_QueryTurnstileRequest,
    requestDeserialize: deserialize_canto_csr_v1_QueryTurnstileRequest,
    responseSerialize: serialize_canto_csr_v1_QueryTurnstileResponse,
    responseDeserialize: deserialize_canto_csr_v1_QueryTurnstileResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
