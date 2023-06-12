// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var shentu_cvm_v1alpha1_query_pb = require('../../../shentu/cvm/v1alpha1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var shentu_cvm_v1alpha1_cvm_pb = require('../../../shentu/cvm/v1alpha1/cvm_pb.js');
var cosmos_auth_v1beta1_auth_pb = require('../../../cosmos/auth/v1beta1/auth_pb.js');
var shentu_burrow_acm_pb = require('../../../shentu/burrow/acm_pb.js');

function serialize_acm_Account(arg) {
  if (!(arg instanceof shentu_burrow_acm_pb.Account)) {
    throw new Error('Expected argument of type acm.Account');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_acm_Account(buffer_arg) {
  return shentu_burrow_acm_pb.Account.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryAbiRequest(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryAbiRequest)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryAbiRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryAbiRequest(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryAbiRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryAbiResponse(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryAbiResponse)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryAbiResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryAbiResponse(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryAbiResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryAccountRequest(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryAccountRequest)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryAccountRequest(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryAddressMetaRequest(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryAddressMetaRequest)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryAddressMetaRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryAddressMetaRequest(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryAddressMetaRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryAddressMetaResponse(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryAddressMetaResponse)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryAddressMetaResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryAddressMetaResponse(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryAddressMetaResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryCodeRequest(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryCodeRequest)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryCodeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryCodeRequest(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryCodeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryCodeResponse(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryCodeResponse)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryCodeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryCodeResponse(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryCodeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryMetaRequest(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryMetaRequest)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryMetaRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryMetaRequest(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryMetaRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryMetaResponse(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryMetaResponse)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryMetaResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryMetaResponse(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryMetaResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryStorageRequest(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryStorageRequest)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryStorageRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryStorageRequest(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryStorageRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryStorageResponse(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryStorageResponse)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryStorageResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryStorageResponse(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryStorageResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryViewRequest(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryViewRequest)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryViewRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryViewRequest(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryViewRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_cvm_v1alpha1_QueryViewResponse(arg) {
  if (!(arg instanceof shentu_cvm_v1alpha1_query_pb.QueryViewResponse)) {
    throw new Error('Expected argument of type shentu.cvm.v1alpha1.QueryViewResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_cvm_v1alpha1_QueryViewResponse(buffer_arg) {
  return shentu_cvm_v1alpha1_query_pb.QueryViewResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  code: {
    path: '/shentu.cvm.v1alpha1.Query/Code',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cvm_v1alpha1_query_pb.QueryCodeRequest,
    responseType: shentu_cvm_v1alpha1_query_pb.QueryCodeResponse,
    requestSerialize: serialize_shentu_cvm_v1alpha1_QueryCodeRequest,
    requestDeserialize: deserialize_shentu_cvm_v1alpha1_QueryCodeRequest,
    responseSerialize: serialize_shentu_cvm_v1alpha1_QueryCodeResponse,
    responseDeserialize: deserialize_shentu_cvm_v1alpha1_QueryCodeResponse,
  },
  abi: {
    path: '/shentu.cvm.v1alpha1.Query/Abi',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cvm_v1alpha1_query_pb.QueryAbiRequest,
    responseType: shentu_cvm_v1alpha1_query_pb.QueryAbiResponse,
    requestSerialize: serialize_shentu_cvm_v1alpha1_QueryAbiRequest,
    requestDeserialize: deserialize_shentu_cvm_v1alpha1_QueryAbiRequest,
    responseSerialize: serialize_shentu_cvm_v1alpha1_QueryAbiResponse,
    responseDeserialize: deserialize_shentu_cvm_v1alpha1_QueryAbiResponse,
  },
  storage: {
    path: '/shentu.cvm.v1alpha1.Query/Storage',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cvm_v1alpha1_query_pb.QueryStorageRequest,
    responseType: shentu_cvm_v1alpha1_query_pb.QueryStorageResponse,
    requestSerialize: serialize_shentu_cvm_v1alpha1_QueryStorageRequest,
    requestDeserialize: deserialize_shentu_cvm_v1alpha1_QueryStorageRequest,
    responseSerialize: serialize_shentu_cvm_v1alpha1_QueryStorageResponse,
    responseDeserialize: deserialize_shentu_cvm_v1alpha1_QueryStorageResponse,
  },
  addressMeta: {
    path: '/shentu.cvm.v1alpha1.Query/AddressMeta',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cvm_v1alpha1_query_pb.QueryAddressMetaRequest,
    responseType: shentu_cvm_v1alpha1_query_pb.QueryAddressMetaResponse,
    requestSerialize: serialize_shentu_cvm_v1alpha1_QueryAddressMetaRequest,
    requestDeserialize: deserialize_shentu_cvm_v1alpha1_QueryAddressMetaRequest,
    responseSerialize: serialize_shentu_cvm_v1alpha1_QueryAddressMetaResponse,
    responseDeserialize: deserialize_shentu_cvm_v1alpha1_QueryAddressMetaResponse,
  },
  meta: {
    path: '/shentu.cvm.v1alpha1.Query/Meta',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cvm_v1alpha1_query_pb.QueryMetaRequest,
    responseType: shentu_cvm_v1alpha1_query_pb.QueryMetaResponse,
    requestSerialize: serialize_shentu_cvm_v1alpha1_QueryMetaRequest,
    requestDeserialize: deserialize_shentu_cvm_v1alpha1_QueryMetaRequest,
    responseSerialize: serialize_shentu_cvm_v1alpha1_QueryMetaResponse,
    responseDeserialize: deserialize_shentu_cvm_v1alpha1_QueryMetaResponse,
  },
  account: {
    path: '/shentu.cvm.v1alpha1.Query/Account',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cvm_v1alpha1_query_pb.QueryAccountRequest,
    responseType: shentu_burrow_acm_pb.Account,
    requestSerialize: serialize_shentu_cvm_v1alpha1_QueryAccountRequest,
    requestDeserialize: deserialize_shentu_cvm_v1alpha1_QueryAccountRequest,
    responseSerialize: serialize_acm_Account,
    responseDeserialize: deserialize_acm_Account,
  },
  view: {
    path: '/shentu.cvm.v1alpha1.Query/View',
    requestStream: false,
    responseStream: false,
    requestType: shentu_cvm_v1alpha1_query_pb.QueryViewRequest,
    responseType: shentu_cvm_v1alpha1_query_pb.QueryViewResponse,
    requestSerialize: serialize_shentu_cvm_v1alpha1_QueryViewRequest,
    requestDeserialize: deserialize_shentu_cvm_v1alpha1_QueryViewRequest,
    responseSerialize: serialize_shentu_cvm_v1alpha1_QueryViewResponse,
    responseDeserialize: deserialize_shentu_cvm_v1alpha1_QueryViewResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
