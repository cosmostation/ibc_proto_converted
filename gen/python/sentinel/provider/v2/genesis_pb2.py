# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/provider/v2/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from sentinel.provider.v2 import params_pb2 as sentinel_dot_provider_dot_v2_dot_params__pb2
from sentinel.provider.v2 import provider_pb2 as sentinel_dot_provider_dot_v2_dot_provider__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"sentinel/provider/v2/genesis.proto\x12\x14sentinel.provider.v2\x1a\x14gogoproto/gogo.proto\x1a!sentinel/provider/v2/params.proto\x1a#sentinel/provider/v2/provider.proto\"\x8e\x01\n\x0cGenesisState\x12\x42\n\tproviders\x18\x01 \x03(\x0b\x32\x1e.sentinel.provider.v2.ProviderB\x04\xc8\xde\x1f\x00R\tproviders\x12:\n\x06params\x18\x02 \x01(\x0b\x32\x1c.sentinel.provider.v2.ParamsB\x04\xc8\xde\x1f\x00R\x06paramsB\xd3\x01\n\x18\x63om.sentinel.provider.v2B\x0cGenesisProtoZ1github.com/sentinel-official/hub/x/provider/types\xa2\x02\x03SPX\xaa\x02\x14Sentinel.Provider.V2\xca\x02\x14Sentinel\\Provider\\V2\xe2\x02 Sentinel\\Provider\\V2\\GPBMetadata\xea\x02\x16Sentinel::Provider::V2\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.provider.v2.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\030com.sentinel.provider.v2B\014GenesisProtoZ1github.com/sentinel-official/hub/x/provider/types\242\002\003SPX\252\002\024Sentinel.Provider.V2\312\002\024Sentinel\\Provider\\V2\342\002 Sentinel\\Provider\\V2\\GPBMetadata\352\002\026Sentinel::Provider::V2\310\341\036\000\250\342\036\000'
  _globals['_GENESISSTATE'].fields_by_name['providers']._options = None
  _globals['_GENESISSTATE'].fields_by_name['providers']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=155
  _globals['_GENESISSTATE']._serialized_end=297
# @@protoc_insertion_point(module_scope)
