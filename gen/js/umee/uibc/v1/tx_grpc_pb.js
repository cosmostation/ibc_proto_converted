// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var umee_uibc_v1_tx_pb = require('../../../umee/uibc/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var umee_uibc_v1_quota_pb = require('../../../umee/uibc/v1/quota_pb.js');

function serialize_umee_uibc_v1_MsgGovSetIBCStatus(arg) {
  if (!(arg instanceof umee_uibc_v1_tx_pb.MsgGovSetIBCStatus)) {
    throw new Error('Expected argument of type umee.uibc.v1.MsgGovSetIBCStatus');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_uibc_v1_MsgGovSetIBCStatus(buffer_arg) {
  return umee_uibc_v1_tx_pb.MsgGovSetIBCStatus.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_uibc_v1_MsgGovSetIBCStatusResponse(arg) {
  if (!(arg instanceof umee_uibc_v1_tx_pb.MsgGovSetIBCStatusResponse)) {
    throw new Error('Expected argument of type umee.uibc.v1.MsgGovSetIBCStatusResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_uibc_v1_MsgGovSetIBCStatusResponse(buffer_arg) {
  return umee_uibc_v1_tx_pb.MsgGovSetIBCStatusResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_uibc_v1_MsgGovUpdateQuota(arg) {
  if (!(arg instanceof umee_uibc_v1_tx_pb.MsgGovUpdateQuota)) {
    throw new Error('Expected argument of type umee.uibc.v1.MsgGovUpdateQuota');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_uibc_v1_MsgGovUpdateQuota(buffer_arg) {
  return umee_uibc_v1_tx_pb.MsgGovUpdateQuota.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_umee_uibc_v1_MsgGovUpdateQuotaResponse(arg) {
  if (!(arg instanceof umee_uibc_v1_tx_pb.MsgGovUpdateQuotaResponse)) {
    throw new Error('Expected argument of type umee.uibc.v1.MsgGovUpdateQuotaResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_umee_uibc_v1_MsgGovUpdateQuotaResponse(buffer_arg) {
  return umee_uibc_v1_tx_pb.MsgGovUpdateQuotaResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the x/uibc module's Msg service.
var MsgService = exports.MsgService = {
  // GovUpdateQuota adds new quota for ibc denoms or
// updates the quota for existed ibc denoms.
govUpdateQuota: {
    path: '/umee.uibc.v1.Msg/GovUpdateQuota',
    requestStream: false,
    responseStream: false,
    requestType: umee_uibc_v1_tx_pb.MsgGovUpdateQuota,
    responseType: umee_uibc_v1_tx_pb.MsgGovUpdateQuotaResponse,
    requestSerialize: serialize_umee_uibc_v1_MsgGovUpdateQuota,
    requestDeserialize: deserialize_umee_uibc_v1_MsgGovUpdateQuota,
    responseSerialize: serialize_umee_uibc_v1_MsgGovUpdateQuotaResponse,
    responseDeserialize: deserialize_umee_uibc_v1_MsgGovUpdateQuotaResponse,
  },
  // GovSetIBCStatus sets IBC ICS20 status. Must be called by x/gov.
govSetIBCStatus: {
    path: '/umee.uibc.v1.Msg/GovSetIBCStatus',
    requestStream: false,
    responseStream: false,
    requestType: umee_uibc_v1_tx_pb.MsgGovSetIBCStatus,
    responseType: umee_uibc_v1_tx_pb.MsgGovSetIBCStatusResponse,
    requestSerialize: serialize_umee_uibc_v1_MsgGovSetIBCStatus,
    requestDeserialize: deserialize_umee_uibc_v1_MsgGovSetIBCStatus,
    responseSerialize: serialize_umee_uibc_v1_MsgGovSetIBCStatusResponse,
    responseDeserialize: deserialize_umee_uibc_v1_MsgGovSetIBCStatusResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
