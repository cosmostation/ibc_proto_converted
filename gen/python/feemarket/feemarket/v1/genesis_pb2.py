# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: feemarket/feemarket/v1/genesis.proto
# Protobuf Python Version: 5.27.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    27,
    0,
    '',
    'feemarket/feemarket/v1/genesis.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from feemarket.feemarket.v1 import params_pb2 as feemarket_dot_feemarket_dot_v1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$feemarket/feemarket/v1/genesis.proto\x12\x16\x66\x65\x65market.feemarket.v1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a#feemarket/feemarket/v1/params.proto\"\x87\x01\n\x0cGenesisState\x12<\n\x06params\x18\x01 \x01(\x0b\x32\x1e.feemarket.feemarket.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12\x39\n\x05state\x18\x02 \x01(\x0b\x32\x1d.feemarket.feemarket.v1.StateB\x04\xc8\xde\x1f\x00R\x05state\"\xdb\x01\n\x05State\x12L\n\x08\x62\x61se_fee\x18\x01 \x01(\tB1\xc8\xde\x1f\x00\xda\xde\x1f\x1b\x63osmossdk.io/math.LegacyDec\xd2\xb4-\ncosmos.DecR\x07\x62\x61seFee\x12V\n\rlearning_rate\x18\x02 \x01(\tB1\xc8\xde\x1f\x00\xda\xde\x1f\x1b\x63osmossdk.io/math.LegacyDec\xd2\xb4-\ncosmos.DecR\x0clearningRate\x12\x16\n\x06window\x18\x03 \x03(\x04R\x06window\x12\x14\n\x05index\x18\x04 \x01(\x04R\x05indexB\xd3\x01\n\x1a\x63om.feemarket.feemarket.v1B\x0cGenesisProtoZ/github.com/skip-mev/feemarket/x/feemarket/types\xa2\x02\x03\x46\x46X\xaa\x02\x16\x46\x65\x65market.Feemarket.V1\xca\x02\x16\x46\x65\x65market\\Feemarket\\V1\xe2\x02\"Feemarket\\Feemarket\\V1\\GPBMetadata\xea\x02\x18\x46\x65\x65market::Feemarket::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'feemarket.feemarket.v1.genesis_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.feemarket.feemarket.v1B\014GenesisProtoZ/github.com/skip-mev/feemarket/x/feemarket/types\242\002\003FFX\252\002\026Feemarket.Feemarket.V1\312\002\026Feemarket\\Feemarket\\V1\342\002\"Feemarket\\Feemarket\\V1\\GPBMetadata\352\002\030Feemarket::Feemarket::V1'
  _globals['_GENESISSTATE'].fields_by_name['params']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['state']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['state']._serialized_options = b'\310\336\037\000'
  _globals['_STATE'].fields_by_name['base_fee']._loaded_options = None
  _globals['_STATE'].fields_by_name['base_fee']._serialized_options = b'\310\336\037\000\332\336\037\033cosmossdk.io/math.LegacyDec\322\264-\ncosmos.Dec'
  _globals['_STATE'].fields_by_name['learning_rate']._loaded_options = None
  _globals['_STATE'].fields_by_name['learning_rate']._serialized_options = b'\310\336\037\000\332\336\037\033cosmossdk.io/math.LegacyDec\322\264-\ncosmos.Dec'
  _globals['_GENESISSTATE']._serialized_start=151
  _globals['_GENESISSTATE']._serialized_end=286
  _globals['_STATE']._serialized_start=289
  _globals['_STATE']._serialized_end=508
# @@protoc_insertion_point(module_scope)
