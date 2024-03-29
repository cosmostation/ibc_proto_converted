# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: evmos/vesting/v1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x65vmos/vesting/v1/query.proto\x12\x10\x65vmos.vesting.v1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\"0\n\x14QueryBalancesRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\"\xca\x02\n\x15QueryBalancesResponse\x12\x63\n\x06locked\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06locked\x12g\n\x08unvested\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x08unvested\x12\x63\n\x06vested\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06vested2\x93\x01\n\x05Query\x12\x89\x01\n\x08\x42\x61lances\x12&.evmos.vesting.v1.QueryBalancesRequest\x1a\'.evmos.vesting.v1.QueryBalancesResponse\",\x82\xd3\xe4\x93\x02&\x12$/evmos/vesting/v1/balances/{address}B\xae\x01\n\x14\x63om.evmos.vesting.v1B\nQueryProtoZ*github.com/evmos/evmos/v13/x/vesting/types\xa2\x02\x03\x45VX\xaa\x02\x10\x45vmos.Vesting.V1\xca\x02\x10\x45vmos\\Vesting\\V1\xe2\x02\x1c\x45vmos\\Vesting\\V1\\GPBMetadata\xea\x02\x12\x45vmos::Vesting::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'evmos.vesting.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.evmos.vesting.v1B\nQueryProtoZ*github.com/evmos/evmos/v13/x/vesting/types\242\002\003EVX\252\002\020Evmos.Vesting.V1\312\002\020Evmos\\Vesting\\V1\342\002\034Evmos\\Vesting\\V1\\GPBMetadata\352\002\022Evmos::Vesting::V1'
  _globals['_QUERYBALANCESRESPONSE'].fields_by_name['locked']._options = None
  _globals['_QUERYBALANCESRESPONSE'].fields_by_name['locked']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERYBALANCESRESPONSE'].fields_by_name['unvested']._options = None
  _globals['_QUERYBALANCESRESPONSE'].fields_by_name['unvested']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERYBALANCESRESPONSE'].fields_by_name['vested']._options = None
  _globals['_QUERYBALANCESRESPONSE'].fields_by_name['vested']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_QUERY'].methods_by_name['Balances']._options = None
  _globals['_QUERY'].methods_by_name['Balances']._serialized_options = b'\202\323\344\223\002&\022$/evmos/vesting/v1/balances/{address}'
  _globals['_QUERYBALANCESREQUEST']._serialized_start=134
  _globals['_QUERYBALANCESREQUEST']._serialized_end=182
  _globals['_QUERYBALANCESRESPONSE']._serialized_start=185
  _globals['_QUERYBALANCESRESPONSE']._serialized_end=515
  _globals['_QUERY']._serialized_start=518
  _globals['_QUERY']._serialized_end=665
# @@protoc_insertion_point(module_scope)
