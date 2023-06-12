// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var likechain_iscn_tx_pb = require('../../likechain/iscn/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_likechain_iscn_MsgChangeIscnRecordOwnership(arg) {
  if (!(arg instanceof likechain_iscn_tx_pb.MsgChangeIscnRecordOwnership)) {
    throw new Error('Expected argument of type likechain.iscn.MsgChangeIscnRecordOwnership');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_MsgChangeIscnRecordOwnership(buffer_arg) {
  return likechain_iscn_tx_pb.MsgChangeIscnRecordOwnership.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_MsgChangeIscnRecordOwnershipResponse(arg) {
  if (!(arg instanceof likechain_iscn_tx_pb.MsgChangeIscnRecordOwnershipResponse)) {
    throw new Error('Expected argument of type likechain.iscn.MsgChangeIscnRecordOwnershipResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_MsgChangeIscnRecordOwnershipResponse(buffer_arg) {
  return likechain_iscn_tx_pb.MsgChangeIscnRecordOwnershipResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_MsgCreateIscnRecord(arg) {
  if (!(arg instanceof likechain_iscn_tx_pb.MsgCreateIscnRecord)) {
    throw new Error('Expected argument of type likechain.iscn.MsgCreateIscnRecord');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_MsgCreateIscnRecord(buffer_arg) {
  return likechain_iscn_tx_pb.MsgCreateIscnRecord.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_MsgCreateIscnRecordResponse(arg) {
  if (!(arg instanceof likechain_iscn_tx_pb.MsgCreateIscnRecordResponse)) {
    throw new Error('Expected argument of type likechain.iscn.MsgCreateIscnRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_MsgCreateIscnRecordResponse(buffer_arg) {
  return likechain_iscn_tx_pb.MsgCreateIscnRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_MsgUpdateIscnRecord(arg) {
  if (!(arg instanceof likechain_iscn_tx_pb.MsgUpdateIscnRecord)) {
    throw new Error('Expected argument of type likechain.iscn.MsgUpdateIscnRecord');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_MsgUpdateIscnRecord(buffer_arg) {
  return likechain_iscn_tx_pb.MsgUpdateIscnRecord.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_likechain_iscn_MsgUpdateIscnRecordResponse(arg) {
  if (!(arg instanceof likechain_iscn_tx_pb.MsgUpdateIscnRecordResponse)) {
    throw new Error('Expected argument of type likechain.iscn.MsgUpdateIscnRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_likechain_iscn_MsgUpdateIscnRecordResponse(buffer_arg) {
  return likechain_iscn_tx_pb.MsgUpdateIscnRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the bank Msg service.
var MsgService = exports.MsgService = {
  // CreateIscnRecord defines a method to create ISCN metadata
createIscnRecord: {
    path: '/likechain.iscn.Msg/CreateIscnRecord',
    requestStream: false,
    responseStream: false,
    requestType: likechain_iscn_tx_pb.MsgCreateIscnRecord,
    responseType: likechain_iscn_tx_pb.MsgCreateIscnRecordResponse,
    requestSerialize: serialize_likechain_iscn_MsgCreateIscnRecord,
    requestDeserialize: deserialize_likechain_iscn_MsgCreateIscnRecord,
    responseSerialize: serialize_likechain_iscn_MsgCreateIscnRecordResponse,
    responseDeserialize: deserialize_likechain_iscn_MsgCreateIscnRecordResponse,
  },
  // UpdateIscnRecord defines a method to update existing ISCN metadata
updateIscnRecord: {
    path: '/likechain.iscn.Msg/UpdateIscnRecord',
    requestStream: false,
    responseStream: false,
    requestType: likechain_iscn_tx_pb.MsgUpdateIscnRecord,
    responseType: likechain_iscn_tx_pb.MsgUpdateIscnRecordResponse,
    requestSerialize: serialize_likechain_iscn_MsgUpdateIscnRecord,
    requestDeserialize: deserialize_likechain_iscn_MsgUpdateIscnRecord,
    responseSerialize: serialize_likechain_iscn_MsgUpdateIscnRecordResponse,
    responseDeserialize: deserialize_likechain_iscn_MsgUpdateIscnRecordResponse,
  },
  // ChangeIscnRecordOwnership defines a method to update the ownership of existing ISCN metadata
changeIscnRecordOwnership: {
    path: '/likechain.iscn.Msg/ChangeIscnRecordOwnership',
    requestStream: false,
    responseStream: false,
    requestType: likechain_iscn_tx_pb.MsgChangeIscnRecordOwnership,
    responseType: likechain_iscn_tx_pb.MsgChangeIscnRecordOwnershipResponse,
    requestSerialize: serialize_likechain_iscn_MsgChangeIscnRecordOwnership,
    requestDeserialize: deserialize_likechain_iscn_MsgChangeIscnRecordOwnership,
    responseSerialize: serialize_likechain_iscn_MsgChangeIscnRecordOwnershipResponse,
    responseDeserialize: deserialize_likechain_iscn_MsgChangeIscnRecordOwnershipResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
