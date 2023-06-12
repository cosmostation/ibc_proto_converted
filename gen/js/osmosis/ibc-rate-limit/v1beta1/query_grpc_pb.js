// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_ibc$rate$limit_v1beta1_query_pb = require('../../../osmosis/ibc-rate-limit/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var osmosis_ibc$rate$limit_v1beta1_params_pb = require('../../../osmosis/ibc-rate-limit/v1beta1/params_pb.js');

function serialize_osmosis_ibcratelimit_v1beta1_ParamsRequest(arg) {
  if (!(arg instanceof osmosis_ibc$rate$limit_v1beta1_query_pb.ParamsRequest)) {
    throw new Error('Expected argument of type osmosis.ibcratelimit.v1beta1.ParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_ibcratelimit_v1beta1_ParamsRequest(buffer_arg) {
  return osmosis_ibc$rate$limit_v1beta1_query_pb.ParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_ibcratelimit_v1beta1_ParamsResponse(arg) {
  if (!(arg instanceof osmosis_ibc$rate$limit_v1beta1_query_pb.ParamsResponse)) {
    throw new Error('Expected argument of type osmosis.ibcratelimit.v1beta1.ParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_ibcratelimit_v1beta1_ParamsResponse(buffer_arg) {
  return osmosis_ibc$rate$limit_v1beta1_query_pb.ParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params defines a gRPC query method that returns the ibc-rate-limit module's
// parameters.
params: {
    path: '/osmosis.ibcratelimit.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_ibc$rate$limit_v1beta1_query_pb.ParamsRequest,
    responseType: osmosis_ibc$rate$limit_v1beta1_query_pb.ParamsResponse,
    requestSerialize: serialize_osmosis_ibcratelimit_v1beta1_ParamsRequest,
    requestDeserialize: deserialize_osmosis_ibcratelimit_v1beta1_ParamsRequest,
    responseSerialize: serialize_osmosis_ibcratelimit_v1beta1_ParamsResponse,
    responseDeserialize: deserialize_osmosis_ibcratelimit_v1beta1_ParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
