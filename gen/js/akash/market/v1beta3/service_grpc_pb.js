// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_market_v1beta3_bid_pb = require('../../../akash/market/v1beta3/bid_pb.js');
var akash_market_v1beta3_lease_pb = require('../../../akash/market/v1beta3/lease_pb.js');

function serialize_akash_market_v1beta3_MsgCloseBid(arg) {
  if (!(arg instanceof akash_market_v1beta3_bid_pb.MsgCloseBid)) {
    throw new Error('Expected argument of type akash.market.v1beta3.MsgCloseBid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_MsgCloseBid(buffer_arg) {
  return akash_market_v1beta3_bid_pb.MsgCloseBid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_MsgCloseBidResponse(arg) {
  if (!(arg instanceof akash_market_v1beta3_bid_pb.MsgCloseBidResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta3.MsgCloseBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_MsgCloseBidResponse(buffer_arg) {
  return akash_market_v1beta3_bid_pb.MsgCloseBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_MsgCloseLease(arg) {
  if (!(arg instanceof akash_market_v1beta3_lease_pb.MsgCloseLease)) {
    throw new Error('Expected argument of type akash.market.v1beta3.MsgCloseLease');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_MsgCloseLease(buffer_arg) {
  return akash_market_v1beta3_lease_pb.MsgCloseLease.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_MsgCloseLeaseResponse(arg) {
  if (!(arg instanceof akash_market_v1beta3_lease_pb.MsgCloseLeaseResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta3.MsgCloseLeaseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_MsgCloseLeaseResponse(buffer_arg) {
  return akash_market_v1beta3_lease_pb.MsgCloseLeaseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_MsgCreateBid(arg) {
  if (!(arg instanceof akash_market_v1beta3_bid_pb.MsgCreateBid)) {
    throw new Error('Expected argument of type akash.market.v1beta3.MsgCreateBid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_MsgCreateBid(buffer_arg) {
  return akash_market_v1beta3_bid_pb.MsgCreateBid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_MsgCreateBidResponse(arg) {
  if (!(arg instanceof akash_market_v1beta3_bid_pb.MsgCreateBidResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta3.MsgCreateBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_MsgCreateBidResponse(buffer_arg) {
  return akash_market_v1beta3_bid_pb.MsgCreateBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_MsgCreateLease(arg) {
  if (!(arg instanceof akash_market_v1beta3_lease_pb.MsgCreateLease)) {
    throw new Error('Expected argument of type akash.market.v1beta3.MsgCreateLease');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_MsgCreateLease(buffer_arg) {
  return akash_market_v1beta3_lease_pb.MsgCreateLease.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_MsgCreateLeaseResponse(arg) {
  if (!(arg instanceof akash_market_v1beta3_lease_pb.MsgCreateLeaseResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta3.MsgCreateLeaseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_MsgCreateLeaseResponse(buffer_arg) {
  return akash_market_v1beta3_lease_pb.MsgCreateLeaseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_MsgWithdrawLease(arg) {
  if (!(arg instanceof akash_market_v1beta3_lease_pb.MsgWithdrawLease)) {
    throw new Error('Expected argument of type akash.market.v1beta3.MsgWithdrawLease');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_MsgWithdrawLease(buffer_arg) {
  return akash_market_v1beta3_lease_pb.MsgWithdrawLease.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta3_MsgWithdrawLeaseResponse(arg) {
  if (!(arg instanceof akash_market_v1beta3_lease_pb.MsgWithdrawLeaseResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta3.MsgWithdrawLeaseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta3_MsgWithdrawLeaseResponse(buffer_arg) {
  return akash_market_v1beta3_lease_pb.MsgWithdrawLeaseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the market Msg service
var MsgService = exports.MsgService = {
  // CreateBid defines a method to create a bid given proper inputs.
createBid: {
    path: '/akash.market.v1beta3.Msg/CreateBid',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta3_bid_pb.MsgCreateBid,
    responseType: akash_market_v1beta3_bid_pb.MsgCreateBidResponse,
    requestSerialize: serialize_akash_market_v1beta3_MsgCreateBid,
    requestDeserialize: deserialize_akash_market_v1beta3_MsgCreateBid,
    responseSerialize: serialize_akash_market_v1beta3_MsgCreateBidResponse,
    responseDeserialize: deserialize_akash_market_v1beta3_MsgCreateBidResponse,
  },
  // CloseBid defines a method to close a bid given proper inputs.
closeBid: {
    path: '/akash.market.v1beta3.Msg/CloseBid',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta3_bid_pb.MsgCloseBid,
    responseType: akash_market_v1beta3_bid_pb.MsgCloseBidResponse,
    requestSerialize: serialize_akash_market_v1beta3_MsgCloseBid,
    requestDeserialize: deserialize_akash_market_v1beta3_MsgCloseBid,
    responseSerialize: serialize_akash_market_v1beta3_MsgCloseBidResponse,
    responseDeserialize: deserialize_akash_market_v1beta3_MsgCloseBidResponse,
  },
  // WithdrawLease withdraws accrued funds from the lease payment
withdrawLease: {
    path: '/akash.market.v1beta3.Msg/WithdrawLease',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta3_lease_pb.MsgWithdrawLease,
    responseType: akash_market_v1beta3_lease_pb.MsgWithdrawLeaseResponse,
    requestSerialize: serialize_akash_market_v1beta3_MsgWithdrawLease,
    requestDeserialize: deserialize_akash_market_v1beta3_MsgWithdrawLease,
    responseSerialize: serialize_akash_market_v1beta3_MsgWithdrawLeaseResponse,
    responseDeserialize: deserialize_akash_market_v1beta3_MsgWithdrawLeaseResponse,
  },
  // CreateLease creates a new lease
createLease: {
    path: '/akash.market.v1beta3.Msg/CreateLease',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta3_lease_pb.MsgCreateLease,
    responseType: akash_market_v1beta3_lease_pb.MsgCreateLeaseResponse,
    requestSerialize: serialize_akash_market_v1beta3_MsgCreateLease,
    requestDeserialize: deserialize_akash_market_v1beta3_MsgCreateLease,
    responseSerialize: serialize_akash_market_v1beta3_MsgCreateLeaseResponse,
    responseDeserialize: deserialize_akash_market_v1beta3_MsgCreateLeaseResponse,
  },
  // CloseLease defines a method to close an order given proper inputs.
closeLease: {
    path: '/akash.market.v1beta3.Msg/CloseLease',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta3_lease_pb.MsgCloseLease,
    responseType: akash_market_v1beta3_lease_pb.MsgCloseLeaseResponse,
    requestSerialize: serialize_akash_market_v1beta3_MsgCloseLease,
    requestDeserialize: deserialize_akash_market_v1beta3_MsgCloseLease,
    responseSerialize: serialize_akash_market_v1beta3_MsgCloseLeaseResponse,
    responseDeserialize: deserialize_akash_market_v1beta3_MsgCloseLeaseResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
