// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sommelier_cork_v1_query_pb = require('../../../sommelier/cork/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var sommelier_cork_v1_genesis_pb = require('../../../sommelier/cork/v1/genesis_pb.js');
var sommelier_cork_v1_cork_pb = require('../../../sommelier/cork/v1/cork_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_cork_v1_QueryCellarIDsRequest(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryCellarIDsRequest)) {
    throw new Error('Expected argument of type cork.v1.QueryCellarIDsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryCellarIDsRequest(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryCellarIDsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QueryCellarIDsResponse(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryCellarIDsResponse)) {
    throw new Error('Expected argument of type cork.v1.QueryCellarIDsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryCellarIDsResponse(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryCellarIDsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QueryCommitPeriodRequest(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryCommitPeriodRequest)) {
    throw new Error('Expected argument of type cork.v1.QueryCommitPeriodRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryCommitPeriodRequest(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryCommitPeriodRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QueryCommitPeriodResponse(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryCommitPeriodResponse)) {
    throw new Error('Expected argument of type cork.v1.QueryCommitPeriodResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryCommitPeriodResponse(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryCommitPeriodResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type cork.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryParamsRequest(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type cork.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryParamsResponse(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QueryScheduledBlockHeightsRequest(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryScheduledBlockHeightsRequest)) {
    throw new Error('Expected argument of type cork.v1.QueryScheduledBlockHeightsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryScheduledBlockHeightsRequest(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryScheduledBlockHeightsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QueryScheduledBlockHeightsResponse(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryScheduledBlockHeightsResponse)) {
    throw new Error('Expected argument of type cork.v1.QueryScheduledBlockHeightsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryScheduledBlockHeightsResponse(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryScheduledBlockHeightsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QueryScheduledCorksByBlockHeightRequest(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryScheduledCorksByBlockHeightRequest)) {
    throw new Error('Expected argument of type cork.v1.QueryScheduledCorksByBlockHeightRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryScheduledCorksByBlockHeightRequest(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryScheduledCorksByBlockHeightRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QueryScheduledCorksByBlockHeightResponse(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryScheduledCorksByBlockHeightResponse)) {
    throw new Error('Expected argument of type cork.v1.QueryScheduledCorksByBlockHeightResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryScheduledCorksByBlockHeightResponse(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryScheduledCorksByBlockHeightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QueryScheduledCorksRequest(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryScheduledCorksRequest)) {
    throw new Error('Expected argument of type cork.v1.QueryScheduledCorksRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryScheduledCorksRequest(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryScheduledCorksRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QueryScheduledCorksResponse(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QueryScheduledCorksResponse)) {
    throw new Error('Expected argument of type cork.v1.QueryScheduledCorksResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QueryScheduledCorksResponse(buffer_arg) {
  return sommelier_cork_v1_query_pb.QueryScheduledCorksResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QuerySubmittedCorksRequest(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QuerySubmittedCorksRequest)) {
    throw new Error('Expected argument of type cork.v1.QuerySubmittedCorksRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QuerySubmittedCorksRequest(buffer_arg) {
  return sommelier_cork_v1_query_pb.QuerySubmittedCorksRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v1_QuerySubmittedCorksResponse(arg) {
  if (!(arg instanceof sommelier_cork_v1_query_pb.QuerySubmittedCorksResponse)) {
    throw new Error('Expected argument of type cork.v1.QuerySubmittedCorksResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v1_QuerySubmittedCorksResponse(buffer_arg) {
  return sommelier_cork_v1_query_pb.QuerySubmittedCorksResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC query service for the cork module.
var QueryService = exports.QueryService = {
  // QueryParams queries the allocation module parameters.
queryParams: {
    path: '/cork.v1.Query/QueryParams',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v1_query_pb.QueryParamsRequest,
    responseType: sommelier_cork_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_cork_v1_QueryParamsRequest,
    requestDeserialize: deserialize_cork_v1_QueryParamsRequest,
    responseSerialize: serialize_cork_v1_QueryParamsResponse,
    responseDeserialize: deserialize_cork_v1_QueryParamsResponse,
  },
  // QuerySubmittedCorks queries the submitted corks awaiting vote
querySubmittedCorks: {
    path: '/cork.v1.Query/QuerySubmittedCorks',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v1_query_pb.QuerySubmittedCorksRequest,
    responseType: sommelier_cork_v1_query_pb.QuerySubmittedCorksResponse,
    requestSerialize: serialize_cork_v1_QuerySubmittedCorksRequest,
    requestDeserialize: deserialize_cork_v1_QuerySubmittedCorksRequest,
    responseSerialize: serialize_cork_v1_QuerySubmittedCorksResponse,
    responseDeserialize: deserialize_cork_v1_QuerySubmittedCorksResponse,
  },
  // QueryCommitPeriod queries the heights for the current voting period (current, start and end)
queryCommitPeriod: {
    path: '/cork.v1.Query/QueryCommitPeriod',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v1_query_pb.QueryCommitPeriodRequest,
    responseType: sommelier_cork_v1_query_pb.QueryCommitPeriodResponse,
    requestSerialize: serialize_cork_v1_QueryCommitPeriodRequest,
    requestDeserialize: deserialize_cork_v1_QueryCommitPeriodRequest,
    responseSerialize: serialize_cork_v1_QueryCommitPeriodResponse,
    responseDeserialize: deserialize_cork_v1_QueryCommitPeriodResponse,
  },
  // QueryCellarIDs returns all cellars and current tick ranges
queryCellarIDs: {
    path: '/cork.v1.Query/QueryCellarIDs',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v1_query_pb.QueryCellarIDsRequest,
    responseType: sommelier_cork_v1_query_pb.QueryCellarIDsResponse,
    requestSerialize: serialize_cork_v1_QueryCellarIDsRequest,
    requestDeserialize: deserialize_cork_v1_QueryCellarIDsRequest,
    responseSerialize: serialize_cork_v1_QueryCellarIDsResponse,
    responseDeserialize: deserialize_cork_v1_QueryCellarIDsResponse,
  },
  // QueryScheduledCorks returns all scheduled corks
queryScheduledCorks: {
    path: '/cork.v1.Query/QueryScheduledCorks',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v1_query_pb.QueryScheduledCorksRequest,
    responseType: sommelier_cork_v1_query_pb.QueryScheduledCorksResponse,
    requestSerialize: serialize_cork_v1_QueryScheduledCorksRequest,
    requestDeserialize: deserialize_cork_v1_QueryScheduledCorksRequest,
    responseSerialize: serialize_cork_v1_QueryScheduledCorksResponse,
    responseDeserialize: deserialize_cork_v1_QueryScheduledCorksResponse,
  },
  // QueryScheduledBlockHeights returns all scheduled block heights
queryScheduledBlockHeights: {
    path: '/cork.v1.Query/QueryScheduledBlockHeights',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v1_query_pb.QueryScheduledBlockHeightsRequest,
    responseType: sommelier_cork_v1_query_pb.QueryScheduledBlockHeightsResponse,
    requestSerialize: serialize_cork_v1_QueryScheduledBlockHeightsRequest,
    requestDeserialize: deserialize_cork_v1_QueryScheduledBlockHeightsRequest,
    responseSerialize: serialize_cork_v1_QueryScheduledBlockHeightsResponse,
    responseDeserialize: deserialize_cork_v1_QueryScheduledBlockHeightsResponse,
  },
  // QueryScheduledCorks returns all scheduled corks at a block height
queryScheduledCorksByBlockHeight: {
    path: '/cork.v1.Query/QueryScheduledCorksByBlockHeight',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v1_query_pb.QueryScheduledCorksByBlockHeightRequest,
    responseType: sommelier_cork_v1_query_pb.QueryScheduledCorksByBlockHeightResponse,
    requestSerialize: serialize_cork_v1_QueryScheduledCorksByBlockHeightRequest,
    requestDeserialize: deserialize_cork_v1_QueryScheduledCorksByBlockHeightRequest,
    responseSerialize: serialize_cork_v1_QueryScheduledCorksByBlockHeightResponse,
    responseDeserialize: deserialize_cork_v1_QueryScheduledCorksByBlockHeightResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
