# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/market/v1beta3/service.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from akash.market.v1beta3 import bid_pb2 as akash_dot_market_dot_v1beta3_dot_bid__pb2
from akash.market.v1beta3 import lease_pb2 as akash_dot_market_dot_v1beta3_dot_lease__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"akash/market/v1beta3/service.proto\x12\x14\x61kash.market.v1beta3\x1a\x1e\x61kash/market/v1beta3/bid.proto\x1a akash/market/v1beta3/lease.proto2\xe8\x03\n\x03Msg\x12[\n\tCreateBid\x12\".akash.market.v1beta3.MsgCreateBid\x1a*.akash.market.v1beta3.MsgCreateBidResponse\x12X\n\x08\x43loseBid\x12!.akash.market.v1beta3.MsgCloseBid\x1a).akash.market.v1beta3.MsgCloseBidResponse\x12g\n\rWithdrawLease\x12&.akash.market.v1beta3.MsgWithdrawLease\x1a..akash.market.v1beta3.MsgWithdrawLeaseResponse\x12\x61\n\x0b\x43reateLease\x12$.akash.market.v1beta3.MsgCreateLease\x1a,.akash.market.v1beta3.MsgCreateLeaseResponse\x12^\n\nCloseLease\x12#.akash.market.v1beta3.MsgCloseLease\x1a+.akash.market.v1beta3.MsgCloseLeaseResponseB\xd3\x01\n\x18\x63om.akash.market.v1beta3B\x0cServiceProtoZ9github.com/akash-network/akash-api/go/node/market/v1beta3\xa2\x02\x03\x41MX\xaa\x02\x14\x41kash.Market.V1beta3\xca\x02\x14\x41kash\\Market\\V1beta3\xe2\x02 Akash\\Market\\V1beta3\\GPBMetadata\xea\x02\x16\x41kash::Market::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.market.v1beta3.service_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.akash.market.v1beta3B\014ServiceProtoZ9github.com/akash-network/akash-api/go/node/market/v1beta3\242\002\003AMX\252\002\024Akash.Market.V1beta3\312\002\024Akash\\Market\\V1beta3\342\002 Akash\\Market\\V1beta3\\GPBMetadata\352\002\026Akash::Market::V1beta3'
  _globals['_MSG']._serialized_start=127
  _globals['_MSG']._serialized_end=615
# @@protoc_insertion_point(module_scope)
