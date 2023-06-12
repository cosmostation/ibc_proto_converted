// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quicksilver_interchainquery_v1_query_pb = require('../../../quicksilver/interchainquery/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var quicksilver_interchainquery_v1_interchainquery_pb = require('../../../quicksilver/interchainquery/v1/interchainquery_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_abci_v1beta1_abci_pb = require('../../../cosmos/base/abci/v1beta1/abci_pb.js');
var cosmos_tx_v1beta1_tx_pb = require('../../../cosmos/tx/v1beta1/tx_pb.js');
var tendermint_types_types_pb = require('../../../tendermint/types/types_pb.js');
var ibc_lightclients_tendermint_v1_tendermint_pb = require('../../../ibc/lightclients/tendermint/v1/tendermint_pb.js');

function serialize_quicksilver_interchainquery_v1_QueryRequestsRequest(arg) {
  if (!(arg instanceof quicksilver_interchainquery_v1_query_pb.QueryRequestsRequest)) {
    throw new Error('Expected argument of type quicksilver.interchainquery.v1.QueryRequestsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainquery_v1_QueryRequestsRequest(buffer_arg) {
  return quicksilver_interchainquery_v1_query_pb.QueryRequestsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainquery_v1_QueryRequestsResponse(arg) {
  if (!(arg instanceof quicksilver_interchainquery_v1_query_pb.QueryRequestsResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainquery.v1.QueryRequestsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainquery_v1_QueryRequestsResponse(buffer_arg) {
  return quicksilver_interchainquery_v1_query_pb.QueryRequestsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QuerySrvrService = exports.QuerySrvrService = {
  // Params returns the total set of minting parameters.
queries: {
    path: '/quicksilver.interchainquery.v1.QuerySrvr/Queries',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainquery_v1_query_pb.QueryRequestsRequest,
    responseType: quicksilver_interchainquery_v1_query_pb.QueryRequestsResponse,
    requestSerialize: serialize_quicksilver_interchainquery_v1_QueryRequestsRequest,
    requestDeserialize: deserialize_quicksilver_interchainquery_v1_QueryRequestsRequest,
    responseSerialize: serialize_quicksilver_interchainquery_v1_QueryRequestsResponse,
    responseDeserialize: deserialize_quicksilver_interchainquery_v1_QueryRequestsResponse,
  },
};

exports.QuerySrvrClient = grpc.makeGenericClientConstructor(QuerySrvrService);
