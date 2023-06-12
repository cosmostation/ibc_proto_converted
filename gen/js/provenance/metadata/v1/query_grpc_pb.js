// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_metadata_v1_query_pb = require('../../../provenance/metadata/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var provenance_metadata_v1_metadata_pb = require('../../../provenance/metadata/v1/metadata_pb.js');
var provenance_metadata_v1_scope_pb = require('../../../provenance/metadata/v1/scope_pb.js');
var provenance_metadata_v1_specification_pb = require('../../../provenance/metadata/v1/specification_pb.js');
var provenance_metadata_v1_objectstore_pb = require('../../../provenance/metadata/v1/objectstore_pb.js');

function serialize_provenance_metadata_v1_AccountDataRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.AccountDataRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.AccountDataRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_AccountDataRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.AccountDataRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_AccountDataResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.AccountDataResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.AccountDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_AccountDataResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.AccountDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ContractSpecificationRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ContractSpecificationRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ContractSpecificationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ContractSpecificationRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.ContractSpecificationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ContractSpecificationResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ContractSpecificationResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ContractSpecificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ContractSpecificationResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.ContractSpecificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ContractSpecificationsAllRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ContractSpecificationsAllRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ContractSpecificationsAllRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ContractSpecificationsAllRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.ContractSpecificationsAllRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ContractSpecificationsAllResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ContractSpecificationsAllResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ContractSpecificationsAllResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ContractSpecificationsAllResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.ContractSpecificationsAllResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OSAllLocatorsRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OSAllLocatorsRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OSAllLocatorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OSAllLocatorsRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.OSAllLocatorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OSAllLocatorsResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OSAllLocatorsResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OSAllLocatorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OSAllLocatorsResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.OSAllLocatorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OSLocatorParamsRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OSLocatorParamsRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OSLocatorParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OSLocatorParamsRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.OSLocatorParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OSLocatorParamsResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OSLocatorParamsResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OSLocatorParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OSLocatorParamsResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.OSLocatorParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OSLocatorRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OSLocatorRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OSLocatorRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OSLocatorRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.OSLocatorRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OSLocatorResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OSLocatorResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OSLocatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OSLocatorResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.OSLocatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OSLocatorsByScopeRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OSLocatorsByScopeRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OSLocatorsByScopeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OSLocatorsByScopeRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.OSLocatorsByScopeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OSLocatorsByScopeResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OSLocatorsByScopeResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OSLocatorsByScopeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OSLocatorsByScopeResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.OSLocatorsByScopeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OSLocatorsByURIRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OSLocatorsByURIRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OSLocatorsByURIRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OSLocatorsByURIRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.OSLocatorsByURIRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OSLocatorsByURIResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OSLocatorsByURIResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OSLocatorsByURIResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OSLocatorsByURIResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.OSLocatorsByURIResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OwnershipRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OwnershipRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OwnershipRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OwnershipRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.OwnershipRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_OwnershipResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.OwnershipResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.OwnershipResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_OwnershipResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.OwnershipResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_QueryParamsRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_QueryParamsRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_QueryParamsResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_QueryParamsResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_RecordSpecificationRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.RecordSpecificationRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.RecordSpecificationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_RecordSpecificationRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.RecordSpecificationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_RecordSpecificationResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.RecordSpecificationResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.RecordSpecificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_RecordSpecificationResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.RecordSpecificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_RecordSpecificationsAllRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.RecordSpecificationsAllRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.RecordSpecificationsAllRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_RecordSpecificationsAllRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.RecordSpecificationsAllRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_RecordSpecificationsAllResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.RecordSpecificationsAllResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.RecordSpecificationsAllResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_RecordSpecificationsAllResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.RecordSpecificationsAllResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_RecordSpecificationsForContractSpecificationRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.RecordSpecificationsForContractSpecificationRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.RecordSpecificationsForContractSpecificationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_RecordSpecificationsForContractSpecificationRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.RecordSpecificationsForContractSpecificationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_RecordSpecificationsForContractSpecificationResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.RecordSpecificationsForContractSpecificationResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.RecordSpecificationsForContractSpecificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_RecordSpecificationsForContractSpecificationResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.RecordSpecificationsForContractSpecificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_RecordsAllRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.RecordsAllRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.RecordsAllRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_RecordsAllRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.RecordsAllRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_RecordsAllResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.RecordsAllResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.RecordsAllResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_RecordsAllResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.RecordsAllResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_RecordsRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.RecordsRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.RecordsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_RecordsRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.RecordsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_RecordsResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.RecordsResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.RecordsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_RecordsResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.RecordsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ScopeRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ScopeRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ScopeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ScopeRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.ScopeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ScopeResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ScopeResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ScopeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ScopeResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.ScopeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ScopeSpecificationRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ScopeSpecificationRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ScopeSpecificationRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ScopeSpecificationRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.ScopeSpecificationRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ScopeSpecificationResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ScopeSpecificationResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ScopeSpecificationResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ScopeSpecificationResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.ScopeSpecificationResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ScopeSpecificationsAllRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ScopeSpecificationsAllRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ScopeSpecificationsAllRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ScopeSpecificationsAllRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.ScopeSpecificationsAllRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ScopeSpecificationsAllResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ScopeSpecificationsAllResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ScopeSpecificationsAllResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ScopeSpecificationsAllResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.ScopeSpecificationsAllResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ScopesAllRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ScopesAllRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ScopesAllRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ScopesAllRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.ScopesAllRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ScopesAllResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ScopesAllResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ScopesAllResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ScopesAllResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.ScopesAllResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_SessionsAllRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.SessionsAllRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.SessionsAllRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_SessionsAllRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.SessionsAllRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_SessionsAllResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.SessionsAllResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.SessionsAllResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_SessionsAllResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.SessionsAllResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_SessionsRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.SessionsRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.SessionsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_SessionsRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.SessionsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_SessionsResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.SessionsResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.SessionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_SessionsResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.SessionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ValueOwnershipRequest(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ValueOwnershipRequest)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ValueOwnershipRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ValueOwnershipRequest(buffer_arg) {
  return provenance_metadata_v1_query_pb.ValueOwnershipRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_metadata_v1_ValueOwnershipResponse(arg) {
  if (!(arg instanceof provenance_metadata_v1_query_pb.ValueOwnershipResponse)) {
    throw new Error('Expected argument of type provenance.metadata.v1.ValueOwnershipResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_metadata_v1_ValueOwnershipResponse(buffer_arg) {
  return provenance_metadata_v1_query_pb.ValueOwnershipResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the Metadata Query service.
var QueryService = exports.QueryService = {
  // Params queries the parameters of x/metadata module.
params: {
    path: '/provenance.metadata.v1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.QueryParamsRequest,
    responseType: provenance_metadata_v1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_provenance_metadata_v1_QueryParamsRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_QueryParamsRequest,
    responseSerialize: serialize_provenance_metadata_v1_QueryParamsResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_QueryParamsResponse,
  },
  // ---- Primary Data Queries -----
//
// Scope searches for a scope.
//
// The scope id, if provided, must either be scope uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address,
// e.g. scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. The session addr, if provided, must be a bech32 session address,
// e.g. session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The record_addr, if provided, must be a
// bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
//
// * If only a scope_id is provided, that scope is returned.
// * If only a session_addr is provided, the scope containing that session is returned.
// * If only a record_addr is provided, the scope containing that record is returned.
// * If more than one of scope_id, session_addr, and record_addr are provided, and they don't refer to the same scope,
// a bad request is returned.
//
// Providing a session addr or record addr does not limit the sessions and records returned (if requested).
// Those parameters are only used to find the scope.
//
// By default, sessions and records are not included.
// Set include_sessions and/or include_records to true to include sessions and/or records.
scope: {
    path: '/provenance.metadata.v1.Query/Scope',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.ScopeRequest,
    responseType: provenance_metadata_v1_query_pb.ScopeResponse,
    requestSerialize: serialize_provenance_metadata_v1_ScopeRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_ScopeRequest,
    responseSerialize: serialize_provenance_metadata_v1_ScopeResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_ScopeResponse,
  },
  // ScopesAll retrieves all scopes.
scopesAll: {
    path: '/provenance.metadata.v1.Query/ScopesAll',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.ScopesAllRequest,
    responseType: provenance_metadata_v1_query_pb.ScopesAllResponse,
    requestSerialize: serialize_provenance_metadata_v1_ScopesAllRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_ScopesAllRequest,
    responseSerialize: serialize_provenance_metadata_v1_ScopesAllResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_ScopesAllResponse,
  },
  // Sessions searches for sessions.
//
// The scope_id can either be scope uuid, e.g. 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address, e.g.
// scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. Similarly, the session_id can either be a uuid or session address, e.g.
// session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The record_addr, if provided, must be a
// bech32 record address, e.g. record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3.
//
// * If only a scope_id is provided, all sessions in that scope are returned.
// * If only a session_id is provided, it must be an address, and that single session is returned.
// * If the session_id is a uuid, then either a scope_id or record_addr must also be provided, and that single session
// is returned.
// * If only a record_addr is provided, the session containing that record will be returned.
// * If a record_name is provided then either a scope_id, session_id as an address, or record_addr must also be
// provided, and the session containing that record will be returned.
//
// A bad request is returned if:
// * The session_id is a uuid and is provided without a scope_id or record_addr.
// * A record_name is provided without any way to identify the scope (e.g. a scope_id, a session_id as an address, or
// a record_addr).
// * Two or more of scope_id, session_id as an address, and record_addr are provided and don't all refer to the same
// scope.
// * A record_addr (or scope_id and record_name) is provided with a session_id and that session does not contain such
// a record.
// * A record_addr and record_name are both provided, but reference different records.
//
// By default, the scope and records are not included.
// Set include_scope and/or include_records to true to include the scope and/or records.
sessions: {
    path: '/provenance.metadata.v1.Query/Sessions',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.SessionsRequest,
    responseType: provenance_metadata_v1_query_pb.SessionsResponse,
    requestSerialize: serialize_provenance_metadata_v1_SessionsRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_SessionsRequest,
    responseSerialize: serialize_provenance_metadata_v1_SessionsResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_SessionsResponse,
  },
  // SessionsAll retrieves all sessions.
sessionsAll: {
    path: '/provenance.metadata.v1.Query/SessionsAll',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.SessionsAllRequest,
    responseType: provenance_metadata_v1_query_pb.SessionsAllResponse,
    requestSerialize: serialize_provenance_metadata_v1_SessionsAllRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_SessionsAllRequest,
    responseSerialize: serialize_provenance_metadata_v1_SessionsAllResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_SessionsAllResponse,
  },
  // Records searches for records.
//
// The record_addr, if provided, must be a bech32 record address, e.g.
// record1q2ge0zaztu65tx5x5llv5xc9ztsw42dq2jdvmdazuwzcaddhh8gmu3mcze3. The scope-id can either be scope uuid, e.g.
// 91978ba2-5f35-459a-86a7-feca1b0512e0 or a scope address, e.g. scope1qzge0zaztu65tx5x5llv5xc9ztsqxlkwel. Similarly,
// the session_id can either be a uuid or session address, e.g.
// session1qxge0zaztu65tx5x5llv5xc9zts9sqlch3sxwn44j50jzgt8rshvqyfrjcr. The name is the name of the record you're
// interested in.
//
// * If only a record_addr is provided, that single record will be returned.
// * If only a scope_id is provided, all records in that scope will be returned.
// * If only a session_id (or scope_id/session_id), all records in that session will be returned.
// * If a name is provided with a scope_id and/or session_id, that single record will be returned.
//
// A bad request is returned if:
// * The session_id is a uuid and no scope_id is provided.
// * There are two or more of record_addr, session_id, and scope_id, and they don't all refer to the same scope.
// * A name is provided, but not a scope_id and/or a session_id.
// * A name and record_addr are provided and the name doesn't match the record_addr.
//
// By default, the scope and sessions are not included.
// Set include_scope and/or include_sessions to true to include the scope and/or sessions.
records: {
    path: '/provenance.metadata.v1.Query/Records',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.RecordsRequest,
    responseType: provenance_metadata_v1_query_pb.RecordsResponse,
    requestSerialize: serialize_provenance_metadata_v1_RecordsRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_RecordsRequest,
    responseSerialize: serialize_provenance_metadata_v1_RecordsResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_RecordsResponse,
  },
  // RecordsAll retrieves all records.
recordsAll: {
    path: '/provenance.metadata.v1.Query/RecordsAll',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.RecordsAllRequest,
    responseType: provenance_metadata_v1_query_pb.RecordsAllResponse,
    requestSerialize: serialize_provenance_metadata_v1_RecordsAllRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_RecordsAllRequest,
    responseSerialize: serialize_provenance_metadata_v1_RecordsAllResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_RecordsAllResponse,
  },
  // Ownership returns the scope identifiers that list the given address as either a data or value owner.
ownership: {
    path: '/provenance.metadata.v1.Query/Ownership',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.OwnershipRequest,
    responseType: provenance_metadata_v1_query_pb.OwnershipResponse,
    requestSerialize: serialize_provenance_metadata_v1_OwnershipRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_OwnershipRequest,
    responseSerialize: serialize_provenance_metadata_v1_OwnershipResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_OwnershipResponse,
  },
  // ValueOwnership returns the scope identifiers that list the given address as the value owner.
valueOwnership: {
    path: '/provenance.metadata.v1.Query/ValueOwnership',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.ValueOwnershipRequest,
    responseType: provenance_metadata_v1_query_pb.ValueOwnershipResponse,
    requestSerialize: serialize_provenance_metadata_v1_ValueOwnershipRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_ValueOwnershipRequest,
    responseSerialize: serialize_provenance_metadata_v1_ValueOwnershipResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_ValueOwnershipResponse,
  },
  // ---- Specification Queries -----
//
// ScopeSpecification returns a scope specification for the given specification id.
//
// The specification_id can either be a uuid, e.g. dc83ea70-eacd-40fe-9adf-1cf6148bf8a2 or a bech32 scope
// specification address, e.g. scopespec1qnwg86nsatx5pl56muw0v9ytlz3qu3jx6m.
//
// By default, the contract and record specifications are not included.
// Set include_contract_specs and/or include_record_specs to true to include contract and/or record specifications.
scopeSpecification: {
    path: '/provenance.metadata.v1.Query/ScopeSpecification',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.ScopeSpecificationRequest,
    responseType: provenance_metadata_v1_query_pb.ScopeSpecificationResponse,
    requestSerialize: serialize_provenance_metadata_v1_ScopeSpecificationRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_ScopeSpecificationRequest,
    responseSerialize: serialize_provenance_metadata_v1_ScopeSpecificationResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_ScopeSpecificationResponse,
  },
  // ScopeSpecificationsAll retrieves all scope specifications.
scopeSpecificationsAll: {
    path: '/provenance.metadata.v1.Query/ScopeSpecificationsAll',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.ScopeSpecificationsAllRequest,
    responseType: provenance_metadata_v1_query_pb.ScopeSpecificationsAllResponse,
    requestSerialize: serialize_provenance_metadata_v1_ScopeSpecificationsAllRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_ScopeSpecificationsAllRequest,
    responseSerialize: serialize_provenance_metadata_v1_ScopeSpecificationsAllResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_ScopeSpecificationsAllResponse,
  },
  // ContractSpecification returns a contract specification for the given specification id.
//
// The specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84, a bech32 contract
// specification address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn, or a bech32 record specification
// address, e.g. recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44. If it is a record specification
// address, then the contract specification that contains that record specification is looked up.
//
// By default, the record specifications for this contract specification are not included.
// Set include_record_specs to true to include them in the result.
contractSpecification: {
    path: '/provenance.metadata.v1.Query/ContractSpecification',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.ContractSpecificationRequest,
    responseType: provenance_metadata_v1_query_pb.ContractSpecificationResponse,
    requestSerialize: serialize_provenance_metadata_v1_ContractSpecificationRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_ContractSpecificationRequest,
    responseSerialize: serialize_provenance_metadata_v1_ContractSpecificationResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_ContractSpecificationResponse,
  },
  // ContractSpecificationsAll retrieves all contract specifications.
contractSpecificationsAll: {
    path: '/provenance.metadata.v1.Query/ContractSpecificationsAll',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.ContractSpecificationsAllRequest,
    responseType: provenance_metadata_v1_query_pb.ContractSpecificationsAllResponse,
    requestSerialize: serialize_provenance_metadata_v1_ContractSpecificationsAllRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_ContractSpecificationsAllRequest,
    responseSerialize: serialize_provenance_metadata_v1_ContractSpecificationsAllResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_ContractSpecificationsAllResponse,
  },
  // RecordSpecificationsForContractSpecification returns the record specifications for the given input.
//
// The specification_id can either be a uuid, e.g. def6bc0a-c9dd-4874-948f-5206e6060a84, a bech32 contract
// specification address, e.g. contractspec1q000d0q2e8w5say53afqdesxp2zqzkr4fn, or a bech32 record specification
// address, e.g. recspec1qh00d0q2e8w5say53afqdesxp2zw42dq2jdvmdazuwzcaddhh8gmuqhez44. If it is a record specification
// address, then the contract specification that contains that record specification is used.
recordSpecificationsForContractSpecification: {
    path: '/provenance.metadata.v1.Query/RecordSpecificationsForContractSpecification',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.RecordSpecificationsForContractSpecificationRequest,
    responseType: provenance_metadata_v1_query_pb.RecordSpecificationsForContractSpecificationResponse,
    requestSerialize: serialize_provenance_metadata_v1_RecordSpecificationsForContractSpecificationRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_RecordSpecificationsForContractSpecificationRequest,
    responseSerialize: serialize_provenance_metadata_v1_RecordSpecificationsForContractSpecificationResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_RecordSpecificationsForContractSpecificationResponse,
  },
  // RecordSpecification returns a record specification for the given input.
recordSpecification: {
    path: '/provenance.metadata.v1.Query/RecordSpecification',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.RecordSpecificationRequest,
    responseType: provenance_metadata_v1_query_pb.RecordSpecificationResponse,
    requestSerialize: serialize_provenance_metadata_v1_RecordSpecificationRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_RecordSpecificationRequest,
    responseSerialize: serialize_provenance_metadata_v1_RecordSpecificationResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_RecordSpecificationResponse,
  },
  // RecordSpecificationsAll retrieves all record specifications.
recordSpecificationsAll: {
    path: '/provenance.metadata.v1.Query/RecordSpecificationsAll',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.RecordSpecificationsAllRequest,
    responseType: provenance_metadata_v1_query_pb.RecordSpecificationsAllResponse,
    requestSerialize: serialize_provenance_metadata_v1_RecordSpecificationsAllRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_RecordSpecificationsAllRequest,
    responseSerialize: serialize_provenance_metadata_v1_RecordSpecificationsAllResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_RecordSpecificationsAllResponse,
  },
  // ---- Object Store Locator Queries -----
//
// OSLocatorParams returns all parameters for the object store locator sub module.
oSLocatorParams: {
    path: '/provenance.metadata.v1.Query/OSLocatorParams',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.OSLocatorParamsRequest,
    responseType: provenance_metadata_v1_query_pb.OSLocatorParamsResponse,
    requestSerialize: serialize_provenance_metadata_v1_OSLocatorParamsRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_OSLocatorParamsRequest,
    responseSerialize: serialize_provenance_metadata_v1_OSLocatorParamsResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_OSLocatorParamsResponse,
  },
  // OSLocator returns an ObjectStoreLocator by its owner's address.
oSLocator: {
    path: '/provenance.metadata.v1.Query/OSLocator',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.OSLocatorRequest,
    responseType: provenance_metadata_v1_query_pb.OSLocatorResponse,
    requestSerialize: serialize_provenance_metadata_v1_OSLocatorRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_OSLocatorRequest,
    responseSerialize: serialize_provenance_metadata_v1_OSLocatorResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_OSLocatorResponse,
  },
  // OSLocatorsByURI returns all ObjectStoreLocator entries for a locator uri.
oSLocatorsByURI: {
    path: '/provenance.metadata.v1.Query/OSLocatorsByURI',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.OSLocatorsByURIRequest,
    responseType: provenance_metadata_v1_query_pb.OSLocatorsByURIResponse,
    requestSerialize: serialize_provenance_metadata_v1_OSLocatorsByURIRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_OSLocatorsByURIRequest,
    responseSerialize: serialize_provenance_metadata_v1_OSLocatorsByURIResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_OSLocatorsByURIResponse,
  },
  // OSLocatorsByScope returns all ObjectStoreLocator entries for a for all signer's present in the specified scope.
oSLocatorsByScope: {
    path: '/provenance.metadata.v1.Query/OSLocatorsByScope',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.OSLocatorsByScopeRequest,
    responseType: provenance_metadata_v1_query_pb.OSLocatorsByScopeResponse,
    requestSerialize: serialize_provenance_metadata_v1_OSLocatorsByScopeRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_OSLocatorsByScopeRequest,
    responseSerialize: serialize_provenance_metadata_v1_OSLocatorsByScopeResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_OSLocatorsByScopeResponse,
  },
  // OSAllLocators returns all ObjectStoreLocator entries.
oSAllLocators: {
    path: '/provenance.metadata.v1.Query/OSAllLocators',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.OSAllLocatorsRequest,
    responseType: provenance_metadata_v1_query_pb.OSAllLocatorsResponse,
    requestSerialize: serialize_provenance_metadata_v1_OSAllLocatorsRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_OSAllLocatorsRequest,
    responseSerialize: serialize_provenance_metadata_v1_OSAllLocatorsResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_OSAllLocatorsResponse,
  },
  // AccountData gets the account data associated with a metadata address.
// Currently, only scope ids are supported.
accountData: {
    path: '/provenance.metadata.v1.Query/AccountData',
    requestStream: false,
    responseStream: false,
    requestType: provenance_metadata_v1_query_pb.AccountDataRequest,
    responseType: provenance_metadata_v1_query_pb.AccountDataResponse,
    requestSerialize: serialize_provenance_metadata_v1_AccountDataRequest,
    requestDeserialize: deserialize_provenance_metadata_v1_AccountDataRequest,
    responseSerialize: serialize_provenance_metadata_v1_AccountDataResponse,
    responseDeserialize: deserialize_provenance_metadata_v1_AccountDataResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
