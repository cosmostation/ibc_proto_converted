# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/market/v1beta3/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from akash.market.v1beta3 import order_pb2 as akash_dot_market_dot_v1beta3_dot_order__pb2
from akash.market.v1beta3 import lease_pb2 as akash_dot_market_dot_v1beta3_dot_lease__pb2
from akash.market.v1beta3 import bid_pb2 as akash_dot_market_dot_v1beta3_dot_bid__pb2
from akash.market.v1beta3 import params_pb2 as akash_dot_market_dot_v1beta3_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"akash/market/v1beta3/genesis.proto\x12\x14\x61kash.market.v1beta3\x1a\x14gogoproto/gogo.proto\x1a akash/market/v1beta3/order.proto\x1a akash/market/v1beta3/lease.proto\x1a\x1e\x61kash/market/v1beta3/bid.proto\x1a!akash/market/v1beta3/params.proto\"\xdd\x02\n\x0cGenesisState\x12U\n\x06params\x18\x01 \x01(\x0b\x32\x1c.akash.market.v1beta3.ParamsB\x1f\xc8\xde\x1f\x00\xea\xde\x1f\x06params\xf2\xde\x1f\ryaml:\"params\"R\x06params\x12T\n\x06orders\x18\x02 \x03(\x0b\x32\x1b.akash.market.v1beta3.OrderB\x1f\xc8\xde\x1f\x00\xea\xde\x1f\x06orders\xf2\xde\x1f\ryaml:\"orders\"R\x06orders\x12T\n\x06leases\x18\x03 \x03(\x0b\x32\x1b.akash.market.v1beta3.LeaseB\x1f\xc8\xde\x1f\x00\xea\xde\x1f\x06leases\xf2\xde\x1f\ryaml:\"leases\"R\x06leases\x12J\n\x04\x62ids\x18\x04 \x03(\x0b\x32\x19.akash.market.v1beta3.BidB\x1b\xc8\xde\x1f\x00\xea\xde\x1f\x04\x62ids\xf2\xde\x1f\x0byaml:\"bids\"R\x04\x62idsB\xd3\x01\n\x18\x63om.akash.market.v1beta3B\x0cGenesisProtoZ9github.com/akash-network/akash-api/go/node/market/v1beta3\xa2\x02\x03\x41MX\xaa\x02\x14\x41kash.Market.V1beta3\xca\x02\x14\x41kash\\Market\\V1beta3\xe2\x02 Akash\\Market\\V1beta3\\GPBMetadata\xea\x02\x16\x41kash::Market::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.market.v1beta3.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.akash.market.v1beta3B\014GenesisProtoZ9github.com/akash-network/akash-api/go/node/market/v1beta3\242\002\003AMX\252\002\024Akash.Market.V1beta3\312\002\024Akash\\Market\\V1beta3\342\002 Akash\\Market\\V1beta3\\GPBMetadata\352\002\026Akash::Market::V1beta3'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000\352\336\037\006params\362\336\037\ryaml:\"params\"'
  _globals['_GENESISSTATE'].fields_by_name['orders']._options = None
  _globals['_GENESISSTATE'].fields_by_name['orders']._serialized_options = b'\310\336\037\000\352\336\037\006orders\362\336\037\ryaml:\"orders\"'
  _globals['_GENESISSTATE'].fields_by_name['leases']._options = None
  _globals['_GENESISSTATE'].fields_by_name['leases']._serialized_options = b'\310\336\037\000\352\336\037\006leases\362\336\037\ryaml:\"leases\"'
  _globals['_GENESISSTATE'].fields_by_name['bids']._options = None
  _globals['_GENESISSTATE'].fields_by_name['bids']._serialized_options = b'\310\336\037\000\352\336\037\004bids\362\336\037\013yaml:\"bids\"'
  _globals['_GENESISSTATE']._serialized_start=218
  _globals['_GENESISSTATE']._serialized_end=567
# @@protoc_insertion_point(module_scope)
