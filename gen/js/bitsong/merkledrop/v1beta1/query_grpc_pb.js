// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var bitsong_merkledrop_v1beta1_query_pb = require('../../../bitsong/merkledrop/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var bitsong_merkledrop_v1beta1_merkledrop_pb = require('../../../bitsong/merkledrop/v1beta1/merkledrop_pb.js');
var bitsong_merkledrop_v1beta1_params_pb = require('../../../bitsong/merkledrop/v1beta1/params_pb.js');

function serialize_bitsong_merkledrop_v1beta1_QueryIndexClaimedRequest(arg) {
  if (!(arg instanceof bitsong_merkledrop_v1beta1_query_pb.QueryIndexClaimedRequest)) {
    throw new Error('Expected argument of type bitsong.merkledrop.v1beta1.QueryIndexClaimedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_merkledrop_v1beta1_QueryIndexClaimedRequest(buffer_arg) {
  return bitsong_merkledrop_v1beta1_query_pb.QueryIndexClaimedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_merkledrop_v1beta1_QueryIndexClaimedResponse(arg) {
  if (!(arg instanceof bitsong_merkledrop_v1beta1_query_pb.QueryIndexClaimedResponse)) {
    throw new Error('Expected argument of type bitsong.merkledrop.v1beta1.QueryIndexClaimedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_merkledrop_v1beta1_QueryIndexClaimedResponse(buffer_arg) {
  return bitsong_merkledrop_v1beta1_query_pb.QueryIndexClaimedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_merkledrop_v1beta1_QueryMerkledropRequest(arg) {
  if (!(arg instanceof bitsong_merkledrop_v1beta1_query_pb.QueryMerkledropRequest)) {
    throw new Error('Expected argument of type bitsong.merkledrop.v1beta1.QueryMerkledropRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_merkledrop_v1beta1_QueryMerkledropRequest(buffer_arg) {
  return bitsong_merkledrop_v1beta1_query_pb.QueryMerkledropRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_merkledrop_v1beta1_QueryMerkledropResponse(arg) {
  if (!(arg instanceof bitsong_merkledrop_v1beta1_query_pb.QueryMerkledropResponse)) {
    throw new Error('Expected argument of type bitsong.merkledrop.v1beta1.QueryMerkledropResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_merkledrop_v1beta1_QueryMerkledropResponse(buffer_arg) {
  return bitsong_merkledrop_v1beta1_query_pb.QueryMerkledropResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_merkledrop_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof bitsong_merkledrop_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type bitsong.merkledrop.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_merkledrop_v1beta1_QueryParamsRequest(buffer_arg) {
  return bitsong_merkledrop_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bitsong_merkledrop_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof bitsong_merkledrop_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type bitsong.merkledrop.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bitsong_merkledrop_v1beta1_QueryParamsResponse(buffer_arg) {
  return bitsong_merkledrop_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  merkledrop: {
    path: '/bitsong.merkledrop.v1beta1.Query/Merkledrop',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_merkledrop_v1beta1_query_pb.QueryMerkledropRequest,
    responseType: bitsong_merkledrop_v1beta1_query_pb.QueryMerkledropResponse,
    requestSerialize: serialize_bitsong_merkledrop_v1beta1_QueryMerkledropRequest,
    requestDeserialize: deserialize_bitsong_merkledrop_v1beta1_QueryMerkledropRequest,
    responseSerialize: serialize_bitsong_merkledrop_v1beta1_QueryMerkledropResponse,
    responseDeserialize: deserialize_bitsong_merkledrop_v1beta1_QueryMerkledropResponse,
  },
  indexClaimed: {
    path: '/bitsong.merkledrop.v1beta1.Query/IndexClaimed',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_merkledrop_v1beta1_query_pb.QueryIndexClaimedRequest,
    responseType: bitsong_merkledrop_v1beta1_query_pb.QueryIndexClaimedResponse,
    requestSerialize: serialize_bitsong_merkledrop_v1beta1_QueryIndexClaimedRequest,
    requestDeserialize: deserialize_bitsong_merkledrop_v1beta1_QueryIndexClaimedRequest,
    responseSerialize: serialize_bitsong_merkledrop_v1beta1_QueryIndexClaimedResponse,
    responseDeserialize: deserialize_bitsong_merkledrop_v1beta1_QueryIndexClaimedResponse,
  },
  // Params queries the fantoken parameters
params: {
    path: '/bitsong.merkledrop.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: bitsong_merkledrop_v1beta1_query_pb.QueryParamsRequest,
    responseType: bitsong_merkledrop_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_bitsong_merkledrop_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_bitsong_merkledrop_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_bitsong_merkledrop_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_bitsong_merkledrop_v1beta1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
