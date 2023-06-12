// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var desmos_profiles_v3_query_profile_pb = require('../../../desmos/profiles/v3/query_profile_pb.js');
var desmos_profiles_v3_query_dtag_requests_pb = require('../../../desmos/profiles/v3/query_dtag_requests_pb.js');
var desmos_profiles_v3_query_params_pb = require('../../../desmos/profiles/v3/query_params_pb.js');
var desmos_profiles_v3_query_chain_links_pb = require('../../../desmos/profiles/v3/query_chain_links_pb.js');
var desmos_profiles_v3_query_app_links_pb = require('../../../desmos/profiles/v3/query_app_links_pb.js');

function serialize_desmos_profiles_v3_QueryApplicationLinkByClientIDRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkByClientIDRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryApplicationLinkByClientIDRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryApplicationLinkByClientIDRequest(buffer_arg) {
  return desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkByClientIDRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryApplicationLinkByClientIDResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkByClientIDResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryApplicationLinkByClientIDResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryApplicationLinkByClientIDResponse(buffer_arg) {
  return desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkByClientIDResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryApplicationLinkOwnersRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkOwnersRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryApplicationLinkOwnersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryApplicationLinkOwnersRequest(buffer_arg) {
  return desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkOwnersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryApplicationLinkOwnersResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkOwnersResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryApplicationLinkOwnersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryApplicationLinkOwnersResponse(buffer_arg) {
  return desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkOwnersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryApplicationLinksRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_app_links_pb.QueryApplicationLinksRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryApplicationLinksRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryApplicationLinksRequest(buffer_arg) {
  return desmos_profiles_v3_query_app_links_pb.QueryApplicationLinksRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryApplicationLinksResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_app_links_pb.QueryApplicationLinksResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryApplicationLinksResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryApplicationLinksResponse(buffer_arg) {
  return desmos_profiles_v3_query_app_links_pb.QueryApplicationLinksResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryChainLinkOwnersRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_chain_links_pb.QueryChainLinkOwnersRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryChainLinkOwnersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryChainLinkOwnersRequest(buffer_arg) {
  return desmos_profiles_v3_query_chain_links_pb.QueryChainLinkOwnersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryChainLinkOwnersResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_chain_links_pb.QueryChainLinkOwnersResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryChainLinkOwnersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryChainLinkOwnersResponse(buffer_arg) {
  return desmos_profiles_v3_query_chain_links_pb.QueryChainLinkOwnersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryChainLinksRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_chain_links_pb.QueryChainLinksRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryChainLinksRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryChainLinksRequest(buffer_arg) {
  return desmos_profiles_v3_query_chain_links_pb.QueryChainLinksRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryChainLinksResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_chain_links_pb.QueryChainLinksResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryChainLinksResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryChainLinksResponse(buffer_arg) {
  return desmos_profiles_v3_query_chain_links_pb.QueryChainLinksResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryDefaultExternalAddressesRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_chain_links_pb.QueryDefaultExternalAddressesRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryDefaultExternalAddressesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryDefaultExternalAddressesRequest(buffer_arg) {
  return desmos_profiles_v3_query_chain_links_pb.QueryDefaultExternalAddressesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryDefaultExternalAddressesResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_chain_links_pb.QueryDefaultExternalAddressesResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryDefaultExternalAddressesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryDefaultExternalAddressesResponse(buffer_arg) {
  return desmos_profiles_v3_query_chain_links_pb.QueryDefaultExternalAddressesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryIncomingDTagTransferRequestsRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_dtag_requests_pb.QueryIncomingDTagTransferRequestsRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryIncomingDTagTransferRequestsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryIncomingDTagTransferRequestsRequest(buffer_arg) {
  return desmos_profiles_v3_query_dtag_requests_pb.QueryIncomingDTagTransferRequestsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryIncomingDTagTransferRequestsResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_dtag_requests_pb.QueryIncomingDTagTransferRequestsResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryIncomingDTagTransferRequestsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryIncomingDTagTransferRequestsResponse(buffer_arg) {
  return desmos_profiles_v3_query_dtag_requests_pb.QueryIncomingDTagTransferRequestsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryParamsRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_params_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryParamsRequest(buffer_arg) {
  return desmos_profiles_v3_query_params_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryParamsResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_params_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryParamsResponse(buffer_arg) {
  return desmos_profiles_v3_query_params_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryProfileRequest(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_profile_pb.QueryProfileRequest)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryProfileRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryProfileRequest(buffer_arg) {
  return desmos_profiles_v3_query_profile_pb.QueryProfileRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_desmos_profiles_v3_QueryProfileResponse(arg) {
  if (!(arg instanceof desmos_profiles_v3_query_profile_pb.QueryProfileResponse)) {
    throw new Error('Expected argument of type desmos.profiles.v3.QueryProfileResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_desmos_profiles_v3_QueryProfileResponse(buffer_arg) {
  return desmos_profiles_v3_query_profile_pb.QueryProfileResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Profile queries the profile of a specific user given their DTag or address.
// If the queried user does not have a profile, the returned response will
// contain a null profile.
profile: {
    path: '/desmos.profiles.v3.Query/Profile',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_query_profile_pb.QueryProfileRequest,
    responseType: desmos_profiles_v3_query_profile_pb.QueryProfileResponse,
    requestSerialize: serialize_desmos_profiles_v3_QueryProfileRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_QueryProfileRequest,
    responseSerialize: serialize_desmos_profiles_v3_QueryProfileResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_QueryProfileResponse,
  },
  // IncomingDTagTransferRequests queries all the DTag transfers requests that
// have been made towards the user with the given address
incomingDTagTransferRequests: {
    path: '/desmos.profiles.v3.Query/IncomingDTagTransferRequests',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_query_dtag_requests_pb.QueryIncomingDTagTransferRequestsRequest,
    responseType: desmos_profiles_v3_query_dtag_requests_pb.QueryIncomingDTagTransferRequestsResponse,
    requestSerialize: serialize_desmos_profiles_v3_QueryIncomingDTagTransferRequestsRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_QueryIncomingDTagTransferRequestsRequest,
    responseSerialize: serialize_desmos_profiles_v3_QueryIncomingDTagTransferRequestsResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_QueryIncomingDTagTransferRequestsResponse,
  },
  // ChainLinks queries the chain links associated to the given user, if
// provided. Otherwise it queries all the chain links stored.
chainLinks: {
    path: '/desmos.profiles.v3.Query/ChainLinks',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_query_chain_links_pb.QueryChainLinksRequest,
    responseType: desmos_profiles_v3_query_chain_links_pb.QueryChainLinksResponse,
    requestSerialize: serialize_desmos_profiles_v3_QueryChainLinksRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_QueryChainLinksRequest,
    responseSerialize: serialize_desmos_profiles_v3_QueryChainLinksResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_QueryChainLinksResponse,
  },
  // ChainLinkOwners queries for the owners of chain links, optionally searching
// for a specific chain name and external address
chainLinkOwners: {
    path: '/desmos.profiles.v3.Query/ChainLinkOwners',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_query_chain_links_pb.QueryChainLinkOwnersRequest,
    responseType: desmos_profiles_v3_query_chain_links_pb.QueryChainLinkOwnersResponse,
    requestSerialize: serialize_desmos_profiles_v3_QueryChainLinkOwnersRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_QueryChainLinkOwnersRequest,
    responseSerialize: serialize_desmos_profiles_v3_QueryChainLinkOwnersResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_QueryChainLinkOwnersResponse,
  },
  // DefaultExternalAddresses queries the default addresses associated to the
// given user and (optionally) chain name
defaultExternalAddresses: {
    path: '/desmos.profiles.v3.Query/DefaultExternalAddresses',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_query_chain_links_pb.QueryDefaultExternalAddressesRequest,
    responseType: desmos_profiles_v3_query_chain_links_pb.QueryDefaultExternalAddressesResponse,
    requestSerialize: serialize_desmos_profiles_v3_QueryDefaultExternalAddressesRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_QueryDefaultExternalAddressesRequest,
    responseSerialize: serialize_desmos_profiles_v3_QueryDefaultExternalAddressesResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_QueryDefaultExternalAddressesResponse,
  },
  // ApplicationLinks queries the applications links associated to the given
// user, if provided. Otherwise, it queries all the application links stored.
applicationLinks: {
    path: '/desmos.profiles.v3.Query/ApplicationLinks',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_query_app_links_pb.QueryApplicationLinksRequest,
    responseType: desmos_profiles_v3_query_app_links_pb.QueryApplicationLinksResponse,
    requestSerialize: serialize_desmos_profiles_v3_QueryApplicationLinksRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_QueryApplicationLinksRequest,
    responseSerialize: serialize_desmos_profiles_v3_QueryApplicationLinksResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_QueryApplicationLinksResponse,
  },
  // ApplicationLinkByClientID queries a single application link for a given
// client id.
applicationLinkByClientID: {
    path: '/desmos.profiles.v3.Query/ApplicationLinkByClientID',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkByClientIDRequest,
    responseType: desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkByClientIDResponse,
    requestSerialize: serialize_desmos_profiles_v3_QueryApplicationLinkByClientIDRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_QueryApplicationLinkByClientIDRequest,
    responseSerialize: serialize_desmos_profiles_v3_QueryApplicationLinkByClientIDResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_QueryApplicationLinkByClientIDResponse,
  },
  // ApplicationLinkOwners queries for the owners of applications links,
// optionally searching for a specific application and username.
applicationLinkOwners: {
    path: '/desmos.profiles.v3.Query/ApplicationLinkOwners',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkOwnersRequest,
    responseType: desmos_profiles_v3_query_app_links_pb.QueryApplicationLinkOwnersResponse,
    requestSerialize: serialize_desmos_profiles_v3_QueryApplicationLinkOwnersRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_QueryApplicationLinkOwnersRequest,
    responseSerialize: serialize_desmos_profiles_v3_QueryApplicationLinkOwnersResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_QueryApplicationLinkOwnersResponse,
  },
  // Params queries the profiles module params
params: {
    path: '/desmos.profiles.v3.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: desmos_profiles_v3_query_params_pb.QueryParamsRequest,
    responseType: desmos_profiles_v3_query_params_pb.QueryParamsResponse,
    requestSerialize: serialize_desmos_profiles_v3_QueryParamsRequest,
    requestDeserialize: deserialize_desmos_profiles_v3_QueryParamsRequest,
    responseSerialize: serialize_desmos_profiles_v3_QueryParamsResponse,
    responseDeserialize: deserialize_desmos_profiles_v3_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
