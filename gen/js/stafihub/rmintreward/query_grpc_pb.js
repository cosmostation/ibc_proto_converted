// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rmintreward_query_pb = require('../../stafihub/rmintreward/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var stafihub_rmintreward_params_pb = require('../../stafihub/rmintreward/params_pb.js');
var stafihub_rmintreward_models_pb = require('../../stafihub/rmintreward/models_pb.js');

function serialize_stafihub_stafihub_rmintreward_QueryActCurrentCycleRequest(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryActCurrentCycleRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryActCurrentCycleRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryActCurrentCycleRequest(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryActCurrentCycleRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryActCurrentCycleResponse(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryActCurrentCycleResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryActCurrentCycleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryActCurrentCycleResponse(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryActCurrentCycleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryActDetailRequest(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryActDetailRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryActDetailRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryActDetailRequest(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryActDetailRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryActDetailResponse(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryActDetailResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryActDetailResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryActDetailResponse(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryActDetailResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryActLatestCycleRequest(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryActLatestCycleRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryActLatestCycleRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryActLatestCycleRequest(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryActLatestCycleRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryActLatestCycleResponse(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryActLatestCycleResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryActLatestCycleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryActLatestCycleResponse(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryActLatestCycleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryClaimInfoDetailRequest(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryClaimInfoDetailRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryClaimInfoDetailRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryClaimInfoDetailRequest(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryClaimInfoDetailRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryClaimInfoDetailResponse(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryClaimInfoDetailResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryClaimInfoDetailResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryClaimInfoDetailResponse(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryClaimInfoDetailResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryParamsRequest(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryParamsRequest(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryParamsResponse(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryParamsResponse(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryUserActsRequest(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryUserActsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryUserActsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryUserActsRequest(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryUserActsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryUserActsResponse(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryUserActsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryUserActsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryUserActsResponse(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryUserActsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryUserMintCountRequest(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryUserMintCountRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryUserMintCountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryUserMintCountRequest(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryUserMintCountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rmintreward_QueryUserMintCountResponse(arg) {
  if (!(arg instanceof stafihub_rmintreward_query_pb.QueryUserMintCountResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rmintreward.QueryUserMintCountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rmintreward_QueryUserMintCountResponse(buffer_arg) {
  return stafihub_rmintreward_query_pb.QueryUserMintCountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stafihub.stafihub.rmintreward.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rmintreward_query_pb.QueryParamsRequest,
    responseType: stafihub_rmintreward_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stafihub_stafihub_rmintreward_QueryParamsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryParamsRequest,
    responseSerialize: serialize_stafihub_stafihub_rmintreward_QueryParamsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryParamsResponse,
  },
  // Queries a list of ActLatestCycle items.
actLatestCycle: {
    path: '/stafihub.stafihub.rmintreward.Query/ActLatestCycle',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rmintreward_query_pb.QueryActLatestCycleRequest,
    responseType: stafihub_rmintreward_query_pb.QueryActLatestCycleResponse,
    requestSerialize: serialize_stafihub_stafihub_rmintreward_QueryActLatestCycleRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryActLatestCycleRequest,
    responseSerialize: serialize_stafihub_stafihub_rmintreward_QueryActLatestCycleResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryActLatestCycleResponse,
  },
  // Queries a list of ActDetail items.
actDetail: {
    path: '/stafihub.stafihub.rmintreward.Query/ActDetail',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rmintreward_query_pb.QueryActDetailRequest,
    responseType: stafihub_rmintreward_query_pb.QueryActDetailResponse,
    requestSerialize: serialize_stafihub_stafihub_rmintreward_QueryActDetailRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryActDetailRequest,
    responseSerialize: serialize_stafihub_stafihub_rmintreward_QueryActDetailResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryActDetailResponse,
  },
  // Queries a list of UserMintCount items.
userMintCount: {
    path: '/stafihub.stafihub.rmintreward.Query/UserMintCount',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rmintreward_query_pb.QueryUserMintCountRequest,
    responseType: stafihub_rmintreward_query_pb.QueryUserMintCountResponse,
    requestSerialize: serialize_stafihub_stafihub_rmintreward_QueryUserMintCountRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryUserMintCountRequest,
    responseSerialize: serialize_stafihub_stafihub_rmintreward_QueryUserMintCountResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryUserMintCountResponse,
  },
  // Queries a list of UserActs items.
userActs: {
    path: '/stafihub.stafihub.rmintreward.Query/UserActs',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rmintreward_query_pb.QueryUserActsRequest,
    responseType: stafihub_rmintreward_query_pb.QueryUserActsResponse,
    requestSerialize: serialize_stafihub_stafihub_rmintreward_QueryUserActsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryUserActsRequest,
    responseSerialize: serialize_stafihub_stafihub_rmintreward_QueryUserActsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryUserActsResponse,
  },
  // Queries a list of ActCurrentCycle items.
actCurrentCycle: {
    path: '/stafihub.stafihub.rmintreward.Query/ActCurrentCycle',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rmintreward_query_pb.QueryActCurrentCycleRequest,
    responseType: stafihub_rmintreward_query_pb.QueryActCurrentCycleResponse,
    requestSerialize: serialize_stafihub_stafihub_rmintreward_QueryActCurrentCycleRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryActCurrentCycleRequest,
    responseSerialize: serialize_stafihub_stafihub_rmintreward_QueryActCurrentCycleResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryActCurrentCycleResponse,
  },
  // Queries a list of ClaimInfoDetail items.
claimInfoDetail: {
    path: '/stafihub.stafihub.rmintreward.Query/ClaimInfoDetail',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rmintreward_query_pb.QueryClaimInfoDetailRequest,
    responseType: stafihub_rmintreward_query_pb.QueryClaimInfoDetailResponse,
    requestSerialize: serialize_stafihub_stafihub_rmintreward_QueryClaimInfoDetailRequest,
    requestDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryClaimInfoDetailRequest,
    responseSerialize: serialize_stafihub_stafihub_rmintreward_QueryClaimInfoDetailResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rmintreward_QueryClaimInfoDetailResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
