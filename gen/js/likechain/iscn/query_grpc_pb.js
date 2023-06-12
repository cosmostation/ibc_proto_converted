// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var likechain_iscn_query_pb = require('../../likechain/iscn/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var likechain_iscn_params_pb = require('../../likechain/iscn/params_pb.js');

function serialize_likechain_iscn_QueryGetCidRequest(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryGetCidRequest)) {
    throw new Error('Expected argument of type likechain.iscn.QueryGetCidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryGetCidRequest(buffer_arg) {
  return likechain_iscn_query_pb.QueryGetCidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryGetCidResponse(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryGetCidResponse)) {
    throw new Error('Expected argument of type likechain.iscn.QueryGetCidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryGetCidResponse(buffer_arg) {
  return likechain_iscn_query_pb.QueryGetCidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryGetCidSizeRequest(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryGetCidSizeRequest)) {
    throw new Error('Expected argument of type likechain.iscn.QueryGetCidSizeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryGetCidSizeRequest(buffer_arg) {
  return likechain_iscn_query_pb.QueryGetCidSizeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryGetCidSizeResponse(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryGetCidSizeResponse)) {
    throw new Error('Expected argument of type likechain.iscn.QueryGetCidSizeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryGetCidSizeResponse(buffer_arg) {
  return likechain_iscn_query_pb.QueryGetCidSizeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryHasCidRequest(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryHasCidRequest)) {
    throw new Error('Expected argument of type likechain.iscn.QueryHasCidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryHasCidRequest(buffer_arg) {
  return likechain_iscn_query_pb.QueryHasCidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryHasCidResponse(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryHasCidResponse)) {
    throw new Error('Expected argument of type likechain.iscn.QueryHasCidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryHasCidResponse(buffer_arg) {
  return likechain_iscn_query_pb.QueryHasCidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryParamsRequest(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type likechain.iscn.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryParamsRequest(buffer_arg) {
  return likechain_iscn_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryParamsResponse(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type likechain.iscn.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryParamsResponse(buffer_arg) {
  return likechain_iscn_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryRecordsByFingerprintRequest(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryRecordsByFingerprintRequest)) {
    throw new Error('Expected argument of type likechain.iscn.QueryRecordsByFingerprintRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryRecordsByFingerprintRequest(buffer_arg) {
  return likechain_iscn_query_pb.QueryRecordsByFingerprintRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryRecordsByFingerprintResponse(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryRecordsByFingerprintResponse)) {
    throw new Error('Expected argument of type likechain.iscn.QueryRecordsByFingerprintResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryRecordsByFingerprintResponse(buffer_arg) {
  return likechain_iscn_query_pb.QueryRecordsByFingerprintResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryRecordsByIdRequest(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryRecordsByIdRequest)) {
    throw new Error('Expected argument of type likechain.iscn.QueryRecordsByIdRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryRecordsByIdRequest(buffer_arg) {
  return likechain_iscn_query_pb.QueryRecordsByIdRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryRecordsByIdResponse(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryRecordsByIdResponse)) {
    throw new Error('Expected argument of type likechain.iscn.QueryRecordsByIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryRecordsByIdResponse(buffer_arg) {
  return likechain_iscn_query_pb.QueryRecordsByIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryRecordsByOwnerRequest(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryRecordsByOwnerRequest)) {
    throw new Error('Expected argument of type likechain.iscn.QueryRecordsByOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryRecordsByOwnerRequest(buffer_arg) {
  return likechain_iscn_query_pb.QueryRecordsByOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_QueryRecordsByOwnerResponse(arg) {
  if (!(arg instanceof likechain_iscn_query_pb.QueryRecordsByOwnerResponse)) {
    throw new Error('Expected argument of type likechain.iscn.QueryRecordsByOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_QueryRecordsByOwnerResponse(buffer_arg) {
  return likechain_iscn_query_pb.QueryRecordsByOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  recordsById: {
    path: '/likechain.iscn.Query/RecordsById',
    requestStream: false,
    responseStream: false,
    requestType: likechain_iscn_query_pb.QueryRecordsByIdRequest,
    responseType: likechain_iscn_query_pb.QueryRecordsByIdResponse,
    requestSerialize: serialize_likechain_iscn_QueryRecordsByIdRequest,
    requestDeserialize: deserialize_likechain_iscn_QueryRecordsByIdRequest,
    responseSerialize: serialize_likechain_iscn_QueryRecordsByIdResponse,
    responseDeserialize: deserialize_likechain_iscn_QueryRecordsByIdResponse,
  },
  recordsByFingerprint: {
    path: '/likechain.iscn.Query/RecordsByFingerprint',
    requestStream: false,
    responseStream: false,
    requestType: likechain_iscn_query_pb.QueryRecordsByFingerprintRequest,
    responseType: likechain_iscn_query_pb.QueryRecordsByFingerprintResponse,
    requestSerialize: serialize_likechain_iscn_QueryRecordsByFingerprintRequest,
    requestDeserialize: deserialize_likechain_iscn_QueryRecordsByFingerprintRequest,
    responseSerialize: serialize_likechain_iscn_QueryRecordsByFingerprintResponse,
    responseDeserialize: deserialize_likechain_iscn_QueryRecordsByFingerprintResponse,
  },
  recordsByOwner: {
    path: '/likechain.iscn.Query/RecordsByOwner',
    requestStream: false,
    responseStream: false,
    requestType: likechain_iscn_query_pb.QueryRecordsByOwnerRequest,
    responseType: likechain_iscn_query_pb.QueryRecordsByOwnerResponse,
    requestSerialize: serialize_likechain_iscn_QueryRecordsByOwnerRequest,
    requestDeserialize: deserialize_likechain_iscn_QueryRecordsByOwnerRequest,
    responseSerialize: serialize_likechain_iscn_QueryRecordsByOwnerResponse,
    responseDeserialize: deserialize_likechain_iscn_QueryRecordsByOwnerResponse,
  },
  params: {
    path: '/likechain.iscn.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: likechain_iscn_query_pb.QueryParamsRequest,
    responseType: likechain_iscn_query_pb.QueryParamsResponse,
    requestSerialize: serialize_likechain_iscn_QueryParamsRequest,
    requestDeserialize: deserialize_likechain_iscn_QueryParamsRequest,
    responseSerialize: serialize_likechain_iscn_QueryParamsResponse,
    responseDeserialize: deserialize_likechain_iscn_QueryParamsResponse,
  },
  // Below are endpoints reserved for IPFS plugin
//
getCid: {
    path: '/likechain.iscn.Query/GetCid',
    requestStream: false,
    responseStream: false,
    requestType: likechain_iscn_query_pb.QueryGetCidRequest,
    responseType: likechain_iscn_query_pb.QueryGetCidResponse,
    requestSerialize: serialize_likechain_iscn_QueryGetCidRequest,
    requestDeserialize: deserialize_likechain_iscn_QueryGetCidRequest,
    responseSerialize: serialize_likechain_iscn_QueryGetCidResponse,
    responseDeserialize: deserialize_likechain_iscn_QueryGetCidResponse,
  },
  hasCid: {
    path: '/likechain.iscn.Query/HasCid',
    requestStream: false,
    responseStream: false,
    requestType: likechain_iscn_query_pb.QueryHasCidRequest,
    responseType: likechain_iscn_query_pb.QueryHasCidResponse,
    requestSerialize: serialize_likechain_iscn_QueryHasCidRequest,
    requestDeserialize: deserialize_likechain_iscn_QueryHasCidRequest,
    responseSerialize: serialize_likechain_iscn_QueryHasCidResponse,
    responseDeserialize: deserialize_likechain_iscn_QueryHasCidResponse,
  },
  getCidSize: {
    path: '/likechain.iscn.Query/GetCidSize',
    requestStream: false,
    responseStream: false,
    requestType: likechain_iscn_query_pb.QueryGetCidSizeRequest,
    responseType: likechain_iscn_query_pb.QueryGetCidSizeResponse,
    requestSerialize: serialize_likechain_iscn_QueryGetCidSizeRequest,
    requestDeserialize: deserialize_likechain_iscn_QueryGetCidSizeRequest,
    responseSerialize: serialize_likechain_iscn_QueryGetCidSizeResponse,
    responseDeserialize: deserialize_likechain_iscn_QueryGetCidSizeResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
// Usage:
// /iscn/api/endpoint?param1=blablabla&param2=blablabla...
// Example:
// /iscn/records/id?iscn_id=iscn://likecoin-chain/btC7CJvMm4WLj9Tau9LAPTfGK7sfymTJW7ORcFdruCU&from_version=2
