// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var neutron_interchainqueries_tx_pb = require('../../neutron/interchainqueries/tx_pb.js');
var tendermint_crypto_proof_pb = require('../../tendermint/crypto/proof_pb.js');
var tendermint_abci_types_pb = require('../../tendermint/abci/types_pb.js');
var google_protobuf_any_pb = require('google-protobuf/google/protobuf/any_pb.js');
var neutron_interchainqueries_genesis_pb = require('../../neutron/interchainqueries/genesis_pb.js');

function serialize_neutron_interchainqueries_MsgRegisterInterchainQuery(arg) {
  if (!(arg instanceof neutron_interchainqueries_tx_pb.MsgRegisterInterchainQuery)) {
    throw new Error('Expected argument of type neutron.interchainqueries.MsgRegisterInterchainQuery');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_MsgRegisterInterchainQuery(buffer_arg) {
  return neutron_interchainqueries_tx_pb.MsgRegisterInterchainQuery.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_MsgRegisterInterchainQueryResponse(arg) {
  if (!(arg instanceof neutron_interchainqueries_tx_pb.MsgRegisterInterchainQueryResponse)) {
    throw new Error('Expected argument of type neutron.interchainqueries.MsgRegisterInterchainQueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_MsgRegisterInterchainQueryResponse(buffer_arg) {
  return neutron_interchainqueries_tx_pb.MsgRegisterInterchainQueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_MsgRemoveInterchainQueryRequest(arg) {
  if (!(arg instanceof neutron_interchainqueries_tx_pb.MsgRemoveInterchainQueryRequest)) {
    throw new Error('Expected argument of type neutron.interchainqueries.MsgRemoveInterchainQueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_MsgRemoveInterchainQueryRequest(buffer_arg) {
  return neutron_interchainqueries_tx_pb.MsgRemoveInterchainQueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_MsgRemoveInterchainQueryResponse(arg) {
  if (!(arg instanceof neutron_interchainqueries_tx_pb.MsgRemoveInterchainQueryResponse)) {
    throw new Error('Expected argument of type neutron.interchainqueries.MsgRemoveInterchainQueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_MsgRemoveInterchainQueryResponse(buffer_arg) {
  return neutron_interchainqueries_tx_pb.MsgRemoveInterchainQueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_MsgSubmitQueryResult(arg) {
  if (!(arg instanceof neutron_interchainqueries_tx_pb.MsgSubmitQueryResult)) {
    throw new Error('Expected argument of type neutron.interchainqueries.MsgSubmitQueryResult');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_MsgSubmitQueryResult(buffer_arg) {
  return neutron_interchainqueries_tx_pb.MsgSubmitQueryResult.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_MsgSubmitQueryResultResponse(arg) {
  if (!(arg instanceof neutron_interchainqueries_tx_pb.MsgSubmitQueryResultResponse)) {
    throw new Error('Expected argument of type neutron.interchainqueries.MsgSubmitQueryResultResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_MsgSubmitQueryResultResponse(buffer_arg) {
  return neutron_interchainqueries_tx_pb.MsgSubmitQueryResultResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_MsgUpdateInterchainQueryRequest(arg) {
  if (!(arg instanceof neutron_interchainqueries_tx_pb.MsgUpdateInterchainQueryRequest)) {
    throw new Error('Expected argument of type neutron.interchainqueries.MsgUpdateInterchainQueryRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_MsgUpdateInterchainQueryRequest(buffer_arg) {
  return neutron_interchainqueries_tx_pb.MsgUpdateInterchainQueryRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_neutron_interchainqueries_MsgUpdateInterchainQueryResponse(arg) {
  if (!(arg instanceof neutron_interchainqueries_tx_pb.MsgUpdateInterchainQueryResponse)) {
    throw new Error('Expected argument of type neutron.interchainqueries.MsgUpdateInterchainQueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_neutron_interchainqueries_MsgUpdateInterchainQueryResponse(buffer_arg) {
  return neutron_interchainqueries_tx_pb.MsgUpdateInterchainQueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  registerInterchainQuery: {
    path: '/neutron.interchainqueries.Msg/RegisterInterchainQuery',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchainqueries_tx_pb.MsgRegisterInterchainQuery,
    responseType: neutron_interchainqueries_tx_pb.MsgRegisterInterchainQueryResponse,
    requestSerialize: serialize_neutron_interchainqueries_MsgRegisterInterchainQuery,
    requestDeserialize: deserialize_neutron_interchainqueries_MsgRegisterInterchainQuery,
    responseSerialize: serialize_neutron_interchainqueries_MsgRegisterInterchainQueryResponse,
    responseDeserialize: deserialize_neutron_interchainqueries_MsgRegisterInterchainQueryResponse,
  },
  submitQueryResult: {
    path: '/neutron.interchainqueries.Msg/SubmitQueryResult',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchainqueries_tx_pb.MsgSubmitQueryResult,
    responseType: neutron_interchainqueries_tx_pb.MsgSubmitQueryResultResponse,
    requestSerialize: serialize_neutron_interchainqueries_MsgSubmitQueryResult,
    requestDeserialize: deserialize_neutron_interchainqueries_MsgSubmitQueryResult,
    responseSerialize: serialize_neutron_interchainqueries_MsgSubmitQueryResultResponse,
    responseDeserialize: deserialize_neutron_interchainqueries_MsgSubmitQueryResultResponse,
  },
  removeInterchainQuery: {
    path: '/neutron.interchainqueries.Msg/RemoveInterchainQuery',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchainqueries_tx_pb.MsgRemoveInterchainQueryRequest,
    responseType: neutron_interchainqueries_tx_pb.MsgRemoveInterchainQueryResponse,
    requestSerialize: serialize_neutron_interchainqueries_MsgRemoveInterchainQueryRequest,
    requestDeserialize: deserialize_neutron_interchainqueries_MsgRemoveInterchainQueryRequest,
    responseSerialize: serialize_neutron_interchainqueries_MsgRemoveInterchainQueryResponse,
    responseDeserialize: deserialize_neutron_interchainqueries_MsgRemoveInterchainQueryResponse,
  },
  updateInterchainQuery: {
    path: '/neutron.interchainqueries.Msg/UpdateInterchainQuery',
    requestStream: false,
    responseStream: false,
    requestType: neutron_interchainqueries_tx_pb.MsgUpdateInterchainQueryRequest,
    responseType: neutron_interchainqueries_tx_pb.MsgUpdateInterchainQueryResponse,
    requestSerialize: serialize_neutron_interchainqueries_MsgUpdateInterchainQueryRequest,
    requestDeserialize: deserialize_neutron_interchainqueries_MsgUpdateInterchainQueryRequest,
    responseSerialize: serialize_neutron_interchainqueries_MsgUpdateInterchainQueryResponse,
    responseDeserialize: deserialize_neutron_interchainqueries_MsgUpdateInterchainQueryResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
