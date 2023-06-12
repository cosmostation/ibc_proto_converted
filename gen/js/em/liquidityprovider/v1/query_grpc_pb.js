// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var em_liquidityprovider_v1_query_pb = require('../../../em/liquidityprovider/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var em_liquidityprovider_v1_liquidityprovider_pb = require('../../../em/liquidityprovider/v1/liquidityprovider_pb.js');

function serialize_em_liquidityprovider_v1_QueryListRequest(arg) {
  if (!(arg instanceof em_liquidityprovider_v1_query_pb.QueryListRequest)) {
    throw new Error('Expected argument of type em.liquidityprovider.v1.QueryListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_liquidityprovider_v1_QueryListRequest(buffer_arg) {
  return em_liquidityprovider_v1_query_pb.QueryListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_liquidityprovider_v1_QueryListResponse(arg) {
  if (!(arg instanceof em_liquidityprovider_v1_query_pb.QueryListResponse)) {
    throw new Error('Expected argument of type em.liquidityprovider.v1.QueryListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_liquidityprovider_v1_QueryListResponse(buffer_arg) {
  return em_liquidityprovider_v1_query_pb.QueryListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_liquidityprovider_v1_QueryMintableRequest(arg) {
  if (!(arg instanceof em_liquidityprovider_v1_query_pb.QueryMintableRequest)) {
    throw new Error('Expected argument of type em.liquidityprovider.v1.QueryMintableRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_liquidityprovider_v1_QueryMintableRequest(buffer_arg) {
  return em_liquidityprovider_v1_query_pb.QueryMintableRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_em_liquidityprovider_v1_QueryMintableResponse(arg) {
  if (!(arg instanceof em_liquidityprovider_v1_query_pb.QueryMintableResponse)) {
    throw new Error('Expected argument of type em.liquidityprovider.v1.QueryMintableResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_em_liquidityprovider_v1_QueryMintableResponse(buffer_arg) {
  return em_liquidityprovider_v1_query_pb.QueryMintableResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  list: {
    path: '/em.liquidityprovider.v1.Query/List',
    requestStream: false,
    responseStream: false,
    requestType: em_liquidityprovider_v1_query_pb.QueryListRequest,
    responseType: em_liquidityprovider_v1_query_pb.QueryListResponse,
    requestSerialize: serialize_em_liquidityprovider_v1_QueryListRequest,
    requestDeserialize: deserialize_em_liquidityprovider_v1_QueryListRequest,
    responseSerialize: serialize_em_liquidityprovider_v1_QueryListResponse,
    responseDeserialize: deserialize_em_liquidityprovider_v1_QueryListResponse,
  },
  mintable: {
    path: '/em.liquidityprovider.v1.Query/Mintable',
    requestStream: false,
    responseStream: false,
    requestType: em_liquidityprovider_v1_query_pb.QueryMintableRequest,
    responseType: em_liquidityprovider_v1_query_pb.QueryMintableResponse,
    requestSerialize: serialize_em_liquidityprovider_v1_QueryMintableRequest,
    requestDeserialize: deserialize_em_liquidityprovider_v1_QueryMintableRequest,
    responseSerialize: serialize_em_liquidityprovider_v1_QueryMintableResponse,
    responseDeserialize: deserialize_em_liquidityprovider_v1_QueryMintableResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
