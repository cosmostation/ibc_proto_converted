// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var regen_data_v1alpha2_tx_pb = require('../../../regen/data/v1alpha2/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var regen_data_v1alpha2_types_pb = require('../../../regen/data/v1alpha2/types_pb.js');

function serialize_regen_data_v1alpha2_MsgAnchorData(arg) {
  if (!(arg instanceof regen_data_v1alpha2_tx_pb.MsgAnchorData)) {
    throw new Error('Expected argument of type regen.data.v1alpha2.MsgAnchorData');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_data_v1alpha2_MsgAnchorData(buffer_arg) {
  return regen_data_v1alpha2_tx_pb.MsgAnchorData.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_data_v1alpha2_MsgAnchorDataResponse(arg) {
  if (!(arg instanceof regen_data_v1alpha2_tx_pb.MsgAnchorDataResponse)) {
    throw new Error('Expected argument of type regen.data.v1alpha2.MsgAnchorDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_data_v1alpha2_MsgAnchorDataResponse(buffer_arg) {
  return regen_data_v1alpha2_tx_pb.MsgAnchorDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_data_v1alpha2_MsgSignData(arg) {
  if (!(arg instanceof regen_data_v1alpha2_tx_pb.MsgSignData)) {
    throw new Error('Expected argument of type regen.data.v1alpha2.MsgSignData');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_data_v1alpha2_MsgSignData(buffer_arg) {
  return regen_data_v1alpha2_tx_pb.MsgSignData.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_regen_data_v1alpha2_MsgSignDataResponse(arg) {
  if (!(arg instanceof regen_data_v1alpha2_tx_pb.MsgSignDataResponse)) {
    throw new Error('Expected argument of type regen.data.v1alpha2.MsgSignDataResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_regen_data_v1alpha2_MsgSignDataResponse(buffer_arg) {
  return regen_data_v1alpha2_tx_pb.MsgSignDataResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg is the regen.data.v1alpha1 Msg service
var MsgService = exports.MsgService = {
  // AnchorData "anchors" a piece of data to the blockchain based on its secure
// hash, effectively providing a tamper resistant timestamp.
//
// The sender in AnchorData is not attesting to the veracity of the underlying
// data. They can simply be a intermediary providing timestamp services.
// SignData should be used to create a digital signature attesting to the
// veracity of some piece of data.
anchorData: {
    path: '/regen.data.v1alpha2.Msg/AnchorData',
    requestStream: false,
    responseStream: false,
    requestType: regen_data_v1alpha2_tx_pb.MsgAnchorData,
    responseType: regen_data_v1alpha2_tx_pb.MsgAnchorDataResponse,
    requestSerialize: serialize_regen_data_v1alpha2_MsgAnchorData,
    requestDeserialize: deserialize_regen_data_v1alpha2_MsgAnchorData,
    responseSerialize: serialize_regen_data_v1alpha2_MsgAnchorDataResponse,
    responseDeserialize: deserialize_regen_data_v1alpha2_MsgAnchorDataResponse,
  },
  // SignData allows for signing of an arbitrary piece of data on the
// blockchain. By "signing" data the signers are making a statement about the
// veracity of the data itself. It is like signing a legal document, meaning
// that I agree to all conditions and to the best of my knowledge everything
// is true. When anchoring data, the sender is not attesting to the veracity
// of the data, they are simply communicating that it exists.
//
// On-chain signatures have the following benefits:
// - on-chain identities can be managed using different cryptographic keys
//   that change over time through key rotation practices
// - an on-chain identity may represent an organization and through delegation
//   individual members may sign on behalf of the group
// - the blockchain transaction envelope provides built-in replay protection
//   and timestamping
//
// SignData implicitly calls AnchorData if the data was not already anchored.
//
// SignData can be called multiple times for the same content hash with different
// signers and those signers will be appended to the list of signers.
signData: {
    path: '/regen.data.v1alpha2.Msg/SignData',
    requestStream: false,
    responseStream: false,
    requestType: regen_data_v1alpha2_tx_pb.MsgSignData,
    responseType: regen_data_v1alpha2_tx_pb.MsgSignDataResponse,
    requestSerialize: serialize_regen_data_v1alpha2_MsgSignData,
    requestDeserialize: deserialize_regen_data_v1alpha2_MsgSignData,
    responseSerialize: serialize_regen_data_v1alpha2_MsgSignDataResponse,
    responseDeserialize: deserialize_regen_data_v1alpha2_MsgSignDataResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
