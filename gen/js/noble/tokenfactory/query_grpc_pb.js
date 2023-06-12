// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var noble_tokenfactory_query_pb = require('../../noble/tokenfactory/query_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var noble_tokenfactory_params_pb = require('../../noble/tokenfactory/params_pb.js');
var noble_tokenfactory_blacklisted_pb = require('../../noble/tokenfactory/blacklisted_pb.js');
var noble_tokenfactory_paused_pb = require('../../noble/tokenfactory/paused_pb.js');
var noble_tokenfactory_master_minter_pb = require('../../noble/tokenfactory/master_minter_pb.js');
var noble_tokenfactory_minters_pb = require('../../noble/tokenfactory/minters_pb.js');
var noble_tokenfactory_pauser_pb = require('../../noble/tokenfactory/pauser_pb.js');
var noble_tokenfactory_blacklister_pb = require('../../noble/tokenfactory/blacklister_pb.js');
var noble_tokenfactory_owner_pb = require('../../noble/tokenfactory/owner_pb.js');
var noble_tokenfactory_minter_controller_pb = require('../../noble/tokenfactory/minter_controller_pb.js');
var noble_tokenfactory_minting_denom_pb = require('../../noble/tokenfactory/minting_denom_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_noble_tokenfactory_QueryAllBlacklistedRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryAllBlacklistedRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryAllBlacklistedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryAllBlacklistedRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryAllBlacklistedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryAllBlacklistedResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryAllBlacklistedResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryAllBlacklistedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryAllBlacklistedResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryAllBlacklistedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryAllMinterControllerRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryAllMinterControllerRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryAllMinterControllerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryAllMinterControllerRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryAllMinterControllerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryAllMinterControllerResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryAllMinterControllerResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryAllMinterControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryAllMinterControllerResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryAllMinterControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryAllMintersRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryAllMintersRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryAllMintersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryAllMintersRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryAllMintersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryAllMintersResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryAllMintersResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryAllMintersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryAllMintersResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryAllMintersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetBlacklistedRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetBlacklistedRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetBlacklistedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetBlacklistedRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetBlacklistedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetBlacklistedResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetBlacklistedResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetBlacklistedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetBlacklistedResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetBlacklistedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetBlacklisterRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetBlacklisterRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetBlacklisterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetBlacklisterRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetBlacklisterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetBlacklisterResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetBlacklisterResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetBlacklisterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetBlacklisterResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetBlacklisterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetMasterMinterRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetMasterMinterRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetMasterMinterRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetMasterMinterRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetMasterMinterRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetMasterMinterResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetMasterMinterResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetMasterMinterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetMasterMinterResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetMasterMinterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetMinterControllerRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetMinterControllerRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetMinterControllerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetMinterControllerRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetMinterControllerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetMinterControllerResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetMinterControllerResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetMinterControllerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetMinterControllerResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetMinterControllerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetMintersRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetMintersRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetMintersRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetMintersRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetMintersRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetMintersResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetMintersResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetMintersResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetMintersResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetMintersResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetMintingDenomRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetMintingDenomRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetMintingDenomRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetMintingDenomRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetMintingDenomRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetMintingDenomResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetMintingDenomResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetMintingDenomResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetMintingDenomResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetMintingDenomResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetOwnerRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetOwnerRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetOwnerRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetOwnerRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetOwnerRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetOwnerResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetOwnerResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetOwnerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetOwnerResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetOwnerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetPausedRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetPausedRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetPausedRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetPausedRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetPausedRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetPausedResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetPausedResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetPausedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetPausedResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetPausedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetPauserRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetPauserRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetPauserRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetPauserRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetPauserRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryGetPauserResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryGetPauserResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryGetPauserResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryGetPauserResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryGetPauserResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryParamsRequest(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryParamsRequest(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_noble_tokenfactory_QueryParamsResponse(arg) {
  if (!(arg instanceof noble_tokenfactory_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type noble.tokenfactory.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_noble_tokenfactory_QueryParamsResponse(buffer_arg) {
  return noble_tokenfactory_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/noble.tokenfactory.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryParamsRequest,
    responseType: noble_tokenfactory_query_pb.QueryParamsResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryParamsRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryParamsRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryParamsResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryParamsResponse,
  },
  // Queries a Blacklisted by index.
blacklisted: {
    path: '/noble.tokenfactory.Query/Blacklisted',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryGetBlacklistedRequest,
    responseType: noble_tokenfactory_query_pb.QueryGetBlacklistedResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryGetBlacklistedRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryGetBlacklistedRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryGetBlacklistedResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryGetBlacklistedResponse,
  },
  // Queries a list of Blacklisted items.
blacklistedAll: {
    path: '/noble.tokenfactory.Query/BlacklistedAll',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryAllBlacklistedRequest,
    responseType: noble_tokenfactory_query_pb.QueryAllBlacklistedResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryAllBlacklistedRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryAllBlacklistedRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryAllBlacklistedResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryAllBlacklistedResponse,
  },
  // Queries a Paused by index.
paused: {
    path: '/noble.tokenfactory.Query/Paused',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryGetPausedRequest,
    responseType: noble_tokenfactory_query_pb.QueryGetPausedResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryGetPausedRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryGetPausedRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryGetPausedResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryGetPausedResponse,
  },
  // Queries a MasterMinter by index.
masterMinter: {
    path: '/noble.tokenfactory.Query/MasterMinter',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryGetMasterMinterRequest,
    responseType: noble_tokenfactory_query_pb.QueryGetMasterMinterResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryGetMasterMinterRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryGetMasterMinterRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryGetMasterMinterResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryGetMasterMinterResponse,
  },
  // Queries a Minters by index.
minters: {
    path: '/noble.tokenfactory.Query/Minters',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryGetMintersRequest,
    responseType: noble_tokenfactory_query_pb.QueryGetMintersResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryGetMintersRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryGetMintersRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryGetMintersResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryGetMintersResponse,
  },
  // Queries a list of Minters items.
mintersAll: {
    path: '/noble.tokenfactory.Query/MintersAll',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryAllMintersRequest,
    responseType: noble_tokenfactory_query_pb.QueryAllMintersResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryAllMintersRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryAllMintersRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryAllMintersResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryAllMintersResponse,
  },
  // Queries a Pauser by index.
pauser: {
    path: '/noble.tokenfactory.Query/Pauser',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryGetPauserRequest,
    responseType: noble_tokenfactory_query_pb.QueryGetPauserResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryGetPauserRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryGetPauserRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryGetPauserResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryGetPauserResponse,
  },
  // Queries a Blacklister by index.
blacklister: {
    path: '/noble.tokenfactory.Query/Blacklister',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryGetBlacklisterRequest,
    responseType: noble_tokenfactory_query_pb.QueryGetBlacklisterResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryGetBlacklisterRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryGetBlacklisterRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryGetBlacklisterResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryGetBlacklisterResponse,
  },
  // Queries a Owner by index.
owner: {
    path: '/noble.tokenfactory.Query/Owner',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryGetOwnerRequest,
    responseType: noble_tokenfactory_query_pb.QueryGetOwnerResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryGetOwnerRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryGetOwnerRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryGetOwnerResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryGetOwnerResponse,
  },
  // Queries a MinterController by index.
minterController: {
    path: '/noble.tokenfactory.Query/MinterController',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryGetMinterControllerRequest,
    responseType: noble_tokenfactory_query_pb.QueryGetMinterControllerResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryGetMinterControllerRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryGetMinterControllerRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryGetMinterControllerResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryGetMinterControllerResponse,
  },
  // Queries a list of MinterController items.
minterControllerAll: {
    path: '/noble.tokenfactory.Query/MinterControllerAll',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryAllMinterControllerRequest,
    responseType: noble_tokenfactory_query_pb.QueryAllMinterControllerResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryAllMinterControllerRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryAllMinterControllerRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryAllMinterControllerResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryAllMinterControllerResponse,
  },
  // Queries a MintingDenom by index.
mintingDenom: {
    path: '/noble.tokenfactory.Query/MintingDenom',
    requestStream: false,
    responseStream: false,
    requestType: noble_tokenfactory_query_pb.QueryGetMintingDenomRequest,
    responseType: noble_tokenfactory_query_pb.QueryGetMintingDenomResponse,
    requestSerialize: serialize_noble_tokenfactory_QueryGetMintingDenomRequest,
    requestDeserialize: deserialize_noble_tokenfactory_QueryGetMintingDenomRequest,
    responseSerialize: serialize_noble_tokenfactory_QueryGetMintingDenomResponse,
    responseDeserialize: deserialize_noble_tokenfactory_QueryGetMintingDenomResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
