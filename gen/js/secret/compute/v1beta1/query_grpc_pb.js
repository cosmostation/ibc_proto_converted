// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var secret_compute_v1beta1_query_pb = require('../../../secret/compute/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var secret_compute_v1beta1_types_pb = require('../../../secret/compute/v1beta1/types_pb.js');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_abci_v1beta1_abci_pb = require('../../../cosmos/base/abci/v1beta1/abci_pb.js');

function serialize_google_protobuf_Empty(arg) {
  if (!(arg instanceof google_protobuf_empty_pb.Empty)) {
    throw new Error('Expected argument of type google.protobuf.Empty');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_google_protobuf_Empty(buffer_arg) {
  return google_protobuf_empty_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QueryByCodeIdRequest(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QueryByCodeIdRequest)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QueryByCodeIdRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QueryByCodeIdRequest(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QueryByCodeIdRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QueryByContractAddressRequest(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QueryByContractAddressRequest)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QueryByContractAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QueryByContractAddressRequest(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QueryByContractAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QueryByLabelRequest(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QueryByLabelRequest)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QueryByLabelRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QueryByLabelRequest(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QueryByLabelRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QueryCodeHashResponse(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QueryCodeHashResponse)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QueryCodeHashResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QueryCodeHashResponse(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QueryCodeHashResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QueryCodeResponse(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QueryCodeResponse)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QueryCodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QueryCodeResponse(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QueryCodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QueryCodesResponse(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QueryCodesResponse)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QueryCodesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QueryCodesResponse(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QueryCodesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QueryContractAddressResponse(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QueryContractAddressResponse)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QueryContractAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QueryContractAddressResponse(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QueryContractAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QueryContractInfoResponse(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QueryContractInfoResponse)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QueryContractInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QueryContractInfoResponse(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QueryContractInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QueryContractLabelResponse(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QueryContractLabelResponse)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QueryContractLabelResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QueryContractLabelResponse(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QueryContractLabelResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QueryContractsByCodeIdResponse(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QueryContractsByCodeIdResponse)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QueryContractsByCodeIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QueryContractsByCodeIdResponse(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QueryContractsByCodeIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QuerySecretContractRequest(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QuerySecretContractRequest)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QuerySecretContractRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QuerySecretContractRequest(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QuerySecretContractRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_compute_v1beta1_QuerySecretContractResponse(arg) {
  if (!(arg instanceof secret_compute_v1beta1_query_pb.QuerySecretContractResponse)) {
    throw new Error('Expected argument of type secret.compute.v1beta1.QuerySecretContractResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_compute_v1beta1_QuerySecretContractResponse(buffer_arg) {
  return secret_compute_v1beta1_query_pb.QuerySecretContractResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // Query contract info by address
contractInfo: {
    path: '/secret.compute.v1beta1.Query/ContractInfo',
    requestStream: false,
    responseStream: false,
    requestType: secret_compute_v1beta1_query_pb.QueryByContractAddressRequest,
    responseType: secret_compute_v1beta1_query_pb.QueryContractInfoResponse,
    requestSerialize: serialize_secret_compute_v1beta1_QueryByContractAddressRequest,
    requestDeserialize: deserialize_secret_compute_v1beta1_QueryByContractAddressRequest,
    responseSerialize: serialize_secret_compute_v1beta1_QueryContractInfoResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_QueryContractInfoResponse,
  },
  // Query code info by id
contractsByCodeId: {
    path: '/secret.compute.v1beta1.Query/ContractsByCodeId',
    requestStream: false,
    responseStream: false,
    requestType: secret_compute_v1beta1_query_pb.QueryByCodeIdRequest,
    responseType: secret_compute_v1beta1_query_pb.QueryContractsByCodeIdResponse,
    requestSerialize: serialize_secret_compute_v1beta1_QueryByCodeIdRequest,
    requestDeserialize: deserialize_secret_compute_v1beta1_QueryByCodeIdRequest,
    responseSerialize: serialize_secret_compute_v1beta1_QueryContractsByCodeIdResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_QueryContractsByCodeIdResponse,
  },
  // Query secret contract
querySecretContract: {
    path: '/secret.compute.v1beta1.Query/QuerySecretContract',
    requestStream: false,
    responseStream: false,
    requestType: secret_compute_v1beta1_query_pb.QuerySecretContractRequest,
    responseType: secret_compute_v1beta1_query_pb.QuerySecretContractResponse,
    requestSerialize: serialize_secret_compute_v1beta1_QuerySecretContractRequest,
    requestDeserialize: deserialize_secret_compute_v1beta1_QuerySecretContractRequest,
    responseSerialize: serialize_secret_compute_v1beta1_QuerySecretContractResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_QuerySecretContractResponse,
  },
  // Query a specific contract code by id
code: {
    path: '/secret.compute.v1beta1.Query/Code',
    requestStream: false,
    responseStream: false,
    requestType: secret_compute_v1beta1_query_pb.QueryByCodeIdRequest,
    responseType: secret_compute_v1beta1_query_pb.QueryCodeResponse,
    requestSerialize: serialize_secret_compute_v1beta1_QueryByCodeIdRequest,
    requestDeserialize: deserialize_secret_compute_v1beta1_QueryByCodeIdRequest,
    responseSerialize: serialize_secret_compute_v1beta1_QueryCodeResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_QueryCodeResponse,
  },
  // Query all contract codes on-chain
codes: {
    path: '/secret.compute.v1beta1.Query/Codes',
    requestStream: false,
    responseStream: false,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: secret_compute_v1beta1_query_pb.QueryCodesResponse,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_secret_compute_v1beta1_QueryCodesResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_QueryCodesResponse,
  },
  // Query code hash by contract address
codeHashByContractAddress: {
    path: '/secret.compute.v1beta1.Query/CodeHashByContractAddress',
    requestStream: false,
    responseStream: false,
    requestType: secret_compute_v1beta1_query_pb.QueryByContractAddressRequest,
    responseType: secret_compute_v1beta1_query_pb.QueryCodeHashResponse,
    requestSerialize: serialize_secret_compute_v1beta1_QueryByContractAddressRequest,
    requestDeserialize: deserialize_secret_compute_v1beta1_QueryByContractAddressRequest,
    responseSerialize: serialize_secret_compute_v1beta1_QueryCodeHashResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_QueryCodeHashResponse,
  },
  // Query code hash by code id
codeHashByCodeId: {
    path: '/secret.compute.v1beta1.Query/CodeHashByCodeId',
    requestStream: false,
    responseStream: false,
    requestType: secret_compute_v1beta1_query_pb.QueryByCodeIdRequest,
    responseType: secret_compute_v1beta1_query_pb.QueryCodeHashResponse,
    requestSerialize: serialize_secret_compute_v1beta1_QueryByCodeIdRequest,
    requestDeserialize: deserialize_secret_compute_v1beta1_QueryByCodeIdRequest,
    responseSerialize: serialize_secret_compute_v1beta1_QueryCodeHashResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_QueryCodeHashResponse,
  },
  // Query contract label by address
labelByAddress: {
    path: '/secret.compute.v1beta1.Query/LabelByAddress',
    requestStream: false,
    responseStream: false,
    requestType: secret_compute_v1beta1_query_pb.QueryByContractAddressRequest,
    responseType: secret_compute_v1beta1_query_pb.QueryContractLabelResponse,
    requestSerialize: serialize_secret_compute_v1beta1_QueryByContractAddressRequest,
    requestDeserialize: deserialize_secret_compute_v1beta1_QueryByContractAddressRequest,
    responseSerialize: serialize_secret_compute_v1beta1_QueryContractLabelResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_QueryContractLabelResponse,
  },
  // Query contract address by label
addressByLabel: {
    path: '/secret.compute.v1beta1.Query/AddressByLabel',
    requestStream: false,
    responseStream: false,
    requestType: secret_compute_v1beta1_query_pb.QueryByLabelRequest,
    responseType: secret_compute_v1beta1_query_pb.QueryContractAddressResponse,
    requestSerialize: serialize_secret_compute_v1beta1_QueryByLabelRequest,
    requestDeserialize: deserialize_secret_compute_v1beta1_QueryByLabelRequest,
    responseSerialize: serialize_secret_compute_v1beta1_QueryContractAddressResponse,
    responseDeserialize: deserialize_secret_compute_v1beta1_QueryContractAddressResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
