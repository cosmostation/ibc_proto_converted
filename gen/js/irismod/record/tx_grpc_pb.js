// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_record_tx_pb = require('../../irismod/record/tx_pb.js');
var irismod_record_record_pb = require('../../irismod/record/record_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_irismod_record_MsgCreateRecord(arg) {
  if (!(arg instanceof irismod_record_tx_pb.MsgCreateRecord)) {
    throw new Error('Expected argument of type irismod.record.MsgCreateRecord');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_record_MsgCreateRecord(buffer_arg) {
  return irismod_record_tx_pb.MsgCreateRecord.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_record_MsgCreateRecordResponse(arg) {
  if (!(arg instanceof irismod_record_tx_pb.MsgCreateRecordResponse)) {
    throw new Error('Expected argument of type irismod.record.MsgCreateRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_record_MsgCreateRecordResponse(buffer_arg) {
  return irismod_record_tx_pb.MsgCreateRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the oracle Msg service
var MsgService = exports.MsgService = {
  // CreateRecord defines a method for creating a new record
createRecord: {
    path: '/irismod.record.Msg/CreateRecord',
    requestStream: false,
    responseStream: false,
    requestType: irismod_record_tx_pb.MsgCreateRecord,
    responseType: irismod_record_tx_pb.MsgCreateRecordResponse,
    requestSerialize: serialize_irismod_record_MsgCreateRecord,
    requestDeserialize: deserialize_irismod_record_MsgCreateRecord,
    responseSerialize: serialize_irismod_record_MsgCreateRecordResponse,
    responseDeserialize: deserialize_irismod_record_MsgCreateRecordResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
