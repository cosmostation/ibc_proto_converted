// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright (c) 2016-2021 Shanghai Bianjie AI Technology Inc. (licensed under the Apache License, Version 2.0)
// Modifications Copyright (c) 2021-present Crypto.org (licensed under the Apache License, Version 2.0)
'use strict';
var grpc = require('grpc');
var cryptoorg_nft_v1_query_pb = require('../../../cryptoorg/nft/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cryptoorg_nft_v1_nft_pb = require('../../../cryptoorg/nft/v1/nft_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_chainmain_nft_v1_QueryCollectionRequest(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryCollectionRequest)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryCollectionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryCollectionRequest(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryCollectionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QueryCollectionResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryCollectionResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryCollectionResponse(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QueryDenomByNameRequest(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryDenomByNameRequest)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryDenomByNameRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryDenomByNameRequest(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryDenomByNameRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QueryDenomByNameResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryDenomByNameResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryDenomByNameResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryDenomByNameResponse(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryDenomByNameResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QueryDenomRequest(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryDenomRequest)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryDenomRequest(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QueryDenomResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryDenomResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryDenomResponse(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QueryDenomsRequest(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryDenomsRequest)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryDenomsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryDenomsRequest(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryDenomsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QueryDenomsResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryDenomsResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryDenomsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryDenomsResponse(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryDenomsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QueryNFTRequest(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryNFTRequest)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryNFTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryNFTRequest(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryNFTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QueryNFTResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryNFTResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryNFTResponse(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QueryOwnerRequest(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryOwnerRequest)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryOwnerRequest(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QueryOwnerResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QueryOwnerResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QueryOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QueryOwnerResponse(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QueryOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QuerySupplyRequest(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QuerySupplyRequest)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QuerySupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QuerySupplyRequest(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QuerySupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chainmain_nft_v1_QuerySupplyResponse(arg) {
  if (!(arg instanceof cryptoorg_nft_v1_query_pb.QuerySupplyResponse)) {
    throw new Error('Expected argument of type chainmain.nft.v1.QuerySupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chainmain_nft_v1_QuerySupplyResponse(buffer_arg) {
  return cryptoorg_nft_v1_query_pb.QuerySupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for NFT module
var QueryService = exports.QueryService = {
  // Supply queries the total supply of a given denom or owner
supply: {
    path: '/chainmain.nft.v1.Query/Supply',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_query_pb.QuerySupplyRequest,
    responseType: cryptoorg_nft_v1_query_pb.QuerySupplyResponse,
    requestSerialize: serialize_chainmain_nft_v1_QuerySupplyRequest,
    requestDeserialize: deserialize_chainmain_nft_v1_QuerySupplyRequest,
    responseSerialize: serialize_chainmain_nft_v1_QuerySupplyResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_QuerySupplyResponse,
  },
  // Owner queries the NFTs of the specified owner
owner: {
    path: '/chainmain.nft.v1.Query/Owner',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_query_pb.QueryOwnerRequest,
    responseType: cryptoorg_nft_v1_query_pb.QueryOwnerResponse,
    requestSerialize: serialize_chainmain_nft_v1_QueryOwnerRequest,
    requestDeserialize: deserialize_chainmain_nft_v1_QueryOwnerRequest,
    responseSerialize: serialize_chainmain_nft_v1_QueryOwnerResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_QueryOwnerResponse,
  },
  // Collection queries the NFTs of the specified denom
collection: {
    path: '/chainmain.nft.v1.Query/Collection',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_query_pb.QueryCollectionRequest,
    responseType: cryptoorg_nft_v1_query_pb.QueryCollectionResponse,
    requestSerialize: serialize_chainmain_nft_v1_QueryCollectionRequest,
    requestDeserialize: deserialize_chainmain_nft_v1_QueryCollectionRequest,
    responseSerialize: serialize_chainmain_nft_v1_QueryCollectionResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_QueryCollectionResponse,
  },
  // Denom queries the definition of a given denom
denom: {
    path: '/chainmain.nft.v1.Query/Denom',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_query_pb.QueryDenomRequest,
    responseType: cryptoorg_nft_v1_query_pb.QueryDenomResponse,
    requestSerialize: serialize_chainmain_nft_v1_QueryDenomRequest,
    requestDeserialize: deserialize_chainmain_nft_v1_QueryDenomRequest,
    responseSerialize: serialize_chainmain_nft_v1_QueryDenomResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_QueryDenomResponse,
  },
  // DenomByName queries the definition of a given denom by name
denomByName: {
    path: '/chainmain.nft.v1.Query/DenomByName',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_query_pb.QueryDenomByNameRequest,
    responseType: cryptoorg_nft_v1_query_pb.QueryDenomByNameResponse,
    requestSerialize: serialize_chainmain_nft_v1_QueryDenomByNameRequest,
    requestDeserialize: deserialize_chainmain_nft_v1_QueryDenomByNameRequest,
    responseSerialize: serialize_chainmain_nft_v1_QueryDenomByNameResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_QueryDenomByNameResponse,
  },
  // Denoms queries all the denoms
denoms: {
    path: '/chainmain.nft.v1.Query/Denoms',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_query_pb.QueryDenomsRequest,
    responseType: cryptoorg_nft_v1_query_pb.QueryDenomsResponse,
    requestSerialize: serialize_chainmain_nft_v1_QueryDenomsRequest,
    requestDeserialize: deserialize_chainmain_nft_v1_QueryDenomsRequest,
    responseSerialize: serialize_chainmain_nft_v1_QueryDenomsResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_QueryDenomsResponse,
  },
  // NFT queries the NFT for the given denom and token ID
nFT: {
    path: '/chainmain.nft.v1.Query/NFT',
    requestStream: false,
    responseStream: false,
    requestType: cryptoorg_nft_v1_query_pb.QueryNFTRequest,
    responseType: cryptoorg_nft_v1_query_pb.QueryNFTResponse,
    requestSerialize: serialize_chainmain_nft_v1_QueryNFTRequest,
    requestDeserialize: deserialize_chainmain_nft_v1_QueryNFTRequest,
    responseSerialize: serialize_chainmain_nft_v1_QueryNFTResponse,
    responseDeserialize: deserialize_chainmain_nft_v1_QueryNFTResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
