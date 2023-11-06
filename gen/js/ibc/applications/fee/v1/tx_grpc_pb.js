// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ibc_applications_fee_v1_tx_pb = require('../../../../ibc/applications/fee/v1/tx_pb.js');
var amino_amino_pb = require('../../../../amino/amino_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');
var ibc_applications_fee_v1_fee_pb = require('../../../../ibc/applications/fee/v1/fee_pb.js');
var ibc_core_channel_v1_channel_pb = require('../../../../ibc/core/channel/v1/channel_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../../cosmos/msg/v1/msg_pb.js');

function serialize_ibc_applications_fee_v1_MsgPayPacketFee(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_tx_pb.MsgPayPacketFee)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.MsgPayPacketFee');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_MsgPayPacketFee(buffer_arg) {
  return ibc_applications_fee_v1_tx_pb.MsgPayPacketFee.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_MsgPayPacketFeeAsync(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_tx_pb.MsgPayPacketFeeAsync)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.MsgPayPacketFeeAsync');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_MsgPayPacketFeeAsync(buffer_arg) {
  return ibc_applications_fee_v1_tx_pb.MsgPayPacketFeeAsync.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_MsgPayPacketFeeAsyncResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_tx_pb.MsgPayPacketFeeAsyncResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.MsgPayPacketFeeAsyncResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_MsgPayPacketFeeAsyncResponse(buffer_arg) {
  return ibc_applications_fee_v1_tx_pb.MsgPayPacketFeeAsyncResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_MsgPayPacketFeeResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_tx_pb.MsgPayPacketFeeResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.MsgPayPacketFeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_MsgPayPacketFeeResponse(buffer_arg) {
  return ibc_applications_fee_v1_tx_pb.MsgPayPacketFeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_MsgRegisterCounterpartyPayee(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_tx_pb.MsgRegisterCounterpartyPayee)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.MsgRegisterCounterpartyPayee');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_MsgRegisterCounterpartyPayee(buffer_arg) {
  return ibc_applications_fee_v1_tx_pb.MsgRegisterCounterpartyPayee.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_MsgRegisterCounterpartyPayeeResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_tx_pb.MsgRegisterCounterpartyPayeeResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.MsgRegisterCounterpartyPayeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_MsgRegisterCounterpartyPayeeResponse(buffer_arg) {
  return ibc_applications_fee_v1_tx_pb.MsgRegisterCounterpartyPayeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_MsgRegisterPayee(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_tx_pb.MsgRegisterPayee)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.MsgRegisterPayee');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_MsgRegisterPayee(buffer_arg) {
  return ibc_applications_fee_v1_tx_pb.MsgRegisterPayee.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_MsgRegisterPayeeResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_tx_pb.MsgRegisterPayeeResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.MsgRegisterPayeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_MsgRegisterPayeeResponse(buffer_arg) {
  return ibc_applications_fee_v1_tx_pb.MsgRegisterPayeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the ICS29 Msg service.
var MsgService = exports.MsgService = {
  // RegisterPayee defines a rpc handler method for MsgRegisterPayee
// RegisterPayee is called by the relayer on each channelEnd and allows them to set an optional
// payee to which reverse and timeout relayer packet fees will be paid out. The payee should be registered on
// the source chain from which packets originate as this is where fee distribution takes place. This function may be
// called more than once by a relayer, in which case, the latest payee is always used.
registerPayee: {
    path: '/ibc.applications.fee.v1.Msg/RegisterPayee',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_tx_pb.MsgRegisterPayee,
    responseType: ibc_applications_fee_v1_tx_pb.MsgRegisterPayeeResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_MsgRegisterPayee,
    requestDeserialize: deserialize_ibc_applications_fee_v1_MsgRegisterPayee,
    responseSerialize: serialize_ibc_applications_fee_v1_MsgRegisterPayeeResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_MsgRegisterPayeeResponse,
  },
  // RegisterCounterpartyPayee defines a rpc handler method for MsgRegisterCounterpartyPayee
// RegisterCounterpartyPayee is called by the relayer on each channelEnd and allows them to specify the counterparty
// payee address before relaying. This ensures they will be properly compensated for forward relaying since
// the destination chain must include the registered counterparty payee address in the acknowledgement. This function
// may be called more than once by a relayer, in which case, the latest counterparty payee address is always used.
registerCounterpartyPayee: {
    path: '/ibc.applications.fee.v1.Msg/RegisterCounterpartyPayee',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_tx_pb.MsgRegisterCounterpartyPayee,
    responseType: ibc_applications_fee_v1_tx_pb.MsgRegisterCounterpartyPayeeResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_MsgRegisterCounterpartyPayee,
    requestDeserialize: deserialize_ibc_applications_fee_v1_MsgRegisterCounterpartyPayee,
    responseSerialize: serialize_ibc_applications_fee_v1_MsgRegisterCounterpartyPayeeResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_MsgRegisterCounterpartyPayeeResponse,
  },
  // PayPacketFee defines a rpc handler method for MsgPayPacketFee
// PayPacketFee is an open callback that may be called by any module/user that wishes to escrow funds in order to
// incentivize the relaying of the packet at the next sequence
// NOTE: This method is intended to be used within a multi msg transaction, where the subsequent msg that follows
// initiates the lifecycle of the incentivized packet
payPacketFee: {
    path: '/ibc.applications.fee.v1.Msg/PayPacketFee',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_tx_pb.MsgPayPacketFee,
    responseType: ibc_applications_fee_v1_tx_pb.MsgPayPacketFeeResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_MsgPayPacketFee,
    requestDeserialize: deserialize_ibc_applications_fee_v1_MsgPayPacketFee,
    responseSerialize: serialize_ibc_applications_fee_v1_MsgPayPacketFeeResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_MsgPayPacketFeeResponse,
  },
  // PayPacketFeeAsync defines a rpc handler method for MsgPayPacketFeeAsync
// PayPacketFeeAsync is an open callback that may be called by any module/user that wishes to escrow funds in order to
// incentivize the relaying of a known packet (i.e. at a particular sequence)
payPacketFeeAsync: {
    path: '/ibc.applications.fee.v1.Msg/PayPacketFeeAsync',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_tx_pb.MsgPayPacketFeeAsync,
    responseType: ibc_applications_fee_v1_tx_pb.MsgPayPacketFeeAsyncResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_MsgPayPacketFeeAsync,
    requestDeserialize: deserialize_ibc_applications_fee_v1_MsgPayPacketFeeAsync,
    responseSerialize: serialize_ibc_applications_fee_v1_MsgPayPacketFeeAsyncResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_MsgPayPacketFeeAsyncResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
