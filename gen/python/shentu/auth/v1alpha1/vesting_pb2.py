# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: shentu/auth/v1alpha1/vesting.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos.vesting.v1beta1 import vesting_pb2 as cosmos_dot_vesting_dot_v1beta1_dot_vesting__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"shentu/auth/v1alpha1/vesting.proto\x12\x14\x63osmos.auth.v1alpha1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a$cosmos/vesting/v1beta1/vesting.proto\"\xbd\x02\n\x14ManualVestingAccount\x12\x62\n\x14\x62\x61se_vesting_account\x18\x01 \x01(\x0b\x32*.cosmos.vesting.v1beta1.BaseVestingAccountB\x04\xd0\xde\x1f\x01R\x12\x62\x61seVestingAccount\x12\x85\x01\n\x0cvested_coins\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBG\xc8\xde\x1f\x00\xf2\xde\x1f\x13yaml:\"vested_coins\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0bvestedCoins\x12/\n\x08unlocker\x18\x03 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"unlocker\"R\x08unlocker:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\x42\xc9\x01\n\x18\x63om.cosmos.auth.v1alpha1B\x0cVestingProtoZ/github.com/shentufoundation/shentu/x/auth/types\xa2\x02\x03\x43\x41X\xaa\x02\x14\x43osmos.Auth.V1alpha1\xca\x02\x14\x43osmos\\Auth\\V1alpha1\xe2\x02 Cosmos\\Auth\\V1alpha1\\GPBMetadata\xea\x02\x16\x43osmos::Auth::V1alpha1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'shentu.auth.v1alpha1.vesting_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.cosmos.auth.v1alpha1B\014VestingProtoZ/github.com/shentufoundation/shentu/x/auth/types\242\002\003CAX\252\002\024Cosmos.Auth.V1alpha1\312\002\024Cosmos\\Auth\\V1alpha1\342\002 Cosmos\\Auth\\V1alpha1\\GPBMetadata\352\002\026Cosmos::Auth::V1alpha1'
  _globals['_MANUALVESTINGACCOUNT'].fields_by_name['base_vesting_account']._options = None
  _globals['_MANUALVESTINGACCOUNT'].fields_by_name['base_vesting_account']._serialized_options = b'\320\336\037\001'
  _globals['_MANUALVESTINGACCOUNT'].fields_by_name['vested_coins']._options = None
  _globals['_MANUALVESTINGACCOUNT'].fields_by_name['vested_coins']._serialized_options = b'\310\336\037\000\362\336\037\023yaml:\"vested_coins\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MANUALVESTINGACCOUNT'].fields_by_name['unlocker']._options = None
  _globals['_MANUALVESTINGACCOUNT'].fields_by_name['unlocker']._serialized_options = b'\362\336\037\017yaml:\"unlocker\"'
  _globals['_MANUALVESTINGACCOUNT']._options = None
  _globals['_MANUALVESTINGACCOUNT']._serialized_options = b'\210\240\037\000\230\240\037\000'
  _globals['_MANUALVESTINGACCOUNT']._serialized_start=153
  _globals['_MANUALVESTINGACCOUNT']._serialized_end=470
# @@protoc_insertion_point(module_scope)
