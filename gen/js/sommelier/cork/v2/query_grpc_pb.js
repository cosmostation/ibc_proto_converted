// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var sommelier_cork_v2_query_pb = require('../../../sommelier/cork/v2/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var sommelier_cork_v2_genesis_pb = require('../../../sommelier/cork/v2/genesis_pb.js');
var sommelier_cork_v2_cork_pb = require('../../../sommelier/cork/v2/cork_pb.js');

function serialize_cork_v2_QueryCellarIDsRequest(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryCellarIDsRequest)) {
    throw new Error('Expected argument of type cork.v2.QueryCellarIDsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryCellarIDsRequest(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryCellarIDsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryCellarIDsResponse(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryCellarIDsResponse)) {
    throw new Error('Expected argument of type cork.v2.QueryCellarIDsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryCellarIDsResponse(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryCellarIDsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryCorkResultRequest(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryCorkResultRequest)) {
    throw new Error('Expected argument of type cork.v2.QueryCorkResultRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryCorkResultRequest(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryCorkResultRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryCorkResultResponse(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryCorkResultResponse)) {
    throw new Error('Expected argument of type cork.v2.QueryCorkResultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryCorkResultResponse(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryCorkResultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryCorkResultsRequest(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryCorkResultsRequest)) {
    throw new Error('Expected argument of type cork.v2.QueryCorkResultsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryCorkResultsRequest(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryCorkResultsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryCorkResultsResponse(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryCorkResultsResponse)) {
    throw new Error('Expected argument of type cork.v2.QueryCorkResultsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryCorkResultsResponse(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryCorkResultsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryParamsRequest(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type cork.v2.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryParamsRequest(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryParamsResponse(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type cork.v2.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryParamsResponse(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryScheduledBlockHeightsRequest(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryScheduledBlockHeightsRequest)) {
    throw new Error('Expected argument of type cork.v2.QueryScheduledBlockHeightsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryScheduledBlockHeightsRequest(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryScheduledBlockHeightsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryScheduledBlockHeightsResponse(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryScheduledBlockHeightsResponse)) {
    throw new Error('Expected argument of type cork.v2.QueryScheduledBlockHeightsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryScheduledBlockHeightsResponse(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryScheduledBlockHeightsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryScheduledCorksByBlockHeightRequest(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryScheduledCorksByBlockHeightRequest)) {
    throw new Error('Expected argument of type cork.v2.QueryScheduledCorksByBlockHeightRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryScheduledCorksByBlockHeightRequest(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryScheduledCorksByBlockHeightRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryScheduledCorksByBlockHeightResponse(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryScheduledCorksByBlockHeightResponse)) {
    throw new Error('Expected argument of type cork.v2.QueryScheduledCorksByBlockHeightResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryScheduledCorksByBlockHeightResponse(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryScheduledCorksByBlockHeightResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryScheduledCorksByIDRequest(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryScheduledCorksByIDRequest)) {
    throw new Error('Expected argument of type cork.v2.QueryScheduledCorksByIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryScheduledCorksByIDRequest(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryScheduledCorksByIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryScheduledCorksByIDResponse(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryScheduledCorksByIDResponse)) {
    throw new Error('Expected argument of type cork.v2.QueryScheduledCorksByIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryScheduledCorksByIDResponse(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryScheduledCorksByIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryScheduledCorksRequest(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryScheduledCorksRequest)) {
    throw new Error('Expected argument of type cork.v2.QueryScheduledCorksRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryScheduledCorksRequest(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryScheduledCorksRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cork_v2_QueryScheduledCorksResponse(arg) {
  if (!(arg instanceof sommelier_cork_v2_query_pb.QueryScheduledCorksResponse)) {
    throw new Error('Expected argument of type cork.v2.QueryScheduledCorksResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cork_v2_QueryScheduledCorksResponse(buffer_arg) {
  return sommelier_cork_v2_query_pb.QueryScheduledCorksResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC query service for the cork module.
var QueryService = exports.QueryService = {
  // QueryParams queries the allocation module parameters.
queryParams: {
    path: '/cork.v2.Query/QueryParams',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v2_query_pb.QueryParamsRequest,
    responseType: sommelier_cork_v2_query_pb.QueryParamsResponse,
    requestSerialize: serialize_cork_v2_QueryParamsRequest,
    requestDeserialize: deserialize_cork_v2_QueryParamsRequest,
    responseSerialize: serialize_cork_v2_QueryParamsResponse,
    responseDeserialize: deserialize_cork_v2_QueryParamsResponse,
  },
  // QueryCellarIDs returns all cellars and current tick ranges
queryCellarIDs: {
    path: '/cork.v2.Query/QueryCellarIDs',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v2_query_pb.QueryCellarIDsRequest,
    responseType: sommelier_cork_v2_query_pb.QueryCellarIDsResponse,
    requestSerialize: serialize_cork_v2_QueryCellarIDsRequest,
    requestDeserialize: deserialize_cork_v2_QueryCellarIDsRequest,
    responseSerialize: serialize_cork_v2_QueryCellarIDsResponse,
    responseDeserialize: deserialize_cork_v2_QueryCellarIDsResponse,
  },
  // QueryScheduledCorks returns all scheduled corks
queryScheduledCorks: {
    path: '/cork.v2.Query/QueryScheduledCorks',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v2_query_pb.QueryScheduledCorksRequest,
    responseType: sommelier_cork_v2_query_pb.QueryScheduledCorksResponse,
    requestSerialize: serialize_cork_v2_QueryScheduledCorksRequest,
    requestDeserialize: deserialize_cork_v2_QueryScheduledCorksRequest,
    responseSerialize: serialize_cork_v2_QueryScheduledCorksResponse,
    responseDeserialize: deserialize_cork_v2_QueryScheduledCorksResponse,
  },
  // QueryScheduledBlockHeights returns all scheduled block heights
queryScheduledBlockHeights: {
    path: '/cork.v2.Query/QueryScheduledBlockHeights',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v2_query_pb.QueryScheduledBlockHeightsRequest,
    responseType: sommelier_cork_v2_query_pb.QueryScheduledBlockHeightsResponse,
    requestSerialize: serialize_cork_v2_QueryScheduledBlockHeightsRequest,
    requestDeserialize: deserialize_cork_v2_QueryScheduledBlockHeightsRequest,
    responseSerialize: serialize_cork_v2_QueryScheduledBlockHeightsResponse,
    responseDeserialize: deserialize_cork_v2_QueryScheduledBlockHeightsResponse,
  },
  // QueryScheduledCorks returns all scheduled corks at a block height
queryScheduledCorksByBlockHeight: {
    path: '/cork.v2.Query/QueryScheduledCorksByBlockHeight',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v2_query_pb.QueryScheduledCorksByBlockHeightRequest,
    responseType: sommelier_cork_v2_query_pb.QueryScheduledCorksByBlockHeightResponse,
    requestSerialize: serialize_cork_v2_QueryScheduledCorksByBlockHeightRequest,
    requestDeserialize: deserialize_cork_v2_QueryScheduledCorksByBlockHeightRequest,
    responseSerialize: serialize_cork_v2_QueryScheduledCorksByBlockHeightResponse,
    responseDeserialize: deserialize_cork_v2_QueryScheduledCorksByBlockHeightResponse,
  },
  // QueryScheduledCorks returns all scheduled corks with the specified ID
queryScheduledCorksByID: {
    path: '/cork.v2.Query/QueryScheduledCorksByID',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v2_query_pb.QueryScheduledCorksByIDRequest,
    responseType: sommelier_cork_v2_query_pb.QueryScheduledCorksByIDResponse,
    requestSerialize: serialize_cork_v2_QueryScheduledCorksByIDRequest,
    requestDeserialize: deserialize_cork_v2_QueryScheduledCorksByIDRequest,
    responseSerialize: serialize_cork_v2_QueryScheduledCorksByIDResponse,
    responseDeserialize: deserialize_cork_v2_QueryScheduledCorksByIDResponse,
  },
  queryCorkResult: {
    path: '/cork.v2.Query/QueryCorkResult',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v2_query_pb.QueryCorkResultRequest,
    responseType: sommelier_cork_v2_query_pb.QueryCorkResultResponse,
    requestSerialize: serialize_cork_v2_QueryCorkResultRequest,
    requestDeserialize: deserialize_cork_v2_QueryCorkResultRequest,
    responseSerialize: serialize_cork_v2_QueryCorkResultResponse,
    responseDeserialize: deserialize_cork_v2_QueryCorkResultResponse,
  },
  queryCorkResults: {
    path: '/cork.v2.Query/QueryCorkResults',
    requestStream: false,
    responseStream: false,
    requestType: sommelier_cork_v2_query_pb.QueryCorkResultsRequest,
    responseType: sommelier_cork_v2_query_pb.QueryCorkResultsResponse,
    requestSerialize: serialize_cork_v2_QueryCorkResultsRequest,
    requestDeserialize: deserialize_cork_v2_QueryCorkResultsRequest,
    responseSerialize: serialize_cork_v2_QueryCorkResultsResponse,
    responseDeserialize: deserialize_cork_v2_QueryCorkResultsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
