// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var confio_poe_v1beta1_query_pb = require('../../../confio/poe/v1beta1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var confio_poe_v1beta1_poe_pb = require('../../../confio/poe/v1beta1/poe_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_staking_v1beta1_staking_pb = require('../../../cosmos/staking/v1beta1/staking_pb.js');
var cosmos_staking_v1beta1_query_pb = require('../../../cosmos/staking/v1beta1/query_pb.js');

function serialize_confio_poe_v1beta1_QueryContractAddressRequest(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryContractAddressRequest)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryContractAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryContractAddressRequest(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryContractAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_QueryContractAddressResponse(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryContractAddressResponse)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryContractAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryContractAddressResponse(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryContractAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_QueryUnbondingPeriodRequest(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryUnbondingPeriodRequest)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryUnbondingPeriodRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryUnbondingPeriodRequest(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryUnbondingPeriodRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_QueryUnbondingPeriodResponse(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryUnbondingPeriodResponse)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryUnbondingPeriodResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryUnbondingPeriodResponse(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryUnbondingPeriodResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_QueryValidatorDelegationRequest(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryValidatorDelegationRequest)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryValidatorDelegationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryValidatorDelegationRequest(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryValidatorDelegationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_QueryValidatorDelegationResponse(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryValidatorDelegationResponse)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryValidatorDelegationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryValidatorDelegationResponse(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryValidatorDelegationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_QueryValidatorEngagementRewardRequest(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryValidatorEngagementRewardRequest)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryValidatorEngagementRewardRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryValidatorEngagementRewardRequest(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryValidatorEngagementRewardRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_QueryValidatorEngagementRewardResponse(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryValidatorEngagementRewardResponse)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryValidatorEngagementRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryValidatorEngagementRewardResponse(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryValidatorEngagementRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_QueryValidatorOutstandingRewardRequest(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryValidatorOutstandingRewardRequest)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryValidatorOutstandingRewardRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryValidatorOutstandingRewardRequest(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryValidatorOutstandingRewardRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_QueryValidatorOutstandingRewardResponse(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryValidatorOutstandingRewardResponse)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryValidatorOutstandingRewardResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryValidatorOutstandingRewardResponse(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryValidatorOutstandingRewardResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_QueryValidatorUnbondingDelegationsRequest(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryValidatorUnbondingDelegationsRequest)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryValidatorUnbondingDelegationsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryValidatorUnbondingDelegationsRequest(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryValidatorUnbondingDelegationsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_poe_v1beta1_QueryValidatorUnbondingDelegationsResponse(arg) {
  if (!(arg instanceof confio_poe_v1beta1_query_pb.QueryValidatorUnbondingDelegationsResponse)) {
    throw new Error('Expected argument of type confio.poe.v1beta1.QueryValidatorUnbondingDelegationsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_poe_v1beta1_QueryValidatorUnbondingDelegationsResponse(buffer_arg) {
  return confio_poe_v1beta1_query_pb.QueryValidatorUnbondingDelegationsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_QueryHistoricalInfoRequest(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_query_pb.QueryHistoricalInfoRequest)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.QueryHistoricalInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_QueryHistoricalInfoRequest(buffer_arg) {
  return cosmos_staking_v1beta1_query_pb.QueryHistoricalInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_QueryHistoricalInfoResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_query_pb.QueryHistoricalInfoResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.QueryHistoricalInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_QueryHistoricalInfoResponse(buffer_arg) {
  return cosmos_staking_v1beta1_query_pb.QueryHistoricalInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_QueryValidatorRequest(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_query_pb.QueryValidatorRequest)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.QueryValidatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_QueryValidatorRequest(buffer_arg) {
  return cosmos_staking_v1beta1_query_pb.QueryValidatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_QueryValidatorResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_query_pb.QueryValidatorResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.QueryValidatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_QueryValidatorResponse(buffer_arg) {
  return cosmos_staking_v1beta1_query_pb.QueryValidatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_QueryValidatorsRequest(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_query_pb.QueryValidatorsRequest)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.QueryValidatorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_QueryValidatorsRequest(buffer_arg) {
  return cosmos_staking_v1beta1_query_pb.QueryValidatorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_staking_v1beta1_QueryValidatorsResponse(arg) {
  if (!(arg instanceof cosmos_staking_v1beta1_query_pb.QueryValidatorsResponse)) {
    throw new Error('Expected argument of type cosmos.staking.v1beta1.QueryValidatorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_staking_v1beta1_QueryValidatorsResponse(buffer_arg) {
  return cosmos_staking_v1beta1_query_pb.QueryValidatorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // ContractAddress queries the address for one of the PoE contracts
contractAddress: {
    path: '/confio.poe.v1beta1.Query/ContractAddress',
    requestStream: false,
    responseStream: false,
    requestType: confio_poe_v1beta1_query_pb.QueryContractAddressRequest,
    responseType: confio_poe_v1beta1_query_pb.QueryContractAddressResponse,
    requestSerialize: serialize_confio_poe_v1beta1_QueryContractAddressRequest,
    requestDeserialize: deserialize_confio_poe_v1beta1_QueryContractAddressRequest,
    responseSerialize: serialize_confio_poe_v1beta1_QueryContractAddressResponse,
    responseDeserialize: deserialize_confio_poe_v1beta1_QueryContractAddressResponse,
  },
  // Validators queries all validators that match the given status.
validators: {
    path: '/confio.poe.v1beta1.Query/Validators',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_query_pb.QueryValidatorsRequest,
    responseType: cosmos_staking_v1beta1_query_pb.QueryValidatorsResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_QueryValidatorsRequest,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_QueryValidatorsRequest,
    responseSerialize: serialize_cosmos_staking_v1beta1_QueryValidatorsResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_QueryValidatorsResponse,
  },
  // Validator queries validator info for given validator address.
validator: {
    path: '/confio.poe.v1beta1.Query/Validator',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_query_pb.QueryValidatorRequest,
    responseType: cosmos_staking_v1beta1_query_pb.QueryValidatorResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_QueryValidatorRequest,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_QueryValidatorRequest,
    responseSerialize: serialize_cosmos_staking_v1beta1_QueryValidatorResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_QueryValidatorResponse,
  },
  // Validator queries validator info for given validator address.
unbondingPeriod: {
    path: '/confio.poe.v1beta1.Query/UnbondingPeriod',
    requestStream: false,
    responseStream: false,
    requestType: confio_poe_v1beta1_query_pb.QueryUnbondingPeriodRequest,
    responseType: confio_poe_v1beta1_query_pb.QueryUnbondingPeriodResponse,
    requestSerialize: serialize_confio_poe_v1beta1_QueryUnbondingPeriodRequest,
    requestDeserialize: deserialize_confio_poe_v1beta1_QueryUnbondingPeriodRequest,
    responseSerialize: serialize_confio_poe_v1beta1_QueryUnbondingPeriodResponse,
    responseDeserialize: deserialize_confio_poe_v1beta1_QueryUnbondingPeriodResponse,
  },
  // ValidatorDelegation queries self delegated amount for given validator.
validatorDelegation: {
    path: '/confio.poe.v1beta1.Query/ValidatorDelegation',
    requestStream: false,
    responseStream: false,
    requestType: confio_poe_v1beta1_query_pb.QueryValidatorDelegationRequest,
    responseType: confio_poe_v1beta1_query_pb.QueryValidatorDelegationResponse,
    requestSerialize: serialize_confio_poe_v1beta1_QueryValidatorDelegationRequest,
    requestDeserialize: deserialize_confio_poe_v1beta1_QueryValidatorDelegationRequest,
    responseSerialize: serialize_confio_poe_v1beta1_QueryValidatorDelegationResponse,
    responseDeserialize: deserialize_confio_poe_v1beta1_QueryValidatorDelegationResponse,
  },
  // ValidatorUnbondingDelegations queries unbonding delegations of a validator.
validatorUnbondingDelegations: {
    path: '/confio.poe.v1beta1.Query/ValidatorUnbondingDelegations',
    requestStream: false,
    responseStream: false,
    requestType: confio_poe_v1beta1_query_pb.QueryValidatorUnbondingDelegationsRequest,
    responseType: confio_poe_v1beta1_query_pb.QueryValidatorUnbondingDelegationsResponse,
    requestSerialize: serialize_confio_poe_v1beta1_QueryValidatorUnbondingDelegationsRequest,
    requestDeserialize: deserialize_confio_poe_v1beta1_QueryValidatorUnbondingDelegationsRequest,
    responseSerialize: serialize_confio_poe_v1beta1_QueryValidatorUnbondingDelegationsResponse,
    responseDeserialize: deserialize_confio_poe_v1beta1_QueryValidatorUnbondingDelegationsResponse,
  },
  // HistoricalInfo queries the historical info for given height.
historicalInfo: {
    path: '/confio.poe.v1beta1.Query/HistoricalInfo',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_staking_v1beta1_query_pb.QueryHistoricalInfoRequest,
    responseType: cosmos_staking_v1beta1_query_pb.QueryHistoricalInfoResponse,
    requestSerialize: serialize_cosmos_staking_v1beta1_QueryHistoricalInfoRequest,
    requestDeserialize: deserialize_cosmos_staking_v1beta1_QueryHistoricalInfoRequest,
    responseSerialize: serialize_cosmos_staking_v1beta1_QueryHistoricalInfoResponse,
    responseDeserialize: deserialize_cosmos_staking_v1beta1_QueryHistoricalInfoResponse,
  },
  // ValidatorOutstandingRewards queries rewards of a validator address.
validatorOutstandingReward: {
    path: '/confio.poe.v1beta1.Query/ValidatorOutstandingReward',
    requestStream: false,
    responseStream: false,
    requestType: confio_poe_v1beta1_query_pb.QueryValidatorOutstandingRewardRequest,
    responseType: confio_poe_v1beta1_query_pb.QueryValidatorOutstandingRewardResponse,
    requestSerialize: serialize_confio_poe_v1beta1_QueryValidatorOutstandingRewardRequest,
    requestDeserialize: deserialize_confio_poe_v1beta1_QueryValidatorOutstandingRewardRequest,
    responseSerialize: serialize_confio_poe_v1beta1_QueryValidatorOutstandingRewardResponse,
    responseDeserialize: deserialize_confio_poe_v1beta1_QueryValidatorOutstandingRewardResponse,
  },
  // ValidatorEngagementReward queries rewards of a validator address.
validatorEngagementReward: {
    path: '/confio.poe.v1beta1.Query/ValidatorEngagementReward',
    requestStream: false,
    responseStream: false,
    requestType: confio_poe_v1beta1_query_pb.QueryValidatorEngagementRewardRequest,
    responseType: confio_poe_v1beta1_query_pb.QueryValidatorEngagementRewardResponse,
    requestSerialize: serialize_confio_poe_v1beta1_QueryValidatorEngagementRewardRequest,
    requestDeserialize: deserialize_confio_poe_v1beta1_QueryValidatorEngagementRewardRequest,
    responseSerialize: serialize_confio_poe_v1beta1_QueryValidatorEngagementRewardResponse,
    responseDeserialize: deserialize_confio_poe_v1beta1_QueryValidatorEngagementRewardResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
