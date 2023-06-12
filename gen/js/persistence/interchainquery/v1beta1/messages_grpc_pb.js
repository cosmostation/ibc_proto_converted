// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var persistence_interchainquery_v1beta1_messages_pb = require('../../../persistence/interchainquery/v1beta1/messages_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var tendermint_crypto_proof_pb = require('../../../tendermint/crypto/proof_pb.js');

function serialize_persistence_interchainquery_v1beta1_MsgSubmitQueryResponse(arg) {
  if (!(arg instanceof persistence_interchainquery_v1beta1_messages_pb.MsgSubmitQueryResponse)) {
    throw new Error('Expected argument of type persistence.interchainquery.v1beta1.MsgSubmitQueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_interchainquery_v1beta1_MsgSubmitQueryResponse(buffer_arg) {
  return persistence_interchainquery_v1beta1_messages_pb.MsgSubmitQueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_persistence_interchainquery_v1beta1_MsgSubmitQueryResponseResponse(arg) {
  if (!(arg instanceof persistence_interchainquery_v1beta1_messages_pb.MsgSubmitQueryResponseResponse)) {
    throw new Error('Expected argument of type persistence.interchainquery.v1beta1.MsgSubmitQueryResponseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_persistence_interchainquery_v1beta1_MsgSubmitQueryResponseResponse(buffer_arg) {
  return persistence_interchainquery_v1beta1_messages_pb.MsgSubmitQueryResponseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the interchainquery Msg service.
var MsgService = exports.MsgService = {
  // SubmitQueryResponse defines a method for submit query responses.
submitQueryResponse: {
    path: '/persistence.interchainquery.v1beta1.Msg/SubmitQueryResponse',
    requestStream: false,
    responseStream: false,
    requestType: persistence_interchainquery_v1beta1_messages_pb.MsgSubmitQueryResponse,
    responseType: persistence_interchainquery_v1beta1_messages_pb.MsgSubmitQueryResponseResponse,
    requestSerialize: serialize_persistence_interchainquery_v1beta1_MsgSubmitQueryResponse,
    requestDeserialize: deserialize_persistence_interchainquery_v1beta1_MsgSubmitQueryResponse,
    responseSerialize: serialize_persistence_interchainquery_v1beta1_MsgSubmitQueryResponseResponse,
    responseDeserialize: deserialize_persistence_interchainquery_v1beta1_MsgSubmitQueryResponseResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
