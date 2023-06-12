// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_superfluid_query_pb = require('../../osmosis/superfluid/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var osmosis_superfluid_superfluid_pb = require('../../osmosis/superfluid/superfluid_pb.js');
var osmosis_superfluid_params_pb = require('../../osmosis/superfluid/params_pb.js');
var osmosis_lockup_lock_pb = require('../../osmosis/lockup/lock_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_staking_v1beta1_staking_pb = require('../../cosmos/staking/v1beta1/staking_pb.js');

function serialize_osmosis_superfluid_AllAssetsRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.AllAssetsRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.AllAssetsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_AllAssetsRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.AllAssetsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_AllAssetsResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.AllAssetsResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.AllAssetsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_AllAssetsResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.AllAssetsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_AllIntermediaryAccountsRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.AllIntermediaryAccountsRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.AllIntermediaryAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_AllIntermediaryAccountsRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.AllIntermediaryAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_AllIntermediaryAccountsResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.AllIntermediaryAccountsResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.AllIntermediaryAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_AllIntermediaryAccountsResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.AllIntermediaryAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_AssetMultiplierRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.AssetMultiplierRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.AssetMultiplierRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_AssetMultiplierRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.AssetMultiplierRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_AssetMultiplierResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.AssetMultiplierResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.AssetMultiplierResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_AssetMultiplierResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.AssetMultiplierResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_AssetTypeRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.AssetTypeRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.AssetTypeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_AssetTypeRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.AssetTypeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_AssetTypeResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.AssetTypeResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.AssetTypeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_AssetTypeResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.AssetTypeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_ConnectedIntermediaryAccountRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.ConnectedIntermediaryAccountRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.ConnectedIntermediaryAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_ConnectedIntermediaryAccountRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.ConnectedIntermediaryAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_ConnectedIntermediaryAccountResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.ConnectedIntermediaryAccountResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.ConnectedIntermediaryAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_ConnectedIntermediaryAccountResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.ConnectedIntermediaryAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_EstimateSuperfluidDelegatedAmountByValidatorDenomRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_EstimateSuperfluidDelegatedAmountByValidatorDenomRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_EstimateSuperfluidDelegatedAmountByValidatorDenomResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_EstimateSuperfluidDelegatedAmountByValidatorDenomResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_QueryParamsRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_QueryParamsRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_QueryParamsResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_QueryParamsResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_QueryTotalDelegationByDelegatorRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.QueryTotalDelegationByDelegatorRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.QueryTotalDelegationByDelegatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_QueryTotalDelegationByDelegatorRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.QueryTotalDelegationByDelegatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_QueryTotalDelegationByDelegatorResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.QueryTotalDelegationByDelegatorResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.QueryTotalDelegationByDelegatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_QueryTotalDelegationByDelegatorResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.QueryTotalDelegationByDelegatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_QueryTotalDelegationByValidatorForDenomRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.QueryTotalDelegationByValidatorForDenomRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.QueryTotalDelegationByValidatorForDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_QueryTotalDelegationByValidatorForDenomRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.QueryTotalDelegationByValidatorForDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_QueryTotalDelegationByValidatorForDenomResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.QueryTotalDelegationByValidatorForDenomResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.QueryTotalDelegationByValidatorForDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_QueryTotalDelegationByValidatorForDenomResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.QueryTotalDelegationByValidatorForDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_QueryUnpoolWhitelistRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.QueryUnpoolWhitelistRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.QueryUnpoolWhitelistRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_QueryUnpoolWhitelistRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.QueryUnpoolWhitelistRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_QueryUnpoolWhitelistResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.QueryUnpoolWhitelistResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.QueryUnpoolWhitelistResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_QueryUnpoolWhitelistResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.QueryUnpoolWhitelistResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_SuperfluidDelegationAmountRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.SuperfluidDelegationAmountRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.SuperfluidDelegationAmountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_SuperfluidDelegationAmountRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.SuperfluidDelegationAmountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_SuperfluidDelegationAmountResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.SuperfluidDelegationAmountResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.SuperfluidDelegationAmountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_SuperfluidDelegationAmountResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.SuperfluidDelegationAmountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_SuperfluidDelegationsByDelegatorRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.SuperfluidDelegationsByDelegatorRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.SuperfluidDelegationsByDelegatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_SuperfluidDelegationsByDelegatorRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.SuperfluidDelegationsByDelegatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_SuperfluidDelegationsByDelegatorResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.SuperfluidDelegationsByDelegatorResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.SuperfluidDelegationsByDelegatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_SuperfluidDelegationsByDelegatorResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.SuperfluidDelegationsByDelegatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_SuperfluidDelegationsByValidatorDenomRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.SuperfluidDelegationsByValidatorDenomRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.SuperfluidDelegationsByValidatorDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_SuperfluidDelegationsByValidatorDenomRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.SuperfluidDelegationsByValidatorDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_SuperfluidDelegationsByValidatorDenomResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.SuperfluidDelegationsByValidatorDenomResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.SuperfluidDelegationsByValidatorDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_SuperfluidDelegationsByValidatorDenomResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.SuperfluidDelegationsByValidatorDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_SuperfluidUndelegationsByDelegatorRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.SuperfluidUndelegationsByDelegatorRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.SuperfluidUndelegationsByDelegatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_SuperfluidUndelegationsByDelegatorRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.SuperfluidUndelegationsByDelegatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_SuperfluidUndelegationsByDelegatorResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.SuperfluidUndelegationsByDelegatorResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.SuperfluidUndelegationsByDelegatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_SuperfluidUndelegationsByDelegatorResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.SuperfluidUndelegationsByDelegatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_TotalSuperfluidDelegationsRequest(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.TotalSuperfluidDelegationsRequest)) {
    throw new Error('Expected argument of type osmosis.superfluid.TotalSuperfluidDelegationsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_TotalSuperfluidDelegationsRequest(buffer_arg) {
  return osmosis_superfluid_query_pb.TotalSuperfluidDelegationsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_superfluid_TotalSuperfluidDelegationsResponse(arg) {
  if (!(arg instanceof osmosis_superfluid_query_pb.TotalSuperfluidDelegationsResponse)) {
    throw new Error('Expected argument of type osmosis.superfluid.TotalSuperfluidDelegationsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_superfluid_TotalSuperfluidDelegationsResponse(buffer_arg) {
  return osmosis_superfluid_query_pb.TotalSuperfluidDelegationsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Params returns the total set of superfluid parameters.
params: {
    path: '/osmosis.superfluid.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.QueryParamsRequest,
    responseType: osmosis_superfluid_query_pb.QueryParamsResponse,
    requestSerialize: serialize_osmosis_superfluid_QueryParamsRequest,
    requestDeserialize: deserialize_osmosis_superfluid_QueryParamsRequest,
    responseSerialize: serialize_osmosis_superfluid_QueryParamsResponse,
    responseDeserialize: deserialize_osmosis_superfluid_QueryParamsResponse,
  },
  // Returns superfluid asset type, whether if it's a native asset or an lp
// share.
assetType: {
    path: '/osmosis.superfluid.Query/AssetType',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.AssetTypeRequest,
    responseType: osmosis_superfluid_query_pb.AssetTypeResponse,
    requestSerialize: serialize_osmosis_superfluid_AssetTypeRequest,
    requestDeserialize: deserialize_osmosis_superfluid_AssetTypeRequest,
    responseSerialize: serialize_osmosis_superfluid_AssetTypeResponse,
    responseDeserialize: deserialize_osmosis_superfluid_AssetTypeResponse,
  },
  // Returns all registered superfluid assets.
allAssets: {
    path: '/osmosis.superfluid.Query/AllAssets',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.AllAssetsRequest,
    responseType: osmosis_superfluid_query_pb.AllAssetsResponse,
    requestSerialize: serialize_osmosis_superfluid_AllAssetsRequest,
    requestDeserialize: deserialize_osmosis_superfluid_AllAssetsRequest,
    responseSerialize: serialize_osmosis_superfluid_AllAssetsResponse,
    responseDeserialize: deserialize_osmosis_superfluid_AllAssetsResponse,
  },
  // Returns the osmo equivalent multiplier used in the most recent epoch.
assetMultiplier: {
    path: '/osmosis.superfluid.Query/AssetMultiplier',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.AssetMultiplierRequest,
    responseType: osmosis_superfluid_query_pb.AssetMultiplierResponse,
    requestSerialize: serialize_osmosis_superfluid_AssetMultiplierRequest,
    requestDeserialize: deserialize_osmosis_superfluid_AssetMultiplierRequest,
    responseSerialize: serialize_osmosis_superfluid_AssetMultiplierResponse,
    responseDeserialize: deserialize_osmosis_superfluid_AssetMultiplierResponse,
  },
  // Returns all superfluid intermediary accounts.
allIntermediaryAccounts: {
    path: '/osmosis.superfluid.Query/AllIntermediaryAccounts',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.AllIntermediaryAccountsRequest,
    responseType: osmosis_superfluid_query_pb.AllIntermediaryAccountsResponse,
    requestSerialize: serialize_osmosis_superfluid_AllIntermediaryAccountsRequest,
    requestDeserialize: deserialize_osmosis_superfluid_AllIntermediaryAccountsRequest,
    responseSerialize: serialize_osmosis_superfluid_AllIntermediaryAccountsResponse,
    responseDeserialize: deserialize_osmosis_superfluid_AllIntermediaryAccountsResponse,
  },
  // Returns intermediary account connected to a superfluid staked lock by id
connectedIntermediaryAccount: {
    path: '/osmosis.superfluid.Query/ConnectedIntermediaryAccount',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.ConnectedIntermediaryAccountRequest,
    responseType: osmosis_superfluid_query_pb.ConnectedIntermediaryAccountResponse,
    requestSerialize: serialize_osmosis_superfluid_ConnectedIntermediaryAccountRequest,
    requestDeserialize: deserialize_osmosis_superfluid_ConnectedIntermediaryAccountRequest,
    responseSerialize: serialize_osmosis_superfluid_ConnectedIntermediaryAccountResponse,
    responseDeserialize: deserialize_osmosis_superfluid_ConnectedIntermediaryAccountResponse,
  },
  // Returns the amount of delegations of specific denom for all validators
totalDelegationByValidatorForDenom: {
    path: '/osmosis.superfluid.Query/TotalDelegationByValidatorForDenom',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.QueryTotalDelegationByValidatorForDenomRequest,
    responseType: osmosis_superfluid_query_pb.QueryTotalDelegationByValidatorForDenomResponse,
    requestSerialize: serialize_osmosis_superfluid_QueryTotalDelegationByValidatorForDenomRequest,
    requestDeserialize: deserialize_osmosis_superfluid_QueryTotalDelegationByValidatorForDenomRequest,
    responseSerialize: serialize_osmosis_superfluid_QueryTotalDelegationByValidatorForDenomResponse,
    responseDeserialize: deserialize_osmosis_superfluid_QueryTotalDelegationByValidatorForDenomResponse,
  },
  // Returns the total amount of osmo superfluidly staked.
// Response is denominated in uosmo.
totalSuperfluidDelegations: {
    path: '/osmosis.superfluid.Query/TotalSuperfluidDelegations',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.TotalSuperfluidDelegationsRequest,
    responseType: osmosis_superfluid_query_pb.TotalSuperfluidDelegationsResponse,
    requestSerialize: serialize_osmosis_superfluid_TotalSuperfluidDelegationsRequest,
    requestDeserialize: deserialize_osmosis_superfluid_TotalSuperfluidDelegationsRequest,
    responseSerialize: serialize_osmosis_superfluid_TotalSuperfluidDelegationsResponse,
    responseDeserialize: deserialize_osmosis_superfluid_TotalSuperfluidDelegationsResponse,
  },
  // Returns the coins superfluid delegated for the delegator, validator, denom
// triplet
superfluidDelegationAmount: {
    path: '/osmosis.superfluid.Query/SuperfluidDelegationAmount',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.SuperfluidDelegationAmountRequest,
    responseType: osmosis_superfluid_query_pb.SuperfluidDelegationAmountResponse,
    requestSerialize: serialize_osmosis_superfluid_SuperfluidDelegationAmountRequest,
    requestDeserialize: deserialize_osmosis_superfluid_SuperfluidDelegationAmountRequest,
    responseSerialize: serialize_osmosis_superfluid_SuperfluidDelegationAmountResponse,
    responseDeserialize: deserialize_osmosis_superfluid_SuperfluidDelegationAmountResponse,
  },
  // Returns all the delegated superfluid poistions for a specific delegator.
superfluidDelegationsByDelegator: {
    path: '/osmosis.superfluid.Query/SuperfluidDelegationsByDelegator',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.SuperfluidDelegationsByDelegatorRequest,
    responseType: osmosis_superfluid_query_pb.SuperfluidDelegationsByDelegatorResponse,
    requestSerialize: serialize_osmosis_superfluid_SuperfluidDelegationsByDelegatorRequest,
    requestDeserialize: deserialize_osmosis_superfluid_SuperfluidDelegationsByDelegatorRequest,
    responseSerialize: serialize_osmosis_superfluid_SuperfluidDelegationsByDelegatorResponse,
    responseDeserialize: deserialize_osmosis_superfluid_SuperfluidDelegationsByDelegatorResponse,
  },
  // Returns all the undelegating superfluid poistions for a specific delegator.
superfluidUndelegationsByDelegator: {
    path: '/osmosis.superfluid.Query/SuperfluidUndelegationsByDelegator',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.SuperfluidUndelegationsByDelegatorRequest,
    responseType: osmosis_superfluid_query_pb.SuperfluidUndelegationsByDelegatorResponse,
    requestSerialize: serialize_osmosis_superfluid_SuperfluidUndelegationsByDelegatorRequest,
    requestDeserialize: deserialize_osmosis_superfluid_SuperfluidUndelegationsByDelegatorRequest,
    responseSerialize: serialize_osmosis_superfluid_SuperfluidUndelegationsByDelegatorResponse,
    responseDeserialize: deserialize_osmosis_superfluid_SuperfluidUndelegationsByDelegatorResponse,
  },
  // Returns all the superfluid positions of a specific denom delegated to one
// validator
superfluidDelegationsByValidatorDenom: {
    path: '/osmosis.superfluid.Query/SuperfluidDelegationsByValidatorDenom',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.SuperfluidDelegationsByValidatorDenomRequest,
    responseType: osmosis_superfluid_query_pb.SuperfluidDelegationsByValidatorDenomResponse,
    requestSerialize: serialize_osmosis_superfluid_SuperfluidDelegationsByValidatorDenomRequest,
    requestDeserialize: deserialize_osmosis_superfluid_SuperfluidDelegationsByValidatorDenomRequest,
    responseSerialize: serialize_osmosis_superfluid_SuperfluidDelegationsByValidatorDenomResponse,
    responseDeserialize: deserialize_osmosis_superfluid_SuperfluidDelegationsByValidatorDenomResponse,
  },
  // Returns the amount of a specific denom delegated to a specific validator
// This is labeled an estimate, because the way it calculates the amount can
// lead rounding errors from the true delegated amount
estimateSuperfluidDelegatedAmountByValidatorDenom: {
    path: '/osmosis.superfluid.Query/EstimateSuperfluidDelegatedAmountByValidatorDenom',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.EstimateSuperfluidDelegatedAmountByValidatorDenomRequest,
    responseType: osmosis_superfluid_query_pb.EstimateSuperfluidDelegatedAmountByValidatorDenomResponse,
    requestSerialize: serialize_osmosis_superfluid_EstimateSuperfluidDelegatedAmountByValidatorDenomRequest,
    requestDeserialize: deserialize_osmosis_superfluid_EstimateSuperfluidDelegatedAmountByValidatorDenomRequest,
    responseSerialize: serialize_osmosis_superfluid_EstimateSuperfluidDelegatedAmountByValidatorDenomResponse,
    responseDeserialize: deserialize_osmosis_superfluid_EstimateSuperfluidDelegatedAmountByValidatorDenomResponse,
  },
  // Returns the specified delegations for a specific delegator
totalDelegationByDelegator: {
    path: '/osmosis.superfluid.Query/TotalDelegationByDelegator',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.QueryTotalDelegationByDelegatorRequest,
    responseType: osmosis_superfluid_query_pb.QueryTotalDelegationByDelegatorResponse,
    requestSerialize: serialize_osmosis_superfluid_QueryTotalDelegationByDelegatorRequest,
    requestDeserialize: deserialize_osmosis_superfluid_QueryTotalDelegationByDelegatorRequest,
    responseSerialize: serialize_osmosis_superfluid_QueryTotalDelegationByDelegatorResponse,
    responseDeserialize: deserialize_osmosis_superfluid_QueryTotalDelegationByDelegatorResponse,
  },
  // Returns a list of whitelisted pool ids to unpool.
unpoolWhitelist: {
    path: '/osmosis.superfluid.Query/UnpoolWhitelist',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_superfluid_query_pb.QueryUnpoolWhitelistRequest,
    responseType: osmosis_superfluid_query_pb.QueryUnpoolWhitelistResponse,
    requestSerialize: serialize_osmosis_superfluid_QueryUnpoolWhitelistRequest,
    requestDeserialize: deserialize_osmosis_superfluid_QueryUnpoolWhitelistRequest,
    responseSerialize: serialize_osmosis_superfluid_QueryUnpoolWhitelistResponse,
    responseDeserialize: deserialize_osmosis_superfluid_QueryUnpoolWhitelistResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
