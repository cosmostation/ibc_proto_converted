// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var lum$network_icqueries_tx_pb = require('../../lum-network/icqueries/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../cosmos_proto/cosmos_pb.js');
var google_api_annotations_pb = require('../../google/api/annotations_pb.js');
var tendermint_crypto_proof_pb = require('../../tendermint/crypto/proof_pb.js');

function serialize_lum_network_icqueries_MsgSubmitQueryResponse(arg) {
  if (!(arg instanceof lum$network_icqueries_tx_pb.MsgSubmitQueryResponse)) {
    throw new Error('Expected argument of type lum.network.icqueries.MsgSubmitQueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icqueries_MsgSubmitQueryResponse(buffer_arg) {
  return lum$network_icqueries_tx_pb.MsgSubmitQueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_lum_network_icqueries_MsgSubmitQueryResponseResponse(arg) {
  if (!(arg instanceof lum$network_icqueries_tx_pb.MsgSubmitQueryResponseResponse)) {
    throw new Error('Expected argument of type lum.network.icqueries.MsgSubmitQueryResponseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_lum_network_icqueries_MsgSubmitQueryResponseResponse(buffer_arg) {
  return lum$network_icqueries_tx_pb.MsgSubmitQueryResponseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the icqueries Msg service.
var MsgService = exports.MsgService = {
  // SubmitQueryResponse defines a method for submit query responses.
submitQueryResponse: {
    path: '/lum.network.icqueries.Msg/SubmitQueryResponse',
    requestStream: false,
    responseStream: false,
    requestType: lum$network_icqueries_tx_pb.MsgSubmitQueryResponse,
    responseType: lum$network_icqueries_tx_pb.MsgSubmitQueryResponseResponse,
    requestSerialize: serialize_lum_network_icqueries_MsgSubmitQueryResponse,
    requestDeserialize: deserialize_lum_network_icqueries_MsgSubmitQueryResponse,
    responseSerialize: serialize_lum_network_icqueries_MsgSubmitQueryResponseResponse,
    responseDeserialize: deserialize_lum_network_icqueries_MsgSubmitQueryResponseResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
