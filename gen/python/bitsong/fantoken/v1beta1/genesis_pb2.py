# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: bitsong/fantoken/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from bitsong.fantoken.v1beta1 import fantoken_pb2 as bitsong_dot_fantoken_dot_v1beta1_dot_fantoken__pb2
from bitsong.fantoken.v1beta1 import params_pb2 as bitsong_dot_fantoken_dot_v1beta1_dot_params__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&bitsong/fantoken/v1beta1/genesis.proto\x12\x18\x62itsong.fantoken.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\'bitsong/fantoken/v1beta1/fantoken.proto\x1a%bitsong/fantoken/v1beta1/params.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x97\x01\n\x0cGenesisState\x12>\n\x06params\x18\x01 \x01(\x0b\x32 .bitsong.fantoken.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12G\n\nfan_tokens\x18\x02 \x03(\x0b\x32\".bitsong.fantoken.v1beta1.FanTokenB\x04\xc8\xde\x1f\x00R\tfanTokensB\xe4\x01\n\x1c\x63om.bitsong.fantoken.v1beta1B\x0cGenesisProtoZ6github.com/bitsongofficial/go-bitsong/x/fantoken/types\xa2\x02\x03\x42\x46X\xaa\x02\x18\x42itsong.Fantoken.V1beta1\xca\x02\x18\x42itsong\\Fantoken\\V1beta1\xe2\x02$Bitsong\\Fantoken\\V1beta1\\GPBMetadata\xea\x02\x1a\x42itsong::Fantoken::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'bitsong.fantoken.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.bitsong.fantoken.v1beta1B\014GenesisProtoZ6github.com/bitsongofficial/go-bitsong/x/fantoken/types\242\002\003BFX\252\002\030Bitsong.Fantoken.V1beta1\312\002\030Bitsong\\Fantoken\\V1beta1\342\002$Bitsong\\Fantoken\\V1beta1\\GPBMetadata\352\002\032Bitsong::Fantoken::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['fan_tokens']._options = None
  _globals['_GENESISSTATE'].fields_by_name['fan_tokens']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=203
  _globals['_GENESISSTATE']._serialized_end=354
# @@protoc_insertion_point(module_scope)
