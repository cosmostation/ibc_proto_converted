// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var comdex_vault_v1beta1_query_pb = require('../../../comdex/vault/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var comdex_vault_v1beta1_vault_pb = require('../../../comdex/vault/v1beta1/vault_pb.js');

function serialize_comdex_vault_v1beta1_QueryAllStableMintVaultRewardsRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryAllStableMintVaultRewardsRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryAllStableMintVaultRewardsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryAllStableMintVaultRewardsRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryAllStableMintVaultRewardsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryAllStableMintVaultRewardsResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryAllStableMintVaultRewardsResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryAllStableMintVaultRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryAllStableMintVaultRewardsResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryAllStableMintVaultRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryAllVaultIdsByAnOwnerRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryAllVaultIdsByAnOwnerRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryAllVaultIdsByAnOwnerRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryAllVaultIdsByAnOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryAllVaultIdsByAnOwnerResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryAllVaultIdsByAnOwnerResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryAllVaultIdsByAnOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryAllVaultIdsByAnOwnerResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryAllVaultIdsByAnOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryAllVaultsByAppAndExtendedPairRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppAndExtendedPairRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryAllVaultsByAppAndExtendedPairRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppAndExtendedPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryAllVaultsByAppAndExtendedPairResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppAndExtendedPairResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryAllVaultsByAppAndExtendedPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryAllVaultsByAppAndExtendedPairResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppAndExtendedPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryAllVaultsByAppRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryAllVaultsByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryAllVaultsByAppRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryAllVaultsByAppResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryAllVaultsByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryAllVaultsByAppResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryAllVaultsRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryAllVaultsRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryAllVaultsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryAllVaultsRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryAllVaultsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryAllVaultsResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryAllVaultsResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryAllVaultsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryAllVaultsResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryAllVaultsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryExtendedPairIDsByAppRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryExtendedPairIDsByAppRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryExtendedPairIDsByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryExtendedPairIDsByAppRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryExtendedPairIDsByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryExtendedPairIDsByAppResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryExtendedPairIDsByAppResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryExtendedPairIDsByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryExtendedPairIDsByAppResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryExtendedPairIDsByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppAndExtendedPairRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppAndExtendedPairRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppAndExtendedPairResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppAndExtendedPairResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryExtendedPairVaultMappingByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryPairsLockedAndMintedStatisticByAppRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryPairsLockedAndMintedStatisticByAppRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryPairsLockedAndMintedStatisticByAppRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryPairsLockedAndMintedStatisticByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryPairsLockedAndMintedStatisticByAppResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryPairsLockedAndMintedStatisticByAppResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryPairsLockedAndMintedStatisticByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryPairsLockedAndMintedStatisticByAppResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryPairsLockedAndMintedStatisticByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryStableVaultByAppAndExtendedPairRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryStableVaultByAppAndExtendedPairRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryStableVaultByAppAndExtendedPairRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryStableVaultByAppAndExtendedPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryStableVaultByAppAndExtendedPairResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryStableVaultByAppAndExtendedPairResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryStableVaultByAppAndExtendedPairResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryStableVaultByAppAndExtendedPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryStableVaultByAppRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryStableVaultByAppRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryStableVaultByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryStableVaultByAppRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryStableVaultByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryStableVaultByAppResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryStableVaultByAppResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryStableVaultByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryStableVaultByAppResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryStableVaultByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryStableVaultByVaultIDRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryStableVaultByVaultIDRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryStableVaultByVaultIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryStableVaultByVaultIDRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryStableVaultByVaultIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryStableVaultByVaultIDResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryStableVaultByVaultIDResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryStableVaultByVaultIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryStableVaultByVaultIDResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryStableVaultByVaultIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryTVLByAppOfAllExtendedPairsRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryTVLByAppOfAllExtendedPairsRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryTVLByAppOfAllExtendedPairsRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryTVLByAppOfAllExtendedPairsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryTVLByAppOfAllExtendedPairsResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryTVLByAppOfAllExtendedPairsResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryTVLByAppOfAllExtendedPairsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryTVLByAppOfAllExtendedPairsResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryTVLByAppOfAllExtendedPairsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryTVLByAppRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryTVLByAppRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryTVLByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryTVLByAppRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryTVLByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryTVLByAppResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryTVLByAppResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryTVLByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryTVLByAppResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryTVLByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryTokenMintedAssetWiseByAppRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryTokenMintedAssetWiseByAppRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryTokenMintedAssetWiseByAppRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryTokenMintedAssetWiseByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryTokenMintedAssetWiseByAppResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryTokenMintedAssetWiseByAppResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryTokenMintedAssetWiseByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryTokenMintedAssetWiseByAppResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryTokenMintedAssetWiseByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryTokenMintedByAppAndExtendedPairRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryTokenMintedByAppAndExtendedPairRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryTokenMintedByAppAndExtendedPairRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryTokenMintedByAppAndExtendedPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryTokenMintedByAppAndExtendedPairResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryTokenMintedByAppAndExtendedPairResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryTokenMintedByAppAndExtendedPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryTokenMintedByAppAndExtendedPairResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryTokenMintedByAppAndExtendedPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryTotalValueLockedByAppAndExtendedPairRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryTotalValueLockedByAppAndExtendedPairRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryTotalValueLockedByAppAndExtendedPairRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryTotalValueLockedByAppAndExtendedPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryTotalValueLockedByAppAndExtendedPairResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryTotalValueLockedByAppAndExtendedPairResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryTotalValueLockedByAppAndExtendedPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryTotalValueLockedByAppAndExtendedPairResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryTotalValueLockedByAppAndExtendedPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryUserExtendedPairTotalDataRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryUserExtendedPairTotalDataRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryUserExtendedPairTotalDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryUserExtendedPairTotalDataRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryUserExtendedPairTotalDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryUserExtendedPairTotalDataResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryUserExtendedPairTotalDataResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryUserExtendedPairTotalDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryUserExtendedPairTotalDataResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryUserExtendedPairTotalDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryUserMyPositionByAppRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryUserMyPositionByAppRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryUserMyPositionByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryUserMyPositionByAppRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryUserMyPositionByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryUserMyPositionByAppResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryUserMyPositionByAppResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryUserMyPositionByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryUserMyPositionByAppResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryUserMyPositionByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultCountByAppAndExtendedPairRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultCountByAppAndExtendedPairRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultCountByAppAndExtendedPairRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultCountByAppAndExtendedPairRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultCountByAppAndExtendedPairResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultCountByAppAndExtendedPairResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultCountByAppAndExtendedPairResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultCountByAppAndExtendedPairResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultCountByAppAndExtendedPairResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultCountByAppRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultCountByAppRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultCountByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultCountByAppRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultCountByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultCountByAppResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultCountByAppResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultCountByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultCountByAppResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultCountByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultIDOfOwnerByExtendedPairAndAppRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultIDOfOwnerByExtendedPairAndAppRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultIDOfOwnerByExtendedPairAndAppRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultIDOfOwnerByExtendedPairAndAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultIDOfOwnerByExtendedPairAndAppResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultIDOfOwnerByExtendedPairAndAppResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultIDOfOwnerByExtendedPairAndAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultIDOfOwnerByExtendedPairAndAppResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultIDOfOwnerByExtendedPairAndAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultIdsByAppInAllExtendedPairsRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultIdsByAppInAllExtendedPairsRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultIdsByAppInAllExtendedPairsRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultIdsByAppInAllExtendedPairsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultIdsByAppInAllExtendedPairsResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultIdsByAppInAllExtendedPairsResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultIdsByAppInAllExtendedPairsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultIdsByAppInAllExtendedPairsResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultIdsByAppInAllExtendedPairsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultInfoByVaultIDRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultInfoByVaultIDRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultInfoByVaultIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultInfoByVaultIDRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultInfoByVaultIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultInfoByVaultIDResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultInfoByVaultIDResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultInfoByVaultIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultInfoByVaultIDResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultInfoByVaultIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultInfoOfOwnerByAppRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultInfoOfOwnerByAppRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultInfoOfOwnerByAppRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultInfoOfOwnerByAppRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultInfoOfOwnerByAppResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultInfoOfOwnerByAppResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultInfoOfOwnerByAppResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultInfoOfOwnerByAppResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultInfoOfOwnerByAppResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultRequest(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultRequest)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultRequest(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_comdex_vault_v1beta1_QueryVaultResponse(arg) {
  if (!(arg instanceof comdex_vault_v1beta1_query_pb.QueryVaultResponse)) {
    throw new Error('Expected argument of type comdex.vault.v1beta1.QueryVaultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_comdex_vault_v1beta1_QueryVaultResponse(buffer_arg) {
  return comdex_vault_v1beta1_query_pb.QueryVaultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var QueryService = exports.QueryService = {
  queryVault: {
    path: '/comdex.vault.v1beta1.Query/QueryVault',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryVaultRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryVaultResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryVaultRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryVaultResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultResponse,
  },
  queryUserExtendedPairTotalData: {
    path: '/comdex.vault.v1beta1.Query/QueryUserExtendedPairTotalData',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryUserExtendedPairTotalDataRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryUserExtendedPairTotalDataResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryUserExtendedPairTotalDataRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryUserExtendedPairTotalDataRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryUserExtendedPairTotalDataResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryUserExtendedPairTotalDataResponse,
  },
  queryVaultInfoByVaultID: {
    path: '/comdex.vault.v1beta1.Query/QueryVaultInfoByVaultID',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryVaultInfoByVaultIDRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryVaultInfoByVaultIDResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryVaultInfoByVaultIDRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultInfoByVaultIDRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryVaultInfoByVaultIDResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultInfoByVaultIDResponse,
  },
  queryVaultInfoOfOwnerByApp: {
    path: '/comdex.vault.v1beta1.Query/QueryVaultInfoOfOwnerByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryVaultInfoOfOwnerByAppRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryVaultInfoOfOwnerByAppResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryVaultInfoOfOwnerByAppRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultInfoOfOwnerByAppRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryVaultInfoOfOwnerByAppResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultInfoOfOwnerByAppResponse,
  },
  queryAllVaults: {
    path: '/comdex.vault.v1beta1.Query/QueryAllVaults',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryAllVaultsRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryAllVaultsResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryAllVaultsRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryAllVaultsRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryAllVaultsResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryAllVaultsResponse,
  },
  queryAllVaultsByApp: {
    path: '/comdex.vault.v1beta1.Query/QueryAllVaultsByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryAllVaultsByAppRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryAllVaultsByAppRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryAllVaultsByAppResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryAllVaultsByAppResponse,
  },
  queryAllVaultsByAppAndExtendedPair: {
    path: '/comdex.vault.v1beta1.Query/QueryAllVaultsByAppAndExtendedPair',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppAndExtendedPairRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryAllVaultsByAppAndExtendedPairResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryAllVaultsByAppAndExtendedPairRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryAllVaultsByAppAndExtendedPairRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryAllVaultsByAppAndExtendedPairResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryAllVaultsByAppAndExtendedPairResponse,
  },
  queryVaultIDOfOwnerByExtendedPairAndApp: {
    path: '/comdex.vault.v1beta1.Query/QueryVaultIDOfOwnerByExtendedPairAndApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryVaultIDOfOwnerByExtendedPairAndAppRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryVaultIDOfOwnerByExtendedPairAndAppResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryVaultIDOfOwnerByExtendedPairAndAppRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultIDOfOwnerByExtendedPairAndAppRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryVaultIDOfOwnerByExtendedPairAndAppResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultIDOfOwnerByExtendedPairAndAppResponse,
  },
  queryVaultIdsByAppInAllExtendedPairs: {
    path: '/comdex.vault.v1beta1.Query/QueryVaultIdsByAppInAllExtendedPairs',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryVaultIdsByAppInAllExtendedPairsRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryVaultIdsByAppInAllExtendedPairsResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryVaultIdsByAppInAllExtendedPairsRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultIdsByAppInAllExtendedPairsRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryVaultIdsByAppInAllExtendedPairsResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultIdsByAppInAllExtendedPairsResponse,
  },
  queryAllVaultIdsByAnOwner: {
    path: '/comdex.vault.v1beta1.Query/QueryAllVaultIdsByAnOwner',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryAllVaultIdsByAnOwnerRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryAllVaultIdsByAnOwnerResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryAllVaultIdsByAnOwnerRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryAllVaultIdsByAnOwnerRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryAllVaultIdsByAnOwnerResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryAllVaultIdsByAnOwnerResponse,
  },
  queryTokenMintedByAppAndExtendedPair: {
    path: '/comdex.vault.v1beta1.Query/QueryTokenMintedByAppAndExtendedPair',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryTokenMintedByAppAndExtendedPairRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryTokenMintedByAppAndExtendedPairResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryTokenMintedByAppAndExtendedPairRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryTokenMintedByAppAndExtendedPairRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryTokenMintedByAppAndExtendedPairResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryTokenMintedByAppAndExtendedPairResponse,
  },
  queryTokenMintedAssetWiseByApp: {
    path: '/comdex.vault.v1beta1.Query/QueryTokenMintedAssetWiseByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryTokenMintedAssetWiseByAppRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryTokenMintedAssetWiseByAppResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryTokenMintedAssetWiseByAppRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryTokenMintedAssetWiseByAppRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryTokenMintedAssetWiseByAppResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryTokenMintedAssetWiseByAppResponse,
  },
  queryVaultCountByApp: {
    path: '/comdex.vault.v1beta1.Query/QueryVaultCountByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryVaultCountByAppRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryVaultCountByAppResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryVaultCountByAppRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultCountByAppRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryVaultCountByAppResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultCountByAppResponse,
  },
  queryVaultCountByAppAndExtendedPair: {
    path: '/comdex.vault.v1beta1.Query/QueryVaultCountByAppAndExtendedPair',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryVaultCountByAppAndExtendedPairRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryVaultCountByAppAndExtendedPairResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryVaultCountByAppAndExtendedPairRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultCountByAppAndExtendedPairRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryVaultCountByAppAndExtendedPairResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryVaultCountByAppAndExtendedPairResponse,
  },
  queryTotalValueLockedByAppAndExtendedPair: {
    path: '/comdex.vault.v1beta1.Query/QueryTotalValueLockedByAppAndExtendedPair',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryTotalValueLockedByAppAndExtendedPairRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryTotalValueLockedByAppAndExtendedPairResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryTotalValueLockedByAppAndExtendedPairRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryTotalValueLockedByAppAndExtendedPairRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryTotalValueLockedByAppAndExtendedPairResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryTotalValueLockedByAppAndExtendedPairResponse,
  },
  queryExtendedPairIDsByApp: {
    path: '/comdex.vault.v1beta1.Query/QueryExtendedPairIDsByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryExtendedPairIDsByAppRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryExtendedPairIDsByAppResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryExtendedPairIDsByAppRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryExtendedPairIDsByAppRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryExtendedPairIDsByAppResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryExtendedPairIDsByAppResponse,
  },
  queryStableVaultByVaultID: {
    path: '/comdex.vault.v1beta1.Query/QueryStableVaultByVaultID',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryStableVaultByVaultIDRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryStableVaultByVaultIDResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryStableVaultByVaultIDRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryStableVaultByVaultIDRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryStableVaultByVaultIDResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryStableVaultByVaultIDResponse,
  },
  queryStableVaultByApp: {
    path: '/comdex.vault.v1beta1.Query/QueryStableVaultByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryStableVaultByAppRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryStableVaultByAppResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryStableVaultByAppRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryStableVaultByAppRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryStableVaultByAppResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryStableVaultByAppResponse,
  },
  queryStableVaultByAppAndExtendedPair: {
    path: '/comdex.vault.v1beta1.Query/QueryStableVaultByAppAndExtendedPair',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryStableVaultByAppAndExtendedPairRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryStableVaultByAppAndExtendedPairResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryStableVaultByAppAndExtendedPairRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryStableVaultByAppAndExtendedPairRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryStableVaultByAppAndExtendedPairResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryStableVaultByAppAndExtendedPairResponse,
  },
  queryExtendedPairVaultMappingByAppAndExtendedPair: {
    path: '/comdex.vault.v1beta1.Query/QueryExtendedPairVaultMappingByAppAndExtendedPair',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppAndExtendedPairRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppAndExtendedPairResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppAndExtendedPairRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppAndExtendedPairRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppAndExtendedPairResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppAndExtendedPairResponse,
  },
  queryExtendedPairVaultMappingByApp: {
    path: '/comdex.vault.v1beta1.Query/QueryExtendedPairVaultMappingByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryExtendedPairVaultMappingByAppResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryExtendedPairVaultMappingByAppResponse,
  },
  queryTVLByAppOfAllExtendedPairs: {
    path: '/comdex.vault.v1beta1.Query/QueryTVLByAppOfAllExtendedPairs',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryTVLByAppOfAllExtendedPairsRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryTVLByAppOfAllExtendedPairsResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryTVLByAppOfAllExtendedPairsRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryTVLByAppOfAllExtendedPairsRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryTVLByAppOfAllExtendedPairsResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryTVLByAppOfAllExtendedPairsResponse,
  },
  queryTVLByApp: {
    path: '/comdex.vault.v1beta1.Query/QueryTVLByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryTVLByAppRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryTVLByAppResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryTVLByAppRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryTVLByAppRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryTVLByAppResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryTVLByAppResponse,
  },
  queryUserMyPositionByApp: {
    path: '/comdex.vault.v1beta1.Query/QueryUserMyPositionByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryUserMyPositionByAppRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryUserMyPositionByAppResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryUserMyPositionByAppRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryUserMyPositionByAppRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryUserMyPositionByAppResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryUserMyPositionByAppResponse,
  },
  queryPairsLockedAndMintedStatisticByApp: {
    path: '/comdex.vault.v1beta1.Query/QueryPairsLockedAndMintedStatisticByApp',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryPairsLockedAndMintedStatisticByAppRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryPairsLockedAndMintedStatisticByAppResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryPairsLockedAndMintedStatisticByAppRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryPairsLockedAndMintedStatisticByAppRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryPairsLockedAndMintedStatisticByAppResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryPairsLockedAndMintedStatisticByAppResponse,
  },
  queryAllStableMintVaultRewards: {
    path: '/comdex.vault.v1beta1.Query/QueryAllStableMintVaultRewards',
    requestStream: false,
    responseStream: false,
    requestType: comdex_vault_v1beta1_query_pb.QueryAllStableMintVaultRewardsRequest,
    responseType: comdex_vault_v1beta1_query_pb.QueryAllStableMintVaultRewardsResponse,
    requestSerialize: serialize_comdex_vault_v1beta1_QueryAllStableMintVaultRewardsRequest,
    requestDeserialize: deserialize_comdex_vault_v1beta1_QueryAllStableMintVaultRewardsRequest,
    responseSerialize: serialize_comdex_vault_v1beta1_QueryAllStableMintVaultRewardsResponse,
    responseDeserialize: deserialize_comdex_vault_v1beta1_QueryAllStableMintVaultRewardsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
