// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var injective_ocr_v1beta1_tx_pb = require('../../../injective/ocr/v1beta1/tx_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_msg_v1_msg_pb = require('../../../cosmos/msg/v1/msg_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var injective_ocr_v1beta1_ocr_pb = require('../../../injective/ocr/v1beta1/ocr_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');

function serialize_injective_ocr_v1beta1_MsgAcceptPayeeship(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgAcceptPayeeship)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgAcceptPayeeship');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgAcceptPayeeship(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgAcceptPayeeship.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgAcceptPayeeshipResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgAcceptPayeeshipResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgAcceptPayeeshipResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgAcceptPayeeshipResponse(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgAcceptPayeeshipResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgCreateFeed(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgCreateFeed)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgCreateFeed');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgCreateFeed(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgCreateFeed.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgCreateFeedResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgCreateFeedResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgCreateFeedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgCreateFeedResponse(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgCreateFeedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgFundFeedRewardPool(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgFundFeedRewardPool)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgFundFeedRewardPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgFundFeedRewardPool(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgFundFeedRewardPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgFundFeedRewardPoolResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgFundFeedRewardPoolResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgFundFeedRewardPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgFundFeedRewardPoolResponse(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgFundFeedRewardPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgSetPayees(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgSetPayees)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgSetPayees');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgSetPayees(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgSetPayees.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgSetPayeesResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgSetPayeesResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgSetPayeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgSetPayeesResponse(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgSetPayeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgTransferPayeeship(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgTransferPayeeship)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgTransferPayeeship');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgTransferPayeeship(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgTransferPayeeship.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgTransferPayeeshipResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgTransferPayeeshipResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgTransferPayeeshipResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgTransferPayeeshipResponse(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgTransferPayeeshipResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgTransmit(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgTransmit)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgTransmit');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgTransmit(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgTransmit.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgTransmitResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgTransmitResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgTransmitResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgTransmitResponse(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgTransmitResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgUpdateFeed(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgUpdateFeed)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgUpdateFeed');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgUpdateFeed(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgUpdateFeed.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgUpdateFeedResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgUpdateFeedResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgUpdateFeedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgUpdateFeedResponse(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgUpdateFeedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgUpdateParams(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgUpdateParams)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgUpdateParams');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgUpdateParams(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgUpdateParams.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgUpdateParamsResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgUpdateParamsResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgUpdateParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgUpdateParamsResponse(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgUpdateParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgWithdrawFeedRewardPool(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgWithdrawFeedRewardPool)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgWithdrawFeedRewardPool');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgWithdrawFeedRewardPool(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgWithdrawFeedRewardPool.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_injective_ocr_v1beta1_MsgWithdrawFeedRewardPoolResponse(arg) {
  if (!(arg instanceof injective_ocr_v1beta1_tx_pb.MsgWithdrawFeedRewardPoolResponse)) {
    throw new Error('Expected argument of type injective.ocr.v1beta1.MsgWithdrawFeedRewardPoolResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_injective_ocr_v1beta1_MsgWithdrawFeedRewardPoolResponse(buffer_arg) {
  return injective_ocr_v1beta1_tx_pb.MsgWithdrawFeedRewardPoolResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the OCR Msg service.
var MsgService = exports.MsgService = {
  // CreateFeed defines a method for creating feed by module admin
createFeed: {
    path: '/injective.ocr.v1beta1.Msg/CreateFeed',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_tx_pb.MsgCreateFeed,
    responseType: injective_ocr_v1beta1_tx_pb.MsgCreateFeedResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_MsgCreateFeed,
    requestDeserialize: deserialize_injective_ocr_v1beta1_MsgCreateFeed,
    responseSerialize: serialize_injective_ocr_v1beta1_MsgCreateFeedResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_MsgCreateFeedResponse,
  },
  // CreateFeed defines a method for creating feed by feed admin or feed billing
// admin
updateFeed: {
    path: '/injective.ocr.v1beta1.Msg/UpdateFeed',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_tx_pb.MsgUpdateFeed,
    responseType: injective_ocr_v1beta1_tx_pb.MsgUpdateFeedResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_MsgUpdateFeed,
    requestDeserialize: deserialize_injective_ocr_v1beta1_MsgUpdateFeed,
    responseSerialize: serialize_injective_ocr_v1beta1_MsgUpdateFeedResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_MsgUpdateFeedResponse,
  },
  // Transmit defines a method for transmitting the feed info by transmitter
transmit: {
    path: '/injective.ocr.v1beta1.Msg/Transmit',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_tx_pb.MsgTransmit,
    responseType: injective_ocr_v1beta1_tx_pb.MsgTransmitResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_MsgTransmit,
    requestDeserialize: deserialize_injective_ocr_v1beta1_MsgTransmit,
    responseSerialize: serialize_injective_ocr_v1beta1_MsgTransmitResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_MsgTransmitResponse,
  },
  // FundFeedRewardPool defines a method to put funds into feed reward pool
fundFeedRewardPool: {
    path: '/injective.ocr.v1beta1.Msg/FundFeedRewardPool',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_tx_pb.MsgFundFeedRewardPool,
    responseType: injective_ocr_v1beta1_tx_pb.MsgFundFeedRewardPoolResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_MsgFundFeedRewardPool,
    requestDeserialize: deserialize_injective_ocr_v1beta1_MsgFundFeedRewardPool,
    responseSerialize: serialize_injective_ocr_v1beta1_MsgFundFeedRewardPoolResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_MsgFundFeedRewardPoolResponse,
  },
  // WithdrawFeedRewardPool defines a method to witdhraw feed reward by feed
// admin or billing admin
withdrawFeedRewardPool: {
    path: '/injective.ocr.v1beta1.Msg/WithdrawFeedRewardPool',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_tx_pb.MsgWithdrawFeedRewardPool,
    responseType: injective_ocr_v1beta1_tx_pb.MsgWithdrawFeedRewardPoolResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_MsgWithdrawFeedRewardPool,
    requestDeserialize: deserialize_injective_ocr_v1beta1_MsgWithdrawFeedRewardPool,
    responseSerialize: serialize_injective_ocr_v1beta1_MsgWithdrawFeedRewardPoolResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_MsgWithdrawFeedRewardPoolResponse,
  },
  // SetPayees defines a method to set payees for transmitters (batch action)
setPayees: {
    path: '/injective.ocr.v1beta1.Msg/SetPayees',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_tx_pb.MsgSetPayees,
    responseType: injective_ocr_v1beta1_tx_pb.MsgSetPayeesResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_MsgSetPayees,
    requestDeserialize: deserialize_injective_ocr_v1beta1_MsgSetPayees,
    responseSerialize: serialize_injective_ocr_v1beta1_MsgSetPayeesResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_MsgSetPayeesResponse,
  },
  // TransferPayeeship defines a method for a payee to transfer reward receive
// ownership
transferPayeeship: {
    path: '/injective.ocr.v1beta1.Msg/TransferPayeeship',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_tx_pb.MsgTransferPayeeship,
    responseType: injective_ocr_v1beta1_tx_pb.MsgTransferPayeeshipResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_MsgTransferPayeeship,
    requestDeserialize: deserialize_injective_ocr_v1beta1_MsgTransferPayeeship,
    responseSerialize: serialize_injective_ocr_v1beta1_MsgTransferPayeeshipResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_MsgTransferPayeeshipResponse,
  },
  // AcceptPayeeship defines a method for a new payee to accept reward receive
// ownership
acceptPayeeship: {
    path: '/injective.ocr.v1beta1.Msg/AcceptPayeeship',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_tx_pb.MsgAcceptPayeeship,
    responseType: injective_ocr_v1beta1_tx_pb.MsgAcceptPayeeshipResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_MsgAcceptPayeeship,
    requestDeserialize: deserialize_injective_ocr_v1beta1_MsgAcceptPayeeship,
    responseSerialize: serialize_injective_ocr_v1beta1_MsgAcceptPayeeshipResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_MsgAcceptPayeeshipResponse,
  },
  updateParams: {
    path: '/injective.ocr.v1beta1.Msg/UpdateParams',
    requestStream: false,
    responseStream: false,
    requestType: injective_ocr_v1beta1_tx_pb.MsgUpdateParams,
    responseType: injective_ocr_v1beta1_tx_pb.MsgUpdateParamsResponse,
    requestSerialize: serialize_injective_ocr_v1beta1_MsgUpdateParams,
    requestDeserialize: deserialize_injective_ocr_v1beta1_MsgUpdateParams,
    responseSerialize: serialize_injective_ocr_v1beta1_MsgUpdateParamsResponse,
    responseDeserialize: deserialize_injective_ocr_v1beta1_MsgUpdateParamsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
