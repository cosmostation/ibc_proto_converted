// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var ibc_applications_fee_v1_query_pb = require('../../../../ibc/applications/fee/v1/query_pb.js');
var gogoproto_gogo_pb = require('../../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../../cosmos/base/v1beta1/coin_pb.js');
var cosmos_base_query_v1beta1_pagination_pb = require('../../../../cosmos/base/query/v1beta1/pagination_pb.js');
var ibc_applications_fee_v1_fee_pb = require('../../../../ibc/applications/fee/v1/fee_pb.js');
var ibc_applications_fee_v1_genesis_pb = require('../../../../ibc/applications/fee/v1/genesis_pb.js');
var ibc_core_channel_v1_channel_pb = require('../../../../ibc/core/channel/v1/channel_pb.js');

function serialize_ibc_applications_fee_v1_QueryCounterpartyPayeeRequest(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryCounterpartyPayeeRequest)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryCounterpartyPayeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryCounterpartyPayeeRequest(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryCounterpartyPayeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryCounterpartyPayeeResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryCounterpartyPayeeResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryCounterpartyPayeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryCounterpartyPayeeResponse(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryCounterpartyPayeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryFeeEnabledChannelRequest(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelRequest)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryFeeEnabledChannelRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryFeeEnabledChannelRequest(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryFeeEnabledChannelResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryFeeEnabledChannelResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryFeeEnabledChannelResponse(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryFeeEnabledChannelsRequest(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelsRequest)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryFeeEnabledChannelsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryFeeEnabledChannelsRequest(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryFeeEnabledChannelsResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelsResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryFeeEnabledChannelsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryFeeEnabledChannelsResponse(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryIncentivizedPacketRequest(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketRequest)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryIncentivizedPacketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketRequest(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryIncentivizedPacketResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryIncentivizedPacketResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketResponse(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryIncentivizedPacketsForChannelRequest(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsForChannelRequest)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketsForChannelRequest(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsForChannelRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryIncentivizedPacketsForChannelResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsForChannelResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryIncentivizedPacketsForChannelResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketsForChannelResponse(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsForChannelResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryIncentivizedPacketsRequest(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsRequest)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryIncentivizedPacketsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketsRequest(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryIncentivizedPacketsResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryIncentivizedPacketsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketsResponse(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryPayeeRequest(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryPayeeRequest)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryPayeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryPayeeRequest(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryPayeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryPayeeResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryPayeeResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryPayeeResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryPayeeResponse(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryPayeeResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryTotalAckFeesRequest(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryTotalAckFeesRequest)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryTotalAckFeesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryTotalAckFeesRequest(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryTotalAckFeesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryTotalAckFeesResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryTotalAckFeesResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryTotalAckFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryTotalAckFeesResponse(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryTotalAckFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryTotalRecvFeesRequest(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryTotalRecvFeesRequest)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryTotalRecvFeesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryTotalRecvFeesRequest(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryTotalRecvFeesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryTotalRecvFeesResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryTotalRecvFeesResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryTotalRecvFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryTotalRecvFeesResponse(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryTotalRecvFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryTotalTimeoutFeesRequest(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryTotalTimeoutFeesRequest)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryTotalTimeoutFeesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryTotalTimeoutFeesRequest(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryTotalTimeoutFeesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ibc_applications_fee_v1_QueryTotalTimeoutFeesResponse(arg) {
  if (!(arg instanceof ibc_applications_fee_v1_query_pb.QueryTotalTimeoutFeesResponse)) {
    throw new Error('Expected argument of type ibc.applications.fee.v1.QueryTotalTimeoutFeesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ibc_applications_fee_v1_QueryTotalTimeoutFeesResponse(buffer_arg) {
  return ibc_applications_fee_v1_query_pb.QueryTotalTimeoutFeesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the ICS29 gRPC querier service.
var QueryService = exports.QueryService = {
  // IncentivizedPackets returns all incentivized packets and their associated fees
incentivizedPackets: {
    path: '/ibc.applications.fee.v1.Query/IncentivizedPackets',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsRequest,
    responseType: ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_QueryIncentivizedPacketsRequest,
    requestDeserialize: deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketsRequest,
    responseSerialize: serialize_ibc_applications_fee_v1_QueryIncentivizedPacketsResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketsResponse,
  },
  // IncentivizedPacket returns all packet fees for a packet given its identifier
incentivizedPacket: {
    path: '/ibc.applications.fee.v1.Query/IncentivizedPacket',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketRequest,
    responseType: ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_QueryIncentivizedPacketRequest,
    requestDeserialize: deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketRequest,
    responseSerialize: serialize_ibc_applications_fee_v1_QueryIncentivizedPacketResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketResponse,
  },
  // Gets all incentivized packets for a specific channel
incentivizedPacketsForChannel: {
    path: '/ibc.applications.fee.v1.Query/IncentivizedPacketsForChannel',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsForChannelRequest,
    responseType: ibc_applications_fee_v1_query_pb.QueryIncentivizedPacketsForChannelResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_QueryIncentivizedPacketsForChannelRequest,
    requestDeserialize: deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketsForChannelRequest,
    responseSerialize: serialize_ibc_applications_fee_v1_QueryIncentivizedPacketsForChannelResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_QueryIncentivizedPacketsForChannelResponse,
  },
  // TotalRecvFees returns the total receive fees for a packet given its identifier
totalRecvFees: {
    path: '/ibc.applications.fee.v1.Query/TotalRecvFees',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_query_pb.QueryTotalRecvFeesRequest,
    responseType: ibc_applications_fee_v1_query_pb.QueryTotalRecvFeesResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_QueryTotalRecvFeesRequest,
    requestDeserialize: deserialize_ibc_applications_fee_v1_QueryTotalRecvFeesRequest,
    responseSerialize: serialize_ibc_applications_fee_v1_QueryTotalRecvFeesResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_QueryTotalRecvFeesResponse,
  },
  // TotalAckFees returns the total acknowledgement fees for a packet given its identifier
totalAckFees: {
    path: '/ibc.applications.fee.v1.Query/TotalAckFees',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_query_pb.QueryTotalAckFeesRequest,
    responseType: ibc_applications_fee_v1_query_pb.QueryTotalAckFeesResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_QueryTotalAckFeesRequest,
    requestDeserialize: deserialize_ibc_applications_fee_v1_QueryTotalAckFeesRequest,
    responseSerialize: serialize_ibc_applications_fee_v1_QueryTotalAckFeesResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_QueryTotalAckFeesResponse,
  },
  // TotalTimeoutFees returns the total timeout fees for a packet given its identifier
totalTimeoutFees: {
    path: '/ibc.applications.fee.v1.Query/TotalTimeoutFees',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_query_pb.QueryTotalTimeoutFeesRequest,
    responseType: ibc_applications_fee_v1_query_pb.QueryTotalTimeoutFeesResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_QueryTotalTimeoutFeesRequest,
    requestDeserialize: deserialize_ibc_applications_fee_v1_QueryTotalTimeoutFeesRequest,
    responseSerialize: serialize_ibc_applications_fee_v1_QueryTotalTimeoutFeesResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_QueryTotalTimeoutFeesResponse,
  },
  // Payee returns the registered payee address for a specific channel given the relayer address
payee: {
    path: '/ibc.applications.fee.v1.Query/Payee',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_query_pb.QueryPayeeRequest,
    responseType: ibc_applications_fee_v1_query_pb.QueryPayeeResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_QueryPayeeRequest,
    requestDeserialize: deserialize_ibc_applications_fee_v1_QueryPayeeRequest,
    responseSerialize: serialize_ibc_applications_fee_v1_QueryPayeeResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_QueryPayeeResponse,
  },
  // CounterpartyPayee returns the registered counterparty payee for forward relaying
counterpartyPayee: {
    path: '/ibc.applications.fee.v1.Query/CounterpartyPayee',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_query_pb.QueryCounterpartyPayeeRequest,
    responseType: ibc_applications_fee_v1_query_pb.QueryCounterpartyPayeeResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_QueryCounterpartyPayeeRequest,
    requestDeserialize: deserialize_ibc_applications_fee_v1_QueryCounterpartyPayeeRequest,
    responseSerialize: serialize_ibc_applications_fee_v1_QueryCounterpartyPayeeResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_QueryCounterpartyPayeeResponse,
  },
  // FeeEnabledChannels returns a list of all fee enabled channels
feeEnabledChannels: {
    path: '/ibc.applications.fee.v1.Query/FeeEnabledChannels',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelsRequest,
    responseType: ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelsResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_QueryFeeEnabledChannelsRequest,
    requestDeserialize: deserialize_ibc_applications_fee_v1_QueryFeeEnabledChannelsRequest,
    responseSerialize: serialize_ibc_applications_fee_v1_QueryFeeEnabledChannelsResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_QueryFeeEnabledChannelsResponse,
  },
  // FeeEnabledChannel returns true if the provided port and channel identifiers belong to a fee enabled channel
feeEnabledChannel: {
    path: '/ibc.applications.fee.v1.Query/FeeEnabledChannel',
    requestStream: false,
    responseStream: false,
    requestType: ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelRequest,
    responseType: ibc_applications_fee_v1_query_pb.QueryFeeEnabledChannelResponse,
    requestSerialize: serialize_ibc_applications_fee_v1_QueryFeeEnabledChannelRequest,
    requestDeserialize: deserialize_ibc_applications_fee_v1_QueryFeeEnabledChannelRequest,
    responseSerialize: serialize_ibc_applications_fee_v1_QueryFeeEnabledChannelResponse,
    responseDeserialize: deserialize_ibc_applications_fee_v1_QueryFeeEnabledChannelResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
