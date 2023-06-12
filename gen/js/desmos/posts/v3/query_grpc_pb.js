// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var desmos_posts_v3_query_pb = require('../../../desmos/posts/v3/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var desmos_posts_v3_models_pb = require('../../../desmos/posts/v3/models_pb.js');

function serialize_desmos_posts_v3_QueryParamsRequest(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type desmos.posts.v3.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QueryParamsRequest(buffer_arg) {
  return desmos_posts_v3_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_QueryParamsResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QueryParamsResponse(buffer_arg) {
  return desmos_posts_v3_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_QueryPollAnswersRequest(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QueryPollAnswersRequest)) {
    throw new Error('Expected argument of type desmos.posts.v3.QueryPollAnswersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QueryPollAnswersRequest(buffer_arg) {
  return desmos_posts_v3_query_pb.QueryPollAnswersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_QueryPollAnswersResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QueryPollAnswersResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.QueryPollAnswersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QueryPollAnswersResponse(buffer_arg) {
  return desmos_posts_v3_query_pb.QueryPollAnswersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_QueryPostAttachmentsRequest(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QueryPostAttachmentsRequest)) {
    throw new Error('Expected argument of type desmos.posts.v3.QueryPostAttachmentsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QueryPostAttachmentsRequest(buffer_arg) {
  return desmos_posts_v3_query_pb.QueryPostAttachmentsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_QueryPostAttachmentsResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QueryPostAttachmentsResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.QueryPostAttachmentsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QueryPostAttachmentsResponse(buffer_arg) {
  return desmos_posts_v3_query_pb.QueryPostAttachmentsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_QueryPostRequest(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QueryPostRequest)) {
    throw new Error('Expected argument of type desmos.posts.v3.QueryPostRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QueryPostRequest(buffer_arg) {
  return desmos_posts_v3_query_pb.QueryPostRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_QueryPostResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QueryPostResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.QueryPostResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QueryPostResponse(buffer_arg) {
  return desmos_posts_v3_query_pb.QueryPostResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_QuerySectionPostsRequest(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QuerySectionPostsRequest)) {
    throw new Error('Expected argument of type desmos.posts.v3.QuerySectionPostsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QuerySectionPostsRequest(buffer_arg) {
  return desmos_posts_v3_query_pb.QuerySectionPostsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_QuerySectionPostsResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QuerySectionPostsResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.QuerySectionPostsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QuerySectionPostsResponse(buffer_arg) {
  return desmos_posts_v3_query_pb.QuerySectionPostsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_QuerySubspacePostsRequest(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QuerySubspacePostsRequest)) {
    throw new Error('Expected argument of type desmos.posts.v3.QuerySubspacePostsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QuerySubspacePostsRequest(buffer_arg) {
  return desmos_posts_v3_query_pb.QuerySubspacePostsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_posts_v3_QuerySubspacePostsResponse(arg) {
  if (!(arg instanceof desmos_posts_v3_query_pb.QuerySubspacePostsResponse)) {
    throw new Error('Expected argument of type desmos.posts.v3.QuerySubspacePostsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_posts_v3_QuerySubspacePostsResponse(buffer_arg) {
  return desmos_posts_v3_query_pb.QuerySubspacePostsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // SubspacePosts queries all the posts inside a given subspace
subspacePosts: {
    path: '/desmos.posts.v3.Query/SubspacePosts',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_query_pb.QuerySubspacePostsRequest,
    responseType: desmos_posts_v3_query_pb.QuerySubspacePostsResponse,
    requestSerialize: serialize_desmos_posts_v3_QuerySubspacePostsRequest,
    requestDeserialize: deserialize_desmos_posts_v3_QuerySubspacePostsRequest,
    responseSerialize: serialize_desmos_posts_v3_QuerySubspacePostsResponse,
    responseDeserialize: deserialize_desmos_posts_v3_QuerySubspacePostsResponse,
  },
  // SectionPosts queries all the posts inside a given section
sectionPosts: {
    path: '/desmos.posts.v3.Query/SectionPosts',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_query_pb.QuerySectionPostsRequest,
    responseType: desmos_posts_v3_query_pb.QuerySectionPostsResponse,
    requestSerialize: serialize_desmos_posts_v3_QuerySectionPostsRequest,
    requestDeserialize: deserialize_desmos_posts_v3_QuerySectionPostsRequest,
    responseSerialize: serialize_desmos_posts_v3_QuerySectionPostsResponse,
    responseDeserialize: deserialize_desmos_posts_v3_QuerySectionPostsResponse,
  },
  // Post queries for a single post inside a given subspace
post: {
    path: '/desmos.posts.v3.Query/Post',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_query_pb.QueryPostRequest,
    responseType: desmos_posts_v3_query_pb.QueryPostResponse,
    requestSerialize: serialize_desmos_posts_v3_QueryPostRequest,
    requestDeserialize: deserialize_desmos_posts_v3_QueryPostRequest,
    responseSerialize: serialize_desmos_posts_v3_QueryPostResponse,
    responseDeserialize: deserialize_desmos_posts_v3_QueryPostResponse,
  },
  // PostAttachments queries the attachments of the post having the given id
postAttachments: {
    path: '/desmos.posts.v3.Query/PostAttachments',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_query_pb.QueryPostAttachmentsRequest,
    responseType: desmos_posts_v3_query_pb.QueryPostAttachmentsResponse,
    requestSerialize: serialize_desmos_posts_v3_QueryPostAttachmentsRequest,
    requestDeserialize: deserialize_desmos_posts_v3_QueryPostAttachmentsRequest,
    responseSerialize: serialize_desmos_posts_v3_QueryPostAttachmentsResponse,
    responseDeserialize: deserialize_desmos_posts_v3_QueryPostAttachmentsResponse,
  },
  // PollAnswers queries the answers for the poll having the given id
pollAnswers: {
    path: '/desmos.posts.v3.Query/PollAnswers',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_query_pb.QueryPollAnswersRequest,
    responseType: desmos_posts_v3_query_pb.QueryPollAnswersResponse,
    requestSerialize: serialize_desmos_posts_v3_QueryPollAnswersRequest,
    requestDeserialize: deserialize_desmos_posts_v3_QueryPollAnswersRequest,
    responseSerialize: serialize_desmos_posts_v3_QueryPollAnswersResponse,
    responseDeserialize: deserialize_desmos_posts_v3_QueryPollAnswersResponse,
  },
  // Params queries the module parameters
params: {
    path: '/desmos.posts.v3.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: desmos_posts_v3_query_pb.QueryParamsRequest,
    responseType: desmos_posts_v3_query_pb.QueryParamsResponse,
    requestSerialize: serialize_desmos_posts_v3_QueryParamsRequest,
    requestDeserialize: deserialize_desmos_posts_v3_QueryParamsRequest,
    responseSerialize: serialize_desmos_posts_v3_QueryParamsResponse,
    responseDeserialize: deserialize_desmos_posts_v3_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
