# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: canto/govshuttle/v1/query.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from canto.govshuttle.v1 import govshuttle_pb2 as canto_dot_govshuttle_dot_v1_dot_govshuttle__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x63\x61nto/govshuttle/v1/query.proto\x12\x13\x63\x61nto.govshuttle.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a$canto/govshuttle/v1/govshuttle.proto\"\x14\n\x12QueryParamsRequest\"P\n\x13QueryParamsResponse\x12\x39\n\x06params\x18\x01 \x01(\x0b\x32\x1b.canto.govshuttle.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params2\x86\x01\n\x05Query\x12}\n\x06Params\x12\'.canto.govshuttle.v1.QueryParamsRequest\x1a(.canto.govshuttle.v1.QueryParamsResponse\" \x82\xd3\xe4\x93\x02\x1a\x12\x18/canto/govshuttle/paramsB\xc7\x01\n\x17\x63om.canto.govshuttle.v1B\nQueryProtoZ4github.com/Canto-Network/Canto/v6/x/govshuttle/types\xa2\x02\x03\x43GX\xaa\x02\x13\x43\x61nto.Govshuttle.V1\xca\x02\x13\x43\x61nto\\Govshuttle\\V1\xe2\x02\x1f\x43\x61nto\\Govshuttle\\V1\\GPBMetadata\xea\x02\x15\x43\x61nto::Govshuttle::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'canto.govshuttle.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.canto.govshuttle.v1B\nQueryProtoZ4github.com/Canto-Network/Canto/v6/x/govshuttle/types\242\002\003CGX\252\002\023Canto.Govshuttle.V1\312\002\023Canto\\Govshuttle\\V1\342\002\037Canto\\Govshuttle\\V1\\GPBMetadata\352\002\025Canto::Govshuttle::V1'
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._options = None
  _globals['_QUERYPARAMSRESPONSE'].fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERY'].methods_by_name['Params']._options = None
  _globals['_QUERY'].methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\032\022\030/canto/govshuttle/params'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=190
  _globals['_QUERYPARAMSREQUEST']._serialized_end=210
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=212
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=292
  _globals['_QUERY']._serialized_start=295
  _globals['_QUERY']._serialized_end=429
# @@protoc_insertion_point(module_scope)
