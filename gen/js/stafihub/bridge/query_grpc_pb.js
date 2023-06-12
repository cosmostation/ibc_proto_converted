// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_bridge_query_pb = require('../../stafihub/bridge/query_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../cosmos/base/query/v1beta1/pagination_pb.js');
var stafihub_bridge_params_pb = require('../../stafihub/bridge/params_pb.js');
var stafihub_bridge_proposal_pb = require('../../stafihub/bridge/proposal_pb.js');
var stafihub_bridge_genesis_pb = require('../../stafihub/bridge/genesis_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_stafihub_stafihub_bridge_QueryBannedDenomListRequest(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryBannedDenomListRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryBannedDenomListRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryBannedDenomListRequest(buffer_arg) {
  return stafihub_bridge_query_pb.QueryBannedDenomListRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryBannedDenomListResponse(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryBannedDenomListResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryBannedDenomListResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryBannedDenomListResponse(buffer_arg) {
  return stafihub_bridge_query_pb.QueryBannedDenomListResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryChaindIdsRequest(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryChaindIdsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryChaindIdsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryChaindIdsRequest(buffer_arg) {
  return stafihub_bridge_query_pb.QueryChaindIdsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryChaindIdsResponse(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryChaindIdsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryChaindIdsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryChaindIdsResponse(buffer_arg) {
  return stafihub_bridge_query_pb.QueryChaindIdsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryGetDepositCountRequest(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryGetDepositCountRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryGetDepositCountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryGetDepositCountRequest(buffer_arg) {
  return stafihub_bridge_query_pb.QueryGetDepositCountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryGetDepositCountResponse(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryGetDepositCountResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryGetDepositCountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryGetDepositCountResponse(buffer_arg) {
  return stafihub_bridge_query_pb.QueryGetDepositCountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryParamsRequest(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryParamsRequest(buffer_arg) {
  return stafihub_bridge_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryParamsResponse(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryParamsResponse(buffer_arg) {
  return stafihub_bridge_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryProposalDetailRequest(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryProposalDetailRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryProposalDetailRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryProposalDetailRequest(buffer_arg) {
  return stafihub_bridge_query_pb.QueryProposalDetailRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryProposalDetailResponse(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryProposalDetailResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryProposalDetailResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryProposalDetailResponse(buffer_arg) {
  return stafihub_bridge_query_pb.QueryProposalDetailResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryRelayFeeReceiverRequest(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryRelayFeeReceiverRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryRelayFeeReceiverRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryRelayFeeReceiverRequest(buffer_arg) {
  return stafihub_bridge_query_pb.QueryRelayFeeReceiverRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryRelayFeeReceiverResponse(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryRelayFeeReceiverResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryRelayFeeReceiverResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryRelayFeeReceiverResponse(buffer_arg) {
  return stafihub_bridge_query_pb.QueryRelayFeeReceiverResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryRelayFeeRequest(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryRelayFeeRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryRelayFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryRelayFeeRequest(buffer_arg) {
  return stafihub_bridge_query_pb.QueryRelayFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryRelayFeeResponse(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryRelayFeeResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryRelayFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryRelayFeeResponse(buffer_arg) {
  return stafihub_bridge_query_pb.QueryRelayFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryResourceidToDenomsRequest(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryResourceidToDenomsRequest)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryResourceidToDenomsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryResourceidToDenomsRequest(buffer_arg) {
  return stafihub_bridge_query_pb.QueryResourceidToDenomsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_bridge_QueryResourceidToDenomsResponse(arg) {
  if (!(arg instanceof stafihub_bridge_query_pb.QueryResourceidToDenomsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.bridge.QueryResourceidToDenomsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_bridge_QueryResourceidToDenomsResponse(buffer_arg) {
  return stafihub_bridge_query_pb.QueryResourceidToDenomsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Parameters queries the parameters of the module.
params: {
    path: '/stafihub.stafihub.bridge.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_query_pb.QueryParamsRequest,
    responseType: stafihub_bridge_query_pb.QueryParamsResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_QueryParamsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_QueryParamsRequest,
    responseSerialize: serialize_stafihub_stafihub_bridge_QueryParamsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_QueryParamsResponse,
  },
  // Queries a list of ChaindIds items.
chaindIds: {
    path: '/stafihub.stafihub.bridge.Query/ChaindIds',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_query_pb.QueryChaindIdsRequest,
    responseType: stafihub_bridge_query_pb.QueryChaindIdsResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_QueryChaindIdsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_QueryChaindIdsRequest,
    responseSerialize: serialize_stafihub_stafihub_bridge_QueryChaindIdsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_QueryChaindIdsResponse,
  },
  // Queries a list of ProposalDetail items.
proposalDetail: {
    path: '/stafihub.stafihub.bridge.Query/ProposalDetail',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_query_pb.QueryProposalDetailRequest,
    responseType: stafihub_bridge_query_pb.QueryProposalDetailResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_QueryProposalDetailRequest,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_QueryProposalDetailRequest,
    responseSerialize: serialize_stafihub_stafihub_bridge_QueryProposalDetailResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_QueryProposalDetailResponse,
  },
  // Queries a list of ResourceidToDenoms items.
resourceidToDenoms: {
    path: '/stafihub.stafihub.bridge.Query/ResourceidToDenoms',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_query_pb.QueryResourceidToDenomsRequest,
    responseType: stafihub_bridge_query_pb.QueryResourceidToDenomsResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_QueryResourceidToDenomsRequest,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_QueryResourceidToDenomsRequest,
    responseSerialize: serialize_stafihub_stafihub_bridge_QueryResourceidToDenomsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_QueryResourceidToDenomsResponse,
  },
  // Queries a list of RelayFeeReceiver items.
relayFeeReceiver: {
    path: '/stafihub.stafihub.bridge.Query/RelayFeeReceiver',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_query_pb.QueryRelayFeeReceiverRequest,
    responseType: stafihub_bridge_query_pb.QueryRelayFeeReceiverResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_QueryRelayFeeReceiverRequest,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_QueryRelayFeeReceiverRequest,
    responseSerialize: serialize_stafihub_stafihub_bridge_QueryRelayFeeReceiverResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_QueryRelayFeeReceiverResponse,
  },
  // Queries a list of RelayFee items.
relayFee: {
    path: '/stafihub.stafihub.bridge.Query/RelayFee',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_query_pb.QueryRelayFeeRequest,
    responseType: stafihub_bridge_query_pb.QueryRelayFeeResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_QueryRelayFeeRequest,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_QueryRelayFeeRequest,
    responseSerialize: serialize_stafihub_stafihub_bridge_QueryRelayFeeResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_QueryRelayFeeResponse,
  },
  // Queries a list of BannedDenomList items.
bannedDenomList: {
    path: '/stafihub.stafihub.bridge.Query/BannedDenomList',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_query_pb.QueryBannedDenomListRequest,
    responseType: stafihub_bridge_query_pb.QueryBannedDenomListResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_QueryBannedDenomListRequest,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_QueryBannedDenomListRequest,
    responseSerialize: serialize_stafihub_stafihub_bridge_QueryBannedDenomListResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_QueryBannedDenomListResponse,
  },
  // Queries a list of GetDepositCount items.
getDepositCount: {
    path: '/stafihub.stafihub.bridge.Query/GetDepositCount',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_bridge_query_pb.QueryGetDepositCountRequest,
    responseType: stafihub_bridge_query_pb.QueryGetDepositCountResponse,
    requestSerialize: serialize_stafihub_stafihub_bridge_QueryGetDepositCountRequest,
    requestDeserialize: deserialize_stafihub_stafihub_bridge_QueryGetDepositCountRequest,
    responseSerialize: serialize_stafihub_stafihub_bridge_QueryGetDepositCountResponse,
    responseDeserialize: deserialize_stafihub_stafihub_bridge_QueryGetDepositCountResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
