// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var bcna_bcna_query_pb = require('../../bcna/bcna/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var bcna_bcna_params_pb = require('../../bcna/bcna/params_pb.js');
var bcna_bcna_bitcannaid_pb = require('../../bcna/bcna/bitcannaid_pb.js');
var bcna_bcna_supplychain_pb = require('../../bcna/bcna/supplychain_pb.js');

function serialize_bitcannaglobal_bcna_bcna_QueryAllBitcannaidRequest(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryAllBitcannaidRequest)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryAllBitcannaidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryAllBitcannaidRequest(buffer_arg) {
  return bcna_bcna_query_pb.QueryAllBitcannaidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_QueryAllBitcannaidResponse(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryAllBitcannaidResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryAllBitcannaidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryAllBitcannaidResponse(buffer_arg) {
  return bcna_bcna_query_pb.QueryAllBitcannaidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_QueryAllSupplychainRequest(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryAllSupplychainRequest)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryAllSupplychainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryAllSupplychainRequest(buffer_arg) {
  return bcna_bcna_query_pb.QueryAllSupplychainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_QueryAllSupplychainResponse(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryAllSupplychainResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryAllSupplychainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryAllSupplychainResponse(buffer_arg) {
  return bcna_bcna_query_pb.QueryAllSupplychainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidByBcnaidRequest(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryGetBitcannaidByBcnaidRequest)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryGetBitcannaidByBcnaidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidByBcnaidRequest(buffer_arg) {
  return bcna_bcna_query_pb.QueryGetBitcannaidByBcnaidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidByBcnaidResponse(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryGetBitcannaidByBcnaidResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryGetBitcannaidByBcnaidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidByBcnaidResponse(buffer_arg) {
  return bcna_bcna_query_pb.QueryGetBitcannaidByBcnaidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidRequest(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryGetBitcannaidRequest)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryGetBitcannaidRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidRequest(buffer_arg) {
  return bcna_bcna_query_pb.QueryGetBitcannaidRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidResponse(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryGetBitcannaidResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryGetBitcannaidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidResponse(buffer_arg) {
  return bcna_bcna_query_pb.QueryGetBitcannaidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_QueryGetSupplychainRequest(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryGetSupplychainRequest)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryGetSupplychainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryGetSupplychainRequest(buffer_arg) {
  return bcna_bcna_query_pb.QueryGetSupplychainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_QueryGetSupplychainResponse(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryGetSupplychainResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryGetSupplychainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryGetSupplychainResponse(buffer_arg) {
  return bcna_bcna_query_pb.QueryGetSupplychainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_QueryParamsRequest(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryParamsRequest(buffer_arg) {
  return bcna_bcna_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitcannaglobal_bcna_bcna_QueryParamsResponse(arg) {
  if (!(arg instanceof bcna_bcna_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type bitcannaglobal.bcna.bcna.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitcannaglobal_bcna_bcna_QueryParamsResponse(buffer_arg) {
  return bcna_bcna_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/bitcannaglobal.bcna.bcna.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_query_pb.QueryParamsRequest,
    responseType: bcna_bcna_query_pb.QueryParamsResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_QueryParamsRequest,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryParamsRequest,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_QueryParamsResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryParamsResponse,
  },
  // Queries a Bitcannaid by id.
bitcannaid: {
    path: '/bitcannaglobal.bcna.bcna.Query/Bitcannaid',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_query_pb.QueryGetBitcannaidRequest,
    responseType: bcna_bcna_query_pb.QueryGetBitcannaidResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidRequest,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidRequest,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidResponse,
  },
  // Queries a list of Bitcannaid items.
bitcannaidAll: {
    path: '/bitcannaglobal.bcna.bcna.Query/BitcannaidAll',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_query_pb.QueryAllBitcannaidRequest,
    responseType: bcna_bcna_query_pb.QueryAllBitcannaidResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_QueryAllBitcannaidRequest,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryAllBitcannaidRequest,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_QueryAllBitcannaidResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryAllBitcannaidResponse,
  },
  // Queries a Bitcannaid by bcnaid.
bitcannaidByBcnaid: {
    path: '/bitcannaglobal.bcna.bcna.Query/BitcannaidByBcnaid',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_query_pb.QueryGetBitcannaidByBcnaidRequest,
    responseType: bcna_bcna_query_pb.QueryGetBitcannaidByBcnaidResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidByBcnaidRequest,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidByBcnaidRequest,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidByBcnaidResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryGetBitcannaidByBcnaidResponse,
  },
  // Queries a Supplychain by id.
supplychain: {
    path: '/bitcannaglobal.bcna.bcna.Query/Supplychain',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_query_pb.QueryGetSupplychainRequest,
    responseType: bcna_bcna_query_pb.QueryGetSupplychainResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_QueryGetSupplychainRequest,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryGetSupplychainRequest,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_QueryGetSupplychainResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryGetSupplychainResponse,
  },
  // Queries a list of Supplychain items.
supplychainAll: {
    path: '/bitcannaglobal.bcna.bcna.Query/SupplychainAll',
    requestStream: false,
    responseStream: false,
    requestType: bcna_bcna_query_pb.QueryAllSupplychainRequest,
    responseType: bcna_bcna_query_pb.QueryAllSupplychainResponse,
    requestSerialize: serialize_bitcannaglobal_bcna_bcna_QueryAllSupplychainRequest,
    requestDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryAllSupplychainRequest,
    responseSerialize: serialize_bitcannaglobal_bcna_bcna_QueryAllSupplychainResponse,
    responseDeserialize: deserialize_bitcannaglobal_bcna_bcna_QueryAllSupplychainResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
