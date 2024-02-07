// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var dymension_streamer_query_pb = require('../../dymension/streamer/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var dymension_streamer_stream_pb = require('../../dymension/streamer/stream_pb.js');

function serialize_dymensionxyz_dymension_streamer_ActiveStreamsRequest(arg) {
  if (!(arg instanceof dymension_streamer_query_pb.ActiveStreamsRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.streamer.ActiveStreamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_streamer_ActiveStreamsRequest(buffer_arg) {
  return dymension_streamer_query_pb.ActiveStreamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_streamer_ActiveStreamsResponse(arg) {
  if (!(arg instanceof dymension_streamer_query_pb.ActiveStreamsResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.streamer.ActiveStreamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_streamer_ActiveStreamsResponse(buffer_arg) {
  return dymension_streamer_query_pb.ActiveStreamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_streamer_ModuleToDistributeCoinsRequest(arg) {
  if (!(arg instanceof dymension_streamer_query_pb.ModuleToDistributeCoinsRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.streamer.ModuleToDistributeCoinsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_streamer_ModuleToDistributeCoinsRequest(buffer_arg) {
  return dymension_streamer_query_pb.ModuleToDistributeCoinsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_streamer_ModuleToDistributeCoinsResponse(arg) {
  if (!(arg instanceof dymension_streamer_query_pb.ModuleToDistributeCoinsResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.streamer.ModuleToDistributeCoinsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_streamer_ModuleToDistributeCoinsResponse(buffer_arg) {
  return dymension_streamer_query_pb.ModuleToDistributeCoinsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_streamer_StreamByIDRequest(arg) {
  if (!(arg instanceof dymension_streamer_query_pb.StreamByIDRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.streamer.StreamByIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_streamer_StreamByIDRequest(buffer_arg) {
  return dymension_streamer_query_pb.StreamByIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_streamer_StreamByIDResponse(arg) {
  if (!(arg instanceof dymension_streamer_query_pb.StreamByIDResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.streamer.StreamByIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_streamer_StreamByIDResponse(buffer_arg) {
  return dymension_streamer_query_pb.StreamByIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_streamer_StreamsRequest(arg) {
  if (!(arg instanceof dymension_streamer_query_pb.StreamsRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.streamer.StreamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_streamer_StreamsRequest(buffer_arg) {
  return dymension_streamer_query_pb.StreamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_streamer_StreamsResponse(arg) {
  if (!(arg instanceof dymension_streamer_query_pb.StreamsResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.streamer.StreamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_streamer_StreamsResponse(buffer_arg) {
  return dymension_streamer_query_pb.StreamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_streamer_UpcomingStreamsRequest(arg) {
  if (!(arg instanceof dymension_streamer_query_pb.UpcomingStreamsRequest)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.streamer.UpcomingStreamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_streamer_UpcomingStreamsRequest(buffer_arg) {
  return dymension_streamer_query_pb.UpcomingStreamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_dymensionxyz_dymension_streamer_UpcomingStreamsResponse(arg) {
  if (!(arg instanceof dymension_streamer_query_pb.UpcomingStreamsResponse)) {
    throw new Error('Expected argument of type dymensionxyz.dymension.streamer.UpcomingStreamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_dymensionxyz_dymension_streamer_UpcomingStreamsResponse(buffer_arg) {
  return dymension_streamer_query_pb.UpcomingStreamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service
var QueryService = exports.QueryService = {
  // ModuleToDistributeCoins returns coins that are going to be distributed
moduleToDistributeCoins: {
    path: '/dymensionxyz.dymension.streamer.Query/ModuleToDistributeCoins',
    requestStream: false,
    responseStream: false,
    requestType: dymension_streamer_query_pb.ModuleToDistributeCoinsRequest,
    responseType: dymension_streamer_query_pb.ModuleToDistributeCoinsResponse,
    requestSerialize: serialize_dymensionxyz_dymension_streamer_ModuleToDistributeCoinsRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_streamer_ModuleToDistributeCoinsRequest,
    responseSerialize: serialize_dymensionxyz_dymension_streamer_ModuleToDistributeCoinsResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_streamer_ModuleToDistributeCoinsResponse,
  },
  // StreamByID returns streams by their respective ID
streamByID: {
    path: '/dymensionxyz.dymension.streamer.Query/StreamByID',
    requestStream: false,
    responseStream: false,
    requestType: dymension_streamer_query_pb.StreamByIDRequest,
    responseType: dymension_streamer_query_pb.StreamByIDResponse,
    requestSerialize: serialize_dymensionxyz_dymension_streamer_StreamByIDRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_streamer_StreamByIDRequest,
    responseSerialize: serialize_dymensionxyz_dymension_streamer_StreamByIDResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_streamer_StreamByIDResponse,
  },
  // Streams returns both upcoming and active streams
streams: {
    path: '/dymensionxyz.dymension.streamer.Query/Streams',
    requestStream: false,
    responseStream: false,
    requestType: dymension_streamer_query_pb.StreamsRequest,
    responseType: dymension_streamer_query_pb.StreamsResponse,
    requestSerialize: serialize_dymensionxyz_dymension_streamer_StreamsRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_streamer_StreamsRequest,
    responseSerialize: serialize_dymensionxyz_dymension_streamer_StreamsResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_streamer_StreamsResponse,
  },
  // ActiveStreams returns active streams
activeStreams: {
    path: '/dymensionxyz.dymension.streamer.Query/ActiveStreams',
    requestStream: false,
    responseStream: false,
    requestType: dymension_streamer_query_pb.ActiveStreamsRequest,
    responseType: dymension_streamer_query_pb.ActiveStreamsResponse,
    requestSerialize: serialize_dymensionxyz_dymension_streamer_ActiveStreamsRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_streamer_ActiveStreamsRequest,
    responseSerialize: serialize_dymensionxyz_dymension_streamer_ActiveStreamsResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_streamer_ActiveStreamsResponse,
  },
  // Returns scheduled streams that have not yet occurred
upcomingStreams: {
    path: '/dymensionxyz.dymension.streamer.Query/UpcomingStreams',
    requestStream: false,
    responseStream: false,
    requestType: dymension_streamer_query_pb.UpcomingStreamsRequest,
    responseType: dymension_streamer_query_pb.UpcomingStreamsResponse,
    requestSerialize: serialize_dymensionxyz_dymension_streamer_UpcomingStreamsRequest,
    requestDeserialize: deserialize_dymensionxyz_dymension_streamer_UpcomingStreamsRequest,
    responseSerialize: serialize_dymensionxyz_dymension_streamer_UpcomingStreamsResponse,
    responseDeserialize: deserialize_dymensionxyz_dymension_streamer_UpcomingStreamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
