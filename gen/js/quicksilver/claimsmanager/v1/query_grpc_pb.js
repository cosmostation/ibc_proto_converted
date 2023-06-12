// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quicksilver_claimsmanager_v1_query_pb = require('../../../quicksilver/claimsmanager/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var quicksilver_claimsmanager_v1_claimsmanager_pb = require('../../../quicksilver/claimsmanager/v1/claimsmanager_pb.js');

function serialize_quicksilver_claimsmanager_v1_QueryClaimsRequest(arg) {
  if (!(arg instanceof quicksilver_claimsmanager_v1_query_pb.QueryClaimsRequest)) {
    throw new Error('Expected argument of type quicksilver.claimsmanager.v1.QueryClaimsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_claimsmanager_v1_QueryClaimsRequest(buffer_arg) {
  return quicksilver_claimsmanager_v1_query_pb.QueryClaimsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_claimsmanager_v1_QueryClaimsResponse(arg) {
  if (!(arg instanceof quicksilver_claimsmanager_v1_query_pb.QueryClaimsResponse)) {
    throw new Error('Expected argument of type quicksilver.claimsmanager.v1.QueryClaimsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_claimsmanager_v1_QueryClaimsResponse(buffer_arg) {
  return quicksilver_claimsmanager_v1_query_pb.QueryClaimsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Claims returns all zone claims from the current epoch.
claims: {
    path: '/quicksilver.claimsmanager.v1.Query/Claims',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_claimsmanager_v1_query_pb.QueryClaimsRequest,
    responseType: quicksilver_claimsmanager_v1_query_pb.QueryClaimsResponse,
    requestSerialize: serialize_quicksilver_claimsmanager_v1_QueryClaimsRequest,
    requestDeserialize: deserialize_quicksilver_claimsmanager_v1_QueryClaimsRequest,
    responseSerialize: serialize_quicksilver_claimsmanager_v1_QueryClaimsResponse,
    responseDeserialize: deserialize_quicksilver_claimsmanager_v1_QueryClaimsResponse,
  },
  // LastEpochClaims returns all zone claims from the last epoch.
lastEpochClaims: {
    path: '/quicksilver.claimsmanager.v1.Query/LastEpochClaims',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_claimsmanager_v1_query_pb.QueryClaimsRequest,
    responseType: quicksilver_claimsmanager_v1_query_pb.QueryClaimsResponse,
    requestSerialize: serialize_quicksilver_claimsmanager_v1_QueryClaimsRequest,
    requestDeserialize: deserialize_quicksilver_claimsmanager_v1_QueryClaimsRequest,
    responseSerialize: serialize_quicksilver_claimsmanager_v1_QueryClaimsResponse,
    responseDeserialize: deserialize_quicksilver_claimsmanager_v1_QueryClaimsResponse,
  },
  // UserClaims returns all zone claims for a given address from the current epoch.
userClaims: {
    path: '/quicksilver.claimsmanager.v1.Query/UserClaims',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_claimsmanager_v1_query_pb.QueryClaimsRequest,
    responseType: quicksilver_claimsmanager_v1_query_pb.QueryClaimsResponse,
    requestSerialize: serialize_quicksilver_claimsmanager_v1_QueryClaimsRequest,
    requestDeserialize: deserialize_quicksilver_claimsmanager_v1_QueryClaimsRequest,
    responseSerialize: serialize_quicksilver_claimsmanager_v1_QueryClaimsResponse,
    responseDeserialize: deserialize_quicksilver_claimsmanager_v1_QueryClaimsResponse,
  },
  // UserLastEpochClaims returns all zone claims for a given address from the last epoch.
userLastEpochClaims: {
    path: '/quicksilver.claimsmanager.v1.Query/UserLastEpochClaims',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_claimsmanager_v1_query_pb.QueryClaimsRequest,
    responseType: quicksilver_claimsmanager_v1_query_pb.QueryClaimsResponse,
    requestSerialize: serialize_quicksilver_claimsmanager_v1_QueryClaimsRequest,
    requestDeserialize: deserialize_quicksilver_claimsmanager_v1_QueryClaimsRequest,
    responseSerialize: serialize_quicksilver_claimsmanager_v1_QueryClaimsResponse,
    responseDeserialize: deserialize_quicksilver_claimsmanager_v1_QueryClaimsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
