// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_twap_v1beta1_query_pb = require('../../../osmosis/twap/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var osmosis_twap_v1beta1_twap_record_pb = require('../../../osmosis/twap/v1beta1/twap_record_pb.js');
var osmosis_twap_v1beta1_genesis_pb = require('../../../osmosis/twap/v1beta1/genesis_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_osmosis_twap_v1beta1_ArithmeticTwapRequest(arg) {
  if (!(arg instanceof osmosis_twap_v1beta1_query_pb.ArithmeticTwapRequest)) {
    throw new Error('Expected argument of type osmosis.twap.v1beta1.ArithmeticTwapRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_twap_v1beta1_ArithmeticTwapRequest(buffer_arg) {
  return osmosis_twap_v1beta1_query_pb.ArithmeticTwapRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_twap_v1beta1_ArithmeticTwapResponse(arg) {
  if (!(arg instanceof osmosis_twap_v1beta1_query_pb.ArithmeticTwapResponse)) {
    throw new Error('Expected argument of type osmosis.twap.v1beta1.ArithmeticTwapResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_twap_v1beta1_ArithmeticTwapResponse(buffer_arg) {
  return osmosis_twap_v1beta1_query_pb.ArithmeticTwapResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_twap_v1beta1_ArithmeticTwapToNowRequest(arg) {
  if (!(arg instanceof osmosis_twap_v1beta1_query_pb.ArithmeticTwapToNowRequest)) {
    throw new Error('Expected argument of type osmosis.twap.v1beta1.ArithmeticTwapToNowRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_twap_v1beta1_ArithmeticTwapToNowRequest(buffer_arg) {
  return osmosis_twap_v1beta1_query_pb.ArithmeticTwapToNowRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_twap_v1beta1_ArithmeticTwapToNowResponse(arg) {
  if (!(arg instanceof osmosis_twap_v1beta1_query_pb.ArithmeticTwapToNowResponse)) {
    throw new Error('Expected argument of type osmosis.twap.v1beta1.ArithmeticTwapToNowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_twap_v1beta1_ArithmeticTwapToNowResponse(buffer_arg) {
  return osmosis_twap_v1beta1_query_pb.ArithmeticTwapToNowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_twap_v1beta1_GeometricTwapRequest(arg) {
  if (!(arg instanceof osmosis_twap_v1beta1_query_pb.GeometricTwapRequest)) {
    throw new Error('Expected argument of type osmosis.twap.v1beta1.GeometricTwapRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_twap_v1beta1_GeometricTwapRequest(buffer_arg) {
  return osmosis_twap_v1beta1_query_pb.GeometricTwapRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_twap_v1beta1_GeometricTwapResponse(arg) {
  if (!(arg instanceof osmosis_twap_v1beta1_query_pb.GeometricTwapResponse)) {
    throw new Error('Expected argument of type osmosis.twap.v1beta1.GeometricTwapResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_twap_v1beta1_GeometricTwapResponse(buffer_arg) {
  return osmosis_twap_v1beta1_query_pb.GeometricTwapResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_twap_v1beta1_GeometricTwapToNowRequest(arg) {
  if (!(arg instanceof osmosis_twap_v1beta1_query_pb.GeometricTwapToNowRequest)) {
    throw new Error('Expected argument of type osmosis.twap.v1beta1.GeometricTwapToNowRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_twap_v1beta1_GeometricTwapToNowRequest(buffer_arg) {
  return osmosis_twap_v1beta1_query_pb.GeometricTwapToNowRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_twap_v1beta1_GeometricTwapToNowResponse(arg) {
  if (!(arg instanceof osmosis_twap_v1beta1_query_pb.GeometricTwapToNowResponse)) {
    throw new Error('Expected argument of type osmosis.twap.v1beta1.GeometricTwapToNowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_twap_v1beta1_GeometricTwapToNowResponse(buffer_arg) {
  return osmosis_twap_v1beta1_query_pb.GeometricTwapToNowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_twap_v1beta1_ParamsRequest(arg) {
  if (!(arg instanceof osmosis_twap_v1beta1_query_pb.ParamsRequest)) {
    throw new Error('Expected argument of type osmosis.twap.v1beta1.ParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_twap_v1beta1_ParamsRequest(buffer_arg) {
  return osmosis_twap_v1beta1_query_pb.ParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_twap_v1beta1_ParamsResponse(arg) {
  if (!(arg instanceof osmosis_twap_v1beta1_query_pb.ParamsResponse)) {
    throw new Error('Expected argument of type osmosis.twap.v1beta1.ParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_twap_v1beta1_ParamsResponse(buffer_arg) {
  return osmosis_twap_v1beta1_query_pb.ParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  params: {
    path: '/osmosis.twap.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_twap_v1beta1_query_pb.ParamsRequest,
    responseType: osmosis_twap_v1beta1_query_pb.ParamsResponse,
    requestSerialize: serialize_osmosis_twap_v1beta1_ParamsRequest,
    requestDeserialize: deserialize_osmosis_twap_v1beta1_ParamsRequest,
    responseSerialize: serialize_osmosis_twap_v1beta1_ParamsResponse,
    responseDeserialize: deserialize_osmosis_twap_v1beta1_ParamsResponse,
  },
  arithmeticTwap: {
    path: '/osmosis.twap.v1beta1.Query/ArithmeticTwap',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_twap_v1beta1_query_pb.ArithmeticTwapRequest,
    responseType: osmosis_twap_v1beta1_query_pb.ArithmeticTwapResponse,
    requestSerialize: serialize_osmosis_twap_v1beta1_ArithmeticTwapRequest,
    requestDeserialize: deserialize_osmosis_twap_v1beta1_ArithmeticTwapRequest,
    responseSerialize: serialize_osmosis_twap_v1beta1_ArithmeticTwapResponse,
    responseDeserialize: deserialize_osmosis_twap_v1beta1_ArithmeticTwapResponse,
  },
  arithmeticTwapToNow: {
    path: '/osmosis.twap.v1beta1.Query/ArithmeticTwapToNow',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_twap_v1beta1_query_pb.ArithmeticTwapToNowRequest,
    responseType: osmosis_twap_v1beta1_query_pb.ArithmeticTwapToNowResponse,
    requestSerialize: serialize_osmosis_twap_v1beta1_ArithmeticTwapToNowRequest,
    requestDeserialize: deserialize_osmosis_twap_v1beta1_ArithmeticTwapToNowRequest,
    responseSerialize: serialize_osmosis_twap_v1beta1_ArithmeticTwapToNowResponse,
    responseDeserialize: deserialize_osmosis_twap_v1beta1_ArithmeticTwapToNowResponse,
  },
  geometricTwap: {
    path: '/osmosis.twap.v1beta1.Query/GeometricTwap',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_twap_v1beta1_query_pb.GeometricTwapRequest,
    responseType: osmosis_twap_v1beta1_query_pb.GeometricTwapResponse,
    requestSerialize: serialize_osmosis_twap_v1beta1_GeometricTwapRequest,
    requestDeserialize: deserialize_osmosis_twap_v1beta1_GeometricTwapRequest,
    responseSerialize: serialize_osmosis_twap_v1beta1_GeometricTwapResponse,
    responseDeserialize: deserialize_osmosis_twap_v1beta1_GeometricTwapResponse,
  },
  geometricTwapToNow: {
    path: '/osmosis.twap.v1beta1.Query/GeometricTwapToNow',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_twap_v1beta1_query_pb.GeometricTwapToNowRequest,
    responseType: osmosis_twap_v1beta1_query_pb.GeometricTwapToNowResponse,
    requestSerialize: serialize_osmosis_twap_v1beta1_GeometricTwapToNowRequest,
    requestDeserialize: deserialize_osmosis_twap_v1beta1_GeometricTwapToNowRequest,
    responseSerialize: serialize_osmosis_twap_v1beta1_GeometricTwapToNowResponse,
    responseDeserialize: deserialize_osmosis_twap_v1beta1_GeometricTwapToNowResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
