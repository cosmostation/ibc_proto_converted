// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_marker_v1_query_pb = require('../../../provenance/marker/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_bank_v1beta1_bank_pb = require('../../../cosmos/bank/v1beta1/bank_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var provenance_marker_v1_marker_pb = require('../../../provenance/marker/v1/marker_pb.js');
var provenance_marker_v1_accessgrant_pb = require('../../../provenance/marker/v1/accessgrant_pb.js');

function serialize_provenance_marker_v1_QueryAccessRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryAccessRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryAccessRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryAccessRequest(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryAccessRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryAccessResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryAccessResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryAccessResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryAccessResponse(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryAccessResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryAccountDataRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryAccountDataRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryAccountDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryAccountDataRequest(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryAccountDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryAccountDataResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryAccountDataResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryAccountDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryAccountDataResponse(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryAccountDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryAllMarkersRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryAllMarkersRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryAllMarkersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryAllMarkersRequest(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryAllMarkersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryAllMarkersResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryAllMarkersResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryAllMarkersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryAllMarkersResponse(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryAllMarkersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryDenomMetadataRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryDenomMetadataRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryDenomMetadataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryDenomMetadataRequest(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryDenomMetadataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryDenomMetadataResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryDenomMetadataResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryDenomMetadataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryDenomMetadataResponse(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryDenomMetadataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryEscrowRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryEscrowRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryEscrowRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryEscrowRequest(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryEscrowRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryEscrowResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryEscrowResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryEscrowResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryEscrowResponse(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryEscrowResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryHoldingRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryHoldingRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryHoldingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryHoldingRequest(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryHoldingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryHoldingResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryHoldingResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryHoldingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryHoldingResponse(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryHoldingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryMarkerRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryMarkerRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryMarkerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryMarkerRequest(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryMarkerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryMarkerResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryMarkerResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryMarkerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryMarkerResponse(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryMarkerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryParamsRequest(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QueryParamsResponse(buffer_arg) {
  return provenance_marker_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QuerySupplyRequest(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QuerySupplyRequest)) {
    throw new Error('Expected argument of type provenance.marker.v1.QuerySupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QuerySupplyRequest(buffer_arg) {
  return provenance_marker_v1_query_pb.QuerySupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_marker_v1_QuerySupplyResponse(arg) {
  if (!(arg instanceof provenance_marker_v1_query_pb.QuerySupplyResponse)) {
    throw new Error('Expected argument of type provenance.marker.v1.QuerySupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_marker_v1_QuerySupplyResponse(buffer_arg) {
  return provenance_marker_v1_query_pb.QuerySupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for marker module.
var QueryService = exports.QueryService = {
  // Params queries the parameters of x/bank module.
params: {
    path: '/provenance.marker.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_query_pb.QueryParamsRequest,
    responseType: provenance_marker_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_provenance_marker_v1_QueryParamsRequest,
    requestDeserialize: deserialize_provenance_marker_v1_QueryParamsRequest,
    responseSerialize: serialize_provenance_marker_v1_QueryParamsResponse,
    responseDeserialize: deserialize_provenance_marker_v1_QueryParamsResponse,
  },
  // Returns a list of all markers on the blockchain
allMarkers: {
    path: '/provenance.marker.v1.Query/AllMarkers',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_query_pb.QueryAllMarkersRequest,
    responseType: provenance_marker_v1_query_pb.QueryAllMarkersResponse,
    requestSerialize: serialize_provenance_marker_v1_QueryAllMarkersRequest,
    requestDeserialize: deserialize_provenance_marker_v1_QueryAllMarkersRequest,
    responseSerialize: serialize_provenance_marker_v1_QueryAllMarkersResponse,
    responseDeserialize: deserialize_provenance_marker_v1_QueryAllMarkersResponse,
  },
  // query for a single marker by denom or address
marker: {
    path: '/provenance.marker.v1.Query/Marker',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_query_pb.QueryMarkerRequest,
    responseType: provenance_marker_v1_query_pb.QueryMarkerResponse,
    requestSerialize: serialize_provenance_marker_v1_QueryMarkerRequest,
    requestDeserialize: deserialize_provenance_marker_v1_QueryMarkerRequest,
    responseSerialize: serialize_provenance_marker_v1_QueryMarkerResponse,
    responseDeserialize: deserialize_provenance_marker_v1_QueryMarkerResponse,
  },
  // query for all accounts holding the given marker coins
holding: {
    path: '/provenance.marker.v1.Query/Holding',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_query_pb.QueryHoldingRequest,
    responseType: provenance_marker_v1_query_pb.QueryHoldingResponse,
    requestSerialize: serialize_provenance_marker_v1_QueryHoldingRequest,
    requestDeserialize: deserialize_provenance_marker_v1_QueryHoldingRequest,
    responseSerialize: serialize_provenance_marker_v1_QueryHoldingResponse,
    responseDeserialize: deserialize_provenance_marker_v1_QueryHoldingResponse,
  },
  // query for supply of coin on a marker account
supply: {
    path: '/provenance.marker.v1.Query/Supply',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_query_pb.QuerySupplyRequest,
    responseType: provenance_marker_v1_query_pb.QuerySupplyResponse,
    requestSerialize: serialize_provenance_marker_v1_QuerySupplyRequest,
    requestDeserialize: deserialize_provenance_marker_v1_QuerySupplyRequest,
    responseSerialize: serialize_provenance_marker_v1_QuerySupplyResponse,
    responseDeserialize: deserialize_provenance_marker_v1_QuerySupplyResponse,
  },
  // query for coins on a marker account
escrow: {
    path: '/provenance.marker.v1.Query/Escrow',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_query_pb.QueryEscrowRequest,
    responseType: provenance_marker_v1_query_pb.QueryEscrowResponse,
    requestSerialize: serialize_provenance_marker_v1_QueryEscrowRequest,
    requestDeserialize: deserialize_provenance_marker_v1_QueryEscrowRequest,
    responseSerialize: serialize_provenance_marker_v1_QueryEscrowResponse,
    responseDeserialize: deserialize_provenance_marker_v1_QueryEscrowResponse,
  },
  // query for access records on an account
access: {
    path: '/provenance.marker.v1.Query/Access',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_query_pb.QueryAccessRequest,
    responseType: provenance_marker_v1_query_pb.QueryAccessResponse,
    requestSerialize: serialize_provenance_marker_v1_QueryAccessRequest,
    requestDeserialize: deserialize_provenance_marker_v1_QueryAccessRequest,
    responseSerialize: serialize_provenance_marker_v1_QueryAccessResponse,
    responseDeserialize: deserialize_provenance_marker_v1_QueryAccessResponse,
  },
  // query for access records on an account
denomMetadata: {
    path: '/provenance.marker.v1.Query/DenomMetadata',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_query_pb.QueryDenomMetadataRequest,
    responseType: provenance_marker_v1_query_pb.QueryDenomMetadataResponse,
    requestSerialize: serialize_provenance_marker_v1_QueryDenomMetadataRequest,
    requestDeserialize: deserialize_provenance_marker_v1_QueryDenomMetadataRequest,
    responseSerialize: serialize_provenance_marker_v1_QueryDenomMetadataResponse,
    responseDeserialize: deserialize_provenance_marker_v1_QueryDenomMetadataResponse,
  },
  // query for account data associated with a denom
accountData: {
    path: '/provenance.marker.v1.Query/AccountData',
    requestStream: false,
    responseStream: false,
    requestType: provenance_marker_v1_query_pb.QueryAccountDataRequest,
    responseType: provenance_marker_v1_query_pb.QueryAccountDataResponse,
    requestSerialize: serialize_provenance_marker_v1_QueryAccountDataRequest,
    requestDeserialize: deserialize_provenance_marker_v1_QueryAccountDataRequest,
    responseSerialize: serialize_provenance_marker_v1_QueryAccountDataResponse,
    responseDeserialize: deserialize_provenance_marker_v1_QueryAccountDataResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
