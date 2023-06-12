// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cosmos_circuit_v1_tx_pb = require('../../../cosmos/circuit/v1/tx_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_circuit_v1_types_pb = require('../../../cosmos/circuit/v1/types_pb.js');

function serialize_cosmos_circuit_v1_MsgAuthorizeCircuitBreaker(arg) {
  if (!(arg instanceof cosmos_circuit_v1_tx_pb.MsgAuthorizeCircuitBreaker)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.MsgAuthorizeCircuitBreaker');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_MsgAuthorizeCircuitBreaker(buffer_arg) {
  return cosmos_circuit_v1_tx_pb.MsgAuthorizeCircuitBreaker.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_circuit_v1_MsgAuthorizeCircuitBreakerResponse(arg) {
  if (!(arg instanceof cosmos_circuit_v1_tx_pb.MsgAuthorizeCircuitBreakerResponse)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.MsgAuthorizeCircuitBreakerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_MsgAuthorizeCircuitBreakerResponse(buffer_arg) {
  return cosmos_circuit_v1_tx_pb.MsgAuthorizeCircuitBreakerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_circuit_v1_MsgResetCircuitBreaker(arg) {
  if (!(arg instanceof cosmos_circuit_v1_tx_pb.MsgResetCircuitBreaker)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.MsgResetCircuitBreaker');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_MsgResetCircuitBreaker(buffer_arg) {
  return cosmos_circuit_v1_tx_pb.MsgResetCircuitBreaker.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_circuit_v1_MsgResetCircuitBreakerResponse(arg) {
  if (!(arg instanceof cosmos_circuit_v1_tx_pb.MsgResetCircuitBreakerResponse)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.MsgResetCircuitBreakerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_MsgResetCircuitBreakerResponse(buffer_arg) {
  return cosmos_circuit_v1_tx_pb.MsgResetCircuitBreakerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_circuit_v1_MsgTripCircuitBreaker(arg) {
  if (!(arg instanceof cosmos_circuit_v1_tx_pb.MsgTripCircuitBreaker)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.MsgTripCircuitBreaker');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_MsgTripCircuitBreaker(buffer_arg) {
  return cosmos_circuit_v1_tx_pb.MsgTripCircuitBreaker.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_cosmos_circuit_v1_MsgTripCircuitBreakerResponse(arg) {
  if (!(arg instanceof cosmos_circuit_v1_tx_pb.MsgTripCircuitBreakerResponse)) {
    throw new Error('Expected argument of type cosmos.circuit.v1.MsgTripCircuitBreakerResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_cosmos_circuit_v1_MsgTripCircuitBreakerResponse(buffer_arg) {
  return cosmos_circuit_v1_tx_pb.MsgTripCircuitBreakerResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the crisis Msg service.
var MsgService = exports.MsgService = {
  // AuthorizeCircuitBreaker allows a super-admin to grant (or revoke) another
// account's circuit breaker permissions.
authorizeCircuitBreaker: {
    path: '/cosmos.circuit.v1.Msg/AuthorizeCircuitBreaker',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_circuit_v1_tx_pb.MsgAuthorizeCircuitBreaker,
    responseType: cosmos_circuit_v1_tx_pb.MsgAuthorizeCircuitBreakerResponse,
    requestSerialize: serialize_cosmos_circuit_v1_MsgAuthorizeCircuitBreaker,
    requestDeserialize: deserialize_cosmos_circuit_v1_MsgAuthorizeCircuitBreaker,
    responseSerialize: serialize_cosmos_circuit_v1_MsgAuthorizeCircuitBreakerResponse,
    responseDeserialize: deserialize_cosmos_circuit_v1_MsgAuthorizeCircuitBreakerResponse,
  },
  // TripCircuitBreaker pauses processing of Msg's in the state machine.
tripCircuitBreaker: {
    path: '/cosmos.circuit.v1.Msg/TripCircuitBreaker',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_circuit_v1_tx_pb.MsgTripCircuitBreaker,
    responseType: cosmos_circuit_v1_tx_pb.MsgTripCircuitBreakerResponse,
    requestSerialize: serialize_cosmos_circuit_v1_MsgTripCircuitBreaker,
    requestDeserialize: deserialize_cosmos_circuit_v1_MsgTripCircuitBreaker,
    responseSerialize: serialize_cosmos_circuit_v1_MsgTripCircuitBreakerResponse,
    responseDeserialize: deserialize_cosmos_circuit_v1_MsgTripCircuitBreakerResponse,
  },
  // ResetCircuitBreaker resumes processing of Msg's in the state machine that
// have been been paused using TripCircuitBreaker.
resetCircuitBreaker: {
    path: '/cosmos.circuit.v1.Msg/ResetCircuitBreaker',
    requestStream: false,
    responseStream: false,
    requestType: cosmos_circuit_v1_tx_pb.MsgResetCircuitBreaker,
    responseType: cosmos_circuit_v1_tx_pb.MsgResetCircuitBreakerResponse,
    requestSerialize: serialize_cosmos_circuit_v1_MsgResetCircuitBreaker,
    requestDeserialize: deserialize_cosmos_circuit_v1_MsgResetCircuitBreaker,
    responseSerialize: serialize_cosmos_circuit_v1_MsgResetCircuitBreakerResponse,
    responseDeserialize: deserialize_cosmos_circuit_v1_MsgResetCircuitBreakerResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
