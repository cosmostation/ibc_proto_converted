# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: band/globalfee/v1beta1/genesis.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$band/globalfee/v1beta1/genesis.proto\x12\x11globalfee.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"[\n\x0cGenesisState\x12K\n\x06params\x18\x01 \x01(\x0b\x32\x19.globalfee.v1beta1.ParamsB\x18\xc8\xde\x1f\x00\xea\xde\x1f\x10params,omitemptyR\x06params\"\xc7\x01\n\x06Params\x12\xbc\x01\n\x12minimum_gas_prices\x18\x01 \x03(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinBp\xc8\xde\x1f\x00\xea\xde\x1f\x1cminimum_gas_prices,omitempty\xf2\xde\x1f\x19yaml:\"minimum_gas_prices\"\xaa\xdf\x1f+github.com/cosmos/cosmos-sdk/types.DecCoinsR\x10minimumGasPricesB\xbc\x01\n\x15\x63om.globalfee.v1beta1B\x0cGenesisProtoZ2github.com/bandprotocol/chain/v2/x/globalfee/types\xa2\x02\x03GXX\xaa\x02\x11Globalfee.V1beta1\xca\x02\x11Globalfee\\V1beta1\xe2\x02\x1dGlobalfee\\V1beta1\\GPBMetadata\xea\x02\x12Globalfee::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'band.globalfee.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\025com.globalfee.v1beta1B\014GenesisProtoZ2github.com/bandprotocol/chain/v2/x/globalfee/types\242\002\003GXX\252\002\021Globalfee.V1beta1\312\002\021Globalfee\\V1beta1\342\002\035Globalfee\\V1beta1\\GPBMetadata\352\002\022Globalfee::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000\352\336\037\020params,omitempty'
  _globals['_PARAMS'].fields_by_name['minimum_gas_prices']._options = None
  _globals['_PARAMS'].fields_by_name['minimum_gas_prices']._serialized_options = b'\310\336\037\000\352\336\037\034minimum_gas_prices,omitempty\362\336\037\031yaml:\"minimum_gas_prices\"\252\337\037+github.com/cosmos/cosmos-sdk/types.DecCoins'
  _globals['_GENESISSTATE']._serialized_start=113
  _globals['_GENESISSTATE']._serialized_end=204
  _globals['_PARAMS']._serialized_start=207
  _globals['_PARAMS']._serialized_end=406
# @@protoc_insertion_point(module_scope)
