// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var persistence_interchainquery_v1beta1_query_pb = require('../../../persistence/interchainquery/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var persistence_interchainquery_v1beta1_genesis_pb = require('../../../persistence/interchainquery/v1beta1/genesis_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../cosmos/base/query/v1beta1/pagination_pb.js');
var cosmos_base_abci_v1beta1_abci_pb = require('../../../cosmos/base/abci/v1beta1/abci_pb.js');
var cosmos_tx_v1beta1_tx_pb = require('../../../cosmos/tx/v1beta1/tx_pb.js');
var tendermint_types_types_pb = require('../../../tendermint/types/types_pb.js');
var ibc_lightclients_tendermint_v1_tendermint_pb = require('../../../ibc/lightclients/tendermint/v1/tendermint_pb.js');

function serialize_persistence_interchainquery_v1beta1_QueryRequestsRequest(arg) {
  if (!(arg instanceof persistence_interchainquery_v1beta1_query_pb.QueryRequestsRequest)) {
    throw new Error('Expected argument of type persistence.interchainquery.v1beta1.QueryRequestsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_interchainquery_v1beta1_QueryRequestsRequest(buffer_arg) {
  return persistence_interchainquery_v1beta1_query_pb.QueryRequestsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_interchainquery_v1beta1_QueryRequestsResponse(arg) {
  if (!(arg instanceof persistence_interchainquery_v1beta1_query_pb.QueryRequestsResponse)) {
    throw new Error('Expected argument of type persistence.interchainquery.v1beta1.QueryRequestsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_interchainquery_v1beta1_QueryRequestsResponse(buffer_arg) {
  return persistence_interchainquery_v1beta1_query_pb.QueryRequestsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query provides defines the gRPC querier service.
var QuerySrvrService = exports.QuerySrvrService = {
  // Params returns the total set of minting parameters.
queries: {
    path: '/persistence.interchainquery.v1beta1.QuerySrvr/Queries',
    requestStream: false,
    responseStream: false,
    requestType: persistence_interchainquery_v1beta1_query_pb.QueryRequestsRequest,
    responseType: persistence_interchainquery_v1beta1_query_pb.QueryRequestsResponse,
    requestSerialize: serialize_persistence_interchainquery_v1beta1_QueryRequestsRequest,
    requestDeserialize: deserialize_persistence_interchainquery_v1beta1_QueryRequestsRequest,
    responseSerialize: serialize_persistence_interchainquery_v1beta1_QueryRequestsResponse,
    responseDeserialize: deserialize_persistence_interchainquery_v1beta1_QueryRequestsResponse,
  },
};

exports.QuerySrvrClient = grpc.makeGenericClientConstructor(QuerySrvrService);
