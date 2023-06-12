// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var quicksilver_interchainstaking_v1_messages_pb = require('../../../quicksilver/interchainstaking/v1/messages_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var quicksilver_interchainstaking_v1_proposals_pb = require('../../../quicksilver/interchainstaking/v1/proposals_pb.js');

function serialize_quicksilver_interchainstaking_v1_MsgGovCloseChannel(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_proposals_pb.MsgGovCloseChannel)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.MsgGovCloseChannel');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_MsgGovCloseChannel(buffer_arg) {
  return quicksilver_interchainstaking_v1_proposals_pb.MsgGovCloseChannel.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_MsgGovCloseChannelResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_proposals_pb.MsgGovCloseChannelResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.MsgGovCloseChannelResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_MsgGovCloseChannelResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_proposals_pb.MsgGovCloseChannelResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_MsgGovReopenChannel(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_proposals_pb.MsgGovReopenChannel)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.MsgGovReopenChannel');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_MsgGovReopenChannel(buffer_arg) {
  return quicksilver_interchainstaking_v1_proposals_pb.MsgGovReopenChannel.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_MsgGovReopenChannelResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_proposals_pb.MsgGovReopenChannelResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.MsgGovReopenChannelResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_MsgGovReopenChannelResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_proposals_pb.MsgGovReopenChannelResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_MsgRequestRedemption(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_messages_pb.MsgRequestRedemption)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.MsgRequestRedemption');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_MsgRequestRedemption(buffer_arg) {
  return quicksilver_interchainstaking_v1_messages_pb.MsgRequestRedemption.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_MsgRequestRedemptionResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_messages_pb.MsgRequestRedemptionResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.MsgRequestRedemptionResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_MsgRequestRedemptionResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_messages_pb.MsgRequestRedemptionResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_MsgSignalIntent(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_messages_pb.MsgSignalIntent)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.MsgSignalIntent');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_MsgSignalIntent(buffer_arg) {
  return quicksilver_interchainstaking_v1_messages_pb.MsgSignalIntent.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_quicksilver_interchainstaking_v1_MsgSignalIntentResponse(arg) {
  if (!(arg instanceof quicksilver_interchainstaking_v1_messages_pb.MsgSignalIntentResponse)) {
    throw new Error('Expected argument of type quicksilver.interchainstaking.v1.MsgSignalIntentResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_quicksilver_interchainstaking_v1_MsgSignalIntentResponse(buffer_arg) {
  return quicksilver_interchainstaking_v1_messages_pb.MsgSignalIntentResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the interchainstaking Msg service.
var MsgService = exports.MsgService = {
  // RequestRedemption defines a method for requesting burning of qAssets for
// native assets.
requestRedemption: {
    path: '/quicksilver.interchainstaking.v1.Msg/RequestRedemption',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_messages_pb.MsgRequestRedemption,
    responseType: quicksilver_interchainstaking_v1_messages_pb.MsgRequestRedemptionResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_MsgRequestRedemption,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_MsgRequestRedemption,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_MsgRequestRedemptionResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_MsgRequestRedemptionResponse,
  },
  // SignalIntent defines a method for signalling voting intent for one or more
// validators.
signalIntent: {
    path: '/quicksilver.interchainstaking.v1.Msg/SignalIntent',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_messages_pb.MsgSignalIntent,
    responseType: quicksilver_interchainstaking_v1_messages_pb.MsgSignalIntentResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_MsgSignalIntent,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_MsgSignalIntent,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_MsgSignalIntentResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_MsgSignalIntentResponse,
  },
  // SignalIntent defines a method for signalling voting intent for one or more
// validators.
govCloseChannel: {
    path: '/quicksilver.interchainstaking.v1.Msg/GovCloseChannel',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_proposals_pb.MsgGovCloseChannel,
    responseType: quicksilver_interchainstaking_v1_proposals_pb.MsgGovCloseChannelResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_MsgGovCloseChannel,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_MsgGovCloseChannel,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_MsgGovCloseChannelResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_MsgGovCloseChannelResponse,
  },
  govReopenChannel: {
    path: '/quicksilver.interchainstaking.v1.Msg/GovReopenChannel',
    requestStream: false,
    responseStream: false,
    requestType: quicksilver_interchainstaking_v1_proposals_pb.MsgGovReopenChannel,
    responseType: quicksilver_interchainstaking_v1_proposals_pb.MsgGovReopenChannelResponse,
    requestSerialize: serialize_quicksilver_interchainstaking_v1_MsgGovReopenChannel,
    requestDeserialize: deserialize_quicksilver_interchainstaking_v1_MsgGovReopenChannel,
    responseSerialize: serialize_quicksilver_interchainstaking_v1_MsgGovReopenChannelResponse,
    responseDeserialize: deserialize_quicksilver_interchainstaking_v1_MsgGovReopenChannelResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
