// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var osmosis_concentrated$liquidity_tx_pb = require('../../osmosis/concentrated-liquidity/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');
var google_protobuf_duration_pb = require('google-protobuf/google/protobuf/duration_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_osmosis_concentratedliquidity_v1beta1_MsgAddToPosition(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgAddToPosition)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgAddToPosition');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgAddToPosition(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgAddToPosition.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_MsgAddToPositionResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgAddToPositionResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgAddToPositionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgAddToPositionResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgAddToPositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentives(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgCollectIncentives)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgCollectIncentives');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentives(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgCollectIncentives.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentivesResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgCollectIncentivesResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgCollectIncentivesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentivesResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgCollectIncentivesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_MsgCollectSpreadRewards(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgCollectSpreadRewards)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgCollectSpreadRewards');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgCollectSpreadRewards(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgCollectSpreadRewards.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_MsgCollectSpreadRewardsResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgCollectSpreadRewardsResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgCollectSpreadRewardsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgCollectSpreadRewardsResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgCollectSpreadRewardsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_MsgCreatePosition(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgCreatePosition)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgCreatePosition');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgCreatePosition(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgCreatePosition.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_MsgCreatePositionResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgCreatePositionResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgCreatePositionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgCreatePositionResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgCreatePositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_MsgFungifyChargedPositions(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgFungifyChargedPositions)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgFungifyChargedPositions');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgFungifyChargedPositions(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgFungifyChargedPositions.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_MsgFungifyChargedPositionsResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgFungifyChargedPositionsResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgFungifyChargedPositionsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgFungifyChargedPositionsResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgFungifyChargedPositionsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_MsgWithdrawPosition(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgWithdrawPosition)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgWithdrawPosition');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgWithdrawPosition(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgWithdrawPosition.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_osmosis_concentratedliquidity_v1beta1_MsgWithdrawPositionResponse(arg) {
  if (!(arg instanceof osmosis_concentrated$liquidity_tx_pb.MsgWithdrawPositionResponse)) {
    throw new Error('Expected argument of type osmosis.concentratedliquidity.v1beta1.MsgWithdrawPositionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_osmosis_concentratedliquidity_v1beta1_MsgWithdrawPositionResponse(buffer_arg) {
  return osmosis_concentrated$liquidity_tx_pb.MsgWithdrawPositionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


var MsgService = exports.MsgService = {
  createPosition: {
    path: '/osmosis.concentratedliquidity.v1beta1.Msg/CreatePosition',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_tx_pb.MsgCreatePosition,
    responseType: osmosis_concentrated$liquidity_tx_pb.MsgCreatePositionResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgCreatePosition,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgCreatePosition,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgCreatePositionResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgCreatePositionResponse,
  },
  withdrawPosition: {
    path: '/osmosis.concentratedliquidity.v1beta1.Msg/WithdrawPosition',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_tx_pb.MsgWithdrawPosition,
    responseType: osmosis_concentrated$liquidity_tx_pb.MsgWithdrawPositionResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgWithdrawPosition,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgWithdrawPosition,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgWithdrawPositionResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgWithdrawPositionResponse,
  },
  // AddToPosition attempts to add amount0 and amount1 to a position
// with the given position id.
// To maintain backwards-compatibility with future implementations of
// charging, this function deletes the old position and creates a new one with
// the resulting amount after addition.
addToPosition: {
    path: '/osmosis.concentratedliquidity.v1beta1.Msg/AddToPosition',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_tx_pb.MsgAddToPosition,
    responseType: osmosis_concentrated$liquidity_tx_pb.MsgAddToPositionResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgAddToPosition,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgAddToPosition,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgAddToPositionResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgAddToPositionResponse,
  },
  collectSpreadRewards: {
    path: '/osmosis.concentratedliquidity.v1beta1.Msg/CollectSpreadRewards',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_tx_pb.MsgCollectSpreadRewards,
    responseType: osmosis_concentrated$liquidity_tx_pb.MsgCollectSpreadRewardsResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgCollectSpreadRewards,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgCollectSpreadRewards,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgCollectSpreadRewardsResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgCollectSpreadRewardsResponse,
  },
  collectIncentives: {
    path: '/osmosis.concentratedliquidity.v1beta1.Msg/CollectIncentives',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_tx_pb.MsgCollectIncentives,
    responseType: osmosis_concentrated$liquidity_tx_pb.MsgCollectIncentivesResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentives,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentives,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentivesResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgCollectIncentivesResponse,
  },
  fungifyChargedPositions: {
    path: '/osmosis.concentratedliquidity.v1beta1.Msg/FungifyChargedPositions',
    requestStream: false,
    responseStream: false,
    requestType: osmosis_concentrated$liquidity_tx_pb.MsgFungifyChargedPositions,
    responseType: osmosis_concentrated$liquidity_tx_pb.MsgFungifyChargedPositionsResponse,
    requestSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgFungifyChargedPositions,
    requestDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgFungifyChargedPositions,
    responseSerialize: serialize_osmosis_concentratedliquidity_v1beta1_MsgFungifyChargedPositionsResponse,
    responseDeserialize: deserialize_osmosis_concentratedliquidity_v1beta1_MsgFungifyChargedPositionsResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
