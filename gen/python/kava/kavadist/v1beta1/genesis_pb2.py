# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/kavadist/v1beta1/genesis.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from kava.kavadist.v1beta1 import params_pb2 as kava_dot_kavadist_dot_v1beta1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#kava/kavadist/v1beta1/genesis.proto\x12\x15kava.kavadist.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\"kava/kavadist/v1beta1/params.proto\"\xa1\x01\n\x0cGenesisState\x12;\n\x06params\x18\x01 \x01(\x0b\x32\x1d.kava.kavadist.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12T\n\x13previous_block_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x11previousBlockTimeB\xc9\x01\n\x19\x63om.kava.kavadist.v1beta1B\x0cGenesisProtoZ*github.com/kava-labs/kava/x/kavadist/types\xa2\x02\x03KKX\xaa\x02\x15Kava.Kavadist.V1beta1\xca\x02\x15Kava\\Kavadist\\V1beta1\xe2\x02!Kava\\Kavadist\\V1beta1\\GPBMetadata\xea\x02\x17Kava::Kavadist::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.kavadist.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\031com.kava.kavadist.v1beta1B\014GenesisProtoZ*github.com/kava-labs/kava/x/kavadist/types\242\002\003KKX\252\002\025Kava.Kavadist.V1beta1\312\002\025Kava\\Kavadist\\V1beta1\342\002!Kava\\Kavadist\\V1beta1\\GPBMetadata\352\002\027Kava::Kavadist::V1beta1'
  _globals['_GENESISSTATE'].fields_by_name['params']._options = None
  _globals['_GENESISSTATE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE'].fields_by_name['previous_block_time']._options = None
  _globals['_GENESISSTATE'].fields_by_name['previous_block_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_GENESISSTATE']._serialized_start=154
  _globals['_GENESISSTATE']._serialized_end=315
# @@protoc_insertion_point(module_scope)
