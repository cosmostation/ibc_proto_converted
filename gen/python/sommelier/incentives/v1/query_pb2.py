# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sommelier/incentives/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from sommelier.incentives.v1 import genesis_pb2 as sommelier_dot_incentives_dot_v1_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#sommelier/incentives/v1/query.proto\x12\rincentives.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a%sommelier/incentives/v1/genesis.proto\"\x14\n\x12QueryParamsRequest\"J\n\x13QueryParamsResponse\x12\x33\n\x06params\x18\x01 \x01(\x0b\x32\x15.incentives.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\x11\n\x0fQueryAPYRequest\"$\n\x10QueryAPYResponse\x12\x10\n\x03\x61py\x18\x01 \x01(\tR\x03\x61py2\xf9\x01\n\x05Query\x12}\n\x0bQueryParams\x12!.incentives.v1.QueryParamsRequest\x1a\".incentives.v1.QueryParamsResponse\"\'\x82\xd3\xe4\x93\x02!\x12\x1f/sommelier/incentives/v1/params\x12q\n\x08QueryAPY\x12\x1e.incentives.v1.QueryAPYRequest\x1a\x1f.incentives.v1.QueryAPYResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/sommelier/incentives/v1/apyB\xa8\x01\n\x11\x63om.incentives.v1B\nQueryProtoP\x01Z2github.com/peggyjv/sommelier/v4/x/incentives/types\xa2\x02\x03IXX\xaa\x02\rIncentives.V1\xca\x02\rIncentives\\V1\xe2\x02\x19Incentives\\V1\\GPBMetadata\xea\x02\x0eIncentives::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sommelier.incentives.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\021com.incentives.v1B\nQueryProtoP\001Z2github.com/peggyjv/sommelier/v4/x/incentives/types\242\002\003IXX\252\002\rIncentives.V1\312\002\rIncentives\\V1\342\002\031Incentives\\V1\\GPBMetadata\352\002\016Incentives::V1'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['QueryParams']._options = None
  _QUERY.methods_by_name['QueryParams']._serialized_options = b'\202\323\344\223\002!\022\037/sommelier/incentives/v1/params'
  _QUERY.methods_by_name['QueryAPY']._options = None
  _QUERY.methods_by_name['QueryAPY']._serialized_options = b'\202\323\344\223\002\036\022\034/sommelier/incentives/v1/apy'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=145
  _globals['_QUERYPARAMSREQUEST']._serialized_end=165
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=167
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=241
  _globals['_QUERYAPYREQUEST']._serialized_start=243
  _globals['_QUERYAPYREQUEST']._serialized_end=260
  _globals['_QUERYAPYRESPONSE']._serialized_start=262
  _globals['_QUERYAPYRESPONSE']._serialized_end=298
  _globals['_QUERY']._serialized_start=301
  _globals['_QUERY']._serialized_end=550
# @@protoc_insertion_point(module_scope)