// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quicksilver_interchainstaking_v1_query_pb = require('../../../quicksilver/interchainstaking/v1/query_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var quicksilver_interchainstaking_v1_interchainstaking_pb = require('../../../quicksilver/interchainstaking/v1/interchainstaking_pb.js');

function serialize_quicksilver_interchainstaking_v1_QueryDelegationsRequest(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryDelegationsRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryDelegationsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryDelegationsRequest(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryDelegationsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryDelegationsResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryDelegationsResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryDelegationsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryDelegationsResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryDelegationsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryDelegatorIntentRequest(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryDelegatorIntentRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryDelegatorIntentRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryDelegatorIntentRequest(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryDelegatorIntentRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryDelegatorIntentResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryDelegatorIntentResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryDelegatorIntentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryDelegatorIntentResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryDelegatorIntentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryDepositAccountForChainRequest(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryDepositAccountForChainRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryDepositAccountForChainRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryDepositAccountForChainRequest(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryDepositAccountForChainRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryDepositAccountForChainResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryDepositAccountForChainResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryDepositAccountForChainResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryDepositAccountForChainResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryDepositAccountForChainResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryMappedAccountsRequest(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryMappedAccountsRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryMappedAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryMappedAccountsRequest(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryMappedAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryMappedAccountsResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryMappedAccountsResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryMappedAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryMappedAccountsResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryMappedAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryReceiptsRequest(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryReceiptsRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryReceiptsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryReceiptsRequest(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryReceiptsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryReceiptsResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryReceiptsResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryReceiptsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryReceiptsResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryReceiptsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryRedelegationRecordsRequest(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryRedelegationRecordsRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryRedelegationRecordsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryRedelegationRecordsRequest(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryRedelegationRecordsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryRedelegationRecordsResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryRedelegationRecordsResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryRedelegationRecordsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryRedelegationRecordsResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryRedelegationRecordsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryUnbondingRecordsRequest(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryUnbondingRecordsRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryUnbondingRecordsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryUnbondingRecordsRequest(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryUnbondingRecordsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryUnbondingRecordsResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryUnbondingRecordsResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryUnbondingRecordsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryUnbondingRecordsResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryUnbondingRecordsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsRequest(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryWithdrawalRecordsRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryWithdrawalRecordsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsRequest(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryWithdrawalRecordsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryWithdrawalRecordsResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryWithdrawalRecordsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryWithdrawalRecordsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryZoneRequest(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryZoneRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryZoneRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryZoneRequest(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryZoneRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryZoneResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryZoneResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryZoneResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryZoneResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryZoneResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryZoneValidatorsRequest(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryZoneValidatorsRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryZoneValidatorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryZoneValidatorsRequest(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryZoneValidatorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryZoneValidatorsResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryZoneValidatorsResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryZoneValidatorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryZoneValidatorsResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryZoneValidatorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryZonesRequest(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryZonesRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryZonesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryZonesRequest(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryZonesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_QueryZonesResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_query_pb.QueryZonesResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.QueryZonesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_QueryZonesResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_query_pb.QueryZonesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Zones provides meta data on connected zones.
zones: {
    path: '/quicksilver.interchainstaking.v1.Query/Zones',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryZonesRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryZonesResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryZonesRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryZonesRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryZonesResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryZonesResponse,
  },
  // Zone provides meta data on a specific zone.
zone: {
    path: '/quicksilver.interchainstaking.v1.Query/Zone',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryZoneRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryZoneResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryZoneRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryZoneRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryZoneResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryZoneResponse,
  },
  zoneValidators: {
    path: '/quicksilver.interchainstaking.v1.Query/ZoneValidators',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryZoneValidatorsRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryZoneValidatorsResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryZoneValidatorsRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryZoneValidatorsRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryZoneValidatorsResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryZoneValidatorsResponse,
  },
  // DepositAccount provides data on the deposit address for a connected zone.
depositAccount: {
    path: '/quicksilver.interchainstaking.v1.Query/DepositAccount',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryDepositAccountForChainRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryDepositAccountForChainResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryDepositAccountForChainRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryDepositAccountForChainRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryDepositAccountForChainResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryDepositAccountForChainResponse,
  },
  // DelegatorIntent provides data on the intent of the delegator for the given
// zone.
delegatorIntent: {
    path: '/quicksilver.interchainstaking.v1.Query/DelegatorIntent',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryDelegatorIntentRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryDelegatorIntentResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryDelegatorIntentRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryDelegatorIntentRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryDelegatorIntentResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryDelegatorIntentResponse,
  },
  // Delegations provides data on the delegations for the given zone.
delegations: {
    path: '/quicksilver.interchainstaking.v1.Query/Delegations',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryDelegationsRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryDelegationsResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryDelegationsRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryDelegationsRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryDelegationsResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryDelegationsResponse,
  },
  // Delegations provides data on the delegations for the given zone.
receipts: {
    path: '/quicksilver.interchainstaking.v1.Query/Receipts',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryReceiptsRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryReceiptsResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryReceiptsRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryReceiptsRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryReceiptsResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryReceiptsResponse,
  },
  // WithdrawalRecords provides data on the active withdrawals.
zoneWithdrawalRecords: {
    path: '/quicksilver.interchainstaking.v1.Query/ZoneWithdrawalRecords',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryWithdrawalRecordsRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryWithdrawalRecordsResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsResponse,
  },
  // WithdrawalRecords provides data on the active withdrawals.
withdrawalRecords: {
    path: '/quicksilver.interchainstaking.v1.Query/WithdrawalRecords',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryWithdrawalRecordsRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryWithdrawalRecordsResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryWithdrawalRecordsResponse,
  },
  // UnbondingRecords provides data on the active unbondings.
unbondingRecords: {
    path: '/quicksilver.interchainstaking.v1.Query/UnbondingRecords',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryUnbondingRecordsRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryUnbondingRecordsResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryUnbondingRecordsRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryUnbondingRecordsRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryUnbondingRecordsResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryUnbondingRecordsResponse,
  },
  // RedelegationRecords provides data on the active unbondings.
redelegationRecords: {
    path: '/quicksilver.interchainstaking.v1.Query/RedelegationRecords',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryRedelegationRecordsRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryRedelegationRecordsResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryRedelegationRecordsRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryRedelegationRecordsRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryRedelegationRecordsResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryRedelegationRecordsResponse,
  },
  // MappedAccounts provides data on the mapped accounts for a given user over different host chains.
mappedAccounts: {
    path: '/quicksilver.interchainstaking.v1.Query/MappedAccounts',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_query_pb.QueryMappedAccountsRequest,
    responseType: quicksilver_interchainstaking_v1_query_pb.QueryMappedAccountsResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_QueryMappedAccountsRequest,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryMappedAccountsRequest,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_QueryMappedAccountsResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_QueryMappedAccountsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
