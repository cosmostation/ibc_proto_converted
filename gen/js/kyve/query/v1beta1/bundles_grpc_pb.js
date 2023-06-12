// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_query_v1beta1_bundles_pb = require('../../../kyve/query/v1beta1/bundles_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kyve_bundles_v1beta1_bundles_pb = require('../../../kyve/bundles/v1beta1/bundles_pb.js');

function serialize_kyve_query_v1beta1_QueryCanProposeRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryCanProposeRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryCanProposeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryCanProposeRequest(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryCanProposeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryCanProposeResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryCanProposeResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryCanProposeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryCanProposeResponse(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryCanProposeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryCanValidateRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryCanValidateRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryCanValidateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryCanValidateRequest(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryCanValidateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryCanValidateResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryCanValidateResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryCanValidateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryCanValidateResponse(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryCanValidateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryCanVoteRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryCanVoteRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryCanVoteRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryCanVoteRequest(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryCanVoteRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryCanVoteResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryCanVoteResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryCanVoteResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryCanVoteResponse(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryCanVoteResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryCurrentVoteStatusRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryCurrentVoteStatusRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryCurrentVoteStatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryCurrentVoteStatusRequest(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryCurrentVoteStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryCurrentVoteStatusResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryCurrentVoteStatusResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryCurrentVoteStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryCurrentVoteStatusResponse(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryCurrentVoteStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryFinalizedBundleRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryFinalizedBundleRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryFinalizedBundleRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryFinalizedBundleRequest(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryFinalizedBundleRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryFinalizedBundleResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryFinalizedBundleResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryFinalizedBundleResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryFinalizedBundleResponse(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryFinalizedBundleResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryFinalizedBundlesByHeightRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesByHeightRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryFinalizedBundlesByHeightRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryFinalizedBundlesByHeightRequest(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesByHeightRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryFinalizedBundlesByHeightResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesByHeightResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryFinalizedBundlesByHeightResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryFinalizedBundlesByHeightResponse(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesByHeightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryFinalizedBundlesRequest(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesRequest)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryFinalizedBundlesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryFinalizedBundlesRequest(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_query_v1beta1_QueryFinalizedBundlesResponse(arg) {
  if (!(arg instanceof kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesResponse)) {
    throw new Error('Expected argument of type kyve.query.v1beta1.QueryFinalizedBundlesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_query_v1beta1_QueryFinalizedBundlesResponse(buffer_arg) {
  return kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// QueryDelegation contains all rpc requests related to direct delegation data
var QueryBundlesService = exports.QueryBundlesService = {
  // FinalizedBundles ...
finalizedBundles: {
    path: '/kyve.query.v1beta1.QueryBundles/FinalizedBundles',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesRequest,
    responseType: kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryFinalizedBundlesRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryFinalizedBundlesRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryFinalizedBundlesResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryFinalizedBundlesResponse,
  },
  // FinalizedBundle ...
finalizedBundle: {
    path: '/kyve.query.v1beta1.QueryBundles/FinalizedBundle',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_bundles_pb.QueryFinalizedBundleRequest,
    responseType: kyve_query_v1beta1_bundles_pb.QueryFinalizedBundleResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryFinalizedBundleRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryFinalizedBundleRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryFinalizedBundleResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryFinalizedBundleResponse,
  },
  // Queries the bundle which contains the data given height
finalizedBundlesByHeight: {
    path: '/kyve.query.v1beta1.QueryBundles/FinalizedBundlesByHeight',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesByHeightRequest,
    responseType: kyve_query_v1beta1_bundles_pb.QueryFinalizedBundlesByHeightResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryFinalizedBundlesByHeightRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryFinalizedBundlesByHeightRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryFinalizedBundlesByHeightResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryFinalizedBundlesByHeightResponse,
  },
  // CurrentVoteStatus ...
currentVoteStatus: {
    path: '/kyve.query.v1beta1.QueryBundles/CurrentVoteStatus',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_bundles_pb.QueryCurrentVoteStatusRequest,
    responseType: kyve_query_v1beta1_bundles_pb.QueryCurrentVoteStatusResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryCurrentVoteStatusRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryCurrentVoteStatusRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryCurrentVoteStatusResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryCurrentVoteStatusResponse,
  },
  // CanValidate ...
canValidate: {
    path: '/kyve.query.v1beta1.QueryBundles/CanValidate',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_bundles_pb.QueryCanValidateRequest,
    responseType: kyve_query_v1beta1_bundles_pb.QueryCanValidateResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryCanValidateRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryCanValidateRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryCanValidateResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryCanValidateResponse,
  },
  // CanPropose ...
canPropose: {
    path: '/kyve.query.v1beta1.QueryBundles/CanPropose',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_bundles_pb.QueryCanProposeRequest,
    responseType: kyve_query_v1beta1_bundles_pb.QueryCanProposeResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryCanProposeRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryCanProposeRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryCanProposeResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryCanProposeResponse,
  },
  // CanVote checks if voter on pool can still vote for the given bundle
canVote: {
    path: '/kyve.query.v1beta1.QueryBundles/CanVote',
    requestStream: false,
    responseStream: false,
    requestType: kyve_query_v1beta1_bundles_pb.QueryCanVoteRequest,
    responseType: kyve_query_v1beta1_bundles_pb.QueryCanVoteResponse,
    requestSerialize: serialize_kyve_query_v1beta1_QueryCanVoteRequest,
    requestDeserialize: deserialize_kyve_query_v1beta1_QueryCanVoteRequest,
    responseSerialize: serialize_kyve_query_v1beta1_QueryCanVoteResponse,
    responseDeserialize: deserialize_kyve_query_v1beta1_QueryCanVoteResponse,
  },
};

exports.QueryBundlesClient = grpc.makeGenericClientConstructor(QueryBundlesService);
