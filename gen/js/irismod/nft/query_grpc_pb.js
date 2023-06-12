// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_nft_query_pb = require('../../irismod/nft/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var irismod_nft_nft_pb = require('../../irismod/nft/nft_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_irismod_nft_QueryCollectionRequest(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QueryCollectionRequest)) {
    throw new Error('Expected argument of type irismod.nft.QueryCollectionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QueryCollectionRequest(buffer_arg) {
  return irismod_nft_query_pb.QueryCollectionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_QueryCollectionResponse(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QueryCollectionResponse)) {
    throw new Error('Expected argument of type irismod.nft.QueryCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QueryCollectionResponse(buffer_arg) {
  return irismod_nft_query_pb.QueryCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_QueryDenomRequest(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QueryDenomRequest)) {
    throw new Error('Expected argument of type irismod.nft.QueryDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QueryDenomRequest(buffer_arg) {
  return irismod_nft_query_pb.QueryDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_QueryDenomResponse(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QueryDenomResponse)) {
    throw new Error('Expected argument of type irismod.nft.QueryDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QueryDenomResponse(buffer_arg) {
  return irismod_nft_query_pb.QueryDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_QueryDenomsRequest(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QueryDenomsRequest)) {
    throw new Error('Expected argument of type irismod.nft.QueryDenomsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QueryDenomsRequest(buffer_arg) {
  return irismod_nft_query_pb.QueryDenomsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_QueryDenomsResponse(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QueryDenomsResponse)) {
    throw new Error('Expected argument of type irismod.nft.QueryDenomsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QueryDenomsResponse(buffer_arg) {
  return irismod_nft_query_pb.QueryDenomsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_QueryNFTRequest(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QueryNFTRequest)) {
    throw new Error('Expected argument of type irismod.nft.QueryNFTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QueryNFTRequest(buffer_arg) {
  return irismod_nft_query_pb.QueryNFTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_QueryNFTResponse(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QueryNFTResponse)) {
    throw new Error('Expected argument of type irismod.nft.QueryNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QueryNFTResponse(buffer_arg) {
  return irismod_nft_query_pb.QueryNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_QueryOwnerRequest(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QueryOwnerRequest)) {
    throw new Error('Expected argument of type irismod.nft.QueryOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QueryOwnerRequest(buffer_arg) {
  return irismod_nft_query_pb.QueryOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_QueryOwnerResponse(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QueryOwnerResponse)) {
    throw new Error('Expected argument of type irismod.nft.QueryOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QueryOwnerResponse(buffer_arg) {
  return irismod_nft_query_pb.QueryOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_QuerySupplyRequest(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QuerySupplyRequest)) {
    throw new Error('Expected argument of type irismod.nft.QuerySupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QuerySupplyRequest(buffer_arg) {
  return irismod_nft_query_pb.QuerySupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_nft_QuerySupplyResponse(arg) {
  if (!(arg instanceof irismod_nft_query_pb.QuerySupplyResponse)) {
    throw new Error('Expected argument of type irismod.nft.QuerySupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_nft_QuerySupplyResponse(buffer_arg) {
  return irismod_nft_query_pb.QuerySupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for NFT module
var QueryService = exports.QueryService = {
  // Supply queries the total supply of a given denom or owner
supply: {
    path: '/irismod.nft.Query/Supply',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_query_pb.QuerySupplyRequest,
    responseType: irismod_nft_query_pb.QuerySupplyResponse,
    requestSerialize: serialize_irismod_nft_QuerySupplyRequest,
    requestDeserialize: deserialize_irismod_nft_QuerySupplyRequest,
    responseSerialize: serialize_irismod_nft_QuerySupplyResponse,
    responseDeserialize: deserialize_irismod_nft_QuerySupplyResponse,
  },
  // Owner queries the NFTs of the specified owner
owner: {
    path: '/irismod.nft.Query/Owner',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_query_pb.QueryOwnerRequest,
    responseType: irismod_nft_query_pb.QueryOwnerResponse,
    requestSerialize: serialize_irismod_nft_QueryOwnerRequest,
    requestDeserialize: deserialize_irismod_nft_QueryOwnerRequest,
    responseSerialize: serialize_irismod_nft_QueryOwnerResponse,
    responseDeserialize: deserialize_irismod_nft_QueryOwnerResponse,
  },
  // Collection queries the NFTs of the specified denom
collection: {
    path: '/irismod.nft.Query/Collection',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_query_pb.QueryCollectionRequest,
    responseType: irismod_nft_query_pb.QueryCollectionResponse,
    requestSerialize: serialize_irismod_nft_QueryCollectionRequest,
    requestDeserialize: deserialize_irismod_nft_QueryCollectionRequest,
    responseSerialize: serialize_irismod_nft_QueryCollectionResponse,
    responseDeserialize: deserialize_irismod_nft_QueryCollectionResponse,
  },
  // Denom queries the definition of a given denom
denom: {
    path: '/irismod.nft.Query/Denom',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_query_pb.QueryDenomRequest,
    responseType: irismod_nft_query_pb.QueryDenomResponse,
    requestSerialize: serialize_irismod_nft_QueryDenomRequest,
    requestDeserialize: deserialize_irismod_nft_QueryDenomRequest,
    responseSerialize: serialize_irismod_nft_QueryDenomResponse,
    responseDeserialize: deserialize_irismod_nft_QueryDenomResponse,
  },
  // Denoms queries all the denoms
denoms: {
    path: '/irismod.nft.Query/Denoms',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_query_pb.QueryDenomsRequest,
    responseType: irismod_nft_query_pb.QueryDenomsResponse,
    requestSerialize: serialize_irismod_nft_QueryDenomsRequest,
    requestDeserialize: deserialize_irismod_nft_QueryDenomsRequest,
    responseSerialize: serialize_irismod_nft_QueryDenomsResponse,
    responseDeserialize: deserialize_irismod_nft_QueryDenomsResponse,
  },
  // NFT queries the NFT for the given denom and token ID
nFT: {
    path: '/irismod.nft.Query/NFT',
    requestStream: false,
    responseStream: false,
    requestType: irismod_nft_query_pb.QueryNFTRequest,
    responseType: irismod_nft_query_pb.QueryNFTResponse,
    requestSerialize: serialize_irismod_nft_QueryNFTRequest,
    requestDeserialize: deserialize_irismod_nft_QueryNFTRequest,
    responseSerialize: serialize_irismod_nft_QueryNFTResponse,
    responseDeserialize: deserialize_irismod_nft_QueryNFTResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
