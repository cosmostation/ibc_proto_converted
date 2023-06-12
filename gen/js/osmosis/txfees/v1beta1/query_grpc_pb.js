// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_txfees_v1beta1_query_pb = require('../../../osmosis/txfees/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var osmosis_txfees_v1beta1_feetoken_pb = require('../../../osmosis/txfees/v1beta1/feetoken_pb.js');

function serialize_osmosis_txfees_v1beta1_QueryBaseDenomRequest(arg) {
  if (!(arg instanceof osmosis_txfees_v1beta1_query_pb.QueryBaseDenomRequest)) {
    throw new Error('Expected argument of type osmosis.txfees.v1beta1.QueryBaseDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_txfees_v1beta1_QueryBaseDenomRequest(buffer_arg) {
  return osmosis_txfees_v1beta1_query_pb.QueryBaseDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_txfees_v1beta1_QueryBaseDenomResponse(arg) {
  if (!(arg instanceof osmosis_txfees_v1beta1_query_pb.QueryBaseDenomResponse)) {
    throw new Error('Expected argument of type osmosis.txfees.v1beta1.QueryBaseDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_txfees_v1beta1_QueryBaseDenomResponse(buffer_arg) {
  return osmosis_txfees_v1beta1_query_pb.QueryBaseDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_txfees_v1beta1_QueryDenomPoolIdRequest(arg) {
  if (!(arg instanceof osmosis_txfees_v1beta1_query_pb.QueryDenomPoolIdRequest)) {
    throw new Error('Expected argument of type osmosis.txfees.v1beta1.QueryDenomPoolIdRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_txfees_v1beta1_QueryDenomPoolIdRequest(buffer_arg) {
  return osmosis_txfees_v1beta1_query_pb.QueryDenomPoolIdRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_txfees_v1beta1_QueryDenomPoolIdResponse(arg) {
  if (!(arg instanceof osmosis_txfees_v1beta1_query_pb.QueryDenomPoolIdResponse)) {
    throw new Error('Expected argument of type osmosis.txfees.v1beta1.QueryDenomPoolIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_txfees_v1beta1_QueryDenomPoolIdResponse(buffer_arg) {
  return osmosis_txfees_v1beta1_query_pb.QueryDenomPoolIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_txfees_v1beta1_QueryDenomSpotPriceRequest(arg) {
  if (!(arg instanceof osmosis_txfees_v1beta1_query_pb.QueryDenomSpotPriceRequest)) {
    throw new Error('Expected argument of type osmosis.txfees.v1beta1.QueryDenomSpotPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_txfees_v1beta1_QueryDenomSpotPriceRequest(buffer_arg) {
  return osmosis_txfees_v1beta1_query_pb.QueryDenomSpotPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_txfees_v1beta1_QueryDenomSpotPriceResponse(arg) {
  if (!(arg instanceof osmosis_txfees_v1beta1_query_pb.QueryDenomSpotPriceResponse)) {
    throw new Error('Expected argument of type osmosis.txfees.v1beta1.QueryDenomSpotPriceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_txfees_v1beta1_QueryDenomSpotPriceResponse(buffer_arg) {
  return osmosis_txfees_v1beta1_query_pb.QueryDenomSpotPriceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_txfees_v1beta1_QueryFeeTokensRequest(arg) {
  if (!(arg instanceof osmosis_txfees_v1beta1_query_pb.QueryFeeTokensRequest)) {
    throw new Error('Expected argument of type osmosis.txfees.v1beta1.QueryFeeTokensRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_txfees_v1beta1_QueryFeeTokensRequest(buffer_arg) {
  return osmosis_txfees_v1beta1_query_pb.QueryFeeTokensRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_txfees_v1beta1_QueryFeeTokensResponse(arg) {
  if (!(arg instanceof osmosis_txfees_v1beta1_query_pb.QueryFeeTokensResponse)) {
    throw new Error('Expected argument of type osmosis.txfees.v1beta1.QueryFeeTokensResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_txfees_v1beta1_QueryFeeTokensResponse(buffer_arg) {
  return osmosis_txfees_v1beta1_query_pb.QueryFeeTokensResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  // FeeTokens returns a list of all the whitelisted fee tokens and their
// corresponding pools. It does not include the BaseDenom, which has its own
// query endpoint
feeTokens: {
    path: '/osmosis.txfees.v1beta1.Query/FeeTokens',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_txfees_v1beta1_query_pb.QueryFeeTokensRequest,
    responseType: osmosis_txfees_v1beta1_query_pb.QueryFeeTokensResponse,
    requestSerialize: serialize_osmosis_txfees_v1beta1_QueryFeeTokensRequest,
    requestDeserialize: deserialize_osmosis_txfees_v1beta1_QueryFeeTokensRequest,
    responseSerialize: serialize_osmosis_txfees_v1beta1_QueryFeeTokensResponse,
    responseDeserialize: deserialize_osmosis_txfees_v1beta1_QueryFeeTokensResponse,
  },
  // DenomSpotPrice returns all spot prices by each registered token denom.
denomSpotPrice: {
    path: '/osmosis.txfees.v1beta1.Query/DenomSpotPrice',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_txfees_v1beta1_query_pb.QueryDenomSpotPriceRequest,
    responseType: osmosis_txfees_v1beta1_query_pb.QueryDenomSpotPriceResponse,
    requestSerialize: serialize_osmosis_txfees_v1beta1_QueryDenomSpotPriceRequest,
    requestDeserialize: deserialize_osmosis_txfees_v1beta1_QueryDenomSpotPriceRequest,
    responseSerialize: serialize_osmosis_txfees_v1beta1_QueryDenomSpotPriceResponse,
    responseDeserialize: deserialize_osmosis_txfees_v1beta1_QueryDenomSpotPriceResponse,
  },
  // Returns the poolID for a specified denom input.
denomPoolId: {
    path: '/osmosis.txfees.v1beta1.Query/DenomPoolId',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_txfees_v1beta1_query_pb.QueryDenomPoolIdRequest,
    responseType: osmosis_txfees_v1beta1_query_pb.QueryDenomPoolIdResponse,
    requestSerialize: serialize_osmosis_txfees_v1beta1_QueryDenomPoolIdRequest,
    requestDeserialize: deserialize_osmosis_txfees_v1beta1_QueryDenomPoolIdRequest,
    responseSerialize: serialize_osmosis_txfees_v1beta1_QueryDenomPoolIdResponse,
    responseDeserialize: deserialize_osmosis_txfees_v1beta1_QueryDenomPoolIdResponse,
  },
  // Returns a list of all base denom tokens and their corresponding pools.
baseDenom: {
    path: '/osmosis.txfees.v1beta1.Query/BaseDenom',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_txfees_v1beta1_query_pb.QueryBaseDenomRequest,
    responseType: osmosis_txfees_v1beta1_query_pb.QueryBaseDenomResponse,
    requestSerialize: serialize_osmosis_txfees_v1beta1_QueryBaseDenomRequest,
    requestDeserialize: deserialize_osmosis_txfees_v1beta1_QueryBaseDenomRequest,
    responseSerialize: serialize_osmosis_txfees_v1beta1_QueryBaseDenomResponse,
    responseDeserialize: deserialize_osmosis_txfees_v1beta1_QueryBaseDenomResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
