# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/swap/v1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from sentinel.swap.v1 import params_pb2 as sentinel_dot_swap_dot_v1_dot_params__pb2
from sentinel.swap.v1 import swap_pb2 as sentinel_dot_swap_dot_v1_dot_swap__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1esentinel/swap/v1/genesis.proto\x12\x10sentinel.swap.v1\x1a\x14gogoproto/gogo.proto\x1a\x1dsentinel/swap/v1/params.proto\x1a\x1bsentinel/swap/v1/swap.proto\"\x89\x01\n\x0cGenesisState\x12\x41\n\x05swaps\x18\x01 \x03(\x0b\x32\x16.sentinel.swap.v1.SwapB\x13\xc8\xde\x1f\x00\xea\xde\x1f\x0b_,omitemptyR\x05swaps\x12\x36\n\x06params\x18\x02 \x01(\x0b\x32\x18.sentinel.swap.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06paramsB\xbb\x01\n\x14\x63om.sentinel.swap.v1B\x0cGenesisProtoZ-github.com/sentinel-official/hub/x/swap/types\xa2\x02\x03SSX\xaa\x02\x10Sentinel.Swap.V1\xca\x02\x10Sentinel\\Swap\\V1\xe2\x02\x1cSentinel\\Swap\\V1\\GPBMetadata\xea\x02\x12Sentinel::Swap::V1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.swap.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\024com.sentinel.swap.v1B\014GenesisProtoZ-github.com/sentinel-official/hub/x/swap/types\242\002\003SSX\252\002\020Sentinel.Swap.V1\312\002\020Sentinel\\Swap\\V1\342\002\034Sentinel\\Swap\\V1\\GPBMetadata\352\002\022Sentinel::Swap::V1\310\341\036\000\250\342\036\000'
  _globals['_GENESISSTATE'].fields_by_name['swaps']._options = None
  _globals['_GENESISSTATE'].fields_by_name['swaps']._serialized_options = b'\310\336\037\000\352\336\037\013_,omitempty'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=135
  _globals['_GENESISSTATE']._serialized_end=272
# @@protoc_insertion_point(module_scope)
