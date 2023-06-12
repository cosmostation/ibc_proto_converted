// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irishub_guardian_query_pb = require('../../irishub/guardian/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var irishub_guardian_guardian_pb = require('../../irishub/guardian/guardian_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_irishub_guardian_QuerySupersRequest(arg) {
  if (!(arg instanceof irishub_guardian_query_pb.QuerySupersRequest)) {
    throw new Error('Expected argument of type irishub.guardian.QuerySupersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irishub_guardian_QuerySupersRequest(buffer_arg) {
  return irishub_guardian_query_pb.QuerySupersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irishub_guardian_QuerySupersResponse(arg) {
  if (!(arg instanceof irishub_guardian_query_pb.QuerySupersResponse)) {
    throw new Error('Expected argument of type irishub.guardian.QuerySupersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irishub_guardian_QuerySupersResponse(buffer_arg) {
  return irishub_guardian_query_pb.QuerySupersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query creates service with guardian as RPC
var QueryService = exports.QueryService = {
  // Supers returns all Supers
supers: {
    path: '/irishub.guardian.Query/Supers',
    requestStream: false,
    responseStream: false,
    requestType: irishub_guardian_query_pb.QuerySupersRequest,
    responseType: irishub_guardian_query_pb.QuerySupersResponse,
    requestSerialize: serialize_irishub_guardian_QuerySupersRequest,
    requestDeserialize: deserialize_irishub_guardian_QuerySupersRequest,
    responseSerialize: serialize_irishub_guardian_QuerySupersResponse,
    responseDeserialize: deserialize_irishub_guardian_QuerySupersResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
