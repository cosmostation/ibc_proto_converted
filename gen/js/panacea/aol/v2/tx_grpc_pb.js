// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var panacea_aol_v2_tx_pb = require('../../../panacea/aol/v2/tx_pb.js');

function serialize_panacea_aol_v2_MsgAddRecord(arg) {
  if (!(arg instanceof panacea_aol_v2_tx_pb.MsgAddRecord)) {
    throw new Error('Expected argument of type panacea.aol.v2.MsgAddRecord');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_MsgAddRecord(buffer_arg) {
  return panacea_aol_v2_tx_pb.MsgAddRecord.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_MsgAddRecordResponse(arg) {
  if (!(arg instanceof panacea_aol_v2_tx_pb.MsgAddRecordResponse)) {
    throw new Error('Expected argument of type panacea.aol.v2.MsgAddRecordResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_MsgAddRecordResponse(buffer_arg) {
  return panacea_aol_v2_tx_pb.MsgAddRecordResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_MsgAddWriter(arg) {
  if (!(arg instanceof panacea_aol_v2_tx_pb.MsgAddWriter)) {
    throw new Error('Expected argument of type panacea.aol.v2.MsgAddWriter');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_MsgAddWriter(buffer_arg) {
  return panacea_aol_v2_tx_pb.MsgAddWriter.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_MsgAddWriterResponse(arg) {
  if (!(arg instanceof panacea_aol_v2_tx_pb.MsgAddWriterResponse)) {
    throw new Error('Expected argument of type panacea.aol.v2.MsgAddWriterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_MsgAddWriterResponse(buffer_arg) {
  return panacea_aol_v2_tx_pb.MsgAddWriterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_MsgCreateTopic(arg) {
  if (!(arg instanceof panacea_aol_v2_tx_pb.MsgCreateTopic)) {
    throw new Error('Expected argument of type panacea.aol.v2.MsgCreateTopic');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_MsgCreateTopic(buffer_arg) {
  return panacea_aol_v2_tx_pb.MsgCreateTopic.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_MsgCreateTopicResponse(arg) {
  if (!(arg instanceof panacea_aol_v2_tx_pb.MsgCreateTopicResponse)) {
    throw new Error('Expected argument of type panacea.aol.v2.MsgCreateTopicResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_MsgCreateTopicResponse(buffer_arg) {
  return panacea_aol_v2_tx_pb.MsgCreateTopicResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_MsgDeleteWriter(arg) {
  if (!(arg instanceof panacea_aol_v2_tx_pb.MsgDeleteWriter)) {
    throw new Error('Expected argument of type panacea.aol.v2.MsgDeleteWriter');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_MsgDeleteWriter(buffer_arg) {
  return panacea_aol_v2_tx_pb.MsgDeleteWriter.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_panacea_aol_v2_MsgDeleteWriterResponse(arg) {
  if (!(arg instanceof panacea_aol_v2_tx_pb.MsgDeleteWriterResponse)) {
    throw new Error('Expected argument of type panacea.aol.v2.MsgDeleteWriterResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_panacea_aol_v2_MsgDeleteWriterResponse(buffer_arg) {
  return panacea_aol_v2_tx_pb.MsgDeleteWriterResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  // CreateTopic defines a method for creating a topic.
createTopic: {
    path: '/panacea.aol.v2.Msg/CreateTopic',
    requestStream: false,
    responseStream: false,
    requestType: panacea_aol_v2_tx_pb.MsgCreateTopic,
    responseType: panacea_aol_v2_tx_pb.MsgCreateTopicResponse,
    requestSerialize: serialize_panacea_aol_v2_MsgCreateTopic,
    requestDeserialize: deserialize_panacea_aol_v2_MsgCreateTopic,
    responseSerialize: serialize_panacea_aol_v2_MsgCreateTopicResponse,
    responseDeserialize: deserialize_panacea_aol_v2_MsgCreateTopicResponse,
  },
  // AddWriter defines a method for adding a writer to the topic.
addWriter: {
    path: '/panacea.aol.v2.Msg/AddWriter',
    requestStream: false,
    responseStream: false,
    requestType: panacea_aol_v2_tx_pb.MsgAddWriter,
    responseType: panacea_aol_v2_tx_pb.MsgAddWriterResponse,
    requestSerialize: serialize_panacea_aol_v2_MsgAddWriter,
    requestDeserialize: deserialize_panacea_aol_v2_MsgAddWriter,
    responseSerialize: serialize_panacea_aol_v2_MsgAddWriterResponse,
    responseDeserialize: deserialize_panacea_aol_v2_MsgAddWriterResponse,
  },
  // DeleteWriter defines a method for deleting a writer to the topic.
deleteWriter: {
    path: '/panacea.aol.v2.Msg/DeleteWriter',
    requestStream: false,
    responseStream: false,
    requestType: panacea_aol_v2_tx_pb.MsgDeleteWriter,
    responseType: panacea_aol_v2_tx_pb.MsgDeleteWriterResponse,
    requestSerialize: serialize_panacea_aol_v2_MsgDeleteWriter,
    requestDeserialize: deserialize_panacea_aol_v2_MsgDeleteWriter,
    responseSerialize: serialize_panacea_aol_v2_MsgDeleteWriterResponse,
    responseDeserialize: deserialize_panacea_aol_v2_MsgDeleteWriterResponse,
  },
  // AddRecord defines a method for adding a record to the topic with the writer.
addRecord: {
    path: '/panacea.aol.v2.Msg/AddRecord',
    requestStream: false,
    responseStream: false,
    requestType: panacea_aol_v2_tx_pb.MsgAddRecord,
    responseType: panacea_aol_v2_tx_pb.MsgAddRecordResponse,
    requestSerialize: serialize_panacea_aol_v2_MsgAddRecord,
    requestDeserialize: deserialize_panacea_aol_v2_MsgAddRecord,
    responseSerialize: serialize_panacea_aol_v2_MsgAddRecordResponse,
    responseDeserialize: deserialize_panacea_aol_v2_MsgAddRecordResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
