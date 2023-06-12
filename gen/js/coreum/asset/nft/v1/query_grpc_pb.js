// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var coreum_asset_nft_v1_query_pb = require('../../../../coreum/asset/nft/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var coreum_asset_nft_v1_nft_pb = require('../../../../coreum/asset/nft/v1/nft_pb.js');
var coreum_asset_nft_v1_params_pb = require('../../../../coreum/asset/nft/v1/params_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../../cosmos/base/query/v1beta1/pagination_pb.js');

function serialize_coreum_asset_nft_v1_QueryClassRequest(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryClassRequest)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryClassRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryClassRequest(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryClassRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_QueryClassResponse(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryClassResponse)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryClassResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryClassResponse(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryClassResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_QueryClassesRequest(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryClassesRequest)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryClassesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryClassesRequest(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryClassesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_QueryClassesResponse(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryClassesResponse)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryClassesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryClassesResponse(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryClassesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_QueryFrozenRequest(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryFrozenRequest)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryFrozenRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryFrozenRequest(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryFrozenRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_QueryFrozenResponse(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryFrozenResponse)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryFrozenResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryFrozenResponse(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryFrozenResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryParamsRequest(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryParamsResponse(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_QueryWhitelistedAccountsForNFTRequest(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryWhitelistedAccountsForNFTRequest)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryWhitelistedAccountsForNFTRequest(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryWhitelistedAccountsForNFTRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_QueryWhitelistedAccountsForNFTResponse(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryWhitelistedAccountsForNFTResponse)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryWhitelistedAccountsForNFTResponse(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryWhitelistedAccountsForNFTResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_QueryWhitelistedRequest(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryWhitelistedRequest)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryWhitelistedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryWhitelistedRequest(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryWhitelistedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_coreum_asset_nft_v1_QueryWhitelistedResponse(arg) {
  if (!(arg instanceof coreum_asset_nft_v1_query_pb.QueryWhitelistedResponse)) {
    throw new Error('Expected argument of type coreum.asset.nft.v1.QueryWhitelistedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_coreum_asset_nft_v1_QueryWhitelistedResponse(buffer_arg) {
  return coreum_asset_nft_v1_query_pb.QueryWhitelistedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params queries the parameters of x/asset/ft module.
params: {
    path: '/coreum.asset.nft.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_query_pb.QueryParamsRequest,
    responseType: coreum_asset_nft_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_QueryParamsRequest,
    requestDeserialize: deserialize_coreum_asset_nft_v1_QueryParamsRequest,
    responseSerialize: serialize_coreum_asset_nft_v1_QueryParamsResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_QueryParamsResponse,
  },
  // Class queries the non-fungible token class of the module.
class: {
    path: '/coreum.asset.nft.v1.Query/Class',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_query_pb.QueryClassRequest,
    responseType: coreum_asset_nft_v1_query_pb.QueryClassResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_QueryClassRequest,
    requestDeserialize: deserialize_coreum_asset_nft_v1_QueryClassRequest,
    responseSerialize: serialize_coreum_asset_nft_v1_QueryClassResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_QueryClassResponse,
  },
  // Classes queries the non-fungible token classes of the module.
classes: {
    path: '/coreum.asset.nft.v1.Query/Classes',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_query_pb.QueryClassesRequest,
    responseType: coreum_asset_nft_v1_query_pb.QueryClassesResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_QueryClassesRequest,
    requestDeserialize: deserialize_coreum_asset_nft_v1_QueryClassesRequest,
    responseSerialize: serialize_coreum_asset_nft_v1_QueryClassesResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_QueryClassesResponse,
  },
  // Frozen queries to check if an NFT is frozen or not.
frozen: {
    path: '/coreum.asset.nft.v1.Query/Frozen',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_query_pb.QueryFrozenRequest,
    responseType: coreum_asset_nft_v1_query_pb.QueryFrozenResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_QueryFrozenRequest,
    requestDeserialize: deserialize_coreum_asset_nft_v1_QueryFrozenRequest,
    responseSerialize: serialize_coreum_asset_nft_v1_QueryFrozenResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_QueryFrozenResponse,
  },
  // Whitelisted queries to check if an account is whitelited to hold an NFT or not.
whitelisted: {
    path: '/coreum.asset.nft.v1.Query/Whitelisted',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_query_pb.QueryWhitelistedRequest,
    responseType: coreum_asset_nft_v1_query_pb.QueryWhitelistedResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_QueryWhitelistedRequest,
    requestDeserialize: deserialize_coreum_asset_nft_v1_QueryWhitelistedRequest,
    responseSerialize: serialize_coreum_asset_nft_v1_QueryWhitelistedResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_QueryWhitelistedResponse,
  },
  // WhitelistedAccountsForNFT returns the list of accounts which are whitelisted to hold this NFT.
whitelistedAccountsForNFT: {
    path: '/coreum.asset.nft.v1.Query/WhitelistedAccountsForNFT',
    requestStream: false,
    responseStream: false,
    requestType: coreum_asset_nft_v1_query_pb.QueryWhitelistedAccountsForNFTRequest,
    responseType: coreum_asset_nft_v1_query_pb.QueryWhitelistedAccountsForNFTResponse,
    requestSerialize: serialize_coreum_asset_nft_v1_QueryWhitelistedAccountsForNFTRequest,
    requestDeserialize: deserialize_coreum_asset_nft_v1_QueryWhitelistedAccountsForNFTRequest,
    responseSerialize: serialize_coreum_asset_nft_v1_QueryWhitelistedAccountsForNFTResponse,
    responseDeserialize: deserialize_coreum_asset_nft_v1_QueryWhitelistedAccountsForNFTResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
