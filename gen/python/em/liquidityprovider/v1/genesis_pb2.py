# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: em/liquidityprovider/v1/genesis.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%em/liquidityprovider/v1/genesis.proto\x12\x17\x65m.liquidityprovider.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"h\n\x0cGenesisState\x12X\n\x08\x61\x63\x63ounts\x18\x01 \x03(\x0b\x32#.em.liquidityprovider.v1.GenesisAccB\x17\xc8\xde\x1f\x00\xf2\xde\x1f\x0fyaml:\"accounts\"R\x08\x61\x63\x63ounts\"\xb6\x01\n\nGenesisAcc\x12,\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\x12z\n\x08mintable\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBC\xc8\xde\x1f\x00\xf2\xde\x1f\x0fyaml:\"mintable\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x08mintableB\xdf\x01\n\x1b\x63om.em.liquidityprovider.v1B\x0cGenesisProtoZ6github.com/e-money/em-ledger/x/liquidityprovider/types\xa2\x02\x03\x45LX\xaa\x02\x17\x45m.Liquidityprovider.V1\xca\x02\x17\x45m\\Liquidityprovider\\V1\xe2\x02#Em\\Liquidityprovider\\V1\\GPBMetadata\xea\x02\x19\x45m::Liquidityprovider::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'em.liquidityprovider.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\033com.em.liquidityprovider.v1B\014GenesisProtoZ6github.com/e-money/em-ledger/x/liquidityprovider/types\242\002\003ELX\252\002\027Em.Liquidityprovider.V1\312\002\027Em\\Liquidityprovider\\V1\342\002#Em\\Liquidityprovider\\V1\\GPBMetadata\352\002\031Em::Liquidityprovider::V1'
  _globals['_GENESISSTATE'].fields_by_name['accounts']._options = None
  _globals['_GENESISSTATE'].fields_by_name['accounts']._serialized_options = b'\310\336\037\000\362\336\037\017yaml:\"accounts\"'
  _globals['_GENESISACC'].fields_by_name['address']._options = None
  _globals['_GENESISACC'].fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _globals['_GENESISACC'].fields_by_name['mintable']._options = None
  _globals['_GENESISACC'].fields_by_name['mintable']._serialized_options = b'\310\336\037\000\362\336\037\017yaml:\"mintable\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_GENESISSTATE']._serialized_start=120
  _globals['_GENESISSTATE']._serialized_end=224
  _globals['_GENESISACC']._serialized_start=227
  _globals['_GENESISACC']._serialized_end=409
# @@protoc_insertion_point(module_scope)
