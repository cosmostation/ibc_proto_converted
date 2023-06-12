// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_msgfees_v1_query_pb = require('../../../provenance/msgfees/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var provenance_msgfees_v1_msgfees_pb = require('../../../provenance/msgfees/v1/msgfees_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_provenance_msgfees_v1_CalculateTxFeesRequest(arg) {
  if (!(arg instanceof provenance_msgfees_v1_query_pb.CalculateTxFeesRequest)) {
    throw new Error('Expected argument of type provenance.msgfees.v1.CalculateTxFeesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_msgfees_v1_CalculateTxFeesRequest(buffer_arg) {
  return provenance_msgfees_v1_query_pb.CalculateTxFeesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_msgfees_v1_CalculateTxFeesResponse(arg) {
  if (!(arg instanceof provenance_msgfees_v1_query_pb.CalculateTxFeesResponse)) {
    throw new Error('Expected argument of type provenance.msgfees.v1.CalculateTxFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_msgfees_v1_CalculateTxFeesResponse(buffer_arg) {
  return provenance_msgfees_v1_query_pb.CalculateTxFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_msgfees_v1_QueryAllMsgFeesRequest(arg) {
  if (!(arg instanceof provenance_msgfees_v1_query_pb.QueryAllMsgFeesRequest)) {
    throw new Error('Expected argument of type provenance.msgfees.v1.QueryAllMsgFeesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_msgfees_v1_QueryAllMsgFeesRequest(buffer_arg) {
  return provenance_msgfees_v1_query_pb.QueryAllMsgFeesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_msgfees_v1_QueryAllMsgFeesResponse(arg) {
  if (!(arg instanceof provenance_msgfees_v1_query_pb.QueryAllMsgFeesResponse)) {
    throw new Error('Expected argument of type provenance.msgfees.v1.QueryAllMsgFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_msgfees_v1_QueryAllMsgFeesResponse(buffer_arg) {
  return provenance_msgfees_v1_query_pb.QueryAllMsgFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_msgfees_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof provenance_msgfees_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type provenance.msgfees.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_msgfees_v1_QueryParamsRequest(buffer_arg) {
  return provenance_msgfees_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_msgfees_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof provenance_msgfees_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type provenance.msgfees.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_msgfees_v1_QueryParamsResponse(buffer_arg) {
  return provenance_msgfees_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for marker module.
var QueryService = exports.QueryService = {
  // Params queries the parameters for x/msgfees
params: {
    path: '/provenance.msgfees.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: provenance_msgfees_v1_query_pb.QueryParamsRequest,
    responseType: provenance_msgfees_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_provenance_msgfees_v1_QueryParamsRequest,
    requestDeserialize: deserialize_provenance_msgfees_v1_QueryParamsRequest,
    responseSerialize: serialize_provenance_msgfees_v1_QueryParamsResponse,
    responseDeserialize: deserialize_provenance_msgfees_v1_QueryParamsResponse,
  },
  // Query all Msgs which have fees associated with them.
queryAllMsgFees: {
    path: '/provenance.msgfees.v1.Query/QueryAllMsgFees',
    requestStream: false,
    responseStream: false,
    requestType: provenance_msgfees_v1_query_pb.QueryAllMsgFeesRequest,
    responseType: provenance_msgfees_v1_query_pb.QueryAllMsgFeesResponse,
    requestSerialize: serialize_provenance_msgfees_v1_QueryAllMsgFeesRequest,
    requestDeserialize: deserialize_provenance_msgfees_v1_QueryAllMsgFeesRequest,
    responseSerialize: serialize_provenance_msgfees_v1_QueryAllMsgFeesResponse,
    responseDeserialize: deserialize_provenance_msgfees_v1_QueryAllMsgFeesResponse,
  },
  // CalculateTxFees simulates executing a transaction for estimating gas usage and additional fees.
calculateTxFees: {
    path: '/provenance.msgfees.v1.Query/CalculateTxFees',
    requestStream: false,
    responseStream: false,
    requestType: provenance_msgfees_v1_query_pb.CalculateTxFeesRequest,
    responseType: provenance_msgfees_v1_query_pb.CalculateTxFeesResponse,
    requestSerialize: serialize_provenance_msgfees_v1_CalculateTxFeesRequest,
    requestDeserialize: deserialize_provenance_msgfees_v1_CalculateTxFeesRequest,
    responseSerialize: serialize_provenance_msgfees_v1_CalculateTxFeesResponse,
    responseDeserialize: deserialize_provenance_msgfees_v1_CalculateTxFeesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
