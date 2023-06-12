// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ixo_claims_v1beta1_query_pb = require('../../../ixo/claims/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var ixo_claims_v1beta1_claims_pb = require('../../../ixo/claims/v1beta1/claims_pb.js');

function serialize_ixo_claims_v1beta1_QueryClaimListRequest(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryClaimListRequest)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryClaimListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryClaimListRequest(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryClaimListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryClaimListResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryClaimListResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryClaimListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryClaimListResponse(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryClaimListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryClaimRequest(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryClaimRequest)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryClaimRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryClaimRequest(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryClaimRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryClaimResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryClaimResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryClaimResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryClaimResponse(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryClaimResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryCollectionListRequest(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryCollectionListRequest)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryCollectionListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryCollectionListRequest(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryCollectionListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryCollectionListResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryCollectionListResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryCollectionListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryCollectionListResponse(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryCollectionListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryCollectionRequest(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryCollectionRequest)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryCollectionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryCollectionRequest(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryCollectionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryCollectionResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryCollectionResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryCollectionResponse(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryDisputeListRequest(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryDisputeListRequest)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryDisputeListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryDisputeListRequest(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryDisputeListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryDisputeListResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryDisputeListResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryDisputeListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryDisputeListResponse(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryDisputeListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryDisputeRequest(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryDisputeRequest)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryDisputeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryDisputeRequest(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryDisputeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryDisputeResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryDisputeResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryDisputeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryDisputeResponse(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryDisputeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryParamsRequest(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ixo_claims_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof ixo_claims_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type ixo.claims.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ixo_claims_v1beta1_QueryParamsResponse(buffer_arg) {
  return ixo_claims_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/ixo.claims.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_query_pb.QueryParamsRequest,
    responseType: ixo_claims_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_ixo_claims_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_ixo_claims_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_QueryParamsResponse,
  },
  collection: {
    path: '/ixo.claims.v1beta1.Query/Collection',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_query_pb.QueryCollectionRequest,
    responseType: ixo_claims_v1beta1_query_pb.QueryCollectionResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_QueryCollectionRequest,
    requestDeserialize: deserialize_ixo_claims_v1beta1_QueryCollectionRequest,
    responseSerialize: serialize_ixo_claims_v1beta1_QueryCollectionResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_QueryCollectionResponse,
  },
  collectionList: {
    path: '/ixo.claims.v1beta1.Query/CollectionList',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_query_pb.QueryCollectionListRequest,
    responseType: ixo_claims_v1beta1_query_pb.QueryCollectionListResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_QueryCollectionListRequest,
    requestDeserialize: deserialize_ixo_claims_v1beta1_QueryCollectionListRequest,
    responseSerialize: serialize_ixo_claims_v1beta1_QueryCollectionListResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_QueryCollectionListResponse,
  },
  claim: {
    path: '/ixo.claims.v1beta1.Query/Claim',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_query_pb.QueryClaimRequest,
    responseType: ixo_claims_v1beta1_query_pb.QueryClaimResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_QueryClaimRequest,
    requestDeserialize: deserialize_ixo_claims_v1beta1_QueryClaimRequest,
    responseSerialize: serialize_ixo_claims_v1beta1_QueryClaimResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_QueryClaimResponse,
  },
  claimList: {
    path: '/ixo.claims.v1beta1.Query/ClaimList',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_query_pb.QueryClaimListRequest,
    responseType: ixo_claims_v1beta1_query_pb.QueryClaimListResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_QueryClaimListRequest,
    requestDeserialize: deserialize_ixo_claims_v1beta1_QueryClaimListRequest,
    responseSerialize: serialize_ixo_claims_v1beta1_QueryClaimListResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_QueryClaimListResponse,
  },
  dispute: {
    path: '/ixo.claims.v1beta1.Query/Dispute',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_query_pb.QueryDisputeRequest,
    responseType: ixo_claims_v1beta1_query_pb.QueryDisputeResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_QueryDisputeRequest,
    requestDeserialize: deserialize_ixo_claims_v1beta1_QueryDisputeRequest,
    responseSerialize: serialize_ixo_claims_v1beta1_QueryDisputeResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_QueryDisputeResponse,
  },
  disputeList: {
    path: '/ixo.claims.v1beta1.Query/DisputeList',
    requestStream: false,
    responseStream: false,
    requestType: ixo_claims_v1beta1_query_pb.QueryDisputeListRequest,
    responseType: ixo_claims_v1beta1_query_pb.QueryDisputeListResponse,
    requestSerialize: serialize_ixo_claims_v1beta1_QueryDisputeListRequest,
    requestDeserialize: deserialize_ixo_claims_v1beta1_QueryDisputeListRequest,
    responseSerialize: serialize_ixo_claims_v1beta1_QueryDisputeListResponse,
    responseDeserialize: deserialize_ixo_claims_v1beta1_QueryDisputeListResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
