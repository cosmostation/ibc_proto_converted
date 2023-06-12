// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_stakeibc_query_pb = require('../../stride/stakeibc/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var stride_stakeibc_params_pb = require('../../stride/stakeibc/params_pb.js');
var stride_stakeibc_validator_pb = require('../../stride/stakeibc/validator_pb.js');
var stride_stakeibc_host_zone_pb = require('../../stride/stakeibc/host_zone_pb.js');
var stride_stakeibc_epoch_tracker_pb = require('../../stride/stakeibc/epoch_tracker_pb.js');
var stride_stakeibc_address_unbonding_pb = require('../../stride/stakeibc/address_unbonding_pb.js');

function serialize_stride_stakeibc_QueryAddressUnbondings(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryAddressUnbondings)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryAddressUnbondings');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryAddressUnbondings(buffer_arg) {
  return stride_stakeibc_query_pb.QueryAddressUnbondings.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryAddressUnbondingsResponse(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryAddressUnbondingsResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryAddressUnbondingsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryAddressUnbondingsResponse(buffer_arg) {
  return stride_stakeibc_query_pb.QueryAddressUnbondingsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryAllEpochTrackerRequest(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryAllEpochTrackerRequest)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryAllEpochTrackerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryAllEpochTrackerRequest(buffer_arg) {
  return stride_stakeibc_query_pb.QueryAllEpochTrackerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryAllEpochTrackerResponse(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryAllEpochTrackerResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryAllEpochTrackerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryAllEpochTrackerResponse(buffer_arg) {
  return stride_stakeibc_query_pb.QueryAllEpochTrackerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryAllHostZoneRequest(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryAllHostZoneRequest)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryAllHostZoneRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryAllHostZoneRequest(buffer_arg) {
  return stride_stakeibc_query_pb.QueryAllHostZoneRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryAllHostZoneResponse(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryAllHostZoneResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryAllHostZoneResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryAllHostZoneResponse(buffer_arg) {
  return stride_stakeibc_query_pb.QueryAllHostZoneResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryGetEpochTrackerRequest(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryGetEpochTrackerRequest)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryGetEpochTrackerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryGetEpochTrackerRequest(buffer_arg) {
  return stride_stakeibc_query_pb.QueryGetEpochTrackerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryGetEpochTrackerResponse(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryGetEpochTrackerResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryGetEpochTrackerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryGetEpochTrackerResponse(buffer_arg) {
  return stride_stakeibc_query_pb.QueryGetEpochTrackerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryGetHostZoneRequest(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryGetHostZoneRequest)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryGetHostZoneRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryGetHostZoneRequest(buffer_arg) {
  return stride_stakeibc_query_pb.QueryGetHostZoneRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryGetHostZoneResponse(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryGetHostZoneResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryGetHostZoneResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryGetHostZoneResponse(buffer_arg) {
  return stride_stakeibc_query_pb.QueryGetHostZoneResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryGetNextPacketSequenceRequest(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryGetNextPacketSequenceRequest)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryGetNextPacketSequenceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryGetNextPacketSequenceRequest(buffer_arg) {
  return stride_stakeibc_query_pb.QueryGetNextPacketSequenceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryGetNextPacketSequenceResponse(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryGetNextPacketSequenceResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryGetNextPacketSequenceResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryGetNextPacketSequenceResponse(buffer_arg) {
  return stride_stakeibc_query_pb.QueryGetNextPacketSequenceResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryGetValidatorsRequest(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryGetValidatorsRequest)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryGetValidatorsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryGetValidatorsRequest(buffer_arg) {
  return stride_stakeibc_query_pb.QueryGetValidatorsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryGetValidatorsResponse(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryGetValidatorsResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryGetValidatorsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryGetValidatorsResponse(buffer_arg) {
  return stride_stakeibc_query_pb.QueryGetValidatorsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryInterchainAccountFromAddressRequest(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryInterchainAccountFromAddressRequest)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryInterchainAccountFromAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryInterchainAccountFromAddressRequest(buffer_arg) {
  return stride_stakeibc_query_pb.QueryInterchainAccountFromAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryInterchainAccountFromAddressResponse(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryInterchainAccountFromAddressResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryInterchainAccountFromAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryInterchainAccountFromAddressResponse(buffer_arg) {
  return stride_stakeibc_query_pb.QueryInterchainAccountFromAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryModuleAddressRequest(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryModuleAddressRequest)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryModuleAddressRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryModuleAddressRequest(buffer_arg) {
  return stride_stakeibc_query_pb.QueryModuleAddressRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryModuleAddressResponse(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryModuleAddressResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryModuleAddressResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryModuleAddressResponse(buffer_arg) {
  return stride_stakeibc_query_pb.QueryModuleAddressResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryParamsRequest(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryParamsRequest(buffer_arg) {
  return stride_stakeibc_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_stakeibc_QueryParamsResponse(arg) {
  if (!(arg instanceof stride_stakeibc_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stride.stakeibc.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_stakeibc_QueryParamsResponse(buffer_arg) {
  return stride_stakeibc_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stride.stakeibc.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_query_pb.QueryParamsRequest,
    responseType: stride_stakeibc_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stride_stakeibc_QueryParamsRequest,
    requestDeserialize: deserialize_stride_stakeibc_QueryParamsRequest,
    responseSerialize: serialize_stride_stakeibc_QueryParamsResponse,
    responseDeserialize: deserialize_stride_stakeibc_QueryParamsResponse,
  },
  // Queries a Validator by host zone.
validators: {
    path: '/stride.stakeibc.Query/Validators',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_query_pb.QueryGetValidatorsRequest,
    responseType: stride_stakeibc_query_pb.QueryGetValidatorsResponse,
    requestSerialize: serialize_stride_stakeibc_QueryGetValidatorsRequest,
    requestDeserialize: deserialize_stride_stakeibc_QueryGetValidatorsRequest,
    responseSerialize: serialize_stride_stakeibc_QueryGetValidatorsResponse,
    responseDeserialize: deserialize_stride_stakeibc_QueryGetValidatorsResponse,
  },
  // Queries a HostZone by id.
hostZone: {
    path: '/stride.stakeibc.Query/HostZone',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_query_pb.QueryGetHostZoneRequest,
    responseType: stride_stakeibc_query_pb.QueryGetHostZoneResponse,
    requestSerialize: serialize_stride_stakeibc_QueryGetHostZoneRequest,
    requestDeserialize: deserialize_stride_stakeibc_QueryGetHostZoneRequest,
    responseSerialize: serialize_stride_stakeibc_QueryGetHostZoneResponse,
    responseDeserialize: deserialize_stride_stakeibc_QueryGetHostZoneResponse,
  },
  // Queries a list of HostZone items.
hostZoneAll: {
    path: '/stride.stakeibc.Query/HostZoneAll',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_query_pb.QueryAllHostZoneRequest,
    responseType: stride_stakeibc_query_pb.QueryAllHostZoneResponse,
    requestSerialize: serialize_stride_stakeibc_QueryAllHostZoneRequest,
    requestDeserialize: deserialize_stride_stakeibc_QueryAllHostZoneRequest,
    responseSerialize: serialize_stride_stakeibc_QueryAllHostZoneResponse,
    responseDeserialize: deserialize_stride_stakeibc_QueryAllHostZoneResponse,
  },
  // Queries a list of ModuleAddress items.
moduleAddress: {
    path: '/stride.stakeibc.Query/ModuleAddress',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_query_pb.QueryModuleAddressRequest,
    responseType: stride_stakeibc_query_pb.QueryModuleAddressResponse,
    requestSerialize: serialize_stride_stakeibc_QueryModuleAddressRequest,
    requestDeserialize: deserialize_stride_stakeibc_QueryModuleAddressRequest,
    responseSerialize: serialize_stride_stakeibc_QueryModuleAddressResponse,
    responseDeserialize: deserialize_stride_stakeibc_QueryModuleAddressResponse,
  },
  // QueryInterchainAccountFromAddress returns the interchain account for given
// owner address on a given connection pair
interchainAccountFromAddress: {
    path: '/stride.stakeibc.Query/InterchainAccountFromAddress',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_query_pb.QueryInterchainAccountFromAddressRequest,
    responseType: stride_stakeibc_query_pb.QueryInterchainAccountFromAddressResponse,
    requestSerialize: serialize_stride_stakeibc_QueryInterchainAccountFromAddressRequest,
    requestDeserialize: deserialize_stride_stakeibc_QueryInterchainAccountFromAddressRequest,
    responseSerialize: serialize_stride_stakeibc_QueryInterchainAccountFromAddressResponse,
    responseDeserialize: deserialize_stride_stakeibc_QueryInterchainAccountFromAddressResponse,
  },
  // Queries a EpochTracker by index.
epochTracker: {
    path: '/stride.stakeibc.Query/EpochTracker',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_query_pb.QueryGetEpochTrackerRequest,
    responseType: stride_stakeibc_query_pb.QueryGetEpochTrackerResponse,
    requestSerialize: serialize_stride_stakeibc_QueryGetEpochTrackerRequest,
    requestDeserialize: deserialize_stride_stakeibc_QueryGetEpochTrackerRequest,
    responseSerialize: serialize_stride_stakeibc_QueryGetEpochTrackerResponse,
    responseDeserialize: deserialize_stride_stakeibc_QueryGetEpochTrackerResponse,
  },
  // Queries a list of EpochTracker items.
epochTrackerAll: {
    path: '/stride.stakeibc.Query/EpochTrackerAll',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_query_pb.QueryAllEpochTrackerRequest,
    responseType: stride_stakeibc_query_pb.QueryAllEpochTrackerResponse,
    requestSerialize: serialize_stride_stakeibc_QueryAllEpochTrackerRequest,
    requestDeserialize: deserialize_stride_stakeibc_QueryAllEpochTrackerRequest,
    responseSerialize: serialize_stride_stakeibc_QueryAllEpochTrackerResponse,
    responseDeserialize: deserialize_stride_stakeibc_QueryAllEpochTrackerResponse,
  },
  // Queries the next packet sequence for one for a given channel
nextPacketSequence: {
    path: '/stride.stakeibc.Query/NextPacketSequence',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_query_pb.QueryGetNextPacketSequenceRequest,
    responseType: stride_stakeibc_query_pb.QueryGetNextPacketSequenceResponse,
    requestSerialize: serialize_stride_stakeibc_QueryGetNextPacketSequenceRequest,
    requestDeserialize: deserialize_stride_stakeibc_QueryGetNextPacketSequenceRequest,
    responseSerialize: serialize_stride_stakeibc_QueryGetNextPacketSequenceResponse,
    responseDeserialize: deserialize_stride_stakeibc_QueryGetNextPacketSequenceResponse,
  },
  // Queries an address's unbondings
addressUnbondings: {
    path: '/stride.stakeibc.Query/AddressUnbondings',
    requestStream: false,
    responseStream: false,
    requestType: stride_stakeibc_query_pb.QueryAddressUnbondings,
    responseType: stride_stakeibc_query_pb.QueryAddressUnbondingsResponse,
    requestSerialize: serialize_stride_stakeibc_QueryAddressUnbondings,
    requestDeserialize: deserialize_stride_stakeibc_QueryAddressUnbondings,
    responseSerialize: serialize_stride_stakeibc_QueryAddressUnbondingsResponse,
    responseDeserialize: deserialize_stride_stakeibc_QueryAddressUnbondingsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
