// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_valset$pref_v1beta1_query_pb = require('../../../osmosis/valset-pref/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var osmosis_valset$pref_v1beta1_state_pb = require('../../../osmosis/valset-pref/v1beta1/state_pb.js');

function serialize_osmosis_valsetpref_v1beta1_UserValidatorPreferencesRequest(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_query_pb.UserValidatorPreferencesRequest)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.UserValidatorPreferencesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_UserValidatorPreferencesRequest(buffer_arg) {
  return osmosis_valset$pref_v1beta1_query_pb.UserValidatorPreferencesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_valsetpref_v1beta1_UserValidatorPreferencesResponse(arg) {
  if (!(arg instanceof osmosis_valset$pref_v1beta1_query_pb.UserValidatorPreferencesResponse)) {
    throw new Error('Expected argument of type osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_valsetpref_v1beta1_UserValidatorPreferencesResponse(buffer_arg) {
  return osmosis_valset$pref_v1beta1_query_pb.UserValidatorPreferencesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Returns the list of ValidatorPreferences for the user.
userValidatorPreferences: {
    path: '/osmosis.valsetpref.v1beta1.Query/UserValidatorPreferences',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_valset$pref_v1beta1_query_pb.UserValidatorPreferencesRequest,
    responseType: osmosis_valset$pref_v1beta1_query_pb.UserValidatorPreferencesResponse,
    requestSerialize: serialize_osmosis_valsetpref_v1beta1_UserValidatorPreferencesRequest,
    requestDeserialize: deserialize_osmosis_valsetpref_v1beta1_UserValidatorPreferencesRequest,
    responseSerialize: serialize_osmosis_valsetpref_v1beta1_UserValidatorPreferencesResponse,
    responseDeserialize: deserialize_osmosis_valsetpref_v1beta1_UserValidatorPreferencesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
