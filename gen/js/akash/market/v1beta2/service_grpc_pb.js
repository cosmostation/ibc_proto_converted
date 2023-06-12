// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var akash_market_v1beta2_bid_pb = require('../../../akash/market/v1beta2/bid_pb.js');
var akash_market_v1beta2_lease_pb = require('../../../akash/market/v1beta2/lease_pb.js');

function serialize_akash_market_v1beta2_MsgCloseBid(arg) {
  if (!(arg instanceof akash_market_v1beta2_bid_pb.MsgCloseBid)) {
    throw new Error('Expected argument of type akash.market.v1beta2.MsgCloseBid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_MsgCloseBid(buffer_arg) {
  return akash_market_v1beta2_bid_pb.MsgCloseBid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_MsgCloseBidResponse(arg) {
  if (!(arg instanceof akash_market_v1beta2_bid_pb.MsgCloseBidResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta2.MsgCloseBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_MsgCloseBidResponse(buffer_arg) {
  return akash_market_v1beta2_bid_pb.MsgCloseBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_MsgCloseLease(arg) {
  if (!(arg instanceof akash_market_v1beta2_lease_pb.MsgCloseLease)) {
    throw new Error('Expected argument of type akash.market.v1beta2.MsgCloseLease');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_MsgCloseLease(buffer_arg) {
  return akash_market_v1beta2_lease_pb.MsgCloseLease.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_MsgCloseLeaseResponse(arg) {
  if (!(arg instanceof akash_market_v1beta2_lease_pb.MsgCloseLeaseResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta2.MsgCloseLeaseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_MsgCloseLeaseResponse(buffer_arg) {
  return akash_market_v1beta2_lease_pb.MsgCloseLeaseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_MsgCreateBid(arg) {
  if (!(arg instanceof akash_market_v1beta2_bid_pb.MsgCreateBid)) {
    throw new Error('Expected argument of type akash.market.v1beta2.MsgCreateBid');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_MsgCreateBid(buffer_arg) {
  return akash_market_v1beta2_bid_pb.MsgCreateBid.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_MsgCreateBidResponse(arg) {
  if (!(arg instanceof akash_market_v1beta2_bid_pb.MsgCreateBidResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta2.MsgCreateBidResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_MsgCreateBidResponse(buffer_arg) {
  return akash_market_v1beta2_bid_pb.MsgCreateBidResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_MsgCreateLease(arg) {
  if (!(arg instanceof akash_market_v1beta2_lease_pb.MsgCreateLease)) {
    throw new Error('Expected argument of type akash.market.v1beta2.MsgCreateLease');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_MsgCreateLease(buffer_arg) {
  return akash_market_v1beta2_lease_pb.MsgCreateLease.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_MsgCreateLeaseResponse(arg) {
  if (!(arg instanceof akash_market_v1beta2_lease_pb.MsgCreateLeaseResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta2.MsgCreateLeaseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_MsgCreateLeaseResponse(buffer_arg) {
  return akash_market_v1beta2_lease_pb.MsgCreateLeaseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_MsgWithdrawLease(arg) {
  if (!(arg instanceof akash_market_v1beta2_lease_pb.MsgWithdrawLease)) {
    throw new Error('Expected argument of type akash.market.v1beta2.MsgWithdrawLease');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_MsgWithdrawLease(buffer_arg) {
  return akash_market_v1beta2_lease_pb.MsgWithdrawLease.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_akash_market_v1beta2_MsgWithdrawLeaseResponse(arg) {
  if (!(arg instanceof akash_market_v1beta2_lease_pb.MsgWithdrawLeaseResponse)) {
    throw new Error('Expected argument of type akash.market.v1beta2.MsgWithdrawLeaseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_akash_market_v1beta2_MsgWithdrawLeaseResponse(buffer_arg) {
  return akash_market_v1beta2_lease_pb.MsgWithdrawLeaseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the market Msg service
var MsgService = exports.MsgService = {
  // CreateBid defines a method to create a bid given proper inputs.
createBid: {
    path: '/akash.market.v1beta2.Msg/CreateBid',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta2_bid_pb.MsgCreateBid,
    responseType: akash_market_v1beta2_bid_pb.MsgCreateBidResponse,
    requestSerialize: serialize_akash_market_v1beta2_MsgCreateBid,
    requestDeserialize: deserialize_akash_market_v1beta2_MsgCreateBid,
    responseSerialize: serialize_akash_market_v1beta2_MsgCreateBidResponse,
    responseDeserialize: deserialize_akash_market_v1beta2_MsgCreateBidResponse,
  },
  // CloseBid defines a method to close a bid given proper inputs.
closeBid: {
    path: '/akash.market.v1beta2.Msg/CloseBid',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta2_bid_pb.MsgCloseBid,
    responseType: akash_market_v1beta2_bid_pb.MsgCloseBidResponse,
    requestSerialize: serialize_akash_market_v1beta2_MsgCloseBid,
    requestDeserialize: deserialize_akash_market_v1beta2_MsgCloseBid,
    responseSerialize: serialize_akash_market_v1beta2_MsgCloseBidResponse,
    responseDeserialize: deserialize_akash_market_v1beta2_MsgCloseBidResponse,
  },
  // WithdrawLease withdraws accrued funds from the lease payment
withdrawLease: {
    path: '/akash.market.v1beta2.Msg/WithdrawLease',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta2_lease_pb.MsgWithdrawLease,
    responseType: akash_market_v1beta2_lease_pb.MsgWithdrawLeaseResponse,
    requestSerialize: serialize_akash_market_v1beta2_MsgWithdrawLease,
    requestDeserialize: deserialize_akash_market_v1beta2_MsgWithdrawLease,
    responseSerialize: serialize_akash_market_v1beta2_MsgWithdrawLeaseResponse,
    responseDeserialize: deserialize_akash_market_v1beta2_MsgWithdrawLeaseResponse,
  },
  // CreateLease creates a new lease
createLease: {
    path: '/akash.market.v1beta2.Msg/CreateLease',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta2_lease_pb.MsgCreateLease,
    responseType: akash_market_v1beta2_lease_pb.MsgCreateLeaseResponse,
    requestSerialize: serialize_akash_market_v1beta2_MsgCreateLease,
    requestDeserialize: deserialize_akash_market_v1beta2_MsgCreateLease,
    responseSerialize: serialize_akash_market_v1beta2_MsgCreateLeaseResponse,
    responseDeserialize: deserialize_akash_market_v1beta2_MsgCreateLeaseResponse,
  },
  // CloseLease defines a method to close an order given proper inputs.
closeLease: {
    path: '/akash.market.v1beta2.Msg/CloseLease',
    requestStream: false,
    responseStream: false,
    requestType: akash_market_v1beta2_lease_pb.MsgCloseLease,
    responseType: akash_market_v1beta2_lease_pb.MsgCloseLeaseResponse,
    requestSerialize: serialize_akash_market_v1beta2_MsgCloseLease,
    requestDeserialize: deserialize_akash_market_v1beta2_MsgCloseLease,
    responseSerialize: serialize_akash_market_v1beta2_MsgCloseLeaseResponse,
    responseDeserialize: deserialize_akash_market_v1beta2_MsgCloseLeaseResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
