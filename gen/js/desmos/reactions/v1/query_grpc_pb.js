// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var desmos_reactions_v1_query_pb = require('../../../desmos/reactions/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var desmos_reactions_v1_models_pb = require('../../../desmos/reactions/v1/models_pb.js');

function serialize_desmos_reactions_v1_QueryReactionRequest(arg) {
  if (!(arg instanceof desmos_reactions_v1_query_pb.QueryReactionRequest)) {
    throw new Error('Expected argument of type desmos.reactions.v1.QueryReactionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_QueryReactionRequest(buffer_arg) {
  return desmos_reactions_v1_query_pb.QueryReactionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_QueryReactionResponse(arg) {
  if (!(arg instanceof desmos_reactions_v1_query_pb.QueryReactionResponse)) {
    throw new Error('Expected argument of type desmos.reactions.v1.QueryReactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_QueryReactionResponse(buffer_arg) {
  return desmos_reactions_v1_query_pb.QueryReactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_QueryReactionsParamsRequest(arg) {
  if (!(arg instanceof desmos_reactions_v1_query_pb.QueryReactionsParamsRequest)) {
    throw new Error('Expected argument of type desmos.reactions.v1.QueryReactionsParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_QueryReactionsParamsRequest(buffer_arg) {
  return desmos_reactions_v1_query_pb.QueryReactionsParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_QueryReactionsParamsResponse(arg) {
  if (!(arg instanceof desmos_reactions_v1_query_pb.QueryReactionsParamsResponse)) {
    throw new Error('Expected argument of type desmos.reactions.v1.QueryReactionsParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_QueryReactionsParamsResponse(buffer_arg) {
  return desmos_reactions_v1_query_pb.QueryReactionsParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_QueryReactionsRequest(arg) {
  if (!(arg instanceof desmos_reactions_v1_query_pb.QueryReactionsRequest)) {
    throw new Error('Expected argument of type desmos.reactions.v1.QueryReactionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_QueryReactionsRequest(buffer_arg) {
  return desmos_reactions_v1_query_pb.QueryReactionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_QueryReactionsResponse(arg) {
  if (!(arg instanceof desmos_reactions_v1_query_pb.QueryReactionsResponse)) {
    throw new Error('Expected argument of type desmos.reactions.v1.QueryReactionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_QueryReactionsResponse(buffer_arg) {
  return desmos_reactions_v1_query_pb.QueryReactionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_QueryRegisteredReactionRequest(arg) {
  if (!(arg instanceof desmos_reactions_v1_query_pb.QueryRegisteredReactionRequest)) {
    throw new Error('Expected argument of type desmos.reactions.v1.QueryRegisteredReactionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_QueryRegisteredReactionRequest(buffer_arg) {
  return desmos_reactions_v1_query_pb.QueryRegisteredReactionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_QueryRegisteredReactionResponse(arg) {
  if (!(arg instanceof desmos_reactions_v1_query_pb.QueryRegisteredReactionResponse)) {
    throw new Error('Expected argument of type desmos.reactions.v1.QueryRegisteredReactionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_QueryRegisteredReactionResponse(buffer_arg) {
  return desmos_reactions_v1_query_pb.QueryRegisteredReactionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_QueryRegisteredReactionsRequest(arg) {
  if (!(arg instanceof desmos_reactions_v1_query_pb.QueryRegisteredReactionsRequest)) {
    throw new Error('Expected argument of type desmos.reactions.v1.QueryRegisteredReactionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_QueryRegisteredReactionsRequest(buffer_arg) {
  return desmos_reactions_v1_query_pb.QueryRegisteredReactionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_reactions_v1_QueryRegisteredReactionsResponse(arg) {
  if (!(arg instanceof desmos_reactions_v1_query_pb.QueryRegisteredReactionsResponse)) {
    throw new Error('Expected argument of type desmos.reactions.v1.QueryRegisteredReactionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_reactions_v1_QueryRegisteredReactionsResponse(buffer_arg) {
  return desmos_reactions_v1_query_pb.QueryRegisteredReactionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Reactions allows to query the reactions for a given post
reactions: {
    path: '/desmos.reactions.v1.Query/Reactions',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reactions_v1_query_pb.QueryReactionsRequest,
    responseType: desmos_reactions_v1_query_pb.QueryReactionsResponse,
    requestSerialize: serialize_desmos_reactions_v1_QueryReactionsRequest,
    requestDeserialize: deserialize_desmos_reactions_v1_QueryReactionsRequest,
    responseSerialize: serialize_desmos_reactions_v1_QueryReactionsResponse,
    responseDeserialize: deserialize_desmos_reactions_v1_QueryReactionsResponse,
  },
  // Reaction allows to query the reaction with the given id
reaction: {
    path: '/desmos.reactions.v1.Query/Reaction',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reactions_v1_query_pb.QueryReactionRequest,
    responseType: desmos_reactions_v1_query_pb.QueryReactionResponse,
    requestSerialize: serialize_desmos_reactions_v1_QueryReactionRequest,
    requestDeserialize: deserialize_desmos_reactions_v1_QueryReactionRequest,
    responseSerialize: serialize_desmos_reactions_v1_QueryReactionResponse,
    responseDeserialize: deserialize_desmos_reactions_v1_QueryReactionResponse,
  },
  // RegisteredReactions allows to query the registered reaction of a subspace
registeredReactions: {
    path: '/desmos.reactions.v1.Query/RegisteredReactions',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reactions_v1_query_pb.QueryRegisteredReactionsRequest,
    responseType: desmos_reactions_v1_query_pb.QueryRegisteredReactionsResponse,
    requestSerialize: serialize_desmos_reactions_v1_QueryRegisteredReactionsRequest,
    requestDeserialize: deserialize_desmos_reactions_v1_QueryRegisteredReactionsRequest,
    responseSerialize: serialize_desmos_reactions_v1_QueryRegisteredReactionsResponse,
    responseDeserialize: deserialize_desmos_reactions_v1_QueryRegisteredReactionsResponse,
  },
  // RegisteredReaction allows to query the registered reaction of a subspace
registeredReaction: {
    path: '/desmos.reactions.v1.Query/RegisteredReaction',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reactions_v1_query_pb.QueryRegisteredReactionRequest,
    responseType: desmos_reactions_v1_query_pb.QueryRegisteredReactionResponse,
    requestSerialize: serialize_desmos_reactions_v1_QueryRegisteredReactionRequest,
    requestDeserialize: deserialize_desmos_reactions_v1_QueryRegisteredReactionRequest,
    responseSerialize: serialize_desmos_reactions_v1_QueryRegisteredReactionResponse,
    responseDeserialize: deserialize_desmos_reactions_v1_QueryRegisteredReactionResponse,
  },
  // ReactionsParams allows to query the reaction params of a subspace
reactionsParams: {
    path: '/desmos.reactions.v1.Query/ReactionsParams',
    requestStream: false,
    responseStream: false,
    requestType: desmos_reactions_v1_query_pb.QueryReactionsParamsRequest,
    responseType: desmos_reactions_v1_query_pb.QueryReactionsParamsResponse,
    requestSerialize: serialize_desmos_reactions_v1_QueryReactionsParamsRequest,
    requestDeserialize: deserialize_desmos_reactions_v1_QueryReactionsParamsRequest,
    responseSerialize: serialize_desmos_reactions_v1_QueryReactionsParamsResponse,
    responseDeserialize: deserialize_desmos_reactions_v1_QueryReactionsParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
