// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var noble_fiattokenfactory_query_pb = require('../../noble/fiattokenfactory/query_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var noble_fiattokenfactory_params_pb = require('../../noble/fiattokenfactory/params_pb.js');
var noble_fiattokenfactory_blacklisted_pb = require('../../noble/fiattokenfactory/blacklisted_pb.js');
var noble_fiattokenfactory_paused_pb = require('../../noble/fiattokenfactory/paused_pb.js');
var noble_fiattokenfactory_master_minter_pb = require('../../noble/fiattokenfactory/master_minter_pb.js');
var noble_fiattokenfactory_minters_pb = require('../../noble/fiattokenfactory/minters_pb.js');
var noble_fiattokenfactory_pauser_pb = require('../../noble/fiattokenfactory/pauser_pb.js');
var noble_fiattokenfactory_blacklister_pb = require('../../noble/fiattokenfactory/blacklister_pb.js');
var noble_fiattokenfactory_owner_pb = require('../../noble/fiattokenfactory/owner_pb.js');
var noble_fiattokenfactory_minter_controller_pb = require('../../noble/fiattokenfactory/minter_controller_pb.js');
var noble_fiattokenfactory_minting_denom_pb = require('../../noble/fiattokenfactory/minting_denom_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_noble_fiattokenfactory_QueryAllBlacklistedRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryAllBlacklistedRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryAllBlacklistedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryAllBlacklistedRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryAllBlacklistedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryAllBlacklistedResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryAllBlacklistedResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryAllBlacklistedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryAllBlacklistedResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryAllBlacklistedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryAllMinterControllerRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryAllMinterControllerRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryAllMinterControllerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryAllMinterControllerRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryAllMinterControllerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryAllMinterControllerResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryAllMinterControllerResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryAllMinterControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryAllMinterControllerResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryAllMinterControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryAllMintersRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryAllMintersRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryAllMintersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryAllMintersRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryAllMintersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryAllMintersResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryAllMintersResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryAllMintersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryAllMintersResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryAllMintersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetBlacklistedRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetBlacklistedRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetBlacklistedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetBlacklistedRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetBlacklistedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetBlacklistedResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetBlacklistedResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetBlacklistedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetBlacklistedResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetBlacklistedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetBlacklisterRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetBlacklisterRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetBlacklisterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetBlacklisterRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetBlacklisterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetBlacklisterResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetBlacklisterResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetBlacklisterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetBlacklisterResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetBlacklisterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetMasterMinterRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetMasterMinterRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetMasterMinterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetMasterMinterRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetMasterMinterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetMasterMinterResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetMasterMinterResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetMasterMinterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetMasterMinterResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetMasterMinterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetMinterControllerRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetMinterControllerRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetMinterControllerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetMinterControllerRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetMinterControllerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetMinterControllerResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetMinterControllerResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetMinterControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetMinterControllerResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetMinterControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetMintersRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetMintersRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetMintersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetMintersRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetMintersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetMintersResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetMintersResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetMintersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetMintersResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetMintersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetMintingDenomRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetMintingDenomRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetMintingDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetMintingDenomRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetMintingDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetMintingDenomResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetMintingDenomResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetMintingDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetMintingDenomResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetMintingDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetOwnerRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetOwnerRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetOwnerRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetOwnerResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetOwnerResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetOwnerResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetPausedRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetPausedRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetPausedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetPausedRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetPausedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetPausedResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetPausedResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetPausedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetPausedResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetPausedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetPauserRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetPauserRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetPauserRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetPauserRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetPauserRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryGetPauserResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryGetPauserResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryGetPauserResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryGetPauserResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryGetPauserResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryParamsRequest(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryParamsRequest(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_fiattokenfactory_QueryParamsResponse(arg) {
  if (!(arg instanceof noble_fiattokenfactory_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type noble.fiattokenfactory.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_fiattokenfactory_QueryParamsResponse(buffer_arg) {
  return noble_fiattokenfactory_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/noble.fiattokenfactory.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryParamsRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryParamsResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryParamsRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryParamsRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryParamsResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryParamsResponse,
  },
  // Queries a Blacklisted by index.
blacklisted: {
    path: '/noble.fiattokenfactory.Query/Blacklisted',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryGetBlacklistedRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryGetBlacklistedResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryGetBlacklistedRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryGetBlacklistedRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryGetBlacklistedResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryGetBlacklistedResponse,
  },
  // Queries a list of Blacklisted items.
blacklistedAll: {
    path: '/noble.fiattokenfactory.Query/BlacklistedAll',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryAllBlacklistedRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryAllBlacklistedResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryAllBlacklistedRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryAllBlacklistedRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryAllBlacklistedResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryAllBlacklistedResponse,
  },
  // Queries a Paused by index.
paused: {
    path: '/noble.fiattokenfactory.Query/Paused',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryGetPausedRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryGetPausedResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryGetPausedRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryGetPausedRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryGetPausedResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryGetPausedResponse,
  },
  // Queries a MasterMinter by index.
masterMinter: {
    path: '/noble.fiattokenfactory.Query/MasterMinter',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryGetMasterMinterRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryGetMasterMinterResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryGetMasterMinterRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryGetMasterMinterRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryGetMasterMinterResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryGetMasterMinterResponse,
  },
  // Queries a Minters by index.
minters: {
    path: '/noble.fiattokenfactory.Query/Minters',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryGetMintersRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryGetMintersResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryGetMintersRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryGetMintersRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryGetMintersResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryGetMintersResponse,
  },
  // Queries a list of Minters items.
mintersAll: {
    path: '/noble.fiattokenfactory.Query/MintersAll',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryAllMintersRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryAllMintersResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryAllMintersRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryAllMintersRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryAllMintersResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryAllMintersResponse,
  },
  // Queries a Pauser by index.
pauser: {
    path: '/noble.fiattokenfactory.Query/Pauser',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryGetPauserRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryGetPauserResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryGetPauserRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryGetPauserRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryGetPauserResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryGetPauserResponse,
  },
  // Queries a Blacklister by index.
blacklister: {
    path: '/noble.fiattokenfactory.Query/Blacklister',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryGetBlacklisterRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryGetBlacklisterResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryGetBlacklisterRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryGetBlacklisterRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryGetBlacklisterResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryGetBlacklisterResponse,
  },
  // Queries a Owner by index.
owner: {
    path: '/noble.fiattokenfactory.Query/Owner',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryGetOwnerRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryGetOwnerResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryGetOwnerRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryGetOwnerRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryGetOwnerResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryGetOwnerResponse,
  },
  // Queries a MinterController by index.
minterController: {
    path: '/noble.fiattokenfactory.Query/MinterController',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryGetMinterControllerRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryGetMinterControllerResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryGetMinterControllerRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryGetMinterControllerRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryGetMinterControllerResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryGetMinterControllerResponse,
  },
  // Queries a list of MinterController items.
minterControllerAll: {
    path: '/noble.fiattokenfactory.Query/MinterControllerAll',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryAllMinterControllerRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryAllMinterControllerResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryAllMinterControllerRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryAllMinterControllerRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryAllMinterControllerResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryAllMinterControllerResponse,
  },
  // Queries a MintingDenom by index.
mintingDenom: {
    path: '/noble.fiattokenfactory.Query/MintingDenom',
    requestStream: false,
    responseStream: false,
    requestType: noble_fiattokenfactory_query_pb.QueryGetMintingDenomRequest,
    responseType: noble_fiattokenfactory_query_pb.QueryGetMintingDenomResponse,
    requestSerialize: serialize_noble_fiattokenfactory_QueryGetMintingDenomRequest,
    requestDeserialize: deserialize_noble_fiattokenfactory_QueryGetMintingDenomRequest,
    responseSerialize: serialize_noble_fiattokenfactory_QueryGetMintingDenomResponse,
    responseDeserialize: deserialize_noble_fiattokenfactory_QueryGetMintingDenomResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
