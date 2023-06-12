// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cudos_nft_query_pb = require('../../cudos/nft/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cudos_nft_nft_pb = require('../../cudos/nft/nft_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_cudosnode_cudosnode_nft_QueryApprovalsIsApprovedForAllRequest(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryApprovalsIsApprovedForAllRequest)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryApprovalsIsApprovedForAllRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryApprovalsIsApprovedForAllRequest(buffer_arg) {
  return cudos_nft_query_pb.QueryApprovalsIsApprovedForAllRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryApprovalsIsApprovedForAllResponse(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryApprovalsIsApprovedForAllResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryApprovalsIsApprovedForAllResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryApprovalsIsApprovedForAllResponse(buffer_arg) {
  return cudos_nft_query_pb.QueryApprovalsIsApprovedForAllResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryApprovalsNFTRequest(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryApprovalsNFTRequest)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryApprovalsNFTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryApprovalsNFTRequest(buffer_arg) {
  return cudos_nft_query_pb.QueryApprovalsNFTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryApprovalsNFTResponse(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryApprovalsNFTResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryApprovalsNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryApprovalsNFTResponse(buffer_arg) {
  return cudos_nft_query_pb.QueryApprovalsNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryCollectionByIdsResponse(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryCollectionByIdsResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryCollectionByIdsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryCollectionByIdsResponse(buffer_arg) {
  return cudos_nft_query_pb.QueryCollectionByIdsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryCollectionRequest(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryCollectionRequest)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryCollectionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryCollectionRequest(buffer_arg) {
  return cudos_nft_query_pb.QueryCollectionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryCollectionResponse(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryCollectionResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryCollectionResponse(buffer_arg) {
  return cudos_nft_query_pb.QueryCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryCollectionsByIdsRequest(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryCollectionsByIdsRequest)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryCollectionsByIdsRequest(buffer_arg) {
  return cudos_nft_query_pb.QueryCollectionsByIdsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryDenomByNameRequest(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryDenomByNameRequest)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryDenomByNameRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryDenomByNameRequest(buffer_arg) {
  return cudos_nft_query_pb.QueryDenomByNameRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryDenomByNameResponse(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryDenomByNameResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryDenomByNameResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryDenomByNameResponse(buffer_arg) {
  return cudos_nft_query_pb.QueryDenomByNameResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryDenomBySymbolRequest(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryDenomBySymbolRequest)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryDenomBySymbolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryDenomBySymbolRequest(buffer_arg) {
  return cudos_nft_query_pb.QueryDenomBySymbolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryDenomBySymbolResponse(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryDenomBySymbolResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryDenomBySymbolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryDenomBySymbolResponse(buffer_arg) {
  return cudos_nft_query_pb.QueryDenomBySymbolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryDenomRequest(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryDenomRequest)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryDenomRequest(buffer_arg) {
  return cudos_nft_query_pb.QueryDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryDenomResponse(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryDenomResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryDenomResponse(buffer_arg) {
  return cudos_nft_query_pb.QueryDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryDenomsRequest(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryDenomsRequest)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryDenomsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryDenomsRequest(buffer_arg) {
  return cudos_nft_query_pb.QueryDenomsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryDenomsResponse(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryDenomsResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryDenomsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryDenomsResponse(buffer_arg) {
  return cudos_nft_query_pb.QueryDenomsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryNFTRequest(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryNFTRequest)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryNFTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryNFTRequest(buffer_arg) {
  return cudos_nft_query_pb.QueryNFTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryNFTResponse(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryNFTResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryNFTResponse(buffer_arg) {
  return cudos_nft_query_pb.QueryNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryOwnerRequest(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryOwnerRequest)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryOwnerRequest(buffer_arg) {
  return cudos_nft_query_pb.QueryOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QueryOwnerResponse(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QueryOwnerResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QueryOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QueryOwnerResponse(buffer_arg) {
  return cudos_nft_query_pb.QueryOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QuerySupplyRequest(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QuerySupplyRequest)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QuerySupplyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QuerySupplyRequest(buffer_arg) {
  return cudos_nft_query_pb.QuerySupplyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudosnode_cudosnode_nft_QuerySupplyResponse(arg) {
  if (!(arg instanceof cudos_nft_query_pb.QuerySupplyResponse)) {
    throw new Error('Expected argument of type cudosnode.cudosnode.nft.QuerySupplyResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudosnode_cudosnode_nft_QuerySupplyResponse(buffer_arg) {
  return cudos_nft_query_pb.QuerySupplyResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for NFT module
var QueryService = exports.QueryService = {
  // Supply queries the total supply of a given denom or owner
supply: {
    path: '/cudosnode.cudosnode.nft.Query/Supply',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_query_pb.QuerySupplyRequest,
    responseType: cudos_nft_query_pb.QuerySupplyResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_QuerySupplyRequest,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_QuerySupplyRequest,
    responseSerialize: serialize_cudosnode_cudosnode_nft_QuerySupplyResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_QuerySupplyResponse,
  },
  // Owner queries the NFTs of the specified owner
owner: {
    path: '/cudosnode.cudosnode.nft.Query/Owner',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_query_pb.QueryOwnerRequest,
    responseType: cudos_nft_query_pb.QueryOwnerResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_QueryOwnerRequest,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_QueryOwnerRequest,
    responseSerialize: serialize_cudosnode_cudosnode_nft_QueryOwnerResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_QueryOwnerResponse,
  },
  // Collection queries the NFTs of the specified denom
collection: {
    path: '/cudosnode.cudosnode.nft.Query/Collection',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_query_pb.QueryCollectionRequest,
    responseType: cudos_nft_query_pb.QueryCollectionResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_QueryCollectionRequest,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_QueryCollectionRequest,
    responseSerialize: serialize_cudosnode_cudosnode_nft_QueryCollectionResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_QueryCollectionResponse,
  },
  // Collection queries the NFTs of the specified denom
collectionsByDenomIds: {
    path: '/cudosnode.cudosnode.nft.Query/CollectionsByDenomIds',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_query_pb.QueryCollectionsByIdsRequest,
    responseType: cudos_nft_query_pb.QueryCollectionByIdsResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_QueryCollectionsByIdsRequest,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_QueryCollectionsByIdsRequest,
    responseSerialize: serialize_cudosnode_cudosnode_nft_QueryCollectionByIdsResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_QueryCollectionByIdsResponse,
  },
  // Denom queries the definition of a given denom
denom: {
    path: '/cudosnode.cudosnode.nft.Query/Denom',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_query_pb.QueryDenomRequest,
    responseType: cudos_nft_query_pb.QueryDenomResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_QueryDenomRequest,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_QueryDenomRequest,
    responseSerialize: serialize_cudosnode_cudosnode_nft_QueryDenomResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_QueryDenomResponse,
  },
  // DenomByName queries the definition of a given denom by name
denomByName: {
    path: '/cudosnode.cudosnode.nft.Query/DenomByName',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_query_pb.QueryDenomByNameRequest,
    responseType: cudos_nft_query_pb.QueryDenomByNameResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_QueryDenomByNameRequest,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_QueryDenomByNameRequest,
    responseSerialize: serialize_cudosnode_cudosnode_nft_QueryDenomByNameResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_QueryDenomByNameResponse,
  },
  // DenomByName queries the definition of a given denom by name
denomBySymbol: {
    path: '/cudosnode.cudosnode.nft.Query/DenomBySymbol',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_query_pb.QueryDenomBySymbolRequest,
    responseType: cudos_nft_query_pb.QueryDenomBySymbolResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_QueryDenomBySymbolRequest,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_QueryDenomBySymbolRequest,
    responseSerialize: serialize_cudosnode_cudosnode_nft_QueryDenomBySymbolResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_QueryDenomBySymbolResponse,
  },
  // Denoms queries all the denoms
denoms: {
    path: '/cudosnode.cudosnode.nft.Query/Denoms',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_query_pb.QueryDenomsRequest,
    responseType: cudos_nft_query_pb.QueryDenomsResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_QueryDenomsRequest,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_QueryDenomsRequest,
    responseSerialize: serialize_cudosnode_cudosnode_nft_QueryDenomsResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_QueryDenomsResponse,
  },
  // NFT queries the NFT for the given denom and token ID
nFT: {
    path: '/cudosnode.cudosnode.nft.Query/NFT',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_query_pb.QueryNFTRequest,
    responseType: cudos_nft_query_pb.QueryNFTResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_QueryNFTRequest,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_QueryNFTRequest,
    responseSerialize: serialize_cudosnode_cudosnode_nft_QueryNFTResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_QueryNFTResponse,
  },
  // NFT queries the NFT for the given denom and token ID
getApprovalsNFT: {
    path: '/cudosnode.cudosnode.nft.Query/GetApprovalsNFT',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_query_pb.QueryApprovalsNFTRequest,
    responseType: cudos_nft_query_pb.QueryApprovalsNFTResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_QueryApprovalsNFTRequest,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_QueryApprovalsNFTRequest,
    responseSerialize: serialize_cudosnode_cudosnode_nft_QueryApprovalsNFTResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_QueryApprovalsNFTResponse,
  },
  // NFT queries the NFT for the given denom and token ID
queryApprovalsIsApprovedForAll: {
    path: '/cudosnode.cudosnode.nft.Query/QueryApprovalsIsApprovedForAll',
    requestStream: false,
    responseStream: false,
    requestType: cudos_nft_query_pb.QueryApprovalsIsApprovedForAllRequest,
    responseType: cudos_nft_query_pb.QueryApprovalsIsApprovedForAllResponse,
    requestSerialize: serialize_cudosnode_cudosnode_nft_QueryApprovalsIsApprovedForAllRequest,
    requestDeserialize: deserialize_cudosnode_cudosnode_nft_QueryApprovalsIsApprovedForAllRequest,
    responseSerialize: serialize_cudosnode_cudosnode_nft_QueryApprovalsIsApprovedForAllResponse,
    responseDeserialize: deserialize_cudosnode_cudosnode_nft_QueryApprovalsIsApprovedForAllResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
