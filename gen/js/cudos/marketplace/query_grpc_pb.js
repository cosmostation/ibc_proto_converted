// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cudos_marketplace_query_pb = require('../../cudos/marketplace/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var cudos_marketplace_params_pb = require('../../cudos/marketplace/params_pb.js');
var cudos_marketplace_collection_pb = require('../../cudos/marketplace/collection_pb.js');
var cudos_marketplace_nft_pb = require('../../cudos/marketplace/nft_pb.js');

function serialize_cudoventures_cudosnode_marketplace_QueryAllCollectionRequest(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryAllCollectionRequest)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryAllCollectionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryAllCollectionRequest(buffer_arg) {
  return cudos_marketplace_query_pb.QueryAllCollectionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryAllCollectionResponse(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryAllCollectionResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryAllCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryAllCollectionResponse(buffer_arg) {
  return cudos_marketplace_query_pb.QueryAllCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryAllNftRequest(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryAllNftRequest)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryAllNftRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryAllNftRequest(buffer_arg) {
  return cudos_marketplace_query_pb.QueryAllNftRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryAllNftResponse(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryAllNftResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryAllNftResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryAllNftResponse(buffer_arg) {
  return cudos_marketplace_query_pb.QueryAllNftResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryCollectionByDenomIdRequest(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryCollectionByDenomIdRequest)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryCollectionByDenomIdRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryCollectionByDenomIdRequest(buffer_arg) {
  return cudos_marketplace_query_pb.QueryCollectionByDenomIdRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryCollectionByDenomIdResponse(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryCollectionByDenomIdResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryCollectionByDenomIdResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryCollectionByDenomIdResponse(buffer_arg) {
  return cudos_marketplace_query_pb.QueryCollectionByDenomIdResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryGetCollectionRequest(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryGetCollectionRequest)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryGetCollectionRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryGetCollectionRequest(buffer_arg) {
  return cudos_marketplace_query_pb.QueryGetCollectionRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryGetCollectionResponse(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryGetCollectionResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryGetCollectionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryGetCollectionResponse(buffer_arg) {
  return cudos_marketplace_query_pb.QueryGetCollectionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryGetNftRequest(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryGetNftRequest)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryGetNftRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryGetNftRequest(buffer_arg) {
  return cudos_marketplace_query_pb.QueryGetNftRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryGetNftResponse(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryGetNftResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryGetNftResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryGetNftResponse(buffer_arg) {
  return cudos_marketplace_query_pb.QueryGetNftResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryListAdminsRequest(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryListAdminsRequest)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryListAdminsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryListAdminsRequest(buffer_arg) {
  return cudos_marketplace_query_pb.QueryListAdminsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryListAdminsResponse(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryListAdminsResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryListAdminsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryListAdminsResponse(buffer_arg) {
  return cudos_marketplace_query_pb.QueryListAdminsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryParamsRequest(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryParamsRequest(buffer_arg) {
  return cudos_marketplace_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cudoventures_cudosnode_marketplace_QueryParamsResponse(arg) {
  if (!(arg instanceof cudos_marketplace_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type cudoventures.cudosnode.marketplace.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cudoventures_cudosnode_marketplace_QueryParamsResponse(buffer_arg) {
  return cudos_marketplace_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/cudoventures.cudosnode.marketplace.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_query_pb.QueryParamsRequest,
    responseType: cudos_marketplace_query_pb.QueryParamsResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_QueryParamsRequest,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryParamsRequest,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_QueryParamsResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryParamsResponse,
  },
  // Queries a Collection for sale by id.
collection: {
    path: '/cudoventures.cudosnode.marketplace.Query/Collection',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_query_pb.QueryGetCollectionRequest,
    responseType: cudos_marketplace_query_pb.QueryGetCollectionResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_QueryGetCollectionRequest,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryGetCollectionRequest,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_QueryGetCollectionResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryGetCollectionResponse,
  },
  // Queries all Collection items for sale.
collectionAll: {
    path: '/cudoventures.cudosnode.marketplace.Query/CollectionAll',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_query_pb.QueryAllCollectionRequest,
    responseType: cudos_marketplace_query_pb.QueryAllCollectionResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_QueryAllCollectionRequest,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryAllCollectionRequest,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_QueryAllCollectionResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryAllCollectionResponse,
  },
  // Queries a Nft for sale by id.
nft: {
    path: '/cudoventures.cudosnode.marketplace.Query/Nft',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_query_pb.QueryGetNftRequest,
    responseType: cudos_marketplace_query_pb.QueryGetNftResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_QueryGetNftRequest,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryGetNftRequest,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_QueryGetNftResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryGetNftResponse,
  },
  // Queries all Nft items for sale.
nftAll: {
    path: '/cudoventures.cudosnode.marketplace.Query/NftAll',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_query_pb.QueryAllNftRequest,
    responseType: cudos_marketplace_query_pb.QueryAllNftResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_QueryAllNftRequest,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryAllNftRequest,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_QueryAllNftResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryAllNftResponse,
  },
  // Queries a list of CollectionByDenomId items.
collectionByDenomId: {
    path: '/cudoventures.cudosnode.marketplace.Query/CollectionByDenomId',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_query_pb.QueryCollectionByDenomIdRequest,
    responseType: cudos_marketplace_query_pb.QueryCollectionByDenomIdResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_QueryCollectionByDenomIdRequest,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryCollectionByDenomIdRequest,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_QueryCollectionByDenomIdResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryCollectionByDenomIdResponse,
  },
  // Queries a list of ListAdmins items.
listAdmins: {
    path: '/cudoventures.cudosnode.marketplace.Query/ListAdmins',
    requestStream: false,
    responseStream: false,
    requestType: cudos_marketplace_query_pb.QueryListAdminsRequest,
    responseType: cudos_marketplace_query_pb.QueryListAdminsResponse,
    requestSerialize: serialize_cudoventures_cudosnode_marketplace_QueryListAdminsRequest,
    requestDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryListAdminsRequest,
    responseSerialize: serialize_cudoventures_cudosnode_marketplace_QueryListAdminsResponse,
    responseDeserialize: deserialize_cudoventures_cudosnode_marketplace_QueryListAdminsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
