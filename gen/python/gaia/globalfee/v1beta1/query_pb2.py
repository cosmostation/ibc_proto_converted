# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: gaia/globalfee/v1beta1/query.proto
# Protobuf Python Version: 4.25.3
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from gaia.globalfee.v1beta1 import genesis_pb2 as gaia_dot_globalfee_dot_v1beta1_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"gaia/globalfee/v1beta1/query.proto\x12\x16gaia.globalfee.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a$gaia/globalfee/v1beta1/genesis.proto\"\x14\n\x12QueryParamsRequest\"S\n\x13QueryParamsResponse\x12<\n\x06params\x18\x01 \x01(\x0b\x32\x1e.gaia.globalfee.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params2\x93\x01\n\x05Query\x12\x89\x01\n\x06Params\x12*.gaia.globalfee.v1beta1.QueryParamsRequest\x1a+.gaia.globalfee.v1beta1.QueryParamsResponse\"&\x82\xd3\xe4\x93\x02 \x12\x1e/gaia/globalfee/v1beta1/paramsB\xca\x01\n\x1a\x63om.gaia.globalfee.v1beta1B\nQueryProtoZ(github.com/cosmos/gaia/x/globalfee/types\xa2\x02\x03GGX\xaa\x02\x16Gaia.Globalfee.V1beta1\xca\x02\x16Gaia\\Globalfee\\V1beta1\xe2\x02\"Gaia\\Globalfee\\V1beta1\\GPBMetadata\xea\x02\x18Gaia::Globalfee::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'gaia.globalfee.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.gaia.globalfee.v1beta1B\nQueryProtoZ(github.com/cosmos/gaia/x/globalfee/types\242\002\003GGX\252\002\026Gaia.Globalfee.V1beta1\312\002\026Gaia\\Globalfee\\V1beta1\342\002\"Gaia\\Globalfee\\V1beta1\\GPBMetadata\352\002\030Gaia::Globalfee::V1beta1'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002 \022\036/gaia/globalfee/v1beta1/params'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=152
  _globals['_QUERYPARAMSREQUEST']._serialized_end=172
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=174
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=257
  _globals['_QUERY']._serialized_start=260
  _globals['_QUERY']._serialized_end=407
# @@protoc_insertion_point(module_scope)