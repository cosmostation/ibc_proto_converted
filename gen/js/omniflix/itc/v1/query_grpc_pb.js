// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var OmniFlix_itc_v1_query_pb = require('../../../OmniFlix/itc/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var OmniFlix_itc_v1_params_pb = require('../../../OmniFlix/itc/v1/params_pb.js');
var OmniFlix_itc_v1_itc_pb = require('../../../OmniFlix/itc/v1/itc_pb.js');

function serialize_OmniFlix_itc_v1_QueryCampaignRequest(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_query_pb.QueryCampaignRequest)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.QueryCampaignRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_QueryCampaignRequest(buffer_arg) {
  return OmniFlix_itc_v1_query_pb.QueryCampaignRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_QueryCampaignResponse(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_query_pb.QueryCampaignResponse)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.QueryCampaignResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_QueryCampaignResponse(buffer_arg) {
  return OmniFlix_itc_v1_query_pb.QueryCampaignResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_QueryCampaignsRequest(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_query_pb.QueryCampaignsRequest)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.QueryCampaignsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_QueryCampaignsRequest(buffer_arg) {
  return OmniFlix_itc_v1_query_pb.QueryCampaignsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_QueryCampaignsResponse(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_query_pb.QueryCampaignsResponse)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.QueryCampaignsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_QueryCampaignsResponse(buffer_arg) {
  return OmniFlix_itc_v1_query_pb.QueryCampaignsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_QueryClaimsRequest(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_query_pb.QueryClaimsRequest)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.QueryClaimsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_QueryClaimsRequest(buffer_arg) {
  return OmniFlix_itc_v1_query_pb.QueryClaimsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_QueryClaimsResponse(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_query_pb.QueryClaimsResponse)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.QueryClaimsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_QueryClaimsResponse(buffer_arg) {
  return OmniFlix_itc_v1_query_pb.QueryClaimsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_QueryParamsRequest(buffer_arg) {
  return OmniFlix_itc_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OmniFlix_itc_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof OmniFlix_itc_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type OmniFlix.itc.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OmniFlix_itc_v1_QueryParamsResponse(buffer_arg) {
  return OmniFlix_itc_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  params: {
    path: '/OmniFlix.itc.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_itc_v1_query_pb.QueryParamsRequest,
    responseType: OmniFlix_itc_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_OmniFlix_itc_v1_QueryParamsRequest,
    requestDeserialize: deserialize_OmniFlix_itc_v1_QueryParamsRequest,
    responseSerialize: serialize_OmniFlix_itc_v1_QueryParamsResponse,
    responseDeserialize: deserialize_OmniFlix_itc_v1_QueryParamsResponse,
  },
  campaigns: {
    path: '/OmniFlix.itc.v1.Query/Campaigns',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_itc_v1_query_pb.QueryCampaignsRequest,
    responseType: OmniFlix_itc_v1_query_pb.QueryCampaignsResponse,
    requestSerialize: serialize_OmniFlix_itc_v1_QueryCampaignsRequest,
    requestDeserialize: deserialize_OmniFlix_itc_v1_QueryCampaignsRequest,
    responseSerialize: serialize_OmniFlix_itc_v1_QueryCampaignsResponse,
    responseDeserialize: deserialize_OmniFlix_itc_v1_QueryCampaignsResponse,
  },
  campaign: {
    path: '/OmniFlix.itc.v1.Query/Campaign',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_itc_v1_query_pb.QueryCampaignRequest,
    responseType: OmniFlix_itc_v1_query_pb.QueryCampaignResponse,
    requestSerialize: serialize_OmniFlix_itc_v1_QueryCampaignRequest,
    requestDeserialize: deserialize_OmniFlix_itc_v1_QueryCampaignRequest,
    responseSerialize: serialize_OmniFlix_itc_v1_QueryCampaignResponse,
    responseDeserialize: deserialize_OmniFlix_itc_v1_QueryCampaignResponse,
  },
  claims: {
    path: '/OmniFlix.itc.v1.Query/Claims',
    requestStream: false,
    responseStream: false,
    requestType: OmniFlix_itc_v1_query_pb.QueryClaimsRequest,
    responseType: OmniFlix_itc_v1_query_pb.QueryClaimsResponse,
    requestSerialize: serialize_OmniFlix_itc_v1_QueryClaimsRequest,
    requestDeserialize: deserialize_OmniFlix_itc_v1_QueryClaimsRequest,
    responseSerialize: serialize_OmniFlix_itc_v1_QueryClaimsResponse,
    responseDeserialize: deserialize_OmniFlix_itc_v1_QueryClaimsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
