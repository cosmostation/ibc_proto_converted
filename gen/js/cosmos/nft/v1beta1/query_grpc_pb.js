// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_nft_v1beta1_query_pb = require('../../../cosmos/nft/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_nft_v1beta1_nft_pb = require('../../../cosmos/nft/v1beta1/nft_pb.js');

function serialize_cosmos_nft_v1beta1_QueryBalanceRequest(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryBalanceRequest)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryBalanceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryBalanceRequest(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryBalanceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QueryBalanceResponse(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryBalanceResponse)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryBalanceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryBalanceResponse(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryBalanceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QueryClassRequest(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryClassRequest)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryClassRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryClassRequest(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryClassRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QueryClassResponse(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryClassResponse)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryClassResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryClassResponse(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryClassResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QueryClassesRequest(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryClassesRequest)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryClassesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryClassesRequest(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryClassesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QueryClassesResponse(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryClassesResponse)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryClassesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryClassesResponse(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryClassesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QueryNFTRequest(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryNFTRequest)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryNFTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryNFTRequest(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryNFTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QueryNFTResponse(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryNFTResponse)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryNFTResponse(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QueryNFTsRequest(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryNFTsRequest)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryNFTsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryNFTsRequest(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryNFTsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QueryNFTsResponse(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryNFTsResponse)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryNFTsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryNFTsResponse(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryNFTsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QueryOwnerRequest(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryOwnerRequest)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryOwnerRequest(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QueryOwnerResponse(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QueryOwnerResponse)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QueryOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QueryOwnerResponse(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QueryOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QuerySupplyRequest(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QuerySupplyRequest)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QuerySupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QuerySupplyRequest(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QuerySupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_nft_v1beta1_QuerySupplyResponse(arg) {
  if (!(arg instanceof cosmos_nft_v1beta1_query_pb.QuerySupplyResponse)) {
    throw new Error('Expected argument of type cosmos.nft.v1beta1.QuerySupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_nft_v1beta1_QuerySupplyResponse(buffer_arg) {
  return cosmos_nft_v1beta1_query_pb.QuerySupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Balance queries the number of NFTs of a given class owned by the owner, same as balanceOf in ERC721
balance: {
    path: '/cosmos.nft.v1beta1.Query/Balance',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_nft_v1beta1_query_pb.QueryBalanceRequest,
    responseType: cosmos_nft_v1beta1_query_pb.QueryBalanceResponse,
    requestSerialize: serialize_cosmos_nft_v1beta1_QueryBalanceRequest,
    requestDeserialize: deserialize_cosmos_nft_v1beta1_QueryBalanceRequest,
    responseSerialize: serialize_cosmos_nft_v1beta1_QueryBalanceResponse,
    responseDeserialize: deserialize_cosmos_nft_v1beta1_QueryBalanceResponse,
  },
  // Owner queries the owner of the NFT based on its class and id, same as ownerOf in ERC721
owner: {
    path: '/cosmos.nft.v1beta1.Query/Owner',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_nft_v1beta1_query_pb.QueryOwnerRequest,
    responseType: cosmos_nft_v1beta1_query_pb.QueryOwnerResponse,
    requestSerialize: serialize_cosmos_nft_v1beta1_QueryOwnerRequest,
    requestDeserialize: deserialize_cosmos_nft_v1beta1_QueryOwnerRequest,
    responseSerialize: serialize_cosmos_nft_v1beta1_QueryOwnerResponse,
    responseDeserialize: deserialize_cosmos_nft_v1beta1_QueryOwnerResponse,
  },
  // Supply queries the number of NFTs from the given class, same as totalSupply of ERC721.
supply: {
    path: '/cosmos.nft.v1beta1.Query/Supply',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_nft_v1beta1_query_pb.QuerySupplyRequest,
    responseType: cosmos_nft_v1beta1_query_pb.QuerySupplyResponse,
    requestSerialize: serialize_cosmos_nft_v1beta1_QuerySupplyRequest,
    requestDeserialize: deserialize_cosmos_nft_v1beta1_QuerySupplyRequest,
    responseSerialize: serialize_cosmos_nft_v1beta1_QuerySupplyResponse,
    responseDeserialize: deserialize_cosmos_nft_v1beta1_QuerySupplyResponse,
  },
  // NFTs queries all NFTs of a given class or owner,choose at least one of the two, similar to tokenByIndex in
// ERC721Enumerable
nFTs: {
    path: '/cosmos.nft.v1beta1.Query/NFTs',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_nft_v1beta1_query_pb.QueryNFTsRequest,
    responseType: cosmos_nft_v1beta1_query_pb.QueryNFTsResponse,
    requestSerialize: serialize_cosmos_nft_v1beta1_QueryNFTsRequest,
    requestDeserialize: deserialize_cosmos_nft_v1beta1_QueryNFTsRequest,
    responseSerialize: serialize_cosmos_nft_v1beta1_QueryNFTsResponse,
    responseDeserialize: deserialize_cosmos_nft_v1beta1_QueryNFTsResponse,
  },
  // NFT queries an NFT based on its class and id.
nFT: {
    path: '/cosmos.nft.v1beta1.Query/NFT',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_nft_v1beta1_query_pb.QueryNFTRequest,
    responseType: cosmos_nft_v1beta1_query_pb.QueryNFTResponse,
    requestSerialize: serialize_cosmos_nft_v1beta1_QueryNFTRequest,
    requestDeserialize: deserialize_cosmos_nft_v1beta1_QueryNFTRequest,
    responseSerialize: serialize_cosmos_nft_v1beta1_QueryNFTResponse,
    responseDeserialize: deserialize_cosmos_nft_v1beta1_QueryNFTResponse,
  },
  // Class queries an NFT class based on its id
class: {
    path: '/cosmos.nft.v1beta1.Query/Class',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_nft_v1beta1_query_pb.QueryClassRequest,
    responseType: cosmos_nft_v1beta1_query_pb.QueryClassResponse,
    requestSerialize: serialize_cosmos_nft_v1beta1_QueryClassRequest,
    requestDeserialize: deserialize_cosmos_nft_v1beta1_QueryClassRequest,
    responseSerialize: serialize_cosmos_nft_v1beta1_QueryClassResponse,
    responseDeserialize: deserialize_cosmos_nft_v1beta1_QueryClassResponse,
  },
  // Classes queries all NFT classes
classes: {
    path: '/cosmos.nft.v1beta1.Query/Classes',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_nft_v1beta1_query_pb.QueryClassesRequest,
    responseType: cosmos_nft_v1beta1_query_pb.QueryClassesResponse,
    requestSerialize: serialize_cosmos_nft_v1beta1_QueryClassesRequest,
    requestDeserialize: deserialize_cosmos_nft_v1beta1_QueryClassesRequest,
    responseSerialize: serialize_cosmos_nft_v1beta1_QueryClassesResponse,
    responseDeserialize: deserialize_cosmos_nft_v1beta1_QueryClassesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
