// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var secret_emergencybutton_v1beta1_query_pb = require('../../../secret/emergencybutton/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var secret_emergencybutton_v1beta1_params_pb = require('../../../secret/emergencybutton/v1beta1/params_pb.js');

function serialize_secret_emergencybutton_v1beta1_ParamsRequest(arg) {
  if (!(arg instanceof secret_emergencybutton_v1beta1_query_pb.ParamsRequest)) {
    throw new Error('Expected argument of type secret.emergencybutton.v1beta1.ParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_emergencybutton_v1beta1_ParamsRequest(buffer_arg) {
  return secret_emergencybutton_v1beta1_query_pb.ParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_secret_emergencybutton_v1beta1_ParamsResponse(arg) {
  if (!(arg instanceof secret_emergencybutton_v1beta1_query_pb.ParamsResponse)) {
    throw new Error('Expected argument of type secret.emergencybutton.v1beta1.ParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_secret_emergencybutton_v1beta1_ParamsResponse(buffer_arg) {
  return secret_emergencybutton_v1beta1_query_pb.ParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params defines a gRPC query method that returns the emergencybutton module's
// parameters.
params: {
    path: '/secret.emergencybutton.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: secret_emergencybutton_v1beta1_query_pb.ParamsRequest,
    responseType: secret_emergencybutton_v1beta1_query_pb.ParamsResponse,
    requestSerialize: serialize_secret_emergencybutton_v1beta1_ParamsRequest,
    requestDeserialize: deserialize_secret_emergencybutton_v1beta1_ParamsRequest,
    responseSerialize: serialize_secret_emergencybutton_v1beta1_ParamsResponse,
    responseDeserialize: deserialize_secret_emergencybutton_v1beta1_ParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
