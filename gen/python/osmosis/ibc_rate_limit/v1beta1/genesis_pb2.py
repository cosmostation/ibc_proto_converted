# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/ibc-rate-limit/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from osmosis.ibc_rate_limit.v1beta1 import params_pb2 as osmosis_dot_ibc__rate__limit_dot_v1beta1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,osmosis/ibc-rate-limit/v1beta1/genesis.proto\x12\x1cosmosis.ibcratelimit.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x19google/protobuf/any.proto\x1a+osmosis/ibc-rate-limit/v1beta1/params.proto\"R\n\x0cGenesisState\x12\x42\n\x06params\x18\x01 \x01(\x0b\x32$.osmosis.ibcratelimit.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06paramsB\xfc\x01\n com.osmosis.ibcratelimit.v1beta1B\x0cGenesisProtoZ:github.com/osmosis-labs/osmosis/v15/x/ibc-rate-limit/types\xa2\x02\x03OIX\xaa\x02\x1cOsmosis.Ibcratelimit.V1beta1\xca\x02\x1cOsmosis\\Ibcratelimit\\V1beta1\xe2\x02(Osmosis\\Ibcratelimit\\V1beta1\\GPBMetadata\xea\x02\x1eOsmosis::Ibcratelimit::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.ibc_rate_limit.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n com.osmosis.ibcratelimit.v1beta1B\014GenesisProtoZ:github.com/osmosis-labs/osmosis/v15/x/ibc-rate-limit/types\242\002\003OIX\252\002\034Osmosis.Ibcratelimit.V1beta1\312\002\034Osmosis\\Ibcratelimit\\V1beta1\342\002(Osmosis\\Ibcratelimit\\V1beta1\\GPBMetadata\352\002\036Osmosis::Ibcratelimit::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=199
  _globals['_GENESISSTATE']._serialized_end=281
# @@protoc_insertion_point(module_scope)
