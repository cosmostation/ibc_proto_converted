# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/inflation/v1beta3/params.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$akash/inflation/v1beta3/params.proto\x12\x17\x61kash.inflation.v1beta3\x1a\x14gogoproto/gogo.proto\"\xdd\x03\n\x06Params\x12\xb8\x01\n\x16inflation_decay_factor\x18\x01 \x01(\tB\x81\x01\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xe2\xde\x1f\x14InflationDecayFactor\xea\xde\x1f\x16inflation_decay_factor\xf2\xde\x1f\x1dyaml:\"inflation_decay_factor\"R\x14inflationDecayFactor\x12\xa0\x01\n\x11initial_inflation\x18\x02 \x01(\tBs\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xe2\xde\x1f\x10InitialInflation\xea\xde\x1f\x11initial_inflation\xf2\xde\x1f\x18yaml:\"initial_inflation\"R\x10initialInflation\x12u\n\x08variance\x18\x03 \x01(\tBY\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xe2\xde\x1f\x08Variance\xea\xde\x1f\x08variance\xf2\xde\x1f\x0fyaml:\"variance\"R\x08varianceB\xe4\x01\n\x1b\x63om.akash.inflation.v1beta3B\x0bParamsProtoZ<github.com/akash-network/akash-api/go/node/inflation/v1beta3\xa2\x02\x03\x41IX\xaa\x02\x17\x41kash.Inflation.V1beta3\xca\x02\x17\x41kash\\Inflation\\V1beta3\xe2\x02#Akash\\Inflation\\V1beta3\\GPBMetadata\xea\x02\x19\x41kash::Inflation::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.inflation.v1beta3.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\033com.akash.inflation.v1beta3B\013ParamsProtoZ<github.com/akash-network/akash-api/go/node/inflation/v1beta3\242\002\003AIX\252\002\027Akash.Inflation.V1beta3\312\002\027Akash\\Inflation\\V1beta3\342\002#Akash\\Inflation\\V1beta3\\GPBMetadata\352\002\031Akash::Inflation::V1beta3'
  _globals['_PARAMS'].fields_by_name['inflation_decay_factor']._options = None
  _globals['_PARAMS'].fields_by_name['inflation_decay_factor']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\342\336\037\024InflationDecayFactor\352\336\037\026inflation_decay_factor\362\336\037\035yaml:\"inflation_decay_factor\"'
  _globals['_PARAMS'].fields_by_name['initial_inflation']._options = None
  _globals['_PARAMS'].fields_by_name['initial_inflation']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\342\336\037\020InitialInflation\352\336\037\021initial_inflation\362\336\037\030yaml:\"initial_inflation\"'
  _globals['_PARAMS'].fields_by_name['variance']._options = None
  _globals['_PARAMS'].fields_by_name['variance']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\342\336\037\010Variance\352\336\037\010variance\362\336\037\017yaml:\"variance\"'
  _globals['_PARAMS']._serialized_start=88
  _globals['_PARAMS']._serialized_end=565
# @@protoc_insertion_point(module_scope)
