// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var irismod_oracle_tx_pb = require('../../irismod/oracle/tx_pb.js');
var gogoproto_gogo_pb = require('../../gogoproto/gogo_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../cosmos/base/v1beta1/coin_pb.js');

function serialize_irismod_oracle_MsgCreateFeed(arg) {
  if (!(arg instanceof irismod_oracle_tx_pb.MsgCreateFeed)) {
    throw new Error('Expected argument of type irismod.oracle.MsgCreateFeed');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_MsgCreateFeed(buffer_arg) {
  return irismod_oracle_tx_pb.MsgCreateFeed.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_MsgCreateFeedResponse(arg) {
  if (!(arg instanceof irismod_oracle_tx_pb.MsgCreateFeedResponse)) {
    throw new Error('Expected argument of type irismod.oracle.MsgCreateFeedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_MsgCreateFeedResponse(buffer_arg) {
  return irismod_oracle_tx_pb.MsgCreateFeedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_MsgEditFeed(arg) {
  if (!(arg instanceof irismod_oracle_tx_pb.MsgEditFeed)) {
    throw new Error('Expected argument of type irismod.oracle.MsgEditFeed');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_MsgEditFeed(buffer_arg) {
  return irismod_oracle_tx_pb.MsgEditFeed.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_MsgEditFeedResponse(arg) {
  if (!(arg instanceof irismod_oracle_tx_pb.MsgEditFeedResponse)) {
    throw new Error('Expected argument of type irismod.oracle.MsgEditFeedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_MsgEditFeedResponse(buffer_arg) {
  return irismod_oracle_tx_pb.MsgEditFeedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_MsgPauseFeed(arg) {
  if (!(arg instanceof irismod_oracle_tx_pb.MsgPauseFeed)) {
    throw new Error('Expected argument of type irismod.oracle.MsgPauseFeed');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_MsgPauseFeed(buffer_arg) {
  return irismod_oracle_tx_pb.MsgPauseFeed.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_MsgPauseFeedResponse(arg) {
  if (!(arg instanceof irismod_oracle_tx_pb.MsgPauseFeedResponse)) {
    throw new Error('Expected argument of type irismod.oracle.MsgPauseFeedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_MsgPauseFeedResponse(buffer_arg) {
  return irismod_oracle_tx_pb.MsgPauseFeedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_MsgStartFeed(arg) {
  if (!(arg instanceof irismod_oracle_tx_pb.MsgStartFeed)) {
    throw new Error('Expected argument of type irismod.oracle.MsgStartFeed');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_MsgStartFeed(buffer_arg) {
  return irismod_oracle_tx_pb.MsgStartFeed.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_irismod_oracle_MsgStartFeedResponse(arg) {
  if (!(arg instanceof irismod_oracle_tx_pb.MsgStartFeedResponse)) {
    throw new Error('Expected argument of type irismod.oracle.MsgStartFeedResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_irismod_oracle_MsgStartFeedResponse(buffer_arg) {
  return irismod_oracle_tx_pb.MsgStartFeedResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the oracle Msg service
var MsgService = exports.MsgService = {
  // CreateFeed defines a method for creating a new feed
createFeed: {
    path: '/irismod.oracle.Msg/CreateFeed',
    requestStream: false,
    responseStream: false,
    requestType: irismod_oracle_tx_pb.MsgCreateFeed,
    responseType: irismod_oracle_tx_pb.MsgCreateFeedResponse,
    requestSerialize: serialize_irismod_oracle_MsgCreateFeed,
    requestDeserialize: deserialize_irismod_oracle_MsgCreateFeed,
    responseSerialize: serialize_irismod_oracle_MsgCreateFeedResponse,
    responseDeserialize: deserialize_irismod_oracle_MsgCreateFeedResponse,
  },
  // EditFeed defines a method for editing a feed
editFeed: {
    path: '/irismod.oracle.Msg/EditFeed',
    requestStream: false,
    responseStream: false,
    requestType: irismod_oracle_tx_pb.MsgEditFeed,
    responseType: irismod_oracle_tx_pb.MsgEditFeedResponse,
    requestSerialize: serialize_irismod_oracle_MsgEditFeed,
    requestDeserialize: deserialize_irismod_oracle_MsgEditFeed,
    responseSerialize: serialize_irismod_oracle_MsgEditFeedResponse,
    responseDeserialize: deserialize_irismod_oracle_MsgEditFeedResponse,
  },
  // StartFeed defines a method for starting a feed
startFeed: {
    path: '/irismod.oracle.Msg/StartFeed',
    requestStream: false,
    responseStream: false,
    requestType: irismod_oracle_tx_pb.MsgStartFeed,
    responseType: irismod_oracle_tx_pb.MsgStartFeedResponse,
    requestSerialize: serialize_irismod_oracle_MsgStartFeed,
    requestDeserialize: deserialize_irismod_oracle_MsgStartFeed,
    responseSerialize: serialize_irismod_oracle_MsgStartFeedResponse,
    responseDeserialize: deserialize_irismod_oracle_MsgStartFeedResponse,
  },
  // PauseFeed defines a method for pausing a feed
pauseFeed: {
    path: '/irismod.oracle.Msg/PauseFeed',
    requestStream: false,
    responseStream: false,
    requestType: irismod_oracle_tx_pb.MsgPauseFeed,
    responseType: irismod_oracle_tx_pb.MsgPauseFeedResponse,
    requestSerialize: serialize_irismod_oracle_MsgPauseFeed,
    requestDeserialize: deserialize_irismod_oracle_MsgPauseFeed,
    responseSerialize: serialize_irismod_oracle_MsgPauseFeedResponse,
    responseDeserialize: deserialize_irismod_oracle_MsgPauseFeedResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
