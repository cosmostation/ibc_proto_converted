// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var provenance_msgfees_v1_tx_pb = require('../../../provenance/msgfees/v1/tx_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_provenance_msgfees_v1_MsgAssessCustomMsgFeeRequest(arg) {
  if (!(arg instanceof provenance_msgfees_v1_tx_pb.MsgAssessCustomMsgFeeRequest)) {
    throw new Error('Expected argument of type provenance.msgfees.v1.MsgAssessCustomMsgFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_msgfees_v1_MsgAssessCustomMsgFeeRequest(buffer_arg) {
  return provenance_msgfees_v1_tx_pb.MsgAssessCustomMsgFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_provenance_msgfees_v1_MsgAssessCustomMsgFeeResponse(arg) {
  if (!(arg instanceof provenance_msgfees_v1_tx_pb.MsgAssessCustomMsgFeeResponse)) {
    throw new Error('Expected argument of type provenance.msgfees.v1.MsgAssessCustomMsgFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_provenance_msgfees_v1_MsgAssessCustomMsgFeeResponse(buffer_arg) {
  return provenance_msgfees_v1_tx_pb.MsgAssessCustomMsgFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the msgfees Msg service.
var MsgService = exports.MsgService = {
  // AssessCustomMsgFee endpoint executes the additional fee charges.
// This will only emit the event and not persist it to the keeper.  Fees are handled with the custom msg fee handlers
// Use Case: smart contracts will be able to charge additional fees and direct partial funds to specified recipient
// for executing contracts
assessCustomMsgFee: {
    path: '/provenance.msgfees.v1.Msg/AssessCustomMsgFee',
    requestStream: false,
    responseStream: false,
    requestType: provenance_msgfees_v1_tx_pb.MsgAssessCustomMsgFeeRequest,
    responseType: provenance_msgfees_v1_tx_pb.MsgAssessCustomMsgFeeResponse,
    requestSerialize: serialize_provenance_msgfees_v1_MsgAssessCustomMsgFeeRequest,
    requestDeserialize: deserialize_provenance_msgfees_v1_MsgAssessCustomMsgFeeRequest,
    responseSerialize: serialize_provenance_msgfees_v1_MsgAssessCustomMsgFeeResponse,
    responseDeserialize: deserialize_provenance_msgfees_v1_MsgAssessCustomMsgFeeResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
