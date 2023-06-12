// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var pstake_lscosmos_v1beta1_query_pb = require('../../../pstake/lscosmos/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var pstake_lscosmos_v1beta1_params_pb = require('../../../pstake/lscosmos/v1beta1/params_pb.js');
var pstake_lscosmos_v1beta1_governance_proposal_pb = require('../../../pstake/lscosmos/v1beta1/governance_proposal_pb.js');
var pstake_lscosmos_v1beta1_lscosmos_pb = require('../../../pstake/lscosmos/v1beta1/lscosmos_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_pstake_lscosmos_v1beta1_QueryAllDelegatorUnbondingEpochEntriesRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryAllDelegatorUnbondingEpochEntriesRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryAllDelegatorUnbondingEpochEntriesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryAllDelegatorUnbondingEpochEntriesRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryAllDelegatorUnbondingEpochEntriesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryAllDelegatorUnbondingEpochEntriesResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryAllDelegatorUnbondingEpochEntriesResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryAllDelegatorUnbondingEpochEntriesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryAllDelegatorUnbondingEpochEntriesResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryAllDelegatorUnbondingEpochEntriesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryAllowListedValidatorsRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryAllowListedValidatorsRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryAllowListedValidatorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryAllowListedValidatorsRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryAllowListedValidatorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryAllowListedValidatorsResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryAllowListedValidatorsResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryAllowListedValidatorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryAllowListedValidatorsResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryAllowListedValidatorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryCValueRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryCValueRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryCValueRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryCValueRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryCValueRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryCValueResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryCValueResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryCValueResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryCValueResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryCValueResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryDelegationStateRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryDelegationStateRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryDelegationStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryDelegationStateRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryDelegationStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryDelegationStateResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryDelegationStateResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryDelegationStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryDelegationStateResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryDelegationStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryDelegatorUnbondingEpochEntryRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryDelegatorUnbondingEpochEntryRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryDelegatorUnbondingEpochEntryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryDelegatorUnbondingEpochEntryRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryDelegatorUnbondingEpochEntryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryDelegatorUnbondingEpochEntryResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryDelegatorUnbondingEpochEntryResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryDelegatorUnbondingEpochEntryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryDelegatorUnbondingEpochEntryResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryDelegatorUnbondingEpochEntryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryDepositModuleAccountRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryDepositModuleAccountRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryDepositModuleAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryDepositModuleAccountRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryDepositModuleAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryDepositModuleAccountResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryDepositModuleAccountResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryDepositModuleAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryDepositModuleAccountResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryDepositModuleAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryFailedUnbondingsRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryFailedUnbondingsRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryFailedUnbondingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryFailedUnbondingsRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryFailedUnbondingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryFailedUnbondingsResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryFailedUnbondingsResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryFailedUnbondingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryFailedUnbondingsResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryFailedUnbondingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryHostAccountUndelegationRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryHostAccountUndelegationRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryHostAccountUndelegationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryHostAccountUndelegationRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryHostAccountUndelegationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryHostAccountUndelegationResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryHostAccountUndelegationResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryHostAccountUndelegationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryHostAccountUndelegationResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryHostAccountUndelegationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryHostAccountsRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryHostAccountsRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryHostAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryHostAccountsRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryHostAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryHostAccountsResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryHostAccountsResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryHostAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryHostAccountsResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryHostAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryHostChainParamsRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryHostChainParamsRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryHostChainParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryHostChainParamsRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryHostChainParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryHostChainParamsResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryHostChainParamsResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryHostChainParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryHostChainParamsResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryHostChainParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryIBCTransientStoreRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryIBCTransientStoreRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryIBCTransientStoreRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryIBCTransientStoreRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryIBCTransientStoreRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryIBCTransientStoreResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryIBCTransientStoreResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryIBCTransientStoreResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryIBCTransientStoreResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryIBCTransientStoreResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryModuleStateRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryModuleStateRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryModuleStateRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryModuleStateRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryModuleStateRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryModuleStateResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryModuleStateResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryModuleStateResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryModuleStateResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryModuleStateResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryParamsRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryParamsResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryPendingUnbondingsRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryPendingUnbondingsRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryPendingUnbondingsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryPendingUnbondingsRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryPendingUnbondingsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryPendingUnbondingsResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryPendingUnbondingsResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryPendingUnbondingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryPendingUnbondingsResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryPendingUnbondingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryUnbondingEpochCValueRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryUnbondingEpochCValueRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryUnbondingEpochCValueRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryUnbondingEpochCValueRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryUnbondingEpochCValueRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryUnbondingEpochCValueResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryUnbondingEpochCValueResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryUnbondingEpochCValueResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryUnbondingEpochCValueResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryUnbondingEpochCValueResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryUnclaimedRequest(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryUnclaimedRequest)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryUnclaimedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryUnclaimedRequest(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryUnclaimedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_pstake_lscosmos_v1beta1_QueryUnclaimedResponse(arg) {
  if (!(arg instanceof pstake_lscosmos_v1beta1_query_pb.QueryUnclaimedResponse)) {
    throw new Error('Expected argument of type pstake.lscosmos.v1beta1.QueryUnclaimedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_pstake_lscosmos_v1beta1_QueryUnclaimedResponse(buffer_arg) {
  return pstake_lscosmos_v1beta1_query_pb.QueryUnclaimedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/pstake.lscosmos.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryParamsRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryParamsResponse,
  },
  hostChainParams: {
    path: '/pstake.lscosmos.v1beta1.Query/HostChainParams',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryHostChainParamsRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryHostChainParamsResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryHostChainParamsRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryHostChainParamsRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryHostChainParamsResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryHostChainParamsResponse,
  },
  delegationState: {
    path: '/pstake.lscosmos.v1beta1.Query/DelegationState',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryDelegationStateRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryDelegationStateResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryDelegationStateRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryDelegationStateRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryDelegationStateResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryDelegationStateResponse,
  },
  allowListedValidators: {
    path: '/pstake.lscosmos.v1beta1.Query/AllowListedValidators',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryAllowListedValidatorsRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryAllowListedValidatorsResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryAllowListedValidatorsRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryAllowListedValidatorsRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryAllowListedValidatorsResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryAllowListedValidatorsResponse,
  },
  cValue: {
    path: '/pstake.lscosmos.v1beta1.Query/CValue',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryCValueRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryCValueResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryCValueRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryCValueRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryCValueResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryCValueResponse,
  },
  moduleState: {
    path: '/pstake.lscosmos.v1beta1.Query/ModuleState',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryModuleStateRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryModuleStateResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryModuleStateRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryModuleStateRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryModuleStateResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryModuleStateResponse,
  },
  iBCTransientStore: {
    path: '/pstake.lscosmos.v1beta1.Query/IBCTransientStore',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryIBCTransientStoreRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryIBCTransientStoreResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryIBCTransientStoreRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryIBCTransientStoreRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryIBCTransientStoreResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryIBCTransientStoreResponse,
  },
  unclaimed: {
    path: '/pstake.lscosmos.v1beta1.Query/Unclaimed',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryUnclaimedRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryUnclaimedResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryUnclaimedRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryUnclaimedRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryUnclaimedResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryUnclaimedResponse,
  },
  failedUnbondings: {
    path: '/pstake.lscosmos.v1beta1.Query/FailedUnbondings',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryFailedUnbondingsRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryFailedUnbondingsResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryFailedUnbondingsRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryFailedUnbondingsRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryFailedUnbondingsResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryFailedUnbondingsResponse,
  },
  pendingUnbondings: {
    path: '/pstake.lscosmos.v1beta1.Query/PendingUnbondings',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryPendingUnbondingsRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryPendingUnbondingsResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryPendingUnbondingsRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryPendingUnbondingsRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryPendingUnbondingsResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryPendingUnbondingsResponse,
  },
  unbondingEpochCValue: {
    path: '/pstake.lscosmos.v1beta1.Query/UnbondingEpochCValue',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryUnbondingEpochCValueRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryUnbondingEpochCValueResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryUnbondingEpochCValueRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryUnbondingEpochCValueRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryUnbondingEpochCValueResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryUnbondingEpochCValueResponse,
  },
  hostAccountUndelegation: {
    path: '/pstake.lscosmos.v1beta1.Query/HostAccountUndelegation',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryHostAccountUndelegationRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryHostAccountUndelegationResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryHostAccountUndelegationRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryHostAccountUndelegationRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryHostAccountUndelegationResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryHostAccountUndelegationResponse,
  },
  delegatorUnbondingEpochEntry: {
    path: '/pstake.lscosmos.v1beta1.Query/DelegatorUnbondingEpochEntry',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryDelegatorUnbondingEpochEntryRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryDelegatorUnbondingEpochEntryResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryDelegatorUnbondingEpochEntryRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryDelegatorUnbondingEpochEntryRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryDelegatorUnbondingEpochEntryResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryDelegatorUnbondingEpochEntryResponse,
  },
  hostAccounts: {
    path: '/pstake.lscosmos.v1beta1.Query/HostAccounts',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryHostAccountsRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryHostAccountsResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryHostAccountsRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryHostAccountsRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryHostAccountsResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryHostAccountsResponse,
  },
  depositModuleAccount: {
    path: '/pstake.lscosmos.v1beta1.Query/DepositModuleAccount',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryDepositModuleAccountRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryDepositModuleAccountResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryDepositModuleAccountRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryDepositModuleAccountRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryDepositModuleAccountResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryDepositModuleAccountResponse,
  },
  delegatorUnbondingEpochEntries: {
    path: '/pstake.lscosmos.v1beta1.Query/DelegatorUnbondingEpochEntries',
    requestStream: false,
    responseStream: false,
    requestType: pstake_lscosmos_v1beta1_query_pb.QueryAllDelegatorUnbondingEpochEntriesRequest,
    responseType: pstake_lscosmos_v1beta1_query_pb.QueryAllDelegatorUnbondingEpochEntriesResponse,
    requestSerialize: serialize_pstake_lscosmos_v1beta1_QueryAllDelegatorUnbondingEpochEntriesRequest,
    requestDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryAllDelegatorUnbondingEpochEntriesRequest,
    responseSerialize: serialize_pstake_lscosmos_v1beta1_QueryAllDelegatorUnbondingEpochEntriesResponse,
    responseDeserialize: deserialize_pstake_lscosmos_v1beta1_QueryAllDelegatorUnbondingEpochEntriesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
