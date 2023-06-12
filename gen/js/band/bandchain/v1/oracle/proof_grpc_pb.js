// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var band_bandchain_v1_oracle_proof_pb = require('../../../../band/bandchain/v1/oracle/proof_pb.js');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');
var band_oracle_v1_oracle_pb = require('../../../../band/oracle/v1/oracle_pb.js');

function serialize_bandchain_v1_oracle_QueryMultiProofRequest(arg) {
  if (!(arg instanceof band_bandchain_v1_oracle_proof_pb.QueryMultiProofRequest)) {
    throw new Error('Expected argument of type bandchain.v1.oracle.QueryMultiProofRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bandchain_v1_oracle_QueryMultiProofRequest(buffer_arg) {
  return band_bandchain_v1_oracle_proof_pb.QueryMultiProofRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bandchain_v1_oracle_QueryMultiProofResponse(arg) {
  if (!(arg instanceof band_bandchain_v1_oracle_proof_pb.QueryMultiProofResponse)) {
    throw new Error('Expected argument of type bandchain.v1.oracle.QueryMultiProofResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bandchain_v1_oracle_QueryMultiProofResponse(buffer_arg) {
  return band_bandchain_v1_oracle_proof_pb.QueryMultiProofResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bandchain_v1_oracle_QueryProofRequest(arg) {
  if (!(arg instanceof band_bandchain_v1_oracle_proof_pb.QueryProofRequest)) {
    throw new Error('Expected argument of type bandchain.v1.oracle.QueryProofRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bandchain_v1_oracle_QueryProofRequest(buffer_arg) {
  return band_bandchain_v1_oracle_proof_pb.QueryProofRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bandchain_v1_oracle_QueryProofResponse(arg) {
  if (!(arg instanceof band_bandchain_v1_oracle_proof_pb.QueryProofResponse)) {
    throw new Error('Expected argument of type bandchain.v1.oracle.QueryProofResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bandchain_v1_oracle_QueryProofResponse(buffer_arg) {
  return band_bandchain_v1_oracle_proof_pb.QueryProofResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bandchain_v1_oracle_QueryRequestCountProofRequest(arg) {
  if (!(arg instanceof band_bandchain_v1_oracle_proof_pb.QueryRequestCountProofRequest)) {
    throw new Error('Expected argument of type bandchain.v1.oracle.QueryRequestCountProofRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bandchain_v1_oracle_QueryRequestCountProofRequest(buffer_arg) {
  return band_bandchain_v1_oracle_proof_pb.QueryRequestCountProofRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_bandchain_v1_oracle_QueryRequestCountProofResponse(arg) {
  if (!(arg instanceof band_bandchain_v1_oracle_proof_pb.QueryRequestCountProofResponse)) {
    throw new Error('Expected argument of type bandchain.v1.oracle.QueryRequestCountProofResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_bandchain_v1_oracle_QueryRequestCountProofResponse(buffer_arg) {
  return band_bandchain_v1_oracle_proof_pb.QueryRequestCountProofResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Service defines the gRPC querier service.
var ServiceService = exports.ServiceService = {
  // Proof queries the proof for given request ID
proof: {
    path: '/bandchain.v1.oracle.Service/Proof',
    requestStream: false,
    responseStream: false,
    requestType: band_bandchain_v1_oracle_proof_pb.QueryProofRequest,
    responseType: band_bandchain_v1_oracle_proof_pb.QueryProofResponse,
    requestSerialize: serialize_bandchain_v1_oracle_QueryProofRequest,
    requestDeserialize: deserialize_bandchain_v1_oracle_QueryProofRequest,
    responseSerialize: serialize_bandchain_v1_oracle_QueryProofResponse,
    responseDeserialize: deserialize_bandchain_v1_oracle_QueryProofResponse,
  },
  // MultiProof queries multiple proofs for given list of request IDs
multiProof: {
    path: '/bandchain.v1.oracle.Service/MultiProof',
    requestStream: false,
    responseStream: false,
    requestType: band_bandchain_v1_oracle_proof_pb.QueryMultiProofRequest,
    responseType: band_bandchain_v1_oracle_proof_pb.QueryMultiProofResponse,
    requestSerialize: serialize_bandchain_v1_oracle_QueryMultiProofRequest,
    requestDeserialize: deserialize_bandchain_v1_oracle_QueryMultiProofRequest,
    responseSerialize: serialize_bandchain_v1_oracle_QueryMultiProofResponse,
    responseDeserialize: deserialize_bandchain_v1_oracle_QueryMultiProofResponse,
  },
  // RequestCountProof queries the count proof
requestCountProof: {
    path: '/bandchain.v1.oracle.Service/RequestCountProof',
    requestStream: false,
    responseStream: false,
    requestType: band_bandchain_v1_oracle_proof_pb.QueryRequestCountProofRequest,
    responseType: band_bandchain_v1_oracle_proof_pb.QueryRequestCountProofResponse,
    requestSerialize: serialize_bandchain_v1_oracle_QueryRequestCountProofRequest,
    requestDeserialize: deserialize_bandchain_v1_oracle_QueryRequestCountProofRequest,
    responseSerialize: serialize_bandchain_v1_oracle_QueryRequestCountProofResponse,
    responseDeserialize: deserialize_bandchain_v1_oracle_QueryRequestCountProofResponse,
  },
};

exports.ServiceClient = grpc.makeGenericClientConstructor(ServiceService);
