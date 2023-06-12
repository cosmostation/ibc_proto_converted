// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stafihub_rvalidator_tx_pb = require('../../stafihub/rvalidator/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');

function serialize_stafihub_stafihub_rvalidator_MsgAddRValidator(arg) {
  if (!(arg instanceof stafihub_rvalidator_tx_pb.MsgAddRValidator)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.MsgAddRValidator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_MsgAddRValidator(buffer_arg) {
  return stafihub_rvalidator_tx_pb.MsgAddRValidator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_MsgAddRValidatorResponse(arg) {
  if (!(arg instanceof stafihub_rvalidator_tx_pb.MsgAddRValidatorResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.MsgAddRValidatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_MsgAddRValidatorResponse(buffer_arg) {
  return stafihub_rvalidator_tx_pb.MsgAddRValidatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_MsgInitRValidator(arg) {
  if (!(arg instanceof stafihub_rvalidator_tx_pb.MsgInitRValidator)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.MsgInitRValidator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_MsgInitRValidator(buffer_arg) {
  return stafihub_rvalidator_tx_pb.MsgInitRValidator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_MsgInitRValidatorResponse(arg) {
  if (!(arg instanceof stafihub_rvalidator_tx_pb.MsgInitRValidatorResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.MsgInitRValidatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_MsgInitRValidatorResponse(buffer_arg) {
  return stafihub_rvalidator_tx_pb.MsgInitRValidatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_MsgRmRValidator(arg) {
  if (!(arg instanceof stafihub_rvalidator_tx_pb.MsgRmRValidator)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.MsgRmRValidator');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_MsgRmRValidator(buffer_arg) {
  return stafihub_rvalidator_tx_pb.MsgRmRValidator.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_MsgRmRValidatorResponse(arg) {
  if (!(arg instanceof stafihub_rvalidator_tx_pb.MsgRmRValidatorResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.MsgRmRValidatorResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_MsgRmRValidatorResponse(buffer_arg) {
  return stafihub_rvalidator_tx_pb.MsgRmRValidatorResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_MsgSetCycleSeconds(arg) {
  if (!(arg instanceof stafihub_rvalidator_tx_pb.MsgSetCycleSeconds)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.MsgSetCycleSeconds');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_MsgSetCycleSeconds(buffer_arg) {
  return stafihub_rvalidator_tx_pb.MsgSetCycleSeconds.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_MsgSetCycleSecondsResponse(arg) {
  if (!(arg instanceof stafihub_rvalidator_tx_pb.MsgSetCycleSecondsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.MsgSetCycleSecondsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_MsgSetCycleSecondsResponse(buffer_arg) {
  return stafihub_rvalidator_tx_pb.MsgSetCycleSecondsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_MsgSetShuffleSeconds(arg) {
  if (!(arg instanceof stafihub_rvalidator_tx_pb.MsgSetShuffleSeconds)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.MsgSetShuffleSeconds');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_MsgSetShuffleSeconds(buffer_arg) {
  return stafihub_rvalidator_tx_pb.MsgSetShuffleSeconds.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stafihub_stafihub_rvalidator_MsgSetShuffleSecondsResponse(arg) {
  if (!(arg instanceof stafihub_rvalidator_tx_pb.MsgSetShuffleSecondsResponse)) {
    throw new Error('Expected argument of type stafihub.stafihub.rvalidator.MsgSetShuffleSecondsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stafihub_stafihub_rvalidator_MsgSetShuffleSecondsResponse(buffer_arg) {
  return stafihub_rvalidator_tx_pb.MsgSetShuffleSecondsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the Msg service.
var MsgService = exports.MsgService = {
  initRValidator: {
    path: '/stafihub.stafihub.rvalidator.Msg/InitRValidator',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvalidator_tx_pb.MsgInitRValidator,
    responseType: stafihub_rvalidator_tx_pb.MsgInitRValidatorResponse,
    requestSerialize: serialize_stafihub_stafihub_rvalidator_MsgInitRValidator,
    requestDeserialize: deserialize_stafihub_stafihub_rvalidator_MsgInitRValidator,
    responseSerialize: serialize_stafihub_stafihub_rvalidator_MsgInitRValidatorResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvalidator_MsgInitRValidatorResponse,
  },
  setCycleSeconds: {
    path: '/stafihub.stafihub.rvalidator.Msg/SetCycleSeconds',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvalidator_tx_pb.MsgSetCycleSeconds,
    responseType: stafihub_rvalidator_tx_pb.MsgSetCycleSecondsResponse,
    requestSerialize: serialize_stafihub_stafihub_rvalidator_MsgSetCycleSeconds,
    requestDeserialize: deserialize_stafihub_stafihub_rvalidator_MsgSetCycleSeconds,
    responseSerialize: serialize_stafihub_stafihub_rvalidator_MsgSetCycleSecondsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvalidator_MsgSetCycleSecondsResponse,
  },
  setShuffleSeconds: {
    path: '/stafihub.stafihub.rvalidator.Msg/SetShuffleSeconds',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvalidator_tx_pb.MsgSetShuffleSeconds,
    responseType: stafihub_rvalidator_tx_pb.MsgSetShuffleSecondsResponse,
    requestSerialize: serialize_stafihub_stafihub_rvalidator_MsgSetShuffleSeconds,
    requestDeserialize: deserialize_stafihub_stafihub_rvalidator_MsgSetShuffleSeconds,
    responseSerialize: serialize_stafihub_stafihub_rvalidator_MsgSetShuffleSecondsResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvalidator_MsgSetShuffleSecondsResponse,
  },
  addRValidator: {
    path: '/stafihub.stafihub.rvalidator.Msg/AddRValidator',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvalidator_tx_pb.MsgAddRValidator,
    responseType: stafihub_rvalidator_tx_pb.MsgAddRValidatorResponse,
    requestSerialize: serialize_stafihub_stafihub_rvalidator_MsgAddRValidator,
    requestDeserialize: deserialize_stafihub_stafihub_rvalidator_MsgAddRValidator,
    responseSerialize: serialize_stafihub_stafihub_rvalidator_MsgAddRValidatorResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvalidator_MsgAddRValidatorResponse,
  },
  rmRValidator: {
    path: '/stafihub.stafihub.rvalidator.Msg/RmRValidator',
    requestStream: false,
    responseStream: false,
    requestType: stafihub_rvalidator_tx_pb.MsgRmRValidator,
    responseType: stafihub_rvalidator_tx_pb.MsgRmRValidatorResponse,
    requestSerialize: serialize_stafihub_stafihub_rvalidator_MsgRmRValidator,
    requestDeserialize: deserialize_stafihub_stafihub_rvalidator_MsgRmRValidator,
    responseSerialize: serialize_stafihub_stafihub_rvalidator_MsgRmRValidatorResponse,
    responseDeserialize: deserialize_stafihub_stafihub_rvalidator_MsgRmRValidatorResponse,
  },
  // this line is used by starport scaffolding # proto/tx/rpc
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
