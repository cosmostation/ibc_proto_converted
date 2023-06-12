// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var shentu_shield_v1alpha1_query_pb = require('../../../shentu/shield/v1alpha1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var shentu_shield_v1alpha1_shield_pb = require('../../../shentu/shield/v1alpha1/shield_pb.js');
var shentu_shield_v1alpha1_genesis_pb = require('../../../shentu/shield/v1alpha1/genesis_pb.js');

function serialize_shentu_shield_v1alpha1_QueryClaimParamsRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryClaimParamsRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryClaimParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryClaimParamsRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryClaimParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryClaimParamsResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryClaimParamsResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryClaimParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryClaimParamsResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryClaimParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryDistrParamsRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryDistrParamsRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryDistrParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryDistrParamsRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryDistrParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryDistrParamsResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryDistrParamsResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryDistrParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryDistrParamsResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryDistrParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPoolParamsRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPoolParamsRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPoolParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPoolParamsRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPoolParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPoolParamsResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPoolParamsResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPoolParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPoolParamsResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPoolParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPoolPurchaseListsRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPoolPurchaseListsRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPoolPurchaseListsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPoolPurchaseListsRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPoolPurchaseListsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPoolRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPoolRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPoolRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPoolRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPoolRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPoolResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPoolResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPoolResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPoolsRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPoolsRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPoolsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPoolsRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPoolsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPoolsResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPoolsResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPoolsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPoolsResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPoolsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryProviderRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryProviderRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryProviderRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryProviderRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryProviderRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryProviderResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryProviderResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryProviderResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryProviderResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryProviderResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryProvidersRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryProvidersRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryProvidersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryProvidersRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryProvidersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryProvidersResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryProvidersResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryProvidersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryProvidersResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryProvidersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPurchaseListRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPurchaseListRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPurchaseListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPurchaseListRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPurchaseListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPurchaseListResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPurchaseListResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPurchaseListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPurchaseListResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPurchaseListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPurchaseListsRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPurchaseListsRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPurchaseListsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPurchaseListsRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPurchaseListsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPurchaseListsResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPurchaseListsResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPurchaseListsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPurchaseListsResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPurchaseListsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPurchasesRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPurchasesRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPurchasesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPurchasesRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPurchasesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryPurchasesResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryPurchasesResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryPurchasesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryPurchasesResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryPurchasesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryReimbursementRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryReimbursementRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryReimbursementRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryReimbursementRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryReimbursementRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryReimbursementResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryReimbursementResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryReimbursementResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryReimbursementResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryReimbursementResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryReimbursementsRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryReimbursementsRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryReimbursementsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryReimbursementsRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryReimbursementsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryReimbursementsResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryReimbursementsResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryReimbursementsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryReimbursementsResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryReimbursementsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryShieldStakingRateRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryShieldStakingRateRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryShieldStakingRateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryShieldStakingRateRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryShieldStakingRateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryShieldStakingRateResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryShieldStakingRateResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryShieldStakingRateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryShieldStakingRateResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryShieldStakingRateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryShieldStakingRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryShieldStakingRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryShieldStakingRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryShieldStakingRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryShieldStakingRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryShieldStakingResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryShieldStakingResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryShieldStakingResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryShieldStakingResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryShieldStakingResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryShieldStatusRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryShieldStatusRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryShieldStatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryShieldStatusRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryShieldStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QueryShieldStatusResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QueryShieldStatusResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QueryShieldStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QueryShieldStatusResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QueryShieldStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QuerySponsorRequest(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QuerySponsorRequest)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QuerySponsorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QuerySponsorRequest(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QuerySponsorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_shentu_shield_v1alpha1_QuerySponsorResponse(arg) {
  if (!(arg instanceof shentu_shield_v1alpha1_query_pb.QuerySponsorResponse)) {
    throw new Error('Expected argument of type shentu.shield.v1alpha1.QuerySponsorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_shentu_shield_v1alpha1_QuerySponsorResponse(buffer_arg) {
  return shentu_shield_v1alpha1_query_pb.QuerySponsorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service for shield module
var QueryService = exports.QueryService = {
  pool: {
    path: '/shentu.shield.v1alpha1.Query/Pool',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryPoolRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryPoolResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryPoolRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryPoolRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryPoolResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryPoolResponse,
  },
  sponsor: {
    path: '/shentu.shield.v1alpha1.Query/Sponsor',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QuerySponsorRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QuerySponsorResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QuerySponsorRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QuerySponsorRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QuerySponsorResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QuerySponsorResponse,
  },
  pools: {
    path: '/shentu.shield.v1alpha1.Query/Pools',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryPoolsRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryPoolsResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryPoolsRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryPoolsRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryPoolsResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryPoolsResponse,
  },
  poolPurchaseLists: {
    path: '/shentu.shield.v1alpha1.Query/PoolPurchaseLists',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryPoolPurchaseListsRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryPurchaseListsResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryPoolPurchaseListsRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryPoolPurchaseListsRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryPurchaseListsResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryPurchaseListsResponse,
  },
  purchaseLists: {
    path: '/shentu.shield.v1alpha1.Query/PurchaseLists',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryPurchaseListsRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryPurchaseListsResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryPurchaseListsRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryPurchaseListsRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryPurchaseListsResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryPurchaseListsResponse,
  },
  purchaseList: {
    path: '/shentu.shield.v1alpha1.Query/PurchaseList',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryPurchaseListRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryPurchaseListResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryPurchaseListRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryPurchaseListRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryPurchaseListResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryPurchaseListResponse,
  },
  purchases: {
    path: '/shentu.shield.v1alpha1.Query/Purchases',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryPurchasesRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryPurchasesResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryPurchasesRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryPurchasesRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryPurchasesResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryPurchasesResponse,
  },
  provider: {
    path: '/shentu.shield.v1alpha1.Query/Provider',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryProviderRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryProviderResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryProviderRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryProviderRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryProviderResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryProviderResponse,
  },
  providers: {
    path: '/shentu.shield.v1alpha1.Query/Providers',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryProvidersRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryProvidersResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryProvidersRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryProvidersRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryProvidersResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryProvidersResponse,
  },
  poolParams: {
    path: '/shentu.shield.v1alpha1.Query/PoolParams',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryPoolParamsRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryPoolParamsResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryPoolParamsRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryPoolParamsRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryPoolParamsResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryPoolParamsResponse,
  },
  claimParams: {
    path: '/shentu.shield.v1alpha1.Query/ClaimParams',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryClaimParamsRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryClaimParamsResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryClaimParamsRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryClaimParamsRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryClaimParamsResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryClaimParamsResponse,
  },
  distrParams: {
    path: '/shentu.shield.v1alpha1.Query/DistrParams',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryDistrParamsRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryDistrParamsResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryDistrParamsRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryDistrParamsRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryDistrParamsResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryDistrParamsResponse,
  },
  shieldStatus: {
    path: '/shentu.shield.v1alpha1.Query/ShieldStatus',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryShieldStatusRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryShieldStatusResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryShieldStatusRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryShieldStatusRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryShieldStatusResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryShieldStatusResponse,
  },
  shieldStaking: {
    path: '/shentu.shield.v1alpha1.Query/ShieldStaking',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryShieldStakingRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryShieldStakingResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryShieldStakingRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryShieldStakingRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryShieldStakingResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryShieldStakingResponse,
  },
  shieldStakingRate: {
    path: '/shentu.shield.v1alpha1.Query/ShieldStakingRate',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryShieldStakingRateRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryShieldStakingRateResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryShieldStakingRateRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryShieldStakingRateRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryShieldStakingRateResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryShieldStakingRateResponse,
  },
  reimbursement: {
    path: '/shentu.shield.v1alpha1.Query/Reimbursement',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryReimbursementRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryReimbursementResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryReimbursementRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryReimbursementRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryReimbursementResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryReimbursementResponse,
  },
  reimbursements: {
    path: '/shentu.shield.v1alpha1.Query/Reimbursements',
    requestStream: false,
    responseStream: false,
    requestType: shentu_shield_v1alpha1_query_pb.QueryReimbursementsRequest,
    responseType: shentu_shield_v1alpha1_query_pb.QueryReimbursementsResponse,
    requestSerialize: serialize_shentu_shield_v1alpha1_QueryReimbursementsRequest,
    requestDeserialize: deserialize_shentu_shield_v1alpha1_QueryReimbursementsRequest,
    responseSerialize: serialize_shentu_shield_v1alpha1_QueryReimbursementsResponse,
    responseDeserialize: deserialize_shentu_shield_v1alpha1_QueryReimbursementsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
