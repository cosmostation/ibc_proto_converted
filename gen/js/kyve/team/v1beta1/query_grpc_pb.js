// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var kyve_team_v1beta1_query_pb = require('../../../kyve/team/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var kyve_team_v1beta1_team_pb = require('../../../kyve/team/v1beta1/team_pb.js');

function serialize_kyve_team_v1beta1_QueryTeamInfoRequest(arg) {
  if (!(arg instanceof kyve_team_v1beta1_query_pb.QueryTeamInfoRequest)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.QueryTeamInfoRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_QueryTeamInfoRequest(buffer_arg) {
  return kyve_team_v1beta1_query_pb.QueryTeamInfoRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_QueryTeamInfoResponse(arg) {
  if (!(arg instanceof kyve_team_v1beta1_query_pb.QueryTeamInfoResponse)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.QueryTeamInfoResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_QueryTeamInfoResponse(buffer_arg) {
  return kyve_team_v1beta1_query_pb.QueryTeamInfoResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_QueryTeamVestingAccountRequest(arg) {
  if (!(arg instanceof kyve_team_v1beta1_query_pb.QueryTeamVestingAccountRequest)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.QueryTeamVestingAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_QueryTeamVestingAccountRequest(buffer_arg) {
  return kyve_team_v1beta1_query_pb.QueryTeamVestingAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_QueryTeamVestingAccountResponse(arg) {
  if (!(arg instanceof kyve_team_v1beta1_query_pb.QueryTeamVestingAccountResponse)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.QueryTeamVestingAccountResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_QueryTeamVestingAccountResponse(buffer_arg) {
  return kyve_team_v1beta1_query_pb.QueryTeamVestingAccountResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_QueryTeamVestingAccountsRequest(arg) {
  if (!(arg instanceof kyve_team_v1beta1_query_pb.QueryTeamVestingAccountsRequest)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.QueryTeamVestingAccountsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_QueryTeamVestingAccountsRequest(buffer_arg) {
  return kyve_team_v1beta1_query_pb.QueryTeamVestingAccountsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_QueryTeamVestingAccountsResponse(arg) {
  if (!(arg instanceof kyve_team_v1beta1_query_pb.QueryTeamVestingAccountsResponse)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.QueryTeamVestingAccountsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_QueryTeamVestingAccountsResponse(buffer_arg) {
  return kyve_team_v1beta1_query_pb.QueryTeamVestingAccountsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_QueryTeamVestingStatusByTimeRequest(arg) {
  if (!(arg instanceof kyve_team_v1beta1_query_pb.QueryTeamVestingStatusByTimeRequest)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.QueryTeamVestingStatusByTimeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_QueryTeamVestingStatusByTimeRequest(buffer_arg) {
  return kyve_team_v1beta1_query_pb.QueryTeamVestingStatusByTimeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_QueryTeamVestingStatusByTimeResponse(arg) {
  if (!(arg instanceof kyve_team_v1beta1_query_pb.QueryTeamVestingStatusByTimeResponse)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.QueryTeamVestingStatusByTimeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_QueryTeamVestingStatusByTimeResponse(buffer_arg) {
  return kyve_team_v1beta1_query_pb.QueryTeamVestingStatusByTimeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_QueryTeamVestingStatusRequest(arg) {
  if (!(arg instanceof kyve_team_v1beta1_query_pb.QueryTeamVestingStatusRequest)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.QueryTeamVestingStatusRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_QueryTeamVestingStatusRequest(buffer_arg) {
  return kyve_team_v1beta1_query_pb.QueryTeamVestingStatusRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_kyve_team_v1beta1_QueryTeamVestingStatusResponse(arg) {
  if (!(arg instanceof kyve_team_v1beta1_query_pb.QueryTeamVestingStatusResponse)) {
    throw new Error('Expected argument of type kyve.team.v1beta1.QueryTeamVestingStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_kyve_team_v1beta1_QueryTeamVestingStatusResponse(buffer_arg) {
  return kyve_team_v1beta1_query_pb.QueryTeamVestingStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // TeamInfo queries all important information from the team module
teamInfo: {
    path: '/kyve.team.v1beta1.Query/TeamInfo',
    requestStream: false,
    responseStream: false,
    requestType: kyve_team_v1beta1_query_pb.QueryTeamInfoRequest,
    responseType: kyve_team_v1beta1_query_pb.QueryTeamInfoResponse,
    requestSerialize: serialize_kyve_team_v1beta1_QueryTeamInfoRequest,
    requestDeserialize: deserialize_kyve_team_v1beta1_QueryTeamInfoRequest,
    responseSerialize: serialize_kyve_team_v1beta1_QueryTeamInfoResponse,
    responseDeserialize: deserialize_kyve_team_v1beta1_QueryTeamInfoResponse,
  },
  // TeamVestingAccounts queries all team vesting accounts of the module.
teamVestingAccounts: {
    path: '/kyve.team.v1beta1.Query/TeamVestingAccounts',
    requestStream: false,
    responseStream: false,
    requestType: kyve_team_v1beta1_query_pb.QueryTeamVestingAccountsRequest,
    responseType: kyve_team_v1beta1_query_pb.QueryTeamVestingAccountsResponse,
    requestSerialize: serialize_kyve_team_v1beta1_QueryTeamVestingAccountsRequest,
    requestDeserialize: deserialize_kyve_team_v1beta1_QueryTeamVestingAccountsRequest,
    responseSerialize: serialize_kyve_team_v1beta1_QueryTeamVestingAccountsResponse,
    responseDeserialize: deserialize_kyve_team_v1beta1_QueryTeamVestingAccountsResponse,
  },
  // TeamVestingAccount queries the team vesting accounts of the module.
teamVestingAccount: {
    path: '/kyve.team.v1beta1.Query/TeamVestingAccount',
    requestStream: false,
    responseStream: false,
    requestType: kyve_team_v1beta1_query_pb.QueryTeamVestingAccountRequest,
    responseType: kyve_team_v1beta1_query_pb.QueryTeamVestingAccountResponse,
    requestSerialize: serialize_kyve_team_v1beta1_QueryTeamVestingAccountRequest,
    requestDeserialize: deserialize_kyve_team_v1beta1_QueryTeamVestingAccountRequest,
    responseSerialize: serialize_kyve_team_v1beta1_QueryTeamVestingAccountResponse,
    responseDeserialize: deserialize_kyve_team_v1beta1_QueryTeamVestingAccountResponse,
  },
  // TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
teamVestingStatus: {
    path: '/kyve.team.v1beta1.Query/TeamVestingStatus',
    requestStream: false,
    responseStream: false,
    requestType: kyve_team_v1beta1_query_pb.QueryTeamVestingStatusRequest,
    responseType: kyve_team_v1beta1_query_pb.QueryTeamVestingStatusResponse,
    requestSerialize: serialize_kyve_team_v1beta1_QueryTeamVestingStatusRequest,
    requestDeserialize: deserialize_kyve_team_v1beta1_QueryTeamVestingStatusRequest,
    responseSerialize: serialize_kyve_team_v1beta1_QueryTeamVestingStatusResponse,
    responseDeserialize: deserialize_kyve_team_v1beta1_QueryTeamVestingStatusResponse,
  },
  // TeamCurrentVestingStatus queries the current vesting progress of a team vesting account
teamVestingStatusByTime: {
    path: '/kyve.team.v1beta1.Query/TeamVestingStatusByTime',
    requestStream: false,
    responseStream: false,
    requestType: kyve_team_v1beta1_query_pb.QueryTeamVestingStatusByTimeRequest,
    responseType: kyve_team_v1beta1_query_pb.QueryTeamVestingStatusByTimeResponse,
    requestSerialize: serialize_kyve_team_v1beta1_QueryTeamVestingStatusByTimeRequest,
    requestDeserialize: deserialize_kyve_team_v1beta1_QueryTeamVestingStatusByTimeRequest,
    responseSerialize: serialize_kyve_team_v1beta1_QueryTeamVestingStatusByTimeResponse,
    responseDeserialize: deserialize_kyve_team_v1beta1_QueryTeamVestingStatusByTimeResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
